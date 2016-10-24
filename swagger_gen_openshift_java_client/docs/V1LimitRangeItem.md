
# V1LimitRangeItem

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**_default** | **Object** | Default resource requirement limit value by resource name if resource limit is omitted. |  [optional]
**defaultRequest** | **Object** | DefaultRequest is the default resource requirement request value by resource name if resource request is omitted. |  [optional]
**max** | **Object** | Max usage constraints on this kind by resource name. |  [optional]
**maxLimitRequestRatio** | **Object** | MaxLimitRequestRatio if specified, the named resource must have a request and limit that are both non-zero where limit divided by request is less than or equal to the enumerated value; this represents the max burst for the named resource. |  [optional]
**min** | **Object** | Min usage constraints on this kind by resource name. |  [optional]
**type** | **String** | Type of resource that this limit applies to. |  [optional]



