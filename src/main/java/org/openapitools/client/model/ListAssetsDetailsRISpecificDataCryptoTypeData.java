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
 * Crypto Type Data
 */
@ApiModel(description = "Crypto Type Data")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-07-20T13:36:32.071127Z[Etc/UTC]")
public class ListAssetsDetailsRISpecificDataCryptoTypeData {
  public static final String SERIALIZED_NAME_1HOUR_PRICE_CHANGE_IN_PERCENTAGE = "1HourPriceChangeInPercentage";
  @SerializedName(SERIALIZED_NAME_1HOUR_PRICE_CHANGE_IN_PERCENTAGE)
  private String _1hourPriceChangeInPercentage;

  public static final String SERIALIZED_NAME_1WEEK_PRICE_CHANGE_IN_PERCENTAGE = "1WeekPriceChangeInPercentage";
  @SerializedName(SERIALIZED_NAME_1WEEK_PRICE_CHANGE_IN_PERCENTAGE)
  private String _1weekPriceChangeInPercentage;

  public static final String SERIALIZED_NAME_24HOURS_PRICE_CHANGE_IN_PERCENTAGE = "24HoursPriceChangeInPercentage";
  @SerializedName(SERIALIZED_NAME_24HOURS_PRICE_CHANGE_IN_PERCENTAGE)
  private String _24hoursPriceChangeInPercentage;

  public static final String SERIALIZED_NAME_24HOURS_TRADING_VOLUME = "24HoursTradingVolume";
  @SerializedName(SERIALIZED_NAME_24HOURS_TRADING_VOLUME)
  private String _24hoursTradingVolume;

  /**
   * Subtype of the crypto assets. Could be COIN or TOKEN
   */
  @JsonAdapter(AssetTypeEnum.Adapter.class)
  public enum AssetTypeEnum {
    COIN("coin"),
    
    TOKEN("token");

    private String value;

    AssetTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AssetTypeEnum fromValue(String value) {
      for (AssetTypeEnum b : AssetTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<AssetTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AssetTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AssetTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return AssetTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ASSET_TYPE = "assetType";
  @SerializedName(SERIALIZED_NAME_ASSET_TYPE)
  private AssetTypeEnum assetType;

  public static final String SERIALIZED_NAME_CIRCULATING_SUPPLY = "circulatingSupply";
  @SerializedName(SERIALIZED_NAME_CIRCULATING_SUPPLY)
  private String circulatingSupply;

  public static final String SERIALIZED_NAME_MARKET_CAP_IN_U_S_D = "marketCapInUSD";
  @SerializedName(SERIALIZED_NAME_MARKET_CAP_IN_U_S_D)
  private String marketCapInUSD;

  public static final String SERIALIZED_NAME_MAX_SUPPLY = "maxSupply";
  @SerializedName(SERIALIZED_NAME_MAX_SUPPLY)
  private String maxSupply;


  public ListAssetsDetailsRISpecificDataCryptoTypeData _1hourPriceChangeInPercentage(String _1hourPriceChangeInPercentage) {
    
    this._1hourPriceChangeInPercentage = _1hourPriceChangeInPercentage;
    return this;
  }

   /**
   * Represents the percentage of the asset&#39;s current price against the its price from 1 hour ago.
   * @return _1hourPriceChangeInPercentage
  **/
  @ApiModelProperty(example = "-2.52", required = true, value = "Represents the percentage of the asset's current price against the its price from 1 hour ago.")

  public String get1hourPriceChangeInPercentage() {
    return _1hourPriceChangeInPercentage;
  }


  public void set1hourPriceChangeInPercentage(String _1hourPriceChangeInPercentage) {
    this._1hourPriceChangeInPercentage = _1hourPriceChangeInPercentage;
  }


  public ListAssetsDetailsRISpecificDataCryptoTypeData _1weekPriceChangeInPercentage(String _1weekPriceChangeInPercentage) {
    
    this._1weekPriceChangeInPercentage = _1weekPriceChangeInPercentage;
    return this;
  }

   /**
   * Represents the percentage of the asset&#39;s current price against the its price from 1 week ago.
   * @return _1weekPriceChangeInPercentage
  **/
  @ApiModelProperty(example = "-10.18", required = true, value = "Represents the percentage of the asset's current price against the its price from 1 week ago.")

  public String get1weekPriceChangeInPercentage() {
    return _1weekPriceChangeInPercentage;
  }


  public void set1weekPriceChangeInPercentage(String _1weekPriceChangeInPercentage) {
    this._1weekPriceChangeInPercentage = _1weekPriceChangeInPercentage;
  }


  public ListAssetsDetailsRISpecificDataCryptoTypeData _24hoursPriceChangeInPercentage(String _24hoursPriceChangeInPercentage) {
    
    this._24hoursPriceChangeInPercentage = _24hoursPriceChangeInPercentage;
    return this;
  }

   /**
   * Represents the percentage of the asset&#39;s current price against the its price from 24 hours ago.
   * @return _24hoursPriceChangeInPercentage
  **/
  @ApiModelProperty(example = "-3.37", required = true, value = "Represents the percentage of the asset's current price against the its price from 24 hours ago.")

  public String get24hoursPriceChangeInPercentage() {
    return _24hoursPriceChangeInPercentage;
  }


  public void set24hoursPriceChangeInPercentage(String _24hoursPriceChangeInPercentage) {
    this._24hoursPriceChangeInPercentage = _24hoursPriceChangeInPercentage;
  }


  public ListAssetsDetailsRISpecificDataCryptoTypeData _24hoursTradingVolume(String _24hoursTradingVolume) {
    
    this._24hoursTradingVolume = _24hoursTradingVolume;
    return this;
  }

   /**
   * Represents the trading volume of the asset for the time frame of 24 hours.
   * @return _24hoursTradingVolume
  **/
  @ApiModelProperty(example = "2871630447", required = true, value = "Represents the trading volume of the asset for the time frame of 24 hours.")

  public String get24hoursTradingVolume() {
    return _24hoursTradingVolume;
  }


  public void set24hoursTradingVolume(String _24hoursTradingVolume) {
    this._24hoursTradingVolume = _24hoursTradingVolume;
  }


  public ListAssetsDetailsRISpecificDataCryptoTypeData assetType(AssetTypeEnum assetType) {
    
    this.assetType = assetType;
    return this;
  }

   /**
   * Subtype of the crypto assets. Could be COIN or TOKEN
   * @return assetType
  **/
  @ApiModelProperty(example = "coin", required = true, value = "Subtype of the crypto assets. Could be COIN or TOKEN")

  public AssetTypeEnum getAssetType() {
    return assetType;
  }


  public void setAssetType(AssetTypeEnum assetType) {
    this.assetType = assetType;
  }


  public ListAssetsDetailsRISpecificDataCryptoTypeData circulatingSupply(String circulatingSupply) {
    
    this.circulatingSupply = circulatingSupply;
    return this;
  }

   /**
   * Represents the amount of the asset that is circulating on the market and in public hands.
   * @return circulatingSupply
  **/
  @ApiModelProperty(example = "123564.25", required = true, value = "Represents the amount of the asset that is circulating on the market and in public hands.")

  public String getCirculatingSupply() {
    return circulatingSupply;
  }


  public void setCirculatingSupply(String circulatingSupply) {
    this.circulatingSupply = circulatingSupply;
  }


  public ListAssetsDetailsRISpecificDataCryptoTypeData marketCapInUSD(String marketCapInUSD) {
    
    this.marketCapInUSD = marketCapInUSD;
    return this;
  }

   /**
   * Defines the total market value of the asset&#39;s circulating supply in USD.
   * @return marketCapInUSD
  **/
  @ApiModelProperty(example = "1,056,050,713,184", required = true, value = "Defines the total market value of the asset's circulating supply in USD.")

  public String getMarketCapInUSD() {
    return marketCapInUSD;
  }


  public void setMarketCapInUSD(String marketCapInUSD) {
    this.marketCapInUSD = marketCapInUSD;
  }


  public ListAssetsDetailsRISpecificDataCryptoTypeData maxSupply(String maxSupply) {
    
    this.maxSupply = maxSupply;
    return this;
  }

   /**
   * Represents the maximum amount of all coins of a specific asset that will ever exist in its lifetime.
   * @return maxSupply
  **/
  @ApiModelProperty(example = "18,562,881", required = true, value = "Represents the maximum amount of all coins of a specific asset that will ever exist in its lifetime.")

  public String getMaxSupply() {
    return maxSupply;
  }


  public void setMaxSupply(String maxSupply) {
    this.maxSupply = maxSupply;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListAssetsDetailsRISpecificDataCryptoTypeData listAssetsDetailsRISpecificDataCryptoTypeData = (ListAssetsDetailsRISpecificDataCryptoTypeData) o;
    return Objects.equals(this._1hourPriceChangeInPercentage, listAssetsDetailsRISpecificDataCryptoTypeData._1hourPriceChangeInPercentage) &&
        Objects.equals(this._1weekPriceChangeInPercentage, listAssetsDetailsRISpecificDataCryptoTypeData._1weekPriceChangeInPercentage) &&
        Objects.equals(this._24hoursPriceChangeInPercentage, listAssetsDetailsRISpecificDataCryptoTypeData._24hoursPriceChangeInPercentage) &&
        Objects.equals(this._24hoursTradingVolume, listAssetsDetailsRISpecificDataCryptoTypeData._24hoursTradingVolume) &&
        Objects.equals(this.assetType, listAssetsDetailsRISpecificDataCryptoTypeData.assetType) &&
        Objects.equals(this.circulatingSupply, listAssetsDetailsRISpecificDataCryptoTypeData.circulatingSupply) &&
        Objects.equals(this.marketCapInUSD, listAssetsDetailsRISpecificDataCryptoTypeData.marketCapInUSD) &&
        Objects.equals(this.maxSupply, listAssetsDetailsRISpecificDataCryptoTypeData.maxSupply);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_1hourPriceChangeInPercentage, _1weekPriceChangeInPercentage, _24hoursPriceChangeInPercentage, _24hoursTradingVolume, assetType, circulatingSupply, marketCapInUSD, maxSupply);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListAssetsDetailsRISpecificDataCryptoTypeData {\n");
    sb.append("    _1hourPriceChangeInPercentage: ").append(toIndentedString(_1hourPriceChangeInPercentage)).append("\n");
    sb.append("    _1weekPriceChangeInPercentage: ").append(toIndentedString(_1weekPriceChangeInPercentage)).append("\n");
    sb.append("    _24hoursPriceChangeInPercentage: ").append(toIndentedString(_24hoursPriceChangeInPercentage)).append("\n");
    sb.append("    _24hoursTradingVolume: ").append(toIndentedString(_24hoursTradingVolume)).append("\n");
    sb.append("    assetType: ").append(toIndentedString(assetType)).append("\n");
    sb.append("    circulatingSupply: ").append(toIndentedString(circulatingSupply)).append("\n");
    sb.append("    marketCapInUSD: ").append(toIndentedString(marketCapInUSD)).append("\n");
    sb.append("    maxSupply: ").append(toIndentedString(maxSupply)).append("\n");
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

