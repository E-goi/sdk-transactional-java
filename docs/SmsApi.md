# SmsApi

All URIs are relative to *https://slingshot.egoiapp.com/api/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**sendSmsMessages**](SmsApi.md#sendSmsMessages) | **POST** /v2/sms/messages/action/send | Send an SMS Message

<a name="sendSmsMessages"></a>
# **sendSmsMessages**
> List&lt;SendMessageIdResponse&gt; sendSmsMessages(body)

Send an SMS Message

Send an sms message to a recipient

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SmsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

SmsApi apiInstance = new SmsApi();
List<Object> body = null; // List<Object> | default response
try {
    List<SendMessageIdResponse> result = apiInstance.sendSmsMessages(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SmsApi#sendSmsMessages");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**List&lt;Object&gt;**](Object.md)| default response | [optional]

### Return type

[**List&lt;SendMessageIdResponse&gt;**](SendMessageIdResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

