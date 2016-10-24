
# V1BuildSource

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**binary** | [**V1BinaryBuildSource**](V1BinaryBuildSource.md) |  |  [optional]
**contextDir** | **String** | contextDir specifies the sub-directory where the source code for the application exists. This allows to have buildable sources in directory other than root of repository. |  [optional]
**dockerfile** | **String** | dockerfile is the raw contents of a Dockerfile which should be built. When this option is specified, the FROM may be modified based on your strategy base image and additional ENV stanzas from your strategy environment will be added after the FROM, but before the rest of your Dockerfile stanzas. The Dockerfile source type may be used with other options like git - in those cases the Git repo will have any innate Dockerfile replaced in the context dir. |  [optional]
**git** | [**V1GitBuildSource**](V1GitBuildSource.md) |  |  [optional]
**images** | [**List&lt;V1ImageSource&gt;**](V1ImageSource.md) | images describes a set of images to be used to provide source for the build |  [optional]
**secrets** | [**List&lt;V1SecretBuildSource&gt;**](V1SecretBuildSource.md) | secrets represents a list of secrets and their destinations that will be used only for the build. |  [optional]
**sourceSecret** | [**V1LocalObjectReference**](V1LocalObjectReference.md) |  |  [optional]
**type** | **String** | type of build input to accept | 



