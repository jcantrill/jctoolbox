
# V1BuildRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**apiVersion** | **String** | APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: http://releases.k8s.io/release-1.4/docs/devel/api-conventions.md#resources |  [optional]
**binary** | [**V1BinaryBuildSource**](V1BinaryBuildSource.md) |  |  [optional]
**env** | [**List&lt;V1EnvVar&gt;**](V1EnvVar.md) | env contains additional environment variables you want to pass into a builder container |  [optional]
**from** | [**V1ObjectReference**](V1ObjectReference.md) |  |  [optional]
**kind** | **String** | Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: http://releases.k8s.io/release-1.4/docs/devel/api-conventions.md#types-kinds |  [optional]
**lastVersion** | **Long** | lastVersion (optional) is the LastVersion of the BuildConfig that was used to generate the build. If the BuildConfig in the generator doesn&#39;t match, a build will not be generated. |  [optional]
**metadata** | [**V1ObjectMeta**](V1ObjectMeta.md) |  |  [optional]
**revision** | [**V1SourceRevision**](V1SourceRevision.md) |  |  [optional]
**triggeredBy** | [**List&lt;V1BuildTriggerCause&gt;**](V1BuildTriggerCause.md) | triggeredBy describes which triggers started the most recent update to the build configuration and contains information about those triggers. | 
**triggeredByImage** | [**V1ObjectReference**](V1ObjectReference.md) |  |  [optional]



