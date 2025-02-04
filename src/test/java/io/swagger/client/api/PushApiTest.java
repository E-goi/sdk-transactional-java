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
import io.swagger.client.model.Error400;
import io.swagger.client.model.Error401;
import io.swagger.client.model.Error403;
import io.swagger.client.model.Error404;
import io.swagger.client.model.Error500;
import io.swagger.client.model.MobileAppIdResponse;
import io.swagger.client.model.MobileAppRequest;
import io.swagger.client.model.MobileAppResponse;
import io.swagger.client.model.PushTemplateRequest;
import io.swagger.client.model.SendMessageIdResponse;
import io.swagger.client.model.SinglePushTemplateResponse;
import io.swagger.client.model.TemplateIdResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PushApi
 */
@Ignore
public class PushApiTest {

    private final PushApi api = new PushApi();

    /**
     * Create App
     *
     * Creates a new App
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addAppTest() throws ApiException {
        MobileAppRequest body = null;
        TemplateIdResponse response = api.addApp(body);

        // TODO: test validations
    }
    /**
     * Create Push Template
     *
     * Creates a new template record for Push
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addPushTemplateTest() throws ApiException {
        PushTemplateRequest body = null;
        TemplateIdResponse response = api.addPushTemplate(body);

        // TODO: test validations
    }
    /**
     * Remove App
     *
     * Remove App
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteAppTest() throws ApiException {
        String id = null;
        api.deleteApp(id);

        // TODO: test validations
    }
    /**
     * Remove Push Template
     *
     * Remove Push Template
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deletePushTemplateTest() throws ApiException {
        String id = null;
        api.deletePushTemplate(id);

        // TODO: test validations
    }
    /**
     * Get an App
     *
     * Gets an App
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listAppTest() throws ApiException {
        String id = null;
        MobileAppIdResponse response = api.listApp(id);

        // TODO: test validations
    }
    /**
     * Get All Apps
     *
     * Obtains all the Apps
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listAppsTest() throws ApiException {
        List<MobileAppResponse> response = api.listApps();

        // TODO: test validations
    }
    /**
     * Get an Push Template
     *
     * Gets an Push Template
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listPushTemplateTest() throws ApiException {
        String id = null;
        SinglePushTemplateResponse response = api.listPushTemplate(id);

        // TODO: test validations
    }
    /**
     * Get All Push Templates
     *
     * Obtains all the Push templates
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listPushTemplatesTest() throws ApiException {
        List<SinglePushTemplateResponse> response = api.listPushTemplates();

        // TODO: test validations
    }
    /**
     * Send a Push Message
     *
     * Send an push message to a recipient
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void sendPushMessagesTest() throws ApiException {
        List<Object> body = null;
        List<SendMessageIdResponse> response = api.sendPushMessages(body);

        // TODO: test validations
    }
    /**
     * Update App
     *
     * Updates an App, given a template id
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateAppTest() throws ApiException {
        String id = null;
        MobileAppRequest body = null;
        MobileAppIdResponse response = api.updateApp(id, body);

        // TODO: test validations
    }
    /**
     * Update Push Template
     *
     * Updates an Push template, given a template id
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updatePushTemplateTest() throws ApiException {
        String id = null;
        PushTemplateRequest body = null;
        SinglePushTemplateResponse response = api.updatePushTemplate(id, body);

        // TODO: test validations
    }
}
