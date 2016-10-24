
# V1Policy

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**apiVersion** | **String** | APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: http://releases.k8s.io/release-1.4/docs/devel/api-conventions.md#resources |  [optional]
**kind** | **String** | Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: http://releases.k8s.io/release-1.4/docs/devel/api-conventions.md#types-kinds |  [optional]
**lastModified** | **String** | LastModified is the last time that any part of the Policy was created, updated, or deleted | 
**metadata** | [**V1ObjectMeta**](V1ObjectMeta.md) |  |  [optional]
**roles** | [**List&lt;V1NamedRole&gt;**](V1NamedRole.md) | Roles holds all the Roles held by this Policy, mapped by Role.Name | 



