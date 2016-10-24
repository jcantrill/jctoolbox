
# V1RollingDeploymentStrategyParams

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**intervalSeconds** | **Long** | IntervalSeconds is the time to wait between polling deployment status after update. If the value is nil, a default will be used. |  [optional]
**maxSurge** | **String** | MaxSurge is the maximum number of pods that can be scheduled above the original number of pods. Value can be an absolute number (ex: 5) or a percentage of total pods at the start of the update (ex: 10%). Absolute number is calculated from percentage by rounding up.  This cannot be 0 if MaxUnavailable is 0. By default, 25% is used.  Example: when this is set to 30%, the new RC can be scaled up by 30% immediately when the rolling update starts. Once old pods have been killed, new RC can be scaled up further, ensuring that total number of pods running at any time during the update is atmost 130% of original pods. |  [optional]
**maxUnavailable** | **String** | MaxUnavailable is the maximum number of pods that can be unavailable during the update. Value can be an absolute number (ex: 5) or a percentage of total pods at the start of update (ex: 10%). Absolute number is calculated from percentage by rounding up.  This cannot be 0 if MaxSurge is 0. By default, 25% is used.  Example: when this is set to 30%, the old RC can be scaled down by 30% immediately when the rolling update starts. Once new pods are ready, old RC can be scaled down further, followed by scaling up the new RC, ensuring that at least 70% of original number of pods are available at all times during the update. |  [optional]
**post** | [**V1LifecycleHook**](V1LifecycleHook.md) |  |  [optional]
**pre** | [**V1LifecycleHook**](V1LifecycleHook.md) |  |  [optional]
**timeoutSeconds** | **Long** | TimeoutSeconds is the time to wait for updates before giving up. If the value is nil, a default will be used. |  [optional]
**updatePeriodSeconds** | **Long** | UpdatePeriodSeconds is the time to wait between individual pod updates. If the value is nil, a default will be used. |  [optional]



