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
 * EmailValidatorRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-09-25T18:25:48.901062+01:00[Europe/Lisbon]")
public class EmailValidatorRequest {
  @SerializedName("email")
  private String email = null;

  @SerializedName("isMx")
  private Boolean isMx = null;

  @SerializedName("isTemporaryEmail")
  private Boolean isTemporaryEmail = null;

  public EmailValidatorRequest email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Email Address
   * @return email
  **/
  @Schema(example = "example@example.com", required = true, description = "Email Address")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public EmailValidatorRequest isMx(Boolean isMx) {
    this.isMx = isMx;
    return this;
  }

   /**
   * Enable, disable MX validation
   * @return isMx
  **/
  @Schema(example = "false", description = "Enable, disable MX validation")
  public Boolean isIsMx() {
    return isMx;
  }

  public void setIsMx(Boolean isMx) {
    this.isMx = isMx;
  }

  public EmailValidatorRequest isTemporaryEmail(Boolean isTemporaryEmail) {
    this.isTemporaryEmail = isTemporaryEmail;
    return this;
  }

   /**
   * Enable, disable MX validation
   * @return isTemporaryEmail
  **/
  @Schema(example = "false", description = "Enable, disable MX validation")
  public Boolean isIsTemporaryEmail() {
    return isTemporaryEmail;
  }

  public void setIsTemporaryEmail(Boolean isTemporaryEmail) {
    this.isTemporaryEmail = isTemporaryEmail;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmailValidatorRequest emailValidatorRequest = (EmailValidatorRequest) o;
    return Objects.equals(this.email, emailValidatorRequest.email) &&
        Objects.equals(this.isMx, emailValidatorRequest.isMx) &&
        Objects.equals(this.isTemporaryEmail, emailValidatorRequest.isTemporaryEmail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, isMx, isTemporaryEmail);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmailValidatorRequest {\n");
    
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    isMx: ").append(toIndentedString(isMx)).append("\n");
    sb.append("    isTemporaryEmail: ").append(toIndentedString(isTemporaryEmail)).append("\n");
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
