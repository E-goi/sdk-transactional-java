# MessageInformationApi

All URIs are relative to *https://slingshot.egoiapp.com/api/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listAllEmailMessages**](MessageInformationApi.md#listAllEmailMessages) | **GET** /v2/email/messages | Get All Email Messages
[**listAllSmsMessages**](MessageInformationApi.md#listAllSmsMessages) | **GET** /v2/sms/messages | Get All Sms Messages
[**listSingleEmailMessage**](MessageInformationApi.md#listSingleEmailMessage) | **GET** /v2/email/messages/{id} | Get Single Email Messages
[**listSingleSmsMessage**](MessageInformationApi.md#listSingleSmsMessage) | **GET** /v2/sms/messages/{id} | Get Single Sms Messages

<a name="listAllEmailMessages"></a>
# **listAllEmailMessages**
> List&lt;PartialEmailMessageResponse&gt; listAllEmailMessages(group, dateStart, dateEnd, destination, status)

Get All Email Messages

Retrieve the list of all sms messages. Results can be filtered by messages ids, group or channel. The result will be a combination of all parameters present

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MessageInformationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

MessageInformationApi apiInstance = new MessageInformationApi();
String group = "group_example"; // String | The name of the group to search
String dateStart = "dateStart_example"; // String | The date to start the report. Date must be in format ``yyyy-MM-dd``
String dateEnd = "dateEnd_example"; // String | The date to end the report. Date should be in format ``yyyy-MM-dd``
String destination = "destination_example"; // String | The mobile number of a recipient.
String status = "status_example"; // String | The status to check the message.
try {
    List<PartialEmailMessageResponse> result = apiInstance.listAllEmailMessages(group, dateStart, dateEnd, destination, status);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessageInformationApi#listAllEmailMessages");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **group** | **String**| The name of the group to search | [optional]
 **dateStart** | **String**| The date to start the report. Date must be in format &#x60;&#x60;yyyy-MM-dd&#x60;&#x60; | [optional]
 **dateEnd** | **String**| The date to end the report. Date should be in format &#x60;&#x60;yyyy-MM-dd&#x60;&#x60; | [optional]
 **destination** | **String**| The mobile number of a recipient. | [optional]
 **status** | **String**| The status to check the message. | [optional] [enum: created, queued, processing, spool, sending, finished, send_failed, broken, delivered, rejected, bounce_hard, bounce_soft, scheduled]

### Return type

[**List&lt;PartialEmailMessageResponse&gt;**](PartialEmailMessageResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listAllSmsMessages"></a>
# **listAllSmsMessages**
> List&lt;PartialSmsMessageResponse&gt; listAllSmsMessages(group, dateStart, dateEnd, destination, status)

Get All Sms Messages

Retrieve the list of all sms messages. Results can be filtered by messages ids, group or channel. The result will be a combination of all parameters present

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MessageInformationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

MessageInformationApi apiInstance = new MessageInformationApi();
String group = "group_example"; // String | The name of the group to search
String dateStart = "dateStart_example"; // String | The date to start the report. Date must be in format ``yyyy-MM-dd``
String dateEnd = "dateEnd_example"; // String | The date to end the report. Date should be in format ``yyyy-MM-dd``
String destination = "destination_example"; // String | The mobile number of a recipient.
String status = "status_example"; // String | The status to check the message.
try {
    List<PartialSmsMessageResponse> result = apiInstance.listAllSmsMessages(group, dateStart, dateEnd, destination, status);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessageInformationApi#listAllSmsMessages");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **group** | **String**| The name of the group to search | [optional]
 **dateStart** | **String**| The date to start the report. Date must be in format &#x60;&#x60;yyyy-MM-dd&#x60;&#x60; | [optional]
 **dateEnd** | **String**| The date to end the report. Date should be in format &#x60;&#x60;yyyy-MM-dd&#x60;&#x60; | [optional]
 **destination** | **String**| The mobile number of a recipient. | [optional]
 **status** | **String**| The status to check the message. | [optional] [enum: created, queued, processing, spool, sending, finished, send_failed, broken, delivered, rejected, scheduled]

### Return type

[**List&lt;PartialSmsMessageResponse&gt;**](PartialSmsMessageResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listSingleEmailMessage"></a>
# **listSingleEmailMessage**
> CompleteEmailMessageResponse listSingleEmailMessage(id)

Get Single Email Messages

Retrieve the message with the id from path

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MessageInformationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

MessageInformationApi apiInstance = new MessageInformationApi();
Integer id = 56; // Integer | The id of the message.
try {
    CompleteEmailMessageResponse result = apiInstance.listSingleEmailMessage(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessageInformationApi#listSingleEmailMessage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| The id of the message. |

### Return type

[**CompleteEmailMessageResponse**](CompleteEmailMessageResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listSingleSmsMessage"></a>
# **listSingleSmsMessage**
> CompleteSmsMessageResponse listSingleSmsMessage(id)

Get Single Sms Messages

Retrieve the message with the id from path

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MessageInformationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

MessageInformationApi apiInstance = new MessageInformationApi();
Integer id = 56; // Integer | The id of the message.
try {
    CompleteSmsMessageResponse result = apiInstance.listSingleSmsMessage(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessageInformationApi#listSingleSmsMessage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| The id of the message. |

### Return type

[**CompleteSmsMessageResponse**](CompleteSmsMessageResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

