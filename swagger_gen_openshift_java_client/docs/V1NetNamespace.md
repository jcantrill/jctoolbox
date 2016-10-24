
# V1NetNamespace

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**apiVersion** | **String** | APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: http://releases.k8s.io/release-1.4/docs/devel/api-conventions.md#resources |  [optional]
**kind** | **String** | Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: http://releases.k8s.io/release-1.4/docs/devel/api-conventions.md#types-kinds |  [optional]
**metadata** | [**V1ObjectMeta**](V1ObjectMeta.md) |  |  [optional]
**netid** | **Integer** | NetID is the network identifier of the network namespace assigned to each overlay network packet. This can be manipulated with the \&quot;oadm pod-network\&quot; commands. | 
**netname** | **String** | NetName is the name of the network namespace. (This is the same as the object&#39;s name, but both fields must be set.) | 



