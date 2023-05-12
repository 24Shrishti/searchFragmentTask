package com.re.wanderlust.core.filters;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.FilterChain;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.Cookie;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.servlets.annotations.SlingServletFilter;
import org.apache.sling.servlets.annotations.SlingServletFilterScope;
import org.osgi.service.component.annotations.Component;


@Component
@SlingServletFilter(scope = {SlingServletFilterScope.REQUEST},
        pattern = "/content/re-wanderlust/.*",
        extensions = {"html"},
        methods = {"GET"})
public class UrlValidatorFilter implements Filter {

    @Override
    public void init(final FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(final ServletRequest request, final
    ServletResponse response, final FilterChain chain)
            throws ServletException, IOException {
            SlingHttpServletRequest slingRequest =
                (SlingHttpServletRequest) request;

        if (slingRequest != null) {
            final Cookie[] cookies = slingRequest.getCookies();
            if (cookies != null) {
                for (final Cookie cookie : cookies) {
                    if (cookie.getName().equalsIgnoreCase("x-Device-Type")
                            && cookie.getValue().equalsIgnoreCase("app")) {
                        try {
                            String url = String.
                                    valueOf(slingRequest.getRequestURL());
                            String[] urlSpliter = url.
                                    split(".html");
                            String finalUrl = urlSpliter[0].
                                    split("localhost:4502")[1].
                                    concat(".app").concat(".html");
                            RequestDispatcher requestDispatcher = slingRequest.
                                    getRequestDispatcher(finalUrl);
                            requestDispatcher.forward(request, response);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        break;
                    }
                }
            }
        }
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {

    }
}
