
# V1Container

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**args** | **List&lt;String&gt;** | Arguments to the entrypoint. The docker image&#39;s CMD is used if this is not provided. Variable references $(VAR_NAME) are expanded using the container&#39;s environment. If a variable cannot be resolved, the reference in the input string will be unchanged. The $(VAR_NAME) syntax can be escaped with a double $$, ie: $$(VAR_NAME). Escaped references will never be expanded, regardless of whether the variable exists or not. Cannot be updated. More info: http://releases.k8s.io/release-1.4/docs/user-guide/containers.md#containers-and-commands |  [optional]
**command** | **List&lt;String&gt;** | Entrypoint array. Not executed within a shell. The docker image&#39;s ENTRYPOINT is used if this is not provided. Variable references $(VAR_NAME) are expanded using the container&#39;s environment. If a variable cannot be resolved, the reference in the input string will be unchanged. The $(VAR_NAME) syntax can be escaped with a double $$, ie: $$(VAR_NAME). Escaped references will never be expanded, regardless of whether the variable exists or not. Cannot be updated. More info: http://releases.k8s.io/release-1.4/docs/user-guide/containers.md#containers-and-commands |  [optional]
**env** | [**List&lt;V1EnvVar&gt;**](V1EnvVar.md) | List of environment variables to set in the container. Cannot be updated. |  [optional]
**image** | **String** | Docker image name. More info: http://releases.k8s.io/release-1.4/docs/user-guide/images.md |  [optional]
**imagePullPolicy** | **String** | Image pull policy. One of Always, Never, IfNotPresent. Defaults to Always if :latest tag is specified, or IfNotPresent otherwise. Cannot be updated. More info: http://releases.k8s.io/release-1.4/docs/user-guide/images.md#updating-images |  [optional]
**lifecycle** | [**V1Lifecycle**](V1Lifecycle.md) |  |  [optional]
**livenessProbe** | [**V1Probe**](V1Probe.md) |  |  [optional]
**name** | **String** | Name of the container specified as a DNS_LABEL. Each container in a pod must have a unique name (DNS_LABEL). Cannot be updated. | 
**ports** | [**List&lt;V1ContainerPort&gt;**](V1ContainerPort.md) | List of ports to expose from the container. Exposing a port here gives the system additional information about the network connections a container uses, but is primarily informational. Not specifying a port here DOES NOT prevent that port from being exposed. Any port which is listening on the default \&quot;0.0.0.0\&quot; address inside a container will be accessible from the network. Cannot be updated. |  [optional]
**readinessProbe** | [**V1Probe**](V1Probe.md) |  |  [optional]
**resources** | [**V1ResourceRequirements**](V1ResourceRequirements.md) |  |  [optional]
**securityContext** | [**V1SecurityContext**](V1SecurityContext.md) |  |  [optional]
**stdin** | **Boolean** | Whether this container should allocate a buffer for stdin in the container runtime. If this is not set, reads from stdin in the container will always result in EOF. Default is false. |  [optional]
**stdinOnce** | **Boolean** | Whether the container runtime should close the stdin channel after it has been opened by a single attach. When stdin is true the stdin stream will remain open across multiple attach sessions. If stdinOnce is set to true, stdin is opened on container start, is empty until the first client attaches to stdin, and then remains open and accepts data until the client disconnects, at which time stdin is closed and remains closed until the container is restarted. If this flag is false, a container processes that reads from stdin will never receive an EOF. Default is false |  [optional]
**terminationMessagePath** | **String** | Optional: Path at which the file to which the container&#39;s termination message will be written is mounted into the container&#39;s filesystem. Message written is intended to be brief final status, such as an assertion failure message. Defaults to /dev/termination-log. Cannot be updated. |  [optional]
**tty** | **Boolean** | Whether this container should allocate a TTY for itself, also requires &#39;stdin&#39; to be true. Default is false. |  [optional]
**volumeMounts** | [**List&lt;V1VolumeMount&gt;**](V1VolumeMount.md) | Pod volumes to mount into the container&#39;s filesystem. Cannot be updated. |  [optional]
**workingDir** | **String** | Container&#39;s working directory. If not specified, the container runtime&#39;s default will be used, which might be configured in the container image. Cannot be updated. |  [optional]



