

# ListWalletTransactionsRI


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**direction** | **String** | Defines the direction of the transaction, e.g. incoming. |  |
|**fee** | [**ListWalletTransactionsRIFee**](ListWalletTransactionsRIFee.md) |  |  |
|**fungibleTokens** | [**List&lt;ListWalletTransactionsRIFungibleTokensInner&gt;**](ListWalletTransactionsRIFungibleTokensInner.md) | Represents fungible tokens&#39;es detailed information |  [optional] |
|**internalTransactions** | [**List&lt;ListWalletTransactionsRIInternalTransactionsInner&gt;**](ListWalletTransactionsRIInternalTransactionsInner.md) |  |  [optional] |
|**nonFungibleTokens** | [**List&lt;ListWalletTransactionsRINonFungibleTokensInner&gt;**](ListWalletTransactionsRINonFungibleTokensInner.md) | Represents non-fungible tokens&#39;es detailed information. |  [optional] |
|**recipients** | [**List&lt;ListWalletTransactionsRIRecipientsInner&gt;**](ListWalletTransactionsRIRecipientsInner.md) | Represents a list of recipient addresses with the respective amounts. In account-based protocols like Ethereum there is only one address in this list. |  |
|**senders** | [**List&lt;ListWalletTransactionsRISendersInner&gt;**](ListWalletTransactionsRISendersInner.md) | Represents a list of sender addresses with the respective amounts. In account-based protocols like Ethereum there is only one address in this list. |  |
|**status** | **String** | Defines the status of the transaction, if it is confirmed or unconfirmed. |  |
|**timestamp** | **Integer** | Defines the exact date/time in Unix Timestamp when this transaction was mined, confirmed or first seen in Mempool, if it is unconfirmed. |  |
|**transactionId** | **String** | Represents the unique TD of the transaction. |  |
|**value** | [**ListWalletTransactionsRIValue**](ListWalletTransactionsRIValue.md) |  |  |



