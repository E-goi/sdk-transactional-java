# MultiChannelApi

All URIs are relative to *https://slingshot.egoiapp.com/api/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createMultiChannelFlow**](MultiChannelApi.md#createMultiChannelFlow) | **POST** /v2/multi-channel/flow | Create Multi-Channel Flow
[**executeMultiChannel**](MultiChannelApi.md#executeMultiChannel) | **POST** /v2/multi-channel/execute | Execute Multi-Channel
[**listMultiChannel2**](MultiChannelApi.md#listMultiChannel2) | **GET** /v2/multi-channel/flow/{id} | Get Single Multi-Channel Flow
[**listMultiChannels**](MultiChannelApi.md#listMultiChannels) | **GET** /v2/multi-channel/flow | Get All Multi-Channel Flows
[**removeMultiChannel**](MultiChannelApi.md#removeMultiChannel) | **DELETE** /v2/multi-channel/flow/{id} | Remove Single Multi-Channel

<a name="createMultiChannelFlow"></a>
# **createMultiChannelFlow**
> MultiChannelFlowIdResponse createMultiChannelFlow(body)

Create Multi-Channel Flow

This method will create and add a Multi-Channel Flow. First message doesn&#x27;t need interval or condition, since it doesn&#x27;t depend on other messages

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MultiChannelApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

MultiChannelApi apiInstance = new MultiChannelApi();
MultiChannelFlowRequest body = new MultiChannelFlowRequest(); // MultiChannelFlowRequest | 
try {
    MultiChannelFlowIdResponse result = apiInstance.createMultiChannelFlow(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MultiChannelApi#createMultiChannelFlow");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MultiChannelFlowRequest**](MultiChannelFlowRequest.md)|  | [optional]

### Return type

[**MultiChannelFlowIdResponse**](MultiChannelFlowIdResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="executeMultiChannel"></a>
# **executeMultiChannel**
> MultiChannelIdResponse executeMultiChannel(body)

Execute Multi-Channel

This method will create and start a flow, sending the Multi-Channel of messages to the appropriate recipient

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MultiChannelApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

MultiChannelApi apiInstance = new MultiChannelApi();
ExecuteMultiChannelRequest body = new ExecuteMultiChannelRequest(); // ExecuteMultiChannelRequest | 
try {
    MultiChannelIdResponse result = apiInstance.executeMultiChannel(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MultiChannelApi#executeMultiChannel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ExecuteMultiChannelRequest**](ExecuteMultiChannelRequest.md)|  | [optional]

### Return type

[**MultiChannelIdResponse**](MultiChannelIdResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listMultiChannel2"></a>
# **listMultiChannel2**
> List&lt;MultiChannelFlowResponse&gt; listMultiChannel2(id)

Get Single Multi-Channel Flow

This method returns the Multi-Channel Flow wih the id in the path

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MultiChannelApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

MultiChannelApi apiInstance = new MultiChannelApi();
String id = "id_example"; // String | The id of the Multi-Channel Flow
try {
    List<MultiChannelFlowResponse> result = apiInstance.listMultiChannel2(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MultiChannelApi#listMultiChannel2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The id of the Multi-Channel Flow |

### Return type

[**List&lt;MultiChannelFlowResponse&gt;**](MultiChannelFlowResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listMultiChannels"></a>
# **listMultiChannels**
> List&lt;MultiChannelFlowResponse&gt; listMultiChannels()

Get All Multi-Channel Flows

This method returns all Multi-Channels Flows set in the system

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MultiChannelApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

MultiChannelApi apiInstance = new MultiChannelApi();
try {
    List<MultiChannelFlowResponse> result = apiInstance.listMultiChannels();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MultiChannelApi#listMultiChannels");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;MultiChannelFlowResponse&gt;**](MultiChannelFlowResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="removeMultiChannel"></a>
# **removeMultiChannel**
> removeMultiChannel(id)

Remove Single Multi-Channel

This method removes a Multi-Channel Flow from the system

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MultiChannelApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

MultiChannelApi apiInstance = new MultiChannelApi();
String id = "id_example"; // String | The id of the Multi-Channel Flow to remove
try {
    apiInstance.removeMultiChannel(id);
} catch (ApiException e) {
    System.err.println("Exception when calling MultiChannelApi#removeMultiChannel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The id of the Multi-Channel Flow to remove |

### Return type

null (empty response body)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

