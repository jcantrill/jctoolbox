
# V1NFSVolumeSource

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**path** | **String** | Path that is exported by the NFS server. More info: http://releases.k8s.io/release-1.4/docs/user-guide/volumes.md#nfs | 
**readOnly** | **Boolean** | ReadOnly here will force the NFS export to be mounted with read-only permissions. Defaults to false. More info: http://releases.k8s.io/release-1.4/docs/user-guide/volumes.md#nfs |  [optional]
**server** | **String** | Server is the hostname or IP address of the NFS server. More info: http://releases.k8s.io/release-1.4/docs/user-guide/volumes.md#nfs | 



