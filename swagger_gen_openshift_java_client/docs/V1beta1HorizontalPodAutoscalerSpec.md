
# V1beta1HorizontalPodAutoscalerSpec

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cpuUtilization** | [**V1beta1CPUTargetUtilization**](V1beta1CPUTargetUtilization.md) |  |  [optional]
**maxReplicas** | **Integer** | upper limit for the number of pods that can be set by the autoscaler; cannot be smaller than MinReplicas. | 
**minReplicas** | **Integer** | lower limit for the number of pods that can be set by the autoscaler, default 1. |  [optional]
**scaleRef** | [**V1beta1SubresourceReference**](V1beta1SubresourceReference.md) |  | 



