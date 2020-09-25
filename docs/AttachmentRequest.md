# AttachmentRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**filename** | **String** | the filename of the file to go in the email. | 
**data** | **String** | the base64 stream of information that comprises the file. | 
**mimeType** | **String** | the format to buuild the file for the recipient. | 
**arrangement** | [**ArrangementEnum**](#ArrangementEnum) | Arrangement for the Attachment inside the email. Can be either: \&quot;inline\&quot; (appears inside the email message body) or \&quot;attachment\&quot; (appears as an enclosed file). | 

<a name="ArrangementEnum"></a>
## Enum: ArrangementEnum
Name | Value
---- | -----
ATTACHMENT | &quot;attachment&quot;
INLINE | &quot;inline&quot;
