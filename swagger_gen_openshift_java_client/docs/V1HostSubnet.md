
# V1HostSubnet

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**apiVersion** | **String** | APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: http://releases.k8s.io/release-1.4/docs/devel/api-conventions.md#resources |  [optional]
**host** | **String** | Host is the name of the node. (This is redundant with the object&#39;s name, and this field is not actually used any more.) | 
**hostIP** | **String** | HostIP is the IP address to be used as a VTEP by other nodes in the overlay network | 
**kind** | **String** | Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: http://releases.k8s.io/release-1.4/docs/devel/api-conventions.md#types-kinds |  [optional]
**metadata** | [**V1ObjectMeta**](V1ObjectMeta.md) |  |  [optional]
**subnet** | **String** | Subnet is the CIDR range of the overlay network assigned to the node for its pods | 



