
# V1DockerBuildStrategy

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dockerfilePath** | **String** | dockerfilePath is the path of the Dockerfile that will be used to build the Docker image, relative to the root of the context (contextDir). |  [optional]
**env** | [**List&lt;V1EnvVar&gt;**](V1EnvVar.md) | env contains additional environment variables you want to pass into a builder container |  [optional]
**forcePull** | **Boolean** | forcePull describes if the builder should pull the images from registry prior to building. |  [optional]
**from** | [**V1ObjectReference**](V1ObjectReference.md) |  |  [optional]
**noCache** | **Boolean** | noCache if set to true indicates that the docker build must be executed with the --no-cache&#x3D;true flag |  [optional]
**pullSecret** | [**V1LocalObjectReference**](V1LocalObjectReference.md) |  |  [optional]



