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
import org.openapitools.client.model.AddTokensToExistingFromAddressRBTokenDataBitcoinOmniToken;
import org.openapitools.client.model.AddTokensToExistingFromAddressRBTokenDataEthereumToken;

import javax.ws.rs.core.GenericType;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.JsonPrimitive;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

import io.cryptoapis.sdk.JSON;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-24T14:43:47.118671Z[Etc/UTC]")
public class AddTokensToExistingFromAddressRBTokenData extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(AddTokensToExistingFromAddressRBTokenData.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!AddTokensToExistingFromAddressRBTokenData.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'AddTokensToExistingFromAddressRBTokenData' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<AddTokensToExistingFromAddressRBTokenDataBitcoinOmniToken> adapterAddTokensToExistingFromAddressRBTokenDataBitcoinOmniToken = gson.getDelegateAdapter(this, TypeToken.get(AddTokensToExistingFromAddressRBTokenDataBitcoinOmniToken.class));
            final TypeAdapter<AddTokensToExistingFromAddressRBTokenDataEthereumToken> adapterAddTokensToExistingFromAddressRBTokenDataEthereumToken = gson.getDelegateAdapter(this, TypeToken.get(AddTokensToExistingFromAddressRBTokenDataEthereumToken.class));

            return (TypeAdapter<T>) new TypeAdapter<AddTokensToExistingFromAddressRBTokenData>() {
                @Override
                public void write(JsonWriter out, AddTokensToExistingFromAddressRBTokenData value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `AddTokensToExistingFromAddressRBTokenDataBitcoinOmniToken`
                    if (value.getActualInstance() instanceof AddTokensToExistingFromAddressRBTokenDataBitcoinOmniToken) {
                        JsonObject obj = adapterAddTokensToExistingFromAddressRBTokenDataBitcoinOmniToken.toJsonTree((AddTokensToExistingFromAddressRBTokenDataBitcoinOmniToken)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `AddTokensToExistingFromAddressRBTokenDataEthereumToken`
                    if (value.getActualInstance() instanceof AddTokensToExistingFromAddressRBTokenDataEthereumToken) {
                        JsonObject obj = adapterAddTokensToExistingFromAddressRBTokenDataEthereumToken.toJsonTree((AddTokensToExistingFromAddressRBTokenDataEthereumToken)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: AddTokensToExistingFromAddressRBTokenDataBitcoinOmniToken, AddTokensToExistingFromAddressRBTokenDataEthereumToken");
                }

                @Override
                public AddTokensToExistingFromAddressRBTokenData read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonObject jsonObject = elementAdapter.read(in).getAsJsonObject();

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize AddTokensToExistingFromAddressRBTokenDataBitcoinOmniToken
                    try {
                        // validate the JSON object to see if any exception is thrown
                        AddTokensToExistingFromAddressRBTokenDataBitcoinOmniToken.validateJsonObject(jsonObject);
                        actualAdapter = adapterAddTokensToExistingFromAddressRBTokenDataBitcoinOmniToken;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'AddTokensToExistingFromAddressRBTokenDataBitcoinOmniToken'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for AddTokensToExistingFromAddressRBTokenDataBitcoinOmniToken failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'AddTokensToExistingFromAddressRBTokenDataBitcoinOmniToken'", e);
                    }

                    // deserialize AddTokensToExistingFromAddressRBTokenDataEthereumToken
                    try {
                        // validate the JSON object to see if any exception is thrown
                        AddTokensToExistingFromAddressRBTokenDataEthereumToken.validateJsonObject(jsonObject);
                        actualAdapter = adapterAddTokensToExistingFromAddressRBTokenDataEthereumToken;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'AddTokensToExistingFromAddressRBTokenDataEthereumToken'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for AddTokensToExistingFromAddressRBTokenDataEthereumToken failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'AddTokensToExistingFromAddressRBTokenDataEthereumToken'", e);
                    }

                    if (match == 1) {
                        AddTokensToExistingFromAddressRBTokenData ret = new AddTokensToExistingFromAddressRBTokenData();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonObject));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for AddTokensToExistingFromAddressRBTokenData: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonObject.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public AddTokensToExistingFromAddressRBTokenData() {
        super("oneOf", Boolean.FALSE);
    }

    public AddTokensToExistingFromAddressRBTokenData(AddTokensToExistingFromAddressRBTokenDataBitcoinOmniToken o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public AddTokensToExistingFromAddressRBTokenData(AddTokensToExistingFromAddressRBTokenDataEthereumToken o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("AddTokensToExistingFromAddressRBTokenDataBitcoinOmniToken", new GenericType<AddTokensToExistingFromAddressRBTokenDataBitcoinOmniToken>() {
        });
        schemas.put("AddTokensToExistingFromAddressRBTokenDataEthereumToken", new GenericType<AddTokensToExistingFromAddressRBTokenDataEthereumToken>() {
        });
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return AddTokensToExistingFromAddressRBTokenData.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * AddTokensToExistingFromAddressRBTokenDataBitcoinOmniToken, AddTokensToExistingFromAddressRBTokenDataEthereumToken
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof AddTokensToExistingFromAddressRBTokenDataBitcoinOmniToken) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof AddTokensToExistingFromAddressRBTokenDataEthereumToken) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be AddTokensToExistingFromAddressRBTokenDataBitcoinOmniToken, AddTokensToExistingFromAddressRBTokenDataEthereumToken");
    }

    /**
     * Get the actual instance, which can be the following:
     * AddTokensToExistingFromAddressRBTokenDataBitcoinOmniToken, AddTokensToExistingFromAddressRBTokenDataEthereumToken
     *
     * @return The actual instance (AddTokensToExistingFromAddressRBTokenDataBitcoinOmniToken, AddTokensToExistingFromAddressRBTokenDataEthereumToken)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `AddTokensToExistingFromAddressRBTokenDataBitcoinOmniToken`. If the actual instance is not `AddTokensToExistingFromAddressRBTokenDataBitcoinOmniToken`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `AddTokensToExistingFromAddressRBTokenDataBitcoinOmniToken`
     * @throws ClassCastException if the instance is not `AddTokensToExistingFromAddressRBTokenDataBitcoinOmniToken`
     */
    public AddTokensToExistingFromAddressRBTokenDataBitcoinOmniToken getAddTokensToExistingFromAddressRBTokenDataBitcoinOmniToken() throws ClassCastException {
        return (AddTokensToExistingFromAddressRBTokenDataBitcoinOmniToken)super.getActualInstance();
    }

    /**
     * Get the actual instance of `AddTokensToExistingFromAddressRBTokenDataEthereumToken`. If the actual instance is not `AddTokensToExistingFromAddressRBTokenDataEthereumToken`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `AddTokensToExistingFromAddressRBTokenDataEthereumToken`
     * @throws ClassCastException if the instance is not `AddTokensToExistingFromAddressRBTokenDataEthereumToken`
     */
    public AddTokensToExistingFromAddressRBTokenDataEthereumToken getAddTokensToExistingFromAddressRBTokenDataEthereumToken() throws ClassCastException {
        return (AddTokensToExistingFromAddressRBTokenDataEthereumToken)super.getActualInstance();
    }


 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AddTokensToExistingFromAddressRBTokenData
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    // validate oneOf schemas one by one
    int validCount = 0;
    ArrayList<String> errorMessages = new ArrayList<>();
    // validate the json string with AddTokensToExistingFromAddressRBTokenDataBitcoinOmniToken
    try {
      AddTokensToExistingFromAddressRBTokenDataBitcoinOmniToken.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for AddTokensToExistingFromAddressRBTokenDataBitcoinOmniToken failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with AddTokensToExistingFromAddressRBTokenDataEthereumToken
    try {
      AddTokensToExistingFromAddressRBTokenDataEthereumToken.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for AddTokensToExistingFromAddressRBTokenDataEthereumToken failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    if (validCount != 1) {
      throw new IOException(String.format("The JSON string is invalid for AddTokensToExistingFromAddressRBTokenData with oneOf schemas: AddTokensToExistingFromAddressRBTokenDataBitcoinOmniToken, AddTokensToExistingFromAddressRBTokenDataEthereumToken. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonObj.toString()));
    }
  }

 /**
  * Create an instance of AddTokensToExistingFromAddressRBTokenData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AddTokensToExistingFromAddressRBTokenData
  * @throws IOException if the JSON string is invalid with respect to AddTokensToExistingFromAddressRBTokenData
  */
  public static AddTokensToExistingFromAddressRBTokenData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AddTokensToExistingFromAddressRBTokenData.class);
  }

 /**
  * Convert an instance of AddTokensToExistingFromAddressRBTokenData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

