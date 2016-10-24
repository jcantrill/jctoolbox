
# V1beta1NetworkPolicyPort

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**port** | **String** | If specified, the port on the given protocol.  This can either be a numerical or named port on a pod.  If this field is not provided, this matches all port names and numbers. If present, only traffic on the specified protocol AND port will be matched. |  [optional]
**protocol** | [**V1Protocol**](V1Protocol.md) |  |  [optional]



