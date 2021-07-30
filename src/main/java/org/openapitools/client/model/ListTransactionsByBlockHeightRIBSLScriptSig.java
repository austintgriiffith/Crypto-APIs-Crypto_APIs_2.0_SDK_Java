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
 * Specifies the required signatures.
 */
@ApiModel(description = "Specifies the required signatures.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-07-30T08:15:40.964553Z[Etc/UTC]")
public class ListTransactionsByBlockHeightRIBSLScriptSig {
  public static final String SERIALIZED_NAME_ASM = "asm";
  @SerializedName(SERIALIZED_NAME_ASM)
  private String asm;

  public static final String SERIALIZED_NAME_HEX = "hex";
  @SerializedName(SERIALIZED_NAME_HEX)
  private String hex;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;


  public ListTransactionsByBlockHeightRIBSLScriptSig asm(String asm) {
    
    this.asm = asm;
    return this;
  }

   /**
   * The asm strands for assembly, which is the symbolic representation of the Bitcoin&#39;s Script language op-codes.
   * @return asm
  **/
  @ApiModelProperty(example = "e052170e6a8ca2a891158c2f3a268521ae16bd1927d3cb941d54ff194986263dda8582fbc3d1a38155e366d7bea9e58501e84daf6d84f0ccb99380af36477c4f[ALL|FORKID] 027774729b977f98bb119fb1cf6fb17cc6b2d78af7acbeb6ad2b49187e8894efba", required = true, value = "The asm strands for assembly, which is the symbolic representation of the Bitcoin's Script language op-codes.")

  public String getAsm() {
    return asm;
  }


  public void setAsm(String asm) {
    this.asm = asm;
  }


  public ListTransactionsByBlockHeightRIBSLScriptSig hex(String hex) {
    
    this.hex = hex;
    return this;
  }

   /**
   * Represents the hex of the public key of the address.
   * @return hex
  **/
  @ApiModelProperty(example = "41e052170e6a8ca2a891158c2f3a268521ae16bd1927d3cb941d54ff194986263dda8582fbc3d1a38155e366d7bea9e58501e84daf6d84f0ccb99380af36477c4f4121027774729b977f98bb119fb1cf6fb17cc6b2d78af7acbeb6ad2b49187e8894efba", required = true, value = "Represents the hex of the public key of the address.")

  public String getHex() {
    return hex;
  }


  public void setHex(String hex) {
    this.hex = hex;
  }


  public ListTransactionsByBlockHeightRIBSLScriptSig type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Represents the script type of the reference transaction identifier.
   * @return type
  **/
  @ApiModelProperty(example = "scripthash", required = true, value = "Represents the script type of the reference transaction identifier.")

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
    ListTransactionsByBlockHeightRIBSLScriptSig listTransactionsByBlockHeightRIBSLScriptSig = (ListTransactionsByBlockHeightRIBSLScriptSig) o;
    return Objects.equals(this.asm, listTransactionsByBlockHeightRIBSLScriptSig.asm) &&
        Objects.equals(this.hex, listTransactionsByBlockHeightRIBSLScriptSig.hex) &&
        Objects.equals(this.type, listTransactionsByBlockHeightRIBSLScriptSig.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(asm, hex, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListTransactionsByBlockHeightRIBSLScriptSig {\n");
    sb.append("    asm: ").append(toIndentedString(asm)).append("\n");
    sb.append("    hex: ").append(toIndentedString(hex)).append("\n");
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

