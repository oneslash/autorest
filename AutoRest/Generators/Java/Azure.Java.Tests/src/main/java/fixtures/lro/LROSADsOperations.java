/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 * 
 * Code generated by Microsoft (R) AutoRest Code Generator 0.13.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.lro;

import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceException;
import com.microsoft.rest.ServiceResponse;
import com.squareup.okhttp.ResponseBody;
import fixtures.lro.models.Product;
import java.io.IOException;
import java.lang.InterruptedException;
import retrofit.Call;
import retrofit.http.Body;
import retrofit.http.Header;
import retrofit.http.HTTP;
import retrofit.http.POST;
import retrofit.http.PUT;

/**
 * An instance of this class provides access to all the operations defined
 * in LROSADsOperations.
 */
public interface LROSADsOperations {
    /**
     * The interface defining all the services for LROSADsOperations to be
     * used by Retrofit to perform actually REST calls.
     */
    interface LROSADsService {
        @PUT("/lro/nonretryerror/put/400")
        Call<ResponseBody> putNonRetry400(@Body Product product, @Header("accept-language") String acceptLanguage);

        @PUT("/lro/nonretryerror/put/201/creating/400")
        Call<ResponseBody> putNonRetry201Creating400(@Body Product product, @Header("accept-language") String acceptLanguage);

        @PUT("/lro/nonretryerror/putasync/retry/400")
        Call<ResponseBody> putAsyncRelativeRetry400(@Body Product product, @Header("accept-language") String acceptLanguage);

        @HTTP(path = "/lro/nonretryerror/delete/400", method = "DELETE", hasBody = true)
        Call<ResponseBody> deleteNonRetry400(@Header("accept-language") String acceptLanguage);

        @HTTP(path = "/lro/nonretryerror/delete/202/retry/400", method = "DELETE", hasBody = true)
        Call<ResponseBody> delete202NonRetry400(@Header("accept-language") String acceptLanguage);

        @HTTP(path = "/lro/nonretryerror/deleteasync/retry/400", method = "DELETE", hasBody = true)
        Call<ResponseBody> deleteAsyncRelativeRetry400(@Header("accept-language") String acceptLanguage);

        @POST("/lro/nonretryerror/post/400")
        Call<ResponseBody> postNonRetry400(@Body Product product, @Header("accept-language") String acceptLanguage);

        @POST("/lro/nonretryerror/post/202/retry/400")
        Call<ResponseBody> post202NonRetry400(@Body Product product, @Header("accept-language") String acceptLanguage);

        @POST("/lro/nonretryerror/postasync/retry/400")
        Call<ResponseBody> postAsyncRelativeRetry400(@Body Product product, @Header("accept-language") String acceptLanguage);

        @PUT("/lro/error/put/201/noprovisioningstatepayload")
        Call<ResponseBody> putError201NoProvisioningStatePayload(@Body Product product, @Header("accept-language") String acceptLanguage);

        @PUT("/lro/error/putasync/retry/nostatus")
        Call<ResponseBody> putAsyncRelativeRetryNoStatus(@Body Product product, @Header("accept-language") String acceptLanguage);

        @PUT("/lro/error/putasync/retry/nostatuspayload")
        Call<ResponseBody> putAsyncRelativeRetryNoStatusPayload(@Body Product product, @Header("accept-language") String acceptLanguage);

        @HTTP(path = "/lro/error/delete/204/nolocation", method = "DELETE", hasBody = true)
        Call<ResponseBody> delete204Succeeded(@Header("accept-language") String acceptLanguage);

        @HTTP(path = "/lro/error/deleteasync/retry/nostatus", method = "DELETE", hasBody = true)
        Call<ResponseBody> deleteAsyncRelativeRetryNoStatus(@Header("accept-language") String acceptLanguage);

        @POST("/lro/error/post/202/nolocation")
        Call<ResponseBody> post202NoLocation(@Body Product product, @Header("accept-language") String acceptLanguage);

