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
public class AddressCoinsTransactionUnconfirmedDataItem {
  public static final String SERIALIZED_NAME_BLOCKCHAIN = "blockchain";
  @SerializedName(SERIALIZED_NAME_BLOCKCHAIN)
  private String blockchain;

  public static final String SERIALIZED_NAME_NETWORK = "network";
  @SerializedName(SERIALIZED_NAME_NETWORK)
  private String network;

  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private String address;

  public static final String SERIALIZED_NAME_TRANSACTION_ID = "transactionId";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_ID)
  private String transactionId;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private String amount;

  /**
   * Defines the unit of the transaction, e.g. BTC.
   */
  @JsonAdapter(UnitEnum.Adapter.class)
  public enum UnitEnum {
    BTC("btc"),
    
    SATOSHI("satoshi"),
    
    WEI("wei"),
    
    GWEI("gwei"),
    
    ETH("eth"),
    
    DOGE("doge"),
    
    DASH("dash"),
    
    ETC("etc"),
    
    XRP("xrp"),
    
    ZIL("zil");

    private String value;

    UnitEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static UnitEnum fromValue(String value) {
      for (UnitEnum b : UnitEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<UnitEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final UnitEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public UnitEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return UnitEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_UNIT = "unit";
  @SerializedName(SERIALIZED_NAME_UNIT)
  private UnitEnum unit;

  /**
   * Defines whether the transaction is \&quot;incoming\&quot; or \&quot;outgoing\&quot;.
   */
  @JsonAdapter(DirectionEnum.Adapter.class)
  public enum DirectionEnum {
    INCOMING("incoming"),
    
    OUTGOING("outgoing");

    private String value;

    DirectionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DirectionEnum fromValue(String value) {
      for (DirectionEnum b : DirectionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<DirectionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DirectionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DirectionEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return DirectionEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_DIRECTION = "direction";
  @SerializedName(SERIALIZED_NAME_DIRECTION)
  private DirectionEnum direction;

  public static final String SERIALIZED_NAME_FIRST_SEEN_IN_MEMPOOL_TIMESTAMP = "firstSeenInMempoolTimestamp";
  @SerializedName(SERIALIZED_NAME_FIRST_SEEN_IN_MEMPOOL_TIMESTAMP)
  private Integer firstSeenInMempoolTimestamp;


  public AddressCoinsTransactionUnconfirmedDataItem blockchain(String blockchain) {
    
    this.blockchain = blockchain;
    return this;
  }

   /**
   * Represents the specific blockchain protocol name, e.g. Ethereum, Bitcoin, etc.
   * @return blockchain
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "bitcoin", required = true, value = "Represents the specific blockchain protocol name, e.g. Ethereum, Bitcoin, etc.")

  public String getBlockchain() {
    return blockchain;
  }


  public void setBlockchain(String blockchain) {
    this.blockchain = blockchain;
  }


  public AddressCoinsTransactionUnconfirmedDataItem network(String network) {
    
    this.network = network;
    return this;
  }

   /**
   * Represents the name of the blockchain network used; blockchain networks are usually identical as technology and software, but they differ in data, e.g. - \&quot;mainnet\&quot; is the live network with actual data while networks like \&quot;testnet\&quot;, \&quot;ropsten\&quot;, \&quot;rinkeby\&quot; are test networks.
   * @return network
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "testnet", required = true, value = "Represents the name of the blockchain network used; blockchain networks are usually identical as technology and software, but they differ in data, e.g. - \"mainnet\" is the live network with actual data while networks like \"testnet\", \"ropsten\", \"rinkeby\" are test networks.")

  public String getNetwork() {
    return network;
  }


  public void setNetwork(String network) {
    this.network = network;
  }


  public AddressCoinsTransactionUnconfirmedDataItem address(String address) {
    
    this.address = address;
    return this;
  }

   /**
   * Defines the specific address to which the coin transaction has been sent and is pending confirmation.
   * @return address
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "3CzKAnCXt7ePb5NCp5qrAEimrxjY81oLoT", required = true, value = "Defines the specific address to which the coin transaction has been sent and is pending confirmation.")

  public String getAddress() {
    return address;
  }


  public void setAddress(String address) {
    this.address = address;
  }


  public AddressCoinsTransactionUnconfirmedDataItem transactionId(String transactionId) {
    
    this.transactionId = transactionId;
    return this;
  }

   /**
   * Defines the unique ID of the specific transaction, i.e. its identification number.
   * @return transactionId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "4b2159770f75a7200ea168eb56ebbf3303b025d838f743fb6e785bc32d5ac65b", required = true, value = "Defines the unique ID of the specific transaction, i.e. its identification number.")

  public String getTransactionId() {
    return transactionId;
  }


  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }


  public AddressCoinsTransactionUnconfirmedDataItem amount(String amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * Defines the amount of coins sent with the transaction that is pending confirmation.
   * @return amount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "0.6508984", required = true, value = "Defines the amount of coins sent with the transaction that is pending confirmation.")

  public String getAmount() {
    return amount;
  }


  public void setAmount(String amount) {
    this.amount = amount;
  }


  public AddressCoinsTransactionUnconfirmedDataItem unit(UnitEnum unit) {
    
    this.unit = unit;
    return this;
  }

   /**
   * Defines the unit of the transaction, e.g. BTC.
   * @return unit
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "BTC", required = true, value = "Defines the unit of the transaction, e.g. BTC.")

  public UnitEnum getUnit() {
    return unit;
  }


  public void setUnit(UnitEnum unit) {
    this.unit = unit;
  }


  public AddressCoinsTransactionUnconfirmedDataItem direction(DirectionEnum direction) {
    
    this.direction = direction;
    return this;
  }

   /**
   * Defines whether the transaction is \&quot;incoming\&quot; or \&quot;outgoing\&quot;.
   * @return direction
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "incoming", required = true, value = "Defines whether the transaction is \"incoming\" or \"outgoing\".")

  public DirectionEnum getDirection() {
    return direction;
  }


  public void setDirection(DirectionEnum direction) {
    this.direction = direction;
  }


  public AddressCoinsTransactionUnconfirmedDataItem firstSeenInMempoolTimestamp(Integer firstSeenInMempoolTimestamp) {
    
    this.firstSeenInMempoolTimestamp = firstSeenInMempoolTimestamp;
    return this;
  }

   /**
   * Defines the exact time the transaction has been first accepted into the mempool to await confirmation as timestamp.
   * @return firstSeenInMempoolTimestamp
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1610365615", required = true, value = "Defines the exact time the transaction has been first accepted into the mempool to await confirmation as timestamp.")

  public Integer getFirstSeenInMempoolTimestamp() {
    return firstSeenInMempoolTimestamp;
  }


  public void setFirstSeenInMempoolTimestamp(Integer firstSeenInMempoolTimestamp) {
    this.firstSeenInMempoolTimestamp = firstSeenInMempoolTimestamp;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddressCoinsTransactionUnconfirmedDataItem addressCoinsTransactionUnconfirmedDataItem = (AddressCoinsTransactionUnconfirmedDataItem) o;
    return Objects.equals(this.blockchain, addressCoinsTransactionUnconfirmedDataItem.blockchain) &&
        Objects.equals(this.network, addressCoinsTransactionUnconfirmedDataItem.network) &&
        Objects.equals(this.address, addressCoinsTransactionUnconfirmedDataItem.address) &&
        Objects.equals(this.transactionId, addressCoinsTransactionUnconfirmedDataItem.transactionId) &&
        Objects.equals(this.amount, addressCoinsTransactionUnconfirmedDataItem.amount) &&
        Objects.equals(this.unit, addressCoinsTransactionUnconfirmedDataItem.unit) &&
        Objects.equals(this.direction, addressCoinsTransactionUnconfirmedDataItem.direction) &&
        Objects.equals(this.firstSeenInMempoolTimestamp, addressCoinsTransactionUnconfirmedDataItem.firstSeenInMempoolTimestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(blockchain, network, address, transactionId, amount, unit, direction, firstSeenInMempoolTimestamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddressCoinsTransactionUnconfirmedDataItem {\n");
    sb.append("    blockchain: ").append(toIndentedString(blockchain)).append("\n");
    sb.append("    network: ").append(toIndentedString(network)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    firstSeenInMempoolTimestamp: ").append(toIndentedString(firstSeenInMempoolTimestamp)).append("\n");
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

