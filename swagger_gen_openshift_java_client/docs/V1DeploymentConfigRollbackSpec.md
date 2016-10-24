
# V1DeploymentConfigRollbackSpec

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**from** | [**V1ObjectReference**](V1ObjectReference.md) |  | 
**includeReplicationMeta** | **Boolean** | IncludeReplicationMeta specifies whether to include the replica count and selector. | 
**includeStrategy** | **Boolean** | IncludeStrategy specifies whether to include the deployment Strategy. | 
**includeTemplate** | **Boolean** | IncludeTemplate specifies whether to include the PodTemplateSpec. | 
**includeTriggers** | **Boolean** | IncludeTriggers specifies whether to include config Triggers. | 
**revision** | **Long** | Revision to rollback to. If set to 0, rollback to the last revision. |  [optional]