        @POST("/lro/error/postasync/retry/nopayload")
        Call<ResponseBody> postAsyncRelativeRetryNoPayload(@Body Product product, @Header("accept-language") String acceptLanguage);

        @PUT("/lro/error/put/200/invalidjson")
        Call<ResponseBody> put200InvalidJson(@Body Product product, @Header("accept-language") String acceptLanguage);

        @PUT("/lro/error/putasync/retry/invalidheader")
        Call<ResponseBody> putAsyncRelativeRetryInvalidHeader(@Body Product product, @Header("accept-language") String acceptLanguage);

        @PUT("/lro/error/putasync/retry/invalidjsonpolling")
        Call<ResponseBody> putAsyncRelativeRetryInvalidJsonPolling(@Body Product product, @Header("accept-language") String acceptLanguage);

        @HTTP(path = "/lro/error/delete/202/retry/invalidheader", method = "DELETE", hasBody = true)
        Call<ResponseBody> delete202RetryInvalidHeader(@Header("accept-language") String acceptLanguage);

        @HTTP(path = "/lro/error/deleteasync/retry/invalidheader", method = "DELETE", hasBody = true)
        Call<ResponseBody> deleteAsyncRelativeRetryInvalidHeader(@Header("accept-language") String acceptLanguage);

        @HTTP(path = "/lro/error/deleteasync/retry/invalidjsonpolling", method = "DELETE", hasBody = true)
        Call<ResponseBody> deleteAsyncRelativeRetryInvalidJsonPolling(@Header("accept-language") String acceptLanguage);

        @POST("/lro/error/post/202/retry/invalidheader")
        Call<ResponseBody> post202RetryInvalidHeader(@Body Product product, @Header("accept-language") String acceptLanguage);

        @POST("/lro/error/postasync/retry/invalidheader")
        Call<ResponseBody> postAsyncRelativeRetryInvalidHeader(@Body Product product, @Header("accept-language") String acceptLanguage);

        @POST("/lro/error/postasync/retry/invalidjsonpolling")
        Call<ResponseBody> postAsyncRelativeRetryInvalidJsonPolling(@Body Product product, @Header("accept-language") String acceptLanguage);

    }
    /**
     * Long running put request, service returns a 400 to the initial request
     *
     * @param product Product to put
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the Product object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<Product> putNonRetry400(Product product) throws ServiceException, IOException, InterruptedException;

    /**
     * Long running put request, service returns a 400 to the initial request
     *
     * @param product Product to put
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> putNonRetry400Async(Product product, final ServiceCallback<Product> serviceCallback);

    /**
     * Long running put request, service returns a Product with 'ProvisioningState' = 'Creating' and 201 response code
     *
     * @param product Product to put
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the Product object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<Product> putNonRetry201Creating400(Product product) throws ServiceException, IOException, InterruptedException;

    /**
     * Long running put request, service returns a Product with 'ProvisioningState' = 'Creating' and 201 response code
     *
     * @param product Product to put
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> putNonRetry201Creating400Async(Product product, final ServiceCallback<Product> serviceCallback);

    /**
     * Long running put request, service returns a 200 with ProvisioningState=’Creating’. Poll the endpoint indicated in the Azure-AsyncOperation header for operation status
     *
     * @param product Product to put
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the Product object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<Product> putAsyncRelativeRetry400(Product product) throws ServiceException, IOException, InterruptedException;

    /**
     * Long running put request, service returns a 200 with ProvisioningState=’Creating’. Poll the endpoint indicated in the Azure-AsyncOperation header for operation status
     *
     * @param product Product to put
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> putAsyncRelativeRetry400Async(Product product, final ServiceCallback<Product> serviceCallback);

    /**
     * Long running delete request, service returns a 400 with an error body
     *
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the ServiceResponse object if successful.
     */
    ServiceResponse<Void> deleteNonRetry400() throws ServiceException, IOException, InterruptedException;

    /**
     * Long running delete request, service returns a 400 with an error body
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> deleteNonRetry400Async(final ServiceCallback<Void> serviceCallback);

    /**
     * Long running delete request, service returns a 202 with a location header
     *
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the ServiceResponse object if successful.
     */
    ServiceResponse<Void> delete202NonRetry400() throws ServiceException, IOException, InterruptedException;

