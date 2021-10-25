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
import org.openapitools.client.model.BlockchainDataBlockNotFound;
import org.openapitools.client.model.BlockchainDataTransactionNotFound;
import org.openapitools.client.model.FeatureMainnetsNotAllowedForPlan;
import org.openapitools.client.model.GetAddressDetailsR;
import org.openapitools.client.model.GetBlockDetailsByBlockHashR;
import org.openapitools.client.model.GetBlockDetailsByBlockHeightR;
import org.openapitools.client.model.GetFeeRecommendationsR;
import org.openapitools.client.model.GetLastMinedBlockR;
import org.openapitools.client.model.GetTransactionDetailsByTransactionIDR;
import org.openapitools.client.model.InsufficientCredits;
import org.openapitools.client.model.InvalidApiKey;
import org.openapitools.client.model.InvalidData;
import org.openapitools.client.model.InvalidPagination;
import org.openapitools.client.model.InvalidRequestBodyStructure;
import org.openapitools.client.model.ListAllUnconfirmedTransactionsR;
import org.openapitools.client.model.ListConfirmedTransactionsByAddressR;
import org.openapitools.client.model.ListLatestMinedBlocksR;
import org.openapitools.client.model.ListTransactionsByBlockHashR;
import org.openapitools.client.model.ListTransactionsByBlockHeightR;
import org.openapitools.client.model.ListUnconfirmedTransactionsByAddressR;
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
        GetAddressDetailsR response = api.getAddressDetails(blockchain, network, address, context);

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
        GetBlockDetailsByBlockHashR response = api.getBlockDetailsByBlockHash(blockchain, network, blockHash, context);

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
        GetBlockDetailsByBlockHeightR response = api.getBlockDetailsByBlockHeight(blockchain, network, height, context);

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
        GetFeeRecommendationsR response = api.getFeeRecommendations(blockchain, network, context);

        // TODO: test validations
    }
    
    /**
     * Get Last Mined Block
     *
     * Through this endpoint customers can fetch the last mined block in a specific blockchain network, along with its details. These could include the hash of the specific, the previous and the next block, its transactions count, its height, etc.     Blockchain specific data is information such as version, nonce, size, bits, merkleroot, etc.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getLastMinedBlockTest() throws ApiException {
        String blockchain = null;
        String network = null;
        String context = null;
        GetLastMinedBlockR response = api.getLastMinedBlock(blockchain, network, context);

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
        GetTransactionDetailsByTransactionIDR response = api.getTransactionDetailsByTransactionID(blockchain, network, transactionId, context);

        // TODO: test validations
    }
    
    /**
     * List All Unconfirmed Transactions
     *
     * Through this endpoint customers can list all **unconfirmed**  transactions for a specified blockchain and network.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listAllUnconfirmedTransactionsTest() throws ApiException {
        String blockchain = null;
        String network = null;
        String context = null;
        Integer limit = null;
        Integer offset = null;
        ListAllUnconfirmedTransactionsR response = api.listAllUnconfirmedTransactions(blockchain, network, context, limit, offset);

        // TODO: test validations
    }
    
    /**
     * List Confirmed Transactions By Address
     *
     * This endpoint will list transactions by an attribute &#x60;address&#x60;. The transactions listed will detail additional information such as hash, height, time of creation in Unix timestamp, etc.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listConfirmedTransactionsByAddressTest() throws ApiException {
        String blockchain = null;
        String network = null;
        String address = null;
        String context = null;
        Integer limit = null;
        Integer offset = null;
        ListConfirmedTransactionsByAddressR response = api.listConfirmedTransactionsByAddress(blockchain, network, address, context, limit, offset);

        // TODO: test validations
    }
    
    /**
     * List Latest Mined Blocks
     *
     * Through this endpoint customers can list the latest 50 blocks that were mined.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listLatestMinedBlocksTest() throws ApiException {
        String network = null;
        String blockchain = null;
        Integer count = null;
        String context = null;
        ListLatestMinedBlocksR response = api.listLatestMinedBlocks(network, blockchain, count, context);

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
        ListTransactionsByBlockHashR response = api.listTransactionsByBlockHash(blockchain, network, blockHash, context, limit, offset);

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
        ListTransactionsByBlockHeightR response = api.listTransactionsByBlockHeight(blockchain, network, height, context, limit, offset);

        // TODO: test validations
    }
    
    /**
     * List Unconfirmed Transactions by Address
     *
     * Through this endpoint customers can list transactions by &#x60;address&#x60; that are **unconfirmed**.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listUnconfirmedTransactionsByAddressTest() throws ApiException {
        String blockchain = null;
        String network = null;
        String address = null;
        String context = null;
        Integer limit = null;
        Integer offset = null;
        ListUnconfirmedTransactionsByAddressR response = api.listUnconfirmedTransactionsByAddress(blockchain, network, address, context, limit, offset);

        // TODO: test validations
    }
    
}
