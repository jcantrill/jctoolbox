
# V1NodeStatus

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**addresses** | [**List&lt;V1NodeAddress&gt;**](V1NodeAddress.md) | List of addresses reachable to the node. Queried from cloud provider, if available. More info: http://releases.k8s.io/release-1.4/docs/admin/node.md#node-addresses |  [optional]
**allocatable** | **Object** | Allocatable represents the resources of a node that are available for scheduling. Defaults to Capacity. |  [optional]
**capacity** | **Object** | Capacity represents the total resources of a node. More info: http://releases.k8s.io/release-1.4/docs/user-guide/persistent-volumes.md#capacity for more details. |  [optional]
**conditions** | [**List&lt;V1NodeCondition&gt;**](V1NodeCondition.md) | Conditions is an array of current observed node conditions. More info: http://releases.k8s.io/release-1.4/docs/admin/node.md#node-condition |  [optional]
**daemonEndpoints** | [**V1NodeDaemonEndpoints**](V1NodeDaemonEndpoints.md) |  |  [optional]
**images** | [**List&lt;V1ContainerImage&gt;**](V1ContainerImage.md) | List of container images on this node |  [optional]
**nodeInfo** | [**V1NodeSystemInfo**](V1NodeSystemInfo.md) |  |  [optional]
**phase** | **String** | NodePhase is the recently observed lifecycle phase of the node. More info: http://releases.k8s.io/release-1.4/docs/admin/node.md#node-phase The field is never populated, and now is deprecated. |  [optional]
**volumesAttached** | [**List&lt;V1AttachedVolume&gt;**](V1AttachedVolume.md) | List of volumes that are attached to the node. |  [optional]
**volumesInUse** | [**List&lt;V1UniqueVolumeName&gt;**](V1UniqueVolumeName.md) | List of attachable volumes in use (mounted) by the node. |  [optional]



