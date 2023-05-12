package com.re.wanderlust.core.models;
import com.re.wanderlust.core.models.impl.ToursSearchFormModelImpl;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



public class ToursSearchFormModelTest {


    @InjectMocks
    private ToursSearchFormModelImpl model;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);

        model.setDescription("description");
        model.setAltText("err");
        model.setAutoplay("true");
        model.setContinueLabel("continue");
        model.setDesktopGif("/content/dam/re-wanderlust/terrainIcon.gif");
        model.setDesktopImage("/content/dam/re-wanderlust/location Icon.png");
        model.setDesktopVideo("/content/dam/re-wanderlust/terrainIcon.mp4");
        model.setExploreButton("CTA Button Link");
        model.setExploreButtonLabel("expLabel");
        model.setFetchFromApi("true");
        model.setMobileGif("/content/dam/re-wanderlust/terrainIcon.gif");
        model.setMobileImage("/content/dam/re-wanderlust/location Icon.png");
        model.setMobileVideo("/content/dam/re-wanderlust/terrainIcon.mp4");
        model.setMute("true");
        model.setSelectMontYearPopup("select Month And Year Label");
        model.setReLogoImage("/content/dam/re-wanderlust/location Icon.png");
        model.setSelectMedia("Video");
        model.setStartLocValidation("startValid");
        model.setThumbnailDesktop("/content/dam/re-wanderlust/calenderIcon.png");
        model.setThumbnailMobile("/content/dam/re-wanderlust/calenderIcon.png");
        model.setTitle("title");
        model.setType("H1");
    }

    @Test
    public void testGetDescription() {
        assertEquals("description", model.getDescription());
    }

    @Test
    public void negativeTestDescription() {
        assertNotEquals("", model.getDescription());
    }

    @Test
    public void testGetAltText() {
        assertEquals("err", model.getAltText());
    }

    @Test
    public void negativeTestAltText() {
        assertNotEquals("", model.getAltText());
    }

    @Test
    public void testGetAutoplay() {
        assertEquals("true", model.getAutoplay());
    }

    @Test
    public void negativeTestAutoplay() {
        assertNotEquals("", model.getAutoplay());
    }

    @Test
    public void testGetContinueLabel() {
        assertEquals("continue", model.getContinueLabel());
    }

    @Test
    public void negativeTestContinueLabel() {
        assertNotEquals("", model.getContinueLabel());
    }

    @Test
    public void testGetDesktopGif() {
        assertEquals("/content/dam/re-wanderlust/terrainIcon.gif", model.getDesktopGif());
    }

    @Test
    public void negativeTestDesktopGif() {
        assertNotEquals("", model.getDesktopGif());
    }

    @Test
    public void testGetDesktopImage() {
        assertEquals("/content/dam/re-wanderlust/location Icon.png", model.getDesktopImage());
    }

    @Test
    public void negativeTestDesktopImage() {
        assertNotEquals("", model.getDesktopImage());
    }

    @Test
    public void testGetDesktopVideo() {
        assertEquals("/content/dam/re-wanderlust/terrainIcon.mp4", model.getDesktopVideo());
    }

    @Test
    public void negativeTestDesktopVideo() {
        assertNotEquals("", model.getDesktopVideo());
    }

    @Test
    public void testGetExploreButton() {
        assertEquals("CTA Button Link", model.getExploreButton());
    }

    @Test
    public void negativeTestExploreButton() {
        assertNotEquals("", model.getExploreButton());
    }

    @Test
    public void testExploreButtonLabel() {
        assertEquals("expLabel", model.getExploreButtonLabel());
    }

    @Test
    public void negativeTestExploreButtonLabel() {
        assertNotEquals("", model.getExploreButtonLabel());
    }

    @Test
    public void testGetFetchFromApi() {
        assertEquals("true", model.getFetchFromApi());
    }

    @Test
    public void negativeTestFetchFromApi() {
        assertNotEquals("", model.getFetchFromApi());
    }

    @Test
    public void testGetMobileGif() {
        assertEquals("/content/dam/re-wanderlust/terrainIcon.gif", model.getMobileGif());
    }

    @Test
    public void negativeTestMobileGif() {
        assertNotEquals("", model.getMobileGif());
    }

    @Test
    public void testGetMobileImage() {
        assertEquals("/content/dam/re-wanderlust/location Icon.png", model.getMobileImage());
    }

    @Test
    public void negativeTestMobileImage() {
        assertNotEquals("", model.getMobileImage());
    }

    @Test
    public void testGetMobileVideo() {
        assertEquals("/content/dam/re-wanderlust/terrainIcon.mp4", model.getMobileVideo());
    }

    @Test
    public void negativeTestMobileVideo() {
        assertNotEquals("", model.getMobileVideo());
    }

    @Test
    public void testGetMute() {
        assertEquals("true", model.getMute());
    }

    @Test
    public void negativeTestMute() {
        assertNotEquals("", model.getMute());
    }

    @Test
    public void testGetSelectMontYearPopup() {
        assertEquals("select Month And Year Label", model.getSelectMontYearPopup());
    }

    @Test
    public void negativeTestSelectMontYearPopup() {
        assertNotEquals("", model.getSelectMontYearPopup());
    }

    @Test
    public void testGetReLogoImage() {
        assertEquals("/content/dam/re-wanderlust/location Icon.png", model.getReLogoImage());
    }

    @Test
    public void negativeTestReLogoImage() {
        assertNotEquals("", model.getReLogoImage());
    }

    @Test
    public void testGetSelectMedia() {
        assertEquals("Video", model.getSelectMedia());
    }

    @Test
    public void negativeTestSelectMedia() {
        assertNotEquals("", model.getSelectMedia());
    }

    @Test
    public void testGetStartLocValidation() {
        assertEquals("startValid", model.getStartLocValidation());
    }

    @Test
    public void negativeTestStartLocValidation() {
        assertNotEquals("", model.getStartLocValidation());
    }

    @Test
    public void testGetThumbnailDesktop() {
        assertEquals("/content/dam/re-wanderlust/calenderIcon.png", model.getThumbnailDesktop());
    }

    @Test
    public void negativeTestDestinationLabel() {
        assertNotEquals("", model.getThumbnailDesktop());
    }


    @Test
    public void testGetThumbnailMobile() {
        assertEquals("/content/dam/re-wanderlust/calenderIcon.png", model.getThumbnailMobile());
    }

    @Test
    public void negativeTestThumbnailMobile() {
        assertNotEquals("", model.getThumbnailMobile());
    }

    @Test
    public void testGetTitle() {
        assertEquals("title", model.getTitle());
    }

    @Test
    public void negativeTestTitle() {
        assertNotEquals("", model.getTitle());
    }

    @Test
    public void testGetType() {
        assertEquals("H1", model.getType());
    }

    @Test
    public void negativeTestType() {
        assertNotEquals("", model.getType());
    }


}
