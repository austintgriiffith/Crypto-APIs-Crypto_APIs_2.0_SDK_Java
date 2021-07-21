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
import org.openapitools.client.model.GetWalletAssetDetailsRIConfirmedBalance;
import org.openapitools.client.model.GetWalletAssetDetailsRIRecievedConfirmedAmount;
import org.openapitools.client.model.GetWalletAssetDetailsRISentConfirmedAmount;

/**
 * GetWalletAssetDetailsRI
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-07-20T13:36:32.071127Z[Etc/UTC]")
public class GetWalletAssetDetailsRI {
  public static final String SERIALIZED_NAME_CONFIRMED_BALANCE = "confirmedBalance";
  @SerializedName(SERIALIZED_NAME_CONFIRMED_BALANCE)
  private GetWalletAssetDetailsRIConfirmedBalance confirmedBalance;

  public static final String SERIALIZED_NAME_DEPOSIT_ADDRESSES_COUNT = "depositAddressesCount";
  @SerializedName(SERIALIZED_NAME_DEPOSIT_ADDRESSES_COUNT)
  private Integer depositAddressesCount;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_RECIEVED_CONFIRMED_AMOUNT = "recievedConfirmedAmount";
  @SerializedName(SERIALIZED_NAME_RECIEVED_CONFIRMED_AMOUNT)
  private GetWalletAssetDetailsRIRecievedConfirmedAmount recievedConfirmedAmount;

  public static final String SERIALIZED_NAME_SENT_CONFIRMED_AMOUNT = "sentConfirmedAmount";
  @SerializedName(SERIALIZED_NAME_SENT_CONFIRMED_AMOUNT)
  private GetWalletAssetDetailsRISentConfirmedAmount sentConfirmedAmount;


  public GetWalletAssetDetailsRI confirmedBalance(GetWalletAssetDetailsRIConfirmedBalance confirmedBalance) {
    
    this.confirmedBalance = confirmedBalance;
    return this;
  }

   /**
   * Get confirmedBalance
   * @return confirmedBalance
  **/
  @ApiModelProperty(required = true, value = "")

  public GetWalletAssetDetailsRIConfirmedBalance getConfirmedBalance() {
    return confirmedBalance;
  }


  public void setConfirmedBalance(GetWalletAssetDetailsRIConfirmedBalance confirmedBalance) {
    this.confirmedBalance = confirmedBalance;
  }


  public GetWalletAssetDetailsRI depositAddressesCount(Integer depositAddressesCount) {
    
    this.depositAddressesCount = depositAddressesCount;
    return this;
  }

   /**
   * Specifies the count of deposit addresses in the Wallet.
   * @return depositAddressesCount
  **/
  @ApiModelProperty(example = "5", required = true, value = "Specifies the count of deposit addresses in the Wallet.")

  public Integer getDepositAddressesCount() {
    return depositAddressesCount;
  }


  public void setDepositAddressesCount(Integer depositAddressesCount) {
    this.depositAddressesCount = depositAddressesCount;
  }


  public GetWalletAssetDetailsRI name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Defines the name of the Wallet given to it by the user.
   * @return name
  **/
  @ApiModelProperty(example = "main vault", required = true, value = "Defines the name of the Wallet given to it by the user.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public GetWalletAssetDetailsRI recievedConfirmedAmount(GetWalletAssetDetailsRIRecievedConfirmedAmount recievedConfirmedAmount) {
    
    this.recievedConfirmedAmount = recievedConfirmedAmount;
    return this;
  }

   /**
   * Get recievedConfirmedAmount
   * @return recievedConfirmedAmount
  **/
  @ApiModelProperty(required = true, value = "")

  public GetWalletAssetDetailsRIRecievedConfirmedAmount getRecievedConfirmedAmount() {
    return recievedConfirmedAmount;
  }


  public void setRecievedConfirmedAmount(GetWalletAssetDetailsRIRecievedConfirmedAmount recievedConfirmedAmount) {
    this.recievedConfirmedAmount = recievedConfirmedAmount;
  }


  public GetWalletAssetDetailsRI sentConfirmedAmount(GetWalletAssetDetailsRISentConfirmedAmount sentConfirmedAmount) {
    
    this.sentConfirmedAmount = sentConfirmedAmount;
    return this;
  }

   /**
   * Get sentConfirmedAmount
   * @return sentConfirmedAmount
  **/
  @ApiModelProperty(required = true, value = "")

  public GetWalletAssetDetailsRISentConfirmedAmount getSentConfirmedAmount() {
    return sentConfirmedAmount;
  }


  public void setSentConfirmedAmount(GetWalletAssetDetailsRISentConfirmedAmount sentConfirmedAmount) {
    this.sentConfirmedAmount = sentConfirmedAmount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetWalletAssetDetailsRI getWalletAssetDetailsRI = (GetWalletAssetDetailsRI) o;
    return Objects.equals(this.confirmedBalance, getWalletAssetDetailsRI.confirmedBalance) &&
        Objects.equals(this.depositAddressesCount, getWalletAssetDetailsRI.depositAddressesCount) &&
        Objects.equals(this.name, getWalletAssetDetailsRI.name) &&
        Objects.equals(this.recievedConfirmedAmount, getWalletAssetDetailsRI.recievedConfirmedAmount) &&
        Objects.equals(this.sentConfirmedAmount, getWalletAssetDetailsRI.sentConfirmedAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(confirmedBalance, depositAddressesCount, name, recievedConfirmedAmount, sentConfirmedAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetWalletAssetDetailsRI {\n");
    sb.append("    confirmedBalance: ").append(toIndentedString(confirmedBalance)).append("\n");
    sb.append("    depositAddressesCount: ").append(toIndentedString(depositAddressesCount)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    recievedConfirmedAmount: ").append(toIndentedString(recievedConfirmedAmount)).append("\n");
    sb.append("    sentConfirmedAmount: ").append(toIndentedString(sentConfirmedAmount)).append("\n");
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

