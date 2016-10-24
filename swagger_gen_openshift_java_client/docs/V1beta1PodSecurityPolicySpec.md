
# V1beta1PodSecurityPolicySpec

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allowedCapabilities** | [**List&lt;V1Capability&gt;**](V1Capability.md) | AllowedCapabilities is a list of capabilities that can be requested to add to the container. Capabilities in this field may be added at the pod author&#39;s discretion. You must not list a capability in both AllowedCapabilities and RequiredDropCapabilities. |  [optional]
**defaultAddCapabilities** | [**List&lt;V1Capability&gt;**](V1Capability.md) | DefaultAddCapabilities is the default set of capabilities that will be added to the container unless the pod spec specifically drops the capability.  You may not list a capabiility in both DefaultAddCapabilities and RequiredDropCapabilities. |  [optional]
**fsGroup** | [**V1beta1FSGroupStrategyOptions**](V1beta1FSGroupStrategyOptions.md) |  | 
**hostIPC** | **Boolean** | hostIPC determines if the policy allows the use of HostIPC in the pod spec. |  [optional]
**hostNetwork** | **Boolean** | hostNetwork determines if the policy allows the use of HostNetwork in the pod spec. |  [optional]
**hostPID** | **Boolean** | hostPID determines if the policy allows the use of HostPID in the pod spec. |  [optional]
**hostPorts** | [**List&lt;V1beta1HostPortRange&gt;**](V1beta1HostPortRange.md) | hostPorts determines which host port ranges are allowed to be exposed. |  [optional]
**privileged** | **Boolean** | privileged determines if a pod can request to be run as privileged. |  [optional]
**readOnlyRootFilesystem** | **Boolean** | ReadOnlyRootFilesystem when set to true will force containers to run with a read only root file system.  If the container specifically requests to run with a non-read only root file system the PSP should deny the pod. If set to false the container may run with a read only root file system if it wishes but it will not be forced to. |  [optional]
**requiredDropCapabilities** | [**List&lt;V1Capability&gt;**](V1Capability.md) | RequiredDropCapabilities are the capabilities that will be dropped from the container.  These are required to be dropped and cannot be added. |  [optional]
**runAsUser** | [**V1beta1RunAsUserStrategyOptions**](V1beta1RunAsUserStrategyOptions.md) |  | 
**seLinux** | [**V1beta1SELinuxStrategyOptions**](V1beta1SELinuxStrategyOptions.md) |  | 
**supplementalGroups** | [**V1beta1SupplementalGroupsStrategyOptions**](V1beta1SupplementalGroupsStrategyOptions.md) |  | 
**volumes** | [**List&lt;V1beta1FSType&gt;**](V1beta1FSType.md) | volumes is a white list of allowed volume plugins.  Empty indicates that all plugins may be used. |  [optional]



