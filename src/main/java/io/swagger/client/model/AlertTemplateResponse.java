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
 * AlertTemplateResponse
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-09-25T18:20:46.782806+01:00[Europe/Lisbon]")
public class AlertTemplateResponse {
  @SerializedName("name")
  private String name = null;

  @SerializedName("interval")
  private Integer interval = null;

  @SerializedName("maxAttempts")
  private Integer maxAttempts = null;

  @SerializedName("templateId")
  private String templateId = null;

  @SerializedName("subject")
  private String subject = null;

  @SerializedName("htmlBody")
  private String htmlBody = null;

  @SerializedName("textBody")
  private String textBody = null;

  @SerializedName("channel")
  private String channel = null;

  public AlertTemplateResponse name(String name) {
    this.name = name;
    return this;
  }

   /**
   * the name to coloquially address the alert.
   * @return name
  **/
  @Schema(example = "Order Complete", description = "the name to coloquially address the alert.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AlertTemplateResponse interval(Integer interval) {
    this.interval = interval;
    return this;
  }

   /**
   * The interval in seconds between messages to the recipient(s). Maximum interval is 86400 seconds (24 hours).
   * @return interval
  **/
  @Schema(example = "3600", required = true, description = "The interval in seconds between messages to the recipient(s). Maximum interval is 86400 seconds (24 hours).")
  public Integer getInterval() {
    return interval;
  }

  public void setInterval(Integer interval) {
    this.interval = interval;
  }

  public AlertTemplateResponse maxAttempts(Integer maxAttempts) {
    this.maxAttempts = maxAttempts;
    return this;
  }

   /**
   * The maximum amount of attempts to be made.
   * @return maxAttempts
  **/
  @Schema(example = "1", required = true, description = "The maximum amount of attempts to be made.")
  public Integer getMaxAttempts() {
    return maxAttempts;
  }

  public void setMaxAttempts(Integer maxAttempts) {
    this.maxAttempts = maxAttempts;
  }

  public AlertTemplateResponse templateId(String templateId) {
    this.templateId = templateId;
    return this;
  }

   /**
   * the id of the message template existent in the system.
   * @return templateId
  **/
  @Schema(example = "Order Complete", description = "the id of the message template existent in the system.")
  public String getTemplateId() {
    return templateId;
  }

  public void setTemplateId(String templateId) {
    this.templateId = templateId;
  }

  public AlertTemplateResponse subject(String subject) {
    this.subject = subject;
    return this;
  }

   /**
   * the subject of the message. only used in email alerts.
   * @return subject
  **/
  @Schema(example = "351-987654321", description = "the subject of the message. only used in email alerts.")
  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public AlertTemplateResponse htmlBody(String htmlBody) {
    this.htmlBody = htmlBody;
    return this;
  }

   /**
   * the html version of the body of the message. only used in email alerts.
   * @return htmlBody
  **/
  @Schema(example = "<b>Your order is complete.</b> Please follow the link to stop the alert.", description = "the html version of the body of the message. only used in email alerts.")
  public String getHtmlBody() {
    return htmlBody;
  }

  public void setHtmlBody(String htmlBody) {
    this.htmlBody = htmlBody;
  }

  public AlertTemplateResponse textBody(String textBody) {
    this.textBody = textBody;
    return this;
  }

   /**
   * the text version of the message.
   * @return textBody
  **/
  @Schema(example = "Your order is complete. Please follow the link to stop the alert.", description = "the text version of the message.")
  public String getTextBody() {
    return textBody;
  }

  public void setTextBody(String textBody) {
    this.textBody = textBody;
  }

  public AlertTemplateResponse channel(String channel) {
    this.channel = channel;
    return this;
  }

   /**
   * the text version of the message.
   * @return channel
  **/
  @Schema(example = "Your order is complete. Please follow the link to stop the alert.", description = "the text version of the message.")
  public String getChannel() {
    return channel;
  }

  public void setChannel(String channel) {
    this.channel = channel;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlertTemplateResponse alertTemplateResponse = (AlertTemplateResponse) o;
    return Objects.equals(this.name, alertTemplateResponse.name) &&
        Objects.equals(this.interval, alertTemplateResponse.interval) &&
        Objects.equals(this.maxAttempts, alertTemplateResponse.maxAttempts) &&
        Objects.equals(this.templateId, alertTemplateResponse.templateId) &&
        Objects.equals(this.subject, alertTemplateResponse.subject) &&
        Objects.equals(this.htmlBody, alertTemplateResponse.htmlBody) &&
        Objects.equals(this.textBody, alertTemplateResponse.textBody) &&
        Objects.equals(this.channel, alertTemplateResponse.channel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, interval, maxAttempts, templateId, subject, htmlBody, textBody, channel);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlertTemplateResponse {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    maxAttempts: ").append(toIndentedString(maxAttempts)).append("\n");
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    htmlBody: ").append(toIndentedString(htmlBody)).append("\n");
    sb.append("    textBody: ").append(toIndentedString(textBody)).append("\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
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
