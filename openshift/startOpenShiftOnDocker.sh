#!/bin/bash

set -o errexit
set -o nounset
set -o pipefail

#get the utilities file
ORIGIN_DIR=${ORIGIN_DIR:-`pwd`}
source "${ORIGIN_DIR}/hack/util.sh"

#not sure this works when there are other containers
DEFAULT_SERVER_IP=`ifconfig | grep -Ev "(127.0.0.1|172.17.42.1)" | grep "inet " | head -n 1 | sed 's/adr://' | awk '{print $2}'`

CONTAINER_NAME=openshift-origin
DOCKER_EXEC="docker exec $CONTAINER_NAME"

CONFIG_DIR=/var/lib/openshift/openshift.local.config
ADMIN_CREDENTIALS=$CONFIG_DIR/master/admin.kubeconfig
ADMIN_USER=test-admin
ADMIN_ROLE=cluster-admin

#LIMITED_USER=
#LIMTED_ROLE=
LIMITED_PROJECT=test

HOST_DATA_VOLUME=/tmp/openshift

RUNNING_ID=$(CONTAINER_ID=`docker ps -a | grep $CONTAINER_NAME`;echo ${CONTAINER_ID%%openshift*})
if [[ ! -z $RUNNING_ID ]]; then
  echo "Found an instance already running.  Removing it."
  docker rm -f $RUNNING_ID
fi

if [[ ! -e $HOST_DATA_VOLUME ]]; then
  mkdir $HOST_DATA_VOLUME
fi

echo "Starting OpenShift Server..."
CONTAINER_ID=$(docker run -d --name "$CONTAINER_NAME" --net=host --privileged -v /var/run/docker.sock:/var/run/docker.sock -v $HOST_DATA_VOLUME:/tmp/openshift -v $ORIGIN_DIR:/tmp/data openshift/origin start)

echo "Waiting for the server to become available..."
wait_for_command "docker logs $CONTAINER_ID 2>&1 | grep \"Starting kubelet main sync loop\"" $((30*TIME_SEC))

echo "Adding cluster admin..."
$DOCKER_EXEC osadm policy add-cluster-role-to-user $ADMIN_ROLE $ADMIN_USER --config=$ADMIN_CREDENTIALS

#docker exec osadm policy add-cluster-role-to-user $LIMITED_ROLE $LIMITED_USER --config=ADMIN_CREDENTIALS

#deploy registry
echo "Deploying the OpenShift Docker registry..."
$DOCKER_EXEC openshift ex registry --create  --credentials=$CONFIG_DIR/master/openshift-registry.kubeconfig --config=$ADMIN_CREDENTIALS

#initialize server content
echo "Adding image streams..."
$DOCKER_EXEC osc create -f /tmp/data/examples/image-streams/image-streams-centos7.json -n openshift --config=$ADMIN_CREDENTIALS
echo "Adding templates..."
$DOCKER_EXEC osc create -f /tmp/data/examples/sample-app/application-template-stibuild.json -n openshift --config=$ADMIN_CREDENTIALS

#create projects
echo "Creating a test project"
$DOCKER_EXEC osc new-project $LIMITED_PROJECT --display-name="OpenShift 3 Sample" --description="This is an example project to demonstrate OpenShift v3" --config=$ADMIN_CREDENTIALS
