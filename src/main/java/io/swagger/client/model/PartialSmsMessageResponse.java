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
import org.threeten.bp.OffsetDateTime;
/**
 * PartialSmsMessageResponse
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-09-25T18:25:48.901062+01:00[Europe/Lisbon]")
public class PartialSmsMessageResponse {
  @SerializedName("createDate")
  private OffsetDateTime createDate = null;

  @SerializedName("subscriberMobile")
  private String subscriberMobile = null;

  @SerializedName("groupName")
  private String groupName = null;

  @SerializedName("messageId")
  private String messageId = null;

  @SerializedName("senderMobile")
  private String senderMobile = null;

  public PartialSmsMessageResponse createDate(OffsetDateTime createDate) {
    this.createDate = createDate;
    return this;
  }

   /**
   * Get createDate
   * @return createDate
  **/
  @Schema(description = "")
  public OffsetDateTime getCreateDate() {
    return createDate;
  }

  public void setCreateDate(OffsetDateTime createDate) {
    this.createDate = createDate;
  }

  public PartialSmsMessageResponse subscriberMobile(String subscriberMobile) {
    this.subscriberMobile = subscriberMobile;
    return this;
  }

   /**
   * Get subscriberMobile
   * @return subscriberMobile
  **/
  @Schema(description = "")
  public String getSubscriberMobile() {
    return subscriberMobile;
  }

  public void setSubscriberMobile(String subscriberMobile) {
    this.subscriberMobile = subscriberMobile;
  }

  public PartialSmsMessageResponse groupName(String groupName) {
    this.groupName = groupName;
    return this;
  }

   /**
   * Get groupName
   * @return groupName
  **/
  @Schema(description = "")
  public String getGroupName() {
    return groupName;
  }

  public void setGroupName(String groupName) {
    this.groupName = groupName;
  }

  public PartialSmsMessageResponse messageId(String messageId) {
    this.messageId = messageId;
    return this;
  }

   /**
   * Get messageId
   * @return messageId
  **/
  @Schema(description = "")
  public String getMessageId() {
    return messageId;
  }

  public void setMessageId(String messageId) {
    this.messageId = messageId;
  }

  public PartialSmsMessageResponse senderMobile(String senderMobile) {
    this.senderMobile = senderMobile;
    return this;
  }

   /**
   * Get senderMobile
   * @return senderMobile
  **/
  @Schema(description = "")
  public String getSenderMobile() {
    return senderMobile;
  }

  public void setSenderMobile(String senderMobile) {
    this.senderMobile = senderMobile;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PartialSmsMessageResponse partialSmsMessageResponse = (PartialSmsMessageResponse) o;
    return Objects.equals(this.createDate, partialSmsMessageResponse.createDate) &&
        Objects.equals(this.subscriberMobile, partialSmsMessageResponse.subscriberMobile) &&
        Objects.equals(this.groupName, partialSmsMessageResponse.groupName) &&
        Objects.equals(this.messageId, partialSmsMessageResponse.messageId) &&
        Objects.equals(this.senderMobile, partialSmsMessageResponse.senderMobile);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createDate, subscriberMobile, groupName, messageId, senderMobile);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartialSmsMessageResponse {\n");
    
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    subscriberMobile: ").append(toIndentedString(subscriberMobile)).append("\n");
    sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
    sb.append("    messageId: ").append(toIndentedString(messageId)).append("\n");
    sb.append("    senderMobile: ").append(toIndentedString(senderMobile)).append("\n");
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
