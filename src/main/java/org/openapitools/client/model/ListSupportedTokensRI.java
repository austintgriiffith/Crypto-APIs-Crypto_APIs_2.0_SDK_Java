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
 * ListSupportedTokensRI
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-25T12:38:09.413192Z[Etc/UTC]")
public class ListSupportedTokensRI {
  public static final String SERIALIZED_NAME_DECIMALS = "decimals";
  @SerializedName(SERIALIZED_NAME_DECIMALS)
  private Integer decimals;

  public static final String SERIALIZED_NAME_IDENTIFIER = "identifier";
  @SerializedName(SERIALIZED_NAME_IDENTIFIER)
  private String identifier;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SYMBOL = "symbol";
  @SerializedName(SERIALIZED_NAME_SYMBOL)
  private String symbol;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;


  public ListSupportedTokensRI decimals(Integer decimals) {
    
    this.decimals = decimals;
    return this;
  }

   /**
   * Defines the token&#39;s decimal number or all of its points after the zero.
   * @return decimals
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "6", required = true, value = "Defines the token's decimal number or all of its points after the zero.")

  public Integer getDecimals() {
    return decimals;
  }


  public void setDecimals(Integer decimals) {
    this.decimals = decimals;
  }


  public ListSupportedTokensRI identifier(String identifier) {
    
    this.identifier = identifier;
    return this;
  }

   /**
   * Represents a unique identifier for the specific blockchain and network, e.g. smart contract address, property ID, etc.
   * @return identifier
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "0xdac17f958d2ee523a2206206994597c13d831ec7", required = true, value = "Represents a unique identifier for the specific blockchain and network, e.g. smart contract address, property ID, etc.")

  public String getIdentifier() {
    return identifier;
  }


  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }


  public ListSupportedTokensRI name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Defines the token name.
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Tether", required = true, value = "Defines the token name.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ListSupportedTokensRI symbol(String symbol) {
    
    this.symbol = symbol;
    return this;
  }

   /**
   * Defines the token&#39;s unique symbol in the Crypto APIs listings.
   * @return symbol
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "USDT", required = true, value = "Defines the token's unique symbol in the Crypto APIs listings.")

  public String getSymbol() {
    return symbol;
  }


  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }


  public ListSupportedTokensRI type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Represents the token&#39;s type representation, e.g. ERC-20, Omni, etc.
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "ERC-20", required = true, value = "Represents the token's type representation, e.g. ERC-20, Omni, etc.")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListSupportedTokensRI listSupportedTokensRI = (ListSupportedTokensRI) o;
    return Objects.equals(this.decimals, listSupportedTokensRI.decimals) &&
        Objects.equals(this.identifier, listSupportedTokensRI.identifier) &&
        Objects.equals(this.name, listSupportedTokensRI.name) &&
        Objects.equals(this.symbol, listSupportedTokensRI.symbol) &&
        Objects.equals(this.type, listSupportedTokensRI.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(decimals, identifier, name, symbol, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListSupportedTokensRI {\n");
    sb.append("    decimals: ").append(toIndentedString(decimals)).append("\n");
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

