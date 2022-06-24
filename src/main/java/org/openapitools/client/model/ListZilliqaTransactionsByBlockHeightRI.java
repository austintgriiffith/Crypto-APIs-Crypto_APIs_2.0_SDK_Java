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
import org.openapitools.client.model.GetZilliqaTransactionDetailsByTransactionIDRIFee;
import org.openapitools.client.model.ListZilliqaTransactionsByAddressRIRecipientsInner;
import org.openapitools.client.model.ListZilliqaTransactionsByAddressRISendersInner;

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
 * ListZilliqaTransactionsByBlockHeightRI
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-24T14:43:47.118671Z[Etc/UTC]")
public class ListZilliqaTransactionsByBlockHeightRI {
  public static final String SERIALIZED_NAME_FEE = "fee";
  @SerializedName(SERIALIZED_NAME_FEE)
  private GetZilliqaTransactionDetailsByTransactionIDRIFee fee;

  public static final String SERIALIZED_NAME_GAS_LIMIT = "gasLimit";
  @SerializedName(SERIALIZED_NAME_GAS_LIMIT)
  private Integer gasLimit;

  public static final String SERIALIZED_NAME_GAS_PRICE = "gasPrice";
  @SerializedName(SERIALIZED_NAME_GAS_PRICE)
  private Integer gasPrice;

  public static final String SERIALIZED_NAME_GAS_USED = "gasUsed";
  @SerializedName(SERIALIZED_NAME_GAS_USED)
  private Integer gasUsed;

  public static final String SERIALIZED_NAME_MINED_IN_BLOCK_HASH = "minedInBlockHash";
  @SerializedName(SERIALIZED_NAME_MINED_IN_BLOCK_HASH)
  private String minedInBlockHash;

  public static final String SERIALIZED_NAME_NONCE = "nonce";
  @SerializedName(SERIALIZED_NAME_NONCE)
  private Integer nonce;

  public static final String SERIALIZED_NAME_RECIPIENTS = "recipients";
  @SerializedName(SERIALIZED_NAME_RECIPIENTS)
  private List<ListZilliqaTransactionsByAddressRIRecipientsInner> recipients = new ArrayList<>();

  public static final String SERIALIZED_NAME_SENDERS = "senders";
  @SerializedName(SERIALIZED_NAME_SENDERS)
  private List<ListZilliqaTransactionsByAddressRISendersInner> senders = new ArrayList<>();

