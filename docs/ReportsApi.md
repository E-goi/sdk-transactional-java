# ReportsApi

All URIs are relative to *https://slingshot.egoiapp.com/api/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**produceEmailReport**](ReportsApi.md#produceEmailReport) | **GET** /v2/email/reports | Get Email Report
[**produceSmsReport**](ReportsApi.md#produceSmsReport) | **GET** /v2/sms/reports | Get Sms Report

<a name="produceEmailReport"></a>
# **produceEmailReport**
> List&lt;EmailReportResponse&gt; produceEmailReport(group, groupBy, dateStart, dateEnd)

Get Email Report

Retrieve Mail Reports and Statistics. Entries can be customizable

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ReportsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

ReportsApi apiInstance = new ReportsApi();
String group = "group_example"; // String | The name of the group to search
String groupBy = "groupBy_example"; // String | The option to group the results. Can be either ``day`` or ``month``. Defaults to ``day`` if none are present
String dateStart = "dateStart_example"; // String | The date to start the report. Date must be in format ``yyyy-MM-dd``
String dateEnd = "dateEnd_example"; // String | The date to end the report. Date should be in format ``yyyy-MM-dd``
try {
    List<EmailReportResponse> result = apiInstance.produceEmailReport(group, groupBy, dateStart, dateEnd);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportsApi#produceEmailReport");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **group** | **String**| The name of the group to search | [optional]
 **groupBy** | **String**| The option to group the results. Can be either &#x60;&#x60;day&#x60;&#x60; or &#x60;&#x60;month&#x60;&#x60;. Defaults to &#x60;&#x60;day&#x60;&#x60; if none are present | [optional]
 **dateStart** | **String**| The date to start the report. Date must be in format &#x60;&#x60;yyyy-MM-dd&#x60;&#x60; | [optional]
 **dateEnd** | **String**| The date to end the report. Date should be in format &#x60;&#x60;yyyy-MM-dd&#x60;&#x60; | [optional]

### Return type

[**List&lt;EmailReportResponse&gt;**](EmailReportResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="produceSmsReport"></a>
# **produceSmsReport**
> List&lt;SmsReportResponse&gt; produceSmsReport(group, groupBy, dateStart, dateEnd)

Get Sms Report

Retrieve Sms Reports and Statistics. Entries can be customizable

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ReportsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

ReportsApi apiInstance = new ReportsApi();
String group = "group_example"; // String | The id of the group to search
String groupBy = "groupBy_example"; // String | The option to group the results. Can be either ``day`` or ``month``. Defaults to ``day`` if none are present
String dateStart = "dateStart_example"; // String | The date to start the report. Date must be in format ``yyyy-MM-dd``
String dateEnd = "dateEnd_example"; // String | The date to end the report. Date should be in format ``yyyy-MM-dd``
try {
    List<SmsReportResponse> result = apiInstance.produceSmsReport(group, groupBy, dateStart, dateEnd);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportsApi#produceSmsReport");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **group** | **String**| The id of the group to search | [optional]
 **groupBy** | **String**| The option to group the results. Can be either &#x60;&#x60;day&#x60;&#x60; or &#x60;&#x60;month&#x60;&#x60;. Defaults to &#x60;&#x60;day&#x60;&#x60; if none are present | [optional]
 **dateStart** | **String**| The date to start the report. Date must be in format &#x60;&#x60;yyyy-MM-dd&#x60;&#x60; | [optional]
 **dateEnd** | **String**| The date to end the report. Date should be in format &#x60;&#x60;yyyy-MM-dd&#x60;&#x60; | [optional]

### Return type

[**List&lt;SmsReportResponse&gt;**](SmsReportResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

