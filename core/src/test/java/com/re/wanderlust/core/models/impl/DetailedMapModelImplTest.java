package com.re.wanderlust.core.models.impl;

import com.re.wanderlust.core.constants.TestConstants;
import com.re.wanderlust.core.testcontext.AppAemContext;
import io.wcm.testing.mock.aem.junit5.AemContext;
import io.wcm.testing.mock.aem.junit5.AemContextExtension;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

@ExtendWith({AemContextExtension.class, MockitoExtension.class})
class DetailedMapModelImplTest {

    public static final String DETAILED_MAP_MODEL_JSON = "detailMapModel.json";
    private final AemContext ctx = AppAemContext.newAemContext();

    private DetailedMapModelImpl detailedMapModel;

    @BeforeEach
    void setUp() {
        ctx.addModelsForClasses(DetailedMapModelImpl.class);
        ctx.load().json(TestConstants.JSON_FILE_PATH+ DETAILED_MAP_MODEL_JSON,TestConstants.CONTENT_PATH);
    }

    @Test
    void testStartPointLocation(){
        detailedMapModel=getModel("/content/detailMapModel");
        assertEquals("Start Point",detailedMapModel.getStartPointLocation());
    }
    @Test
    void negativeTestStartPointLocation(){
        detailedMapModel=getModel("/content/detailMapModel");
        assertNotEquals("",detailedMapModel.getStartPointLocation());
    }

    @Test
    void testEndPointLocation(){
        detailedMapModel=getModel("/content/detailMapModel");
        assertEquals("EndPoint Location",detailedMapModel.getEndPointLocation());
    }
    @Test
    void negativeTestEndPointLocation(){
        detailedMapModel=getModel("/content/detailMapModel");
        assertNotEquals("",detailedMapModel.getEndPointLocation());
    }

    @Test
    void testTotalDistanceOfLocation(){
        detailedMapModel=getModel("/content/detailMapModel");
        assertEquals("TotalDistanceOf Location",detailedMapModel.getTotalDistanceOfLocation());
    }
    @Test
    void negativeTestTotalDistanceOfLocation(){
        detailedMapModel=getModel("/content/detailMapModel");
        assertNotEquals("",detailedMapModel.getTotalDistanceOfLocation());
    }

    @Test
    void testDistanceUnit(){
        detailedMapModel=getModel("/content/detailMapModel");
        assertEquals("Distance Unit",detailedMapModel.getDistanceUnit());
    }
    @Test
    void negativeTestDistanceUnit(){
        detailedMapModel=getModel("/content/detailMapModel");
        assertNotEquals("",detailedMapModel.getDistanceUnit());
    }
    private DetailedMapModelImpl getModel(String currentResource){
        ctx.currentResource(currentResource);
        return ctx.request().adaptTo(DetailedMapModelImpl.class);
    }
}