package com.re.wanderlust.core.services;

import com.re.wanderlust.core.beans.OperatorDetailEntity;

import java.util.List;
import java.util.Map;

/**
 * Service that fetches the operator data.
 * by calling rest based api
 *
 */

public interface OperatorDetailsService {

    /**
     * Method to get the operator detail service.
     *
     * @param operatorId
     * @param operatorDetailApiUrl
     * @param permitMap
     * @param currencyMap
     * @return {List<OperatorDetailEntity>}
     */

    List<OperatorDetailEntity> getOperatorData(
            String operatorId,
            String operatorDetailApiUrl, Map<String, Object> permitMap,
            Map<String, Object> currencyMap);

    /**
     * Method to return the status code.
     *
     * @return {String}
     */

    String getStatusCode();
}

