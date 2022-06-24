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
import org.openapitools.client.model.GetXRPRippleBlockDetailsByBlockHashRITotalCoins;
import org.openapitools.client.model.GetXRPRippleBlockDetailsByBlockHeightRITotalFees;

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
 * GetXRPRippleBlockDetailsByBlockHashRI
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-24T14:43:47.118671Z[Etc/UTC]")
public class GetXRPRippleBlockDetailsByBlockHashRI {
  public static final String SERIALIZED_NAME_BLOCK_HASH = "blockHash";
  @SerializedName(SERIALIZED_NAME_BLOCK_HASH)
  private String blockHash;

  public static final String SERIALIZED_NAME_BLOCK_HEIGHT = "blockHeight";
  @SerializedName(SERIALIZED_NAME_BLOCK_HEIGHT)
  private Integer blockHeight;

  public static final String SERIALIZED_NAME_NEXT_BLOCK_HASH = "nextBlockHash";
  @SerializedName(SERIALIZED_NAME_NEXT_BLOCK_HASH)
  private String nextBlockHash;

  public static final String SERIALIZED_NAME_PREVIOUS_BLOCK_HASH = "previousBlockHash";
  @SerializedName(SERIALIZED_NAME_PREVIOUS_BLOCK_HASH)
  private String previousBlockHash;

