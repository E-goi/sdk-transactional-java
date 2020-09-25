/*
 * Transactional API
 * # Introduction    This API is a service provided by [E-goi](www.e-goi.com) to send transactional messages.    Transactional Messaging is a 1-to-1 communication channel, usually from an organization directed to a specific consumer.   They can be triggered by:    * __Actions__ - The consumer interacts with the organization (ie.: online shopping);  * __Time__ - The consumer's actions are time-bounded by the organization (ie.: period of inactivity).    Because of the nature of these messages,   it is expected that the consumer is interested in the content of these messages.   Therefore, they have a different treatment from marketing messages, and have a higher acceptance and opening rate.    >DISCLAIMER  >  >Please notice that this platform is more delicate in regards to the nature and processing of its messages.  >  >It should NOT be used as a mean of mass marketing, scams, phishing or overall unruly behaviour.   >  >Failure to comply may lead to limitation of use and even termination of account.    ***
 *
 * OpenAPI spec version: V2
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * MobileAppRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-09-25T18:20:46.782806+01:00[Europe/Lisbon]")
public class MobileAppRequest {
  @SerializedName("name")
  private String name = null;

  @SerializedName("sandbox")
  private Boolean sandbox = null;

  @SerializedName("certificate")
  private String certificate = null;

  @SerializedName("password")
  private String password = null;

  @SerializedName("authKey")
  private String authKey = null;

  public MobileAppRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the App
   * @return name
  **/
  @Schema(example = "YourApp", required = true, description = "The name of the App")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public MobileAppRequest sandbox(Boolean sandbox) {
    this.sandbox = sandbox;
    return this;
  }

   /**
   * Option to send the notification in a Sandbox Environment in iOS devices.
   * @return sandbox
  **/
  @Schema(example = "true", required = true, description = "Option to send the notification in a Sandbox Environment in iOS devices.")
  public Boolean isSandbox() {
    return sandbox;
  }

  public void setSandbox(Boolean sandbox) {
    this.sandbox = sandbox;
  }

  public MobileAppRequest certificate(String certificate) {
    this.certificate = certificate;
    return this;
  }

   /**
   * The certificate of the app
   * @return certificate
  **/
  @Schema(example = "https://example.com/certify_me.pem", description = "The certificate of the app")
  public String getCertificate() {
    return certificate;
  }

  public void setCertificate(String certificate) {
    this.certificate = certificate;
  }

  public MobileAppRequest password(String password) {
    this.password = password;
    return this;
  }

   /**
   * The password of the certificate.
   * @return password
  **/
  @Schema(example = "1234", description = "The password of the certificate.")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public MobileAppRequest authKey(String authKey) {
    this.authKey = authKey;
    return this;
  }

   /**
   * The authentication key to send push messages to android.
   * @return authKey
  **/
  @Schema(example = "1234", description = "The authentication key to send push messages to android.")
  public String getAuthKey() {
    return authKey;
  }

  public void setAuthKey(String authKey) {
    this.authKey = authKey;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MobileAppRequest mobileAppRequest = (MobileAppRequest) o;
    return Objects.equals(this.name, mobileAppRequest.name) &&
        Objects.equals(this.sandbox, mobileAppRequest.sandbox) &&
        Objects.equals(this.certificate, mobileAppRequest.certificate) &&
        Objects.equals(this.password, mobileAppRequest.password) &&
        Objects.equals(this.authKey, mobileAppRequest.authKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, sandbox, certificate, password, authKey);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MobileAppRequest {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    sandbox: ").append(toIndentedString(sandbox)).append("\n");
    sb.append("    certificate: ").append(toIndentedString(certificate)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    authKey: ").append(toIndentedString(authKey)).append("\n");
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
