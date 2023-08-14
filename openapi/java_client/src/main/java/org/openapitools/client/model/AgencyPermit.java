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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.LanguageMapper;

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
 * Permit issued by RTA
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-07T11:28:29.734525700+05:30[Asia/Calcutta]")
public class AgencyPermit {
  public static final String SERIALIZED_NAME_PERMIT_NO = "permitNo";
  @SerializedName(SERIALIZED_NAME_PERMIT_NO)
  private String permitNo;

  public static final String SERIALIZED_NAME_REFERENCE = "reference";
  @SerializedName(SERIALIZED_NAME_REFERENCE)
  private String reference;

  public static final String SERIALIZED_NAME_ISSUED_DATE = "issuedDate";
  @SerializedName(SERIALIZED_NAME_ISSUED_DATE)
  private OffsetDateTime issuedDate;

  public static final String SERIALIZED_NAME_EXPIRY_DATE = "expiryDate";
  @SerializedName(SERIALIZED_NAME_EXPIRY_DATE)
  private OffsetDateTime expiryDate;

  public static final String SERIALIZED_NAME_AUTHORITY_NAME = "authorityName";
  @SerializedName(SERIALIZED_NAME_AUTHORITY_NAME)
  private LanguageMapper authorityName;

  public static final String SERIALIZED_NAME_OWNERS = "owners";
  @SerializedName(SERIALIZED_NAME_OWNERS)
  private List<String> owners;

  public static final String SERIALIZED_NAME_MANAGERS = "managers";
  @SerializedName(SERIALIZED_NAME_MANAGERS)
  private List<String> managers;

  public AgencyPermit() {
  }

  public AgencyPermit permitNo(String permitNo) {
    
    this.permitNo = permitNo;
    return this;
  }

   /**
   * Permit Number of the Agency issued by RTA
   * @return permitNo
  **/
  @javax.annotation.Nullable
  public String getPermitNo() {
    return permitNo;
  }


  public void setPermitNo(String permitNo) {
    this.permitNo = permitNo;
  }


  public AgencyPermit reference(String reference) {
    
    this.reference = reference;
    return this;
  }

   /**
   * Traffic Number related to the permit
   * @return reference
  **/
  @javax.annotation.Nullable
  public String getReference() {
    return reference;
  }


  public void setReference(String reference) {
    this.reference = reference;
  }


  public AgencyPermit issuedDate(OffsetDateTime issuedDate) {
    
    this.issuedDate = issuedDate;
    return this;
  }

   /**
   * Permit Issued Date
   * @return issuedDate
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getIssuedDate() {
    return issuedDate;
  }


  public void setIssuedDate(OffsetDateTime issuedDate) {
    this.issuedDate = issuedDate;
  }


  public AgencyPermit expiryDate(OffsetDateTime expiryDate) {
    
    this.expiryDate = expiryDate;
    return this;
  }

   /**
   * Permit Expiry Date
   * @return expiryDate
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getExpiryDate() {
    return expiryDate;
  }


  public void setExpiryDate(OffsetDateTime expiryDate) {
    this.expiryDate = expiryDate;
  }


  public AgencyPermit authorityName(LanguageMapper authorityName) {
    
    this.authorityName = authorityName;
    return this;
  }

   /**
   * Get authorityName
   * @return authorityName
  **/
  @javax.annotation.Nullable
  public LanguageMapper getAuthorityName() {
    return authorityName;
  }


  public void setAuthorityName(LanguageMapper authorityName) {
    this.authorityName = authorityName;
  }


  public AgencyPermit owners(List<String> owners) {
    
    this.owners = owners;
    return this;
  }

  public AgencyPermit addOwnersItem(String ownersItem) {
    if (this.owners == null) {
      this.owners = new ArrayList<>();
    }
    this.owners.add(ownersItem);
    return this;
  }

   /**
   * List of Permit Owners
   * @return owners
  **/
  @javax.annotation.Nullable
  public List<String> getOwners() {
    return owners;
  }


  public void setOwners(List<String> owners) {
    this.owners = owners;
  }


  public AgencyPermit managers(List<String> managers) {
    
    this.managers = managers;
    return this;
  }

  public AgencyPermit addManagersItem(String managersItem) {
    if (this.managers == null) {
      this.managers = new ArrayList<>();
    }
    this.managers.add(managersItem);
    return this;
  }

   /**
   * List of Permit Managers
   * @return managers
  **/
  @javax.annotation.Nullable
  public List<String> getManagers() {
    return managers;
  }


  public void setManagers(List<String> managers) {
    this.managers = managers;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgencyPermit agencyPermit = (AgencyPermit) o;
    return Objects.equals(this.permitNo, agencyPermit.permitNo) &&
        Objects.equals(this.reference, agencyPermit.reference) &&
        Objects.equals(this.issuedDate, agencyPermit.issuedDate) &&
        Objects.equals(this.expiryDate, agencyPermit.expiryDate) &&
        Objects.equals(this.authorityName, agencyPermit.authorityName) &&
        Objects.equals(this.owners, agencyPermit.owners) &&
        Objects.equals(this.managers, agencyPermit.managers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(permitNo, reference, issuedDate, expiryDate, authorityName, owners, managers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgencyPermit {\n");
    sb.append("    permitNo: ").append(toIndentedString(permitNo)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    issuedDate: ").append(toIndentedString(issuedDate)).append("\n");
    sb.append("    expiryDate: ").append(toIndentedString(expiryDate)).append("\n");
    sb.append("    authorityName: ").append(toIndentedString(authorityName)).append("\n");
    sb.append("    owners: ").append(toIndentedString(owners)).append("\n");
    sb.append("    managers: ").append(toIndentedString(managers)).append("\n");
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
    openapiFields.add("permitNo");
    openapiFields.add("reference");
    openapiFields.add("issuedDate");
    openapiFields.add("expiryDate");
    openapiFields.add("authorityName");
    openapiFields.add("owners");
    openapiFields.add("managers");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AgencyPermit
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AgencyPermit.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AgencyPermit is not found in the empty JSON string", AgencyPermit.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AgencyPermit.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AgencyPermit` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("permitNo") != null && !jsonObj.get("permitNo").isJsonNull()) && !jsonObj.get("permitNo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `permitNo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("permitNo").toString()));
      }
      if ((jsonObj.get("reference") != null && !jsonObj.get("reference").isJsonNull()) && !jsonObj.get("reference").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reference` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reference").toString()));
      }
      // validate the optional field `authorityName`
      if (jsonObj.get("authorityName") != null && !jsonObj.get("authorityName").isJsonNull()) {
        LanguageMapper.validateJsonObject(jsonObj.getAsJsonObject("authorityName"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("owners") != null && !jsonObj.get("owners").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `owners` to be an array in the JSON string but got `%s`", jsonObj.get("owners").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("managers") != null && !jsonObj.get("managers").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `managers` to be an array in the JSON string but got `%s`", jsonObj.get("managers").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AgencyPermit.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AgencyPermit' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AgencyPermit> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AgencyPermit.class));

       return (TypeAdapter<T>) new TypeAdapter<AgencyPermit>() {
           @Override
           public void write(JsonWriter out, AgencyPermit value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AgencyPermit read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AgencyPermit given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AgencyPermit
  * @throws IOException if the JSON string is invalid with respect to AgencyPermit
  */
  public static AgencyPermit fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AgencyPermit.class);
  }

 /**
  * Convert an instance of AgencyPermit to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

