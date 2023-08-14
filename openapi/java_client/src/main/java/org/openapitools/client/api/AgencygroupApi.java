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


import org.openapitools.client.model.Agency;
import org.openapitools.client.model.AgencyHeader;
import org.openapitools.client.model.Error;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class AgencygroupApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AgencygroupApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AgencygroupApi(ApiClient apiClient) {
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
     * Build call for getBranch
     * @param xIBMClientId Unique System Identifier (required)
     * @param authorization Authentication Token (required)
     * @param agencyDid Agency UID (required)
     * @param branchDid Agency UID (required)
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
    public okhttp3.Call getBranchCall(String xIBMClientId, String authorization, String agencyDid, String branchDid, String xIBMClientSecret, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/agencies/{agencyDid}/branches/{branchDid}"
            .replace("{" + "agencyDid" + "}", localVarApiClient.escapeString(agencyDid.toString()))
            .replace("{" + "branchDid" + "}", localVarApiClient.escapeString(branchDid.toString()));

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
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getBranchValidateBeforeCall(String xIBMClientId, String authorization, String agencyDid, String branchDid, String xIBMClientSecret, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'xIBMClientId' is set
        if (xIBMClientId == null) {
            throw new ApiException("Missing the required parameter 'xIBMClientId' when calling getBranch(Async)");
        }

        // verify the required parameter 'authorization' is set
        if (authorization == null) {
            throw new ApiException("Missing the required parameter 'authorization' when calling getBranch(Async)");
        }

        // verify the required parameter 'agencyDid' is set
        if (agencyDid == null) {
            throw new ApiException("Missing the required parameter 'agencyDid' when calling getBranch(Async)");
        }

        // verify the required parameter 'branchDid' is set
        if (branchDid == null) {
            throw new ApiException("Missing the required parameter 'branchDid' when calling getBranch(Async)");
        }

        return getBranchCall(xIBMClientId, authorization, agencyDid, branchDid, xIBMClientSecret, _callback);

    }

    /**
     * Get a Branch by ID
     * Get a Branch by ID
     * @param xIBMClientId Unique System Identifier (required)
     * @param authorization Authentication Token (required)
     * @param agencyDid Agency UID (required)
     * @param branchDid Agency UID (required)
     * @param xIBMClientSecret Client Secret (optional)
     * @return Agency
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
    public Agency getBranch(String xIBMClientId, String authorization, String agencyDid, String branchDid, String xIBMClientSecret) throws ApiException {
        ApiResponse<Agency> localVarResp = getBranchWithHttpInfo(xIBMClientId, authorization, agencyDid, branchDid, xIBMClientSecret);
        return localVarResp.getData();
    }

    /**
     * Get a Branch by ID
     * Get a Branch by ID
     * @param xIBMClientId Unique System Identifier (required)
     * @param authorization Authentication Token (required)
     * @param agencyDid Agency UID (required)
     * @param branchDid Agency UID (required)
     * @param xIBMClientSecret Client Secret (optional)
     * @return ApiResponse&lt;Agency&gt;
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
    public ApiResponse<Agency> getBranchWithHttpInfo(String xIBMClientId, String authorization, String agencyDid, String branchDid, String xIBMClientSecret) throws ApiException {
        okhttp3.Call localVarCall = getBranchValidateBeforeCall(xIBMClientId, authorization, agencyDid, branchDid, xIBMClientSecret, null);
        Type localVarReturnType = new TypeToken<Agency>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get a Branch by ID (asynchronously)
     * Get a Branch by ID
     * @param xIBMClientId Unique System Identifier (required)
     * @param authorization Authentication Token (required)
     * @param agencyDid Agency UID (required)
     * @param branchDid Agency UID (required)
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
    public okhttp3.Call getBranchAsync(String xIBMClientId, String authorization, String agencyDid, String branchDid, String xIBMClientSecret, final ApiCallback<Agency> _callback) throws ApiException {

        okhttp3.Call localVarCall = getBranchValidateBeforeCall(xIBMClientId, authorization, agencyDid, branchDid, xIBMClientSecret, _callback);
        Type localVarReturnType = new TypeToken<Agency>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for listBranches
     * @param xIBMClientId Unique System Identifier (required)
     * @param authorization Authentication Token (required)
     * @param agencyDid Agency UID (required)
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
    public okhttp3.Call listBranchesCall(String xIBMClientId, String authorization, String agencyDid, String xIBMClientSecret, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/agencies/{agencyDid}/branches"
            .replace("{" + "agencyDid" + "}", localVarApiClient.escapeString(agencyDid.toString()));

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
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call listBranchesValidateBeforeCall(String xIBMClientId, String authorization, String agencyDid, String xIBMClientSecret, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'xIBMClientId' is set
        if (xIBMClientId == null) {
            throw new ApiException("Missing the required parameter 'xIBMClientId' when calling listBranches(Async)");
        }

        // verify the required parameter 'authorization' is set
        if (authorization == null) {
            throw new ApiException("Missing the required parameter 'authorization' when calling listBranches(Async)");
        }

        // verify the required parameter 'agencyDid' is set
        if (agencyDid == null) {
            throw new ApiException("Missing the required parameter 'agencyDid' when calling listBranches(Async)");
        }

        return listBranchesCall(xIBMClientId, authorization, agencyDid, xIBMClientSecret, _callback);

    }

    /**
     * Get a list of branches
     * Get a list of branches
     * @param xIBMClientId Unique System Identifier (required)
     * @param authorization Authentication Token (required)
     * @param agencyDid Agency UID (required)
     * @param xIBMClientSecret Client Secret (optional)
     * @return List&lt;AgencyHeader&gt;
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
    public List<AgencyHeader> listBranches(String xIBMClientId, String authorization, String agencyDid, String xIBMClientSecret) throws ApiException {
        ApiResponse<List<AgencyHeader>> localVarResp = listBranchesWithHttpInfo(xIBMClientId, authorization, agencyDid, xIBMClientSecret);
        return localVarResp.getData();
    }

    /**
     * Get a list of branches
     * Get a list of branches
     * @param xIBMClientId Unique System Identifier (required)
     * @param authorization Authentication Token (required)
     * @param agencyDid Agency UID (required)
     * @param xIBMClientSecret Client Secret (optional)
     * @return ApiResponse&lt;List&lt;AgencyHeader&gt;&gt;
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
    public ApiResponse<List<AgencyHeader>> listBranchesWithHttpInfo(String xIBMClientId, String authorization, String agencyDid, String xIBMClientSecret) throws ApiException {
        okhttp3.Call localVarCall = listBranchesValidateBeforeCall(xIBMClientId, authorization, agencyDid, xIBMClientSecret, null);
        Type localVarReturnType = new TypeToken<List<AgencyHeader>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get a list of branches (asynchronously)
     * Get a list of branches
     * @param xIBMClientId Unique System Identifier (required)
     * @param authorization Authentication Token (required)
     * @param agencyDid Agency UID (required)
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
    public okhttp3.Call listBranchesAsync(String xIBMClientId, String authorization, String agencyDid, String xIBMClientSecret, final ApiCallback<List<AgencyHeader>> _callback) throws ApiException {

        okhttp3.Call localVarCall = listBranchesValidateBeforeCall(xIBMClientId, authorization, agencyDid, xIBMClientSecret, _callback);
        Type localVarReturnType = new TypeToken<List<AgencyHeader>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
