
# V1ClusterNetwork

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**apiVersion** | **String** | APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: http://releases.k8s.io/release-1.4/docs/devel/api-conventions.md#resources |  [optional]
**hostsubnetlength** | **Integer** | HostSubnetLength is the number of bits of network to allocate to each node. eg, 8 would mean that each node would have a /24 slice of the overlay network for its pods | 
**kind** | **String** | Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: http://releases.k8s.io/release-1.4/docs/devel/api-conventions.md#types-kinds |  [optional]
**metadata** | [**V1ObjectMeta**](V1ObjectMeta.md) |  |  [optional]
**network** | **String** | Network is a CIDR string specifying the global overlay network&#39;s L3 space | 
**pluginName** | **String** | PluginName is the name of the network plugin being used |  [optional]
**serviceNetwork** | **String** | ServiceNetwork is the CIDR range that Service IP addresses are allocated from | 



