package com.re.wanderlust.core.models;

import com.re.wanderlust.core.models.internals.RideList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Represents a Ride Listing Model.
 * used for <b>RE-Wanderlust</b> project implementation
 *
 * @version 1.0
 * @since 1.0
 */
public interface RideListingModel {
     String SEARCH_PATH = "searchPath";

    /**
     *it will contain categories list.
     * @return map of string
     */
    Map<String, String> getCategoriesList();

    /**
     * this is used for location list.
     * @return Set of strings
     */
    Set<String> getLocationList();

    /**
     * contain search Results list.
     * @return list of Ridelist
     */
    List<RideList> getSearchResultList();

    /**
     * contain category.
     * @return String
     */
    String getCurrentCategory();
}
