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
import org.openapitools.client.model.BroadcastLocallySignedTransaction400Response;
import org.openapitools.client.model.BroadcastLocallySignedTransaction401Response;
import org.openapitools.client.model.BroadcastLocallySignedTransaction403Response;
import org.openapitools.client.model.BroadcastLocallySignedTransaction409Response;
import org.openapitools.client.model.BroadcastLocallySignedTransactionR;
import org.openapitools.client.model.BroadcastLocallySignedTransactionRB;
import org.openapitools.client.model.DecodeRawTransactionHex400Response;
import org.openapitools.client.model.DecodeRawTransactionHex401Response;
import org.openapitools.client.model.DecodeRawTransactionHex403Response;
import org.openapitools.client.model.DecodeRawTransactionHexR;
import org.openapitools.client.model.DecodeRawTransactionHexRB;
import org.openapitools.client.model.DecodeXAddress400Response;
import org.openapitools.client.model.DecodeXAddress401Response;
import org.openapitools.client.model.DecodeXAddress403Response;
import org.openapitools.client.model.DecodeXAddressR;
import org.openapitools.client.model.DeriveHDWalletXPubYPubZPubChangeOrReceivingAddresses400Response;
import org.openapitools.client.model.DeriveHDWalletXPubYPubZPubChangeOrReceivingAddresses401Response;
import org.openapitools.client.model.DeriveHDWalletXPubYPubZPubChangeOrReceivingAddresses403Response;
import org.openapitools.client.model.DeriveHDWalletXPubYPubZPubChangeOrReceivingAddressesR;
import org.openapitools.client.model.EncodeXAddress400Response;
import org.openapitools.client.model.EncodeXAddress401Response;
import org.openapitools.client.model.EncodeXAddress403Response;
import org.openapitools.client.model.EncodeXAddressR;
import org.openapitools.client.model.EstimateGasLimit400Response;
import org.openapitools.client.model.EstimateGasLimit401Response;
import org.openapitools.client.model.EstimateGasLimit403Response;
import org.openapitools.client.model.EstimateGasLimitR;
import org.openapitools.client.model.EstimateGasLimitRB;
import org.openapitools.client.model.EstimateTokenGasLimit400Response;
import org.openapitools.client.model.EstimateTokenGasLimit401Response;
import org.openapitools.client.model.EstimateTokenGasLimit403Response;
import org.openapitools.client.model.EstimateTokenGasLimitR;
import org.openapitools.client.model.EstimateTokenGasLimitRB;
import org.openapitools.client.model.GetAddressDetails402Response;
import org.openapitools.client.model.GetAddressDetails409Response;
import org.openapitools.client.model.GetAddressDetails415Response;
import org.openapitools.client.model.GetAddressDetails422Response;
import org.openapitools.client.model.GetAddressDetails429Response;
import org.openapitools.client.model.GetAddressDetails500Response;
import org.openapitools.client.model.GetEIP1559FeeRecommendations400Response;
import org.openapitools.client.model.GetEIP1559FeeRecommendations401Response;
import org.openapitools.client.model.GetEIP1559FeeRecommendations403Response;
import org.openapitools.client.model.GetEIP1559FeeRecommendationsR;
import org.openapitools.client.model.GetXRPRippleTransactionDetailsByTransactionID404Response;
import org.openapitools.client.model.ValidateAddress400Response;
import org.openapitools.client.model.ValidateAddress401Response;
import org.openapitools.client.model.ValidateAddress403Response;
import org.openapitools.client.model.ValidateAddressR;
import org.openapitools.client.model.ValidateAddressRB;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for FeaturesApi
 */
@Disabled
public class FeaturesApiTest {

    private final FeaturesApi api = new FeaturesApi();

