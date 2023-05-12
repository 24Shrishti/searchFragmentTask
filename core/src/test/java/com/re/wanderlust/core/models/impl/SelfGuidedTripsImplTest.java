package com.re.wanderlust.core.models.impl;

import com.re.wanderlust.core.constants.TestConstants;
import com.re.wanderlust.core.testcontext.AppAemContext;
import io.wcm.testing.mock.aem.junit5.AemContext;
import io.wcm.testing.mock.aem.junit5.AemContextExtension;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith({AemContextExtension.class, MockitoExtension.class})
class SelfGuidedTripsImplTest {

    public static final String SELF_GUIDED_TRIPS_MODEL_JSON = "selfGuidedTrips.json";
    private final AemContext ctx = AppAemContext.newAemContext();

    private SelfGuidedTripsImpl selfGuidedTrips;

    @BeforeEach
    void setUp() {
        ctx.addModelsForClasses(SelfGuidedTripsImpl.class);
        ctx.load().json(TestConstants.JSON_FILE_PATH+ SELF_GUIDED_TRIPS_MODEL_JSON,TestConstants.CONTENT_PATH);
    }

    @Test
    void testPath(){
        selfGuidedTrips=getModel("/content/selfGuidedTrips");
        assertEquals("Path",selfGuidedTrips.getPath());
    }
    @Test
    void negativeTestPath(){
        selfGuidedTrips=getModel("/content/selfGuidedTrips");
        assertNotEquals("",selfGuidedTrips.getPath());
    }

    private SelfGuidedTripsImpl getModel(String currentResource){
        ctx.currentResource(currentResource);
        return ctx.request().adaptTo(SelfGuidedTripsImpl.class);
    }
}