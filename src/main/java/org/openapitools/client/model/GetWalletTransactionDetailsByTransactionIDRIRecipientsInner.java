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
 * GetWalletTransactionDetailsByTransactionIDRIRecipientsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-24T14:43:47.118671Z[Etc/UTC]")
public class GetWalletTransactionDetailsByTransactionIDRIRecipientsInner {
  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private String address;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private String amount;

  public GetWalletTransactionDetailsByTransactionIDRIRecipientsInner() { 
  }

  public GetWalletTransactionDetailsByTransactionIDRIRecipientsInner address(String address) {
    
    this.address = address;
    return this;
  }

   /**
   * The address which receives this transaction. In UTXO-based protocols like Bitcoin there could be several senders while in account-based protocols like Ethereum there is always only one recipient.
   * @return address
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "tb1qrktdykdjcjeuy2cfzgfjg0ky6sxaf82v8tn2dg", required = true, value = "The address which receives this transaction. In UTXO-based protocols like Bitcoin there could be several senders while in account-based protocols like Ethereum there is always only one recipient.")

  public String getAddress() {
    return address;
  }


  public void setAddress(String address) {
    this.address = address;
  }


  public GetWalletTransactionDetailsByTransactionIDRIRecipientsInner amount(String amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * Represents the amount received to this address.
   * @return amount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "0.00004069", required = true, value = "Represents the amount received to this address.")

  public String getAmount() {
    return amount;
  }


  public void setAmount(String amount) {
    this.amount = amount;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetWalletTransactionDetailsByTransactionIDRIRecipientsInner getWalletTransactionDetailsByTransactionIDRIRecipientsInner = (GetWalletTransactionDetailsByTransactionIDRIRecipientsInner) o;
    return Objects.equals(this.address, getWalletTransactionDetailsByTransactionIDRIRecipientsInner.address) &&
        Objects.equals(this.amount, getWalletTransactionDetailsByTransactionIDRIRecipientsInner.amount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, amount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetWalletTransactionDetailsByTransactionIDRIRecipientsInner {\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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
    openapiFields.add("amount");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("address");
    openapiRequiredFields.add("amount");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GetWalletTransactionDetailsByTransactionIDRIRecipientsInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (GetWalletTransactionDetailsByTransactionIDRIRecipientsInner.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetWalletTransactionDetailsByTransactionIDRIRecipientsInner is not found in the empty JSON string", GetWalletTransactionDetailsByTransactionIDRIRecipientsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GetWalletTransactionDetailsByTransactionIDRIRecipientsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetWalletTransactionDetailsByTransactionIDRIRecipientsInner` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GetWalletTransactionDetailsByTransactionIDRIRecipientsInner.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("address") != null && !jsonObj.get("address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("address").toString()));
      }
      if (jsonObj.get("amount") != null && !jsonObj.get("amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("amount").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetWalletTransactionDetailsByTransactionIDRIRecipientsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetWalletTransactionDetailsByTransactionIDRIRecipientsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetWalletTransactionDetailsByTransactionIDRIRecipientsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetWalletTransactionDetailsByTransactionIDRIRecipientsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<GetWalletTransactionDetailsByTransactionIDRIRecipientsInner>() {
           @Override
           public void write(JsonWriter out, GetWalletTransactionDetailsByTransactionIDRIRecipientsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetWalletTransactionDetailsByTransactionIDRIRecipientsInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetWalletTransactionDetailsByTransactionIDRIRecipientsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetWalletTransactionDetailsByTransactionIDRIRecipientsInner
  * @throws IOException if the JSON string is invalid with respect to GetWalletTransactionDetailsByTransactionIDRIRecipientsInner
  */
  public static GetWalletTransactionDetailsByTransactionIDRIRecipientsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetWalletTransactionDetailsByTransactionIDRIRecipientsInner.class);
  }

 /**
  * Convert an instance of GetWalletTransactionDetailsByTransactionIDRIRecipientsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

