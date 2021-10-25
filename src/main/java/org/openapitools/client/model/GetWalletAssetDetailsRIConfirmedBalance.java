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
 * Specifies the confirmed balance.
 */
@ApiModel(description = "Specifies the confirmed balance.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-25T12:38:09.413192Z[Etc/UTC]")
public class GetWalletAssetDetailsRIConfirmedBalance {
  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private String amount;

  public static final String SERIALIZED_NAME_UNIT = "unit";
  @SerializedName(SERIALIZED_NAME_UNIT)
  private String unit;


  public GetWalletAssetDetailsRIConfirmedBalance amount(String amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * Specifies the amount of the confirmed balance.
   * @return amount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "0.0101", required = true, value = "Specifies the amount of the confirmed balance.")

  public String getAmount() {
    return amount;
  }


  public void setAmount(String amount) {
    this.amount = amount;
  }


  public GetWalletAssetDetailsRIConfirmedBalance unit(String unit) {
    
    this.unit = unit;
    return this;
  }

   /**
   * Specifies the unit of the amount of the confirmed balance.
   * @return unit
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "BTC", required = true, value = "Specifies the unit of the amount of the confirmed balance.")

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
    GetWalletAssetDetailsRIConfirmedBalance getWalletAssetDetailsRIConfirmedBalance = (GetWalletAssetDetailsRIConfirmedBalance) o;
    return Objects.equals(this.amount, getWalletAssetDetailsRIConfirmedBalance.amount) &&
        Objects.equals(this.unit, getWalletAssetDetailsRIConfirmedBalance.unit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, unit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetWalletAssetDetailsRIConfirmedBalance {\n");
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

}

