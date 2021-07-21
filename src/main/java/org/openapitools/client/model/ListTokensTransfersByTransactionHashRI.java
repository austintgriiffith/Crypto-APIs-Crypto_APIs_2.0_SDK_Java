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
 * ListTokensTransfersByTransactionHashRI
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-07-20T13:36:32.071127Z[Etc/UTC]")
public class ListTokensTransfersByTransactionHashRI {
  public static final String SERIALIZED_NAME_CONTRACT_ADDRESS = "contractAddress";
  @SerializedName(SERIALIZED_NAME_CONTRACT_ADDRESS)
  private String contractAddress;

  public static final String SERIALIZED_NAME_MINED_IN_BLOCK_HEIGHT = "minedInBlockHeight";
  @SerializedName(SERIALIZED_NAME_MINED_IN_BLOCK_HEIGHT)
  private Integer minedInBlockHeight;

  public static final String SERIALIZED_NAME_RECIPIENT_ADDRESS = "recipientAddress";
  @SerializedName(SERIALIZED_NAME_RECIPIENT_ADDRESS)
  private String recipientAddress;

  public static final String SERIALIZED_NAME_SENDER_ADDRESS = "senderAddress";
  @SerializedName(SERIALIZED_NAME_SENDER_ADDRESS)
  private String senderAddress;

  public static final String SERIALIZED_NAME_TOKEN_DECIMALS = "tokenDecimals";
  @SerializedName(SERIALIZED_NAME_TOKEN_DECIMALS)
  private Integer tokenDecimals;

  public static final String SERIALIZED_NAME_TOKEN_NAME = "tokenName";
  @SerializedName(SERIALIZED_NAME_TOKEN_NAME)
  private String tokenName;

  public static final String SERIALIZED_NAME_TOKEN_SYMBOL = "tokenSymbol";
  @SerializedName(SERIALIZED_NAME_TOKEN_SYMBOL)
  private String tokenSymbol;

  public static final String SERIALIZED_NAME_TOKEN_TYPE = "tokenType";
  @SerializedName(SERIALIZED_NAME_TOKEN_TYPE)
  private String tokenType;

  public static final String SERIALIZED_NAME_TOKENS_AMOUNT = "tokensAmount";
  @SerializedName(SERIALIZED_NAME_TOKENS_AMOUNT)
  private String tokensAmount;

