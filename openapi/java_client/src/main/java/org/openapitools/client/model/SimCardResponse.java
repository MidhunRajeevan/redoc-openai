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


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * SimCardResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-07T11:28:29.734525700+05:30[Asia/Calcutta]")
public class SimCardResponse {
  public static final String SERIALIZED_NAME_STATUS_CODE = "statusCode";
  @SerializedName(SERIALIZED_NAME_STATUS_CODE)
  private String statusCode;

  public static final String SERIALIZED_NAME_STATUS_TYPE = "statusType";
  @SerializedName(SERIALIZED_NAME_STATUS_TYPE)
  private String statusType;

  public static final String SERIALIZED_NAME_STATUS_DETAILS = "statusDetails";
  @SerializedName(SERIALIZED_NAME_STATUS_DETAILS)
  private String statusDetails;

  public SimCardResponse() {
  }

  public SimCardResponse statusCode(String statusCode) {
    
    this.statusCode = statusCode;
    return this;
  }

   /**
   * Status Code
   * @return statusCode
  **/
  @javax.annotation.Nullable
  public String getStatusCode() {
    return statusCode;
  }


  public void setStatusCode(String statusCode) {
    this.statusCode = statusCode;
  }


  public SimCardResponse statusType(String statusType) {
    
    this.statusType = statusType;
    return this;
  }

   /**
   * Status Type
   * @return statusType
  **/
  @javax.annotation.Nullable
  public String getStatusType() {
    return statusType;
  }


  public void setStatusType(String statusType) {
    this.statusType = statusType;
  }


  public SimCardResponse statusDetails(String statusDetails) {
    
    this.statusDetails = statusDetails;
    return this;
  }

   /**
   * Status Details
   * @return statusDetails
  **/
  @javax.annotation.Nullable
  public String getStatusDetails() {
    return statusDetails;
  }


  public void setStatusDetails(String statusDetails) {
    this.statusDetails = statusDetails;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SimCardResponse simCardResponse = (SimCardResponse) o;
    return Objects.equals(this.statusCode, simCardResponse.statusCode) &&
        Objects.equals(this.statusType, simCardResponse.statusType) &&
        Objects.equals(this.statusDetails, simCardResponse.statusDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statusCode, statusType, statusDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SimCardResponse {\n");
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
    sb.append("    statusType: ").append(toIndentedString(statusType)).append("\n");
    sb.append("    statusDetails: ").append(toIndentedString(statusDetails)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("statusCode");
    openapiFields.add("statusType");
    openapiFields.add("statusDetails");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SimCardResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!SimCardResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SimCardResponse is not found in the empty JSON string", SimCardResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SimCardResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SimCardResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("statusCode") != null && !jsonObj.get("statusCode").isJsonNull()) && !jsonObj.get("statusCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `statusCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("statusCode").toString()));
      }
      if ((jsonObj.get("statusType") != null && !jsonObj.get("statusType").isJsonNull()) && !jsonObj.get("statusType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `statusType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("statusType").toString()));
      }
      if ((jsonObj.get("statusDetails") != null && !jsonObj.get("statusDetails").isJsonNull()) && !jsonObj.get("statusDetails").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `statusDetails` to be a primitive type in the JSON string but got `%s`", jsonObj.get("statusDetails").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SimCardResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SimCardResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SimCardResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SimCardResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<SimCardResponse>() {
           @Override
           public void write(JsonWriter out, SimCardResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SimCardResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SimCardResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SimCardResponse
  * @throws IOException if the JSON string is invalid with respect to SimCardResponse
  */
  public static SimCardResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SimCardResponse.class);
  }

 /**
  * Convert an instance of SimCardResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
