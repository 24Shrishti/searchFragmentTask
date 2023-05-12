package com.re.wanderlust.core.beans;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class AlternateOldBikeEntity {

    @JsonProperty("entity_id")
    private String oldMotorcycleId;



    @JsonProperty("display_name")
    private String name;


}
