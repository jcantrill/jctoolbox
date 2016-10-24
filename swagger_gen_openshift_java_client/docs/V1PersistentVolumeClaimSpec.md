
# V1PersistentVolumeClaimSpec

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accessModes** | [**List&lt;V1PersistentVolumeAccessMode&gt;**](V1PersistentVolumeAccessMode.md) | AccessModes contains the desired access modes the volume should have. More info: http://releases.k8s.io/release-1.4/docs/user-guide/persistent-volumes.md#access-modes-1 |  [optional]
**resources** | [**V1ResourceRequirements**](V1ResourceRequirements.md) |  |  [optional]
**selector** | [**UnversionedLabelSelector**](UnversionedLabelSelector.md) |  |  [optional]
**volumeName** | **String** | VolumeName is the binding reference to the PersistentVolume backing this claim. |  [optional]



