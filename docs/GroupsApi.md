# GroupsApi

All URIs are relative to *https://slingshot.egoiapp.com/api/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listGroups**](GroupsApi.md#listGroups) | **GET** /v2/groups | Get All Groups

<a name="listGroups"></a>
# **listGroups**
> List&lt;GroupResponse&gt; listGroups(channel)

Get All Groups

Retrieve all groups to sort messages

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.GroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

GroupsApi apiInstance = new GroupsApi();
String channel = "channel_example"; // String | The channel of the groups. Can be `email` or `sms`, otherwise returns all groups.
try {
    List<GroupResponse> result = apiInstance.listGroups(channel);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupsApi#listGroups");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channel** | **String**| The channel of the groups. Can be &#x60;email&#x60; or &#x60;sms&#x60;, otherwise returns all groups. | [optional]

### Return type

[**List&lt;GroupResponse&gt;**](GroupResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

