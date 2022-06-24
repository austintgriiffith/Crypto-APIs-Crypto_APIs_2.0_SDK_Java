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
import org.openapitools.client.model.AddTokensToExistingFromAddress400Response;
import org.openapitools.client.model.AddTokensToExistingFromAddress401Response;
import org.openapitools.client.model.AddTokensToExistingFromAddress403Response;
import org.openapitools.client.model.AddTokensToExistingFromAddressR;
import org.openapitools.client.model.AddTokensToExistingFromAddressRB;
import org.openapitools.client.model.CreateAutomaticTokensForwarding400Response;
import org.openapitools.client.model.CreateAutomaticTokensForwarding401Response;
import org.openapitools.client.model.CreateAutomaticTokensForwarding403Response;
import org.openapitools.client.model.CreateAutomaticTokensForwardingR;
import org.openapitools.client.model.CreateAutomaticTokensForwardingRB;
import org.openapitools.client.model.DeleteAutomaticTokensForwarding400Response;
import org.openapitools.client.model.DeleteAutomaticTokensForwarding401Response;
import org.openapitools.client.model.DeleteAutomaticTokensForwarding403Response;
import org.openapitools.client.model.DeleteAutomaticTokensForwardingR;
import org.openapitools.client.model.GetAddressDetails402Response;
import org.openapitools.client.model.GetAddressDetails409Response;
import org.openapitools.client.model.GetAddressDetails415Response;
import org.openapitools.client.model.GetAddressDetails422Response;
import org.openapitools.client.model.GetAddressDetails429Response;
import org.openapitools.client.model.GetAddressDetails500Response;
import org.openapitools.client.model.GetFeeAddressDetails400Response;
import org.openapitools.client.model.GetFeeAddressDetails401Response;
import org.openapitools.client.model.GetFeeAddressDetails403Response;
import org.openapitools.client.model.GetFeeAddressDetailsR;
import org.openapitools.client.model.GetXRPRippleTransactionDetailsByTransactionID404Response;
import org.openapitools.client.model.ListTokensForwardingAutomations400Response;
import org.openapitools.client.model.ListTokensForwardingAutomations401Response;
import org.openapitools.client.model.ListTokensForwardingAutomations403Response;
import org.openapitools.client.model.ListTokensForwardingAutomationsR;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AutomaticTokensForwardingApi
 */
@Disabled
public class AutomaticTokensForwardingApiTest {

    private final AutomaticTokensForwardingApi api = new AutomaticTokensForwardingApi();

