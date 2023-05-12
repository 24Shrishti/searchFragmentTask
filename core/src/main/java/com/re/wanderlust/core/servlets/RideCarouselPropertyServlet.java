package com.re.wanderlust.core.servlets;

import com.day.cq.commons.jcr.JcrConstants;
import com.day.cq.wcm.api.Page;
import com.day.cq.wcm.api.PageManager;
import com.re.wanderlust.core.constants.CommonConstants;
import com.re.wanderlust.core.exception.REWException;
import org.apache.commons.lang3.StringUtils;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.resource.ModifiableValueMap;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.api.servlets.HttpConstants;
import org.apache.sling.api.servlets.SlingAllMethodsServlet;
import org.apache.sling.servlets.annotations.SlingServletResourceTypes;
import org.osgi.service.component.annotations.Component;

import javax.servlet.Servlet;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component(service = {Servlet.class})
@SlingServletResourceTypes(
        resourceTypes = RideCarouselPropertyServlet.RESOURCE_TYPE,
        methods = HttpConstants.METHOD_GET,
        selectors = RideCarouselPropertyServlet.RIDE_CAROUSEL,
        extensions = RideCarouselPropertyServlet.JSON)
public class RideCarouselPropertyServlet extends SlingAllMethodsServlet {

    public static final String RIDE_CAROUSEL = "ridecarousel";
    public static final String RESOURCE_TYPE = "re-wanderlust"
            + "/components/rideDetailCarousel";
    public static final String JSON = "json";
    public static final String ALT_TEXT = "altText";
    public static final String MOBILE_IMAGE = "mobileImage";
    public static final String DESKTOP_IMAGE = "desktopImage";
    public static final String TERRAIN = "terrain";
    public static final String DAYS_COUNT = "daysCount";

    @Override
    protected void doGet(final SlingHttpServletRequest request,
                          final SlingHttpServletResponse response)
            throws IOException {

        String altText = request.getParameter(ALT_TEXT);
        String mobileImage = request.getParameter(MOBILE_IMAGE);
        String desktopImage = request.getParameter(DESKTOP_IMAGE);
        String terrain = request.getParameter(TERRAIN);
        String daysCount = request.getParameter(DAYS_COUNT);

        try {
            validateParams(altText,
                    mobileImage,
                    desktopImage,
                    terrain,
                    daysCount);
        } catch (REWException e) {
            response.getWriter().write(e.getMessage());
        }

        ResourceResolver resolver = request.getResourceResolver();
        Resource currentResource = request.getResource();

        PageManager pageManager = resolver.adaptTo(PageManager.class);

        Page currentPage = pageManager.getContainingPage(currentResource);
        Resource pageContentResource = resolver.getResource(
                currentPage.getPath() + CommonConstants.SLASH
                + JcrConstants.JCR_CONTENT);

        ModifiableValueMap modifiableValueMap =
                pageContentResource.adaptTo(ModifiableValueMap.class);
        modifiableValueMap.put("altText", altText);
        modifiableValueMap.put("mobileImage", mobileImage);
        modifiableValueMap.put("desktopImage", desktopImage);
        modifiableValueMap.put("terrain", terrain);
        modifiableValueMap.put("daysCount", daysCount);


        resolver.commit();

        response.setStatus(HttpServletResponse.SC_OK);

    }

    private void validateParams(final String altText,
                                final String mobileImage,
                                final String desktopImage,
                                final String terrain,
                                final String daysCount)
            throws REWException {
        if (StringUtils.isAllBlank(altText,
                mobileImage,
                desktopImage,
                terrain, daysCount)) {
            throw new REWException("Invalid Params,"
                    + " please provide required fields");
        }
    }

}
