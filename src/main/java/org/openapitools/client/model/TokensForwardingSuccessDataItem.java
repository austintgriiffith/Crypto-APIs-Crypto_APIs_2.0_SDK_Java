/*
 * Crypto APIs
 * Crypto APIs 2.0 is a complex and innovative infrastructure layer that radically simplifies the development of any Blockchain and Crypto related applications. Organized around REST, Crypto APIs 2.0 can assist both novice Bitcoin/Ethereum enthusiasts and crypto experts with the development of their blockchain applications. Crypto APIs 2.0 provides unified endpoints and data, raw data, automatic tokens and coins forwardings, callback functionalities, and much more.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: bizdev@cryptoapis.io
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
import org.openapitools.client.model.TokensForwardingSuccessToken;

/**
 * Defines an &#x60;item&#x60; as one result.
 */
@ApiModel(description = "Defines an `item` as one result.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-04-21T16:59:17.199745Z[Etc/UTC]")
public class TokensForwardingSuccessDataItem {
  public static final String SERIALIZED_NAME_BLOCKCHAIN = "blockchain";
  @SerializedName(SERIALIZED_NAME_BLOCKCHAIN)
  private String blockchain;

  public static final String SERIALIZED_NAME_NETWORK = "network";
  @SerializedName(SERIALIZED_NAME_NETWORK)
  private String network;

  public static final String SERIALIZED_NAME_FROM_ADDRESS = "fromAddress";
  @SerializedName(SERIALIZED_NAME_FROM_ADDRESS)
  private String fromAddress;

  public static final String SERIALIZED_NAME_TO_ADDRESS = "toAddress";
  @SerializedName(SERIALIZED_NAME_TO_ADDRESS)
  private String toAddress;

  public static final String SERIALIZED_NAME_SPENT_FEES_AMOUNT = "spentFeesAmount";
  @SerializedName(SERIALIZED_NAME_SPENT_FEES_AMOUNT)
  private String spentFeesAmount;

  public static final String SERIALIZED_NAME_SPENT_FEES_UNIT = "spentFeesUnit";
  @SerializedName(SERIALIZED_NAME_SPENT_FEES_UNIT)
  private String spentFeesUnit;

  public static final String SERIALIZED_NAME_TRIGGER_TRANSACTION_ID = "triggerTransactionId";
  @SerializedName(SERIALIZED_NAME_TRIGGER_TRANSACTION_ID)
  private String triggerTransactionId;

  public static final String SERIALIZED_NAME_FORWARDING_TRANSACTION_ID = "forwardingTransactionId";
  @SerializedName(SERIALIZED_NAME_FORWARDING_TRANSACTION_ID)
  private String forwardingTransactionId;

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
  private TokensForwardingSuccessToken token;


