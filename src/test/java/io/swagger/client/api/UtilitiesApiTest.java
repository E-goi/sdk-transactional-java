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
import io.swagger.client.model.EmailValidatorRequest;
import io.swagger.client.model.EmailValidatorResponse;
import io.swagger.client.model.Error400;
import io.swagger.client.model.Error500;
import io.swagger.client.model.HtmlToPdfRequest;
import io.swagger.client.model.HtmlToPdfResponse;
import io.swagger.client.model.PingResponse;
import io.swagger.client.model.SmsLengthCalculatorRequest;
import io.swagger.client.model.SmsLengthCalculatorResponse;
import io.swagger.client.model.ValidatePhoneResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UtilitiesApi
 */
@Ignore
public class UtilitiesApiTest {

    private final UtilitiesApi api = new UtilitiesApi();

    /**
     * Email Validator
     *
     * Validates status and heath of the email address
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void emailValidatorTest() throws ApiException {
        EmailValidatorRequest body = null;
        EmailValidatorResponse response = api.emailValidator(body);

        // TODO: test validations
    }
    /**
     * HTML to PDF converter
     *
     * Converts an HTML input (either via html string or url) to a PDF returned at base 64. Before using, please validate if your HTML content isdone accordingly to the best standards [HERE](https://validator.w3.org/)
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void htmlToPdfTest() throws ApiException {
        HtmlToPdfRequest body = null;
        HtmlToPdfResponse response = api.htmlToPdf(body);

        // TODO: test validations
    }
    /**
     * Ping API
     *
     * Send an innocuous request to the API, in order to confirm its working as intended 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void pingApiTest() throws ApiException {
        PingResponse response = api.pingApi();

        // TODO: test validations
    }
    /**
     * SMS Length Calculator
     *
     * Calculates the sizes of an SMS text
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void smsLengthCalculatorTest() throws ApiException {
        SmsLengthCalculatorRequest body = null;
        SmsLengthCalculatorResponse response = api.smsLengthCalculator(body);

        // TODO: test validations
    }
    /**
     * Validate Phone
     *
     * Checks if a phone number is valid. Can be either land line or mobile
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void validatePhoneTest() throws ApiException {
        String number = null;
        ValidatePhoneResponse response = api.validatePhone(number);

        // TODO: test validations
    }
}
