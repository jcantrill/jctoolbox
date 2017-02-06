#!/bin/bash -x

oadm new-project logging --node-selector=""

oc project logging

oc apply -n openshift -f https://raw.githubusercontent.com/openshift/origin-aggregated-logging/v1.3.2/deployer/deployer.yaml

oc new-app logging-deployer-account-template

oadm policy add-cluster-role-to-user oauth-editor \
          system:serviceaccount:logging:logging-deployer

oadm policy add-scc-to-user privileged \
       system:serviceaccount:logging:aggregated-logging-fluentd

oadm policy add-cluster-role-to-user cluster-reader \
       system:serviceaccount:logging:aggregated-logging-fluentd

oc create configmap logging-deployer \
   --from-literal kibana-hostname=kibana.example.com

oc new-app logging-deployer-template \
           -p IMAGE_VERSION=v1.3.2 \

oc label node --all logging-infra-fluentd=true

