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
 * ManualSMS
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-09-25T18:24:45.836079+01:00[Europe/Lisbon]")
public class ManualSMS {
  @SerializedName("to")
  private String to = null;

  @SerializedName("from")
  private String from = null;

  @SerializedName("textBody")
  private String textBody = null;

  /**
   * the encoding of the message.
   */
  @JsonAdapter(EncodingEnum.Adapter.class)
  public enum EncodingEnum {
    UNICODE("unicode"),
    GSM0338("gsm0338");

    private String value;

    EncodingEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static EncodingEnum fromValue(String text) {
      for (EncodingEnum b : EncodingEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<EncodingEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EncodingEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EncodingEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return EncodingEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("encoding")
  private EncodingEnum encoding = null;

  @SerializedName("maxCount")
  private Integer maxCount = null;

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

  public ManualSMS to(String to) {
    this.to = to;
    return this;
  }

   /**
   * The contact of the recipient. format should be countryCode-phoneNumber.
   * @return to
  **/
  @Schema(example = "351-987654321", required = true, description = "The contact of the recipient. format should be countryCode-phoneNumber.")
  public String getTo() {
    return to;
  }

  public void setTo(String to) {
    this.to = to;
  }

  public ManualSMS from(String from) {
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

  public ManualSMS textBody(String textBody) {
    this.textBody = textBody;
    return this;
  }

   /**
   * The content of the message.
   * @return textBody
  **/
  @Schema(example = "Here's a bunch of props to you, {{ name }}, enjoy!", required = true, description = "The content of the message.")
  public String getTextBody() {
    return textBody;
  }

  public void setTextBody(String textBody) {
    this.textBody = textBody;
  }

  public ManualSMS encoding(EncodingEnum encoding) {
    this.encoding = encoding;
    return this;
  }

   /**
   * the encoding of the message.
   * @return encoding
  **/
  @Schema(example = "unicode", description = "the encoding of the message.")
  public EncodingEnum getEncoding() {
    return encoding;
  }

  public void setEncoding(EncodingEnum encoding) {
    this.encoding = encoding;
  }

  public ManualSMS maxCount(Integer maxCount) {
    this.maxCount = maxCount;
    return this;
  }

   /**
   * the maximum amount of messages to be sent (if the textBody is too big for a single message).
   * minimum: 1
   * @return maxCount
  **/
  @Schema(example = "1", description = "the maximum amount of messages to be sent (if the textBody is too big for a single message).")
  public Integer getMaxCount() {
    return maxCount;
  }

  public void setMaxCount(Integer maxCount) {
    this.maxCount = maxCount;
  }

  public ManualSMS mergeTags(List<String> mergeTags) {
    this.mergeTags = mergeTags;
    return this;
  }

  public ManualSMS addMergeTagsItem(String mergeTagsItem) {
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

  public ManualSMS priority(PriorityEnum priority) {
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

  public ManualSMS customData(String customData) {
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

  public ManualSMS registered(Boolean registered) {
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

  public ManualSMS group(String group) {
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
    ManualSMS manualSMS = (ManualSMS) o;
    return Objects.equals(this.to, manualSMS.to) &&
        Objects.equals(this.from, manualSMS.from) &&
        Objects.equals(this.textBody, manualSMS.textBody) &&
        Objects.equals(this.encoding, manualSMS.encoding) &&
        Objects.equals(this.maxCount, manualSMS.maxCount) &&
        Objects.equals(this.mergeTags, manualSMS.mergeTags) &&
        Objects.equals(this.priority, manualSMS.priority) &&
        Objects.equals(this.customData, manualSMS.customData) &&
        Objects.equals(this.registered, manualSMS.registered) &&
        Objects.equals(this.group, manualSMS.group);
  }

  @Override
  public int hashCode() {
    return Objects.hash(to, from, textBody, encoding, maxCount, mergeTags, priority, customData, registered, group);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ManualSMS {\n");
    
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    textBody: ").append(toIndentedString(textBody)).append("\n");
    sb.append("    encoding: ").append(toIndentedString(encoding)).append("\n");
    sb.append("    maxCount: ").append(toIndentedString(maxCount)).append("\n");
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
