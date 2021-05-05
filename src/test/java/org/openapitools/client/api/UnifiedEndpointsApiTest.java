/*
 * Crypto APIs
 * Crypto APIs 2.0 is a complex and innovative infrastructure layer that radically simplifies the development of any Blockchain and Crypto related applications. Organized around REST, Crypto APIs 2.0 can assist both novice Bitcoin/Ethereum enthusiasts and crypto experts with the development of their blockchain applications. Crypto APIs 2.0 provides unified endpoints and data, raw data, automatic tokens and coins forwardings, callback functionalities, and much more.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: bizdev@cryptoapis.io
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.model.BlockchainDataBlockNotFound;
import org.openapitools.client.model.BlockchainDataTransactionNotFound;
import org.openapitools.client.model.FeatureMainnetsNotAllowedForPlan;
import org.openapitools.client.model.GetAddressDetailsResponse;
import org.openapitools.client.model.GetBlockDetailsByBlockHashResponse;
import org.openapitools.client.model.GetBlockDetailsByBlockHeightResponse;
import org.openapitools.client.model.GetFeeRecommendationsResponse;
import org.openapitools.client.model.GetLatestMinedBlockResponse;
import org.openapitools.client.model.GetTransactionDetailsByTransactionIDResponse;
import org.openapitools.client.model.InsufficientCredits;
import org.openapitools.client.model.InvalidApiKey;
import org.openapitools.client.model.InvalidData;
import org.openapitools.client.model.InvalidPagination;
import org.openapitools.client.model.InvalidRequestBodyStructure;
import org.openapitools.client.model.ListTransactionsByAddressResponse;
import org.openapitools.client.model.ListTransactionsByBlockHashResponse;
import org.openapitools.client.model.ListTransactionsByBlockHeightResponse;
import org.openapitools.client.model.RequestLimitReached;
import org.openapitools.client.model.ResourceNotFound;
import org.openapitools.client.model.UnexpectedServerError;
import org.openapitools.client.model.UnsupportedMediaType;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UnifiedEndpointsApi
 */
@Ignore
public class UnifiedEndpointsApiTest {

    private final UnifiedEndpointsApi api = new UnifiedEndpointsApi();

    
    /**
     * Get Address Details
     *
     * Through this endpoint the customer can receive basic information about a given address based on confirmed/synced blocks only. In the case where there are any incoming or outgoing **unconfirmed** transactions for the specific address, they **will not** be counted or calculated here.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAddressDetailsTest() throws ApiException {
        String blockchain = null;
        String network = null;
        String address = null;
        String context = null;
        GetAddressDetailsResponse response = api.getAddressDetails(blockchain, network, address, context);

        // TODO: test validations
    }
    
    /**
     * Get Block Details By Block Hash
     *
     * Through this endpoint customers can obtain basic information about a given mined block, specifically by using the &#x60;hash&#x60; parameter. These block details could include the hash of the specific, the previous and the next block, its transactions count, its height, etc.     Blockchain specific data is information such as version, nonce, size, bits, merkleroot, etc.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getBlockDetailsByBlockHashTest() throws ApiException {
        String blockchain = null;
        String network = null;
        String blockHash = null;
        String context = null;
        GetBlockDetailsByBlockHashResponse response = api.getBlockDetailsByBlockHash(blockchain, network, blockHash, context);

        // TODO: test validations
    }
    
    /**
     * Get Block Details By Block Height
     *
     * Through this endpoint customers can obtain basic information about a given mined block, specifically by using the &#x60;height&#x60; parameter. These block details could include the hash of the specific, the previous and the next block, its transactions count, its height, etc.     Blockchain specific data is information such as version, nonce, size, bits, merkleroot, etc.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getBlockDetailsByBlockHeightTest() throws ApiException {
        String blockchain = null;
        String network = null;
        Integer height = null;
        String context = null;
        GetBlockDetailsByBlockHeightResponse response = api.getBlockDetailsByBlockHeight(blockchain, network, height, context);

        // TODO: test validations
    }
    
    /**
     * Get Fee Recommendations
     *
     * Through this endpoint customers can obtain fee recommendations. Our fees recommendations are based on Mempool data which makes them much more accurate than fees based on already mined blocks. Calculations are done in real time live. Using this endpoint customers can get gas price for Ethereum, fee per byte for Bitcoin, etc.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFeeRecommendationsTest() throws ApiException {
        String blockchain = null;
        String network = null;
        String context = null;
        GetFeeRecommendationsResponse response = api.getFeeRecommendations(blockchain, network, context);

        // TODO: test validations
    }
    
    /**
     * Get Latest Mined Block
     *
     * Through this endpoint customers can fetch the last mined block in a specific blockchain network, along with its details. These could include the hash of the specific, the previous and the next block, its transactions count, its height, etc.     Blockchain specific data is information such as version, nonce, size, bits, merkleroot, etc.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getLatestMinedBlockTest() throws ApiException {
        String blockchain = null;
        String network = null;
        String context = null;
        GetLatestMinedBlockResponse response = api.getLatestMinedBlock(blockchain, network, context);

        // TODO: test validations
    }
    
    /**
     * Get Transaction Details By Transaction ID
     *
     * Through this endpoint customers can obtain details about a transaction by the transaction&#39;s unique identifier. In UTXO-based protocols like BTC there are attributes such as &#x60;transactionId&#x60; and transaction &#x60;hash&#x60;. They still could be different. In protocols like Ethereum there is only one unique value and it&#39;s &#x60;hash&#x60;.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTransactionDetailsByTransactionIDTest() throws ApiException {
        String blockchain = null;
        String network = null;
        String transactionId = null;
        String context = null;
        GetTransactionDetailsByTransactionIDResponse response = api.getTransactionDetailsByTransactionID(blockchain, network, transactionId, context);

        // TODO: test validations
    }
    
    /**
     * List Transactions By Address
     *
     * This endpoint will list transactions by an attribute &#x60;address&#x60;. The transactions listed will detail additional information such as hash, height, time of creation in Unix timestamp, etc.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listTransactionsByAddressTest() throws ApiException {
        String blockchain = null;
        String network = null;
        String address = null;
        String context = null;
        Integer limit = null;
        Integer offset = null;
        ListTransactionsByAddressResponse response = api.listTransactionsByAddress(blockchain, network, address, context, limit, offset);

        // TODO: test validations
    }
    
    /**
     * List Transactions by Block Hash
     *
     * This endpoint will list transactions by an attribute &#x60;transactionHash&#x60;. The transactions listed will detail additional information such as addresses, height, time of creation in Unix timestamp, etc.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listTransactionsByBlockHashTest() throws ApiException {
        String blockchain = null;
        String network = null;
        String blockHash = null;
        String context = null;
        Integer limit = null;
        Integer offset = null;
        ListTransactionsByBlockHashResponse response = api.listTransactionsByBlockHash(blockchain, network, blockHash, context, limit, offset);

        // TODO: test validations
    }
    
    /**
     * List Transactions by Block Height
     *
     * This endpoint will list transactions by an attribute &#x60;blockHeight&#x60;. The transactions listed will detail additional information such as hash, addresses, time of creation in Unix timestamp, etc.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listTransactionsByBlockHeightTest() throws ApiException {
        String blockchain = null;
        String network = null;
        Integer height = null;
        String context = null;
        Integer limit = null;
        Integer offset = null;
        ListTransactionsByBlockHeightResponse response = api.listTransactionsByBlockHeight(blockchain, network, height, context, limit, offset);

        // TODO: test validations
    }
    
}