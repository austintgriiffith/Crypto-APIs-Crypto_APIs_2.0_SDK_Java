

# ListAllUnconfirmedTransactionsRI


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**recipients** | [**List&lt;ListUnconfirmedTransactionsByAddressRIRecipientsInner&gt;**](ListUnconfirmedTransactionsByAddressRIRecipientsInner.md) | Represents a list of recipient addresses with the respective amounts. In account-based protocols like Ethereum there is only one address in this list. |  |
|**senders** | [**List&lt;ListUnconfirmedTransactionsByAddressRISendersInner&gt;**](ListUnconfirmedTransactionsByAddressRISendersInner.md) | Represents a list of sender addresses with the respective amounts. In account-based protocols like Ethereum there is only one address in this list. |  |
|**timestamp** | **Integer** | Defines the exact date/time in Unix Timestamp when this transaction was mined, confirmed or first seen in Mempool, if it is unconfirmed. |  |
|**transactionHash** | **String** | String representation of the transaction hash |  |
|**transactionId** | **String** | Represents the unique identifier of a transaction, i.e. it could be &#x60;transactionId&#x60; in UTXO-based protocols like Bitcoin, and transaction &#x60;hash&#x60; in Ethereum blockchain. |  |
|**blockchainSpecific** | [**ListAllUnconfirmedTransactionsRIBS**](ListAllUnconfirmedTransactionsRIBS.md) |  |  |



