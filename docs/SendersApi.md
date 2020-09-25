# SendersApi

All URIs are relative to *https://slingshot.egoiapp.com/api/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getEmailSenders**](SendersApi.md#getEmailSenders) | **GET** /v2/email/senders | Get All Email Senders
[**getSmsSenders**](SendersApi.md#getSmsSenders) | **GET** /v2/sms/senders | Get All Sms Senders

<a name="getEmailSenders"></a>
# **getEmailSenders**
> List&lt;EmailSenderResponse&gt; getEmailSenders()

Get All Email Senders

Retrieve the list of available Email senders

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SendersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

SendersApi apiInstance = new SendersApi();
try {
    List<EmailSenderResponse> result = apiInstance.getEmailSenders();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SendersApi#getEmailSenders");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;EmailSenderResponse&gt;**](EmailSenderResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSmsSenders"></a>
# **getSmsSenders**
> List&lt;SmsSenderResponse&gt; getSmsSenders()

Get All Sms Senders

Return all Sms Senders defined by the user

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SendersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

SendersApi apiInstance = new SendersApi();
try {
    List<SmsSenderResponse> result = apiInstance.getSmsSenders();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SendersApi#getSmsSenders");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;SmsSenderResponse&gt;**](SmsSenderResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

