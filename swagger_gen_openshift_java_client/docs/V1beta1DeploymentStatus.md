
# V1beta1DeploymentStatus

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**availableReplicas** | **Integer** | Total number of available pods (ready for at least minReadySeconds) targeted by this deployment. |  [optional]
**observedGeneration** | **Long** | The generation observed by the deployment controller. |  [optional]
**replicas** | **Integer** | Total number of non-terminated pods targeted by this deployment (their labels match the selector). |  [optional]
**unavailableReplicas** | **Integer** | Total number of unavailable pods targeted by this deployment. |  [optional]
**updatedReplicas** | **Integer** | Total number of non-terminated pods targeted by this deployment that have the desired template spec. |  [optional]



