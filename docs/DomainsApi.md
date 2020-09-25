# DomainsApi

All URIs are relative to *https://slingshot.egoiapp.com/api/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addDomain**](DomainsApi.md#addDomain) | **POST** /v2/domain | Create New Domain
[**changeDefaultDomain**](DomainsApi.md#changeDefaultDomain) | **POST** /v2/domain/default | Change Default Domain
[**listDefaultDomain**](DomainsApi.md#listDefaultDomain) | **GET** /v2/domain/default | Get Default Domain
[**listDomain**](DomainsApi.md#listDomain) | **GET** /v2/domain/{id} | Get Single Domain
[**listDomains**](DomainsApi.md#listDomains) | **GET** /v2/domain | Get All Domains
[**validateDomain**](DomainsApi.md#validateDomain) | **GET** /v2/domain/{id}/validate | Validate Single Domain

<a name="addDomain"></a>
# **addDomain**
> DomainResponse addDomain(body)

Create New Domain

Add a new Domain to the list of available Domains for the sender to the recipient.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DomainsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

DomainsApi apiInstance = new DomainsApi();
DomainRequest body = new DomainRequest(); // DomainRequest | 
try {
    DomainResponse result = apiInstance.addDomain(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DomainsApi#addDomain");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DomainRequest**](DomainRequest.md)|  | [optional]

### Return type

[**DomainResponse**](DomainResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="changeDefaultDomain"></a>
# **changeDefaultDomain**
> DomainResponse changeDefaultDomain(body)

Change Default Domain

Change the currently configured default Domain

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DomainsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

DomainsApi apiInstance = new DomainsApi();
DefaultDomainRequest body = new DefaultDomainRequest(); // DefaultDomainRequest | 
try {
    DomainResponse result = apiInstance.changeDefaultDomain(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DomainsApi#changeDefaultDomain");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DefaultDomainRequest**](DefaultDomainRequest.md)|  | [optional]

### Return type

[**DomainResponse**](DomainResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listDefaultDomain"></a>
# **listDefaultDomain**
> DomainResponse listDefaultDomain()

Get Default Domain

Retrieve the currently configured default Domain. If no default domain is set, the list will be empty.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DomainsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

DomainsApi apiInstance = new DomainsApi();
try {
    DomainResponse result = apiInstance.listDefaultDomain();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DomainsApi#listDefaultDomain");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**DomainResponse**](DomainResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listDomain"></a>
# **listDomain**
> DomainResponse listDomain(id)

Get Single Domain

Retrieve the Domain with the id in the path.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DomainsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

DomainsApi apiInstance = new DomainsApi();
String id = "id_example"; // String | The id of the Verify Request
try {
    DomainResponse result = apiInstance.listDomain(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DomainsApi#listDomain");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The id of the Verify Request |

### Return type

[**DomainResponse**](DomainResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listDomains"></a>
# **listDomains**
> List&lt;DomainResponse&gt; listDomains()

Get All Domains

Retrieve the list of all Domains available for the sender to the recipients.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DomainsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

DomainsApi apiInstance = new DomainsApi();
try {
    List<DomainResponse> result = apiInstance.listDomains();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DomainsApi#listDomains");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;DomainResponse&gt;**](DomainResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="validateDomain"></a>
# **validateDomain**
> ValidateDomainResponse validateDomain(id)

Validate Single Domain

Clears the validation cache and validates the supplied configured Domain.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DomainsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

DomainsApi apiInstance = new DomainsApi();
String id = "id_example"; // String | The id of the Domain
try {
    ValidateDomainResponse result = apiInstance.validateDomain(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DomainsApi#validateDomain");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The id of the Domain |

### Return type

[**ValidateDomainResponse**](ValidateDomainResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

