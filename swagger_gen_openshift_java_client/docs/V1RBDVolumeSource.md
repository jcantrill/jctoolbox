
# V1RBDVolumeSource

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fsType** | **String** | Filesystem type of the volume that you want to mount. Tip: Ensure that the filesystem type is supported by the host operating system. Examples: \&quot;ext4\&quot;, \&quot;xfs\&quot;, \&quot;ntfs\&quot;. Implicitly inferred to be \&quot;ext4\&quot; if unspecified. More info: http://releases.k8s.io/release-1.4/docs/user-guide/volumes.md#rbd |  [optional]
**image** | **String** | The rados image name. More info: http://releases.k8s.io/release-1.4/examples/volumes/rbd/README.md#how-to-use-it | 
**keyring** | **String** | Keyring is the path to key ring for RBDUser. Default is /etc/ceph/keyring. More info: http://releases.k8s.io/release-1.4/examples/volumes/rbd/README.md#how-to-use-it |  [optional]
**monitors** | **List&lt;String&gt;** | A collection of Ceph monitors. More info: http://releases.k8s.io/release-1.4/examples/volumes/rbd/README.md#how-to-use-it | 
**pool** | **String** | The rados pool name. Default is rbd. More info: http://releases.k8s.io/release-1.4/examples/volumes/rbd/README.md#how-to-use-it. |  [optional]
**readOnly** | **Boolean** | ReadOnly here will force the ReadOnly setting in VolumeMounts. Defaults to false. More info: http://releases.k8s.io/release-1.4/examples/volumes/rbd/README.md#how-to-use-it |  [optional]
**secretRef** | [**V1LocalObjectReference**](V1LocalObjectReference.md) |  |  [optional]
**user** | **String** | The rados user name. Default is admin. More info: http://releases.k8s.io/release-1.4/examples/volumes/rbd/README.md#how-to-use-it |  [optional]



