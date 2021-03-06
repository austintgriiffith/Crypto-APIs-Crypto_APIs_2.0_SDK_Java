

# NewConfirmedTokenTransactionsForSpecificAmountRBDataItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**allowDuplicates** | **Boolean** | Specifies a flag that permits or denies the creation of duplicate addresses. |  [optional] |
|**amountHigherThan** | **Long** | Represents a specific amount of tokens after which the system have to send a callback to customers&#39; callbackUrl. |  |
|**callbackSecretKey** | **String** | Represents the Secret Key value provided by the customer. This field is used for security purposes during the callback notification, in order to prove the sender of the callback as Crypto APIs 2.0. For more information please see our [Documentation](https://developers.cryptoapis.io/technical-documentation/general-information/callbacks#callback-security). |  [optional] |
|**callbackUrl** | **String** | Represents the URL that is set by the customer where the callback will be received at. The callback notification will be received only if and when the event occurs. &#x60;We support ONLY httpS type of protocol&#x60;. |  |
|**contractAddress** | **String** | Represents the contract address of the token, which controls its logic. It is not the address that holds the tokens. |  |



