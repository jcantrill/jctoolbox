
# V1ClusterResourceQuotaStatus

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**namespaces** | [**List&lt;V1ResourceQuotaStatusByNamespace&gt;**](V1ResourceQuotaStatusByNamespace.md) | Namespaces slices the usage by project.  This division allows for quick resolution of deletion reconcilation inside of a single project without requiring a recalculation across all projects.  This can be used to pull the deltas for a given project. | 
**total** | [**V1ResourceQuotaStatus**](V1ResourceQuotaStatus.md) |  | 



