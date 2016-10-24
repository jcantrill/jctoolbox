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
import com.openshift.restclient.model.V1LifecycleHook;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * RecreateDeploymentStrategyParams are the input to the Recreate deployment strategy.
 */
@ApiModel(description = "RecreateDeploymentStrategyParams are the input to the Recreate deployment strategy.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-10-24T16:19:28.908-04:00")
public class V1RecreateDeploymentStrategyParams   {
  @SerializedName("mid")
  private V1LifecycleHook mid = null;

  @SerializedName("post")
  private V1LifecycleHook post = null;

  @SerializedName("pre")
  private V1LifecycleHook pre = null;

  @SerializedName("timeoutSeconds")
  private Long timeoutSeconds = null;

  public V1RecreateDeploymentStrategyParams mid(V1LifecycleHook mid) {
    this.mid = mid;
    return this;
  }

   /**
   * Get mid
   * @return mid
  **/
  @ApiModelProperty(example = "null", value = "")
  public V1LifecycleHook getMid() {
    return mid;
  }

  public void setMid(V1LifecycleHook mid) {
    this.mid = mid;
  }

  public V1RecreateDeploymentStrategyParams post(V1LifecycleHook post) {
    this.post = post;
    return this;
  }

   /**
   * Get post
   * @return post
  **/
  @ApiModelProperty(example = "null", value = "")
  public V1LifecycleHook getPost() {
    return post;
  }

  public void setPost(V1LifecycleHook post) {
    this.post = post;
  }

  public V1RecreateDeploymentStrategyParams pre(V1LifecycleHook pre) {
    this.pre = pre;
    return this;
  }

   /**
   * Get pre
   * @return pre
  **/
  @ApiModelProperty(example = "null", value = "")
  public V1LifecycleHook getPre() {
    return pre;
  }

  public void setPre(V1LifecycleHook pre) {
    this.pre = pre;
  }

  public V1RecreateDeploymentStrategyParams timeoutSeconds(Long timeoutSeconds) {
    this.timeoutSeconds = timeoutSeconds;
    return this;
  }

   /**
   * TimeoutSeconds is the time to wait for updates before giving up. If the value is nil, a default will be used.
   * @return timeoutSeconds
  **/
  @ApiModelProperty(example = "null", value = "TimeoutSeconds is the time to wait for updates before giving up. If the value is nil, a default will be used.")
  public Long getTimeoutSeconds() {
    return timeoutSeconds;
  }

  public void setTimeoutSeconds(Long timeoutSeconds) {
    this.timeoutSeconds = timeoutSeconds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1RecreateDeploymentStrategyParams v1RecreateDeploymentStrategyParams = (V1RecreateDeploymentStrategyParams) o;
    return Objects.equals(this.mid, v1RecreateDeploymentStrategyParams.mid) &&
        Objects.equals(this.post, v1RecreateDeploymentStrategyParams.post) &&
        Objects.equals(this.pre, v1RecreateDeploymentStrategyParams.pre) &&
        Objects.equals(this.timeoutSeconds, v1RecreateDeploymentStrategyParams.timeoutSeconds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mid, post, pre, timeoutSeconds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1RecreateDeploymentStrategyParams {\n");
    
    sb.append("    mid: ").append(toIndentedString(mid)).append("\n");
    sb.append("    post: ").append(toIndentedString(post)).append("\n");
    sb.append("    pre: ").append(toIndentedString(pre)).append("\n");
    sb.append("    timeoutSeconds: ").append(toIndentedString(timeoutSeconds)).append("\n");
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

