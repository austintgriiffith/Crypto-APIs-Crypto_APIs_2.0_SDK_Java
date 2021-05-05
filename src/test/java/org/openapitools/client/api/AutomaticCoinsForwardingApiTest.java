/*
 * Crypto APIs
 * Crypto APIs 2.0 is a complex and innovative infrastructure layer that radically simplifies the development of any Blockchain and Crypto related applications. Organized around REST, Crypto APIs 2.0 can assist both novice Bitcoin/Ethereum enthusiasts and crypto experts with the development of their blockchain applications. Crypto APIs 2.0 provides unified endpoints and data, raw data, automatic tokens and coins forwardings, callback functionalities, and much more.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: bizdev@cryptoapis.io
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.model.AlreadyExists;
import org.openapitools.client.model.CoinsForwardingAutomationsLimitReached;
import org.openapitools.client.model.CreateAutomaticCoinsForwardingRequestBody;
import org.openapitools.client.model.CreateAutomaticCoinsForwardingResponse;
import org.openapitools.client.model.DeleteAutomaticCoinsForwardingResponse;
import org.openapitools.client.model.FeatureMainnetsNotAllowedForPlan;
import org.openapitools.client.model.InsufficientCredits;
import org.openapitools.client.model.InvalidApiKey;
import org.openapitools.client.model.InvalidData;
import org.openapitools.client.model.InvalidPagination;
import org.openapitools.client.model.InvalidRequestBodyStructure;
import org.openapitools.client.model.ListCoinsForwardingAutomationsResponse;
import org.openapitools.client.model.RequestLimitReached;
import org.openapitools.client.model.ResourceNotFound;
import org.openapitools.client.model.UnexpectedServerError;
import org.openapitools.client.model.UnsupportedMediaType;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AutomaticCoinsForwardingApi
 */
@Ignore
public class AutomaticCoinsForwardingApiTest {

    private final AutomaticCoinsForwardingApi api = new AutomaticCoinsForwardingApi();

    
    /**
     * Create Automatic Coins Forwarding
     *
     * Through this endpoint customers can set up an automatic forwarding function specifically for coins (**not** tokens). They can have a &#x60;toAddress&#x60; which is essentially the main address and the destination for the automatic coins forwarding.     There is also a &#x60;minimumTransferAmount&#x60; which only when reached will then trigger the forwarding. Through this the customer can save from fees.    Moreover, &#x60;feePriority&#x60; can be also set,  which defines how quickly to move the coins once they are received. The higher priority, the larger the fee will be. It can be \&quot;SLOW\&quot;, \&quot;STANDARD\&quot; or \&quot;FAST\&quot;.    The response of this endpoint contains an attribute &#x60;fromAddress&#x60; which can be used as a deposit address. Any funds received by this address will be automatically forwarded to &#x60;toAddress&#x60; based on what the customer has set for the automation.    For this automatic forwarding the customer can set a callback subscription.    {warning}The subscription will work for all incoming transactions until it is deleted. There is no need to do that for every transaction.{/warning}    {note}This endpoint generates a new &#x60;fromAddress&#x60; each time.{/note}
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createAutomaticCoinsForwardingTest() throws ApiException {
        String blockchain = null;
        String network = null;
        String context = null;
        CreateAutomaticCoinsForwardingRequestBody createAutomaticCoinsForwardingRequestBody = null;
        CreateAutomaticCoinsForwardingResponse response = api.createAutomaticCoinsForwarding(blockchain, network, context, createAutomaticCoinsForwardingRequestBody);

        // TODO: test validations
    }
    
    /**
     * Delete Automatic Coins Forwarding
     *
     * Through this endpoint customers can delete a forwarding function they have set for **coins** (**not** tokens).    By setting a &#x60;fromAddress&#x60; and a &#x60;toAddress&#x60;, and specifying the amount, coins can be transferred between addresses.     A &#x60;feePriority&#x60; will be returned which represents the fee priority of the automation whether it is \&quot;SLOW\&quot;, \&quot;STANDARD\&quot; OR \&quot;FAST\&quot;.    {warning}The subscription will work for all incoming transactions until it is deleted. There is no need to do that for every transaction.{/warning}
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteAutomaticCoinsForwardingTest() throws ApiException {
        String blockchain = null;
        String network = null;
        String referenceId = null;
        String context = null;
        DeleteAutomaticCoinsForwardingResponse response = api.deleteAutomaticCoinsForwarding(blockchain, network, referenceId, context);

        // TODO: test validations
    }
    
    /**
     * List Coins Forwarding Automations
     *
     * Through this endpoint customers can list all of their **coins** forwarding automations (**not** tokens).    Customers can set up automatic forwarding functions for coins by setting a &#x60;fromAddress&#x60; and a &#x60;toAddress&#x60;, and specifying the amount that can be transferred between addresses.     A &#x60;feePriority&#x60; will be returned which represents the fee priority of the automation whether it is \&quot;SLOW\&quot;, \&quot;STANDARD\&quot; OR \&quot;FAST\&quot;.    {warning}The subscription will work for all incoming transactions until it is deleted. There is no need to do that for every transaction.{/warning}
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listCoinsForwardingAutomationsTest() throws ApiException {
        String blockchain = null;
        String network = null;
        String context = null;
        Integer limit = null;
        Integer offset = null;
        ListCoinsForwardingAutomationsResponse response = api.listCoinsForwardingAutomations(blockchain, network, context, limit, offset);

        // TODO: test validations
    }
    
}