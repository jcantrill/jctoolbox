
# V1PodStatus

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**conditions** | [**List&lt;V1PodCondition&gt;**](V1PodCondition.md) | Current service state of pod. More info: http://releases.k8s.io/release-1.4/docs/user-guide/pod-states.md#pod-conditions |  [optional]
**containerStatuses** | [**List&lt;V1ContainerStatus&gt;**](V1ContainerStatus.md) | The list has one entry per container in the manifest. Each entry is currently the output of &#x60;docker inspect&#x60;. More info: http://releases.k8s.io/release-1.4/docs/user-guide/pod-states.md#container-statuses |  [optional]
**hostIP** | **String** | IP address of the host to which the pod is assigned. Empty if not yet scheduled. |  [optional]
**message** | **String** | A human readable message indicating details about why the pod is in this condition. |  [optional]
**phase** | **String** | Current condition of the pod. More info: http://releases.k8s.io/release-1.4/docs/user-guide/pod-states.md#pod-phase |  [optional]
**podIP** | **String** | IP address allocated to the pod. Routable at least within the cluster. Empty if not yet allocated. |  [optional]
**reason** | **String** | A brief CamelCase message indicating details about why the pod is in this state. e.g. &#39;OutOfDisk&#39; |  [optional]
**startTime** | **String** | RFC 3339 date and time at which the object was acknowledged by the Kubelet. This is before the Kubelet pulled the container image(s) for the pod. |  [optional]



