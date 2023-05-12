//package com.re.wanderlust.core.models;
//
//import com.re.wanderlust.core.constants.TestConstants;
//import com.re.wanderlust.core.models.impl.ReviewListingModelImpl;
//import com.re.wanderlust.core.testcontext.AppAemContext;
//import io.wcm.testing.mock.aem.junit5.AemContext;
//import io.wcm.testing.mock.aem.junit5.AemContextExtension;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.junit.jupiter.MockitoExtension;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertNotEquals;
//
//@ExtendWith({AemContextExtension.class, MockitoExtension.class})
//public class ReviewListingModelTest {
//
//    public static final String REVIEW_LISTING_MODEL_JSON = "reviewListingModel.json";
//    private final AemContext ctx = AppAemContext.newAemContext();
//
//    private ReviewListingModelImpl reviewListingComponent;
//
//    @BeforeEach
//    void setUp(){
//        ctx.addModelsForClasses(ReviewListingModelImpl.class);
//        ctx.load().json(TestConstants.JSON_FILE_PATH+ REVIEW_LISTING_MODEL_JSON,TestConstants.CONTENT_PATH);
//    }
//
//    @Test
//    void testWanderlustCategories(){
//        reviewListingComponent = getModel("/content/reviewListing");
//        assertEquals("Rental",reviewListingComponent.getWanderlustCategories());
//    }
//
//    @Test
//    void negativeTestWanderlustCategories(){
//        reviewListingComponent = getModel("/content/reviewListing");
//        assertNotEquals("",reviewListingComponent.getWanderlustCategories());
//    }
//    @Test
//    void testNewTab(){
//        reviewListingComponent = getModel("/content/reviewListing");
//        assertEquals("false",reviewListingComponent.getNewTab());
//    }
//    @Test
//    void negativeTestNewTab(){
//        reviewListingComponent = getModel("/content/reviewListing");
//        assertNotEquals("",reviewListingComponent.getNewTab());
//    }
//    @Test
//    void testReviewedRatingLabel(){
//        reviewListingComponent = getModel("/content/reviewListing");
//        assertEquals("rating",reviewListingComponent.getReviewedRatingLabel());
//    }
//    @Test
//    void negativeTestReviewedRatingLabel(){
//        reviewListingComponent = getModel("/content/reviewListing");
//        assertNotEquals("",reviewListingComponent.getReviewedRatingLabel());
//    }
//    @Test
//    void testReadMoreLabel(){
//        reviewListingComponent = getModel("/content/reviewListing");
//        assertEquals("read more",reviewListingComponent.getReadMoreLabel());
//    }
//    @Test
//    void negativeTestReadMoreLabel(){
//        reviewListingComponent = getModel("/content/reviewListing");
//        assertNotEquals("",reviewListingComponent.getReadMoreLabel());
//    }
//    @Test
//    void testLimit(){
//        reviewListingComponent = getModel("/content/reviewListing");
//        assertEquals("3", reviewListingComponent.getLimit());
//    }
//    @Test
//    void negativeTestLimit(){
//        reviewListingComponent = getModel("/content/reviewListing");
//        assertNotEquals("", reviewListingComponent.getLimit());
//    }
//
//    @Test
//    void testStarIconImage(){
//        reviewListingComponent = getModel("/content/reviewListing");
//        assertEquals("/content/dam/re-wanderlust",reviewListingComponent.getStarIconImage());
//    }
//    @Test
//    void negativeTestStarIconImage(){
//        reviewListingComponent = getModel("/content/reviewListing");
//        assertNotEquals("",reviewListingComponent.getStarIconImage());
//    }
//    @Test
//    void testReviewedLabel(){
//        reviewListingComponent = getModel("/content/reviewListing");
//        assertEquals("review label",reviewListingComponent.getReviewedLabel());
//    }
//    @Test
//    void negativeTestReviewedLabel(){
//        reviewListingComponent = getModel("/content/reviewListing");
//        assertNotEquals("",reviewListingComponent.getReviewedLabel());
//    }
//    private ReviewListingModelImpl getModel(String currentResource){
//        ctx.currentResource(currentResource);
//        return ctx.request().adaptTo(ReviewListingModelImpl.class);
//    }
//}