    /**
     * Long running delete request, service returns a 202 with a location header
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> delete202NonRetry400Async(final ServiceCallback<Void> serviceCallback);

    /**
     * Long running delete request, service returns a 202 to the initial request. Poll the endpoint indicated in the Azure-AsyncOperation header for operation status
     *
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the ServiceResponse object if successful.
     */
    ServiceResponse<Void> deleteAsyncRelativeRetry400() throws ServiceException, IOException, InterruptedException;

    /**
     * Long running delete request, service returns a 202 to the initial request. Poll the endpoint indicated in the Azure-AsyncOperation header for operation status
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> deleteAsyncRelativeRetry400Async(final ServiceCallback<Void> serviceCallback);

    /**
     * Long running post request, service returns a 400 with no error body
     *
     * @param product Product to put
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the ServiceResponse object if successful.
     */
    ServiceResponse<Void> postNonRetry400(Product product) throws ServiceException, IOException, InterruptedException;

    /**
     * Long running post request, service returns a 400 with no error body
     *
     * @param product Product to put
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> postNonRetry400Async(Product product, final ServiceCallback<Void> serviceCallback);

    /**
     * Long running post request, service returns a 202 with a location header
     *
     * @param product Product to put
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the ServiceResponse object if successful.
     */
    ServiceResponse<Void> post202NonRetry400(Product product) throws ServiceException, IOException, InterruptedException;

    /**
     * Long running post request, service returns a 202 with a location header
     *
     * @param product Product to put
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> post202NonRetry400Async(Product product, final ServiceCallback<Void> serviceCallback);

    /**
     * Long running post request, service returns a 202 to the initial request Poll the endpoint indicated in the Azure-AsyncOperation header for operation status
     *
     * @param product Product to put
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the ServiceResponse object if successful.
     */
    ServiceResponse<Void> postAsyncRelativeRetry400(Product product) throws ServiceException, IOException, InterruptedException;

    /**
     * Long running post request, service returns a 202 to the initial request Poll the endpoint indicated in the Azure-AsyncOperation header for operation status
     *
     * @param product Product to put
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> postAsyncRelativeRetry400Async(Product product, final ServiceCallback<Void> serviceCallback);

    /**
     * Long running put request, service returns a 201 to the initial request with no payload
     *
     * @param product Product to put
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the Product object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<Product> putError201NoProvisioningStatePayload(Product product) throws ServiceException, IOException, InterruptedException;

    /**
     * Long running put request, service returns a 201 to the initial request with no payload
     *
     * @param product Product to put
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> putError201NoProvisioningStatePayloadAsync(Product product, final ServiceCallback<Product> serviceCallback);

    /**
     * Long running put request, service returns a 200 to the initial request, with an entity that contains ProvisioningState=’Creating’. Poll the endpoint indicated in the Azure-AsyncOperation header for operation status
     *
     * @param product Product to put
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the Product object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<Product> putAsyncRelativeRetryNoStatus(Product product) throws ServiceException, IOException, InterruptedException;

    /**
     * Long running put request, service returns a 200 to the initial request, with an entity that contains ProvisioningState=’Creating’. Poll the endpoint indicated in the Azure-AsyncOperation header for operation status
     *
     * @param product Product to put
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> putAsyncRelativeRetryNoStatusAsync(Product product, final ServiceCallback<Product> serviceCallback);

    /**
     * Long running put request, service returns a 200 to the initial request, with an entity that contains ProvisioningState=’Creating’. Poll the endpoint indicated in the Azure-AsyncOperation header for operation status
     *
     * @param product Product to put
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the Product object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<Product> putAsyncRelativeRetryNoStatusPayload(Product product) throws ServiceException, IOException, InterruptedException;

    /**
     * Long running put request, service returns a 200 to the initial request, with an entity that contains ProvisioningState=’Creating’. Poll the endpoint indicated in the Azure-AsyncOperation header for operation status
     *
     * @param product Product to put
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> putAsyncRelativeRetryNoStatusPayloadAsync(Product product, final ServiceCallback<Product> serviceCallback);

    /**
     * Long running delete request, service returns a 204 to the initial request, indicating success.
     *
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the ServiceResponse object if successful.
     */
    ServiceResponse<Void> delete204Succeeded() throws ServiceException, IOException, InterruptedException;

