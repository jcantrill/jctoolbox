
# V1TLSConfig

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**caCertificate** | **String** | caCertificate provides the cert authority certificate contents |  [optional]
**certificate** | **String** | certificate provides certificate contents |  [optional]
**destinationCACertificate** | **String** | destinationCACertificate provides the contents of the ca certificate of the final destination.  When using reencrypt termination this file should be provided in order to have routers use it for health checks on the secure connection |  [optional]
**insecureEdgeTerminationPolicy** | **String** | insecureEdgeTerminationPolicy indicates the desired behavior for insecure connections to a route. While each router may make its own decisions on which ports to expose, this is normally port 80.  * Allow - traffic is sent to the server on the insecure port (default) * Disable - no traffic is allowed on the insecure port. * Redirect - clients are redirected to the secure port. |  [optional]
**key** | **String** | key provides key file contents |  [optional]
**termination** | **String** | termination indicates termination type. | 



