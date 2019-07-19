# Log Generator
This provides a simple image that will generate a consistent log stream of messages based upon
`MSG_SIZE` and `MSG_PER_SEC`.  The project includes a template to create the following
resources:

* DeploymentConfig
* ImageStream
* BuildConfig

General use case is to create this application in N number of namespaces to create
random logs.

## Building the image

```
oc process -f log-generator-build.yml | oc apply -n openshift -f -
oc -n openshift start-build log-generator
```
alternatively to build:
```
docker build -t 172.30.1.1:5000/openshift/log-generator:latest .
docker login -u $ADMIN -p $(oc whoami -t) 172.30.1.1:5000
docker push 172.30.1.1:5000/openshift/log-generator:latest 
```
## Deploying the Log Generator template
```
oc -n openshift create -f log-generator-template.yml
```
## Deploying Application Template
```
oc -n openshift create -f log-generator-template.yml
```
## Deploying Application to a Namespace
```
# oc -n $NAMESPACE new-app --template=openshift/log-generator
```
