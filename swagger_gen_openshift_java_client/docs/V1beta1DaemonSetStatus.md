
# V1beta1DaemonSetStatus

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**currentNumberScheduled** | **Integer** | CurrentNumberScheduled is the number of nodes that are running at least 1 daemon pod and are supposed to run the daemon pod. More info: http://releases.k8s.io/release-1.4/docs/admin/daemons.md | 
**desiredNumberScheduled** | **Integer** | DesiredNumberScheduled is the total number of nodes that should be running the daemon pod (including nodes correctly running the daemon pod). More info: http://releases.k8s.io/release-1.4/docs/admin/daemons.md | 
**numberMisscheduled** | **Integer** | NumberMisscheduled is the number of nodes that are running the daemon pod, but are not supposed to run the daemon pod. More info: http://releases.k8s.io/release-1.4/docs/admin/daemons.md | 



