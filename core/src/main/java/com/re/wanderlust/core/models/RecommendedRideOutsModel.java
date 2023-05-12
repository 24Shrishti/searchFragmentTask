package com.re.wanderlust.core.models;

import com.re.wanderlust.core.models.internals.MarqueeRide;

import java.util.List;

public interface RecommendedRideOutsModel {

    /**
     *Method to fetch the marquee ride list.
     * @return marqueeRideList
     */
    List<MarqueeRide> getMarqueeRideList();

}
