# SinglePushTemplateResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The id of the template. | 
**subject** | **String** | The title of the message. | 
**textBody** | **String** | The text body of the message. | 
**appId** | [**AppIdEnum**](#AppIdEnum) | The id of the app to associate the template. |  [optional]
**customData** | **String** | Any data to associate to the message. |  [optional]
**templateName** | **String** | The name of the template. | 

<a name="AppIdEnum"></a>
## Enum: AppIdEnum
Name | Value
---- | -----
UNICODE | &quot;unicode&quot;
GSM0338 | &quot;gsm0338&quot;
