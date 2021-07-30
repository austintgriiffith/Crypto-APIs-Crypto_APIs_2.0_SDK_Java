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
 * Bitcoin Omni Token
 */
@ApiModel(description = "Bitcoin Omni Token")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-07-30T08:15:40.964553Z[Etc/UTC]")
public class AddTokensToExistingFromAddressRBTokenDataBitcoinOmniToken {
  public static final String SERIALIZED_NAME_PROPERTY_ID = "propertyId";
  @SerializedName(SERIALIZED_NAME_PROPERTY_ID)
  private Integer propertyId;


  public AddTokensToExistingFromAddressRBTokenDataBitcoinOmniToken propertyId(Integer propertyId) {
    
    this.propertyId = propertyId;
    return this;
  }

   /**
   * Represents the specific &#x60;propertyId&#x60; of the token data that will be forwarded.
   * @return propertyId
  **/
  @ApiModelProperty(example = "2", required = true, value = "Represents the specific `propertyId` of the token data that will be forwarded.")

  public Integer getPropertyId() {
    return propertyId;
  }


  public void setPropertyId(Integer propertyId) {
    this.propertyId = propertyId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddTokensToExistingFromAddressRBTokenDataBitcoinOmniToken addTokensToExistingFromAddressRBTokenDataBitcoinOmniToken = (AddTokensToExistingFromAddressRBTokenDataBitcoinOmniToken) o;
    return Objects.equals(this.propertyId, addTokensToExistingFromAddressRBTokenDataBitcoinOmniToken.propertyId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(propertyId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddTokensToExistingFromAddressRBTokenDataBitcoinOmniToken {\n");
    sb.append("    propertyId: ").append(toIndentedString(propertyId)).append("\n");
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

