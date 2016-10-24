
# V1Probe

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**exec** | [**V1ExecAction**](V1ExecAction.md) |  |  [optional]
**failureThreshold** | **Integer** | Minimum consecutive failures for the probe to be considered failed after having succeeded. Defaults to 3. Minimum value is 1. |  [optional]
**httpGet** | [**V1HTTPGetAction**](V1HTTPGetAction.md) |  |  [optional]
**initialDelaySeconds** | **Integer** | Number of seconds after the container has started before liveness probes are initiated. More info: http://releases.k8s.io/release-1.4/docs/user-guide/pod-states.md#container-probes |  [optional]
**periodSeconds** | **Integer** | How often (in seconds) to perform the probe. Default to 10 seconds. Minimum value is 1. |  [optional]
**successThreshold** | **Integer** | Minimum consecutive successes for the probe to be considered successful after having failed. Defaults to 1. Must be 1 for liveness. Minimum value is 1. |  [optional]
**tcpSocket** | [**V1TCPSocketAction**](V1TCPSocketAction.md) |  |  [optional]
**timeoutSeconds** | **Integer** | Number of seconds after which the probe times out. Defaults to 1 second. Minimum value is 1. More info: http://releases.k8s.io/release-1.4/docs/user-guide/pod-states.md#container-probes |  [optional]



