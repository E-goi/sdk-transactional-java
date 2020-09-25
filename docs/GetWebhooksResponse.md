# GetWebhooksResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The id of th Webhook. |  [optional]
**channel** | [**ChannelEnum**](#ChannelEnum) | The channel of the webhook. |  [optional]
**callbackUrl** | **String** | The url to send the event data of the webhooks. |  [optional]
**actions** | **List&lt;String&gt;** |  |  [optional]

<a name="ChannelEnum"></a>
## Enum: ChannelEnum
Name | Value
---- | -----
EMAIL | &quot;email&quot;
SMS | &quot;sms&quot;
