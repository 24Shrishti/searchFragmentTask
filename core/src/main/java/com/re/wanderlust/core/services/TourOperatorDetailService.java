package com.re.wanderlust.core.services;


import com.re.wanderlust.core.beans.TourListingEntity;


public interface TourOperatorDetailService {

    /**
     * This method is use for service.
     *
     * @param tourOperatorUrl
     * @param operatorId
     * @param limit
     * @return {@link  TourListingEntity}
     */
    TourListingEntity getTourDetailPage(String tourOperatorUrl,
                                              String operatorId, int limit);
}
