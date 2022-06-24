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
import org.openapitools.client.model.DecodeRawTransactionHexRIS;

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
 * DecodeRawTransactionHexRI
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-24T14:43:47.118671Z[Etc/UTC]")
public class DecodeRawTransactionHexRI {
  public static final String SERIALIZED_NAME_BLOCKCHAIN_SPEFICIC_DATA = "blockchainSpeficicData";
  @SerializedName(SERIALIZED_NAME_BLOCKCHAIN_SPEFICIC_DATA)
  private DecodeRawTransactionHexRIS blockchainSpeficicData;

  public static final String SERIALIZED_NAME_SIZE = "size";
  @SerializedName(SERIALIZED_NAME_SIZE)
  private Integer size;

  public static final String SERIALIZED_NAME_TRANSACTION_ID = "transactionId";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_ID)
  private String transactionId;

  public DecodeRawTransactionHexRI() { 
  }

  public DecodeRawTransactionHexRI blockchainSpeficicData(DecodeRawTransactionHexRIS blockchainSpeficicData) {
    
    this.blockchainSpeficicData = blockchainSpeficicData;
    return this;
  }

   /**
   * Get blockchainSpeficicData
   * @return blockchainSpeficicData
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public DecodeRawTransactionHexRIS getBlockchainSpeficicData() {
    return blockchainSpeficicData;
  }


  public void setBlockchainSpeficicData(DecodeRawTransactionHexRIS blockchainSpeficicData) {
    this.blockchainSpeficicData = blockchainSpeficicData;
  }


  public DecodeRawTransactionHexRI size(Integer size) {
    
    this.size = size;
    return this;
  }

   /**
   * Represents the total size of this transaction.
   * @return size
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "248", required = true, value = "Represents the total size of this transaction.")

  public Integer getSize() {
    return size;
  }


  public void setSize(Integer size) {
    this.size = size;
  }


  public DecodeRawTransactionHexRI transactionId(String transactionId) {
    
    this.transactionId = transactionId;
    return this;
  }

   /**
   * Represents the decoded transaction hex.
   * @return transactionId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "00a8a090a7c78f64e4626e6720b305edd95fcd7865b5b45864a88070a8079cea", required = true, value = "Represents the decoded transaction hex.")

  public String getTransactionId() {
    return transactionId;
  }


  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DecodeRawTransactionHexRI decodeRawTransactionHexRI = (DecodeRawTransactionHexRI) o;
    return Objects.equals(this.blockchainSpeficicData, decodeRawTransactionHexRI.blockchainSpeficicData) &&
        Objects.equals(this.size, decodeRawTransactionHexRI.size) &&
        Objects.equals(this.transactionId, decodeRawTransactionHexRI.transactionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(blockchainSpeficicData, size, transactionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DecodeRawTransactionHexRI {\n");
    sb.append("    blockchainSpeficicData: ").append(toIndentedString(blockchainSpeficicData)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
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
    openapiFields.add("blockchainSpeficicData");
    openapiFields.add("size");
    openapiFields.add("transactionId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("blockchainSpeficicData");
    openapiRequiredFields.add("size");
    openapiRequiredFields.add("transactionId");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DecodeRawTransactionHexRI
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (DecodeRawTransactionHexRI.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in DecodeRawTransactionHexRI is not found in the empty JSON string", DecodeRawTransactionHexRI.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!DecodeRawTransactionHexRI.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DecodeRawTransactionHexRI` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : DecodeRawTransactionHexRI.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field `blockchainSpeficicData`
      if (jsonObj.getAsJsonObject("blockchainSpeficicData") != null) {
        DecodeRawTransactionHexRIS.validateJsonObject(jsonObj.getAsJsonObject("blockchainSpeficicData"));
      }
      if (jsonObj.get("transactionId") != null && !jsonObj.get("transactionId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `transactionId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("transactionId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DecodeRawTransactionHexRI.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DecodeRawTransactionHexRI' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DecodeRawTransactionHexRI> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DecodeRawTransactionHexRI.class));

       return (TypeAdapter<T>) new TypeAdapter<DecodeRawTransactionHexRI>() {
           @Override
           public void write(JsonWriter out, DecodeRawTransactionHexRI value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DecodeRawTransactionHexRI read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DecodeRawTransactionHexRI given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DecodeRawTransactionHexRI
  * @throws IOException if the JSON string is invalid with respect to DecodeRawTransactionHexRI
  */
  public static DecodeRawTransactionHexRI fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DecodeRawTransactionHexRI.class);
  }

 /**
  * Convert an instance of DecodeRawTransactionHexRI to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

