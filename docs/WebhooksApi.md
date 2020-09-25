# WebhooksApi

All URIs are relative to *https://slingshot.egoiapp.com/api/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addWebHook**](WebhooksApi.md#addWebHook) | **POST** /v2/webhooks | Create new Webhook
[**listWebHooks**](WebhooksApi.md#listWebHooks) | **GET** /v2/webhooks | Get All Webhooks
[**removeWebHook**](WebhooksApi.md#removeWebHook) | **DELETE** /v2/webhooks | Remove Webhook

<a name="addWebHook"></a>
# **addWebHook**
> WebhookIdResponse addWebHook(body)

Create new Webhook

Create a new Webhook

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.WebhooksApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

WebhooksApi apiInstance = new WebhooksApi();
Body1 body = new Body1(); // Body1 | default response
try {
    WebhookIdResponse result = apiInstance.addWebHook(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhooksApi#addWebHook");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Body1**](Body1.md)| default response | [optional]

### Return type

[**WebhookIdResponse**](WebhookIdResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listWebHooks"></a>
# **listWebHooks**
> List&lt;GetWebhooksResponse&gt; listWebHooks(channel)

Get All Webhooks

Return all Webhooks defined by the user

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.WebhooksApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

WebhooksApi apiInstance = new WebhooksApi();
String channel = "channel_example"; // String | The channel of the groups. Can be `email` or `sms`, otherwise returns all groups.
try {
    List<GetWebhooksResponse> result = apiInstance.listWebHooks(channel);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhooksApi#listWebHooks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channel** | **String**| The channel of the groups. Can be &#x60;email&#x60; or &#x60;sms&#x60;, otherwise returns all groups. | [optional]

### Return type

[**List&lt;GetWebhooksResponse&gt;**](GetWebhooksResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="removeWebHook"></a>
# **removeWebHook**
> removeWebHook(id, channel)

Remove Webhook

Remove a Webhook

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.WebhooksApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

WebhooksApi apiInstance = new WebhooksApi();
String id = "id_example"; // String | Id of the contact to be delete. Cannot be empty.
String channel = "channel_example"; // String | The channel of the Webhook. Can be `email` or `sms`, otherwise removes all the requested webhooks.
try {
    apiInstance.removeWebHook(id, channel);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhooksApi#removeWebHook");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Id of the contact to be delete. Cannot be empty. |
 **channel** | **String**| The channel of the Webhook. Can be &#x60;email&#x60; or &#x60;sms&#x60;, otherwise removes all the requested webhooks. | [optional]

### Return type

null (empty response body)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

