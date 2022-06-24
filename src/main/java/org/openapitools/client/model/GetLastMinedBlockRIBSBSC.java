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
 * Binance Smart Chain
 */
@ApiModel(description = "Binance Smart Chain")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-24T14:43:47.118671Z[Etc/UTC]")
public class GetLastMinedBlockRIBSBSC {
  public static final String SERIALIZED_NAME_DIFFICULTY = "difficulty";
  @SerializedName(SERIALIZED_NAME_DIFFICULTY)
  private String difficulty;

  public static final String SERIALIZED_NAME_NONCE = "nonce";
  @SerializedName(SERIALIZED_NAME_NONCE)
  private String nonce;

  public static final String SERIALIZED_NAME_SIZE = "size";
  @SerializedName(SERIALIZED_NAME_SIZE)
  private Integer size;

  public static final String SERIALIZED_NAME_EXTRA_DATA = "extraData";
  @SerializedName(SERIALIZED_NAME_EXTRA_DATA)
  private String extraData;

  public static final String SERIALIZED_NAME_GAS_LIMIT = "gasLimit";
  @SerializedName(SERIALIZED_NAME_GAS_LIMIT)
  private String gasLimit;

  public static final String SERIALIZED_NAME_GAS_USED = "gasUsed";
  @SerializedName(SERIALIZED_NAME_GAS_USED)
  private String gasUsed;

  public static final String SERIALIZED_NAME_MINED_IN_SECONDS = "minedInSeconds";
  @SerializedName(SERIALIZED_NAME_MINED_IN_SECONDS)
  private Integer minedInSeconds;

  public static final String SERIALIZED_NAME_SHA3_UNCLES = "sha3Uncles";
  @SerializedName(SERIALIZED_NAME_SHA3_UNCLES)
  private String sha3Uncles;

  public static final String SERIALIZED_NAME_TOTAL_DIFFICULTY = "totalDifficulty";
  @SerializedName(SERIALIZED_NAME_TOTAL_DIFFICULTY)
  private String totalDifficulty;

  public static final String SERIALIZED_NAME_UNCLES = "uncles";
  @SerializedName(SERIALIZED_NAME_UNCLES)
  private List<String> uncles = new ArrayList<>();

  public GetLastMinedBlockRIBSBSC() { 
  }

  public GetLastMinedBlockRIBSBSC difficulty(String difficulty) {
    
    this.difficulty = difficulty;
    return this;
  }