  public TokensForwardingSuccessDataItem blockchain(String blockchain) {
    
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


  public TokensForwardingSuccessDataItem network(String network) {
    
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


  public TokensForwardingSuccessDataItem fromAddress(String fromAddress) {
    
    this.fromAddress = fromAddress;
    return this;
  }

   /**
   * Represents the hash of the address that provides the tokens.
   * @return fromAddress
  **/
  @ApiModelProperty(example = "mh8E9c2YDQvn8uRf47Wy4zCv2zHQzcdgkk", required = true, value = "Represents the hash of the address that provides the tokens.")

  public String getFromAddress() {
    return fromAddress;
  }


  public void setFromAddress(String fromAddress) {
    this.fromAddress = fromAddress;
  }


  public TokensForwardingSuccessDataItem toAddress(String toAddress) {
    
    this.toAddress = toAddress;
    return this;
  }

   /**
   * Represents the hash of the address to forward the tokens to.
   * @return toAddress
  **/
  @ApiModelProperty(example = "ms4KNsbNpoU8g424pzmEjbkFbfAHae1msB", required = true, value = "Represents the hash of the address to forward the tokens to.")

  public String getToAddress() {
    return toAddress;
  }


  public void setToAddress(String toAddress) {
    this.toAddress = toAddress;
  }


  public TokensForwardingSuccessDataItem spentFeesAmount(String spentFeesAmount) {
    
    this.spentFeesAmount = spentFeesAmount;
    return this;
  }

   /**
   * Represents the amount of the fee spent for the tokens to be forwarded.
   * @return spentFeesAmount
  **/
  @ApiModelProperty(example = "0.00013601", required = true, value = "Represents the amount of the fee spent for the tokens to be forwarded.")

  public String getSpentFeesAmount() {
    return spentFeesAmount;
  }


  public void setSpentFeesAmount(String spentFeesAmount) {
    this.spentFeesAmount = spentFeesAmount;
  }


  public TokensForwardingSuccessDataItem spentFeesUnit(String spentFeesUnit) {
    
    this.spentFeesUnit = spentFeesUnit;
    return this;
  }

   /**
   * Represents the unit of the fee spent for the tokens to be forwarded, e.g. BTC.
   * @return spentFeesUnit
  **/
  @ApiModelProperty(example = "BTC", required = true, value = "Represents the unit of the fee spent for the tokens to be forwarded, e.g. BTC.")

  public String getSpentFeesUnit() {
    return spentFeesUnit;
  }


  public void setSpentFeesUnit(String spentFeesUnit) {
    this.spentFeesUnit = spentFeesUnit;
  }


  public TokensForwardingSuccessDataItem triggerTransactionId(String triggerTransactionId) {
    
    this.triggerTransactionId = triggerTransactionId;
    return this;
  }

   /**
   * Defines the unique Transaction ID that triggered the token forwarding.
   * @return triggerTransactionId
  **/
  @ApiModelProperty(example = "6ed1f1c8f2887a78ee8c45a975d928ca63eafc7b63def56324606ddd3cc9854f", required = true, value = "Defines the unique Transaction ID that triggered the token forwarding.")

  public String getTriggerTransactionId() {
    return triggerTransactionId;
  }


  public void setTriggerTransactionId(String triggerTransactionId) {
    this.triggerTransactionId = triggerTransactionId;
  }


  public TokensForwardingSuccessDataItem forwardingTransactionId(String forwardingTransactionId) {
    
    this.forwardingTransactionId = forwardingTransactionId;
    return this;
  }

   /**
   * Defines the unique Transaction ID that forwarded the tokens.
   * @return forwardingTransactionId
  **/
  @ApiModelProperty(example = "b15ab5bbaf5107d551ae1b50181f4c55959205c4ff843e3c10d86d00e690fc72", required = true, value = "Defines the unique Transaction ID that forwarded the tokens.")

  public String getForwardingTransactionId() {
    return forwardingTransactionId;
  }


  public void setForwardingTransactionId(String forwardingTransactionId) {
    this.forwardingTransactionId = forwardingTransactionId;
  }


  public TokensForwardingSuccessDataItem tokenType(TokenTypeEnum tokenType) {
    
    this.tokenType = tokenType;
    return this;
  }

   /**
   * Defines the type of token sent with the transaction, e.g. ERC 20.
   * @return tokenType
  **/
  @ApiModelProperty(example = "omniLayerToken", required = true, value = "Defines the type of token sent with the transaction, e.g. ERC 20.")

  public TokenTypeEnum getTokenType() {
    return tokenType;
  }


  public void setTokenType(TokenTypeEnum tokenType) {
    this.tokenType = tokenType;
  }


  public TokensForwardingSuccessDataItem token(TokensForwardingSuccessToken token) {
    
    this.token = token;
    return this;
  }

   /**
   * Get token
   * @return token
  **/
  @ApiModelProperty(required = true, value = "")

  public TokensForwardingSuccessToken getToken() {
    return token;
  }


  public void setToken(TokensForwardingSuccessToken token) {
    this.token = token;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TokensForwardingSuccessDataItem tokensForwardingSuccessDataItem = (TokensForwardingSuccessDataItem) o;
    return Objects.equals(this.blockchain, tokensForwardingSuccessDataItem.blockchain) &&
        Objects.equals(this.network, tokensForwardingSuccessDataItem.network) &&
        Objects.equals(this.fromAddress, tokensForwardingSuccessDataItem.fromAddress) &&
        Objects.equals(this.toAddress, tokensForwardingSuccessDataItem.toAddress) &&
        Objects.equals(this.spentFeesAmount, tokensForwardingSuccessDataItem.spentFeesAmount) &&
        Objects.equals(this.spentFeesUnit, tokensForwardingSuccessDataItem.spentFeesUnit) &&
        Objects.equals(this.triggerTransactionId, tokensForwardingSuccessDataItem.triggerTransactionId) &&
        Objects.equals(this.forwardingTransactionId, tokensForwardingSuccessDataItem.forwardingTransactionId) &&
        Objects.equals(this.tokenType, tokensForwardingSuccessDataItem.tokenType) &&
        Objects.equals(this.token, tokensForwardingSuccessDataItem.token);
  }

  @Override
  public int hashCode() {
    return Objects.hash(blockchain, network, fromAddress, toAddress, spentFeesAmount, spentFeesUnit, triggerTransactionId, forwardingTransactionId, tokenType, token);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TokensForwardingSuccessDataItem {\n");
    sb.append("    blockchain: ").append(toIndentedString(blockchain)).append("\n");
    sb.append("    network: ").append(toIndentedString(network)).append("\n");
    sb.append("    fromAddress: ").append(toIndentedString(fromAddress)).append("\n");
    sb.append("    toAddress: ").append(toIndentedString(toAddress)).append("\n");
    sb.append("    spentFeesAmount: ").append(toIndentedString(spentFeesAmount)).append("\n");
    sb.append("    spentFeesUnit: ").append(toIndentedString(spentFeesUnit)).append("\n");
    sb.append("    triggerTransactionId: ").append(toIndentedString(triggerTransactionId)).append("\n");
    sb.append("    forwardingTransactionId: ").append(toIndentedString(forwardingTransactionId)).append("\n");
    sb.append("    tokenType: ").append(toIndentedString(tokenType)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
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
