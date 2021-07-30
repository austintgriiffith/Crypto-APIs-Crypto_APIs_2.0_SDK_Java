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
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.ListTransactionsByBlockHashRIBSB;
import org.openapitools.client.model.ListTransactionsByBlockHashRIBSBC;
import org.openapitools.client.model.ListTransactionsByBlockHashRIBSD;
import org.openapitools.client.model.ListTransactionsByBlockHashRIBSD2;
import org.openapitools.client.model.ListTransactionsByBlockHashRIBSD2Vin;
import org.openapitools.client.model.ListTransactionsByBlockHashRIBSD2Vout;
import org.openapitools.client.model.ListTransactionsByBlockHashRIBSE;
import org.openapitools.client.model.ListTransactionsByBlockHashRIBSEC;
import org.openapitools.client.model.ListTransactionsByBlockHashRIBSEGasPrice;
import org.openapitools.client.model.ListTransactionsByBlockHashRIBSL;

/**
 * ListTransactionsByBlockHashRIBS
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-07-30T08:15:40.964553Z[Etc/UTC]")
public class ListTransactionsByBlockHashRIBS {
  public static final String SERIALIZED_NAME_LOCKTIME = "locktime";
  @SerializedName(SERIALIZED_NAME_LOCKTIME)
  private Integer locktime;

  public static final String SERIALIZED_NAME_SIZE = "size";
  @SerializedName(SERIALIZED_NAME_SIZE)
  private Integer size;

  public static final String SERIALIZED_NAME_V_SIZE = "vSize";
  @SerializedName(SERIALIZED_NAME_V_SIZE)
  private Integer vSize;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private Integer version;

  public static final String SERIALIZED_NAME_VIN = "vin";
  @SerializedName(SERIALIZED_NAME_VIN)
  private List<ListTransactionsByBlockHashRIBSD2Vin> vin = new ArrayList<ListTransactionsByBlockHashRIBSD2Vin>();

  public static final String SERIALIZED_NAME_VOUT = "vout";
  @SerializedName(SERIALIZED_NAME_VOUT)
  private List<ListTransactionsByBlockHashRIBSD2Vout> vout = new ArrayList<ListTransactionsByBlockHashRIBSD2Vout>();

  public static final String SERIALIZED_NAME_VSIZE = "vsize";
  @SerializedName(SERIALIZED_NAME_VSIZE)
  private Integer vsize;

  public static final String SERIALIZED_NAME_CONTRACT = "contract";
  @SerializedName(SERIALIZED_NAME_CONTRACT)
  private String contract;

  public static final String SERIALIZED_NAME_GAS_LIMIT = "gasLimit";
  @SerializedName(SERIALIZED_NAME_GAS_LIMIT)
  private String gasLimit;

  public static final String SERIALIZED_NAME_GAS_PRICE = "gasPrice";
  @SerializedName(SERIALIZED_NAME_GAS_PRICE)
  private ListTransactionsByBlockHashRIBSEGasPrice gasPrice;

  public static final String SERIALIZED_NAME_GAS_USED = "gasUsed";
  @SerializedName(SERIALIZED_NAME_GAS_USED)
  private String gasUsed;

  public static final String SERIALIZED_NAME_INPUT_DATA = "inputData";
  @SerializedName(SERIALIZED_NAME_INPUT_DATA)
  private String inputData;

  public static final String SERIALIZED_NAME_NONCE = "nonce";
  @SerializedName(SERIALIZED_NAME_NONCE)
  private String nonce;

  public static final String SERIALIZED_NAME_TRANSACTION_STATUS = "transactionStatus";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_STATUS)
  private String transactionStatus;


  public ListTransactionsByBlockHashRIBS locktime(Integer locktime) {
    
    this.locktime = locktime;
    return this;
  }

   /**
   * Represents the time at which a particular transaction can be added to the blockchain.
   * @return locktime
  **/
  @ApiModelProperty(example = "0", required = true, value = "Represents the time at which a particular transaction can be added to the blockchain.")

  public Integer getLocktime() {
    return locktime;
  }


  public void setLocktime(Integer locktime) {
    this.locktime = locktime;
  }


  public ListTransactionsByBlockHashRIBS size(Integer size) {
    
    this.size = size;
    return this;
  }

   /**
   * Represents the total size of this transaction.
   * @return size
  **/
  @ApiModelProperty(example = "125", required = true, value = "Represents the total size of this transaction.")

  public Integer getSize() {
    return size;
  }


  public void setSize(Integer size) {
    this.size = size;
  }


  public ListTransactionsByBlockHashRIBS vSize(Integer vSize) {
    
    this.vSize = vSize;
    return this;
  }

   /**
   * Represents the virtual size of this transaction.
   * @return vSize
  **/
  @ApiModelProperty(example = "208", required = true, value = "Represents the virtual size of this transaction.")

  public Integer getvSize() {
    return vSize;
  }


  public void setvSize(Integer vSize) {
    this.vSize = vSize;
  }


  public ListTransactionsByBlockHashRIBS version(Integer version) {
    
    this.version = version;
    return this;
  }

   /**
   * Represents transaction version number.
   * @return version
  **/
  @ApiModelProperty(example = "1", required = true, value = "Represents transaction version number.")

  public Integer getVersion() {
    return version;
  }


  public void setVersion(Integer version) {
    this.version = version;
  }


  public ListTransactionsByBlockHashRIBS vin(List<ListTransactionsByBlockHashRIBSD2Vin> vin) {
    
    this.vin = vin;
    return this;
  }

  public ListTransactionsByBlockHashRIBS addVinItem(ListTransactionsByBlockHashRIBSD2Vin vinItem) {
    this.vin.add(vinItem);
    return this;
  }

   /**
   * Represents the transaction inputs.
   * @return vin
  **/
  @ApiModelProperty(required = true, value = "Represents the transaction inputs.")

  public List<ListTransactionsByBlockHashRIBSD2Vin> getVin() {
    return vin;
  }


  public void setVin(List<ListTransactionsByBlockHashRIBSD2Vin> vin) {
    this.vin = vin;
  }


  public ListTransactionsByBlockHashRIBS vout(List<ListTransactionsByBlockHashRIBSD2Vout> vout) {
    
    this.vout = vout;
    return this;
  }

  public ListTransactionsByBlockHashRIBS addVoutItem(ListTransactionsByBlockHashRIBSD2Vout voutItem) {
    this.vout.add(voutItem);
    return this;
  }

   /**
   * Represents the transaction outputs.
   * @return vout
  **/
  @ApiModelProperty(required = true, value = "Represents the transaction outputs.")

  public List<ListTransactionsByBlockHashRIBSD2Vout> getVout() {
    return vout;
  }


  public void setVout(List<ListTransactionsByBlockHashRIBSD2Vout> vout) {
    this.vout = vout;
  }


  public ListTransactionsByBlockHashRIBS vsize(Integer vsize) {
    
    this.vsize = vsize;
    return this;
  }

   /**
   * Represents the virtual size of this transaction.
   * @return vsize
  **/
  @ApiModelProperty(example = "141", required = true, value = "Represents the virtual size of this transaction.")

  public Integer getVsize() {
    return vsize;
  }


  public void setVsize(Integer vsize) {
    this.vsize = vsize;
  }


  public ListTransactionsByBlockHashRIBS contract(String contract) {
    
    this.contract = contract;
    return this;
  }

   /**
   * Represents the specific transaction contract.
   * @return contract
  **/
  @ApiModelProperty(required = true, value = "Represents the specific transaction contract.")

  public String getContract() {
    return contract;
  }


  public void setContract(String contract) {
    this.contract = contract;
  }


  public ListTransactionsByBlockHashRIBS gasLimit(String gasLimit) {
    
    this.gasLimit = gasLimit;
    return this;
  }

   /**
   * Represents the amount of gas used by this specific transaction alone.
   * @return gasLimit
  **/
  @ApiModelProperty(example = "21000", required = true, value = "Represents the amount of gas used by this specific transaction alone.")

  public String getGasLimit() {
    return gasLimit;
  }


  public void setGasLimit(String gasLimit) {
    this.gasLimit = gasLimit;
  }


  public ListTransactionsByBlockHashRIBS gasPrice(ListTransactionsByBlockHashRIBSEGasPrice gasPrice) {
    
    this.gasPrice = gasPrice;
    return this;
  }

   /**
   * Get gasPrice
   * @return gasPrice
  **/
  @ApiModelProperty(required = true, value = "")

  public ListTransactionsByBlockHashRIBSEGasPrice getGasPrice() {
    return gasPrice;
  }


  public void setGasPrice(ListTransactionsByBlockHashRIBSEGasPrice gasPrice) {
    this.gasPrice = gasPrice;
  }


  public ListTransactionsByBlockHashRIBS gasUsed(String gasUsed) {
    
    this.gasUsed = gasUsed;
    return this;
  }

   /**
   * Represents the exact unit of gas that was used for the transaction.
   * @return gasUsed
  **/
  @ApiModelProperty(example = "21000", required = true, value = "Represents the exact unit of gas that was used for the transaction.")

  public String getGasUsed() {
    return gasUsed;
  }


  public void setGasUsed(String gasUsed) {
    this.gasUsed = gasUsed;
  }


  public ListTransactionsByBlockHashRIBS inputData(String inputData) {
    
    this.inputData = inputData;
    return this;
  }

   /**
   * Represents additional information that is required for the transaction.
   * @return inputData
  **/
  @ApiModelProperty(example = "0xa9059cbb000000000000000000000000acc59ec2f7119dc7a9e69dcd124cff75caae05bf0000000000000000000000000000000000000000000000000000000000989680", required = true, value = "Represents additional information that is required for the transaction.")

  public String getInputData() {
    return inputData;
  }


  public void setInputData(String inputData) {
    this.inputData = inputData;
  }


  public ListTransactionsByBlockHashRIBS nonce(String nonce) {
    
    this.nonce = nonce;
    return this;
  }

   /**
   * Represents the sequential running number for an address, starting from 0 for the first transaction. E.g., if the nonce of a transaction is 10, it would be the 11th transaction sent from the sender&#39;s address.
   * @return nonce
  **/
  @ApiModelProperty(example = "16", required = true, value = "Represents the sequential running number for an address, starting from 0 for the first transaction. E.g., if the nonce of a transaction is 10, it would be the 11th transaction sent from the sender's address.")

  public String getNonce() {
    return nonce;
  }


  public void setNonce(String nonce) {
    this.nonce = nonce;
  }


  public ListTransactionsByBlockHashRIBS transactionStatus(String transactionStatus) {
    
    this.transactionStatus = transactionStatus;
    return this;
  }

   /**
   * String representation of the transaction status
   * @return transactionStatus
  **/
  @ApiModelProperty(required = true, value = "String representation of the transaction status")

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
    ListTransactionsByBlockHashRIBS listTransactionsByBlockHashRIBS = (ListTransactionsByBlockHashRIBS) o;
    return Objects.equals(this.locktime, listTransactionsByBlockHashRIBS.locktime) &&
        Objects.equals(this.size, listTransactionsByBlockHashRIBS.size) &&
        Objects.equals(this.vSize, listTransactionsByBlockHashRIBS.vSize) &&
        Objects.equals(this.version, listTransactionsByBlockHashRIBS.version) &&
        Objects.equals(this.vin, listTransactionsByBlockHashRIBS.vin) &&
        Objects.equals(this.vout, listTransactionsByBlockHashRIBS.vout) &&
        Objects.equals(this.vsize, listTransactionsByBlockHashRIBS.vsize) &&
        Objects.equals(this.contract, listTransactionsByBlockHashRIBS.contract) &&
        Objects.equals(this.gasLimit, listTransactionsByBlockHashRIBS.gasLimit) &&
        Objects.equals(this.gasPrice, listTransactionsByBlockHashRIBS.gasPrice) &&
        Objects.equals(this.gasUsed, listTransactionsByBlockHashRIBS.gasUsed) &&
        Objects.equals(this.inputData, listTransactionsByBlockHashRIBS.inputData) &&
        Objects.equals(this.nonce, listTransactionsByBlockHashRIBS.nonce) &&
        Objects.equals(this.transactionStatus, listTransactionsByBlockHashRIBS.transactionStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(locktime, size, vSize, version, vin, vout, vsize, contract, gasLimit, gasPrice, gasUsed, inputData, nonce, transactionStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListTransactionsByBlockHashRIBS {\n");
    sb.append("    locktime: ").append(toIndentedString(locktime)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    vSize: ").append(toIndentedString(vSize)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    vin: ").append(toIndentedString(vin)).append("\n");
    sb.append("    vout: ").append(toIndentedString(vout)).append("\n");
    sb.append("    vsize: ").append(toIndentedString(vsize)).append("\n");
    sb.append("    contract: ").append(toIndentedString(contract)).append("\n");
    sb.append("    gasLimit: ").append(toIndentedString(gasLimit)).append("\n");
    sb.append("    gasPrice: ").append(toIndentedString(gasPrice)).append("\n");
    sb.append("    gasUsed: ").append(toIndentedString(gasUsed)).append("\n");
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

