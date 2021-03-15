/*
 * Fulfillment API
 * Use the Fulfillment API to complete the process of packaging, addressing, handling, and shipping each order on behalf of the seller, in accordance with the payment method and timing specified at checkout.
 *
 * OpenAPI spec version: v1.19.3
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.AcceptPaymentDisputeRequest;
import io.swagger.client.model.AddEvidencePaymentDisputeRequest;
import io.swagger.client.model.AddEvidencePaymentDisputeResponse;
import io.swagger.client.model.ContestPaymentDisputeRequest;
import io.swagger.client.model.DisputeSummaryResponse;
import io.swagger.client.model.FileEvidence;
import io.swagger.client.model.PaymentDispute;
import io.swagger.client.model.PaymentDisputeActivityHistory;
import io.swagger.client.model.UpdateEvidencePaymentDisputeRequest;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PaymentDisputeApi
 */
@Ignore
public class PaymentDisputeApiTest {

    private final PaymentDisputeApi api = new PaymentDisputeApi();

    /**
     * Accept Payment Dispute
     *
     * This method is used if the seller wishes to accept a payment dispute. The unique identifier of the payment dispute is passed in as a path parameter, and unique identifiers for payment disputes can be retrieved with the getPaymentDisputeSummaries method. The revision field in the request payload is required, and the returnAddress field should be supplied if the seller is expecting the buyer to return the item. See the Request Payload section for more information on theste fields.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void acceptPaymentDisputeTest() throws ApiException {
        String paymentDisputeId = null;
        AcceptPaymentDisputeRequest body = null;
        api.acceptPaymentDispute(paymentDisputeId, body);

        // TODO: test validations
    }
    /**
     * Add an Evidence File
     *
     * This method is used by the seller to add one or more evidence files to address a payment dispute initiated by the buyer. The unique identifier of the payment dispute is passed in as a path parameter, and unique identifiers for payment disputes can be retrieved with the getPaymentDisputeSummaries method. Note: All evidence files should be uploaded using addEvidence and updateEvidence before the seller decides to contest the payment dispute. Once the seller has officially contested the dispute (using contestPaymentDispute or through My eBay), the addEvidence and updateEvidence methods can no longer be used. In the evidenceRequests array of the getPaymentDispute response, eBay prompts the seller with the type of evidence file(s) that will be needed to contest the payment dispute. The file(s) to add are identified through the files array in the request payload. Adding one or more new evidence files for a payment dispute triggers the creation of an evidence file, and the unique identifier for the new evidence file is automatically generated and returned in the evidenceId field of the addEvidence response payload upon a successful call. The type of evidence being added should be specified in the evidenceType field. All files being added (if more than one) should correspond to this evidence type. Upon a successful call, an evidenceId value is returned in the response. This indicates that a new evidence set has been created for the payment dispute, and this evidence set includes the evidence file(s) that were passed in to the fileId array. The evidenceId value will be needed if the seller wishes to add to the evidence set by using the updateEvidence method, or if they want to retrieve a specific evidence file within the evidence set by using the fetchEvidenceContent method.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addEvidenceTest() throws ApiException {
        String paymentDisputeId = null;
        AddEvidencePaymentDisputeRequest body = null;
        AddEvidencePaymentDisputeResponse response = api.addEvidence(paymentDisputeId, body);

        // TODO: test validations
    }
    /**
     * Contest Payment Dispute
     *
     * This method is used if the seller wishes to contest a payment dispute initiated by the buyer. The unique identifier of the payment dispute is passed in as a path parameter, and unique identifiers for payment disputes can be retrieved with the getPaymentDisputeSummaries method. Note: Before contesting a payment dispute, the seller must upload all evidence files using the addEvidence and updateEvidence methods. Once the seller has officially contested the dispute (using contestPaymentDispute), the addEvidence and updateEvidence methods can no longer be used. In the evidenceRequests array of the getPaymentDispute response, eBay prompts the seller with the type of evidence file(s) that will be needed to contest the payment dispute. If a seller decides to contest a payment dispute, that seller should be prepared to provide evidential documents such as proof of delivery, proof of authentication, or other documents. The type of evidential documents that the seller will provide will depend on why the buyer initiated the payment dispute. The revision field in the request payload is required, and the returnAddress field should be supplied if the seller is expecting the buyer to return the item. See the Request Payload section for more information on theste fields.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void contestPaymentDisputeTest() throws ApiException {
        String paymentDisputeId = null;
        ContestPaymentDisputeRequest body = null;
        api.contestPaymentDispute(paymentDisputeId, body);

        // TODO: test validations
    }
    /**
     * Get Payment Dispute Evidence File
     *
     * This call retrieves a specific evidence file for a payment dispute. The following three identifying parameters are needed in the call URI: payment_dispute_id: the identifier of the payment dispute. The identifier of each payment dispute is returned in the getPaymentDisputeSummaries response. evidence_id: the identifier of the evidential file set. The identifier of an evidential file set for a payment dispute is returned under the evidence array in the getPaymentDispute response. file_id: the identifier of an evidential file. This file must belong to the evidential file set identified through the evidence_id query parameter. The identifier of each evidential file is returned under the evidence.files array in the getPaymentDispute response. An actual binary file is returned if the call is successful. An error will occur if any of three identifiers are invalid.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void fetchEvidenceContentTest() throws ApiException {
        String paymentDisputeId = null;
        String evidenceId = null;
        String fileId = null;
        List<String> response = api.fetchEvidenceContent(paymentDisputeId, evidenceId, fileId);

        // TODO: test validations
    }
    /**
     * Get Payment Dispute Activity
     *
     * This method retrieve a log of activity for a payment dispute. The identifier of the payment dispute is passed in as a path parameter. The output includes a timestamp for each action of the payment dispute, from creation to resolution, and all steps in between.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getActivitiesTest() throws ApiException {
        String paymentDisputeId = null;
        PaymentDisputeActivityHistory response = api.getActivities(paymentDisputeId);

        // TODO: test validations
    }
    /**
     * Get Payment Dispute Details
     *
     * This method retrieves detailed information on a specific payment dispute. The payment dispute identifier is passed in as path parameter at the end of the call URI. Below is a summary of the information that is retrieved: Current status of payment dispute Amount of the payment dispute Reason the payment dispute was opened Order and line items associated with the payment dispute Seller response options if an action is currently required on the payment dispute Details on the results of the payment dispute if it has been closed Details on any evidence that was provided by the seller to fight the payment dispute
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPaymentDisputeTest() throws ApiException {
        String paymentDisputeId = null;
        PaymentDispute response = api.getPaymentDispute(paymentDisputeId);

        // TODO: test validations
    }
    /**
     * Search Payment Dispute by Filters
     *
     * This method is used retrieve one or more payment disputes filed against the seller. These payment disputes can be open or recently closed. The following filter types are available in the request payload to control the payment disputes that are returned: Dispute filed against a specific order (order_id parameter is used) Dispute(s) filed by a specific buyer (buyer_username parameter is used) Dispute(s) filed within a specific date range (open_date_from and/or open_date_to parameters are used) Disputes in a specific state (payment_dispute_status parameter is used)More than one of these filter types can be used together. See the request payload request fields for more information about how each filter is used. If none of the filters are used, all open and recently closed payment disputes are returned. Pagination is also available. See the limit and offset fields for more information on how pagination is used for this method.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPaymentDisputeSummariesTest() throws ApiException {
        String orderId = null;
        String buyerUsername = null;
        String openDateFrom = null;
        String openDateTo = null;
        String paymentDisputeStatus = null;
        String limit = null;
        String offset = null;
        DisputeSummaryResponse response = api.getPaymentDisputeSummaries(orderId, buyerUsername, openDateFrom, openDateTo, paymentDisputeStatus, limit, offset);

        // TODO: test validations
    }
    /**
     * Update evidence
     *
     * This method is used by the seller to update an existing evidence set for a payment dispute with one or more evidence files. The unique identifier of the payment dispute is passed in as a path parameter, and unique identifiers for payment disputes can be retrieved with the getPaymentDisputeSummaries method. Note: All evidence files should be uploaded using addEvidence and updateEvidence before the seller decides to contest the payment dispute. Once the seller has officially contested the dispute (using contestPaymentDispute or through My eBay), the addEvidence and updateEvidence methods can no longer be used. In the evidenceRequests array of the getPaymentDispute response, eBay prompts the seller with the type of evidence file(s) that will be needed to contest the payment dispute. The unique identifier of the evidence set to update is specified through the evidenceId field, and the file(s) to add are identified through the files array in the request payload. The unique identifier for an evidence file is automatically generated and returned in the fileId field of the uploadEvidence response payload upon a successful call. Sellers must make sure to capture the fileId value for each evidence file that is uploaded with the uploadEvidence method. The type of evidence being added should be specified in the evidenceType field. All files being added (if more than one) should correspond to this evidence type. Upon a successful call, an http status code of 204 Success is returned. There is no response payload unless an error occurs. To verify that a new file is a part of the evidence set, the seller can use the fetchEvidenceContent method, passing in the proper evidenceId and fileId values.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateEvidenceTest() throws ApiException {
        String paymentDisputeId = null;
        UpdateEvidencePaymentDisputeRequest body = null;
        api.updateEvidence(paymentDisputeId, body);

        // TODO: test validations
    }
    /**
     * Upload an Evidence File
     *
     * This method is used to upload an evidence file for a contested payment dispute. The unique identifier of the payment dispute is passed in as a path parameter, and unique identifiers for payment disputes can be retrieved with the getPaymentDisputeSummaries method. The uploadEvidenceFile only uploads an encrypted, binary image file (using multipart/form-data HTTP request header), and does not have a request payload. The three image formats supported at this time are .JPEG, .JPG, and .PNG. Once the file is successfully uploaded, the seller will need to grab the fileId value in the response payload to add this file to a new evidence set using the addEvidence method, or to add this file to an existing evidence set using the updateEvidence method.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void uploadEvidenceFileTest() throws ApiException {
        String paymentDisputeId = null;
        FileEvidence response = api.uploadEvidenceFile(paymentDisputeId);

        // TODO: test validations
    }
}
