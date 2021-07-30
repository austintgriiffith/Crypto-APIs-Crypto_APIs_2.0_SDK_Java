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
 * NewConfirmedCoinsTransactionsRBDataItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-07-30T08:15:40.964553Z[Etc/UTC]")
public class NewConfirmedCoinsTransactionsRBDataItem {
  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private String address;

  public static final String SERIALIZED_NAME_ALLOW_DUPLICATES = "allowDuplicates";
  @SerializedName(SERIALIZED_NAME_ALLOW_DUPLICATES)
  private Boolean allowDuplicates = false;

  public static final String SERIALIZED_NAME_CALLBACK_SECRET_KEY = "callbackSecretKey";
  @SerializedName(SERIALIZED_NAME_CALLBACK_SECRET_KEY)
  private String callbackSecretKey;

  public static final String SERIALIZED_NAME_CALLBACK_U_R_L = "callbackURL";
  @SerializedName(SERIALIZED_NAME_CALLBACK_U_R_L)
  private String callbackURL;


  public NewConfirmedCoinsTransactionsRBDataItem address(String address) {
    
    this.address = address;
    return this;
  }

   /**
   * Represents the address of the transaction, per which the result is returned.
   * @return address
  **/
  @ApiModelProperty(example = "mho4jHBcrNCncKt38trJahXakuaBnS7LK5", required = true, value = "Represents the address of the transaction, per which the result is returned.")

  public String getAddress() {
    return address;
  }


  public void setAddress(String address) {
    this.address = address;
  }


  public NewConfirmedCoinsTransactionsRBDataItem allowDuplicates(Boolean allowDuplicates) {
    
    this.allowDuplicates = allowDuplicates;
    return this;
  }

   /**
   * Specifies a flag that permits or denies the creation of duplicate addresses.
   * @return allowDuplicates
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Specifies a flag that permits or denies the creation of duplicate addresses.")

  public Boolean getAllowDuplicates() {
    return allowDuplicates;
  }


  public void setAllowDuplicates(Boolean allowDuplicates) {
    this.allowDuplicates = allowDuplicates;
  }


  public NewConfirmedCoinsTransactionsRBDataItem callbackSecretKey(String callbackSecretKey) {
    
    this.callbackSecretKey = callbackSecretKey;
    return this;
  }

   /**
   * Represents the Secret Key value provided by the customer. This field is used for security purposes during the callback notification, in order to prove the sender of the callback as Crypto APIs.
   * @return callbackSecretKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "yourSecretKey", value = "Represents the Secret Key value provided by the customer. This field is used for security purposes during the callback notification, in order to prove the sender of the callback as Crypto APIs.")

  public String getCallbackSecretKey() {
    return callbackSecretKey;
  }


  public void setCallbackSecretKey(String callbackSecretKey) {
    this.callbackSecretKey = callbackSecretKey;
  }


  public NewConfirmedCoinsTransactionsRBDataItem callbackURL(String callbackURL) {
    
    this.callbackURL = callbackURL;
    return this;
  }

   /**
   * Represents the URL that is set by the customer where the callback will be received at. The callback notification will be received only if and when the event occurs.
   * @return callbackURL
  **/
  @ApiModelProperty(example = "http://example.com", required = true, value = "Represents the URL that is set by the customer where the callback will be received at. The callback notification will be received only if and when the event occurs.")

  public String getCallbackURL() {
    return callbackURL;
  }


  public void setCallbackURL(String callbackURL) {
    this.callbackURL = callbackURL;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NewConfirmedCoinsTransactionsRBDataItem newConfirmedCoinsTransactionsRBDataItem = (NewConfirmedCoinsTransactionsRBDataItem) o;
    return Objects.equals(this.address, newConfirmedCoinsTransactionsRBDataItem.address) &&
        Objects.equals(this.allowDuplicates, newConfirmedCoinsTransactionsRBDataItem.allowDuplicates) &&
        Objects.equals(this.callbackSecretKey, newConfirmedCoinsTransactionsRBDataItem.callbackSecretKey) &&
        Objects.equals(this.callbackURL, newConfirmedCoinsTransactionsRBDataItem.callbackURL);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, allowDuplicates, callbackSecretKey, callbackURL);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewConfirmedCoinsTransactionsRBDataItem {\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    allowDuplicates: ").append(toIndentedString(allowDuplicates)).append("\n");
    sb.append("    callbackSecretKey: ").append(toIndentedString(callbackSecretKey)).append("\n");
    sb.append("    callbackURL: ").append(toIndentedString(callbackURL)).append("\n");
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

