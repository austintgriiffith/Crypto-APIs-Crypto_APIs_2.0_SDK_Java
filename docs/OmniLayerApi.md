# OmniLayerApi

All URIs are relative to *https://rest.cryptoapis.io/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getOmniTransactionDetailsByTransactionIDTxid**](OmniLayerApi.md#getOmniTransactionDetailsByTransactionIDTxid) | **GET** /blockchain-data/{blockchain}/{network}/omni/transactions/{transactionId} | Get Omni Transaction Details By Transaction ID (Txid)
[**getUnconfirmedOmniTransactionByTransactionIDTxid**](OmniLayerApi.md#getUnconfirmedOmniTransactionByTransactionIDTxid) | **GET** /blockchain-data/{blockchain}/{network}/omni/transactions-unconfirmed/{transactionId} | Get Unconfirmed Omni Transaction By Transaction ID (Txid)
[**listOmniTokensByAddress**](OmniLayerApi.md#listOmniTokensByAddress) | **GET** /blockchain-data/{blockchain}/{network}/omni/addresses/{address} | List Omni Tokens By Address
[**listOmniTransactionsByAddress**](OmniLayerApi.md#listOmniTransactionsByAddress) | **GET** /blockchain-data/{blockchain}/{network}/omni/addresses/{address}/transactions | List Omni Transactions By Address
[**listOmniTransactionsByBlockHash**](OmniLayerApi.md#listOmniTransactionsByBlockHash) | **GET** /blockchain-data/{blockchain}/{network}/omni/blocks/hash/{blockHash}/transactions | List Omni Transactions By Block Hash
[**listOmniTransactionsByBlockHeight**](OmniLayerApi.md#listOmniTransactionsByBlockHeight) | **GET** /blockchain-data/{blockchain}/{network}/omni/blocks/height/{blockHeight}/transactions | List Omni Transactions By Block Height
[**listUnconfirmedOmniTransactionsByAddress**](OmniLayerApi.md#listUnconfirmedOmniTransactionsByAddress) | **GET** /blockchain-data/{blockchain}/{network}/omni/address-transactions-unconfirmed/{address} | List Unconfirmed Omni Transactions By Address
[**listUnconfirmedOmniTransactionsByPropertyID**](OmniLayerApi.md#listUnconfirmedOmniTransactionsByPropertyID) | **GET** /blockchain-data/{blockchain}/{network}/omni/properties/{propertyId}/transactions | List Unconfirmed Omni Transactions By Property ID


<a name="getOmniTransactionDetailsByTransactionIDTxid"></a>
# **getOmniTransactionDetailsByTransactionIDTxid**
> GetOmniTransactionDetailsByTransactionIDTxidResponse getOmniTransactionDetailsByTransactionIDTxid(network, blockchain, transactionId, context)

Get Omni Transaction Details By Transaction ID (Txid)

Through this endpoint customers can obtain details about an Omni transaction by the transaction&#39;s unique identifier. The transaction can return information such as hash, height, time of creation in Unix timestamp, etc.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OmniLayerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.cryptoapis.io/v2");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    OmniLayerApi apiInstance = new OmniLayerApi(defaultClient);
    String network = "testnet"; // String | Represents the name of the blockchain network used; blockchain networks are usually identical as technology and software, but they differ in data, e.g. - \"mainnet\" is the live network with actual data while networks like \"testnet\", \"ropsten\", \"rinkeby\" are test networks.
    String blockchain = "bitcoin"; // String | Represents the specific blockchain protocol name, e.g. Ethereum, Bitcoin, etc.
    String transactionId = "d237ff4a681617b767bf22c4e1e8f5115b95c8c168d6cf53bbdec68529f91ecb"; // String | Represents the unique identifier of a transaction, i.e. it could be `transactionId` in UTXO-based protocols like Bitcoin, and transaction `hash` in Ethereum blockchain.
    String context = "context_example"; // String | In batch situations the user can use the context to correlate responses with requests. This property is present regardless of whether the response was successful or returned as an error. `context` is specified by the user.
    try {
      GetOmniTransactionDetailsByTransactionIDTxidResponse result = apiInstance.getOmniTransactionDetailsByTransactionIDTxid(network, blockchain, transactionId, context);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OmniLayerApi#getOmniTransactionDetailsByTransactionIDTxid");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **network** | **String**| Represents the name of the blockchain network used; blockchain networks are usually identical as technology and software, but they differ in data, e.g. - \&quot;mainnet\&quot; is the live network with actual data while networks like \&quot;testnet\&quot;, \&quot;ropsten\&quot;, \&quot;rinkeby\&quot; are test networks. | [enum: mainnet, testnet]
 **blockchain** | **String**| Represents the specific blockchain protocol name, e.g. Ethereum, Bitcoin, etc. | [enum: bitcoin]
 **transactionId** | **String**| Represents the unique identifier of a transaction, i.e. it could be &#x60;transactionId&#x60; in UTXO-based protocols like Bitcoin, and transaction &#x60;hash&#x60; in Ethereum blockchain. |
 **context** | **String**| In batch situations the user can use the context to correlate responses with requests. This property is present regardless of whether the response was successful or returned as an error. &#x60;context&#x60; is specified by the user. | [optional]

### Return type

[**GetOmniTransactionDetailsByTransactionIDTxidResponse**](GetOmniTransactionDetailsByTransactionIDTxidResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The request has been successful. |  -  |
**400** | The pagination attributes that have been used are invalid. Please check the Documentation to see details on pagination. |  -  |
**401** | The provided API key is invalid. Please, generate a new one from your Dashboard. |  -  |
**402** | You have insufficient credits. Please upgrade your plan from your Dashboard or contact our team via email. |  -  |
**403** | Mainnets access is not available for your current subscription plan, please upgrade your plan to be able to use it. |  -  |
**404** | The specified transaction has not been found on the specific blockchain. |  -  |
**409** | The data provided seems to be invalid. |  -  |
**415** | The selected Media Type is unavailable. The Content-Type header should be &#39;application/json&#39;. |  -  |
**422** | Your request body for POST requests must have a structure of { data: { item: [...properties] } } |  -  |
**429** | The request limit has been reached. There can be maximum {requests} requests per {seconds} second(s) made. Please contact our team via email if you need more or upgrade your plan. |  -  |
**500** | An unexpected server error has occurred, we are working to fix this. Please try again later and in case it occurs again please report it to our team via email. |  -  |

<a name="getUnconfirmedOmniTransactionByTransactionIDTxid"></a>
# **getUnconfirmedOmniTransactionByTransactionIDTxid**
> GetUnconfirmedOmniTransactionByTransactionIDTxidResponse getUnconfirmedOmniTransactionByTransactionIDTxid(network, blockchain, transactionId, context)

Get Unconfirmed Omni Transaction By Transaction ID (Txid)

Through this endpoint customers can obtain information on unconfirmed Omni transactions by an attribute &#x60;transactionId&#x60;. The transaction can have information such as hash, height, time of creation in Unix timestamp, etc.    Unconfirmed transactions are usually put in the Mempool and await verification so that they can be added to a block.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OmniLayerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.cryptoapis.io/v2");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    OmniLayerApi apiInstance = new OmniLayerApi(defaultClient);
    String network = "testnet"; // String | Represents the name of the blockchain network used; blockchain networks are usually identical as technology and software, but they differ in data, e.g. - \"mainnet\" is the live network with actual data while networks like \"testnet\", \"ropsten\", \"rinkeby\" are test networks.
    String blockchain = "bitcoin"; // String | Represents the specific blockchain protocol name, e.g. Ethereum, Bitcoin, etc.
    String transactionId = "92f17d3d16a1baf7de570a86179cc263cb9866c66778feec2dce111430f41c08"; // String | Represents the unique identifier of a transaction, i.e. it could be `transactionId` in UTXO-based protocols like Bitcoin, and transaction `hash` in Ethereum blockchain.
    String context = "context_example"; // String | In batch situations the user can use the context to correlate responses with requests. This property is present regardless of whether the response was successful or returned as an error. `context` is specified by the user.
    try {
      GetUnconfirmedOmniTransactionByTransactionIDTxidResponse result = apiInstance.getUnconfirmedOmniTransactionByTransactionIDTxid(network, blockchain, transactionId, context);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OmniLayerApi#getUnconfirmedOmniTransactionByTransactionIDTxid");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **network** | **String**| Represents the name of the blockchain network used; blockchain networks are usually identical as technology and software, but they differ in data, e.g. - \&quot;mainnet\&quot; is the live network with actual data while networks like \&quot;testnet\&quot;, \&quot;ropsten\&quot;, \&quot;rinkeby\&quot; are test networks. | [enum: mainnet, testnet]
 **blockchain** | **String**| Represents the specific blockchain protocol name, e.g. Ethereum, Bitcoin, etc. | [enum: bitcoin]
 **transactionId** | **String**| Represents the unique identifier of a transaction, i.e. it could be &#x60;transactionId&#x60; in UTXO-based protocols like Bitcoin, and transaction &#x60;hash&#x60; in Ethereum blockchain. |
 **context** | **String**| In batch situations the user can use the context to correlate responses with requests. This property is present regardless of whether the response was successful or returned as an error. &#x60;context&#x60; is specified by the user. | [optional]

### Return type

[**GetUnconfirmedOmniTransactionByTransactionIDTxidResponse**](GetUnconfirmedOmniTransactionByTransactionIDTxidResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The request has been successful. |  -  |
**400** | The pagination attributes that have been used are invalid. Please check the Documentation to see details on pagination. |  -  |
**401** | The provided API key is invalid. Please, generate a new one from your Dashboard. |  -  |
**402** | You have insufficient credits. Please upgrade your plan from your Dashboard or contact our team via email. |  -  |
**403** | Mainnets access is not available for your current subscription plan, please upgrade your plan to be able to use it. |  -  |
**404** | The specified transaction has not been found on the specific blockchain. |  -  |
**409** | The data provided seems to be invalid. |  -  |
**415** | The selected Media Type is unavailable. The Content-Type header should be &#39;application/json&#39;. |  -  |
**422** | Your request body for POST requests must have a structure of { data: { item: [...properties] } } |  -  |
**429** | The request limit has been reached. There can be maximum {requests} requests per {seconds} second(s) made. Please contact our team via email if you need more or upgrade your plan. |  -  |
**500** | An unexpected server error has occurred, we are working to fix this. Please try again later and in case it occurs again please report it to our team via email. |  -  |

<a name="listOmniTokensByAddress"></a>
# **listOmniTokensByAddress**
> ListOmniTokensByAddressResponse listOmniTokensByAddress(network, blockchain, address, context)

List Omni Tokens By Address

Through this endpoint the customer can receive basic information about a given Omni address based on confirmed/synced blocks only. In the case where there are any incoming or outgoing **unconfirmed** transactions for the specific address, they **will not** be counted or calculated here.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OmniLayerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.cryptoapis.io/v2");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    OmniLayerApi apiInstance = new OmniLayerApi(defaultClient);
    String network = "testnet"; // String | Represents the name of the blockchain network used; blockchain networks are usually identical as technology and software, but they differ in data, e.g. - \"mainnet\" is the live network with actual data while networks like \"testnet\", \"ropsten\", \"rinkeby\" are test networks.
    String blockchain = "bitcoin"; // String | Represents the specific blockchain protocol name, e.g. Ethereum, Bitcoin, etc.
    String address = "mi7iSsKcvyFYNsiYdDZqJmH75RmoHomwmo"; // String | Represents the public address, which is a compressed and shortened form of a public key.
    String context = "context_example"; // String | In batch situations the user can use the context to correlate responses with requests. This property is present regardless of whether the response was successful or returned as an error. `context` is specified by the user.
    try {
      ListOmniTokensByAddressResponse result = apiInstance.listOmniTokensByAddress(network, blockchain, address, context);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OmniLayerApi#listOmniTokensByAddress");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **network** | **String**| Represents the name of the blockchain network used; blockchain networks are usually identical as technology and software, but they differ in data, e.g. - \&quot;mainnet\&quot; is the live network with actual data while networks like \&quot;testnet\&quot;, \&quot;ropsten\&quot;, \&quot;rinkeby\&quot; are test networks. | [enum: mainnet, testnet]
 **blockchain** | **String**| Represents the specific blockchain protocol name, e.g. Ethereum, Bitcoin, etc. | [enum: bitcoin]
 **address** | **String**| Represents the public address, which is a compressed and shortened form of a public key. |
 **context** | **String**| In batch situations the user can use the context to correlate responses with requests. This property is present regardless of whether the response was successful or returned as an error. &#x60;context&#x60; is specified by the user. | [optional]

### Return type

[**ListOmniTokensByAddressResponse**](ListOmniTokensByAddressResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The request has been successful. |  -  |
**400** | The pagination attributes that have been used are invalid. Please check the Documentation to see details on pagination. |  -  |
**401** | The provided API key is invalid. Please, generate a new one from your Dashboard. |  -  |
**402** | You have insufficient credits. Please upgrade your plan from your Dashboard or contact our team via email. |  -  |
**403** | Mainnets access is not available for your current subscription plan, please upgrade your plan to be able to use it. |  -  |
**409** | The data provided seems to be invalid. |  -  |
**415** | The selected Media Type is unavailable. The Content-Type header should be &#39;application/json&#39;. |  -  |
**422** | Your request body for POST requests must have a structure of { data: { item: [...properties] } } |  -  |
**429** | The request limit has been reached. There can be maximum {requests} requests per {seconds} second(s) made. Please contact our team via email if you need more or upgrade your plan. |  -  |
**500** | An unexpected server error has occurred, we are working to fix this. Please try again later and in case it occurs again please report it to our team via email. |  -  |

<a name="listOmniTransactionsByAddress"></a>
# **listOmniTransactionsByAddress**
> ListOmniTransactionsByAddressResponse listOmniTransactionsByAddress(network, blockchain, address, context, limit, offset)

List Omni Transactions By Address

This endpoint will list Omni transactions by an attribute &#x60;address&#x60;. The transactions listed will detail additional information such as hash, height, time of creation in Unix timestamp, etc.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OmniLayerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.cryptoapis.io/v2");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    OmniLayerApi apiInstance = new OmniLayerApi(defaultClient);
    String network = "testnet"; // String | Represents the name of the blockchain network used; blockchain networks are usually identical as technology and software, but they differ in data, e.g. - \"mainnet\" is the live network with actual data while networks like \"testnet\", \"ropsten\", \"rinkeby\" are test networks.
    String blockchain = "bitcoin"; // String | Represents the specific blockchain protocol name, e.g. Ethereum, Bitcoin, etc.
    String address = "mi7iSsKcvyFYNsiYdDZqJmH75RmoHomwmo"; // String | Represents the public address, which is a compressed and shortened form of a public key.
    String context = "context_example"; // String | In batch situations the user can use the context to correlate responses with requests. This property is present regardless of whether the response was successful or returned as an error. `context` is specified by the user.
    Integer limit = 50; // Integer | Defines how many items should be returned in the response per page basis.
    Integer offset = 0; // Integer | The starting index of the response items, i.e. where the response should start listing the returned items.
    try {
      ListOmniTransactionsByAddressResponse result = apiInstance.listOmniTransactionsByAddress(network, blockchain, address, context, limit, offset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OmniLayerApi#listOmniTransactionsByAddress");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **network** | **String**| Represents the name of the blockchain network used; blockchain networks are usually identical as technology and software, but they differ in data, e.g. - \&quot;mainnet\&quot; is the live network with actual data while networks like \&quot;testnet\&quot;, \&quot;ropsten\&quot;, \&quot;rinkeby\&quot; are test networks. | [enum: mainnet, testnet]
 **blockchain** | **String**| Represents the specific blockchain protocol name, e.g. Ethereum, Bitcoin, etc. | [enum: bitcoin]
 **address** | **String**| Represents the public address, which is a compressed and shortened form of a public key. |
 **context** | **String**| In batch situations the user can use the context to correlate responses with requests. This property is present regardless of whether the response was successful or returned as an error. &#x60;context&#x60; is specified by the user. | [optional]
 **limit** | **Integer**| Defines how many items should be returned in the response per page basis. | [optional] [default to 50]
 **offset** | **Integer**| The starting index of the response items, i.e. where the response should start listing the returned items. | [optional] [default to 0]

### Return type

[**ListOmniTransactionsByAddressResponse**](ListOmniTransactionsByAddressResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The request has been successful. |  -  |
**400** | The pagination attributes that have been used are invalid. Please check the Documentation to see details on pagination. |  -  |
**401** | The provided API key is invalid. Please, generate a new one from your Dashboard. |  -  |
**402** | You have insufficient credits. Please upgrade your plan from your Dashboard or contact our team via email. |  -  |
**403** | Mainnets access is not available for your current subscription plan, please upgrade your plan to be able to use it. |  -  |
**409** | The data provided seems to be invalid. |  -  |
**415** | The selected Media Type is unavailable. The Content-Type header should be &#39;application/json&#39;. |  -  |
**422** | Your request body for POST requests must have a structure of { data: { item: [...properties] } } |  -  |
**429** | The request limit has been reached. There can be maximum {requests} requests per {seconds} second(s) made. Please contact our team via email if you need more or upgrade your plan. |  -  |
**500** | An unexpected server error has occurred, we are working to fix this. Please try again later and in case it occurs again please report it to our team via email. |  -  |

<a name="listOmniTransactionsByBlockHash"></a>
# **listOmniTransactionsByBlockHash**
> ListOmniTransactionsByBlockHashResponse listOmniTransactionsByBlockHash(network, blockchain, blockHash, context, limit, offset)

List Omni Transactions By Block Hash

This endpoint will list Omni transactions by an attribute &#x60;transactionHash&#x60;. The transactions listed will detail additional information such as addresses, height, time of creation in Unix timestamp, etc.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OmniLayerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.cryptoapis.io/v2");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    OmniLayerApi apiInstance = new OmniLayerApi(defaultClient);
    String network = "testnet"; // String | Represents the name of the blockchain network used; blockchain networks are usually identical as technology and software, but they differ in data, e.g. - \"mainnet\" is the live network with actual data while networks like \"testnet\", \"ropsten\", \"rinkeby\" are test networks.
    String blockchain = "bitcoin"; // String | Represents the specific blockchain protocol name, e.g. Ethereum, Bitcoin, etc.
    String blockHash = "000000000000001f50c9d33d122562daa7fc9582df0b415e626216c37d015818"; // String | Represents the hash of the block, which is its unique identifier. It represents a cryptographic digital fingerprint made by hashing the block header twice through the SHA256 algorithm.
    String context = "context_example"; // String | In batch situations the user can use the context to correlate responses with requests. This property is present regardless of whether the response was successful or returned as an error. `context` is specified by the user.
    Integer limit = 50; // Integer | Defines how many items should be returned in the response per page basis.
    Integer offset = 0; // Integer | The starting index of the response items, i.e. where the response should start listing the returned items.
    try {
      ListOmniTransactionsByBlockHashResponse result = apiInstance.listOmniTransactionsByBlockHash(network, blockchain, blockHash, context, limit, offset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OmniLayerApi#listOmniTransactionsByBlockHash");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **network** | **String**| Represents the name of the blockchain network used; blockchain networks are usually identical as technology and software, but they differ in data, e.g. - \&quot;mainnet\&quot; is the live network with actual data while networks like \&quot;testnet\&quot;, \&quot;ropsten\&quot;, \&quot;rinkeby\&quot; are test networks. | [enum: mainnet, testnet]
 **blockchain** | **String**| Represents the specific blockchain protocol name, e.g. Ethereum, Bitcoin, etc. | [enum: bitcoin]
 **blockHash** | **String**| Represents the hash of the block, which is its unique identifier. It represents a cryptographic digital fingerprint made by hashing the block header twice through the SHA256 algorithm. |
 **context** | **String**| In batch situations the user can use the context to correlate responses with requests. This property is present regardless of whether the response was successful or returned as an error. &#x60;context&#x60; is specified by the user. | [optional]
 **limit** | **Integer**| Defines how many items should be returned in the response per page basis. | [optional] [default to 50]
 **offset** | **Integer**| The starting index of the response items, i.e. where the response should start listing the returned items. | [optional] [default to 0]

### Return type

[**ListOmniTransactionsByBlockHashResponse**](ListOmniTransactionsByBlockHashResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The request has been successfull. |  -  |
**400** | The pagination attributes that have been used are invalid. Please check the Documentation to see details on pagination. |  -  |
**401** | The provided API key is invalid. Please, generate a new one from your Dashboard. |  -  |
**402** | You have insufficient credits. Please upgrade your plan from your Dashboard or contact our team via email. |  -  |
**403** | Mainnets access is not available for your current subscription plan, please upgrade your plan to be able to use it. |  -  |
**409** | The data provided seems to be invalid. |  -  |
**415** | The selected Media Type is unavailable. The Content-Type header should be &#39;application/json&#39;. |  -  |
**422** | Your request body for POST requests must have a structure of { data: { item: [...properties] } } |  -  |
**429** | The request limit has been reached. There can be maximum {requests} requests per {seconds} second(s) made. Please contact our team via email if you need more or upgrade your plan. |  -  |
**500** | An unexpected server error has occurred, we are working to fix this. Please try again later and in case it occurs again please report it to our team via email. |  -  |

<a name="listOmniTransactionsByBlockHeight"></a>
# **listOmniTransactionsByBlockHeight**
> ListOmniTransactionsByBlockHeightResponse listOmniTransactionsByBlockHeight(network, blockchain, blockHeight, context, limit, offset)

List Omni Transactions By Block Height

This endpoint will list Omni transactions by an attribute &#x60;blockHeight&#x60;. The transactions listed will detail additional information such as hash, addresses, time of creation in Unix timestamp, etc.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OmniLayerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.cryptoapis.io/v2");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    OmniLayerApi apiInstance = new OmniLayerApi(defaultClient);
    String network = "testnet"; // String | Represents the name of the blockchain network used; blockchain networks are usually identical as technology and software, but they differ in data, e.g. - \"mainnet\" is the live network with actual data while networks like \"testnet\", \"ropsten\", \"rinkeby\" are test networks.
    String blockchain = "bitcoin"; // String | Represents the specific blockchain protocol name, e.g. Ethereum, Bitcoin, etc.
    String blockHeight = "1941222"; // String | Represents the number of blocks in the blockchain preceding this specific block. Block numbers have no gaps. A blockchain usually starts with block 0 called the \"Genesis block\".
    String context = "context_example"; // String | In batch situations the user can use the context to correlate responses with requests. This property is present regardless of whether the response was successful or returned as an error. `context` is specified by the user.
    Integer limit = 50; // Integer | Defines how many items should be returned in the response per page basis.
    Integer offset = 0; // Integer | The starting index of the response items, i.e. where the response should start listing the returned items.
    try {
      ListOmniTransactionsByBlockHeightResponse result = apiInstance.listOmniTransactionsByBlockHeight(network, blockchain, blockHeight, context, limit, offset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OmniLayerApi#listOmniTransactionsByBlockHeight");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **network** | **String**| Represents the name of the blockchain network used; blockchain networks are usually identical as technology and software, but they differ in data, e.g. - \&quot;mainnet\&quot; is the live network with actual data while networks like \&quot;testnet\&quot;, \&quot;ropsten\&quot;, \&quot;rinkeby\&quot; are test networks. | [enum: mainnet, testnet]
 **blockchain** | **String**| Represents the specific blockchain protocol name, e.g. Ethereum, Bitcoin, etc. | [enum: bitcoin]
 **blockHeight** | **String**| Represents the number of blocks in the blockchain preceding this specific block. Block numbers have no gaps. A blockchain usually starts with block 0 called the \&quot;Genesis block\&quot;. |
 **context** | **String**| In batch situations the user can use the context to correlate responses with requests. This property is present regardless of whether the response was successful or returned as an error. &#x60;context&#x60; is specified by the user. | [optional]
 **limit** | **Integer**| Defines how many items should be returned in the response per page basis. | [optional] [default to 50]
 **offset** | **Integer**| The starting index of the response items, i.e. where the response should start listing the returned items. | [optional] [default to 0]

### Return type

[**ListOmniTransactionsByBlockHeightResponse**](ListOmniTransactionsByBlockHeightResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The request has been successful. |  -  |
**400** | The pagination attributes that have been used are invalid. Please check the Documentation to see details on pagination. |  -  |
**401** | The provided API key is invalid. Please, generate a new one from your Dashboard. |  -  |
**402** | You have insufficient credits. Please upgrade your plan from your Dashboard or contact our team via email. |  -  |
**403** | Mainnets access is not available for your current subscription plan, please upgrade your plan to be able to use it. |  -  |
**409** | The data provided seems to be invalid. |  -  |
**415** | The selected Media Type is unavailable. The Content-Type header should be &#39;application/json&#39;. |  -  |
**422** | Your request body for POST requests must have a structure of { data: { item: [...properties] } } |  -  |
**429** | The request limit has been reached. There can be maximum {requests} requests per {seconds} second(s) made. Please contact our team via email if you need more or upgrade your plan. |  -  |
**500** | An unexpected server error has occurred, we are working to fix this. Please try again later and in case it occurs again please report it to our team via email. |  -  |

<a name="listUnconfirmedOmniTransactionsByAddress"></a>
# **listUnconfirmedOmniTransactionsByAddress**
> ListUnconfirmedOmniTransactionsByAddressResponse listUnconfirmedOmniTransactionsByAddress(network, blockchain, address, context, limit, offset)

List Unconfirmed Omni Transactions By Address

This endpoint will list unconfirmed Omni transactions by an attribute &#x60;address&#x60;. The transactions listed will detail additional information such as hash, height, time of creation in Unix timestamp, etc.    Unconfirmed transactions are usually put in the Mempool and await verification so that they can be added to a block.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OmniLayerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.cryptoapis.io/v2");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    OmniLayerApi apiInstance = new OmniLayerApi(defaultClient);
    String network = "testnet"; // String | Represents the name of the blockchain network used; blockchain networks are usually identical as technology and software, but they differ in data, e.g. - \"mainnet\" is the live network with actual data while networks like \"testnet\", \"ropsten\", \"rinkeby\" are test networks.
    String blockchain = "bitcoin"; // String | Represents the specific blockchain protocol name, e.g. Ethereum, Bitcoin, etc.
    String address = "mi7iSsKcvyFYNsiYdDZqJmH75RmoHomwmo"; // String | Represents the public address, which is a compressed and shortened form of a public key.
    String context = "context_example"; // String | In batch situations the user can use the context to correlate responses with requests. This property is present regardless of whether the response was successful or returned as an error. `context` is specified by the user.
    Integer limit = 50; // Integer | Defines how many items should be returned in the response per page basis.
    Integer offset = 0; // Integer | The starting index of the response items, i.e. where the response should start listing the returned items.
    try {
      ListUnconfirmedOmniTransactionsByAddressResponse result = apiInstance.listUnconfirmedOmniTransactionsByAddress(network, blockchain, address, context, limit, offset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OmniLayerApi#listUnconfirmedOmniTransactionsByAddress");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **network** | **String**| Represents the name of the blockchain network used; blockchain networks are usually identical as technology and software, but they differ in data, e.g. - \&quot;mainnet\&quot; is the live network with actual data while networks like \&quot;testnet\&quot;, \&quot;ropsten\&quot;, \&quot;rinkeby\&quot; are test networks. | [enum: mainnet, testnet]
 **blockchain** | **String**| Represents the specific blockchain protocol name, e.g. Ethereum, Bitcoin, etc. | [enum: bitcoin]
 **address** | **String**| Represents the public address, which is a compressed and shortened form of a public key. |
 **context** | **String**| In batch situations the user can use the context to correlate responses with requests. This property is present regardless of whether the response was successful or returned as an error. &#x60;context&#x60; is specified by the user. | [optional]
 **limit** | **Integer**| Defines how many items should be returned in the response per page basis. | [optional] [default to 50]
 **offset** | **Integer**| The starting index of the response items, i.e. where the response should start listing the returned items. | [optional] [default to 0]

### Return type

[**ListUnconfirmedOmniTransactionsByAddressResponse**](ListUnconfirmedOmniTransactionsByAddressResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The request has been successful. |  -  |
**400** | The pagination attributes that have been used are invalid. Please check the Documentation to see details on pagination. |  -  |
**401** | The provided API key is invalid. Please, generate a new one from your Dashboard. |  -  |
**402** | You have insufficient credits. Please upgrade your plan from your Dashboard or contact our team via email. |  -  |
**403** | Mainnets access is not available for your current subscription plan, please upgrade your plan to be able to use it. |  -  |
**409** | The data provided seems to be invalid. |  -  |
**415** | The selected Media Type is unavailable. The Content-Type header should be &#39;application/json&#39;. |  -  |
**422** | Your request body for POST requests must have a structure of { data: { item: [...properties] } } |  -  |
**429** | The request limit has been reached. There can be maximum {requests} requests per {seconds} second(s) made. Please contact our team via email if you need more or upgrade your plan. |  -  |
**500** | An unexpected server error has occurred, we are working to fix this. Please try again later and in case it occurs again please report it to our team via email. |  -  |

<a name="listUnconfirmedOmniTransactionsByPropertyID"></a>
# **listUnconfirmedOmniTransactionsByPropertyID**
> ListUnconfirmedOmniTransactionsByPropertyIDResponse listUnconfirmedOmniTransactionsByPropertyID(network, blockchain, propertyId, context, limit, offset)

List Unconfirmed Omni Transactions By Property ID

This endpoint will list unconfirmed Omni transactions by an attribute &#x60;propertyId&#x60;. The transactions listed will detail additional information such as hash, height, time of creation in Unix timestamp, etc.    Unconfirmed transactions are usually put in the Mempool and await verification so that they can be added to a block.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OmniLayerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://rest.cryptoapis.io/v2");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    OmniLayerApi apiInstance = new OmniLayerApi(defaultClient);
    String network = "testnet"; // String | Represents the name of the blockchain network used; blockchain networks are usually identical as technology and software, but they differ in data, e.g. - \"mainnet\" is the live network with actual data while networks like \"testnet\", \"ropsten\", \"rinkeby\" are test networks.
    String blockchain = "bitcoin"; // String | Represents the specific blockchain protocol name, e.g. Ethereum, Bitcoin, etc.
    String propertyId = "2"; // String | Represents the identifier of the tokens to send.
    String context = "context_example"; // String | In batch situations the user can use the context to correlate responses with requests. This property is present regardless of whether the response was successful or returned as an error. `context` is specified by the user.
    Integer limit = 50; // Integer | Defines how many items should be returned in the response per page basis.
    Integer offset = 0; // Integer | The starting index of the response items, i.e. where the response should start listing the returned items.
    try {
      ListUnconfirmedOmniTransactionsByPropertyIDResponse result = apiInstance.listUnconfirmedOmniTransactionsByPropertyID(network, blockchain, propertyId, context, limit, offset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OmniLayerApi#listUnconfirmedOmniTransactionsByPropertyID");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **network** | **String**| Represents the name of the blockchain network used; blockchain networks are usually identical as technology and software, but they differ in data, e.g. - \&quot;mainnet\&quot; is the live network with actual data while networks like \&quot;testnet\&quot;, \&quot;ropsten\&quot;, \&quot;rinkeby\&quot; are test networks. | [enum: mainnet, testnet]
 **blockchain** | **String**| Represents the specific blockchain protocol name, e.g. Ethereum, Bitcoin, etc. | [enum: bitcoin]
 **propertyId** | **String**| Represents the identifier of the tokens to send. |
 **context** | **String**| In batch situations the user can use the context to correlate responses with requests. This property is present regardless of whether the response was successful or returned as an error. &#x60;context&#x60; is specified by the user. | [optional]
 **limit** | **Integer**| Defines how many items should be returned in the response per page basis. | [optional] [default to 50]
 **offset** | **Integer**| The starting index of the response items, i.e. where the response should start listing the returned items. | [optional] [default to 0]

### Return type

[**ListUnconfirmedOmniTransactionsByPropertyIDResponse**](ListUnconfirmedOmniTransactionsByPropertyIDResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The request has been successful. |  -  |
**400** | The pagination attributes that have been used are invalid. Please check the Documentation to see details on pagination. |  -  |
**401** | The provided API key is invalid. Please, generate a new one from your Dashboard. |  -  |
**402** | You have insufficient credits. Please upgrade your plan from your Dashboard or contact our team via email. |  -  |
**403** | Mainnets access is not available for your current subscription plan, please upgrade your plan to be able to use it. |  -  |
**409** | The data provided seems to be invalid. |  -  |
**415** | The selected Media Type is unavailable. The Content-Type header should be &#39;application/json&#39;. |  -  |
**422** | Your request body for POST requests must have a structure of { data: { item: [...properties] } } |  -  |
**429** | The request limit has been reached. There can be maximum {requests} requests per {seconds} second(s) made. Please contact our team via email if you need more or upgrade your plan. |  -  |
**500** | An unexpected server error has occurred, we are working to fix this. Please try again later and in case it occurs again please report it to our team via email. |  -  |