    /**
     * Broadcast Locally Signed Transaction
     *
     * Through this endpoint customers can broadcast transactions that have been already signed locally. Instead of using a node for broadcasting a signed transaction users can use this endpoint. We then keep the user posted about the status by sending you a callback with a success or failure status.    {warning}This can be prepared and signed **only** locally, not through the API. We can provide support only for the process of broadcasting.{/warning}
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void broadcastLocallySignedTransactionTest() throws ApiException {
        String blockchain = null;
        String network = null;
        String context = null;
        BroadcastLocallySignedTransactionRB broadcastLocallySignedTransactionRB = null;
        BroadcastLocallySignedTransactionR response = api.broadcastLocallySignedTransaction(blockchain, network, context, broadcastLocallySignedTransactionRB);
        // TODO: test validations
    }

    /**
     * Decode Raw Transaction Hex
     *
     * Through this endpoint customers can decode a raw transaction hex and see the decoded transactions&#39; details.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void decodeRawTransactionHexTest() throws ApiException {
        String blockchain = null;
        String network = null;
        String context = null;
        DecodeRawTransactionHexRB decodeRawTransactionHexRB = null;
        DecodeRawTransactionHexR response = api.decodeRawTransactionHex(blockchain, network, context, decodeRawTransactionHexRB);
        // TODO: test validations
    }

    /**
     * Decode X-Address
     *
     * Through this endpoint, customers can decode an encoded XRP address with tag, by providing the specific x-address. The response includes the decoded classic address and the tag.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void decodeXAddressTest() throws ApiException {
        String blockchain = null;
        String network = null;
        String xAddress = null;
        String context = null;
        DecodeXAddressR response = api.decodeXAddress(blockchain, network, xAddress, context);
        // TODO: test validations
    }

    /**
     * Derive HD Wallet (xPub, yPub, zPub) Change Or Receiving Addresses
     *
     * Through this endpoint, customers can derive up to 10 addresses - both change and receive, from a certain HD Wallet (xPub, yPub, zPub), by providing an extended public key. By default the system creates a receiving/deposit address, unless the isChange attribute is set to &#39;true&#39;. In that case the system derives a &#39;change&#39; address. The change address can be derived only for UTXO based blockchains, for all the rest, this endpoint always creates a deposit/receiving address.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deriveHDWalletXPubYPubZPubChangeOrReceivingAddressesTest() throws ApiException {
        String blockchain = null;
        String extendedPublicKey = null;
        String network = null;
        String context = null;
        String addressFormat = null;
        Integer addressesCount = null;
        Boolean isChange = null;
        Integer startIndex = null;
        DeriveHDWalletXPubYPubZPubChangeOrReceivingAddressesR response = api.deriveHDWalletXPubYPubZPubChangeOrReceivingAddresses(blockchain, extendedPublicKey, network, context, addressFormat, addressesCount, isChange, startIndex);
        // TODO: test validations
    }

    /**
     * Encode X-Address
     *
     * Through this endpoint, customers can encode an encoded XRP address with tag, by providing the specific x-address. The response includes the encoded classic address and the tag.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void encodeXAddressTest() throws ApiException {
        Integer addressTag = null;
        String blockchain = null;
        String classicAddress = null;
        String network = null;
        String context = null;
        EncodeXAddressR response = api.encodeXAddress(addressTag, blockchain, classicAddress, network, context);
        // TODO: test validations
    }

    /**
     * Estimate Gas Limit
     *
     * This endpoint helps customer in estimating the gas limit needed for a transaction. It gives information for gas expenses when sending ether to contracts or making a transaction with additional data in it.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void estimateGasLimitTest() throws ApiException {
        String blockchain = null;
        String network = null;
        String context = null;
        EstimateGasLimitRB estimateGasLimitRB = null;
        EstimateGasLimitR response = api.estimateGasLimit(blockchain, network, context, estimateGasLimitRB);
        // TODO: test validations
    }

    /**
     * Estimate Token Gas Limit
     *
     * This endpoint helps customer in estimating the Contract Gas Limit needed for a transaction. It gives information for gas expenses for a specific contract when sending ethers or making a transaction with additional data in it.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void estimateTokenGasLimitTest() throws ApiException {
        String blockchain = null;
        String network = null;
        String context = null;
        EstimateTokenGasLimitRB estimateTokenGasLimitRB = null;
        EstimateTokenGasLimitR response = api.estimateTokenGasLimit(blockchain, network, context, estimateTokenGasLimitRB);
        // TODO: test validations
    }

    /**
     * Get EIP 1559 Fee Recommendations
     *
     * Through this endpoint customers can obtain fee recommendations specifically for EIP 1559.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getEIP1559FeeRecommendationsTest() throws ApiException {
        String network = null;
        String blockchain = null;
        String context = null;
        GetEIP1559FeeRecommendationsR response = api.getEIP1559FeeRecommendations(network, blockchain, context);
        // TODO: test validations
    }

    /**
     * Validate Address
     *
     * This endpoint checks user public addresses whether they are valid or not.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void validateAddressTest() throws ApiException {
        String blockchain = null;
        String network = null;
        String context = null;
        ValidateAddressRB validateAddressRB = null;
        ValidateAddressR response = api.validateAddress(blockchain, network, context, validateAddressRB);
        // TODO: test validations
    }

}
