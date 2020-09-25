# VerifyApi

All URIs are relative to *https://slingshot.egoiapp.com/api/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelVerify**](VerifyApi.md#cancelVerify) | **POST** /v2/verify/{id}/cancel | Cancel Verify Request
[**getVerify**](VerifyApi.md#getVerify) | **GET** /v2/verify/{id} | Get Verify Request
[**requestVerify**](VerifyApi.md#requestVerify) | **POST** /v2/verify/request | Request Verify
[**resendVerify**](VerifyApi.md#resendVerify) | **POST** /v2/verify/{id}/resend | Resend Verify Code
[**validateVerifyCode**](VerifyApi.md#validateVerifyCode) | **POST** /v2/verify/{id}/validate | Validate Verify Code

<a name="cancelVerify"></a>
# **cancelVerify**
> List&lt;VerifyIdResponse&gt; cancelVerify(id)

Cancel Verify Request

This method will cancel the requested verify. No codes will be further generated or confirmed within the context of the id of the message

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.VerifyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

VerifyApi apiInstance = new VerifyApi();
String id = "id_example"; // String | The id of the Verify Request
try {
    List<VerifyIdResponse> result = apiInstance.cancelVerify(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VerifyApi#cancelVerify");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The id of the Verify Request |

### Return type

[**List&lt;VerifyIdResponse&gt;**](VerifyIdResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVerify"></a>
# **getVerify**
> CheckVerifyResponse getVerify(id)

Get Verify Request

This method gets a verify requests, including status of it

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.VerifyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

VerifyApi apiInstance = new VerifyApi();
String id = "id_example"; // String | The id of the Verify Request
try {
    CheckVerifyResponse result = apiInstance.getVerify(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VerifyApi#getVerify");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The id of the Verify Request |

### Return type

[**CheckVerifyResponse**](CheckVerifyResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="requestVerify"></a>
# **requestVerify**
> VerifyIdResponse requestVerify(body)

Request Verify

This method will generate a code and send a message with it to a recipient

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.VerifyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

VerifyApi apiInstance = new VerifyApi();
VerifyRequest body = new VerifyRequest(); // VerifyRequest | 
try {
    VerifyIdResponse result = apiInstance.requestVerify(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VerifyApi#requestVerify");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**VerifyRequest**](VerifyRequest.md)|  | [optional]

### Return type

[**VerifyIdResponse**](VerifyIdResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="resendVerify"></a>
# **resendVerify**
> List&lt;VerifyIdResponse&gt; resendVerify(id)

Resend Verify Code

This method will resend the requested verify. A new code will be generated and sent to the recipient

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.VerifyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

VerifyApi apiInstance = new VerifyApi();
String id = "id_example"; // String | The id of the Verify Request
try {
    List<VerifyIdResponse> result = apiInstance.resendVerify(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VerifyApi#resendVerify");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The id of the Verify Request |

### Return type

[**List&lt;VerifyIdResponse&gt;**](VerifyIdResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="validateVerifyCode"></a>
# **validateVerifyCode**
> List&lt;VerifyIdResponse&gt; validateVerifyCode(id, body)

Validate Verify Code

This method validates the code submitted by the recipient. This request should be made by the sender of the Verify request

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.VerifyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

VerifyApi apiInstance = new VerifyApi();
String id = "id_example"; // String | The id of the Verify Request
ValidateCodeVerifyRequest body = new ValidateCodeVerifyRequest(); // ValidateCodeVerifyRequest | 
try {
    List<VerifyIdResponse> result = apiInstance.validateVerifyCode(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VerifyApi#validateVerifyCode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The id of the Verify Request |
 **body** | [**ValidateCodeVerifyRequest**](ValidateCodeVerifyRequest.md)|  | [optional]

### Return type

[**List&lt;VerifyIdResponse&gt;**](VerifyIdResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

