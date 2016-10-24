
# V1beta1ReplicaSetSpec

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**replicas** | **Integer** | Replicas is the number of desired replicas. This is a pointer to distinguish between explicit zero and unspecified. Defaults to 1. More info: http://releases.k8s.io/release-1.4/docs/user-guide/replication-controller.md#what-is-a-replication-controller |  [optional]
**selector** | [**V1beta1LabelSelector**](V1beta1LabelSelector.md) |  |  [optional]
**template** | [**V1PodTemplateSpec**](V1PodTemplateSpec.md) |  |  [optional]



