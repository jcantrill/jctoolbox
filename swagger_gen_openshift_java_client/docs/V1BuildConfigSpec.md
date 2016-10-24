
# V1BuildConfigSpec

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**completionDeadlineSeconds** | **Long** | completionDeadlineSeconds is an optional duration in seconds, counted from the time when a build pod gets scheduled in the system, that the build may be active on a node before the system actively tries to terminate the build; value must be positive integer |  [optional]
**output** | [**V1BuildOutput**](V1BuildOutput.md) |  |  [optional]
**postCommit** | [**V1BuildPostCommitSpec**](V1BuildPostCommitSpec.md) |  |  [optional]
**resources** | [**V1ResourceRequirements**](V1ResourceRequirements.md) |  |  [optional]
**revision** | [**V1SourceRevision**](V1SourceRevision.md) |  |  [optional]
**runPolicy** | **String** | RunPolicy describes how the new build created from this build configuration will be scheduled for execution. This is optional, if not specified we default to \&quot;Serial\&quot;. |  [optional]
**serviceAccount** | **String** | serviceAccount is the name of the ServiceAccount to use to run the pod created by this build. The pod will be allowed to use secrets referenced by the ServiceAccount |  [optional]
**source** | [**V1BuildSource**](V1BuildSource.md) |  |  [optional]
**strategy** | [**V1BuildStrategy**](V1BuildStrategy.md) |  | 
**triggers** | [**List&lt;V1BuildTriggerPolicy&gt;**](V1BuildTriggerPolicy.md) | triggers determine how new Builds can be launched from a BuildConfig. If no triggers are defined, a new build can only occur as a result of an explicit client build creation. | 



