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
import org.openapitools.client.model.DecodeRawTransactionHexRISBVinInnerScriptSig;

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
 * DecodeRawTransactionHexRISBVinInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-24T14:43:47.118671Z[Etc/UTC]")
public class DecodeRawTransactionHexRISBVinInner {
  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private String address;

  public static final String SERIALIZED_NAME_INPUT_HASH = "inputHash";
  @SerializedName(SERIALIZED_NAME_INPUT_HASH)
  private String inputHash;

  public static final String SERIALIZED_NAME_OUTPUT_INDEX = "outputIndex";
  @SerializedName(SERIALIZED_NAME_OUTPUT_INDEX)
  private Integer outputIndex;

  public static final String SERIALIZED_NAME_SCRIPT_SIG = "scriptSig";
  @SerializedName(SERIALIZED_NAME_SCRIPT_SIG)
  private DecodeRawTransactionHexRISBVinInnerScriptSig scriptSig;

  public static final String SERIALIZED_NAME_SEQUENCE = "sequence";
  @SerializedName(SERIALIZED_NAME_SEQUENCE)
  private String sequence;

  public static final String SERIALIZED_NAME_TXINWITNESS = "txinwitness";
  @SerializedName(SERIALIZED_NAME_TXINWITNESS)
  private List<String> txinwitness = null;

  public DecodeRawTransactionHexRISBVinInner() { 
  }

  public DecodeRawTransactionHexRISBVinInner address(String address) {
    
    this.address = address;
    return this;
  }

