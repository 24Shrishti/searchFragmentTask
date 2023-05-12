package com.re.wanderlust.core.beans;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class AgeFilter {
    private String min;
    private String max;
}
