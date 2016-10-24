
# V1beta1NetworkPolicySpec

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ingress** | [**List&lt;V1beta1NetworkPolicyIngressRule&gt;**](V1beta1NetworkPolicyIngressRule.md) | List of ingress rules to be applied to the selected pods. Traffic is allowed to a pod if namespace.networkPolicy.ingress.isolation is undefined and cluster policy allows it, OR if the traffic source is the pod&#39;s local node, OR if the traffic matches at least one ingress rule across all of the NetworkPolicy objects whose podSelector matches the pod. If this field is empty then this NetworkPolicy does not affect ingress isolation. If this field is present and contains at least one rule, this policy allows any traffic which matches at least one of the ingress rules in this list. |  [optional]
**podSelector** | [**V1beta1LabelSelector**](V1beta1LabelSelector.md) |  | 



