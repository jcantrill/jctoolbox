
# V1SecurityContextConstraints

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allowHostDirVolumePlugin** | **Boolean** | AllowHostDirVolumePlugin determines if the policy allow containers to use the HostDir volume plugin | 
**allowHostIPC** | **Boolean** | AllowHostIPC determines if the policy allows host ipc in the containers. | 
**allowHostNetwork** | **Boolean** | AllowHostNetwork determines if the policy allows the use of HostNetwork in the pod spec. | 
**allowHostPID** | **Boolean** | AllowHostPID determines if the policy allows host pid in the containers. | 
**allowHostPorts** | **Boolean** | AllowHostPorts determines if the policy allows host ports in the containers. | 
**allowPrivilegedContainer** | **Boolean** | AllowPrivilegedContainer determines if a container can request to be run as privileged. | 
**allowedCapabilities** | [**List&lt;V1Capability&gt;**](V1Capability.md) | AllowedCapabilities is a list of capabilities that can be requested to add to the container. Capabilities in this field maybe added at the pod author&#39;s discretion. You must not list a capability in both AllowedCapabilities and RequiredDropCapabilities. | 
**apiVersion** | **String** | APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: http://releases.k8s.io/release-1.4/docs/devel/api-conventions.md#resources |  [optional]
**defaultAddCapabilities** | [**List&lt;V1Capability&gt;**](V1Capability.md) | DefaultAddCapabilities is the default set of capabilities that will be added to the container unless the pod spec specifically drops the capability.  You may not list a capabiility in both DefaultAddCapabilities and RequiredDropCapabilities. | 
**fsGroup** | [**V1FSGroupStrategyOptions**](V1FSGroupStrategyOptions.md) |  |  [optional]
**groups** | **List&lt;String&gt;** | The groups that have permission to use this security context constraints |  [optional]
**kind** | **String** | Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: http://releases.k8s.io/release-1.4/docs/devel/api-conventions.md#types-kinds |  [optional]
**metadata** | [**V1ObjectMeta**](V1ObjectMeta.md) |  |  [optional]
**priority** | **Integer** | Priority influences the sort order of SCCs when evaluating which SCCs to try first for a given pod request based on access in the Users and Groups fields.  The higher the int, the higher priority.  If scores for multiple SCCs are equal they will be sorted by name. | 
**readOnlyRootFilesystem** | **Boolean** | ReadOnlyRootFilesystem when set to true will force containers to run with a read only root file system.  If the container specifically requests to run with a non-read only root file system the SCC should deny the pod. If set to false the container may run with a read only root file system if it wishes but it will not be forced to. | 
**requiredDropCapabilities** | [**List&lt;V1Capability&gt;**](V1Capability.md) | RequiredDropCapabilities are the capabilities that will be dropped from the container.  These are required to be dropped and cannot be added. | 
**runAsUser** | [**V1RunAsUserStrategyOptions**](V1RunAsUserStrategyOptions.md) |  |  [optional]
**seLinuxContext** | [**V1SELinuxContextStrategyOptions**](V1SELinuxContextStrategyOptions.md) |  |  [optional]
**seccompProfiles** | **List&lt;String&gt;** | SeccompProfiles lists the allowed profiles that may be set for the pod or container&#39;s seccomp annotations.  An unset (nil) or empty value means that no profiles may be specifid by the pod or container. The wildcard &#39;*&#39; may be used to allow all profiles.  When used to generate a value for a pod the first non-wildcard profile will be used as the default. |  [optional]
**supplementalGroups** | [**V1SupplementalGroupsStrategyOptions**](V1SupplementalGroupsStrategyOptions.md) |  |  [optional]
**users** | **List&lt;String&gt;** | The users who have permissions to use this security context constraints |  [optional]
**volumes** | [**List&lt;V1FSType&gt;**](V1FSType.md) | Volumes is a white list of allowed volume plugins.  FSType corresponds directly with the field names of a VolumeSource (azureFile, configMap, emptyDir).  To allow all volumes you may use &#39;*&#39;. | 



