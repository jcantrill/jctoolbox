
# V1BuildStatus

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cancelled** | **Boolean** | cancelled describes if a cancel event was triggered for the build. |  [optional]
**completionTimestamp** | **String** | completionTimestamp is a timestamp representing the server time when this Build was finished, whether that build failed or succeeded.  It reflects the time at which the Pod running the Build terminated. It is represented in RFC3339 form and is in UTC. |  [optional]
**config** | [**V1ObjectReference**](V1ObjectReference.md) |  |  [optional]
**duration** | [**TimeDuration**](TimeDuration.md) |  |  [optional]
**message** | **String** | message is a human-readable message indicating details about why the build has this status. |  [optional]
**outputDockerImageReference** | **String** | outputDockerImageReference contains a reference to the Docker image that will be built by this build. Its value is computed from Build.Spec.Output.To, and should include the registry address, so that it can be used to push and pull the image. |  [optional]
**phase** | **String** | phase is the point in the build lifecycle. | 
**reason** | **String** | reason is a brief CamelCase string that describes any failure and is meant for machine parsing and tidy display in the CLI. |  [optional]
**startTimestamp** | **String** | startTimestamp is a timestamp representing the server time when this Build started running in a Pod. It is represented in RFC3339 form and is in UTC. |  [optional]



