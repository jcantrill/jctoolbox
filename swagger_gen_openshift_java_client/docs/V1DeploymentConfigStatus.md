
# V1DeploymentConfigStatus

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**availableReplicas** | **Integer** | AvailableReplicas is the total number of available pods targeted by this deployment config. |  [optional]
**details** | [**V1DeploymentDetails**](V1DeploymentDetails.md) |  |  [optional]
**latestVersion** | **Long** | LatestVersion is used to determine whether the current deployment associated with a deployment config is out of sync. |  [optional]
**observedGeneration** | **Long** | ObservedGeneration is the most recent generation observed by the deployment config controller. |  [optional]
**replicas** | **Integer** | Replicas is the total number of pods targeted by this deployment config. |  [optional]
**unavailableReplicas** | **Integer** | UnavailableReplicas is the total number of unavailable pods targeted by this deployment config. |  [optional]
**updatedReplicas** | **Integer** | UpdatedReplicas is the total number of non-terminated pods targeted by this deployment config that have the desired template spec. |  [optional]