    /**
     * Long running delete request, service returns a 204 to the initial request, indicating success.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> delete204SucceededAsync(final ServiceCallback<Void> serviceCallback);

    /**
     * Long running delete request, service returns a 202 to the initial request. Poll the endpoint indicated in the Azure-AsyncOperation header for operation status
     *
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the ServiceResponse object if successful.
     */
    ServiceResponse<Void> deleteAsyncRelativeRetryNoStatus() throws ServiceException, IOException, InterruptedException;

    /**
     * Long running delete request, service returns a 202 to the initial request. Poll the endpoint indicated in the Azure-AsyncOperation header for operation status
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> deleteAsyncRelativeRetryNoStatusAsync(final ServiceCallback<Void> serviceCallback);

    /**
     * Long running post request, service returns a 202 to the initial request, without a location header.
     *
     * @param product Product to put
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the ServiceResponse object if successful.
     */
    ServiceResponse<Void> post202NoLocation(Product product) throws ServiceException, IOException, InterruptedException;

    /**
     * Long running post request, service returns a 202 to the initial request, without a location header.
     *
     * @param product Product to put
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> post202NoLocationAsync(Product product, final ServiceCallback<Void> serviceCallback);

    /**
     * Long running post request, service returns a 202 to the initial request, with an entity that contains ProvisioningState=’Creating’. Poll the endpoint indicated in the Azure-AsyncOperation header for operation status
     *
     * @param product Product to put
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the ServiceResponse object if successful.
     */
    ServiceResponse<Void> postAsyncRelativeRetryNoPayload(Product product) throws ServiceException, IOException, InterruptedException;

    /**
     * Long running post request, service returns a 202 to the initial request, with an entity that contains ProvisioningState=’Creating’. Poll the endpoint indicated in the Azure-AsyncOperation header for operation status
     *
     * @param product Product to put
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> postAsyncRelativeRetryNoPayloadAsync(Product product, final ServiceCallback<Void> serviceCallback);

    /**
     * Long running put request, service returns a 200 to the initial request, with an entity that is not a valid json
     *
     * @param product Product to put
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the Product object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<Product> put200InvalidJson(Product product) throws ServiceException, IOException, InterruptedException;

    /**
     * Long running put request, service returns a 200 to the initial request, with an entity that is not a valid json
     *
     * @param product Product to put
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> put200InvalidJsonAsync(Product product, final ServiceCallback<Product> serviceCallback);

    /**
     * Long running put request, service returns a 200 to the initial request, with an entity that contains ProvisioningState=’Creating’. The endpoint indicated in the Azure-AsyncOperation header is invalid.
     *
     * @param product Product to put
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the Product object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<Product> putAsyncRelativeRetryInvalidHeader(Product product) throws ServiceException, IOException, InterruptedException;

    /**
     * Long running put request, service returns a 200 to the initial request, with an entity that contains ProvisioningState=’Creating’. The endpoint indicated in the Azure-AsyncOperation header is invalid.
     *
     * @param product Product to put
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> putAsyncRelativeRetryInvalidHeaderAsync(Product product, final ServiceCallback<Product> serviceCallback);

    /**
     * Long running put request, service returns a 200 to the initial request, with an entity that contains ProvisioningState=’Creating’. Poll the endpoint indicated in the Azure-AsyncOperation header for operation status
     *
     * @param product Product to put
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the Product object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<Product> putAsyncRelativeRetryInvalidJsonPolling(Product product) throws ServiceException, IOException, InterruptedException;

    /**
     * Long running put request, service returns a 200 to the initial request, with an entity that contains ProvisioningState=’Creating’. Poll the endpoint indicated in the Azure-AsyncOperation header for operation status
     *
     * @param product Product to put
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> putAsyncRelativeRetryInvalidJsonPollingAsync(Product product, final ServiceCallback<Product> serviceCallback);

    /**
     * Long running delete request, service returns a 202 to the initial request receing a reponse with an invalid 'Location' and 'Retry-After' headers
     *
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the ServiceResponse object if successful.
     */
    ServiceResponse<Void> delete202RetryInvalidHeader() throws ServiceException, IOException, InterruptedException;

