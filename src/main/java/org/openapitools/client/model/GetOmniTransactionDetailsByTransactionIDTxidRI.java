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
import org.openapitools.client.model.GetOmniTransactionDetailsByTransactionIDTxidRISendersInner;
import org.openapitools.client.model.ListOmniTransactionsByAddressRIRecipientsInner;
import org.openapitools.client.model.ListUnconfirmedOmniTransactionsByAddressRIFee;

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
 * GetOmniTransactionDetailsByTransactionIDTxidRI
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-24T14:43:47.118671Z[Etc/UTC]")
public class GetOmniTransactionDetailsByTransactionIDTxidRI {
  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private String amount;

  public static final String SERIALIZED_NAME_DIVISIBLE = "divisible";
  @SerializedName(SERIALIZED_NAME_DIVISIBLE)
  private Boolean divisible;

  public static final String SERIALIZED_NAME_MINED_IN_BLOCK_HASH = "minedInBlockHash";
  @SerializedName(SERIALIZED_NAME_MINED_IN_BLOCK_HASH)
  private String minedInBlockHash;

  public static final String SERIALIZED_NAME_MINED_IN_BLOCK_HEIGHT = "minedInBlockHeight";
  @SerializedName(SERIALIZED_NAME_MINED_IN_BLOCK_HEIGHT)
  private Integer minedInBlockHeight;

  public static final String SERIALIZED_NAME_PROPERTY_ID = "propertyId";
  @SerializedName(SERIALIZED_NAME_PROPERTY_ID)
  private Integer propertyId;

  public static final String SERIALIZED_NAME_RECIPIENTS = "recipients";
  @SerializedName(SERIALIZED_NAME_RECIPIENTS)
  private List<ListOmniTransactionsByAddressRIRecipientsInner> recipients = new ArrayList<>();

  public static final String SERIALIZED_NAME_SENDERS = "senders";
  @SerializedName(SERIALIZED_NAME_SENDERS)
  private List<GetOmniTransactionDetailsByTransactionIDTxidRISendersInner> senders = new ArrayList<>();

