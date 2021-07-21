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
import org.openapitools.client.model.GetZilliqaTransactionDetailsByTransactionIDRIFee;
import org.openapitools.client.model.ListZilliqaTransactionsByAddressRIRecipients;
import org.openapitools.client.model.ListZilliqaTransactionsByAddressRISenders;

/**
 * ListZilliqaTransactionsByAddressRI
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-07-20T13:36:32.071127Z[Etc/UTC]")
public class ListZilliqaTransactionsByAddressRI {
  public static final String SERIALIZED_NAME_FEE = "fee";
  @SerializedName(SERIALIZED_NAME_FEE)
  private GetZilliqaTransactionDetailsByTransactionIDRIFee fee;

  public static final String SERIALIZED_NAME_GAS_LIMIT = "gasLimit";
  @SerializedName(SERIALIZED_NAME_GAS_LIMIT)
  private Integer gasLimit;

  public static final String SERIALIZED_NAME_GAS_PRICE = "gasPrice";
  @SerializedName(SERIALIZED_NAME_GAS_PRICE)
  private Integer gasPrice;

  public static final String SERIALIZED_NAME_GAS_USED = "gasUsed";
  @SerializedName(SERIALIZED_NAME_GAS_USED)
  private Integer gasUsed;

  public static final String SERIALIZED_NAME_MINED_IN_BLOCK_HASH = "minedInBlockHash";
  @SerializedName(SERIALIZED_NAME_MINED_IN_BLOCK_HASH)
  private String minedInBlockHash;

  public static final String SERIALIZED_NAME_MINED_IN_BLOCK_HEIGHT = "minedInBlockHeight";
  @SerializedName(SERIALIZED_NAME_MINED_IN_BLOCK_HEIGHT)
  private Integer minedInBlockHeight;

  public static final String SERIALIZED_NAME_NONCE = "nonce";
  @SerializedName(SERIALIZED_NAME_NONCE)
  private Integer nonce;

  public static final String SERIALIZED_NAME_RECIPIENTS = "recipients";
  @SerializedName(SERIALIZED_NAME_RECIPIENTS)
  private List<ListZilliqaTransactionsByAddressRIRecipients> recipients = new ArrayList<ListZilliqaTransactionsByAddressRIRecipients>();

  public static final String SERIALIZED_NAME_SENDERS = "senders";
  @SerializedName(SERIALIZED_NAME_SENDERS)
  private List<ListZilliqaTransactionsByAddressRISenders> senders = new ArrayList<ListZilliqaTransactionsByAddressRISenders>();

  public static final String SERIALIZED_NAME_TIMESTAMP = "timestamp";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP)
  private Integer timestamp;

  public static final String SERIALIZED_NAME_TRANSACTION_HASH = "transactionHash";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_HASH)
  private String transactionHash;

  public static final String SERIALIZED_NAME_TRANSACTION_INDEX = "transactionIndex";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_INDEX)
  private Integer transactionIndex;

  public static final String SERIALIZED_NAME_TRANSACTION_STATUS = "transactionStatus";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_STATUS)
  private String transactionStatus;


  public ListZilliqaTransactionsByAddressRI fee(GetZilliqaTransactionDetailsByTransactionIDRIFee fee) {
    
    this.fee = fee;
    return this;
  }

   /**
   * Get fee
   * @return fee
  **/
  @ApiModelProperty(required = true, value = "")

  public GetZilliqaTransactionDetailsByTransactionIDRIFee getFee() {
    return fee;
  }


  public void setFee(GetZilliqaTransactionDetailsByTransactionIDRIFee fee) {
    this.fee = fee;
  }


  public ListZilliqaTransactionsByAddressRI gasLimit(Integer gasLimit) {
    
    this.gasLimit = gasLimit;
    return this;
  }

   /**
   * Represents the maximum amount of gas allowed in the block in order to determine how many transactions it can fit.
   * @return gasLimit
  **/
  @ApiModelProperty(example = "550000", required = true, value = "Represents the maximum amount of gas allowed in the block in order to determine how many transactions it can fit.")

  public Integer getGasLimit() {
    return gasLimit;
  }


  public void setGasLimit(Integer gasLimit) {
    this.gasLimit = gasLimit;
  }


  public ListZilliqaTransactionsByAddressRI gasPrice(Integer gasPrice) {
    
    this.gasPrice = gasPrice;
    return this;
  }

   /**
   * Defines the price of the gas.
   * @return gasPrice
  **/
  @ApiModelProperty(example = "2994782927", required = true, value = "Defines the price of the gas.")

  public Integer getGasPrice() {
    return gasPrice;
  }


  public void setGasPrice(Integer gasPrice) {
    this.gasPrice = gasPrice;
  }


  public ListZilliqaTransactionsByAddressRI gasUsed(Integer gasUsed) {
    
    this.gasUsed = gasUsed;
    return this;
  }

   /**
   * Defines how much of the gas for the block has been used.
   * @return gasUsed
  **/
  @ApiModelProperty(example = "24673", required = true, value = "Defines how much of the gas for the block has been used.")

  public Integer getGasUsed() {
    return gasUsed;
  }


  public void setGasUsed(Integer gasUsed) {
    this.gasUsed = gasUsed;
  }


  public ListZilliqaTransactionsByAddressRI minedInBlockHash(String minedInBlockHash) {
    
    this.minedInBlockHash = minedInBlockHash;
    return this;
  }

   /**
   * Represents the hash of the block where this transaction was mined/confirmed for first time. The hash is defined as a cryptographic digital fingerprint made by hashing the block header twice through the SHA256 algorithm.
   * @return minedInBlockHash
  **/
  @ApiModelProperty(example = "0x7c18901ff8d5af3cebde1c9128c9b20cb046d73fba23d45951f5619b61679c9b", required = true, value = "Represents the hash of the block where this transaction was mined/confirmed for first time. The hash is defined as a cryptographic digital fingerprint made by hashing the block header twice through the SHA256 algorithm.")

  public String getMinedInBlockHash() {
    return minedInBlockHash;
  }


  public void setMinedInBlockHash(String minedInBlockHash) {
    this.minedInBlockHash = minedInBlockHash;
  }


  public ListZilliqaTransactionsByAddressRI minedInBlockHeight(Integer minedInBlockHeight) {
    
    this.minedInBlockHeight = minedInBlockHeight;
    return this;
  }

   /**
   * Represents the number of blocks in the blockchain preceding this specific block. Block numbers have no gaps. A blockchain usually starts with block 0 called the \&quot;Genesis block\&quot;.
   * @return minedInBlockHeight
  **/
  @ApiModelProperty(example = "1250283", required = true, value = "Represents the number of blocks in the blockchain preceding this specific block. Block numbers have no gaps. A blockchain usually starts with block 0 called the \"Genesis block\".")

  public Integer getMinedInBlockHeight() {
    return minedInBlockHeight;
  }


  public void setMinedInBlockHeight(Integer minedInBlockHeight) {
    this.minedInBlockHeight = minedInBlockHeight;
  }


  public ListZilliqaTransactionsByAddressRI nonce(Integer nonce) {
    
    this.nonce = nonce;
    return this;
  }

   /**
   * Represents a random value that can be adjusted to satisfy the Proof of Work.
   * @return nonce
  **/
  @ApiModelProperty(example = "13", required = true, value = "Represents a random value that can be adjusted to satisfy the Proof of Work.")

  public Integer getNonce() {
    return nonce;
  }


  public void setNonce(Integer nonce) {
    this.nonce = nonce;
  }


  public ListZilliqaTransactionsByAddressRI recipients(List<ListZilliqaTransactionsByAddressRIRecipients> recipients) {
    
    this.recipients = recipients;
    return this;
  }

  public ListZilliqaTransactionsByAddressRI addRecipientsItem(ListZilliqaTransactionsByAddressRIRecipients recipientsItem) {
    this.recipients.add(recipientsItem);
    return this;
  }

   /**
   * Defines an object array of the transaction recipients.
   * @return recipients
  **/
  @ApiModelProperty(required = true, value = "Defines an object array of the transaction recipients.")

  public List<ListZilliqaTransactionsByAddressRIRecipients> getRecipients() {
    return recipients;
  }


  public void setRecipients(List<ListZilliqaTransactionsByAddressRIRecipients> recipients) {
    this.recipients = recipients;
  }


  public ListZilliqaTransactionsByAddressRI senders(List<ListZilliqaTransactionsByAddressRISenders> senders) {
    
    this.senders = senders;
    return this;
  }

  public ListZilliqaTransactionsByAddressRI addSendersItem(ListZilliqaTransactionsByAddressRISenders sendersItem) {
    this.senders.add(sendersItem);
    return this;
  }

   /**
   * Represents an object of addresses that provide the funds.
   * @return senders
  **/
  @ApiModelProperty(required = true, value = "Represents an object of addresses that provide the funds.")

  public List<ListZilliqaTransactionsByAddressRISenders> getSenders() {
    return senders;
  }


  public void setSenders(List<ListZilliqaTransactionsByAddressRISenders> senders) {
    this.senders = senders;
  }


  public ListZilliqaTransactionsByAddressRI timestamp(Integer timestamp) {
    
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Defines the exact date/time when this block was mined in Unix Timestamp.
   * @return timestamp
  **/
  @ApiModelProperty(example = "1582202940", required = true, value = "Defines the exact date/time when this block was mined in Unix Timestamp.")

  public Integer getTimestamp() {
    return timestamp;
  }


  public void setTimestamp(Integer timestamp) {
    this.timestamp = timestamp;
  }


  public ListZilliqaTransactionsByAddressRI transactionHash(String transactionHash) {
    
    this.transactionHash = transactionHash;
    return this;
  }

   /**
   * Represents the hash of the transaction, which is its unique identifier.
   * @return transactionHash
  **/
  @ApiModelProperty(example = "0xf4a847a1489a043ee509d5d7df48f2bf7ba1b15354ed14600b035ff2f7670203", required = true, value = "Represents the hash of the transaction, which is its unique identifier.")

  public String getTransactionHash() {
    return transactionHash;
  }


  public void setTransactionHash(String transactionHash) {
    this.transactionHash = transactionHash;
  }


  public ListZilliqaTransactionsByAddressRI transactionIndex(Integer transactionIndex) {
    
    this.transactionIndex = transactionIndex;
    return this;
  }

   /**
   * Defines the numeric representation of the transaction index.
   * @return transactionIndex
  **/
  @ApiModelProperty(example = "0", required = true, value = "Defines the numeric representation of the transaction index.")

  public Integer getTransactionIndex() {
    return transactionIndex;
  }


  public void setTransactionIndex(Integer transactionIndex) {
    this.transactionIndex = transactionIndex;
  }


  public ListZilliqaTransactionsByAddressRI transactionStatus(String transactionStatus) {
    
    this.transactionStatus = transactionStatus;
    return this;
  }

   /**
   * Defines the status of the transaction, whether it is e.g. pending or complete.
   * @return transactionStatus
  **/
  @ApiModelProperty(example = "2", required = true, value = "Defines the status of the transaction, whether it is e.g. pending or complete.")

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
    ListZilliqaTransactionsByAddressRI listZilliqaTransactionsByAddressRI = (ListZilliqaTransactionsByAddressRI) o;
    return Objects.equals(this.fee, listZilliqaTransactionsByAddressRI.fee) &&
        Objects.equals(this.gasLimit, listZilliqaTransactionsByAddressRI.gasLimit) &&
        Objects.equals(this.gasPrice, listZilliqaTransactionsByAddressRI.gasPrice) &&
        Objects.equals(this.gasUsed, listZilliqaTransactionsByAddressRI.gasUsed) &&
        Objects.equals(this.minedInBlockHash, listZilliqaTransactionsByAddressRI.minedInBlockHash) &&
        Objects.equals(this.minedInBlockHeight, listZilliqaTransactionsByAddressRI.minedInBlockHeight) &&
        Objects.equals(this.nonce, listZilliqaTransactionsByAddressRI.nonce) &&
        Objects.equals(this.recipients, listZilliqaTransactionsByAddressRI.recipients) &&
        Objects.equals(this.senders, listZilliqaTransactionsByAddressRI.senders) &&
        Objects.equals(this.timestamp, listZilliqaTransactionsByAddressRI.timestamp) &&
        Objects.equals(this.transactionHash, listZilliqaTransactionsByAddressRI.transactionHash) &&
        Objects.equals(this.transactionIndex, listZilliqaTransactionsByAddressRI.transactionIndex) &&
        Objects.equals(this.transactionStatus, listZilliqaTransactionsByAddressRI.transactionStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fee, gasLimit, gasPrice, gasUsed, minedInBlockHash, minedInBlockHeight, nonce, recipients, senders, timestamp, transactionHash, transactionIndex, transactionStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListZilliqaTransactionsByAddressRI {\n");
    sb.append("    fee: ").append(toIndentedString(fee)).append("\n");
    sb.append("    gasLimit: ").append(toIndentedString(gasLimit)).append("\n");
    sb.append("    gasPrice: ").append(toIndentedString(gasPrice)).append("\n");
    sb.append("    gasUsed: ").append(toIndentedString(gasUsed)).append("\n");
    sb.append("    minedInBlockHash: ").append(toIndentedString(minedInBlockHash)).append("\n");
    sb.append("    minedInBlockHeight: ").append(toIndentedString(minedInBlockHeight)).append("\n");
    sb.append("    nonce: ").append(toIndentedString(nonce)).append("\n");
    sb.append("    recipients: ").append(toIndentedString(recipients)).append("\n");
    sb.append("    senders: ").append(toIndentedString(senders)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    transactionHash: ").append(toIndentedString(transactionHash)).append("\n");
    sb.append("    transactionIndex: ").append(toIndentedString(transactionIndex)).append("\n");
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

