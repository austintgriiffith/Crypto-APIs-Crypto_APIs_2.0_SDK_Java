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
import org.openapitools.client.model.CreateAutomaticTokensForwardingRITS;

/**
 * CreateAutomaticTokensForwardingRI
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-25T12:38:09.413192Z[Etc/UTC]")
public class CreateAutomaticTokensForwardingRI {
  public static final String SERIALIZED_NAME_CALLBACK_URL = "callbackUrl";
  @SerializedName(SERIALIZED_NAME_CALLBACK_URL)
  private String callbackUrl;

  public static final String SERIALIZED_NAME_CONFIRMATIONS_COUNT = "confirmationsCount";
  @SerializedName(SERIALIZED_NAME_CONFIRMATIONS_COUNT)
  private Integer confirmationsCount;

  public static final String SERIALIZED_NAME_CREATED_TIMESTAMP = "createdTimestamp";
  @SerializedName(SERIALIZED_NAME_CREATED_TIMESTAMP)
  private Integer createdTimestamp;

  public static final String SERIALIZED_NAME_FEE_ADDRESS = "feeAddress";
  @SerializedName(SERIALIZED_NAME_FEE_ADDRESS)
  private String feeAddress;

  /**
   * Represents the fee priority of the automation, whether it is \&quot;SLOW\&quot;, \&quot;STANDARD\&quot; or \&quot;FAST\&quot;.
   */
  @JsonAdapter(FeePriorityEnum.Adapter.class)
  public enum FeePriorityEnum {
    SLOW("slow"),
    
    STANDARD("standard"),
    
    FAST("fast");

    private String value;

    FeePriorityEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static FeePriorityEnum fromValue(String value) {
      for (FeePriorityEnum b : FeePriorityEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<FeePriorityEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FeePriorityEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public FeePriorityEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return FeePriorityEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_FEE_PRIORITY = "feePriority";
  @SerializedName(SERIALIZED_NAME_FEE_PRIORITY)
  private FeePriorityEnum feePriority;

  public static final String SERIALIZED_NAME_FROM_ADDRESS = "fromAddress";
  @SerializedName(SERIALIZED_NAME_FROM_ADDRESS)
  private String fromAddress;

  public static final String SERIALIZED_NAME_MINIMUM_TRANSFER_AMOUNT = "minimumTransferAmount";
  @SerializedName(SERIALIZED_NAME_MINIMUM_TRANSFER_AMOUNT)
  private String minimumTransferAmount;

  public static final String SERIALIZED_NAME_REFERENCE_ID = "referenceId";
  @SerializedName(SERIALIZED_NAME_REFERENCE_ID)
  private String referenceId;

  public static final String SERIALIZED_NAME_TO_ADDRESS = "toAddress";
  @SerializedName(SERIALIZED_NAME_TO_ADDRESS)
  private String toAddress;

  public static final String SERIALIZED_NAME_TOKEN_DATA = "tokenData";
  @SerializedName(SERIALIZED_NAME_TOKEN_DATA)
  private CreateAutomaticTokensForwardingRITS tokenData;


  public CreateAutomaticTokensForwardingRI callbackUrl(String callbackUrl) {
    
    this.callbackUrl = callbackUrl;
    return this;
  }

   /**
   * Represents the URL that is set by the customer where the callback will be received at. The callback notification will be received only if and when the event occurs.
   * @return callbackUrl
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "https://example.com", required = true, value = "Represents the URL that is set by the customer where the callback will be received at. The callback notification will be received only if and when the event occurs.")

  public String getCallbackUrl() {
    return callbackUrl;
  }


  public void setCallbackUrl(String callbackUrl) {
    this.callbackUrl = callbackUrl;
  }


  public CreateAutomaticTokensForwardingRI confirmationsCount(Integer confirmationsCount) {
    
    this.confirmationsCount = confirmationsCount;
    return this;
  }

   /**
   * Represents the number of confirmations, i.e. the amount of blocks that have been built on top of this block.
   * @return confirmationsCount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2", required = true, value = "Represents the number of confirmations, i.e. the amount of blocks that have been built on top of this block.")

  public Integer getConfirmationsCount() {
    return confirmationsCount;
  }


  public void setConfirmationsCount(Integer confirmationsCount) {
    this.confirmationsCount = confirmationsCount;
  }


  public CreateAutomaticTokensForwardingRI createdTimestamp(Integer createdTimestamp) {
    
    this.createdTimestamp = createdTimestamp;
    return this;
  }

   /**
   * Defines the specific time/date when the automatic forwarding was created in Unix Timestamp.
   * @return createdTimestamp
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1611238648", required = true, value = "Defines the specific time/date when the automatic forwarding was created in Unix Timestamp.")

  public Integer getCreatedTimestamp() {
    return createdTimestamp;
  }


  public void setCreatedTimestamp(Integer createdTimestamp) {
    this.createdTimestamp = createdTimestamp;
  }


  public CreateAutomaticTokensForwardingRI feeAddress(String feeAddress) {
    
    this.feeAddress = feeAddress;
    return this;
  }

   /**
   * Represents the specific fee address, which is always automatically generated. Users must fund it.
   * @return feeAddress
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "mojjR51gMXLJ4B3SBPhEXXRFDX7U5UWXNQ", required = true, value = "Represents the specific fee address, which is always automatically generated. Users must fund it.")

  public String getFeeAddress() {
    return feeAddress;
  }


  public void setFeeAddress(String feeAddress) {
    this.feeAddress = feeAddress;
  }


  public CreateAutomaticTokensForwardingRI feePriority(FeePriorityEnum feePriority) {
    
    this.feePriority = feePriority;
    return this;
  }

   /**
   * Represents the fee priority of the automation, whether it is \&quot;SLOW\&quot;, \&quot;STANDARD\&quot; or \&quot;FAST\&quot;.
   * @return feePriority
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "standard", required = true, value = "Represents the fee priority of the automation, whether it is \"SLOW\", \"STANDARD\" or \"FAST\".")

  public FeePriorityEnum getFeePriority() {
    return feePriority;
  }


  public void setFeePriority(FeePriorityEnum feePriority) {
    this.feePriority = feePriority;
  }


  public CreateAutomaticTokensForwardingRI fromAddress(String fromAddress) {
    
    this.fromAddress = fromAddress;
    return this;
  }

   /**
   * Represents the hash of the address that forwards the tokens.
   * @return fromAddress
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "ms4KNsbNpoU8g424pzmEjbkFbfAHae1msB", required = true, value = "Represents the hash of the address that forwards the tokens.")

  public String getFromAddress() {
    return fromAddress;
  }


  public void setFromAddress(String fromAddress) {
    this.fromAddress = fromAddress;
  }


  public CreateAutomaticTokensForwardingRI minimumTransferAmount(String minimumTransferAmount) {
    
    this.minimumTransferAmount = minimumTransferAmount;
    return this;
  }

   /**
   * Represents the minimum transfer amount of the tokens in the &#x60;fromAddress&#x60; that can be allowed for an automatic forwarding.
   * @return minimumTransferAmount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "0.5", required = true, value = "Represents the minimum transfer amount of the tokens in the `fromAddress` that can be allowed for an automatic forwarding.")

  public String getMinimumTransferAmount() {
    return minimumTransferAmount;
  }


  public void setMinimumTransferAmount(String minimumTransferAmount) {
    this.minimumTransferAmount = minimumTransferAmount;
  }


  public CreateAutomaticTokensForwardingRI referenceId(String referenceId) {
    
    this.referenceId = referenceId;
    return this;
  }

   /**
   * Represents a unique ID used to reference the specific callback subscription.
   * @return referenceId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "6017dd02a309213863be9e55", required = true, value = "Represents a unique ID used to reference the specific callback subscription.")

  public String getReferenceId() {
    return referenceId;
  }


  public void setReferenceId(String referenceId) {
    this.referenceId = referenceId;
  }


  public CreateAutomaticTokensForwardingRI toAddress(String toAddress) {
    
    this.toAddress = toAddress;
    return this;
  }

   /**
   * Represents the hash of the address the tokens are forwarded to.
   * @return toAddress
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "tb1q54j7qcu7kgsrx87yn0r9zjdvsxrnvxg4qua2z6", required = true, value = "Represents the hash of the address the tokens are forwarded to.")

  public String getToAddress() {
    return toAddress;
  }


  public void setToAddress(String toAddress) {
    this.toAddress = toAddress;
  }


  public CreateAutomaticTokensForwardingRI tokenData(CreateAutomaticTokensForwardingRITS tokenData) {
    
    this.tokenData = tokenData;
    return this;
  }

   /**
   * Get tokenData
   * @return tokenData
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public CreateAutomaticTokensForwardingRITS getTokenData() {
    return tokenData;
  }


  public void setTokenData(CreateAutomaticTokensForwardingRITS tokenData) {
    this.tokenData = tokenData;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateAutomaticTokensForwardingRI createAutomaticTokensForwardingRI = (CreateAutomaticTokensForwardingRI) o;
    return Objects.equals(this.callbackUrl, createAutomaticTokensForwardingRI.callbackUrl) &&
        Objects.equals(this.confirmationsCount, createAutomaticTokensForwardingRI.confirmationsCount) &&
        Objects.equals(this.createdTimestamp, createAutomaticTokensForwardingRI.createdTimestamp) &&
        Objects.equals(this.feeAddress, createAutomaticTokensForwardingRI.feeAddress) &&
        Objects.equals(this.feePriority, createAutomaticTokensForwardingRI.feePriority) &&
        Objects.equals(this.fromAddress, createAutomaticTokensForwardingRI.fromAddress) &&
        Objects.equals(this.minimumTransferAmount, createAutomaticTokensForwardingRI.minimumTransferAmount) &&
        Objects.equals(this.referenceId, createAutomaticTokensForwardingRI.referenceId) &&
        Objects.equals(this.toAddress, createAutomaticTokensForwardingRI.toAddress) &&
        Objects.equals(this.tokenData, createAutomaticTokensForwardingRI.tokenData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(callbackUrl, confirmationsCount, createdTimestamp, feeAddress, feePriority, fromAddress, minimumTransferAmount, referenceId, toAddress, tokenData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateAutomaticTokensForwardingRI {\n");
    sb.append("    callbackUrl: ").append(toIndentedString(callbackUrl)).append("\n");
    sb.append("    confirmationsCount: ").append(toIndentedString(confirmationsCount)).append("\n");
    sb.append("    createdTimestamp: ").append(toIndentedString(createdTimestamp)).append("\n");
    sb.append("    feeAddress: ").append(toIndentedString(feeAddress)).append("\n");
    sb.append("    feePriority: ").append(toIndentedString(feePriority)).append("\n");
    sb.append("    fromAddress: ").append(toIndentedString(fromAddress)).append("\n");
    sb.append("    minimumTransferAmount: ").append(toIndentedString(minimumTransferAmount)).append("\n");
    sb.append("    referenceId: ").append(toIndentedString(referenceId)).append("\n");
    sb.append("    toAddress: ").append(toIndentedString(toAddress)).append("\n");
    sb.append("    tokenData: ").append(toIndentedString(tokenData)).append("\n");
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

