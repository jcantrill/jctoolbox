
# V1SourceBuildStrategy

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**env** | [**List&lt;V1EnvVar&gt;**](V1EnvVar.md) | env contains additional environment variables you want to pass into a builder container |  [optional]
**forcePull** | **Boolean** | forcePull describes if the builder should pull the images from registry prior to building. |  [optional]
**from** | [**V1ObjectReference**](V1ObjectReference.md) |  | 
**incremental** | **Boolean** | incremental flag forces the Source build to do incremental builds if true. |  [optional]
**pullSecret** | [**V1LocalObjectReference**](V1LocalObjectReference.md) |  |  [optional]
**runtimeArtifacts** | [**List&lt;V1ImageSourcePath&gt;**](V1ImageSourcePath.md) | runtimeArtifacts specifies a list of source/destination pairs that will be copied from the builder to the runtime image. sourcePath can be a file or directory. destinationDir must be a directory. destinationDir can also be empty or equal to \&quot;.\&quot;, in this case it just refers to the root of WORKDIR. This field and the feature it enables are in tech preview. |  [optional]
**runtimeImage** | [**V1ObjectReference**](V1ObjectReference.md) |  |  [optional]
**scripts** | **String** | scripts is the location of Source scripts |  [optional]



