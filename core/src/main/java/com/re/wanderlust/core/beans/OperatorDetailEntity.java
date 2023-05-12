package com.re.wanderlust.core.beans;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.Data;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;

@Data
@JsonDeserialize
@JsonIgnoreProperties(ignoreUnknown = true)
public class OperatorDetailEntity {

    @JsonProperty("operator_image")
    private String operatorImage;

    @JsonProperty("name")
    private String name;

    @JsonProperty("is_verified")
    private String isVerified;

    @JsonProperty("rating")
    private String rating;

    @JsonProperty("fleet")
    private String fleetSize;

    @JsonProperty("tours_count")
    private String toursCount;

    @JsonProperty("location_count")
    private String location;

    @JsonProperty("total_reviews")
    private String totalReviews;


    private String statusCode
            = StringUtils.EMPTY;


    @JsonProperty("productListing")
    private List<OperatorProductListEntity>
     operatorProductListEntity = new ArrayList<>();

    @JsonProperty("cancel_return_policy")
    private List<CancellationPolicyEntity>
            cancellationPolicyEntity = new ArrayList<>();

    @JsonProperty("valueAdded")
    private ValueAddedEntity
            valueAddedEntity;

}