    /**
     * Long running delete request, service returns a 202 to the initial request receing a reponse with an invalid 'Location' and 'Retry-After' headers
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> delete202RetryInvalidHeaderAsync(final ServiceCallback<Void> serviceCallback);

    /**
     * Long running delete request, service returns a 202 to the initial request. The endpoint indicated in the Azure-AsyncOperation header is invalid
     *
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the ServiceResponse object if successful.
     */
    ServiceResponse<Void> deleteAsyncRelativeRetryInvalidHeader() throws ServiceException, IOException, InterruptedException;

    /**
     * Long running delete request, service returns a 202 to the initial request. The endpoint indicated in the Azure-AsyncOperation header is invalid
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> deleteAsyncRelativeRetryInvalidHeaderAsync(final ServiceCallback<Void> serviceCallback);

    /**
     * Long running delete request, service returns a 202 to the initial request. Poll the endpoint indicated in the Azure-AsyncOperation header for operation status
     *
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the ServiceResponse object if successful.
     */
    ServiceResponse<Void> deleteAsyncRelativeRetryInvalidJsonPolling() throws ServiceException, IOException, InterruptedException;

    /**
     * Long running delete request, service returns a 202 to the initial request. Poll the endpoint indicated in the Azure-AsyncOperation header for operation status
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> deleteAsyncRelativeRetryInvalidJsonPollingAsync(final ServiceCallback<Void> serviceCallback);

    /**
     * Long running post request, service returns a 202 to the initial request, with invalid 'Location' and 'Retry-After' headers.
     *
     * @param product Product to put
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the ServiceResponse object if successful.
     */
    ServiceResponse<Void> post202RetryInvalidHeader(Product product) throws ServiceException, IOException, InterruptedException;

    /**
     * Long running post request, service returns a 202 to the initial request, with invalid 'Location' and 'Retry-After' headers.
     *
     * @param product Product to put
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> post202RetryInvalidHeaderAsync(Product product, final ServiceCallback<Void> serviceCallback);

    /**
     * Long running post request, service returns a 202 to the initial request, with an entity that contains ProvisioningState=’Creating’. The endpoint indicated in the Azure-AsyncOperation header is invalid.
     *
     * @param product Product to put
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the ServiceResponse object if successful.
     */
    ServiceResponse<Void> postAsyncRelativeRetryInvalidHeader(Product product) throws ServiceException, IOException, InterruptedException;

    /**
     * Long running post request, service returns a 202 to the initial request, with an entity that contains ProvisioningState=’Creating’. The endpoint indicated in the Azure-AsyncOperation header is invalid.
     *
     * @param product Product to put
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> postAsyncRelativeRetryInvalidHeaderAsync(Product product, final ServiceCallback<Void> serviceCallback);

    /**
     * Long running post request, service returns a 202 to the initial request, with an entity that contains ProvisioningState=’Creating’. Poll the endpoint indicated in the Azure-AsyncOperation header for operation status
     *
     * @param product Product to put
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the ServiceResponse object if successful.
     */
    ServiceResponse<Void> postAsyncRelativeRetryInvalidJsonPolling(Product product) throws ServiceException, IOException, InterruptedException;

    /**
     * Long running post request, service returns a 202 to the initial request, with an entity that contains ProvisioningState=’Creating’. Poll the endpoint indicated in the Azure-AsyncOperation header for operation status
     *
     * @param product Product to put
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> postAsyncRelativeRetryInvalidJsonPollingAsync(Product product, final ServiceCallback<Void> serviceCallback);

}