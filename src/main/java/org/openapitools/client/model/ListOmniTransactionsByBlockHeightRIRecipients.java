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
 * ListOmniTransactionsByBlockHeightRIRecipients
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-25T12:38:09.413192Z[Etc/UTC]")
public class ListOmniTransactionsByBlockHeightRIRecipients {
  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private String address;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private String amount;


  public ListOmniTransactionsByBlockHeightRIRecipients address(String address) {
    
    this.address = address;
    return this;
  }

   /**
   * Represents the hash of the address that receives the funds.
   * @return address
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "3Ld5yZ4fqTrW44cUGxpjEuBwAEtCsYUP28", required = true, value = "Represents the hash of the address that receives the funds.")

  public String getAddress() {
    return address;
  }


  public void setAddress(String address) {
    this.address = address;
  }


  public ListOmniTransactionsByBlockHeightRIRecipients amount(String amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * Defines the amount of the received funds as a string.
   * @return amount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "0.1", required = true, value = "Defines the amount of the received funds as a string.")

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
    ListOmniTransactionsByBlockHeightRIRecipients listOmniTransactionsByBlockHeightRIRecipients = (ListOmniTransactionsByBlockHeightRIRecipients) o;
    return Objects.equals(this.address, listOmniTransactionsByBlockHeightRIRecipients.address) &&
        Objects.equals(this.amount, listOmniTransactionsByBlockHeightRIRecipients.amount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, amount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListOmniTransactionsByBlockHeightRIRecipients {\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
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

