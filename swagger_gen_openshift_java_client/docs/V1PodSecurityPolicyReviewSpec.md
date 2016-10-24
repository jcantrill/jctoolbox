
# V1PodSecurityPolicyReviewSpec

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**serviceAccountNames** | **List&lt;String&gt;** | serviceAccountNames is an optional set of ServiceAccounts to run the check with. If serviceAccountNames is empty, the template.spec.serviceAccountName is used, unless it&#39;s empty, in which case \&quot;default\&quot; is used instead. If serviceAccountNames is specified, template.spec.serviceAccountName is ignored. |  [optional]
**template** | [**V1PodTemplateSpec**](V1PodTemplateSpec.md) |  | 



