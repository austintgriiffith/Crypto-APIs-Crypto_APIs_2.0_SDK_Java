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
 * Ethereum Classic
 */
@ApiModel(description = "Ethereum Classic")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-25T12:38:09.413192Z[Etc/UTC]")
public class ListLatestMinedBlocksRIBSEC {
  public static final String SERIALIZED_NAME_EXTRA_DATA = "extraData";
  @SerializedName(SERIALIZED_NAME_EXTRA_DATA)
  private String extraData;

  public static final String SERIALIZED_NAME_GAS_LIMIT = "gasLimit";
  @SerializedName(SERIALIZED_NAME_GAS_LIMIT)
  private String gasLimit;

  public static final String SERIALIZED_NAME_GAS_USED = "gasUsed";
  @SerializedName(SERIALIZED_NAME_GAS_USED)
  private String gasUsed;

  public static final String SERIALIZED_NAME_MINED_IN_SECONDS = "minedInSeconds";
  @SerializedName(SERIALIZED_NAME_MINED_IN_SECONDS)
  private Integer minedInSeconds;

  public static final String SERIALIZED_NAME_SHA3_UNCLES = "sha3Uncles";
  @SerializedName(SERIALIZED_NAME_SHA3_UNCLES)
  private String sha3Uncles;

  public static final String SERIALIZED_NAME_TOTAL_DIFFICULTY = "totalDifficulty";
  @SerializedName(SERIALIZED_NAME_TOTAL_DIFFICULTY)
  private String totalDifficulty;

  public static final String SERIALIZED_NAME_UNCLES = "uncles";
  @SerializedName(SERIALIZED_NAME_UNCLES)
  private List<String> uncles = new ArrayList<String>();


  public ListLatestMinedBlocksRIBSEC extraData(String extraData) {
    
    this.extraData = extraData;
    return this;
  }

   /**
   * Represents any data that can be included by the miner in the block.
   * @return extraData
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "0xd983010203844765746887676f312e342e328777696e646f7773", required = true, value = "Represents any data that can be included by the miner in the block.")

  public String getExtraData() {
    return extraData;
  }


  public void setExtraData(String extraData) {
    this.extraData = extraData;
  }


  public ListLatestMinedBlocksRIBSEC gasLimit(String gasLimit) {
    
    this.gasLimit = gasLimit;
    return this;
  }

   /**
   * Defines the total gas limit of all transactions in the block.
   * @return gasLimit
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "7999992", required = true, value = "Defines the total gas limit of all transactions in the block.")

  public String getGasLimit() {
    return gasLimit;
  }


  public void setGasLimit(String gasLimit) {
    this.gasLimit = gasLimit;
  }


  public ListLatestMinedBlocksRIBSEC gasUsed(String gasUsed) {
    
    this.gasUsed = gasUsed;
    return this;
  }

   /**
   * Represents the total amount of gas used by all transactions in this block.
   * @return gasUsed
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "6494", required = true, value = "Represents the total amount of gas used by all transactions in this block.")

  public String getGasUsed() {
    return gasUsed;
  }


  public void setGasUsed(String gasUsed) {
    this.gasUsed = gasUsed;
  }


  public ListLatestMinedBlocksRIBSEC minedInSeconds(Integer minedInSeconds) {
    
    this.minedInSeconds = minedInSeconds;
    return this;
  }

   /**
   * Specifies the amount of time required for the block to be mined in seconds.
   * @return minedInSeconds
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "6", required = true, value = "Specifies the amount of time required for the block to be mined in seconds.")

  public Integer getMinedInSeconds() {
    return minedInSeconds;
  }


  public void setMinedInSeconds(Integer minedInSeconds) {
    this.minedInSeconds = minedInSeconds;
  }


  public ListLatestMinedBlocksRIBSEC sha3Uncles(String sha3Uncles) {
    
    this.sha3Uncles = sha3Uncles;
    return this;
  }

   /**
   * Defines the combined hash of all uncles for a given parent.
   * @return sha3Uncles
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "0x1dcc4de8dec75d7aab85b567b6ccd41ad312451b948a7413f0a142fd40d49347", required = true, value = "Defines the combined hash of all uncles for a given parent.")

  public String getSha3Uncles() {
    return sha3Uncles;
  }


  public void setSha3Uncles(String sha3Uncles) {
    this.sha3Uncles = sha3Uncles;
  }


  public ListLatestMinedBlocksRIBSEC totalDifficulty(String totalDifficulty) {
    
    this.totalDifficulty = totalDifficulty;
    return this;
  }

   /**
   * Defines the total difficulty of the chain until this block, i.e. how difficult it is for a specific miner to mine a new block.
   * @return totalDifficulty
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1086033282060494457577", required = true, value = "Defines the total difficulty of the chain until this block, i.e. how difficult it is for a specific miner to mine a new block.")

  public String getTotalDifficulty() {
    return totalDifficulty;
  }


  public void setTotalDifficulty(String totalDifficulty) {
    this.totalDifficulty = totalDifficulty;
  }


  public ListLatestMinedBlocksRIBSEC uncles(List<String> uncles) {
    
    this.uncles = uncles;
    return this;
  }

  public ListLatestMinedBlocksRIBSEC addUnclesItem(String unclesItem) {
    this.uncles.add(unclesItem);
    return this;
  }

   /**
   * Get uncles
   * @return uncles
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<String> getUncles() {
    return uncles;
  }


  public void setUncles(List<String> uncles) {
    this.uncles = uncles;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListLatestMinedBlocksRIBSEC listLatestMinedBlocksRIBSEC = (ListLatestMinedBlocksRIBSEC) o;
    return Objects.equals(this.extraData, listLatestMinedBlocksRIBSEC.extraData) &&
        Objects.equals(this.gasLimit, listLatestMinedBlocksRIBSEC.gasLimit) &&
        Objects.equals(this.gasUsed, listLatestMinedBlocksRIBSEC.gasUsed) &&
        Objects.equals(this.minedInSeconds, listLatestMinedBlocksRIBSEC.minedInSeconds) &&
        Objects.equals(this.sha3Uncles, listLatestMinedBlocksRIBSEC.sha3Uncles) &&
        Objects.equals(this.totalDifficulty, listLatestMinedBlocksRIBSEC.totalDifficulty) &&
        Objects.equals(this.uncles, listLatestMinedBlocksRIBSEC.uncles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extraData, gasLimit, gasUsed, minedInSeconds, sha3Uncles, totalDifficulty, uncles);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListLatestMinedBlocksRIBSEC {\n");
    sb.append("    extraData: ").append(toIndentedString(extraData)).append("\n");
    sb.append("    gasLimit: ").append(toIndentedString(gasLimit)).append("\n");
    sb.append("    gasUsed: ").append(toIndentedString(gasUsed)).append("\n");
    sb.append("    minedInSeconds: ").append(toIndentedString(minedInSeconds)).append("\n");
    sb.append("    sha3Uncles: ").append(toIndentedString(sha3Uncles)).append("\n");
    sb.append("    totalDifficulty: ").append(toIndentedString(totalDifficulty)).append("\n");
    sb.append("    uncles: ").append(toIndentedString(uncles)).append("\n");
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
