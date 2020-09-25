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
 * information about the sender.
 */
@Schema(description = "information about the sender.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-09-25T18:24:45.836079+01:00[Europe/Lisbon]")
public class SenderMultiChannelObject {
  @SerializedName("emailSenderId")
  private String emailSenderId = null;

  @SerializedName("phoneSenderId")
  private String phoneSenderId = null;

  public SenderMultiChannelObject emailSenderId(String emailSenderId) {
    this.emailSenderId = emailSenderId;
    return this;
  }

   /**
   * the email id of the sender.
   * @return emailSenderId
  **/
  @Schema(example = "1234", description = "the email id of the sender.")
  public String getEmailSenderId() {
    return emailSenderId;
  }

  public void setEmailSenderId(String emailSenderId) {
    this.emailSenderId = emailSenderId;
  }

  public SenderMultiChannelObject phoneSenderId(String phoneSenderId) {
    this.phoneSenderId = phoneSenderId;
    return this;
  }

   /**
   * the phone id of the sender.
   * @return phoneSenderId
  **/
  @Schema(example = "1234", description = "the phone id of the sender.")
  public String getPhoneSenderId() {
    return phoneSenderId;
  }

  public void setPhoneSenderId(String phoneSenderId) {
    this.phoneSenderId = phoneSenderId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SenderMultiChannelObject senderMultiChannelObject = (SenderMultiChannelObject) o;
    return Objects.equals(this.emailSenderId, senderMultiChannelObject.emailSenderId) &&
        Objects.equals(this.phoneSenderId, senderMultiChannelObject.phoneSenderId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emailSenderId, phoneSenderId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SenderMultiChannelObject {\n");
    
    sb.append("    emailSenderId: ").append(toIndentedString(emailSenderId)).append("\n");
    sb.append("    phoneSenderId: ").append(toIndentedString(phoneSenderId)).append("\n");
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
