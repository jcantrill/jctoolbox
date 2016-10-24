
# V1beta1JobStatus

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**active** | **Integer** | Active is the number of actively running pods. |  [optional]
**completionTime** | **String** | CompletionTime represents time when the job was completed. It is not guaranteed to be set in happens-before order across separate operations. It is represented in RFC3339 form and is in UTC. |  [optional]
**conditions** | [**List&lt;V1beta1JobCondition&gt;**](V1beta1JobCondition.md) | Conditions represent the latest available observations of an object&#39;s current state. More info: http://releases.k8s.io/release-1.4/docs/user-guide/jobs.md |  [optional]
**failed** | **Integer** | Failed is the number of pods which reached Phase Failed. |  [optional]
**startTime** | **String** | StartTime represents time when the job was acknowledged by the Job Manager. It is not guaranteed to be set in happens-before order across separate operations. It is represented in RFC3339 form and is in UTC. |  [optional]
**succeeded** | **Integer** | Succeeded is the number of pods which reached Phase Succeeded. |  [optional]



