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
import com.openshift.restclient.model.V1ContainerPort;
import com.openshift.restclient.model.V1EnvVar;
import com.openshift.restclient.model.V1Lifecycle;
import com.openshift.restclient.model.V1Probe;
import com.openshift.restclient.model.V1ResourceRequirements;
import com.openshift.restclient.model.V1SecurityContext;
import com.openshift.restclient.model.V1VolumeMount;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


/**
 * A single application container that you want to run within a pod.
 */
@ApiModel(description = "A single application container that you want to run within a pod.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-10-24T16:19:28.908-04:00")
public class V1Container   {
  @SerializedName("args")
  private List<String> args = new ArrayList<String>();

  @SerializedName("command")
  private List<String> command = new ArrayList<String>();

  @SerializedName("env")
  private List<V1EnvVar> env = new ArrayList<V1EnvVar>();

  @SerializedName("image")
  private String image = null;

  @SerializedName("imagePullPolicy")
  private String imagePullPolicy = null;

  @SerializedName("lifecycle")
  private V1Lifecycle lifecycle = null;

  @SerializedName("livenessProbe")
  private V1Probe livenessProbe = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("ports")
  private List<V1ContainerPort> ports = new ArrayList<V1ContainerPort>();

  @SerializedName("readinessProbe")
  private V1Probe readinessProbe = null;

  @SerializedName("resources")
  private V1ResourceRequirements resources = null;

  @SerializedName("securityContext")
  private V1SecurityContext securityContext = null;

  @SerializedName("stdin")
  private Boolean stdin = null;

  @SerializedName("stdinOnce")
  private Boolean stdinOnce = null;

  @SerializedName("terminationMessagePath")
  private String terminationMessagePath = null;

  @SerializedName("tty")
  private Boolean tty = null;

  @SerializedName("volumeMounts")
  private List<V1VolumeMount> volumeMounts = new ArrayList<V1VolumeMount>();

  @SerializedName("workingDir")
  private String workingDir = null;

  public V1Container args(List<String> args) {
    this.args = args;
    return this;
  }

  public V1Container addArgsItem(String argsItem) {
    this.args.add(argsItem);
    return this;
  }

   /**
   * Arguments to the entrypoint. The docker image's CMD is used if this is not provided. Variable references $(VAR_NAME) are expanded using the container's environment. If a variable cannot be resolved, the reference in the input string will be unchanged. The $(VAR_NAME) syntax can be escaped with a double $$, ie: $$(VAR_NAME). Escaped references will never be expanded, regardless of whether the variable exists or not. Cannot be updated. More info: http://releases.k8s.io/release-1.4/docs/user-guide/containers.md#containers-and-commands
   * @return args
  **/
  @ApiModelProperty(example = "null", value = "Arguments to the entrypoint. The docker image's CMD is used if this is not provided. Variable references $(VAR_NAME) are expanded using the container's environment. If a variable cannot be resolved, the reference in the input string will be unchanged. The $(VAR_NAME) syntax can be escaped with a double $$, ie: $$(VAR_NAME). Escaped references will never be expanded, regardless of whether the variable exists or not. Cannot be updated. More info: http://releases.k8s.io/release-1.4/docs/user-guide/containers.md#containers-and-commands")
  public List<String> getArgs() {
    return args;
  }

  public void setArgs(List<String> args) {
    this.args = args;
  }

  public V1Container command(List<String> command) {
    this.command = command;
    return this;
  }

  public V1Container addCommandItem(String commandItem) {
    this.command.add(commandItem);
    return this;
  }

   /**
   * Entrypoint array. Not executed within a shell. The docker image's ENTRYPOINT is used if this is not provided. Variable references $(VAR_NAME) are expanded using the container's environment. If a variable cannot be resolved, the reference in the input string will be unchanged. The $(VAR_NAME) syntax can be escaped with a double $$, ie: $$(VAR_NAME). Escaped references will never be expanded, regardless of whether the variable exists or not. Cannot be updated. More info: http://releases.k8s.io/release-1.4/docs/user-guide/containers.md#containers-and-commands
   * @return command
  **/
  @ApiModelProperty(example = "null", value = "Entrypoint array. Not executed within a shell. The docker image's ENTRYPOINT is used if this is not provided. Variable references $(VAR_NAME) are expanded using the container's environment. If a variable cannot be resolved, the reference in the input string will be unchanged. The $(VAR_NAME) syntax can be escaped with a double $$, ie: $$(VAR_NAME). Escaped references will never be expanded, regardless of whether the variable exists or not. Cannot be updated. More info: http://releases.k8s.io/release-1.4/docs/user-guide/containers.md#containers-and-commands")
  public List<String> getCommand() {
    return command;
  }

