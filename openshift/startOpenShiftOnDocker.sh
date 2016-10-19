#!/bin/bash

#
# Needed before hand?: sudo chcon -R -t svirt_sandbox_file_t /tmp/volumes
#
set -o errexit
set -o nounset
set -o pipefail

#get the utilities file
ORIGIN_DIR=${ORIGIN_DIR:-`pwd`}
IMAGE_TAG=${IMAGE_TAG:-latest}
SKIP_RESTART=${SKIP_RESTART:-"false"}

#other templates
GIT_PROJECTS_DIR=${GIT_PROJECTS_DIR:-~/git}
JBOSS_TEMPLATE_DIR=$GIT_PROJECTS_DIR/application-templates

source "${ORIGIN_DIR}/hack/util.sh"

#not sure this works when there are other containers
DEFAULT_SERVER_IP=`ifconfig | grep -Ev "(127.0.0.1|172.17.42.1)" | grep "inet " | head -n 1 | sed 's/adr://' | awk '{print $2}'`

CONTAINER_NAME=openshift
DOCKER_EXEC="docker exec $CONTAINER_NAME"

CONFIG_DIR=/var/lib/openshift/openshift.local.config
ADMIN_CREDENTIALS=$CONFIG_DIR/master/admin.kubeconfig
ADMIN_USER=test-admin
ADMIN_ROLE=cluster-admin

#LIMITED_USER=
#LIMTED_ROLE=
LIMITED_PROJECT=test

HOST_DATA_VOLUME=/tmp/openshift

## utility functions
function osc_create() {
  $DOCKER_EXEC osc create -f $1 -n openshift --config=$ADMIN_CREDENTIALS
}

function osc_create_files_in(){
  shopt -s nullglob
  for f in $1/*.json; 
  do
    filename=`basename $f`
    dirname=`dirname $f`
    file="$2/`basename $dirname`/$filename"
    echo "Creating $file"
    osc_create $file
  done
}

#if [[ "$SKIP_RESTART" -ne "false" ]]; then
  if [[ ! -z $(docker ps -a | grep $CONTAINER_NAME) ]]; then
    echo "Found an existing container.  Removing it."
    docker rm -f $CONTAINER_NAME
  fi

  if [[ ! -e $HOST_DATA_VOLUME ]]; then
    mkdir $HOST_DATA_VOLUME
  fi

  MOUNT_VOLUMES="-v /:/rootfs:ro -v /var/run:/var/run:rw -v /sys:/sys:ro -v /var/lib/docker:/var/lib/docker:rw -v /var/lib/openshift/openshift.local.volumes:/var/lib/openshift/openshift.local.volumes"
  #MOUNT_VOLUMES="$MOUNT_VOLUMES -v $HOST_DATA_VOLUME:/tmp/openshift -v $ORIGIN_DIR:/tmp/origin -v /tmp/volumes:/tmp/volumes"
  MOUNT_VOLUMES="$MOUNT_VOLUMES -v /var/run/docker.sock:/var/run/docker.sock -v $HOST_DATA_VOLUME:/tmp/openshift"
  MOUNT_VOLUMES="$MOUNT_VOLUMES -v $ORIGIN_DIR:/tmp/origin"
  if [ -d $JBOSS_TEMPLATE_DIR ]; then
    MOUNT_VOLUMES="$MOUNT_VOLUMES -v $JBOSS_TEMPLATE_DIR:/tmp/jboss"
  fi


  echo "Starting OpenShift Server..."
  RUN_OPTS="--name $CONTAINER_NAME --net=host --privileged"
  OS_OPTS="--volume-dir=/tmp/openshift"
  #CONTAINER_ID=$(docker run -d $RUN_OPTS $MOUNT_VOLUMES openshift/origin:$IMAGE_TAG start --volume-dir=/tmp --master='https://localhost:8443')
  CONTAINER_ID=$(docker run -d $RUN_OPTS $MOUNT_VOLUMES openshift/origin:$IMAGE_TAG start $OS_OPTS)

  echo "Waiting for the server to become available..."
  wait_for_command "docker logs $CONTAINER_ID 2>&1 | grep \"Starting kubelet main sync loop\"" $((45*TIME_SEC))
#fi

echo "Adding cluster admin..."
$DOCKER_EXEC osadm policy add-cluster-role-to-user $ADMIN_ROLE $ADMIN_USER --config=$ADMIN_CREDENTIALS

#docker exec osadm policy add-cluster-role-to-user $LIMITED_ROLE $LIMITED_USER --config=ADMIN_CREDENTIALS

#deploy registry
echo "Deploying the OpenShift Docker registry..."
$DOCKER_EXEC osadm registry --credentials=$CONFIG_DIR/master/openshift-registry.kubeconfig --config=$ADMIN_CREDENTIALS --mount-host=$HOST_DATA_VOLUME

#initialize server content
echo "Adding image streams..."
osc_create /tmp/origin/examples/image-streams/image-streams-centos7.json
echo "Adding templates..."
osc_create /tmp/origin/examples/sample-app/application-template-stibuild.json

if [ -d $JBOSS_TEMPLATE_DIR ]; then
  set +e
  #jboss image streams
  if [ -f "$JBOSS_TEMPLATE_DIR/jboss-image-streams.json" ]; then
    echo "Adding JBoss imagestreams..."
    osc_create "/tmp/jboss/jboss-image-streams.json"
  fi

  if [ -d "$JBOSS_TEMPLATE_DIR/amq" ]; then
    osc_create_files_in "$JBOSS_TEMPLATE_DIR/amq" "/tmp/jboss"
  fi

  if [ -d "$JBOSS_TEMPLATE_DIR/eap" ]; then
    osc_create_files_in "$JBOSS_TEMPLATE_DIR/eap" "/tmp/jboss"
  fi

  if [ -d "$JBOSS_TEMPLATE_DIR/webserver" ]; then
    osc_create_files_in "$JBOSS_TEMPLATE_DIR/webserver" "/tmp/jboss"
  fi
  set -e
fi

#create projects
echo "Creating a test project"
$DOCKER_EXEC osc new-project $LIMITED_PROJECT --display-name="OpenShift 3 Sample" --description="This is an example project to demonstrate OpenShift v3" --config=$ADMIN_CREDENTIALS
