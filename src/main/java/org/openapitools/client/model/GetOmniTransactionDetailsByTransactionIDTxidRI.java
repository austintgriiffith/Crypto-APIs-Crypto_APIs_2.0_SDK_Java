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
import org.openapitools.client.model.GetOmniTransactionDetailsByTransactionIDTxidRISenders;
import org.openapitools.client.model.ListOmniTransactionsByAddressRIRecipients;
import org.openapitools.client.model.ListUnconfirmedOmniTransactionsByAddressRIFee;

/**
 * GetOmniTransactionDetailsByTransactionIDTxidRI
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-07-30T08:15:40.964553Z[Etc/UTC]")
public class GetOmniTransactionDetailsByTransactionIDTxidRI {
  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private String amount;

  public static final String SERIALIZED_NAME_DIVISIBLE = "divisible";
  @SerializedName(SERIALIZED_NAME_DIVISIBLE)
  private Boolean divisible;

  public static final String SERIALIZED_NAME_MINED_IN_BLOCK_HASH = "minedInBlockHash";
  @SerializedName(SERIALIZED_NAME_MINED_IN_BLOCK_HASH)
  private String minedInBlockHash;

  public static final String SERIALIZED_NAME_MINED_IN_BLOCK_HEIGHT = "minedInBlockHeight";
  @SerializedName(SERIALIZED_NAME_MINED_IN_BLOCK_HEIGHT)
  private Integer minedInBlockHeight;

  public static final String SERIALIZED_NAME_PROPERTY_ID = "propertyId";
  @SerializedName(SERIALIZED_NAME_PROPERTY_ID)
  private Integer propertyId;

  public static final String SERIALIZED_NAME_RECIPIENTS = "recipients";
  @SerializedName(SERIALIZED_NAME_RECIPIENTS)
  private List<ListOmniTransactionsByAddressRIRecipients> recipients = new ArrayList<ListOmniTransactionsByAddressRIRecipients>();

  public static final String SERIALIZED_NAME_SENDERS = "senders";
  @SerializedName(SERIALIZED_NAME_SENDERS)
  private List<GetOmniTransactionDetailsByTransactionIDTxidRISenders> senders = new ArrayList<GetOmniTransactionDetailsByTransactionIDTxidRISenders>();

  public static final String SERIALIZED_NAME_TIMESTAMP = "timestamp";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP)
  private Integer timestamp;

  public static final String SERIALIZED_NAME_TRANSACTION_ID = "transactionId";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_ID)
  private String transactionId;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_TYPE_INT = "typeInt";
  @SerializedName(SERIALIZED_NAME_TYPE_INT)
  private Integer typeInt;

  public static final String SERIALIZED_NAME_VALID = "valid";
  @SerializedName(SERIALIZED_NAME_VALID)
  private Boolean valid;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private Integer version;

  public static final String SERIALIZED_NAME_FEE = "fee";
  @SerializedName(SERIALIZED_NAME_FEE)
  private ListUnconfirmedOmniTransactionsByAddressRIFee fee;


  public GetOmniTransactionDetailsByTransactionIDTxidRI amount(String amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * Defines the amount of the sent tokens.
   * @return amount
  **/
  @ApiModelProperty(example = "14.915785", required = true, value = "Defines the amount of the sent tokens.")

  public String getAmount() {
    return amount;
  }


  public void setAmount(String amount) {
    this.amount = amount;
  }


  public GetOmniTransactionDetailsByTransactionIDTxidRI divisible(Boolean divisible) {
    
    this.divisible = divisible;
    return this;
  }

   /**
   * Defines whether the attribute can be divisible or not, as boolean. E.g., if it is \&quot;true\&quot;, the attribute is divisible.
   * @return divisible
  **/
  @ApiModelProperty(example = "true", required = true, value = "Defines whether the attribute can be divisible or not, as boolean. E.g., if it is \"true\", the attribute is divisible.")

  public Boolean getDivisible() {
    return divisible;
  }


  public void setDivisible(Boolean divisible) {
    this.divisible = divisible;
  }


  public GetOmniTransactionDetailsByTransactionIDTxidRI minedInBlockHash(String minedInBlockHash) {
    
    this.minedInBlockHash = minedInBlockHash;
    return this;
  }

   /**
   * Represents the hash of the block where this transaction was mined/confirmed for first time. The hash is defined as a cryptographic digital fingerprint made by hashing the block header twice through the SHA256 algorithm.
   * @return minedInBlockHash
  **/
  @ApiModelProperty(example = "0000000049696aca62d2ea7db9e71aa4f1116ede1eb55f9932e758cc586eb8b6", required = true, value = "Represents the hash of the block where this transaction was mined/confirmed for first time. The hash is defined as a cryptographic digital fingerprint made by hashing the block header twice through the SHA256 algorithm.")

  public String getMinedInBlockHash() {
    return minedInBlockHash;
  }


  public void setMinedInBlockHash(String minedInBlockHash) {
    this.minedInBlockHash = minedInBlockHash;
  }


  public GetOmniTransactionDetailsByTransactionIDTxidRI minedInBlockHeight(Integer minedInBlockHeight) {
    
    this.minedInBlockHeight = minedInBlockHeight;
    return this;
  }

   /**
   * Represents the hight of the block where this transaction was mined/confirmed for first time. The height is defined as the number of blocks in the blockchain preceding this specific block.
   * @return minedInBlockHeight
  **/
  @ApiModelProperty(example = "1941239", required = true, value = "Represents the hight of the block where this transaction was mined/confirmed for first time. The height is defined as the number of blocks in the blockchain preceding this specific block.")

  public Integer getMinedInBlockHeight() {
    return minedInBlockHeight;
  }


  public void setMinedInBlockHeight(Integer minedInBlockHeight) {
    this.minedInBlockHeight = minedInBlockHeight;
  }


  public GetOmniTransactionDetailsByTransactionIDTxidRI propertyId(Integer propertyId) {
    
    this.propertyId = propertyId;
    return this;
  }

   /**
   * Represents the identifier of the tokens to send.
   * @return propertyId
  **/
  @ApiModelProperty(example = "2", required = true, value = "Represents the identifier of the tokens to send.")

  public Integer getPropertyId() {
    return propertyId;
  }


  public void setPropertyId(Integer propertyId) {
    this.propertyId = propertyId;
  }


  public GetOmniTransactionDetailsByTransactionIDTxidRI recipients(List<ListOmniTransactionsByAddressRIRecipients> recipients) {
    
    this.recipients = recipients;
    return this;
  }

  public GetOmniTransactionDetailsByTransactionIDTxidRI addRecipientsItem(ListOmniTransactionsByAddressRIRecipients recipientsItem) {
    this.recipients.add(recipientsItem);
    return this;
  }

   /**
   * Represents an object of addresses that receive the transactions.
   * @return recipients
  **/
  @ApiModelProperty(required = true, value = "Represents an object of addresses that receive the transactions.")

  public List<ListOmniTransactionsByAddressRIRecipients> getRecipients() {
    return recipients;
  }


  public void setRecipients(List<ListOmniTransactionsByAddressRIRecipients> recipients) {
    this.recipients = recipients;
  }


  public GetOmniTransactionDetailsByTransactionIDTxidRI senders(List<GetOmniTransactionDetailsByTransactionIDTxidRISenders> senders) {
    
    this.senders = senders;
    return this;
  }

  public GetOmniTransactionDetailsByTransactionIDTxidRI addSendersItem(GetOmniTransactionDetailsByTransactionIDTxidRISenders sendersItem) {
    this.senders.add(sendersItem);
    return this;
  }

   /**
   * Represents an object of addresses that provide the funds.
   * @return senders
  **/
  @ApiModelProperty(required = true, value = "Represents an object of addresses that provide the funds.")

  public List<GetOmniTransactionDetailsByTransactionIDTxidRISenders> getSenders() {
    return senders;
  }


  public void setSenders(List<GetOmniTransactionDetailsByTransactionIDTxidRISenders> senders) {
    this.senders = senders;
  }


  public GetOmniTransactionDetailsByTransactionIDTxidRI timestamp(Integer timestamp) {
    
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Defines the exact date/time in Unix Timestamp when this transaction was mined, confirmed or first seen in Mempool, if it is unconfirmed.
   * @return timestamp
  **/
  @ApiModelProperty(example = "1616423278", required = true, value = "Defines the exact date/time in Unix Timestamp when this transaction was mined, confirmed or first seen in Mempool, if it is unconfirmed.")

  public Integer getTimestamp() {
    return timestamp;
  }


  public void setTimestamp(Integer timestamp) {
    this.timestamp = timestamp;
  }


  public GetOmniTransactionDetailsByTransactionIDTxidRI transactionId(String transactionId) {
    
    this.transactionId = transactionId;
    return this;
  }

   /**
   * Represents the unique identifier of a transaction, i.e. it could be &#x60;transactionId&#x60; in UTXO-based protocols like Bitcoin, and transaction &#x60;hash&#x60; in Ethereum blockchain.
   * @return transactionId
  **/
  @ApiModelProperty(example = "d237ff4a681617b767bf22c4e1e8f5115b95c8c168d6cf53bbdec68529f91ecb", required = true, value = "Represents the unique identifier of a transaction, i.e. it could be `transactionId` in UTXO-based protocols like Bitcoin, and transaction `hash` in Ethereum blockchain.")

  public String getTransactionId() {
    return transactionId;
  }


  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }


  public GetOmniTransactionDetailsByTransactionIDTxidRI type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Defines the type of the transaction as a string.
   * @return type
  **/
  @ApiModelProperty(example = "Simple Send", required = true, value = "Defines the type of the transaction as a string.")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public GetOmniTransactionDetailsByTransactionIDTxidRI typeInt(Integer typeInt) {
    
    this.typeInt = typeInt;
    return this;
  }

   /**
   * Defines the type of the transaction as a number.
   * @return typeInt
  **/
  @ApiModelProperty(example = "0", required = true, value = "Defines the type of the transaction as a number.")

  public Integer getTypeInt() {
    return typeInt;
  }


  public void setTypeInt(Integer typeInt) {
    this.typeInt = typeInt;
  }


  public GetOmniTransactionDetailsByTransactionIDTxidRI valid(Boolean valid) {
    
    this.valid = valid;
    return this;
  }

   /**
   * Defines whether the transaction is valid or not, as boolean. E.g. if set to \&quot;true\&quot;, it means the transaction is valid.
   * @return valid
  **/
  @ApiModelProperty(example = "true", required = true, value = "Defines whether the transaction is valid or not, as boolean. E.g. if set to \"true\", it means the transaction is valid.")

  public Boolean getValid() {
    return valid;
  }


  public void setValid(Boolean valid) {
    this.valid = valid;
  }


  public GetOmniTransactionDetailsByTransactionIDTxidRI version(Integer version) {
    
    this.version = version;
    return this;
  }

   /**
   * Defines the specific version.
   * @return version
  **/
  @ApiModelProperty(example = "0", required = true, value = "Defines the specific version.")

  public Integer getVersion() {
    return version;
  }


  public void setVersion(Integer version) {
    this.version = version;
  }


  public GetOmniTransactionDetailsByTransactionIDTxidRI fee(ListUnconfirmedOmniTransactionsByAddressRIFee fee) {
    
    this.fee = fee;
    return this;
  }

   /**
   * Get fee
   * @return fee
  **/
  @ApiModelProperty(required = true, value = "")

  public ListUnconfirmedOmniTransactionsByAddressRIFee getFee() {
    return fee;
  }


  public void setFee(ListUnconfirmedOmniTransactionsByAddressRIFee fee) {
    this.fee = fee;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetOmniTransactionDetailsByTransactionIDTxidRI getOmniTransactionDetailsByTransactionIDTxidRI = (GetOmniTransactionDetailsByTransactionIDTxidRI) o;
    return Objects.equals(this.amount, getOmniTransactionDetailsByTransactionIDTxidRI.amount) &&
        Objects.equals(this.divisible, getOmniTransactionDetailsByTransactionIDTxidRI.divisible) &&
        Objects.equals(this.minedInBlockHash, getOmniTransactionDetailsByTransactionIDTxidRI.minedInBlockHash) &&
        Objects.equals(this.minedInBlockHeight, getOmniTransactionDetailsByTransactionIDTxidRI.minedInBlockHeight) &&
        Objects.equals(this.propertyId, getOmniTransactionDetailsByTransactionIDTxidRI.propertyId) &&
        Objects.equals(this.recipients, getOmniTransactionDetailsByTransactionIDTxidRI.recipients) &&
        Objects.equals(this.senders, getOmniTransactionDetailsByTransactionIDTxidRI.senders) &&
        Objects.equals(this.timestamp, getOmniTransactionDetailsByTransactionIDTxidRI.timestamp) &&
        Objects.equals(this.transactionId, getOmniTransactionDetailsByTransactionIDTxidRI.transactionId) &&
        Objects.equals(this.type, getOmniTransactionDetailsByTransactionIDTxidRI.type) &&
        Objects.equals(this.typeInt, getOmniTransactionDetailsByTransactionIDTxidRI.typeInt) &&
        Objects.equals(this.valid, getOmniTransactionDetailsByTransactionIDTxidRI.valid) &&
        Objects.equals(this.version, getOmniTransactionDetailsByTransactionIDTxidRI.version) &&
        Objects.equals(this.fee, getOmniTransactionDetailsByTransactionIDTxidRI.fee);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, divisible, minedInBlockHash, minedInBlockHeight, propertyId, recipients, senders, timestamp, transactionId, type, typeInt, valid, version, fee);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetOmniTransactionDetailsByTransactionIDTxidRI {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    divisible: ").append(toIndentedString(divisible)).append("\n");
    sb.append("    minedInBlockHash: ").append(toIndentedString(minedInBlockHash)).append("\n");
    sb.append("    minedInBlockHeight: ").append(toIndentedString(minedInBlockHeight)).append("\n");
    sb.append("    propertyId: ").append(toIndentedString(propertyId)).append("\n");
    sb.append("    recipients: ").append(toIndentedString(recipients)).append("\n");
    sb.append("    senders: ").append(toIndentedString(senders)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    typeInt: ").append(toIndentedString(typeInt)).append("\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    fee: ").append(toIndentedString(fee)).append("\n");
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

