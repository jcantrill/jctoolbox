
# V1ImageSignature

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**apiVersion** | **String** | APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: http://releases.k8s.io/release-1.4/docs/devel/api-conventions.md#resources |  [optional]
**conditions** | [**List&lt;V1SignatureCondition&gt;**](V1SignatureCondition.md) | Conditions represent the latest available observations of a signature&#39;s current state. |  [optional]
**content** | **String** | Required: An opaque binary string which is an image&#39;s signature. | 
**created** | **String** | If specified, it is the time of signature&#39;s creation. |  [optional]
**imageIdentity** | **String** | A human readable string representing image&#39;s identity. It could be a product name and version, or an image pull spec (e.g. \&quot;registry.access.redhat.com/rhel7/rhel:7.2\&quot;). |  [optional]
**issuedBy** | [**V1SignatureIssuer**](V1SignatureIssuer.md) |  |  [optional]
**issuedTo** | [**V1SignatureSubject**](V1SignatureSubject.md) |  |  [optional]
**kind** | **String** | Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: http://releases.k8s.io/release-1.4/docs/devel/api-conventions.md#types-kinds |  [optional]
**metadata** | [**V1ObjectMeta**](V1ObjectMeta.md) |  |  [optional]
**signedClaims** | **Object** | Contains claims from the signature. |  [optional]
**type** | **String** | Required: Describes a type of stored blob. | 



