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
import org.openapitools.client.model.GetTransactionDetailsByTransactionIDRIBSBVinInnerScriptSig;

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
 * ListAllUnconfirmedTransactionsRIBSBCVinInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-24T14:43:47.118671Z[Etc/UTC]")
public class ListAllUnconfirmedTransactionsRIBSBCVinInner {
  public static final String SERIALIZED_NAME_ADDRESSES = "addresses";
  @SerializedName(SERIALIZED_NAME_ADDRESSES)
  private List<String> addresses = new ArrayList<>();

  public static final String SERIALIZED_NAME_SCRIPT_SIG = "scriptSig";
  @SerializedName(SERIALIZED_NAME_SCRIPT_SIG)
  private GetTransactionDetailsByTransactionIDRIBSBVinInnerScriptSig scriptSig;

  public static final String SERIALIZED_NAME_SEQUENCE = "sequence";
  @SerializedName(SERIALIZED_NAME_SEQUENCE)
  private String sequence;

  public static final String SERIALIZED_NAME_TXID = "txid";
  @SerializedName(SERIALIZED_NAME_TXID)
  private String txid;

  public static final String SERIALIZED_NAME_TXINWITNESS = "txinwitness";
  @SerializedName(SERIALIZED_NAME_TXINWITNESS)
  private List<String> txinwitness = new ArrayList<>();

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;

  public static final String SERIALIZED_NAME_VOUT = "vout";
  @SerializedName(SERIALIZED_NAME_VOUT)
  private Integer vout;

  public ListAllUnconfirmedTransactionsRIBSBCVinInner() { 
  }

  public ListAllUnconfirmedTransactionsRIBSBCVinInner addresses(List<String> addresses) {
    
    this.addresses = addresses;
    return this;
  }

  public ListAllUnconfirmedTransactionsRIBSBCVinInner addAddressesItem(String addressesItem) {
    this.addresses.add(addressesItem);
    return this;
  }

