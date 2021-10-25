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
import org.openapitools.client.model.ListConfirmedTransactionsByAddressRIBSZVJoinSplit;
import org.openapitools.client.model.ListConfirmedTransactionsByAddressRIBSZVShieldedOutput;
import org.openapitools.client.model.ListConfirmedTransactionsByAddressRIBSZVShieldedSpend;
import org.openapitools.client.model.ListConfirmedTransactionsByAddressRIBSZVout;
import org.openapitools.client.model.ListUnconfirmedTransactionsByAddressRIBSZVin;

/**
 * Zcash
 */
@ApiModel(description = "Zcash")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-25T12:38:09.413192Z[Etc/UTC]")
public class ListUnconfirmedTransactionsByAddressRIBSZ {
  public static final String SERIALIZED_NAME_BINDING_SIG = "bindingSig";
  @SerializedName(SERIALIZED_NAME_BINDING_SIG)
  private String bindingSig;

  public static final String SERIALIZED_NAME_EXPIRY_HEIGHT = "expiryHeight";
  @SerializedName(SERIALIZED_NAME_EXPIRY_HEIGHT)
  private Integer expiryHeight;

  public static final String SERIALIZED_NAME_JOIN_SPLIT_PUB_KEY = "joinSplitPubKey";
  @SerializedName(SERIALIZED_NAME_JOIN_SPLIT_PUB_KEY)
  private String joinSplitPubKey;

  public static final String SERIALIZED_NAME_JOIN_SPLIT_SIG = "joinSplitSig";
  @SerializedName(SERIALIZED_NAME_JOIN_SPLIT_SIG)
  private String joinSplitSig;

  public static final String SERIALIZED_NAME_LOCKTIME = "locktime";
  @SerializedName(SERIALIZED_NAME_LOCKTIME)
  private Integer locktime;

  public static final String SERIALIZED_NAME_OVERWINTERED = "overwintered";
  @SerializedName(SERIALIZED_NAME_OVERWINTERED)
  private Boolean overwintered;

  public static final String SERIALIZED_NAME_SIZE = "size";
  @SerializedName(SERIALIZED_NAME_SIZE)
  private Integer size;

  public static final String SERIALIZED_NAME_V_JOIN_SPLIT = "vJoinSplit";
  @SerializedName(SERIALIZED_NAME_V_JOIN_SPLIT)
  private List<ListConfirmedTransactionsByAddressRIBSZVJoinSplit> vJoinSplit = new ArrayList<ListConfirmedTransactionsByAddressRIBSZVJoinSplit>();

  public static final String SERIALIZED_NAME_V_SHIELDED_OUTPUT = "vShieldedOutput";
  @SerializedName(SERIALIZED_NAME_V_SHIELDED_OUTPUT)
  private List<ListConfirmedTransactionsByAddressRIBSZVShieldedOutput> vShieldedOutput = new ArrayList<ListConfirmedTransactionsByAddressRIBSZVShieldedOutput>();

  public static final String SERIALIZED_NAME_V_SHIELDED_SPEND = "vShieldedSpend";
  @SerializedName(SERIALIZED_NAME_V_SHIELDED_SPEND)
  private List<ListConfirmedTransactionsByAddressRIBSZVShieldedSpend> vShieldedSpend = new ArrayList<ListConfirmedTransactionsByAddressRIBSZVShieldedSpend>();

  public static final String SERIALIZED_NAME_VALUE_BALANCE = "valueBalance";
  @SerializedName(SERIALIZED_NAME_VALUE_BALANCE)
  private String valueBalance;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private Integer version;

  public static final String SERIALIZED_NAME_VERSION_GROUP_ID = "versionGroupId";
  @SerializedName(SERIALIZED_NAME_VERSION_GROUP_ID)
  private String versionGroupId;

  public static final String SERIALIZED_NAME_VIN = "vin";
  @SerializedName(SERIALIZED_NAME_VIN)
  private List<ListUnconfirmedTransactionsByAddressRIBSZVin> vin = new ArrayList<ListUnconfirmedTransactionsByAddressRIBSZVin>();

  public static final String SERIALIZED_NAME_VOUT = "vout";
  @SerializedName(SERIALIZED_NAME_VOUT)
  private List<ListConfirmedTransactionsByAddressRIBSZVout> vout = new ArrayList<ListConfirmedTransactionsByAddressRIBSZVout>();


  public ListUnconfirmedTransactionsByAddressRIBSZ bindingSig(String bindingSig) {
    
    this.bindingSig = bindingSig;
    return this;
  }

