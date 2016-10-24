
# V1BuildSpec

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**completionDeadlineSeconds** | **Long** | completionDeadlineSeconds is an optional duration in seconds, counted from the time when a build pod gets scheduled in the system, that the build may be active on a node before the system actively tries to terminate the build; value must be positive integer |  [optional]
**output** | [**V1BuildOutput**](V1BuildOutput.md) |  |  [optional]
**postCommit** | [**V1BuildPostCommitSpec**](V1BuildPostCommitSpec.md) |  |  [optional]
**resources** | [**V1ResourceRequirements**](V1ResourceRequirements.md) |  |  [optional]
**revision** | [**V1SourceRevision**](V1SourceRevision.md) |  |  [optional]
**serviceAccount** | **String** | serviceAccount is the name of the ServiceAccount to use to run the pod created by this build. The pod will be allowed to use secrets referenced by the ServiceAccount |  [optional]
**source** | [**V1BuildSource**](V1BuildSource.md) |  |  [optional]
**strategy** | [**V1BuildStrategy**](V1BuildStrategy.md) |  | 
**triggeredBy** | [**List&lt;V1BuildTriggerCause&gt;**](V1BuildTriggerCause.md) | triggeredBy describes which triggers started the most recent update to the build configuration and contains information about those triggers. | 



