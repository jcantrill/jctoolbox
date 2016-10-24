
# V1RunAsUserStrategyOptions

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | Type is the strategy that will dictate what RunAsUser is used in the SecurityContext. |  [optional]
**uid** | **Long** | UID is the user id that containers must run as.  Required for the MustRunAs strategy if not using namespace/service account allocated uids. |  [optional]
**uidRangeMax** | **Long** | UIDRangeMax defines the max value for a strategy that allocates by range. |  [optional]
**uidRangeMin** | **Long** | UIDRangeMin defines the min value for a strategy that allocates by range. |  [optional]



