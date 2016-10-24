
# V1ImageStreamTag

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**apiVersion** | **String** | APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: http://releases.k8s.io/release-1.4/docs/devel/api-conventions.md#resources |  [optional]
**conditions** | [**List&lt;V1TagEventCondition&gt;**](V1TagEventCondition.md) | Conditions is an array of conditions that apply to the image stream tag. |  [optional]
**generation** | **Long** | Generation is the current generation of the tagged image - if tag is provided and this value is not equal to the tag generation, a user has requested an import that has not completed, or Conditions will be filled out indicating any error. | 
**image** | [**V1Image**](V1Image.md) |  | 
**kind** | **String** | Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: http://releases.k8s.io/release-1.4/docs/devel/api-conventions.md#types-kinds |  [optional]
**metadata** | [**V1ObjectMeta**](V1ObjectMeta.md) |  |  [optional]
**tag** | [**V1TagReference**](V1TagReference.md) |  | 



