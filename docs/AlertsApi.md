# AlertsApi

All URIs are relative to *https://slingshot.egoiapp.com/api/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**changeAlertTemplate**](AlertsApi.md#changeAlertTemplate) | **PATCH** /v2/alert/template/{id} | Change Single Alert Template
[**createAlertTemplate**](AlertsApi.md#createAlertTemplate) | **POST** /v2/alert/template | Create Alert Template
[**executeEmailAlert**](AlertsApi.md#executeEmailAlert) | **POST** /v2/alert/action/execute | Execute Alert
[**listMultiChannel**](AlertsApi.md#listMultiChannel) | **GET** /v2/alert/template/{id} | Get Single Alert Template
[**listMultiChannel1**](AlertsApi.md#listMultiChannel1) | **GET** /v2/alert/template | Get All Alert Template
[**removeAlertTemplate**](AlertsApi.md#removeAlertTemplate) | **DELETE** /v2/alert/template/{id} | Remove Alert Template
[**stopAlert**](AlertsApi.md#stopAlert) | **POST** /v2/alert/action/stop | Stop Alert

<a name="changeAlertTemplate"></a>
# **changeAlertTemplate**
> AlertTemplateResponse changeAlertTemplate(id, body)

Change Single Alert Template

This method will change information about the template

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AlertsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

AlertsApi apiInstance = new AlertsApi();
String id = "id_example"; // String | The id of the Alert Template to edit
AlertTemplateRequest body = new AlertTemplateRequest(); // AlertTemplateRequest | 
try {
    AlertTemplateResponse result = apiInstance.changeAlertTemplate(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertsApi#changeAlertTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The id of the Alert Template to edit |
 **body** | [**AlertTemplateRequest**](AlertTemplateRequest.md)|  | [optional]

### Return type

[**AlertTemplateResponse**](AlertTemplateResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="createAlertTemplate"></a>
# **createAlertTemplate**
> AlertTemplateIdResponse createAlertTemplate(body)

Create Alert Template

This method will create and add an alert template

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AlertsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

AlertsApi apiInstance = new AlertsApi();
AlertTemplateRequest body = new AlertTemplateRequest(); // AlertTemplateRequest | 
try {
    AlertTemplateIdResponse result = apiInstance.createAlertTemplate(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertsApi#createAlertTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AlertTemplateRequest**](AlertTemplateRequest.md)|  | [optional]

### Return type

[**AlertTemplateIdResponse**](AlertTemplateIdResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="executeEmailAlert"></a>
# **executeEmailAlert**
> AlertIdResponse executeEmailAlert(body)

Execute Alert

This method executes an alert flow , using a pre-created alert template.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AlertsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

AlertsApi apiInstance = new AlertsApi();
Body body = new Body(); // Body | default response
try {
    AlertIdResponse result = apiInstance.executeEmailAlert(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertsApi#executeEmailAlert");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Body**](Body.md)| default response | [optional]

### Return type

[**AlertIdResponse**](AlertIdResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listMultiChannel"></a>
# **listMultiChannel**
> AlertTemplateResponse listMultiChannel(id)

Get Single Alert Template

This method returns the Alert Template wih the id in the path

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AlertsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

AlertsApi apiInstance = new AlertsApi();
String id = "id_example"; // String | The id of the Alert Template
try {
    AlertTemplateResponse result = apiInstance.listMultiChannel(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertsApi#listMultiChannel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The id of the Alert Template |

### Return type

[**AlertTemplateResponse**](AlertTemplateResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listMultiChannel1"></a>
# **listMultiChannel1**
> List&lt;AlertTemplateResponse&gt; listMultiChannel1()

Get All Alert Template

This method returns all the Alert Templates

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AlertsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

AlertsApi apiInstance = new AlertsApi();
try {
    List<AlertTemplateResponse> result = apiInstance.listMultiChannel1();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertsApi#listMultiChannel1");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;AlertTemplateResponse&gt;**](AlertTemplateResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="removeAlertTemplate"></a>
# **removeAlertTemplate**
> removeAlertTemplate(id)

Remove Alert Template

This method removes an Alert Template from the system

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AlertsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

AlertsApi apiInstance = new AlertsApi();
String id = "id_example"; // String | The id of the Alert Template to remove
try {
    apiInstance.removeAlertTemplate(id);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertsApi#removeAlertTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The id of the Alert Template to remove |

### Return type

null (empty response body)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="stopAlert"></a>
# **stopAlert**
> AlertIdResponse stopAlert(body)

Stop Alert

This method will stop any alerts that are being processed

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AlertsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

AlertsApi apiInstance = new AlertsApi();
CancelAlertRequest body = new CancelAlertRequest(); // CancelAlertRequest | 
try {
    AlertIdResponse result = apiInstance.stopAlert(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AlertsApi#stopAlert");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CancelAlertRequest**](CancelAlertRequest.md)|  | [optional]

### Return type

[**AlertIdResponse**](AlertIdResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

