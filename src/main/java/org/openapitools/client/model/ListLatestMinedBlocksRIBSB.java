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
 * Bitcoin
 */
@ApiModel(description = "Bitcoin")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-25T12:38:09.413192Z[Etc/UTC]")
public class ListLatestMinedBlocksRIBSB {
  public static final String SERIALIZED_NAME_BITS = "bits";
  @SerializedName(SERIALIZED_NAME_BITS)
  private String bits;

  public static final String SERIALIZED_NAME_CHAINWORK = "chainwork";
  @SerializedName(SERIALIZED_NAME_CHAINWORK)
  private String chainwork;

  public static final String SERIALIZED_NAME_MERKLE_ROOT = "merkleRoot";
  @SerializedName(SERIALIZED_NAME_MERKLE_ROOT)
  private String merkleRoot;

  public static final String SERIALIZED_NAME_STRIPPED_SIZE = "strippedSize";
  @SerializedName(SERIALIZED_NAME_STRIPPED_SIZE)
  private Integer strippedSize;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private Integer version;

  public static final String SERIALIZED_NAME_VERSION_HEX = "versionHex";
  @SerializedName(SERIALIZED_NAME_VERSION_HEX)
  private String versionHex;

  public static final String SERIALIZED_NAME_WEIGHT = "weight";
  @SerializedName(SERIALIZED_NAME_WEIGHT)
  private Integer weight;


  public ListLatestMinedBlocksRIBSB bits(String bits) {
    
    this.bits = bits;
    return this;
  }

   /**
   * A sub-unit of BCH equal to 0.000001 BCH, or 100 Satoshi, and is the same as microbitcoincash (μBCH). Bits have two-decimal precision.
   * @return bits
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "423838743", required = true, value = "A sub-unit of BCH equal to 0.000001 BCH, or 100 Satoshi, and is the same as microbitcoincash (μBCH). Bits have two-decimal precision.")

  public String getBits() {
    return bits;
  }


  public void setBits(String bits) {
    this.bits = bits;
  }


  public ListLatestMinedBlocksRIBSB chainwork(String chainwork) {
    
    this.chainwork = chainwork;
    return this;
  }

   /**
   * Represents a hexadecimal number of all the hashes necessary to produce the current chain. E.g., when converting 0000000000000000000000000000000000000000000086859f7a841475b236fd to a decimal you get 635262017308958427068157 hashes, or 635262 exahashes.
   * @return chainwork
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "0000000000000000000000000000000000000000000005c9475aae89058a50a6", required = true, value = "Represents a hexadecimal number of all the hashes necessary to produce the current chain. E.g., when converting 0000000000000000000000000000000000000000000086859f7a841475b236fd to a decimal you get 635262017308958427068157 hashes, or 635262 exahashes.")

  public String getChainwork() {
    return chainwork;
  }


  public void setChainwork(String chainwork) {
    this.chainwork = chainwork;
  }


  public ListLatestMinedBlocksRIBSB merkleRoot(String merkleRoot) {
    
    this.merkleRoot = merkleRoot;
    return this;
  }

   /**
   * Defines the single and final (root) node of a Merkle tree. It is the combined hash of all transactions&#39; hashes that are part of a blockchain block.
   * @return merkleRoot
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "d3a49e75a5c53ef277bfe0f6474c8ff35c9d3d8f9f9e65a1d3bf45ecff601c82", required = true, value = "Defines the single and final (root) node of a Merkle tree. It is the combined hash of all transactions' hashes that are part of a blockchain block.")

  public String getMerkleRoot() {
    return merkleRoot;
  }


  public void setMerkleRoot(String merkleRoot) {
    this.merkleRoot = merkleRoot;
  }


  public ListLatestMinedBlocksRIBSB strippedSize(Integer strippedSize) {
    
    this.strippedSize = strippedSize;
    return this;
  }

   /**
   * Defines the numeric representation of the block size excluding the witness data.
   * @return strippedSize
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "502", required = true, value = "Defines the numeric representation of the block size excluding the witness data.")

  public Integer getStrippedSize() {
    return strippedSize;
  }


  public void setStrippedSize(Integer strippedSize) {
    this.strippedSize = strippedSize;
  }


  public ListLatestMinedBlocksRIBSB version(Integer version) {
    
    this.version = version;
    return this;
  }

   /**
   * Represents the version of the specific block on the blockchain.
   * @return version
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "536870916", required = true, value = "Represents the version of the specific block on the blockchain.")

  public Integer getVersion() {
    return version;
  }


  public void setVersion(Integer version) {
    this.version = version;
  }


  public ListLatestMinedBlocksRIBSB versionHex(String versionHex) {
    
    this.versionHex = versionHex;
    return this;
  }

   /**
   * Is the hexadecimal string representation of the block&#39;s version.
   * @return versionHex
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "20000004", required = true, value = "Is the hexadecimal string representation of the block's version.")

  public String getVersionHex() {
    return versionHex;
  }


  public void setVersionHex(String versionHex) {
    this.versionHex = versionHex;
  }


  public ListLatestMinedBlocksRIBSB weight(Integer weight) {
    
    this.weight = weight;
    return this;
  }

   /**
   * Represents a measurement to compare the size of different transactions to each other in proportion to the block size limit.
   * @return weight
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2263", required = true, value = "Represents a measurement to compare the size of different transactions to each other in proportion to the block size limit.")

  public Integer getWeight() {
    return weight;
  }


  public void setWeight(Integer weight) {
    this.weight = weight;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListLatestMinedBlocksRIBSB listLatestMinedBlocksRIBSB = (ListLatestMinedBlocksRIBSB) o;
    return Objects.equals(this.bits, listLatestMinedBlocksRIBSB.bits) &&
        Objects.equals(this.chainwork, listLatestMinedBlocksRIBSB.chainwork) &&
        Objects.equals(this.merkleRoot, listLatestMinedBlocksRIBSB.merkleRoot) &&
        Objects.equals(this.strippedSize, listLatestMinedBlocksRIBSB.strippedSize) &&
        Objects.equals(this.version, listLatestMinedBlocksRIBSB.version) &&
        Objects.equals(this.versionHex, listLatestMinedBlocksRIBSB.versionHex) &&
        Objects.equals(this.weight, listLatestMinedBlocksRIBSB.weight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bits, chainwork, merkleRoot, strippedSize, version, versionHex, weight);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListLatestMinedBlocksRIBSB {\n");
    sb.append("    bits: ").append(toIndentedString(bits)).append("\n");
    sb.append("    chainwork: ").append(toIndentedString(chainwork)).append("\n");
    sb.append("    merkleRoot: ").append(toIndentedString(merkleRoot)).append("\n");
    sb.append("    strippedSize: ").append(toIndentedString(strippedSize)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    versionHex: ").append(toIndentedString(versionHex)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
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

