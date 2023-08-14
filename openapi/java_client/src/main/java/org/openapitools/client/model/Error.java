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
 * Error
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-07T11:28:29.734525700+05:30[Asia/Calcutta]")
public class Error {
  public static final String SERIALIZED_NAME_HTTP_CODE = "httpCode";
  @SerializedName(SERIALIZED_NAME_HTTP_CODE)
  private String httpCode;

  public static final String SERIALIZED_NAME_HTTP_MESSAGE = "httpMessage";
  @SerializedName(SERIALIZED_NAME_HTTP_MESSAGE)
  private String httpMessage;

  public static final String SERIALIZED_NAME_MORE_INFORMATION = "moreInformation";
  @SerializedName(SERIALIZED_NAME_MORE_INFORMATION)
  private String moreInformation;

  public Error() {
  }

  public Error httpCode(String httpCode) {
    
    this.httpCode = httpCode;
    return this;
  }

   /**
   * Error code
   * @return httpCode
  **/
  @javax.annotation.Nullable
  public String getHttpCode() {
    return httpCode;
  }


  public void setHttpCode(String httpCode) {
    this.httpCode = httpCode;
  }


  public Error httpMessage(String httpMessage) {
    
    this.httpMessage = httpMessage;
    return this;
  }

   /**
   * Error description
   * @return httpMessage
  **/
  @javax.annotation.Nullable
  public String getHttpMessage() {
    return httpMessage;
  }


  public void setHttpMessage(String httpMessage) {
    this.httpMessage = httpMessage;
  }


  public Error moreInformation(String moreInformation) {
    
    this.moreInformation = moreInformation;
    return this;
  }

   /**
   * Detailed error description
   * @return moreInformation
  **/
  @javax.annotation.Nullable
  public String getMoreInformation() {
    return moreInformation;
  }


  public void setMoreInformation(String moreInformation) {
    this.moreInformation = moreInformation;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Error error = (Error) o;
    return Objects.equals(this.httpCode, error.httpCode) &&
        Objects.equals(this.httpMessage, error.httpMessage) &&
        Objects.equals(this.moreInformation, error.moreInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(httpCode, httpMessage, moreInformation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Error {\n");
    sb.append("    httpCode: ").append(toIndentedString(httpCode)).append("\n");
    sb.append("    httpMessage: ").append(toIndentedString(httpMessage)).append("\n");
    sb.append("    moreInformation: ").append(toIndentedString(moreInformation)).append("\n");
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
    openapiFields.add("httpCode");
    openapiFields.add("httpMessage");
    openapiFields.add("moreInformation");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Error
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Error.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Error is not found in the empty JSON string", Error.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Error.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Error` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("httpCode") != null && !jsonObj.get("httpCode").isJsonNull()) && !jsonObj.get("httpCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `httpCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("httpCode").toString()));
      }
      if ((jsonObj.get("httpMessage") != null && !jsonObj.get("httpMessage").isJsonNull()) && !jsonObj.get("httpMessage").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `httpMessage` to be a primitive type in the JSON string but got `%s`", jsonObj.get("httpMessage").toString()));
      }
      if ((jsonObj.get("moreInformation") != null && !jsonObj.get("moreInformation").isJsonNull()) && !jsonObj.get("moreInformation").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `moreInformation` to be a primitive type in the JSON string but got `%s`", jsonObj.get("moreInformation").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Error.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Error' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Error> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Error.class));

       return (TypeAdapter<T>) new TypeAdapter<Error>() {
           @Override
           public void write(JsonWriter out, Error value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Error read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Error given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Error
  * @throws IOException if the JSON string is invalid with respect to Error
  */
  public static Error fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Error.class);
  }

 /**
  * Convert an instance of Error to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
