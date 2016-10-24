
# V1SecurityContext

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**capabilities** | [**V1Capabilities**](V1Capabilities.md) |  |  [optional]
**privileged** | **Boolean** | Run container in privileged mode. Processes in privileged containers are essentially equivalent to root on the host. Defaults to false. |  [optional]
**readOnlyRootFilesystem** | **Boolean** | Whether this container has a read-only root filesystem. Default is false. |  [optional]
**runAsNonRoot** | **Boolean** | Indicates that the container must run as a non-root user. If true, the Kubelet will validate the image at runtime to ensure that it does not run as UID 0 (root) and fail to start the container if it does. If unset or false, no such validation will be performed. May also be set in PodSecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence. |  [optional]
**runAsUser** | **Long** | The UID to run the entrypoint of the container process. Defaults to user specified in image metadata if unspecified. May also be set in PodSecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence. |  [optional]
**seLinuxOptions** | [**V1SELinuxOptions**](V1SELinuxOptions.md) |  |  [optional]



