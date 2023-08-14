# AgencyApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**blockAgency**](AgencyApi.md#blockAgency) | **POST** /agencies/{agencyDid}/events/block | Block agency |
| [**deleteAgency**](AgencyApi.md#deleteAgency) | **DELETE** /agencies/{did} | Delete an agency from TARS |
| [**retrieveAgencyDetails**](AgencyApi.md#retrieveAgencyDetails) | **GET** /agencies/{did}/details | Fetch an agency in TARS |
| [**retrieveAgencyMasters**](AgencyApi.md#retrieveAgencyMasters) | **GET** /agencies/{did} | Fetch an agency in TARS |
| [**retrieveAgencyTransactions**](AgencyApi.md#retrieveAgencyTransactions) | **GET** /agencies/{did}/transactions | Fetch an agency by ID |
| [**unblockAgency**](AgencyApi.md#unblockAgency) | **POST** /agencies/{agencyDid}/events/unblock | Unblock agency |
| [**updateAgency**](AgencyApi.md#updateAgency) | **PATCH** /agencies/{did} | Update an agency in TARS |
| [**updateAgencyContacts**](AgencyApi.md#updateAgencyContacts) | **PUT** /agencies/{did}/contacts | Update agency details |
| [**updateAgencySyncByDid**](AgencyApi.md#updateAgencySyncByDid) | **POST** /agencies/{did}/events/sync | Update agency details by sync |
| [**updateSimStatus**](AgencyApi.md#updateSimStatus) | **POST** /agencies/sim-status | Update newly created/existing organizations sim card received status |


<a id="blockAgency"></a>
# **blockAgency**
> blockAgency(xIBMClientId, authorization, agencyDid, request, xIBMClientSecret)

Block agency

Block agency

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AgencyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: clientIdHeader
    ApiKeyAuth clientIdHeader = (ApiKeyAuth) defaultClient.getAuthentication("clientIdHeader");
    clientIdHeader.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //clientIdHeader.setApiKeyPrefix("Token");

    AgencyApi apiInstance = new AgencyApi(defaultClient);
    String xIBMClientId = "xIBMClientId_example"; // String | Unique System Identifier
    String authorization = "authorization_example"; // String | Authentication Token
    String agencyDid = "agencyDid_example"; // String | Agency UID
    AgencyRemarks request = new AgencyRemarks(); // AgencyRemarks | Request
    String xIBMClientSecret = "xIBMClientSecret_example"; // String | Client Secret
    try {
      apiInstance.blockAgency(xIBMClientId, authorization, agencyDid, request, xIBMClientSecret);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgencyApi#blockAgency");
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
| **request** | [**AgencyRemarks**](AgencyRemarks.md)| Request | |
| **xIBMClientSecret** | **String**| Client Secret | [optional] |

### Return type

null (empty response body)

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

<a id="deleteAgency"></a>
# **deleteAgency**
> String deleteAgency(xIBMClientId, authorization, did, xIBMClientSecret)

Delete an agency from TARS

Delete an agency from TARS

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AgencyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: clientIdHeader
    ApiKeyAuth clientIdHeader = (ApiKeyAuth) defaultClient.getAuthentication("clientIdHeader");
    clientIdHeader.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //clientIdHeader.setApiKeyPrefix("Token");

    AgencyApi apiInstance = new AgencyApi(defaultClient);
    String xIBMClientId = "xIBMClientId_example"; // String | Unique System Identifier
    String authorization = "authorization_example"; // String | Authentication Token
    String did = "did_example"; // String | Agency UID
    String xIBMClientSecret = "xIBMClientSecret_example"; // String | Client Secret
    try {
      String result = apiInstance.deleteAgency(xIBMClientId, authorization, did, xIBMClientSecret);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgencyApi#deleteAgency");
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

**String**

### Authorization

[clientIdHeader](../README.md#clientIdHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |
| **400** | Bad Request |  -  |
| **401** | UnAuthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **405** | Method Not Allowed |  -  |
| **422** | Unprocessable Entity |  -  |
| **500** | Internal Server Error |  -  |
| **503** | Service Unavailable |  -  |

<a id="retrieveAgencyDetails"></a>
# **retrieveAgencyDetails**
> AgencyWithDetails retrieveAgencyDetails(xIBMClientId, authorization, did, xIBMClientSecret)

Fetch an agency in TARS

Fetch an agency in TARS

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AgencyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: clientIdHeader
    ApiKeyAuth clientIdHeader = (ApiKeyAuth) defaultClient.getAuthentication("clientIdHeader");
    clientIdHeader.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //clientIdHeader.setApiKeyPrefix("Token");

    AgencyApi apiInstance = new AgencyApi(defaultClient);
    String xIBMClientId = "xIBMClientId_example"; // String | Unique System Identifier
    String authorization = "authorization_example"; // String | Authentication Token
    String did = "did_example"; // String | Agency UID
    String xIBMClientSecret = "xIBMClientSecret_example"; // String | Client Secret
    try {
      AgencyWithDetails result = apiInstance.retrieveAgencyDetails(xIBMClientId, authorization, did, xIBMClientSecret);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgencyApi#retrieveAgencyDetails");
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

[**AgencyWithDetails**](AgencyWithDetails.md)

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

<a id="retrieveAgencyMasters"></a>
# **retrieveAgencyMasters**
> Agency retrieveAgencyMasters(xIBMClientId, authorization, did, xIBMClientSecret)

Fetch an agency in TARS

Fetch an agency in TARS

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AgencyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: clientIdHeader
    ApiKeyAuth clientIdHeader = (ApiKeyAuth) defaultClient.getAuthentication("clientIdHeader");
    clientIdHeader.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //clientIdHeader.setApiKeyPrefix("Token");

    AgencyApi apiInstance = new AgencyApi(defaultClient);
    String xIBMClientId = "xIBMClientId_example"; // String | Unique System Identifier
    String authorization = "authorization_example"; // String | Authentication Token
    String did = "did_example"; // String | Agency UID
    String xIBMClientSecret = "xIBMClientSecret_example"; // String | Client Secret
    try {
      Agency result = apiInstance.retrieveAgencyMasters(xIBMClientId, authorization, did, xIBMClientSecret);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgencyApi#retrieveAgencyMasters");
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

<a id="retrieveAgencyTransactions"></a>
# **retrieveAgencyTransactions**
> AgencyWithTransactions retrieveAgencyTransactions(xIBMClientId, authorization, did, xIBMClientSecret)

Fetch an agency by ID

Fetch an agency by Id

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AgencyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: clientIdHeader
    ApiKeyAuth clientIdHeader = (ApiKeyAuth) defaultClient.getAuthentication("clientIdHeader");
    clientIdHeader.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //clientIdHeader.setApiKeyPrefix("Token");

    AgencyApi apiInstance = new AgencyApi(defaultClient);
    String xIBMClientId = "xIBMClientId_example"; // String | Unique System Identifier
    String authorization = "authorization_example"; // String | Authentication Token
    String did = "did_example"; // String | Agency UID
    String xIBMClientSecret = "xIBMClientSecret_example"; // String | Client Secret
    try {
      AgencyWithTransactions result = apiInstance.retrieveAgencyTransactions(xIBMClientId, authorization, did, xIBMClientSecret);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgencyApi#retrieveAgencyTransactions");
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

[**AgencyWithTransactions**](AgencyWithTransactions.md)

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

<a id="unblockAgency"></a>
# **unblockAgency**
> unblockAgency(xIBMClientId, authorization, agencyDid, request, xIBMClientSecret)

Unblock agency

Unblock agency

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AgencyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: clientIdHeader
    ApiKeyAuth clientIdHeader = (ApiKeyAuth) defaultClient.getAuthentication("clientIdHeader");
    clientIdHeader.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //clientIdHeader.setApiKeyPrefix("Token");

    AgencyApi apiInstance = new AgencyApi(defaultClient);
    String xIBMClientId = "xIBMClientId_example"; // String | Unique System Identifier
    String authorization = "authorization_example"; // String | Authentication Token
    String agencyDid = "agencyDid_example"; // String | Agency UID
    AgencyRemarks request = new AgencyRemarks(); // AgencyRemarks | Request
    String xIBMClientSecret = "xIBMClientSecret_example"; // String | Client Secret
    try {
      apiInstance.unblockAgency(xIBMClientId, authorization, agencyDid, request, xIBMClientSecret);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgencyApi#unblockAgency");
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
| **request** | [**AgencyRemarks**](AgencyRemarks.md)| Request | |
| **xIBMClientSecret** | **String**| Client Secret | [optional] |

### Return type

null (empty response body)

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

<a id="updateAgency"></a>
# **updateAgency**
> Agency updateAgency(xIBMClientId, authorization, did, updateAgency, xIBMClientSecret)

Update an agency in TARS

Update an agency in TARS

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AgencyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: clientIdHeader
    ApiKeyAuth clientIdHeader = (ApiKeyAuth) defaultClient.getAuthentication("clientIdHeader");
    clientIdHeader.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //clientIdHeader.setApiKeyPrefix("Token");

    AgencyApi apiInstance = new AgencyApi(defaultClient);
    String xIBMClientId = "xIBMClientId_example"; // String | Unique System Identifier
    String authorization = "authorization_example"; // String | Authentication Token
    String did = "did_example"; // String | Agency UID
    Agency updateAgency = new Agency(); // Agency | 
    String xIBMClientSecret = "xIBMClientSecret_example"; // String | Client Secret
    try {
      Agency result = apiInstance.updateAgency(xIBMClientId, authorization, did, updateAgency, xIBMClientSecret);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgencyApi#updateAgency");
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
| **updateAgency** | [**Agency**](Agency.md)|  | |
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

<a id="updateAgencyContacts"></a>
# **updateAgencyContacts**
> Contact updateAgencyContacts(xIBMClientId, authorization, did, xIBMClientSecret, requestBody)

Update agency details

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AgencyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: clientIdHeader
    ApiKeyAuth clientIdHeader = (ApiKeyAuth) defaultClient.getAuthentication("clientIdHeader");
    clientIdHeader.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //clientIdHeader.setApiKeyPrefix("Token");

    AgencyApi apiInstance = new AgencyApi(defaultClient);
    String xIBMClientId = "xIBMClientId_example"; // String | Unique System Identifier
    String authorization = "authorization_example"; // String | Authentication Token
    String did = "did_example"; // String | Agency UID
    String xIBMClientSecret = "xIBMClientSecret_example"; // String | Client Secret
    Contact requestBody = new Contact(); // Contact | 
    try {
      Contact result = apiInstance.updateAgencyContacts(xIBMClientId, authorization, did, xIBMClientSecret, requestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgencyApi#updateAgencyContacts");
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
| **requestBody** | [**Contact**](Contact.md)|  | [optional] |

### Return type

[**Contact**](Contact.md)

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

<a id="updateAgencySyncByDid"></a>
# **updateAgencySyncByDid**
> AgencyWithDetails updateAgencySyncByDid(xIBMClientId, authorization, did, xIBMClientSecret)

Update agency details by sync

Update agency details by sync

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AgencyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: clientIdHeader
    ApiKeyAuth clientIdHeader = (ApiKeyAuth) defaultClient.getAuthentication("clientIdHeader");
    clientIdHeader.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //clientIdHeader.setApiKeyPrefix("Token");

    AgencyApi apiInstance = new AgencyApi(defaultClient);
    String xIBMClientId = "xIBMClientId_example"; // String | Unique System Identifier
    String authorization = "authorization_example"; // String | Authentication Token
    String did = "did_example"; // String | Agency ID
    String xIBMClientSecret = "xIBMClientSecret_example"; // String | Client Secret
    try {
      AgencyWithDetails result = apiInstance.updateAgencySyncByDid(xIBMClientId, authorization, did, xIBMClientSecret);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgencyApi#updateAgencySyncByDid");
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
| **did** | **String**| Agency ID | |
| **xIBMClientSecret** | **String**| Client Secret | [optional] |

### Return type

[**AgencyWithDetails**](AgencyWithDetails.md)

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

<a id="updateSimStatus"></a>
# **updateSimStatus**
> SimCardResponse updateSimStatus(xIBMClientId, authorization, xIBMClientSecret, requestBody)

Update newly created/existing organizations sim card received status

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AgencyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: clientIdHeader
    ApiKeyAuth clientIdHeader = (ApiKeyAuth) defaultClient.getAuthentication("clientIdHeader");
    clientIdHeader.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //clientIdHeader.setApiKeyPrefix("Token");

    AgencyApi apiInstance = new AgencyApi(defaultClient);
    String xIBMClientId = "xIBMClientId_example"; // String | Unique System Identifier
    String authorization = "authorization_example"; // String | Authentication Token
    String xIBMClientSecret = "xIBMClientSecret_example"; // String | Client Secret
    SimCard requestBody = new SimCard(); // SimCard | 
    try {
      SimCardResponse result = apiInstance.updateSimStatus(xIBMClientId, authorization, xIBMClientSecret, requestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgencyApi#updateSimStatus");
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
| **xIBMClientSecret** | **String**| Client Secret | [optional] |
| **requestBody** | [**SimCard**](SimCard.md)|  | [optional] |

### Return type

[**SimCardResponse**](SimCardResponse.md)

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

