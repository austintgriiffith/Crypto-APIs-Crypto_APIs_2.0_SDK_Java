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
import org.openapitools.client.model.ListConfirmedTransactionsByAddressRIBSEGasPrice;
import org.openapitools.client.model.ListUnconfirmedTransactionsByAddressRIBSEFee;

/**
 * Ethereum
 */
@ApiModel(description = "Ethereum")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-25T12:38:09.413192Z[Etc/UTC]")
public class ListUnconfirmedTransactionsByAddressRIBSE {
  public static final String SERIALIZED_NAME_FEE = "fee";
  @SerializedName(SERIALIZED_NAME_FEE)
  private ListUnconfirmedTransactionsByAddressRIBSEFee fee;

  public static final String SERIALIZED_NAME_GAS_LIMIT = "gasLimit";
  @SerializedName(SERIALIZED_NAME_GAS_LIMIT)
  private String gasLimit;

  public static final String SERIALIZED_NAME_GAS_PRICE = "gasPrice";
  @SerializedName(SERIALIZED_NAME_GAS_PRICE)
  private ListConfirmedTransactionsByAddressRIBSEGasPrice gasPrice;

  public static final String SERIALIZED_NAME_INPUT_DATA = "inputData";
  @SerializedName(SERIALIZED_NAME_INPUT_DATA)
  private String inputData;

  public static final String SERIALIZED_NAME_NONCE = "nonce";
  @SerializedName(SERIALIZED_NAME_NONCE)
  private Integer nonce;

  public static final String SERIALIZED_NAME_TRANSACTION_STATUS = "transactionStatus";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_STATUS)
  private String transactionStatus;


  public ListUnconfirmedTransactionsByAddressRIBSE fee(ListUnconfirmedTransactionsByAddressRIBSEFee fee) {
    
    this.fee = fee;
    return this;
  }

   /**
   * Get fee
   * @return fee
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public ListUnconfirmedTransactionsByAddressRIBSEFee getFee() {
    return fee;
  }


  public void setFee(ListUnconfirmedTransactionsByAddressRIBSEFee fee) {
    this.fee = fee;
  }


  public ListUnconfirmedTransactionsByAddressRIBSE gasLimit(String gasLimit) {
    
    this.gasLimit = gasLimit;
    return this;
  }

   /**
   * Represents the amount of gas used by this specific transaction alone.
   * @return gasLimit
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "552020", required = true, value = "Represents the amount of gas used by this specific transaction alone.")

  public String getGasLimit() {
    return gasLimit;
  }


  public void setGasLimit(String gasLimit) {
    this.gasLimit = gasLimit;
  }


  public ListUnconfirmedTransactionsByAddressRIBSE gasPrice(ListConfirmedTransactionsByAddressRIBSEGasPrice gasPrice) {
    
    this.gasPrice = gasPrice;
    return this;
  }

   /**
   * Get gasPrice
   * @return gasPrice
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public ListConfirmedTransactionsByAddressRIBSEGasPrice getGasPrice() {
    return gasPrice;
  }


  public void setGasPrice(ListConfirmedTransactionsByAddressRIBSEGasPrice gasPrice) {
    this.gasPrice = gasPrice;
  }


  public ListUnconfirmedTransactionsByAddressRIBSE inputData(String inputData) {
    
    this.inputData = inputData;
    return this;
  }

   /**
   * Represents additional information that is required for the transaction.
   * @return inputData
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "0x67a5cd0600000000000000000000000031f42841c2db5173425b5223809cf3a38fede360", required = true, value = "Represents additional information that is required for the transaction.")

  public String getInputData() {
    return inputData;
  }


  public void setInputData(String inputData) {
    this.inputData = inputData;
  }


  public ListUnconfirmedTransactionsByAddressRIBSE nonce(Integer nonce) {
    
    this.nonce = nonce;
    return this;
  }

   /**
   * Represents the sequential running number for an address, starting from 0 for the first transaction. E.g., if the nonce of a transaction is 10, it would be the 11th transaction sent from the sender&#39;s address.
   * @return nonce
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "12", required = true, value = "Represents the sequential running number for an address, starting from 0 for the first transaction. E.g., if the nonce of a transaction is 10, it would be the 11th transaction sent from the sender's address.")

  public Integer getNonce() {
    return nonce;
  }


  public void setNonce(Integer nonce) {
    this.nonce = nonce;
  }


  public ListUnconfirmedTransactionsByAddressRIBSE transactionStatus(String transactionStatus) {
    
    this.transactionStatus = transactionStatus;
    return this;
  }

   /**
   * String representation of the transaction status
   * @return transactionStatus
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "0x1", required = true, value = "String representation of the transaction status")

  public String getTransactionStatus() {
    return transactionStatus;
  }


  public void setTransactionStatus(String transactionStatus) {
    this.transactionStatus = transactionStatus;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListUnconfirmedTransactionsByAddressRIBSE listUnconfirmedTransactionsByAddressRIBSE = (ListUnconfirmedTransactionsByAddressRIBSE) o;
    return Objects.equals(this.fee, listUnconfirmedTransactionsByAddressRIBSE.fee) &&
        Objects.equals(this.gasLimit, listUnconfirmedTransactionsByAddressRIBSE.gasLimit) &&
        Objects.equals(this.gasPrice, listUnconfirmedTransactionsByAddressRIBSE.gasPrice) &&
        Objects.equals(this.inputData, listUnconfirmedTransactionsByAddressRIBSE.inputData) &&
        Objects.equals(this.nonce, listUnconfirmedTransactionsByAddressRIBSE.nonce) &&
        Objects.equals(this.transactionStatus, listUnconfirmedTransactionsByAddressRIBSE.transactionStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fee, gasLimit, gasPrice, inputData, nonce, transactionStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListUnconfirmedTransactionsByAddressRIBSE {\n");
    sb.append("    fee: ").append(toIndentedString(fee)).append("\n");
    sb.append("    gasLimit: ").append(toIndentedString(gasLimit)).append("\n");
    sb.append("    gasPrice: ").append(toIndentedString(gasPrice)).append("\n");
    sb.append("    inputData: ").append(toIndentedString(inputData)).append("\n");
    sb.append("    nonce: ").append(toIndentedString(nonce)).append("\n");
    sb.append("    transactionStatus: ").append(toIndentedString(transactionStatus)).append("\n");
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

