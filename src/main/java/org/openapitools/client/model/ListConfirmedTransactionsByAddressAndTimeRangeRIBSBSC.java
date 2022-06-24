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
import org.openapitools.client.model.ListConfirmedTransactionsByAddressRIBSBSCGasPrice;

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
public class ListConfirmedTransactionsByAddressAndTimeRangeRIBSBSC {
  public static final String SERIALIZED_NAME_CONTRACT = "contract";
  @SerializedName(SERIALIZED_NAME_CONTRACT)
  private String contract;

  public static final String SERIALIZED_NAME_GAS_LIMIT = "gasLimit";
  @SerializedName(SERIALIZED_NAME_GAS_LIMIT)
  private String gasLimit;

  public static final String SERIALIZED_NAME_GAS_PRICE = "gasPrice";
  @SerializedName(SERIALIZED_NAME_GAS_PRICE)
  private ListConfirmedTransactionsByAddressRIBSBSCGasPrice gasPrice;

  public static final String SERIALIZED_NAME_GAS_USED = "gasUsed";
  @SerializedName(SERIALIZED_NAME_GAS_USED)
  private String gasUsed;

  public static final String SERIALIZED_NAME_INPUT_DATA = "inputData";
  @SerializedName(SERIALIZED_NAME_INPUT_DATA)
  private String inputData;

  public static final String SERIALIZED_NAME_NONCE = "nonce";
  @SerializedName(SERIALIZED_NAME_NONCE)
  private Integer nonce;