   /**
   * Represents a mathematical value of how hard it is to find a valid hash for this block.
   * @return difficulty
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "21448277761059.71", required = true, value = "Represents a mathematical value of how hard it is to find a valid hash for this block.")

  public String getDifficulty() {
    return difficulty;
  }


  public void setDifficulty(String difficulty) {
    this.difficulty = difficulty;
  }


  public GetLastMinedBlockRIBSBSC nonce(String nonce) {
    
    this.nonce = nonce;
    return this;
  }

   /**
   * Represents a random value that can be adjusted to satisfy the proof of work
   * @return nonce
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2113101077", required = true, value = "Represents a random value that can be adjusted to satisfy the proof of work")

  public String getNonce() {
    return nonce;
  }


  public void setNonce(String nonce) {
    this.nonce = nonce;
  }


  public GetLastMinedBlockRIBSBSC size(Integer size) {
    
    this.size = size;
    return this;
  }

   /**
   * Represents the total size of the block in Bytes.
   * @return size
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1408113", required = true, value = "Represents the total size of the block in Bytes.")

  public Integer getSize() {
    return size;
  }


  public void setSize(Integer size) {
    this.size = size;
  }


  public GetLastMinedBlockRIBSBSC extraData(String extraData) {
    
    this.extraData = extraData;
    return this;
  }

   /**
   * Represents any data that can be included by the miner in the block.
   * @return extraData
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "0xd883010001846765746888676f312e31342e34856c696e757800000000000000eb8c4ee17a97af3c7d18e6cfb87d25bf9a483933d393b4fce778c9a7d64eab76471a8ab92c3a7d131c0f9cfbbd9a54b438c80b491c7a579da0e37db6ca823eda01", required = true, value = "Represents any data that can be included by the miner in the block.")

  public String getExtraData() {
    return extraData;
  }


  public void setExtraData(String extraData) {
    this.extraData = extraData;
  }


  public GetLastMinedBlockRIBSBSC gasLimit(String gasLimit) {
    
    this.gasLimit = gasLimit;
    return this;
  }

   /**
   * Defines the total gas limit of all transactions in the block.
   * @return gasLimit
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "30000000", required = true, value = "Defines the total gas limit of all transactions in the block.")

  public String getGasLimit() {
    return gasLimit;
  }


  public void setGasLimit(String gasLimit) {
    this.gasLimit = gasLimit;
  }


  public GetLastMinedBlockRIBSBSC gasUsed(String gasUsed) {
    
    this.gasUsed = gasUsed;
    return this;
  }

   /**
   * Represents the total amount of gas used by all transactions in this block.
   * @return gasUsed
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "686304", required = true, value = "Represents the total amount of gas used by all transactions in this block.")

  public String getGasUsed() {
    return gasUsed;
  }


  public void setGasUsed(String gasUsed) {
    this.gasUsed = gasUsed;
  }


  public GetLastMinedBlockRIBSBSC minedInSeconds(Integer minedInSeconds) {
    
    this.minedInSeconds = minedInSeconds;
    return this;
  }

   /**
   * Specifies the amount of time required for the block to be mined in second
   * @return minedInSeconds
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "3", required = true, value = "Specifies the amount of time required for the block to be mined in second")

  public Integer getMinedInSeconds() {
    return minedInSeconds;
  }


  public void setMinedInSeconds(Integer minedInSeconds) {
    this.minedInSeconds = minedInSeconds;
  }


  public GetLastMinedBlockRIBSBSC sha3Uncles(String sha3Uncles) {
    
    this.sha3Uncles = sha3Uncles;
    return this;
  }

   /**
   * Defines the combined hash of all uncles for a given parent.
   * @return sha3Uncles
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "0x1dcc4de8dec75d7aab85b567b6ccd41ad312451b948a7413f0a142fd40d49347", required = true, value = "Defines the combined hash of all uncles for a given parent.")

  public String getSha3Uncles() {
    return sha3Uncles;
  }


  public void setSha3Uncles(String sha3Uncles) {
    this.sha3Uncles = sha3Uncles;
  }


  public GetLastMinedBlockRIBSBSC totalDifficulty(String totalDifficulty) {
    
    this.totalDifficulty = totalDifficulty;
    return this;
  }

   /**
   * Defines the total difficulty of the chain until this block, i.e. how difficult it is for a specific miner to mine a new block
   * @return totalDifficulty
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2437536", required = true, value = "Defines the total difficulty of the chain until this block, i.e. how difficult it is for a specific miner to mine a new block")

  public String getTotalDifficulty() {
    return totalDifficulty;
  }


  public void setTotalDifficulty(String totalDifficulty) {
    this.totalDifficulty = totalDifficulty;
  }


  public GetLastMinedBlockRIBSBSC uncles(List<String> uncles) {
    
    this.uncles = uncles;
    return this;
  }

  public GetLastMinedBlockRIBSBSC addUnclesItem(String unclesItem) {
    this.uncles.add(unclesItem);
    return this;
  }

   /**
   * Get uncles
   * @return uncles
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<String> getUncles() {
    return uncles;
  }


  public void setUncles(List<String> uncles) {
    this.uncles = uncles;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetLastMinedBlockRIBSBSC getLastMinedBlockRIBSBSC = (GetLastMinedBlockRIBSBSC) o;
    return Objects.equals(this.difficulty, getLastMinedBlockRIBSBSC.difficulty) &&
        Objects.equals(this.nonce, getLastMinedBlockRIBSBSC.nonce) &&
        Objects.equals(this.size, getLastMinedBlockRIBSBSC.size) &&
        Objects.equals(this.extraData, getLastMinedBlockRIBSBSC.extraData) &&
        Objects.equals(this.gasLimit, getLastMinedBlockRIBSBSC.gasLimit) &&
        Objects.equals(this.gasUsed, getLastMinedBlockRIBSBSC.gasUsed) &&
        Objects.equals(this.minedInSeconds, getLastMinedBlockRIBSBSC.minedInSeconds) &&
        Objects.equals(this.sha3Uncles, getLastMinedBlockRIBSBSC.sha3Uncles) &&
        Objects.equals(this.totalDifficulty, getLastMinedBlockRIBSBSC.totalDifficulty) &&
        Objects.equals(this.uncles, getLastMinedBlockRIBSBSC.uncles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(difficulty, nonce, size, extraData, gasLimit, gasUsed, minedInSeconds, sha3Uncles, totalDifficulty, uncles);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetLastMinedBlockRIBSBSC {\n");
    sb.append("    difficulty: ").append(toIndentedString(difficulty)).append("\n");
    sb.append("    nonce: ").append(toIndentedString(nonce)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    extraData: ").append(toIndentedString(extraData)).append("\n");
    sb.append("    gasLimit: ").append(toIndentedString(gasLimit)).append("\n");
    sb.append("    gasUsed: ").append(toIndentedString(gasUsed)).append("\n");
    sb.append("    minedInSeconds: ").append(toIndentedString(minedInSeconds)).append("\n");
    sb.append("    sha3Uncles: ").append(toIndentedString(sha3Uncles)).append("\n");
    sb.append("    totalDifficulty: ").append(toIndentedString(totalDifficulty)).append("\n");
    sb.append("    uncles: ").append(toIndentedString(uncles)).append("\n");
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
    openapiFields.add("nonce");
    openapiFields.add("size");
    openapiFields.add("extraData");
    openapiFields.add("gasLimit");
    openapiFields.add("gasUsed");
    openapiFields.add("minedInSeconds");
    openapiFields.add("sha3Uncles");
    openapiFields.add("totalDifficulty");
    openapiFields.add("uncles");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("difficulty");
    openapiRequiredFields.add("nonce");
    openapiRequiredFields.add("size");
    openapiRequiredFields.add("extraData");
    openapiRequiredFields.add("gasLimit");
    openapiRequiredFields.add("gasUsed");
    openapiRequiredFields.add("minedInSeconds");
    openapiRequiredFields.add("sha3Uncles");
    openapiRequiredFields.add("totalDifficulty");
    openapiRequiredFields.add("uncles");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GetLastMinedBlockRIBSBSC
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (GetLastMinedBlockRIBSBSC.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetLastMinedBlockRIBSBSC is not found in the empty JSON string", GetLastMinedBlockRIBSBSC.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GetLastMinedBlockRIBSBSC.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetLastMinedBlockRIBSBSC` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GetLastMinedBlockRIBSBSC.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("difficulty") != null && !jsonObj.get("difficulty").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `difficulty` to be a primitive type in the JSON string but got `%s`", jsonObj.get("difficulty").toString()));
      }
      if (jsonObj.get("nonce") != null && !jsonObj.get("nonce").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nonce` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nonce").toString()));
      }
      if (jsonObj.get("extraData") != null && !jsonObj.get("extraData").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `extraData` to be a primitive type in the JSON string but got `%s`", jsonObj.get("extraData").toString()));
      }
      if (jsonObj.get("gasLimit") != null && !jsonObj.get("gasLimit").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gasLimit` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gasLimit").toString()));
      }
      if (jsonObj.get("gasUsed") != null && !jsonObj.get("gasUsed").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gasUsed` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gasUsed").toString()));
      }
      if (jsonObj.get("sha3Uncles") != null && !jsonObj.get("sha3Uncles").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sha3Uncles` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sha3Uncles").toString()));
      }
      if (jsonObj.get("totalDifficulty") != null && !jsonObj.get("totalDifficulty").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `totalDifficulty` to be a primitive type in the JSON string but got `%s`", jsonObj.get("totalDifficulty").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("uncles") != null && !jsonObj.get("uncles").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `uncles` to be an array in the JSON string but got `%s`", jsonObj.get("uncles").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetLastMinedBlockRIBSBSC.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetLastMinedBlockRIBSBSC' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetLastMinedBlockRIBSBSC> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetLastMinedBlockRIBSBSC.class));

       return (TypeAdapter<T>) new TypeAdapter<GetLastMinedBlockRIBSBSC>() {
           @Override
           public void write(JsonWriter out, GetLastMinedBlockRIBSBSC value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetLastMinedBlockRIBSBSC read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetLastMinedBlockRIBSBSC given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetLastMinedBlockRIBSBSC
  * @throws IOException if the JSON string is invalid with respect to GetLastMinedBlockRIBSBSC
  */
  public static GetLastMinedBlockRIBSBSC fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetLastMinedBlockRIBSBSC.class);
  }

 /**
  * Convert an instance of GetLastMinedBlockRIBSBSC to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

