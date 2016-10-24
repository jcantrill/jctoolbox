
# V1ResourceQuotaSpec

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**hard** | **Object** | Hard is the set of desired hard limits for each named resource. More info: http://releases.k8s.io/release-1.4/docs/design/admission_control_resource_quota.md#admissioncontrol-plugin-resourcequota |  [optional]
**scopes** | [**List&lt;V1ResourceQuotaScope&gt;**](V1ResourceQuotaScope.md) | A collection of filters that must match each object tracked by a quota. If not specified, the quota matches all objects. |  [optional]



