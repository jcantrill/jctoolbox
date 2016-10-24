
# V1TagReference

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**annotations** | **Object** | Annotations associated with images using this tag | 
**from** | [**V1ObjectReference**](V1ObjectReference.md) |  |  [optional]
**generation** | **Long** | Generation is the image stream generation that updated this tag - setting it to 0 is an indication that the generation must be updated. Legacy clients will send this as nil, which means the client doesn&#39;t know or care. | 
**importPolicy** | [**V1TagImportPolicy**](V1TagImportPolicy.md) |  |  [optional]
**name** | **String** | Name of the tag | 
**reference** | **Boolean** | Reference states if the tag will be imported. Default value is false, which means the tag will be imported. |  [optional]



