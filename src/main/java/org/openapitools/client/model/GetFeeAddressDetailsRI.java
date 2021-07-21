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
import org.openapitools.client.model.GetFeeAddressDetailsRIBalance;

/**
 * GetFeeAddressDetailsRI
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-07-20T13:36:32.071127Z[Etc/UTC]")
public class GetFeeAddressDetailsRI {
  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private String address;

  public static final String SERIALIZED_NAME_BALANCE = "balance";
  @SerializedName(SERIALIZED_NAME_BALANCE)
  private GetFeeAddressDetailsRIBalance balance;

  public static final String SERIALIZED_NAME_MINIMUM_TRANSFER_AMOUNT = "minimumTransferAmount";
  @SerializedName(SERIALIZED_NAME_MINIMUM_TRANSFER_AMOUNT)
  private String minimumTransferAmount;


  public GetFeeAddressDetailsRI address(String address) {
    
    this.address = address;
    return this;
  }

   /**
   * Represents the specific fee address, which is always automatically generated. Users must fund it.
   * @return address
  **/
  @ApiModelProperty(example = "0xe2b5f5e885a268e4b6faae53f99a663f3bb3e036", required = true, value = "Represents the specific fee address, which is always automatically generated. Users must fund it.")

  public String getAddress() {
    return address;
  }


  public void setAddress(String address) {
    this.address = address;
  }


  public GetFeeAddressDetailsRI balance(GetFeeAddressDetailsRIBalance balance) {
    
    this.balance = balance;
    return this;
  }

   /**
   * Get balance
   * @return balance
  **/
  @ApiModelProperty(required = true, value = "")

  public GetFeeAddressDetailsRIBalance getBalance() {
    return balance;
  }


  public void setBalance(GetFeeAddressDetailsRIBalance balance) {
    this.balance = balance;
  }


  public GetFeeAddressDetailsRI minimumTransferAmount(String minimumTransferAmount) {
    
    this.minimumTransferAmount = minimumTransferAmount;
    return this;
  }

   /**
   * Represents the minimum transfer amount of the currency in the &#x60;fromAddress&#x60; that can be allowed for an automatic forwarding.
   * @return minimumTransferAmount
  **/
  @ApiModelProperty(example = "0.0002", required = true, value = "Represents the minimum transfer amount of the currency in the `fromAddress` that can be allowed for an automatic forwarding.")

  public String getMinimumTransferAmount() {
    return minimumTransferAmount;
  }


  public void setMinimumTransferAmount(String minimumTransferAmount) {
    this.minimumTransferAmount = minimumTransferAmount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetFeeAddressDetailsRI getFeeAddressDetailsRI = (GetFeeAddressDetailsRI) o;
    return Objects.equals(this.address, getFeeAddressDetailsRI.address) &&
        Objects.equals(this.balance, getFeeAddressDetailsRI.balance) &&
        Objects.equals(this.minimumTransferAmount, getFeeAddressDetailsRI.minimumTransferAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, balance, minimumTransferAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetFeeAddressDetailsRI {\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    minimumTransferAmount: ").append(toIndentedString(minimumTransferAmount)).append("\n");
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

