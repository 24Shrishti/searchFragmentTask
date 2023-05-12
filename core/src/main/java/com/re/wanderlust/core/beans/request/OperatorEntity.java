package com.re.wanderlust.core.beans.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class OperatorEntity {

    @JsonProperty("location")
    private String location;

    @JsonProperty("operators")
    private String operators;

    @JsonProperty("rating")
    private String rating;

    @JsonProperty("review")
    private String review;

    @JsonProperty("image")
    private String image;

    @JsonProperty("operatorGuid")
    private String operatorGuid;

    @JsonProperty("operatorId")
    private String operatorId;

    @JsonProperty("name")
    private String operatorName;

    @JsonProperty("operator_image")
    private String operatorImage;


}
