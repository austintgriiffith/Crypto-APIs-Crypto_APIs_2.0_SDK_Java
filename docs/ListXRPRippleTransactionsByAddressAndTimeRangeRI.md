

# ListXRPRippleTransactionsByAddressAndTimeRangeRI


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**destinationTag** | **Long** | A destination tag is a value used to discern the holder of the Ripple (XRP) being deposited or withdrawn. |  [optional] |
|**index** | **Integer** | Represents the index position of the transaction in the block. |  |
|**minedInBlockHash** | **String** | Represents the hash of the block where this transaction was mined/confirmed for first time. The hash is defined as a cryptographic digital fingerprint made by hashing the block header twice through the SHA256 algorithm. |  |
|**minedInBlockHeight** | **Integer** | Represents the hight of the block where this transaction was mined/confirmed for first time. The height is defined as the number of blocks in the blockchain preceding this specific block. |  |
|**recipients** | [**List&lt;GetXRPRippleTransactionDetailsByTransactionIDRIRecipientsInner&gt;**](GetXRPRippleTransactionDetailsByTransactionIDRIRecipientsInner.md) | Represents an object of addresses that receive the transactions. |  |
|**senders** | [**List&lt;GetXRPRippleTransactionDetailsByTransactionIDRISendersInner&gt;**](GetXRPRippleTransactionDetailsByTransactionIDRISendersInner.md) | Represents an object of addresses that provide the funds. |  |
|**sequence** | **Long** | Defines the transaction input&#39;s sequence as an integer, which is is used when transactions are replaced with newer versions before LockTime. |  |
|**status** | **String** | Defines the status of the transaction. |  |
|**timestamp** | **Integer** | Defines the exact date/time in Unix Timestamp when this transaction was mined, confirmed or first seen in Mempool, if it is unconfirmed. |  |
|**transactionHash** | **String** | Represents the hash of the XRP transaction. |  |
|**type** | **String** | Specifies the type of the transaction. |  |
|**fee** | [**ListXRPRippleTransactionsByAddressRIFee**](ListXRPRippleTransactionsByAddressRIFee.md) |  |  |
|**offer** | [**ListXRPRippleTransactionsByAddressRIOffer**](ListXRPRippleTransactionsByAddressRIOffer.md) |  |  |
|**receive** | [**ListXRPRippleTransactionsByAddressRIReceive**](ListXRPRippleTransactionsByAddressRIReceive.md) |  |  |
|**value** | [**ListXRPRippleTransactionsByAddressRIValue**](ListXRPRippleTransactionsByAddressRIValue.md) |  |  |



