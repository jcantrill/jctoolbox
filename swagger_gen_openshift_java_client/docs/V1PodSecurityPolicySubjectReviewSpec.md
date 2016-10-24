
# V1PodSecurityPolicySubjectReviewSpec

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**groups** | **List&lt;String&gt;** | groups is the groups you&#39;re testing for. |  [optional]
**template** | [**V1PodTemplateSpec**](V1PodTemplateSpec.md) |  | 
**user** | **String** | user is the user you&#39;re testing for. If you specify \&quot;user\&quot; but not \&quot;group\&quot;, then is it interpreted as \&quot;What if user were not a member of any groups. If user and groups are empty, then the check is performed using *only* the serviceAccountName in the template. |  [optional]



