
# V1CustomBuildStrategy

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**buildAPIVersion** | **String** | buildAPIVersion is the requested API version for the Build object serialized and passed to the custom builder |  [optional]
**env** | [**List&lt;V1EnvVar&gt;**](V1EnvVar.md) | env contains additional environment variables you want to pass into a builder container |  [optional]
**exposeDockerSocket** | **Boolean** | exposeDockerSocket will allow running Docker commands (and build Docker images) from inside the Docker container. |  [optional]
**forcePull** | **Boolean** | forcePull describes if the controller should configure the build pod to always pull the images for the builder or only pull if it is not present locally |  [optional]
**from** | [**V1ObjectReference**](V1ObjectReference.md) |  | 
**pullSecret** | [**V1LocalObjectReference**](V1LocalObjectReference.md) |  |  [optional]
**secrets** | [**List&lt;V1SecretSpec&gt;**](V1SecretSpec.md) | secrets is a list of additional secrets that will be included in the build pod |  [optional]



