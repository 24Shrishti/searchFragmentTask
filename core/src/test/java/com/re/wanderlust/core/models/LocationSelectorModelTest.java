package com.re.wanderlust.core.models;

import com.re.wanderlust.core.constants.TestConstants;
import com.re.wanderlust.core.models.impl.LocationSelectorModelImpl;
import com.re.wanderlust.core.testcontext.AppAemContext;
import io.wcm.testing.mock.aem.junit5.AemContext;
import io.wcm.testing.mock.aem.junit5.AemContextExtension;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static junitx.framework.Assert.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith({AemContextExtension.class, MockitoExtension.class})
public class LocationSelectorModelTest {

    public static final String LOCATION_SELECTOR_MODEL_JSON = "locationSelectorModel.json";

    private final AemContext ctx = AppAemContext.newAemContext();

    private LocationSelectorModelImpl locationSelectorModel;

    @BeforeEach
    void setUp() {
        ctx.addModelsForClasses(LocationSelectorModelImpl.class);
        ctx.load().json(TestConstants.JSON_FILE_PATH + LOCATION_SELECTOR_MODEL_JSON, TestConstants.CONTENT_PATH);
    }

//    @Test
//    void testLocationIconClass() {
//        locationSelectorModel = getModel("/content/locationSelector");
//        assertEquals("location-icon", locationSelectorModel.getLocationIconClass());
//    }
//
//    @Test
//    void negativeTestLocationIconClass() {
//        locationSelectorModel = getModel("/content/locationSelector");
//        assertNotEquals("", locationSelectorModel.getLocationIconClass());
//    }

    @Test
    void testLocationPlaceholder() {
        locationSelectorModel = getModel("/content/locationSelector");
        assertEquals("Placeholder for search", locationSelectorModel.getLocationPlaceholder());
    }

    @Test
    void negativeTestLocationPlaceholder() {
        locationSelectorModel = getModel("/content/locationSelector");
        assertNotEquals("", locationSelectorModel.getLocationPlaceholder());
    }

    @Test
    void testLocationIconImage() {
        locationSelectorModel = getModel("/content/locationSelector");
        assertEquals("LocationIcon Image", locationSelectorModel.getLocationIconImage());
    }

    @Test
    void negativeTestLocationIconImage() {
        locationSelectorModel = getModel("/content/locationSelector");
        assertNotEquals("", locationSelectorModel.getLocationIconImage());
    }

    private LocationSelectorModelImpl getModel(String currentResource){
        ctx.currentResource(currentResource);
       return ctx.request().adaptTo(LocationSelectorModelImpl.class);
    }
}
