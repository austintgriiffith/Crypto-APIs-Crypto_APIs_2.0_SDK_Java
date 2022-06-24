/*
 * CryptoAPIs
 * Crypto APIs 2.0 is a complex and innovative infrastructure layer that radically simplifies the development of any Blockchain and Crypto related applications. Organized around REST, Crypto APIs 2.0 can assist both novice Bitcoin/Ethereum enthusiasts and crypto experts with the development of their blockchain applications. Crypto APIs 2.0 provides unified endpoints and data, raw data, automatic tokens and coins forwardings, callback functionalities, and much more.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: developers@cryptoapis.io
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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import io.cryptoapis.sdk.JSON;

/**
 * DecodeXAddressRI
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-24T14:43:47.118671Z[Etc/UTC]")
public class DecodeXAddressRI {
  public static final String SERIALIZED_NAME_ADDRESS_TAG = "addressTag";
  @SerializedName(SERIALIZED_NAME_ADDRESS_TAG)
  private Integer addressTag;

  public static final String SERIALIZED_NAME_CLASSIC_ADDRESS = "classicAddress";
  @SerializedName(SERIALIZED_NAME_CLASSIC_ADDRESS)
  private String classicAddress;

  public DecodeXAddressRI() { 
  }

  public DecodeXAddressRI addressTag(Integer addressTag) {
    
    this.addressTag = addressTag;
    return this;
  }

   /**
   * Defines a specific Tag that is an additional XRP address feature. It helps identifying a transaction recipient beyond a wallet address.
   * @return addressTag
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "3999472835", required = true, value = "Defines a specific Tag that is an additional XRP address feature. It helps identifying a transaction recipient beyond a wallet address.")

  public Integer getAddressTag() {
    return addressTag;
  }


  public void setAddressTag(Integer addressTag) {
    this.addressTag = addressTag;
  }


  public DecodeXAddressRI classicAddress(String classicAddress) {
    
    this.classicAddress = classicAddress;
    return this;
  }

   /**
   * Represents the public address, which is a compressed and shortened form of a public key.
   * @return classicAddress
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "rA9bXGJcXvZKaWofrRphdJsBWzhyCfH3z", required = true, value = "Represents the public address, which is a compressed and shortened form of a public key.")

  public String getClassicAddress() {
    return classicAddress;
  }


  public void setClassicAddress(String classicAddress) {
    this.classicAddress = classicAddress;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DecodeXAddressRI decodeXAddressRI = (DecodeXAddressRI) o;
    return Objects.equals(this.addressTag, decodeXAddressRI.addressTag) &&
        Objects.equals(this.classicAddress, decodeXAddressRI.classicAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressTag, classicAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DecodeXAddressRI {\n");
    sb.append("    addressTag: ").append(toIndentedString(addressTag)).append("\n");
    sb.append("    classicAddress: ").append(toIndentedString(classicAddress)).append("\n");
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
    openapiFields.add("addressTag");
    openapiFields.add("classicAddress");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("addressTag");
    openapiRequiredFields.add("classicAddress");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DecodeXAddressRI
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (DecodeXAddressRI.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in DecodeXAddressRI is not found in the empty JSON string", DecodeXAddressRI.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!DecodeXAddressRI.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DecodeXAddressRI` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : DecodeXAddressRI.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("classicAddress") != null && !jsonObj.get("classicAddress").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `classicAddress` to be a primitive type in the JSON string but got `%s`", jsonObj.get("classicAddress").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DecodeXAddressRI.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DecodeXAddressRI' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DecodeXAddressRI> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DecodeXAddressRI.class));

       return (TypeAdapter<T>) new TypeAdapter<DecodeXAddressRI>() {
           @Override
           public void write(JsonWriter out, DecodeXAddressRI value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DecodeXAddressRI read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DecodeXAddressRI given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DecodeXAddressRI
  * @throws IOException if the JSON string is invalid with respect to DecodeXAddressRI
  */
  public static DecodeXAddressRI fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DecodeXAddressRI.class);
  }

 /**
  * Convert an instance of DecodeXAddressRI to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

