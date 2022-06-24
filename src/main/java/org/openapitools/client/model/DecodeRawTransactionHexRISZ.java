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
import org.openapitools.client.model.DecodeRawTransactionHexRISZVinInner;
import org.openapitools.client.model.DecodeRawTransactionHexRISZVoutInner;

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
 * Zcash
 */
@ApiModel(description = "Zcash")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-24T14:43:47.118671Z[Etc/UTC]")
public class DecodeRawTransactionHexRISZ {
  public static final String SERIALIZED_NAME_EXPIRY_HEIGHT = "expiryHeight";
  @SerializedName(SERIALIZED_NAME_EXPIRY_HEIGHT)
  private Integer expiryHeight;

  public static final String SERIALIZED_NAME_LOCKTIME = "locktime";
  @SerializedName(SERIALIZED_NAME_LOCKTIME)
  private Integer locktime;

  public static final String SERIALIZED_NAME_OVERWINTERED = "overwintered";
  @SerializedName(SERIALIZED_NAME_OVERWINTERED)
  private Boolean overwintered;

  public static final String SERIALIZED_NAME_SAPLINGED = "saplinged";
  @SerializedName(SERIALIZED_NAME_SAPLINGED)
  private Boolean saplinged;

  public static final String SERIALIZED_NAME_TRANSACTION_HASH = "transactionHash";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_HASH)
  private String transactionHash;

  public static final String SERIALIZED_NAME_VALUE_BALANCE = "valueBalance";
  @SerializedName(SERIALIZED_NAME_VALUE_BALANCE)
  private String valueBalance;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private Integer version;

  public static final String SERIALIZED_NAME_VERSION_GROUP_ID = "versionGroupId";
  @SerializedName(SERIALIZED_NAME_VERSION_GROUP_ID)
  private String versionGroupId;

  public static final String SERIALIZED_NAME_VIN = "vin";
  @SerializedName(SERIALIZED_NAME_VIN)
  private List<DecodeRawTransactionHexRISZVinInner> vin = new ArrayList<>();

  public static final String SERIALIZED_NAME_VOUT = "vout";
  @SerializedName(SERIALIZED_NAME_VOUT)
  private List<DecodeRawTransactionHexRISZVoutInner> vout = new ArrayList<>();

  public DecodeRawTransactionHexRISZ() { 
  }

  public DecodeRawTransactionHexRISZ expiryHeight(Integer expiryHeight) {
    
    this.expiryHeight = expiryHeight;
    return this;
  }

   /**
   * Represents a block height after which the transaction will expire.
   * @return expiryHeight
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "0", required = true, value = "Represents a block height after which the transaction will expire.")

  public Integer getExpiryHeight() {
    return expiryHeight;
  }


  public void setExpiryHeight(Integer expiryHeight) {
    this.expiryHeight = expiryHeight;
  }


  public DecodeRawTransactionHexRISZ locktime(Integer locktime) {
    
    this.locktime = locktime;
    return this;
  }

   /**
   * Represents the locktime on the transaction on the specific blockchain, i.e. the blockheight at which the transaction is valid.
   * @return locktime
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1781965", required = true, value = "Represents the locktime on the transaction on the specific blockchain, i.e. the blockheight at which the transaction is valid.")

  public Integer getLocktime() {
    return locktime;
  }


  public void setLocktime(Integer locktime) {
    this.locktime = locktime;
  }


  public DecodeRawTransactionHexRISZ overwintered(Boolean overwintered) {
    
    this.overwintered = overwintered;
    return this;
  }

   /**
   * \&quot;Overwinter\&quot; is the network upgrade for the Zcash blockchain.
   * @return overwintered
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "true", required = true, value = "\"Overwinter\" is the network upgrade for the Zcash blockchain.")

  public Boolean getOverwintered() {
    return overwintered;
  }


  public void setOverwintered(Boolean overwintered) {
    this.overwintered = overwintered;
  }


  public DecodeRawTransactionHexRISZ saplinged(Boolean saplinged) {
    
    this.saplinged = saplinged;
    return this;
  }

   /**
   * Defines if the transaction includes sapling or not.
   * @return saplinged
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "true", required = true, value = "Defines if the transaction includes sapling or not.")

  public Boolean getSaplinged() {
    return saplinged;
  }


  public void setSaplinged(Boolean saplinged) {
    this.saplinged = saplinged;
  }


  public DecodeRawTransactionHexRISZ transactionHash(String transactionHash) {
    
    this.transactionHash = transactionHash;
    return this;
  }

   /**
   * Represents the same as transactionId for account-based protocols like Ethereum, while it could be different in UTXO-based protocols like Bitcoin. E.g., in UTXO-based protocols hash is different from transactionId for SegWit transactions.
   * @return transactionHash
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "e8ae0fed2699de544f48a9209085a6fe85e4697f3cc5625a85fd5021299e8f82", required = true, value = "Represents the same as transactionId for account-based protocols like Ethereum, while it could be different in UTXO-based protocols like Bitcoin. E.g., in UTXO-based protocols hash is different from transactionId for SegWit transactions.")

  public String getTransactionHash() {
    return transactionHash;
  }


  public void setTransactionHash(String transactionHash) {
    this.transactionHash = transactionHash;
  }


  public DecodeRawTransactionHexRISZ valueBalance(String valueBalance) {
    
    this.valueBalance = valueBalance;
    return this;
  }

   /**
   * Defines the transaction value balance.
   * @return valueBalance
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "0", required = true, value = "Defines the transaction value balance.")

  public String getValueBalance() {
    return valueBalance;
  }


  public void setValueBalance(String valueBalance) {
    this.valueBalance = valueBalance;
  }


  public DecodeRawTransactionHexRISZ version(Integer version) {
    
    this.version = version;
    return this;
  }

   /**
   * Represents the transaction version number.
   * @return version
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "4", required = true, value = "Represents the transaction version number.")

  public Integer getVersion() {
    return version;
  }


  public void setVersion(Integer version) {
    this.version = version;
  }


  public DecodeRawTransactionHexRISZ versionGroupId(String versionGroupId) {
    
    this.versionGroupId = versionGroupId;
    return this;
  }

   /**
   * Represents the transaction version group ID
   * @return versionGroupId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2301567109", required = true, value = "Represents the transaction version group ID")

  public String getVersionGroupId() {
    return versionGroupId;
  }


  public void setVersionGroupId(String versionGroupId) {
    this.versionGroupId = versionGroupId;
  }


  public DecodeRawTransactionHexRISZ vin(List<DecodeRawTransactionHexRISZVinInner> vin) {
    
    this.vin = vin;
    return this;
  }

  public DecodeRawTransactionHexRISZ addVinItem(DecodeRawTransactionHexRISZVinInner vinItem) {
    this.vin.add(vinItem);
    return this;
  }

   /**
   * Represents the Inputs of the transaction
   * @return vin
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Represents the Inputs of the transaction")

  public List<DecodeRawTransactionHexRISZVinInner> getVin() {
    return vin;
  }


  public void setVin(List<DecodeRawTransactionHexRISZVinInner> vin) {
    this.vin = vin;
  }


  public DecodeRawTransactionHexRISZ vout(List<DecodeRawTransactionHexRISZVoutInner> vout) {
    
    this.vout = vout;
    return this;
  }

  public DecodeRawTransactionHexRISZ addVoutItem(DecodeRawTransactionHexRISZVoutInner voutItem) {
    this.vout.add(voutItem);
    return this;
  }

   /**
   * Represents the Inputs of the transaction
   * @return vout
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Represents the Inputs of the transaction")

  public List<DecodeRawTransactionHexRISZVoutInner> getVout() {
    return vout;
  }


  public void setVout(List<DecodeRawTransactionHexRISZVoutInner> vout) {
    this.vout = vout;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DecodeRawTransactionHexRISZ decodeRawTransactionHexRISZ = (DecodeRawTransactionHexRISZ) o;
    return Objects.equals(this.expiryHeight, decodeRawTransactionHexRISZ.expiryHeight) &&
        Objects.equals(this.locktime, decodeRawTransactionHexRISZ.locktime) &&
        Objects.equals(this.overwintered, decodeRawTransactionHexRISZ.overwintered) &&
        Objects.equals(this.saplinged, decodeRawTransactionHexRISZ.saplinged) &&
        Objects.equals(this.transactionHash, decodeRawTransactionHexRISZ.transactionHash) &&
        Objects.equals(this.valueBalance, decodeRawTransactionHexRISZ.valueBalance) &&
        Objects.equals(this.version, decodeRawTransactionHexRISZ.version) &&
        Objects.equals(this.versionGroupId, decodeRawTransactionHexRISZ.versionGroupId) &&
        Objects.equals(this.vin, decodeRawTransactionHexRISZ.vin) &&
        Objects.equals(this.vout, decodeRawTransactionHexRISZ.vout);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expiryHeight, locktime, overwintered, saplinged, transactionHash, valueBalance, version, versionGroupId, vin, vout);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DecodeRawTransactionHexRISZ {\n");
    sb.append("    expiryHeight: ").append(toIndentedString(expiryHeight)).append("\n");
    sb.append("    locktime: ").append(toIndentedString(locktime)).append("\n");
    sb.append("    overwintered: ").append(toIndentedString(overwintered)).append("\n");
    sb.append("    saplinged: ").append(toIndentedString(saplinged)).append("\n");
    sb.append("    transactionHash: ").append(toIndentedString(transactionHash)).append("\n");
    sb.append("    valueBalance: ").append(toIndentedString(valueBalance)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    versionGroupId: ").append(toIndentedString(versionGroupId)).append("\n");
    sb.append("    vin: ").append(toIndentedString(vin)).append("\n");
    sb.append("    vout: ").append(toIndentedString(vout)).append("\n");
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
    openapiFields.add("expiryHeight");
    openapiFields.add("locktime");
    openapiFields.add("overwintered");
    openapiFields.add("saplinged");
    openapiFields.add("transactionHash");
    openapiFields.add("valueBalance");
    openapiFields.add("version");
    openapiFields.add("versionGroupId");
    openapiFields.add("vin");
    openapiFields.add("vout");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("expiryHeight");
    openapiRequiredFields.add("locktime");
    openapiRequiredFields.add("overwintered");
    openapiRequiredFields.add("saplinged");
    openapiRequiredFields.add("transactionHash");
    openapiRequiredFields.add("valueBalance");
    openapiRequiredFields.add("version");
    openapiRequiredFields.add("versionGroupId");
    openapiRequiredFields.add("vin");
    openapiRequiredFields.add("vout");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DecodeRawTransactionHexRISZ
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (DecodeRawTransactionHexRISZ.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in DecodeRawTransactionHexRISZ is not found in the empty JSON string", DecodeRawTransactionHexRISZ.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!DecodeRawTransactionHexRISZ.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DecodeRawTransactionHexRISZ` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : DecodeRawTransactionHexRISZ.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("transactionHash") != null && !jsonObj.get("transactionHash").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `transactionHash` to be a primitive type in the JSON string but got `%s`", jsonObj.get("transactionHash").toString()));
      }
      if (jsonObj.get("valueBalance") != null && !jsonObj.get("valueBalance").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `valueBalance` to be a primitive type in the JSON string but got `%s`", jsonObj.get("valueBalance").toString()));
      }
      if (jsonObj.get("versionGroupId") != null && !jsonObj.get("versionGroupId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `versionGroupId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("versionGroupId").toString()));
      }
      JsonArray jsonArrayvin = jsonObj.getAsJsonArray("vin");
      if (jsonArrayvin != null) {
        // ensure the json data is an array
        if (!jsonObj.get("vin").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `vin` to be an array in the JSON string but got `%s`", jsonObj.get("vin").toString()));
        }

        // validate the optional field `vin` (array)
        for (int i = 0; i < jsonArrayvin.size(); i++) {
          DecodeRawTransactionHexRISZVinInner.validateJsonObject(jsonArrayvin.get(i).getAsJsonObject());
        };
      }
      JsonArray jsonArrayvout = jsonObj.getAsJsonArray("vout");
      if (jsonArrayvout != null) {
        // ensure the json data is an array
        if (!jsonObj.get("vout").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `vout` to be an array in the JSON string but got `%s`", jsonObj.get("vout").toString()));
        }

        // validate the optional field `vout` (array)
        for (int i = 0; i < jsonArrayvout.size(); i++) {
          DecodeRawTransactionHexRISZVoutInner.validateJsonObject(jsonArrayvout.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DecodeRawTransactionHexRISZ.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DecodeRawTransactionHexRISZ' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DecodeRawTransactionHexRISZ> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DecodeRawTransactionHexRISZ.class));

       return (TypeAdapter<T>) new TypeAdapter<DecodeRawTransactionHexRISZ>() {
           @Override
           public void write(JsonWriter out, DecodeRawTransactionHexRISZ value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DecodeRawTransactionHexRISZ read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DecodeRawTransactionHexRISZ given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DecodeRawTransactionHexRISZ
  * @throws IOException if the JSON string is invalid with respect to DecodeRawTransactionHexRISZ
  */
  public static DecodeRawTransactionHexRISZ fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DecodeRawTransactionHexRISZ.class);
  }

 /**
  * Convert an instance of DecodeRawTransactionHexRISZ to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

