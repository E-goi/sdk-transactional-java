# MultiChannelMessageObject

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**channel** | **String** | Available communications channels in the API. Currently there are Emails and Sms. | 
**interval** | **Integer** | the interval in seconds between the message and the previous. Defaults to 3600s (1h). |  [optional]
**condition** | [**ConditionEnum**](#ConditionEnum) | The condition of the previous message to trigger the next one. In list of messages in the plan the condition of the first message is discarded (doesnt have previous condition). Can be:  Name | Description | Channel --- | --- | --- none | no condition of previous message | email, sms not_open | previous message hasnt been opened | email open | previous message has been opened | email click | previous message has a link that has been clicked | email not_click | previous message has a link that has not been clicked | email |  [optional]
**templateId** | **Integer** | the template id already in the system. overrides subject, textBody and htmlBody. |  [optional]
**subject** | **String** | The subject of the message. Only applies to email messages. |  [optional]
**textBody** | **String** | The text body of the message. |  [optional]
**htmlBody** | **String** | The html body of the message. Only applies to email messages. |  [optional]

<a name="ConditionEnum"></a>
## Enum: ConditionEnum
Name | Value
---- | -----
NONE | &quot;none&quot;
NOT_OPEN | &quot;not_open&quot;
OPEN | &quot;open&quot;
CLICK | &quot;click&quot;
NOT_CLICK | &quot;not_click&quot;
