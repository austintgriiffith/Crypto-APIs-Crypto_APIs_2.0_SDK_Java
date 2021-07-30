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
import org.openapitools.client.model.AddressTokensTransactionConfirmedEachConfirmationDataItemMinedInBlock;
import org.openapitools.client.model.AddressTokensTransactionConfirmedEachConfirmationToken;

/**
 * Defines an &#x60;item&#x60; as one result.
 */
@ApiModel(description = "Defines an `item` as one result.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-07-30T08:15:40.964553Z[Etc/UTC]")
public class AddressTokensTransactionConfirmedEachConfirmationDataItem {
  public static final String SERIALIZED_NAME_BLOCKCHAIN = "blockchain";
  @SerializedName(SERIALIZED_NAME_BLOCKCHAIN)
  private String blockchain;

  public static final String SERIALIZED_NAME_NETWORK = "network";
  @SerializedName(SERIALIZED_NAME_NETWORK)
  private String network;

  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private String address;

  public static final String SERIALIZED_NAME_MINED_IN_BLOCK = "minedInBlock";
  @SerializedName(SERIALIZED_NAME_MINED_IN_BLOCK)
  private AddressTokensTransactionConfirmedEachConfirmationDataItemMinedInBlock minedInBlock;

  public static final String SERIALIZED_NAME_TRANSACTION_ID = "transactionId";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_ID)
  private String transactionId;

  public static final String SERIALIZED_NAME_CURRENT_CONFIRMATIONS = "currentConfirmations";
  @SerializedName(SERIALIZED_NAME_CURRENT_CONFIRMATIONS)
  private Integer currentConfirmations;

  public static final String SERIALIZED_NAME_TARGET_CONFIRMATIONS = "targetConfirmations";
  @SerializedName(SERIALIZED_NAME_TARGET_CONFIRMATIONS)
  private Integer targetConfirmations;

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
  private AddressTokensTransactionConfirmedEachConfirmationToken token;

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


  public AddressTokensTransactionConfirmedEachConfirmationDataItem blockchain(String blockchain) {
    
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


  public AddressTokensTransactionConfirmedEachConfirmationDataItem network(String network) {
    
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


  public AddressTokensTransactionConfirmedEachConfirmationDataItem address(String address) {
    
    this.address = address;
    return this;
  }

   /**
   * Defines the specific address to which the transaction has been sent.
   * @return address
  **/
  @ApiModelProperty(example = "12dRugNcdxK39288NjcDV4GX7rMsKCGn6B", required = true, value = "Defines the specific address to which the transaction has been sent.")

  public String getAddress() {
    return address;
  }


  public void setAddress(String address) {
    this.address = address;
  }


  public AddressTokensTransactionConfirmedEachConfirmationDataItem minedInBlock(AddressTokensTransactionConfirmedEachConfirmationDataItemMinedInBlock minedInBlock) {
    
    this.minedInBlock = minedInBlock;
    return this;
  }

   /**
   * Get minedInBlock
   * @return minedInBlock
  **/
  @ApiModelProperty(required = true, value = "")

  public AddressTokensTransactionConfirmedEachConfirmationDataItemMinedInBlock getMinedInBlock() {
    return minedInBlock;
  }


  public void setMinedInBlock(AddressTokensTransactionConfirmedEachConfirmationDataItemMinedInBlock minedInBlock) {
    this.minedInBlock = minedInBlock;
  }


  public AddressTokensTransactionConfirmedEachConfirmationDataItem transactionId(String transactionId) {
    
    this.transactionId = transactionId;
    return this;
  }

   /**
   * Defines the unique ID of the specific transaction, i.e. its identification number.
   * @return transactionId
  **/
  @ApiModelProperty(example = "c2163e3a0ac22a7256fd1e8b0391a27e3479723e72f5efed1676d0eea9ed6ef4", required = true, value = "Defines the unique ID of the specific transaction, i.e. its identification number.")

  public String getTransactionId() {
    return transactionId;
  }


  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }


  public AddressTokensTransactionConfirmedEachConfirmationDataItem currentConfirmations(Integer currentConfirmations) {
    
    this.currentConfirmations = currentConfirmations;
    return this;
  }

   /**
   * Defines the number of currently received confirmations for the transaction.
   * @return currentConfirmations
  **/
  @ApiModelProperty(example = "6", required = true, value = "Defines the number of currently received confirmations for the transaction.")

  public Integer getCurrentConfirmations() {
    return currentConfirmations;
  }


  public void setCurrentConfirmations(Integer currentConfirmations) {
    this.currentConfirmations = currentConfirmations;
  }


  public AddressTokensTransactionConfirmedEachConfirmationDataItem targetConfirmations(Integer targetConfirmations) {
    
    this.targetConfirmations = targetConfirmations;
    return this;
  }

   /**
   * Defines the number of confirmation transactions requested as callbacks, i.e. the system can notify till the n-th confirmation.
   * @return targetConfirmations
  **/
  @ApiModelProperty(example = "15", required = true, value = "Defines the number of confirmation transactions requested as callbacks, i.e. the system can notify till the n-th confirmation.")

  public Integer getTargetConfirmations() {
    return targetConfirmations;
  }


  public void setTargetConfirmations(Integer targetConfirmations) {
    this.targetConfirmations = targetConfirmations;
  }


  public AddressTokensTransactionConfirmedEachConfirmationDataItem tokenType(TokenTypeEnum tokenType) {
    
    this.tokenType = tokenType;
    return this;
  }

   /**
   * Defines the type of token sent with the transaction, e.g. ERC 20.
   * @return tokenType
  **/
  @ApiModelProperty(example = "It could be one of: \"ethereumERC20Token\", \"ethereumERC721Token\", \"omniLayerToken\"", required = true, value = "Defines the type of token sent with the transaction, e.g. ERC 20.")

  public TokenTypeEnum getTokenType() {
    return tokenType;
  }


  public void setTokenType(TokenTypeEnum tokenType) {
    this.tokenType = tokenType;
  }


  public AddressTokensTransactionConfirmedEachConfirmationDataItem token(AddressTokensTransactionConfirmedEachConfirmationToken token) {
    
    this.token = token;
    return this;
  }

   /**
   * Get token
   * @return token
  **/
  @ApiModelProperty(required = true, value = "")

  public AddressTokensTransactionConfirmedEachConfirmationToken getToken() {
    return token;
  }


  public void setToken(AddressTokensTransactionConfirmedEachConfirmationToken token) {
    this.token = token;
  }


  public AddressTokensTransactionConfirmedEachConfirmationDataItem direction(DirectionEnum direction) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddressTokensTransactionConfirmedEachConfirmationDataItem addressTokensTransactionConfirmedEachConfirmationDataItem = (AddressTokensTransactionConfirmedEachConfirmationDataItem) o;
    return Objects.equals(this.blockchain, addressTokensTransactionConfirmedEachConfirmationDataItem.blockchain) &&
        Objects.equals(this.network, addressTokensTransactionConfirmedEachConfirmationDataItem.network) &&
        Objects.equals(this.address, addressTokensTransactionConfirmedEachConfirmationDataItem.address) &&
        Objects.equals(this.minedInBlock, addressTokensTransactionConfirmedEachConfirmationDataItem.minedInBlock) &&
        Objects.equals(this.transactionId, addressTokensTransactionConfirmedEachConfirmationDataItem.transactionId) &&
        Objects.equals(this.currentConfirmations, addressTokensTransactionConfirmedEachConfirmationDataItem.currentConfirmations) &&
        Objects.equals(this.targetConfirmations, addressTokensTransactionConfirmedEachConfirmationDataItem.targetConfirmations) &&
        Objects.equals(this.tokenType, addressTokensTransactionConfirmedEachConfirmationDataItem.tokenType) &&
        Objects.equals(this.token, addressTokensTransactionConfirmedEachConfirmationDataItem.token) &&
        Objects.equals(this.direction, addressTokensTransactionConfirmedEachConfirmationDataItem.direction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(blockchain, network, address, minedInBlock, transactionId, currentConfirmations, targetConfirmations, tokenType, token, direction);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddressTokensTransactionConfirmedEachConfirmationDataItem {\n");
    sb.append("    blockchain: ").append(toIndentedString(blockchain)).append("\n");
    sb.append("    network: ").append(toIndentedString(network)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    minedInBlock: ").append(toIndentedString(minedInBlock)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    currentConfirmations: ").append(toIndentedString(currentConfirmations)).append("\n");
    sb.append("    targetConfirmations: ").append(toIndentedString(targetConfirmations)).append("\n");
    sb.append("    tokenType: ").append(toIndentedString(tokenType)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
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

