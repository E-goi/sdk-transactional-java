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
import java.util.ArrayList;
import java.util.List;
/**
 * TemplateSMS
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-09-25T18:25:48.901062+01:00[Europe/Lisbon]")
public class TemplateSMS {
  @SerializedName("to")
  private List<String> to = new ArrayList<String>();

  @SerializedName("from")
  private String from = null;

  @SerializedName("templateId")
  private String templateId = null;

  @SerializedName("mergeTags")
  private List<String> mergeTags = null;

  /**
   * The priority of the message.
   */
  @JsonAdapter(PriorityEnum.Adapter.class)
  public enum PriorityEnum {
    URGENT("urgent"),
    NON_URGENT("non-urgent");

    private String value;

    PriorityEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static PriorityEnum fromValue(String text) {
      for (PriorityEnum b : PriorityEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<PriorityEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PriorityEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PriorityEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return PriorityEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("priority")
  private PriorityEnum priority = PriorityEnum.NON_URGENT;

  @SerializedName("customData")
  private String customData = null;

  @SerializedName("registered")
  private Boolean registered = false;

  @SerializedName("group")
  private String group = "default";

  public TemplateSMS to(List<String> to) {
    this.to = to;
    return this;
  }

  public TemplateSMS addToItem(String toItem) {
    this.to.add(toItem);
    return this;
  }

   /**
   * Get to
   * @return to
  **/
  @Schema(required = true, description = "")
  public List<String> getTo() {
    return to;
  }

  public void setTo(List<String> to) {
    this.to = to;
  }

  public TemplateSMS from(String from) {
    this.from = from;
    return this;
  }

   /**
   * The id of the sender.
   * @return from
  **/
  @Schema(example = "1234", required = true, description = "The id of the sender.")
  public String getFrom() {
    return from;
  }

  public void setFrom(String from) {
    this.from = from;
  }

  public TemplateSMS templateId(String templateId) {
    this.templateId = templateId;
    return this;
  }

   /**
   * The id of the template.
   * @return templateId
  **/
  @Schema(example = "1234", required = true, description = "The id of the template.")
  public String getTemplateId() {
    return templateId;
  }

  public void setTemplateId(String templateId) {
    this.templateId = templateId;
  }

  public TemplateSMS mergeTags(List<String> mergeTags) {
    this.mergeTags = mergeTags;
    return this;
  }

  public TemplateSMS addMergeTagsItem(String mergeTagsItem) {
    if (this.mergeTags == null) {
      this.mergeTags = new ArrayList<String>();
    }
    this.mergeTags.add(mergeTagsItem);
    return this;
  }

   /**
   * A list of the merge tags to replace information gaps in the email. The format of each tag should be &#x60;&#x60;tagName:tagValue&#x60;&#x60;
   * @return mergeTags
  **/
  @Schema(description = "A list of the merge tags to replace information gaps in the email. The format of each tag should be ``tagName:tagValue``")
  public List<String> getMergeTags() {
    return mergeTags;
  }

  public void setMergeTags(List<String> mergeTags) {
    this.mergeTags = mergeTags;
  }

  public TemplateSMS priority(PriorityEnum priority) {
    this.priority = priority;
    return this;
  }

   /**
   * The priority of the message.
   * @return priority
  **/
  @Schema(example = "non-urgent", description = "The priority of the message.")
  public PriorityEnum getPriority() {
    return priority;
  }

  public void setPriority(PriorityEnum priority) {
    this.priority = priority;
  }

  public TemplateSMS customData(String customData) {
    this.customData = customData;
    return this;
  }

   /**
   * Extra Data related to the campaign to be re-sent via WebHook.
   * @return customData
  **/
  @Schema(example = "meta-data, my relevant metadata", description = "Extra Data related to the campaign to be re-sent via WebHook.")
  public String getCustomData() {
    return customData;
  }

  public void setCustomData(String customData) {
    this.customData = customData;
  }

  public TemplateSMS registered(Boolean registered) {
    this.registered = registered;
    return this;
  }

   /**
   * option to register the message. Its an exclusive feature for senders that require it.
   * @return registered
  **/
  @Schema(example = "false", description = "option to register the message. Its an exclusive feature for senders that require it.")
  public Boolean isRegistered() {
    return registered;
  }

  public void setRegistered(Boolean registered) {
    this.registered = registered;
  }

  public TemplateSMS group(String group) {
    this.group = group;
    return this;
  }

   /**
   * The group of the message.
   * @return group
  **/
  @Schema(example = "welcome", description = "The group of the message.")
  public String getGroup() {
    return group;
  }

  public void setGroup(String group) {
    this.group = group;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TemplateSMS templateSMS = (TemplateSMS) o;
    return Objects.equals(this.to, templateSMS.to) &&
        Objects.equals(this.from, templateSMS.from) &&
        Objects.equals(this.templateId, templateSMS.templateId) &&
        Objects.equals(this.mergeTags, templateSMS.mergeTags) &&
        Objects.equals(this.priority, templateSMS.priority) &&
        Objects.equals(this.customData, templateSMS.customData) &&
        Objects.equals(this.registered, templateSMS.registered) &&
        Objects.equals(this.group, templateSMS.group);
  }

  @Override
  public int hashCode() {
    return Objects.hash(to, from, templateId, mergeTags, priority, customData, registered, group);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplateSMS {\n");
    
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
    sb.append("    mergeTags: ").append(toIndentedString(mergeTags)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    customData: ").append(toIndentedString(customData)).append("\n");
    sb.append("    registered: ").append(toIndentedString(registered)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
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
