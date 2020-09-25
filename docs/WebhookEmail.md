# WebhookEmail

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
EMAIL | &quot;email&quot;

<a name="List<ActionsEnum>"></a>
## Enum: List&lt;ActionsEnum&gt;
Name | Value
---- | -----
PROCESSED | &quot;processed&quot;
FAILED | &quot;failed&quot;
SENT | &quot;sent&quot;
CANCELED | &quot;canceled&quot;
CLICK | &quot;click&quot;
VIEW | &quot;view&quot;
REMOVE | &quot;remove&quot;
BOUNCE | &quot;bounce&quot;
ABUSE | &quot;abuse&quot;
