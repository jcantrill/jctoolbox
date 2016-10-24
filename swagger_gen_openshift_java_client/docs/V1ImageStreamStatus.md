
# V1ImageStreamStatus

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dockerImageRepository** | **String** | DockerImageRepository represents the effective location this stream may be accessed at. May be empty until the server determines where the repository is located | 
**tags** | [**List&lt;V1NamedTagEventList&gt;**](V1NamedTagEventList.md) | Tags are a historical record of images associated with each tag. The first entry in the TagEvent array is the currently tagged image. |  [optional]