  public void setCommand(List<String> command) {
    this.command = command;
  }

  public V1Container env(List<V1EnvVar> env) {
    this.env = env;
    return this;
  }

  public V1Container addEnvItem(V1EnvVar envItem) {
    this.env.add(envItem);
    return this;
  }

   /**
   * List of environment variables to set in the container. Cannot be updated.
   * @return env
  **/
  @ApiModelProperty(example = "null", value = "List of environment variables to set in the container. Cannot be updated.")
  public List<V1EnvVar> getEnv() {
    return env;
  }

  public void setEnv(List<V1EnvVar> env) {
    this.env = env;
  }

  public V1Container image(String image) {
    this.image = image;
    return this;
  }

   /**
   * Docker image name. More info: http://releases.k8s.io/release-1.4/docs/user-guide/images.md
   * @return image
  **/
  @ApiModelProperty(example = "null", value = "Docker image name. More info: http://releases.k8s.io/release-1.4/docs/user-guide/images.md")
  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }

  public V1Container imagePullPolicy(String imagePullPolicy) {
    this.imagePullPolicy = imagePullPolicy;
    return this;
  }

   /**
   * Image pull policy. One of Always, Never, IfNotPresent. Defaults to Always if :latest tag is specified, or IfNotPresent otherwise. Cannot be updated. More info: http://releases.k8s.io/release-1.4/docs/user-guide/images.md#updating-images
   * @return imagePullPolicy
  **/
  @ApiModelProperty(example = "null", value = "Image pull policy. One of Always, Never, IfNotPresent. Defaults to Always if :latest tag is specified, or IfNotPresent otherwise. Cannot be updated. More info: http://releases.k8s.io/release-1.4/docs/user-guide/images.md#updating-images")
  public String getImagePullPolicy() {
    return imagePullPolicy;
  }

  public void setImagePullPolicy(String imagePullPolicy) {
    this.imagePullPolicy = imagePullPolicy;
  }

  public V1Container lifecycle(V1Lifecycle lifecycle) {
    this.lifecycle = lifecycle;
    return this;
  }

   /**
   * Get lifecycle
   * @return lifecycle
  **/
  @ApiModelProperty(example = "null", value = "")
  public V1Lifecycle getLifecycle() {
    return lifecycle;
  }

  public void setLifecycle(V1Lifecycle lifecycle) {
    this.lifecycle = lifecycle;
  }

  public V1Container livenessProbe(V1Probe livenessProbe) {
    this.livenessProbe = livenessProbe;
    return this;
  }

   /**
   * Get livenessProbe
   * @return livenessProbe
  **/
  @ApiModelProperty(example = "null", value = "")
  public V1Probe getLivenessProbe() {
    return livenessProbe;
  }

  public void setLivenessProbe(V1Probe livenessProbe) {
    this.livenessProbe = livenessProbe;
  }

  public V1Container name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the container specified as a DNS_LABEL. Each container in a pod must have a unique name (DNS_LABEL). Cannot be updated.
   * @return name
  **/
  @ApiModelProperty(example = "null", required = true, value = "Name of the container specified as a DNS_LABEL. Each container in a pod must have a unique name (DNS_LABEL). Cannot be updated.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public V1Container ports(List<V1ContainerPort> ports) {
    this.ports = ports;
    return this;
  }

  public V1Container addPortsItem(V1ContainerPort portsItem) {
    this.ports.add(portsItem);
    return this;
  }

   /**
   * List of ports to expose from the container. Exposing a port here gives the system additional information about the network connections a container uses, but is primarily informational. Not specifying a port here DOES NOT prevent that port from being exposed. Any port which is listening on the default \"0.0.0.0\" address inside a container will be accessible from the network. Cannot be updated.
   * @return ports
  **/
  @ApiModelProperty(example = "null", value = "List of ports to expose from the container. Exposing a port here gives the system additional information about the network connections a container uses, but is primarily informational. Not specifying a port here DOES NOT prevent that port from being exposed. Any port which is listening on the default \"0.0.0.0\" address inside a container will be accessible from the network. Cannot be updated.")
  public List<V1ContainerPort> getPorts() {
    return ports;
  }

  public void setPorts(List<V1ContainerPort> ports) {
    this.ports = ports;
  }

  public V1Container readinessProbe(V1Probe readinessProbe) {
    this.readinessProbe = readinessProbe;
    return this;
  }

   /**
   * Get readinessProbe
   * @return readinessProbe
  **/
  @ApiModelProperty(example = "null", value = "")
  public V1Probe getReadinessProbe() {
    return readinessProbe;
  }

  public void setReadinessProbe(V1Probe readinessProbe) {
    this.readinessProbe = readinessProbe;
  }

  public V1Container resources(V1ResourceRequirements resources) {
    this.resources = resources;
    return this;
  }

   /**
   * Get resources
   * @return resources
  **/
  @ApiModelProperty(example = "null", value = "")
  public V1ResourceRequirements getResources() {
    return resources;
  }

  public void setResources(V1ResourceRequirements resources) {
    this.resources = resources;
  }

  public V1Container securityContext(V1SecurityContext securityContext) {
    this.securityContext = securityContext;
    return this;
  }

   /**
   * Get securityContext
   * @return securityContext
  **/
  @ApiModelProperty(example = "null", value = "")
  public V1SecurityContext getSecurityContext() {
    return securityContext;
  }

  public void setSecurityContext(V1SecurityContext securityContext) {
    this.securityContext = securityContext;
  }

  public V1Container stdin(Boolean stdin) {
    this.stdin = stdin;
    return this;
  }

   /**
   * Whether this container should allocate a buffer for stdin in the container runtime. If this is not set, reads from stdin in the container will always result in EOF. Default is false.
   * @return stdin
  **/
  @ApiModelProperty(example = "null", value = "Whether this container should allocate a buffer for stdin in the container runtime. If this is not set, reads from stdin in the container will always result in EOF. Default is false.")
  public Boolean getStdin() {
    return stdin;
  }

  public void setStdin(Boolean stdin) {
    this.stdin = stdin;
  }

  public V1Container stdinOnce(Boolean stdinOnce) {
    this.stdinOnce = stdinOnce;
    return this;
  }

   /**
   * Whether the container runtime should close the stdin channel after it has been opened by a single attach. When stdin is true the stdin stream will remain open across multiple attach sessions. If stdinOnce is set to true, stdin is opened on container start, is empty until the first client attaches to stdin, and then remains open and accepts data until the client disconnects, at which time stdin is closed and remains closed until the container is restarted. If this flag is false, a container processes that reads from stdin will never receive an EOF. Default is false
   * @return stdinOnce
  **/
  @ApiModelProperty(example = "null", value = "Whether the container runtime should close the stdin channel after it has been opened by a single attach. When stdin is true the stdin stream will remain open across multiple attach sessions. If stdinOnce is set to true, stdin is opened on container start, is empty until the first client attaches to stdin, and then remains open and accepts data until the client disconnects, at which time stdin is closed and remains closed until the container is restarted. If this flag is false, a container processes that reads from stdin will never receive an EOF. Default is false")
  public Boolean getStdinOnce() {
    return stdinOnce;
  }

  public void setStdinOnce(Boolean stdinOnce) {
    this.stdinOnce = stdinOnce;
  }

  public V1Container terminationMessagePath(String terminationMessagePath) {
    this.terminationMessagePath = terminationMessagePath;
    return this;
  }

   /**
   * Optional: Path at which the file to which the container's termination message will be written is mounted into the container's filesystem. Message written is intended to be brief final status, such as an assertion failure message. Defaults to /dev/termination-log. Cannot be updated.
   * @return terminationMessagePath
  **/
  @ApiModelProperty(example = "null", value = "Optional: Path at which the file to which the container's termination message will be written is mounted into the container's filesystem. Message written is intended to be brief final status, such as an assertion failure message. Defaults to /dev/termination-log. Cannot be updated.")
  public String getTerminationMessagePath() {
    return terminationMessagePath;
  }

  public void setTerminationMessagePath(String terminationMessagePath) {
    this.terminationMessagePath = terminationMessagePath;
  }

  public V1Container tty(Boolean tty) {
    this.tty = tty;
    return this;
  }

   /**
   * Whether this container should allocate a TTY for itself, also requires 'stdin' to be true. Default is false.
   * @return tty
  **/
  @ApiModelProperty(example = "null", value = "Whether this container should allocate a TTY for itself, also requires 'stdin' to be true. Default is false.")
  public Boolean getTty() {
    return tty;
  }

  public void setTty(Boolean tty) {
    this.tty = tty;
  }

  public V1Container volumeMounts(List<V1VolumeMount> volumeMounts) {
    this.volumeMounts = volumeMounts;
    return this;
  }

  public V1Container addVolumeMountsItem(V1VolumeMount volumeMountsItem) {
    this.volumeMounts.add(volumeMountsItem);
    return this;
  }

   /**
   * Pod volumes to mount into the container's filesystem. Cannot be updated.
   * @return volumeMounts
  **/
  @ApiModelProperty(example = "null", value = "Pod volumes to mount into the container's filesystem. Cannot be updated.")
  public List<V1VolumeMount> getVolumeMounts() {
    return volumeMounts;
  }

  public void setVolumeMounts(List<V1VolumeMount> volumeMounts) {
    this.volumeMounts = volumeMounts;
  }

  public V1Container workingDir(String workingDir) {
    this.workingDir = workingDir;
    return this;
  }

   /**
   * Container's working directory. If not specified, the container runtime's default will be used, which might be configured in the container image. Cannot be updated.
   * @return workingDir
  **/
  @ApiModelProperty(example = "null", value = "Container's working directory. If not specified, the container runtime's default will be used, which might be configured in the container image. Cannot be updated.")
  public String getWorkingDir() {
    return workingDir;
  }

  public void setWorkingDir(String workingDir) {
    this.workingDir = workingDir;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1Container v1Container = (V1Container) o;
    return Objects.equals(this.args, v1Container.args) &&
        Objects.equals(this.command, v1Container.command) &&
        Objects.equals(this.env, v1Container.env) &&
        Objects.equals(this.image, v1Container.image) &&
        Objects.equals(this.imagePullPolicy, v1Container.imagePullPolicy) &&
        Objects.equals(this.lifecycle, v1Container.lifecycle) &&
        Objects.equals(this.livenessProbe, v1Container.livenessProbe) &&
        Objects.equals(this.name, v1Container.name) &&
        Objects.equals(this.ports, v1Container.ports) &&
        Objects.equals(this.readinessProbe, v1Container.readinessProbe) &&
        Objects.equals(this.resources, v1Container.resources) &&
        Objects.equals(this.securityContext, v1Container.securityContext) &&
        Objects.equals(this.stdin, v1Container.stdin) &&
        Objects.equals(this.stdinOnce, v1Container.stdinOnce) &&
        Objects.equals(this.terminationMessagePath, v1Container.terminationMessagePath) &&
        Objects.equals(this.tty, v1Container.tty) &&
        Objects.equals(this.volumeMounts, v1Container.volumeMounts) &&
        Objects.equals(this.workingDir, v1Container.workingDir);
  }

  @Override
  public int hashCode() {
    return Objects.hash(args, command, env, image, imagePullPolicy, lifecycle, livenessProbe, name, ports, readinessProbe, resources, securityContext, stdin, stdinOnce, terminationMessagePath, tty, volumeMounts, workingDir);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1Container {\n");
    
    sb.append("    args: ").append(toIndentedString(args)).append("\n");
    sb.append("    command: ").append(toIndentedString(command)).append("\n");
    sb.append("    env: ").append(toIndentedString(env)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    imagePullPolicy: ").append(toIndentedString(imagePullPolicy)).append("\n");
    sb.append("    lifecycle: ").append(toIndentedString(lifecycle)).append("\n");
    sb.append("    livenessProbe: ").append(toIndentedString(livenessProbe)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    ports: ").append(toIndentedString(ports)).append("\n");
    sb.append("    readinessProbe: ").append(toIndentedString(readinessProbe)).append("\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
    sb.append("    securityContext: ").append(toIndentedString(securityContext)).append("\n");
    sb.append("    stdin: ").append(toIndentedString(stdin)).append("\n");
    sb.append("    stdinOnce: ").append(toIndentedString(stdinOnce)).append("\n");
    sb.append("    terminationMessagePath: ").append(toIndentedString(terminationMessagePath)).append("\n");
    sb.append("    tty: ").append(toIndentedString(tty)).append("\n");
    sb.append("    volumeMounts: ").append(toIndentedString(volumeMounts)).append("\n");
    sb.append("    workingDir: ").append(toIndentedString(workingDir)).append("\n");
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