   /**
   * Represents the address which send/receive the amount.
   * @return address
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2N5PcdirZUzKF9bWuGdugNuzcQrCbBudxv1", value = "Represents the address which send/receive the amount.")

  public String getAddress() {
    return address;
  }


  public void setAddress(String address) {
    this.address = address;
  }


  public DecodeRawTransactionHexRISBVinInner inputHash(String inputHash) {
    
    this.inputHash = inputHash;
    return this;
  }

   /**
   * Represents the transaction inputs&#39; indentifier.
   * @return inputHash
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "108c523cba933520905136262f6cdef87d68a1fa4ffb95b1a73f69a07ed2aed3", value = "Represents the transaction inputs' indentifier.")

  public String getInputHash() {
    return inputHash;
  }


  public void setInputHash(String inputHash) {
    this.inputHash = inputHash;
  }


  public DecodeRawTransactionHexRISBVinInner outputIndex(Integer outputIndex) {
    
    this.outputIndex = outputIndex;
    return this;
  }

   /**
   * Represents the output of a transaction.
   * @return outputIndex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3", value = "Represents the output of a transaction.")

  public Integer getOutputIndex() {
    return outputIndex;
  }


  public void setOutputIndex(Integer outputIndex) {
    this.outputIndex = outputIndex;
  }


  public DecodeRawTransactionHexRISBVinInner scriptSig(DecodeRawTransactionHexRISBVinInnerScriptSig scriptSig) {
    
    this.scriptSig = scriptSig;
    return this;
  }

   /**
   * Get scriptSig
   * @return scriptSig
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public DecodeRawTransactionHexRISBVinInnerScriptSig getScriptSig() {
    return scriptSig;
  }


  public void setScriptSig(DecodeRawTransactionHexRISBVinInnerScriptSig scriptSig) {
    this.scriptSig = scriptSig;
  }


  public DecodeRawTransactionHexRISBVinInner sequence(String sequence) {
    
    this.sequence = sequence;
    return this;
  }

   /**
   * Represents the script sequence number.
   * @return sequence
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "4294967295", value = "Represents the script sequence number.")

  public String getSequence() {
    return sequence;
  }


  public void setSequence(String sequence) {
    this.sequence = sequence;
  }


  public DecodeRawTransactionHexRISBVinInner txinwitness(List<String> txinwitness) {
    
    this.txinwitness = txinwitness;
    return this;
  }

  public DecodeRawTransactionHexRISBVinInner addTxinwitnessItem(String txinwitnessItem) {
    if (this.txinwitness == null) {
      this.txinwitness = new ArrayList<>();
    }
    this.txinwitness.add(txinwitnessItem);
    return this;
  }

   /**
   * Get txinwitness
   * @return txinwitness
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getTxinwitness() {
    return txinwitness;
  }


  public void setTxinwitness(List<String> txinwitness) {
    this.txinwitness = txinwitness;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DecodeRawTransactionHexRISBVinInner decodeRawTransactionHexRISBVinInner = (DecodeRawTransactionHexRISBVinInner) o;
    return Objects.equals(this.address, decodeRawTransactionHexRISBVinInner.address) &&
        Objects.equals(this.inputHash, decodeRawTransactionHexRISBVinInner.inputHash) &&
        Objects.equals(this.outputIndex, decodeRawTransactionHexRISBVinInner.outputIndex) &&
        Objects.equals(this.scriptSig, decodeRawTransactionHexRISBVinInner.scriptSig) &&
        Objects.equals(this.sequence, decodeRawTransactionHexRISBVinInner.sequence) &&
        Objects.equals(this.txinwitness, decodeRawTransactionHexRISBVinInner.txinwitness);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, inputHash, outputIndex, scriptSig, sequence, txinwitness);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DecodeRawTransactionHexRISBVinInner {\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    inputHash: ").append(toIndentedString(inputHash)).append("\n");
    sb.append("    outputIndex: ").append(toIndentedString(outputIndex)).append("\n");
    sb.append("    scriptSig: ").append(toIndentedString(scriptSig)).append("\n");
    sb.append("    sequence: ").append(toIndentedString(sequence)).append("\n");
    sb.append("    txinwitness: ").append(toIndentedString(txinwitness)).append("\n");
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
    openapiFields.add("address");
    openapiFields.add("inputHash");
    openapiFields.add("outputIndex");
    openapiFields.add("scriptSig");
    openapiFields.add("sequence");
    openapiFields.add("txinwitness");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("scriptSig");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DecodeRawTransactionHexRISBVinInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (DecodeRawTransactionHexRISBVinInner.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in DecodeRawTransactionHexRISBVinInner is not found in the empty JSON string", DecodeRawTransactionHexRISBVinInner.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!DecodeRawTransactionHexRISBVinInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DecodeRawTransactionHexRISBVinInner` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : DecodeRawTransactionHexRISBVinInner.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("address") != null && !jsonObj.get("address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("address").toString()));
      }
      if (jsonObj.get("inputHash") != null && !jsonObj.get("inputHash").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `inputHash` to be a primitive type in the JSON string but got `%s`", jsonObj.get("inputHash").toString()));
      }
      // validate the optional field `scriptSig`
      if (jsonObj.getAsJsonObject("scriptSig") != null) {
        DecodeRawTransactionHexRISBVinInnerScriptSig.validateJsonObject(jsonObj.getAsJsonObject("scriptSig"));
      }
      if (jsonObj.get("sequence") != null && !jsonObj.get("sequence").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sequence` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sequence").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("txinwitness") != null && !jsonObj.get("txinwitness").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `txinwitness` to be an array in the JSON string but got `%s`", jsonObj.get("txinwitness").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DecodeRawTransactionHexRISBVinInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DecodeRawTransactionHexRISBVinInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DecodeRawTransactionHexRISBVinInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DecodeRawTransactionHexRISBVinInner.class));

       return (TypeAdapter<T>) new TypeAdapter<DecodeRawTransactionHexRISBVinInner>() {
           @Override
           public void write(JsonWriter out, DecodeRawTransactionHexRISBVinInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DecodeRawTransactionHexRISBVinInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DecodeRawTransactionHexRISBVinInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DecodeRawTransactionHexRISBVinInner
  * @throws IOException if the JSON string is invalid with respect to DecodeRawTransactionHexRISBVinInner
  */
  public static DecodeRawTransactionHexRISBVinInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DecodeRawTransactionHexRISBVinInner.class);
  }

 /**
  * Convert an instance of DecodeRawTransactionHexRISBVinInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