  public static final String SERIALIZED_NAME_TIMESTAMP = "timestamp";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP)
  private Integer timestamp;

  public static final String SERIALIZED_NAME_TOTAL_COINS = "totalCoins";
  @SerializedName(SERIALIZED_NAME_TOTAL_COINS)
  private GetXRPRippleBlockDetailsByBlockHashRITotalCoins totalCoins;

  public static final String SERIALIZED_NAME_TOTAL_FEES = "totalFees";
  @SerializedName(SERIALIZED_NAME_TOTAL_FEES)
  private GetXRPRippleBlockDetailsByBlockHeightRITotalFees totalFees;

  public static final String SERIALIZED_NAME_TRANSACTIONS_COUNT = "transactionsCount";
  @SerializedName(SERIALIZED_NAME_TRANSACTIONS_COUNT)
  private Integer transactionsCount;

  public GetXRPRippleBlockDetailsByBlockHashRI() { 
  }

  public GetXRPRippleBlockDetailsByBlockHashRI blockHash(String blockHash) {
    
    this.blockHash = blockHash;
    return this;
  }

   /**
   * Represents the hash of the block, which is its unique identifier. It represents a cryptographic digital fingerprint made by hashing the block header twice through the SHA256 algorithm.
   * @return blockHash
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1ab0614d2a438da8b23086cbceef7d443edbd295d9c7619fc8a19c7618bc22c9", required = true, value = "Represents the hash of the block, which is its unique identifier. It represents a cryptographic digital fingerprint made by hashing the block header twice through the SHA256 algorithm.")

  public String getBlockHash() {
    return blockHash;
  }


  public void setBlockHash(String blockHash) {
    this.blockHash = blockHash;
  }


  public GetXRPRippleBlockDetailsByBlockHashRI blockHeight(Integer blockHeight) {
    
    this.blockHeight = blockHeight;
    return this;
  }

   /**
   * Represents the number of blocks in the blockchain preceding this specific block. Block numbers have no gaps. A blockchain usually starts with block 0 called the \&quot;Genesis block\&quot;.
   * @return blockHeight
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "15886156", required = true, value = "Represents the number of blocks in the blockchain preceding this specific block. Block numbers have no gaps. A blockchain usually starts with block 0 called the \"Genesis block\".")

  public Integer getBlockHeight() {
    return blockHeight;
  }


  public void setBlockHeight(Integer blockHeight) {
    this.blockHeight = blockHeight;
  }


  public GetXRPRippleBlockDetailsByBlockHashRI nextBlockHash(String nextBlockHash) {
    
    this.nextBlockHash = nextBlockHash;
    return this;
  }

   /**
   * Represents the hash of the next block. When this is the last block of the blockchain this value will be an empty string.
   * @return nextBlockHash
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "738cf04b9e32826395a8445aa44ec6bbb83f2cc296d94201625f3a3d6ff85a5a", required = true, value = "Represents the hash of the next block. When this is the last block of the blockchain this value will be an empty string.")

  public String getNextBlockHash() {
    return nextBlockHash;
  }


  public void setNextBlockHash(String nextBlockHash) {
    this.nextBlockHash = nextBlockHash;
  }


  public GetXRPRippleBlockDetailsByBlockHashRI previousBlockHash(String previousBlockHash) {
    
    this.previousBlockHash = previousBlockHash;
    return this;
  }

   /**
   * Represents the hash of the previous block, also known as the parent block.
   * @return previousBlockHash
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "dcf6ade36e1d5f30b3e52605692ff47123f290f4c8915cbf5a6b7c3541f2354e", required = true, value = "Represents the hash of the previous block, also known as the parent block.")

  public String getPreviousBlockHash() {
    return previousBlockHash;
  }


  public void setPreviousBlockHash(String previousBlockHash) {
    this.previousBlockHash = previousBlockHash;
  }


  public GetXRPRippleBlockDetailsByBlockHashRI timestamp(Integer timestamp) {
    
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Defines the exact date/time when this block was mined in Unix Timestamp.
   * @return timestamp
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1616069434", required = true, value = "Defines the exact date/time when this block was mined in Unix Timestamp.")

  public Integer getTimestamp() {
    return timestamp;
  }


  public void setTimestamp(Integer timestamp) {
    this.timestamp = timestamp;
  }


  public GetXRPRippleBlockDetailsByBlockHashRI totalCoins(GetXRPRippleBlockDetailsByBlockHashRITotalCoins totalCoins) {
    
    this.totalCoins = totalCoins;
    return this;
  }

   /**
   * Get totalCoins
   * @return totalCoins
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public GetXRPRippleBlockDetailsByBlockHashRITotalCoins getTotalCoins() {
    return totalCoins;
  }


  public void setTotalCoins(GetXRPRippleBlockDetailsByBlockHashRITotalCoins totalCoins) {
    this.totalCoins = totalCoins;
  }


  public GetXRPRippleBlockDetailsByBlockHashRI totalFees(GetXRPRippleBlockDetailsByBlockHeightRITotalFees totalFees) {
    
    this.totalFees = totalFees;
    return this;
  }

   /**
   * Get totalFees
   * @return totalFees
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public GetXRPRippleBlockDetailsByBlockHeightRITotalFees getTotalFees() {
    return totalFees;
  }


  public void setTotalFees(GetXRPRippleBlockDetailsByBlockHeightRITotalFees totalFees) {
    this.totalFees = totalFees;
  }


  public GetXRPRippleBlockDetailsByBlockHashRI transactionsCount(Integer transactionsCount) {
    
    this.transactionsCount = transactionsCount;
    return this;
  }

   /**
   * Represents the total number of all transactions as part of this block.
   * @return transactionsCount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "0", required = true, value = "Represents the total number of all transactions as part of this block.")

  public Integer getTransactionsCount() {
    return transactionsCount;
  }


  public void setTransactionsCount(Integer transactionsCount) {
    this.transactionsCount = transactionsCount;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetXRPRippleBlockDetailsByBlockHashRI getXRPRippleBlockDetailsByBlockHashRI = (GetXRPRippleBlockDetailsByBlockHashRI) o;
    return Objects.equals(this.blockHash, getXRPRippleBlockDetailsByBlockHashRI.blockHash) &&
        Objects.equals(this.blockHeight, getXRPRippleBlockDetailsByBlockHashRI.blockHeight) &&
        Objects.equals(this.nextBlockHash, getXRPRippleBlockDetailsByBlockHashRI.nextBlockHash) &&
        Objects.equals(this.previousBlockHash, getXRPRippleBlockDetailsByBlockHashRI.previousBlockHash) &&
        Objects.equals(this.timestamp, getXRPRippleBlockDetailsByBlockHashRI.timestamp) &&
        Objects.equals(this.totalCoins, getXRPRippleBlockDetailsByBlockHashRI.totalCoins) &&
        Objects.equals(this.totalFees, getXRPRippleBlockDetailsByBlockHashRI.totalFees) &&
        Objects.equals(this.transactionsCount, getXRPRippleBlockDetailsByBlockHashRI.transactionsCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(blockHash, blockHeight, nextBlockHash, previousBlockHash, timestamp, totalCoins, totalFees, transactionsCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetXRPRippleBlockDetailsByBlockHashRI {\n");
    sb.append("    blockHash: ").append(toIndentedString(blockHash)).append("\n");
    sb.append("    blockHeight: ").append(toIndentedString(blockHeight)).append("\n");
    sb.append("    nextBlockHash: ").append(toIndentedString(nextBlockHash)).append("\n");
    sb.append("    previousBlockHash: ").append(toIndentedString(previousBlockHash)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    totalCoins: ").append(toIndentedString(totalCoins)).append("\n");
    sb.append("    totalFees: ").append(toIndentedString(totalFees)).append("\n");
    sb.append("    transactionsCount: ").append(toIndentedString(transactionsCount)).append("\n");
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
    openapiFields.add("blockHash");
    openapiFields.add("blockHeight");
    openapiFields.add("nextBlockHash");
    openapiFields.add("previousBlockHash");
    openapiFields.add("timestamp");
    openapiFields.add("totalCoins");
    openapiFields.add("totalFees");
    openapiFields.add("transactionsCount");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("blockHash");
    openapiRequiredFields.add("blockHeight");
    openapiRequiredFields.add("nextBlockHash");
    openapiRequiredFields.add("previousBlockHash");
    openapiRequiredFields.add("timestamp");
    openapiRequiredFields.add("totalCoins");
    openapiRequiredFields.add("totalFees");
    openapiRequiredFields.add("transactionsCount");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GetXRPRippleBlockDetailsByBlockHashRI
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (GetXRPRippleBlockDetailsByBlockHashRI.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetXRPRippleBlockDetailsByBlockHashRI is not found in the empty JSON string", GetXRPRippleBlockDetailsByBlockHashRI.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GetXRPRippleBlockDetailsByBlockHashRI.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetXRPRippleBlockDetailsByBlockHashRI` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GetXRPRippleBlockDetailsByBlockHashRI.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("blockHash") != null && !jsonObj.get("blockHash").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `blockHash` to be a primitive type in the JSON string but got `%s`", jsonObj.get("blockHash").toString()));
      }
      if (jsonObj.get("nextBlockHash") != null && !jsonObj.get("nextBlockHash").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nextBlockHash` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nextBlockHash").toString()));
      }
      if (jsonObj.get("previousBlockHash") != null && !jsonObj.get("previousBlockHash").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `previousBlockHash` to be a primitive type in the JSON string but got `%s`", jsonObj.get("previousBlockHash").toString()));
      }
      // validate the optional field `totalCoins`
      if (jsonObj.getAsJsonObject("totalCoins") != null) {
        GetXRPRippleBlockDetailsByBlockHashRITotalCoins.validateJsonObject(jsonObj.getAsJsonObject("totalCoins"));
      }
      // validate the optional field `totalFees`
      if (jsonObj.getAsJsonObject("totalFees") != null) {
        GetXRPRippleBlockDetailsByBlockHeightRITotalFees.validateJsonObject(jsonObj.getAsJsonObject("totalFees"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetXRPRippleBlockDetailsByBlockHashRI.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetXRPRippleBlockDetailsByBlockHashRI' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetXRPRippleBlockDetailsByBlockHashRI> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetXRPRippleBlockDetailsByBlockHashRI.class));

       return (TypeAdapter<T>) new TypeAdapter<GetXRPRippleBlockDetailsByBlockHashRI>() {
           @Override
           public void write(JsonWriter out, GetXRPRippleBlockDetailsByBlockHashRI value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetXRPRippleBlockDetailsByBlockHashRI read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetXRPRippleBlockDetailsByBlockHashRI given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetXRPRippleBlockDetailsByBlockHashRI
  * @throws IOException if the JSON string is invalid with respect to GetXRPRippleBlockDetailsByBlockHashRI
  */
  public static GetXRPRippleBlockDetailsByBlockHashRI fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetXRPRippleBlockDetailsByBlockHashRI.class);
  }

 /**
  * Convert an instance of GetXRPRippleBlockDetailsByBlockHashRI to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

