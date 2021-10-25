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
import org.openapitools.client.model.CreateAutomaticTokensForwardingRITSBOT;
import org.openapitools.client.model.CreateAutomaticTokensForwardingRITSET;

/**
 * CreateAutomaticTokensForwardingRITS
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-25T12:38:09.413192Z[Etc/UTC]")
public class CreateAutomaticTokensForwardingRITS {
  public static final String SERIALIZED_NAME_PROPERTY_ID = "propertyId";
  @SerializedName(SERIALIZED_NAME_PROPERTY_ID)
  private Integer propertyId;

  public static final String SERIALIZED_NAME_CONTRACT_ADDRESS = "contractAddress";
  @SerializedName(SERIALIZED_NAME_CONTRACT_ADDRESS)
  private String contractAddress;


  public CreateAutomaticTokensForwardingRITS propertyId(Integer propertyId) {
    
    this.propertyId = propertyId;
    return this;
  }

   /**
   * Defines the &#x60;propertyId&#x60; of the Omni Layer token.
   * @return propertyId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "31", required = true, value = "Defines the `propertyId` of the Omni Layer token.")

  public Integer getPropertyId() {
    return propertyId;
  }


  public void setPropertyId(Integer propertyId) {
    this.propertyId = propertyId;
  }


  public CreateAutomaticTokensForwardingRITS contractAddress(String contractAddress) {
    
    this.contractAddress = contractAddress;
    return this;
  }

   /**
   * Represents the specific &#x60;contractAddress&#x60; of the Token that will be forwarded.
   * @return contractAddress
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "0xdac17f958d2ee523a2206206994597c13d831ec7", required = true, value = "Represents the specific `contractAddress` of the Token that will be forwarded.")

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
    CreateAutomaticTokensForwardingRITS createAutomaticTokensForwardingRITS = (CreateAutomaticTokensForwardingRITS) o;
    return Objects.equals(this.propertyId, createAutomaticTokensForwardingRITS.propertyId) &&
        Objects.equals(this.contractAddress, createAutomaticTokensForwardingRITS.contractAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(propertyId, contractAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateAutomaticTokensForwardingRITS {\n");
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

