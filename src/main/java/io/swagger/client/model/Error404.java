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
 * Error404
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-09-25T18:25:48.901062+01:00[Europe/Lisbon]")
public class Error404 {
  @SerializedName("type")
  private String type = null;

  @SerializedName("title")
  private String title = null;

  @SerializedName("status")
  private Integer status = null;

  @SerializedName("detail")
  private String detail = null;

  public Error404 type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The type of error, with a link to an explanation
   * @return type
  **/
  @Schema(example = "https://www.w3.org/Protocols/rfc2616/rfc2616-sec10.html", description = "The type of error, with a link to an explanation")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Error404 title(String title) {
    this.title = title;
    return this;
  }

   /**
   * The title of the error
   * @return title
  **/
  @Schema(example = "Not Found", description = "The title of the error")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Error404 status(Integer status) {
    this.status = status;
    return this;
  }

   /**
   * The code status of the error.
   * @return status
  **/
  @Schema(example = "404", description = "The code status of the error.")
  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public Error404 detail(String detail) {
    this.detail = detail;
    return this;
  }

   /**
   * A message with a finer detail.
   * @return detail
  **/
  @Schema(example = "The server has not found anything matching the Request-URI.", description = "A message with a finer detail.")
  public String getDetail() {
    return detail;
  }

  public void setDetail(String detail) {
    this.detail = detail;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Error404 error404 = (Error404) o;
    return Objects.equals(this.type, error404.type) &&
        Objects.equals(this.title, error404.title) &&
        Objects.equals(this.status, error404.status) &&
        Objects.equals(this.detail, error404.detail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, title, status, detail);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Error404 {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
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
