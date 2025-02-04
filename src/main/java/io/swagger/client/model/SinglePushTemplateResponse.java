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
 * SinglePushTemplateResponse
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-09-25T18:25:48.901062+01:00[Europe/Lisbon]")
public class SinglePushTemplateResponse {
  @SerializedName("id")
  private String id = null;

  @SerializedName("subject")
  private String subject = null;

  @SerializedName("textBody")
  private String textBody = null;

  /**
   * The id of the app to associate the template.
   */
  @JsonAdapter(AppIdEnum.Adapter.class)
  public enum AppIdEnum {
    UNICODE("unicode"),
    GSM0338("gsm0338");

    private String value;

    AppIdEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static AppIdEnum fromValue(String text) {
      for (AppIdEnum b : AppIdEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<AppIdEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AppIdEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AppIdEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return AppIdEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("appId")
  private AppIdEnum appId = AppIdEnum.UNICODE;

  @SerializedName("customData")
  private String customData = "1";

  @SerializedName("templateName")
  private String templateName = null;

  public SinglePushTemplateResponse id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The id of the template.
   * @return id
  **/
  @Schema(example = "Hello World", required = true, description = "The id of the template.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public SinglePushTemplateResponse subject(String subject) {
    this.subject = subject;
    return this;
  }

   /**
   * The title of the message.
   * @return subject
  **/
  @Schema(example = "Hello World", required = true, description = "The title of the message.")
  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public SinglePushTemplateResponse textBody(String textBody) {
    this.textBody = textBody;
    return this;
  }

   /**
   * The text body of the message.
   * @return textBody
  **/
  @Schema(example = "This is a message of Hello to the World", required = true, description = "The text body of the message.")
  public String getTextBody() {
    return textBody;
  }

  public void setTextBody(String textBody) {
    this.textBody = textBody;
  }

  public SinglePushTemplateResponse appId(AppIdEnum appId) {
    this.appId = appId;
    return this;
  }

   /**
   * The id of the app to associate the template.
   * @return appId
  **/
  @Schema(example = "unicode", description = "The id of the app to associate the template.")
  public AppIdEnum getAppId() {
    return appId;
  }

  public void setAppId(AppIdEnum appId) {
    this.appId = appId;
  }

  public SinglePushTemplateResponse customData(String customData) {
    this.customData = customData;
    return this;
  }

   /**
   * Any data to associate to the message.
   * @return customData
  **/
  @Schema(example = "1", description = "Any data to associate to the message.")
  public String getCustomData() {
    return customData;
  }

  public void setCustomData(String customData) {
    this.customData = customData;
  }

  public SinglePushTemplateResponse templateName(String templateName) {
    this.templateName = templateName;
    return this;
  }

   /**
   * The name of the template.
   * @return templateName
  **/
  @Schema(example = "Hello World", required = true, description = "The name of the template.")
  public String getTemplateName() {
    return templateName;
  }

  public void setTemplateName(String templateName) {
    this.templateName = templateName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SinglePushTemplateResponse singlePushTemplateResponse = (SinglePushTemplateResponse) o;
    return Objects.equals(this.id, singlePushTemplateResponse.id) &&
        Objects.equals(this.subject, singlePushTemplateResponse.subject) &&
        Objects.equals(this.textBody, singlePushTemplateResponse.textBody) &&
        Objects.equals(this.appId, singlePushTemplateResponse.appId) &&
        Objects.equals(this.customData, singlePushTemplateResponse.customData) &&
        Objects.equals(this.templateName, singlePushTemplateResponse.templateName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, subject, textBody, appId, customData, templateName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SinglePushTemplateResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    textBody: ").append(toIndentedString(textBody)).append("\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    customData: ").append(toIndentedString(customData)).append("\n");
    sb.append("    templateName: ").append(toIndentedString(templateName)).append("\n");
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
