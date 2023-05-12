package com.re.wanderlust.core.beans.request;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;


/**
 * The class {@code CartDetailsRequest} that contains request entity object.
 *  required for the services
 *
 * @version 1.0
 * @since 1.0
 */
@Getter
@Setter
public class CartDetailsRequest {
    @SerializedName("data")
    private CartDetailsRequestEntity cartDetailsRequestEntity;
}
