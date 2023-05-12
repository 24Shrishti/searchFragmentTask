package com.re.wanderlust.core.models;

import com.re.wanderlust.core.beans.TopToursEntity;

import java.util.List;

public interface TopToursModel {
    /**
     * Method to fetch data from APi.
     * @return list of tours
     */
    List<TopToursEntity> getTopToursList();
}
