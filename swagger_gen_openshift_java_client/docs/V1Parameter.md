
# V1Parameter

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **String** | Description of a parameter. Optional. |  [optional]
**displayName** | **String** | Optional: The name that will show in UI instead of parameter &#39;Name&#39; |  [optional]
**from** | **String** | From is an input value for the generator. Optional. |  [optional]
**generate** | **String** | generate specifies the generator to be used to generate random string from an input value specified by From field. The result string is stored into Value field. If empty, no generator is being used, leaving the result Value untouched. Optional.  The only supported generator is \&quot;expression\&quot;, which accepts a \&quot;from\&quot; value in the form of a simple regular expression containing the range expression \&quot;[a-zA-Z0-9]\&quot;, and the length expression \&quot;a{length}\&quot;.  Examples:  from             | value |  [optional]
**name** | **String** | Name must be set and it can be referenced in Template Items using ${PARAMETER_NAME}. Required. | 
**required** | **Boolean** | Optional: Indicates the parameter must have a value.  Defaults to false. |  [optional]
**value** | **String** | Value holds the Parameter data. If specified, the generator will be ignored. The value replaces all occurrences of the Parameter ${Name} expression during the Template to Config transformation. Optional. |  [optional]



