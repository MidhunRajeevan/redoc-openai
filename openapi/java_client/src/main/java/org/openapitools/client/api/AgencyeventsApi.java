/*
 * Agency
 * Manage Agency Information 
 *
 * The version of the OpenAPI document: 0.0.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiCallback;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;
import org.openapitools.client.ProgressRequestBody;
import org.openapitools.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import org.openapitools.client.model.Error;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class AgencyeventsApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AgencyeventsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AgencyeventsApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for archiveAgency
     * @param xIBMClientId Unique System Identifier (required)
     * @param authorization Authentication Token (required)
     * @param did Agency UID (required)
     * @param xIBMClientSecret Client Secret (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> UnAuthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 405 </td><td> Method Not Allowed </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call archiveAgencyCall(String xIBMClientId, String authorization, String did, String xIBMClientSecret, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/agencies/{did}/events/archive"
            .replace("{" + "did" + "}", localVarApiClient.escapeString(did.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (xIBMClientId != null) {
            localVarHeaderParams.put("X-IBM-Client-Id", localVarApiClient.parameterToString(xIBMClientId));
        }

        if (authorization != null) {
            localVarHeaderParams.put("Authorization", localVarApiClient.parameterToString(authorization));
        }

        if (xIBMClientSecret != null) {
            localVarHeaderParams.put("X-IBM-Client-Secret", localVarApiClient.parameterToString(xIBMClientSecret));
        }

        final String[] localVarAccepts = {
            "*/*"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "clientIdHeader" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call archiveAgencyValidateBeforeCall(String xIBMClientId, String authorization, String did, String xIBMClientSecret, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'xIBMClientId' is set
        if (xIBMClientId == null) {
            throw new ApiException("Missing the required parameter 'xIBMClientId' when calling archiveAgency(Async)");
        }

        // verify the required parameter 'authorization' is set
        if (authorization == null) {
            throw new ApiException("Missing the required parameter 'authorization' when calling archiveAgency(Async)");
        }

        // verify the required parameter 'did' is set
        if (did == null) {
            throw new ApiException("Missing the required parameter 'did' when calling archiveAgency(Async)");
        }

        return archiveAgencyCall(xIBMClientId, authorization, did, xIBMClientSecret, _callback);

    }

    /**
     * Archive an agency in TARS
     * Archive an agency in TARS
     * @param xIBMClientId Unique System Identifier (required)
     * @param authorization Authentication Token (required)
     * @param did Agency UID (required)
     * @param xIBMClientSecret Client Secret (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> UnAuthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 405 </td><td> Method Not Allowed </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
     </table>
     */
    public void archiveAgency(String xIBMClientId, String authorization, String did, String xIBMClientSecret) throws ApiException {
        archiveAgencyWithHttpInfo(xIBMClientId, authorization, did, xIBMClientSecret);
    }

    /**
     * Archive an agency in TARS
     * Archive an agency in TARS
     * @param xIBMClientId Unique System Identifier (required)
     * @param authorization Authentication Token (required)
     * @param did Agency UID (required)
     * @param xIBMClientSecret Client Secret (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> UnAuthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 405 </td><td> Method Not Allowed </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> archiveAgencyWithHttpInfo(String xIBMClientId, String authorization, String did, String xIBMClientSecret) throws ApiException {
        okhttp3.Call localVarCall = archiveAgencyValidateBeforeCall(xIBMClientId, authorization, did, xIBMClientSecret, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Archive an agency in TARS (asynchronously)
     * Archive an agency in TARS
     * @param xIBMClientId Unique System Identifier (required)
     * @param authorization Authentication Token (required)
     * @param did Agency UID (required)
     * @param xIBMClientSecret Client Secret (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> UnAuthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 405 </td><td> Method Not Allowed </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call archiveAgencyAsync(String xIBMClientId, String authorization, String did, String xIBMClientSecret, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = archiveAgencyValidateBeforeCall(xIBMClientId, authorization, did, xIBMClientSecret, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for closeAgency
     * @param xIBMClientId Unique System Identifier (required)
     * @param authorization Authentication Token (required)
     * @param did Agency UID (required)
     * @param xIBMClientSecret Client Secret (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> UnAuthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 405 </td><td> Method Not Allowed </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call closeAgencyCall(String xIBMClientId, String authorization, String did, String xIBMClientSecret, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/agencies/{did}/events/close"
            .replace("{" + "did" + "}", localVarApiClient.escapeString(did.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (xIBMClientId != null) {
            localVarHeaderParams.put("X-IBM-Client-Id", localVarApiClient.parameterToString(xIBMClientId));
        }

        if (authorization != null) {
            localVarHeaderParams.put("Authorization", localVarApiClient.parameterToString(authorization));
        }

        if (xIBMClientSecret != null) {
            localVarHeaderParams.put("X-IBM-Client-Secret", localVarApiClient.parameterToString(xIBMClientSecret));
        }

        final String[] localVarAccepts = {
            "*/*"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "clientIdHeader" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call closeAgencyValidateBeforeCall(String xIBMClientId, String authorization, String did, String xIBMClientSecret, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'xIBMClientId' is set
        if (xIBMClientId == null) {
            throw new ApiException("Missing the required parameter 'xIBMClientId' when calling closeAgency(Async)");
        }

        // verify the required parameter 'authorization' is set
        if (authorization == null) {
            throw new ApiException("Missing the required parameter 'authorization' when calling closeAgency(Async)");
        }

        // verify the required parameter 'did' is set
        if (did == null) {
            throw new ApiException("Missing the required parameter 'did' when calling closeAgency(Async)");
        }

        return closeAgencyCall(xIBMClientId, authorization, did, xIBMClientSecret, _callback);

    }

    /**
     * Close an agency in TARS
     * Close an agency in TARS
     * @param xIBMClientId Unique System Identifier (required)
     * @param authorization Authentication Token (required)
     * @param did Agency UID (required)
     * @param xIBMClientSecret Client Secret (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> UnAuthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 405 </td><td> Method Not Allowed </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
     </table>
     */
    public void closeAgency(String xIBMClientId, String authorization, String did, String xIBMClientSecret) throws ApiException {
        closeAgencyWithHttpInfo(xIBMClientId, authorization, did, xIBMClientSecret);
    }

    /**
     * Close an agency in TARS
     * Close an agency in TARS
     * @param xIBMClientId Unique System Identifier (required)
     * @param authorization Authentication Token (required)
     * @param did Agency UID (required)
     * @param xIBMClientSecret Client Secret (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> UnAuthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 405 </td><td> Method Not Allowed </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> closeAgencyWithHttpInfo(String xIBMClientId, String authorization, String did, String xIBMClientSecret) throws ApiException {
        okhttp3.Call localVarCall = closeAgencyValidateBeforeCall(xIBMClientId, authorization, did, xIBMClientSecret, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Close an agency in TARS (asynchronously)
     * Close an agency in TARS
     * @param xIBMClientId Unique System Identifier (required)
     * @param authorization Authentication Token (required)
     * @param did Agency UID (required)
     * @param xIBMClientSecret Client Secret (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> UnAuthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 405 </td><td> Method Not Allowed </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call closeAgencyAsync(String xIBMClientId, String authorization, String did, String xIBMClientSecret, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = closeAgencyValidateBeforeCall(xIBMClientId, authorization, did, xIBMClientSecret, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for unarchiveAgency
     * @param xIBMClientId Unique System Identifier (required)
     * @param authorization Authentication Token (required)
     * @param did Agency UID (required)
     * @param xIBMClientSecret Client Secret (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> UnAuthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 405 </td><td> Method Not Allowed </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call unarchiveAgencyCall(String xIBMClientId, String authorization, String did, String xIBMClientSecret, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/agencies/{did}/events/unarchive"
            .replace("{" + "did" + "}", localVarApiClient.escapeString(did.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (xIBMClientId != null) {
            localVarHeaderParams.put("X-IBM-Client-Id", localVarApiClient.parameterToString(xIBMClientId));
        }

        if (authorization != null) {
            localVarHeaderParams.put("Authorization", localVarApiClient.parameterToString(authorization));
        }

        if (xIBMClientSecret != null) {
            localVarHeaderParams.put("X-IBM-Client-Secret", localVarApiClient.parameterToString(xIBMClientSecret));
        }

        final String[] localVarAccepts = {
            "*/*"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "clientIdHeader" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call unarchiveAgencyValidateBeforeCall(String xIBMClientId, String authorization, String did, String xIBMClientSecret, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'xIBMClientId' is set
        if (xIBMClientId == null) {
            throw new ApiException("Missing the required parameter 'xIBMClientId' when calling unarchiveAgency(Async)");
        }

        // verify the required parameter 'authorization' is set
        if (authorization == null) {
            throw new ApiException("Missing the required parameter 'authorization' when calling unarchiveAgency(Async)");
        }

        // verify the required parameter 'did' is set
        if (did == null) {
            throw new ApiException("Missing the required parameter 'did' when calling unarchiveAgency(Async)");
        }

        return unarchiveAgencyCall(xIBMClientId, authorization, did, xIBMClientSecret, _callback);

    }

    /**
     * Unarchive an agency in TARS
     * Unarchive an agency in TARS
     * @param xIBMClientId Unique System Identifier (required)
     * @param authorization Authentication Token (required)
     * @param did Agency UID (required)
     * @param xIBMClientSecret Client Secret (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> UnAuthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 405 </td><td> Method Not Allowed </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
     </table>
     */
    public void unarchiveAgency(String xIBMClientId, String authorization, String did, String xIBMClientSecret) throws ApiException {
        unarchiveAgencyWithHttpInfo(xIBMClientId, authorization, did, xIBMClientSecret);
    }

    /**
     * Unarchive an agency in TARS
     * Unarchive an agency in TARS
     * @param xIBMClientId Unique System Identifier (required)
     * @param authorization Authentication Token (required)
     * @param did Agency UID (required)
     * @param xIBMClientSecret Client Secret (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> UnAuthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 405 </td><td> Method Not Allowed </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> unarchiveAgencyWithHttpInfo(String xIBMClientId, String authorization, String did, String xIBMClientSecret) throws ApiException {
        okhttp3.Call localVarCall = unarchiveAgencyValidateBeforeCall(xIBMClientId, authorization, did, xIBMClientSecret, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Unarchive an agency in TARS (asynchronously)
     * Unarchive an agency in TARS
     * @param xIBMClientId Unique System Identifier (required)
     * @param authorization Authentication Token (required)
     * @param did Agency UID (required)
     * @param xIBMClientSecret Client Secret (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> UnAuthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 405 </td><td> Method Not Allowed </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call unarchiveAgencyAsync(String xIBMClientId, String authorization, String did, String xIBMClientSecret, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = unarchiveAgencyValidateBeforeCall(xIBMClientId, authorization, did, xIBMClientSecret, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
}
