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
 * ListDepositAddressesRI
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-07-30T08:15:40.964553Z[Etc/UTC]")
public class ListDepositAddressesRI {
  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private String address;

  public static final String SERIALIZED_NAME_CREATED_TIMESTAMP = "createdTimestamp";
  @SerializedName(SERIALIZED_NAME_CREATED_TIMESTAMP)
  private Integer createdTimestamp;

  public static final String SERIALIZED_NAME_LABEL = "label";
  @SerializedName(SERIALIZED_NAME_LABEL)
  private String label;


  public ListDepositAddressesRI address(String address) {
    
    this.address = address;
    return this;
  }

   /**
   * Specifies the specific address&#39;s unique string value.
   * @return address
  **/
  @ApiModelProperty(example = "0xe2b5f5e885a268e4b6faae53f99a663f3bb3e036", required = true, value = "Specifies the specific address's unique string value.")

  public String getAddress() {
    return address;
  }


  public void setAddress(String address) {
    this.address = address;
  }


  public ListDepositAddressesRI createdTimestamp(Integer createdTimestamp) {
    
    this.createdTimestamp = createdTimestamp;
    return this;
  }

   /**
   * Defines the specific UNIX time when the deposit address was created.
   * @return createdTimestamp
  **/
  @ApiModelProperty(example = "346658753", required = true, value = "Defines the specific UNIX time when the deposit address was created.")

  public Integer getCreatedTimestamp() {
    return createdTimestamp;
  }


  public void setCreatedTimestamp(Integer createdTimestamp) {
    this.createdTimestamp = createdTimestamp;
  }


  public ListDepositAddressesRI label(String label) {
    
    this.label = label;
    return this;
  }

   /**
   * Represents a custom tag that customers can set up for their Wallets and addresses. E.g. custom label named \&quot;Special addresses\&quot;.
   * @return label
  **/
  @ApiModelProperty(example = "yourStringHere", required = true, value = "Represents a custom tag that customers can set up for their Wallets and addresses. E.g. custom label named \"Special addresses\".")

  public String getLabel() {
    return label;
  }


  public void setLabel(String label) {
    this.label = label;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListDepositAddressesRI listDepositAddressesRI = (ListDepositAddressesRI) o;
    return Objects.equals(this.address, listDepositAddressesRI.address) &&
        Objects.equals(this.createdTimestamp, listDepositAddressesRI.createdTimestamp) &&
        Objects.equals(this.label, listDepositAddressesRI.label);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, createdTimestamp, label);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListDepositAddressesRI {\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    createdTimestamp: ").append(toIndentedString(createdTimestamp)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
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

