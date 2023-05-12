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
class RecommendedOperatorsModelImplTest {

    public static final String RECOMMENDED_OPERATOR_MODEL = "recommendedOperatorModel.json";
    private final AemContext ctx = AppAemContext.newAemContext();
    private RecommendedOperatorsModelImpl recommendedOperatorsModel;

    @BeforeEach
    void setUp() {
        ctx.addModelsForClasses(RecommendedOperatorsModelImpl.class);
        ctx.load().json(TestConstants.JSON_FILE_PATH+ RECOMMENDED_OPERATOR_MODEL,TestConstants.CONTENT_PATH);
    }

    @Test
    void testOperatorsLimit(){
        recommendedOperatorsModel = getModel("/content/recommendedOperators");
        assertEquals("Operator_Limit",recommendedOperatorsModel.getOperatorsLimit());
    }

    @Test
    void negativeTestOperatorsLimit(){
        recommendedOperatorsModel = getModel("/content/recommendedOperators");
        assertNotEquals("",recommendedOperatorsModel.getOperatorsLimit());
    }

    @Test
    void testSearchResultsPagePath(){
        recommendedOperatorsModel = getModel("/content/recommendedOperators");
        assertEquals("Search_Result_Page_Path",recommendedOperatorsModel.getSearchResultsPagePath());
    }

    @Test
    void negativeTestSearchResultsPagePath(){
        recommendedOperatorsModel = getModel("/content/recommendedOperators");
        assertNotEquals("",recommendedOperatorsModel.getSearchResultsPagePath());
    }


    @Test
    void testStarIconPath(){
        recommendedOperatorsModel = getModel("/content/recommendedOperators");
        assertEquals("Star_Icon_Path",recommendedOperatorsModel.getStarIconPath());
    }

    @Test
    void negativeTestStarIconPath(){
        recommendedOperatorsModel = getModel("/content/recommendedOperators");
        assertNotEquals("",recommendedOperatorsModel.getStarIconPath());
    }

    @Test
    void testViewAllBtnLabel(){
        recommendedOperatorsModel = getModel("/content/recommendedOperators");
        assertEquals("View_All_Label",recommendedOperatorsModel.getViewAllBtnLabel());
    }

    @Test
    void negativeTestViewAllBtnLabel(){
        recommendedOperatorsModel = getModel("/content/recommendedOperators");
        assertNotEquals("",recommendedOperatorsModel.getViewAllBtnLabel());
    }

    @Test
    void testOperatorDetailPagePath(){
        recommendedOperatorsModel = getModel("/content/recommendedOperators");
        assertEquals("Operator_Detail_Page.html",recommendedOperatorsModel.getOperatorDetailPagePath());
    }

    @Test
    void negativeTestOperatorDetailPagePath(){
        recommendedOperatorsModel = getModel("/content/recommendedOperators");
        assertNotEquals("",recommendedOperatorsModel.getOperatorDetailPagePath());
    }

    @Test
    void testNewTab(){
        recommendedOperatorsModel = getModel("/content/recommendedOperators");
        assertEquals("New_Tab",recommendedOperatorsModel.getNewTab());
    }

    @Test
    void negativeTestNewTab(){
        recommendedOperatorsModel = getModel("/content/recommendedOperators");
        assertNotEquals("",recommendedOperatorsModel.getNewTab());
    }

    @Test
    void testStarIconAltText(){
        recommendedOperatorsModel = getModel("/content/recommendedOperators");
        assertEquals("Star_Icon_Alt_Text",recommendedOperatorsModel.getStarIconAltText());
    }

    @Test
    void negativeTestStarIconAltText(){
        recommendedOperatorsModel = getModel("/content/recommendedOperators");
        assertNotEquals("",recommendedOperatorsModel.getStarIconAltText());
    }

    @Test
    void testThumbnailImageAltText(){
        recommendedOperatorsModel = getModel("/content/recommendedOperators");
        assertEquals("Thumbnail_Image_Alt_Text",recommendedOperatorsModel.getThumbnailImageAltText());
    }

    @Test
    void negativeTestThumbnailImageAltText(){
        recommendedOperatorsModel = getModel("/content/recommendedOperators");
        assertNotEquals("",recommendedOperatorsModel.getThumbnailImageAltText());
    }

    @Test
    void testStarRatingLabel(){
        recommendedOperatorsModel = getModel("/content/recommendedOperators");
        assertEquals("Star",recommendedOperatorsModel.getStarRatingLabel());
    }

    @Test
    void negativeTestStarRatingLabel(){
        recommendedOperatorsModel = getModel("/content/recommendedOperators");
        assertNotEquals("",recommendedOperatorsModel.getStarRatingLabel());
    }

    private RecommendedOperatorsModelImpl getModel(String currentResource){
        ctx.currentResource(currentResource);
        return ctx.request().adaptTo(RecommendedOperatorsModelImpl.class);
    }

}