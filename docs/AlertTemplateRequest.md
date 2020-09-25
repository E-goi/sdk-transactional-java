# AlertTemplateRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | the name to coloquially address the alert. |  [optional]
**interval** | **Integer** | The interval in seconds between messages to the recipient(s). Maximum interval is 86400 seconds (24 hours). | 
**maxAttempts** | **Integer** | The maximum amount of attempts to be made. | 
**templateId** | **String** | the id of the message template existent in the system. |  [optional]
**subject** | **String** | the subject of the message. only used in email alerts. |  [optional]
**htmlBody** | **String** | the html version of the body of the message. only used in email alerts. |  [optional]
**textBody** | **String** | the text version of the message. |  [optional]
