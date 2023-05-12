package com.re.wanderlust.core.beans;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;


/**
 * The class {@code ModelNameEntity} that contains variables.
 * required for the services
 *
 * @version 1.0
 * @since 1.0
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ModelNameEntity {
    private String value;
    private String label;
}
