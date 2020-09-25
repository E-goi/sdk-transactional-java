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
 * SmsLengthCalculatorResponse
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-09-25T18:25:48.901062+01:00[Europe/Lisbon]")
public class SmsLengthCalculatorResponse {
  @SerializedName("gsm0338")
  private Boolean gsm0338 = null;

  @SerializedName("charCount")
  private Integer charCount = null;

  @SerializedName("parts")
  private Integer parts = null;

  @SerializedName("charPerMessage")
  private Integer charPerMessage = null;

  @SerializedName("message")
  private String message = null;

  public SmsLengthCalculatorResponse gsm0338(Boolean gsm0338) {
    this.gsm0338 = gsm0338;
    return this;
  }

   /**
   * GSM0338 message or not
   * @return gsm0338
  **/
  @Schema(example = "true", description = "GSM0338 message or not")
  public Boolean isGsm0338() {
    return gsm0338;
  }

  public void setGsm0338(Boolean gsm0338) {
    this.gsm0338 = gsm0338;
  }

  public SmsLengthCalculatorResponse charCount(Integer charCount) {
    this.charCount = charCount;
    return this;
  }

   /**
   * Number of characters in the SMS text
   * @return charCount
  **/
  @Schema(example = "10", description = "Number of characters in the SMS text")
  public Integer getCharCount() {
    return charCount;
  }

  public void setCharCount(Integer charCount) {
    this.charCount = charCount;
  }

  public SmsLengthCalculatorResponse parts(Integer parts) {
    this.parts = parts;
    return this;
  }

   /**
   * number of parts that compose the message
   * @return parts
  **/
  @Schema(example = "1", description = "number of parts that compose the message")
  public Integer getParts() {
    return parts;
  }

  public void setParts(Integer parts) {
    this.parts = parts;
  }

  public SmsLengthCalculatorResponse charPerMessage(Integer charPerMessage) {
    this.charPerMessage = charPerMessage;
    return this;
  }

   /**
   * Number of characters per message
   * @return charPerMessage
  **/
  @Schema(example = "30", description = "Number of characters per message")
  public Integer getCharPerMessage() {
    return charPerMessage;
  }

  public void setCharPerMessage(Integer charPerMessage) {
    this.charPerMessage = charPerMessage;
  }

  public SmsLengthCalculatorResponse message(String message) {
    this.message = message;
    return this;
  }

   /**
   * SMS Text Message
   * @return message
  **/
  @Schema(example = "sms text message", description = "SMS Text Message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SmsLengthCalculatorResponse smsLengthCalculatorResponse = (SmsLengthCalculatorResponse) o;
    return Objects.equals(this.gsm0338, smsLengthCalculatorResponse.gsm0338) &&
        Objects.equals(this.charCount, smsLengthCalculatorResponse.charCount) &&
        Objects.equals(this.parts, smsLengthCalculatorResponse.parts) &&
        Objects.equals(this.charPerMessage, smsLengthCalculatorResponse.charPerMessage) &&
        Objects.equals(this.message, smsLengthCalculatorResponse.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gsm0338, charCount, parts, charPerMessage, message);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmsLengthCalculatorResponse {\n");
    
    sb.append("    gsm0338: ").append(toIndentedString(gsm0338)).append("\n");
    sb.append("    charCount: ").append(toIndentedString(charCount)).append("\n");
    sb.append("    parts: ").append(toIndentedString(parts)).append("\n");
    sb.append("    charPerMessage: ").append(toIndentedString(charPerMessage)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