  public static final String SERIALIZED_NAME_TRANSACTION_STATUS = "transactionStatus";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_STATUS)
  private String transactionStatus;

  public ListConfirmedTransactionsByAddressAndTimeRangeRIBSBSC() { 
  }

  public ListConfirmedTransactionsByAddressAndTimeRangeRIBSBSC contract(String contract) {
    
    this.contract = contract;
    return this;
  }

   /**
   * Represents the specific transaction contract.
   * @return contract
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0x0000000000000000000000000000000000001000", value = "Represents the specific transaction contract.")

  public String getContract() {
    return contract;
  }


  public void setContract(String contract) {
    this.contract = contract;
  }


  public ListConfirmedTransactionsByAddressAndTimeRangeRIBSBSC gasLimit(String gasLimit) {
    
    this.gasLimit = gasLimit;
    return this;
  }

   /**
   * Represents the amount of gas used by this specific transaction alone.
   * @return gasLimit
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "21000", required = true, value = "Represents the amount of gas used by this specific transaction alone.")

  public String getGasLimit() {
    return gasLimit;
  }


  public void setGasLimit(String gasLimit) {
    this.gasLimit = gasLimit;
  }


  public ListConfirmedTransactionsByAddressAndTimeRangeRIBSBSC gasPrice(ListConfirmedTransactionsByAddressRIBSBSCGasPrice gasPrice) {
    
    this.gasPrice = gasPrice;
    return this;
  }

   /**
   * Get gasPrice
   * @return gasPrice
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public ListConfirmedTransactionsByAddressRIBSBSCGasPrice getGasPrice() {
    return gasPrice;
  }


  public void setGasPrice(ListConfirmedTransactionsByAddressRIBSBSCGasPrice gasPrice) {
    this.gasPrice = gasPrice;
  }


  public ListConfirmedTransactionsByAddressAndTimeRangeRIBSBSC gasUsed(String gasUsed) {
    
    this.gasUsed = gasUsed;
    return this;
  }

   /**
   * Represents the exact unit of gas that was used for the transaction.
   * @return gasUsed
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "21000", required = true, value = "Represents the exact unit of gas that was used for the transaction.")

  public String getGasUsed() {
    return gasUsed;
  }


  public void setGasUsed(String gasUsed) {
    this.gasUsed = gasUsed;
  }


  public ListConfirmedTransactionsByAddressAndTimeRangeRIBSBSC inputData(String inputData) {
    
    this.inputData = inputData;
    return this;
  }

   /**
   * Represents additional information that is required for the transaction.
   * @return inputData
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "0x", required = true, value = "Represents additional information that is required for the transaction.")

  public String getInputData() {
    return inputData;
  }


  public void setInputData(String inputData) {
    this.inputData = inputData;
  }


  public ListConfirmedTransactionsByAddressAndTimeRangeRIBSBSC nonce(Integer nonce) {
    
    this.nonce = nonce;
    return this;
  }

   /**
   * Represents the sequential running number for an address, starting from 0 for the first transaction. E.g., if the nonce of a transaction is 10, it would be the 11th transaction sent from the sender&#39;s address.
   * @return nonce
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "25341", required = true, value = "Represents the sequential running number for an address, starting from 0 for the first transaction. E.g., if the nonce of a transaction is 10, it would be the 11th transaction sent from the sender's address.")

  public Integer getNonce() {
    return nonce;
  }


  public void setNonce(Integer nonce) {
    this.nonce = nonce;
  }


  public ListConfirmedTransactionsByAddressAndTimeRangeRIBSBSC transactionStatus(String transactionStatus) {
    
    this.transactionStatus = transactionStatus;
    return this;
  }

   /**
   * String representation of the transaction status
   * @return transactionStatus
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "0x1", required = true, value = "String representation of the transaction status")

  public String getTransactionStatus() {
    return transactionStatus;
  }


  public void setTransactionStatus(String transactionStatus) {
    this.transactionStatus = transactionStatus;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListConfirmedTransactionsByAddressAndTimeRangeRIBSBSC listConfirmedTransactionsByAddressAndTimeRangeRIBSBSC = (ListConfirmedTransactionsByAddressAndTimeRangeRIBSBSC) o;
    return Objects.equals(this.contract, listConfirmedTransactionsByAddressAndTimeRangeRIBSBSC.contract) &&
        Objects.equals(this.gasLimit, listConfirmedTransactionsByAddressAndTimeRangeRIBSBSC.gasLimit) &&
        Objects.equals(this.gasPrice, listConfirmedTransactionsByAddressAndTimeRangeRIBSBSC.gasPrice) &&
        Objects.equals(this.gasUsed, listConfirmedTransactionsByAddressAndTimeRangeRIBSBSC.gasUsed) &&
        Objects.equals(this.inputData, listConfirmedTransactionsByAddressAndTimeRangeRIBSBSC.inputData) &&
        Objects.equals(this.nonce, listConfirmedTransactionsByAddressAndTimeRangeRIBSBSC.nonce) &&
        Objects.equals(this.transactionStatus, listConfirmedTransactionsByAddressAndTimeRangeRIBSBSC.transactionStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contract, gasLimit, gasPrice, gasUsed, inputData, nonce, transactionStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListConfirmedTransactionsByAddressAndTimeRangeRIBSBSC {\n");
    sb.append("    contract: ").append(toIndentedString(contract)).append("\n");
    sb.append("    gasLimit: ").append(toIndentedString(gasLimit)).append("\n");
    sb.append("    gasPrice: ").append(toIndentedString(gasPrice)).append("\n");
    sb.append("    gasUsed: ").append(toIndentedString(gasUsed)).append("\n");
    sb.append("    inputData: ").append(toIndentedString(inputData)).append("\n");
    sb.append("    nonce: ").append(toIndentedString(nonce)).append("\n");
    sb.append("    transactionStatus: ").append(toIndentedString(transactionStatus)).append("\n");
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
    openapiFields.add("contract");
    openapiFields.add("gasLimit");
    openapiFields.add("gasPrice");
    openapiFields.add("gasUsed");
    openapiFields.add("inputData");
    openapiFields.add("nonce");
    openapiFields.add("transactionStatus");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("gasLimit");
    openapiRequiredFields.add("gasPrice");
    openapiRequiredFields.add("gasUsed");
    openapiRequiredFields.add("inputData");
    openapiRequiredFields.add("nonce");
    openapiRequiredFields.add("transactionStatus");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ListConfirmedTransactionsByAddressAndTimeRangeRIBSBSC
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ListConfirmedTransactionsByAddressAndTimeRangeRIBSBSC.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ListConfirmedTransactionsByAddressAndTimeRangeRIBSBSC is not found in the empty JSON string", ListConfirmedTransactionsByAddressAndTimeRangeRIBSBSC.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ListConfirmedTransactionsByAddressAndTimeRangeRIBSBSC.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ListConfirmedTransactionsByAddressAndTimeRangeRIBSBSC` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ListConfirmedTransactionsByAddressAndTimeRangeRIBSBSC.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("contract") != null && !jsonObj.get("contract").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `contract` to be a primitive type in the JSON string but got `%s`", jsonObj.get("contract").toString()));
      }
      if (jsonObj.get("gasLimit") != null && !jsonObj.get("gasLimit").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gasLimit` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gasLimit").toString()));
      }
      // validate the optional field `gasPrice`
      if (jsonObj.getAsJsonObject("gasPrice") != null) {
        ListConfirmedTransactionsByAddressRIBSBSCGasPrice.validateJsonObject(jsonObj.getAsJsonObject("gasPrice"));
      }
      if (jsonObj.get("gasUsed") != null && !jsonObj.get("gasUsed").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gasUsed` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gasUsed").toString()));
      }
      if (jsonObj.get("inputData") != null && !jsonObj.get("inputData").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `inputData` to be a primitive type in the JSON string but got `%s`", jsonObj.get("inputData").toString()));
      }
      if (jsonObj.get("transactionStatus") != null && !jsonObj.get("transactionStatus").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `transactionStatus` to be a primitive type in the JSON string but got `%s`", jsonObj.get("transactionStatus").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ListConfirmedTransactionsByAddressAndTimeRangeRIBSBSC.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ListConfirmedTransactionsByAddressAndTimeRangeRIBSBSC' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ListConfirmedTransactionsByAddressAndTimeRangeRIBSBSC> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ListConfirmedTransactionsByAddressAndTimeRangeRIBSBSC.class));

       return (TypeAdapter<T>) new TypeAdapter<ListConfirmedTransactionsByAddressAndTimeRangeRIBSBSC>() {
           @Override
           public void write(JsonWriter out, ListConfirmedTransactionsByAddressAndTimeRangeRIBSBSC value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ListConfirmedTransactionsByAddressAndTimeRangeRIBSBSC read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ListConfirmedTransactionsByAddressAndTimeRangeRIBSBSC given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ListConfirmedTransactionsByAddressAndTimeRangeRIBSBSC
  * @throws IOException if the JSON string is invalid with respect to ListConfirmedTransactionsByAddressAndTimeRangeRIBSBSC
  */
  public static ListConfirmedTransactionsByAddressAndTimeRangeRIBSBSC fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListConfirmedTransactionsByAddressAndTimeRangeRIBSBSC.class);
  }

 /**
  * Convert an instance of ListConfirmedTransactionsByAddressAndTimeRangeRIBSBSC to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

