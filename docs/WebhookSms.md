# WebhookSms

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**url** | **String** | The url to send the Events. | 
**channel** | [**ChannelEnum**](#ChannelEnum) | The channel of the webhook. | 
**actions** | [**List&lt;ActionsEnum&gt;**](#List&lt;ActionsEnum&gt;) | A list of the actions to capture. |  [optional]

<a name="ChannelEnum"></a>
## Enum: ChannelEnum
Name | Value
---- | -----
SMS | &quot;sms&quot;

<a name="List<ActionsEnum>"></a>
## Enum: List&lt;ActionsEnum&gt;
Name | Value
---- | -----
PROCESSED | &quot;processed&quot;
FAILED | &quot;failed&quot;
SENT | &quot;sent&quot;
DELIVERED | &quot;delivered&quot;
CANCELED | &quot;canceled&quot;
