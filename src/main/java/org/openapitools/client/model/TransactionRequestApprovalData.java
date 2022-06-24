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
import org.openapitools.client.model.TransactionRequestApprovalDataItem;

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
 * Specifies all data, as attributes, included into the callback notification, which depends on the &#x60;event&#x60;.
 */
@ApiModel(description = "Specifies all data, as attributes, included into the callback notification, which depends on the `event`.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-24T14:43:47.118671Z[Etc/UTC]")
public class TransactionRequestApprovalData {
  public static final String SERIALIZED_NAME_PRODUCT = "product";
  @SerializedName(SERIALIZED_NAME_PRODUCT)
  private String product;

  public static final String SERIALIZED_NAME_EVENT = "event";
  @SerializedName(SERIALIZED_NAME_EVENT)
  private String event;

  public static final String SERIALIZED_NAME_ITEM = "item";
  @SerializedName(SERIALIZED_NAME_ITEM)
  private TransactionRequestApprovalDataItem item;

  public TransactionRequestApprovalData() { 
  }

  public TransactionRequestApprovalData product(String product) {
    
    this.product = product;
    return this;
  }

   /**
   * Represents the Crypto APIs 2.0 product which sends the callback.
   * @return product
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "WALLET_AS_A_SERVICE", required = true, value = "Represents the Crypto APIs 2.0 product which sends the callback.")

  public String getProduct() {
    return product;
  }


  public void setProduct(String product) {
    this.product = product;
  }


  public TransactionRequestApprovalData event(String event) {
    
    this.event = event;
    return this;
  }

   /**
   * Defines the specific event, for which a callback subscription is set.
   * @return event
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "TRANSACTION_REQUEST_APPROVAL", required = true, value = "Defines the specific event, for which a callback subscription is set.")

  public String getEvent() {
    return event;
  }


  public void setEvent(String event) {
    this.event = event;
  }


  public TransactionRequestApprovalData item(TransactionRequestApprovalDataItem item) {
    
    this.item = item;
    return this;
  }

   /**
   * Get item
   * @return item
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public TransactionRequestApprovalDataItem getItem() {
    return item;
  }


  public void setItem(TransactionRequestApprovalDataItem item) {
    this.item = item;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionRequestApprovalData transactionRequestApprovalData = (TransactionRequestApprovalData) o;
    return Objects.equals(this.product, transactionRequestApprovalData.product) &&
        Objects.equals(this.event, transactionRequestApprovalData.event) &&
        Objects.equals(this.item, transactionRequestApprovalData.item);
  }

  @Override
  public int hashCode() {
    return Objects.hash(product, event, item);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionRequestApprovalData {\n");
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
    sb.append("    event: ").append(toIndentedString(event)).append("\n");
    sb.append("    item: ").append(toIndentedString(item)).append("\n");
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
    openapiFields.add("product");
    openapiFields.add("event");
    openapiFields.add("item");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("product");
    openapiRequiredFields.add("event");
    openapiRequiredFields.add("item");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TransactionRequestApprovalData
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TransactionRequestApprovalData.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TransactionRequestApprovalData is not found in the empty JSON string", TransactionRequestApprovalData.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TransactionRequestApprovalData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TransactionRequestApprovalData` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TransactionRequestApprovalData.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("product") != null && !jsonObj.get("product").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `product` to be a primitive type in the JSON string but got `%s`", jsonObj.get("product").toString()));
      }
      if (jsonObj.get("event") != null && !jsonObj.get("event").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `event` to be a primitive type in the JSON string but got `%s`", jsonObj.get("event").toString()));
      }
      // validate the optional field `item`
      if (jsonObj.getAsJsonObject("item") != null) {
        TransactionRequestApprovalDataItem.validateJsonObject(jsonObj.getAsJsonObject("item"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TransactionRequestApprovalData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TransactionRequestApprovalData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TransactionRequestApprovalData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TransactionRequestApprovalData.class));

       return (TypeAdapter<T>) new TypeAdapter<TransactionRequestApprovalData>() {
           @Override
           public void write(JsonWriter out, TransactionRequestApprovalData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TransactionRequestApprovalData read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TransactionRequestApprovalData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TransactionRequestApprovalData
  * @throws IOException if the JSON string is invalid with respect to TransactionRequestApprovalData
  */
  public static TransactionRequestApprovalData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TransactionRequestApprovalData.class);
  }

 /**
  * Convert an instance of TransactionRequestApprovalData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

