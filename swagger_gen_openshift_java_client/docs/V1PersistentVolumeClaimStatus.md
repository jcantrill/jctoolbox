
# V1PersistentVolumeClaimStatus

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accessModes** | [**List&lt;V1PersistentVolumeAccessMode&gt;**](V1PersistentVolumeAccessMode.md) | AccessModes contains the actual access modes the volume backing the PVC has. More info: http://releases.k8s.io/release-1.4/docs/user-guide/persistent-volumes.md#access-modes-1 |  [optional]
**capacity** | **Object** | Represents the actual resources of the underlying volume. |  [optional]
**phase** | **String** | Phase represents the current phase of PersistentVolumeClaim. |  [optional]



