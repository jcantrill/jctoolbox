
# V1beta1DeploymentSpec

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**minReadySeconds** | **Integer** | Minimum number of seconds for which a newly created pod should be ready without any of its container crashing, for it to be considered available. Defaults to 0 (pod will be considered available as soon as it is ready) |  [optional]
**paused** | **Boolean** | Indicates that the deployment is paused and will not be processed by the deployment controller. |  [optional]
**replicas** | **Integer** | Number of desired pods. This is a pointer to distinguish between explicit zero and not specified. Defaults to 1. |  [optional]
**revisionHistoryLimit** | **Integer** | The number of old ReplicaSets to retain to allow rollback. This is a pointer to distinguish between explicit zero and not specified. |  [optional]
**rollbackTo** | [**V1beta1RollbackConfig**](V1beta1RollbackConfig.md) |  |  [optional]
**selector** | [**V1beta1LabelSelector**](V1beta1LabelSelector.md) |  |  [optional]
**strategy** | [**V1beta1DeploymentStrategy**](V1beta1DeploymentStrategy.md) |  |  [optional]
**template** | [**V1PodTemplateSpec**](V1PodTemplateSpec.md) |  | 