  public static final String SERIALIZED_NAME_TRANSACTION_HASH = "transactionHash";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_HASH)
  private String transactionHash;

  public static final String SERIALIZED_NAME_TRANSACTION_TIMESTAMP = "transactionTimestamp";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_TIMESTAMP)
  private Integer transactionTimestamp;


  public ListTokensTransfersByTransactionHashRI contractAddress(String contractAddress) {
    
    this.contractAddress = contractAddress;
    return this;
  }

   /**
   * Represents the contract address of the token, which controls its logic. It is not the address that holds the tokens.
   * @return contractAddress
  **/
  @ApiModelProperty(example = "0x7495fede000c8a3b77eeae09cf70fa94cd2d53f5", required = true, value = "Represents the contract address of the token, which controls its logic. It is not the address that holds the tokens.")

  public String getContractAddress() {
    return contractAddress;
  }


  public void setContractAddress(String contractAddress) {
    this.contractAddress = contractAddress;
  }


  public ListTokensTransfersByTransactionHashRI minedInBlockHeight(Integer minedInBlockHeight) {
    
    this.minedInBlockHeight = minedInBlockHeight;
    return this;
  }

   /**
   * Defines the block height in which this transaction was confirmed/mined.
   * @return minedInBlockHeight
  **/
  @ApiModelProperty(example = "9841271", required = true, value = "Defines the block height in which this transaction was confirmed/mined.")

  public Integer getMinedInBlockHeight() {
    return minedInBlockHeight;
  }


  public void setMinedInBlockHeight(Integer minedInBlockHeight) {
    this.minedInBlockHeight = minedInBlockHeight;
  }


  public ListTokensTransfersByTransactionHashRI recipientAddress(String recipientAddress) {
    
    this.recipientAddress = recipientAddress;
    return this;
  }

   /**
   * Defines the address to which the recipient receives the transferred tokens.
   * @return recipientAddress
  **/
  @ApiModelProperty(example = "0x9e91eb3a35b96f0f0fe71f3c17fe8d29eb406b16", required = true, value = "Defines the address to which the recipient receives the transferred tokens.")

  public String getRecipientAddress() {
    return recipientAddress;
  }


  public void setRecipientAddress(String recipientAddress) {
    this.recipientAddress = recipientAddress;
  }


  public ListTokensTransfersByTransactionHashRI senderAddress(String senderAddress) {
    
    this.senderAddress = senderAddress;
    return this;
  }

   /**
   * Defines the address from which the sender transfers tokens.
   * @return senderAddress
  **/
  @ApiModelProperty(example = "0x9df8a6441e8a3dda75019595d431f9aa0dec475c", required = true, value = "Defines the address from which the sender transfers tokens.")

  public String getSenderAddress() {
    return senderAddress;
  }


  public void setSenderAddress(String senderAddress) {
    this.senderAddress = senderAddress;
  }


  public ListTokensTransfersByTransactionHashRI tokenDecimals(Integer tokenDecimals) {
    
    this.tokenDecimals = tokenDecimals;
    return this;
  }

   /**
   * Defines the decimals of the token, i.e. the number of digits that come after the decimal coma of the token.
   * @return tokenDecimals
  **/
  @ApiModelProperty(example = "18", required = true, value = "Defines the decimals of the token, i.e. the number of digits that come after the decimal coma of the token.")

  public Integer getTokenDecimals() {
    return tokenDecimals;
  }


  public void setTokenDecimals(Integer tokenDecimals) {
    this.tokenDecimals = tokenDecimals;
  }


  public ListTokensTransfersByTransactionHashRI tokenName(String tokenName) {
    
    this.tokenName = tokenName;
    return this;
  }

   /**
   * Defines the token&#39;s name as a string.
   * @return tokenName
  **/
  @ApiModelProperty(example = "Band Protocol", required = true, value = "Defines the token's name as a string.")

  public String getTokenName() {
    return tokenName;
  }


  public void setTokenName(String tokenName) {
    this.tokenName = tokenName;
  }


  public ListTokensTransfersByTransactionHashRI tokenSymbol(String tokenSymbol) {
    
    this.tokenSymbol = tokenSymbol;
    return this;
  }

   /**
   * Defines the token symbol by which the token contract is known. It is usually 3-4 characters in length.
   * @return tokenSymbol
  **/
  @ApiModelProperty(example = "BAND", required = true, value = "Defines the token symbol by which the token contract is known. It is usually 3-4 characters in length.")

  public String getTokenSymbol() {
    return tokenSymbol;
  }


  public void setTokenSymbol(String tokenSymbol) {
    this.tokenSymbol = tokenSymbol;
  }


  public ListTokensTransfersByTransactionHashRI tokenType(String tokenType) {
    
    this.tokenType = tokenType;
    return this;
  }

   /**
   * Defines the specific token type.
   * @return tokenType
  **/
  @ApiModelProperty(example = "ERC-20", required = true, value = "Defines the specific token type.")

  public String getTokenType() {
    return tokenType;
  }


  public void setTokenType(String tokenType) {
    this.tokenType = tokenType;
  }


  public ListTokensTransfersByTransactionHashRI tokensAmount(String tokensAmount) {
    
    this.tokensAmount = tokensAmount;
    return this;
  }

   /**
   * Defines the token amount of the transfer.
   * @return tokensAmount
  **/
  @ApiModelProperty(example = "0.001", required = true, value = "Defines the token amount of the transfer.")

  public String getTokensAmount() {
    return tokensAmount;
  }


  public void setTokensAmount(String tokensAmount) {
    this.tokensAmount = tokensAmount;
  }


  public ListTokensTransfersByTransactionHashRI transactionHash(String transactionHash) {
    
    this.transactionHash = transactionHash;
    return this;
  }

   /**
   * Represents the hash of the transaction, which is its unique identifier. It represents a cryptographic digital fingerprint made by hashing the block header twice through the SHA256 algorithm.
   * @return transactionHash
  **/
  @ApiModelProperty(example = "0x60ba3dded833e61f63b6b6d62afe5c7526c5ca09c6744749f13eef11afde2cb4", required = true, value = "Represents the hash of the transaction, which is its unique identifier. It represents a cryptographic digital fingerprint made by hashing the block header twice through the SHA256 algorithm.")

  public String getTransactionHash() {
    return transactionHash;
  }


  public void setTransactionHash(String transactionHash) {
    this.transactionHash = transactionHash;
  }


  public ListTokensTransfersByTransactionHashRI transactionTimestamp(Integer transactionTimestamp) {
    
    this.transactionTimestamp = transactionTimestamp;
    return this;
  }

   /**
   * Defines the specific time/date when the transaction was created in Unix Timestamp.
   * @return transactionTimestamp
  **/
  @ApiModelProperty(example = "1615818368", required = true, value = "Defines the specific time/date when the transaction was created in Unix Timestamp.")

  public Integer getTransactionTimestamp() {
    return transactionTimestamp;
  }


  public void setTransactionTimestamp(Integer transactionTimestamp) {
    this.transactionTimestamp = transactionTimestamp;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListTokensTransfersByTransactionHashRI listTokensTransfersByTransactionHashRI = (ListTokensTransfersByTransactionHashRI) o;
    return Objects.equals(this.contractAddress, listTokensTransfersByTransactionHashRI.contractAddress) &&
        Objects.equals(this.minedInBlockHeight, listTokensTransfersByTransactionHashRI.minedInBlockHeight) &&
        Objects.equals(this.recipientAddress, listTokensTransfersByTransactionHashRI.recipientAddress) &&
        Objects.equals(this.senderAddress, listTokensTransfersByTransactionHashRI.senderAddress) &&
        Objects.equals(this.tokenDecimals, listTokensTransfersByTransactionHashRI.tokenDecimals) &&
        Objects.equals(this.tokenName, listTokensTransfersByTransactionHashRI.tokenName) &&
        Objects.equals(this.tokenSymbol, listTokensTransfersByTransactionHashRI.tokenSymbol) &&
        Objects.equals(this.tokenType, listTokensTransfersByTransactionHashRI.tokenType) &&
        Objects.equals(this.tokensAmount, listTokensTransfersByTransactionHashRI.tokensAmount) &&
        Objects.equals(this.transactionHash, listTokensTransfersByTransactionHashRI.transactionHash) &&
        Objects.equals(this.transactionTimestamp, listTokensTransfersByTransactionHashRI.transactionTimestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contractAddress, minedInBlockHeight, recipientAddress, senderAddress, tokenDecimals, tokenName, tokenSymbol, tokenType, tokensAmount, transactionHash, transactionTimestamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListTokensTransfersByTransactionHashRI {\n");
    sb.append("    contractAddress: ").append(toIndentedString(contractAddress)).append("\n");
    sb.append("    minedInBlockHeight: ").append(toIndentedString(minedInBlockHeight)).append("\n");
    sb.append("    recipientAddress: ").append(toIndentedString(recipientAddress)).append("\n");
    sb.append("    senderAddress: ").append(toIndentedString(senderAddress)).append("\n");
    sb.append("    tokenDecimals: ").append(toIndentedString(tokenDecimals)).append("\n");
    sb.append("    tokenName: ").append(toIndentedString(tokenName)).append("\n");
    sb.append("    tokenSymbol: ").append(toIndentedString(tokenSymbol)).append("\n");
    sb.append("    tokenType: ").append(toIndentedString(tokenType)).append("\n");
    sb.append("    tokensAmount: ").append(toIndentedString(tokensAmount)).append("\n");
    sb.append("    transactionHash: ").append(toIndentedString(transactionHash)).append("\n");
    sb.append("    transactionTimestamp: ").append(toIndentedString(transactionTimestamp)).append("\n");
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

