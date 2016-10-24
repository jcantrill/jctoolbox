
# V1AzureDiskVolumeSource

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cachingMode** | [**V1AzureDataDiskCachingMode**](V1AzureDataDiskCachingMode.md) |  |  [optional]
**diskName** | **String** | The Name of the data disk in the blob storage | 
**diskURI** | **String** | The URI the data disk in the blob storage | 
**fsType** | **String** | Filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. \&quot;ext4\&quot;, \&quot;xfs\&quot;, \&quot;ntfs\&quot;. Implicitly inferred to be \&quot;ext4\&quot; if unspecified. |  [optional]
**readOnly** | **Boolean** | Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts. |  [optional]



