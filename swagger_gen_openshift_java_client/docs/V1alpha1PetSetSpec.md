
# V1alpha1PetSetSpec

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**replicas** | **Integer** | Replicas is the desired number of replicas of the given Template. These are replicas in the sense that they are instantiations of the same Template, but individual replicas also have a consistent identity. If unspecified, defaults to 1. |  [optional]
**selector** | [**UnversionedLabelSelector**](UnversionedLabelSelector.md) |  |  [optional]
**serviceName** | **String** | ServiceName is the name of the service that governs this PetSet. This service must exist before the PetSet, and is responsible for the network identity of the set. Pets get DNS/hostnames that follow the pattern: pet-specific-string.serviceName.default.svc.cluster.local where \&quot;pet-specific-string\&quot; is managed by the PetSet controller. | 
**template** | [**V1PodTemplateSpec**](V1PodTemplateSpec.md) |  | 
**volumeClaimTemplates** | [**List&lt;V1PersistentVolumeClaim&gt;**](V1PersistentVolumeClaim.md) | VolumeClaimTemplates is a list of claims that pets are allowed to reference. The PetSet controller is responsible for mapping network identities to claims in a way that maintains the identity of a pet. Every claim in this list must have at least one matching (by name) volumeMount in one container in the template. A claim in this list takes precedence over any volumes in the template, with the same name. |  [optional]



