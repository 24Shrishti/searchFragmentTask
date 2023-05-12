package com.re.wanderlust.core.servlets;

import com.day.cq.commons.jcr.JcrConstants;
import com.day.cq.wcm.api.Page;
import com.day.cq.wcm.api.PageManager;
import com.re.wanderlust.core.constants.CommonConstants;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.resource.ModifiableValueMap;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.api.resource.ValueMap;
import org.apache.sling.api.servlets.HttpConstants;
import org.apache.sling.api.servlets.SlingSafeMethodsServlet;
import org.apache.sling.servlets.annotations.SlingServletResourceTypes;
import org.osgi.service.component.annotations.Component;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@Component(service = {Servlet.class})
@SlingServletResourceTypes(
        resourceTypes = ExperienceDetailedPageServlet.RESOURCE_TYPE,
        methods = HttpConstants.METHOD_GET,
        selectors = ExperienceDetailedPageServlet.EXPERIENCE_CAROUSEL,
        extensions = ExperienceDetailedPageServlet.JSON)

public class ExperienceDetailedPageServlet extends SlingSafeMethodsServlet {

    public static final String EXPERIENCE_CAROUSEL = "experience";
    public static final String RESOURCE_TYPE =
            "re-wanderlust/components/experienceComp";
    public static final String JSON = "json";

    private static  String mobileImage;
    private static  String desktopImage;
    private static  String thumbnailImage;
    private static  String altText;


    @Override
    protected void doGet(final SlingHttpServletRequest request,
                         final SlingHttpServletResponse response)
            throws ServletException, IOException {


        ResourceResolver resourceResolver = request.getResourceResolver();
        Resource currentResource = request.getResource();

        Resource parentResource = currentResource.getChild("fieldItems");
        if (parentResource != null && parentResource.hasChildren()) {
//            for(Resource childResource : fieldItems.getChildren()) {
            ValueMap valueMap = parentResource.getChild("item0").getValueMap();
            if (valueMap.containsKey("desktopImage")) {
                mobileImage = valueMap.get("desktopImage", String.class);
            }
            if (valueMap.containsKey("mobileImage")) {
                desktopImage = valueMap.get("mobileImage", String.class);
            }
            if (valueMap.containsKey("videoThumbnail")) {
                thumbnailImage = valueMap.get("videoThumbnail", String.class);
            }
            if (valueMap.containsKey("altText")) {
                altText = valueMap.get("altText", String.class);
            }
        }

        PageManager pageManager = resourceResolver.adaptTo(PageManager.class);

        Page currentPage = pageManager.getContainingPage(currentResource);

        Resource pageCurrentResource = resourceResolver.
                getResource(currentPage.getPath()
                + CommonConstants.SLASH
                + JcrConstants.JCR_CONTENT);

        ModifiableValueMap modifiableValueMap =
                pageCurrentResource.adaptTo(ModifiableValueMap.class);
        modifiableValueMap.put("mobileImage", mobileImage);
        modifiableValueMap.put("desktopImage", desktopImage);
        modifiableValueMap.put("videoThumbnail", thumbnailImage);
        modifiableValueMap.put("altText", altText);

        resourceResolver.commit();
        response.setStatus(HttpServletResponse.SC_OK);
    }
}
