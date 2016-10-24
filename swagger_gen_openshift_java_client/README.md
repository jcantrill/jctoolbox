# swagger-java-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.swagger</groupId>
    <artifactId>swagger-java-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/swagger-java-client-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import com.openshift.restclient.*;
import com.openshift.restclient.auth.*;
import com.openshift.restclient.model.*;
import com.openshift.restclient.api.DefaultApi;

import java.io.File;
import java.util.*;

public class DefaultApiExample {

    public static void main(String[] args) {
        
        DefaultApi apiInstance = new DefaultApi();
        try {
            apiInstance.apiGet();
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#apiGet");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://localhost*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DefaultApi* | [**apiGet**](docs/DefaultApi.md#apiGet) | **GET** /api/ | 
*DefaultApi* | [**apiV1Get**](docs/DefaultApi.md#apiV1Get) | **GET** /api/v1/ | 
*DefaultApi* | [**apiV1NamespacesNamespaceReplicationcontrollersNameScaleGet**](docs/DefaultApi.md#apiV1NamespacesNamespaceReplicationcontrollersNameScaleGet) | **GET** /api/v1/namespaces/{namespace}/replicationcontrollers/{name}/scale | 
*DefaultApi* | [**apiV1NamespacesNamespaceReplicationcontrollersNameScalePatch**](docs/DefaultApi.md#apiV1NamespacesNamespaceReplicationcontrollersNameScalePatch) | **PATCH** /api/v1/namespaces/{namespace}/replicationcontrollers/{name}/scale | 
*DefaultApi* | [**apiV1NamespacesNamespaceReplicationcontrollersNameScalePut**](docs/DefaultApi.md#apiV1NamespacesNamespaceReplicationcontrollersNameScalePut) | **PUT** /api/v1/namespaces/{namespace}/replicationcontrollers/{name}/scale | 
*DefaultApi* | [**apisAppsGet**](docs/DefaultApi.md#apisAppsGet) | **GET** /apis/apps/ | 
*DefaultApi* | [**apisAppsV1alpha1Get**](docs/DefaultApi.md#apisAppsV1alpha1Get) | **GET** /apis/apps/v1alpha1/ | 
*DefaultApi* | [**apisAuthenticationK8sIoGet**](docs/DefaultApi.md#apisAuthenticationK8sIoGet) | **GET** /apis/authentication.k8s.io/ | 
*DefaultApi* | [**apisAuthenticationK8sIoV1beta1Get**](docs/DefaultApi.md#apisAuthenticationK8sIoV1beta1Get) | **GET** /apis/authentication.k8s.io/v1beta1/ | 
*DefaultApi* | [**apisAutoscalingGet**](docs/DefaultApi.md#apisAutoscalingGet) | **GET** /apis/autoscaling/ | 
*DefaultApi* | [**apisAutoscalingV1Get**](docs/DefaultApi.md#apisAutoscalingV1Get) | **GET** /apis/autoscaling/v1/ | 
*DefaultApi* | [**apisAutoscalingV1HorizontalpodautoscalersGet**](docs/DefaultApi.md#apisAutoscalingV1HorizontalpodautoscalersGet) | **GET** /apis/autoscaling/v1/horizontalpodautoscalers | 
*DefaultApi* | [**apisAutoscalingV1HorizontalpodautoscalersPost**](docs/DefaultApi.md#apisAutoscalingV1HorizontalpodautoscalersPost) | **POST** /apis/autoscaling/v1/horizontalpodautoscalers | 
*DefaultApi* | [**apisAutoscalingV1NamespacesNamespaceHorizontalpodautoscalersDelete**](docs/DefaultApi.md#apisAutoscalingV1NamespacesNamespaceHorizontalpodautoscalersDelete) | **DELETE** /apis/autoscaling/v1/namespaces/{namespace}/horizontalpodautoscalers | 
*DefaultApi* | [**apisAutoscalingV1NamespacesNamespaceHorizontalpodautoscalersGet**](docs/DefaultApi.md#apisAutoscalingV1NamespacesNamespaceHorizontalpodautoscalersGet) | **GET** /apis/autoscaling/v1/namespaces/{namespace}/horizontalpodautoscalers | 
*DefaultApi* | [**apisAutoscalingV1NamespacesNamespaceHorizontalpodautoscalersNameDelete**](docs/DefaultApi.md#apisAutoscalingV1NamespacesNamespaceHorizontalpodautoscalersNameDelete) | **DELETE** /apis/autoscaling/v1/namespaces/{namespace}/horizontalpodautoscalers/{name} | 
*DefaultApi* | [**apisAutoscalingV1NamespacesNamespaceHorizontalpodautoscalersNameGet**](docs/DefaultApi.md#apisAutoscalingV1NamespacesNamespaceHorizontalpodautoscalersNameGet) | **GET** /apis/autoscaling/v1/namespaces/{namespace}/horizontalpodautoscalers/{name} | 
*DefaultApi* | [**apisAutoscalingV1NamespacesNamespaceHorizontalpodautoscalersNamePatch**](docs/DefaultApi.md#apisAutoscalingV1NamespacesNamespaceHorizontalpodautoscalersNamePatch) | **PATCH** /apis/autoscaling/v1/namespaces/{namespace}/horizontalpodautoscalers/{name} | 
*DefaultApi* | [**apisAutoscalingV1NamespacesNamespaceHorizontalpodautoscalersNamePut**](docs/DefaultApi.md#apisAutoscalingV1NamespacesNamespaceHorizontalpodautoscalersNamePut) | **PUT** /apis/autoscaling/v1/namespaces/{namespace}/horizontalpodautoscalers/{name} | 
*DefaultApi* | [**apisAutoscalingV1NamespacesNamespaceHorizontalpodautoscalersNameStatusGet**](docs/DefaultApi.md#apisAutoscalingV1NamespacesNamespaceHorizontalpodautoscalersNameStatusGet) | **GET** /apis/autoscaling/v1/namespaces/{namespace}/horizontalpodautoscalers/{name}/status | 
*DefaultApi* | [**apisAutoscalingV1NamespacesNamespaceHorizontalpodautoscalersNameStatusPatch**](docs/DefaultApi.md#apisAutoscalingV1NamespacesNamespaceHorizontalpodautoscalersNameStatusPatch) | **PATCH** /apis/autoscaling/v1/namespaces/{namespace}/horizontalpodautoscalers/{name}/status | 
*DefaultApi* | [**apisAutoscalingV1NamespacesNamespaceHorizontalpodautoscalersNameStatusPut**](docs/DefaultApi.md#apisAutoscalingV1NamespacesNamespaceHorizontalpodautoscalersNameStatusPut) | **PUT** /apis/autoscaling/v1/namespaces/{namespace}/horizontalpodautoscalers/{name}/status | 
*DefaultApi* | [**apisAutoscalingV1NamespacesNamespaceHorizontalpodautoscalersPost**](docs/DefaultApi.md#apisAutoscalingV1NamespacesNamespaceHorizontalpodautoscalersPost) | **POST** /apis/autoscaling/v1/namespaces/{namespace}/horizontalpodautoscalers | 
*DefaultApi* | [**apisAutoscalingV1WatchHorizontalpodautoscalersGet**](docs/DefaultApi.md#apisAutoscalingV1WatchHorizontalpodautoscalersGet) | **GET** /apis/autoscaling/v1/watch/horizontalpodautoscalers | 
*DefaultApi* | [**apisAutoscalingV1WatchNamespacesNamespaceHorizontalpodautoscalersGet**](docs/DefaultApi.md#apisAutoscalingV1WatchNamespacesNamespaceHorizontalpodautoscalersGet) | **GET** /apis/autoscaling/v1/watch/namespaces/{namespace}/horizontalpodautoscalers | 
*DefaultApi* | [**apisAutoscalingV1WatchNamespacesNamespaceHorizontalpodautoscalersNameGet**](docs/DefaultApi.md#apisAutoscalingV1WatchNamespacesNamespaceHorizontalpodautoscalersNameGet) | **GET** /apis/autoscaling/v1/watch/namespaces/{namespace}/horizontalpodautoscalers/{name} | 
*DefaultApi* | [**apisBatchGet**](docs/DefaultApi.md#apisBatchGet) | **GET** /apis/batch/ | 
*DefaultApi* | [**apisBatchV1Get**](docs/DefaultApi.md#apisBatchV1Get) | **GET** /apis/batch/v1/ | 
*DefaultApi* | [**apisBatchV1JobsGet**](docs/DefaultApi.md#apisBatchV1JobsGet) | **GET** /apis/batch/v1/jobs | 
*DefaultApi* | [**apisBatchV1JobsPost**](docs/DefaultApi.md#apisBatchV1JobsPost) | **POST** /apis/batch/v1/jobs | 
*DefaultApi* | [**apisBatchV1NamespacesNamespaceJobsDelete**](docs/DefaultApi.md#apisBatchV1NamespacesNamespaceJobsDelete) | **DELETE** /apis/batch/v1/namespaces/{namespace}/jobs | 
*DefaultApi* | [**apisBatchV1NamespacesNamespaceJobsGet**](docs/DefaultApi.md#apisBatchV1NamespacesNamespaceJobsGet) | **GET** /apis/batch/v1/namespaces/{namespace}/jobs | 
*DefaultApi* | [**apisBatchV1NamespacesNamespaceJobsNameDelete**](docs/DefaultApi.md#apisBatchV1NamespacesNamespaceJobsNameDelete) | **DELETE** /apis/batch/v1/namespaces/{namespace}/jobs/{name} | 
*DefaultApi* | [**apisBatchV1NamespacesNamespaceJobsNameGet**](docs/DefaultApi.md#apisBatchV1NamespacesNamespaceJobsNameGet) | **GET** /apis/batch/v1/namespaces/{namespace}/jobs/{name} | 
*DefaultApi* | [**apisBatchV1NamespacesNamespaceJobsNamePatch**](docs/DefaultApi.md#apisBatchV1NamespacesNamespaceJobsNamePatch) | **PATCH** /apis/batch/v1/namespaces/{namespace}/jobs/{name} | 
*DefaultApi* | [**apisBatchV1NamespacesNamespaceJobsNamePut**](docs/DefaultApi.md#apisBatchV1NamespacesNamespaceJobsNamePut) | **PUT** /apis/batch/v1/namespaces/{namespace}/jobs/{name} | 
*DefaultApi* | [**apisBatchV1NamespacesNamespaceJobsNameStatusGet**](docs/DefaultApi.md#apisBatchV1NamespacesNamespaceJobsNameStatusGet) | **GET** /apis/batch/v1/namespaces/{namespace}/jobs/{name}/status | 
*DefaultApi* | [**apisBatchV1NamespacesNamespaceJobsNameStatusPatch**](docs/DefaultApi.md#apisBatchV1NamespacesNamespaceJobsNameStatusPatch) | **PATCH** /apis/batch/v1/namespaces/{namespace}/jobs/{name}/status | 
*DefaultApi* | [**apisBatchV1NamespacesNamespaceJobsNameStatusPut**](docs/DefaultApi.md#apisBatchV1NamespacesNamespaceJobsNameStatusPut) | **PUT** /apis/batch/v1/namespaces/{namespace}/jobs/{name}/status | 
*DefaultApi* | [**apisBatchV1NamespacesNamespaceJobsPost**](docs/DefaultApi.md#apisBatchV1NamespacesNamespaceJobsPost) | **POST** /apis/batch/v1/namespaces/{namespace}/jobs | 
*DefaultApi* | [**apisBatchV1WatchJobsGet**](docs/DefaultApi.md#apisBatchV1WatchJobsGet) | **GET** /apis/batch/v1/watch/jobs | 
*DefaultApi* | [**apisBatchV1WatchNamespacesNamespaceJobsGet**](docs/DefaultApi.md#apisBatchV1WatchNamespacesNamespaceJobsGet) | **GET** /apis/batch/v1/watch/namespaces/{namespace}/jobs | 
*DefaultApi* | [**apisBatchV1WatchNamespacesNamespaceJobsNameGet**](docs/DefaultApi.md#apisBatchV1WatchNamespacesNamespaceJobsNameGet) | **GET** /apis/batch/v1/watch/namespaces/{namespace}/jobs/{name} | 
*DefaultApi* | [**apisBatchV2alpha1Get**](docs/DefaultApi.md#apisBatchV2alpha1Get) | **GET** /apis/batch/v2alpha1/ | 
*DefaultApi* | [**apisBatchV2alpha1JobsGet**](docs/DefaultApi.md#apisBatchV2alpha1JobsGet) | **GET** /apis/batch/v2alpha1/jobs | 
*DefaultApi* | [**apisBatchV2alpha1JobsPost**](docs/DefaultApi.md#apisBatchV2alpha1JobsPost) | **POST** /apis/batch/v2alpha1/jobs | 
*DefaultApi* | [**apisBatchV2alpha1NamespacesNamespaceJobsDelete**](docs/DefaultApi.md#apisBatchV2alpha1NamespacesNamespaceJobsDelete) | **DELETE** /apis/batch/v2alpha1/namespaces/{namespace}/jobs | 
*DefaultApi* | [**apisBatchV2alpha1NamespacesNamespaceJobsGet**](docs/DefaultApi.md#apisBatchV2alpha1NamespacesNamespaceJobsGet) | **GET** /apis/batch/v2alpha1/namespaces/{namespace}/jobs | 
*DefaultApi* | [**apisBatchV2alpha1NamespacesNamespaceJobsNameDelete**](docs/DefaultApi.md#apisBatchV2alpha1NamespacesNamespaceJobsNameDelete) | **DELETE** /apis/batch/v2alpha1/namespaces/{namespace}/jobs/{name} | 
*DefaultApi* | [**apisBatchV2alpha1NamespacesNamespaceJobsNameGet**](docs/DefaultApi.md#apisBatchV2alpha1NamespacesNamespaceJobsNameGet) | **GET** /apis/batch/v2alpha1/namespaces/{namespace}/jobs/{name} | 
*DefaultApi* | [**apisBatchV2alpha1NamespacesNamespaceJobsNamePatch**](docs/DefaultApi.md#apisBatchV2alpha1NamespacesNamespaceJobsNamePatch) | **PATCH** /apis/batch/v2alpha1/namespaces/{namespace}/jobs/{name} | 
*DefaultApi* | [**apisBatchV2alpha1NamespacesNamespaceJobsNamePut**](docs/DefaultApi.md#apisBatchV2alpha1NamespacesNamespaceJobsNamePut) | **PUT** /apis/batch/v2alpha1/namespaces/{namespace}/jobs/{name} | 
*DefaultApi* | [**apisBatchV2alpha1NamespacesNamespaceJobsNameStatusGet**](docs/DefaultApi.md#apisBatchV2alpha1NamespacesNamespaceJobsNameStatusGet) | **GET** /apis/batch/v2alpha1/namespaces/{namespace}/jobs/{name}/status | 
*DefaultApi* | [**apisBatchV2alpha1NamespacesNamespaceJobsNameStatusPatch**](docs/DefaultApi.md#apisBatchV2alpha1NamespacesNamespaceJobsNameStatusPatch) | **PATCH** /apis/batch/v2alpha1/namespaces/{namespace}/jobs/{name}/status | 
*DefaultApi* | [**apisBatchV2alpha1NamespacesNamespaceJobsNameStatusPut**](docs/DefaultApi.md#apisBatchV2alpha1NamespacesNamespaceJobsNameStatusPut) | **PUT** /apis/batch/v2alpha1/namespaces/{namespace}/jobs/{name}/status | 
*DefaultApi* | [**apisBatchV2alpha1NamespacesNamespaceJobsPost**](docs/DefaultApi.md#apisBatchV2alpha1NamespacesNamespaceJobsPost) | **POST** /apis/batch/v2alpha1/namespaces/{namespace}/jobs | 
*DefaultApi* | [**apisBatchV2alpha1WatchJobsGet**](docs/DefaultApi.md#apisBatchV2alpha1WatchJobsGet) | **GET** /apis/batch/v2alpha1/watch/jobs | 
*DefaultApi* | [**apisBatchV2alpha1WatchNamespacesNamespaceJobsGet**](docs/DefaultApi.md#apisBatchV2alpha1WatchNamespacesNamespaceJobsGet) | **GET** /apis/batch/v2alpha1/watch/namespaces/{namespace}/jobs | 
*DefaultApi* | [**apisBatchV2alpha1WatchNamespacesNamespaceJobsNameGet**](docs/DefaultApi.md#apisBatchV2alpha1WatchNamespacesNamespaceJobsNameGet) | **GET** /apis/batch/v2alpha1/watch/namespaces/{namespace}/jobs/{name} | 
*DefaultApi* | [**apisCertificatesK8sIoGet**](docs/DefaultApi.md#apisCertificatesK8sIoGet) | **GET** /apis/certificates.k8s.io/ | 
*DefaultApi* | [**apisCertificatesK8sIoV1alpha1Get**](docs/DefaultApi.md#apisCertificatesK8sIoV1alpha1Get) | **GET** /apis/certificates.k8s.io/v1alpha1/ | 
*DefaultApi* | [**apisExtensionsGet**](docs/DefaultApi.md#apisExtensionsGet) | **GET** /apis/extensions/ | 
*DefaultApi* | [**apisExtensionsV1beta1Get**](docs/DefaultApi.md#apisExtensionsV1beta1Get) | **GET** /apis/extensions/v1beta1/ | 
*DefaultApi* | [**apisExtensionsV1beta1HorizontalpodautoscalersGet**](docs/DefaultApi.md#apisExtensionsV1beta1HorizontalpodautoscalersGet) | **GET** /apis/extensions/v1beta1/horizontalpodautoscalers | 
*DefaultApi* | [**apisExtensionsV1beta1HorizontalpodautoscalersPost**](docs/DefaultApi.md#apisExtensionsV1beta1HorizontalpodautoscalersPost) | **POST** /apis/extensions/v1beta1/horizontalpodautoscalers | 
*DefaultApi* | [**apisExtensionsV1beta1JobsGet**](docs/DefaultApi.md#apisExtensionsV1beta1JobsGet) | **GET** /apis/extensions/v1beta1/jobs | 
*DefaultApi* | [**apisExtensionsV1beta1JobsPost**](docs/DefaultApi.md#apisExtensionsV1beta1JobsPost) | **POST** /apis/extensions/v1beta1/jobs | 
*DefaultApi* | [**apisExtensionsV1beta1NamespacesNamespaceDeploymentsNameScaleGet**](docs/DefaultApi.md#apisExtensionsV1beta1NamespacesNamespaceDeploymentsNameScaleGet) | **GET** /apis/extensions/v1beta1/namespaces/{namespace}/deployments/{name}/scale | 
*DefaultApi* | [**apisExtensionsV1beta1NamespacesNamespaceDeploymentsNameScalePatch**](docs/DefaultApi.md#apisExtensionsV1beta1NamespacesNamespaceDeploymentsNameScalePatch) | **PATCH** /apis/extensions/v1beta1/namespaces/{namespace}/deployments/{name}/scale | 
*DefaultApi* | [**apisExtensionsV1beta1NamespacesNamespaceDeploymentsNameScalePut**](docs/DefaultApi.md#apisExtensionsV1beta1NamespacesNamespaceDeploymentsNameScalePut) | **PUT** /apis/extensions/v1beta1/namespaces/{namespace}/deployments/{name}/scale | 
*DefaultApi* | [**apisExtensionsV1beta1NamespacesNamespaceHorizontalpodautoscalersDelete**](docs/DefaultApi.md#apisExtensionsV1beta1NamespacesNamespaceHorizontalpodautoscalersDelete) | **DELETE** /apis/extensions/v1beta1/namespaces/{namespace}/horizontalpodautoscalers | 
*DefaultApi* | [**apisExtensionsV1beta1NamespacesNamespaceHorizontalpodautoscalersGet**](docs/DefaultApi.md#apisExtensionsV1beta1NamespacesNamespaceHorizontalpodautoscalersGet) | **GET** /apis/extensions/v1beta1/namespaces/{namespace}/horizontalpodautoscalers | 
*DefaultApi* | [**apisExtensionsV1beta1NamespacesNamespaceHorizontalpodautoscalersNameDelete**](docs/DefaultApi.md#apisExtensionsV1beta1NamespacesNamespaceHorizontalpodautoscalersNameDelete) | **DELETE** /apis/extensions/v1beta1/namespaces/{namespace}/horizontalpodautoscalers/{name} | 
*DefaultApi* | [**apisExtensionsV1beta1NamespacesNamespaceHorizontalpodautoscalersNameGet**](docs/DefaultApi.md#apisExtensionsV1beta1NamespacesNamespaceHorizontalpodautoscalersNameGet) | **GET** /apis/extensions/v1beta1/namespaces/{namespace}/horizontalpodautoscalers/{name} | 
*DefaultApi* | [**apisExtensionsV1beta1NamespacesNamespaceHorizontalpodautoscalersNamePatch**](docs/DefaultApi.md#apisExtensionsV1beta1NamespacesNamespaceHorizontalpodautoscalersNamePatch) | **PATCH** /apis/extensions/v1beta1/namespaces/{namespace}/horizontalpodautoscalers/{name} | 
*DefaultApi* | [**apisExtensionsV1beta1NamespacesNamespaceHorizontalpodautoscalersNamePut**](docs/DefaultApi.md#apisExtensionsV1beta1NamespacesNamespaceHorizontalpodautoscalersNamePut) | **PUT** /apis/extensions/v1beta1/namespaces/{namespace}/horizontalpodautoscalers/{name} | 
*DefaultApi* | [**apisExtensionsV1beta1NamespacesNamespaceHorizontalpodautoscalersNameStatusGet**](docs/DefaultApi.md#apisExtensionsV1beta1NamespacesNamespaceHorizontalpodautoscalersNameStatusGet) | **GET** /apis/extensions/v1beta1/namespaces/{namespace}/horizontalpodautoscalers/{name}/status | 
*DefaultApi* | [**apisExtensionsV1beta1NamespacesNamespaceHorizontalpodautoscalersNameStatusPatch**](docs/DefaultApi.md#apisExtensionsV1beta1NamespacesNamespaceHorizontalpodautoscalersNameStatusPatch) | **PATCH** /apis/extensions/v1beta1/namespaces/{namespace}/horizontalpodautoscalers/{name}/status | 
*DefaultApi* | [**apisExtensionsV1beta1NamespacesNamespaceHorizontalpodautoscalersNameStatusPut**](docs/DefaultApi.md#apisExtensionsV1beta1NamespacesNamespaceHorizontalpodautoscalersNameStatusPut) | **PUT** /apis/extensions/v1beta1/namespaces/{namespace}/horizontalpodautoscalers/{name}/status | 
*DefaultApi* | [**apisExtensionsV1beta1NamespacesNamespaceHorizontalpodautoscalersPost**](docs/DefaultApi.md#apisExtensionsV1beta1NamespacesNamespaceHorizontalpodautoscalersPost) | **POST** /apis/extensions/v1beta1/namespaces/{namespace}/horizontalpodautoscalers | 
*DefaultApi* | [**apisExtensionsV1beta1NamespacesNamespaceJobsDelete**](docs/DefaultApi.md#apisExtensionsV1beta1NamespacesNamespaceJobsDelete) | **DELETE** /apis/extensions/v1beta1/namespaces/{namespace}/jobs | 
*DefaultApi* | [**apisExtensionsV1beta1NamespacesNamespaceJobsGet**](docs/DefaultApi.md#apisExtensionsV1beta1NamespacesNamespaceJobsGet) | **GET** /apis/extensions/v1beta1/namespaces/{namespace}/jobs | 
*DefaultApi* | [**apisExtensionsV1beta1NamespacesNamespaceJobsNameDelete**](docs/DefaultApi.md#apisExtensionsV1beta1NamespacesNamespaceJobsNameDelete) | **DELETE** /apis/extensions/v1beta1/namespaces/{namespace}/jobs/{name} | 
*DefaultApi* | [**apisExtensionsV1beta1NamespacesNamespaceJobsNameGet**](docs/DefaultApi.md#apisExtensionsV1beta1NamespacesNamespaceJobsNameGet) | **GET** /apis/extensions/v1beta1/namespaces/{namespace}/jobs/{name} | 
*DefaultApi* | [**apisExtensionsV1beta1NamespacesNamespaceJobsNamePatch**](docs/DefaultApi.md#apisExtensionsV1beta1NamespacesNamespaceJobsNamePatch) | **PATCH** /apis/extensions/v1beta1/namespaces/{namespace}/jobs/{name} | 
*DefaultApi* | [**apisExtensionsV1beta1NamespacesNamespaceJobsNamePut**](docs/DefaultApi.md#apisExtensionsV1beta1NamespacesNamespaceJobsNamePut) | **PUT** /apis/extensions/v1beta1/namespaces/{namespace}/jobs/{name} | 
*DefaultApi* | [**apisExtensionsV1beta1NamespacesNamespaceJobsNameStatusGet**](docs/DefaultApi.md#apisExtensionsV1beta1NamespacesNamespaceJobsNameStatusGet) | **GET** /apis/extensions/v1beta1/namespaces/{namespace}/jobs/{name}/status | 
*DefaultApi* | [**apisExtensionsV1beta1NamespacesNamespaceJobsNameStatusPatch**](docs/DefaultApi.md#apisExtensionsV1beta1NamespacesNamespaceJobsNameStatusPatch) | **PATCH** /apis/extensions/v1beta1/namespaces/{namespace}/jobs/{name}/status | 
*DefaultApi* | [**apisExtensionsV1beta1NamespacesNamespaceJobsNameStatusPut**](docs/DefaultApi.md#apisExtensionsV1beta1NamespacesNamespaceJobsNameStatusPut) | **PUT** /apis/extensions/v1beta1/namespaces/{namespace}/jobs/{name}/status | 
*DefaultApi* | [**apisExtensionsV1beta1NamespacesNamespaceJobsPost**](docs/DefaultApi.md#apisExtensionsV1beta1NamespacesNamespaceJobsPost) | **POST** /apis/extensions/v1beta1/namespaces/{namespace}/jobs | 
*DefaultApi* | [**apisExtensionsV1beta1NamespacesNamespaceReplicasetsNameScaleGet**](docs/DefaultApi.md#apisExtensionsV1beta1NamespacesNamespaceReplicasetsNameScaleGet) | **GET** /apis/extensions/v1beta1/namespaces/{namespace}/replicasets/{name}/scale | 
*DefaultApi* | [**apisExtensionsV1beta1NamespacesNamespaceReplicasetsNameScalePatch**](docs/DefaultApi.md#apisExtensionsV1beta1NamespacesNamespaceReplicasetsNameScalePatch) | **PATCH** /apis/extensions/v1beta1/namespaces/{namespace}/replicasets/{name}/scale | 
*DefaultApi* | [**apisExtensionsV1beta1NamespacesNamespaceReplicasetsNameScalePut**](docs/DefaultApi.md#apisExtensionsV1beta1NamespacesNamespaceReplicasetsNameScalePut) | **PUT** /apis/extensions/v1beta1/namespaces/{namespace}/replicasets/{name}/scale | 
*DefaultApi* | [**apisExtensionsV1beta1NamespacesNamespaceReplicationcontrollersNameScaleGet**](docs/DefaultApi.md#apisExtensionsV1beta1NamespacesNamespaceReplicationcontrollersNameScaleGet) | **GET** /apis/extensions/v1beta1/namespaces/{namespace}/replicationcontrollers/{name}/scale | 
*DefaultApi* | [**apisExtensionsV1beta1NamespacesNamespaceReplicationcontrollersNameScalePatch**](docs/DefaultApi.md#apisExtensionsV1beta1NamespacesNamespaceReplicationcontrollersNameScalePatch) | **PATCH** /apis/extensions/v1beta1/namespaces/{namespace}/replicationcontrollers/{name}/scale | 
*DefaultApi* | [**apisExtensionsV1beta1NamespacesNamespaceReplicationcontrollersNameScalePut**](docs/DefaultApi.md#apisExtensionsV1beta1NamespacesNamespaceReplicationcontrollersNameScalePut) | **PUT** /apis/extensions/v1beta1/namespaces/{namespace}/replicationcontrollers/{name}/scale | 
*DefaultApi* | [**apisExtensionsV1beta1WatchHorizontalpodautoscalersGet**](docs/DefaultApi.md#apisExtensionsV1beta1WatchHorizontalpodautoscalersGet) | **GET** /apis/extensions/v1beta1/watch/horizontalpodautoscalers | 
*DefaultApi* | [**apisExtensionsV1beta1WatchJobsGet**](docs/DefaultApi.md#apisExtensionsV1beta1WatchJobsGet) | **GET** /apis/extensions/v1beta1/watch/jobs | 
*DefaultApi* | [**apisExtensionsV1beta1WatchNamespacesNamespaceHorizontalpodautoscalersGet**](docs/DefaultApi.md#apisExtensionsV1beta1WatchNamespacesNamespaceHorizontalpodautoscalersGet) | **GET** /apis/extensions/v1beta1/watch/namespaces/{namespace}/horizontalpodautoscalers | 
*DefaultApi* | [**apisExtensionsV1beta1WatchNamespacesNamespaceHorizontalpodautoscalersNameGet**](docs/DefaultApi.md#apisExtensionsV1beta1WatchNamespacesNamespaceHorizontalpodautoscalersNameGet) | **GET** /apis/extensions/v1beta1/watch/namespaces/{namespace}/horizontalpodautoscalers/{name} | 
*DefaultApi* | [**apisExtensionsV1beta1WatchNamespacesNamespaceJobsGet**](docs/DefaultApi.md#apisExtensionsV1beta1WatchNamespacesNamespaceJobsGet) | **GET** /apis/extensions/v1beta1/watch/namespaces/{namespace}/jobs | 
*DefaultApi* | [**apisExtensionsV1beta1WatchNamespacesNamespaceJobsNameGet**](docs/DefaultApi.md#apisExtensionsV1beta1WatchNamespacesNamespaceJobsNameGet) | **GET** /apis/extensions/v1beta1/watch/namespaces/{namespace}/jobs/{name} | 
*DefaultApi* | [**apisGet**](docs/DefaultApi.md#apisGet) | **GET** /apis/ | 
*DefaultApi* | [**apisPolicyGet**](docs/DefaultApi.md#apisPolicyGet) | **GET** /apis/policy/ | 
*DefaultApi* | [**apisPolicyV1alpha1Get**](docs/DefaultApi.md#apisPolicyV1alpha1Get) | **GET** /apis/policy/v1alpha1/ | 
*DefaultApi* | [**apisStorageK8sIoGet**](docs/DefaultApi.md#apisStorageK8sIoGet) | **GET** /apis/storage.k8s.io/ | 
*DefaultApi* | [**apisStorageK8sIoV1beta1Get**](docs/DefaultApi.md#apisStorageK8sIoV1beta1Get) | **GET** /apis/storage.k8s.io/v1beta1/ | 
*DefaultApi* | [**connectDeleteNamespacedPodProxy**](docs/DefaultApi.md#connectDeleteNamespacedPodProxy) | **DELETE** /api/v1/namespaces/{namespace}/pods/{name}/proxy | 
*DefaultApi* | [**connectDeleteNamespacedPodProxyWithPath**](docs/DefaultApi.md#connectDeleteNamespacedPodProxyWithPath) | **DELETE** /api/v1/namespaces/{namespace}/pods/{name}/proxy/{path} | 
*DefaultApi* | [**connectDeleteNamespacedServiceProxy**](docs/DefaultApi.md#connectDeleteNamespacedServiceProxy) | **DELETE** /api/v1/namespaces/{namespace}/services/{name}/proxy | 
*DefaultApi* | [**connectDeleteNamespacedServiceProxyWithPath**](docs/DefaultApi.md#connectDeleteNamespacedServiceProxyWithPath) | **DELETE** /api/v1/namespaces/{namespace}/services/{name}/proxy/{path} | 
*DefaultApi* | [**connectDeleteNodeProxy**](docs/DefaultApi.md#connectDeleteNodeProxy) | **DELETE** /api/v1/nodes/{name}/proxy | 
*DefaultApi* | [**connectDeleteNodeProxyWithPath**](docs/DefaultApi.md#connectDeleteNodeProxyWithPath) | **DELETE** /api/v1/nodes/{name}/proxy/{path} | 
*DefaultApi* | [**connectGetNamespacedPodAttach**](docs/DefaultApi.md#connectGetNamespacedPodAttach) | **GET** /api/v1/namespaces/{namespace}/pods/{name}/attach | 
*DefaultApi* | [**connectGetNamespacedPodExec**](docs/DefaultApi.md#connectGetNamespacedPodExec) | **GET** /api/v1/namespaces/{namespace}/pods/{name}/exec | 
*DefaultApi* | [**connectGetNamespacedPodPortforward**](docs/DefaultApi.md#connectGetNamespacedPodPortforward) | **GET** /api/v1/namespaces/{namespace}/pods/{name}/portforward | 
*DefaultApi* | [**connectGetNamespacedPodProxy**](docs/DefaultApi.md#connectGetNamespacedPodProxy) | **GET** /api/v1/namespaces/{namespace}/pods/{name}/proxy | 
*DefaultApi* | [**connectGetNamespacedPodProxyWithPath**](docs/DefaultApi.md#connectGetNamespacedPodProxyWithPath) | **GET** /api/v1/namespaces/{namespace}/pods/{name}/proxy/{path} | 
*DefaultApi* | [**connectGetNamespacedServiceProxy**](docs/DefaultApi.md#connectGetNamespacedServiceProxy) | **GET** /api/v1/namespaces/{namespace}/services/{name}/proxy | 
*DefaultApi* | [**connectGetNamespacedServiceProxyWithPath**](docs/DefaultApi.md#connectGetNamespacedServiceProxyWithPath) | **GET** /api/v1/namespaces/{namespace}/services/{name}/proxy/{path} | 
*DefaultApi* | [**connectGetNodeProxy**](docs/DefaultApi.md#connectGetNodeProxy) | **GET** /api/v1/nodes/{name}/proxy | 
*DefaultApi* | [**connectGetNodeProxyWithPath**](docs/DefaultApi.md#connectGetNodeProxyWithPath) | **GET** /api/v1/nodes/{name}/proxy/{path} | 
*DefaultApi* | [**connectHeadNamespacedPodProxy**](docs/DefaultApi.md#connectHeadNamespacedPodProxy) | **HEAD** /api/v1/namespaces/{namespace}/pods/{name}/proxy | 
*DefaultApi* | [**connectHeadNamespacedPodProxyWithPath**](docs/DefaultApi.md#connectHeadNamespacedPodProxyWithPath) | **HEAD** /api/v1/namespaces/{namespace}/pods/{name}/proxy/{path} | 
*DefaultApi* | [**connectHeadNamespacedServiceProxy**](docs/DefaultApi.md#connectHeadNamespacedServiceProxy) | **HEAD** /api/v1/namespaces/{namespace}/services/{name}/proxy | 
*DefaultApi* | [**connectHeadNamespacedServiceProxyWithPath**](docs/DefaultApi.md#connectHeadNamespacedServiceProxyWithPath) | **HEAD** /api/v1/namespaces/{namespace}/services/{name}/proxy/{path} | 
*DefaultApi* | [**connectHeadNodeProxy**](docs/DefaultApi.md#connectHeadNodeProxy) | **HEAD** /api/v1/nodes/{name}/proxy | 
*DefaultApi* | [**connectHeadNodeProxyWithPath**](docs/DefaultApi.md#connectHeadNodeProxyWithPath) | **HEAD** /api/v1/nodes/{name}/proxy/{path} | 
*DefaultApi* | [**connectOptionsNamespacedPodProxy**](docs/DefaultApi.md#connectOptionsNamespacedPodProxy) | **OPTIONS** /api/v1/namespaces/{namespace}/pods/{name}/proxy | 
*DefaultApi* | [**connectOptionsNamespacedPodProxyWithPath**](docs/DefaultApi.md#connectOptionsNamespacedPodProxyWithPath) | **OPTIONS** /api/v1/namespaces/{namespace}/pods/{name}/proxy/{path} | 
*DefaultApi* | [**connectOptionsNamespacedServiceProxy**](docs/DefaultApi.md#connectOptionsNamespacedServiceProxy) | **OPTIONS** /api/v1/namespaces/{namespace}/services/{name}/proxy | 
*DefaultApi* | [**connectOptionsNamespacedServiceProxyWithPath**](docs/DefaultApi.md#connectOptionsNamespacedServiceProxyWithPath) | **OPTIONS** /api/v1/namespaces/{namespace}/services/{name}/proxy/{path} | 
*DefaultApi* | [**connectOptionsNodeProxy**](docs/DefaultApi.md#connectOptionsNodeProxy) | **OPTIONS** /api/v1/nodes/{name}/proxy | 
*DefaultApi* | [**connectOptionsNodeProxyWithPath**](docs/DefaultApi.md#connectOptionsNodeProxyWithPath) | **OPTIONS** /api/v1/nodes/{name}/proxy/{path} | 
*DefaultApi* | [**connectPostNamespacedBinaryBuildRequestOptionsInstantiatebinary**](docs/DefaultApi.md#connectPostNamespacedBinaryBuildRequestOptionsInstantiatebinary) | **POST** /oapi/v1/namespaces/{namespace}/buildconfigs/{name}/instantiatebinary | 
*DefaultApi* | [**connectPostNamespacedPodAttach**](docs/DefaultApi.md#connectPostNamespacedPodAttach) | **POST** /api/v1/namespaces/{namespace}/pods/{name}/attach | 
*DefaultApi* | [**connectPostNamespacedPodExec**](docs/DefaultApi.md#connectPostNamespacedPodExec) | **POST** /api/v1/namespaces/{namespace}/pods/{name}/exec | 
*DefaultApi* | [**connectPostNamespacedPodPortforward**](docs/DefaultApi.md#connectPostNamespacedPodPortforward) | **POST** /api/v1/namespaces/{namespace}/pods/{name}/portforward | 
*DefaultApi* | [**connectPostNamespacedPodProxy**](docs/DefaultApi.md#connectPostNamespacedPodProxy) | **POST** /api/v1/namespaces/{namespace}/pods/{name}/proxy | 
*DefaultApi* | [**connectPostNamespacedPodProxyWithPath**](docs/DefaultApi.md#connectPostNamespacedPodProxyWithPath) | **POST** /api/v1/namespaces/{namespace}/pods/{name}/proxy/{path} | 
*DefaultApi* | [**connectPostNamespacedServiceProxy**](docs/DefaultApi.md#connectPostNamespacedServiceProxy) | **POST** /api/v1/namespaces/{namespace}/services/{name}/proxy | 
*DefaultApi* | [**connectPostNamespacedServiceProxyWithPath**](docs/DefaultApi.md#connectPostNamespacedServiceProxyWithPath) | **POST** /api/v1/namespaces/{namespace}/services/{name}/proxy/{path} | 
*DefaultApi* | [**connectPostNamespacedStatusWebhooks**](docs/DefaultApi.md#connectPostNamespacedStatusWebhooks) | **POST** /oapi/v1/namespaces/{namespace}/buildconfigs/{name}/webhooks | 
*DefaultApi* | [**connectPostNamespacedStatusWebhooksWithPath**](docs/DefaultApi.md#connectPostNamespacedStatusWebhooksWithPath) | **POST** /oapi/v1/namespaces/{namespace}/buildconfigs/{name}/webhooks/{path} | 
*DefaultApi* | [**connectPostNodeProxy**](docs/DefaultApi.md#connectPostNodeProxy) | **POST** /api/v1/nodes/{name}/proxy | 
*DefaultApi* | [**connectPostNodeProxyWithPath**](docs/DefaultApi.md#connectPostNodeProxyWithPath) | **POST** /api/v1/nodes/{name}/proxy/{path} | 
*DefaultApi* | [**connectPutNamespacedPodProxy**](docs/DefaultApi.md#connectPutNamespacedPodProxy) | **PUT** /api/v1/namespaces/{namespace}/pods/{name}/proxy | 
*DefaultApi* | [**connectPutNamespacedPodProxyWithPath**](docs/DefaultApi.md#connectPutNamespacedPodProxyWithPath) | **PUT** /api/v1/namespaces/{namespace}/pods/{name}/proxy/{path} | 
*DefaultApi* | [**connectPutNamespacedServiceProxy**](docs/DefaultApi.md#connectPutNamespacedServiceProxy) | **PUT** /api/v1/namespaces/{namespace}/services/{name}/proxy | 
*DefaultApi* | [**connectPutNamespacedServiceProxyWithPath**](docs/DefaultApi.md#connectPutNamespacedServiceProxyWithPath) | **PUT** /api/v1/namespaces/{namespace}/services/{name}/proxy/{path} | 
*DefaultApi* | [**connectPutNodeProxy**](docs/DefaultApi.md#connectPutNodeProxy) | **PUT** /api/v1/nodes/{name}/proxy | 
*DefaultApi* | [**connectPutNodeProxyWithPath**](docs/DefaultApi.md#connectPutNodeProxyWithPath) | **PUT** /api/v1/nodes/{name}/proxy/{path} | 
*DefaultApi* | [**createBindingForAllNamespaces**](docs/DefaultApi.md#createBindingForAllNamespaces) | **POST** /api/v1/bindings | 
*DefaultApi* | [**createBuildConfigForAllNamespaces**](docs/DefaultApi.md#createBuildConfigForAllNamespaces) | **POST** /oapi/v1/buildconfigs | 
*DefaultApi* | [**createBuildForAllNamespaces**](docs/DefaultApi.md#createBuildForAllNamespaces) | **POST** /oapi/v1/builds | 
*DefaultApi* | [**createCertificateSigningRequest**](docs/DefaultApi.md#createCertificateSigningRequest) | **POST** /apis/certificates.k8s.io/v1alpha1/certificatesigningrequests | 
*DefaultApi* | [**createClusterNetwork**](docs/DefaultApi.md#createClusterNetwork) | **POST** /oapi/v1/clusternetworks | 
*DefaultApi* | [**createClusterPolicy**](docs/DefaultApi.md#createClusterPolicy) | **POST** /oapi/v1/clusterpolicies | 
*DefaultApi* | [**createClusterPolicyBinding**](docs/DefaultApi.md#createClusterPolicyBinding) | **POST** /oapi/v1/clusterpolicybindings | 
*DefaultApi* | [**createClusterResourceQuota**](docs/DefaultApi.md#createClusterResourceQuota) | **POST** /oapi/v1/clusterresourcequotas | 
*DefaultApi* | [**createClusterRole**](docs/DefaultApi.md#createClusterRole) | **POST** /oapi/v1/clusterroles | 
*DefaultApi* | [**createClusterRoleBinding**](docs/DefaultApi.md#createClusterRoleBinding) | **POST** /oapi/v1/clusterrolebindings | 
*DefaultApi* | [**createConfigMapForAllNamespaces**](docs/DefaultApi.md#createConfigMapForAllNamespaces) | **POST** /api/v1/configmaps | 
*DefaultApi* | [**createDaemonSetForAllNamespaces**](docs/DefaultApi.md#createDaemonSetForAllNamespaces) | **POST** /apis/extensions/v1beta1/daemonsets | 
*DefaultApi* | [**createDeploymentConfigForAllNamespaces**](docs/DefaultApi.md#createDeploymentConfigForAllNamespaces) | **POST** /oapi/v1/deploymentconfigs | 
*DefaultApi* | [**createDeploymentConfigRollbackForAllNamespaces**](docs/DefaultApi.md#createDeploymentConfigRollbackForAllNamespaces) | **POST** /oapi/v1/deploymentconfigrollbacks | 
*DefaultApi* | [**createDeploymentForAllNamespaces**](docs/DefaultApi.md#createDeploymentForAllNamespaces) | **POST** /apis/extensions/v1beta1/deployments | 
*DefaultApi* | [**createEgressNetworkPolicyForAllNamespaces**](docs/DefaultApi.md#createEgressNetworkPolicyForAllNamespaces) | **POST** /oapi/v1/egressnetworkpolicies | 
*DefaultApi* | [**createEndpointsForAllNamespaces**](docs/DefaultApi.md#createEndpointsForAllNamespaces) | **POST** /api/v1/endpoints | 
*DefaultApi* | [**createEventForAllNamespaces**](docs/DefaultApi.md#createEventForAllNamespaces) | **POST** /api/v1/events | 
*DefaultApi* | [**createGroup**](docs/DefaultApi.md#createGroup) | **POST** /oapi/v1/groups | 
*DefaultApi* | [**createHostSubnet**](docs/DefaultApi.md#createHostSubnet) | **POST** /oapi/v1/hostsubnets | 
*DefaultApi* | [**createIdentity**](docs/DefaultApi.md#createIdentity) | **POST** /oapi/v1/identities | 
*DefaultApi* | [**createImage**](docs/DefaultApi.md#createImage) | **POST** /oapi/v1/images | 
*DefaultApi* | [**createImageSignature**](docs/DefaultApi.md#createImageSignature) | **POST** /oapi/v1/imagesignatures | 
*DefaultApi* | [**createImageStreamForAllNamespaces**](docs/DefaultApi.md#createImageStreamForAllNamespaces) | **POST** /oapi/v1/imagestreams | 
*DefaultApi* | [**createImageStreamImportForAllNamespaces**](docs/DefaultApi.md#createImageStreamImportForAllNamespaces) | **POST** /oapi/v1/imagestreamimports | 
*DefaultApi* | [**createImageStreamMappingForAllNamespaces**](docs/DefaultApi.md#createImageStreamMappingForAllNamespaces) | **POST** /oapi/v1/imagestreammappings | 
*DefaultApi* | [**createImageStreamTagForAllNamespaces**](docs/DefaultApi.md#createImageStreamTagForAllNamespaces) | **POST** /oapi/v1/imagestreamtags | 
*DefaultApi* | [**createIngressForAllNamespaces**](docs/DefaultApi.md#createIngressForAllNamespaces) | **POST** /apis/extensions/v1beta1/ingresses | 
*DefaultApi* | [**createLimitRangeForAllNamespaces**](docs/DefaultApi.md#createLimitRangeForAllNamespaces) | **POST** /api/v1/limitranges | 
*DefaultApi* | [**createLocalResourceAccessReviewForAllNamespaces**](docs/DefaultApi.md#createLocalResourceAccessReviewForAllNamespaces) | **POST** /oapi/v1/localresourceaccessreviews | 
*DefaultApi* | [**createLocalSubjectAccessReviewForAllNamespaces**](docs/DefaultApi.md#createLocalSubjectAccessReviewForAllNamespaces) | **POST** /oapi/v1/localsubjectaccessreviews | 
*DefaultApi* | [**createNamespace**](docs/DefaultApi.md#createNamespace) | **POST** /api/v1/namespaces | 
*DefaultApi* | [**createNamespacedBinding**](docs/DefaultApi.md#createNamespacedBinding) | **POST** /api/v1/namespaces/{namespace}/bindings | 
*DefaultApi* | [**createNamespacedBindingBinding**](docs/DefaultApi.md#createNamespacedBindingBinding) | **POST** /api/v1/namespaces/{namespace}/pods/{name}/binding | 
*DefaultApi* | [**createNamespacedBuild**](docs/DefaultApi.md#createNamespacedBuild) | **POST** /oapi/v1/namespaces/{namespace}/builds | 
*DefaultApi* | [**createNamespacedBuildConfig**](docs/DefaultApi.md#createNamespacedBuildConfig) | **POST** /oapi/v1/namespaces/{namespace}/buildconfigs | 
*DefaultApi* | [**createNamespacedBuildRequestClone**](docs/DefaultApi.md#createNamespacedBuildRequestClone) | **POST** /oapi/v1/namespaces/{namespace}/builds/{name}/clone | 
*DefaultApi* | [**createNamespacedBuildRequestInstantiate**](docs/DefaultApi.md#createNamespacedBuildRequestInstantiate) | **POST** /oapi/v1/namespaces/{namespace}/buildconfigs/{name}/instantiate | 
*DefaultApi* | [**createNamespacedConfigMap**](docs/DefaultApi.md#createNamespacedConfigMap) | **POST** /api/v1/namespaces/{namespace}/configmaps | 
*DefaultApi* | [**createNamespacedDaemonSet**](docs/DefaultApi.md#createNamespacedDaemonSet) | **POST** /apis/extensions/v1beta1/namespaces/{namespace}/daemonsets | 
*DefaultApi* | [**createNamespacedDeployment**](docs/DefaultApi.md#createNamespacedDeployment) | **POST** /apis/extensions/v1beta1/namespaces/{namespace}/deployments | 
*DefaultApi* | [**createNamespacedDeploymentConfig**](docs/DefaultApi.md#createNamespacedDeploymentConfig) | **POST** /oapi/v1/namespaces/{namespace}/deploymentconfigs | 
*DefaultApi* | [**createNamespacedDeploymentConfigRollback**](docs/DefaultApi.md#createNamespacedDeploymentConfigRollback) | **POST** /oapi/v1/namespaces/{namespace}/deploymentconfigrollbacks | 
*DefaultApi* | [**createNamespacedDeploymentConfigRollbackRollback**](docs/DefaultApi.md#createNamespacedDeploymentConfigRollbackRollback) | **POST** /oapi/v1/namespaces/{namespace}/deploymentconfigs/{name}/rollback | 
*DefaultApi* | [**createNamespacedDeploymentRollbackRollback**](docs/DefaultApi.md#createNamespacedDeploymentRollbackRollback) | **POST** /apis/extensions/v1beta1/namespaces/{namespace}/deployments/{name}/rollback | 
*DefaultApi* | [**createNamespacedEgressNetworkPolicy**](docs/DefaultApi.md#createNamespacedEgressNetworkPolicy) | **POST** /oapi/v1/namespaces/{namespace}/egressnetworkpolicies | 
*DefaultApi* | [**createNamespacedEndpoints**](docs/DefaultApi.md#createNamespacedEndpoints) | **POST** /api/v1/namespaces/{namespace}/endpoints | 
*DefaultApi* | [**createNamespacedEvent**](docs/DefaultApi.md#createNamespacedEvent) | **POST** /api/v1/namespaces/{namespace}/events | 
*DefaultApi* | [**createNamespacedEvictionEviction**](docs/DefaultApi.md#createNamespacedEvictionEviction) | **POST** /api/v1/namespaces/{namespace}/pods/{name}/eviction | 
*DefaultApi* | [**createNamespacedImageStream**](docs/DefaultApi.md#createNamespacedImageStream) | **POST** /oapi/v1/namespaces/{namespace}/imagestreams | 
*DefaultApi* | [**createNamespacedImageStreamImport**](docs/DefaultApi.md#createNamespacedImageStreamImport) | **POST** /oapi/v1/namespaces/{namespace}/imagestreamimports | 
*DefaultApi* | [**createNamespacedImageStreamMapping**](docs/DefaultApi.md#createNamespacedImageStreamMapping) | **POST** /oapi/v1/namespaces/{namespace}/imagestreammappings | 
*DefaultApi* | [**createNamespacedImageStreamTag**](docs/DefaultApi.md#createNamespacedImageStreamTag) | **POST** /oapi/v1/namespaces/{namespace}/imagestreamtags | 
*DefaultApi* | [**createNamespacedIngress**](docs/DefaultApi.md#createNamespacedIngress) | **POST** /apis/extensions/v1beta1/namespaces/{namespace}/ingresses | 
*DefaultApi* | [**createNamespacedLimitRange**](docs/DefaultApi.md#createNamespacedLimitRange) | **POST** /api/v1/namespaces/{namespace}/limitranges | 
*DefaultApi* | [**createNamespacedLocalResourceAccessReview**](docs/DefaultApi.md#createNamespacedLocalResourceAccessReview) | **POST** /oapi/v1/namespaces/{namespace}/localresourceaccessreviews | 
*DefaultApi* | [**createNamespacedLocalSubjectAccessReview**](docs/DefaultApi.md#createNamespacedLocalSubjectAccessReview) | **POST** /oapi/v1/namespaces/{namespace}/localsubjectaccessreviews | 
*DefaultApi* | [**createNamespacedNetworkPolicy**](docs/DefaultApi.md#createNamespacedNetworkPolicy) | **POST** /apis/extensions/v1beta1/namespaces/{namespace}/networkpolicies | 
*DefaultApi* | [**createNamespacedPersistentVolumeClaim**](docs/DefaultApi.md#createNamespacedPersistentVolumeClaim) | **POST** /api/v1/namespaces/{namespace}/persistentvolumeclaims | 
*DefaultApi* | [**createNamespacedPetSet**](docs/DefaultApi.md#createNamespacedPetSet) | **POST** /apis/apps/v1alpha1/namespaces/{namespace}/petsets | 
*DefaultApi* | [**createNamespacedPod**](docs/DefaultApi.md#createNamespacedPod) | **POST** /api/v1/namespaces/{namespace}/pods | 
*DefaultApi* | [**createNamespacedPodDisruptionBudget**](docs/DefaultApi.md#createNamespacedPodDisruptionBudget) | **POST** /apis/policy/v1alpha1/namespaces/{namespace}/poddisruptionbudgets | 
*DefaultApi* | [**createNamespacedPodSecurityPolicyReview**](docs/DefaultApi.md#createNamespacedPodSecurityPolicyReview) | **POST** /oapi/v1/namespaces/{namespace}/podsecuritypolicyreviews | 
*DefaultApi* | [**createNamespacedPodSecurityPolicySelfSubjectReview**](docs/DefaultApi.md#createNamespacedPodSecurityPolicySelfSubjectReview) | **POST** /oapi/v1/namespaces/{namespace}/podsecuritypolicyselfsubjectreviews | 
*DefaultApi* | [**createNamespacedPodSecurityPolicySubjectReview**](docs/DefaultApi.md#createNamespacedPodSecurityPolicySubjectReview) | **POST** /oapi/v1/namespaces/{namespace}/podsecuritypolicysubjectreviews | 
*DefaultApi* | [**createNamespacedPodTemplate**](docs/DefaultApi.md#createNamespacedPodTemplate) | **POST** /api/v1/namespaces/{namespace}/podtemplates | 
*DefaultApi* | [**createNamespacedPolicy**](docs/DefaultApi.md#createNamespacedPolicy) | **POST** /oapi/v1/namespaces/{namespace}/policies | 
*DefaultApi* | [**createNamespacedPolicyBinding**](docs/DefaultApi.md#createNamespacedPolicyBinding) | **POST** /oapi/v1/namespaces/{namespace}/policybindings | 
*DefaultApi* | [**createNamespacedReplicaSet**](docs/DefaultApi.md#createNamespacedReplicaSet) | **POST** /apis/extensions/v1beta1/namespaces/{namespace}/replicasets | 
*DefaultApi* | [**createNamespacedReplicationController**](docs/DefaultApi.md#createNamespacedReplicationController) | **POST** /api/v1/namespaces/{namespace}/replicationcontrollers | 
*DefaultApi* | [**createNamespacedResourceAccessReview**](docs/DefaultApi.md#createNamespacedResourceAccessReview) | **POST** /oapi/v1/namespaces/{namespace}/resourceaccessreviews | 
*DefaultApi* | [**createNamespacedResourceQuota**](docs/DefaultApi.md#createNamespacedResourceQuota) | **POST** /api/v1/namespaces/{namespace}/resourcequotas | 
*DefaultApi* | [**createNamespacedRole**](docs/DefaultApi.md#createNamespacedRole) | **POST** /oapi/v1/namespaces/{namespace}/roles | 
*DefaultApi* | [**createNamespacedRoleBinding**](docs/DefaultApi.md#createNamespacedRoleBinding) | **POST** /oapi/v1/namespaces/{namespace}/rolebindings | 
*DefaultApi* | [**createNamespacedRoute**](docs/DefaultApi.md#createNamespacedRoute) | **POST** /oapi/v1/namespaces/{namespace}/routes | 
*DefaultApi* | [**createNamespacedScheduledJob**](docs/DefaultApi.md#createNamespacedScheduledJob) | **POST** /apis/batch/v2alpha1/namespaces/{namespace}/scheduledjobs | 
*DefaultApi* | [**createNamespacedSecret**](docs/DefaultApi.md#createNamespacedSecret) | **POST** /api/v1/namespaces/{namespace}/secrets | 
*DefaultApi* | [**createNamespacedSelfSubjectRulesReview**](docs/DefaultApi.md#createNamespacedSelfSubjectRulesReview) | **POST** /oapi/v1/namespaces/{namespace}/selfsubjectrulesreviews | 
*DefaultApi* | [**createNamespacedService**](docs/DefaultApi.md#createNamespacedService) | **POST** /api/v1/namespaces/{namespace}/services | 
*DefaultApi* | [**createNamespacedServiceAccount**](docs/DefaultApi.md#createNamespacedServiceAccount) | **POST** /api/v1/namespaces/{namespace}/serviceaccounts | 
*DefaultApi* | [**createNamespacedSubjectAccessReview**](docs/DefaultApi.md#createNamespacedSubjectAccessReview) | **POST** /oapi/v1/namespaces/{namespace}/subjectaccessreviews | 
*DefaultApi* | [**createNetNamespace**](docs/DefaultApi.md#createNetNamespace) | **POST** /oapi/v1/netnamespaces | 
*DefaultApi* | [**createNetworkPolicyForAllNamespaces**](docs/DefaultApi.md#createNetworkPolicyForAllNamespaces) | **POST** /apis/extensions/v1beta1/networkpolicies | 
*DefaultApi* | [**createNode**](docs/DefaultApi.md#createNode) | **POST** /api/v1/nodes | 
*DefaultApi* | [**createOAuthAccessToken**](docs/DefaultApi.md#createOAuthAccessToken) | **POST** /oapi/v1/oauthaccesstokens | 
*DefaultApi* | [**createOAuthAuthorizeToken**](docs/DefaultApi.md#createOAuthAuthorizeToken) | **POST** /oapi/v1/oauthauthorizetokens | 
*DefaultApi* | [**createOAuthClient**](docs/DefaultApi.md#createOAuthClient) | **POST** /oapi/v1/oauthclients | 
*DefaultApi* | [**createOAuthClientAuthorization**](docs/DefaultApi.md#createOAuthClientAuthorization) | **POST** /oapi/v1/oauthclientauthorizations | 
*DefaultApi* | [**createPersistentVolume**](docs/DefaultApi.md#createPersistentVolume) | **POST** /api/v1/persistentvolumes | 
*DefaultApi* | [**createPersistentVolumeClaimForAllNamespaces**](docs/DefaultApi.md#createPersistentVolumeClaimForAllNamespaces) | **POST** /api/v1/persistentvolumeclaims | 
*DefaultApi* | [**createPetSetForAllNamespaces**](docs/DefaultApi.md#createPetSetForAllNamespaces) | **POST** /apis/apps/v1alpha1/petsets | 
*DefaultApi* | [**createPodDisruptionBudgetForAllNamespaces**](docs/DefaultApi.md#createPodDisruptionBudgetForAllNamespaces) | **POST** /apis/policy/v1alpha1/poddisruptionbudgets | 
*DefaultApi* | [**createPodForAllNamespaces**](docs/DefaultApi.md#createPodForAllNamespaces) | **POST** /api/v1/pods | 
*DefaultApi* | [**createPodSecurityPolicy**](docs/DefaultApi.md#createPodSecurityPolicy) | **POST** /apis/extensions/v1beta1/podsecuritypolicies | 
*DefaultApi* | [**createPodSecurityPolicyReviewForAllNamespaces**](docs/DefaultApi.md#createPodSecurityPolicyReviewForAllNamespaces) | **POST** /oapi/v1/podsecuritypolicyreviews | 
*DefaultApi* | [**createPodSecurityPolicySelfSubjectReviewForAllNamespaces**](docs/DefaultApi.md#createPodSecurityPolicySelfSubjectReviewForAllNamespaces) | **POST** /oapi/v1/podsecuritypolicyselfsubjectreviews | 
*DefaultApi* | [**createPodSecurityPolicySubjectReviewForAllNamespaces**](docs/DefaultApi.md#createPodSecurityPolicySubjectReviewForAllNamespaces) | **POST** /oapi/v1/podsecuritypolicysubjectreviews | 
*DefaultApi* | [**createPodTemplateForAllNamespaces**](docs/DefaultApi.md#createPodTemplateForAllNamespaces) | **POST** /api/v1/podtemplates | 
*DefaultApi* | [**createPolicyBindingForAllNamespaces**](docs/DefaultApi.md#createPolicyBindingForAllNamespaces) | **POST** /oapi/v1/policybindings | 
*DefaultApi* | [**createPolicyForAllNamespaces**](docs/DefaultApi.md#createPolicyForAllNamespaces) | **POST** /oapi/v1/policies | 
*DefaultApi* | [**createProject**](docs/DefaultApi.md#createProject) | **POST** /oapi/v1/projects | 
*DefaultApi* | [**createProjectRequest**](docs/DefaultApi.md#createProjectRequest) | **POST** /oapi/v1/projectrequests | 
*DefaultApi* | [**createReplicaSetForAllNamespaces**](docs/DefaultApi.md#createReplicaSetForAllNamespaces) | **POST** /apis/extensions/v1beta1/replicasets | 
*DefaultApi* | [**createReplicationControllerForAllNamespaces**](docs/DefaultApi.md#createReplicationControllerForAllNamespaces) | **POST** /api/v1/replicationcontrollers | 
*DefaultApi* | [**createResourceAccessReviewForAllNamespaces**](docs/DefaultApi.md#createResourceAccessReviewForAllNamespaces) | **POST** /oapi/v1/resourceaccessreviews | 
*DefaultApi* | [**createResourceQuotaForAllNamespaces**](docs/DefaultApi.md#createResourceQuotaForAllNamespaces) | **POST** /api/v1/resourcequotas | 
*DefaultApi* | [**createRoleBindingForAllNamespaces**](docs/DefaultApi.md#createRoleBindingForAllNamespaces) | **POST** /oapi/v1/rolebindings | 
*DefaultApi* | [**createRoleForAllNamespaces**](docs/DefaultApi.md#createRoleForAllNamespaces) | **POST** /oapi/v1/roles | 
*DefaultApi* | [**createRouteForAllNamespaces**](docs/DefaultApi.md#createRouteForAllNamespaces) | **POST** /oapi/v1/routes | 
*DefaultApi* | [**createScheduledJobForAllNamespaces**](docs/DefaultApi.md#createScheduledJobForAllNamespaces) | **POST** /apis/batch/v2alpha1/scheduledjobs | 
*DefaultApi* | [**createSecretForAllNamespaces**](docs/DefaultApi.md#createSecretForAllNamespaces) | **POST** /api/v1/secrets | 
*DefaultApi* | [**createSecurityContextConstraints**](docs/DefaultApi.md#createSecurityContextConstraints) | **POST** /api/v1/securitycontextconstraints | 
*DefaultApi* | [**createSelfSubjectRulesReviewForAllNamespaces**](docs/DefaultApi.md#createSelfSubjectRulesReviewForAllNamespaces) | **POST** /oapi/v1/selfsubjectrulesreviews | 
*DefaultApi* | [**createServiceAccountForAllNamespaces**](docs/DefaultApi.md#createServiceAccountForAllNamespaces) | **POST** /api/v1/serviceaccounts | 
*DefaultApi* | [**createServiceForAllNamespaces**](docs/DefaultApi.md#createServiceForAllNamespaces) | **POST** /api/v1/services | 
*DefaultApi* | [**createStorageClass**](docs/DefaultApi.md#createStorageClass) | **POST** /apis/storage.k8s.io/v1beta1/storageclasses | 
*DefaultApi* | [**createSubjectAccessReviewForAllNamespaces**](docs/DefaultApi.md#createSubjectAccessReviewForAllNamespaces) | **POST** /oapi/v1/subjectaccessreviews | 
*DefaultApi* | [**createThirdPartyResource**](docs/DefaultApi.md#createThirdPartyResource) | **POST** /apis/extensions/v1beta1/thirdpartyresources | 
*DefaultApi* | [**createTokenReview**](docs/DefaultApi.md#createTokenReview) | **POST** /apis/authentication.k8s.io/v1beta1/tokenreviews | 
*DefaultApi* | [**createUser**](docs/DefaultApi.md#createUser) | **POST** /oapi/v1/users | 
*DefaultApi* | [**createUserIdentityMapping**](docs/DefaultApi.md#createUserIdentityMapping) | **POST** /oapi/v1/useridentitymappings | 
*DefaultApi* | [**deleteCertificateSigningRequest**](docs/DefaultApi.md#deleteCertificateSigningRequest) | **DELETE** /apis/certificates.k8s.io/v1alpha1/certificatesigningrequests/{name} | 
*DefaultApi* | [**deleteClusterNetwork**](docs/DefaultApi.md#deleteClusterNetwork) | **DELETE** /oapi/v1/clusternetworks/{name} | 
*DefaultApi* | [**deleteClusterPolicy**](docs/DefaultApi.md#deleteClusterPolicy) | **DELETE** /oapi/v1/clusterpolicies/{name} | 
*DefaultApi* | [**deleteClusterPolicyBinding**](docs/DefaultApi.md#deleteClusterPolicyBinding) | **DELETE** /oapi/v1/clusterpolicybindings/{name} | 
*DefaultApi* | [**deleteClusterResourceQuota**](docs/DefaultApi.md#deleteClusterResourceQuota) | **DELETE** /oapi/v1/clusterresourcequotas/{name} | 
*DefaultApi* | [**deleteClusterRole**](docs/DefaultApi.md#deleteClusterRole) | **DELETE** /oapi/v1/clusterroles/{name} | 
*DefaultApi* | [**deleteClusterRoleBinding**](docs/DefaultApi.md#deleteClusterRoleBinding) | **DELETE** /oapi/v1/clusterrolebindings/{name} | 
*DefaultApi* | [**deleteGroup**](docs/DefaultApi.md#deleteGroup) | **DELETE** /oapi/v1/groups/{name} | 
*DefaultApi* | [**deleteHostSubnet**](docs/DefaultApi.md#deleteHostSubnet) | **DELETE** /oapi/v1/hostsubnets/{name} | 
*DefaultApi* | [**deleteIdentity**](docs/DefaultApi.md#deleteIdentity) | **DELETE** /oapi/v1/identities/{name} | 
*DefaultApi* | [**deleteImage**](docs/DefaultApi.md#deleteImage) | **DELETE** /oapi/v1/images/{name} | 
*DefaultApi* | [**deleteImageSignature**](docs/DefaultApi.md#deleteImageSignature) | **DELETE** /oapi/v1/imagesignatures/{name} | 
*DefaultApi* | [**deleteNamespace**](docs/DefaultApi.md#deleteNamespace) | **DELETE** /api/v1/namespaces/{name} | 
*DefaultApi* | [**deleteNamespacedBuild**](docs/DefaultApi.md#deleteNamespacedBuild) | **DELETE** /oapi/v1/namespaces/{namespace}/builds/{name} | 
*DefaultApi* | [**deleteNamespacedBuildConfig**](docs/DefaultApi.md#deleteNamespacedBuildConfig) | **DELETE** /oapi/v1/namespaces/{namespace}/buildconfigs/{name} | 
*DefaultApi* | [**deleteNamespacedConfigMap**](docs/DefaultApi.md#deleteNamespacedConfigMap) | **DELETE** /api/v1/namespaces/{namespace}/configmaps/{name} | 
*DefaultApi* | [**deleteNamespacedDaemonSet**](docs/DefaultApi.md#deleteNamespacedDaemonSet) | **DELETE** /apis/extensions/v1beta1/namespaces/{namespace}/daemonsets/{name} | 
*DefaultApi* | [**deleteNamespacedDeployment**](docs/DefaultApi.md#deleteNamespacedDeployment) | **DELETE** /apis/extensions/v1beta1/namespaces/{namespace}/deployments/{name} | 
*DefaultApi* | [**deleteNamespacedDeploymentConfig**](docs/DefaultApi.md#deleteNamespacedDeploymentConfig) | **DELETE** /oapi/v1/namespaces/{namespace}/deploymentconfigs/{name} | 
*DefaultApi* | [**deleteNamespacedEgressNetworkPolicy**](docs/DefaultApi.md#deleteNamespacedEgressNetworkPolicy) | **DELETE** /oapi/v1/namespaces/{namespace}/egressnetworkpolicies/{name} | 
*DefaultApi* | [**deleteNamespacedEndpoints**](docs/DefaultApi.md#deleteNamespacedEndpoints) | **DELETE** /api/v1/namespaces/{namespace}/endpoints/{name} | 
*DefaultApi* | [**deleteNamespacedEvent**](docs/DefaultApi.md#deleteNamespacedEvent) | **DELETE** /api/v1/namespaces/{namespace}/events/{name} | 
*DefaultApi* | [**deleteNamespacedImageStream**](docs/DefaultApi.md#deleteNamespacedImageStream) | **DELETE** /oapi/v1/namespaces/{namespace}/imagestreams/{name} | 
*DefaultApi* | [**deleteNamespacedImageStreamTag**](docs/DefaultApi.md#deleteNamespacedImageStreamTag) | **DELETE** /oapi/v1/namespaces/{namespace}/imagestreamtags/{name} | 
*DefaultApi* | [**deleteNamespacedIngress**](docs/DefaultApi.md#deleteNamespacedIngress) | **DELETE** /apis/extensions/v1beta1/namespaces/{namespace}/ingresses/{name} | 
*DefaultApi* | [**deleteNamespacedLimitRange**](docs/DefaultApi.md#deleteNamespacedLimitRange) | **DELETE** /api/v1/namespaces/{namespace}/limitranges/{name} | 
*DefaultApi* | [**deleteNamespacedNetworkPolicy**](docs/DefaultApi.md#deleteNamespacedNetworkPolicy) | **DELETE** /apis/extensions/v1beta1/namespaces/{namespace}/networkpolicies/{name} | 
*DefaultApi* | [**deleteNamespacedPersistentVolumeClaim**](docs/DefaultApi.md#deleteNamespacedPersistentVolumeClaim) | **DELETE** /api/v1/namespaces/{namespace}/persistentvolumeclaims/{name} | 
*DefaultApi* | [**deleteNamespacedPetSet**](docs/DefaultApi.md#deleteNamespacedPetSet) | **DELETE** /apis/apps/v1alpha1/namespaces/{namespace}/petsets/{name} | 
*DefaultApi* | [**deleteNamespacedPod**](docs/DefaultApi.md#deleteNamespacedPod) | **DELETE** /api/v1/namespaces/{namespace}/pods/{name} | 
*DefaultApi* | [**deleteNamespacedPodDisruptionBudget**](docs/DefaultApi.md#deleteNamespacedPodDisruptionBudget) | **DELETE** /apis/policy/v1alpha1/namespaces/{namespace}/poddisruptionbudgets/{name} | 
*DefaultApi* | [**deleteNamespacedPodTemplate**](docs/DefaultApi.md#deleteNamespacedPodTemplate) | **DELETE** /api/v1/namespaces/{namespace}/podtemplates/{name} | 
*DefaultApi* | [**deleteNamespacedPolicy**](docs/DefaultApi.md#deleteNamespacedPolicy) | **DELETE** /oapi/v1/namespaces/{namespace}/policies/{name} | 
*DefaultApi* | [**deleteNamespacedPolicyBinding**](docs/DefaultApi.md#deleteNamespacedPolicyBinding) | **DELETE** /oapi/v1/namespaces/{namespace}/policybindings/{name} | 
*DefaultApi* | [**deleteNamespacedReplicaSet**](docs/DefaultApi.md#deleteNamespacedReplicaSet) | **DELETE** /apis/extensions/v1beta1/namespaces/{namespace}/replicasets/{name} | 
*DefaultApi* | [**deleteNamespacedReplicationController**](docs/DefaultApi.md#deleteNamespacedReplicationController) | **DELETE** /api/v1/namespaces/{namespace}/replicationcontrollers/{name} | 
*DefaultApi* | [**deleteNamespacedResourceQuota**](docs/DefaultApi.md#deleteNamespacedResourceQuota) | **DELETE** /api/v1/namespaces/{namespace}/resourcequotas/{name} | 
*DefaultApi* | [**deleteNamespacedRole**](docs/DefaultApi.md#deleteNamespacedRole) | **DELETE** /oapi/v1/namespaces/{namespace}/roles/{name} | 
*DefaultApi* | [**deleteNamespacedRoleBinding**](docs/DefaultApi.md#deleteNamespacedRoleBinding) | **DELETE** /oapi/v1/namespaces/{namespace}/rolebindings/{name} | 
*DefaultApi* | [**deleteNamespacedRoute**](docs/DefaultApi.md#deleteNamespacedRoute) | **DELETE** /oapi/v1/namespaces/{namespace}/routes/{name} | 
*DefaultApi* | [**deleteNamespacedScheduledJob**](docs/DefaultApi.md#deleteNamespacedScheduledJob) | **DELETE** /apis/batch/v2alpha1/namespaces/{namespace}/scheduledjobs/{name} | 
*DefaultApi* | [**deleteNamespacedSecret**](docs/DefaultApi.md#deleteNamespacedSecret) | **DELETE** /api/v1/namespaces/{namespace}/secrets/{name} | 
*DefaultApi* | [**deleteNamespacedService**](docs/DefaultApi.md#deleteNamespacedService) | **DELETE** /api/v1/namespaces/{namespace}/services/{name} | 
*DefaultApi* | [**deleteNamespacedServiceAccount**](docs/DefaultApi.md#deleteNamespacedServiceAccount) | **DELETE** /api/v1/namespaces/{namespace}/serviceaccounts/{name} | 
*DefaultApi* | [**deleteNamespacedTemplate**](docs/DefaultApi.md#deleteNamespacedTemplate) | **DELETE** /oapi/v1/namespaces/{namespace}/templates/{name} | 
*DefaultApi* | [**deleteNetNamespace**](docs/DefaultApi.md#deleteNetNamespace) | **DELETE** /oapi/v1/netnamespaces/{name} | 
*DefaultApi* | [**deleteNode**](docs/DefaultApi.md#deleteNode) | **DELETE** /api/v1/nodes/{name} | 
*DefaultApi* | [**deleteOAuthAccessToken**](docs/DefaultApi.md#deleteOAuthAccessToken) | **DELETE** /oapi/v1/oauthaccesstokens/{name} | 
*DefaultApi* | [**deleteOAuthAuthorizeToken**](docs/DefaultApi.md#deleteOAuthAuthorizeToken) | **DELETE** /oapi/v1/oauthauthorizetokens/{name} | 
*DefaultApi* | [**deleteOAuthClient**](docs/DefaultApi.md#deleteOAuthClient) | **DELETE** /oapi/v1/oauthclients/{name} | 
*DefaultApi* | [**deleteOAuthClientAuthorization**](docs/DefaultApi.md#deleteOAuthClientAuthorization) | **DELETE** /oapi/v1/oauthclientauthorizations/{name} | 
*DefaultApi* | [**deletePersistentVolume**](docs/DefaultApi.md#deletePersistentVolume) | **DELETE** /api/v1/persistentvolumes/{name} | 
*DefaultApi* | [**deletePodSecurityPolicy**](docs/DefaultApi.md#deletePodSecurityPolicy) | **DELETE** /apis/extensions/v1beta1/podsecuritypolicies/{name} | 
*DefaultApi* | [**deleteProject**](docs/DefaultApi.md#deleteProject) | **DELETE** /oapi/v1/projects/{name} | 
*DefaultApi* | [**deleteSecurityContextConstraints**](docs/DefaultApi.md#deleteSecurityContextConstraints) | **DELETE** /api/v1/securitycontextconstraints/{name} | 
*DefaultApi* | [**deleteStorageClass**](docs/DefaultApi.md#deleteStorageClass) | **DELETE** /apis/storage.k8s.io/v1beta1/storageclasses/{name} | 
*DefaultApi* | [**deleteThirdPartyResource**](docs/DefaultApi.md#deleteThirdPartyResource) | **DELETE** /apis/extensions/v1beta1/thirdpartyresources/{name} | 
*DefaultApi* | [**deleteUser**](docs/DefaultApi.md#deleteUser) | **DELETE** /oapi/v1/users/{name} | 
*DefaultApi* | [**deleteUserIdentityMapping**](docs/DefaultApi.md#deleteUserIdentityMapping) | **DELETE** /oapi/v1/useridentitymappings/{name} | 
*DefaultApi* | [**deletecollectionCertificateSigningRequest**](docs/DefaultApi.md#deletecollectionCertificateSigningRequest) | **DELETE** /apis/certificates.k8s.io/v1alpha1/certificatesigningrequests | 
*DefaultApi* | [**deletecollectionClusterNetwork**](docs/DefaultApi.md#deletecollectionClusterNetwork) | **DELETE** /oapi/v1/clusternetworks | 
*DefaultApi* | [**deletecollectionClusterPolicy**](docs/DefaultApi.md#deletecollectionClusterPolicy) | **DELETE** /oapi/v1/clusterpolicies | 
*DefaultApi* | [**deletecollectionClusterPolicyBinding**](docs/DefaultApi.md#deletecollectionClusterPolicyBinding) | **DELETE** /oapi/v1/clusterpolicybindings | 
*DefaultApi* | [**deletecollectionClusterResourceQuota**](docs/DefaultApi.md#deletecollectionClusterResourceQuota) | **DELETE** /oapi/v1/clusterresourcequotas | 
*DefaultApi* | [**deletecollectionGroup**](docs/DefaultApi.md#deletecollectionGroup) | **DELETE** /oapi/v1/groups | 
*DefaultApi* | [**deletecollectionHostSubnet**](docs/DefaultApi.md#deletecollectionHostSubnet) | **DELETE** /oapi/v1/hostsubnets | 
*DefaultApi* | [**deletecollectionIdentity**](docs/DefaultApi.md#deletecollectionIdentity) | **DELETE** /oapi/v1/identities | 
*DefaultApi* | [**deletecollectionImage**](docs/DefaultApi.md#deletecollectionImage) | **DELETE** /oapi/v1/images | 
*DefaultApi* | [**deletecollectionNamespace**](docs/DefaultApi.md#deletecollectionNamespace) | **DELETE** /api/v1/namespaces | 
*DefaultApi* | [**deletecollectionNamespacedBuild**](docs/DefaultApi.md#deletecollectionNamespacedBuild) | **DELETE** /oapi/v1/namespaces/{namespace}/builds | 
*DefaultApi* | [**deletecollectionNamespacedBuildConfig**](docs/DefaultApi.md#deletecollectionNamespacedBuildConfig) | **DELETE** /oapi/v1/namespaces/{namespace}/buildconfigs | 
*DefaultApi* | [**deletecollectionNamespacedConfigMap**](docs/DefaultApi.md#deletecollectionNamespacedConfigMap) | **DELETE** /api/v1/namespaces/{namespace}/configmaps | 
*DefaultApi* | [**deletecollectionNamespacedDaemonSet**](docs/DefaultApi.md#deletecollectionNamespacedDaemonSet) | **DELETE** /apis/extensions/v1beta1/namespaces/{namespace}/daemonsets | 
*DefaultApi* | [**deletecollectionNamespacedDeployment**](docs/DefaultApi.md#deletecollectionNamespacedDeployment) | **DELETE** /apis/extensions/v1beta1/namespaces/{namespace}/deployments | 
*DefaultApi* | [**deletecollectionNamespacedDeploymentConfig**](docs/DefaultApi.md#deletecollectionNamespacedDeploymentConfig) | **DELETE** /oapi/v1/namespaces/{namespace}/deploymentconfigs | 
*DefaultApi* | [**deletecollectionNamespacedEgressNetworkPolicy**](docs/DefaultApi.md#deletecollectionNamespacedEgressNetworkPolicy) | **DELETE** /oapi/v1/namespaces/{namespace}/egressnetworkpolicies | 
*DefaultApi* | [**deletecollectionNamespacedEndpoints**](docs/DefaultApi.md#deletecollectionNamespacedEndpoints) | **DELETE** /api/v1/namespaces/{namespace}/endpoints | 
*DefaultApi* | [**deletecollectionNamespacedEvent**](docs/DefaultApi.md#deletecollectionNamespacedEvent) | **DELETE** /api/v1/namespaces/{namespace}/events | 
*DefaultApi* | [**deletecollectionNamespacedImageStream**](docs/DefaultApi.md#deletecollectionNamespacedImageStream) | **DELETE** /oapi/v1/namespaces/{namespace}/imagestreams | 
*DefaultApi* | [**deletecollectionNamespacedIngress**](docs/DefaultApi.md#deletecollectionNamespacedIngress) | **DELETE** /apis/extensions/v1beta1/namespaces/{namespace}/ingresses | 
*DefaultApi* | [**deletecollectionNamespacedLimitRange**](docs/DefaultApi.md#deletecollectionNamespacedLimitRange) | **DELETE** /api/v1/namespaces/{namespace}/limitranges | 
*DefaultApi* | [**deletecollectionNamespacedNetworkPolicy**](docs/DefaultApi.md#deletecollectionNamespacedNetworkPolicy) | **DELETE** /apis/extensions/v1beta1/namespaces/{namespace}/networkpolicies | 
*DefaultApi* | [**deletecollectionNamespacedPersistentVolumeClaim**](docs/DefaultApi.md#deletecollectionNamespacedPersistentVolumeClaim) | **DELETE** /api/v1/namespaces/{namespace}/persistentvolumeclaims | 
*DefaultApi* | [**deletecollectionNamespacedPetSet**](docs/DefaultApi.md#deletecollectionNamespacedPetSet) | **DELETE** /apis/apps/v1alpha1/namespaces/{namespace}/petsets | 
*DefaultApi* | [**deletecollectionNamespacedPod**](docs/DefaultApi.md#deletecollectionNamespacedPod) | **DELETE** /api/v1/namespaces/{namespace}/pods | 
*DefaultApi* | [**deletecollectionNamespacedPodDisruptionBudget**](docs/DefaultApi.md#deletecollectionNamespacedPodDisruptionBudget) | **DELETE** /apis/policy/v1alpha1/namespaces/{namespace}/poddisruptionbudgets | 
*DefaultApi* | [**deletecollectionNamespacedPodTemplate**](docs/DefaultApi.md#deletecollectionNamespacedPodTemplate) | **DELETE** /api/v1/namespaces/{namespace}/podtemplates | 
*DefaultApi* | [**deletecollectionNamespacedPolicy**](docs/DefaultApi.md#deletecollectionNamespacedPolicy) | **DELETE** /oapi/v1/namespaces/{namespace}/policies | 
*DefaultApi* | [**deletecollectionNamespacedPolicyBinding**](docs/DefaultApi.md#deletecollectionNamespacedPolicyBinding) | **DELETE** /oapi/v1/namespaces/{namespace}/policybindings | 
*DefaultApi* | [**deletecollectionNamespacedReplicaSet**](docs/DefaultApi.md#deletecollectionNamespacedReplicaSet) | **DELETE** /apis/extensions/v1beta1/namespaces/{namespace}/replicasets | 
*DefaultApi* | [**deletecollectionNamespacedReplicationController**](docs/DefaultApi.md#deletecollectionNamespacedReplicationController) | **DELETE** /api/v1/namespaces/{namespace}/replicationcontrollers | 
*DefaultApi* | [**deletecollectionNamespacedResourceQuota**](docs/DefaultApi.md#deletecollectionNamespacedResourceQuota) | **DELETE** /api/v1/namespaces/{namespace}/resourcequotas | 
*DefaultApi* | [**deletecollectionNamespacedRoute**](docs/DefaultApi.md#deletecollectionNamespacedRoute) | **DELETE** /oapi/v1/namespaces/{namespace}/routes | 
*DefaultApi* | [**deletecollectionNamespacedScheduledJob**](docs/DefaultApi.md#deletecollectionNamespacedScheduledJob) | **DELETE** /apis/batch/v2alpha1/namespaces/{namespace}/scheduledjobs | 
*DefaultApi* | [**deletecollectionNamespacedSecret**](docs/DefaultApi.md#deletecollectionNamespacedSecret) | **DELETE** /api/v1/namespaces/{namespace}/secrets | 
*DefaultApi* | [**deletecollectionNamespacedServiceAccount**](docs/DefaultApi.md#deletecollectionNamespacedServiceAccount) | **DELETE** /api/v1/namespaces/{namespace}/serviceaccounts | 
*DefaultApi* | [**deletecollectionNamespacedTemplate**](docs/DefaultApi.md#deletecollectionNamespacedTemplate) | **DELETE** /oapi/v1/namespaces/{namespace}/templates | 
*DefaultApi* | [**deletecollectionNetNamespace**](docs/DefaultApi.md#deletecollectionNetNamespace) | **DELETE** /oapi/v1/netnamespaces | 
*DefaultApi* | [**deletecollectionNode**](docs/DefaultApi.md#deletecollectionNode) | **DELETE** /api/v1/nodes | 
*DefaultApi* | [**deletecollectionOAuthAccessToken**](docs/DefaultApi.md#deletecollectionOAuthAccessToken) | **DELETE** /oapi/v1/oauthaccesstokens | 
*DefaultApi* | [**deletecollectionOAuthAuthorizeToken**](docs/DefaultApi.md#deletecollectionOAuthAuthorizeToken) | **DELETE** /oapi/v1/oauthauthorizetokens | 
*DefaultApi* | [**deletecollectionOAuthClient**](docs/DefaultApi.md#deletecollectionOAuthClient) | **DELETE** /oapi/v1/oauthclients | 
*DefaultApi* | [**deletecollectionOAuthClientAuthorization**](docs/DefaultApi.md#deletecollectionOAuthClientAuthorization) | **DELETE** /oapi/v1/oauthclientauthorizations | 
*DefaultApi* | [**deletecollectionPersistentVolume**](docs/DefaultApi.md#deletecollectionPersistentVolume) | **DELETE** /api/v1/persistentvolumes | 
*DefaultApi* | [**deletecollectionPodSecurityPolicy**](docs/DefaultApi.md#deletecollectionPodSecurityPolicy) | **DELETE** /apis/extensions/v1beta1/podsecuritypolicies | 
*DefaultApi* | [**deletecollectionSecurityContextConstraints**](docs/DefaultApi.md#deletecollectionSecurityContextConstraints) | **DELETE** /api/v1/securitycontextconstraints | 
*DefaultApi* | [**deletecollectionStorageClass**](docs/DefaultApi.md#deletecollectionStorageClass) | **DELETE** /apis/storage.k8s.io/v1beta1/storageclasses | 
*DefaultApi* | [**deletecollectionThirdPartyResource**](docs/DefaultApi.md#deletecollectionThirdPartyResource) | **DELETE** /apis/extensions/v1beta1/thirdpartyresources | 
*DefaultApi* | [**deletecollectionUser**](docs/DefaultApi.md#deletecollectionUser) | **DELETE** /oapi/v1/users | 
*DefaultApi* | [**listAppliedClusterResourceQuotaForAllNamespaces**](docs/DefaultApi.md#listAppliedClusterResourceQuotaForAllNamespaces) | **GET** /oapi/v1/appliedclusterresourcequotas | 
*DefaultApi* | [**listBuildConfigForAllNamespaces**](docs/DefaultApi.md#listBuildConfigForAllNamespaces) | **GET** /oapi/v1/buildconfigs | 
*DefaultApi* | [**listBuildForAllNamespaces**](docs/DefaultApi.md#listBuildForAllNamespaces) | **GET** /oapi/v1/builds | 
*DefaultApi* | [**listCertificateSigningRequest**](docs/DefaultApi.md#listCertificateSigningRequest) | **GET** /apis/certificates.k8s.io/v1alpha1/certificatesigningrequests | 
*DefaultApi* | [**listClusterNetwork**](docs/DefaultApi.md#listClusterNetwork) | **GET** /oapi/v1/clusternetworks | 
*DefaultApi* | [**listClusterPolicy**](docs/DefaultApi.md#listClusterPolicy) | **GET** /oapi/v1/clusterpolicies | 
*DefaultApi* | [**listClusterPolicyBinding**](docs/DefaultApi.md#listClusterPolicyBinding) | **GET** /oapi/v1/clusterpolicybindings | 
*DefaultApi* | [**listClusterResourceQuota**](docs/DefaultApi.md#listClusterResourceQuota) | **GET** /oapi/v1/clusterresourcequotas | 
*DefaultApi* | [**listClusterRole**](docs/DefaultApi.md#listClusterRole) | **GET** /oapi/v1/clusterroles | 
*DefaultApi* | [**listClusterRoleBinding**](docs/DefaultApi.md#listClusterRoleBinding) | **GET** /oapi/v1/clusterrolebindings | 
*DefaultApi* | [**listComponentStatus**](docs/DefaultApi.md#listComponentStatus) | **GET** /api/v1/componentstatuses | 
*DefaultApi* | [**listConfigMapForAllNamespaces**](docs/DefaultApi.md#listConfigMapForAllNamespaces) | **GET** /api/v1/configmaps | 
*DefaultApi* | [**listDaemonSetForAllNamespaces**](docs/DefaultApi.md#listDaemonSetForAllNamespaces) | **GET** /apis/extensions/v1beta1/daemonsets | 
*DefaultApi* | [**listDeploymentConfigForAllNamespaces**](docs/DefaultApi.md#listDeploymentConfigForAllNamespaces) | **GET** /oapi/v1/deploymentconfigs | 
*DefaultApi* | [**listDeploymentForAllNamespaces**](docs/DefaultApi.md#listDeploymentForAllNamespaces) | **GET** /apis/extensions/v1beta1/deployments | 
*DefaultApi* | [**listEgressNetworkPolicyForAllNamespaces**](docs/DefaultApi.md#listEgressNetworkPolicyForAllNamespaces) | **GET** /oapi/v1/egressnetworkpolicies | 
*DefaultApi* | [**listEndpointsForAllNamespaces**](docs/DefaultApi.md#listEndpointsForAllNamespaces) | **GET** /api/v1/endpoints | 
*DefaultApi* | [**listEventForAllNamespaces**](docs/DefaultApi.md#listEventForAllNamespaces) | **GET** /api/v1/events | 
*DefaultApi* | [**listGroup**](docs/DefaultApi.md#listGroup) | **GET** /oapi/v1/groups | 
*DefaultApi* | [**listHostSubnet**](docs/DefaultApi.md#listHostSubnet) | **GET** /oapi/v1/hostsubnets | 
*DefaultApi* | [**listIdentity**](docs/DefaultApi.md#listIdentity) | **GET** /oapi/v1/identities | 
*DefaultApi* | [**listImage**](docs/DefaultApi.md#listImage) | **GET** /oapi/v1/images | 
*DefaultApi* | [**listImageStreamForAllNamespaces**](docs/DefaultApi.md#listImageStreamForAllNamespaces) | **GET** /oapi/v1/imagestreams | 
*DefaultApi* | [**listImageStreamTagForAllNamespaces**](docs/DefaultApi.md#listImageStreamTagForAllNamespaces) | **GET** /oapi/v1/imagestreamtags | 
*DefaultApi* | [**listIngressForAllNamespaces**](docs/DefaultApi.md#listIngressForAllNamespaces) | **GET** /apis/extensions/v1beta1/ingresses | 
*DefaultApi* | [**listLimitRangeForAllNamespaces**](docs/DefaultApi.md#listLimitRangeForAllNamespaces) | **GET** /api/v1/limitranges | 
*DefaultApi* | [**listNamespace**](docs/DefaultApi.md#listNamespace) | **GET** /api/v1/namespaces | 
*DefaultApi* | [**listNamespacedAppliedClusterResourceQuota**](docs/DefaultApi.md#listNamespacedAppliedClusterResourceQuota) | **GET** /oapi/v1/namespaces/{namespace}/appliedclusterresourcequotas | 
*DefaultApi* | [**listNamespacedBuild**](docs/DefaultApi.md#listNamespacedBuild) | **GET** /oapi/v1/namespaces/{namespace}/builds | 
*DefaultApi* | [**listNamespacedBuildConfig**](docs/DefaultApi.md#listNamespacedBuildConfig) | **GET** /oapi/v1/namespaces/{namespace}/buildconfigs | 
*DefaultApi* | [**listNamespacedConfigMap**](docs/DefaultApi.md#listNamespacedConfigMap) | **GET** /api/v1/namespaces/{namespace}/configmaps | 
*DefaultApi* | [**listNamespacedDaemonSet**](docs/DefaultApi.md#listNamespacedDaemonSet) | **GET** /apis/extensions/v1beta1/namespaces/{namespace}/daemonsets | 
*DefaultApi* | [**listNamespacedDeployment**](docs/DefaultApi.md#listNamespacedDeployment) | **GET** /apis/extensions/v1beta1/namespaces/{namespace}/deployments | 
*DefaultApi* | [**listNamespacedDeploymentConfig**](docs/DefaultApi.md#listNamespacedDeploymentConfig) | **GET** /oapi/v1/namespaces/{namespace}/deploymentconfigs | 
*DefaultApi* | [**listNamespacedEgressNetworkPolicy**](docs/DefaultApi.md#listNamespacedEgressNetworkPolicy) | **GET** /oapi/v1/namespaces/{namespace}/egressnetworkpolicies | 
*DefaultApi* | [**listNamespacedEndpoints**](docs/DefaultApi.md#listNamespacedEndpoints) | **GET** /api/v1/namespaces/{namespace}/endpoints | 
*DefaultApi* | [**listNamespacedEvent**](docs/DefaultApi.md#listNamespacedEvent) | **GET** /api/v1/namespaces/{namespace}/events | 
*DefaultApi* | [**listNamespacedImageStream**](docs/DefaultApi.md#listNamespacedImageStream) | **GET** /oapi/v1/namespaces/{namespace}/imagestreams | 
*DefaultApi* | [**listNamespacedImageStreamTag**](docs/DefaultApi.md#listNamespacedImageStreamTag) | **GET** /oapi/v1/namespaces/{namespace}/imagestreamtags | 
*DefaultApi* | [**listNamespacedIngress**](docs/DefaultApi.md#listNamespacedIngress) | **GET** /apis/extensions/v1beta1/namespaces/{namespace}/ingresses | 
*DefaultApi* | [**listNamespacedLimitRange**](docs/DefaultApi.md#listNamespacedLimitRange) | **GET** /api/v1/namespaces/{namespace}/limitranges | 
*DefaultApi* | [**listNamespacedNetworkPolicy**](docs/DefaultApi.md#listNamespacedNetworkPolicy) | **GET** /apis/extensions/v1beta1/namespaces/{namespace}/networkpolicies | 
*DefaultApi* | [**listNamespacedPersistentVolumeClaim**](docs/DefaultApi.md#listNamespacedPersistentVolumeClaim) | **GET** /api/v1/namespaces/{namespace}/persistentvolumeclaims | 
*DefaultApi* | [**listNamespacedPetSet**](docs/DefaultApi.md#listNamespacedPetSet) | **GET** /apis/apps/v1alpha1/namespaces/{namespace}/petsets | 
*DefaultApi* | [**listNamespacedPod**](docs/DefaultApi.md#listNamespacedPod) | **GET** /api/v1/namespaces/{namespace}/pods | 
*DefaultApi* | [**listNamespacedPodDisruptionBudget**](docs/DefaultApi.md#listNamespacedPodDisruptionBudget) | **GET** /apis/policy/v1alpha1/namespaces/{namespace}/poddisruptionbudgets | 
*DefaultApi* | [**listNamespacedPodTemplate**](docs/DefaultApi.md#listNamespacedPodTemplate) | **GET** /api/v1/namespaces/{namespace}/podtemplates | 
*DefaultApi* | [**listNamespacedPolicy**](docs/DefaultApi.md#listNamespacedPolicy) | **GET** /oapi/v1/namespaces/{namespace}/policies | 
*DefaultApi* | [**listNamespacedPolicyBinding**](docs/DefaultApi.md#listNamespacedPolicyBinding) | **GET** /oapi/v1/namespaces/{namespace}/policybindings | 
*DefaultApi* | [**listNamespacedReplicaSet**](docs/DefaultApi.md#listNamespacedReplicaSet) | **GET** /apis/extensions/v1beta1/namespaces/{namespace}/replicasets | 
*DefaultApi* | [**listNamespacedReplicationController**](docs/DefaultApi.md#listNamespacedReplicationController) | **GET** /api/v1/namespaces/{namespace}/replicationcontrollers | 
*DefaultApi* | [**listNamespacedResourceQuota**](docs/DefaultApi.md#listNamespacedResourceQuota) | **GET** /api/v1/namespaces/{namespace}/resourcequotas | 
*DefaultApi* | [**listNamespacedRole**](docs/DefaultApi.md#listNamespacedRole) | **GET** /oapi/v1/namespaces/{namespace}/roles | 
*DefaultApi* | [**listNamespacedRoleBinding**](docs/DefaultApi.md#listNamespacedRoleBinding) | **GET** /oapi/v1/namespaces/{namespace}/rolebindings | 
*DefaultApi* | [**listNamespacedRoute**](docs/DefaultApi.md#listNamespacedRoute) | **GET** /oapi/v1/namespaces/{namespace}/routes | 
*DefaultApi* | [**listNamespacedScheduledJob**](docs/DefaultApi.md#listNamespacedScheduledJob) | **GET** /apis/batch/v2alpha1/namespaces/{namespace}/scheduledjobs | 
*DefaultApi* | [**listNamespacedSecret**](docs/DefaultApi.md#listNamespacedSecret) | **GET** /api/v1/namespaces/{namespace}/secrets | 
*DefaultApi* | [**listNamespacedService**](docs/DefaultApi.md#listNamespacedService) | **GET** /api/v1/namespaces/{namespace}/services | 
*DefaultApi* | [**listNamespacedServiceAccount**](docs/DefaultApi.md#listNamespacedServiceAccount) | **GET** /api/v1/namespaces/{namespace}/serviceaccounts | 
*DefaultApi* | [**listNamespacedTemplate**](docs/DefaultApi.md#listNamespacedTemplate) | **GET** /oapi/v1/namespaces/{namespace}/templates | 
*DefaultApi* | [**listNetNamespace**](docs/DefaultApi.md#listNetNamespace) | **GET** /oapi/v1/netnamespaces | 
*DefaultApi* | [**listNetworkPolicyForAllNamespaces**](docs/DefaultApi.md#listNetworkPolicyForAllNamespaces) | **GET** /apis/extensions/v1beta1/networkpolicies | 
*DefaultApi* | [**listNode**](docs/DefaultApi.md#listNode) | **GET** /api/v1/nodes | 
*DefaultApi* | [**listOAuthAccessToken**](docs/DefaultApi.md#listOAuthAccessToken) | **GET** /oapi/v1/oauthaccesstokens | 
*DefaultApi* | [**listOAuthAuthorizeToken**](docs/DefaultApi.md#listOAuthAuthorizeToken) | **GET** /oapi/v1/oauthauthorizetokens | 
*DefaultApi* | [**listOAuthClient**](docs/DefaultApi.md#listOAuthClient) | **GET** /oapi/v1/oauthclients | 
*DefaultApi* | [**listOAuthClientAuthorization**](docs/DefaultApi.md#listOAuthClientAuthorization) | **GET** /oapi/v1/oauthclientauthorizations | 
*DefaultApi* | [**listPersistentVolume**](docs/DefaultApi.md#listPersistentVolume) | **GET** /api/v1/persistentvolumes | 
*DefaultApi* | [**listPersistentVolumeClaimForAllNamespaces**](docs/DefaultApi.md#listPersistentVolumeClaimForAllNamespaces) | **GET** /api/v1/persistentvolumeclaims | 
*DefaultApi* | [**listPetSetForAllNamespaces**](docs/DefaultApi.md#listPetSetForAllNamespaces) | **GET** /apis/apps/v1alpha1/petsets | 
*DefaultApi* | [**listPodDisruptionBudgetForAllNamespaces**](docs/DefaultApi.md#listPodDisruptionBudgetForAllNamespaces) | **GET** /apis/policy/v1alpha1/poddisruptionbudgets | 
*DefaultApi* | [**listPodForAllNamespaces**](docs/DefaultApi.md#listPodForAllNamespaces) | **GET** /api/v1/pods | 
*DefaultApi* | [**listPodSecurityPolicy**](docs/DefaultApi.md#listPodSecurityPolicy) | **GET** /apis/extensions/v1beta1/podsecuritypolicies | 
*DefaultApi* | [**listPodTemplateForAllNamespaces**](docs/DefaultApi.md#listPodTemplateForAllNamespaces) | **GET** /api/v1/podtemplates | 
*DefaultApi* | [**listPolicyBindingForAllNamespaces**](docs/DefaultApi.md#listPolicyBindingForAllNamespaces) | **GET** /oapi/v1/policybindings | 
*DefaultApi* | [**listPolicyForAllNamespaces**](docs/DefaultApi.md#listPolicyForAllNamespaces) | **GET** /oapi/v1/policies | 
*DefaultApi* | [**listProject**](docs/DefaultApi.md#listProject) | **GET** /oapi/v1/projects | 
*DefaultApi* | [**listProjectRequest**](docs/DefaultApi.md#listProjectRequest) | **GET** /oapi/v1/projectrequests | 
*DefaultApi* | [**listReplicaSetForAllNamespaces**](docs/DefaultApi.md#listReplicaSetForAllNamespaces) | **GET** /apis/extensions/v1beta1/replicasets | 
*DefaultApi* | [**listReplicationControllerForAllNamespaces**](docs/DefaultApi.md#listReplicationControllerForAllNamespaces) | **GET** /api/v1/replicationcontrollers | 
*DefaultApi* | [**listResourceQuotaForAllNamespaces**](docs/DefaultApi.md#listResourceQuotaForAllNamespaces) | **GET** /api/v1/resourcequotas | 
*DefaultApi* | [**listRoleBindingForAllNamespaces**](docs/DefaultApi.md#listRoleBindingForAllNamespaces) | **GET** /oapi/v1/rolebindings | 
*DefaultApi* | [**listRoleForAllNamespaces**](docs/DefaultApi.md#listRoleForAllNamespaces) | **GET** /oapi/v1/roles | 
*DefaultApi* | [**listRouteForAllNamespaces**](docs/DefaultApi.md#listRouteForAllNamespaces) | **GET** /oapi/v1/routes | 
*DefaultApi* | [**listScheduledJobForAllNamespaces**](docs/DefaultApi.md#listScheduledJobForAllNamespaces) | **GET** /apis/batch/v2alpha1/scheduledjobs | 
*DefaultApi* | [**listSecretForAllNamespaces**](docs/DefaultApi.md#listSecretForAllNamespaces) | **GET** /api/v1/secrets | 
*DefaultApi* | [**listSecurityContextConstraints**](docs/DefaultApi.md#listSecurityContextConstraints) | **GET** /api/v1/securitycontextconstraints | 
*DefaultApi* | [**listServiceAccountForAllNamespaces**](docs/DefaultApi.md#listServiceAccountForAllNamespaces) | **GET** /api/v1/serviceaccounts | 
*DefaultApi* | [**listServiceForAllNamespaces**](docs/DefaultApi.md#listServiceForAllNamespaces) | **GET** /api/v1/services | 
*DefaultApi* | [**listStorageClass**](docs/DefaultApi.md#listStorageClass) | **GET** /apis/storage.k8s.io/v1beta1/storageclasses | 
*DefaultApi* | [**listTemplateForAllNamespaces**](docs/DefaultApi.md#listTemplateForAllNamespaces) | **GET** /oapi/v1/templates | 
*DefaultApi* | [**listThirdPartyResource**](docs/DefaultApi.md#listThirdPartyResource) | **GET** /apis/extensions/v1beta1/thirdpartyresources | 
*DefaultApi* | [**listUser**](docs/DefaultApi.md#listUser) | **GET** /oapi/v1/users | 
*DefaultApi* | [**oapiV1Get**](docs/DefaultApi.md#oapiV1Get) | **GET** /oapi/v1/ | 
*DefaultApi* | [**oapiV1NamespacesNamespaceDeploymentconfigsNameGet**](docs/DefaultApi.md#oapiV1NamespacesNamespaceDeploymentconfigsNameGet) | **GET** /oapi/v1/namespaces/{namespace}/deploymentconfigs/{name} | 
*DefaultApi* | [**oapiV1NamespacesNamespaceDeploymentconfigsNameScaleGet**](docs/DefaultApi.md#oapiV1NamespacesNamespaceDeploymentconfigsNameScaleGet) | **GET** /oapi/v1/namespaces/{namespace}/deploymentconfigs/{name}/scale | 
*DefaultApi* | [**oapiV1NamespacesNamespaceDeploymentconfigsNameScalePatch**](docs/DefaultApi.md#oapiV1NamespacesNamespaceDeploymentconfigsNameScalePatch) | **PATCH** /oapi/v1/namespaces/{namespace}/deploymentconfigs/{name}/scale | 
*DefaultApi* | [**oapiV1NamespacesNamespaceDeploymentconfigsNameScalePut**](docs/DefaultApi.md#oapiV1NamespacesNamespaceDeploymentconfigsNameScalePut) | **PUT** /oapi/v1/namespaces/{namespace}/deploymentconfigs/{name}/scale | 
*DefaultApi* | [**oapiV1NamespacesNamespaceGeneratedeploymentconfigsNameGet**](docs/DefaultApi.md#oapiV1NamespacesNamespaceGeneratedeploymentconfigsNameGet) | **GET** /oapi/v1/namespaces/{namespace}/generatedeploymentconfigs/{name} | 
*DefaultApi* | [**oapiV1NamespacesNamespaceProcessedtemplatesPost**](docs/DefaultApi.md#oapiV1NamespacesNamespaceProcessedtemplatesPost) | **POST** /oapi/v1/namespaces/{namespace}/processedtemplates | 
*DefaultApi* | [**oapiV1NamespacesNamespaceTemplatesPost**](docs/DefaultApi.md#oapiV1NamespacesNamespaceTemplatesPost) | **POST** /oapi/v1/namespaces/{namespace}/templates | 
*DefaultApi* | [**oapiV1ProcessedtemplatesPost**](docs/DefaultApi.md#oapiV1ProcessedtemplatesPost) | **POST** /oapi/v1/processedtemplates | 
*DefaultApi* | [**oapiV1TemplatesPost**](docs/DefaultApi.md#oapiV1TemplatesPost) | **POST** /oapi/v1/templates | 
*DefaultApi* | [**patchCertificateSigningRequest**](docs/DefaultApi.md#patchCertificateSigningRequest) | **PATCH** /apis/certificates.k8s.io/v1alpha1/certificatesigningrequests/{name} | 
*DefaultApi* | [**patchClusterNetwork**](docs/DefaultApi.md#patchClusterNetwork) | **PATCH** /oapi/v1/clusternetworks/{name} | 
*DefaultApi* | [**patchClusterPolicy**](docs/DefaultApi.md#patchClusterPolicy) | **PATCH** /oapi/v1/clusterpolicies/{name} | 
*DefaultApi* | [**patchClusterPolicyBinding**](docs/DefaultApi.md#patchClusterPolicyBinding) | **PATCH** /oapi/v1/clusterpolicybindings/{name} | 
*DefaultApi* | [**patchClusterResourceQuota**](docs/DefaultApi.md#patchClusterResourceQuota) | **PATCH** /oapi/v1/clusterresourcequotas/{name} | 
*DefaultApi* | [**patchClusterResourceQuotaStatus**](docs/DefaultApi.md#patchClusterResourceQuotaStatus) | **PATCH** /oapi/v1/clusterresourcequotas/{name}/status | 
*DefaultApi* | [**patchClusterRole**](docs/DefaultApi.md#patchClusterRole) | **PATCH** /oapi/v1/clusterroles/{name} | 
*DefaultApi* | [**patchClusterRoleBinding**](docs/DefaultApi.md#patchClusterRoleBinding) | **PATCH** /oapi/v1/clusterrolebindings/{name} | 
*DefaultApi* | [**patchGroup**](docs/DefaultApi.md#patchGroup) | **PATCH** /oapi/v1/groups/{name} | 
*DefaultApi* | [**patchHostSubnet**](docs/DefaultApi.md#patchHostSubnet) | **PATCH** /oapi/v1/hostsubnets/{name} | 
*DefaultApi* | [**patchIdentity**](docs/DefaultApi.md#patchIdentity) | **PATCH** /oapi/v1/identities/{name} | 
*DefaultApi* | [**patchImage**](docs/DefaultApi.md#patchImage) | **PATCH** /oapi/v1/images/{name} | 
*DefaultApi* | [**patchNamespace**](docs/DefaultApi.md#patchNamespace) | **PATCH** /api/v1/namespaces/{name} | 
*DefaultApi* | [**patchNamespaceStatus**](docs/DefaultApi.md#patchNamespaceStatus) | **PATCH** /api/v1/namespaces/{name}/status | 
*DefaultApi* | [**patchNamespacedBuild**](docs/DefaultApi.md#patchNamespacedBuild) | **PATCH** /oapi/v1/namespaces/{namespace}/builds/{name} | 
*DefaultApi* | [**patchNamespacedBuildConfig**](docs/DefaultApi.md#patchNamespacedBuildConfig) | **PATCH** /oapi/v1/namespaces/{namespace}/buildconfigs/{name} | 
*DefaultApi* | [**patchNamespacedConfigMap**](docs/DefaultApi.md#patchNamespacedConfigMap) | **PATCH** /api/v1/namespaces/{namespace}/configmaps/{name} | 
*DefaultApi* | [**patchNamespacedDaemonSet**](docs/DefaultApi.md#patchNamespacedDaemonSet) | **PATCH** /apis/extensions/v1beta1/namespaces/{namespace}/daemonsets/{name} | 
*DefaultApi* | [**patchNamespacedDaemonSetStatus**](docs/DefaultApi.md#patchNamespacedDaemonSetStatus) | **PATCH** /apis/extensions/v1beta1/namespaces/{namespace}/daemonsets/{name}/status | 
*DefaultApi* | [**patchNamespacedDeployment**](docs/DefaultApi.md#patchNamespacedDeployment) | **PATCH** /apis/extensions/v1beta1/namespaces/{namespace}/deployments/{name} | 
*DefaultApi* | [**patchNamespacedDeploymentConfig**](docs/DefaultApi.md#patchNamespacedDeploymentConfig) | **PATCH** /oapi/v1/namespaces/{namespace}/deploymentconfigs/{name} | 
*DefaultApi* | [**patchNamespacedDeploymentStatus**](docs/DefaultApi.md#patchNamespacedDeploymentStatus) | **PATCH** /apis/extensions/v1beta1/namespaces/{namespace}/deployments/{name}/status | 
*DefaultApi* | [**patchNamespacedEgressNetworkPolicy**](docs/DefaultApi.md#patchNamespacedEgressNetworkPolicy) | **PATCH** /oapi/v1/namespaces/{namespace}/egressnetworkpolicies/{name} | 
*DefaultApi* | [**patchNamespacedEndpoints**](docs/DefaultApi.md#patchNamespacedEndpoints) | **PATCH** /api/v1/namespaces/{namespace}/endpoints/{name} | 
*DefaultApi* | [**patchNamespacedEvent**](docs/DefaultApi.md#patchNamespacedEvent) | **PATCH** /api/v1/namespaces/{namespace}/events/{name} | 
*DefaultApi* | [**patchNamespacedImageStream**](docs/DefaultApi.md#patchNamespacedImageStream) | **PATCH** /oapi/v1/namespaces/{namespace}/imagestreams/{name} | 
*DefaultApi* | [**patchNamespacedImageStreamTag**](docs/DefaultApi.md#patchNamespacedImageStreamTag) | **PATCH** /oapi/v1/namespaces/{namespace}/imagestreamtags/{name} | 
*DefaultApi* | [**patchNamespacedIngress**](docs/DefaultApi.md#patchNamespacedIngress) | **PATCH** /apis/extensions/v1beta1/namespaces/{namespace}/ingresses/{name} | 
*DefaultApi* | [**patchNamespacedIngressStatus**](docs/DefaultApi.md#patchNamespacedIngressStatus) | **PATCH** /apis/extensions/v1beta1/namespaces/{namespace}/ingresses/{name}/status | 
*DefaultApi* | [**patchNamespacedLimitRange**](docs/DefaultApi.md#patchNamespacedLimitRange) | **PATCH** /api/v1/namespaces/{namespace}/limitranges/{name} | 
*DefaultApi* | [**patchNamespacedNetworkPolicy**](docs/DefaultApi.md#patchNamespacedNetworkPolicy) | **PATCH** /apis/extensions/v1beta1/namespaces/{namespace}/networkpolicies/{name} | 
*DefaultApi* | [**patchNamespacedPersistentVolumeClaim**](docs/DefaultApi.md#patchNamespacedPersistentVolumeClaim) | **PATCH** /api/v1/namespaces/{namespace}/persistentvolumeclaims/{name} | 
*DefaultApi* | [**patchNamespacedPersistentVolumeClaimStatus**](docs/DefaultApi.md#patchNamespacedPersistentVolumeClaimStatus) | **PATCH** /api/v1/namespaces/{namespace}/persistentvolumeclaims/{name}/status | 
*DefaultApi* | [**patchNamespacedPetSet**](docs/DefaultApi.md#patchNamespacedPetSet) | **PATCH** /apis/apps/v1alpha1/namespaces/{namespace}/petsets/{name} | 
*DefaultApi* | [**patchNamespacedPetSetStatus**](docs/DefaultApi.md#patchNamespacedPetSetStatus) | **PATCH** /apis/apps/v1alpha1/namespaces/{namespace}/petsets/{name}/status | 
*DefaultApi* | [**patchNamespacedPod**](docs/DefaultApi.md#patchNamespacedPod) | **PATCH** /api/v1/namespaces/{namespace}/pods/{name} | 
*DefaultApi* | [**patchNamespacedPodDisruptionBudget**](docs/DefaultApi.md#patchNamespacedPodDisruptionBudget) | **PATCH** /apis/policy/v1alpha1/namespaces/{namespace}/poddisruptionbudgets/{name} | 
*DefaultApi* | [**patchNamespacedPodDisruptionBudgetStatus**](docs/DefaultApi.md#patchNamespacedPodDisruptionBudgetStatus) | **PATCH** /apis/policy/v1alpha1/namespaces/{namespace}/poddisruptionbudgets/{name}/status | 
*DefaultApi* | [**patchNamespacedPodStatus**](docs/DefaultApi.md#patchNamespacedPodStatus) | **PATCH** /api/v1/namespaces/{namespace}/pods/{name}/status | 
*DefaultApi* | [**patchNamespacedPodTemplate**](docs/DefaultApi.md#patchNamespacedPodTemplate) | **PATCH** /api/v1/namespaces/{namespace}/podtemplates/{name} | 
*DefaultApi* | [**patchNamespacedPolicy**](docs/DefaultApi.md#patchNamespacedPolicy) | **PATCH** /oapi/v1/namespaces/{namespace}/policies/{name} | 
*DefaultApi* | [**patchNamespacedPolicyBinding**](docs/DefaultApi.md#patchNamespacedPolicyBinding) | **PATCH** /oapi/v1/namespaces/{namespace}/policybindings/{name} | 
*DefaultApi* | [**patchNamespacedReplicaSet**](docs/DefaultApi.md#patchNamespacedReplicaSet) | **PATCH** /apis/extensions/v1beta1/namespaces/{namespace}/replicasets/{name} | 
*DefaultApi* | [**patchNamespacedReplicaSetStatus**](docs/DefaultApi.md#patchNamespacedReplicaSetStatus) | **PATCH** /apis/extensions/v1beta1/namespaces/{namespace}/replicasets/{name}/status | 
*DefaultApi* | [**patchNamespacedReplicationController**](docs/DefaultApi.md#patchNamespacedReplicationController) | **PATCH** /api/v1/namespaces/{namespace}/replicationcontrollers/{name} | 
*DefaultApi* | [**patchNamespacedReplicationControllerStatus**](docs/DefaultApi.md#patchNamespacedReplicationControllerStatus) | **PATCH** /api/v1/namespaces/{namespace}/replicationcontrollers/{name}/status | 
*DefaultApi* | [**patchNamespacedResourceQuota**](docs/DefaultApi.md#patchNamespacedResourceQuota) | **PATCH** /api/v1/namespaces/{namespace}/resourcequotas/{name} | 
*DefaultApi* | [**patchNamespacedResourceQuotaStatus**](docs/DefaultApi.md#patchNamespacedResourceQuotaStatus) | **PATCH** /api/v1/namespaces/{namespace}/resourcequotas/{name}/status | 
*DefaultApi* | [**patchNamespacedRole**](docs/DefaultApi.md#patchNamespacedRole) | **PATCH** /oapi/v1/namespaces/{namespace}/roles/{name} | 
*DefaultApi* | [**patchNamespacedRoleBinding**](docs/DefaultApi.md#patchNamespacedRoleBinding) | **PATCH** /oapi/v1/namespaces/{namespace}/rolebindings/{name} | 
*DefaultApi* | [**patchNamespacedRoute**](docs/DefaultApi.md#patchNamespacedRoute) | **PATCH** /oapi/v1/namespaces/{namespace}/routes/{name} | 
*DefaultApi* | [**patchNamespacedScheduledJob**](docs/DefaultApi.md#patchNamespacedScheduledJob) | **PATCH** /apis/batch/v2alpha1/namespaces/{namespace}/scheduledjobs/{name} | 
*DefaultApi* | [**patchNamespacedScheduledJobStatus**](docs/DefaultApi.md#patchNamespacedScheduledJobStatus) | **PATCH** /apis/batch/v2alpha1/namespaces/{namespace}/scheduledjobs/{name}/status | 
*DefaultApi* | [**patchNamespacedSecret**](docs/DefaultApi.md#patchNamespacedSecret) | **PATCH** /api/v1/namespaces/{namespace}/secrets/{name} | 
*DefaultApi* | [**patchNamespacedService**](docs/DefaultApi.md#patchNamespacedService) | **PATCH** /api/v1/namespaces/{namespace}/services/{name} | 
*DefaultApi* | [**patchNamespacedServiceAccount**](docs/DefaultApi.md#patchNamespacedServiceAccount) | **PATCH** /api/v1/namespaces/{namespace}/serviceaccounts/{name} | 
*DefaultApi* | [**patchNamespacedServiceStatus**](docs/DefaultApi.md#patchNamespacedServiceStatus) | **PATCH** /api/v1/namespaces/{namespace}/services/{name}/status | 
*DefaultApi* | [**patchNamespacedTemplate**](docs/DefaultApi.md#patchNamespacedTemplate) | **PATCH** /oapi/v1/namespaces/{namespace}/templates/{name} | 
*DefaultApi* | [**patchNetNamespace**](docs/DefaultApi.md#patchNetNamespace) | **PATCH** /oapi/v1/netnamespaces/{name} | 
*DefaultApi* | [**patchNode**](docs/DefaultApi.md#patchNode) | **PATCH** /api/v1/nodes/{name} | 
*DefaultApi* | [**patchNodeStatus**](docs/DefaultApi.md#patchNodeStatus) | **PATCH** /api/v1/nodes/{name}/status | 
*DefaultApi* | [**patchOAuthAccessToken**](docs/DefaultApi.md#patchOAuthAccessToken) | **PATCH** /oapi/v1/oauthaccesstokens/{name} | 
*DefaultApi* | [**patchOAuthAuthorizeToken**](docs/DefaultApi.md#patchOAuthAuthorizeToken) | **PATCH** /oapi/v1/oauthauthorizetokens/{name} | 
*DefaultApi* | [**patchOAuthClient**](docs/DefaultApi.md#patchOAuthClient) | **PATCH** /oapi/v1/oauthclients/{name} | 
*DefaultApi* | [**patchOAuthClientAuthorization**](docs/DefaultApi.md#patchOAuthClientAuthorization) | **PATCH** /oapi/v1/oauthclientauthorizations/{name} | 
*DefaultApi* | [**patchPersistentVolume**](docs/DefaultApi.md#patchPersistentVolume) | **PATCH** /api/v1/persistentvolumes/{name} | 
*DefaultApi* | [**patchPersistentVolumeStatus**](docs/DefaultApi.md#patchPersistentVolumeStatus) | **PATCH** /api/v1/persistentvolumes/{name}/status | 
*DefaultApi* | [**patchPodSecurityPolicy**](docs/DefaultApi.md#patchPodSecurityPolicy) | **PATCH** /apis/extensions/v1beta1/podsecuritypolicies/{name} | 
*DefaultApi* | [**patchProject**](docs/DefaultApi.md#patchProject) | **PATCH** /oapi/v1/projects/{name} | 
*DefaultApi* | [**patchSecurityContextConstraints**](docs/DefaultApi.md#patchSecurityContextConstraints) | **PATCH** /api/v1/securitycontextconstraints/{name} | 
*DefaultApi* | [**patchStorageClass**](docs/DefaultApi.md#patchStorageClass) | **PATCH** /apis/storage.k8s.io/v1beta1/storageclasses/{name} | 
*DefaultApi* | [**patchThirdPartyResource**](docs/DefaultApi.md#patchThirdPartyResource) | **PATCH** /apis/extensions/v1beta1/thirdpartyresources/{name} | 
*DefaultApi* | [**patchUser**](docs/DefaultApi.md#patchUser) | **PATCH** /oapi/v1/users/{name} | 
*DefaultApi* | [**patchUserIdentityMapping**](docs/DefaultApi.md#patchUserIdentityMapping) | **PATCH** /oapi/v1/useridentitymappings/{name} | 
*DefaultApi* | [**proxyDELETENamespacedPod**](docs/DefaultApi.md#proxyDELETENamespacedPod) | **DELETE** /api/v1/proxy/namespaces/{namespace}/pods/{name} | 
*DefaultApi* | [**proxyDELETENamespacedPodWithPath**](docs/DefaultApi.md#proxyDELETENamespacedPodWithPath) | **DELETE** /api/v1/proxy/namespaces/{namespace}/pods/{name}/{path} | 
*DefaultApi* | [**proxyDELETENamespacedService**](docs/DefaultApi.md#proxyDELETENamespacedService) | **DELETE** /api/v1/proxy/namespaces/{namespace}/services/{name} | 
*DefaultApi* | [**proxyDELETENamespacedServiceWithPath**](docs/DefaultApi.md#proxyDELETENamespacedServiceWithPath) | **DELETE** /api/v1/proxy/namespaces/{namespace}/services/{name}/{path} | 
*DefaultApi* | [**proxyDELETENode**](docs/DefaultApi.md#proxyDELETENode) | **DELETE** /api/v1/proxy/nodes/{name} | 
*DefaultApi* | [**proxyDELETENodeWithPath**](docs/DefaultApi.md#proxyDELETENodeWithPath) | **DELETE** /api/v1/proxy/nodes/{name}/{path} | 
*DefaultApi* | [**proxyGETNamespacedPod**](docs/DefaultApi.md#proxyGETNamespacedPod) | **GET** /api/v1/proxy/namespaces/{namespace}/pods/{name} | 
*DefaultApi* | [**proxyGETNamespacedPodWithPath**](docs/DefaultApi.md#proxyGETNamespacedPodWithPath) | **GET** /api/v1/proxy/namespaces/{namespace}/pods/{name}/{path} | 
*DefaultApi* | [**proxyGETNamespacedService**](docs/DefaultApi.md#proxyGETNamespacedService) | **GET** /api/v1/proxy/namespaces/{namespace}/services/{name} | 
*DefaultApi* | [**proxyGETNamespacedServiceWithPath**](docs/DefaultApi.md#proxyGETNamespacedServiceWithPath) | **GET** /api/v1/proxy/namespaces/{namespace}/services/{name}/{path} | 
*DefaultApi* | [**proxyGETNode**](docs/DefaultApi.md#proxyGETNode) | **GET** /api/v1/proxy/nodes/{name} | 
*DefaultApi* | [**proxyGETNodeWithPath**](docs/DefaultApi.md#proxyGETNodeWithPath) | **GET** /api/v1/proxy/nodes/{name}/{path} | 
*DefaultApi* | [**proxyHEADNamespacedPod**](docs/DefaultApi.md#proxyHEADNamespacedPod) | **HEAD** /api/v1/proxy/namespaces/{namespace}/pods/{name} | 
*DefaultApi* | [**proxyHEADNamespacedPodWithPath**](docs/DefaultApi.md#proxyHEADNamespacedPodWithPath) | **HEAD** /api/v1/proxy/namespaces/{namespace}/pods/{name}/{path} | 
*DefaultApi* | [**proxyHEADNamespacedService**](docs/DefaultApi.md#proxyHEADNamespacedService) | **HEAD** /api/v1/proxy/namespaces/{namespace}/services/{name} | 
*DefaultApi* | [**proxyHEADNamespacedServiceWithPath**](docs/DefaultApi.md#proxyHEADNamespacedServiceWithPath) | **HEAD** /api/v1/proxy/namespaces/{namespace}/services/{name}/{path} | 
*DefaultApi* | [**proxyHEADNode**](docs/DefaultApi.md#proxyHEADNode) | **HEAD** /api/v1/proxy/nodes/{name} | 
*DefaultApi* | [**proxyHEADNodeWithPath**](docs/DefaultApi.md#proxyHEADNodeWithPath) | **HEAD** /api/v1/proxy/nodes/{name}/{path} | 
*DefaultApi* | [**proxyOPTIONSNamespacedPod**](docs/DefaultApi.md#proxyOPTIONSNamespacedPod) | **OPTIONS** /api/v1/proxy/namespaces/{namespace}/pods/{name} | 
*DefaultApi* | [**proxyOPTIONSNamespacedPodWithPath**](docs/DefaultApi.md#proxyOPTIONSNamespacedPodWithPath) | **OPTIONS** /api/v1/proxy/namespaces/{namespace}/pods/{name}/{path} | 
*DefaultApi* | [**proxyOPTIONSNamespacedService**](docs/DefaultApi.md#proxyOPTIONSNamespacedService) | **OPTIONS** /api/v1/proxy/namespaces/{namespace}/services/{name} | 
*DefaultApi* | [**proxyOPTIONSNamespacedServiceWithPath**](docs/DefaultApi.md#proxyOPTIONSNamespacedServiceWithPath) | **OPTIONS** /api/v1/proxy/namespaces/{namespace}/services/{name}/{path} | 
*DefaultApi* | [**proxyOPTIONSNode**](docs/DefaultApi.md#proxyOPTIONSNode) | **OPTIONS** /api/v1/proxy/nodes/{name} | 
*DefaultApi* | [**proxyOPTIONSNodeWithPath**](docs/DefaultApi.md#proxyOPTIONSNodeWithPath) | **OPTIONS** /api/v1/proxy/nodes/{name}/{path} | 
*DefaultApi* | [**proxyPOSTNamespacedPod**](docs/DefaultApi.md#proxyPOSTNamespacedPod) | **POST** /api/v1/proxy/namespaces/{namespace}/pods/{name} | 
*DefaultApi* | [**proxyPOSTNamespacedPodWithPath**](docs/DefaultApi.md#proxyPOSTNamespacedPodWithPath) | **POST** /api/v1/proxy/namespaces/{namespace}/pods/{name}/{path} | 
*DefaultApi* | [**proxyPOSTNamespacedService**](docs/DefaultApi.md#proxyPOSTNamespacedService) | **POST** /api/v1/proxy/namespaces/{namespace}/services/{name} | 
*DefaultApi* | [**proxyPOSTNamespacedServiceWithPath**](docs/DefaultApi.md#proxyPOSTNamespacedServiceWithPath) | **POST** /api/v1/proxy/namespaces/{namespace}/services/{name}/{path} | 
*DefaultApi* | [**proxyPOSTNode**](docs/DefaultApi.md#proxyPOSTNode) | **POST** /api/v1/proxy/nodes/{name} | 
*DefaultApi* | [**proxyPOSTNodeWithPath**](docs/DefaultApi.md#proxyPOSTNodeWithPath) | **POST** /api/v1/proxy/nodes/{name}/{path} | 
*DefaultApi* | [**proxyPUTNamespacedPod**](docs/DefaultApi.md#proxyPUTNamespacedPod) | **PUT** /api/v1/proxy/namespaces/{namespace}/pods/{name} | 
*DefaultApi* | [**proxyPUTNamespacedPodWithPath**](docs/DefaultApi.md#proxyPUTNamespacedPodWithPath) | **PUT** /api/v1/proxy/namespaces/{namespace}/pods/{name}/{path} | 
*DefaultApi* | [**proxyPUTNamespacedService**](docs/DefaultApi.md#proxyPUTNamespacedService) | **PUT** /api/v1/proxy/namespaces/{namespace}/services/{name} | 
*DefaultApi* | [**proxyPUTNamespacedServiceWithPath**](docs/DefaultApi.md#proxyPUTNamespacedServiceWithPath) | **PUT** /api/v1/proxy/namespaces/{namespace}/services/{name}/{path} | 
*DefaultApi* | [**proxyPUTNode**](docs/DefaultApi.md#proxyPUTNode) | **PUT** /api/v1/proxy/nodes/{name} | 
*DefaultApi* | [**proxyPUTNodeWithPath**](docs/DefaultApi.md#proxyPUTNodeWithPath) | **PUT** /api/v1/proxy/nodes/{name}/{path} | 
*DefaultApi* | [**readCertificateSigningRequest**](docs/DefaultApi.md#readCertificateSigningRequest) | **GET** /apis/certificates.k8s.io/v1alpha1/certificatesigningrequests/{name} | 
*DefaultApi* | [**readClusterNetwork**](docs/DefaultApi.md#readClusterNetwork) | **GET** /oapi/v1/clusternetworks/{name} | 
*DefaultApi* | [**readClusterPolicy**](docs/DefaultApi.md#readClusterPolicy) | **GET** /oapi/v1/clusterpolicies/{name} | 
*DefaultApi* | [**readClusterPolicyBinding**](docs/DefaultApi.md#readClusterPolicyBinding) | **GET** /oapi/v1/clusterpolicybindings/{name} | 
*DefaultApi* | [**readClusterResourceQuota**](docs/DefaultApi.md#readClusterResourceQuota) | **GET** /oapi/v1/clusterresourcequotas/{name} | 
*DefaultApi* | [**readClusterResourceQuotaStatus**](docs/DefaultApi.md#readClusterResourceQuotaStatus) | **GET** /oapi/v1/clusterresourcequotas/{name}/status | 
*DefaultApi* | [**readClusterRole**](docs/DefaultApi.md#readClusterRole) | **GET** /oapi/v1/clusterroles/{name} | 
*DefaultApi* | [**readClusterRoleBinding**](docs/DefaultApi.md#readClusterRoleBinding) | **GET** /oapi/v1/clusterrolebindings/{name} | 
*DefaultApi* | [**readComponentStatus**](docs/DefaultApi.md#readComponentStatus) | **GET** /api/v1/componentstatuses/{name} | 
*DefaultApi* | [**readGroup**](docs/DefaultApi.md#readGroup) | **GET** /oapi/v1/groups/{name} | 
*DefaultApi* | [**readHostSubnet**](docs/DefaultApi.md#readHostSubnet) | **GET** /oapi/v1/hostsubnets/{name} | 
*DefaultApi* | [**readIdentity**](docs/DefaultApi.md#readIdentity) | **GET** /oapi/v1/identities/{name} | 
*DefaultApi* | [**readImage**](docs/DefaultApi.md#readImage) | **GET** /oapi/v1/images/{name} | 
*DefaultApi* | [**readNamespace**](docs/DefaultApi.md#readNamespace) | **GET** /api/v1/namespaces/{name} | 
*DefaultApi* | [**readNamespaceStatus**](docs/DefaultApi.md#readNamespaceStatus) | **GET** /api/v1/namespaces/{name}/status | 
*DefaultApi* | [**readNamespacedAppliedClusterResourceQuota**](docs/DefaultApi.md#readNamespacedAppliedClusterResourceQuota) | **GET** /oapi/v1/namespaces/{namespace}/appliedclusterresourcequotas/{name} | 
*DefaultApi* | [**readNamespacedBuild**](docs/DefaultApi.md#readNamespacedBuild) | **GET** /oapi/v1/namespaces/{namespace}/builds/{name} | 
*DefaultApi* | [**readNamespacedBuildConfig**](docs/DefaultApi.md#readNamespacedBuildConfig) | **GET** /oapi/v1/namespaces/{namespace}/buildconfigs/{name} | 
*DefaultApi* | [**readNamespacedBuildLogLog**](docs/DefaultApi.md#readNamespacedBuildLogLog) | **GET** /oapi/v1/namespaces/{namespace}/builds/{name}/log | 
*DefaultApi* | [**readNamespacedConfigMap**](docs/DefaultApi.md#readNamespacedConfigMap) | **GET** /api/v1/namespaces/{namespace}/configmaps/{name} | 
*DefaultApi* | [**readNamespacedDaemonSet**](docs/DefaultApi.md#readNamespacedDaemonSet) | **GET** /apis/extensions/v1beta1/namespaces/{namespace}/daemonsets/{name} | 
*DefaultApi* | [**readNamespacedDaemonSetStatus**](docs/DefaultApi.md#readNamespacedDaemonSetStatus) | **GET** /apis/extensions/v1beta1/namespaces/{namespace}/daemonsets/{name}/status | 
*DefaultApi* | [**readNamespacedDeployment**](docs/DefaultApi.md#readNamespacedDeployment) | **GET** /apis/extensions/v1beta1/namespaces/{namespace}/deployments/{name} | 
*DefaultApi* | [**readNamespacedDeploymentLogLog**](docs/DefaultApi.md#readNamespacedDeploymentLogLog) | **GET** /oapi/v1/namespaces/{namespace}/deploymentconfigs/{name}/log | 
*DefaultApi* | [**readNamespacedDeploymentStatus**](docs/DefaultApi.md#readNamespacedDeploymentStatus) | **GET** /apis/extensions/v1beta1/namespaces/{namespace}/deployments/{name}/status | 
*DefaultApi* | [**readNamespacedEgressNetworkPolicy**](docs/DefaultApi.md#readNamespacedEgressNetworkPolicy) | **GET** /oapi/v1/namespaces/{namespace}/egressnetworkpolicies/{name} | 
*DefaultApi* | [**readNamespacedEndpoints**](docs/DefaultApi.md#readNamespacedEndpoints) | **GET** /api/v1/namespaces/{namespace}/endpoints/{name} | 
*DefaultApi* | [**readNamespacedEvent**](docs/DefaultApi.md#readNamespacedEvent) | **GET** /api/v1/namespaces/{namespace}/events/{name} | 
*DefaultApi* | [**readNamespacedImageStream**](docs/DefaultApi.md#readNamespacedImageStream) | **GET** /oapi/v1/namespaces/{namespace}/imagestreams/{name} | 
*DefaultApi* | [**readNamespacedImageStreamImage**](docs/DefaultApi.md#readNamespacedImageStreamImage) | **GET** /oapi/v1/namespaces/{namespace}/imagestreamimages/{name} | 
*DefaultApi* | [**readNamespacedImageStreamTag**](docs/DefaultApi.md#readNamespacedImageStreamTag) | **GET** /oapi/v1/namespaces/{namespace}/imagestreamtags/{name} | 
*DefaultApi* | [**readNamespacedIngress**](docs/DefaultApi.md#readNamespacedIngress) | **GET** /apis/extensions/v1beta1/namespaces/{namespace}/ingresses/{name} | 
*DefaultApi* | [**readNamespacedIngressStatus**](docs/DefaultApi.md#readNamespacedIngressStatus) | **GET** /apis/extensions/v1beta1/namespaces/{namespace}/ingresses/{name}/status | 
*DefaultApi* | [**readNamespacedLimitRange**](docs/DefaultApi.md#readNamespacedLimitRange) | **GET** /api/v1/namespaces/{namespace}/limitranges/{name} | 
*DefaultApi* | [**readNamespacedNetworkPolicy**](docs/DefaultApi.md#readNamespacedNetworkPolicy) | **GET** /apis/extensions/v1beta1/namespaces/{namespace}/networkpolicies/{name} | 
*DefaultApi* | [**readNamespacedPersistentVolumeClaim**](docs/DefaultApi.md#readNamespacedPersistentVolumeClaim) | **GET** /api/v1/namespaces/{namespace}/persistentvolumeclaims/{name} | 
*DefaultApi* | [**readNamespacedPersistentVolumeClaimStatus**](docs/DefaultApi.md#readNamespacedPersistentVolumeClaimStatus) | **GET** /api/v1/namespaces/{namespace}/persistentvolumeclaims/{name}/status | 
*DefaultApi* | [**readNamespacedPetSet**](docs/DefaultApi.md#readNamespacedPetSet) | **GET** /apis/apps/v1alpha1/namespaces/{namespace}/petsets/{name} | 
*DefaultApi* | [**readNamespacedPetSetStatus**](docs/DefaultApi.md#readNamespacedPetSetStatus) | **GET** /apis/apps/v1alpha1/namespaces/{namespace}/petsets/{name}/status | 
*DefaultApi* | [**readNamespacedPod**](docs/DefaultApi.md#readNamespacedPod) | **GET** /api/v1/namespaces/{namespace}/pods/{name} | 
*DefaultApi* | [**readNamespacedPodDisruptionBudget**](docs/DefaultApi.md#readNamespacedPodDisruptionBudget) | **GET** /apis/policy/v1alpha1/namespaces/{namespace}/poddisruptionbudgets/{name} | 
*DefaultApi* | [**readNamespacedPodDisruptionBudgetStatus**](docs/DefaultApi.md#readNamespacedPodDisruptionBudgetStatus) | **GET** /apis/policy/v1alpha1/namespaces/{namespace}/poddisruptionbudgets/{name}/status | 
*DefaultApi* | [**readNamespacedPodLog**](docs/DefaultApi.md#readNamespacedPodLog) | **GET** /api/v1/namespaces/{namespace}/pods/{name}/log | 
*DefaultApi* | [**readNamespacedPodStatus**](docs/DefaultApi.md#readNamespacedPodStatus) | **GET** /api/v1/namespaces/{namespace}/pods/{name}/status | 
*DefaultApi* | [**readNamespacedPodTemplate**](docs/DefaultApi.md#readNamespacedPodTemplate) | **GET** /api/v1/namespaces/{namespace}/podtemplates/{name} | 
*DefaultApi* | [**readNamespacedPolicy**](docs/DefaultApi.md#readNamespacedPolicy) | **GET** /oapi/v1/namespaces/{namespace}/policies/{name} | 
*DefaultApi* | [**readNamespacedPolicyBinding**](docs/DefaultApi.md#readNamespacedPolicyBinding) | **GET** /oapi/v1/namespaces/{namespace}/policybindings/{name} | 
*DefaultApi* | [**readNamespacedReplicaSet**](docs/DefaultApi.md#readNamespacedReplicaSet) | **GET** /apis/extensions/v1beta1/namespaces/{namespace}/replicasets/{name} | 
*DefaultApi* | [**readNamespacedReplicaSetStatus**](docs/DefaultApi.md#readNamespacedReplicaSetStatus) | **GET** /apis/extensions/v1beta1/namespaces/{namespace}/replicasets/{name}/status | 
*DefaultApi* | [**readNamespacedReplicationController**](docs/DefaultApi.md#readNamespacedReplicationController) | **GET** /api/v1/namespaces/{namespace}/replicationcontrollers/{name} | 
*DefaultApi* | [**readNamespacedReplicationControllerStatus**](docs/DefaultApi.md#readNamespacedReplicationControllerStatus) | **GET** /api/v1/namespaces/{namespace}/replicationcontrollers/{name}/status | 
*DefaultApi* | [**readNamespacedResourceQuota**](docs/DefaultApi.md#readNamespacedResourceQuota) | **GET** /api/v1/namespaces/{namespace}/resourcequotas/{name} | 
*DefaultApi* | [**readNamespacedResourceQuotaStatus**](docs/DefaultApi.md#readNamespacedResourceQuotaStatus) | **GET** /api/v1/namespaces/{namespace}/resourcequotas/{name}/status | 
*DefaultApi* | [**readNamespacedRole**](docs/DefaultApi.md#readNamespacedRole) | **GET** /oapi/v1/namespaces/{namespace}/roles/{name} | 
*DefaultApi* | [**readNamespacedRoleBinding**](docs/DefaultApi.md#readNamespacedRoleBinding) | **GET** /oapi/v1/namespaces/{namespace}/rolebindings/{name} | 
*DefaultApi* | [**readNamespacedRoute**](docs/DefaultApi.md#readNamespacedRoute) | **GET** /oapi/v1/namespaces/{namespace}/routes/{name} | 
*DefaultApi* | [**readNamespacedScheduledJob**](docs/DefaultApi.md#readNamespacedScheduledJob) | **GET** /apis/batch/v2alpha1/namespaces/{namespace}/scheduledjobs/{name} | 
*DefaultApi* | [**readNamespacedScheduledJobStatus**](docs/DefaultApi.md#readNamespacedScheduledJobStatus) | **GET** /apis/batch/v2alpha1/namespaces/{namespace}/scheduledjobs/{name}/status | 
*DefaultApi* | [**readNamespacedSecret**](docs/DefaultApi.md#readNamespacedSecret) | **GET** /api/v1/namespaces/{namespace}/secrets/{name} | 
*DefaultApi* | [**readNamespacedSecretListSecrets**](docs/DefaultApi.md#readNamespacedSecretListSecrets) | **GET** /oapi/v1/namespaces/{namespace}/imagestreams/{name}/secrets | 
*DefaultApi* | [**readNamespacedService**](docs/DefaultApi.md#readNamespacedService) | **GET** /api/v1/namespaces/{namespace}/services/{name} | 
*DefaultApi* | [**readNamespacedServiceAccount**](docs/DefaultApi.md#readNamespacedServiceAccount) | **GET** /api/v1/namespaces/{namespace}/serviceaccounts/{name} | 
*DefaultApi* | [**readNamespacedServiceStatus**](docs/DefaultApi.md#readNamespacedServiceStatus) | **GET** /api/v1/namespaces/{namespace}/services/{name}/status | 
*DefaultApi* | [**readNamespacedTemplate**](docs/DefaultApi.md#readNamespacedTemplate) | **GET** /oapi/v1/namespaces/{namespace}/templates/{name} | 
*DefaultApi* | [**readNetNamespace**](docs/DefaultApi.md#readNetNamespace) | **GET** /oapi/v1/netnamespaces/{name} | 
*DefaultApi* | [**readNode**](docs/DefaultApi.md#readNode) | **GET** /api/v1/nodes/{name} | 
*DefaultApi* | [**readNodeStatus**](docs/DefaultApi.md#readNodeStatus) | **GET** /api/v1/nodes/{name}/status | 
*DefaultApi* | [**readOAuthAccessToken**](docs/DefaultApi.md#readOAuthAccessToken) | **GET** /oapi/v1/oauthaccesstokens/{name} | 
*DefaultApi* | [**readOAuthAuthorizeToken**](docs/DefaultApi.md#readOAuthAuthorizeToken) | **GET** /oapi/v1/oauthauthorizetokens/{name} | 
*DefaultApi* | [**readOAuthClient**](docs/DefaultApi.md#readOAuthClient) | **GET** /oapi/v1/oauthclients/{name} | 
*DefaultApi* | [**readOAuthClientAuthorization**](docs/DefaultApi.md#readOAuthClientAuthorization) | **GET** /oapi/v1/oauthclientauthorizations/{name} | 
*DefaultApi* | [**readPersistentVolume**](docs/DefaultApi.md#readPersistentVolume) | **GET** /api/v1/persistentvolumes/{name} | 
*DefaultApi* | [**readPersistentVolumeStatus**](docs/DefaultApi.md#readPersistentVolumeStatus) | **GET** /api/v1/persistentvolumes/{name}/status | 
*DefaultApi* | [**readPodSecurityPolicy**](docs/DefaultApi.md#readPodSecurityPolicy) | **GET** /apis/extensions/v1beta1/podsecuritypolicies/{name} | 
*DefaultApi* | [**readProject**](docs/DefaultApi.md#readProject) | **GET** /oapi/v1/projects/{name} | 
*DefaultApi* | [**readSecurityContextConstraints**](docs/DefaultApi.md#readSecurityContextConstraints) | **GET** /api/v1/securitycontextconstraints/{name} | 
*DefaultApi* | [**readStorageClass**](docs/DefaultApi.md#readStorageClass) | **GET** /apis/storage.k8s.io/v1beta1/storageclasses/{name} | 
*DefaultApi* | [**readThirdPartyResource**](docs/DefaultApi.md#readThirdPartyResource) | **GET** /apis/extensions/v1beta1/thirdpartyresources/{name} | 
*DefaultApi* | [**readUser**](docs/DefaultApi.md#readUser) | **GET** /oapi/v1/users/{name} | 
*DefaultApi* | [**readUserIdentityMapping**](docs/DefaultApi.md#readUserIdentityMapping) | **GET** /oapi/v1/useridentitymappings/{name} | 
*DefaultApi* | [**replaceCertificateSigningRequest**](docs/DefaultApi.md#replaceCertificateSigningRequest) | **PUT** /apis/certificates.k8s.io/v1alpha1/certificatesigningrequests/{name} | 
*DefaultApi* | [**replaceCertificateSigningRequestApproval**](docs/DefaultApi.md#replaceCertificateSigningRequestApproval) | **PUT** /apis/certificates.k8s.io/v1alpha1/certificatesigningrequests/{name}/approval | 
*DefaultApi* | [**replaceCertificateSigningRequestStatus**](docs/DefaultApi.md#replaceCertificateSigningRequestStatus) | **PUT** /apis/certificates.k8s.io/v1alpha1/certificatesigningrequests/{name}/status | 
*DefaultApi* | [**replaceClusterNetwork**](docs/DefaultApi.md#replaceClusterNetwork) | **PUT** /oapi/v1/clusternetworks/{name} | 
*DefaultApi* | [**replaceClusterPolicy**](docs/DefaultApi.md#replaceClusterPolicy) | **PUT** /oapi/v1/clusterpolicies/{name} | 
*DefaultApi* | [**replaceClusterPolicyBinding**](docs/DefaultApi.md#replaceClusterPolicyBinding) | **PUT** /oapi/v1/clusterpolicybindings/{name} | 
*DefaultApi* | [**replaceClusterResourceQuota**](docs/DefaultApi.md#replaceClusterResourceQuota) | **PUT** /oapi/v1/clusterresourcequotas/{name} | 
*DefaultApi* | [**replaceClusterResourceQuotaStatus**](docs/DefaultApi.md#replaceClusterResourceQuotaStatus) | **PUT** /oapi/v1/clusterresourcequotas/{name}/status | 
*DefaultApi* | [**replaceClusterRole**](docs/DefaultApi.md#replaceClusterRole) | **PUT** /oapi/v1/clusterroles/{name} | 
*DefaultApi* | [**replaceClusterRoleBinding**](docs/DefaultApi.md#replaceClusterRoleBinding) | **PUT** /oapi/v1/clusterrolebindings/{name} | 
*DefaultApi* | [**replaceGroup**](docs/DefaultApi.md#replaceGroup) | **PUT** /oapi/v1/groups/{name} | 
*DefaultApi* | [**replaceHostSubnet**](docs/DefaultApi.md#replaceHostSubnet) | **PUT** /oapi/v1/hostsubnets/{name} | 
*DefaultApi* | [**replaceIdentity**](docs/DefaultApi.md#replaceIdentity) | **PUT** /oapi/v1/identities/{name} | 
*DefaultApi* | [**replaceImage**](docs/DefaultApi.md#replaceImage) | **PUT** /oapi/v1/images/{name} | 
*DefaultApi* | [**replaceNamespace**](docs/DefaultApi.md#replaceNamespace) | **PUT** /api/v1/namespaces/{name} | 
*DefaultApi* | [**replaceNamespaceFinalize**](docs/DefaultApi.md#replaceNamespaceFinalize) | **PUT** /api/v1/namespaces/{name}/finalize | 
*DefaultApi* | [**replaceNamespaceStatus**](docs/DefaultApi.md#replaceNamespaceStatus) | **PUT** /api/v1/namespaces/{name}/status | 
*DefaultApi* | [**replaceNamespacedBuild**](docs/DefaultApi.md#replaceNamespacedBuild) | **PUT** /oapi/v1/namespaces/{namespace}/builds/{name} | 
*DefaultApi* | [**replaceNamespacedBuildConfig**](docs/DefaultApi.md#replaceNamespacedBuildConfig) | **PUT** /oapi/v1/namespaces/{namespace}/buildconfigs/{name} | 
*DefaultApi* | [**replaceNamespacedBuildDetails**](docs/DefaultApi.md#replaceNamespacedBuildDetails) | **PUT** /oapi/v1/namespaces/{namespace}/builds/{name}/details | 
*DefaultApi* | [**replaceNamespacedConfigMap**](docs/DefaultApi.md#replaceNamespacedConfigMap) | **PUT** /api/v1/namespaces/{namespace}/configmaps/{name} | 
*DefaultApi* | [**replaceNamespacedDaemonSet**](docs/DefaultApi.md#replaceNamespacedDaemonSet) | **PUT** /apis/extensions/v1beta1/namespaces/{namespace}/daemonsets/{name} | 
*DefaultApi* | [**replaceNamespacedDaemonSetStatus**](docs/DefaultApi.md#replaceNamespacedDaemonSetStatus) | **PUT** /apis/extensions/v1beta1/namespaces/{namespace}/daemonsets/{name}/status | 
*DefaultApi* | [**replaceNamespacedDeployment**](docs/DefaultApi.md#replaceNamespacedDeployment) | **PUT** /apis/extensions/v1beta1/namespaces/{namespace}/deployments/{name} | 
*DefaultApi* | [**replaceNamespacedDeploymentConfig**](docs/DefaultApi.md#replaceNamespacedDeploymentConfig) | **PUT** /oapi/v1/namespaces/{namespace}/deploymentconfigs/{name} | 
*DefaultApi* | [**replaceNamespacedDeploymentConfigStatus**](docs/DefaultApi.md#replaceNamespacedDeploymentConfigStatus) | **PUT** /oapi/v1/namespaces/{namespace}/deploymentconfigs/{name}/status | 
*DefaultApi* | [**replaceNamespacedDeploymentStatus**](docs/DefaultApi.md#replaceNamespacedDeploymentStatus) | **PUT** /apis/extensions/v1beta1/namespaces/{namespace}/deployments/{name}/status | 
*DefaultApi* | [**replaceNamespacedEgressNetworkPolicy**](docs/DefaultApi.md#replaceNamespacedEgressNetworkPolicy) | **PUT** /oapi/v1/namespaces/{namespace}/egressnetworkpolicies/{name} | 
*DefaultApi* | [**replaceNamespacedEndpoints**](docs/DefaultApi.md#replaceNamespacedEndpoints) | **PUT** /api/v1/namespaces/{namespace}/endpoints/{name} | 
*DefaultApi* | [**replaceNamespacedEvent**](docs/DefaultApi.md#replaceNamespacedEvent) | **PUT** /api/v1/namespaces/{namespace}/events/{name} | 
*DefaultApi* | [**replaceNamespacedImageStream**](docs/DefaultApi.md#replaceNamespacedImageStream) | **PUT** /oapi/v1/namespaces/{namespace}/imagestreams/{name} | 
*DefaultApi* | [**replaceNamespacedImageStreamStatus**](docs/DefaultApi.md#replaceNamespacedImageStreamStatus) | **PUT** /oapi/v1/namespaces/{namespace}/imagestreams/{name}/status | 
*DefaultApi* | [**replaceNamespacedImageStreamTag**](docs/DefaultApi.md#replaceNamespacedImageStreamTag) | **PUT** /oapi/v1/namespaces/{namespace}/imagestreamtags/{name} | 
*DefaultApi* | [**replaceNamespacedIngress**](docs/DefaultApi.md#replaceNamespacedIngress) | **PUT** /apis/extensions/v1beta1/namespaces/{namespace}/ingresses/{name} | 
*DefaultApi* | [**replaceNamespacedIngressStatus**](docs/DefaultApi.md#replaceNamespacedIngressStatus) | **PUT** /apis/extensions/v1beta1/namespaces/{namespace}/ingresses/{name}/status | 
*DefaultApi* | [**replaceNamespacedLimitRange**](docs/DefaultApi.md#replaceNamespacedLimitRange) | **PUT** /api/v1/namespaces/{namespace}/limitranges/{name} | 
*DefaultApi* | [**replaceNamespacedNetworkPolicy**](docs/DefaultApi.md#replaceNamespacedNetworkPolicy) | **PUT** /apis/extensions/v1beta1/namespaces/{namespace}/networkpolicies/{name} | 
*DefaultApi* | [**replaceNamespacedPersistentVolumeClaim**](docs/DefaultApi.md#replaceNamespacedPersistentVolumeClaim) | **PUT** /api/v1/namespaces/{namespace}/persistentvolumeclaims/{name} | 
*DefaultApi* | [**replaceNamespacedPersistentVolumeClaimStatus**](docs/DefaultApi.md#replaceNamespacedPersistentVolumeClaimStatus) | **PUT** /api/v1/namespaces/{namespace}/persistentvolumeclaims/{name}/status | 
*DefaultApi* | [**replaceNamespacedPetSet**](docs/DefaultApi.md#replaceNamespacedPetSet) | **PUT** /apis/apps/v1alpha1/namespaces/{namespace}/petsets/{name} | 
*DefaultApi* | [**replaceNamespacedPetSetStatus**](docs/DefaultApi.md#replaceNamespacedPetSetStatus) | **PUT** /apis/apps/v1alpha1/namespaces/{namespace}/petsets/{name}/status | 
*DefaultApi* | [**replaceNamespacedPod**](docs/DefaultApi.md#replaceNamespacedPod) | **PUT** /api/v1/namespaces/{namespace}/pods/{name} | 
*DefaultApi* | [**replaceNamespacedPodDisruptionBudget**](docs/DefaultApi.md#replaceNamespacedPodDisruptionBudget) | **PUT** /apis/policy/v1alpha1/namespaces/{namespace}/poddisruptionbudgets/{name} | 
*DefaultApi* | [**replaceNamespacedPodDisruptionBudgetStatus**](docs/DefaultApi.md#replaceNamespacedPodDisruptionBudgetStatus) | **PUT** /apis/policy/v1alpha1/namespaces/{namespace}/poddisruptionbudgets/{name}/status | 
*DefaultApi* | [**replaceNamespacedPodStatus**](docs/DefaultApi.md#replaceNamespacedPodStatus) | **PUT** /api/v1/namespaces/{namespace}/pods/{name}/status | 
*DefaultApi* | [**replaceNamespacedPodTemplate**](docs/DefaultApi.md#replaceNamespacedPodTemplate) | **PUT** /api/v1/namespaces/{namespace}/podtemplates/{name} | 
*DefaultApi* | [**replaceNamespacedPolicy**](docs/DefaultApi.md#replaceNamespacedPolicy) | **PUT** /oapi/v1/namespaces/{namespace}/policies/{name} | 
*DefaultApi* | [**replaceNamespacedPolicyBinding**](docs/DefaultApi.md#replaceNamespacedPolicyBinding) | **PUT** /oapi/v1/namespaces/{namespace}/policybindings/{name} | 
*DefaultApi* | [**replaceNamespacedReplicaSet**](docs/DefaultApi.md#replaceNamespacedReplicaSet) | **PUT** /apis/extensions/v1beta1/namespaces/{namespace}/replicasets/{name} | 
*DefaultApi* | [**replaceNamespacedReplicaSetStatus**](docs/DefaultApi.md#replaceNamespacedReplicaSetStatus) | **PUT** /apis/extensions/v1beta1/namespaces/{namespace}/replicasets/{name}/status | 
*DefaultApi* | [**replaceNamespacedReplicationController**](docs/DefaultApi.md#replaceNamespacedReplicationController) | **PUT** /api/v1/namespaces/{namespace}/replicationcontrollers/{name} | 
*DefaultApi* | [**replaceNamespacedReplicationControllerStatus**](docs/DefaultApi.md#replaceNamespacedReplicationControllerStatus) | **PUT** /api/v1/namespaces/{namespace}/replicationcontrollers/{name}/status | 
*DefaultApi* | [**replaceNamespacedResourceQuota**](docs/DefaultApi.md#replaceNamespacedResourceQuota) | **PUT** /api/v1/namespaces/{namespace}/resourcequotas/{name} | 
*DefaultApi* | [**replaceNamespacedResourceQuotaStatus**](docs/DefaultApi.md#replaceNamespacedResourceQuotaStatus) | **PUT** /api/v1/namespaces/{namespace}/resourcequotas/{name}/status | 
*DefaultApi* | [**replaceNamespacedRole**](docs/DefaultApi.md#replaceNamespacedRole) | **PUT** /oapi/v1/namespaces/{namespace}/roles/{name} | 
*DefaultApi* | [**replaceNamespacedRoleBinding**](docs/DefaultApi.md#replaceNamespacedRoleBinding) | **PUT** /oapi/v1/namespaces/{namespace}/rolebindings/{name} | 
*DefaultApi* | [**replaceNamespacedRoute**](docs/DefaultApi.md#replaceNamespacedRoute) | **PUT** /oapi/v1/namespaces/{namespace}/routes/{name} | 
*DefaultApi* | [**replaceNamespacedRouteStatus**](docs/DefaultApi.md#replaceNamespacedRouteStatus) | **PUT** /oapi/v1/namespaces/{namespace}/routes/{name}/status | 
*DefaultApi* | [**replaceNamespacedScheduledJob**](docs/DefaultApi.md#replaceNamespacedScheduledJob) | **PUT** /apis/batch/v2alpha1/namespaces/{namespace}/scheduledjobs/{name} | 
*DefaultApi* | [**replaceNamespacedScheduledJobStatus**](docs/DefaultApi.md#replaceNamespacedScheduledJobStatus) | **PUT** /apis/batch/v2alpha1/namespaces/{namespace}/scheduledjobs/{name}/status | 
*DefaultApi* | [**replaceNamespacedSecret**](docs/DefaultApi.md#replaceNamespacedSecret) | **PUT** /api/v1/namespaces/{namespace}/secrets/{name} | 
*DefaultApi* | [**replaceNamespacedService**](docs/DefaultApi.md#replaceNamespacedService) | **PUT** /api/v1/namespaces/{namespace}/services/{name} | 
*DefaultApi* | [**replaceNamespacedServiceAccount**](docs/DefaultApi.md#replaceNamespacedServiceAccount) | **PUT** /api/v1/namespaces/{namespace}/serviceaccounts/{name} | 
*DefaultApi* | [**replaceNamespacedServiceStatus**](docs/DefaultApi.md#replaceNamespacedServiceStatus) | **PUT** /api/v1/namespaces/{namespace}/services/{name}/status | 
*DefaultApi* | [**replaceNamespacedTemplate**](docs/DefaultApi.md#replaceNamespacedTemplate) | **PUT** /oapi/v1/namespaces/{namespace}/templates/{name} | 
*DefaultApi* | [**replaceNetNamespace**](docs/DefaultApi.md#replaceNetNamespace) | **PUT** /oapi/v1/netnamespaces/{name} | 
*DefaultApi* | [**replaceNode**](docs/DefaultApi.md#replaceNode) | **PUT** /api/v1/nodes/{name} | 
*DefaultApi* | [**replaceNodeStatus**](docs/DefaultApi.md#replaceNodeStatus) | **PUT** /api/v1/nodes/{name}/status | 
*DefaultApi* | [**replaceOAuthAccessToken**](docs/DefaultApi.md#replaceOAuthAccessToken) | **PUT** /oapi/v1/oauthaccesstokens/{name} | 
*DefaultApi* | [**replaceOAuthAuthorizeToken**](docs/DefaultApi.md#replaceOAuthAuthorizeToken) | **PUT** /oapi/v1/oauthauthorizetokens/{name} | 
*DefaultApi* | [**replaceOAuthClient**](docs/DefaultApi.md#replaceOAuthClient) | **PUT** /oapi/v1/oauthclients/{name} | 
*DefaultApi* | [**replaceOAuthClientAuthorization**](docs/DefaultApi.md#replaceOAuthClientAuthorization) | **PUT** /oapi/v1/oauthclientauthorizations/{name} | 
*DefaultApi* | [**replacePersistentVolume**](docs/DefaultApi.md#replacePersistentVolume) | **PUT** /api/v1/persistentvolumes/{name} | 
*DefaultApi* | [**replacePersistentVolumeStatus**](docs/DefaultApi.md#replacePersistentVolumeStatus) | **PUT** /api/v1/persistentvolumes/{name}/status | 
*DefaultApi* | [**replacePodSecurityPolicy**](docs/DefaultApi.md#replacePodSecurityPolicy) | **PUT** /apis/extensions/v1beta1/podsecuritypolicies/{name} | 
*DefaultApi* | [**replaceProject**](docs/DefaultApi.md#replaceProject) | **PUT** /oapi/v1/projects/{name} | 
*DefaultApi* | [**replaceSecurityContextConstraints**](docs/DefaultApi.md#replaceSecurityContextConstraints) | **PUT** /api/v1/securitycontextconstraints/{name} | 
*DefaultApi* | [**replaceStorageClass**](docs/DefaultApi.md#replaceStorageClass) | **PUT** /apis/storage.k8s.io/v1beta1/storageclasses/{name} | 
*DefaultApi* | [**replaceThirdPartyResource**](docs/DefaultApi.md#replaceThirdPartyResource) | **PUT** /apis/extensions/v1beta1/thirdpartyresources/{name} | 
*DefaultApi* | [**replaceUser**](docs/DefaultApi.md#replaceUser) | **PUT** /oapi/v1/users/{name} | 
*DefaultApi* | [**replaceUserIdentityMapping**](docs/DefaultApi.md#replaceUserIdentityMapping) | **PUT** /oapi/v1/useridentitymappings/{name} | 
*DefaultApi* | [**versionGet**](docs/DefaultApi.md#versionGet) | **GET** /version/ | 
*DefaultApi* | [**versionOpenshiftGet**](docs/DefaultApi.md#versionOpenshiftGet) | **GET** /version/openshift/ | 
*DefaultApi* | [**watchBuildConfigListForAllNamespaces**](docs/DefaultApi.md#watchBuildConfigListForAllNamespaces) | **GET** /oapi/v1/watch/buildconfigs | 
*DefaultApi* | [**watchBuildListForAllNamespaces**](docs/DefaultApi.md#watchBuildListForAllNamespaces) | **GET** /oapi/v1/watch/builds | 
*DefaultApi* | [**watchCertificateSigningRequest**](docs/DefaultApi.md#watchCertificateSigningRequest) | **GET** /apis/certificates.k8s.io/v1alpha1/watch/certificatesigningrequests/{name} | 
*DefaultApi* | [**watchCertificateSigningRequestList**](docs/DefaultApi.md#watchCertificateSigningRequestList) | **GET** /apis/certificates.k8s.io/v1alpha1/watch/certificatesigningrequests | 
*DefaultApi* | [**watchClusterNetwork**](docs/DefaultApi.md#watchClusterNetwork) | **GET** /oapi/v1/watch/clusternetworks/{name} | 
*DefaultApi* | [**watchClusterNetworkList**](docs/DefaultApi.md#watchClusterNetworkList) | **GET** /oapi/v1/watch/clusternetworks | 
*DefaultApi* | [**watchClusterPolicy**](docs/DefaultApi.md#watchClusterPolicy) | **GET** /oapi/v1/watch/clusterpolicies/{name} | 
*DefaultApi* | [**watchClusterPolicyBinding**](docs/DefaultApi.md#watchClusterPolicyBinding) | **GET** /oapi/v1/watch/clusterpolicybindings/{name} | 
*DefaultApi* | [**watchClusterPolicyBindingList**](docs/DefaultApi.md#watchClusterPolicyBindingList) | **GET** /oapi/v1/watch/clusterpolicybindings | 
*DefaultApi* | [**watchClusterPolicyList**](docs/DefaultApi.md#watchClusterPolicyList) | **GET** /oapi/v1/watch/clusterpolicies | 
*DefaultApi* | [**watchClusterResourceQuota**](docs/DefaultApi.md#watchClusterResourceQuota) | **GET** /oapi/v1/watch/clusterresourcequotas/{name} | 
*DefaultApi* | [**watchClusterResourceQuotaList**](docs/DefaultApi.md#watchClusterResourceQuotaList) | **GET** /oapi/v1/watch/clusterresourcequotas | 
*DefaultApi* | [**watchConfigMapListForAllNamespaces**](docs/DefaultApi.md#watchConfigMapListForAllNamespaces) | **GET** /api/v1/watch/configmaps | 
*DefaultApi* | [**watchDaemonSetListForAllNamespaces**](docs/DefaultApi.md#watchDaemonSetListForAllNamespaces) | **GET** /apis/extensions/v1beta1/watch/daemonsets | 
*DefaultApi* | [**watchDeploymentConfigListForAllNamespaces**](docs/DefaultApi.md#watchDeploymentConfigListForAllNamespaces) | **GET** /oapi/v1/watch/deploymentconfigs | 
*DefaultApi* | [**watchDeploymentListForAllNamespaces**](docs/DefaultApi.md#watchDeploymentListForAllNamespaces) | **GET** /apis/extensions/v1beta1/watch/deployments | 
*DefaultApi* | [**watchEgressNetworkPolicyListForAllNamespaces**](docs/DefaultApi.md#watchEgressNetworkPolicyListForAllNamespaces) | **GET** /oapi/v1/watch/egressnetworkpolicies | 
*DefaultApi* | [**watchEndpointsListForAllNamespaces**](docs/DefaultApi.md#watchEndpointsListForAllNamespaces) | **GET** /api/v1/watch/endpoints | 
*DefaultApi* | [**watchEventListForAllNamespaces**](docs/DefaultApi.md#watchEventListForAllNamespaces) | **GET** /api/v1/watch/events | 
*DefaultApi* | [**watchGroup**](docs/DefaultApi.md#watchGroup) | **GET** /oapi/v1/watch/groups/{name} | 
*DefaultApi* | [**watchGroupList**](docs/DefaultApi.md#watchGroupList) | **GET** /oapi/v1/watch/groups | 
*DefaultApi* | [**watchHostSubnet**](docs/DefaultApi.md#watchHostSubnet) | **GET** /oapi/v1/watch/hostsubnets/{name} | 
*DefaultApi* | [**watchHostSubnetList**](docs/DefaultApi.md#watchHostSubnetList) | **GET** /oapi/v1/watch/hostsubnets | 
*DefaultApi* | [**watchIdentity**](docs/DefaultApi.md#watchIdentity) | **GET** /oapi/v1/watch/identities/{name} | 
*DefaultApi* | [**watchIdentityList**](docs/DefaultApi.md#watchIdentityList) | **GET** /oapi/v1/watch/identities | 
*DefaultApi* | [**watchImage**](docs/DefaultApi.md#watchImage) | **GET** /oapi/v1/watch/images/{name} | 
*DefaultApi* | [**watchImageList**](docs/DefaultApi.md#watchImageList) | **GET** /oapi/v1/watch/images | 
*DefaultApi* | [**watchImageStreamListForAllNamespaces**](docs/DefaultApi.md#watchImageStreamListForAllNamespaces) | **GET** /oapi/v1/watch/imagestreams | 
*DefaultApi* | [**watchIngressListForAllNamespaces**](docs/DefaultApi.md#watchIngressListForAllNamespaces) | **GET** /apis/extensions/v1beta1/watch/ingresses | 
*DefaultApi* | [**watchLimitRangeListForAllNamespaces**](docs/DefaultApi.md#watchLimitRangeListForAllNamespaces) | **GET** /api/v1/watch/limitranges | 
*DefaultApi* | [**watchNamespace**](docs/DefaultApi.md#watchNamespace) | **GET** /api/v1/watch/namespaces/{name} | 
*DefaultApi* | [**watchNamespaceList**](docs/DefaultApi.md#watchNamespaceList) | **GET** /api/v1/watch/namespaces | 
*DefaultApi* | [**watchNamespacedBuild**](docs/DefaultApi.md#watchNamespacedBuild) | **GET** /oapi/v1/watch/namespaces/{namespace}/builds/{name} | 
*DefaultApi* | [**watchNamespacedBuildConfig**](docs/DefaultApi.md#watchNamespacedBuildConfig) | **GET** /oapi/v1/watch/namespaces/{namespace}/buildconfigs/{name} | 
*DefaultApi* | [**watchNamespacedBuildConfigList**](docs/DefaultApi.md#watchNamespacedBuildConfigList) | **GET** /oapi/v1/watch/namespaces/{namespace}/buildconfigs | 
*DefaultApi* | [**watchNamespacedBuildList**](docs/DefaultApi.md#watchNamespacedBuildList) | **GET** /oapi/v1/watch/namespaces/{namespace}/builds | 
*DefaultApi* | [**watchNamespacedConfigMap**](docs/DefaultApi.md#watchNamespacedConfigMap) | **GET** /api/v1/watch/namespaces/{namespace}/configmaps/{name} | 
*DefaultApi* | [**watchNamespacedConfigMapList**](docs/DefaultApi.md#watchNamespacedConfigMapList) | **GET** /api/v1/watch/namespaces/{namespace}/configmaps | 
*DefaultApi* | [**watchNamespacedDaemonSet**](docs/DefaultApi.md#watchNamespacedDaemonSet) | **GET** /apis/extensions/v1beta1/watch/namespaces/{namespace}/daemonsets/{name} | 
*DefaultApi* | [**watchNamespacedDaemonSetList**](docs/DefaultApi.md#watchNamespacedDaemonSetList) | **GET** /apis/extensions/v1beta1/watch/namespaces/{namespace}/daemonsets | 
*DefaultApi* | [**watchNamespacedDeployment**](docs/DefaultApi.md#watchNamespacedDeployment) | **GET** /apis/extensions/v1beta1/watch/namespaces/{namespace}/deployments/{name} | 
*DefaultApi* | [**watchNamespacedDeploymentConfig**](docs/DefaultApi.md#watchNamespacedDeploymentConfig) | **GET** /oapi/v1/watch/namespaces/{namespace}/deploymentconfigs/{name} | 
*DefaultApi* | [**watchNamespacedDeploymentConfigList**](docs/DefaultApi.md#watchNamespacedDeploymentConfigList) | **GET** /oapi/v1/watch/namespaces/{namespace}/deploymentconfigs | 
*DefaultApi* | [**watchNamespacedDeploymentList**](docs/DefaultApi.md#watchNamespacedDeploymentList) | **GET** /apis/extensions/v1beta1/watch/namespaces/{namespace}/deployments | 
*DefaultApi* | [**watchNamespacedEgressNetworkPolicy**](docs/DefaultApi.md#watchNamespacedEgressNetworkPolicy) | **GET** /oapi/v1/watch/namespaces/{namespace}/egressnetworkpolicies/{name} | 
*DefaultApi* | [**watchNamespacedEgressNetworkPolicyList**](docs/DefaultApi.md#watchNamespacedEgressNetworkPolicyList) | **GET** /oapi/v1/watch/namespaces/{namespace}/egressnetworkpolicies | 
*DefaultApi* | [**watchNamespacedEndpoints**](docs/DefaultApi.md#watchNamespacedEndpoints) | **GET** /api/v1/watch/namespaces/{namespace}/endpoints/{name} | 
*DefaultApi* | [**watchNamespacedEndpointsList**](docs/DefaultApi.md#watchNamespacedEndpointsList) | **GET** /api/v1/watch/namespaces/{namespace}/endpoints | 
*DefaultApi* | [**watchNamespacedEvent**](docs/DefaultApi.md#watchNamespacedEvent) | **GET** /api/v1/watch/namespaces/{namespace}/events/{name} | 
*DefaultApi* | [**watchNamespacedEventList**](docs/DefaultApi.md#watchNamespacedEventList) | **GET** /api/v1/watch/namespaces/{namespace}/events | 
*DefaultApi* | [**watchNamespacedImageStream**](docs/DefaultApi.md#watchNamespacedImageStream) | **GET** /oapi/v1/watch/namespaces/{namespace}/imagestreams/{name} | 
*DefaultApi* | [**watchNamespacedImageStreamList**](docs/DefaultApi.md#watchNamespacedImageStreamList) | **GET** /oapi/v1/watch/namespaces/{namespace}/imagestreams | 
*DefaultApi* | [**watchNamespacedIngress**](docs/DefaultApi.md#watchNamespacedIngress) | **GET** /apis/extensions/v1beta1/watch/namespaces/{namespace}/ingresses/{name} | 
*DefaultApi* | [**watchNamespacedIngressList**](docs/DefaultApi.md#watchNamespacedIngressList) | **GET** /apis/extensions/v1beta1/watch/namespaces/{namespace}/ingresses | 
*DefaultApi* | [**watchNamespacedLimitRange**](docs/DefaultApi.md#watchNamespacedLimitRange) | **GET** /api/v1/watch/namespaces/{namespace}/limitranges/{name} | 
*DefaultApi* | [**watchNamespacedLimitRangeList**](docs/DefaultApi.md#watchNamespacedLimitRangeList) | **GET** /api/v1/watch/namespaces/{namespace}/limitranges | 
*DefaultApi* | [**watchNamespacedNetworkPolicy**](docs/DefaultApi.md#watchNamespacedNetworkPolicy) | **GET** /apis/extensions/v1beta1/watch/namespaces/{namespace}/networkpolicies/{name} | 
*DefaultApi* | [**watchNamespacedNetworkPolicyList**](docs/DefaultApi.md#watchNamespacedNetworkPolicyList) | **GET** /apis/extensions/v1beta1/watch/namespaces/{namespace}/networkpolicies | 
*DefaultApi* | [**watchNamespacedPersistentVolumeClaim**](docs/DefaultApi.md#watchNamespacedPersistentVolumeClaim) | **GET** /api/v1/watch/namespaces/{namespace}/persistentvolumeclaims/{name} | 
*DefaultApi* | [**watchNamespacedPersistentVolumeClaimList**](docs/DefaultApi.md#watchNamespacedPersistentVolumeClaimList) | **GET** /api/v1/watch/namespaces/{namespace}/persistentvolumeclaims | 
*DefaultApi* | [**watchNamespacedPetSet**](docs/DefaultApi.md#watchNamespacedPetSet) | **GET** /apis/apps/v1alpha1/watch/namespaces/{namespace}/petsets/{name} | 
*DefaultApi* | [**watchNamespacedPetSetList**](docs/DefaultApi.md#watchNamespacedPetSetList) | **GET** /apis/apps/v1alpha1/watch/namespaces/{namespace}/petsets | 
*DefaultApi* | [**watchNamespacedPod**](docs/DefaultApi.md#watchNamespacedPod) | **GET** /api/v1/watch/namespaces/{namespace}/pods/{name} | 
*DefaultApi* | [**watchNamespacedPodDisruptionBudget**](docs/DefaultApi.md#watchNamespacedPodDisruptionBudget) | **GET** /apis/policy/v1alpha1/watch/namespaces/{namespace}/poddisruptionbudgets/{name} | 
*DefaultApi* | [**watchNamespacedPodDisruptionBudgetList**](docs/DefaultApi.md#watchNamespacedPodDisruptionBudgetList) | **GET** /apis/policy/v1alpha1/watch/namespaces/{namespace}/poddisruptionbudgets | 
*DefaultApi* | [**watchNamespacedPodList**](docs/DefaultApi.md#watchNamespacedPodList) | **GET** /api/v1/watch/namespaces/{namespace}/pods | 
*DefaultApi* | [**watchNamespacedPodTemplate**](docs/DefaultApi.md#watchNamespacedPodTemplate) | **GET** /api/v1/watch/namespaces/{namespace}/podtemplates/{name} | 
*DefaultApi* | [**watchNamespacedPodTemplateList**](docs/DefaultApi.md#watchNamespacedPodTemplateList) | **GET** /api/v1/watch/namespaces/{namespace}/podtemplates | 
*DefaultApi* | [**watchNamespacedPolicy**](docs/DefaultApi.md#watchNamespacedPolicy) | **GET** /oapi/v1/watch/namespaces/{namespace}/policies/{name} | 
*DefaultApi* | [**watchNamespacedPolicyBinding**](docs/DefaultApi.md#watchNamespacedPolicyBinding) | **GET** /oapi/v1/watch/namespaces/{namespace}/policybindings/{name} | 
*DefaultApi* | [**watchNamespacedPolicyBindingList**](docs/DefaultApi.md#watchNamespacedPolicyBindingList) | **GET** /oapi/v1/watch/namespaces/{namespace}/policybindings | 
*DefaultApi* | [**watchNamespacedPolicyList**](docs/DefaultApi.md#watchNamespacedPolicyList) | **GET** /oapi/v1/watch/namespaces/{namespace}/policies | 
*DefaultApi* | [**watchNamespacedReplicaSet**](docs/DefaultApi.md#watchNamespacedReplicaSet) | **GET** /apis/extensions/v1beta1/watch/namespaces/{namespace}/replicasets/{name} | 
*DefaultApi* | [**watchNamespacedReplicaSetList**](docs/DefaultApi.md#watchNamespacedReplicaSetList) | **GET** /apis/extensions/v1beta1/watch/namespaces/{namespace}/replicasets | 
*DefaultApi* | [**watchNamespacedReplicationController**](docs/DefaultApi.md#watchNamespacedReplicationController) | **GET** /api/v1/watch/namespaces/{namespace}/replicationcontrollers/{name} | 
*DefaultApi* | [**watchNamespacedReplicationControllerList**](docs/DefaultApi.md#watchNamespacedReplicationControllerList) | **GET** /api/v1/watch/namespaces/{namespace}/replicationcontrollers | 
*DefaultApi* | [**watchNamespacedResourceQuota**](docs/DefaultApi.md#watchNamespacedResourceQuota) | **GET** /api/v1/watch/namespaces/{namespace}/resourcequotas/{name} | 
*DefaultApi* | [**watchNamespacedResourceQuotaList**](docs/DefaultApi.md#watchNamespacedResourceQuotaList) | **GET** /api/v1/watch/namespaces/{namespace}/resourcequotas | 
*DefaultApi* | [**watchNamespacedRoute**](docs/DefaultApi.md#watchNamespacedRoute) | **GET** /oapi/v1/watch/namespaces/{namespace}/routes/{name} | 
*DefaultApi* | [**watchNamespacedRouteList**](docs/DefaultApi.md#watchNamespacedRouteList) | **GET** /oapi/v1/watch/namespaces/{namespace}/routes | 
*DefaultApi* | [**watchNamespacedScheduledJob**](docs/DefaultApi.md#watchNamespacedScheduledJob) | **GET** /apis/batch/v2alpha1/watch/namespaces/{namespace}/scheduledjobs/{name} | 
*DefaultApi* | [**watchNamespacedScheduledJobList**](docs/DefaultApi.md#watchNamespacedScheduledJobList) | **GET** /apis/batch/v2alpha1/watch/namespaces/{namespace}/scheduledjobs | 
*DefaultApi* | [**watchNamespacedSecret**](docs/DefaultApi.md#watchNamespacedSecret) | **GET** /api/v1/watch/namespaces/{namespace}/secrets/{name} | 
*DefaultApi* | [**watchNamespacedSecretList**](docs/DefaultApi.md#watchNamespacedSecretList) | **GET** /api/v1/watch/namespaces/{namespace}/secrets | 
*DefaultApi* | [**watchNamespacedService**](docs/DefaultApi.md#watchNamespacedService) | **GET** /api/v1/watch/namespaces/{namespace}/services/{name} | 
*DefaultApi* | [**watchNamespacedServiceAccount**](docs/DefaultApi.md#watchNamespacedServiceAccount) | **GET** /api/v1/watch/namespaces/{namespace}/serviceaccounts/{name} | 
*DefaultApi* | [**watchNamespacedServiceAccountList**](docs/DefaultApi.md#watchNamespacedServiceAccountList) | **GET** /api/v1/watch/namespaces/{namespace}/serviceaccounts | 
*DefaultApi* | [**watchNamespacedServiceList**](docs/DefaultApi.md#watchNamespacedServiceList) | **GET** /api/v1/watch/namespaces/{namespace}/services | 
*DefaultApi* | [**watchNamespacedTemplate**](docs/DefaultApi.md#watchNamespacedTemplate) | **GET** /oapi/v1/watch/namespaces/{namespace}/templates/{name} | 
*DefaultApi* | [**watchNamespacedTemplateList**](docs/DefaultApi.md#watchNamespacedTemplateList) | **GET** /oapi/v1/watch/namespaces/{namespace}/templates | 
*DefaultApi* | [**watchNetNamespace**](docs/DefaultApi.md#watchNetNamespace) | **GET** /oapi/v1/watch/netnamespaces/{name} | 
*DefaultApi* | [**watchNetNamespaceList**](docs/DefaultApi.md#watchNetNamespaceList) | **GET** /oapi/v1/watch/netnamespaces | 
*DefaultApi* | [**watchNetworkPolicyListForAllNamespaces**](docs/DefaultApi.md#watchNetworkPolicyListForAllNamespaces) | **GET** /apis/extensions/v1beta1/watch/networkpolicies | 
*DefaultApi* | [**watchNode**](docs/DefaultApi.md#watchNode) | **GET** /api/v1/watch/nodes/{name} | 
*DefaultApi* | [**watchNodeList**](docs/DefaultApi.md#watchNodeList) | **GET** /api/v1/watch/nodes | 
*DefaultApi* | [**watchOAuthAccessToken**](docs/DefaultApi.md#watchOAuthAccessToken) | **GET** /oapi/v1/watch/oauthaccesstokens/{name} | 
*DefaultApi* | [**watchOAuthAccessTokenList**](docs/DefaultApi.md#watchOAuthAccessTokenList) | **GET** /oapi/v1/watch/oauthaccesstokens | 
*DefaultApi* | [**watchOAuthAuthorizeToken**](docs/DefaultApi.md#watchOAuthAuthorizeToken) | **GET** /oapi/v1/watch/oauthauthorizetokens/{name} | 
*DefaultApi* | [**watchOAuthAuthorizeTokenList**](docs/DefaultApi.md#watchOAuthAuthorizeTokenList) | **GET** /oapi/v1/watch/oauthauthorizetokens | 
*DefaultApi* | [**watchOAuthClient**](docs/DefaultApi.md#watchOAuthClient) | **GET** /oapi/v1/watch/oauthclients/{name} | 
*DefaultApi* | [**watchOAuthClientAuthorization**](docs/DefaultApi.md#watchOAuthClientAuthorization) | **GET** /oapi/v1/watch/oauthclientauthorizations/{name} | 
*DefaultApi* | [**watchOAuthClientAuthorizationList**](docs/DefaultApi.md#watchOAuthClientAuthorizationList) | **GET** /oapi/v1/watch/oauthclientauthorizations | 
*DefaultApi* | [**watchOAuthClientList**](docs/DefaultApi.md#watchOAuthClientList) | **GET** /oapi/v1/watch/oauthclients | 
*DefaultApi* | [**watchPersistentVolume**](docs/DefaultApi.md#watchPersistentVolume) | **GET** /api/v1/watch/persistentvolumes/{name} | 
*DefaultApi* | [**watchPersistentVolumeClaimListForAllNamespaces**](docs/DefaultApi.md#watchPersistentVolumeClaimListForAllNamespaces) | **GET** /api/v1/watch/persistentvolumeclaims | 
*DefaultApi* | [**watchPersistentVolumeList**](docs/DefaultApi.md#watchPersistentVolumeList) | **GET** /api/v1/watch/persistentvolumes | 
*DefaultApi* | [**watchPetSetListForAllNamespaces**](docs/DefaultApi.md#watchPetSetListForAllNamespaces) | **GET** /apis/apps/v1alpha1/watch/petsets | 
*DefaultApi* | [**watchPodDisruptionBudgetListForAllNamespaces**](docs/DefaultApi.md#watchPodDisruptionBudgetListForAllNamespaces) | **GET** /apis/policy/v1alpha1/watch/poddisruptionbudgets | 
*DefaultApi* | [**watchPodListForAllNamespaces**](docs/DefaultApi.md#watchPodListForAllNamespaces) | **GET** /api/v1/watch/pods | 
*DefaultApi* | [**watchPodSecurityPolicy**](docs/DefaultApi.md#watchPodSecurityPolicy) | **GET** /apis/extensions/v1beta1/watch/podsecuritypolicies/{name} | 
*DefaultApi* | [**watchPodSecurityPolicyList**](docs/DefaultApi.md#watchPodSecurityPolicyList) | **GET** /apis/extensions/v1beta1/watch/podsecuritypolicies | 
*DefaultApi* | [**watchPodTemplateListForAllNamespaces**](docs/DefaultApi.md#watchPodTemplateListForAllNamespaces) | **GET** /api/v1/watch/podtemplates | 
*DefaultApi* | [**watchPolicyBindingListForAllNamespaces**](docs/DefaultApi.md#watchPolicyBindingListForAllNamespaces) | **GET** /oapi/v1/watch/policybindings | 
*DefaultApi* | [**watchPolicyListForAllNamespaces**](docs/DefaultApi.md#watchPolicyListForAllNamespaces) | **GET** /oapi/v1/watch/policies | 
*DefaultApi* | [**watchProject**](docs/DefaultApi.md#watchProject) | **GET** /oapi/v1/watch/projects/{name} | 
*DefaultApi* | [**watchProjectList**](docs/DefaultApi.md#watchProjectList) | **GET** /oapi/v1/watch/projects | 
*DefaultApi* | [**watchReplicaSetListForAllNamespaces**](docs/DefaultApi.md#watchReplicaSetListForAllNamespaces) | **GET** /apis/extensions/v1beta1/watch/replicasets | 
*DefaultApi* | [**watchReplicationControllerListForAllNamespaces**](docs/DefaultApi.md#watchReplicationControllerListForAllNamespaces) | **GET** /api/v1/watch/replicationcontrollers | 
*DefaultApi* | [**watchResourceQuotaListForAllNamespaces**](docs/DefaultApi.md#watchResourceQuotaListForAllNamespaces) | **GET** /api/v1/watch/resourcequotas | 
*DefaultApi* | [**watchRouteListForAllNamespaces**](docs/DefaultApi.md#watchRouteListForAllNamespaces) | **GET** /oapi/v1/watch/routes | 
*DefaultApi* | [**watchScheduledJobListForAllNamespaces**](docs/DefaultApi.md#watchScheduledJobListForAllNamespaces) | **GET** /apis/batch/v2alpha1/watch/scheduledjobs | 
*DefaultApi* | [**watchSecretListForAllNamespaces**](docs/DefaultApi.md#watchSecretListForAllNamespaces) | **GET** /api/v1/watch/secrets | 
*DefaultApi* | [**watchSecurityContextConstraints**](docs/DefaultApi.md#watchSecurityContextConstraints) | **GET** /api/v1/watch/securitycontextconstraints/{name} | 
*DefaultApi* | [**watchSecurityContextConstraintsList**](docs/DefaultApi.md#watchSecurityContextConstraintsList) | **GET** /api/v1/watch/securitycontextconstraints | 
*DefaultApi* | [**watchServiceAccountListForAllNamespaces**](docs/DefaultApi.md#watchServiceAccountListForAllNamespaces) | **GET** /api/v1/watch/serviceaccounts | 
*DefaultApi* | [**watchServiceListForAllNamespaces**](docs/DefaultApi.md#watchServiceListForAllNamespaces) | **GET** /api/v1/watch/services | 
*DefaultApi* | [**watchStorageClass**](docs/DefaultApi.md#watchStorageClass) | **GET** /apis/storage.k8s.io/v1beta1/watch/storageclasses/{name} | 
*DefaultApi* | [**watchStorageClassList**](docs/DefaultApi.md#watchStorageClassList) | **GET** /apis/storage.k8s.io/v1beta1/watch/storageclasses | 
*DefaultApi* | [**watchTemplateListForAllNamespaces**](docs/DefaultApi.md#watchTemplateListForAllNamespaces) | **GET** /oapi/v1/watch/templates | 
*DefaultApi* | [**watchThirdPartyResource**](docs/DefaultApi.md#watchThirdPartyResource) | **GET** /apis/extensions/v1beta1/watch/thirdpartyresources/{name} | 
*DefaultApi* | [**watchThirdPartyResourceList**](docs/DefaultApi.md#watchThirdPartyResourceList) | **GET** /apis/extensions/v1beta1/watch/thirdpartyresources | 
*DefaultApi* | [**watchUser**](docs/DefaultApi.md#watchUser) | **GET** /oapi/v1/watch/users/{name} | 
*DefaultApi* | [**watchUserList**](docs/DefaultApi.md#watchUserList) | **GET** /oapi/v1/watch/users | 


## Documentation for Models

 - [UnversionedAPIGroup](docs/UnversionedAPIGroup.md)
 - [UnversionedAPIGroupList](docs/UnversionedAPIGroupList.md)
 - [UnversionedAPIResource](docs/UnversionedAPIResource.md)
 - [UnversionedAPIResourceList](docs/UnversionedAPIResourceList.md)
 - [UnversionedAPIVersions](docs/UnversionedAPIVersions.md)
 - [UnversionedGroupVersionForDiscovery](docs/UnversionedGroupVersionForDiscovery.md)
 - [UnversionedLabelSelector](docs/UnversionedLabelSelector.md)
 - [UnversionedLabelSelectorRequirement](docs/UnversionedLabelSelectorRequirement.md)
 - [UnversionedListMeta](docs/UnversionedListMeta.md)
 - [UnversionedServerAddressByClientCIDR](docs/UnversionedServerAddressByClientCIDR.md)
 - [UnversionedStatus](docs/UnversionedStatus.md)
 - [UnversionedStatusCause](docs/UnversionedStatusCause.md)
 - [UnversionedStatusDetails](docs/UnversionedStatusDetails.md)
 - [V1AWSElasticBlockStoreVolumeSource](docs/V1AWSElasticBlockStoreVolumeSource.md)
 - [V1AppliedClusterResourceQuota](docs/V1AppliedClusterResourceQuota.md)
 - [V1AppliedClusterResourceQuotaList](docs/V1AppliedClusterResourceQuotaList.md)
 - [V1AttachedVolume](docs/V1AttachedVolume.md)
 - [V1AzureDiskVolumeSource](docs/V1AzureDiskVolumeSource.md)
 - [V1AzureFileVolumeSource](docs/V1AzureFileVolumeSource.md)
 - [V1BinaryBuildSource](docs/V1BinaryBuildSource.md)
 - [V1Binding](docs/V1Binding.md)
 - [V1Build](docs/V1Build.md)
 - [V1BuildConfig](docs/V1BuildConfig.md)
 - [V1BuildConfigList](docs/V1BuildConfigList.md)
 - [V1BuildConfigSpec](docs/V1BuildConfigSpec.md)
 - [V1BuildConfigStatus](docs/V1BuildConfigStatus.md)
 - [V1BuildList](docs/V1BuildList.md)
 - [V1BuildLog](docs/V1BuildLog.md)
 - [V1BuildOutput](docs/V1BuildOutput.md)
 - [V1BuildPostCommitSpec](docs/V1BuildPostCommitSpec.md)
 - [V1BuildRequest](docs/V1BuildRequest.md)
 - [V1BuildSource](docs/V1BuildSource.md)
 - [V1BuildSpec](docs/V1BuildSpec.md)
 - [V1BuildStatus](docs/V1BuildStatus.md)
 - [V1BuildStrategy](docs/V1BuildStrategy.md)
 - [V1BuildTriggerCause](docs/V1BuildTriggerCause.md)
 - [V1BuildTriggerPolicy](docs/V1BuildTriggerPolicy.md)
 - [V1Capabilities](docs/V1Capabilities.md)
 - [V1CephFSVolumeSource](docs/V1CephFSVolumeSource.md)
 - [V1CinderVolumeSource](docs/V1CinderVolumeSource.md)
 - [V1ClusterNetwork](docs/V1ClusterNetwork.md)
 - [V1ClusterNetworkList](docs/V1ClusterNetworkList.md)
 - [V1ClusterPolicy](docs/V1ClusterPolicy.md)
 - [V1ClusterPolicyBinding](docs/V1ClusterPolicyBinding.md)
 - [V1ClusterPolicyBindingList](docs/V1ClusterPolicyBindingList.md)
 - [V1ClusterPolicyList](docs/V1ClusterPolicyList.md)
 - [V1ClusterResourceQuota](docs/V1ClusterResourceQuota.md)
 - [V1ClusterResourceQuotaList](docs/V1ClusterResourceQuotaList.md)
 - [V1ClusterResourceQuotaSelector](docs/V1ClusterResourceQuotaSelector.md)
 - [V1ClusterResourceQuotaSpec](docs/V1ClusterResourceQuotaSpec.md)
 - [V1ClusterResourceQuotaStatus](docs/V1ClusterResourceQuotaStatus.md)
 - [V1ClusterRole](docs/V1ClusterRole.md)
 - [V1ClusterRoleBinding](docs/V1ClusterRoleBinding.md)
 - [V1ClusterRoleBindingList](docs/V1ClusterRoleBindingList.md)
 - [V1ClusterRoleList](docs/V1ClusterRoleList.md)
 - [V1ClusterRoleScopeRestriction](docs/V1ClusterRoleScopeRestriction.md)
 - [V1ComponentCondition](docs/V1ComponentCondition.md)
 - [V1ComponentStatus](docs/V1ComponentStatus.md)
 - [V1ComponentStatusList](docs/V1ComponentStatusList.md)
 - [V1ConfigMap](docs/V1ConfigMap.md)
 - [V1ConfigMapKeySelector](docs/V1ConfigMapKeySelector.md)
 - [V1ConfigMapList](docs/V1ConfigMapList.md)
 - [V1ConfigMapVolumeSource](docs/V1ConfigMapVolumeSource.md)
 - [V1Container](docs/V1Container.md)
 - [V1ContainerImage](docs/V1ContainerImage.md)
 - [V1ContainerPort](docs/V1ContainerPort.md)
 - [V1ContainerState](docs/V1ContainerState.md)
 - [V1ContainerStateRunning](docs/V1ContainerStateRunning.md)
 - [V1ContainerStateTerminated](docs/V1ContainerStateTerminated.md)
 - [V1ContainerStateWaiting](docs/V1ContainerStateWaiting.md)
 - [V1ContainerStatus](docs/V1ContainerStatus.md)
 - [V1CrossVersionObjectReference](docs/V1CrossVersionObjectReference.md)
 - [V1CustomBuildStrategy](docs/V1CustomBuildStrategy.md)
 - [V1CustomDeploymentStrategyParams](docs/V1CustomDeploymentStrategyParams.md)
 - [V1DaemonEndpoint](docs/V1DaemonEndpoint.md)
 - [V1DeleteOptions](docs/V1DeleteOptions.md)
 - [V1DeploymentCause](docs/V1DeploymentCause.md)
 - [V1DeploymentCauseImageTrigger](docs/V1DeploymentCauseImageTrigger.md)
 - [V1DeploymentConfig](docs/V1DeploymentConfig.md)
 - [V1DeploymentConfigList](docs/V1DeploymentConfigList.md)
 - [V1DeploymentConfigRollback](docs/V1DeploymentConfigRollback.md)
 - [V1DeploymentConfigRollbackSpec](docs/V1DeploymentConfigRollbackSpec.md)
 - [V1DeploymentConfigSpec](docs/V1DeploymentConfigSpec.md)
 - [V1DeploymentConfigStatus](docs/V1DeploymentConfigStatus.md)
 - [V1DeploymentDetails](docs/V1DeploymentDetails.md)
 - [V1DeploymentLog](docs/V1DeploymentLog.md)
 - [V1DeploymentStrategy](docs/V1DeploymentStrategy.md)
 - [V1DeploymentTriggerImageChangeParams](docs/V1DeploymentTriggerImageChangeParams.md)
 - [V1DeploymentTriggerPolicy](docs/V1DeploymentTriggerPolicy.md)
 - [V1DeprecatedDownwardAPIVolumeFile](docs/V1DeprecatedDownwardAPIVolumeFile.md)
 - [V1DeprecatedDownwardAPIVolumeSource](docs/V1DeprecatedDownwardAPIVolumeSource.md)
 - [V1DockerBuildStrategy](docs/V1DockerBuildStrategy.md)
 - [V1DownwardAPIVolumeFile](docs/V1DownwardAPIVolumeFile.md)
 - [V1DownwardAPIVolumeSource](docs/V1DownwardAPIVolumeSource.md)
 - [V1EgressNetworkPolicy](docs/V1EgressNetworkPolicy.md)
 - [V1EgressNetworkPolicyList](docs/V1EgressNetworkPolicyList.md)
 - [V1EgressNetworkPolicyPeer](docs/V1EgressNetworkPolicyPeer.md)
 - [V1EgressNetworkPolicyRule](docs/V1EgressNetworkPolicyRule.md)
 - [V1EgressNetworkPolicySpec](docs/V1EgressNetworkPolicySpec.md)
 - [V1EmptyDirVolumeSource](docs/V1EmptyDirVolumeSource.md)
 - [V1EndpointAddress](docs/V1EndpointAddress.md)
 - [V1EndpointPort](docs/V1EndpointPort.md)
 - [V1EndpointSubset](docs/V1EndpointSubset.md)
 - [V1Endpoints](docs/V1Endpoints.md)
 - [V1EndpointsList](docs/V1EndpointsList.md)
 - [V1EnvVar](docs/V1EnvVar.md)
 - [V1EnvVarSource](docs/V1EnvVarSource.md)
 - [V1Event](docs/V1Event.md)
 - [V1EventList](docs/V1EventList.md)
 - [V1EventSource](docs/V1EventSource.md)
 - [V1ExecAction](docs/V1ExecAction.md)
 - [V1ExecNewPodHook](docs/V1ExecNewPodHook.md)
 - [V1FCVolumeSource](docs/V1FCVolumeSource.md)
 - [V1FSGroupStrategyOptions](docs/V1FSGroupStrategyOptions.md)
 - [V1FlexVolumeSource](docs/V1FlexVolumeSource.md)
 - [V1FlockerVolumeSource](docs/V1FlockerVolumeSource.md)
 - [V1GCEPersistentDiskVolumeSource](docs/V1GCEPersistentDiskVolumeSource.md)
 - [V1GenericWebHookCause](docs/V1GenericWebHookCause.md)
 - [V1GitBuildSource](docs/V1GitBuildSource.md)
 - [V1GitHubWebHookCause](docs/V1GitHubWebHookCause.md)
 - [V1GitRepoVolumeSource](docs/V1GitRepoVolumeSource.md)
 - [V1GitSourceRevision](docs/V1GitSourceRevision.md)
 - [V1GlusterfsVolumeSource](docs/V1GlusterfsVolumeSource.md)
 - [V1Group](docs/V1Group.md)
 - [V1GroupList](docs/V1GroupList.md)
 - [V1HTTPGetAction](docs/V1HTTPGetAction.md)
 - [V1HTTPHeader](docs/V1HTTPHeader.md)
 - [V1Handler](docs/V1Handler.md)
 - [V1HorizontalPodAutoscaler](docs/V1HorizontalPodAutoscaler.md)
 - [V1HorizontalPodAutoscalerList](docs/V1HorizontalPodAutoscalerList.md)
 - [V1HorizontalPodAutoscalerSpec](docs/V1HorizontalPodAutoscalerSpec.md)
 - [V1HorizontalPodAutoscalerStatus](docs/V1HorizontalPodAutoscalerStatus.md)
 - [V1HostPathVolumeSource](docs/V1HostPathVolumeSource.md)
 - [V1HostSubnet](docs/V1HostSubnet.md)
 - [V1HostSubnetList](docs/V1HostSubnetList.md)
 - [V1IDRange](docs/V1IDRange.md)
 - [V1ISCSIVolumeSource](docs/V1ISCSIVolumeSource.md)
 - [V1Identity](docs/V1Identity.md)
 - [V1IdentityList](docs/V1IdentityList.md)
 - [V1Image](docs/V1Image.md)
 - [V1ImageChangeCause](docs/V1ImageChangeCause.md)
 - [V1ImageChangeTrigger](docs/V1ImageChangeTrigger.md)
 - [V1ImageImportSpec](docs/V1ImageImportSpec.md)
 - [V1ImageImportStatus](docs/V1ImageImportStatus.md)
 - [V1ImageLayer](docs/V1ImageLayer.md)
 - [V1ImageList](docs/V1ImageList.md)
 - [V1ImageSignature](docs/V1ImageSignature.md)
 - [V1ImageSource](docs/V1ImageSource.md)
 - [V1ImageSourcePath](docs/V1ImageSourcePath.md)
 - [V1ImageStream](docs/V1ImageStream.md)
 - [V1ImageStreamImage](docs/V1ImageStreamImage.md)
 - [V1ImageStreamImport](docs/V1ImageStreamImport.md)
 - [V1ImageStreamImportSpec](docs/V1ImageStreamImportSpec.md)
 - [V1ImageStreamImportStatus](docs/V1ImageStreamImportStatus.md)
 - [V1ImageStreamList](docs/V1ImageStreamList.md)
 - [V1ImageStreamMapping](docs/V1ImageStreamMapping.md)
 - [V1ImageStreamSpec](docs/V1ImageStreamSpec.md)
 - [V1ImageStreamStatus](docs/V1ImageStreamStatus.md)
 - [V1ImageStreamTag](docs/V1ImageStreamTag.md)
 - [V1ImageStreamTagList](docs/V1ImageStreamTagList.md)
 - [V1JenkinsPipelineBuildStrategy](docs/V1JenkinsPipelineBuildStrategy.md)
 - [V1Job](docs/V1Job.md)
 - [V1JobCondition](docs/V1JobCondition.md)
 - [V1JobList](docs/V1JobList.md)
 - [V1JobSpec](docs/V1JobSpec.md)
 - [V1JobStatus](docs/V1JobStatus.md)
 - [V1KeyToPath](docs/V1KeyToPath.md)
 - [V1LabelSelector](docs/V1LabelSelector.md)
 - [V1LabelSelectorRequirement](docs/V1LabelSelectorRequirement.md)
 - [V1Lifecycle](docs/V1Lifecycle.md)
 - [V1LifecycleHook](docs/V1LifecycleHook.md)
 - [V1LimitRange](docs/V1LimitRange.md)
 - [V1LimitRangeItem](docs/V1LimitRangeItem.md)
 - [V1LimitRangeList](docs/V1LimitRangeList.md)
 - [V1LimitRangeSpec](docs/V1LimitRangeSpec.md)
 - [V1LoadBalancerIngress](docs/V1LoadBalancerIngress.md)
 - [V1LoadBalancerStatus](docs/V1LoadBalancerStatus.md)
 - [V1LocalObjectReference](docs/V1LocalObjectReference.md)
 - [V1LocalResourceAccessReview](docs/V1LocalResourceAccessReview.md)
 - [V1LocalSubjectAccessReview](docs/V1LocalSubjectAccessReview.md)
 - [V1NFSVolumeSource](docs/V1NFSVolumeSource.md)
 - [V1NamedClusterRole](docs/V1NamedClusterRole.md)
 - [V1NamedClusterRoleBinding](docs/V1NamedClusterRoleBinding.md)
 - [V1NamedRole](docs/V1NamedRole.md)
 - [V1NamedRoleBinding](docs/V1NamedRoleBinding.md)
 - [V1NamedTagEventList](docs/V1NamedTagEventList.md)
 - [V1Namespace](docs/V1Namespace.md)
 - [V1NamespaceList](docs/V1NamespaceList.md)
 - [V1NamespaceSpec](docs/V1NamespaceSpec.md)
 - [V1NamespaceStatus](docs/V1NamespaceStatus.md)
 - [V1NetNamespace](docs/V1NetNamespace.md)
 - [V1NetNamespaceList](docs/V1NetNamespaceList.md)
 - [V1Node](docs/V1Node.md)
 - [V1NodeAddress](docs/V1NodeAddress.md)
 - [V1NodeCondition](docs/V1NodeCondition.md)
 - [V1NodeDaemonEndpoints](docs/V1NodeDaemonEndpoints.md)
 - [V1NodeList](docs/V1NodeList.md)
 - [V1NodeSpec](docs/V1NodeSpec.md)
 - [V1NodeStatus](docs/V1NodeStatus.md)
 - [V1NodeSystemInfo](docs/V1NodeSystemInfo.md)
 - [V1OAuthAccessToken](docs/V1OAuthAccessToken.md)
 - [V1OAuthAccessTokenList](docs/V1OAuthAccessTokenList.md)
 - [V1OAuthAuthorizeToken](docs/V1OAuthAuthorizeToken.md)
 - [V1OAuthAuthorizeTokenList](docs/V1OAuthAuthorizeTokenList.md)
 - [V1OAuthClient](docs/V1OAuthClient.md)
 - [V1OAuthClientAuthorization](docs/V1OAuthClientAuthorization.md)
 - [V1OAuthClientAuthorizationList](docs/V1OAuthClientAuthorizationList.md)
 - [V1OAuthClientList](docs/V1OAuthClientList.md)
 - [V1ObjectFieldSelector](docs/V1ObjectFieldSelector.md)
 - [V1ObjectMeta](docs/V1ObjectMeta.md)
 - [V1ObjectReference](docs/V1ObjectReference.md)
 - [V1OwnerReference](docs/V1OwnerReference.md)
 - [V1Parameter](docs/V1Parameter.md)
 - [V1PersistentVolume](docs/V1PersistentVolume.md)
 - [V1PersistentVolumeClaim](docs/V1PersistentVolumeClaim.md)
 - [V1PersistentVolumeClaimList](docs/V1PersistentVolumeClaimList.md)
 - [V1PersistentVolumeClaimSpec](docs/V1PersistentVolumeClaimSpec.md)
 - [V1PersistentVolumeClaimStatus](docs/V1PersistentVolumeClaimStatus.md)
 - [V1PersistentVolumeClaimVolumeSource](docs/V1PersistentVolumeClaimVolumeSource.md)
 - [V1PersistentVolumeList](docs/V1PersistentVolumeList.md)
 - [V1PersistentVolumeSpec](docs/V1PersistentVolumeSpec.md)
 - [V1PersistentVolumeStatus](docs/V1PersistentVolumeStatus.md)
 - [V1Pod](docs/V1Pod.md)
 - [V1PodCondition](docs/V1PodCondition.md)
 - [V1PodList](docs/V1PodList.md)
 - [V1PodSecurityContext](docs/V1PodSecurityContext.md)
 - [V1PodSecurityPolicyReview](docs/V1PodSecurityPolicyReview.md)
 - [V1PodSecurityPolicyReviewSpec](docs/V1PodSecurityPolicyReviewSpec.md)
 - [V1PodSecurityPolicyReviewStatus](docs/V1PodSecurityPolicyReviewStatus.md)
 - [V1PodSecurityPolicySelfSubjectReview](docs/V1PodSecurityPolicySelfSubjectReview.md)
 - [V1PodSecurityPolicySelfSubjectReviewSpec](docs/V1PodSecurityPolicySelfSubjectReviewSpec.md)
 - [V1PodSecurityPolicySubjectReview](docs/V1PodSecurityPolicySubjectReview.md)
 - [V1PodSecurityPolicySubjectReviewSpec](docs/V1PodSecurityPolicySubjectReviewSpec.md)
 - [V1PodSecurityPolicySubjectReviewStatus](docs/V1PodSecurityPolicySubjectReviewStatus.md)
 - [V1PodSpec](docs/V1PodSpec.md)
 - [V1PodStatus](docs/V1PodStatus.md)
 - [V1PodTemplate](docs/V1PodTemplate.md)
 - [V1PodTemplateList](docs/V1PodTemplateList.md)
 - [V1PodTemplateSpec](docs/V1PodTemplateSpec.md)
 - [V1Policy](docs/V1Policy.md)
 - [V1PolicyBinding](docs/V1PolicyBinding.md)
 - [V1PolicyBindingList](docs/V1PolicyBindingList.md)
 - [V1PolicyList](docs/V1PolicyList.md)
 - [V1PolicyRule](docs/V1PolicyRule.md)
 - [V1Preconditions](docs/V1Preconditions.md)
 - [V1Probe](docs/V1Probe.md)
 - [V1Project](docs/V1Project.md)
 - [V1ProjectList](docs/V1ProjectList.md)
 - [V1ProjectRequest](docs/V1ProjectRequest.md)
 - [V1ProjectSpec](docs/V1ProjectSpec.md)
 - [V1ProjectStatus](docs/V1ProjectStatus.md)
 - [V1QuobyteVolumeSource](docs/V1QuobyteVolumeSource.md)
 - [V1RBDVolumeSource](docs/V1RBDVolumeSource.md)
 - [V1RecreateDeploymentStrategyParams](docs/V1RecreateDeploymentStrategyParams.md)
 - [V1ReplicationController](docs/V1ReplicationController.md)
 - [V1ReplicationControllerList](docs/V1ReplicationControllerList.md)
 - [V1ReplicationControllerSpec](docs/V1ReplicationControllerSpec.md)
 - [V1ReplicationControllerStatus](docs/V1ReplicationControllerStatus.md)
 - [V1RepositoryImportSpec](docs/V1RepositoryImportSpec.md)
 - [V1RepositoryImportStatus](docs/V1RepositoryImportStatus.md)
 - [V1ResourceAccessReview](docs/V1ResourceAccessReview.md)
 - [V1ResourceFieldSelector](docs/V1ResourceFieldSelector.md)
 - [V1ResourceQuota](docs/V1ResourceQuota.md)
 - [V1ResourceQuotaList](docs/V1ResourceQuotaList.md)
 - [V1ResourceQuotaSpec](docs/V1ResourceQuotaSpec.md)
 - [V1ResourceQuotaStatus](docs/V1ResourceQuotaStatus.md)
 - [V1ResourceQuotaStatusByNamespace](docs/V1ResourceQuotaStatusByNamespace.md)
 - [V1ResourceRequirements](docs/V1ResourceRequirements.md)
 - [V1Role](docs/V1Role.md)
 - [V1RoleBinding](docs/V1RoleBinding.md)
 - [V1RoleBindingList](docs/V1RoleBindingList.md)
 - [V1RoleList](docs/V1RoleList.md)
 - [V1RollingDeploymentStrategyParams](docs/V1RollingDeploymentStrategyParams.md)
 - [V1Route](docs/V1Route.md)
 - [V1RouteIngress](docs/V1RouteIngress.md)
 - [V1RouteIngressCondition](docs/V1RouteIngressCondition.md)
 - [V1RouteList](docs/V1RouteList.md)
 - [V1RoutePort](docs/V1RoutePort.md)
 - [V1RouteSpec](docs/V1RouteSpec.md)
 - [V1RouteStatus](docs/V1RouteStatus.md)
 - [V1RouteTargetReference](docs/V1RouteTargetReference.md)
 - [V1RunAsUserStrategyOptions](docs/V1RunAsUserStrategyOptions.md)
 - [V1SELinuxContextStrategyOptions](docs/V1SELinuxContextStrategyOptions.md)
 - [V1SELinuxOptions](docs/V1SELinuxOptions.md)
 - [V1Scale](docs/V1Scale.md)
 - [V1ScaleSpec](docs/V1ScaleSpec.md)
 - [V1ScaleStatus](docs/V1ScaleStatus.md)
 - [V1ScopeRestriction](docs/V1ScopeRestriction.md)
 - [V1Secret](docs/V1Secret.md)
 - [V1SecretBuildSource](docs/V1SecretBuildSource.md)
 - [V1SecretKeySelector](docs/V1SecretKeySelector.md)
 - [V1SecretList](docs/V1SecretList.md)
 - [V1SecretSpec](docs/V1SecretSpec.md)
 - [V1SecretVolumeSource](docs/V1SecretVolumeSource.md)
 - [V1SecurityContext](docs/V1SecurityContext.md)
 - [V1SecurityContextConstraints](docs/V1SecurityContextConstraints.md)
 - [V1SecurityContextConstraintsList](docs/V1SecurityContextConstraintsList.md)
 - [V1SelfSubjectRulesReview](docs/V1SelfSubjectRulesReview.md)
 - [V1SelfSubjectRulesReviewSpec](docs/V1SelfSubjectRulesReviewSpec.md)
 - [V1Service](docs/V1Service.md)
 - [V1ServiceAccount](docs/V1ServiceAccount.md)
 - [V1ServiceAccountList](docs/V1ServiceAccountList.md)
 - [V1ServiceAccountPodSecurityPolicyReviewStatus](docs/V1ServiceAccountPodSecurityPolicyReviewStatus.md)
 - [V1ServiceList](docs/V1ServiceList.md)
 - [V1ServicePort](docs/V1ServicePort.md)
 - [V1ServiceSpec](docs/V1ServiceSpec.md)
 - [V1ServiceStatus](docs/V1ServiceStatus.md)
 - [V1SignatureCondition](docs/V1SignatureCondition.md)
 - [V1SignatureIssuer](docs/V1SignatureIssuer.md)
 - [V1SignatureSubject](docs/V1SignatureSubject.md)
 - [V1SourceBuildStrategy](docs/V1SourceBuildStrategy.md)
 - [V1SourceControlUser](docs/V1SourceControlUser.md)
 - [V1SourceRevision](docs/V1SourceRevision.md)
 - [V1SubjectAccessReview](docs/V1SubjectAccessReview.md)
 - [V1SubjectRulesReviewStatus](docs/V1SubjectRulesReviewStatus.md)
 - [V1SupplementalGroupsStrategyOptions](docs/V1SupplementalGroupsStrategyOptions.md)
 - [V1TCPSocketAction](docs/V1TCPSocketAction.md)
 - [V1TLSConfig](docs/V1TLSConfig.md)
 - [V1TagEvent](docs/V1TagEvent.md)
 - [V1TagEventCondition](docs/V1TagEventCondition.md)
 - [V1TagImageHook](docs/V1TagImageHook.md)
 - [V1TagImportPolicy](docs/V1TagImportPolicy.md)
 - [V1TagReference](docs/V1TagReference.md)
 - [V1Template](docs/V1Template.md)
 - [V1TemplateList](docs/V1TemplateList.md)
 - [V1User](docs/V1User.md)
 - [V1UserIdentityMapping](docs/V1UserIdentityMapping.md)
 - [V1UserList](docs/V1UserList.md)
 - [V1Volume](docs/V1Volume.md)
 - [V1VolumeMount](docs/V1VolumeMount.md)
 - [V1VsphereVirtualDiskVolumeSource](docs/V1VsphereVirtualDiskVolumeSource.md)
 - [V1WebHookTrigger](docs/V1WebHookTrigger.md)
 - [V1alpha1CertificateSigningRequest](docs/V1alpha1CertificateSigningRequest.md)
 - [V1alpha1CertificateSigningRequestCondition](docs/V1alpha1CertificateSigningRequestCondition.md)
 - [V1alpha1CertificateSigningRequestList](docs/V1alpha1CertificateSigningRequestList.md)
 - [V1alpha1CertificateSigningRequestSpec](docs/V1alpha1CertificateSigningRequestSpec.md)
 - [V1alpha1CertificateSigningRequestStatus](docs/V1alpha1CertificateSigningRequestStatus.md)
 - [V1alpha1Eviction](docs/V1alpha1Eviction.md)
 - [V1alpha1PetSet](docs/V1alpha1PetSet.md)
 - [V1alpha1PetSetList](docs/V1alpha1PetSetList.md)
 - [V1alpha1PetSetSpec](docs/V1alpha1PetSetSpec.md)
 - [V1alpha1PetSetStatus](docs/V1alpha1PetSetStatus.md)
 - [V1alpha1PodDisruptionBudget](docs/V1alpha1PodDisruptionBudget.md)
 - [V1alpha1PodDisruptionBudgetList](docs/V1alpha1PodDisruptionBudgetList.md)
 - [V1alpha1PodDisruptionBudgetSpec](docs/V1alpha1PodDisruptionBudgetSpec.md)
 - [V1alpha1PodDisruptionBudgetStatus](docs/V1alpha1PodDisruptionBudgetStatus.md)
 - [V1beta1APIVersion](docs/V1beta1APIVersion.md)
 - [V1beta1CPUTargetUtilization](docs/V1beta1CPUTargetUtilization.md)
 - [V1beta1DaemonSet](docs/V1beta1DaemonSet.md)
 - [V1beta1DaemonSetList](docs/V1beta1DaemonSetList.md)
 - [V1beta1DaemonSetSpec](docs/V1beta1DaemonSetSpec.md)
 - [V1beta1DaemonSetStatus](docs/V1beta1DaemonSetStatus.md)
 - [V1beta1Deployment](docs/V1beta1Deployment.md)
 - [V1beta1DeploymentList](docs/V1beta1DeploymentList.md)
 - [V1beta1DeploymentRollback](docs/V1beta1DeploymentRollback.md)
 - [V1beta1DeploymentSpec](docs/V1beta1DeploymentSpec.md)
 - [V1beta1DeploymentStatus](docs/V1beta1DeploymentStatus.md)
 - [V1beta1DeploymentStrategy](docs/V1beta1DeploymentStrategy.md)
 - [V1beta1FSGroupStrategyOptions](docs/V1beta1FSGroupStrategyOptions.md)
 - [V1beta1HTTPIngressPath](docs/V1beta1HTTPIngressPath.md)
 - [V1beta1HTTPIngressRuleValue](docs/V1beta1HTTPIngressRuleValue.md)
 - [V1beta1HorizontalPodAutoscaler](docs/V1beta1HorizontalPodAutoscaler.md)
 - [V1beta1HorizontalPodAutoscalerList](docs/V1beta1HorizontalPodAutoscalerList.md)
 - [V1beta1HorizontalPodAutoscalerSpec](docs/V1beta1HorizontalPodAutoscalerSpec.md)
 - [V1beta1HorizontalPodAutoscalerStatus](docs/V1beta1HorizontalPodAutoscalerStatus.md)
 - [V1beta1HostPortRange](docs/V1beta1HostPortRange.md)
 - [V1beta1IDRange](docs/V1beta1IDRange.md)
 - [V1beta1Ingress](docs/V1beta1Ingress.md)
 - [V1beta1IngressBackend](docs/V1beta1IngressBackend.md)
 - [V1beta1IngressList](docs/V1beta1IngressList.md)
 - [V1beta1IngressRule](docs/V1beta1IngressRule.md)
 - [V1beta1IngressSpec](docs/V1beta1IngressSpec.md)
 - [V1beta1IngressStatus](docs/V1beta1IngressStatus.md)
 - [V1beta1IngressTLS](docs/V1beta1IngressTLS.md)
 - [V1beta1Job](docs/V1beta1Job.md)
 - [V1beta1JobCondition](docs/V1beta1JobCondition.md)
 - [V1beta1JobList](docs/V1beta1JobList.md)
 - [V1beta1JobSpec](docs/V1beta1JobSpec.md)
 - [V1beta1JobStatus](docs/V1beta1JobStatus.md)
 - [V1beta1LabelSelector](docs/V1beta1LabelSelector.md)
 - [V1beta1LabelSelectorRequirement](docs/V1beta1LabelSelectorRequirement.md)
 - [V1beta1NetworkPolicy](docs/V1beta1NetworkPolicy.md)
 - [V1beta1NetworkPolicyIngressRule](docs/V1beta1NetworkPolicyIngressRule.md)
 - [V1beta1NetworkPolicyList](docs/V1beta1NetworkPolicyList.md)
 - [V1beta1NetworkPolicyPeer](docs/V1beta1NetworkPolicyPeer.md)
 - [V1beta1NetworkPolicyPort](docs/V1beta1NetworkPolicyPort.md)
 - [V1beta1NetworkPolicySpec](docs/V1beta1NetworkPolicySpec.md)
 - [V1beta1PodSecurityPolicy](docs/V1beta1PodSecurityPolicy.md)
 - [V1beta1PodSecurityPolicyList](docs/V1beta1PodSecurityPolicyList.md)
 - [V1beta1PodSecurityPolicySpec](docs/V1beta1PodSecurityPolicySpec.md)
 - [V1beta1ReplicaSet](docs/V1beta1ReplicaSet.md)
 - [V1beta1ReplicaSetList](docs/V1beta1ReplicaSetList.md)
 - [V1beta1ReplicaSetSpec](docs/V1beta1ReplicaSetSpec.md)
 - [V1beta1ReplicaSetStatus](docs/V1beta1ReplicaSetStatus.md)
 - [V1beta1RollbackConfig](docs/V1beta1RollbackConfig.md)
 - [V1beta1RollingUpdateDeployment](docs/V1beta1RollingUpdateDeployment.md)
 - [V1beta1RunAsUserStrategyOptions](docs/V1beta1RunAsUserStrategyOptions.md)
 - [V1beta1SELinuxStrategyOptions](docs/V1beta1SELinuxStrategyOptions.md)
 - [V1beta1Scale](docs/V1beta1Scale.md)
 - [V1beta1ScaleSpec](docs/V1beta1ScaleSpec.md)
 - [V1beta1ScaleStatus](docs/V1beta1ScaleStatus.md)
 - [V1beta1StorageClass](docs/V1beta1StorageClass.md)
 - [V1beta1StorageClassList](docs/V1beta1StorageClassList.md)
 - [V1beta1SubresourceReference](docs/V1beta1SubresourceReference.md)
 - [V1beta1SupplementalGroupsStrategyOptions](docs/V1beta1SupplementalGroupsStrategyOptions.md)
 - [V1beta1ThirdPartyResource](docs/V1beta1ThirdPartyResource.md)
 - [V1beta1ThirdPartyResourceList](docs/V1beta1ThirdPartyResourceList.md)
 - [V1beta1TokenReview](docs/V1beta1TokenReview.md)
 - [V1beta1TokenReviewSpec](docs/V1beta1TokenReviewSpec.md)
 - [V1beta1TokenReviewStatus](docs/V1beta1TokenReviewStatus.md)
 - [V1beta1UserInfo](docs/V1beta1UserInfo.md)
 - [V2alpha1Job](docs/V2alpha1Job.md)
 - [V2alpha1JobCondition](docs/V2alpha1JobCondition.md)
 - [V2alpha1JobList](docs/V2alpha1JobList.md)
 - [V2alpha1JobSpec](docs/V2alpha1JobSpec.md)
 - [V2alpha1JobStatus](docs/V2alpha1JobStatus.md)
 - [V2alpha1JobTemplateSpec](docs/V2alpha1JobTemplateSpec.md)
 - [V2alpha1LabelSelector](docs/V2alpha1LabelSelector.md)
 - [V2alpha1LabelSelectorRequirement](docs/V2alpha1LabelSelectorRequirement.md)
 - [V2alpha1ScheduledJob](docs/V2alpha1ScheduledJob.md)
 - [V2alpha1ScheduledJobList](docs/V2alpha1ScheduledJobList.md)
 - [V2alpha1ScheduledJobSpec](docs/V2alpha1ScheduledJobSpec.md)
 - [V2alpha1ScheduledJobStatus](docs/V2alpha1ScheduledJobStatus.md)
 - [VersionInfo](docs/VersionInfo.md)
 - [VersionedEvent](docs/VersionedEvent.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issue.

## Author



