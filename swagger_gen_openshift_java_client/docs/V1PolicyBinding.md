
# V1PolicyBinding

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**apiVersion** | **String** | APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: http://releases.k8s.io/release-1.4/docs/devel/api-conventions.md#resources |  [optional]
**kind** | **String** | Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: http://releases.k8s.io/release-1.4/docs/devel/api-conventions.md#types-kinds |  [optional]
**lastModified** | **String** | LastModified is the last time that any part of the PolicyBinding was created, updated, or deleted | 
**metadata** | [**V1ObjectMeta**](V1ObjectMeta.md) |  |  [optional]
**policyRef** | [**V1ObjectReference**](V1ObjectReference.md) |  | 
**roleBindings** | [**List&lt;V1NamedRoleBinding&gt;**](V1NamedRoleBinding.md) | RoleBindings holds all the RoleBindings held by this PolicyBinding, mapped by RoleBinding.Name | 



