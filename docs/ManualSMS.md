# ManualSMS

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**to** | **String** | The contact of the recipient. format should be countryCode-phoneNumber. | 
**from** | **String** | The id of the sender. | 
**textBody** | **String** | The content of the message. | 
**encoding** | [**EncodingEnum**](#EncodingEnum) | the encoding of the message. |  [optional]
**maxCount** | **Integer** | the maximum amount of messages to be sent (if the textBody is too big for a single message). |  [optional]
**mergeTags** | **List&lt;String&gt;** | A list of the merge tags to replace information gaps in the email. The format of each tag should be &#x60;&#x60;tagName:tagValue&#x60;&#x60; |  [optional]
**priority** | [**PriorityEnum**](#PriorityEnum) | The priority of the message. |  [optional]
**customData** | **String** | Extra Data related to the campaign to be re-sent via WebHook. |  [optional]
**registered** | **Boolean** | option to register the message. Its an exclusive feature for senders that require it. |  [optional]
**group** | **String** | The group of the message. |  [optional]

<a name="EncodingEnum"></a>
## Enum: EncodingEnum
Name | Value
---- | -----
UNICODE | &quot;unicode&quot;
GSM0338 | &quot;gsm0338&quot;

<a name="PriorityEnum"></a>
## Enum: PriorityEnum
Name | Value
---- | -----
URGENT | &quot;urgent&quot;
NON_URGENT | &quot;non-urgent&quot;
