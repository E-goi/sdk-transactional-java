# UtilitiesApi

All URIs are relative to *https://slingshot.egoiapp.com/api/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**emailValidator**](UtilitiesApi.md#emailValidator) | **POST** /v2/emailValidator | Email Validator
[**htmlToPdf**](UtilitiesApi.md#htmlToPdf) | **POST** /v2/htmlToPdfConverter | HTML to PDF converter
[**pingApi**](UtilitiesApi.md#pingApi) | **GET** /v2/ping | Ping API
[**smsLengthCalculator**](UtilitiesApi.md#smsLengthCalculator) | **POST** /v2/smsLengthCalculator | SMS Length Calculator
[**validatePhone**](UtilitiesApi.md#validatePhone) | **GET** /v2/validate-phone/{number} | Validate Phone

<a name="emailValidator"></a>
# **emailValidator**
> EmailValidatorResponse emailValidator(body)

Email Validator

Validates status and heath of the email address

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UtilitiesApi;


UtilitiesApi apiInstance = new UtilitiesApi();
EmailValidatorRequest body = new EmailValidatorRequest(); // EmailValidatorRequest | 
try {
    EmailValidatorResponse result = apiInstance.emailValidator(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UtilitiesApi#emailValidator");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**EmailValidatorRequest**](EmailValidatorRequest.md)|  | [optional]

### Return type

[**EmailValidatorResponse**](EmailValidatorResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="htmlToPdf"></a>
# **htmlToPdf**
> HtmlToPdfResponse htmlToPdf(body)

HTML to PDF converter

Converts an HTML input (either via html string or url) to a PDF returned at base 64. Before using, please validate if your HTML content isdone accordingly to the best standards [HERE](https://validator.w3.org/)

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UtilitiesApi;


UtilitiesApi apiInstance = new UtilitiesApi();
HtmlToPdfRequest body = new HtmlToPdfRequest(); // HtmlToPdfRequest | 
try {
    HtmlToPdfResponse result = apiInstance.htmlToPdf(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UtilitiesApi#htmlToPdf");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**HtmlToPdfRequest**](HtmlToPdfRequest.md)|  | [optional]

### Return type

[**HtmlToPdfResponse**](HtmlToPdfResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="pingApi"></a>
# **pingApi**
> PingResponse pingApi()

Ping API

Send an innocuous request to the API, in order to confirm its working as intended 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UtilitiesApi;


UtilitiesApi apiInstance = new UtilitiesApi();
try {
    PingResponse result = apiInstance.pingApi();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UtilitiesApi#pingApi");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**PingResponse**](PingResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="smsLengthCalculator"></a>
# **smsLengthCalculator**
> SmsLengthCalculatorResponse smsLengthCalculator(body)

SMS Length Calculator

Calculates the sizes of an SMS text

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UtilitiesApi;


UtilitiesApi apiInstance = new UtilitiesApi();
SmsLengthCalculatorRequest body = new SmsLengthCalculatorRequest(); // SmsLengthCalculatorRequest | 
try {
    SmsLengthCalculatorResponse result = apiInstance.smsLengthCalculator(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UtilitiesApi#smsLengthCalculator");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SmsLengthCalculatorRequest**](SmsLengthCalculatorRequest.md)|  | [optional]

### Return type

[**SmsLengthCalculatorResponse**](SmsLengthCalculatorResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="validatePhone"></a>
# **validatePhone**
> ValidatePhoneResponse validatePhone(number)

Validate Phone

Checks if a phone number is valid. Can be either land line or mobile

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UtilitiesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKey
ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
ApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKey.setApiKeyPrefix("Token");

UtilitiesApi apiInstance = new UtilitiesApi();
String number = "number_example"; // String | The phone number to validate. must be in format ``countryCode-mobileNumber``
try {
    ValidatePhoneResponse result = apiInstance.validatePhone(number);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UtilitiesApi#validatePhone");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **number** | **String**| The phone number to validate. must be in format &#x60;&#x60;countryCode-mobileNumber&#x60;&#x60; |

### Return type

[**ValidatePhoneResponse**](ValidatePhoneResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

