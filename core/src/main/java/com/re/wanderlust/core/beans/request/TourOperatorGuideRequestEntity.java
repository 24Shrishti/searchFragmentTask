package com.re.wanderlust.core.beans.request;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;

/**
 * The class {@code TourOperatorGuideRequestEntity} that contains variable.
 *  required for the services
 *
 * @version 1.0
 * @since 1.0
 */
@Getter
@Setter
public class TourOperatorGuideRequestEntity {

    @SerializedName("operator_id")
    private String operatorGuide;


}
