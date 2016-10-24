
# V1RoleBinding

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**apiVersion** | **String** | APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: http://releases.k8s.io/release-1.4/docs/devel/api-conventions.md#resources |  [optional]
**groupNames** | **List&lt;String&gt;** | GroupNames holds all the groups directly bound to the role | 
**kind** | **String** | Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: http://releases.k8s.io/release-1.4/docs/devel/api-conventions.md#types-kinds |  [optional]
**metadata** | [**V1ObjectMeta**](V1ObjectMeta.md) |  |  [optional]
**roleRef** | [**V1ObjectReference**](V1ObjectReference.md) |  | 
**subjects** | [**List&lt;V1ObjectReference&gt;**](V1ObjectReference.md) | Subjects hold object references to authorize with this rule | 
**userNames** | **List&lt;String&gt;** | UserNames holds all the usernames directly bound to the role | 



