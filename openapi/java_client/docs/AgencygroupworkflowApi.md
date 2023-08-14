# AgencygroupworkflowApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**linkAgencyBranch**](AgencygroupworkflowApi.md#linkAgencyBranch) | **POST** /agencies/{agencyDid}/branches/{branchDid}/events/link | Request for linking a branch agency |
| [**unLinkAgencyBranch**](AgencygroupworkflowApi.md#unLinkAgencyBranch) | **POST** /agencies/{agencyDid}/branches/{branchDid}/events/unlink | Request for unlinking a branch agency |


<a id="linkAgencyBranch"></a>
# **linkAgencyBranch**
> Agency linkAgencyBranch(xIBMClientId, authorization, agencyDid, branchDid, request, xIBMClientSecret)

Request for linking a branch agency

Request for linking a branch agency

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AgencygroupworkflowApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: clientIdHeader
    ApiKeyAuth clientIdHeader = (ApiKeyAuth) defaultClient.getAuthentication("clientIdHeader");
    clientIdHeader.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //clientIdHeader.setApiKeyPrefix("Token");

    AgencygroupworkflowApi apiInstance = new AgencygroupworkflowApi(defaultClient);
    String xIBMClientId = "xIBMClientId_example"; // String | Unique System Identifier
    String authorization = "authorization_example"; // String | Authentication Token
    String agencyDid = "agencyDid_example"; // String | Agency UID
    String branchDid = "branchDid_example"; // String | Branch DID
    Object request = null; // Object | Client Secret
    String xIBMClientSecret = "xIBMClientSecret_example"; // String | Client Secret
    try {
      Agency result = apiInstance.linkAgencyBranch(xIBMClientId, authorization, agencyDid, branchDid, request, xIBMClientSecret);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgencygroupworkflowApi#linkAgencyBranch");
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
| **branchDid** | **String**| Branch DID | |
| **request** | **Object**| Client Secret | |
| **xIBMClientSecret** | **String**| Client Secret | [optional] |

### Return type

[**Agency**](Agency.md)

### Authorization

[clientIdHeader](../README.md#clientIdHeader)

### HTTP request headers

 - **Content-Type**: application/json
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

<a id="unLinkAgencyBranch"></a>
# **unLinkAgencyBranch**
> Agency unLinkAgencyBranch(xIBMClientId, authorization, agencyDid, branchDid, request, xIBMClientSecret)

Request for unlinking a branch agency

Request for unlinking a branch agency

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AgencygroupworkflowApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: clientIdHeader
    ApiKeyAuth clientIdHeader = (ApiKeyAuth) defaultClient.getAuthentication("clientIdHeader");
    clientIdHeader.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //clientIdHeader.setApiKeyPrefix("Token");

    AgencygroupworkflowApi apiInstance = new AgencygroupworkflowApi(defaultClient);
    String xIBMClientId = "xIBMClientId_example"; // String | Unique System Identifier
    String authorization = "authorization_example"; // String | Authentication Token
    String agencyDid = "agencyDid_example"; // String | Agency UID
    String branchDid = "branchDid_example"; // String | Branch DID
    Object request = null; // Object | Client Secret
    String xIBMClientSecret = "xIBMClientSecret_example"; // String | Client Secret
    try {
      Agency result = apiInstance.unLinkAgencyBranch(xIBMClientId, authorization, agencyDid, branchDid, request, xIBMClientSecret);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgencygroupworkflowApi#unLinkAgencyBranch");
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
| **branchDid** | **String**| Branch DID | |
| **request** | **Object**| Client Secret | |
| **xIBMClientSecret** | **String**| Client Secret | [optional] |

### Return type

[**Agency**](Agency.md)

### Authorization

[clientIdHeader](../README.md#clientIdHeader)

### HTTP request headers

 - **Content-Type**: application/json
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

