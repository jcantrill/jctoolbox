
# V1NodeSpec

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**externalID** | **String** | External ID of the node assigned by some machine database (e.g. a cloud provider). Deprecated. |  [optional]
**podCIDR** | **String** | PodCIDR represents the pod IP range assigned to the node. |  [optional]
**providerID** | **String** | ID of the node assigned by the cloud provider in the format: &lt;ProviderName&gt;://&lt;ProviderSpecificNodeID&gt; |  [optional]
**unschedulable** | **Boolean** | Unschedulable controls node schedulability of new pods. By default, node is schedulable. More info: http://releases.k8s.io/release-1.4/docs/admin/node.md#manual-node-administration\&quot;&#x60; |  [optional]



