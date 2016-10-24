
# V1DeploymentStrategy

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**annotations** | **Object** | Annotations is a set of key, value pairs added to custom deployer and lifecycle pre/post hook pods. |  [optional]
**customParams** | [**V1CustomDeploymentStrategyParams**](V1CustomDeploymentStrategyParams.md) |  |  [optional]
**labels** | **Object** | Labels is a set of key, value pairs added to custom deployer and lifecycle pre/post hook pods. |  [optional]
**recreateParams** | [**V1RecreateDeploymentStrategyParams**](V1RecreateDeploymentStrategyParams.md) |  |  [optional]
**resources** | [**V1ResourceRequirements**](V1ResourceRequirements.md) |  |  [optional]
**rollingParams** | [**V1RollingDeploymentStrategyParams**](V1RollingDeploymentStrategyParams.md) |  |  [optional]
**type** | **String** | Type is the name of a deployment strategy. |  [optional]



