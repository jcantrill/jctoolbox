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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * LimitRangeItem defines a min/max usage limit for any resource that matches on kind.
 */
@ApiModel(description = "LimitRangeItem defines a min/max usage limit for any resource that matches on kind.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-10-24T16:19:28.908-04:00")
public class V1LimitRangeItem   {
  @SerializedName("default")
  private Object _default = null;

  @SerializedName("defaultRequest")
  private Object defaultRequest = null;

  @SerializedName("max")
  private Object max = null;

  @SerializedName("maxLimitRequestRatio")
  private Object maxLimitRequestRatio = null;

  @SerializedName("min")
  private Object min = null;

  @SerializedName("type")
  private String type = null;

  public V1LimitRangeItem _default(Object _default) {
    this._default = _default;
    return this;
  }

   /**
   * Default resource requirement limit value by resource name if resource limit is omitted.
   * @return _default
  **/
  @ApiModelProperty(example = "null", value = "Default resource requirement limit value by resource name if resource limit is omitted.")
  public Object getDefault() {
    return _default;
  }

  public void setDefault(Object _default) {
    this._default = _default;
  }

  public V1LimitRangeItem defaultRequest(Object defaultRequest) {
    this.defaultRequest = defaultRequest;
    return this;
  }

   /**
   * DefaultRequest is the default resource requirement request value by resource name if resource request is omitted.
   * @return defaultRequest
  **/
  @ApiModelProperty(example = "null", value = "DefaultRequest is the default resource requirement request value by resource name if resource request is omitted.")
  public Object getDefaultRequest() {
    return defaultRequest;
  }

  public void setDefaultRequest(Object defaultRequest) {
    this.defaultRequest = defaultRequest;
  }

  public V1LimitRangeItem max(Object max) {
    this.max = max;
    return this;
  }

   /**
   * Max usage constraints on this kind by resource name.
   * @return max
  **/
  @ApiModelProperty(example = "null", value = "Max usage constraints on this kind by resource name.")
  public Object getMax() {
    return max;
  }

  public void setMax(Object max) {
    this.max = max;
  }

  public V1LimitRangeItem maxLimitRequestRatio(Object maxLimitRequestRatio) {
    this.maxLimitRequestRatio = maxLimitRequestRatio;
    return this;
  }

   /**
   * MaxLimitRequestRatio if specified, the named resource must have a request and limit that are both non-zero where limit divided by request is less than or equal to the enumerated value; this represents the max burst for the named resource.
   * @return maxLimitRequestRatio
  **/
  @ApiModelProperty(example = "null", value = "MaxLimitRequestRatio if specified, the named resource must have a request and limit that are both non-zero where limit divided by request is less than or equal to the enumerated value; this represents the max burst for the named resource.")
  public Object getMaxLimitRequestRatio() {
    return maxLimitRequestRatio;
  }

  public void setMaxLimitRequestRatio(Object maxLimitRequestRatio) {
    this.maxLimitRequestRatio = maxLimitRequestRatio;
  }

  public V1LimitRangeItem min(Object min) {
    this.min = min;
    return this;
  }

   /**
   * Min usage constraints on this kind by resource name.
   * @return min
  **/
  @ApiModelProperty(example = "null", value = "Min usage constraints on this kind by resource name.")
  public Object getMin() {
    return min;
  }

  public void setMin(Object min) {
    this.min = min;
  }

  public V1LimitRangeItem type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Type of resource that this limit applies to.
   * @return type
  **/
  @ApiModelProperty(example = "null", value = "Type of resource that this limit applies to.")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1LimitRangeItem v1LimitRangeItem = (V1LimitRangeItem) o;
    return Objects.equals(this._default, v1LimitRangeItem._default) &&
        Objects.equals(this.defaultRequest, v1LimitRangeItem.defaultRequest) &&
        Objects.equals(this.max, v1LimitRangeItem.max) &&
        Objects.equals(this.maxLimitRequestRatio, v1LimitRangeItem.maxLimitRequestRatio) &&
        Objects.equals(this.min, v1LimitRangeItem.min) &&
        Objects.equals(this.type, v1LimitRangeItem.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_default, defaultRequest, max, maxLimitRequestRatio, min, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1LimitRangeItem {\n");
    
    sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
    sb.append("    defaultRequest: ").append(toIndentedString(defaultRequest)).append("\n");
    sb.append("    max: ").append(toIndentedString(max)).append("\n");
    sb.append("    maxLimitRequestRatio: ").append(toIndentedString(maxLimitRequestRatio)).append("\n");
    sb.append("    min: ").append(toIndentedString(min)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
