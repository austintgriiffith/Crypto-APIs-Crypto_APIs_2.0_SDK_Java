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
import org.openapitools.client.model.GetTransactionRequestDetails400Response;
import org.openapitools.client.model.GetTransactionRequestDetails401Response;
import org.openapitools.client.model.GetTransactionRequestDetails403Response;
import org.openapitools.client.model.GetTransactionRequestDetailsR;
import org.openapitools.client.model.GetWalletAssetDetails400Response;
import org.openapitools.client.model.GetWalletAssetDetails401Response;
import org.openapitools.client.model.GetWalletAssetDetails403Response;
import org.openapitools.client.model.GetWalletAssetDetailsR;
import org.openapitools.client.model.GetWalletTransactionDetailsByTransactionID400Response;
import org.openapitools.client.model.GetWalletTransactionDetailsByTransactionID401Response;
import org.openapitools.client.model.GetWalletTransactionDetailsByTransactionID403Response;
import org.openapitools.client.model.GetWalletTransactionDetailsByTransactionIDR;
import org.openapitools.client.model.GetXRPRippleTransactionDetailsByTransactionID404Response;
import org.openapitools.client.model.ListAllAssetsByWalletID400Response;
import org.openapitools.client.model.ListAllAssetsByWalletID401Response;
import org.openapitools.client.model.ListAllAssetsByWalletID403Response;
import org.openapitools.client.model.ListAllAssetsByWalletIDR;
import org.openapitools.client.model.ListAllAssetsFromAllWallets400Response;
import org.openapitools.client.model.ListAllAssetsFromAllWallets401Response;
import org.openapitools.client.model.ListAllAssetsFromAllWallets403Response;
import org.openapitools.client.model.ListAllAssetsFromAllWalletsR;
import org.openapitools.client.model.ListDepositAddresses400Response;
import org.openapitools.client.model.ListDepositAddresses401Response;
import org.openapitools.client.model.ListDepositAddresses403Response;
import org.openapitools.client.model.ListDepositAddressesR;
import org.openapitools.client.model.ListSupportedTokens400Response;
import org.openapitools.client.model.ListSupportedTokens401Response;
import org.openapitools.client.model.ListSupportedTokens403Response;
import org.openapitools.client.model.ListSupportedTokensR;
import org.openapitools.client.model.ListWalletTransactions400Response;
import org.openapitools.client.model.ListWalletTransactions401Response;
import org.openapitools.client.model.ListWalletTransactions403Response;
import org.openapitools.client.model.ListWalletTransactionsR;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for InformativeApi
 */
@Disabled
public class InformativeApiTest {

    private final InformativeApi api = new InformativeApi();

    /**
     * Get Transaction Request Details
     *
     * Through this endpoint customers can obtain details on transaction request.    {note}This regards **transaction requests**, which is not to be confused with **transactions**. Transaction requests may not be approved due to any reason, hence a transaction may not occur.{/note}
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getTransactionRequestDetailsTest() throws ApiException {
        String transactionRequestId = null;
        String context = null;
        GetTransactionRequestDetailsR response = api.getTransactionRequestDetails(transactionRequestId, context);
        // TODO: test validations
    }

    /**
     * Get Wallet Asset Details
     *
     * Through this endpoint customers can obtain details on all assets (coins, fungible tokens, non-fungible tokens) for the entire Wallet.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getWalletAssetDetailsTest() throws ApiException {
        String blockchain = null;
        String network = null;
        String walletId = null;
        String context = null;
        GetWalletAssetDetailsR response = api.getWalletAssetDetails(blockchain, network, walletId, context);
        // TODO: test validations
    }

    /**
     * Get Wallet Transaction Details By Transaction ID
     *
     * Through this endpoint users can obtain Wallet transaction information by providing a &#x60;transactionId&#x60;. Customers can receive information only for a transaction that has been made from their own wallet.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getWalletTransactionDetailsByTransactionIDTest() throws ApiException {
        String blockchain = null;
        String network = null;
        String transactionId = null;
        String context = null;
        GetWalletTransactionDetailsByTransactionIDR response = api.getWalletTransactionDetailsByTransactionID(blockchain, network, transactionId, context);
        // TODO: test validations
    }

    /**
     * List All Assets By Wallet ID
     *
     * Through this endpoint customers can obtain information about available assets in one of their wallets, regardless of the blockchain protocol or network, by providing walletId.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listAllAssetsByWalletIDTest() throws ApiException {
        String walletId = null;
        String context = null;
        ListAllAssetsByWalletIDR response = api.listAllAssetsByWalletID(walletId, context);
        // TODO: test validations
    }

    /**
     * List All Assets From All Wallets
     *
     * Through this endpoint customers can obtain information about available assets in all of their wallets, regardless of the blockchain protocol or network.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listAllAssetsFromAllWalletsTest() throws ApiException {
        String context = null;
        Integer limit = null;
        Integer offset = null;
        ListAllAssetsFromAllWalletsR response = api.listAllAssetsFromAllWallets(context, limit, offset);
        // TODO: test validations
    }

    /**
     * List Deposit Addresses
     *
     * Through this endpoint customers can pull a list of Deposit/Receiving Addresses they have already generated.    {note}Please note that listing data from the same type will apply pagination on the results.{/note}
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listDepositAddressesTest() throws ApiException {
        String blockchain = null;
        String network = null;
        String walletId = null;
        String context = null;
        ListDepositAddressesR response = api.listDepositAddresses(blockchain, network, walletId, context);
        // TODO: test validations
    }

    /**
     * List Supported Tokens
     *
     * Through this endpoint customers can obtain information on multiple tokens at once.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listSupportedTokensTest() throws ApiException {
        String blockchain = null;
        String network = null;
        String context = null;
        Integer limit = null;
        Integer offset = null;
        ListSupportedTokensR response = api.listSupportedTokens(blockchain, network, context, limit, offset);
        // TODO: test validations
    }

    /**
     * List Wallet Transactions
     *
     * Through this endpoint customers can list Transactions from and to their Wallet. The data returned will include &#x60;transactionId&#x60;, &#x60;direction&#x60; of the transaction - incoming or outgoing, &#x60;amount&#x60; and more.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listWalletTransactionsTest() throws ApiException {
        String blockchain = null;
        String network = null;
        String walletId = null;
        String context = null;
        Integer limit = null;
        Integer offset = null;
        ListWalletTransactionsR response = api.listWalletTransactions(blockchain, network, walletId, context, limit, offset);
        // TODO: test validations
    }

}
