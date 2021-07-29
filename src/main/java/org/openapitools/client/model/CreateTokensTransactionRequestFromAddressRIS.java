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
import org.openapitools.client.model.CreateTokensTransactionRequestFromAddressRISB;
import org.openapitools.client.model.CreateTokensTransactionRequestFromAddressRISE;

/**
 * Represents the specific token data which depends on its type - if it is a Coin or Token.
 */
@ApiModel(description = "Represents the specific token data which depends on its type - if it is a Coin or Token.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-07-29T09:33:59.822482Z[Etc/UTC]")
public class CreateTokensTransactionRequestFromAddressRIS {
  public static final String SERIALIZED_NAME_PROPERTY_ID = "propertyId";
  @SerializedName(SERIALIZED_NAME_PROPERTY_ID)
  private String propertyId;

  public static final String SERIALIZED_NAME_CONTRACT_ADDRESS = "contractAddress";
  @SerializedName(SERIALIZED_NAME_CONTRACT_ADDRESS)
  private String contractAddress;


  public CreateTokensTransactionRequestFromAddressRIS propertyId(String propertyId) {
    
    this.propertyId = propertyId;
    return this;
  }

   /**
   * Defines the &#x60;propertyID&#x60; from Omni layer.
   * @return propertyId
  **/
  @ApiModelProperty(example = "1", required = true, value = "Defines the `propertyID` from Omni layer.")

  public String getPropertyId() {
    return propertyId;
  }


  public void setPropertyId(String propertyId) {
    this.propertyId = propertyId;
  }


  public CreateTokensTransactionRequestFromAddressRIS contractAddress(String contractAddress) {
    
    this.contractAddress = contractAddress;
    return this;
  }

   /**
   * Defines the contract address in the blockchain for an ERC20 token.
   * @return contractAddress
  **/
  @ApiModelProperty(example = "0x092de782a7e1e0a92991ad829a0a33aef3c7545e", required = true, value = "Defines the contract address in the blockchain for an ERC20 token.")

  public String getContractAddress() {
    return contractAddress;
  }


  public void setContractAddress(String contractAddress) {
    this.contractAddress = contractAddress;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateTokensTransactionRequestFromAddressRIS createTokensTransactionRequestFromAddressRIS = (CreateTokensTransactionRequestFromAddressRIS) o;
    return Objects.equals(this.propertyId, createTokensTransactionRequestFromAddressRIS.propertyId) &&
        Objects.equals(this.contractAddress, createTokensTransactionRequestFromAddressRIS.contractAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(propertyId, contractAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateTokensTransactionRequestFromAddressRIS {\n");
    sb.append("    propertyId: ").append(toIndentedString(propertyId)).append("\n");
    sb.append("    contractAddress: ").append(toIndentedString(contractAddress)).append("\n");
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
