
# V1ServiceAccount

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**apiVersion** | **String** | APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: http://releases.k8s.io/release-1.4/docs/devel/api-conventions.md#resources |  [optional]
**imagePullSecrets** | [**List&lt;V1LocalObjectReference&gt;**](V1LocalObjectReference.md) | ImagePullSecrets is a list of references to secrets in the same namespace to use for pulling any images in pods that reference this ServiceAccount. ImagePullSecrets are distinct from Secrets because Secrets can be mounted in the pod, but ImagePullSecrets are only accessed by the kubelet. More info: http://releases.k8s.io/release-1.4/docs/user-guide/secrets.md#manually-specifying-an-imagepullsecret |  [optional]
**kind** | **String** | Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: http://releases.k8s.io/release-1.4/docs/devel/api-conventions.md#types-kinds |  [optional]
**metadata** | [**V1ObjectMeta**](V1ObjectMeta.md) |  |  [optional]
**secrets** | [**List&lt;V1ObjectReference&gt;**](V1ObjectReference.md) | Secrets is the list of secrets allowed to be used by pods running using this ServiceAccount. More info: http://releases.k8s.io/release-1.4/docs/user-guide/secrets.md |  [optional]



