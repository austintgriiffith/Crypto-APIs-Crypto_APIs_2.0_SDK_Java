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
 * ethereumERC721Token
 */
@ApiModel(description = "ethereumERC721Token")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-07-30T08:15:40.964553Z[Etc/UTC]")
public class AddressTokensTransactionConfirmedEachConfirmationEthereumerc721token {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SYMBOL = "symbol";
  @SerializedName(SERIALIZED_NAME_SYMBOL)
  private String symbol;

  public static final String SERIALIZED_NAME_TOKEN_ID = "tokenId";
  @SerializedName(SERIALIZED_NAME_TOKEN_ID)
  private String tokenId;

  public static final String SERIALIZED_NAME_CONTRACT_ADDRESS = "contractAddress";
  @SerializedName(SERIALIZED_NAME_CONTRACT_ADDRESS)
  private String contractAddress;


  public AddressTokensTransactionConfirmedEachConfirmationEthereumerc721token name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Specifies the name of the token.
   * @return name
  **/
  @ApiModelProperty(example = "CryptoKitties", required = true, value = "Specifies the name of the token.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public AddressTokensTransactionConfirmedEachConfirmationEthereumerc721token symbol(String symbol) {
    
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


  public AddressTokensTransactionConfirmedEachConfirmationEthereumerc721token tokenId(String tokenId) {
    
    this.tokenId = tokenId;
    return this;
  }

   /**
   * Specifies the ID of the token.
   * @return tokenId
  **/
  @ApiModelProperty(example = "1395571", required = true, value = "Specifies the ID of the token.")

  public String getTokenId() {
    return tokenId;
  }


  public void setTokenId(String tokenId) {
    this.tokenId = tokenId;
  }


  public AddressTokensTransactionConfirmedEachConfirmationEthereumerc721token contractAddress(String contractAddress) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddressTokensTransactionConfirmedEachConfirmationEthereumerc721token addressTokensTransactionConfirmedEachConfirmationEthereumerc721token = (AddressTokensTransactionConfirmedEachConfirmationEthereumerc721token) o;
    return Objects.equals(this.name, addressTokensTransactionConfirmedEachConfirmationEthereumerc721token.name) &&
        Objects.equals(this.symbol, addressTokensTransactionConfirmedEachConfirmationEthereumerc721token.symbol) &&
        Objects.equals(this.tokenId, addressTokensTransactionConfirmedEachConfirmationEthereumerc721token.tokenId) &&
        Objects.equals(this.contractAddress, addressTokensTransactionConfirmedEachConfirmationEthereumerc721token.contractAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, symbol, tokenId, contractAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddressTokensTransactionConfirmedEachConfirmationEthereumerc721token {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    tokenId: ").append(toIndentedString(tokenId)).append("\n");
    sb.append("    contractAddress: ").append(toIndentedString(contractAddress)).append("\n");
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

