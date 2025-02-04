/*
 * Transactional API
 * # Introduction    This API is a service provided by [E-goi](www.e-goi.com) to send transactional messages.    Transactional Messaging is a 1-to-1 communication channel, usually from an organization directed to a specific consumer.   They can be triggered by:    * __Actions__ - The consumer interacts with the organization (ie.: online shopping);  * __Time__ - The consumer's actions are time-bounded by the organization (ie.: period of inactivity).    Because of the nature of these messages,   it is expected that the consumer is interested in the content of these messages.   Therefore, they have a different treatment from marketing messages, and have a higher acceptance and opening rate.    >DISCLAIMER  >  >Please notice that this platform is more delicate in regards to the nature and processing of its messages.  >  >It should NOT be used as a mean of mass marketing, scams, phishing or overall unruly behaviour.   >  >Failure to comply may lead to limitation of use and even termination of account.    ***
 *
 * OpenAPI spec version: V2
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.CheckVerifyResponse;
import io.swagger.client.model.Error400;
import io.swagger.client.model.Error401;
import io.swagger.client.model.Error403;
import io.swagger.client.model.Error404;
import io.swagger.client.model.Error500;
import io.swagger.client.model.ValidateCodeVerifyRequest;
import io.swagger.client.model.VerifyIdResponse;
import io.swagger.client.model.VerifyRequest;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for VerifyApi
 */
@Ignore
public class VerifyApiTest {

    private final VerifyApi api = new VerifyApi();

    /**
     * Cancel Verify Request
     *
     * This method will cancel the requested verify. No codes will be further generated or confirmed within the context of the id of the message
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cancelVerifyTest() throws ApiException {
        String id = null;
        List<VerifyIdResponse> response = api.cancelVerify(id);

        // TODO: test validations
    }
    /**
     * Get Verify Request
     *
     * This method gets a verify requests, including status of it
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getVerifyTest() throws ApiException {
        String id = null;
        CheckVerifyResponse response = api.getVerify(id);

        // TODO: test validations
    }
    /**
     * Request Verify
     *
     * This method will generate a code and send a message with it to a recipient
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void requestVerifyTest() throws ApiException {
        VerifyRequest body = null;
        VerifyIdResponse response = api.requestVerify(body);

        // TODO: test validations
    }
    /**
     * Resend Verify Code
     *
     * This method will resend the requested verify. A new code will be generated and sent to the recipient
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void resendVerifyTest() throws ApiException {
        String id = null;
        List<VerifyIdResponse> response = api.resendVerify(id);

        // TODO: test validations
    }
    /**
     * Validate Verify Code
     *
     * This method validates the code submitted by the recipient. This request should be made by the sender of the Verify request
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void validateVerifyCodeTest() throws ApiException {
        String id = null;
        ValidateCodeVerifyRequest body = null;
        List<VerifyIdResponse> response = api.validateVerifyCode(id, body);

        // TODO: test validations
    }
}
