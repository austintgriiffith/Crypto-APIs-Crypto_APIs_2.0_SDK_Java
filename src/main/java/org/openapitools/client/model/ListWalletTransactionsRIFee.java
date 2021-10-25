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
 * ListWalletTransactionsRIFee
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-25T12:38:09.413192Z[Etc/UTC]")
public class ListWalletTransactionsRIFee {
  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private String amount;

  public static final String SERIALIZED_NAME_CONVERTED_AMOUNT = "convertedAmount";
  @SerializedName(SERIALIZED_NAME_CONVERTED_AMOUNT)
  private String convertedAmount;

  public static final String SERIALIZED_NAME_EXCHANGE_RATE_UNIT = "exchangeRateUnit";
  @SerializedName(SERIALIZED_NAME_EXCHANGE_RATE_UNIT)
  private String exchangeRateUnit;

  public static final String SERIALIZED_NAME_SYMBOL = "symbol";
  @SerializedName(SERIALIZED_NAME_SYMBOL)
  private String symbol;


  public ListWalletTransactionsRIFee amount(String amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * Defines the fee for the transaction.
   * @return amount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "0.00003", required = true, value = "Defines the fee for the transaction.")

  public String getAmount() {
    return amount;
  }


  public void setAmount(String amount) {
    this.amount = amount;
  }


  public ListWalletTransactionsRIFee convertedAmount(String convertedAmount) {
    
    this.convertedAmount = convertedAmount;
    return this;
  }

   /**
   * Defines the converted amount of the transaction&#39;s fee.
   * @return convertedAmount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1.50", required = true, value = "Defines the converted amount of the transaction's fee.")

  public String getConvertedAmount() {
    return convertedAmount;
  }


  public void setConvertedAmount(String convertedAmount) {
    this.convertedAmount = convertedAmount;
  }


  public ListWalletTransactionsRIFee exchangeRateUnit(String exchangeRateUnit) {
    
    this.exchangeRateUnit = exchangeRateUnit;
    return this;
  }

   /**
   * Defines the exchange rate for the transaction&#39;s unit.
   * @return exchangeRateUnit
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "USD", required = true, value = "Defines the exchange rate for the transaction's unit.")

  public String getExchangeRateUnit() {
    return exchangeRateUnit;
  }


  public void setExchangeRateUnit(String exchangeRateUnit) {
    this.exchangeRateUnit = exchangeRateUnit;
  }


  public ListWalletTransactionsRIFee symbol(String symbol) {
    
    this.symbol = symbol;
    return this;
  }

   /**
   * Defines the unit of the transaction&#39;s fee.
   * @return symbol
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "ETH", required = true, value = "Defines the unit of the transaction's fee.")

  public String getSymbol() {
    return symbol;
  }


  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListWalletTransactionsRIFee listWalletTransactionsRIFee = (ListWalletTransactionsRIFee) o;
    return Objects.equals(this.amount, listWalletTransactionsRIFee.amount) &&
        Objects.equals(this.convertedAmount, listWalletTransactionsRIFee.convertedAmount) &&
        Objects.equals(this.exchangeRateUnit, listWalletTransactionsRIFee.exchangeRateUnit) &&
        Objects.equals(this.symbol, listWalletTransactionsRIFee.symbol);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, convertedAmount, exchangeRateUnit, symbol);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListWalletTransactionsRIFee {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    convertedAmount: ").append(toIndentedString(convertedAmount)).append("\n");
    sb.append("    exchangeRateUnit: ").append(toIndentedString(exchangeRateUnit)).append("\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
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

