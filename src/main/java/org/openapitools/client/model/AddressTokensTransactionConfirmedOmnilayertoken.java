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

/**
 * omniLayerToken
 */
@ApiModel(description = "omniLayerToken")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-07-30T08:15:40.964553Z[Etc/UTC]")
public class AddressTokensTransactionConfirmedOmnilayertoken {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PROPERTY_ID = "propertyId";
  @SerializedName(SERIALIZED_NAME_PROPERTY_ID)
  private String propertyId;

  public static final String SERIALIZED_NAME_TRANSACTION_TYPE = "transactionType";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_TYPE)
  private String transactionType;

  public static final String SERIALIZED_NAME_CREATED_BY_TRANSACTION_ID = "createdByTransactionId";
  @SerializedName(SERIALIZED_NAME_CREATED_BY_TRANSACTION_ID)
  private String createdByTransactionId;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private String amount;


  public AddressTokensTransactionConfirmedOmnilayertoken name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Specifies the name of the token.
   * @return name
  **/
  @ApiModelProperty(example = "TetherUS", required = true, value = "Specifies the name of the token.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public AddressTokensTransactionConfirmedOmnilayertoken propertyId(String propertyId) {
    
    this.propertyId = propertyId;
    return this;
  }

   /**
   * Defines the ID of the property for Omni Layer.
   * @return propertyId
  **/
  @ApiModelProperty(required = true, value = "Defines the ID of the property for Omni Layer.")

  public String getPropertyId() {
    return propertyId;
  }


  public void setPropertyId(String propertyId) {
    this.propertyId = propertyId;
  }


  public AddressTokensTransactionConfirmedOmnilayertoken transactionType(String transactionType) {
    
    this.transactionType = transactionType;
    return this;
  }

   /**
   * Defines the type of the transaction.
   * @return transactionType
  **/
  @ApiModelProperty(example = "#29", required = true, value = "Defines the type of the transaction.")

  public String getTransactionType() {
    return transactionType;
  }


  public void setTransactionType(String transactionType) {
    this.transactionType = transactionType;
  }


  public AddressTokensTransactionConfirmedOmnilayertoken createdByTransactionId(String createdByTransactionId) {
    
    this.createdByTransactionId = createdByTransactionId;
    return this;
  }

   /**
   * The transaction ID used to create the token.
   * @return createdByTransactionId
  **/
  @ApiModelProperty(example = "Simple Send, DEx Purchase etc.", required = true, value = "The transaction ID used to create the token.")

  public String getCreatedByTransactionId() {
    return createdByTransactionId;
  }


  public void setCreatedByTransactionId(String createdByTransactionId) {
    this.createdByTransactionId = createdByTransactionId;
  }


  public AddressTokensTransactionConfirmedOmnilayertoken amount(String amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * Defines the amount of tokens sent with the confirmed transaction.
   * @return amount
  **/
  @ApiModelProperty(example = "250.531586", required = true, value = "Defines the amount of tokens sent with the confirmed transaction.")

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
    AddressTokensTransactionConfirmedOmnilayertoken addressTokensTransactionConfirmedOmnilayertoken = (AddressTokensTransactionConfirmedOmnilayertoken) o;
    return Objects.equals(this.name, addressTokensTransactionConfirmedOmnilayertoken.name) &&
        Objects.equals(this.propertyId, addressTokensTransactionConfirmedOmnilayertoken.propertyId) &&
        Objects.equals(this.transactionType, addressTokensTransactionConfirmedOmnilayertoken.transactionType) &&
        Objects.equals(this.createdByTransactionId, addressTokensTransactionConfirmedOmnilayertoken.createdByTransactionId) &&
        Objects.equals(this.amount, addressTokensTransactionConfirmedOmnilayertoken.amount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, propertyId, transactionType, createdByTransactionId, amount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddressTokensTransactionConfirmedOmnilayertoken {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    propertyId: ").append(toIndentedString(propertyId)).append("\n");
    sb.append("    transactionType: ").append(toIndentedString(transactionType)).append("\n");
    sb.append("    createdByTransactionId: ").append(toIndentedString(createdByTransactionId)).append("\n");
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

}

