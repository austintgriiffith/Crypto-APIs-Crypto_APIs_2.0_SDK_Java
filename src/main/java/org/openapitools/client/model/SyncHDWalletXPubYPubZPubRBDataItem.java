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
 * SyncHDWalletXPubYPubZPubRBDataItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-07-20T13:36:32.071127Z[Etc/UTC]")
public class SyncHDWalletXPubYPubZPubRBDataItem {
  public static final String SERIALIZED_NAME_EXTENDED_PUBLIC_KEY = "extendedPublicKey";
  @SerializedName(SERIALIZED_NAME_EXTENDED_PUBLIC_KEY)
  private String extendedPublicKey;


  public SyncHDWalletXPubYPubZPubRBDataItem extendedPublicKey(String extendedPublicKey) {
    
    this.extendedPublicKey = extendedPublicKey;
    return this;
  }

   /**
   * Defines the account extended publicly known key which is used to derive all child public keys.
   * @return extendedPublicKey
  **/
  @ApiModelProperty(example = "upub5Ei6bRNneqozk6smK7dvtXHC5PjUyEL4ynCfMKvjznLcXi9DQaikETzQjHvJC43XexMvQs64jxB1njMjCHpRZ4xQWAmv3ge9cVtjfsHmbvQ", required = true, value = "Defines the account extended publicly known key which is used to derive all child public keys.")

  public String getExtendedPublicKey() {
    return extendedPublicKey;
  }


  public void setExtendedPublicKey(String extendedPublicKey) {
    this.extendedPublicKey = extendedPublicKey;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyncHDWalletXPubYPubZPubRBDataItem syncHDWalletXPubYPubZPubRBDataItem = (SyncHDWalletXPubYPubZPubRBDataItem) o;
    return Objects.equals(this.extendedPublicKey, syncHDWalletXPubYPubZPubRBDataItem.extendedPublicKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extendedPublicKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyncHDWalletXPubYPubZPubRBDataItem {\n");
    sb.append("    extendedPublicKey: ").append(toIndentedString(extendedPublicKey)).append("\n");
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

