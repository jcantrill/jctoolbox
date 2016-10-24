
# V1LimitRangeList

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**apiVersion** | **String** | APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: http://releases.k8s.io/release-1.4/docs/devel/api-conventions.md#resources |  [optional]
**items** | [**List&lt;V1LimitRange&gt;**](V1LimitRange.md) | Items is a list of LimitRange objects. More info: http://releases.k8s.io/release-1.4/docs/design/admission_control_limit_range.md | 
**kind** | **String** | Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: http://releases.k8s.io/release-1.4/docs/devel/api-conventions.md#types-kinds |  [optional]
**metadata** | [**UnversionedListMeta**](UnversionedListMeta.md) |  |  [optional]



