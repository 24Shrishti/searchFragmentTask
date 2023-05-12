package com.re.wanderlust.core.caconfig;

import org.apache.commons.lang.StringUtils;
import org.apache.sling.caconfig.annotation.Configuration;
import org.apache.sling.caconfig.annotation.Property;

@Configuration(
        label = "RE Wanderlust LocalStorage keys Configuration",
        description = "LocalStorage keys configurations"
)
public @interface LocalStorageKeysConfig {
    /**
     * Attribute for the Current Latitude key config.
     * @return currentLatitude key as String
     */
    @Property(label = "Current Latitude key",
            description = "Current latitude Key")
    String currentLatKey() default StringUtils.EMPTY;

    /**
     * Attribute for the Updated Longitude key config.
     * @return UpdatedLongitude key as String
     */
    @Property(label = "Current Longitude key",
            description = "Current longitude Key")
    String currentLongKey() default StringUtils.EMPTY;

    /**
     * Attribute for the Updated Longitude key config.
     * @return UpdatedLongitude key as String
     */
    @Property(label = "Updated Latitude key",
            description = "Updated latitude Key")
    String updatedLatKey() default StringUtils.EMPTY;


    /**
     * Attribute for the Updated Longitude key config.
     * @return UpdatedLongitude key as String
     */
    @Property(label = "Updated Longitude key",
            description = "Updated longitude Key")
    String updatedLongKey() default StringUtils.EMPTY;

}
