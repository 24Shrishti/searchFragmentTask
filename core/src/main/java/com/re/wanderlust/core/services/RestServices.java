package com.re.wanderlust.core.services;

import com.re.wanderlust.core.beans.ClientResponse;
import com.re.wanderlust.core.beans.request.OperatorListReq;
import com.re.wanderlust.core.beans.request.RentalSearchReq;
import com.re.wanderlust.core.beans.request.TourOperatorDataRequestEntity;
import com.re.wanderlust.core.exception.REWException;

import java.io.IOException;

public interface RestServices {

    /**
     * Method to get rentals search data
     * response from Spring Boot API
     * by making a REST Based call.
     *
     * @param searchResultLoadMoreRequest
     * @param rewSearchResultLoadMoreApiEnd
     * @return clientResponse {@link ClientResponse}
     * @throws IOException
     */
    ClientResponse getRentalsSearchData(
      RentalSearchReq searchResultLoadMoreRequest,
      String rewSearchResultLoadMoreApiEnd)
            throws IOException, REWException;

    /**
     *
     * Method to get operator listing data
     * response from Spring Boot API
     * by making a REST Based call.
     *
     * @param operatorListReq
     * @param rewOperatorListingApiEnd
     * @return clientResponse {@link ClientResponse}
     * @throws IOException
     */
    ClientResponse getOperatorListing(OperatorListReq operatorListReq,
                                      String rewOperatorListingApiEnd)
            throws IOException, REWException;

    /**
     *
     * Method to get tour operator listing data
     * response from Spring Boot API
     * by making a REST Based call.
     *
     * @param tourOperatorDetailRequestEntity
     * @param apiUrl
     * @return clientResponse {@link ClientResponse}
     * @throws IOException
     */
    ClientResponse getTourOperatorListingData(
            TourOperatorDataRequestEntity tourOperatorDetailRequestEntity,
            String apiUrl)
            throws IOException, REWException;

    /**
     * Method to get reviews detail
     * response from Spring Boot API
     * by making a REST Based call.
     *
     * @param sendReviewDetailApiUrl
     * @return clientResponse {@link ClientResponse}
     * @throws IOException
     */
    ClientResponse getReviewDetail(String sendReviewDetailApiUrl)
            throws IOException, REWException;

    /**
     * Method to get booking details
     * response from Spring Boot API
     * by making a REST Based call.
     *
     * @param token
     * @param sendBookingDetailsRequestApiUrl
     * @return clientResponse {@link ClientResponse}
     * @throws IOException
     */
    ClientResponse getBookingDetails(String token,
                                     String sendBookingDetailsRequestApiUrl)
            throws IOException, REWException;

    /**
     * Method to get reviews list
     * response from Spring Boot API
     * by making a REST Based call.
     *
     * @param sendReviewListApiUrl
     * @return clientResponse {@link ClientResponse}
     * @throws IOException
     */
    ClientResponse getReviewsList(String sendReviewListApiUrl)
            throws IOException, REWException;

    /**
     * Method to get rentals search data
     * response from Spring Boot API
     * by making a REST Based call.
     *
     * @param sendPaymentDetailsApiUrl
     * @return clientResponse {@link ClientResponse}
     * @throws IOException
     */
    ClientResponse getPaymentDetails(String sendPaymentDetailsApiUrl)
            throws IOException, REWException;


    /**
     * Method to get bike names
     * response from Spring Boot API
     * by making a REST Based call.
     *
     * @param bikeNamesApiUrl
     * @return clientResponse {@link ClientResponse}
     * @throws REWException
     */
    ClientResponse getBikeNames(String bikeNamesApiUrl)
            throws REWException;


    /**
     * Method to get itinerary bikes data
     * response from Spring Boot API
     * by making a REST Based call.
     *
     * @param itineraryUrl
     * @return clientResponse {@link ClientResponse}
     * @throws REWException
     */
    ClientResponse getItineraryModelData(
            String itineraryUrl)
            throws REWException;

    /**
     * Method to get operator  search data
     * response from Spring Boot API
     * by making a REST Based call.
     *
     * @param sendOperatorDetailsApiUrl
     * @return clientResponse {@link ClientResponse}
     * @throws IOException
     */
    ClientResponse getOperatorDetails(String sendOperatorDetailsApiUrl)
            throws IOException, REWException;

    /**
     * Method to get rentals search data
     * response from Spring Boot API
     * by making a REST Based call.
     *
     * @param sendAlternateBookingApiUrl
     * @return clientResponse {@link ClientResponse}
     * @throws IOException
     */
    ClientResponse getAlternateBookingDetails(
            String sendAlternateBookingApiUrl)
            throws IOException, REWException;

    /**
     *
     * @param endpointUrl
     * @return clientResponse {@link ClientResponse}
     * @throws REWException
     */
    ClientResponse getTopToursDetail(String endpointUrl)
            throws REWException;

    /**
     *
     * @param endpointUrl
     * @return clientResponse {@link ClientResponse}
     * @throws REWException
     */
    ClientResponse getTourOperatorDetails(String endpointUrl)
            throws REWException;

    /**
     *
     * @param url
     * @return clientResponse {@link ClientResponse}
     * @throws REWException
     */
    ClientResponse getTourSearchFormPageurl(String url)
            throws REWException;

    /**
     *
     * @param url
     * @return clientResponse {@link ClientResponse}
     * @throws REWException
     */
    ClientResponse getTourGalleryPageurl(String url)
            throws REWException;

    /**
     *
     * @param url
     * @return clientResponse {@link ClientResponse}
     * @throws REWException
     */
    ClientResponse getBookThisNowResponse(String url)
            throws REWException;

    /**
     *
     * @param url
     * @return clientResponse {@link ClientResponse}
     * @throws REWException
     */
     ClientResponse getTourItinerary(String url)
            throws REWException;

    /**
     *
     * @param url
     * @return clientResponse {@link ClientResponse}
     * @throws REWException
     */
    ClientResponse getSearchFragmentApiData(String url)
            throws REWException;
}

