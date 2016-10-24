
# V1beta1IngressSpec

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**backend** | [**V1beta1IngressBackend**](V1beta1IngressBackend.md) |  |  [optional]
**rules** | [**List&lt;V1beta1IngressRule&gt;**](V1beta1IngressRule.md) | A list of host rules used to configure the Ingress. If unspecified, or no rule matches, all traffic is sent to the default backend. |  [optional]
**tls** | [**List&lt;V1beta1IngressTLS&gt;**](V1beta1IngressTLS.md) | TLS configuration. Currently the Ingress only supports a single TLS port, 443. If multiple members of this list specify different hosts, they will be multiplexed on the same port according to the hostname specified through the SNI TLS extension, if the ingress controller fulfilling the ingress supports SNI. |  [optional]



