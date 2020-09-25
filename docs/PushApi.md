# PushApi

All URIs are relative to *https://slingshot.egoiapp.com/api/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addApp**](PushApi.md#addApp) | **POST** /v2/apps | Create App
[**addPushTemplate**](PushApi.md#addPushTemplate) | **POST** /v2/push/templates | Create Push Template
[**deleteApp**](PushApi.md#deleteApp) | **DELETE** /v2/apps/{id} | Remove App
[**deletePushTemplate**](PushApi.md#deletePushTemplate) | **DELETE** /v2/push/templates/{id} | Remove Push Template
[**listApp**](PushApi.md#listApp) | **GET** /v2/apps/{id} | Get an App
[**listApps**](PushApi.md#listApps) | **GET** /v2/apps | Get All Apps
[**listPushTemplate**](PushApi.md#listPushTemplate) | **GET** /v2/push/templates/{id} | Get an Push Template
[**listPushTemplates**](PushApi.md#listPushTemplates) | **GET** /v2/push/templates | Get All Push Templates
[**sendPushMessages**](PushApi.md#sendPushMessages) | **POST** /v2/push/messages/action/send | Send a Push Message
[**updateApp**](PushApi.md#updateApp) | **PUT** /v2/apps/{id} | Update App
[**updatePushTemplate**](PushApi.md#updatePushTemplate) | **PATCH** /v2/push/templates/{id} | Update Push Template

<a name="addApp"></a>
# **addApp**
> TemplateIdResponse addApp(body)

Create App

Creates a new App

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PushApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

PushApi apiInstance = new PushApi();
MobileAppRequest body = new MobileAppRequest(); // MobileAppRequest | 
try {
    TemplateIdResponse result = apiInstance.addApp(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PushApi#addApp");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MobileAppRequest**](MobileAppRequest.md)|  | [optional]

### Return type

[**TemplateIdResponse**](TemplateIdResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addPushTemplate"></a>
# **addPushTemplate**
> TemplateIdResponse addPushTemplate(body)

Create Push Template

Creates a new template record for Push

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PushApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

PushApi apiInstance = new PushApi();
PushTemplateRequest body = new PushTemplateRequest(); // PushTemplateRequest | 
try {
    TemplateIdResponse result = apiInstance.addPushTemplate(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PushApi#addPushTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PushTemplateRequest**](PushTemplateRequest.md)|  | [optional]

### Return type

[**TemplateIdResponse**](TemplateIdResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteApp"></a>
# **deleteApp**
> deleteApp(id)

Remove App

Remove App

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PushApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

PushApi apiInstance = new PushApi();
String id = "id_example"; // String | Id of the app. Cannot be empty.
try {
    apiInstance.deleteApp(id);
} catch (ApiException e) {
    System.err.println("Exception when calling PushApi#deleteApp");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Id of the app. Cannot be empty. |

### Return type

null (empty response body)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deletePushTemplate"></a>
# **deletePushTemplate**
> deletePushTemplate(id)

Remove Push Template

Remove Push Template

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PushApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

PushApi apiInstance = new PushApi();
String id = "id_example"; // String | Id of the Push Template. Cannot be empty.
try {
    apiInstance.deletePushTemplate(id);
} catch (ApiException e) {
    System.err.println("Exception when calling PushApi#deletePushTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Id of the Push Template. Cannot be empty. |

### Return type

null (empty response body)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listApp"></a>
# **listApp**
> MobileAppIdResponse listApp(id)

Get an App

Gets an App

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PushApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

PushApi apiInstance = new PushApi();
String id = "id_example"; // String | Id of the App. Cannot be empty.
try {
    MobileAppIdResponse result = apiInstance.listApp(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PushApi#listApp");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Id of the App. Cannot be empty. |

### Return type

[**MobileAppIdResponse**](MobileAppIdResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listApps"></a>
# **listApps**
> List&lt;MobileAppResponse&gt; listApps()

Get All Apps

Obtains all the Apps

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PushApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

PushApi apiInstance = new PushApi();
try {
    List<MobileAppResponse> result = apiInstance.listApps();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PushApi#listApps");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;MobileAppResponse&gt;**](MobileAppResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listPushTemplate"></a>
# **listPushTemplate**
> SinglePushTemplateResponse listPushTemplate(id)

Get an Push Template

Gets an Push Template

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PushApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

PushApi apiInstance = new PushApi();
String id = "id_example"; // String | Id of the Push Template. Cannot be empty.
try {
    SinglePushTemplateResponse result = apiInstance.listPushTemplate(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PushApi#listPushTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Id of the Push Template. Cannot be empty. |

### Return type

[**SinglePushTemplateResponse**](SinglePushTemplateResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listPushTemplates"></a>
# **listPushTemplates**
> List&lt;SinglePushTemplateResponse&gt; listPushTemplates()

Get All Push Templates

Obtains all the Push templates

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PushApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

PushApi apiInstance = new PushApi();
try {
    List<SinglePushTemplateResponse> result = apiInstance.listPushTemplates();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PushApi#listPushTemplates");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;SinglePushTemplateResponse&gt;**](SinglePushTemplateResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="sendPushMessages"></a>
# **sendPushMessages**
> List&lt;SendMessageIdResponse&gt; sendPushMessages(body)

Send a Push Message

Send an push message to a recipient

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PushApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

PushApi apiInstance = new PushApi();
List<Object> body = null; // List<Object> | default response
try {
    List<SendMessageIdResponse> result = apiInstance.sendPushMessages(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PushApi#sendPushMessages");
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

<a name="updateApp"></a>
# **updateApp**
> MobileAppIdResponse updateApp(id, body)

Update App

Updates an App, given a template id

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PushApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

PushApi apiInstance = new PushApi();
String id = "id_example"; // String | Id of the Push Template. Cannot be empty.
MobileAppRequest body = new MobileAppRequest(); // MobileAppRequest | 
try {
    MobileAppIdResponse result = apiInstance.updateApp(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PushApi#updateApp");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Id of the Push Template. Cannot be empty. |
 **body** | [**MobileAppRequest**](MobileAppRequest.md)|  | [optional]

### Return type

[**MobileAppIdResponse**](MobileAppIdResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updatePushTemplate"></a>
# **updatePushTemplate**
> SinglePushTemplateResponse updatePushTemplate(id, body)

Update Push Template

Updates an Push template, given a template id

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PushApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

PushApi apiInstance = new PushApi();
String id = "id_example"; // String | Id of the Push Template. Cannot be empty.
PushTemplateRequest body = new PushTemplateRequest(); // PushTemplateRequest | 
try {
    SinglePushTemplateResponse result = apiInstance.updatePushTemplate(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PushApi#updatePushTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Id of the Push Template. Cannot be empty. |
 **body** | [**PushTemplateRequest**](PushTemplateRequest.md)|  | [optional]

### Return type

[**SinglePushTemplateResponse**](SinglePushTemplateResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

