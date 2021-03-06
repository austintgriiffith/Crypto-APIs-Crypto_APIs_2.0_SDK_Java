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


package org.openapitools.client.api;

import io.cryptoapis.sdk.ApiException;
import org.openapitools.client.model.GetAddressDetails402Response;
import org.openapitools.client.model.GetAddressDetails409Response;
import org.openapitools.client.model.GetAddressDetails415Response;
import org.openapitools.client.model.GetAddressDetails422Response;
import org.openapitools.client.model.GetAddressDetails429Response;
import org.openapitools.client.model.GetAddressDetails500Response;
import org.openapitools.client.model.GetAssetDetailsByAssetID400Response;
import org.openapitools.client.model.GetAssetDetailsByAssetID401Response;
import org.openapitools.client.model.GetAssetDetailsByAssetID403Response;
import org.openapitools.client.model.GetAssetDetailsByAssetIDR;
import org.openapitools.client.model.GetAssetDetailsByAssetSymbol400Response;
import org.openapitools.client.model.GetAssetDetailsByAssetSymbol401Response;
import org.openapitools.client.model.GetAssetDetailsByAssetSymbol403Response;
import org.openapitools.client.model.GetAssetDetailsByAssetSymbolR;
import org.openapitools.client.model.ListAssetsDetails400Response;
import org.openapitools.client.model.ListAssetsDetails401Response;
import org.openapitools.client.model.ListAssetsDetails403Response;
import org.openapitools.client.model.ListAssetsDetailsR;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AssetsApi
 */
@Disabled
public class AssetsApiTest {

    private final AssetsApi api = new AssetsApi();

    /**
     * Get Asset Details By Asset ID
     *
     * Through this endpoint users can obtain information on assets by &#x60;assetId&#x60;.    The details returned could include information on the latest rate and rate fluctuation of different periods of time - 24 hours, a week, one hour, the encoding of the logo, and more.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAssetDetailsByAssetIDTest() throws ApiException {
        String assetId = null;
        String context = null;
        GetAssetDetailsByAssetIDR response = api.getAssetDetailsByAssetID(assetId, context);
        // TODO: test validations
    }

    /**
     * Get Asset Details By Asset Symbol
     *
     * Through this endpoint users can obtain information on assets by asset symbol.    The details returned could include information on the latest rate and rate fluctuation of different periods of time - 24 hours, a week, one hour, the encoding of the logo, and more.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAssetDetailsByAssetSymbolTest() throws ApiException {
        String assetSymbol = null;
        String context = null;
        GetAssetDetailsByAssetSymbolR response = api.getAssetDetailsByAssetSymbol(assetSymbol, context);
        // TODO: test validations
    }

    /**
     * List Assets Details
     *
     * This endpoint will return a list of details on assets. These could be cryptocurrencies or FIAT assets that we support. Each asset has a unique identifier - &#x60;assetId&#x60; and a unique symbol in the form of a string, e.g. \&quot;BTC\&quot;.    The details returned could include information on the latest rate and rate fluctuation of different periods of time - 24 hours, a week, one hour, the encoding of the logo, and more.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listAssetsDetailsTest() throws ApiException {
        String context = null;
        String assetType = null;
        String cryptoType = null;
        Integer limit = null;
        Integer offset = null;
        Boolean waasEnabled = null;
        ListAssetsDetailsR response = api.listAssetsDetails(context, assetType, cryptoType, limit, offset, waasEnabled);
        // TODO: test validations
    }

}
