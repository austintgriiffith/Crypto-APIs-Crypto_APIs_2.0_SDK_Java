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

/**
 * GetZilliqaBlockDetailsByBlockHashRI
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-25T12:38:09.413192Z[Etc/UTC]")
public class GetZilliqaBlockDetailsByBlockHashRI {
  public static final String SERIALIZED_NAME_BLOCK_HEIGHT = "blockHeight";
  @SerializedName(SERIALIZED_NAME_BLOCK_HEIGHT)
  private Integer blockHeight;

  public static final String SERIALIZED_NAME_DIFFICULTY = "difficulty";
  @SerializedName(SERIALIZED_NAME_DIFFICULTY)
  private String difficulty;

  public static final String SERIALIZED_NAME_DS_BLOCK = "dsBlock";
  @SerializedName(SERIALIZED_NAME_DS_BLOCK)
  private Integer dsBlock;

  public static final String SERIALIZED_NAME_DS_DIFFICULTY = "dsDifficulty";
  @SerializedName(SERIALIZED_NAME_DS_DIFFICULTY)
  private String dsDifficulty;

  public static final String SERIALIZED_NAME_DS_LEADER = "dsLeader";
  @SerializedName(SERIALIZED_NAME_DS_LEADER)
  private String dsLeader;

  public static final String SERIALIZED_NAME_GAS_LIMIT = "gasLimit";
  @SerializedName(SERIALIZED_NAME_GAS_LIMIT)
  private Integer gasLimit;

  public static final String SERIALIZED_NAME_GAS_USED = "gasUsed";
  @SerializedName(SERIALIZED_NAME_GAS_USED)
  private Integer gasUsed;

  public static final String SERIALIZED_NAME_MICRO_BLOCKS = "microBlocks";
  @SerializedName(SERIALIZED_NAME_MICRO_BLOCKS)
  private List<String> microBlocks = new ArrayList<String>();

  public static final String SERIALIZED_NAME_NEXT_BLOCK_HASH = "nextBlockHash";
  @SerializedName(SERIALIZED_NAME_NEXT_BLOCK_HASH)
  private String nextBlockHash;

  public static final String SERIALIZED_NAME_PREVIOUS_BLOCK_HASH = "previousBlockHash";
  @SerializedName(SERIALIZED_NAME_PREVIOUS_BLOCK_HASH)
  private String previousBlockHash;

  public static final String SERIALIZED_NAME_TIMESTAMP = "timestamp";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP)
  private Integer timestamp;

  public static final String SERIALIZED_NAME_TRANSACTIONS_COUNT = "transactionsCount";
  @SerializedName(SERIALIZED_NAME_TRANSACTIONS_COUNT)
  private Integer transactionsCount;


  public GetZilliqaBlockDetailsByBlockHashRI blockHeight(Integer blockHeight) {
    
    this.blockHeight = blockHeight;
    return this;
  }

   /**
   * Represents the number of blocks in the blockchain preceding this specific block. Block numbers have no gaps. A blockchain usually starts with block 0 called the \&quot;Genesis block\&quot;.
   * @return blockHeight
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1244298", required = true, value = "Represents the number of blocks in the blockchain preceding this specific block. Block numbers have no gaps. A blockchain usually starts with block 0 called the \"Genesis block\".")

  public Integer getBlockHeight() {
    return blockHeight;
  }


  public void setBlockHeight(Integer blockHeight) {
    this.blockHeight = blockHeight;
  }


  public GetZilliqaBlockDetailsByBlockHashRI difficulty(String difficulty) {
    
    this.difficulty = difficulty;
    return this;
  }

   /**
   * Defines how difficult it is for a specific miner to mine the block.
   * @return difficulty
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "41.375", required = true, value = "Defines how difficult it is for a specific miner to mine the block.")

  public String getDifficulty() {
    return difficulty;
  }


  public void setDifficulty(String difficulty) {
    this.difficulty = difficulty;
  }


  public GetZilliqaBlockDetailsByBlockHashRI dsBlock(Integer dsBlock) {
    
    this.dsBlock = dsBlock;
    return this;
  }

   /**
   * Represents the Directory Service block which contains metadata about the miners who participate in the consensus protocol.
   * @return dsBlock
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "12443", required = true, value = "Represents the Directory Service block which contains metadata about the miners who participate in the consensus protocol.")

  public Integer getDsBlock() {
    return dsBlock;
  }


  public void setDsBlock(Integer dsBlock) {
    this.dsBlock = dsBlock;
  }


  public GetZilliqaBlockDetailsByBlockHashRI dsDifficulty(String dsDifficulty) {
    
    this.dsDifficulty = dsDifficulty;
    return this;
  }

   /**
   * Defines how difficult it is to mine the dsBlocks.
   * @return dsDifficulty
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "48.625", required = true, value = "Defines how difficult it is to mine the dsBlocks.")

  public String getDsDifficulty() {
    return dsDifficulty;
  }


  public void setDsDifficulty(String dsDifficulty) {
    this.dsDifficulty = dsDifficulty;
  }


  public GetZilliqaBlockDetailsByBlockHashRI dsLeader(String dsLeader) {
    
    this.dsLeader = dsLeader;
    return this;
  }

   /**
   * Represents a part of the DS Committee which leads the consensus protocol for the epoch.
   * @return dsLeader
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "zil1k9hne0uu86wuj2n7qdqwhrm9uma0xn7ut42tsj", required = true, value = "Represents a part of the DS Committee which leads the consensus protocol for the epoch.")

  public String getDsLeader() {
    return dsLeader;
  }


  public void setDsLeader(String dsLeader) {
    this.dsLeader = dsLeader;
  }


  public GetZilliqaBlockDetailsByBlockHashRI gasLimit(Integer gasLimit) {
    
    this.gasLimit = gasLimit;
    return this;
  }

   /**
   * Represents the maximum amount of gas allowed in the block in order to determine how many transactions it can fit.
   * @return gasLimit
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "550000", required = true, value = "Represents the maximum amount of gas allowed in the block in order to determine how many transactions it can fit.")

  public Integer getGasLimit() {
    return gasLimit;
  }


  public void setGasLimit(Integer gasLimit) {
    this.gasLimit = gasLimit;
  }


  public GetZilliqaBlockDetailsByBlockHashRI gasUsed(Integer gasUsed) {
    
    this.gasUsed = gasUsed;
    return this;
  }

   /**
   * Defines how much of the gas for the block has been used.
   * @return gasUsed
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "0", required = true, value = "Defines how much of the gas for the block has been used.")

  public Integer getGasUsed() {
    return gasUsed;
  }


  public void setGasUsed(Integer gasUsed) {
    this.gasUsed = gasUsed;
  }


  public GetZilliqaBlockDetailsByBlockHashRI microBlocks(List<String> microBlocks) {
    
    this.microBlocks = microBlocks;
    return this;
  }

  public GetZilliqaBlockDetailsByBlockHashRI addMicroBlocksItem(String microBlocksItem) {
    this.microBlocks.add(microBlocksItem);
    return this;
  }

   /**
   * Get microBlocks
   * @return microBlocks
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<String> getMicroBlocks() {
    return microBlocks;
  }


  public void setMicroBlocks(List<String> microBlocks) {
    this.microBlocks = microBlocks;
  }


  public GetZilliqaBlockDetailsByBlockHashRI nextBlockHash(String nextBlockHash) {
    
    this.nextBlockHash = nextBlockHash;
    return this;
  }

   /**
   * Defines the hash of the next block from the specific blockchain.
   * @return nextBlockHash
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "0x07939adbc3f5a6ba75968012acfe0fee9a351dca72c814e499fee554281b56b6 Block 1244298 Block 1244300", required = true, value = "Defines the hash of the next block from the specific blockchain.")

  public String getNextBlockHash() {
    return nextBlockHash;
  }


  public void setNextBlockHash(String nextBlockHash) {
    this.nextBlockHash = nextBlockHash;
  }


  public GetZilliqaBlockDetailsByBlockHashRI previousBlockHash(String previousBlockHash) {
    
    this.previousBlockHash = previousBlockHash;
    return this;
  }

   /**
   * Represents the hash of the previous block, also known as the parent block.
   * @return previousBlockHash
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "0xe347b6c09e54a582478f6ccc9f85a386616ad1367e9965e5409fab790e538d16 Block 1244296 Block 1244298", required = true, value = "Represents the hash of the previous block, also known as the parent block.")

  public String getPreviousBlockHash() {
    return previousBlockHash;
  }


  public void setPreviousBlockHash(String previousBlockHash) {
    this.previousBlockHash = previousBlockHash;
  }


  public GetZilliqaBlockDetailsByBlockHashRI timestamp(Integer timestamp) {
    
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Defines the exact date/time when this block was mined in Unix Timestamp.
   * @return timestamp
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1616069434", required = true, value = "Defines the exact date/time when this block was mined in Unix Timestamp.")

  public Integer getTimestamp() {
    return timestamp;
  }


  public void setTimestamp(Integer timestamp) {
    this.timestamp = timestamp;
  }


  public GetZilliqaBlockDetailsByBlockHashRI transactionsCount(Integer transactionsCount) {
    
    this.transactionsCount = transactionsCount;
    return this;
  }

   /**
   * Represents the total number of all transactions as part of this block.
   * @return transactionsCount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "0", required = true, value = "Represents the total number of all transactions as part of this block.")

  public Integer getTransactionsCount() {
    return transactionsCount;
  }


  public void setTransactionsCount(Integer transactionsCount) {
    this.transactionsCount = transactionsCount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetZilliqaBlockDetailsByBlockHashRI getZilliqaBlockDetailsByBlockHashRI = (GetZilliqaBlockDetailsByBlockHashRI) o;
    return Objects.equals(this.blockHeight, getZilliqaBlockDetailsByBlockHashRI.blockHeight) &&
        Objects.equals(this.difficulty, getZilliqaBlockDetailsByBlockHashRI.difficulty) &&
        Objects.equals(this.dsBlock, getZilliqaBlockDetailsByBlockHashRI.dsBlock) &&
        Objects.equals(this.dsDifficulty, getZilliqaBlockDetailsByBlockHashRI.dsDifficulty) &&
        Objects.equals(this.dsLeader, getZilliqaBlockDetailsByBlockHashRI.dsLeader) &&
        Objects.equals(this.gasLimit, getZilliqaBlockDetailsByBlockHashRI.gasLimit) &&
        Objects.equals(this.gasUsed, getZilliqaBlockDetailsByBlockHashRI.gasUsed) &&
        Objects.equals(this.microBlocks, getZilliqaBlockDetailsByBlockHashRI.microBlocks) &&
        Objects.equals(this.nextBlockHash, getZilliqaBlockDetailsByBlockHashRI.nextBlockHash) &&
        Objects.equals(this.previousBlockHash, getZilliqaBlockDetailsByBlockHashRI.previousBlockHash) &&
        Objects.equals(this.timestamp, getZilliqaBlockDetailsByBlockHashRI.timestamp) &&
        Objects.equals(this.transactionsCount, getZilliqaBlockDetailsByBlockHashRI.transactionsCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(blockHeight, difficulty, dsBlock, dsDifficulty, dsLeader, gasLimit, gasUsed, microBlocks, nextBlockHash, previousBlockHash, timestamp, transactionsCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetZilliqaBlockDetailsByBlockHashRI {\n");
    sb.append("    blockHeight: ").append(toIndentedString(blockHeight)).append("\n");
    sb.append("    difficulty: ").append(toIndentedString(difficulty)).append("\n");
    sb.append("    dsBlock: ").append(toIndentedString(dsBlock)).append("\n");
    sb.append("    dsDifficulty: ").append(toIndentedString(dsDifficulty)).append("\n");
    sb.append("    dsLeader: ").append(toIndentedString(dsLeader)).append("\n");
    sb.append("    gasLimit: ").append(toIndentedString(gasLimit)).append("\n");
    sb.append("    gasUsed: ").append(toIndentedString(gasUsed)).append("\n");
    sb.append("    microBlocks: ").append(toIndentedString(microBlocks)).append("\n");
    sb.append("    nextBlockHash: ").append(toIndentedString(nextBlockHash)).append("\n");
    sb.append("    previousBlockHash: ").append(toIndentedString(previousBlockHash)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    transactionsCount: ").append(toIndentedString(transactionsCount)).append("\n");
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

