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
import org.openapitools.client.model.AddressTokensTransactionConfirmedEthereumerc20token;
import org.openapitools.client.model.AddressTokensTransactionConfirmedEthereumerc721token;
import org.openapitools.client.model.AddressTokensTransactionConfirmedOmnilayertoken;

/**
 * AddressTokensTransactionConfirmedToken
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-07-20T13:36:32.071127Z[Etc/UTC]")
public class AddressTokensTransactionConfirmedToken {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SYMBOL = "symbol";
  @SerializedName(SERIALIZED_NAME_SYMBOL)
  private String symbol;

  public static final String SERIALIZED_NAME_DECIMALS = "decimals";
  @SerializedName(SERIALIZED_NAME_DECIMALS)
  private String decimals;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private String amount;

  public static final String SERIALIZED_NAME_CONTRACT_ADDRESS = "contractAddress";
  @SerializedName(SERIALIZED_NAME_CONTRACT_ADDRESS)
  private String contractAddress;

  public static final String SERIALIZED_NAME_TOKEN_ID = "tokenId";
  @SerializedName(SERIALIZED_NAME_TOKEN_ID)
  private String tokenId;

  public static final String SERIALIZED_NAME_PROPERTY_ID = "propertyId";
  @SerializedName(SERIALIZED_NAME_PROPERTY_ID)
  private String propertyId;

  public static final String SERIALIZED_NAME_TRANSACTION_TYPE = "transactionType";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_TYPE)
  private String transactionType;

  public static final String SERIALIZED_NAME_CREATED_BY_TRANSACTION_ID = "createdByTransactionId";
  @SerializedName(SERIALIZED_NAME_CREATED_BY_TRANSACTION_ID)
  private String createdByTransactionId;


  public AddressTokensTransactionConfirmedToken name(String name) {
    
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


  public AddressTokensTransactionConfirmedToken symbol(String symbol) {
    
    this.symbol = symbol;
    return this;
  }

   /**
   * Specifies an identifier of the token, where up to five alphanumeric characters can be used for it.
   * @return symbol
  **/
  @ApiModelProperty(example = "CK", required = true, value = "Specifies an identifier of the token, where up to five alphanumeric characters can be used for it.")

  public String getSymbol() {
    return symbol;
  }


  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }


  public AddressTokensTransactionConfirmedToken decimals(String decimals) {
    
    this.decimals = decimals;
    return this;
  }

   /**
   * Defines how many decimals can be used to break the token.
   * @return decimals
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "5", value = "Defines how many decimals can be used to break the token.")

  public String getDecimals() {
    return decimals;
  }


  public void setDecimals(String decimals) {
    this.decimals = decimals;
  }


  public AddressTokensTransactionConfirmedToken amount(String amount) {
    
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


  public AddressTokensTransactionConfirmedToken contractAddress(String contractAddress) {
    
    this.contractAddress = contractAddress;
    return this;
  }

   /**
   * Specifies the address of the contract.
   * @return contractAddress
  **/
  @ApiModelProperty(example = "0x06012c8cf97bead5deae237070f9587f8e7a266d", required = true, value = "Specifies the address of the contract.")

  public String getContractAddress() {
    return contractAddress;
  }


  public void setContractAddress(String contractAddress) {
    this.contractAddress = contractAddress;
  }


  public AddressTokensTransactionConfirmedToken tokenId(String tokenId) {
    
    this.tokenId = tokenId;
    return this;
  }

   /**
   * Specifies the ID of the token.
   * @return tokenId
  **/
  @ApiModelProperty(example = "1895557", required = true, value = "Specifies the ID of the token.")

  public String getTokenId() {
    return tokenId;
  }


  public void setTokenId(String tokenId) {
    this.tokenId = tokenId;
  }


  public AddressTokensTransactionConfirmedToken propertyId(String propertyId) {
    
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


  public AddressTokensTransactionConfirmedToken transactionType(String transactionType) {
    
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


  public AddressTokensTransactionConfirmedToken createdByTransactionId(String createdByTransactionId) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddressTokensTransactionConfirmedToken addressTokensTransactionConfirmedToken = (AddressTokensTransactionConfirmedToken) o;
    return Objects.equals(this.name, addressTokensTransactionConfirmedToken.name) &&
        Objects.equals(this.symbol, addressTokensTransactionConfirmedToken.symbol) &&
        Objects.equals(this.decimals, addressTokensTransactionConfirmedToken.decimals) &&
        Objects.equals(this.amount, addressTokensTransactionConfirmedToken.amount) &&
        Objects.equals(this.contractAddress, addressTokensTransactionConfirmedToken.contractAddress) &&
        Objects.equals(this.tokenId, addressTokensTransactionConfirmedToken.tokenId) &&
        Objects.equals(this.propertyId, addressTokensTransactionConfirmedToken.propertyId) &&
        Objects.equals(this.transactionType, addressTokensTransactionConfirmedToken.transactionType) &&
        Objects.equals(this.createdByTransactionId, addressTokensTransactionConfirmedToken.createdByTransactionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, symbol, decimals, amount, contractAddress, tokenId, propertyId, transactionType, createdByTransactionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddressTokensTransactionConfirmedToken {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    decimals: ").append(toIndentedString(decimals)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    contractAddress: ").append(toIndentedString(contractAddress)).append("\n");
    sb.append("    tokenId: ").append(toIndentedString(tokenId)).append("\n");
    sb.append("    propertyId: ").append(toIndentedString(propertyId)).append("\n");
    sb.append("    transactionType: ").append(toIndentedString(transactionType)).append("\n");
    sb.append("    createdByTransactionId: ").append(toIndentedString(createdByTransactionId)).append("\n");
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

