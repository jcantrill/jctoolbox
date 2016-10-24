/**
 * OpenShift API (with Kubernetes)
 * OpenShift provides builds, application lifecycle, image content management, and administrative policy on top of Kubernetes. The API allows consistent management of those objects.  All API operations are authenticated via an Authorization bearer token that is provided for service accounts as a generated secret (in JWT form) or via the native OAuth endpoint located at /oauth/authorize. Core infrastructure components may use client certificates that require no authentication.  All API operations return a 'resourceVersion' string that represents the version of the object in the underlying storage. The standard LIST operation performs a snapshot read of the underlying objects, returning a resourceVersion representing a consistent version of the listed objects. The WATCH operation allows all updates to a set of objects after the provided resourceVersion to be observed by a client. By listing and beginning a watch from the returned resourceVersion, clients may observe a consistent view of the state of one or more objects. Note that WATCH always returns the update after the provided resourceVersion. Watch may be extended a limited time in the past - using etcd 2 the watch window is 1000 events (which on a large cluster may only be a few tens of seconds) so clients must explicitly handle the \"watch to old error\" by re-listing.  Objects are divided into two rough categories - those that have a lifecycle and must reflect the state of the cluster, and those that have no state. Objects with lifecycle typically have three main sections:  * 'metadata' common to all objects * a 'spec' that represents the desired state * a 'status' that represents how much of the desired state is reflected on   the cluster at the current time  Objects that have no state have 'metadata' but may lack a 'spec' or 'status' section.  Objects are divided into those that are namespace scoped (only exist inside of a namespace) and those that are cluster scoped (exist outside of a namespace). A namespace scoped resource will be deleted when the namespace is deleted and cannot be created if the namespace has not yet been created or is in the process of deletion. Cluster scoped resources are typically only accessible to admins - resources like nodes, persistent volumes, and cluster policy.  All objects have a schema that is a combination of the 'kind' and 'apiVersion' fields. This schema is additive only for any given version - no backwards incompatible changes are allowed without incrementing the apiVersion. The server will return and accept a number of standard responses that share a common schema - for instance, the common error type is 'unversioned.Status' (described below) and will be returned on any error from the API server.  The API is available in multiple serialization formats - the default is JSON (Accept: application/json and Content-Type: application/json) but clients may also use YAML (application/yaml) or the native Protobuf schema (application/vnd.kubernetes.protobuf). Note that the format of the WATCH API call is slightly different - for JSON it returns newline delimited objects while for Protobuf it returns length-delimited frames (4 bytes in network-order) that contain a 'versioned.Watch' Protobuf object.  See the OpenShift documentation at https://docs.openshift.org for more information. 
 *
 * OpenAPI spec version: latest
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package com.openshift.restclient.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import com.openshift.restclient.model.V1ImageDockerImageSignatures;
import com.openshift.restclient.model.V1ImageLayer;
import com.openshift.restclient.model.V1ImageSignature;
import com.openshift.restclient.model.V1ObjectMeta;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


/**
 * Image is an immutable representation of a Docker image and metadata at a point in time.
 */
@ApiModel(description = "Image is an immutable representation of a Docker image and metadata at a point in time.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-10-24T16:19:28.908-04:00")
public class V1Image   {
  @SerializedName("apiVersion")
  private String apiVersion = null;

  @SerializedName("dockerImageConfig")
  private String dockerImageConfig = null;

  @SerializedName("dockerImageLayers")
  private List<V1ImageLayer> dockerImageLayers = new ArrayList<V1ImageLayer>();

  @SerializedName("dockerImageManifest")
  private String dockerImageManifest = null;

  @SerializedName("dockerImageManifestMediaType")
  private String dockerImageManifestMediaType = null;

  @SerializedName("dockerImageMetadata")
  private String dockerImageMetadata = null;

  @SerializedName("dockerImageMetadataVersion")
  private String dockerImageMetadataVersion = null;

  @SerializedName("dockerImageReference")
  private String dockerImageReference = null;

  @SerializedName("dockerImageSignatures")
  private List<V1ImageDockerImageSignatures> dockerImageSignatures = new ArrayList<V1ImageDockerImageSignatures>();

  @SerializedName("kind")
  private String kind = null;

  @SerializedName("metadata")
  private V1ObjectMeta metadata = null;

  @SerializedName("signatures")
  private List<V1ImageSignature> signatures = new ArrayList<V1ImageSignature>();

  public V1Image apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

   /**
   * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: http://releases.k8s.io/release-1.4/docs/devel/api-conventions.md#resources
   * @return apiVersion
  **/
  @ApiModelProperty(example = "null", value = "APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: http://releases.k8s.io/release-1.4/docs/devel/api-conventions.md#resources")
  public String getApiVersion() {
    return apiVersion;
  }

