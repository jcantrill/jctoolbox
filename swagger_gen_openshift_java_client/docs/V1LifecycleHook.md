
# V1LifecycleHook

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**execNewPod** | [**V1ExecNewPodHook**](V1ExecNewPodHook.md) |  |  [optional]
**failurePolicy** | **String** | FailurePolicy specifies what action to take if the hook fails. | 
**tagImages** | [**List&lt;V1TagImageHook&gt;**](V1TagImageHook.md) | TagImages instructs the deployer to tag the current image referenced under a container onto an image stream tag. |  [optional]



