# AgencygroupApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getBranch**](AgencygroupApi.md#getBranch) | **GET** /agencies/{agencyDid}/branches/{branchDid} | Get a Branch by ID |
| [**listBranches**](AgencygroupApi.md#listBranches) | **GET** /agencies/{agencyDid}/branches | Get a list of branches |


<a id="getBranch"></a>
# **getBranch**
> Agency getBranch(xIBMClientId, authorization, agencyDid, branchDid, xIBMClientSecret)

Get a Branch by ID

Get a Branch by ID

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AgencygroupApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: clientIdHeader
    ApiKeyAuth clientIdHeader = (ApiKeyAuth) defaultClient.getAuthentication("clientIdHeader");
    clientIdHeader.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //clientIdHeader.setApiKeyPrefix("Token");

    AgencygroupApi apiInstance = new AgencygroupApi(defaultClient);
    String xIBMClientId = "xIBMClientId_example"; // String | Unique System Identifier
    String authorization = "authorization_example"; // String | Authentication Token
    String agencyDid = "agencyDid_example"; // String | Agency UID
    String branchDid = "branchDid_example"; // String | Agency UID
    String xIBMClientSecret = "xIBMClientSecret_example"; // String | Client Secret
    try {
      Agency result = apiInstance.getBranch(xIBMClientId, authorization, agencyDid, branchDid, xIBMClientSecret);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgencygroupApi#getBranch");
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
| **agencyDid** | **String**| Agency UID | |
| **branchDid** | **String**| Agency UID | |
| **xIBMClientSecret** | **String**| Client Secret | [optional] |

### Return type

[**Agency**](Agency.md)

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

<a id="listBranches"></a>
# **listBranches**
> List&lt;AgencyHeader&gt; listBranches(xIBMClientId, authorization, agencyDid, xIBMClientSecret)

Get a list of branches

Get a list of branches

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AgencygroupApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: clientIdHeader
    ApiKeyAuth clientIdHeader = (ApiKeyAuth) defaultClient.getAuthentication("clientIdHeader");
    clientIdHeader.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //clientIdHeader.setApiKeyPrefix("Token");

    AgencygroupApi apiInstance = new AgencygroupApi(defaultClient);
    String xIBMClientId = "xIBMClientId_example"; // String | Unique System Identifier
    String authorization = "authorization_example"; // String | Authentication Token
    String agencyDid = "agencyDid_example"; // String | Agency UID
    String xIBMClientSecret = "xIBMClientSecret_example"; // String | Client Secret
    try {
      List<AgencyHeader> result = apiInstance.listBranches(xIBMClientId, authorization, agencyDid, xIBMClientSecret);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgencygroupApi#listBranches");
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
| **agencyDid** | **String**| Agency UID | |
| **xIBMClientSecret** | **String**| Client Secret | [optional] |

### Return type

[**List&lt;AgencyHeader&gt;**](AgencyHeader.md)

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

