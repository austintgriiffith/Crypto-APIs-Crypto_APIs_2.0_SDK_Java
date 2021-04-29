# Crypto_APIs_2.0_SDK_Java

Crypto APIs
- API version: 2.0.0
  - Build date: 2021-04-21T16:59:17.199745Z[Etc/UTC]

Crypto APIs 2.0 is a complex and innovative infrastructure layer that radically simplifies the development of any Blockchain and Crypto related applications. Organized around REST, Crypto APIs 2.0 can assist both novice Bitcoin/Ethereum enthusiasts and crypto experts with the development of their blockchain applications. Crypto APIs 2.0 provides unified endpoints and data, raw data, automatic tokens and coins forwardings, callback functionalities, and much more.

  For more information, please visit [https://cryptoapis.io](https://cryptoapis.io)


## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>io.cryptoapis</groupId>
  <artifactId>sdk</artifactId>
  <version>1.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.cryptoapis:sdk:1.0.0"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/openapi-java-client-2.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AssetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.cryptoapis.io/v2");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    AssetsApi apiInstance = new AssetsApi(defaultClient);
    String context = "context_example"; // String | In batch situations the user can use the context to correlate responses with requests. This property is present regardless of whether the response was successful or returned as an error. `context` is specified by the user.
    String assetType = "crypto"; // String | Defines the type of the supported asset. This could be either \"crypto\" or \"fiat\".
    Integer limit = 50; // Integer | Defines how many items should be returned in the response per page basis.
    Integer offset = 0; // Integer | The starting index of the response items, i.e. where the response should start listing the returned items.
    try {
      ListAssetsDetailsResponse result = apiInstance.listAssetsDetails(context, assetType, limit, offset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AssetsApi#listAssetsDetails");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://rest.cryptoapis.io/v2*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AssetsApi* | [**listAssetsDetails**](docs/AssetsApi.md#listAssetsDetails) | **GET** /market-data/assets/details | List Assets Details
*AutomaticCoinsForwardingApi* | [**createAutomaticCoinsForwarding**](docs/AutomaticCoinsForwardingApi.md#createAutomaticCoinsForwarding) | **POST** /blockchain-automations/{blockchain}/{network}/coins-forwarding/automations | Create Automatic Coins Forwarding
*AutomaticCoinsForwardingApi* | [**deleteAutomaticCoinsForwarding**](docs/AutomaticCoinsForwardingApi.md#deleteAutomaticCoinsForwarding) | **DELETE** /blockchain-automations/{blockchain}/{network}/coins-forwarding/automations/{referenceId} | Delete Automatic Coins Forwarding
*AutomaticCoinsForwardingApi* | [**listCoinsForwardingAutomations**](docs/AutomaticCoinsForwardingApi.md#listCoinsForwardingAutomations) | **GET** /blockchain-automations/{blockchain}/{network}/coins-forwarding/automations | List Coins Forwarding Automations
*AutomaticTokensForwardingApi* | [**addTokensToExistingFromAddress**](docs/AutomaticTokensForwardingApi.md#addTokensToExistingFromAddress) | **POST** /blockchain-automations/{blockchain}/{network}/tokens-forwarding/automations/add-token | Add Tokens To Existing fromAddress
*AutomaticTokensForwardingApi* | [**createAutomaticTokensForwarding**](docs/AutomaticTokensForwardingApi.md#createAutomaticTokensForwarding) | **POST** /blockchain-automations/{blockchain}/{network}/tokens-forwarding/automations | Create Automatic Tokens Forwarding
*AutomaticTokensForwardingApi* | [**deleteAutomaticTokensForwarding**](docs/AutomaticTokensForwardingApi.md#deleteAutomaticTokensForwarding) | **DELETE** /blockchain-automations/{blockchain}/{network}/tokens-forwarding/automations/{referenceId} | Delete Automatic Tokens Forwarding
*AutomaticTokensForwardingApi* | [**getFeeAddressDetails**](docs/AutomaticTokensForwardingApi.md#getFeeAddressDetails) | **GET** /blockchain-automations/{blockchain}/{network}/tokens-forwarding/fee-addresses | Get Fee Address Details
*AutomaticTokensForwardingApi* | [**listTokensForwardingAutomations**](docs/AutomaticTokensForwardingApi.md#listTokensForwardingAutomations) | **GET** /blockchain-automations/{blockchain}/{network}/tokens-forwarding/automations | List Tokens Forwarding Automations
*CreateSubscriptionsForApi* | [**minedTransaction**](docs/CreateSubscriptionsForApi.md#minedTransaction) | **POST** /blockchain-events/{blockchain}/{network}/subscriptions/transaction-mined | Mined transaction
*CreateSubscriptionsForApi* | [**newBlock**](docs/CreateSubscriptionsForApi.md#newBlock) | **POST** /blockchain-events/{blockchain}/{network}/subscriptions/block-mined | New Block
*CreateSubscriptionsForApi* | [**newConfirmedCoinsTransactions**](docs/CreateSubscriptionsForApi.md#newConfirmedCoinsTransactions) | **POST** /blockchain-events/{blockchain}/{network}/subscriptions/address-coins-transactions-confirmed | New confirmed coins transactions
*CreateSubscriptionsForApi* | [**newConfirmedCoinsTransactionsAndEachConfirmation**](docs/CreateSubscriptionsForApi.md#newConfirmedCoinsTransactionsAndEachConfirmation) | **POST** /blockchain-events/{blockchain}/{network}/subscriptions/address-coins-transactions-confirmed-each-confirmation | New confirmed coins transactions and each confirmation
*CreateSubscriptionsForApi* | [**newConfirmedTokensTransactions**](docs/CreateSubscriptionsForApi.md#newConfirmedTokensTransactions) | **POST** /blockchain-events/{blockchain}/{network}/subscriptions/address-tokens-transactions-confirmed | New confirmed tokens transactions
*CreateSubscriptionsForApi* | [**newConfirmedTokensTransactionsAndEachConfirmation**](docs/CreateSubscriptionsForApi.md#newConfirmedTokensTransactionsAndEachConfirmation) | **POST** /blockchain-events/{blockchain}/{network}/subscriptions/address-tokens-transactions-confirmed-each-confirmation | New confirmed tokens transactions and each confirmation
*CreateSubscriptionsForApi* | [**newUnconfirmedCoinsTransactions**](docs/CreateSubscriptionsForApi.md#newUnconfirmedCoinsTransactions) | **POST** /blockchain-events/{blockchain}/{network}/subscriptions/address-coins-transactions-unconfirmed | New unconfirmed coins transactions
*CreateSubscriptionsForApi* | [**newUnconfirmedTokensTransactions**](docs/CreateSubscriptionsForApi.md#newUnconfirmedTokensTransactions) | **POST** /blockchain-events/{blockchain}/{network}/subscriptions/address-tokens-transactions-unconfirmed | New unconfirmed tokens transactions
*DefaultApi* | [**getContractDetailsByAddress**](docs/DefaultApi.md#getContractDetailsByAddress) | **GET** /blockchain-data/{blockchain}/{network}/addresses/{contractAddress}/contract | Get Contract Details by Address
*ExchangeRatesApi* | [**getExchangeRateByAssetSymbols**](docs/ExchangeRatesApi.md#getExchangeRateByAssetSymbols) | **GET** /market-data/exchange-rates/by-symbols/{fromAssetSymbol}/{toAssetSymbol} | Get Exchange Rate By Asset Symbols
*ExchangeRatesApi* | [**getExchangeRateByAssetsIDs**](docs/ExchangeRatesApi.md#getExchangeRateByAssetsIDs) | **GET** /market-data/exchange-rates/by-asset-ids/{fromAssetId}/{toAssetId} | Get Exchange Rate By Assets IDs
*ManageSubscriptionsApi* | [**deleteBlockchainEventSubscription**](docs/ManageSubscriptionsApi.md#deleteBlockchainEventSubscription) | **DELETE** /blockchain-events/{blockchain}/{network}/subscriptions/{referenceId} | Delete Blockchain Event Subscription
*ManageSubscriptionsApi* | [**listBlockchainEventsSubscriptions**](docs/ManageSubscriptionsApi.md#listBlockchainEventsSubscriptions) | **GET** /blockchain-events/{blockchain}/{network}/subscriptions | List Blockchain Events Subscriptions
*MetadataApi* | [**listSupportedAssets**](docs/MetadataApi.md#listSupportedAssets) | **GET** /market-data/assets/supported | List Supported Assets
*OmniLayerApi* | [**getOmniTransactionDetailsByTransactionIDTxid**](docs/OmniLayerApi.md#getOmniTransactionDetailsByTransactionIDTxid) | **GET** /blockchain-data/{blockchain}/{network}/omni/transactions/{transactionId} | Get Omni Transaction Details By Transaction ID (Txid)
*OmniLayerApi* | [**getUnconfirmedOmniTransactionByTransactionIDTxid**](docs/OmniLayerApi.md#getUnconfirmedOmniTransactionByTransactionIDTxid) | **GET** /blockchain-data/{blockchain}/{network}/omni/transactions-unconfirmed/{transactionId} | Get Unconfirmed Omni Transaction By Transaction ID (Txid)
*OmniLayerApi* | [**listOmniTokensByAddress**](docs/OmniLayerApi.md#listOmniTokensByAddress) | **GET** /blockchain-data/{blockchain}/{network}/omni/addresses/{address} | List Omni Tokens By Address
*OmniLayerApi* | [**listOmniTransactionsByAddress**](docs/OmniLayerApi.md#listOmniTransactionsByAddress) | **GET** /blockchain-data/{blockchain}/{network}/omni/addresses/{address}/transactions | List Omni Transactions By Address
*OmniLayerApi* | [**listOmniTransactionsByBlockHash**](docs/OmniLayerApi.md#listOmniTransactionsByBlockHash) | **GET** /blockchain-data/{blockchain}/{network}/omni/blocks/hash/{blockHash}/transactions | List Omni Transactions By Block Hash
*OmniLayerApi* | [**listOmniTransactionsByBlockHeight**](docs/OmniLayerApi.md#listOmniTransactionsByBlockHeight) | **GET** /blockchain-data/{blockchain}/{network}/omni/blocks/height/{blockHeight}/transactions | List Omni Transactions By Block Height
*OmniLayerApi* | [**listUnconfirmedOmniTransactionsByAddress**](docs/OmniLayerApi.md#listUnconfirmedOmniTransactionsByAddress) | **GET** /blockchain-data/{blockchain}/{network}/omni/address-transactions-unconfirmed/{address} | List Unconfirmed Omni Transactions By Address
*OmniLayerApi* | [**listUnconfirmedOmniTransactionsByPropertyID**](docs/OmniLayerApi.md#listUnconfirmedOmniTransactionsByPropertyID) | **GET** /blockchain-data/{blockchain}/{network}/omni/properties/{propertyId}/transactions | List Unconfirmed Omni Transactions By Property ID
*TokensApi* | [**listTokensByAddress**](docs/TokensApi.md#listTokensByAddress) | **GET** /blockchain-data/{blockchain}/{network}/addresses/{address}/tokens | List Tokens By Address
*TokensApi* | [**listTokensTransfersByAddress**](docs/TokensApi.md#listTokensTransfersByAddress) | **GET** /blockchain-data/{blockchain}/{network}/addresses/{address}/tokens-transfers | List Tokens Transfers By Address
*TokensApi* | [**listTokensTransfersByTransactionHash**](docs/TokensApi.md#listTokensTransfersByTransactionHash) | **GET** /blockchain-data/{blockchain}/{network}/transactions/{transactionHash}/tokens-transfers | List Tokens Transfers By Transaction Hash
*UnifiedEndpointsApi* | [**getAddressDetails**](docs/UnifiedEndpointsApi.md#getAddressDetails) | **GET** /blockchain-data/{blockchain}/{network}/addresses/{address} | Get Address Details
*UnifiedEndpointsApi* | [**getBlockDetailsByBlockHash**](docs/UnifiedEndpointsApi.md#getBlockDetailsByBlockHash) | **GET** /blockchain-data/{blockchain}/{network}/blocks/hash/{blockHash} | Get Block Details By Block Hash
*UnifiedEndpointsApi* | [**getBlockDetailsByBlockHeight**](docs/UnifiedEndpointsApi.md#getBlockDetailsByBlockHeight) | **GET** /blockchain-data/{blockchain}/{network}/blocks/height/{height} | Get Block Details By Block Height
*UnifiedEndpointsApi* | [**getFeeRecommendations**](docs/UnifiedEndpointsApi.md#getFeeRecommendations) | **GET** /blockchain-data/{blockchain}/{network}/mempool/fees | Get Fee Recommendations
*UnifiedEndpointsApi* | [**getLatestMinedBlock**](docs/UnifiedEndpointsApi.md#getLatestMinedBlock) | **GET** /blockchain-data/{blockchain}/{network}/blocks/last | Get Latest Mined Block
*UnifiedEndpointsApi* | [**getTransactionDetailsByTransactionID**](docs/UnifiedEndpointsApi.md#getTransactionDetailsByTransactionID) | **GET** /blockchain-data/{blockchain}/{network}/transactions/{transactionId} | Get Transaction Details By Transaction ID
*UnifiedEndpointsApi* | [**listTransactionsByAddress**](docs/UnifiedEndpointsApi.md#listTransactionsByAddress) | **GET** /blockchain-data/{blockchain}/{network}/addresses/{address}/transactions | List Transactions By Address
*UnifiedEndpointsApi* | [**listTransactionsByBlockHash**](docs/UnifiedEndpointsApi.md#listTransactionsByBlockHash) | **GET** /blockchain-data/{blockchain}/{network}/blocks/hash/{blockHash}/transactions | List Transactions by Block Hash
*UnifiedEndpointsApi* | [**listTransactionsByBlockHeight**](docs/UnifiedEndpointsApi.md#listTransactionsByBlockHeight) | **GET** /blockchain-data/{blockchain}/{network}/blocks/height/{height}/transactions | List Transactions by Block Height
*UtxoBasedApi* | [**getHDWalletXPubYPubZPubDetails**](docs/UtxoBasedApi.md#getHDWalletXPubYPubZPubDetails) | **GET** /blockchain-data/{blockchain}/{network}/hd/{extendedPublicKey}/details | Get HD Wallet (xPub, yPub, zPub) Details
*UtxoBasedApi* | [**listHDWalletXPubYPubZPubTransactions**](docs/UtxoBasedApi.md#listHDWalletXPubYPubZPubTransactions) | **GET** /blockchain-data/{blockchain}/{network}/hd/{extendedPublicKey}/transactions | List HD Wallet (xPub, yPub, zPub) Transactions
*UtxoBasedApi* | [**syncHDWalletXPubYPubZPub**](docs/UtxoBasedApi.md#syncHDWalletXPubYPubZPub) | **POST** /blockchain-data/{blockchain}/{network}/hd/sync | Sync HD Wallet (xPub, yPub, zPub)
*ValidatingApi* | [**validateAddress**](docs/ValidatingApi.md#validateAddress) | **POST** /blockchain-tools/{blockchain}/{network}/addresses/validate | Validate Address
*XrpRippleApi* | [**getLatestMinedXRPRippleBlock**](docs/XrpRippleApi.md#getLatestMinedXRPRippleBlock) | **GET** /blockchain-data/xrp/{network}/blocks/last | Get Latest Mined XRP (Ripple) Block
*XrpRippleApi* | [**getXRPRippleAddressDetails**](docs/XrpRippleApi.md#getXRPRippleAddressDetails) | **GET** /blockchain-data/xrp/{network}/addresses/{address} | Get XRP (Ripple) Address Details
*XrpRippleApi* | [**getXRPRippleBlockDetailsByBlockHash**](docs/XrpRippleApi.md#getXRPRippleBlockDetailsByBlockHash) | **GET** /blockchain-data/xrp/{network}/blocks/hash/{blockHash} | Get XRP (Ripple) Block Details By Block Hash
*XrpRippleApi* | [**getXRPRippleBlockDetailsByBlockHeight**](docs/XrpRippleApi.md#getXRPRippleBlockDetailsByBlockHeight) | **GET** /blockchain-data/xrp/{network}/blocks/height/{height} | Get XRP (Ripple) Block Details By Block Height
*XrpRippleApi* | [**getXRPRippleTransactionDetailsByTransactionID**](docs/XrpRippleApi.md#getXRPRippleTransactionDetailsByTransactionID) | **GET** /blockchain-data/xrp/{network}/transactions/{transactionHash} | Get XRP (Ripple) Transaction Details By Transaction ID
*XrpRippleApi* | [**listXRPRippleTransactionsByAddress**](docs/XrpRippleApi.md#listXRPRippleTransactionsByAddress) | **GET** /blockchain-data/xrp/{network}/addresses/{address}/transactions | List XRP (Ripple) Transactions by Address
*XrpRippleApi* | [**listXRPRippleTransactionsByBlockHash**](docs/XrpRippleApi.md#listXRPRippleTransactionsByBlockHash) | **GET** /blockchain-data/xrp/{network}/blocks/hash/{blockHash}/transactions | List XRP (Ripple) Transactions By Block Hash


## Documentation for Models

 - [AddTokensToExistingFromAddressRequestBody](docs/AddTokensToExistingFromAddressRequestBody.md)
 - [AddTokensToExistingFromAddressRequestBodyData](docs/AddTokensToExistingFromAddressRequestBodyData.md)
 - [AddTokensToExistingFromAddressRequestBodyDataItem](docs/AddTokensToExistingFromAddressRequestBodyDataItem.md)
 - [AddTokensToExistingFromAddressRequestBodyTokenData](docs/AddTokensToExistingFromAddressRequestBodyTokenData.md)
 - [AddTokensToExistingFromAddressRequestBodyTokenDataBitcoinOmniToken](docs/AddTokensToExistingFromAddressRequestBodyTokenDataBitcoinOmniToken.md)
 - [AddTokensToExistingFromAddressRequestBodyTokenDataEthereumErc20Token](docs/AddTokensToExistingFromAddressRequestBodyTokenDataEthereumErc20Token.md)
 - [AddTokensToExistingFromAddressResponse](docs/AddTokensToExistingFromAddressResponse.md)
 - [AddTokensToExistingFromAddressResponseData](docs/AddTokensToExistingFromAddressResponseData.md)
 - [AddTokensToExistingFromAddressResponseItem](docs/AddTokensToExistingFromAddressResponseItem.md)
 - [AddTokensToExistingFromAddressResponseItemTokenData](docs/AddTokensToExistingFromAddressResponseItemTokenData.md)
 - [AddTokensToExistingFromAddressResponseItemTokenDataBitcoinOmniToken](docs/AddTokensToExistingFromAddressResponseItemTokenDataBitcoinOmniToken.md)
 - [AddTokensToExistingFromAddressResponseItemTokenDataEthereumErc20Token](docs/AddTokensToExistingFromAddressResponseItemTokenDataEthereumErc20Token.md)
 - [AddressCoinsTransactionConfirmed](docs/AddressCoinsTransactionConfirmed.md)
 - [AddressCoinsTransactionConfirmedData](docs/AddressCoinsTransactionConfirmedData.md)
 - [AddressCoinsTransactionConfirmedDataItem](docs/AddressCoinsTransactionConfirmedDataItem.md)
 - [AddressCoinsTransactionConfirmedDataItemMinedInBlock](docs/AddressCoinsTransactionConfirmedDataItemMinedInBlock.md)
 - [AddressCoinsTransactionConfirmedEachConfirmation](docs/AddressCoinsTransactionConfirmedEachConfirmation.md)
 - [AddressCoinsTransactionConfirmedEachConfirmationData](docs/AddressCoinsTransactionConfirmedEachConfirmationData.md)
 - [AddressCoinsTransactionConfirmedEachConfirmationDataItem](docs/AddressCoinsTransactionConfirmedEachConfirmationDataItem.md)
 - [AddressCoinsTransactionConfirmedEachConfirmationDataItemMinedInBlock](docs/AddressCoinsTransactionConfirmedEachConfirmationDataItemMinedInBlock.md)
 - [AddressCoinsTransactionUnconfirmed](docs/AddressCoinsTransactionUnconfirmed.md)
 - [AddressCoinsTransactionUnconfirmedData](docs/AddressCoinsTransactionUnconfirmedData.md)
 - [AddressCoinsTransactionUnconfirmedDataItem](docs/AddressCoinsTransactionUnconfirmedDataItem.md)
 - [AddressTokensTransactionConfirmed](docs/AddressTokensTransactionConfirmed.md)
 - [AddressTokensTransactionConfirmedData](docs/AddressTokensTransactionConfirmedData.md)
 - [AddressTokensTransactionConfirmedDataItem](docs/AddressTokensTransactionConfirmedDataItem.md)
 - [AddressTokensTransactionConfirmedDataItemMinedInBlock](docs/AddressTokensTransactionConfirmedDataItemMinedInBlock.md)
 - [AddressTokensTransactionConfirmedEachConfirmation](docs/AddressTokensTransactionConfirmedEachConfirmation.md)
 - [AddressTokensTransactionConfirmedEachConfirmationData](docs/AddressTokensTransactionConfirmedEachConfirmationData.md)
 - [AddressTokensTransactionConfirmedEachConfirmationDataItem](docs/AddressTokensTransactionConfirmedEachConfirmationDataItem.md)
 - [AddressTokensTransactionConfirmedEachConfirmationDataItemMinedInBlock](docs/AddressTokensTransactionConfirmedEachConfirmationDataItemMinedInBlock.md)
 - [AddressTokensTransactionConfirmedEachConfirmationEthereumerc20token](docs/AddressTokensTransactionConfirmedEachConfirmationEthereumerc20token.md)
 - [AddressTokensTransactionConfirmedEachConfirmationEthereumerc721token](docs/AddressTokensTransactionConfirmedEachConfirmationEthereumerc721token.md)
 - [AddressTokensTransactionConfirmedEachConfirmationOmnilayertoken](docs/AddressTokensTransactionConfirmedEachConfirmationOmnilayertoken.md)
 - [AddressTokensTransactionConfirmedEachConfirmationToken](docs/AddressTokensTransactionConfirmedEachConfirmationToken.md)
 - [AddressTokensTransactionConfirmedEthereumerc20token](docs/AddressTokensTransactionConfirmedEthereumerc20token.md)
 - [AddressTokensTransactionConfirmedEthereumerc721token](docs/AddressTokensTransactionConfirmedEthereumerc721token.md)
 - [AddressTokensTransactionConfirmedOmnilayertoken](docs/AddressTokensTransactionConfirmedOmnilayertoken.md)
 - [AddressTokensTransactionConfirmedToken](docs/AddressTokensTransactionConfirmedToken.md)
 - [AddressTokensTransactionUnconfirmed](docs/AddressTokensTransactionUnconfirmed.md)
 - [AddressTokensTransactionUnconfirmedData](docs/AddressTokensTransactionUnconfirmedData.md)
 - [AddressTokensTransactionUnconfirmedDataItem](docs/AddressTokensTransactionUnconfirmedDataItem.md)
 - [AddressTokensTransactionUnconfirmedEthereumerc20token](docs/AddressTokensTransactionUnconfirmedEthereumerc20token.md)
 - [AddressTokensTransactionUnconfirmedEthereumerc721token](docs/AddressTokensTransactionUnconfirmedEthereumerc721token.md)
 - [AddressTokensTransactionUnconfirmedOmnilayertoken](docs/AddressTokensTransactionUnconfirmedOmnilayertoken.md)
 - [AddressTokensTransactionUnconfirmedToken](docs/AddressTokensTransactionUnconfirmedToken.md)
 - [AlreadyExists](docs/AlreadyExists.md)
 - [AlreadyExistsError](docs/AlreadyExistsError.md)
 - [BannedIpAddress](docs/BannedIpAddress.md)
 - [BannedIpAddressError](docs/BannedIpAddressError.md)
 - [BannedIpAddressErrorDetails](docs/BannedIpAddressErrorDetails.md)
 - [BlockMined](docs/BlockMined.md)
 - [BlockMinedData](docs/BlockMinedData.md)
 - [BlockMinedDataItem](docs/BlockMinedDataItem.md)
 - [BlockchainDataBlockNotFound](docs/BlockchainDataBlockNotFound.md)
 - [BlockchainDataBlockNotFoundError](docs/BlockchainDataBlockNotFoundError.md)
 - [BlockchainDataTransactionNotFound](docs/BlockchainDataTransactionNotFound.md)
 - [BlockchainDataTransactionNotFoundError](docs/BlockchainDataTransactionNotFoundError.md)
 - [BlockchainEventsCallbacksLimitReached](docs/BlockchainEventsCallbacksLimitReached.md)
 - [BlockchainEventsCallbacksLimitReachedError](docs/BlockchainEventsCallbacksLimitReachedError.md)
 - [CoinsForwardingAutomationsLimitReached](docs/CoinsForwardingAutomationsLimitReached.md)
 - [CoinsForwardingAutomationsLimitReachedError](docs/CoinsForwardingAutomationsLimitReachedError.md)
 - [CoinsForwardingFail](docs/CoinsForwardingFail.md)
 - [CoinsForwardingFailData](docs/CoinsForwardingFailData.md)
 - [CoinsForwardingFailDataItem](docs/CoinsForwardingFailDataItem.md)
 - [CoinsForwardingSuccess](docs/CoinsForwardingSuccess.md)
 - [CoinsForwardingSuccessData](docs/CoinsForwardingSuccessData.md)
 - [CoinsForwardingSuccessDataItem](docs/CoinsForwardingSuccessDataItem.md)
 - [CouldNotCalculateRateForPair](docs/CouldNotCalculateRateForPair.md)
 - [CouldNotCalculateRateForPairError](docs/CouldNotCalculateRateForPairError.md)
 - [CreateAutomaticCoinsForwardingRequestBody](docs/CreateAutomaticCoinsForwardingRequestBody.md)
 - [CreateAutomaticCoinsForwardingRequestBodyData](docs/CreateAutomaticCoinsForwardingRequestBodyData.md)
 - [CreateAutomaticCoinsForwardingRequestBodyDataItem](docs/CreateAutomaticCoinsForwardingRequestBodyDataItem.md)
 - [CreateAutomaticCoinsForwardingResponse](docs/CreateAutomaticCoinsForwardingResponse.md)
 - [CreateAutomaticCoinsForwardingResponseData](docs/CreateAutomaticCoinsForwardingResponseData.md)
 - [CreateAutomaticCoinsForwardingResponseItem](docs/CreateAutomaticCoinsForwardingResponseItem.md)
 - [CreateAutomaticTokensForwardingRequestBody](docs/CreateAutomaticTokensForwardingRequestBody.md)
 - [CreateAutomaticTokensForwardingRequestBodyData](docs/CreateAutomaticTokensForwardingRequestBodyData.md)
 - [CreateAutomaticTokensForwardingRequestBodyDataItem](docs/CreateAutomaticTokensForwardingRequestBodyDataItem.md)
 - [CreateAutomaticTokensForwardingRequestBodyTokenData](docs/CreateAutomaticTokensForwardingRequestBodyTokenData.md)
 - [CreateAutomaticTokensForwardingRequestBodyTokenDataBitcoinOmniToken](docs/CreateAutomaticTokensForwardingRequestBodyTokenDataBitcoinOmniToken.md)
 - [CreateAutomaticTokensForwardingRequestBodyTokenDataEthereumToken](docs/CreateAutomaticTokensForwardingRequestBodyTokenDataEthereumToken.md)
 - [CreateAutomaticTokensForwardingResponse](docs/CreateAutomaticTokensForwardingResponse.md)
 - [CreateAutomaticTokensForwardingResponseData](docs/CreateAutomaticTokensForwardingResponseData.md)
 - [CreateAutomaticTokensForwardingResponseItem](docs/CreateAutomaticTokensForwardingResponseItem.md)
 - [CreateAutomaticTokensForwardingResponseItemTokenData](docs/CreateAutomaticTokensForwardingResponseItemTokenData.md)
 - [CreateAutomaticTokensForwardingResponseItemTokenDataBitcoinOmniToken](docs/CreateAutomaticTokensForwardingResponseItemTokenDataBitcoinOmniToken.md)
 - [CreateAutomaticTokensForwardingResponseItemTokenDataEthereumToken](docs/CreateAutomaticTokensForwardingResponseItemTokenDataEthereumToken.md)
 - [DeleteAutomaticCoinsForwardingResponse](docs/DeleteAutomaticCoinsForwardingResponse.md)
 - [DeleteAutomaticCoinsForwardingResponseData](docs/DeleteAutomaticCoinsForwardingResponseData.md)
 - [DeleteAutomaticCoinsForwardingResponseItem](docs/DeleteAutomaticCoinsForwardingResponseItem.md)
 - [DeleteAutomaticTokensForwardingResponse](docs/DeleteAutomaticTokensForwardingResponse.md)
 - [DeleteAutomaticTokensForwardingResponseData](docs/DeleteAutomaticTokensForwardingResponseData.md)
 - [DeleteAutomaticTokensForwardingResponseItem](docs/DeleteAutomaticTokensForwardingResponseItem.md)
 - [DeleteAutomaticTokensForwardingResponseItemTokenData](docs/DeleteAutomaticTokensForwardingResponseItemTokenData.md)
 - [DeleteAutomaticTokensForwardingResponseItemTokenDataBitcoinOmniToken](docs/DeleteAutomaticTokensForwardingResponseItemTokenDataBitcoinOmniToken.md)
 - [DeleteAutomaticTokensForwardingResponseItemTokenDataEthereumToken](docs/DeleteAutomaticTokensForwardingResponseItemTokenDataEthereumToken.md)
 - [DeleteBlockchainEventSubscriptionResponse](docs/DeleteBlockchainEventSubscriptionResponse.md)
 - [DeleteBlockchainEventSubscriptionResponseData](docs/DeleteBlockchainEventSubscriptionResponseData.md)
 - [DeleteBlockchainEventSubscriptionResponseItem](docs/DeleteBlockchainEventSubscriptionResponseItem.md)
 - [EndpointNotAllowedForApiKey](docs/EndpointNotAllowedForApiKey.md)
 - [EndpointNotAllowedForApiKeyError](docs/EndpointNotAllowedForApiKeyError.md)
 - [EndpointNotAllowedForPlan](docs/EndpointNotAllowedForPlan.md)
 - [EndpointNotAllowedForPlanError](docs/EndpointNotAllowedForPlanError.md)
 - [FeatureMainnetsNotAllowedForPlan](docs/FeatureMainnetsNotAllowedForPlan.md)
 - [FeatureMainnetsNotAllowedForPlanError](docs/FeatureMainnetsNotAllowedForPlanError.md)
 - [GetAddressDetailsResponse](docs/GetAddressDetailsResponse.md)
 - [GetAddressDetailsResponseData](docs/GetAddressDetailsResponseData.md)
 - [GetAddressDetailsResponseItem](docs/GetAddressDetailsResponseItem.md)
 - [GetAddressDetailsResponseItemConfirmedBalance](docs/GetAddressDetailsResponseItemConfirmedBalance.md)
 - [GetAddressDetailsResponseItemTotalReceived](docs/GetAddressDetailsResponseItemTotalReceived.md)
 - [GetAddressDetailsResponseItemTotalSpent](docs/GetAddressDetailsResponseItemTotalSpent.md)
 - [GetBlockDetailsByBlockHashResponse](docs/GetBlockDetailsByBlockHashResponse.md)
 - [GetBlockDetailsByBlockHashResponseData](docs/GetBlockDetailsByBlockHashResponseData.md)
 - [GetBlockDetailsByBlockHashResponseItem](docs/GetBlockDetailsByBlockHashResponseItem.md)
 - [GetBlockDetailsByBlockHashResponseItemBlockchainSpecific](docs/GetBlockDetailsByBlockHashResponseItemBlockchainSpecific.md)
 - [GetBlockDetailsByBlockHashResponseItemBlockchainSpecificBitcoin](docs/GetBlockDetailsByBlockHashResponseItemBlockchainSpecificBitcoin.md)
 - [GetBlockDetailsByBlockHashResponseItemBlockchainSpecificBitcoinCash](docs/GetBlockDetailsByBlockHashResponseItemBlockchainSpecificBitcoinCash.md)
 - [GetBlockDetailsByBlockHashResponseItemBlockchainSpecificDash](docs/GetBlockDetailsByBlockHashResponseItemBlockchainSpecificDash.md)
 - [GetBlockDetailsByBlockHashResponseItemBlockchainSpecificDogecoin](docs/GetBlockDetailsByBlockHashResponseItemBlockchainSpecificDogecoin.md)
 - [GetBlockDetailsByBlockHashResponseItemBlockchainSpecificEthereum](docs/GetBlockDetailsByBlockHashResponseItemBlockchainSpecificEthereum.md)
 - [GetBlockDetailsByBlockHashResponseItemBlockchainSpecificEthereumClassic](docs/GetBlockDetailsByBlockHashResponseItemBlockchainSpecificEthereumClassic.md)
 - [GetBlockDetailsByBlockHashResponseItemBlockchainSpecificLitecoin](docs/GetBlockDetailsByBlockHashResponseItemBlockchainSpecificLitecoin.md)
 - [GetBlockDetailsByBlockHeightResponse](docs/GetBlockDetailsByBlockHeightResponse.md)
 - [GetBlockDetailsByBlockHeightResponseData](docs/GetBlockDetailsByBlockHeightResponseData.md)
 - [GetBlockDetailsByBlockHeightResponseItem](docs/GetBlockDetailsByBlockHeightResponseItem.md)
 - [GetBlockDetailsByBlockHeightResponseItemBlockchainSpecific](docs/GetBlockDetailsByBlockHeightResponseItemBlockchainSpecific.md)
 - [GetBlockDetailsByBlockHeightResponseItemBlockchainSpecificBitcoin](docs/GetBlockDetailsByBlockHeightResponseItemBlockchainSpecificBitcoin.md)
 - [GetBlockDetailsByBlockHeightResponseItemBlockchainSpecificBitcoinCash](docs/GetBlockDetailsByBlockHeightResponseItemBlockchainSpecificBitcoinCash.md)
 - [GetBlockDetailsByBlockHeightResponseItemBlockchainSpecificDash](docs/GetBlockDetailsByBlockHeightResponseItemBlockchainSpecificDash.md)
 - [GetBlockDetailsByBlockHeightResponseItemBlockchainSpecificDogecoin](docs/GetBlockDetailsByBlockHeightResponseItemBlockchainSpecificDogecoin.md)
 - [GetBlockDetailsByBlockHeightResponseItemBlockchainSpecificEthereum](docs/GetBlockDetailsByBlockHeightResponseItemBlockchainSpecificEthereum.md)
 - [GetBlockDetailsByBlockHeightResponseItemBlockchainSpecificEthereumClassic](docs/GetBlockDetailsByBlockHeightResponseItemBlockchainSpecificEthereumClassic.md)
 - [GetBlockDetailsByBlockHeightResponseItemBlockchainSpecificLitecoin](docs/GetBlockDetailsByBlockHeightResponseItemBlockchainSpecificLitecoin.md)
 - [GetContractDetailsByAddressResponse](docs/GetContractDetailsByAddressResponse.md)
 - [GetContractDetailsByAddressResponseData](docs/GetContractDetailsByAddressResponseData.md)
 - [GetContractDetailsByAddressResponseItem](docs/GetContractDetailsByAddressResponseItem.md)
 - [GetExchangeRateByAssetSymbolsResponse](docs/GetExchangeRateByAssetSymbolsResponse.md)
 - [GetExchangeRateByAssetSymbolsResponseData](docs/GetExchangeRateByAssetSymbolsResponseData.md)
 - [GetExchangeRateByAssetSymbolsResponseItem](docs/GetExchangeRateByAssetSymbolsResponseItem.md)
 - [GetExchangeRateByAssetsIDsResponse](docs/GetExchangeRateByAssetsIDsResponse.md)
 - [GetExchangeRateByAssetsIDsResponseData](docs/GetExchangeRateByAssetsIDsResponseData.md)
 - [GetExchangeRateByAssetsIDsResponseItem](docs/GetExchangeRateByAssetsIDsResponseItem.md)
 - [GetFeeAddressDetailsResponse](docs/GetFeeAddressDetailsResponse.md)
 - [GetFeeAddressDetailsResponseData](docs/GetFeeAddressDetailsResponseData.md)
 - [GetFeeAddressDetailsResponseItem](docs/GetFeeAddressDetailsResponseItem.md)
 - [GetFeeAddressDetailsResponseItemBalance](docs/GetFeeAddressDetailsResponseItemBalance.md)
 - [GetFeeRecommendationsResponse](docs/GetFeeRecommendationsResponse.md)
 - [GetFeeRecommendationsResponseData](docs/GetFeeRecommendationsResponseData.md)
 - [GetFeeRecommendationsResponseItem](docs/GetFeeRecommendationsResponseItem.md)
 - [GetHDWalletxPubYPubZPubDetailsResponse](docs/GetHDWalletxPubYPubZPubDetailsResponse.md)
 - [GetHDWalletxPubYPubZPubDetailsResponseData](docs/GetHDWalletxPubYPubZPubDetailsResponseData.md)
 - [GetHDWalletxPubYPubZPubDetailsResponseItem](docs/GetHDWalletxPubYPubZPubDetailsResponseItem.md)
 - [GetLatestMinedBlockResponse](docs/GetLatestMinedBlockResponse.md)
 - [GetLatestMinedBlockResponseData](docs/GetLatestMinedBlockResponseData.md)
 - [GetLatestMinedBlockResponseItem](docs/GetLatestMinedBlockResponseItem.md)
 - [GetLatestMinedBlockResponseItemBlockchainSpecific](docs/GetLatestMinedBlockResponseItemBlockchainSpecific.md)
 - [GetLatestMinedBlockResponseItemBlockchainSpecificBitcoin](docs/GetLatestMinedBlockResponseItemBlockchainSpecificBitcoin.md)
 - [GetLatestMinedBlockResponseItemBlockchainSpecificBitcoinCash](docs/GetLatestMinedBlockResponseItemBlockchainSpecificBitcoinCash.md)
 - [GetLatestMinedBlockResponseItemBlockchainSpecificDash](docs/GetLatestMinedBlockResponseItemBlockchainSpecificDash.md)
 - [GetLatestMinedBlockResponseItemBlockchainSpecificDogecoin](docs/GetLatestMinedBlockResponseItemBlockchainSpecificDogecoin.md)
 - [GetLatestMinedBlockResponseItemBlockchainSpecificEthereum](docs/GetLatestMinedBlockResponseItemBlockchainSpecificEthereum.md)
 - [GetLatestMinedBlockResponseItemBlockchainSpecificEthereumClassic](docs/GetLatestMinedBlockResponseItemBlockchainSpecificEthereumClassic.md)
 - [GetLatestMinedBlockResponseItemBlockchainSpecificLitecoin](docs/GetLatestMinedBlockResponseItemBlockchainSpecificLitecoin.md)
 - [GetLatestMinedXRPRippleBlockResponse](docs/GetLatestMinedXRPRippleBlockResponse.md)
 - [GetLatestMinedXRPRippleBlockResponseData](docs/GetLatestMinedXRPRippleBlockResponseData.md)
 - [GetLatestMinedXRPRippleBlockResponseItem](docs/GetLatestMinedXRPRippleBlockResponseItem.md)
 - [GetLatestMinedXRPRippleBlockResponseItemTotalCoins](docs/GetLatestMinedXRPRippleBlockResponseItemTotalCoins.md)
 - [GetLatestMinedXRPRippleBlockResponseItemTotalFees](docs/GetLatestMinedXRPRippleBlockResponseItemTotalFees.md)
 - [GetOmniTransactionDetailsByTransactionIDTxidResponse](docs/GetOmniTransactionDetailsByTransactionIDTxidResponse.md)
 - [GetOmniTransactionDetailsByTransactionIDTxidResponseData](docs/GetOmniTransactionDetailsByTransactionIDTxidResponseData.md)
 - [GetOmniTransactionDetailsByTransactionIDTxidResponseItem](docs/GetOmniTransactionDetailsByTransactionIDTxidResponseItem.md)
 - [GetOmniTransactionDetailsByTransactionIDTxidResponseItemSenders](docs/GetOmniTransactionDetailsByTransactionIDTxidResponseItemSenders.md)
 - [GetTransactionDetailsByTransactionIDResponse](docs/GetTransactionDetailsByTransactionIDResponse.md)
 - [GetTransactionDetailsByTransactionIDResponseData](docs/GetTransactionDetailsByTransactionIDResponseData.md)
 - [GetTransactionDetailsByTransactionIDResponseItem](docs/GetTransactionDetailsByTransactionIDResponseItem.md)
 - [GetTransactionDetailsByTransactionIDResponseItemBlockchainSpecific](docs/GetTransactionDetailsByTransactionIDResponseItemBlockchainSpecific.md)
 - [GetTransactionDetailsByTransactionIDResponseItemBlockchainSpecificBitcoin](docs/GetTransactionDetailsByTransactionIDResponseItemBlockchainSpecificBitcoin.md)
 - [GetTransactionDetailsByTransactionIDResponseItemBlockchainSpecificBitcoinCash](docs/GetTransactionDetailsByTransactionIDResponseItemBlockchainSpecificBitcoinCash.md)
 - [GetTransactionDetailsByTransactionIDResponseItemBlockchainSpecificBitcoinCashScriptPubKey](docs/GetTransactionDetailsByTransactionIDResponseItemBlockchainSpecificBitcoinCashScriptPubKey.md)
 - [GetTransactionDetailsByTransactionIDResponseItemBlockchainSpecificBitcoinCashVin](docs/GetTransactionDetailsByTransactionIDResponseItemBlockchainSpecificBitcoinCashVin.md)
 - [GetTransactionDetailsByTransactionIDResponseItemBlockchainSpecificBitcoinCashVout](docs/GetTransactionDetailsByTransactionIDResponseItemBlockchainSpecificBitcoinCashVout.md)
 - [GetTransactionDetailsByTransactionIDResponseItemBlockchainSpecificBitcoinScriptPubKey](docs/GetTransactionDetailsByTransactionIDResponseItemBlockchainSpecificBitcoinScriptPubKey.md)
 - [GetTransactionDetailsByTransactionIDResponseItemBlockchainSpecificBitcoinScriptSig](docs/GetTransactionDetailsByTransactionIDResponseItemBlockchainSpecificBitcoinScriptSig.md)
 - [GetTransactionDetailsByTransactionIDResponseItemBlockchainSpecificBitcoinVin](docs/GetTransactionDetailsByTransactionIDResponseItemBlockchainSpecificBitcoinVin.md)
 - [GetTransactionDetailsByTransactionIDResponseItemBlockchainSpecificBitcoinVout](docs/GetTransactionDetailsByTransactionIDResponseItemBlockchainSpecificBitcoinVout.md)
 - [GetTransactionDetailsByTransactionIDResponseItemBlockchainSpecificDash](docs/GetTransactionDetailsByTransactionIDResponseItemBlockchainSpecificDash.md)
 - [GetTransactionDetailsByTransactionIDResponseItemBlockchainSpecificDashScriptPubKey](docs/GetTransactionDetailsByTransactionIDResponseItemBlockchainSpecificDashScriptPubKey.md)
 - [GetTransactionDetailsByTransactionIDResponseItemBlockchainSpecificDashScriptSig](docs/GetTransactionDetailsByTransactionIDResponseItemBlockchainSpecificDashScriptSig.md)
 - [GetTransactionDetailsByTransactionIDResponseItemBlockchainSpecificDashVin](docs/GetTransactionDetailsByTransactionIDResponseItemBlockchainSpecificDashVin.md)
 - [GetTransactionDetailsByTransactionIDResponseItemBlockchainSpecificDashVout](docs/GetTransactionDetailsByTransactionIDResponseItemBlockchainSpecificDashVout.md)
 - [GetTransactionDetailsByTransactionIDResponseItemBlockchainSpecificDogecoin](docs/GetTransactionDetailsByTransactionIDResponseItemBlockchainSpecificDogecoin.md)
 - [GetTransactionDetailsByTransactionIDResponseItemBlockchainSpecificDogecoinScriptPubKey](docs/GetTransactionDetailsByTransactionIDResponseItemBlockchainSpecificDogecoinScriptPubKey.md)
 - [GetTransactionDetailsByTransactionIDResponseItemBlockchainSpecificDogecoinScriptSig](docs/GetTransactionDetailsByTransactionIDResponseItemBlockchainSpecificDogecoinScriptSig.md)
 - [GetTransactionDetailsByTransactionIDResponseItemBlockchainSpecificDogecoinVin](docs/GetTransactionDetailsByTransactionIDResponseItemBlockchainSpecificDogecoinVin.md)
 - [GetTransactionDetailsByTransactionIDResponseItemBlockchainSpecificDogecoinVout](docs/GetTransactionDetailsByTransactionIDResponseItemBlockchainSpecificDogecoinVout.md)
 - [GetTransactionDetailsByTransactionIDResponseItemBlockchainSpecificEthereum](docs/GetTransactionDetailsByTransactionIDResponseItemBlockchainSpecificEthereum.md)
 - [GetTransactionDetailsByTransactionIDResponseItemBlockchainSpecificEthereumClassic](docs/GetTransactionDetailsByTransactionIDResponseItemBlockchainSpecificEthereumClassic.md)
 - [GetTransactionDetailsByTransactionIDResponseItemBlockchainSpecificEthereumClassicGasPrice](docs/GetTransactionDetailsByTransactionIDResponseItemBlockchainSpecificEthereumClassicGasPrice.md)
 - [GetTransactionDetailsByTransactionIDResponseItemBlockchainSpecificEthereumGasPrice](docs/GetTransactionDetailsByTransactionIDResponseItemBlockchainSpecificEthereumGasPrice.md)
 - [GetTransactionDetailsByTransactionIDResponseItemBlockchainSpecificLitecoin](docs/GetTransactionDetailsByTransactionIDResponseItemBlockchainSpecificLitecoin.md)
 - [GetTransactionDetailsByTransactionIDResponseItemBlockchainSpecificLitecoinScriptPubKey](docs/GetTransactionDetailsByTransactionIDResponseItemBlockchainSpecificLitecoinScriptPubKey.md)
 - [GetTransactionDetailsByTransactionIDResponseItemBlockchainSpecificLitecoinScriptSig](docs/GetTransactionDetailsByTransactionIDResponseItemBlockchainSpecificLitecoinScriptSig.md)
 - [GetTransactionDetailsByTransactionIDResponseItemBlockchainSpecificLitecoinVin](docs/GetTransactionDetailsByTransactionIDResponseItemBlockchainSpecificLitecoinVin.md)
 - [GetTransactionDetailsByTransactionIDResponseItemBlockchainSpecificLitecoinVout](docs/GetTransactionDetailsByTransactionIDResponseItemBlockchainSpecificLitecoinVout.md)
 - [GetTransactionDetailsByTransactionIDResponseItemFee](docs/GetTransactionDetailsByTransactionIDResponseItemFee.md)
 - [GetTransactionDetailsByTransactionIDResponseItemRecipients](docs/GetTransactionDetailsByTransactionIDResponseItemRecipients.md)
 - [GetTransactionDetailsByTransactionIDResponseItemSenders](docs/GetTransactionDetailsByTransactionIDResponseItemSenders.md)
 - [GetUnconfirmedOmniTransactionByTransactionIDTxidResponse](docs/GetUnconfirmedOmniTransactionByTransactionIDTxidResponse.md)
 - [GetUnconfirmedOmniTransactionByTransactionIDTxidResponseData](docs/GetUnconfirmedOmniTransactionByTransactionIDTxidResponseData.md)
 - [GetUnconfirmedOmniTransactionByTransactionIDTxidResponseItem](docs/GetUnconfirmedOmniTransactionByTransactionIDTxidResponseItem.md)
 - [GetUnconfirmedOmniTransactionByTransactionIDTxidResponseItemRecipients](docs/GetUnconfirmedOmniTransactionByTransactionIDTxidResponseItemRecipients.md)
 - [GetUnconfirmedOmniTransactionByTransactionIDTxidResponseItemSenders](docs/GetUnconfirmedOmniTransactionByTransactionIDTxidResponseItemSenders.md)
 - [GetXRPRippleAddressDetailsResponse](docs/GetXRPRippleAddressDetailsResponse.md)
 - [GetXRPRippleAddressDetailsResponseData](docs/GetXRPRippleAddressDetailsResponseData.md)
 - [GetXRPRippleAddressDetailsResponseItem](docs/GetXRPRippleAddressDetailsResponseItem.md)
 - [GetXRPRippleAddressDetailsResponseItemBalance](docs/GetXRPRippleAddressDetailsResponseItemBalance.md)
 - [GetXRPRippleBlockDetailsByBlockHashResponse](docs/GetXRPRippleBlockDetailsByBlockHashResponse.md)
 - [GetXRPRippleBlockDetailsByBlockHashResponseData](docs/GetXRPRippleBlockDetailsByBlockHashResponseData.md)
 - [GetXRPRippleBlockDetailsByBlockHashResponseItem](docs/GetXRPRippleBlockDetailsByBlockHashResponseItem.md)
 - [GetXRPRippleBlockDetailsByBlockHashResponseItemTotalCoins](docs/GetXRPRippleBlockDetailsByBlockHashResponseItemTotalCoins.md)
 - [GetXRPRippleBlockDetailsByBlockHeightResponse](docs/GetXRPRippleBlockDetailsByBlockHeightResponse.md)
 - [GetXRPRippleBlockDetailsByBlockHeightResponseData](docs/GetXRPRippleBlockDetailsByBlockHeightResponseData.md)
 - [GetXRPRippleBlockDetailsByBlockHeightResponseItem](docs/GetXRPRippleBlockDetailsByBlockHeightResponseItem.md)
 - [GetXRPRippleBlockDetailsByBlockHeightResponseItemTotalCoins](docs/GetXRPRippleBlockDetailsByBlockHeightResponseItemTotalCoins.md)
 - [GetXRPRippleBlockDetailsByBlockHeightResponseItemTotalFees](docs/GetXRPRippleBlockDetailsByBlockHeightResponseItemTotalFees.md)
 - [GetXRPRippleTransactionDetailsByTransactionIDResponse](docs/GetXRPRippleTransactionDetailsByTransactionIDResponse.md)
 - [GetXRPRippleTransactionDetailsByTransactionIDResponseData](docs/GetXRPRippleTransactionDetailsByTransactionIDResponseData.md)
 - [GetXRPRippleTransactionDetailsByTransactionIDResponseItem](docs/GetXRPRippleTransactionDetailsByTransactionIDResponseItem.md)
 - [GetXRPRippleTransactionDetailsByTransactionIDResponseItemFee](docs/GetXRPRippleTransactionDetailsByTransactionIDResponseItemFee.md)
 - [GetXRPRippleTransactionDetailsByTransactionIDResponseItemOffer](docs/GetXRPRippleTransactionDetailsByTransactionIDResponseItemOffer.md)
 - [GetXRPRippleTransactionDetailsByTransactionIDResponseItemReceive](docs/GetXRPRippleTransactionDetailsByTransactionIDResponseItemReceive.md)
 - [GetXRPRippleTransactionDetailsByTransactionIDResponseItemRecipients](docs/GetXRPRippleTransactionDetailsByTransactionIDResponseItemRecipients.md)
 - [GetXRPRippleTransactionDetailsByTransactionIDResponseItemSenders](docs/GetXRPRippleTransactionDetailsByTransactionIDResponseItemSenders.md)
 - [GetXRPRippleTransactionDetailsByTransactionIDResponseItemValue](docs/GetXRPRippleTransactionDetailsByTransactionIDResponseItemValue.md)
 - [InsufficientCredits](docs/InsufficientCredits.md)
 - [InsufficientCreditsError](docs/InsufficientCreditsError.md)
 - [InvalidApiKey](docs/InvalidApiKey.md)
 - [InvalidApiKeyError](docs/InvalidApiKeyError.md)
 - [InvalidBlockchain](docs/InvalidBlockchain.md)
 - [InvalidBlockchainError](docs/InvalidBlockchainError.md)
 - [InvalidData](docs/InvalidData.md)
 - [InvalidDataError](docs/InvalidDataError.md)
 - [InvalidNetwork](docs/InvalidNetwork.md)
 - [InvalidNetworkError](docs/InvalidNetworkError.md)
 - [InvalidPagination](docs/InvalidPagination.md)
 - [InvalidPaginationError](docs/InvalidPaginationError.md)
 - [InvalidRequestBodyStructure](docs/InvalidRequestBodyStructure.md)
 - [InvalidRequestBodyStructureError](docs/InvalidRequestBodyStructureError.md)
 - [InvalidXpub](docs/InvalidXpub.md)
 - [InvalidXpubError](docs/InvalidXpubError.md)
 - [LimitGreaterThanAllowed](docs/LimitGreaterThanAllowed.md)
 - [LimitGreaterThanAllowedError](docs/LimitGreaterThanAllowedError.md)
 - [ListAssetsDetailsResponse](docs/ListAssetsDetailsResponse.md)
 - [ListAssetsDetailsResponseData](docs/ListAssetsDetailsResponseData.md)
 - [ListAssetsDetailsResponseItem](docs/ListAssetsDetailsResponseItem.md)
 - [ListAssetsDetailsResponseItemAssetLogo](docs/ListAssetsDetailsResponseItemAssetLogo.md)
 - [ListAssetsDetailsResponseItemLatestRate](docs/ListAssetsDetailsResponseItemLatestRate.md)
 - [ListAssetsDetailsResponseItemSpecificData](docs/ListAssetsDetailsResponseItemSpecificData.md)
 - [ListAssetsDetailsResponseItemSpecificDataCryptoTypeData](docs/ListAssetsDetailsResponseItemSpecificDataCryptoTypeData.md)
 - [ListBlockchainEventsSubscriptionsResponse](docs/ListBlockchainEventsSubscriptionsResponse.md)
 - [ListBlockchainEventsSubscriptionsResponseData](docs/ListBlockchainEventsSubscriptionsResponseData.md)
 - [ListBlockchainEventsSubscriptionsResponseItem](docs/ListBlockchainEventsSubscriptionsResponseItem.md)
 - [ListCoinsForwardingAutomationsResponse](docs/ListCoinsForwardingAutomationsResponse.md)
 - [ListCoinsForwardingAutomationsResponseData](docs/ListCoinsForwardingAutomationsResponseData.md)
 - [ListCoinsForwardingAutomationsResponseItem](docs/ListCoinsForwardingAutomationsResponseItem.md)
 - [ListHDWalletxPubYPubZPubTransactionsResponse](docs/ListHDWalletxPubYPubZPubTransactionsResponse.md)
 - [ListHDWalletxPubYPubZPubTransactionsResponseData](docs/ListHDWalletxPubYPubZPubTransactionsResponseData.md)
 - [ListHDWalletxPubYPubZPubTransactionsResponseItem](docs/ListHDWalletxPubYPubZPubTransactionsResponseItem.md)
 - [ListHDWalletxPubYPubZPubTransactionsResponseItemFee](docs/ListHDWalletxPubYPubZPubTransactionsResponseItemFee.md)
 - [ListHDWalletxPubYPubZPubTransactionsResponseItemRecipients](docs/ListHDWalletxPubYPubZPubTransactionsResponseItemRecipients.md)
 - [ListHDWalletxPubYPubZPubTransactionsResponseItemSenders](docs/ListHDWalletxPubYPubZPubTransactionsResponseItemSenders.md)
 - [ListOmniTokensByAddressResponse](docs/ListOmniTokensByAddressResponse.md)
 - [ListOmniTokensByAddressResponseData](docs/ListOmniTokensByAddressResponseData.md)
 - [ListOmniTokensByAddressResponseItem](docs/ListOmniTokensByAddressResponseItem.md)
 - [ListOmniTransactionsByAddressResponse](docs/ListOmniTransactionsByAddressResponse.md)
 - [ListOmniTransactionsByAddressResponseData](docs/ListOmniTransactionsByAddressResponseData.md)
 - [ListOmniTransactionsByAddressResponseItem](docs/ListOmniTransactionsByAddressResponseItem.md)
 - [ListOmniTransactionsByAddressResponseItemFee](docs/ListOmniTransactionsByAddressResponseItemFee.md)
 - [ListOmniTransactionsByAddressResponseItemRecipients](docs/ListOmniTransactionsByAddressResponseItemRecipients.md)
 - [ListOmniTransactionsByAddressResponseItemSenders](docs/ListOmniTransactionsByAddressResponseItemSenders.md)
 - [ListOmniTransactionsByBlockHashResponse](docs/ListOmniTransactionsByBlockHashResponse.md)
 - [ListOmniTransactionsByBlockHashResponseData](docs/ListOmniTransactionsByBlockHashResponseData.md)
 - [ListOmniTransactionsByBlockHashResponseItem](docs/ListOmniTransactionsByBlockHashResponseItem.md)
 - [ListOmniTransactionsByBlockHashResponseItemFee](docs/ListOmniTransactionsByBlockHashResponseItemFee.md)
 - [ListOmniTransactionsByBlockHeightResponse](docs/ListOmniTransactionsByBlockHeightResponse.md)
 - [ListOmniTransactionsByBlockHeightResponseData](docs/ListOmniTransactionsByBlockHeightResponseData.md)
 - [ListOmniTransactionsByBlockHeightResponseItem](docs/ListOmniTransactionsByBlockHeightResponseItem.md)
 - [ListOmniTransactionsByBlockHeightResponseItemFee](docs/ListOmniTransactionsByBlockHeightResponseItemFee.md)
 - [ListOmniTransactionsByBlockHeightResponseItemRecipients](docs/ListOmniTransactionsByBlockHeightResponseItemRecipients.md)
 - [ListOmniTransactionsByBlockHeightResponseItemSenders](docs/ListOmniTransactionsByBlockHeightResponseItemSenders.md)
 - [ListSupportedAssetsResponse](docs/ListSupportedAssetsResponse.md)
 - [ListSupportedAssetsResponseData](docs/ListSupportedAssetsResponseData.md)
 - [ListSupportedAssetsResponseItem](docs/ListSupportedAssetsResponseItem.md)
 - [ListTokensByAddressResponse](docs/ListTokensByAddressResponse.md)
 - [ListTokensByAddressResponseData](docs/ListTokensByAddressResponseData.md)
 - [ListTokensByAddressResponseItem](docs/ListTokensByAddressResponseItem.md)
 - [ListTokensForwardingAutomationsResponse](docs/ListTokensForwardingAutomationsResponse.md)
 - [ListTokensForwardingAutomationsResponseData](docs/ListTokensForwardingAutomationsResponseData.md)
 - [ListTokensForwardingAutomationsResponseItem](docs/ListTokensForwardingAutomationsResponseItem.md)
 - [ListTokensForwardingAutomationsResponseItemTokenData](docs/ListTokensForwardingAutomationsResponseItemTokenData.md)
 - [ListTokensForwardingAutomationsResponseItemTokenDataBitcoinOmniToken](docs/ListTokensForwardingAutomationsResponseItemTokenDataBitcoinOmniToken.md)
 - [ListTokensForwardingAutomationsResponseItemTokenDataEthereumToken](docs/ListTokensForwardingAutomationsResponseItemTokenDataEthereumToken.md)
 - [ListTokensTransfersByAddressResponse](docs/ListTokensTransfersByAddressResponse.md)
 - [ListTokensTransfersByAddressResponseData](docs/ListTokensTransfersByAddressResponseData.md)
 - [ListTokensTransfersByAddressResponseItem](docs/ListTokensTransfersByAddressResponseItem.md)
 - [ListTokensTransfersByTransactionHashResponse](docs/ListTokensTransfersByTransactionHashResponse.md)
 - [ListTokensTransfersByTransactionHashResponseData](docs/ListTokensTransfersByTransactionHashResponseData.md)
 - [ListTokensTransfersByTransactionHashResponseItem](docs/ListTokensTransfersByTransactionHashResponseItem.md)
 - [ListTransactionsByAddressResponse](docs/ListTransactionsByAddressResponse.md)
 - [ListTransactionsByAddressResponseData](docs/ListTransactionsByAddressResponseData.md)
 - [ListTransactionsByAddressResponseItem](docs/ListTransactionsByAddressResponseItem.md)
 - [ListTransactionsByAddressResponseItemBlockchainSpecific](docs/ListTransactionsByAddressResponseItemBlockchainSpecific.md)
 - [ListTransactionsByAddressResponseItemBlockchainSpecificBitcoin](docs/ListTransactionsByAddressResponseItemBlockchainSpecificBitcoin.md)
 - [ListTransactionsByAddressResponseItemBlockchainSpecificBitcoinCash](docs/ListTransactionsByAddressResponseItemBlockchainSpecificBitcoinCash.md)
 - [ListTransactionsByAddressResponseItemBlockchainSpecificBitcoinCashVin](docs/ListTransactionsByAddressResponseItemBlockchainSpecificBitcoinCashVin.md)
 - [ListTransactionsByAddressResponseItemBlockchainSpecificBitcoinScriptPubKey](docs/ListTransactionsByAddressResponseItemBlockchainSpecificBitcoinScriptPubKey.md)
 - [ListTransactionsByAddressResponseItemBlockchainSpecificBitcoinVin](docs/ListTransactionsByAddressResponseItemBlockchainSpecificBitcoinVin.md)
 - [ListTransactionsByAddressResponseItemBlockchainSpecificBitcoinVout](docs/ListTransactionsByAddressResponseItemBlockchainSpecificBitcoinVout.md)
 - [ListTransactionsByAddressResponseItemBlockchainSpecificDash](docs/ListTransactionsByAddressResponseItemBlockchainSpecificDash.md)
 - [ListTransactionsByAddressResponseItemBlockchainSpecificDashScriptPubKey](docs/ListTransactionsByAddressResponseItemBlockchainSpecificDashScriptPubKey.md)
 - [ListTransactionsByAddressResponseItemBlockchainSpecificDashScriptSig](docs/ListTransactionsByAddressResponseItemBlockchainSpecificDashScriptSig.md)
 - [ListTransactionsByAddressResponseItemBlockchainSpecificDashVin](docs/ListTransactionsByAddressResponseItemBlockchainSpecificDashVin.md)
 - [ListTransactionsByAddressResponseItemBlockchainSpecificDashVout](docs/ListTransactionsByAddressResponseItemBlockchainSpecificDashVout.md)
 - [ListTransactionsByAddressResponseItemBlockchainSpecificDogecoin](docs/ListTransactionsByAddressResponseItemBlockchainSpecificDogecoin.md)
 - [ListTransactionsByAddressResponseItemBlockchainSpecificDogecoinScriptSig](docs/ListTransactionsByAddressResponseItemBlockchainSpecificDogecoinScriptSig.md)
 - [ListTransactionsByAddressResponseItemBlockchainSpecificDogecoinVin](docs/ListTransactionsByAddressResponseItemBlockchainSpecificDogecoinVin.md)
 - [ListTransactionsByAddressResponseItemBlockchainSpecificEthereum](docs/ListTransactionsByAddressResponseItemBlockchainSpecificEthereum.md)
 - [ListTransactionsByAddressResponseItemBlockchainSpecificEthereumClassic](docs/ListTransactionsByAddressResponseItemBlockchainSpecificEthereumClassic.md)
 - [ListTransactionsByAddressResponseItemBlockchainSpecificEthereumClassicGasPrice](docs/ListTransactionsByAddressResponseItemBlockchainSpecificEthereumClassicGasPrice.md)
 - [ListTransactionsByAddressResponseItemBlockchainSpecificEthereumGasPrice](docs/ListTransactionsByAddressResponseItemBlockchainSpecificEthereumGasPrice.md)
 - [ListTransactionsByAddressResponseItemBlockchainSpecificLitecoin](docs/ListTransactionsByAddressResponseItemBlockchainSpecificLitecoin.md)
 - [ListTransactionsByAddressResponseItemBlockchainSpecificLitecoinScriptSig](docs/ListTransactionsByAddressResponseItemBlockchainSpecificLitecoinScriptSig.md)
 - [ListTransactionsByAddressResponseItemBlockchainSpecificLitecoinVin](docs/ListTransactionsByAddressResponseItemBlockchainSpecificLitecoinVin.md)
 - [ListTransactionsByBlockHashResponse](docs/ListTransactionsByBlockHashResponse.md)
 - [ListTransactionsByBlockHashResponseData](docs/ListTransactionsByBlockHashResponseData.md)
 - [ListTransactionsByBlockHashResponseItem](docs/ListTransactionsByBlockHashResponseItem.md)
 - [ListTransactionsByBlockHashResponseItemBlockchainSpecific](docs/ListTransactionsByBlockHashResponseItemBlockchainSpecific.md)
 - [ListTransactionsByBlockHashResponseItemBlockchainSpecificBitcoin](docs/ListTransactionsByBlockHashResponseItemBlockchainSpecificBitcoin.md)
 - [ListTransactionsByBlockHashResponseItemBlockchainSpecificBitcoinCash](docs/ListTransactionsByBlockHashResponseItemBlockchainSpecificBitcoinCash.md)
 - [ListTransactionsByBlockHashResponseItemBlockchainSpecificBitcoinCashScriptPubKey](docs/ListTransactionsByBlockHashResponseItemBlockchainSpecificBitcoinCashScriptPubKey.md)
 - [ListTransactionsByBlockHashResponseItemBlockchainSpecificBitcoinCashVin](docs/ListTransactionsByBlockHashResponseItemBlockchainSpecificBitcoinCashVin.md)
 - [ListTransactionsByBlockHashResponseItemBlockchainSpecificBitcoinCashVout](docs/ListTransactionsByBlockHashResponseItemBlockchainSpecificBitcoinCashVout.md)
 - [ListTransactionsByBlockHashResponseItemBlockchainSpecificBitcoinVin](docs/ListTransactionsByBlockHashResponseItemBlockchainSpecificBitcoinVin.md)
 - [ListTransactionsByBlockHashResponseItemBlockchainSpecificDash](docs/ListTransactionsByBlockHashResponseItemBlockchainSpecificDash.md)
 - [ListTransactionsByBlockHashResponseItemBlockchainSpecificDashScriptPubKey](docs/ListTransactionsByBlockHashResponseItemBlockchainSpecificDashScriptPubKey.md)
 - [ListTransactionsByBlockHashResponseItemBlockchainSpecificDashScriptSig](docs/ListTransactionsByBlockHashResponseItemBlockchainSpecificDashScriptSig.md)
 - [ListTransactionsByBlockHashResponseItemBlockchainSpecificDashVin](docs/ListTransactionsByBlockHashResponseItemBlockchainSpecificDashVin.md)
 - [ListTransactionsByBlockHashResponseItemBlockchainSpecificDashVout](docs/ListTransactionsByBlockHashResponseItemBlockchainSpecificDashVout.md)
 - [ListTransactionsByBlockHashResponseItemBlockchainSpecificDogecoin](docs/ListTransactionsByBlockHashResponseItemBlockchainSpecificDogecoin.md)
 - [ListTransactionsByBlockHashResponseItemBlockchainSpecificDogecoinScriptPubKey](docs/ListTransactionsByBlockHashResponseItemBlockchainSpecificDogecoinScriptPubKey.md)
 - [ListTransactionsByBlockHashResponseItemBlockchainSpecificDogecoinVin](docs/ListTransactionsByBlockHashResponseItemBlockchainSpecificDogecoinVin.md)
 - [ListTransactionsByBlockHashResponseItemBlockchainSpecificDogecoinVout](docs/ListTransactionsByBlockHashResponseItemBlockchainSpecificDogecoinVout.md)
 - [ListTransactionsByBlockHashResponseItemBlockchainSpecificEthereum](docs/ListTransactionsByBlockHashResponseItemBlockchainSpecificEthereum.md)
 - [ListTransactionsByBlockHashResponseItemBlockchainSpecificEthereumClassic](docs/ListTransactionsByBlockHashResponseItemBlockchainSpecificEthereumClassic.md)
 - [ListTransactionsByBlockHashResponseItemBlockchainSpecificEthereumGasPrice](docs/ListTransactionsByBlockHashResponseItemBlockchainSpecificEthereumGasPrice.md)
 - [ListTransactionsByBlockHashResponseItemBlockchainSpecificLitecoin](docs/ListTransactionsByBlockHashResponseItemBlockchainSpecificLitecoin.md)
 - [ListTransactionsByBlockHashResponseItemBlockchainSpecificLitecoinScriptPubKey](docs/ListTransactionsByBlockHashResponseItemBlockchainSpecificLitecoinScriptPubKey.md)
 - [ListTransactionsByBlockHashResponseItemBlockchainSpecificLitecoinVin](docs/ListTransactionsByBlockHashResponseItemBlockchainSpecificLitecoinVin.md)
 - [ListTransactionsByBlockHashResponseItemBlockchainSpecificLitecoinVout](docs/ListTransactionsByBlockHashResponseItemBlockchainSpecificLitecoinVout.md)
 - [ListTransactionsByBlockHashResponseItemFee](docs/ListTransactionsByBlockHashResponseItemFee.md)
 - [ListTransactionsByBlockHashResponseItemRecipients](docs/ListTransactionsByBlockHashResponseItemRecipients.md)
 - [ListTransactionsByBlockHashResponseItemSenders](docs/ListTransactionsByBlockHashResponseItemSenders.md)
 - [ListTransactionsByBlockHeightResponse](docs/ListTransactionsByBlockHeightResponse.md)
 - [ListTransactionsByBlockHeightResponseData](docs/ListTransactionsByBlockHeightResponseData.md)
 - [ListTransactionsByBlockHeightResponseItem](docs/ListTransactionsByBlockHeightResponseItem.md)
 - [ListTransactionsByBlockHeightResponseItemBlockchainSpecific](docs/ListTransactionsByBlockHeightResponseItemBlockchainSpecific.md)
 - [ListTransactionsByBlockHeightResponseItemBlockchainSpecificBitcoin](docs/ListTransactionsByBlockHeightResponseItemBlockchainSpecificBitcoin.md)
 - [ListTransactionsByBlockHeightResponseItemBlockchainSpecificBitcoinCash](docs/ListTransactionsByBlockHeightResponseItemBlockchainSpecificBitcoinCash.md)
 - [ListTransactionsByBlockHeightResponseItemBlockchainSpecificBitcoinScriptPubKey](docs/ListTransactionsByBlockHeightResponseItemBlockchainSpecificBitcoinScriptPubKey.md)
 - [ListTransactionsByBlockHeightResponseItemBlockchainSpecificBitcoinVout](docs/ListTransactionsByBlockHeightResponseItemBlockchainSpecificBitcoinVout.md)
 - [ListTransactionsByBlockHeightResponseItemBlockchainSpecificDash](docs/ListTransactionsByBlockHeightResponseItemBlockchainSpecificDash.md)
 - [ListTransactionsByBlockHeightResponseItemBlockchainSpecificDashScriptPubKey](docs/ListTransactionsByBlockHeightResponseItemBlockchainSpecificDashScriptPubKey.md)
 - [ListTransactionsByBlockHeightResponseItemBlockchainSpecificDashScriptSig](docs/ListTransactionsByBlockHeightResponseItemBlockchainSpecificDashScriptSig.md)
 - [ListTransactionsByBlockHeightResponseItemBlockchainSpecificDashVin](docs/ListTransactionsByBlockHeightResponseItemBlockchainSpecificDashVin.md)
 - [ListTransactionsByBlockHeightResponseItemBlockchainSpecificDashVout](docs/ListTransactionsByBlockHeightResponseItemBlockchainSpecificDashVout.md)
 - [ListTransactionsByBlockHeightResponseItemBlockchainSpecificDogecoin](docs/ListTransactionsByBlockHeightResponseItemBlockchainSpecificDogecoin.md)
 - [ListTransactionsByBlockHeightResponseItemBlockchainSpecificDogecoinVin](docs/ListTransactionsByBlockHeightResponseItemBlockchainSpecificDogecoinVin.md)
 - [ListTransactionsByBlockHeightResponseItemBlockchainSpecificEthereum](docs/ListTransactionsByBlockHeightResponseItemBlockchainSpecificEthereum.md)
 - [ListTransactionsByBlockHeightResponseItemBlockchainSpecificEthereumClassic](docs/ListTransactionsByBlockHeightResponseItemBlockchainSpecificEthereumClassic.md)
 - [ListTransactionsByBlockHeightResponseItemBlockchainSpecificEthereumClassicGasPrice](docs/ListTransactionsByBlockHeightResponseItemBlockchainSpecificEthereumClassicGasPrice.md)
 - [ListTransactionsByBlockHeightResponseItemBlockchainSpecificLitecoin](docs/ListTransactionsByBlockHeightResponseItemBlockchainSpecificLitecoin.md)
 - [ListTransactionsByBlockHeightResponseItemBlockchainSpecificLitecoinScriptPubKey](docs/ListTransactionsByBlockHeightResponseItemBlockchainSpecificLitecoinScriptPubKey.md)
 - [ListTransactionsByBlockHeightResponseItemBlockchainSpecificLitecoinScriptSig](docs/ListTransactionsByBlockHeightResponseItemBlockchainSpecificLitecoinScriptSig.md)
 - [ListTransactionsByBlockHeightResponseItemBlockchainSpecificLitecoinVin](docs/ListTransactionsByBlockHeightResponseItemBlockchainSpecificLitecoinVin.md)
 - [ListTransactionsByBlockHeightResponseItemBlockchainSpecificLitecoinVout](docs/ListTransactionsByBlockHeightResponseItemBlockchainSpecificLitecoinVout.md)
 - [ListTransactionsByBlockHeightResponseItemFee](docs/ListTransactionsByBlockHeightResponseItemFee.md)
 - [ListUnconfirmedOmniTransactionsByAddressResponse](docs/ListUnconfirmedOmniTransactionsByAddressResponse.md)
 - [ListUnconfirmedOmniTransactionsByAddressResponseData](docs/ListUnconfirmedOmniTransactionsByAddressResponseData.md)
 - [ListUnconfirmedOmniTransactionsByAddressResponseItem](docs/ListUnconfirmedOmniTransactionsByAddressResponseItem.md)
 - [ListUnconfirmedOmniTransactionsByAddressResponseItemFee](docs/ListUnconfirmedOmniTransactionsByAddressResponseItemFee.md)
 - [ListUnconfirmedOmniTransactionsByAddressResponseItemSenders](docs/ListUnconfirmedOmniTransactionsByAddressResponseItemSenders.md)
 - [ListUnconfirmedOmniTransactionsByPropertyIDResponse](docs/ListUnconfirmedOmniTransactionsByPropertyIDResponse.md)
 - [ListUnconfirmedOmniTransactionsByPropertyIDResponseData](docs/ListUnconfirmedOmniTransactionsByPropertyIDResponseData.md)
 - [ListUnconfirmedOmniTransactionsByPropertyIDResponseItem](docs/ListUnconfirmedOmniTransactionsByPropertyIDResponseItem.md)
 - [ListXRPRippleTransactionsByAddressResponse](docs/ListXRPRippleTransactionsByAddressResponse.md)
 - [ListXRPRippleTransactionsByAddressResponseData](docs/ListXRPRippleTransactionsByAddressResponseData.md)
 - [ListXRPRippleTransactionsByAddressResponseItem](docs/ListXRPRippleTransactionsByAddressResponseItem.md)
 - [ListXRPRippleTransactionsByAddressResponseItemFee](docs/ListXRPRippleTransactionsByAddressResponseItemFee.md)
 - [ListXRPRippleTransactionsByAddressResponseItemOffer](docs/ListXRPRippleTransactionsByAddressResponseItemOffer.md)
 - [ListXRPRippleTransactionsByAddressResponseItemReceive](docs/ListXRPRippleTransactionsByAddressResponseItemReceive.md)
 - [ListXRPRippleTransactionsByAddressResponseItemValue](docs/ListXRPRippleTransactionsByAddressResponseItemValue.md)
 - [ListXRPRippleTransactionsByBlockHashResponse](docs/ListXRPRippleTransactionsByBlockHashResponse.md)
 - [ListXRPRippleTransactionsByBlockHashResponseData](docs/ListXRPRippleTransactionsByBlockHashResponseData.md)
 - [ListXRPRippleTransactionsByBlockHashResponseItem](docs/ListXRPRippleTransactionsByBlockHashResponseItem.md)
 - [ListXRPRippleTransactionsByBlockHashResponseItemFee](docs/ListXRPRippleTransactionsByBlockHashResponseItemFee.md)
 - [ListXRPRippleTransactionsByBlockHashResponseItemOffer](docs/ListXRPRippleTransactionsByBlockHashResponseItemOffer.md)
 - [ListXRPRippleTransactionsByBlockHashResponseItemReceive](docs/ListXRPRippleTransactionsByBlockHashResponseItemReceive.md)
 - [ListXRPRippleTransactionsByBlockHashResponseItemRecipients](docs/ListXRPRippleTransactionsByBlockHashResponseItemRecipients.md)
 - [ListXRPRippleTransactionsByBlockHashResponseItemSenders](docs/ListXRPRippleTransactionsByBlockHashResponseItemSenders.md)
 - [ListXRPRippleTransactionsByBlockHashResponseItemValue](docs/ListXRPRippleTransactionsByBlockHashResponseItemValue.md)
 - [MinedTransactionRequestBody](docs/MinedTransactionRequestBody.md)
 - [MinedTransactionRequestBodyData](docs/MinedTransactionRequestBodyData.md)
 - [MinedTransactionRequestBodyDataItem](docs/MinedTransactionRequestBodyDataItem.md)
 - [MinedTransactionResponse](docs/MinedTransactionResponse.md)
 - [MinedTransactionResponseData](docs/MinedTransactionResponseData.md)
 - [MinedTransactionResponseItem](docs/MinedTransactionResponseItem.md)
 - [MissingApiKey](docs/MissingApiKey.md)
 - [MissingApiKeyError](docs/MissingApiKeyError.md)
 - [NewBlockRequestBody](docs/NewBlockRequestBody.md)
 - [NewBlockRequestBodyData](docs/NewBlockRequestBodyData.md)
 - [NewBlockRequestBodyDataItem](docs/NewBlockRequestBodyDataItem.md)
 - [NewBlockResponse](docs/NewBlockResponse.md)
 - [NewBlockResponseData](docs/NewBlockResponseData.md)
 - [NewBlockResponseItem](docs/NewBlockResponseItem.md)
 - [NewConfirmedCoinsTransactionsAndEachConfirmationRequestBody](docs/NewConfirmedCoinsTransactionsAndEachConfirmationRequestBody.md)
 - [NewConfirmedCoinsTransactionsAndEachConfirmationRequestBodyData](docs/NewConfirmedCoinsTransactionsAndEachConfirmationRequestBodyData.md)
 - [NewConfirmedCoinsTransactionsAndEachConfirmationRequestBodyDataItem](docs/NewConfirmedCoinsTransactionsAndEachConfirmationRequestBodyDataItem.md)
 - [NewConfirmedCoinsTransactionsAndEachConfirmationResponse](docs/NewConfirmedCoinsTransactionsAndEachConfirmationResponse.md)
 - [NewConfirmedCoinsTransactionsAndEachConfirmationResponseData](docs/NewConfirmedCoinsTransactionsAndEachConfirmationResponseData.md)
 - [NewConfirmedCoinsTransactionsAndEachConfirmationResponseItem](docs/NewConfirmedCoinsTransactionsAndEachConfirmationResponseItem.md)
 - [NewConfirmedCoinsTransactionsRequestBody](docs/NewConfirmedCoinsTransactionsRequestBody.md)
 - [NewConfirmedCoinsTransactionsRequestBodyData](docs/NewConfirmedCoinsTransactionsRequestBodyData.md)
 - [NewConfirmedCoinsTransactionsRequestBodyDataItem](docs/NewConfirmedCoinsTransactionsRequestBodyDataItem.md)
 - [NewConfirmedCoinsTransactionsResponse](docs/NewConfirmedCoinsTransactionsResponse.md)
 - [NewConfirmedCoinsTransactionsResponseData](docs/NewConfirmedCoinsTransactionsResponseData.md)
 - [NewConfirmedCoinsTransactionsResponseItem](docs/NewConfirmedCoinsTransactionsResponseItem.md)
 - [NewConfirmedTokensTransactionsAndEachConfirmationRequestBody](docs/NewConfirmedTokensTransactionsAndEachConfirmationRequestBody.md)
 - [NewConfirmedTokensTransactionsAndEachConfirmationRequestBodyData](docs/NewConfirmedTokensTransactionsAndEachConfirmationRequestBodyData.md)
 - [NewConfirmedTokensTransactionsAndEachConfirmationRequestBodyDataItem](docs/NewConfirmedTokensTransactionsAndEachConfirmationRequestBodyDataItem.md)
 - [NewConfirmedTokensTransactionsAndEachConfirmationResponse](docs/NewConfirmedTokensTransactionsAndEachConfirmationResponse.md)
 - [NewConfirmedTokensTransactionsAndEachConfirmationResponseData](docs/NewConfirmedTokensTransactionsAndEachConfirmationResponseData.md)
 - [NewConfirmedTokensTransactionsAndEachConfirmationResponseItem](docs/NewConfirmedTokensTransactionsAndEachConfirmationResponseItem.md)
 - [NewConfirmedTokensTransactionsRequestBody](docs/NewConfirmedTokensTransactionsRequestBody.md)
 - [NewConfirmedTokensTransactionsResponse](docs/NewConfirmedTokensTransactionsResponse.md)
 - [NewConfirmedTokensTransactionsResponseData](docs/NewConfirmedTokensTransactionsResponseData.md)
 - [NewConfirmedTokensTransactionsResponseItem](docs/NewConfirmedTokensTransactionsResponseItem.md)
 - [NewUnconfirmedCoinsTransactionsRequestBody](docs/NewUnconfirmedCoinsTransactionsRequestBody.md)
 - [NewUnconfirmedCoinsTransactionsRequestBodyData](docs/NewUnconfirmedCoinsTransactionsRequestBodyData.md)
 - [NewUnconfirmedCoinsTransactionsRequestBodyDataItem](docs/NewUnconfirmedCoinsTransactionsRequestBodyDataItem.md)
 - [NewUnconfirmedCoinsTransactionsResponse](docs/NewUnconfirmedCoinsTransactionsResponse.md)
 - [NewUnconfirmedCoinsTransactionsResponseData](docs/NewUnconfirmedCoinsTransactionsResponseData.md)
 - [NewUnconfirmedCoinsTransactionsResponseItem](docs/NewUnconfirmedCoinsTransactionsResponseItem.md)
 - [NewUnconfirmedTokensTransactionsRequestBody](docs/NewUnconfirmedTokensTransactionsRequestBody.md)
 - [NewUnconfirmedTokensTransactionsRequestBodyData](docs/NewUnconfirmedTokensTransactionsRequestBodyData.md)
 - [NewUnconfirmedTokensTransactionsRequestBodyDataItem](docs/NewUnconfirmedTokensTransactionsRequestBodyDataItem.md)
 - [NewUnconfirmedTokensTransactionsResponse](docs/NewUnconfirmedTokensTransactionsResponse.md)
 - [NewUnconfirmedTokensTransactionsResponseData](docs/NewUnconfirmedTokensTransactionsResponseData.md)
 - [NewUnconfirmedTokensTransactionsResponseItem](docs/NewUnconfirmedTokensTransactionsResponseItem.md)
 - [RequestLimitReached](docs/RequestLimitReached.md)
 - [RequestLimitReachedError](docs/RequestLimitReachedError.md)
 - [ResourceNotFound](docs/ResourceNotFound.md)
 - [ResourceNotFoundError](docs/ResourceNotFoundError.md)
 - [SyncHDWalletxPubYPubZPubRequestBody](docs/SyncHDWalletxPubYPubZPubRequestBody.md)
 - [SyncHDWalletxPubYPubZPubRequestBodyData](docs/SyncHDWalletxPubYPubZPubRequestBodyData.md)
 - [SyncHDWalletxPubYPubZPubRequestBodyDataItem](docs/SyncHDWalletxPubYPubZPubRequestBodyDataItem.md)
 - [SyncHDWalletxPubYPubZPubResponse](docs/SyncHDWalletxPubYPubZPubResponse.md)
 - [SyncHDWalletxPubYPubZPubResponseData](docs/SyncHDWalletxPubYPubZPubResponseData.md)
 - [SyncHDWalletxPubYPubZPubResponseItem](docs/SyncHDWalletxPubYPubZPubResponseItem.md)
 - [TokensForwardingAutomationsLimitReached](docs/TokensForwardingAutomationsLimitReached.md)
 - [TokensForwardingAutomationsLimitReachedError](docs/TokensForwardingAutomationsLimitReachedError.md)
 - [TokensForwardingFail](docs/TokensForwardingFail.md)
 - [TokensForwardingFailData](docs/TokensForwardingFailData.md)
 - [TokensForwardingFailDataItem](docs/TokensForwardingFailDataItem.md)
 - [TokensForwardingSuccess](docs/TokensForwardingSuccess.md)
 - [TokensForwardingSuccessData](docs/TokensForwardingSuccessData.md)
 - [TokensForwardingSuccessDataItem](docs/TokensForwardingSuccessDataItem.md)
 - [TokensForwardingSuccessEthereumerc20token](docs/TokensForwardingSuccessEthereumerc20token.md)
 - [TokensForwardingSuccessEthereumerc721token](docs/TokensForwardingSuccessEthereumerc721token.md)
 - [TokensForwardingSuccessOmnilayertoken](docs/TokensForwardingSuccessOmnilayertoken.md)
 - [TokensForwardingSuccessToken](docs/TokensForwardingSuccessToken.md)
 - [TransactionMined](docs/TransactionMined.md)
 - [TransactionMinedData](docs/TransactionMinedData.md)
 - [TransactionMinedDataItem](docs/TransactionMinedDataItem.md)
 - [TransactionMinedDataItemMinedInBlock](docs/TransactionMinedDataItemMinedInBlock.md)
 - [UnexpectedServerError](docs/UnexpectedServerError.md)
 - [UnexpectedServerErrorError](docs/UnexpectedServerErrorError.md)
 - [UnsupportedMediaType](docs/UnsupportedMediaType.md)
 - [UnsupportedMediaTypeError](docs/UnsupportedMediaTypeError.md)
 - [UriNotFound](docs/UriNotFound.md)
 - [UriNotFoundError](docs/UriNotFoundError.md)
 - [ValidateAddressRequestBody](docs/ValidateAddressRequestBody.md)
 - [ValidateAddressRequestBodyData](docs/ValidateAddressRequestBodyData.md)
 - [ValidateAddressRequestBodyDataItem](docs/ValidateAddressRequestBodyDataItem.md)
 - [ValidateAddressResponse](docs/ValidateAddressResponse.md)
 - [ValidateAddressResponseData](docs/ValidateAddressResponseData.md)
 - [ValidateAddressResponseItem](docs/ValidateAddressResponseItem.md)
 - [XpubNotSynced](docs/XpubNotSynced.md)
 - [XpubNotSyncedError](docs/XpubNotSyncedError.md)
 - [XpubSyncInProgress](docs/XpubSyncInProgress.md)
 - [XpubSyncInProgressError](docs/XpubSyncInProgressError.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### ApiKey

- **Type**: API key
- **API key parameter name**: x-api-key
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

developers@cryptoapis.io

