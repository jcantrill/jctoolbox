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
import com.openshift.restclient.model.V1ExecAction;
import com.openshift.restclient.model.V1HTTPGetAction;
import com.openshift.restclient.model.V1TCPSocketAction;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * Probe describes a health check to be performed against a container to determine whether it is alive or ready to receive traffic.
 */
@ApiModel(description = "Probe describes a health check to be performed against a container to determine whether it is alive or ready to receive traffic.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-10-24T16:19:28.908-04:00")
public class V1Probe   {
  @SerializedName("exec")
  private V1ExecAction exec = null;

  @SerializedName("failureThreshold")
  private Integer failureThreshold = null;

  @SerializedName("httpGet")
  private V1HTTPGetAction httpGet = null;

  @SerializedName("initialDelaySeconds")
  private Integer initialDelaySeconds = null;

  @SerializedName("periodSeconds")
  private Integer periodSeconds = null;

  @SerializedName("successThreshold")
  private Integer successThreshold = null;

  @SerializedName("tcpSocket")
  private V1TCPSocketAction tcpSocket = null;

  @SerializedName("timeoutSeconds")
  private Integer timeoutSeconds = null;

  public V1Probe exec(V1ExecAction exec) {
    this.exec = exec;
    return this;
  }

   /**
   * Get exec
   * @return exec
  **/
  @ApiModelProperty(example = "null", value = "")
  public V1ExecAction getExec() {
    return exec;
  }

  public void setExec(V1ExecAction exec) {
    this.exec = exec;
  }

  public V1Probe failureThreshold(Integer failureThreshold) {
    this.failureThreshold = failureThreshold;
    return this;
  }

   /**
   * Minimum consecutive failures for the probe to be considered failed after having succeeded. Defaults to 3. Minimum value is 1.
   * @return failureThreshold
  **/
  @ApiModelProperty(example = "null", value = "Minimum consecutive failures for the probe to be considered failed after having succeeded. Defaults to 3. Minimum value is 1.")
  public Integer getFailureThreshold() {
    return failureThreshold;
  }

  public void setFailureThreshold(Integer failureThreshold) {
    this.failureThreshold = failureThreshold;
  }

  public V1Probe httpGet(V1HTTPGetAction httpGet) {
    this.httpGet = httpGet;
    return this;
  }

   /**
   * Get httpGet
   * @return httpGet
  **/
  @ApiModelProperty(example = "null", value = "")
  public V1HTTPGetAction getHttpGet() {
    return httpGet;
  }

  public void setHttpGet(V1HTTPGetAction httpGet) {
    this.httpGet = httpGet;
  }

  public V1Probe initialDelaySeconds(Integer initialDelaySeconds) {
    this.initialDelaySeconds = initialDelaySeconds;
    return this;
  }

   /**
   * Number of seconds after the container has started before liveness probes are initiated. More info: http://releases.k8s.io/release-1.4/docs/user-guide/pod-states.md#container-probes
   * @return initialDelaySeconds
  **/
  @ApiModelProperty(example = "null", value = "Number of seconds after the container has started before liveness probes are initiated. More info: http://releases.k8s.io/release-1.4/docs/user-guide/pod-states.md#container-probes")
  public Integer getInitialDelaySeconds() {
    return initialDelaySeconds;
  }

  public void setInitialDelaySeconds(Integer initialDelaySeconds) {
    this.initialDelaySeconds = initialDelaySeconds;
  }

  public V1Probe periodSeconds(Integer periodSeconds) {
    this.periodSeconds = periodSeconds;
    return this;
  }

   /**
   * How often (in seconds) to perform the probe. Default to 10 seconds. Minimum value is 1.
   * @return periodSeconds
  **/
  @ApiModelProperty(example = "null", value = "How often (in seconds) to perform the probe. Default to 10 seconds. Minimum value is 1.")
  public Integer getPeriodSeconds() {
    return periodSeconds;
  }

  public void setPeriodSeconds(Integer periodSeconds) {
    this.periodSeconds = periodSeconds;
  }

  public V1Probe successThreshold(Integer successThreshold) {
    this.successThreshold = successThreshold;
    return this;
  }

   /**
   * Minimum consecutive successes for the probe to be considered successful after having failed. Defaults to 1. Must be 1 for liveness. Minimum value is 1.
   * @return successThreshold
  **/
  @ApiModelProperty(example = "null", value = "Minimum consecutive successes for the probe to be considered successful after having failed. Defaults to 1. Must be 1 for liveness. Minimum value is 1.")
  public Integer getSuccessThreshold() {
    return successThreshold;
  }

  public void setSuccessThreshold(Integer successThreshold) {
    this.successThreshold = successThreshold;
  }

  public V1Probe tcpSocket(V1TCPSocketAction tcpSocket) {
    this.tcpSocket = tcpSocket;
    return this;
  }

   /**
   * Get tcpSocket
   * @return tcpSocket
  **/
  @ApiModelProperty(example = "null", value = "")
  public V1TCPSocketAction getTcpSocket() {
    return tcpSocket;
  }

  public void setTcpSocket(V1TCPSocketAction tcpSocket) {
    this.tcpSocket = tcpSocket;
  }

  public V1Probe timeoutSeconds(Integer timeoutSeconds) {
    this.timeoutSeconds = timeoutSeconds;
    return this;
  }

   /**
   * Number of seconds after which the probe times out. Defaults to 1 second. Minimum value is 1. More info: http://releases.k8s.io/release-1.4/docs/user-guide/pod-states.md#container-probes
   * @return timeoutSeconds
  **/
  @ApiModelProperty(example = "null", value = "Number of seconds after which the probe times out. Defaults to 1 second. Minimum value is 1. More info: http://releases.k8s.io/release-1.4/docs/user-guide/pod-states.md#container-probes")
  public Integer getTimeoutSeconds() {
    return timeoutSeconds;
  }

  public void setTimeoutSeconds(Integer timeoutSeconds) {
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
    V1Probe v1Probe = (V1Probe) o;
    return Objects.equals(this.exec, v1Probe.exec) &&
        Objects.equals(this.failureThreshold, v1Probe.failureThreshold) &&
        Objects.equals(this.httpGet, v1Probe.httpGet) &&
        Objects.equals(this.initialDelaySeconds, v1Probe.initialDelaySeconds) &&
        Objects.equals(this.periodSeconds, v1Probe.periodSeconds) &&
        Objects.equals(this.successThreshold, v1Probe.successThreshold) &&
        Objects.equals(this.tcpSocket, v1Probe.tcpSocket) &&
        Objects.equals(this.timeoutSeconds, v1Probe.timeoutSeconds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exec, failureThreshold, httpGet, initialDelaySeconds, periodSeconds, successThreshold, tcpSocket, timeoutSeconds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1Probe {\n");
    
    sb.append("    exec: ").append(toIndentedString(exec)).append("\n");
    sb.append("    failureThreshold: ").append(toIndentedString(failureThreshold)).append("\n");
    sb.append("    httpGet: ").append(toIndentedString(httpGet)).append("\n");
    sb.append("    initialDelaySeconds: ").append(toIndentedString(initialDelaySeconds)).append("\n");
    sb.append("    periodSeconds: ").append(toIndentedString(periodSeconds)).append("\n");
    sb.append("    successThreshold: ").append(toIndentedString(successThreshold)).append("\n");
    sb.append("    tcpSocket: ").append(toIndentedString(tcpSocket)).append("\n");
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
