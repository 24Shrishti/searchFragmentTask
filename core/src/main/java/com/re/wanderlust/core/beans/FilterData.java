package com.re.wanderlust.core.beans;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
    public class FilterData {

    private List<PartnerEntity> partners;

    private List<Location> locations;

    private List<ModelNameEntity> models;

    private AgeFilter age;

    private PriceSearchFilter price;

    @JsonProperty("km-range")
    private KmRangeFilter kmRangeFilter;
}
