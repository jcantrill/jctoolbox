#!/bin/bash

set -eu
set -o pipefail

if [[ -n ${DEBUG:-""} ]] ; then
  set -x
fi


function info() {
    echo "[INFO ] ${1}"
}

WORKDIR=${WORKDIR:-$(mktemp -d)}
KERBEROSID=${KERBEROSID:-jcantril}
ORIGIN_REPO="ssh://$KERBEROSID@code.engineering.redhat.com/openshift-elasticsearch-plugin"
DISTGIT_REPO="ssh://${KERBEROSID}@pkgs.devel.redhat.com/rpms/openshift-elasticsearch-plugin"
DISTGIT_PRIVATE_BRANCH="private-tdawson-mead-wrapper"
NEW_VERSION=$1

PREFIX=$(python -c "import re; m = re.search('^(\d*\.\d*.\d*)\.(\d*)$','${NEW_VERSION}');print m.group(1)")
SUFFIX=$(python -c "import re; m = re.search('^(\d*\.\d*.\d*)\.(\d*)$','${NEW_VERSION}');print m.group(2)")
OLD_VERSION="${PREFIX}.$((SUFFIX - 1))"
COMMENT="* $(date +"%a %b %d %Y") $(grep -P "^$(whoami):" /etc/passwd | cut -f5 -d:) <${KERBEROSID}@redhat.com> - ${NEW_VERSION}.redhat_1-1\n\- openshift-elasticsearch-plugin version ${NEW_VERSION}\n"
BUILD_TAG="${NEW_VERSION}-build"

info "Using workingdir ${WORKDIR}"
pushd "${WORKDIR}"

  #prep source
  if [ ! -d openshift-elasticsearch-plugin ] ; then
    git clone ${ORIGIN_REPO}
  fi
  pushd openshift-elasticsearch-plugin
    if [ "0" -eq "$(git branch -a | grep upstream | wc -l)" ] ; then
      git remote add upstream https://github.com/fabric8io/openshift-elasticsearch-plugin
    fi
    git fetch upstream
    git checkout "openshift-elasticsearch-plugin-${NEW_VERSION}"
    git checkout -b "${NEW_VERSION}"
    #git push origin
    git checkout "${OLD_VERSION}-build"
    git checkout -b "${BUILD_TAG}"
  popd

  #prep dist-git
#  if [ ! -d dist-git ] ; then
#    mkdir dist-git
#    pushd dist-git
#      git clone "${DISTGIT_REPO}"
#      popd
#  fi
#  pushd dist-git/openshift-elasticsearch-plugin
#    git checkout "${DISTGIT_PRIVATE_BRANCH}"
#    sed -i "/%changelog/a ${COMMENT}" openshift-elasticsearch-plugin.spec.tmpl
#    git add openshift-elasticsearch-plugin.spec.tmpl
#    git commit -m "openshift-elasticsearch-plugin version ${NEW_VERSION}"
#    HASH=$(git rev-parse HEAD)
#  popd

  pushd openshift-elasticsearch-plugin
#    sed -i "s/^scmurl = git:\/\/pkg.*$/scmurl = git:\/\/pkgs\.devel\.redhat\.com\/rpms\/openshift-elasticsearch-plugin\.git#${HASH}'/" chain/chain.ini
    sed -i "s/^VERSION.*$/VERSION=${NEW_VERSION}/" Makefile
    sed -i "s/^vers=.*$/vers=${NEW_VERSION}/" make-vars
    git add .
    git commit -m "openshift-elasticsearch-plugin version ${NEW_VERSION}"
    #git push
    echo
    echo ">>>>>>>>>>>>>>>>>>>>>>>>>>>>>"
    echo ">> changes from upstream clone"
    echo ">>>>>>>>>>>>>>>>>>>>>>>>>>>>>"
    git show
#  popd
#  pushd dist-git/openshift-elasticsearch-plugin
#    echo
#    echo ">>>>>>>>>>>>>>>>>>>>>>>>>>>>>"
#    echo ">> changes from dist git"
#    echo ">>>>>>>>>>>>>>>>>>>>>>>>>>>>>"
#    git show
#    echo 
    echo "Accept changes and push repos?"
    select yn in "Yes" "No"; do
      case $yn in
          No ) exit;;
          Yes )break;;
      esac
    done
#    git push origin
#  popd
#  pushd openshift-elasticsearch-plugin
    git push --set-upstream origin ${BUILD_TAG}
    git checkout "${NEW_VERSION}"
    git push --set-upstream origin "${NEW_VERSION}"
    git checkout ${BUILD_TAG}
    echo "Intiate new build from $(pwd) with: 'make respin'"
  popd

popd
