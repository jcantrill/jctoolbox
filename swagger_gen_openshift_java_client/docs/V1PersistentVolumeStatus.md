
# V1PersistentVolumeStatus

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**message** | **String** | A human-readable message indicating details about why the volume is in this state. |  [optional]
**phase** | **String** | Phase indicates if a volume is available, bound to a claim, or released by a claim. More info: http://releases.k8s.io/release-1.4/docs/user-guide/persistent-volumes.md#phase |  [optional]
**reason** | **String** | Reason is a brief CamelCase string that describes any failure and is meant for machine parsing and tidy display in the CLI. |  [optional]