   /**
   * It is used to enforce balance of Spend and Output transfers, in order to prevent their replay across transactions.
   * @return bindingSig
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "603624b3e78e0de0415dea320797a107076a9f7aabd39f44bc4957803330e9891cb33744ac2ec749c2d2d341f29467c49c0ae35bf34765e2fb7c4cda68584804", required = true, value = "It is used to enforce balance of Spend and Output transfers, in order to prevent their replay across transactions.")

  public String getBindingSig() {
    return bindingSig;
  }


  public void setBindingSig(String bindingSig) {
    this.bindingSig = bindingSig;
  }


  public ListUnconfirmedTransactionsByAddressRIBSZ expiryHeight(Integer expiryHeight) {
    
    this.expiryHeight = expiryHeight;
    return this;
  }

   /**
   * Represents a block height after which the transaction will expire.
   * @return expiryHeight
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "0", required = true, value = "Represents a block height after which the transaction will expire.")

  public Integer getExpiryHeight() {
    return expiryHeight;
  }


  public void setExpiryHeight(Integer expiryHeight) {
    this.expiryHeight = expiryHeight;
  }


  public ListUnconfirmedTransactionsByAddressRIBSZ joinSplitPubKey(String joinSplitPubKey) {
    
    this.joinSplitPubKey = joinSplitPubKey;
    return this;
  }

   /**
   * Represents an encoding of a JoinSplitSig public validating key.
   * @return joinSplitPubKey
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "5d2673b4c727241410e42f214a39218e4f13354d77db8ec31243a7be7ed8e2b7", required = true, value = "Represents an encoding of a JoinSplitSig public validating key.")

  public String getJoinSplitPubKey() {
    return joinSplitPubKey;
  }


  public void setJoinSplitPubKey(String joinSplitPubKey) {
    this.joinSplitPubKey = joinSplitPubKey;
  }


  public ListUnconfirmedTransactionsByAddressRIBSZ joinSplitSig(String joinSplitSig) {
    
    this.joinSplitSig = joinSplitSig;
    return this;
  }

   /**
   * Is used to sign transactions that contain at least one JoinSplit description.
   * @return joinSplitSig
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "8b06b926d619ead780b0769e5997ded93f9851fd0efd4b667afc5bcc2792b26cd4a565b4efa7733535fdc09fa566ca59042785d7fd8043d37fdf9e144465080a", required = true, value = "Is used to sign transactions that contain at least one JoinSplit description.")

  public String getJoinSplitSig() {
    return joinSplitSig;
  }


  public void setJoinSplitSig(String joinSplitSig) {
    this.joinSplitSig = joinSplitSig;
  }


  public ListUnconfirmedTransactionsByAddressRIBSZ locktime(Integer locktime) {
    
    this.locktime = locktime;
    return this;
  }

   /**
   * Represents the locktime on the transaction on the specific blockchain, i.e. the blockheight at which the transaction is valid.
   * @return locktime
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1781965", required = true, value = "Represents the locktime on the transaction on the specific blockchain, i.e. the blockheight at which the transaction is valid.")

  public Integer getLocktime() {
    return locktime;
  }


  public void setLocktime(Integer locktime) {
    this.locktime = locktime;
  }


  public ListUnconfirmedTransactionsByAddressRIBSZ overwintered(Boolean overwintered) {
    
    this.overwintered = overwintered;
    return this;
  }

   /**
   * \&quot;Overwinter\&quot; is the network upgrade for the Zcash blockchain.
   * @return overwintered
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "true", required = true, value = "\"Overwinter\" is the network upgrade for the Zcash blockchain.")

  public Boolean getOverwintered() {
    return overwintered;
  }


  public void setOverwintered(Boolean overwintered) {
    this.overwintered = overwintered;
  }


  public ListUnconfirmedTransactionsByAddressRIBSZ size(Integer size) {
    
    this.size = size;
    return this;
  }

   /**
   * Represents the total size of this transaction.
   * @return size
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "234", required = true, value = "Represents the total size of this transaction.")

  public Integer getSize() {
    return size;
  }


  public void setSize(Integer size) {
    this.size = size;
  }


  public ListUnconfirmedTransactionsByAddressRIBSZ vJoinSplit(List<ListConfirmedTransactionsByAddressRIBSZVJoinSplit> vJoinSplit) {
    
    this.vJoinSplit = vJoinSplit;
    return this;
  }

  public ListUnconfirmedTransactionsByAddressRIBSZ addVJoinSplitItem(ListConfirmedTransactionsByAddressRIBSZVJoinSplit vJoinSplitItem) {
    this.vJoinSplit.add(vJoinSplitItem);
    return this;
  }

   /**
   * Represents a sequence of JoinSplit descriptions using BCTV14 proofs.
   * @return vJoinSplit
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Represents a sequence of JoinSplit descriptions using BCTV14 proofs.")

  public List<ListConfirmedTransactionsByAddressRIBSZVJoinSplit> getvJoinSplit() {
    return vJoinSplit;
  }


  public void setvJoinSplit(List<ListConfirmedTransactionsByAddressRIBSZVJoinSplit> vJoinSplit) {
    this.vJoinSplit = vJoinSplit;
  }


  public ListUnconfirmedTransactionsByAddressRIBSZ vShieldedOutput(List<ListConfirmedTransactionsByAddressRIBSZVShieldedOutput> vShieldedOutput) {
    
    this.vShieldedOutput = vShieldedOutput;
    return this;
  }

  public ListUnconfirmedTransactionsByAddressRIBSZ addVShieldedOutputItem(ListConfirmedTransactionsByAddressRIBSZVShieldedOutput vShieldedOutputItem) {
    this.vShieldedOutput.add(vShieldedOutputItem);
    return this;
  }

   /**
   * Object Array representation of transaction output descriptions
   * @return vShieldedOutput
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Object Array representation of transaction output descriptions")

  public List<ListConfirmedTransactionsByAddressRIBSZVShieldedOutput> getvShieldedOutput() {
    return vShieldedOutput;
  }


  public void setvShieldedOutput(List<ListConfirmedTransactionsByAddressRIBSZVShieldedOutput> vShieldedOutput) {
    this.vShieldedOutput = vShieldedOutput;
  }


  public ListUnconfirmedTransactionsByAddressRIBSZ vShieldedSpend(List<ListConfirmedTransactionsByAddressRIBSZVShieldedSpend> vShieldedSpend) {
    
    this.vShieldedSpend = vShieldedSpend;
    return this;
  }

  public ListUnconfirmedTransactionsByAddressRIBSZ addVShieldedSpendItem(ListConfirmedTransactionsByAddressRIBSZVShieldedSpend vShieldedSpendItem) {
    this.vShieldedSpend.add(vShieldedSpendItem);
    return this;
  }

   /**
   * Object Array representation of transaction spend descriptions
   * @return vShieldedSpend
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Object Array representation of transaction spend descriptions")

  public List<ListConfirmedTransactionsByAddressRIBSZVShieldedSpend> getvShieldedSpend() {
    return vShieldedSpend;
  }


  public void setvShieldedSpend(List<ListConfirmedTransactionsByAddressRIBSZVShieldedSpend> vShieldedSpend) {
    this.vShieldedSpend = vShieldedSpend;
  }


  public ListUnconfirmedTransactionsByAddressRIBSZ valueBalance(String valueBalance) {
    
    this.valueBalance = valueBalance;
    return this;
  }

   /**
   * Defines the transaction value balance.
   * @return valueBalance
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "0", required = true, value = "Defines the transaction value balance.")

  public String getValueBalance() {
    return valueBalance;
  }


  public void setValueBalance(String valueBalance) {
    this.valueBalance = valueBalance;
  }


  public ListUnconfirmedTransactionsByAddressRIBSZ version(Integer version) {
    
    this.version = version;
    return this;
  }

   /**
   * Defines the version of the transaction.
   * @return version
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1", required = true, value = "Defines the version of the transaction.")

  public Integer getVersion() {
    return version;
  }


  public void setVersion(Integer version) {
    this.version = version;
  }


  public ListUnconfirmedTransactionsByAddressRIBSZ versionGroupId(String versionGroupId) {
    
    this.versionGroupId = versionGroupId;
    return this;
  }

   /**
   * Represents the transaction version group ID.
   * @return versionGroupId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "0x892f2085", required = true, value = "Represents the transaction version group ID.")

  public String getVersionGroupId() {
    return versionGroupId;
  }


  public void setVersionGroupId(String versionGroupId) {
    this.versionGroupId = versionGroupId;
  }


  public ListUnconfirmedTransactionsByAddressRIBSZ vin(List<ListUnconfirmedTransactionsByAddressRIBSZVin> vin) {
    
    this.vin = vin;
    return this;
  }

  public ListUnconfirmedTransactionsByAddressRIBSZ addVinItem(ListUnconfirmedTransactionsByAddressRIBSZVin vinItem) {
    this.vin.add(vinItem);
    return this;
  }

   /**
   * Object Array representation of transaction inputs
   * @return vin
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Object Array representation of transaction inputs")

  public List<ListUnconfirmedTransactionsByAddressRIBSZVin> getVin() {
    return vin;
  }


  public void setVin(List<ListUnconfirmedTransactionsByAddressRIBSZVin> vin) {
    this.vin = vin;
  }


  public ListUnconfirmedTransactionsByAddressRIBSZ vout(List<ListConfirmedTransactionsByAddressRIBSZVout> vout) {
    
    this.vout = vout;
    return this;
  }

  public ListUnconfirmedTransactionsByAddressRIBSZ addVoutItem(ListConfirmedTransactionsByAddressRIBSZVout voutItem) {
    this.vout.add(voutItem);
    return this;
  }

   /**
   * Object Array representation of transaction outputs
   * @return vout
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Object Array representation of transaction outputs")

  public List<ListConfirmedTransactionsByAddressRIBSZVout> getVout() {
    return vout;
  }


  public void setVout(List<ListConfirmedTransactionsByAddressRIBSZVout> vout) {
    this.vout = vout;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListUnconfirmedTransactionsByAddressRIBSZ listUnconfirmedTransactionsByAddressRIBSZ = (ListUnconfirmedTransactionsByAddressRIBSZ) o;
    return Objects.equals(this.bindingSig, listUnconfirmedTransactionsByAddressRIBSZ.bindingSig) &&
        Objects.equals(this.expiryHeight, listUnconfirmedTransactionsByAddressRIBSZ.expiryHeight) &&
        Objects.equals(this.joinSplitPubKey, listUnconfirmedTransactionsByAddressRIBSZ.joinSplitPubKey) &&
        Objects.equals(this.joinSplitSig, listUnconfirmedTransactionsByAddressRIBSZ.joinSplitSig) &&
        Objects.equals(this.locktime, listUnconfirmedTransactionsByAddressRIBSZ.locktime) &&
        Objects.equals(this.overwintered, listUnconfirmedTransactionsByAddressRIBSZ.overwintered) &&
        Objects.equals(this.size, listUnconfirmedTransactionsByAddressRIBSZ.size) &&
        Objects.equals(this.vJoinSplit, listUnconfirmedTransactionsByAddressRIBSZ.vJoinSplit) &&
        Objects.equals(this.vShieldedOutput, listUnconfirmedTransactionsByAddressRIBSZ.vShieldedOutput) &&
        Objects.equals(this.vShieldedSpend, listUnconfirmedTransactionsByAddressRIBSZ.vShieldedSpend) &&
        Objects.equals(this.valueBalance, listUnconfirmedTransactionsByAddressRIBSZ.valueBalance) &&
        Objects.equals(this.version, listUnconfirmedTransactionsByAddressRIBSZ.version) &&
        Objects.equals(this.versionGroupId, listUnconfirmedTransactionsByAddressRIBSZ.versionGroupId) &&
        Objects.equals(this.vin, listUnconfirmedTransactionsByAddressRIBSZ.vin) &&
        Objects.equals(this.vout, listUnconfirmedTransactionsByAddressRIBSZ.vout);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bindingSig, expiryHeight, joinSplitPubKey, joinSplitSig, locktime, overwintered, size, vJoinSplit, vShieldedOutput, vShieldedSpend, valueBalance, version, versionGroupId, vin, vout);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListUnconfirmedTransactionsByAddressRIBSZ {\n");
    sb.append("    bindingSig: ").append(toIndentedString(bindingSig)).append("\n");
    sb.append("    expiryHeight: ").append(toIndentedString(expiryHeight)).append("\n");
    sb.append("    joinSplitPubKey: ").append(toIndentedString(joinSplitPubKey)).append("\n");
    sb.append("    joinSplitSig: ").append(toIndentedString(joinSplitSig)).append("\n");
    sb.append("    locktime: ").append(toIndentedString(locktime)).append("\n");
    sb.append("    overwintered: ").append(toIndentedString(overwintered)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    vJoinSplit: ").append(toIndentedString(vJoinSplit)).append("\n");
    sb.append("    vShieldedOutput: ").append(toIndentedString(vShieldedOutput)).append("\n");
    sb.append("    vShieldedSpend: ").append(toIndentedString(vShieldedSpend)).append("\n");
    sb.append("    valueBalance: ").append(toIndentedString(valueBalance)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    versionGroupId: ").append(toIndentedString(versionGroupId)).append("\n");
    sb.append("    vin: ").append(toIndentedString(vin)).append("\n");
    sb.append("    vout: ").append(toIndentedString(vout)).append("\n");
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

