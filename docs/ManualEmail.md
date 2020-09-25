# ManualEmail

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**domain** | **String** | the Domain to de used in the sender email. |  [optional]
**senderId** | **String** | The code identification of the sender profile to be used. | 
**senderName** | **String** | The name to be associated with the Domain to form the email. |  [optional]
**to** | **List&lt;String&gt;** | The To field in the email. | 
**cc** | **List&lt;String&gt;** | The Cc field in the email. |  [optional]
**bcc** | **List&lt;String&gt;** | The Bcc field in the email. |  [optional]
**replyToId** | **String** | The email id for if/when the recipient responds to the email. |  [optional]
**subject** | **String** | The subject of the message. | 
**htmlBody** | **String** | The html version of the body of the message. |  [optional]
**textBody** | **String** | The text version of the body of the message. |  [optional]
**openTracking** | **Boolean** | The option to track if the message is opened. |  [optional]
**clickTracking** | **Boolean** | The option to track if the message is clicked. |  [optional]
**attachment** | [**List&lt;AttachmentRequest&gt;**](AttachmentRequest.md) | A list of files to be attached to the emails |  [optional]
**mergeTags** | **List&lt;String&gt;** | A list of the merge tags to replace information gaps in the email. The format of each tag should be &#x60;&#x60;tagName:tagValue&#x60;&#x60; |  [optional]
**customData** | **String** | Extra Data related to the campaign to be re-sent via WebHook. |  [optional]
**priority** | [**PriorityEnum**](#PriorityEnum) | The priority of the message. |  [optional]
**registered** | **Boolean** | option to register the message. Its an exclusive feature for senders that require it. |  [optional]
**header** | [**HeaderOptionsRequest**](HeaderOptionsRequest.md) |  |  [optional]
**group** | **String** | The group of the message. |  [optional]

<a name="PriorityEnum"></a>
## Enum: PriorityEnum
Name | Value
---- | -----
URGENT | &quot;urgent&quot;
NON_URGENT | &quot;non-urgent&quot;
