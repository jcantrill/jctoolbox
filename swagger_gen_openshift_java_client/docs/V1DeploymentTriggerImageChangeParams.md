
# V1DeploymentTriggerImageChangeParams

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**automatic** | **Boolean** | Automatic means that the detection of a new tag value should result in an image update inside the pod template. Deployment configs that haven&#39;t been deployed yet will always have their images updated. Deployment configs that have been deployed at least once, will have their images updated only if this is set to true. |  [optional]
**containerNames** | **List&lt;String&gt;** | ContainerNames is used to restrict tag updates to the specified set of container names in a pod. |  [optional]
**from** | [**V1ObjectReference**](V1ObjectReference.md) |  | 
**lastTriggeredImage** | **String** | LastTriggeredImage is the last image to be triggered. |  [optional]