   /**
   * Get addresses
   * @return addresses
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<String> getAddresses() {
    return addresses;
  }


  public void setAddresses(List<String> addresses) {
    this.addresses = addresses;
  }


  public ListAllUnconfirmedTransactionsRIBSBCVinInner scriptSig(GetTransactionDetailsByTransactionIDRIBSBVinInnerScriptSig scriptSig) {
    
    this.scriptSig = scriptSig;
    return this;
  }

   /**
   * Get scriptSig
   * @return scriptSig
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public GetTransactionDetailsByTransactionIDRIBSBVinInnerScriptSig getScriptSig() {
    return scriptSig;
  }


  public void setScriptSig(GetTransactionDetailsByTransactionIDRIBSBVinInnerScriptSig scriptSig) {
    this.scriptSig = scriptSig;
  }


  public ListAllUnconfirmedTransactionsRIBSBCVinInner sequence(String sequence) {
    
    this.sequence = sequence;
    return this;
  }

   /**
   * Represents the script sequence number.
   * @return sequence
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "4294967295", required = true, value = "Represents the script sequence number.")

  public String getSequence() {
    return sequence;
  }


  public void setSequence(String sequence) {
    this.sequence = sequence;
  }


  public ListAllUnconfirmedTransactionsRIBSBCVinInner txid(String txid) {
    
    this.txid = txid;
    return this;
  }

   /**
   * Represents the reference transaction identifier.
   * @return txid
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "caee978cae255bbe303ac86152679e46113a8b12925aa3afaa312d89d11ccbf8", required = true, value = "Represents the reference transaction identifier.")

  public String getTxid() {
    return txid;
  }


  public void setTxid(String txid) {
    this.txid = txid;
  }


  public ListAllUnconfirmedTransactionsRIBSBCVinInner txinwitness(List<String> txinwitness) {
    
    this.txinwitness = txinwitness;
    return this;
  }

  public ListAllUnconfirmedTransactionsRIBSBCVinInner addTxinwitnessItem(String txinwitnessItem) {
    this.txinwitness.add(txinwitnessItem);
    return this;
  }

   /**
   * Get txinwitness
   * @return txinwitness
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<String> getTxinwitness() {
    return txinwitness;
  }


  public void setTxinwitness(List<String> txinwitness) {
    this.txinwitness = txinwitness;
  }


  public ListAllUnconfirmedTransactionsRIBSBCVinInner value(String value) {
    
    this.value = value;
    return this;
  }

   /**
   * Represents the sent/received amount.
   * @return value
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "0.00873472", required = true, value = "Represents the sent/received amount.")

  public String getValue() {
    return value;
  }


  public void setValue(String value) {
    this.value = value;
  }


  public ListAllUnconfirmedTransactionsRIBSBCVinInner vout(Integer vout) {
    
    this.vout = vout;
    return this;
  }

   /**
   * Defines the vout of the transaction output, i.e. which output to spend.
   * @return vout
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1", required = true, value = "Defines the vout of the transaction output, i.e. which output to spend.")

  public Integer getVout() {
    return vout;
  }


  public void setVout(Integer vout) {
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
    ListAllUnconfirmedTransactionsRIBSBCVinInner listAllUnconfirmedTransactionsRIBSBCVinInner = (ListAllUnconfirmedTransactionsRIBSBCVinInner) o;
    return Objects.equals(this.addresses, listAllUnconfirmedTransactionsRIBSBCVinInner.addresses) &&
        Objects.equals(this.scriptSig, listAllUnconfirmedTransactionsRIBSBCVinInner.scriptSig) &&
        Objects.equals(this.sequence, listAllUnconfirmedTransactionsRIBSBCVinInner.sequence) &&
        Objects.equals(this.txid, listAllUnconfirmedTransactionsRIBSBCVinInner.txid) &&
        Objects.equals(this.txinwitness, listAllUnconfirmedTransactionsRIBSBCVinInner.txinwitness) &&
        Objects.equals(this.value, listAllUnconfirmedTransactionsRIBSBCVinInner.value) &&
        Objects.equals(this.vout, listAllUnconfirmedTransactionsRIBSBCVinInner.vout);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addresses, scriptSig, sequence, txid, txinwitness, value, vout);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListAllUnconfirmedTransactionsRIBSBCVinInner {\n");
    sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
    sb.append("    scriptSig: ").append(toIndentedString(scriptSig)).append("\n");
    sb.append("    sequence: ").append(toIndentedString(sequence)).append("\n");
    sb.append("    txid: ").append(toIndentedString(txid)).append("\n");
    sb.append("    txinwitness: ").append(toIndentedString(txinwitness)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
    openapiFields.add("addresses");
    openapiFields.add("scriptSig");
    openapiFields.add("sequence");
    openapiFields.add("txid");
    openapiFields.add("txinwitness");
    openapiFields.add("value");
    openapiFields.add("vout");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("addresses");
    openapiRequiredFields.add("scriptSig");
    openapiRequiredFields.add("sequence");
    openapiRequiredFields.add("txid");
    openapiRequiredFields.add("txinwitness");
    openapiRequiredFields.add("value");
    openapiRequiredFields.add("vout");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ListAllUnconfirmedTransactionsRIBSBCVinInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ListAllUnconfirmedTransactionsRIBSBCVinInner.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ListAllUnconfirmedTransactionsRIBSBCVinInner is not found in the empty JSON string", ListAllUnconfirmedTransactionsRIBSBCVinInner.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ListAllUnconfirmedTransactionsRIBSBCVinInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ListAllUnconfirmedTransactionsRIBSBCVinInner` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ListAllUnconfirmedTransactionsRIBSBCVinInner.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if (jsonObj.get("addresses") != null && !jsonObj.get("addresses").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `addresses` to be an array in the JSON string but got `%s`", jsonObj.get("addresses").toString()));
      }
      // validate the optional field `scriptSig`
      if (jsonObj.getAsJsonObject("scriptSig") != null) {
        GetTransactionDetailsByTransactionIDRIBSBVinInnerScriptSig.validateJsonObject(jsonObj.getAsJsonObject("scriptSig"));
      }
      if (jsonObj.get("sequence") != null && !jsonObj.get("sequence").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sequence` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sequence").toString()));
      }
      if (jsonObj.get("txid") != null && !jsonObj.get("txid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `txid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("txid").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("txinwitness") != null && !jsonObj.get("txinwitness").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `txinwitness` to be an array in the JSON string but got `%s`", jsonObj.get("txinwitness").toString()));
      }
      if (jsonObj.get("value") != null && !jsonObj.get("value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("value").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ListAllUnconfirmedTransactionsRIBSBCVinInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ListAllUnconfirmedTransactionsRIBSBCVinInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ListAllUnconfirmedTransactionsRIBSBCVinInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ListAllUnconfirmedTransactionsRIBSBCVinInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ListAllUnconfirmedTransactionsRIBSBCVinInner>() {
           @Override
           public void write(JsonWriter out, ListAllUnconfirmedTransactionsRIBSBCVinInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ListAllUnconfirmedTransactionsRIBSBCVinInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ListAllUnconfirmedTransactionsRIBSBCVinInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ListAllUnconfirmedTransactionsRIBSBCVinInner
  * @throws IOException if the JSON string is invalid with respect to ListAllUnconfirmedTransactionsRIBSBCVinInner
  */
  public static ListAllUnconfirmedTransactionsRIBSBCVinInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListAllUnconfirmedTransactionsRIBSBCVinInner.class);
  }

 /**
  * Convert an instance of ListAllUnconfirmedTransactionsRIBSBCVinInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

