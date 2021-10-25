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
 * Defines an &#x60;item&#x60; as one result.
 */
@ApiModel(description = "Defines an `item` as one result.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-25T12:38:09.413192Z[Etc/UTC]")
public class TransactionRequestBroadcastedDataItem {
  public static final String SERIALIZED_NAME_BLOCKCHAIN = "blockchain";
  @SerializedName(SERIALIZED_NAME_BLOCKCHAIN)
  private String blockchain;

  public static final String SERIALIZED_NAME_NETWORK = "network";
  @SerializedName(SERIALIZED_NAME_NETWORK)
  private String network;

  public static final String SERIALIZED_NAME_REQUIRED_APPROVALS = "requiredApprovals";
  @SerializedName(SERIALIZED_NAME_REQUIRED_APPROVALS)
  private Integer requiredApprovals;

  public static final String SERIALIZED_NAME_REQUIRED_REJECTIONS = "requiredRejections";
  @SerializedName(SERIALIZED_NAME_REQUIRED_REJECTIONS)
  private Integer requiredRejections;

  public static final String SERIALIZED_NAME_CURRENT_APPROVALS = "currentApprovals";
  @SerializedName(SERIALIZED_NAME_CURRENT_APPROVALS)
  private Integer currentApprovals;

  public static final String SERIALIZED_NAME_CURRENT_REJECTIONS = "currentRejections";
  @SerializedName(SERIALIZED_NAME_CURRENT_REJECTIONS)
  private Integer currentRejections;

  public static final String SERIALIZED_NAME_TRANSACTION_ID = "transactionId";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_ID)
  private String transactionId;


  public TransactionRequestBroadcastedDataItem blockchain(String blockchain) {
    
    this.blockchain = blockchain;
    return this;
  }

   /**
   * Represents the specific blockchain protocol name, e.g. Ethereum, Bitcoin, etc.
   * @return blockchain
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Bitcoin/Ethereum (whichever applicable)", required = true, value = "Represents the specific blockchain protocol name, e.g. Ethereum, Bitcoin, etc.")

  public String getBlockchain() {
    return blockchain;
  }


  public void setBlockchain(String blockchain) {
    this.blockchain = blockchain;
  }


  public TransactionRequestBroadcastedDataItem network(String network) {
    
    this.network = network;
    return this;
  }

   /**
   * Represents the name of the blockchain network used; blockchain networks are usually identical as technology and software, but they differ in data, e.g. - \&quot;mainnet\&quot; is the live network with actual data while networks like \&quot;testnet\&quot;, \&quot;ropsten\&quot;, \&quot;rinkeby\&quot; are test networks.
   * @return network
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Testnet/Mainnet (whichever applicable)", required = true, value = "Represents the name of the blockchain network used; blockchain networks are usually identical as technology and software, but they differ in data, e.g. - \"mainnet\" is the live network with actual data while networks like \"testnet\", \"ropsten\", \"rinkeby\" are test networks.")

  public String getNetwork() {
    return network;
  }


  public void setNetwork(String network) {
    this.network = network;
  }


  public TransactionRequestBroadcastedDataItem requiredApprovals(Integer requiredApprovals) {
    
    this.requiredApprovals = requiredApprovals;
    return this;
  }

   /**
   * The required number of approvals needed to approve the transaction.
   * @return requiredApprovals
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "5", required = true, value = "The required number of approvals needed to approve the transaction.")

  public Integer getRequiredApprovals() {
    return requiredApprovals;
  }


  public void setRequiredApprovals(Integer requiredApprovals) {
    this.requiredApprovals = requiredApprovals;
  }


  public TransactionRequestBroadcastedDataItem requiredRejections(Integer requiredRejections) {
    
    this.requiredRejections = requiredRejections;
    return this;
  }

   /**
   * The required number of rejections needed to reject the transaction.
   * @return requiredRejections
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2", required = true, value = "The required number of rejections needed to reject the transaction.")

  public Integer getRequiredRejections() {
    return requiredRejections;
  }


  public void setRequiredRejections(Integer requiredRejections) {
    this.requiredRejections = requiredRejections;
  }


  public TransactionRequestBroadcastedDataItem currentApprovals(Integer currentApprovals) {
    
    this.currentApprovals = currentApprovals;
    return this;
  }

   /**
   * The current number of approvals given for the transaction.
   * @return currentApprovals
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2", required = true, value = "The current number of approvals given for the transaction.")

  public Integer getCurrentApprovals() {
    return currentApprovals;
  }


  public void setCurrentApprovals(Integer currentApprovals) {
    this.currentApprovals = currentApprovals;
  }


  public TransactionRequestBroadcastedDataItem currentRejections(Integer currentRejections) {
    
    this.currentRejections = currentRejections;
    return this;
  }

   /**
   * The current number of rejections given for the transaction.
   * @return currentRejections
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1", required = true, value = "The current number of rejections given for the transaction.")

  public Integer getCurrentRejections() {
    return currentRejections;
  }


  public void setCurrentRejections(Integer currentRejections) {
    this.currentRejections = currentRejections;
  }


  public TransactionRequestBroadcastedDataItem transactionId(String transactionId) {
    
    this.transactionId = transactionId;
    return this;
  }

   /**
   * Defines the unique ID of the specific transaction, i.e. its identification number.
   * @return transactionId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "4e78f606bc42534744e223f54b85d5bbd54a3949f54eb8fac31d73028c286e31", required = true, value = "Defines the unique ID of the specific transaction, i.e. its identification number.")

  public String getTransactionId() {
    return transactionId;
  }


  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionRequestBroadcastedDataItem transactionRequestBroadcastedDataItem = (TransactionRequestBroadcastedDataItem) o;
    return Objects.equals(this.blockchain, transactionRequestBroadcastedDataItem.blockchain) &&
        Objects.equals(this.network, transactionRequestBroadcastedDataItem.network) &&
        Objects.equals(this.requiredApprovals, transactionRequestBroadcastedDataItem.requiredApprovals) &&
        Objects.equals(this.requiredRejections, transactionRequestBroadcastedDataItem.requiredRejections) &&
        Objects.equals(this.currentApprovals, transactionRequestBroadcastedDataItem.currentApprovals) &&
        Objects.equals(this.currentRejections, transactionRequestBroadcastedDataItem.currentRejections) &&
        Objects.equals(this.transactionId, transactionRequestBroadcastedDataItem.transactionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(blockchain, network, requiredApprovals, requiredRejections, currentApprovals, currentRejections, transactionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionRequestBroadcastedDataItem {\n");
    sb.append("    blockchain: ").append(toIndentedString(blockchain)).append("\n");
    sb.append("    network: ").append(toIndentedString(network)).append("\n");
    sb.append("    requiredApprovals: ").append(toIndentedString(requiredApprovals)).append("\n");
    sb.append("    requiredRejections: ").append(toIndentedString(requiredRejections)).append("\n");
    sb.append("    currentApprovals: ").append(toIndentedString(currentApprovals)).append("\n");
    sb.append("    currentRejections: ").append(toIndentedString(currentRejections)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
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

