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

/**
 * Represents the script public key.
 */
@ApiModel(description = "Represents the script public key.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-07-30T08:15:40.964553Z[Etc/UTC]")
public class ListTransactionsByBlockHeightRIBSDScriptPubKey {
  public static final String SERIALIZED_NAME_ADDRESSES = "addresses";
  @SerializedName(SERIALIZED_NAME_ADDRESSES)
  private List<String> addresses = new ArrayList<String>();

  public static final String SERIALIZED_NAME_ASM = "asm";
  @SerializedName(SERIALIZED_NAME_ASM)
  private String asm;

  public static final String SERIALIZED_NAME_HEX = "hex";
  @SerializedName(SERIALIZED_NAME_HEX)
  private String hex;

  public static final String SERIALIZED_NAME_REQ_SIGS = "reqSigs";
  @SerializedName(SERIALIZED_NAME_REQ_SIGS)
  private Integer reqSigs;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;


  public ListTransactionsByBlockHeightRIBSDScriptPubKey addresses(List<String> addresses) {
    
    this.addresses = addresses;
    return this;
  }

  public ListTransactionsByBlockHeightRIBSDScriptPubKey addAddressesItem(String addressesItem) {
    this.addresses.add(addressesItem);
    return this;
  }

   /**
   * Get addresses
   * @return addresses
  **/
  @ApiModelProperty(required = true, value = "")

  public List<String> getAddresses() {
    return addresses;
  }


  public void setAddresses(List<String> addresses) {
    this.addresses = addresses;
  }


  public ListTransactionsByBlockHeightRIBSDScriptPubKey asm(String asm) {
    
    this.asm = asm;
    return this;
  }

   /**
   * Represents the assembly of the script public key of the address.
   * @return asm
  **/
  @ApiModelProperty(required = true, value = "Represents the assembly of the script public key of the address.")

  public String getAsm() {
    return asm;
  }


  public void setAsm(String asm) {
    this.asm = asm;
  }


  public ListTransactionsByBlockHeightRIBSDScriptPubKey hex(String hex) {
    
    this.hex = hex;
    return this;
  }

   /**
   * Represents the hex of the script public key of the address.
   * @return hex
  **/
  @ApiModelProperty(required = true, value = "Represents the hex of the script public key of the address.")

  public String getHex() {
    return hex;
  }


  public void setHex(String hex) {
    this.hex = hex;
  }


  public ListTransactionsByBlockHeightRIBSDScriptPubKey reqSigs(Integer reqSigs) {
    
    this.reqSigs = reqSigs;
    return this;
  }

   /**
   * Represents the required signatures.
   * @return reqSigs
  **/
  @ApiModelProperty(example = "2", required = true, value = "Represents the required signatures.")

  public Integer getReqSigs() {
    return reqSigs;
  }


  public void setReqSigs(Integer reqSigs) {
    this.reqSigs = reqSigs;
  }


  public ListTransactionsByBlockHeightRIBSDScriptPubKey type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Represents the script type.
   * @return type
  **/
  @ApiModelProperty(example = "scripthash", required = true, value = "Represents the script type.")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListTransactionsByBlockHeightRIBSDScriptPubKey listTransactionsByBlockHeightRIBSDScriptPubKey = (ListTransactionsByBlockHeightRIBSDScriptPubKey) o;
    return Objects.equals(this.addresses, listTransactionsByBlockHeightRIBSDScriptPubKey.addresses) &&
        Objects.equals(this.asm, listTransactionsByBlockHeightRIBSDScriptPubKey.asm) &&
        Objects.equals(this.hex, listTransactionsByBlockHeightRIBSDScriptPubKey.hex) &&
        Objects.equals(this.reqSigs, listTransactionsByBlockHeightRIBSDScriptPubKey.reqSigs) &&
        Objects.equals(this.type, listTransactionsByBlockHeightRIBSDScriptPubKey.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addresses, asm, hex, reqSigs, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListTransactionsByBlockHeightRIBSDScriptPubKey {\n");
    sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
    sb.append("    asm: ").append(toIndentedString(asm)).append("\n");
    sb.append("    hex: ").append(toIndentedString(hex)).append("\n");
    sb.append("    reqSigs: ").append(toIndentedString(reqSigs)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

