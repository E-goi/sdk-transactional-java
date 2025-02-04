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
 * SmsLengthCalculatorRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-09-25T18:25:48.901062+01:00[Europe/Lisbon]")
public class SmsLengthCalculatorRequest {
  @SerializedName("message")
  private String message = null;

  @SerializedName("gsm0338")
  private Boolean gsm0338 = null;

  public SmsLengthCalculatorRequest message(String message) {
    this.message = message;
    return this;
  }

   /**
   * SMS Text String
   * @return message
  **/
  @Schema(example = "message", required = true, description = "SMS Text String")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public SmsLengthCalculatorRequest gsm0338(Boolean gsm0338) {
    this.gsm0338 = gsm0338;
    return this;
  }

   /**
   * Enable/Disable GSM0338
   * @return gsm0338
  **/
  @Schema(example = "false", required = true, description = "Enable/Disable GSM0338")
  public Boolean isGsm0338() {
    return gsm0338;
  }

  public void setGsm0338(Boolean gsm0338) {
    this.gsm0338 = gsm0338;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SmsLengthCalculatorRequest smsLengthCalculatorRequest = (SmsLengthCalculatorRequest) o;
    return Objects.equals(this.message, smsLengthCalculatorRequest.message) &&
        Objects.equals(this.gsm0338, smsLengthCalculatorRequest.gsm0338);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, gsm0338);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmsLengthCalculatorRequest {\n");
    
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    gsm0338: ").append(toIndentedString(gsm0338)).append("\n");
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
