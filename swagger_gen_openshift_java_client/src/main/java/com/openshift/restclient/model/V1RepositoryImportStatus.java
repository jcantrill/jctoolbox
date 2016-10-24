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
import com.openshift.restclient.model.UnversionedStatus;
import com.openshift.restclient.model.V1ImageImportStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


/**
 * RepositoryImportStatus describes the result of an image repository import
 */
@ApiModel(description = "RepositoryImportStatus describes the result of an image repository import")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-10-24T16:19:28.908-04:00")
public class V1RepositoryImportStatus   {
  @SerializedName("additionalTags")
  private List<String> additionalTags = new ArrayList<String>();

  @SerializedName("images")
  private List<V1ImageImportStatus> images = new ArrayList<V1ImageImportStatus>();

  @SerializedName("status")
  private UnversionedStatus status = null;

  public V1RepositoryImportStatus additionalTags(List<String> additionalTags) {
    this.additionalTags = additionalTags;
    return this;
  }

  public V1RepositoryImportStatus addAdditionalTagsItem(String additionalTagsItem) {
    this.additionalTags.add(additionalTagsItem);
    return this;
  }

   /**
   * AdditionalTags are tags that exist in the repository but were not imported because a maximum limit of automatic imports was applied.
   * @return additionalTags
  **/
  @ApiModelProperty(example = "null", value = "AdditionalTags are tags that exist in the repository but were not imported because a maximum limit of automatic imports was applied.")
  public List<String> getAdditionalTags() {
    return additionalTags;
  }

  public void setAdditionalTags(List<String> additionalTags) {
    this.additionalTags = additionalTags;
  }

  public V1RepositoryImportStatus images(List<V1ImageImportStatus> images) {
    this.images = images;
    return this;
  }

  public V1RepositoryImportStatus addImagesItem(V1ImageImportStatus imagesItem) {
    this.images.add(imagesItem);
    return this;
  }

   /**
   * Images is a list of images successfully retrieved by the import of the repository.
   * @return images
  **/
  @ApiModelProperty(example = "null", value = "Images is a list of images successfully retrieved by the import of the repository.")
  public List<V1ImageImportStatus> getImages() {
    return images;
  }

  public void setImages(List<V1ImageImportStatus> images) {
    this.images = images;
  }

  public V1RepositoryImportStatus status(UnversionedStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(example = "null", value = "")
  public UnversionedStatus getStatus() {
    return status;
  }

  public void setStatus(UnversionedStatus status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1RepositoryImportStatus v1RepositoryImportStatus = (V1RepositoryImportStatus) o;
    return Objects.equals(this.additionalTags, v1RepositoryImportStatus.additionalTags) &&
        Objects.equals(this.images, v1RepositoryImportStatus.images) &&
        Objects.equals(this.status, v1RepositoryImportStatus.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalTags, images, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1RepositoryImportStatus {\n");
    
    sb.append("    additionalTags: ").append(toIndentedString(additionalTags)).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