  public void setApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
  }

  public V1Image dockerImageConfig(String dockerImageConfig) {
    this.dockerImageConfig = dockerImageConfig;
    return this;
  }

   /**
   * DockerImageConfig is a JSON blob that the runtime uses to set up the container. This is a part of manifest schema v2.
   * @return dockerImageConfig
  **/
  @ApiModelProperty(example = "null", value = "DockerImageConfig is a JSON blob that the runtime uses to set up the container. This is a part of manifest schema v2.")
  public String getDockerImageConfig() {
    return dockerImageConfig;
  }

  public void setDockerImageConfig(String dockerImageConfig) {
    this.dockerImageConfig = dockerImageConfig;
  }

  public V1Image dockerImageLayers(List<V1ImageLayer> dockerImageLayers) {
    this.dockerImageLayers = dockerImageLayers;
    return this;
  }

  public V1Image addDockerImageLayersItem(V1ImageLayer dockerImageLayersItem) {
    this.dockerImageLayers.add(dockerImageLayersItem);
    return this;
  }

   /**
   * DockerImageLayers represents the layers in the image. May not be set if the image does not define that data.
   * @return dockerImageLayers
  **/
  @ApiModelProperty(example = "null", required = true, value = "DockerImageLayers represents the layers in the image. May not be set if the image does not define that data.")
  public List<V1ImageLayer> getDockerImageLayers() {
    return dockerImageLayers;
  }

  public void setDockerImageLayers(List<V1ImageLayer> dockerImageLayers) {
    this.dockerImageLayers = dockerImageLayers;
  }

  public V1Image dockerImageManifest(String dockerImageManifest) {
    this.dockerImageManifest = dockerImageManifest;
    return this;
  }

   /**
   * DockerImageManifest is the raw JSON of the manifest
   * @return dockerImageManifest
  **/
  @ApiModelProperty(example = "null", value = "DockerImageManifest is the raw JSON of the manifest")
  public String getDockerImageManifest() {
    return dockerImageManifest;
  }

  public void setDockerImageManifest(String dockerImageManifest) {
    this.dockerImageManifest = dockerImageManifest;
  }

  public V1Image dockerImageManifestMediaType(String dockerImageManifestMediaType) {
    this.dockerImageManifestMediaType = dockerImageManifestMediaType;
    return this;
  }

   /**
   * DockerImageManifestMediaType specifies the mediaType of manifest. This is a part of manifest schema v2.
   * @return dockerImageManifestMediaType
  **/
  @ApiModelProperty(example = "null", value = "DockerImageManifestMediaType specifies the mediaType of manifest. This is a part of manifest schema v2.")
  public String getDockerImageManifestMediaType() {
    return dockerImageManifestMediaType;
  }

  public void setDockerImageManifestMediaType(String dockerImageManifestMediaType) {
    this.dockerImageManifestMediaType = dockerImageManifestMediaType;
  }

  public V1Image dockerImageMetadata(String dockerImageMetadata) {
    this.dockerImageMetadata = dockerImageMetadata;
    return this;
  }

   /**
   * DockerImageMetadata contains metadata about this image
   * @return dockerImageMetadata
  **/
  @ApiModelProperty(example = "null", value = "DockerImageMetadata contains metadata about this image")
  public String getDockerImageMetadata() {
    return dockerImageMetadata;
  }

  public void setDockerImageMetadata(String dockerImageMetadata) {
    this.dockerImageMetadata = dockerImageMetadata;
  }

  public V1Image dockerImageMetadataVersion(String dockerImageMetadataVersion) {
    this.dockerImageMetadataVersion = dockerImageMetadataVersion;
    return this;
  }

   /**
   * DockerImageMetadataVersion conveys the version of the object, which if empty defaults to \"1.0\"
   * @return dockerImageMetadataVersion
  **/
  @ApiModelProperty(example = "null", value = "DockerImageMetadataVersion conveys the version of the object, which if empty defaults to \"1.0\"")
  public String getDockerImageMetadataVersion() {
    return dockerImageMetadataVersion;
  }

  public void setDockerImageMetadataVersion(String dockerImageMetadataVersion) {
    this.dockerImageMetadataVersion = dockerImageMetadataVersion;
  }

  public V1Image dockerImageReference(String dockerImageReference) {
    this.dockerImageReference = dockerImageReference;
    return this;
  }

   /**
   * DockerImageReference is the string that can be used to pull this image.
   * @return dockerImageReference
  **/
  @ApiModelProperty(example = "null", value = "DockerImageReference is the string that can be used to pull this image.")
  public String getDockerImageReference() {
    return dockerImageReference;
  }

  public void setDockerImageReference(String dockerImageReference) {
    this.dockerImageReference = dockerImageReference;
  }

  public V1Image dockerImageSignatures(List<V1ImageDockerImageSignatures> dockerImageSignatures) {
    this.dockerImageSignatures = dockerImageSignatures;
    return this;
  }

  public V1Image addDockerImageSignaturesItem(V1ImageDockerImageSignatures dockerImageSignaturesItem) {
    this.dockerImageSignatures.add(dockerImageSignaturesItem);
    return this;
  }

   /**
   * DockerImageSignatures provides the signatures as opaque blobs. This is a part of manifest schema v1.
   * @return dockerImageSignatures
  **/
  @ApiModelProperty(example = "null", value = "DockerImageSignatures provides the signatures as opaque blobs. This is a part of manifest schema v1.")
  public List<V1ImageDockerImageSignatures> getDockerImageSignatures() {
    return dockerImageSignatures;
  }

  public void setDockerImageSignatures(List<V1ImageDockerImageSignatures> dockerImageSignatures) {
    this.dockerImageSignatures = dockerImageSignatures;
  }

  public V1Image kind(String kind) {
    this.kind = kind;
    return this;
  }

   /**
   * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: http://releases.k8s.io/release-1.4/docs/devel/api-conventions.md#types-kinds
   * @return kind
  **/
  @ApiModelProperty(example = "null", value = "Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: http://releases.k8s.io/release-1.4/docs/devel/api-conventions.md#types-kinds")
  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public V1Image metadata(V1ObjectMeta metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @ApiModelProperty(example = "null", value = "")
  public V1ObjectMeta getMetadata() {
    return metadata;
  }

  public void setMetadata(V1ObjectMeta metadata) {
    this.metadata = metadata;
  }

  public V1Image signatures(List<V1ImageSignature> signatures) {
    this.signatures = signatures;
    return this;
  }

  public V1Image addSignaturesItem(V1ImageSignature signaturesItem) {
    this.signatures.add(signaturesItem);
    return this;
  }

   /**
   * Signatures holds all signatures of the image.
   * @return signatures
  **/
  @ApiModelProperty(example = "null", value = "Signatures holds all signatures of the image.")
  public List<V1ImageSignature> getSignatures() {
    return signatures;
  }

  public void setSignatures(List<V1ImageSignature> signatures) {
    this.signatures = signatures;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1Image v1Image = (V1Image) o;
    return Objects.equals(this.apiVersion, v1Image.apiVersion) &&
        Objects.equals(this.dockerImageConfig, v1Image.dockerImageConfig) &&
        Objects.equals(this.dockerImageLayers, v1Image.dockerImageLayers) &&
        Objects.equals(this.dockerImageManifest, v1Image.dockerImageManifest) &&
        Objects.equals(this.dockerImageManifestMediaType, v1Image.dockerImageManifestMediaType) &&
        Objects.equals(this.dockerImageMetadata, v1Image.dockerImageMetadata) &&
        Objects.equals(this.dockerImageMetadataVersion, v1Image.dockerImageMetadataVersion) &&
        Objects.equals(this.dockerImageReference, v1Image.dockerImageReference) &&
        Objects.equals(this.dockerImageSignatures, v1Image.dockerImageSignatures) &&
        Objects.equals(this.kind, v1Image.kind) &&
        Objects.equals(this.metadata, v1Image.metadata) &&
        Objects.equals(this.signatures, v1Image.signatures);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiVersion, dockerImageConfig, dockerImageLayers, dockerImageManifest, dockerImageManifestMediaType, dockerImageMetadata, dockerImageMetadataVersion, dockerImageReference, dockerImageSignatures, kind, metadata, signatures);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1Image {\n");
    
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    dockerImageConfig: ").append(toIndentedString(dockerImageConfig)).append("\n");
    sb.append("    dockerImageLayers: ").append(toIndentedString(dockerImageLayers)).append("\n");
    sb.append("    dockerImageManifest: ").append(toIndentedString(dockerImageManifest)).append("\n");
    sb.append("    dockerImageManifestMediaType: ").append(toIndentedString(dockerImageManifestMediaType)).append("\n");
    sb.append("    dockerImageMetadata: ").append(toIndentedString(dockerImageMetadata)).append("\n");
    sb.append("    dockerImageMetadataVersion: ").append(toIndentedString(dockerImageMetadataVersion)).append("\n");
    sb.append("    dockerImageReference: ").append(toIndentedString(dockerImageReference)).append("\n");
    sb.append("    dockerImageSignatures: ").append(toIndentedString(dockerImageSignatures)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    signatures: ").append(toIndentedString(signatures)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

