# VerifyRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**senderId** | **String** | The id of the sender. | 
**to** | **String** | The phone number of the recipient of the code. Format should be &#x60;countryCode&#x60;-&#x60;phoneNumber&#x60; | 
**message** | **String** | the message that the user is going to receive. location of the code should be given by using the tag {{ code }}. All instances of {{ code }} will be replaced with a code that is in accordance with the settings. If the tag is not present, the code will be added at the end of the message. |  [optional]
**codeLength** | **Integer** | the length of the code in characters. Maximum is 20 characters. Default is 6 characters. |  [optional]
**codeValidity** | **Integer** | the period of time the code is valid after the message has been sent, in seconds. Defaults to 600 seconds (10 min). Maximum validity is 3600 seconds (1 hour). |  [optional]
**codeType** | [**CodeTypeEnum**](#CodeTypeEnum) | the format of the code. can be:  Format | Description | RegEx --- | --- | --- numeric | numbers | [0-9] alpha | letters | [A-Z] alphanumeric | numbers and letters | [0-9A-Z] hexa | numbers and letters up to F | [0-9A-F] |  [optional]

<a name="CodeTypeEnum"></a>
## Enum: CodeTypeEnum
Name | Value
---- | -----
NUMERIC | &quot;numeric&quot;
ALPHA | &quot;alpha&quot;
ALPHANUMERIC | &quot;alphanumeric&quot;
HEXA | &quot;hexa&quot;
