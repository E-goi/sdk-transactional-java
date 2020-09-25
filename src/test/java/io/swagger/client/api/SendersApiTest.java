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
import io.swagger.client.model.EmailSenderResponse;
import io.swagger.client.model.Error401;
import io.swagger.client.model.Error403;
import io.swagger.client.model.Error500;
import io.swagger.client.model.SmsSenderResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SendersApi
 */
@Ignore
public class SendersApiTest {

    private final SendersApi api = new SendersApi();

    /**
     * Get All Email Senders
     *
     * Retrieve the list of available Email senders
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getEmailSendersTest() throws ApiException {
        List<EmailSenderResponse> response = api.getEmailSenders();

        // TODO: test validations
    }
    /**
     * Get All Sms Senders
     *
     * Return all Sms Senders defined by the user
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSmsSendersTest() throws ApiException {
        List<SmsSenderResponse> response = api.getSmsSenders();

        // TODO: test validations
    }
}
