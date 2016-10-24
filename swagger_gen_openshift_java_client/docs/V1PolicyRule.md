
# V1PolicyRule

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**apiGroups** | **List&lt;String&gt;** | APIGroups is the name of the APIGroup that contains the resources.  If this field is empty, then both kubernetes and origin API groups are assumed. That means that if an action is requested against one of the enumerated resources in either the kubernetes or the origin API group, the request will be allowed | 
**attributeRestrictions** | **String** | AttributeRestrictions will vary depending on what the Authorizer/AuthorizationAttributeBuilder pair supports. If the Authorizer does not recognize how to handle the AttributeRestrictions, the Authorizer should report an error. |  [optional]
**nonResourceURLs** | **List&lt;String&gt;** | NonResourceURLsSlice is a set of partial urls that a user should have access to.  *s are allowed, but only as the full, final step in the path This name is intentionally different than the internal type so that the DefaultConvert works nicely and because the ordering may be different. |  [optional]
**resourceNames** | **List&lt;String&gt;** | ResourceNames is an optional white list of names that the rule applies to.  An empty set means that everything is allowed. |  [optional]
**resources** | **List&lt;String&gt;** | Resources is a list of resources this rule applies to.  ResourceAll represents all resources. | 
**verbs** | **List&lt;String&gt;** | Verbs is a list of Verbs that apply to ALL the ResourceKinds and AttributeRestrictions contained in this rule.  VerbAll represents all kinds. | 