    /**
     * Add Tokens To Existing fromAddress
     *
     * Through this endpoint customers can add **Automatic Tokens forwardings** to an already existing &#x60;fromAddress&#x60;. Unlike the \&quot;Create Automatic Tokens Forwarding\&quot; endpoint, where the &#x60;fromAddress&#x60; is generated each time, with this endpoint customers can add an automation from another token to one and the same &#x60;fromAddress&#x60;.    The &#x60;fromAddress&#x60; can be used as a deposit address. Any funds received by this address will be automatically forwarded to &#x60;toAddress&#x60; based on what the customer has set for the automation. The  &#x60;toAddress&#x60; is essentially the main address and destination for the automatic tokens forwarding.    There is also a &#x60;minimumTransferAmount&#x60; which only when reached will then trigger the forwarding. Through this the customer can save from fees.    Moreover, &#x60;feePriority&#x60; can be also set,  which defines how quickly to move the tokens once they are received. The higher priority, the larger the fee will be. It can be \&quot;SLOW\&quot;, \&quot;STANDARD\&quot; or \&quot;FAST\&quot;.    For this automatic forwarding the customer can set a callback subscription.    {warning}Currently we support fungible tokens (ERC-20) **only**, NFTs (ERC-721) are **not** supported.{/warning}    {warning}The subscription will work for all incoming transactions until it is deleted. There is no need to do that for every transaction.{/warning}
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addTokensToExistingFromAddressTest() throws ApiException {
        String blockchain = null;
        String network = null;
        String context = null;
        AddTokensToExistingFromAddressRB addTokensToExistingFromAddressRB = null;
        AddTokensToExistingFromAddressR response = api.addTokensToExistingFromAddress(blockchain, network, context, addTokensToExistingFromAddressRB);
        // TODO: test validations
    }

    /**
     * Create Automatic Tokens Forwarding
     *
     * Through this endpoint customers can set up an automatic forwarding function specifically for tokens (**not** coins). They can have a &#x60;toAddress&#x60; which is essentially the main address and the destination for the automatic tokens forwarding.     There is also a &#x60;minimumTransferAmount&#x60; which only when reached will then trigger the forwarding. Through this the customer can save from fees.    Moreover, &#x60;feePriority&#x60; can be also set,  which defines how quickly to move the tokens once they are received. The higher priority, the larger the fee will be. It can be \&quot;SLOW\&quot;, \&quot;STANDARD\&quot; or \&quot;FAST\&quot;.    The response of this endpoint contains an attribute &#x60;fromAddress&#x60; which can be used as a deposit address. Any funds received by this address will be automatically forwarded to &#x60;toAddress&#x60; based on what the customer has set for the automation.    For this automatic forwarding the customer can set a callback subscription.    {warning}Currently we support fungible tokens (ERC-20) **only**, NFTs (ERC-721) are **not** supported.{/warning}    {warning}The subscription will work for all incoming transactions until it is deleted. There is no need to do that for every transaction.{/warning}    {note}This endpoint generates a new &#x60;fromAddress&#x60; each time.{/note}
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createAutomaticTokensForwardingTest() throws ApiException {
        String blockchain = null;
        String network = null;
        String context = null;
        CreateAutomaticTokensForwardingRB createAutomaticTokensForwardingRB = null;
        CreateAutomaticTokensForwardingR response = api.createAutomaticTokensForwarding(blockchain, network, context, createAutomaticTokensForwardingRB);
        // TODO: test validations
    }

    /**
     * Delete Automatic Tokens Forwarding
     *
     * Through this endpoint customers can delete a forwarding function they have set for **tokens** (**not** coins).    By setting a &#x60;fromAddress&#x60; and a &#x60;toAddress&#x60;, and specifying the amount, tokens can be transferred between addresses.     A &#x60;feePriority&#x60; will be returned which represents the fee priority of the automation whether it is \&quot;SLOW\&quot;, \&quot;STANDARD\&quot; OR \&quot;FAST\&quot;.    {warning}Currently we support fungible tokens (ERC-20) **only**, NFTs (ERC-721) are **not** supported.{/warning}    {warning}The subscription will work for all incoming transactions until it is deleted. There is no need to do that for every transaction.{/warning}
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteAutomaticTokensForwardingTest() throws ApiException {
        String blockchain = null;
        String network = null;
        String referenceId = null;
        String context = null;
        DeleteAutomaticTokensForwardingR response = api.deleteAutomaticTokensForwarding(blockchain, network, referenceId, context);
        // TODO: test validations
    }

    /**
     * Get Fee Address Details
     *
     * Through this endpoint customers can obtain details about a fee address. Only one fee address per currency per network for a user&#39;s account can be set no matter how many tokens or subscriptions they have or want to automatically forward.    {warning}Currently we support fungible tokens (ERC-20) **only**, NFTs (ERC-721) are **not** supported.{/warning}
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getFeeAddressDetailsTest() throws ApiException {
        String blockchain = null;
        String network = null;
        String context = null;
        GetFeeAddressDetailsR response = api.getFeeAddressDetails(blockchain, network, context);
        // TODO: test validations
    }

    /**
     * List Tokens Forwarding Automations
     *
     * Through this endpoint customers can list all of their **tokens** forwarding automations (**not** coins).    Customers can set up automatic forwarding functions for tokens by setting a &#x60;fromAddress&#x60; and a &#x60;toAddress&#x60;, and specifying the amount that can be transferred between addresses.     A &#x60;feePriority&#x60; will be returned which represents the fee priority of the automation whether it is \&quot;SLOW\&quot;, \&quot;STANDARD\&quot; OR \&quot;FAST\&quot;.     {warning}Currently we support fungible tokens (ERC-20) **only**, NFTs (ERC-721) are **not** supported.{/warning}    {warning}The subscription will work for all transactions until it is deleted. There is no need to do that for every transaction.{/warning}
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listTokensForwardingAutomationsTest() throws ApiException {
        String blockchain = null;
        String network = null;
        String context = null;
        Integer limit = null;
        Integer offset = null;
        ListTokensForwardingAutomationsR response = api.listTokensForwardingAutomations(blockchain, network, context, limit, offset);
        // TODO: test validations
    }

}