  public static final String SERIALIZED_NAME_TIMESTAMP = "timestamp";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP)
  private Integer timestamp;

  public static final String SERIALIZED_NAME_TRANSACTION_HASH = "transactionHash";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_HASH)
  private String transactionHash;

  public static final String SERIALIZED_NAME_TRANSACTION_INDEX = "transactionIndex";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_INDEX)
  private Integer transactionIndex;

  public static final String SERIALIZED_NAME_TRANSACTION_STATUS = "transactionStatus";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_STATUS)
  private String transactionStatus;

  public ListZilliqaTransactionsByBlockHeightRI() { 
  }

  public ListZilliqaTransactionsByBlockHeightRI fee(GetZilliqaTransactionDetailsByTransactionIDRIFee fee) {
    
    this.fee = fee;
    return this;
  }

   /**
   * Get fee
   * @return fee
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public GetZilliqaTransactionDetailsByTransactionIDRIFee getFee() {
    return fee;
  }


  public void setFee(GetZilliqaTransactionDetailsByTransactionIDRIFee fee) {
    this.fee = fee;
  }


  public ListZilliqaTransactionsByBlockHeightRI gasLimit(Integer gasLimit) {
    
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


  public ListZilliqaTransactionsByBlockHeightRI gasPrice(Integer gasPrice) {
    
    this.gasPrice = gasPrice;
    return this;
  }

   /**
   * Defines the price of the gas.
   * @return gasPrice
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2994782927", required = true, value = "Defines the price of the gas.")

  public Integer getGasPrice() {
    return gasPrice;
  }


  public void setGasPrice(Integer gasPrice) {
    this.gasPrice = gasPrice;
  }


  public ListZilliqaTransactionsByBlockHeightRI gasUsed(Integer gasUsed) {
    
    this.gasUsed = gasUsed;
    return this;
  }

   /**
   * Defines how much of the gas for the block has been used.
   * @return gasUsed
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "958", required = true, value = "Defines how much of the gas for the block has been used.")

  public Integer getGasUsed() {
    return gasUsed;
  }


  public void setGasUsed(Integer gasUsed) {
    this.gasUsed = gasUsed;
  }


  public ListZilliqaTransactionsByBlockHeightRI minedInBlockHash(String minedInBlockHash) {
    
    this.minedInBlockHash = minedInBlockHash;
    return this;
  }

   /**
   * Represents the hash of the block, which is its unique identifier. It represents a cryptographic digital fingerprint made by hashing the block header twice through the SHA256 algorithm.
   * @return minedInBlockHash
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "0x3160ca05ac12f60023de6b6987596eccbf084629f1a92b59534c5c021bf27041", required = true, value = "Represents the hash of the block, which is its unique identifier. It represents a cryptographic digital fingerprint made by hashing the block header twice through the SHA256 algorithm.")

  public String getMinedInBlockHash() {
    return minedInBlockHash;
  }


  public void setMinedInBlockHash(String minedInBlockHash) {
    this.minedInBlockHash = minedInBlockHash;
  }


  public ListZilliqaTransactionsByBlockHeightRI nonce(Integer nonce) {
    
    this.nonce = nonce;
    return this;
  }

   /**
   * Represents a random value that can be adjusted to satisfy the Proof of Work.
   * @return nonce
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "13", required = true, value = "Represents a random value that can be adjusted to satisfy the Proof of Work.")

  public Integer getNonce() {
    return nonce;
  }


  public void setNonce(Integer nonce) {
    this.nonce = nonce;
  }


  public ListZilliqaTransactionsByBlockHeightRI recipients(List<ListZilliqaTransactionsByAddressRIRecipientsInner> recipients) {
    
    this.recipients = recipients;
    return this;
  }

  public ListZilliqaTransactionsByBlockHeightRI addRecipientsItem(ListZilliqaTransactionsByAddressRIRecipientsInner recipientsItem) {
    this.recipients.add(recipientsItem);
    return this;
  }

   /**
   * Defines an object array of the transaction recipients.
   * @return recipients
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Defines an object array of the transaction recipients.")

  public List<ListZilliqaTransactionsByAddressRIRecipientsInner> getRecipients() {
    return recipients;
  }


  public void setRecipients(List<ListZilliqaTransactionsByAddressRIRecipientsInner> recipients) {
    this.recipients = recipients;
  }


  public ListZilliqaTransactionsByBlockHeightRI senders(List<ListZilliqaTransactionsByAddressRISendersInner> senders) {
    
    this.senders = senders;
    return this;
  }

  public ListZilliqaTransactionsByBlockHeightRI addSendersItem(ListZilliqaTransactionsByAddressRISendersInner sendersItem) {
    this.senders.add(sendersItem);
    return this;
  }

   /**
   * Represents an object of addresses that provide the funds.
   * @return senders
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Represents an object of addresses that provide the funds.")

  public List<ListZilliqaTransactionsByAddressRISendersInner> getSenders() {
    return senders;
  }


  public void setSenders(List<ListZilliqaTransactionsByAddressRISendersInner> senders) {
    this.senders = senders;
  }


  public ListZilliqaTransactionsByBlockHeightRI timestamp(Integer timestamp) {
    
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Defines the exact date/time when this block was mined in Unix Timestamp.
   * @return timestamp
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1582202940", required = true, value = "Defines the exact date/time when this block was mined in Unix Timestamp.")

  public Integer getTimestamp() {
    return timestamp;
  }


  public void setTimestamp(Integer timestamp) {
    this.timestamp = timestamp;
  }


  public ListZilliqaTransactionsByBlockHeightRI transactionHash(String transactionHash) {
    
    this.transactionHash = transactionHash;
    return this;
  }

   /**
   * Represents the hash of the transaction, which is its unique identifier.
   * @return transactionHash
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "0xf4a847a1489a043ee509d5d7df48f2bf7ba1b15354ed14600b035ff2f7670203", required = true, value = "Represents the hash of the transaction, which is its unique identifier.")

  public String getTransactionHash() {
    return transactionHash;
  }


  public void setTransactionHash(String transactionHash) {
    this.transactionHash = transactionHash;
  }


  public ListZilliqaTransactionsByBlockHeightRI transactionIndex(Integer transactionIndex) {
    
    this.transactionIndex = transactionIndex;
    return this;
  }

   /**
   * Defines the numeric representation of the transaction index.
   * @return transactionIndex
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "0", required = true, value = "Defines the numeric representation of the transaction index.")

  public Integer getTransactionIndex() {
    return transactionIndex;
  }


  public void setTransactionIndex(Integer transactionIndex) {
    this.transactionIndex = transactionIndex;
  }


  public ListZilliqaTransactionsByBlockHeightRI transactionStatus(String transactionStatus) {
    
    this.transactionStatus = transactionStatus;
    return this;
  }

   /**
   * Defines the status of the transaction, whether it is e.g. pending or complete.
   * @return transactionStatus
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "0", required = true, value = "Defines the status of the transaction, whether it is e.g. pending or complete.")

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
    ListZilliqaTransactionsByBlockHeightRI listZilliqaTransactionsByBlockHeightRI = (ListZilliqaTransactionsByBlockHeightRI) o;
    return Objects.equals(this.fee, listZilliqaTransactionsByBlockHeightRI.fee) &&
        Objects.equals(this.gasLimit, listZilliqaTransactionsByBlockHeightRI.gasLimit) &&
        Objects.equals(this.gasPrice, listZilliqaTransactionsByBlockHeightRI.gasPrice) &&
        Objects.equals(this.gasUsed, listZilliqaTransactionsByBlockHeightRI.gasUsed) &&
        Objects.equals(this.minedInBlockHash, listZilliqaTransactionsByBlockHeightRI.minedInBlockHash) &&
        Objects.equals(this.nonce, listZilliqaTransactionsByBlockHeightRI.nonce) &&
        Objects.equals(this.recipients, listZilliqaTransactionsByBlockHeightRI.recipients) &&
        Objects.equals(this.senders, listZilliqaTransactionsByBlockHeightRI.senders) &&
        Objects.equals(this.timestamp, listZilliqaTransactionsByBlockHeightRI.timestamp) &&
        Objects.equals(this.transactionHash, listZilliqaTransactionsByBlockHeightRI.transactionHash) &&
        Objects.equals(this.transactionIndex, listZilliqaTransactionsByBlockHeightRI.transactionIndex) &&
        Objects.equals(this.transactionStatus, listZilliqaTransactionsByBlockHeightRI.transactionStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fee, gasLimit, gasPrice, gasUsed, minedInBlockHash, nonce, recipients, senders, timestamp, transactionHash, transactionIndex, transactionStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListZilliqaTransactionsByBlockHeightRI {\n");
    sb.append("    fee: ").append(toIndentedString(fee)).append("\n");
    sb.append("    gasLimit: ").append(toIndentedString(gasLimit)).append("\n");
    sb.append("    gasPrice: ").append(toIndentedString(gasPrice)).append("\n");
    sb.append("    gasUsed: ").append(toIndentedString(gasUsed)).append("\n");
    sb.append("    minedInBlockHash: ").append(toIndentedString(minedInBlockHash)).append("\n");
    sb.append("    nonce: ").append(toIndentedString(nonce)).append("\n");
    sb.append("    recipients: ").append(toIndentedString(recipients)).append("\n");
    sb.append("    senders: ").append(toIndentedString(senders)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    transactionHash: ").append(toIndentedString(transactionHash)).append("\n");
    sb.append("    transactionIndex: ").append(toIndentedString(transactionIndex)).append("\n");
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
    openapiFields.add("fee");
    openapiFields.add("gasLimit");
    openapiFields.add("gasPrice");
    openapiFields.add("gasUsed");
    openapiFields.add("minedInBlockHash");
    openapiFields.add("nonce");
    openapiFields.add("recipients");
    openapiFields.add("senders");
    openapiFields.add("timestamp");
    openapiFields.add("transactionHash");
    openapiFields.add("transactionIndex");
    openapiFields.add("transactionStatus");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("fee");
    openapiRequiredFields.add("gasLimit");
    openapiRequiredFields.add("gasPrice");
    openapiRequiredFields.add("gasUsed");
    openapiRequiredFields.add("minedInBlockHash");
    openapiRequiredFields.add("nonce");
    openapiRequiredFields.add("recipients");
    openapiRequiredFields.add("senders");
    openapiRequiredFields.add("timestamp");
    openapiRequiredFields.add("transactionHash");
    openapiRequiredFields.add("transactionIndex");
    openapiRequiredFields.add("transactionStatus");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ListZilliqaTransactionsByBlockHeightRI
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ListZilliqaTransactionsByBlockHeightRI.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ListZilliqaTransactionsByBlockHeightRI is not found in the empty JSON string", ListZilliqaTransactionsByBlockHeightRI.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ListZilliqaTransactionsByBlockHeightRI.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ListZilliqaTransactionsByBlockHeightRI` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ListZilliqaTransactionsByBlockHeightRI.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field `fee`
      if (jsonObj.getAsJsonObject("fee") != null) {
        GetZilliqaTransactionDetailsByTransactionIDRIFee.validateJsonObject(jsonObj.getAsJsonObject("fee"));
      }
      if (jsonObj.get("minedInBlockHash") != null && !jsonObj.get("minedInBlockHash").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `minedInBlockHash` to be a primitive type in the JSON string but got `%s`", jsonObj.get("minedInBlockHash").toString()));
      }
      JsonArray jsonArrayrecipients = jsonObj.getAsJsonArray("recipients");
      if (jsonArrayrecipients != null) {
        // ensure the json data is an array
        if (!jsonObj.get("recipients").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `recipients` to be an array in the JSON string but got `%s`", jsonObj.get("recipients").toString()));
        }

        // validate the optional field `recipients` (array)
        for (int i = 0; i < jsonArrayrecipients.size(); i++) {
          ListZilliqaTransactionsByAddressRIRecipientsInner.validateJsonObject(jsonArrayrecipients.get(i).getAsJsonObject());
        };
      }
      JsonArray jsonArraysenders = jsonObj.getAsJsonArray("senders");
      if (jsonArraysenders != null) {
        // ensure the json data is an array
        if (!jsonObj.get("senders").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `senders` to be an array in the JSON string but got `%s`", jsonObj.get("senders").toString()));
        }

        // validate the optional field `senders` (array)
        for (int i = 0; i < jsonArraysenders.size(); i++) {
          ListZilliqaTransactionsByAddressRISendersInner.validateJsonObject(jsonArraysenders.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("transactionHash") != null && !jsonObj.get("transactionHash").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `transactionHash` to be a primitive type in the JSON string but got `%s`", jsonObj.get("transactionHash").toString()));
      }
      if (jsonObj.get("transactionStatus") != null && !jsonObj.get("transactionStatus").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `transactionStatus` to be a primitive type in the JSON string but got `%s`", jsonObj.get("transactionStatus").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ListZilliqaTransactionsByBlockHeightRI.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ListZilliqaTransactionsByBlockHeightRI' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ListZilliqaTransactionsByBlockHeightRI> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ListZilliqaTransactionsByBlockHeightRI.class));

       return (TypeAdapter<T>) new TypeAdapter<ListZilliqaTransactionsByBlockHeightRI>() {
           @Override
           public void write(JsonWriter out, ListZilliqaTransactionsByBlockHeightRI value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ListZilliqaTransactionsByBlockHeightRI read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ListZilliqaTransactionsByBlockHeightRI given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ListZilliqaTransactionsByBlockHeightRI
  * @throws IOException if the JSON string is invalid with respect to ListZilliqaTransactionsByBlockHeightRI
  */
  public static ListZilliqaTransactionsByBlockHeightRI fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListZilliqaTransactionsByBlockHeightRI.class);
  }

 /**
  * Convert an instance of ListZilliqaTransactionsByBlockHeightRI to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

