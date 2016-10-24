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
import com.openshift.restclient.model.V1ContainerState;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * ContainerStatus contains details for the current status of this container.
 */
@ApiModel(description = "ContainerStatus contains details for the current status of this container.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-10-24T16:19:28.908-04:00")
public class V1ContainerStatus   {
  @SerializedName("containerID")
  private String containerID = null;

  @SerializedName("image")
  private String image = null;

  @SerializedName("imageID")
  private String imageID = null;

  @SerializedName("lastState")
  private V1ContainerState lastState = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("ready")
  private Boolean ready = null;

  @SerializedName("restartCount")
  private Integer restartCount = null;

  @SerializedName("state")
  private V1ContainerState state = null;

  public V1ContainerStatus containerID(String containerID) {
    this.containerID = containerID;
    return this;
  }

   /**
   * Container's ID in the format 'docker://<container_id>'. More info: http://releases.k8s.io/release-1.4/docs/user-guide/container-environment.md#container-information
   * @return containerID
  **/
  @ApiModelProperty(example = "null", value = "Container's ID in the format 'docker://<container_id>'. More info: http://releases.k8s.io/release-1.4/docs/user-guide/container-environment.md#container-information")
  public String getContainerID() {
    return containerID;
  }

  public void setContainerID(String containerID) {
    this.containerID = containerID;
  }

  public V1ContainerStatus image(String image) {
    this.image = image;
    return this;
  }

   /**
   * The image the container is running. More info: http://releases.k8s.io/release-1.4/docs/user-guide/images.md
   * @return image
  **/
  @ApiModelProperty(example = "null", required = true, value = "The image the container is running. More info: http://releases.k8s.io/release-1.4/docs/user-guide/images.md")
  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }

  public V1ContainerStatus imageID(String imageID) {
    this.imageID = imageID;
    return this;
  }

   /**
   * ImageID of the container's image.
   * @return imageID
  **/
  @ApiModelProperty(example = "null", required = true, value = "ImageID of the container's image.")
  public String getImageID() {
    return imageID;
  }

  public void setImageID(String imageID) {
    this.imageID = imageID;
  }

  public V1ContainerStatus lastState(V1ContainerState lastState) {
    this.lastState = lastState;
    return this;
  }

   /**
   * Get lastState
   * @return lastState
  **/
  @ApiModelProperty(example = "null", value = "")
  public V1ContainerState getLastState() {
    return lastState;
  }

  public void setLastState(V1ContainerState lastState) {
    this.lastState = lastState;
  }

  public V1ContainerStatus name(String name) {
    this.name = name;
    return this;
  }

   /**
   * This must be a DNS_LABEL. Each container in a pod must have a unique name. Cannot be updated.
   * @return name
  **/
  @ApiModelProperty(example = "null", required = true, value = "This must be a DNS_LABEL. Each container in a pod must have a unique name. Cannot be updated.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public V1ContainerStatus ready(Boolean ready) {
    this.ready = ready;
    return this;
  }

   /**
   * Specifies whether the container has passed its readiness probe.
   * @return ready
  **/
  @ApiModelProperty(example = "null", required = true, value = "Specifies whether the container has passed its readiness probe.")
  public Boolean getReady() {
    return ready;
  }

  public void setReady(Boolean ready) {
    this.ready = ready;
  }

  public V1ContainerStatus restartCount(Integer restartCount) {
    this.restartCount = restartCount;
    return this;
  }

   /**
   * The number of times the container has been restarted, currently based on the number of dead containers that have not yet been removed. Note that this is calculated from dead containers. But those containers are subject to garbage collection. This value will get capped at 5 by GC.
   * @return restartCount
  **/
  @ApiModelProperty(example = "null", required = true, value = "The number of times the container has been restarted, currently based on the number of dead containers that have not yet been removed. Note that this is calculated from dead containers. But those containers are subject to garbage collection. This value will get capped at 5 by GC.")
  public Integer getRestartCount() {
    return restartCount;
  }

  public void setRestartCount(Integer restartCount) {
    this.restartCount = restartCount;
  }

  public V1ContainerStatus state(V1ContainerState state) {
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @ApiModelProperty(example = "null", value = "")
  public V1ContainerState getState() {
    return state;
  }

  public void setState(V1ContainerState state) {
    this.state = state;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ContainerStatus v1ContainerStatus = (V1ContainerStatus) o;
    return Objects.equals(this.containerID, v1ContainerStatus.containerID) &&
        Objects.equals(this.image, v1ContainerStatus.image) &&
        Objects.equals(this.imageID, v1ContainerStatus.imageID) &&
        Objects.equals(this.lastState, v1ContainerStatus.lastState) &&
        Objects.equals(this.name, v1ContainerStatus.name) &&
        Objects.equals(this.ready, v1ContainerStatus.ready) &&
        Objects.equals(this.restartCount, v1ContainerStatus.restartCount) &&
        Objects.equals(this.state, v1ContainerStatus.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(containerID, image, imageID, lastState, name, ready, restartCount, state);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ContainerStatus {\n");
    
    sb.append("    containerID: ").append(toIndentedString(containerID)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    imageID: ").append(toIndentedString(imageID)).append("\n");
    sb.append("    lastState: ").append(toIndentedString(lastState)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    ready: ").append(toIndentedString(ready)).append("\n");
    sb.append("    restartCount: ").append(toIndentedString(restartCount)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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

