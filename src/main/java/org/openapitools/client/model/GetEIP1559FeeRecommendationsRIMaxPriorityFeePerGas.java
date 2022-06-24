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
 * GetEIP1559FeeRecommendationsRIMaxPriorityFeePerGas
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-24T14:43:47.118671Z[Etc/UTC]")
public class GetEIP1559FeeRecommendationsRIMaxPriorityFeePerGas {
  public static final String SERIALIZED_NAME_FAST = "fast";
  @SerializedName(SERIALIZED_NAME_FAST)
  private String fast;

  public static final String SERIALIZED_NAME_SLOW = "slow";
  @SerializedName(SERIALIZED_NAME_SLOW)
  private String slow;

  public static final String SERIALIZED_NAME_STANDARD = "standard";
  @SerializedName(SERIALIZED_NAME_STANDARD)
  private String standard;

  public static final String SERIALIZED_NAME_UNIT = "unit";
  @SerializedName(SERIALIZED_NAME_UNIT)
  private String unit;

  public GetEIP1559FeeRecommendationsRIMaxPriorityFeePerGas() { 
  }

  public GetEIP1559FeeRecommendationsRIMaxPriorityFeePerGas fast(String fast) {
    
    this.fast = fast;
    return this;
  }

   /**
   * Represents the fast maximum priority fee per gas, calculated from unconfirmed transactions.
   * @return fast
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "47085140300", required = true, value = "Represents the fast maximum priority fee per gas, calculated from unconfirmed transactions.")

  public String getFast() {
    return fast;
  }


  public void setFast(String fast) {
    this.fast = fast;
  }


  public GetEIP1559FeeRecommendationsRIMaxPriorityFeePerGas slow(String slow) {
    
    this.slow = slow;
    return this;
  }

   /**
   * Represents the slow maximum priority fee per gas, calculated from unconfirmed transactions.
   * @return slow
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "37331114417", required = true, value = "Represents the slow maximum priority fee per gas, calculated from unconfirmed transactions.")

  public String getSlow() {
    return slow;
  }


  public void setSlow(String slow) {
    this.slow = slow;
  }


  public GetEIP1559FeeRecommendationsRIMaxPriorityFeePerGas standard(String standard) {
    
    this.standard = standard;
    return this;
  }

   /**
   * Represents the standard maximum priority fee per gas, calculated from unconfirmed transactions.
   * @return standard
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "41987372497", required = true, value = "Represents the standard maximum priority fee per gas, calculated from unconfirmed transactions.")

  public String getStandard() {
    return standard;
  }


  public void setStandard(String standard) {
    this.standard = standard;
  }


  public GetEIP1559FeeRecommendationsRIMaxPriorityFeePerGas unit(String unit) {
    
    this.unit = unit;
    return this;
  }

   /**
   * Represents the unit of the maximum priority fee per gas.
   * @return unit
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "WEI", required = true, value = "Represents the unit of the maximum priority fee per gas.")

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
    GetEIP1559FeeRecommendationsRIMaxPriorityFeePerGas getEIP1559FeeRecommendationsRIMaxPriorityFeePerGas = (GetEIP1559FeeRecommendationsRIMaxPriorityFeePerGas) o;
    return Objects.equals(this.fast, getEIP1559FeeRecommendationsRIMaxPriorityFeePerGas.fast) &&
        Objects.equals(this.slow, getEIP1559FeeRecommendationsRIMaxPriorityFeePerGas.slow) &&
        Objects.equals(this.standard, getEIP1559FeeRecommendationsRIMaxPriorityFeePerGas.standard) &&
        Objects.equals(this.unit, getEIP1559FeeRecommendationsRIMaxPriorityFeePerGas.unit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fast, slow, standard, unit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetEIP1559FeeRecommendationsRIMaxPriorityFeePerGas {\n");
    sb.append("    fast: ").append(toIndentedString(fast)).append("\n");
    sb.append("    slow: ").append(toIndentedString(slow)).append("\n");
    sb.append("    standard: ").append(toIndentedString(standard)).append("\n");
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
    openapiFields.add("fast");
    openapiFields.add("slow");
    openapiFields.add("standard");
    openapiFields.add("unit");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("fast");
    openapiRequiredFields.add("slow");
    openapiRequiredFields.add("standard");
    openapiRequiredFields.add("unit");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GetEIP1559FeeRecommendationsRIMaxPriorityFeePerGas
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (GetEIP1559FeeRecommendationsRIMaxPriorityFeePerGas.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetEIP1559FeeRecommendationsRIMaxPriorityFeePerGas is not found in the empty JSON string", GetEIP1559FeeRecommendationsRIMaxPriorityFeePerGas.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GetEIP1559FeeRecommendationsRIMaxPriorityFeePerGas.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetEIP1559FeeRecommendationsRIMaxPriorityFeePerGas` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GetEIP1559FeeRecommendationsRIMaxPriorityFeePerGas.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("fast") != null && !jsonObj.get("fast").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fast` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fast").toString()));
      }
      if (jsonObj.get("slow") != null && !jsonObj.get("slow").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `slow` to be a primitive type in the JSON string but got `%s`", jsonObj.get("slow").toString()));
      }
      if (jsonObj.get("standard") != null && !jsonObj.get("standard").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `standard` to be a primitive type in the JSON string but got `%s`", jsonObj.get("standard").toString()));
      }
      if (jsonObj.get("unit") != null && !jsonObj.get("unit").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `unit` to be a primitive type in the JSON string but got `%s`", jsonObj.get("unit").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetEIP1559FeeRecommendationsRIMaxPriorityFeePerGas.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetEIP1559FeeRecommendationsRIMaxPriorityFeePerGas' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetEIP1559FeeRecommendationsRIMaxPriorityFeePerGas> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetEIP1559FeeRecommendationsRIMaxPriorityFeePerGas.class));

       return (TypeAdapter<T>) new TypeAdapter<GetEIP1559FeeRecommendationsRIMaxPriorityFeePerGas>() {
           @Override
           public void write(JsonWriter out, GetEIP1559FeeRecommendationsRIMaxPriorityFeePerGas value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetEIP1559FeeRecommendationsRIMaxPriorityFeePerGas read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetEIP1559FeeRecommendationsRIMaxPriorityFeePerGas given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetEIP1559FeeRecommendationsRIMaxPriorityFeePerGas
  * @throws IOException if the JSON string is invalid with respect to GetEIP1559FeeRecommendationsRIMaxPriorityFeePerGas
  */
  public static GetEIP1559FeeRecommendationsRIMaxPriorityFeePerGas fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetEIP1559FeeRecommendationsRIMaxPriorityFeePerGas.class);
  }

 /**
  * Convert an instance of GetEIP1559FeeRecommendationsRIMaxPriorityFeePerGas to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

