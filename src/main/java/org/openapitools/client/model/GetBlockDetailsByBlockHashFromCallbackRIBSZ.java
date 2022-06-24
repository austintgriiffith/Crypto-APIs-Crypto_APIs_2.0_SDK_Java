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
import java.util.ArrayList;
import java.util.List;

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
 * Zilliqa
 */
@ApiModel(description = "Zilliqa")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-24T14:43:47.118671Z[Etc/UTC]")
public class GetBlockDetailsByBlockHashFromCallbackRIBSZ {
  public static final String SERIALIZED_NAME_DIFFICULTY = "difficulty";
  @SerializedName(SERIALIZED_NAME_DIFFICULTY)
  private String difficulty;

  public static final String SERIALIZED_NAME_DS_BLOCK = "dsBlock";
  @SerializedName(SERIALIZED_NAME_DS_BLOCK)
  private Integer dsBlock;

  public static final String SERIALIZED_NAME_DS_DIFFICULTY = "dsDifficulty";
  @SerializedName(SERIALIZED_NAME_DS_DIFFICULTY)
  private String dsDifficulty;

  public static final String SERIALIZED_NAME_DS_LEADER = "dsLeader";
  @SerializedName(SERIALIZED_NAME_DS_LEADER)
  private String dsLeader;

  public static final String SERIALIZED_NAME_GAS_LIMIT = "gasLimit";
  @SerializedName(SERIALIZED_NAME_GAS_LIMIT)
  private Integer gasLimit;

  public static final String SERIALIZED_NAME_GAS_USED = "gasUsed";
  @SerializedName(SERIALIZED_NAME_GAS_USED)
  private Integer gasUsed;

  public static final String SERIALIZED_NAME_MICRO_BLOCKS = "microBlocks";
  @SerializedName(SERIALIZED_NAME_MICRO_BLOCKS)
  private List<String> microBlocks = new ArrayList<>();

  public GetBlockDetailsByBlockHashFromCallbackRIBSZ() { 
  }

  public GetBlockDetailsByBlockHashFromCallbackRIBSZ difficulty(String difficulty) {
    
    this.difficulty = difficulty;
    return this;
  }

