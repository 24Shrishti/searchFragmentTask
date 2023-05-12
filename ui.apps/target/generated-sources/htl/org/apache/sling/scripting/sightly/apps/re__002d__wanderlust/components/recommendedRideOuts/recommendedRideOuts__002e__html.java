/*******************************************************************************
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 ******************************************************************************/
package org.apache.sling.scripting.sightly.apps.re__002d__wanderlust.components.recommendedRideOuts;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class recommendedRideOuts__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _global_model = null;
Object _global_template = null;
Object _global_iconlogoimage = null;
Object _dynamic_caconfig = bindings.get("caconfig");
_global_model = renderContext.call("use", com.re.wanderlust.core.models.RecommendedRideOutsModel.class.getName(), obj());
_global_template = renderContext.call("use", "core/wcm/components/commons/v1/templates.html", obj());
_global_iconlogoimage = renderContext.getObjectModel().resolveProperty(_global_model, "iconLogoImage");
if (renderContext.getObjectModel().toBoolean(_global_iconlogoimage)) {
    out.write("\r\n\r\n    <div id=\"dataAttribute\"");
    {
        Object var_attrvalue0 = renderContext.getObjectModel().resolveProperty(_global_model, "newTab");
        {
            Object var_attrcontent1 = renderContext.call("xss", var_attrvalue0, "attribute");
            {
                boolean var_shoulddisplayattr3 = (((null != var_attrcontent1) && (!"".equals(var_attrcontent1))) && ((!"".equals(var_attrvalue0)) && (!((Object)false).equals(var_attrvalue0))));
                if (var_shoulddisplayattr3) {
                    out.write(" data-newTab");
                    {
                        boolean var_istrueattr2 = (var_attrvalue0.equals(true));
                        if (!var_istrueattr2) {
                            out.write("=\"");
                            out.write(renderContext.getObjectModel().toString(var_attrcontent1));
                            out.write("\"");
                        }
                    }
                }
            }
        }
    }
    {
        Object var_attrvalue4 = renderContext.getObjectModel().resolveProperty(_global_model, "cardLimit");
        {
            Object var_attrcontent5 = renderContext.call("xss", var_attrvalue4, "attribute");
            {
                boolean var_shoulddisplayattr7 = (((null != var_attrcontent5) && (!"".equals(var_attrcontent5))) && ((!"".equals(var_attrvalue4)) && (!((Object)false).equals(var_attrvalue4))));
                if (var_shoulddisplayattr7) {
                    out.write(" data-cardLimit");
                    {
                        boolean var_istrueattr6 = (var_attrvalue4.equals(true));
                        if (!var_istrueattr6) {
                            out.write("=\"");
                            out.write(renderContext.getObjectModel().toString(var_attrcontent5));
                            out.write("\"");
                        }
                    }
                }
            }
        }
    }
    {
        Object var_attrvalue8 = renderContext.getObjectModel().resolveProperty(_global_model, "notFound");
        {
            Object var_attrcontent9 = renderContext.call("xss", var_attrvalue8, "attribute");
            {
                boolean var_shoulddisplayattr11 = (((null != var_attrcontent9) && (!"".equals(var_attrcontent9))) && ((!"".equals(var_attrvalue8)) && (!((Object)false).equals(var_attrvalue8))));
                if (var_shoulddisplayattr11) {
                    out.write(" data-notFoundMsg");
                    {
                        boolean var_istrueattr10 = (var_attrvalue8.equals(true));
                        if (!var_istrueattr10) {
                            out.write("=\"");
                            out.write(renderContext.getObjectModel().toString(var_attrcontent9));
                            out.write("\"");
                        }
                    }
                }
            }
        }
    }
    {
        Object var_attrvalue12 = renderContext.getObjectModel().resolveProperty(_global_model, "serverError");
        {
            Object var_attrcontent13 = renderContext.call("xss", var_attrvalue12, "attribute");
            {
                boolean var_shoulddisplayattr15 = (((null != var_attrcontent13) && (!"".equals(var_attrcontent13))) && ((!"".equals(var_attrvalue12)) && (!((Object)false).equals(var_attrvalue12))));
                if (var_shoulddisplayattr15) {
                    out.write(" data-serverErrorMsg");
                    {
                        boolean var_istrueattr14 = (var_attrvalue12.equals(true));
                        if (!var_istrueattr14) {
                            out.write("=\"");
                            out.write(renderContext.getObjectModel().toString(var_attrcontent13));
                            out.write("\"");
                        }
                    }
                }
            }
        }
    }
    {
        Object var_attrvalue16 = renderContext.getObjectModel().resolveProperty(_global_model, "badRequest");
        {
            Object var_attrcontent17 = renderContext.call("xss", var_attrvalue16, "attribute");
            {
                boolean var_shoulddisplayattr19 = (((null != var_attrcontent17) && (!"".equals(var_attrcontent17))) && ((!"".equals(var_attrvalue16)) && (!((Object)false).equals(var_attrvalue16))));
                if (var_shoulddisplayattr19) {
                    out.write(" data-badRequest");
                    {
                        boolean var_istrueattr18 = (var_attrvalue16.equals(true));
                        if (!var_istrueattr18) {
                            out.write("=\"");
                            out.write(renderContext.getObjectModel().toString(var_attrcontent17));
                            out.write("\"");
                        }
                    }
                }
            }
        }
    }
    {
        Object var_attrvalue20 = renderContext.getObjectModel().resolveProperty(_global_model, "checkForApi");
        {
            Object var_attrcontent21 = renderContext.call("xss", var_attrvalue20, "attribute");
            {
                boolean var_shoulddisplayattr23 = (((null != var_attrcontent21) && (!"".equals(var_attrcontent21))) && ((!"".equals(var_attrvalue20)) && (!((Object)false).equals(var_attrvalue20))));
                if (var_shoulddisplayattr23) {
                    out.write(" data-checkForApi");
                    {
                        boolean var_istrueattr22 = (var_attrvalue20.equals(true));
                        if (!var_istrueattr22) {
                            out.write("=\"");
                            out.write(renderContext.getObjectModel().toString(var_attrcontent21));
                            out.write("\"");
                        }
                    }
                }
            }
        }
    }
    {
        Object var_attrvalue24 = renderContext.getObjectModel().resolveProperty(renderContext.getObjectModel().resolveProperty(_dynamic_caconfig, "com.re.wanderlust.core.caconfig.APIUrlsConfig"), "apiBaseUrl");
        {
            Object var_attrcontent25 = renderContext.call("xss", var_attrvalue24, "attribute");
            {
                boolean var_shoulddisplayattr27 = (((null != var_attrcontent25) && (!"".equals(var_attrcontent25))) && ((!"".equals(var_attrvalue24)) && (!((Object)false).equals(var_attrvalue24))));
                if (var_shoulddisplayattr27) {
                    out.write(" data-baseApiUrl");
                    {
                        boolean var_istrueattr26 = (var_attrvalue24.equals(true));
                        if (!var_istrueattr26) {
                            out.write("=\"");
                            out.write(renderContext.getObjectModel().toString(var_attrcontent25));
                            out.write("\"");
                        }
                    }
                }
            }
        }
    }
    {
        Object var_attrvalue28 = renderContext.getObjectModel().resolveProperty(renderContext.getObjectModel().resolveProperty(_dynamic_caconfig, "com.re.wanderlust.core.caconfig.APIUrlsConfig"), "recommendedRideOutsAPIUrl");
        {
            Object var_attrcontent29 = renderContext.call("xss", var_attrvalue28, "attribute");
            {
                boolean var_shoulddisplayattr31 = (((null != var_attrcontent29) && (!"".equals(var_attrcontent29))) && ((!"".equals(var_attrvalue28)) && (!((Object)false).equals(var_attrvalue28))));
                if (var_shoulddisplayattr31) {
                    out.write(" data-recommendedRideOutsApiUrl");
                    {
                        boolean var_istrueattr30 = (var_attrvalue28.equals(true));
                        if (!var_istrueattr30) {
                            out.write("=\"");
                            out.write(renderContext.getObjectModel().toString(var_attrcontent29));
                            out.write("\"");
                        }
                    }
                }
            }
        }
    }
    {
        Object var_attrvalue32 = renderContext.getObjectModel().resolveProperty(_global_model, "iconLogoImageAltText");
        {
            Object var_attrcontent33 = renderContext.call("xss", var_attrvalue32, "attribute");
            {
                boolean var_shoulddisplayattr35 = (((null != var_attrcontent33) && (!"".equals(var_attrcontent33))) && ((!"".equals(var_attrvalue32)) && (!((Object)false).equals(var_attrvalue32))));
                if (var_shoulddisplayattr35) {
                    out.write(" data-iconLogoImageAltText");
                    {
                        boolean var_istrueattr34 = (var_attrvalue32.equals(true));
                        if (!var_istrueattr34) {
                            out.write("=\"");
                            out.write(renderContext.getObjectModel().toString(var_attrcontent33));
                            out.write("\"");
                        }
                    }
                }
            }
        }
    }
    {
        Object var_attrvalue36 = renderContext.getObjectModel().resolveProperty(_global_model, "dayLabel");
        {
            Object var_attrcontent37 = renderContext.call("xss", var_attrvalue36, "attribute");
            {
                boolean var_shoulddisplayattr39 = (((null != var_attrcontent37) && (!"".equals(var_attrcontent37))) && ((!"".equals(var_attrvalue36)) && (!((Object)false).equals(var_attrvalue36))));
                if (var_shoulddisplayattr39) {
                    out.write(" data-dayalabel");
                    {
                        boolean var_istrueattr38 = (var_attrvalue36.equals(true));
                        if (!var_istrueattr38) {
                            out.write("=\"");
                            out.write(renderContext.getObjectModel().toString(var_attrcontent37));
                            out.write("\"");
                        }
                    }
                }
            }
        }
    }
    {
        Object var_attrvalue40 = renderContext.getObjectModel().resolveProperty(_global_model, "rightArrowIcon");
        {
            Object var_attrcontent41 = renderContext.call("xss", var_attrvalue40, "attribute");
            {
                boolean var_shoulddisplayattr43 = (((null != var_attrcontent41) && (!"".equals(var_attrcontent41))) && ((!"".equals(var_attrvalue40)) && (!((Object)false).equals(var_attrvalue40))));
                if (var_shoulddisplayattr43) {
                    out.write(" data-rightArrowIcon");
                    {
                        boolean var_istrueattr42 = (var_attrvalue40.equals(true));
                        if (!var_istrueattr42) {
                            out.write("=\"");
                            out.write(renderContext.getObjectModel().toString(var_attrcontent41));
                            out.write("\"");
                        }
                    }
                }
            }
        }
    }
    {
        Object var_attrvalue44 = renderContext.getObjectModel().resolveProperty(_global_model, "thumbnailImageAltText");
        {
            Object var_attrcontent45 = renderContext.call("xss", var_attrvalue44, "attribute");
            {
                boolean var_shoulddisplayattr47 = (((null != var_attrcontent45) && (!"".equals(var_attrcontent45))) && ((!"".equals(var_attrvalue44)) && (!((Object)false).equals(var_attrvalue44))));
                if (var_shoulddisplayattr47) {
                    out.write(" data-thumbnailImageAltText");
                    {
                        boolean var_istrueattr46 = (var_attrvalue44.equals(true));
                        if (!var_istrueattr46) {
                            out.write("=\"");
                            out.write(renderContext.getObjectModel().toString(var_attrcontent45));
                            out.write("\"");
                        }
                    }
                }
            }
        }
    }
    {
        Object var_attrvalue48 = renderContext.getObjectModel().resolveProperty(_global_model, "iconLogoImage");
        {
            Object var_attrcontent49 = renderContext.call("xss", var_attrvalue48, "attribute");
            {
                boolean var_shoulddisplayattr51 = (((null != var_attrcontent49) && (!"".equals(var_attrcontent49))) && ((!"".equals(var_attrvalue48)) && (!((Object)false).equals(var_attrvalue48))));
                if (var_shoulddisplayattr51) {
                    out.write(" data-iconLogoImage");
                    {
                        boolean var_istrueattr50 = (var_attrvalue48.equals(true));
                        if (!var_istrueattr50) {
                            out.write("=\"");
                            out.write(renderContext.getObjectModel().toString(var_attrcontent49));
                            out.write("\"");
                        }
                    }
                }
            }
        }
    }
    {
        Object var_attrvalue52 = renderContext.getObjectModel().resolveProperty(_global_model, "defaultLat");
        {
            Object var_attrcontent53 = renderContext.call("xss", var_attrvalue52, "attribute");
            {
                boolean var_shoulddisplayattr55 = (((null != var_attrcontent53) && (!"".equals(var_attrcontent53))) && ((!"".equals(var_attrvalue52)) && (!((Object)false).equals(var_attrvalue52))));
                if (var_shoulddisplayattr55) {
                    out.write(" data-defaultLat");
                    {
                        boolean var_istrueattr54 = (var_attrvalue52.equals(true));
                        if (!var_istrueattr54) {
                            out.write("=\"");
                            out.write(renderContext.getObjectModel().toString(var_attrcontent53));
                            out.write("\"");
                        }
                    }
                }
            }
        }
    }
    {
        Object var_attrvalue56 = renderContext.getObjectModel().resolveProperty(_global_model, "defaultLong");
        {
            Object var_attrcontent57 = renderContext.call("xss", var_attrvalue56, "attribute");
            {
                boolean var_shoulddisplayattr59 = (((null != var_attrcontent57) && (!"".equals(var_attrcontent57))) && ((!"".equals(var_attrvalue56)) && (!((Object)false).equals(var_attrvalue56))));
                if (var_shoulddisplayattr59) {
                    out.write(" data-defaultLong");
                    {
                        boolean var_istrueattr58 = (var_attrvalue56.equals(true));
                        if (!var_istrueattr58) {
                            out.write("=\"");
                            out.write(renderContext.getObjectModel().toString(var_attrcontent57));
                            out.write("\"");
                        }
                    }
                }
            }
        }
    }
    {
        Object var_attrvalue60 = renderContext.getObjectModel().resolveProperty(_global_model, "rideOuts");
        {
            Object var_attrcontent61 = renderContext.call("xss", var_attrvalue60, "attribute");
            {
                boolean var_shoulddisplayattr63 = (((null != var_attrcontent61) && (!"".equals(var_attrcontent61))) && ((!"".equals(var_attrvalue60)) && (!((Object)false).equals(var_attrvalue60))));
                if (var_shoulddisplayattr63) {
                    out.write(" data-rideOuts");
                    {
                        boolean var_istrueattr62 = (var_attrvalue60.equals(true));
                        if (!var_istrueattr62) {
                            out.write("=\"");
                            out.write(renderContext.getObjectModel().toString(var_attrcontent61));
                            out.write("\"");
                        }
                    }
                }
            }
        }
    }
    out.write(">\r\n    </div>\r\n    ");
    {
        boolean var_testvariable64 = (!renderContext.getObjectModel().toBoolean(renderContext.getObjectModel().resolveProperty(_global_model, "hideComponent")));
        if (var_testvariable64) {
            out.write("<div class=\"rew-recommendedRidesOut rew-recommendedRidesOut-ga\">\r\n        <!-- Recommended Ride Outs Carousel -->\r\n        <div class=\"recommended-ride-outs-comp\">\r\n            <div class=\"container\">\r\n                <div class=\"row\">\r\n                    ");
            {
                Object var_resourcecontent65 = renderContext.call("includeResource", "ridesByReCompTitle", obj().with("resourceType", "algolia/components/instantsearch/languageNavigation"));
                out.write(renderContext.getObjectModel().toString(var_resourcecontent65));
            }
            out.write("\r\n                    <div class=\"col-12 recommendedRideOut-search-list-container\"></div>\r\n                    <div class=\"col-12 recommendedRideOutAuthored-search-list-container\"></div>\r\n                    <div class=\"col-12 text-center\" id=\"noResultWrapper-recommendedRideOuts\">\r\n                        <h6 class=\"mb-2 text-white\" id=\"noREsultFound-recommendedRideOuts\"></h6>\r\n                    </div>\r\n                </div>\r\n            </div>\r\n            <div class=\"container recommended-rideOuts-loader\">\r\n                <div class=\"loading\">\r\n                    <div class=\"loading-bar\"></div>\r\n                    <div class=\"loading-bar\"></div>\r\n                    <div class=\"loading-bar\"></div>\r\n                    <div class=\"loading-bar\"></div>\r\n                </div>\r\n            </div>\r\n        </div>\r\n        <script id=\"authoredRideOut-search-template\" type=\"text/x-handlebars-template\">\r\n            <div class=\"recommended-ride-outs-comp__carousel\">\r\n                {{#each this}}\r\n                <div class=\"position-relative card78\">\r\n                    <div class=\"position-relative\">\r\n                        <a class=\"recommendedRidesOutAnchor\" data-rideOutName=\"{{rideName}}\" href=\"{{webPagePath}}\">\r\n                            <img loading=\"lazy\" src=\"{{thumbnailImage}}\" alt=\"{{rideName}}\" class=\"w-100 mb-3\" />\r\n                            <span class=\"badge position-absolute bottom-0 start-0 ms-2 mb-2 d-flex align-items-center\">\r\n\t\t\t\t\t\t\t<img src=\"{{../iconLogoImage}}\" alt=\"{{../iconLogoImageAltText}}\" class=\"me-2\">{{daysCount}}</span>\r\n                        </a>\r\n\r\n                    </div>\r\n                    <h6 class=\"mb-1\">{{rideName}}</h6>\r\n                    <p class=\"ride-location d-flex flex-wrap align-items-center mb-2\">{{startLocation}} <span class=\"cmp-icon mx-1\"><img src=\"{{../rightArrowIcon}}\"> </span> {{endLocation}}</p>\r\n                    {{#hideShowDateDiv startDate endDate}}\r\n                    <p class=\"mb-0 ride-location-date\">{{dateFormater startDate}} - {{dateFormater endDate}}</p>\r\n                    {{/hideShowDateDiv}}\r\n                </div>\r\n                {{/each}}\r\n            </div>\r\n        </script>\r\n        <script id=\"recommendedRideOut-search-template\" type=\"text/x-handlebars-template\">\r\n            <div class=\"recommended-ride-outs-comp__carousel\">\r\n                {{#each (limit data.data cardLimit)}}\r\n                <div class=\"position-relative card78\">\r\n                    <div class=\"position-relative\">\r\n                        <a class=\"recommendedRidesOutAnchor\" data-rideOutName=\"{{title}}\" href=\"{{pagePath}}\">\r\n                            <img loading=\"lazy\" src=\"{{thumbnailImagePath}}\" alt=\"{{../thumbnailImageAltText}}\" class=\"w-100 mb-3\" />\r\n                            <span class=\"badge position-absolute bottom-0 start-0 ms-2 mb-2 d-flex align-items-center\">\r\n\t\t\t\t\t\t\t<img src=\"{{../iconLogoImage}}\" alt=\"{{../iconLogoImageAltText}}\" class=\"me-2\">{{substractDays startDateString endDateString}} {{../dayLabel}}</span>\r\n                        </a>\r\n\r\n                    </div>\r\n                    <h6 class=\"mb-1\">{{title}}</h6>\r\n                    <p class=\"ride-location mb-2\">{{origin}} <span class=\"cmp-icon icon-destination\"> </span> {{destination}}</p>\r\n                    <p class=\"mb-0 ride-location-date\">{{dateFormater startDateString}} - {{dateFormater endDateString}}</p>\r\n                </div>\r\n                {{/each}}\r\n            </div>\r\n        </script>\r\n    </div>");
        }
    }
    out.write("\r\n");
}
out.write("\r\n");
{
    Object var_templatevar66 = renderContext.getObjectModel().resolveProperty(_global_template, "placeholder");
    {
        boolean var_templateoptions67_field$_isempty = (!renderContext.getObjectModel().toBoolean(_global_iconlogoimage));
        {
            java.util.Map var_templateoptions67 = obj().with("isEmpty", var_templateoptions67_field$_isempty);
            callUnit(out, renderContext, var_templatevar66, var_templateoptions67);
        }
    }
}


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

