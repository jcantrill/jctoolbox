
# V1PersistentVolumeSpec

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accessModes** | [**List&lt;V1PersistentVolumeAccessMode&gt;**](V1PersistentVolumeAccessMode.md) | AccessModes contains all ways the volume can be mounted. More info: http://releases.k8s.io/release-1.4/docs/user-guide/persistent-volumes.md#access-modes |  [optional]
**awsElasticBlockStore** | [**V1AWSElasticBlockStoreVolumeSource**](V1AWSElasticBlockStoreVolumeSource.md) |  |  [optional]
**azureDisk** | [**V1AzureDiskVolumeSource**](V1AzureDiskVolumeSource.md) |  |  [optional]
**azureFile** | [**V1AzureFileVolumeSource**](V1AzureFileVolumeSource.md) |  |  [optional]
**capacity** | **Object** | A description of the persistent volume&#39;s resources and capacity. More info: http://releases.k8s.io/release-1.4/docs/user-guide/persistent-volumes.md#capacity |  [optional]
**cephfs** | [**V1CephFSVolumeSource**](V1CephFSVolumeSource.md) |  |  [optional]
**cinder** | [**V1CinderVolumeSource**](V1CinderVolumeSource.md) |  |  [optional]
**claimRef** | [**V1ObjectReference**](V1ObjectReference.md) |  |  [optional]
**fc** | [**V1FCVolumeSource**](V1FCVolumeSource.md) |  |  [optional]
**flexVolume** | [**V1FlexVolumeSource**](V1FlexVolumeSource.md) |  |  [optional]
**flocker** | [**V1FlockerVolumeSource**](V1FlockerVolumeSource.md) |  |  [optional]
**gcePersistentDisk** | [**V1GCEPersistentDiskVolumeSource**](V1GCEPersistentDiskVolumeSource.md) |  |  [optional]
**glusterfs** | [**V1GlusterfsVolumeSource**](V1GlusterfsVolumeSource.md) |  |  [optional]
**hostPath** | [**V1HostPathVolumeSource**](V1HostPathVolumeSource.md) |  |  [optional]
**iscsi** | [**V1ISCSIVolumeSource**](V1ISCSIVolumeSource.md) |  |  [optional]
**nfs** | [**V1NFSVolumeSource**](V1NFSVolumeSource.md) |  |  [optional]
**persistentVolumeReclaimPolicy** | **String** | What happens to a persistent volume when released from its claim. Valid options are Retain (default) and Recycle. Recycling must be supported by the volume plugin underlying this persistent volume. More info: http://releases.k8s.io/release-1.4/docs/user-guide/persistent-volumes.md#recycling-policy |  [optional]
**quobyte** | [**V1QuobyteVolumeSource**](V1QuobyteVolumeSource.md) |  |  [optional]
**rbd** | [**V1RBDVolumeSource**](V1RBDVolumeSource.md) |  |  [optional]
**vsphereVolume** | [**V1VsphereVirtualDiskVolumeSource**](V1VsphereVirtualDiskVolumeSource.md) |  |  [optional]



