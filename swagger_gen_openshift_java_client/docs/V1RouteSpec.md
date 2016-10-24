
# V1RouteSpec

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**alternateBackends** | [**List&lt;V1RouteTargetReference&gt;**](V1RouteTargetReference.md) | alternateBackends is an extension of the &#39;to&#39; field. If more than one service needs to be pointed to, then use this field. Use the weight field in RouteTargetReference object to specify relative preference. If the weight field is zero, the backend is ignored. |  [optional]
**host** | **String** | host is an alias/DNS that points to the service. Optional. If not specified a route name will typically be automatically chosen. Must follow DNS952 subdomain conventions. | 
**path** | **String** | Path that the router watches for, to route traffic for to the service. Optional |  [optional]
**port** | [**V1RoutePort**](V1RoutePort.md) |  |  [optional]
**tls** | [**V1TLSConfig**](V1TLSConfig.md) |  |  [optional]
**to** | [**V1RouteTargetReference**](V1RouteTargetReference.md) |  | 



