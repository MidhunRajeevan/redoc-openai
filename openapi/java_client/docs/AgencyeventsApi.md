# AgencyeventsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**archiveAgency**](AgencyeventsApi.md#archiveAgency) | **POST** /agencies/{did}/events/archive | Archive an agency in TARS |
| [**closeAgency**](AgencyeventsApi.md#closeAgency) | **POST** /agencies/{did}/events/close | Close an agency in TARS |
| [**unarchiveAgency**](AgencyeventsApi.md#unarchiveAgency) | **POST** /agencies/{did}/events/unarchive | Unarchive an agency in TARS |


<a id="archiveAgency"></a>
# **archiveAgency**
> archiveAgency(xIBMClientId, authorization, did, xIBMClientSecret)

Archive an agency in TARS

Archive an agency in TARS

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AgencyeventsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: clientIdHeader
    ApiKeyAuth clientIdHeader = (ApiKeyAuth) defaultClient.getAuthentication("clientIdHeader");
    clientIdHeader.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //clientIdHeader.setApiKeyPrefix("Token");

    AgencyeventsApi apiInstance = new AgencyeventsApi(defaultClient);
    String xIBMClientId = "xIBMClientId_example"; // String | Unique System Identifier
    String authorization = "authorization_example"; // String | Authentication Token
    String did = "did_example"; // String | Agency UID
    String xIBMClientSecret = "xIBMClientSecret_example"; // String | Client Secret
    try {
      apiInstance.archiveAgency(xIBMClientId, authorization, did, xIBMClientSecret);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgencyeventsApi#archiveAgency");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **xIBMClientId** | **String**| Unique System Identifier | |
| **authorization** | **String**| Authentication Token | |
| **did** | **String**| Agency UID | |
| **xIBMClientSecret** | **String**| Client Secret | [optional] |

### Return type

null (empty response body)

### Authorization

[clientIdHeader](../README.md#clientIdHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | UnAuthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **405** | Method Not Allowed |  -  |
| **422** | Unprocessable Entity |  -  |
| **500** | Internal Server Error |  -  |
| **503** | Service Unavailable |  -  |

<a id="closeAgency"></a>
# **closeAgency**
> closeAgency(xIBMClientId, authorization, did, xIBMClientSecret)

Close an agency in TARS

Close an agency in TARS

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AgencyeventsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: clientIdHeader
    ApiKeyAuth clientIdHeader = (ApiKeyAuth) defaultClient.getAuthentication("clientIdHeader");
    clientIdHeader.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //clientIdHeader.setApiKeyPrefix("Token");

    AgencyeventsApi apiInstance = new AgencyeventsApi(defaultClient);
    String xIBMClientId = "xIBMClientId_example"; // String | Unique System Identifier
    String authorization = "authorization_example"; // String | Authentication Token
    String did = "did_example"; // String | Agency UID
    String xIBMClientSecret = "xIBMClientSecret_example"; // String | Client Secret
    try {
      apiInstance.closeAgency(xIBMClientId, authorization, did, xIBMClientSecret);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgencyeventsApi#closeAgency");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **xIBMClientId** | **String**| Unique System Identifier | |
| **authorization** | **String**| Authentication Token | |
| **did** | **String**| Agency UID | |
| **xIBMClientSecret** | **String**| Client Secret | [optional] |

### Return type

null (empty response body)

### Authorization

[clientIdHeader](../README.md#clientIdHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | UnAuthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **405** | Method Not Allowed |  -  |
| **422** | Unprocessable Entity |  -  |
| **500** | Internal Server Error |  -  |
| **503** | Service Unavailable |  -  |

<a id="unarchiveAgency"></a>
# **unarchiveAgency**
> unarchiveAgency(xIBMClientId, authorization, did, xIBMClientSecret)

Unarchive an agency in TARS

Unarchive an agency in TARS

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AgencyeventsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: clientIdHeader
    ApiKeyAuth clientIdHeader = (ApiKeyAuth) defaultClient.getAuthentication("clientIdHeader");
    clientIdHeader.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //clientIdHeader.setApiKeyPrefix("Token");

    AgencyeventsApi apiInstance = new AgencyeventsApi(defaultClient);
    String xIBMClientId = "xIBMClientId_example"; // String | Unique System Identifier
    String authorization = "authorization_example"; // String | Authentication Token
    String did = "did_example"; // String | Agency UID
    String xIBMClientSecret = "xIBMClientSecret_example"; // String | Client Secret
    try {
      apiInstance.unarchiveAgency(xIBMClientId, authorization, did, xIBMClientSecret);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgencyeventsApi#unarchiveAgency");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **xIBMClientId** | **String**| Unique System Identifier | |
| **authorization** | **String**| Authentication Token | |
| **did** | **String**| Agency UID | |
| **xIBMClientSecret** | **String**| Client Secret | [optional] |

### Return type

null (empty response body)

### Authorization

[clientIdHeader](../README.md#clientIdHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | UnAuthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **405** | Method Not Allowed |  -  |
| **422** | Unprocessable Entity |  -  |
| **500** | Internal Server Error |  -  |
| **503** | Service Unavailable |  -  |

