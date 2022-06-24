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
import org.openapitools.client.model.GetBlockDetailsByBlockHeightRIBSB;
import org.openapitools.client.model.GetBlockDetailsByBlockHeightRIBSBC;
import org.openapitools.client.model.GetBlockDetailsByBlockHeightRIBSBSC;
import org.openapitools.client.model.GetBlockDetailsByBlockHeightRIBSD;
import org.openapitools.client.model.GetBlockDetailsByBlockHeightRIBSD2;
import org.openapitools.client.model.GetBlockDetailsByBlockHeightRIBSE;
import org.openapitools.client.model.GetBlockDetailsByBlockHeightRIBSEC;
import org.openapitools.client.model.GetBlockDetailsByBlockHeightRIBSL;
import org.openapitools.client.model.GetBlockDetailsByBlockHeightRIBSZ;

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
public class GetBlockDetailsByBlockHeightRIBS extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(GetBlockDetailsByBlockHeightRIBS.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!GetBlockDetailsByBlockHeightRIBS.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'GetBlockDetailsByBlockHeightRIBS' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<GetBlockDetailsByBlockHeightRIBSB> adapterGetBlockDetailsByBlockHeightRIBSB = gson.getDelegateAdapter(this, TypeToken.get(GetBlockDetailsByBlockHeightRIBSB.class));
            final TypeAdapter<GetBlockDetailsByBlockHeightRIBSBC> adapterGetBlockDetailsByBlockHeightRIBSBC = gson.getDelegateAdapter(this, TypeToken.get(GetBlockDetailsByBlockHeightRIBSBC.class));
            final TypeAdapter<GetBlockDetailsByBlockHeightRIBSBSC> adapterGetBlockDetailsByBlockHeightRIBSBSC = gson.getDelegateAdapter(this, TypeToken.get(GetBlockDetailsByBlockHeightRIBSBSC.class));
            final TypeAdapter<GetBlockDetailsByBlockHeightRIBSD> adapterGetBlockDetailsByBlockHeightRIBSD = gson.getDelegateAdapter(this, TypeToken.get(GetBlockDetailsByBlockHeightRIBSD.class));
            final TypeAdapter<GetBlockDetailsByBlockHeightRIBSD2> adapterGetBlockDetailsByBlockHeightRIBSD2 = gson.getDelegateAdapter(this, TypeToken.get(GetBlockDetailsByBlockHeightRIBSD2.class));
            final TypeAdapter<GetBlockDetailsByBlockHeightRIBSE> adapterGetBlockDetailsByBlockHeightRIBSE = gson.getDelegateAdapter(this, TypeToken.get(GetBlockDetailsByBlockHeightRIBSE.class));
            final TypeAdapter<GetBlockDetailsByBlockHeightRIBSEC> adapterGetBlockDetailsByBlockHeightRIBSEC = gson.getDelegateAdapter(this, TypeToken.get(GetBlockDetailsByBlockHeightRIBSEC.class));
            final TypeAdapter<GetBlockDetailsByBlockHeightRIBSL> adapterGetBlockDetailsByBlockHeightRIBSL = gson.getDelegateAdapter(this, TypeToken.get(GetBlockDetailsByBlockHeightRIBSL.class));
            final TypeAdapter<GetBlockDetailsByBlockHeightRIBSZ> adapterGetBlockDetailsByBlockHeightRIBSZ = gson.getDelegateAdapter(this, TypeToken.get(GetBlockDetailsByBlockHeightRIBSZ.class));

            return (TypeAdapter<T>) new TypeAdapter<GetBlockDetailsByBlockHeightRIBS>() {
                @Override
                public void write(JsonWriter out, GetBlockDetailsByBlockHeightRIBS value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `GetBlockDetailsByBlockHeightRIBSB`
                    if (value.getActualInstance() instanceof GetBlockDetailsByBlockHeightRIBSB) {
                        JsonObject obj = adapterGetBlockDetailsByBlockHeightRIBSB.toJsonTree((GetBlockDetailsByBlockHeightRIBSB)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `GetBlockDetailsByBlockHeightRIBSBC`
                    if (value.getActualInstance() instanceof GetBlockDetailsByBlockHeightRIBSBC) {
                        JsonObject obj = adapterGetBlockDetailsByBlockHeightRIBSBC.toJsonTree((GetBlockDetailsByBlockHeightRIBSBC)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `GetBlockDetailsByBlockHeightRIBSBSC`
                    if (value.getActualInstance() instanceof GetBlockDetailsByBlockHeightRIBSBSC) {
                        JsonObject obj = adapterGetBlockDetailsByBlockHeightRIBSBSC.toJsonTree((GetBlockDetailsByBlockHeightRIBSBSC)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `GetBlockDetailsByBlockHeightRIBSD`
                    if (value.getActualInstance() instanceof GetBlockDetailsByBlockHeightRIBSD) {
                        JsonObject obj = adapterGetBlockDetailsByBlockHeightRIBSD.toJsonTree((GetBlockDetailsByBlockHeightRIBSD)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `GetBlockDetailsByBlockHeightRIBSD2`
                    if (value.getActualInstance() instanceof GetBlockDetailsByBlockHeightRIBSD2) {
                        JsonObject obj = adapterGetBlockDetailsByBlockHeightRIBSD2.toJsonTree((GetBlockDetailsByBlockHeightRIBSD2)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `GetBlockDetailsByBlockHeightRIBSE`
                    if (value.getActualInstance() instanceof GetBlockDetailsByBlockHeightRIBSE) {
                        JsonObject obj = adapterGetBlockDetailsByBlockHeightRIBSE.toJsonTree((GetBlockDetailsByBlockHeightRIBSE)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `GetBlockDetailsByBlockHeightRIBSEC`
                    if (value.getActualInstance() instanceof GetBlockDetailsByBlockHeightRIBSEC) {
                        JsonObject obj = adapterGetBlockDetailsByBlockHeightRIBSEC.toJsonTree((GetBlockDetailsByBlockHeightRIBSEC)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `GetBlockDetailsByBlockHeightRIBSL`
                    if (value.getActualInstance() instanceof GetBlockDetailsByBlockHeightRIBSL) {
                        JsonObject obj = adapterGetBlockDetailsByBlockHeightRIBSL.toJsonTree((GetBlockDetailsByBlockHeightRIBSL)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `GetBlockDetailsByBlockHeightRIBSZ`
                    if (value.getActualInstance() instanceof GetBlockDetailsByBlockHeightRIBSZ) {
                        JsonObject obj = adapterGetBlockDetailsByBlockHeightRIBSZ.toJsonTree((GetBlockDetailsByBlockHeightRIBSZ)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: GetBlockDetailsByBlockHeightRIBSB, GetBlockDetailsByBlockHeightRIBSBC, GetBlockDetailsByBlockHeightRIBSBSC, GetBlockDetailsByBlockHeightRIBSD, GetBlockDetailsByBlockHeightRIBSD2, GetBlockDetailsByBlockHeightRIBSE, GetBlockDetailsByBlockHeightRIBSEC, GetBlockDetailsByBlockHeightRIBSL, GetBlockDetailsByBlockHeightRIBSZ");
                }

                @Override
                public GetBlockDetailsByBlockHeightRIBS read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonObject jsonObject = elementAdapter.read(in).getAsJsonObject();

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize GetBlockDetailsByBlockHeightRIBSB
                    try {
                        // validate the JSON object to see if any exception is thrown
                        GetBlockDetailsByBlockHeightRIBSB.validateJsonObject(jsonObject);
                        actualAdapter = adapterGetBlockDetailsByBlockHeightRIBSB;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'GetBlockDetailsByBlockHeightRIBSB'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for GetBlockDetailsByBlockHeightRIBSB failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'GetBlockDetailsByBlockHeightRIBSB'", e);
                    }

                    // deserialize GetBlockDetailsByBlockHeightRIBSBC
                    try {
                        // validate the JSON object to see if any exception is thrown
                        GetBlockDetailsByBlockHeightRIBSBC.validateJsonObject(jsonObject);
                        actualAdapter = adapterGetBlockDetailsByBlockHeightRIBSBC;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'GetBlockDetailsByBlockHeightRIBSBC'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for GetBlockDetailsByBlockHeightRIBSBC failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'GetBlockDetailsByBlockHeightRIBSBC'", e);
                    }

                    // deserialize GetBlockDetailsByBlockHeightRIBSBSC
                    try {
                        // validate the JSON object to see if any exception is thrown
                        GetBlockDetailsByBlockHeightRIBSBSC.validateJsonObject(jsonObject);
                        actualAdapter = adapterGetBlockDetailsByBlockHeightRIBSBSC;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'GetBlockDetailsByBlockHeightRIBSBSC'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for GetBlockDetailsByBlockHeightRIBSBSC failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'GetBlockDetailsByBlockHeightRIBSBSC'", e);
                    }

                    // deserialize GetBlockDetailsByBlockHeightRIBSD
                    try {
                        // validate the JSON object to see if any exception is thrown
                        GetBlockDetailsByBlockHeightRIBSD.validateJsonObject(jsonObject);
                        actualAdapter = adapterGetBlockDetailsByBlockHeightRIBSD;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'GetBlockDetailsByBlockHeightRIBSD'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for GetBlockDetailsByBlockHeightRIBSD failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'GetBlockDetailsByBlockHeightRIBSD'", e);
                    }

                    // deserialize GetBlockDetailsByBlockHeightRIBSD2
                    try {
                        // validate the JSON object to see if any exception is thrown
                        GetBlockDetailsByBlockHeightRIBSD2.validateJsonObject(jsonObject);
                        actualAdapter = adapterGetBlockDetailsByBlockHeightRIBSD2;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'GetBlockDetailsByBlockHeightRIBSD2'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for GetBlockDetailsByBlockHeightRIBSD2 failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'GetBlockDetailsByBlockHeightRIBSD2'", e);
                    }

                    // deserialize GetBlockDetailsByBlockHeightRIBSE
                    try {
                        // validate the JSON object to see if any exception is thrown
                        GetBlockDetailsByBlockHeightRIBSE.validateJsonObject(jsonObject);
                        actualAdapter = adapterGetBlockDetailsByBlockHeightRIBSE;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'GetBlockDetailsByBlockHeightRIBSE'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for GetBlockDetailsByBlockHeightRIBSE failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'GetBlockDetailsByBlockHeightRIBSE'", e);
                    }

                    // deserialize GetBlockDetailsByBlockHeightRIBSEC
                    try {
                        // validate the JSON object to see if any exception is thrown
                        GetBlockDetailsByBlockHeightRIBSEC.validateJsonObject(jsonObject);
                        actualAdapter = adapterGetBlockDetailsByBlockHeightRIBSEC;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'GetBlockDetailsByBlockHeightRIBSEC'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for GetBlockDetailsByBlockHeightRIBSEC failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'GetBlockDetailsByBlockHeightRIBSEC'", e);
                    }

                    // deserialize GetBlockDetailsByBlockHeightRIBSL
                    try {
                        // validate the JSON object to see if any exception is thrown
                        GetBlockDetailsByBlockHeightRIBSL.validateJsonObject(jsonObject);
                        actualAdapter = adapterGetBlockDetailsByBlockHeightRIBSL;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'GetBlockDetailsByBlockHeightRIBSL'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for GetBlockDetailsByBlockHeightRIBSL failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'GetBlockDetailsByBlockHeightRIBSL'", e);
                    }

                    // deserialize GetBlockDetailsByBlockHeightRIBSZ
                    try {
                        // validate the JSON object to see if any exception is thrown
                        GetBlockDetailsByBlockHeightRIBSZ.validateJsonObject(jsonObject);
                        actualAdapter = adapterGetBlockDetailsByBlockHeightRIBSZ;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'GetBlockDetailsByBlockHeightRIBSZ'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for GetBlockDetailsByBlockHeightRIBSZ failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'GetBlockDetailsByBlockHeightRIBSZ'", e);
                    }

                    if (match == 1) {
                        GetBlockDetailsByBlockHeightRIBS ret = new GetBlockDetailsByBlockHeightRIBS();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonObject));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for GetBlockDetailsByBlockHeightRIBS: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonObject.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public GetBlockDetailsByBlockHeightRIBS() {
        super("oneOf", Boolean.FALSE);
    }

    public GetBlockDetailsByBlockHeightRIBS(GetBlockDetailsByBlockHeightRIBSB o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public GetBlockDetailsByBlockHeightRIBS(GetBlockDetailsByBlockHeightRIBSBC o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public GetBlockDetailsByBlockHeightRIBS(GetBlockDetailsByBlockHeightRIBSBSC o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public GetBlockDetailsByBlockHeightRIBS(GetBlockDetailsByBlockHeightRIBSD o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public GetBlockDetailsByBlockHeightRIBS(GetBlockDetailsByBlockHeightRIBSD2 o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public GetBlockDetailsByBlockHeightRIBS(GetBlockDetailsByBlockHeightRIBSE o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public GetBlockDetailsByBlockHeightRIBS(GetBlockDetailsByBlockHeightRIBSEC o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public GetBlockDetailsByBlockHeightRIBS(GetBlockDetailsByBlockHeightRIBSL o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public GetBlockDetailsByBlockHeightRIBS(GetBlockDetailsByBlockHeightRIBSZ o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("GetBlockDetailsByBlockHeightRIBSB", new GenericType<GetBlockDetailsByBlockHeightRIBSB>() {
        });
        schemas.put("GetBlockDetailsByBlockHeightRIBSBC", new GenericType<GetBlockDetailsByBlockHeightRIBSBC>() {
        });
        schemas.put("GetBlockDetailsByBlockHeightRIBSBSC", new GenericType<GetBlockDetailsByBlockHeightRIBSBSC>() {
        });
        schemas.put("GetBlockDetailsByBlockHeightRIBSD", new GenericType<GetBlockDetailsByBlockHeightRIBSD>() {
        });
        schemas.put("GetBlockDetailsByBlockHeightRIBSD2", new GenericType<GetBlockDetailsByBlockHeightRIBSD2>() {
        });
        schemas.put("GetBlockDetailsByBlockHeightRIBSE", new GenericType<GetBlockDetailsByBlockHeightRIBSE>() {
        });
        schemas.put("GetBlockDetailsByBlockHeightRIBSEC", new GenericType<GetBlockDetailsByBlockHeightRIBSEC>() {
        });
        schemas.put("GetBlockDetailsByBlockHeightRIBSL", new GenericType<GetBlockDetailsByBlockHeightRIBSL>() {
        });
        schemas.put("GetBlockDetailsByBlockHeightRIBSZ", new GenericType<GetBlockDetailsByBlockHeightRIBSZ>() {
        });
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return GetBlockDetailsByBlockHeightRIBS.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * GetBlockDetailsByBlockHeightRIBSB, GetBlockDetailsByBlockHeightRIBSBC, GetBlockDetailsByBlockHeightRIBSBSC, GetBlockDetailsByBlockHeightRIBSD, GetBlockDetailsByBlockHeightRIBSD2, GetBlockDetailsByBlockHeightRIBSE, GetBlockDetailsByBlockHeightRIBSEC, GetBlockDetailsByBlockHeightRIBSL, GetBlockDetailsByBlockHeightRIBSZ
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof GetBlockDetailsByBlockHeightRIBSB) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof GetBlockDetailsByBlockHeightRIBSBC) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof GetBlockDetailsByBlockHeightRIBSBSC) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof GetBlockDetailsByBlockHeightRIBSD) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof GetBlockDetailsByBlockHeightRIBSD2) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof GetBlockDetailsByBlockHeightRIBSE) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof GetBlockDetailsByBlockHeightRIBSEC) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof GetBlockDetailsByBlockHeightRIBSL) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof GetBlockDetailsByBlockHeightRIBSZ) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be GetBlockDetailsByBlockHeightRIBSB, GetBlockDetailsByBlockHeightRIBSBC, GetBlockDetailsByBlockHeightRIBSBSC, GetBlockDetailsByBlockHeightRIBSD, GetBlockDetailsByBlockHeightRIBSD2, GetBlockDetailsByBlockHeightRIBSE, GetBlockDetailsByBlockHeightRIBSEC, GetBlockDetailsByBlockHeightRIBSL, GetBlockDetailsByBlockHeightRIBSZ");
    }

    /**
     * Get the actual instance, which can be the following:
     * GetBlockDetailsByBlockHeightRIBSB, GetBlockDetailsByBlockHeightRIBSBC, GetBlockDetailsByBlockHeightRIBSBSC, GetBlockDetailsByBlockHeightRIBSD, GetBlockDetailsByBlockHeightRIBSD2, GetBlockDetailsByBlockHeightRIBSE, GetBlockDetailsByBlockHeightRIBSEC, GetBlockDetailsByBlockHeightRIBSL, GetBlockDetailsByBlockHeightRIBSZ
     *
     * @return The actual instance (GetBlockDetailsByBlockHeightRIBSB, GetBlockDetailsByBlockHeightRIBSBC, GetBlockDetailsByBlockHeightRIBSBSC, GetBlockDetailsByBlockHeightRIBSD, GetBlockDetailsByBlockHeightRIBSD2, GetBlockDetailsByBlockHeightRIBSE, GetBlockDetailsByBlockHeightRIBSEC, GetBlockDetailsByBlockHeightRIBSL, GetBlockDetailsByBlockHeightRIBSZ)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `GetBlockDetailsByBlockHeightRIBSB`. If the actual instance is not `GetBlockDetailsByBlockHeightRIBSB`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `GetBlockDetailsByBlockHeightRIBSB`
     * @throws ClassCastException if the instance is not `GetBlockDetailsByBlockHeightRIBSB`
     */
    public GetBlockDetailsByBlockHeightRIBSB getGetBlockDetailsByBlockHeightRIBSB() throws ClassCastException {
        return (GetBlockDetailsByBlockHeightRIBSB)super.getActualInstance();
    }

    /**
     * Get the actual instance of `GetBlockDetailsByBlockHeightRIBSBC`. If the actual instance is not `GetBlockDetailsByBlockHeightRIBSBC`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `GetBlockDetailsByBlockHeightRIBSBC`
     * @throws ClassCastException if the instance is not `GetBlockDetailsByBlockHeightRIBSBC`
     */
    public GetBlockDetailsByBlockHeightRIBSBC getGetBlockDetailsByBlockHeightRIBSBC() throws ClassCastException {
        return (GetBlockDetailsByBlockHeightRIBSBC)super.getActualInstance();
    }

    /**
     * Get the actual instance of `GetBlockDetailsByBlockHeightRIBSBSC`. If the actual instance is not `GetBlockDetailsByBlockHeightRIBSBSC`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `GetBlockDetailsByBlockHeightRIBSBSC`
     * @throws ClassCastException if the instance is not `GetBlockDetailsByBlockHeightRIBSBSC`
     */
    public GetBlockDetailsByBlockHeightRIBSBSC getGetBlockDetailsByBlockHeightRIBSBSC() throws ClassCastException {
        return (GetBlockDetailsByBlockHeightRIBSBSC)super.getActualInstance();
    }

    /**
     * Get the actual instance of `GetBlockDetailsByBlockHeightRIBSD`. If the actual instance is not `GetBlockDetailsByBlockHeightRIBSD`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `GetBlockDetailsByBlockHeightRIBSD`
     * @throws ClassCastException if the instance is not `GetBlockDetailsByBlockHeightRIBSD`
     */
    public GetBlockDetailsByBlockHeightRIBSD getGetBlockDetailsByBlockHeightRIBSD() throws ClassCastException {
        return (GetBlockDetailsByBlockHeightRIBSD)super.getActualInstance();
    }

    /**
     * Get the actual instance of `GetBlockDetailsByBlockHeightRIBSD2`. If the actual instance is not `GetBlockDetailsByBlockHeightRIBSD2`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `GetBlockDetailsByBlockHeightRIBSD2`
     * @throws ClassCastException if the instance is not `GetBlockDetailsByBlockHeightRIBSD2`
     */
    public GetBlockDetailsByBlockHeightRIBSD2 getGetBlockDetailsByBlockHeightRIBSD2() throws ClassCastException {
        return (GetBlockDetailsByBlockHeightRIBSD2)super.getActualInstance();
    }

    /**
     * Get the actual instance of `GetBlockDetailsByBlockHeightRIBSE`. If the actual instance is not `GetBlockDetailsByBlockHeightRIBSE`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `GetBlockDetailsByBlockHeightRIBSE`
     * @throws ClassCastException if the instance is not `GetBlockDetailsByBlockHeightRIBSE`
     */
    public GetBlockDetailsByBlockHeightRIBSE getGetBlockDetailsByBlockHeightRIBSE() throws ClassCastException {
        return (GetBlockDetailsByBlockHeightRIBSE)super.getActualInstance();
    }

    /**
     * Get the actual instance of `GetBlockDetailsByBlockHeightRIBSEC`. If the actual instance is not `GetBlockDetailsByBlockHeightRIBSEC`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `GetBlockDetailsByBlockHeightRIBSEC`
     * @throws ClassCastException if the instance is not `GetBlockDetailsByBlockHeightRIBSEC`
     */
    public GetBlockDetailsByBlockHeightRIBSEC getGetBlockDetailsByBlockHeightRIBSEC() throws ClassCastException {
        return (GetBlockDetailsByBlockHeightRIBSEC)super.getActualInstance();
    }

    /**
     * Get the actual instance of `GetBlockDetailsByBlockHeightRIBSL`. If the actual instance is not `GetBlockDetailsByBlockHeightRIBSL`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `GetBlockDetailsByBlockHeightRIBSL`
     * @throws ClassCastException if the instance is not `GetBlockDetailsByBlockHeightRIBSL`
     */
    public GetBlockDetailsByBlockHeightRIBSL getGetBlockDetailsByBlockHeightRIBSL() throws ClassCastException {
        return (GetBlockDetailsByBlockHeightRIBSL)super.getActualInstance();
    }

    /**
     * Get the actual instance of `GetBlockDetailsByBlockHeightRIBSZ`. If the actual instance is not `GetBlockDetailsByBlockHeightRIBSZ`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `GetBlockDetailsByBlockHeightRIBSZ`
     * @throws ClassCastException if the instance is not `GetBlockDetailsByBlockHeightRIBSZ`
     */
    public GetBlockDetailsByBlockHeightRIBSZ getGetBlockDetailsByBlockHeightRIBSZ() throws ClassCastException {
        return (GetBlockDetailsByBlockHeightRIBSZ)super.getActualInstance();
    }


 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GetBlockDetailsByBlockHeightRIBS
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    // validate oneOf schemas one by one
    int validCount = 0;
    ArrayList<String> errorMessages = new ArrayList<>();
    // validate the json string with GetBlockDetailsByBlockHeightRIBSB
    try {
      GetBlockDetailsByBlockHeightRIBSB.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for GetBlockDetailsByBlockHeightRIBSB failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with GetBlockDetailsByBlockHeightRIBSBC
    try {
      GetBlockDetailsByBlockHeightRIBSBC.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for GetBlockDetailsByBlockHeightRIBSBC failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with GetBlockDetailsByBlockHeightRIBSBSC
    try {
      GetBlockDetailsByBlockHeightRIBSBSC.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for GetBlockDetailsByBlockHeightRIBSBSC failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with GetBlockDetailsByBlockHeightRIBSD
    try {
      GetBlockDetailsByBlockHeightRIBSD.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for GetBlockDetailsByBlockHeightRIBSD failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with GetBlockDetailsByBlockHeightRIBSD2
    try {
      GetBlockDetailsByBlockHeightRIBSD2.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for GetBlockDetailsByBlockHeightRIBSD2 failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with GetBlockDetailsByBlockHeightRIBSE
    try {
      GetBlockDetailsByBlockHeightRIBSE.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for GetBlockDetailsByBlockHeightRIBSE failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with GetBlockDetailsByBlockHeightRIBSEC
    try {
      GetBlockDetailsByBlockHeightRIBSEC.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for GetBlockDetailsByBlockHeightRIBSEC failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with GetBlockDetailsByBlockHeightRIBSL
    try {
      GetBlockDetailsByBlockHeightRIBSL.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for GetBlockDetailsByBlockHeightRIBSL failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with GetBlockDetailsByBlockHeightRIBSZ
    try {
      GetBlockDetailsByBlockHeightRIBSZ.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for GetBlockDetailsByBlockHeightRIBSZ failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    if (validCount != 1) {
      throw new IOException(String.format("The JSON string is invalid for GetBlockDetailsByBlockHeightRIBS with oneOf schemas: GetBlockDetailsByBlockHeightRIBSB, GetBlockDetailsByBlockHeightRIBSBC, GetBlockDetailsByBlockHeightRIBSBSC, GetBlockDetailsByBlockHeightRIBSD, GetBlockDetailsByBlockHeightRIBSD2, GetBlockDetailsByBlockHeightRIBSE, GetBlockDetailsByBlockHeightRIBSEC, GetBlockDetailsByBlockHeightRIBSL, GetBlockDetailsByBlockHeightRIBSZ. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonObj.toString()));
    }
  }

 /**
  * Create an instance of GetBlockDetailsByBlockHeightRIBS given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetBlockDetailsByBlockHeightRIBS
  * @throws IOException if the JSON string is invalid with respect to GetBlockDetailsByBlockHeightRIBS
  */
  public static GetBlockDetailsByBlockHeightRIBS fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetBlockDetailsByBlockHeightRIBS.class);
  }

 /**
  * Convert an instance of GetBlockDetailsByBlockHeightRIBS to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

