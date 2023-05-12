package com.re.wanderlust.core.servlets;

import com.google.gson.Gson;
import com.re.wanderlust.core.beans.FragmentEntity;
import com.re.wanderlust.core.services.SearchFragmentService;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.servlets.HttpConstants;
import org.apache.sling.api.servlets.SlingSafeMethodsServlet;
import org.osgi.framework.Constants;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import java.io.IOException;
import java.util.List;

@Component(
        service = Servlet.class,
        property = {Constants.SERVICE_DESCRIPTION + "=Search Fragment",
                "sling.servlet.methods=" + HttpConstants.METHOD_GET,
                "sling.servlet.paths=" + "/apps/searchFragment"}
)
public class SearchFragmentServlet extends SlingSafeMethodsServlet {

    @Reference
    private SearchFragmentService searchFragmentService;

    @Override
    protected void doGet(final SlingHttpServletRequest request,
                         final SlingHttpServletResponse response)
            throws ServletException, IOException {

        String latitude = request.getParameter("lat");
        String longitude = request.getParameter("long");
        String url = "https://api.opencagedata.com/geocode/v1/json"
                + "?key=19d6e22dc8aa492db9f04643e169c933&q="
                + latitude + "%2C" + longitude + "&pretty=1&no_annotations=1";
        List<FragmentEntity> fragmentList = searchFragmentService.
                getFragmentData(url, request);
        Gson gson = new Gson();
        String list = gson.toJson(fragmentList);
        response.getWriter().write(list);
    }
}
