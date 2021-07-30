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
import org.openapitools.client.model.AddressTokensTransactionUnconfirmedToken;

/**
 * Defines an &#x60;item&#x60; as one result.
 */
@ApiModel(description = "Defines an `item` as one result.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-07-30T08:15:40.964553Z[Etc/UTC]")
public class AddressTokensTransactionUnconfirmedDataItem {
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

  /**
   * Defines the type of token sent with the transaction, e.g. ERC 20.
   */
  @JsonAdapter(TokenTypeEnum.Adapter.class)
  public enum TokenTypeEnum {
    ETHEREUMERC20TOKEN("ethereumERC20Token"),
    
    ETHEREUMERC721TOKEN("ethereumERC721Token"),
    
    OMNILAYERTOKEN("omniLayerToken");

    private String value;

    TokenTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TokenTypeEnum fromValue(String value) {
      for (TokenTypeEnum b : TokenTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TokenTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TokenTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TokenTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TokenTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TOKEN_TYPE = "tokenType";
  @SerializedName(SERIALIZED_NAME_TOKEN_TYPE)
  private TokenTypeEnum tokenType;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private AddressTokensTransactionUnconfirmedToken token;

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


  public AddressTokensTransactionUnconfirmedDataItem blockchain(String blockchain) {
    
    this.blockchain = blockchain;
    return this;
  }

   /**
   * Represents the specific blockchain protocol name, e.g. Ethereum, Bitcoin, etc.
   * @return blockchain
  **/
  @ApiModelProperty(example = "bitcoin", required = true, value = "Represents the specific blockchain protocol name, e.g. Ethereum, Bitcoin, etc.")

  public String getBlockchain() {
    return blockchain;
  }


  public void setBlockchain(String blockchain) {
    this.blockchain = blockchain;
  }


  public AddressTokensTransactionUnconfirmedDataItem network(String network) {
    
    this.network = network;
    return this;
  }

   /**
   * Represents the name of the blockchain network used; blockchain networks are usually identical as technology and software, but they differ in data, e.g. - \&quot;mainnet\&quot; is the live network with actual data while networks like \&quot;testnet\&quot;, \&quot;ropsten\&quot;, \&quot;rinkeby\&quot; are test networks.
   * @return network
  **/
  @ApiModelProperty(example = "testnet", required = true, value = "Represents the name of the blockchain network used; blockchain networks are usually identical as technology and software, but they differ in data, e.g. - \"mainnet\" is the live network with actual data while networks like \"testnet\", \"ropsten\", \"rinkeby\" are test networks.")

  public String getNetwork() {
    return network;
  }


  public void setNetwork(String network) {
    this.network = network;
  }


  public AddressTokensTransactionUnconfirmedDataItem address(String address) {
    
    this.address = address;
    return this;
  }

   /**
   * Defines the specific address to which the token transaction has been sent and is pending confirmation.
   * @return address
  **/
  @ApiModelProperty(example = "bc1qj9k6mryqfyl9dghdwnxx29660nws90mfarld46", required = true, value = "Defines the specific address to which the token transaction has been sent and is pending confirmation.")

  public String getAddress() {
    return address;
  }


  public void setAddress(String address) {
    this.address = address;
  }


  public AddressTokensTransactionUnconfirmedDataItem transactionId(String transactionId) {
    
    this.transactionId = transactionId;
    return this;
  }

   /**
   * Defines the unique ID of the specific transaction, i.e. its identification number.
   * @return transactionId
  **/
  @ApiModelProperty(example = "ade174e0ff264094bfcf4a83789d3aa3e7d7ab423ffa89e21871aad849f302db", required = true, value = "Defines the unique ID of the specific transaction, i.e. its identification number.")

  public String getTransactionId() {
    return transactionId;
  }


  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }


  public AddressTokensTransactionUnconfirmedDataItem tokenType(TokenTypeEnum tokenType) {
    
    this.tokenType = tokenType;
    return this;
  }

   /**
   * Defines the type of token sent with the transaction, e.g. ERC 20.
   * @return tokenType
  **/
  @ApiModelProperty(example = "ethereumERC20Token", required = true, value = "Defines the type of token sent with the transaction, e.g. ERC 20.")

  public TokenTypeEnum getTokenType() {
    return tokenType;
  }


  public void setTokenType(TokenTypeEnum tokenType) {
    this.tokenType = tokenType;
  }


  public AddressTokensTransactionUnconfirmedDataItem token(AddressTokensTransactionUnconfirmedToken token) {
    
    this.token = token;
    return this;
  }

   /**
   * Get token
   * @return token
  **/
  @ApiModelProperty(required = true, value = "")

  public AddressTokensTransactionUnconfirmedToken getToken() {
    return token;
  }


  public void setToken(AddressTokensTransactionUnconfirmedToken token) {
    this.token = token;
  }


  public AddressTokensTransactionUnconfirmedDataItem direction(DirectionEnum direction) {
    
    this.direction = direction;
    return this;
  }

   /**
   * Defines whether the transaction is \&quot;incoming\&quot; or \&quot;outgoing\&quot;.
   * @return direction
  **/
  @ApiModelProperty(example = "incoming", required = true, value = "Defines whether the transaction is \"incoming\" or \"outgoing\".")

  public DirectionEnum getDirection() {
    return direction;
  }


  public void setDirection(DirectionEnum direction) {
    this.direction = direction;
  }


  public AddressTokensTransactionUnconfirmedDataItem firstSeenInMempoolTimestamp(Integer firstSeenInMempoolTimestamp) {
    
    this.firstSeenInMempoolTimestamp = firstSeenInMempoolTimestamp;
    return this;
  }

   /**
   * Defines the exact time the transaction has been first accepted into the mempool to await confirmation as timestamp.
   * @return firstSeenInMempoolTimestamp
  **/
  @ApiModelProperty(example = "1210363220", required = true, value = "Defines the exact time the transaction has been first accepted into the mempool to await confirmation as timestamp.")

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
    AddressTokensTransactionUnconfirmedDataItem addressTokensTransactionUnconfirmedDataItem = (AddressTokensTransactionUnconfirmedDataItem) o;
    return Objects.equals(this.blockchain, addressTokensTransactionUnconfirmedDataItem.blockchain) &&
        Objects.equals(this.network, addressTokensTransactionUnconfirmedDataItem.network) &&
        Objects.equals(this.address, addressTokensTransactionUnconfirmedDataItem.address) &&
        Objects.equals(this.transactionId, addressTokensTransactionUnconfirmedDataItem.transactionId) &&
        Objects.equals(this.tokenType, addressTokensTransactionUnconfirmedDataItem.tokenType) &&
        Objects.equals(this.token, addressTokensTransactionUnconfirmedDataItem.token) &&
        Objects.equals(this.direction, addressTokensTransactionUnconfirmedDataItem.direction) &&
        Objects.equals(this.firstSeenInMempoolTimestamp, addressTokensTransactionUnconfirmedDataItem.firstSeenInMempoolTimestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(blockchain, network, address, transactionId, tokenType, token, direction, firstSeenInMempoolTimestamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddressTokensTransactionUnconfirmedDataItem {\n");
    sb.append("    blockchain: ").append(toIndentedString(blockchain)).append("\n");
    sb.append("    network: ").append(toIndentedString(network)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    tokenType: ").append(toIndentedString(tokenType)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
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

