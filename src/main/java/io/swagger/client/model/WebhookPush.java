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
 * WebhookPush
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-09-25T18:25:48.901062+01:00[Europe/Lisbon]")
public class WebhookPush implements OneOfbody1 {
  @SerializedName("url")
  private String url = null;

  /**
   * The channel of the webhook.
   */
  @JsonAdapter(ChannelEnum.Adapter.class)
  public enum ChannelEnum {
    PUSH("push");

    private String value;

    ChannelEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static ChannelEnum fromValue(String text) {
      for (ChannelEnum b : ChannelEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<ChannelEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ChannelEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ChannelEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ChannelEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("channel")
  private ChannelEnum channel = null;

  /**
   * the action to capture.
   */
  @JsonAdapter(ActionsEnum.Adapter.class)
  public enum ActionsEnum {
    PROCESSED("processed"),
    FAILED("failed"),
    SENT("sent"),
    CANCELED("canceled"),
    DELIVERED("delivered");

    private String value;

    ActionsEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static ActionsEnum fromValue(String text) {
      for (ActionsEnum b : ActionsEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<ActionsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ActionsEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ActionsEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ActionsEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("actions")
  private List<ActionsEnum> actions = null;

  public WebhookPush url(String url) {
    this.url = url;
    return this;
  }

   /**
   * The url to send the Events.
   * @return url
  **/
  @Schema(example = "www.your-server/webhook/events", required = true, description = "The url to send the Events.")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public WebhookPush channel(ChannelEnum channel) {
    this.channel = channel;
    return this;
  }

   /**
   * The channel of the webhook.
   * @return channel
  **/
  @Schema(required = true, description = "The channel of the webhook.")
  public ChannelEnum getChannel() {
    return channel;
  }

  public void setChannel(ChannelEnum channel) {
    this.channel = channel;
  }

  public WebhookPush actions(List<ActionsEnum> actions) {
    this.actions = actions;
    return this;
  }

  public WebhookPush addActionsItem(ActionsEnum actionsItem) {
    if (this.actions == null) {
      this.actions = new ArrayList<ActionsEnum>();
    }
    this.actions.add(actionsItem);
    return this;
  }

   /**
   * A list of the actions to capture.
   * @return actions
  **/
  @Schema(description = "A list of the actions to capture.")
  public List<ActionsEnum> getActions() {
    return actions;
  }

  public void setActions(List<ActionsEnum> actions) {
    this.actions = actions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookPush webhookPush = (WebhookPush) o;
    return Objects.equals(this.url, webhookPush.url) &&
        Objects.equals(this.channel, webhookPush.channel) &&
        Objects.equals(this.actions, webhookPush.actions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, channel, actions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookPush {\n");
    
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
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
