package com.re.wanderlust.core.services;

import com.re.wanderlust.core.beans.request.ReviewListingItem;
import java.util.List;

public interface ReviewListingService {

    /**
     * Method to get review's list.
     * response from Spring Boot API
     * by making a REST Based call.
     * @param limit
     * @param reviewListingAPIUrl
     * @param wanderlustCategories
     * @return {@link List<ReviewListingItem>}
     */
    List<ReviewListingItem> getReviewListingData(
            String limit, String reviewListingAPIUrl,
            String wanderlustCategories);
}
