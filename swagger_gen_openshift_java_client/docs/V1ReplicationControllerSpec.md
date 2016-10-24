
# V1ReplicationControllerSpec

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**replicas** | **Integer** | Replicas is the number of desired replicas. This is a pointer to distinguish between explicit zero and unspecified. Defaults to 1. More info: http://releases.k8s.io/release-1.4/docs/user-guide/replication-controller.md#what-is-a-replication-controller |  [optional]
**selector** | **Object** | Selector is a label query over pods that should match the Replicas count. If Selector is empty, it is defaulted to the labels present on the Pod template. Label keys and values that must match in order to be controlled by this replication controller, if empty defaulted to labels on Pod template. More info: http://releases.k8s.io/release-1.4/docs/user-guide/labels.md#label-selectors |  [optional]
**template** | [**V1PodTemplateSpec**](V1PodTemplateSpec.md) |  |  [optional]



