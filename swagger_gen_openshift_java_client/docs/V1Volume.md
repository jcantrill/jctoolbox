
# V1Volume

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**awsElasticBlockStore** | [**V1AWSElasticBlockStoreVolumeSource**](V1AWSElasticBlockStoreVolumeSource.md) |  |  [optional]
**azureDisk** | [**V1AzureDiskVolumeSource**](V1AzureDiskVolumeSource.md) |  |  [optional]
**azureFile** | [**V1AzureFileVolumeSource**](V1AzureFileVolumeSource.md) |  |  [optional]
**cephfs** | [**V1CephFSVolumeSource**](V1CephFSVolumeSource.md) |  |  [optional]
**cinder** | [**V1CinderVolumeSource**](V1CinderVolumeSource.md) |  |  [optional]
**configMap** | [**V1ConfigMapVolumeSource**](V1ConfigMapVolumeSource.md) |  |  [optional]
**downwardAPI** | [**V1DownwardAPIVolumeSource**](V1DownwardAPIVolumeSource.md) |  |  [optional]
**emptyDir** | [**V1EmptyDirVolumeSource**](V1EmptyDirVolumeSource.md) |  |  [optional]
**fc** | [**V1FCVolumeSource**](V1FCVolumeSource.md) |  |  [optional]
**flexVolume** | [**V1FlexVolumeSource**](V1FlexVolumeSource.md) |  |  [optional]
**flocker** | [**V1FlockerVolumeSource**](V1FlockerVolumeSource.md) |  |  [optional]
**gcePersistentDisk** | [**V1GCEPersistentDiskVolumeSource**](V1GCEPersistentDiskVolumeSource.md) |  |  [optional]
**gitRepo** | [**V1GitRepoVolumeSource**](V1GitRepoVolumeSource.md) |  |  [optional]
**glusterfs** | [**V1GlusterfsVolumeSource**](V1GlusterfsVolumeSource.md) |  |  [optional]
**hostPath** | [**V1HostPathVolumeSource**](V1HostPathVolumeSource.md) |  |  [optional]
**iscsi** | [**V1ISCSIVolumeSource**](V1ISCSIVolumeSource.md) |  |  [optional]
**metadata** | [**V1DeprecatedDownwardAPIVolumeSource**](V1DeprecatedDownwardAPIVolumeSource.md) |  |  [optional]
**name** | **String** | Volume&#39;s name. Must be a DNS_LABEL and unique within the pod. More info: http://releases.k8s.io/release-1.4/docs/user-guide/identifiers.md#names | 
**nfs** | [**V1NFSVolumeSource**](V1NFSVolumeSource.md) |  |  [optional]
**persistentVolumeClaim** | [**V1PersistentVolumeClaimVolumeSource**](V1PersistentVolumeClaimVolumeSource.md) |  |  [optional]
**quobyte** | [**V1QuobyteVolumeSource**](V1QuobyteVolumeSource.md) |  |  [optional]
**rbd** | [**V1RBDVolumeSource**](V1RBDVolumeSource.md) |  |  [optional]
**secret** | [**V1SecretVolumeSource**](V1SecretVolumeSource.md) |  |  [optional]
**vsphereVolume** | [**V1VsphereVirtualDiskVolumeSource**](V1VsphereVirtualDiskVolumeSource.md) |  |  [optional]



