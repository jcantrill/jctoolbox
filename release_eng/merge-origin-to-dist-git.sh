#!/bin/bash

if [[ -n ${DEBUG:-""} ]] ; then
  set -x
fi

script=$(basename "$0")

KERBEROSID=${KERBEROSEID:-$USER}
WORKDIR=${WORKDIR:-$(mktemp -d)}
SOURCE_REPO=${SOURCE_REPO:-git@github.com:openshift/origin-aggregated-logging}

set -eu
set -o pipefail

function help() {
  if [ $? -eq 0 ] ; then
      return
  fi
  cat << EOF

This is a utility script to migrate component code from a subfolder of a large
origin source repo to individual downstream repos while preserving commit
history

Usage: ${script} <component> <source_branch> <target_version> 

  component      - The subfolder to migrate
  source_branch  - The branch name to use for the source
  target_version - The version number of the target dist-git repo. This script 
                   assumes the target branch is of the format: rhaos-<target_verson>-rhel-7

Environment Variable of interest to change default behavior:

  DEBUG           - Set -x for the script to place into debug
  KERBEROSID      - The username to use to clone dist-git repos (default: $USER)
  SOURCE_REPO     - The source repo to split (default: $SOURCE_REPO)
  WORKDIR         - The working directory.  The default is to create a temporary one

EOF
  exit 1
}

trap help EXIT

function info() {
    echo "[INFO ] ${1}"
}

component=$1
branch=$2
target_version=$3

target_branch=rhaos-${target_version}-rhel-7

declare -A distgitrepos=( \
              ["elasticsearch"]="logging-elasticsearch-docker" \
              ["fluentd"]="logging-fluentd-docker" \
              ["curator"]="logging-curator-docker" \
              ["kibana"]="logging-kibana-docker" \
              ["kibana-proxy"]="logging-auth-proxy-docker" \
)

target_name="${distgitrepos[$component]:=''}"
if [ -z "${target_name}" ] ; then
    echo "Unable to determine the dist-git repo associated with ${component}"
    exit 1
fi

TARGET_REPO=${TARGET_REPO:-ssh://$KERBEROSID@pkgs.devel.redhat.com/rpms/$target_name}

component_branch="${component}-${target_version}"
component_repo="origin-${component}"
merge_source="upstream/${component_branch}"

info "Using workingdir ${WORKDIR}"
pushd "${WORKDIR}"

  #clone and split source repo
  source_repo=$(basename "$SOURCE_REPO")
  if [ ! -d "./${source_repo}" ] ; then
    git clone "${SOURCE_REPO}" "${source_repo}"
  fi
  pushd "${source_repo}"
    git fetch origin
    git checkout "${branch}"
    git submodule update --init --recursive
    git subtree split -P "${component}" -b "${component_branch}"
  popd

  #make an origin repo of the component
  if [ -d "./${component_repo}" ] ; then
    rm -rf "./${component_repo}"
  fi
  mkdir "${component_repo}"
  pushd "${component_repo}"
    git init
    git pull "../${source_repo}" "${component_branch}"
  popd

  #clone the target repo
  if [ ! -d "./${target_name}" ] ; then
    git clone "${TARGET_REPO}" "${target_name}"
    pushd "${target_name}"
      git remote add upstream "../${source_repo}"
    popd
  fi
  pushd "${target_name}"
    git fetch upstream

    #merge origin to downstream
    git checkout "${target_branch}"
    git merge --no-ff "${merge_source}"
  popd
popd