   /**
   * Defines how difficult it is for a specific miner to mine the block.
   * @return difficulty
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "41.375", required = true, value = "Defines how difficult it is for a specific miner to mine the block.")

  public String getDifficulty() {
    return difficulty;
  }


  public void setDifficulty(String difficulty) {
    this.difficulty = difficulty;
  }


  public GetBlockDetailsByBlockHashFromCallbackRIBSZ dsBlock(Integer dsBlock) {
    
    this.dsBlock = dsBlock;
    return this;
  }

   /**
   * Represents the Directory Service block which contains metadata about the miners who participate in the consensus protocol.
   * @return dsBlock
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "12443", required = true, value = "Represents the Directory Service block which contains metadata about the miners who participate in the consensus protocol.")

  public Integer getDsBlock() {
    return dsBlock;
  }


  public void setDsBlock(Integer dsBlock) {
    this.dsBlock = dsBlock;
  }


  public GetBlockDetailsByBlockHashFromCallbackRIBSZ dsDifficulty(String dsDifficulty) {
    
    this.dsDifficulty = dsDifficulty;
    return this;
  }

   /**
   * Defines how difficult it is to mine the dsBlocks.
   * @return dsDifficulty
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "48.625", required = true, value = "Defines how difficult it is to mine the dsBlocks.")

  public String getDsDifficulty() {
    return dsDifficulty;
  }


  public void setDsDifficulty(String dsDifficulty) {
    this.dsDifficulty = dsDifficulty;
  }


  public GetBlockDetailsByBlockHashFromCallbackRIBSZ dsLeader(String dsLeader) {
    
    this.dsLeader = dsLeader;
    return this;
  }

   /**
   * Represents a part of the DS Committee which leads the consensus protocol for the epoch.
   * @return dsLeader
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "zil1k9hne0uu86wuj2n7qdqwhrm9uma0xn7ut42tsj", required = true, value = "Represents a part of the DS Committee which leads the consensus protocol for the epoch.")

  public String getDsLeader() {
    return dsLeader;
  }


  public void setDsLeader(String dsLeader) {
    this.dsLeader = dsLeader;
  }


  public GetBlockDetailsByBlockHashFromCallbackRIBSZ gasLimit(Integer gasLimit) {
    
    this.gasLimit = gasLimit;
    return this;
  }

   /**
   * Represents the maximum amount of gas allowed in the block in order to determine how many transactions it can fit.
   * @return gasLimit
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "550000", required = true, value = "Represents the maximum amount of gas allowed in the block in order to determine how many transactions it can fit.")

  public Integer getGasLimit() {
    return gasLimit;
  }


  public void setGasLimit(Integer gasLimit) {
    this.gasLimit = gasLimit;
  }


  public GetBlockDetailsByBlockHashFromCallbackRIBSZ gasUsed(Integer gasUsed) {
    
    this.gasUsed = gasUsed;
    return this;
  }

   /**
   * Defines how much of the gas for the block has been used.
   * @return gasUsed
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "10028", required = true, value = "Defines how much of the gas for the block has been used.")

  public Integer getGasUsed() {
    return gasUsed;
  }


  public void setGasUsed(Integer gasUsed) {
    this.gasUsed = gasUsed;
  }


  public GetBlockDetailsByBlockHashFromCallbackRIBSZ microBlocks(List<String> microBlocks) {
    
    this.microBlocks = microBlocks;
    return this;
  }

  public GetBlockDetailsByBlockHashFromCallbackRIBSZ addMicroBlocksItem(String microBlocksItem) {
    this.microBlocks.add(microBlocksItem);
    return this;
  }

   /**
   * Get microBlocks
   * @return microBlocks
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<String> getMicroBlocks() {
    return microBlocks;
  }


  public void setMicroBlocks(List<String> microBlocks) {
    this.microBlocks = microBlocks;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetBlockDetailsByBlockHashFromCallbackRIBSZ getBlockDetailsByBlockHashFromCallbackRIBSZ = (GetBlockDetailsByBlockHashFromCallbackRIBSZ) o;
    return Objects.equals(this.difficulty, getBlockDetailsByBlockHashFromCallbackRIBSZ.difficulty) &&
        Objects.equals(this.dsBlock, getBlockDetailsByBlockHashFromCallbackRIBSZ.dsBlock) &&
        Objects.equals(this.dsDifficulty, getBlockDetailsByBlockHashFromCallbackRIBSZ.dsDifficulty) &&
        Objects.equals(this.dsLeader, getBlockDetailsByBlockHashFromCallbackRIBSZ.dsLeader) &&
        Objects.equals(this.gasLimit, getBlockDetailsByBlockHashFromCallbackRIBSZ.gasLimit) &&
        Objects.equals(this.gasUsed, getBlockDetailsByBlockHashFromCallbackRIBSZ.gasUsed) &&
        Objects.equals(this.microBlocks, getBlockDetailsByBlockHashFromCallbackRIBSZ.microBlocks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(difficulty, dsBlock, dsDifficulty, dsLeader, gasLimit, gasUsed, microBlocks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetBlockDetailsByBlockHashFromCallbackRIBSZ {\n");
    sb.append("    difficulty: ").append(toIndentedString(difficulty)).append("\n");
    sb.append("    dsBlock: ").append(toIndentedString(dsBlock)).append("\n");
    sb.append("    dsDifficulty: ").append(toIndentedString(dsDifficulty)).append("\n");
    sb.append("    dsLeader: ").append(toIndentedString(dsLeader)).append("\n");
    sb.append("    gasLimit: ").append(toIndentedString(gasLimit)).append("\n");
    sb.append("    gasUsed: ").append(toIndentedString(gasUsed)).append("\n");
    sb.append("    microBlocks: ").append(toIndentedString(microBlocks)).append("\n");
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
    openapiFields.add("difficulty");
    openapiFields.add("dsBlock");
    openapiFields.add("dsDifficulty");
    openapiFields.add("dsLeader");
    openapiFields.add("gasLimit");
    openapiFields.add("gasUsed");
    openapiFields.add("microBlocks");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("difficulty");
    openapiRequiredFields.add("dsBlock");
    openapiRequiredFields.add("dsDifficulty");
    openapiRequiredFields.add("dsLeader");
    openapiRequiredFields.add("gasLimit");
    openapiRequiredFields.add("gasUsed");
    openapiRequiredFields.add("microBlocks");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GetBlockDetailsByBlockHashFromCallbackRIBSZ
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (GetBlockDetailsByBlockHashFromCallbackRIBSZ.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetBlockDetailsByBlockHashFromCallbackRIBSZ is not found in the empty JSON string", GetBlockDetailsByBlockHashFromCallbackRIBSZ.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GetBlockDetailsByBlockHashFromCallbackRIBSZ.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetBlockDetailsByBlockHashFromCallbackRIBSZ` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GetBlockDetailsByBlockHashFromCallbackRIBSZ.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("difficulty") != null && !jsonObj.get("difficulty").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `difficulty` to be a primitive type in the JSON string but got `%s`", jsonObj.get("difficulty").toString()));
      }
      if (jsonObj.get("dsDifficulty") != null && !jsonObj.get("dsDifficulty").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dsDifficulty` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dsDifficulty").toString()));
      }
      if (jsonObj.get("dsLeader") != null && !jsonObj.get("dsLeader").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dsLeader` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dsLeader").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("microBlocks") != null && !jsonObj.get("microBlocks").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `microBlocks` to be an array in the JSON string but got `%s`", jsonObj.get("microBlocks").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetBlockDetailsByBlockHashFromCallbackRIBSZ.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetBlockDetailsByBlockHashFromCallbackRIBSZ' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetBlockDetailsByBlockHashFromCallbackRIBSZ> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetBlockDetailsByBlockHashFromCallbackRIBSZ.class));

       return (TypeAdapter<T>) new TypeAdapter<GetBlockDetailsByBlockHashFromCallbackRIBSZ>() {
           @Override
           public void write(JsonWriter out, GetBlockDetailsByBlockHashFromCallbackRIBSZ value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetBlockDetailsByBlockHashFromCallbackRIBSZ read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetBlockDetailsByBlockHashFromCallbackRIBSZ given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetBlockDetailsByBlockHashFromCallbackRIBSZ
  * @throws IOException if the JSON string is invalid with respect to GetBlockDetailsByBlockHashFromCallbackRIBSZ
  */
  public static GetBlockDetailsByBlockHashFromCallbackRIBSZ fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetBlockDetailsByBlockHashFromCallbackRIBSZ.class);
  }

 /**
  * Convert an instance of GetBlockDetailsByBlockHashFromCallbackRIBSZ to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

