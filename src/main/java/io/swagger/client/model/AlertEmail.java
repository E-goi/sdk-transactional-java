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
import io.swagger.client.model.ToEmailAlertObject;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * AlertEmail
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-09-25T18:25:48.901062+01:00[Europe/Lisbon]")
public class AlertEmail implements OneOfbody {
  @SerializedName("alertTemplateName")
  private String alertTemplateName = null;

  @SerializedName("senderId")
  private String senderId = null;

  @SerializedName("to")
  private List<ToEmailAlertObject> to = new ArrayList<ToEmailAlertObject>();

  public AlertEmail alertTemplateName(String alertTemplateName) {
    this.alertTemplateName = alertTemplateName;
    return this;
  }

   /**
   * the name of the alert template to use. Already has to exist in the system.
   * @return alertTemplateName
  **/
  @Schema(example = "welcome", required = true, description = "the name of the alert template to use. Already has to exist in the system.")
  public String getAlertTemplateName() {
    return alertTemplateName;
  }

  public void setAlertTemplateName(String alertTemplateName) {
    this.alertTemplateName = alertTemplateName;
  }

  public AlertEmail senderId(String senderId) {
    this.senderId = senderId;
    return this;
  }

   /**
   * the id to identify the sender.
   * @return senderId
  **/
  @Schema(example = "1234", required = true, description = "the id to identify the sender.")
  public String getSenderId() {
    return senderId;
  }

  public void setSenderId(String senderId) {
    this.senderId = senderId;
  }

  public AlertEmail to(List<ToEmailAlertObject> to) {
    this.to = to;
    return this;
  }

  public AlertEmail addToItem(ToEmailAlertObject toItem) {
    this.to.add(toItem);
    return this;
  }

   /**
   * a list of recipients of the alert.
   * @return to
  **/
  @Schema(required = true, description = "a list of recipients of the alert.")
  public List<ToEmailAlertObject> getTo() {
    return to;
  }

  public void setTo(List<ToEmailAlertObject> to) {
    this.to = to;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlertEmail alertEmail = (AlertEmail) o;
    return Objects.equals(this.alertTemplateName, alertEmail.alertTemplateName) &&
        Objects.equals(this.senderId, alertEmail.senderId) &&
        Objects.equals(this.to, alertEmail.to);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alertTemplateName, senderId, to);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlertEmail {\n");
    
    sb.append("    alertTemplateName: ").append(toIndentedString(alertTemplateName)).append("\n");
    sb.append("    senderId: ").append(toIndentedString(senderId)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
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
