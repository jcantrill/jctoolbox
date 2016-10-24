
# V1ResourceAccessReview

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**apiVersion** | **String** | APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: http://releases.k8s.io/release-1.4/docs/devel/api-conventions.md#resources |  [optional]
**content** | **String** | Content is the actual content of the request for create and update |  [optional]
**kind** | **String** | Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: http://releases.k8s.io/release-1.4/docs/devel/api-conventions.md#types-kinds |  [optional]
**namespace** | **String** | Namespace is the namespace of the action being requested.  Currently, there is no distinction between no namespace and all namespaces | 
**resource** | **String** | Resource is one of the existing resource types | 
**resourceAPIGroup** | **String** | Group is the API group of the resource Serialized as resourceAPIGroup to avoid confusion with the &#39;groups&#39; field when inlined | 
**resourceAPIVersion** | **String** | Version is the API version of the resource Serialized as resourceAPIVersion to avoid confusion with TypeMeta.apiVersion and ObjectMeta.resourceVersion when inlined | 
**resourceName** | **String** | ResourceName is the name of the resource being requested for a \&quot;get\&quot; or deleted for a \&quot;delete\&quot; | 
**verb** | **String** | Verb is one of: get, list, watch, create, update, delete | 



