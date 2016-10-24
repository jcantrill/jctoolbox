
# V1PodSecurityContext

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fsGroup** | **Long** | A special supplemental group that applies to all containers in a pod. Some volume types allow the Kubelet to change the ownership of that volume to be owned by the pod:  1. The owning GID will be the FSGroup 2. The setgid bit is set (new files created in the volume will be owned by FSGroup) 3. The permission bits are OR&#39;d with rw-rw  |  [optional]
**runAsNonRoot** | **Boolean** | Indicates that the container must run as a non-root user. If true, the Kubelet will validate the image at runtime to ensure that it does not run as UID 0 (root) and fail to start the container if it does. If unset or false, no such validation will be performed. May also be set in SecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence. |  [optional]
**runAsUser** | **Long** | The UID to run the entrypoint of the container process. Defaults to user specified in image metadata if unspecified. May also be set in SecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence for that container. |  [optional]
**seLinuxOptions** | [**V1SELinuxOptions**](V1SELinuxOptions.md) |  |  [optional]
**supplementalGroups** | **List&lt;Integer&gt;** | A list of groups applied to the first process run in each container, in addition to the container&#39;s primary GID.  If unspecified, no groups will be added to any container. |  [optional]



