

# ListOmniTransactionsByAddressResponseItem


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amount** | **String** | Defines the amount of the sent tokens. | 
**divisible** | **Boolean** | Defines whether the attribute can be divisible or not, as boolean. E.g., if it is \&quot;true\&quot;, the attribute is divisible. | 
**minedInBlockHash** | **String** | Represents the hash of the block where this transaction was mined/confirmed for first time. The hash is defined as a cryptographic digital fingerprint made by hashing the block header twice through the SHA256 algorithm. | 
**minedInBlockHeight** | **Integer** | Represents the hight of the block where this transaction was mined/confirmed for first time. The height is defined as the number of blocks in the blockchain preceding this specific block. | 
**propertyId** | **Integer** | Represents the identifier of the tokens to send. | 
**recipients** | [**List&lt;ListOmniTransactionsByAddressResponseItemRecipients&gt;**](ListOmniTransactionsByAddressResponseItemRecipients.md) | Represents an object of addresses that receive the transactions. | 
**senders** | [**List&lt;ListOmniTransactionsByAddressResponseItemSenders&gt;**](ListOmniTransactionsByAddressResponseItemSenders.md) | Represents an object of addresses that provide the funds. | 
**timestamp** | **Integer** | Defines the exact date/time in Unix Timestamp when this transaction was mined, confirmed or first seen in Mempool, if it is unconfirmed. | 
**transactionId** | **String** | Represents the unique identifier of a transaction, i.e. it could be &#x60;transactionId&#x60; in UTXO-based protocols like Bitcoin, and transaction &#x60;hash&#x60; in Ethereum blockchain. | 
**type** | **String** | Defines the type of the transaction as a string. | 
**typeInt** | **Integer** | Defines the type of the transaction as a number. | 
**valid** | **Boolean** | Defines whether the transaction is valid or not, as boolean. E.g. if set to \&quot;true\&quot;, it means the transaction is valid. | 
**version** | **Integer** | Defines the specific version. | 
**fee** | [**ListOmniTransactionsByAddressResponseItemFee**](ListOmniTransactionsByAddressResponseItemFee.md) |  | 


