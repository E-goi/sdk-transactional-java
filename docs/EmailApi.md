# EmailApi

All URIs are relative to *https://slingshot.egoiapp.com/api/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**sendEmailMessages**](EmailApi.md#sendEmailMessages) | **POST** /v2/email/messages/action/send | Send an Email Message

<a name="sendEmailMessages"></a>
# **sendEmailMessages**
> List&lt;SendMessageIdResponse&gt; sendEmailMessages(body)

Send an Email Message

Send an email message to a recipient

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EmailApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

EmailApi apiInstance = new EmailApi();
List<Object> body = null; // List<Object> | default response
try {
    List<SendMessageIdResponse> result = apiInstance.sendEmailMessages(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EmailApi#sendEmailMessages");
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

