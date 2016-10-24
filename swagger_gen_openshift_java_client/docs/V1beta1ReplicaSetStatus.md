
# V1beta1ReplicaSetStatus

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fullyLabeledReplicas** | **Integer** | The number of pods that have labels matching the labels of the pod template of the replicaset. |  [optional]
**observedGeneration** | **Long** | ObservedGeneration reflects the generation of the most recently observed ReplicaSet. |  [optional]
**readyReplicas** | **Integer** | The number of ready replicas for this replica set. |  [optional]
**replicas** | **Integer** | Replicas is the most recently oberved number of replicas. More info: http://releases.k8s.io/release-1.4/docs/user-guide/replication-controller.md#what-is-a-replication-controller | 



