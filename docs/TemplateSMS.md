# TemplateSMS

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**to** | **List&lt;String&gt;** |  | 
**from** | **String** | The id of the sender. | 
**templateId** | **String** | The id of the template. | 
**mergeTags** | **List&lt;String&gt;** | A list of the merge tags to replace information gaps in the email. The format of each tag should be &#x60;&#x60;tagName:tagValue&#x60;&#x60; |  [optional]
**priority** | [**PriorityEnum**](#PriorityEnum) | The priority of the message. |  [optional]
**customData** | **String** | Extra Data related to the campaign to be re-sent via WebHook. |  [optional]
**registered** | **Boolean** | option to register the message. Its an exclusive feature for senders that require it. |  [optional]
**group** | **String** | The group of the message. |  [optional]

<a name="PriorityEnum"></a>
## Enum: PriorityEnum
Name | Value
---- | -----
URGENT | &quot;urgent&quot;
NON_URGENT | &quot;non-urgent&quot;