  public static final String SERIALIZED_NAME_TIMESTAMP = "timestamp";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP)
  private Integer timestamp;

  public static final String SERIALIZED_NAME_TRANSACTION_ID = "transactionId";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_ID)
  private String transactionId;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_TYPE_INT = "typeInt";
  @SerializedName(SERIALIZED_NAME_TYPE_INT)
  private Integer typeInt;

  public static final String SERIALIZED_NAME_VALID = "valid";
  @SerializedName(SERIALIZED_NAME_VALID)
  private Boolean valid;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private Integer version;

  public static final String SERIALIZED_NAME_FEE = "fee";
  @SerializedName(SERIALIZED_NAME_FEE)
  private ListUnconfirmedOmniTransactionsByAddressRIFee fee;

  public GetOmniTransactionDetailsByTransactionIDTxidRI() { 
  }

  public GetOmniTransactionDetailsByTransactionIDTxidRI amount(String amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * Defines the amount of the sent tokens.
   * @return amount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "14.915785", required = true, value = "Defines the amount of the sent tokens.")

  public String getAmount() {
    return amount;
  }


  public void setAmount(String amount) {
    this.amount = amount;
  }


  public GetOmniTransactionDetailsByTransactionIDTxidRI divisible(Boolean divisible) {
    
    this.divisible = divisible;
    return this;
  }

   /**
   * Defines whether the attribute can be divisible or not, as boolean. E.g., if it is \&quot;true\&quot;, the attribute is divisible.
   * @return divisible
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "true", required = true, value = "Defines whether the attribute can be divisible or not, as boolean. E.g., if it is \"true\", the attribute is divisible.")

  public Boolean getDivisible() {
    return divisible;
  }


  public void setDivisible(Boolean divisible) {
    this.divisible = divisible;
  }


  public GetOmniTransactionDetailsByTransactionIDTxidRI minedInBlockHash(String minedInBlockHash) {
    
    this.minedInBlockHash = minedInBlockHash;
    return this;
  }

   /**
   * Represents the hash of the block where this transaction was mined/confirmed for first time. The hash is defined as a cryptographic digital fingerprint made by hashing the block header twice through the SHA256 algorithm.
   * @return minedInBlockHash
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "0000000049696aca62d2ea7db9e71aa4f1116ede1eb55f9932e758cc586eb8b6", required = true, value = "Represents the hash of the block where this transaction was mined/confirmed for first time. The hash is defined as a cryptographic digital fingerprint made by hashing the block header twice through the SHA256 algorithm.")

  public String getMinedInBlockHash() {
    return minedInBlockHash;
  }


  public void setMinedInBlockHash(String minedInBlockHash) {
    this.minedInBlockHash = minedInBlockHash;
  }


  public GetOmniTransactionDetailsByTransactionIDTxidRI minedInBlockHeight(Integer minedInBlockHeight) {
    
    this.minedInBlockHeight = minedInBlockHeight;
    return this;
  }

   /**
   * Represents the hight of the block where this transaction was mined/confirmed for first time. The height is defined as the number of blocks in the blockchain preceding this specific block.
   * @return minedInBlockHeight
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1941239", required = true, value = "Represents the hight of the block where this transaction was mined/confirmed for first time. The height is defined as the number of blocks in the blockchain preceding this specific block.")

  public Integer getMinedInBlockHeight() {
    return minedInBlockHeight;
  }


  public void setMinedInBlockHeight(Integer minedInBlockHeight) {
    this.minedInBlockHeight = minedInBlockHeight;
  }


  public GetOmniTransactionDetailsByTransactionIDTxidRI propertyId(Integer propertyId) {
    
    this.propertyId = propertyId;
    return this;
  }

   /**
   * Represents the identifier of the tokens to send.
   * @return propertyId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2", required = true, value = "Represents the identifier of the tokens to send.")

  public Integer getPropertyId() {
    return propertyId;
  }


  public void setPropertyId(Integer propertyId) {
    this.propertyId = propertyId;
  }


  public GetOmniTransactionDetailsByTransactionIDTxidRI recipients(List<ListOmniTransactionsByAddressRIRecipientsInner> recipients) {
    
    this.recipients = recipients;
    return this;
  }

  public GetOmniTransactionDetailsByTransactionIDTxidRI addRecipientsItem(ListOmniTransactionsByAddressRIRecipientsInner recipientsItem) {
    this.recipients.add(recipientsItem);
    return this;
  }

   /**
   * Represents an object of addresses that receive the transactions.
   * @return recipients
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Represents an object of addresses that receive the transactions.")

  public List<ListOmniTransactionsByAddressRIRecipientsInner> getRecipients() {
    return recipients;
  }


  public void setRecipients(List<ListOmniTransactionsByAddressRIRecipientsInner> recipients) {
    this.recipients = recipients;
  }


  public GetOmniTransactionDetailsByTransactionIDTxidRI senders(List<GetOmniTransactionDetailsByTransactionIDTxidRISendersInner> senders) {
    
    this.senders = senders;
    return this;
  }

  public GetOmniTransactionDetailsByTransactionIDTxidRI addSendersItem(GetOmniTransactionDetailsByTransactionIDTxidRISendersInner sendersItem) {
    this.senders.add(sendersItem);
    return this;
  }

   /**
   * Represents an object of addresses that provide the funds.
   * @return senders
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Represents an object of addresses that provide the funds.")

  public List<GetOmniTransactionDetailsByTransactionIDTxidRISendersInner> getSenders() {
    return senders;
  }


  public void setSenders(List<GetOmniTransactionDetailsByTransactionIDTxidRISendersInner> senders) {
    this.senders = senders;
  }


  public GetOmniTransactionDetailsByTransactionIDTxidRI timestamp(Integer timestamp) {
    
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Defines the exact date/time in Unix Timestamp when this transaction was mined, confirmed or first seen in Mempool, if it is unconfirmed.
   * @return timestamp
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1616423278", required = true, value = "Defines the exact date/time in Unix Timestamp when this transaction was mined, confirmed or first seen in Mempool, if it is unconfirmed.")

  public Integer getTimestamp() {
    return timestamp;
  }


  public void setTimestamp(Integer timestamp) {
    this.timestamp = timestamp;
  }


  public GetOmniTransactionDetailsByTransactionIDTxidRI transactionId(String transactionId) {
    
    this.transactionId = transactionId;
    return this;
  }

   /**
   * Represents the unique identifier of a transaction, i.e. it could be &#x60;transactionId&#x60; in UTXO-based protocols like Bitcoin, and transaction &#x60;hash&#x60; in Ethereum blockchain.
   * @return transactionId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "d237ff4a681617b767bf22c4e1e8f5115b95c8c168d6cf53bbdec68529f91ecb", required = true, value = "Represents the unique identifier of a transaction, i.e. it could be `transactionId` in UTXO-based protocols like Bitcoin, and transaction `hash` in Ethereum blockchain.")

  public String getTransactionId() {
    return transactionId;
  }


  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }


  public GetOmniTransactionDetailsByTransactionIDTxidRI type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Defines the type of the transaction as a string.
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Simple Send", required = true, value = "Defines the type of the transaction as a string.")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public GetOmniTransactionDetailsByTransactionIDTxidRI typeInt(Integer typeInt) {
    
    this.typeInt = typeInt;
    return this;
  }

   /**
   * Defines the type of the transaction as a number.
   * @return typeInt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "0", required = true, value = "Defines the type of the transaction as a number.")

  public Integer getTypeInt() {
    return typeInt;
  }


  public void setTypeInt(Integer typeInt) {
    this.typeInt = typeInt;
  }


  public GetOmniTransactionDetailsByTransactionIDTxidRI valid(Boolean valid) {
    
    this.valid = valid;
    return this;
  }

   /**
   * Defines whether the transaction is valid or not, as boolean. E.g. if set to \&quot;true\&quot;, it means the transaction is valid.
   * @return valid
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "true", required = true, value = "Defines whether the transaction is valid or not, as boolean. E.g. if set to \"true\", it means the transaction is valid.")

  public Boolean getValid() {
    return valid;
  }


  public void setValid(Boolean valid) {
    this.valid = valid;
  }


  public GetOmniTransactionDetailsByTransactionIDTxidRI version(Integer version) {
    
    this.version = version;
    return this;
  }

   /**
   * Defines the specific version.
   * @return version
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "0", required = true, value = "Defines the specific version.")

  public Integer getVersion() {
    return version;
  }


  public void setVersion(Integer version) {
    this.version = version;
  }


  public GetOmniTransactionDetailsByTransactionIDTxidRI fee(ListUnconfirmedOmniTransactionsByAddressRIFee fee) {
    
    this.fee = fee;
    return this;
  }

   /**
   * Get fee
   * @return fee
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public ListUnconfirmedOmniTransactionsByAddressRIFee getFee() {
    return fee;
  }


  public void setFee(ListUnconfirmedOmniTransactionsByAddressRIFee fee) {
    this.fee = fee;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetOmniTransactionDetailsByTransactionIDTxidRI getOmniTransactionDetailsByTransactionIDTxidRI = (GetOmniTransactionDetailsByTransactionIDTxidRI) o;
    return Objects.equals(this.amount, getOmniTransactionDetailsByTransactionIDTxidRI.amount) &&
        Objects.equals(this.divisible, getOmniTransactionDetailsByTransactionIDTxidRI.divisible) &&
        Objects.equals(this.minedInBlockHash, getOmniTransactionDetailsByTransactionIDTxidRI.minedInBlockHash) &&
        Objects.equals(this.minedInBlockHeight, getOmniTransactionDetailsByTransactionIDTxidRI.minedInBlockHeight) &&
        Objects.equals(this.propertyId, getOmniTransactionDetailsByTransactionIDTxidRI.propertyId) &&
        Objects.equals(this.recipients, getOmniTransactionDetailsByTransactionIDTxidRI.recipients) &&
        Objects.equals(this.senders, getOmniTransactionDetailsByTransactionIDTxidRI.senders) &&
        Objects.equals(this.timestamp, getOmniTransactionDetailsByTransactionIDTxidRI.timestamp) &&
        Objects.equals(this.transactionId, getOmniTransactionDetailsByTransactionIDTxidRI.transactionId) &&
        Objects.equals(this.type, getOmniTransactionDetailsByTransactionIDTxidRI.type) &&
        Objects.equals(this.typeInt, getOmniTransactionDetailsByTransactionIDTxidRI.typeInt) &&
        Objects.equals(this.valid, getOmniTransactionDetailsByTransactionIDTxidRI.valid) &&
        Objects.equals(this.version, getOmniTransactionDetailsByTransactionIDTxidRI.version) &&
        Objects.equals(this.fee, getOmniTransactionDetailsByTransactionIDTxidRI.fee);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, divisible, minedInBlockHash, minedInBlockHeight, propertyId, recipients, senders, timestamp, transactionId, type, typeInt, valid, version, fee);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetOmniTransactionDetailsByTransactionIDTxidRI {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    divisible: ").append(toIndentedString(divisible)).append("\n");
    sb.append("    minedInBlockHash: ").append(toIndentedString(minedInBlockHash)).append("\n");
    sb.append("    minedInBlockHeight: ").append(toIndentedString(minedInBlockHeight)).append("\n");
    sb.append("    propertyId: ").append(toIndentedString(propertyId)).append("\n");
    sb.append("    recipients: ").append(toIndentedString(recipients)).append("\n");
    sb.append("    senders: ").append(toIndentedString(senders)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    typeInt: ").append(toIndentedString(typeInt)).append("\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    fee: ").append(toIndentedString(fee)).append("\n");
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
    openapiFields.add("amount");
    openapiFields.add("divisible");
    openapiFields.add("minedInBlockHash");
    openapiFields.add("minedInBlockHeight");
    openapiFields.add("propertyId");
    openapiFields.add("recipients");
    openapiFields.add("senders");
    openapiFields.add("timestamp");
    openapiFields.add("transactionId");
    openapiFields.add("type");
    openapiFields.add("typeInt");
    openapiFields.add("valid");
    openapiFields.add("version");
    openapiFields.add("fee");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("amount");
    openapiRequiredFields.add("divisible");
    openapiRequiredFields.add("minedInBlockHash");
    openapiRequiredFields.add("minedInBlockHeight");
    openapiRequiredFields.add("propertyId");
    openapiRequiredFields.add("recipients");
    openapiRequiredFields.add("senders");
    openapiRequiredFields.add("timestamp");
    openapiRequiredFields.add("transactionId");
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("typeInt");
    openapiRequiredFields.add("valid");
    openapiRequiredFields.add("version");
    openapiRequiredFields.add("fee");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GetOmniTransactionDetailsByTransactionIDTxidRI
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (GetOmniTransactionDetailsByTransactionIDTxidRI.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetOmniTransactionDetailsByTransactionIDTxidRI is not found in the empty JSON string", GetOmniTransactionDetailsByTransactionIDTxidRI.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GetOmniTransactionDetailsByTransactionIDTxidRI.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetOmniTransactionDetailsByTransactionIDTxidRI` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GetOmniTransactionDetailsByTransactionIDTxidRI.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("amount") != null && !jsonObj.get("amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("amount").toString()));
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
          ListOmniTransactionsByAddressRIRecipientsInner.validateJsonObject(jsonArrayrecipients.get(i).getAsJsonObject());
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
          GetOmniTransactionDetailsByTransactionIDTxidRISendersInner.validateJsonObject(jsonArraysenders.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("transactionId") != null && !jsonObj.get("transactionId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `transactionId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("transactionId").toString()));
      }
      if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      // validate the optional field `fee`
      if (jsonObj.getAsJsonObject("fee") != null) {
        ListUnconfirmedOmniTransactionsByAddressRIFee.validateJsonObject(jsonObj.getAsJsonObject("fee"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetOmniTransactionDetailsByTransactionIDTxidRI.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetOmniTransactionDetailsByTransactionIDTxidRI' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetOmniTransactionDetailsByTransactionIDTxidRI> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetOmniTransactionDetailsByTransactionIDTxidRI.class));

       return (TypeAdapter<T>) new TypeAdapter<GetOmniTransactionDetailsByTransactionIDTxidRI>() {
           @Override
           public void write(JsonWriter out, GetOmniTransactionDetailsByTransactionIDTxidRI value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetOmniTransactionDetailsByTransactionIDTxidRI read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetOmniTransactionDetailsByTransactionIDTxidRI given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetOmniTransactionDetailsByTransactionIDTxidRI
  * @throws IOException if the JSON string is invalid with respect to GetOmniTransactionDetailsByTransactionIDTxidRI
  */
  public static GetOmniTransactionDetailsByTransactionIDTxidRI fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetOmniTransactionDetailsByTransactionIDTxidRI.class);
  }

 /**
  * Convert an instance of GetOmniTransactionDetailsByTransactionIDTxidRI to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

