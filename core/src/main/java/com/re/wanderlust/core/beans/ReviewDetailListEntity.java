package com.re.wanderlust.core.beans;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import java.util.List;

/**
 * The class {@code Review Detail list Entity}.
 * required for the services.
 *
 * @version 1.0
 * @since 1.0
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ReviewDetailListEntity {

    @JsonProperty("avg")
    private String avg;

    @JsonProperty ("totalRating")
    private String totalReviews;


    private String flag;

    private List<ReviewDetailEntity> item;


}
