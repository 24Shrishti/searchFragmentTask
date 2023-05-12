package com.re.wanderlust.core.beans;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;


/**
 * The class {@code Tour Listing Entity}.
 * required for the services.
 *
 * @version 1.0
 * @since 1.0
 */
@Data
@JsonDeserialize
@JsonIgnoreProperties(ignoreUnknown = true)
public class TourListingEntity {

    @JsonProperty("items")
    private List<TourEntityItemList> tourEntityItemList =
            new ArrayList<>();

    @JsonProperty("total_results")
    private int totalResult;

    @JsonProperty("offset")
    private int offset;

    @JsonProperty("limit")
    private int limit;

    private int flag;

}
