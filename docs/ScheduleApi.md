# ScheduleApi

All URIs are relative to *https://slingshot.egoiapp.com/api/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelScheduledMessage**](ScheduleApi.md#cancelScheduledMessage) | **POST** /v2/messages/{id}/action/send | Cancel a Scheduled Message

<a name="cancelScheduledMessage"></a>
# **cancelScheduledMessage**
> cancelScheduledMessage(id)

Cancel a Scheduled Message

Cancel a Scheduled Message

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ScheduleApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

ScheduleApi apiInstance = new ScheduleApi();
String id = "id_example"; // String | Id of the Message to cancel the send.
try {
    apiInstance.cancelScheduledMessage(id);
} catch (ApiException e) {
    System.err.println("Exception when calling ScheduleApi#cancelScheduledMessage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Id of the Message to cancel the send. |

### Return type

null (empty response body)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

