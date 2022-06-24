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
 * GetAddressDetailsFromCallbackRITotalSpent
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-24T14:43:47.118671Z[Etc/UTC]")
public class GetAddressDetailsFromCallbackRITotalSpent {
  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private String amount;

  public static final String SERIALIZED_NAME_UNIT = "unit";
  @SerializedName(SERIALIZED_NAME_UNIT)
  private String unit;

  public GetAddressDetailsFromCallbackRITotalSpent() { 
  }

  public GetAddressDetailsFromCallbackRITotalSpent amount(String amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * Defines the total amount of all spent by this address coins, based on confirmed transactions.
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2.1", value = "Defines the total amount of all spent by this address coins, based on confirmed transactions.")

  public String getAmount() {
    return amount;
  }


  public void setAmount(String amount) {
    this.amount = amount;
  }


  public GetAddressDetailsFromCallbackRITotalSpent unit(String unit) {
    
    this.unit = unit;
    return this;
  }

   /**
   * Represents the unit of the total spent amount.
   * @return unit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "BTC", value = "Represents the unit of the total spent amount.")

  public String getUnit() {
    return unit;
  }


  public void setUnit(String unit) {
    this.unit = unit;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetAddressDetailsFromCallbackRITotalSpent getAddressDetailsFromCallbackRITotalSpent = (GetAddressDetailsFromCallbackRITotalSpent) o;
    return Objects.equals(this.amount, getAddressDetailsFromCallbackRITotalSpent.amount) &&
        Objects.equals(this.unit, getAddressDetailsFromCallbackRITotalSpent.unit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, unit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetAddressDetailsFromCallbackRITotalSpent {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
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
    openapiFields.add("unit");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GetAddressDetailsFromCallbackRITotalSpent
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (GetAddressDetailsFromCallbackRITotalSpent.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetAddressDetailsFromCallbackRITotalSpent is not found in the empty JSON string", GetAddressDetailsFromCallbackRITotalSpent.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GetAddressDetailsFromCallbackRITotalSpent.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetAddressDetailsFromCallbackRITotalSpent` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("amount") != null && !jsonObj.get("amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("amount").toString()));
      }
      if (jsonObj.get("unit") != null && !jsonObj.get("unit").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `unit` to be a primitive type in the JSON string but got `%s`", jsonObj.get("unit").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetAddressDetailsFromCallbackRITotalSpent.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetAddressDetailsFromCallbackRITotalSpent' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetAddressDetailsFromCallbackRITotalSpent> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetAddressDetailsFromCallbackRITotalSpent.class));

       return (TypeAdapter<T>) new TypeAdapter<GetAddressDetailsFromCallbackRITotalSpent>() {
           @Override
           public void write(JsonWriter out, GetAddressDetailsFromCallbackRITotalSpent value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetAddressDetailsFromCallbackRITotalSpent read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetAddressDetailsFromCallbackRITotalSpent given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetAddressDetailsFromCallbackRITotalSpent
  * @throws IOException if the JSON string is invalid with respect to GetAddressDetailsFromCallbackRITotalSpent
  */
  public static GetAddressDetailsFromCallbackRITotalSpent fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetAddressDetailsFromCallbackRITotalSpent.class);
  }

 /**
  * Convert an instance of GetAddressDetailsFromCallbackRITotalSpent to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

