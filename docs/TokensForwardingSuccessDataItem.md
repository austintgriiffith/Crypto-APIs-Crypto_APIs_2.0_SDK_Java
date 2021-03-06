

# TokensForwardingSuccessDataItem

Defines an `item` as one result.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**blockchain** | **String** | Represents the specific blockchain protocol name, e.g. Ethereum, Bitcoin, etc. |  |
|**network** | **String** | Represents the name of the blockchain network used; blockchain networks are usually identical as technology and software, but they differ in data, e.g. - \&quot;mainnet\&quot; is the live network with actual data while networks like \&quot;testnet\&quot;, \&quot;ropsten\&quot; are test networks. |  |
|**fromAddress** | **String** | Represents the hash of the address that provides the tokens. |  |
|**toAddress** | **String** | Represents the hash of the address to forward the tokens to. |  |
|**spentFeesAmount** | **String** | Represents the amount of the fee spent for the tokens to be forwarded. |  |
|**spentFeesUnit** | **String** | Represents the unit of the fee spent for the tokens to be forwarded, e.g. BTC. |  |
|**triggerTransactionId** | **String** | Defines the unique Transaction ID that triggered the token forwarding. |  |
|**forwardingTransactionId** | **String** | Defines the unique Transaction ID that forwarded the tokens. |  |
|**tokenType** | [**TokenTypeEnum**](#TokenTypeEnum) | Defines the type of token sent with the transaction, e.g. ERC 20. |  |
|**token** | [**TokensForwardingSuccessToken**](TokensForwardingSuccessToken.md) |  |  |



## Enum: TokenTypeEnum

| Name | Value |
|---- | -----|
| ERC_20 | &quot;ERC-20&quot; |
| ERC_721 | &quot;ERC-721&quot; |
| OMNI | &quot;OMNI&quot; |



