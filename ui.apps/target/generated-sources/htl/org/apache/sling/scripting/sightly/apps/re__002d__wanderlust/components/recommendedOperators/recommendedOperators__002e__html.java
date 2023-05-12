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
package org.apache.sling.scripting.sightly.apps.re__002d__wanderlust.components.recommendedOperators;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class recommendedOperators__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _global_model = null;
Object _global_templates = null;
Object _global_operatorslimit = null;
Object _dynamic_caconfig = bindings.get("caconfig");
_global_model = renderContext.call("use", com.re.wanderlust.core.models.RecommendedOperatorsModel.class.getName(), obj());
_global_templates = renderContext.call("use", "core/wcm/components/commons/v1/templates.html", obj());
_global_operatorslimit = renderContext.getObjectModel().resolveProperty(_global_model, "operatorsLimit");
if (renderContext.getObjectModel().toBoolean(_global_operatorslimit)) {
    out.write("\r\n    <span id='operatorLimit'");
    {
        Object var_attrvalue0 = renderContext.getObjectModel().resolveProperty(_global_model, "operatorsLimit");
        {
            Object var_attrcontent1 = renderContext.call("xss", var_attrvalue0, "attribute");
            {
                boolean var_shoulddisplayattr3 = (((null != var_attrcontent1) && (!"".equals(var_attrcontent1))) && ((!"".equals(var_attrvalue0)) && (!((Object)false).equals(var_attrvalue0))));
                if (var_shoulddisplayattr3) {
                    out.write(" data-listLimit");
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
        Object var_attrvalue4 = renderContext.getObjectModel().resolveProperty(_global_model, "notFound");
        {
            Object var_attrcontent5 = renderContext.call("xss", var_attrvalue4, "attribute");
            {
                boolean var_shoulddisplayattr7 = (((null != var_attrcontent5) && (!"".equals(var_attrcontent5))) && ((!"".equals(var_attrvalue4)) && (!((Object)false).equals(var_attrvalue4))));
                if (var_shoulddisplayattr7) {
                    out.write(" data-notFoundMsg");
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
        Object var_attrvalue8 = renderContext.getObjectModel().resolveProperty(_global_model, "serverError");
        {
            Object var_attrcontent9 = renderContext.call("xss", var_attrvalue8, "attribute");
            {
                boolean var_shoulddisplayattr11 = (((null != var_attrcontent9) && (!"".equals(var_attrcontent9))) && ((!"".equals(var_attrvalue8)) && (!((Object)false).equals(var_attrvalue8))));
                if (var_shoulddisplayattr11) {
                    out.write(" data-serverErrorMsg");
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
        Object var_attrvalue12 = renderContext.getObjectModel().resolveProperty(_global_model, "badRequest");
        {
            Object var_attrcontent13 = renderContext.call("xss", var_attrvalue12, "attribute");
            {
                boolean var_shoulddisplayattr15 = (((null != var_attrcontent13) && (!"".equals(var_attrcontent13))) && ((!"".equals(var_attrvalue12)) && (!((Object)false).equals(var_attrvalue12))));
                if (var_shoulddisplayattr15) {
                    out.write(" data-badRequest");
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
        Object var_attrvalue16 = renderContext.getObjectModel().resolveProperty(_global_model, "newTab");
        {
            Object var_attrcontent17 = renderContext.call("xss", var_attrvalue16, "attribute");
            {
                boolean var_shoulddisplayattr19 = (((null != var_attrcontent17) && (!"".equals(var_attrcontent17))) && ((!"".equals(var_attrvalue16)) && (!((Object)false).equals(var_attrvalue16))));
                if (var_shoulddisplayattr19) {
                    out.write(" data-openInNewTab");
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
        Object var_attrvalue20 = renderContext.getObjectModel().resolveProperty(_global_model, "starIconPath");
        {
            Object var_attrcontent21 = renderContext.call("xss", var_attrvalue20, "attribute");
            {
                boolean var_shoulddisplayattr23 = (((null != var_attrcontent21) && (!"".equals(var_attrcontent21))) && ((!"".equals(var_attrvalue20)) && (!((Object)false).equals(var_attrvalue20))));
                if (var_shoulddisplayattr23) {
                    out.write(" data-starIconImage");
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
        Object var_attrvalue24 = renderContext.getObjectModel().resolveProperty(_global_model, "preSuffixName");
        {
            Object var_attrcontent25 = renderContext.call("xss", var_attrvalue24, "attribute");
            {
                boolean var_shoulddisplayattr27 = (((null != var_attrcontent25) && (!"".equals(var_attrcontent25))) && ((!"".equals(var_attrvalue24)) && (!((Object)false).equals(var_attrvalue24))));
                if (var_shoulddisplayattr27) {
                    out.write(" data-preSuffixName");
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
        Object var_attrvalue28 = renderContext.getObjectModel().resolveProperty(_global_model, "starRatingLabel");
        {
            Object var_attrcontent29 = renderContext.call("xss", var_attrvalue28, "attribute");
            {
                boolean var_shoulddisplayattr31 = (((null != var_attrcontent29) && (!"".equals(var_attrcontent29))) && ((!"".equals(var_attrvalue28)) && (!((Object)false).equals(var_attrvalue28))));
                if (var_shoulddisplayattr31) {
                    out.write(" data-starRatingLabel");
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
        Object var_attrvalue32 = renderContext.getObjectModel().resolveProperty(renderContext.getObjectModel().resolveProperty(_dynamic_caconfig, "com.re.wanderlust.core.caconfig.APIUrlsConfig"), "apiBaseUrl");
        {
            Object var_attrcontent33 = renderContext.call("xss", var_attrvalue32, "attribute");
            {
                boolean var_shoulddisplayattr35 = (((null != var_attrcontent33) && (!"".equals(var_attrcontent33))) && ((!"".equals(var_attrvalue32)) && (!((Object)false).equals(var_attrvalue32))));
                if (var_shoulddisplayattr35) {
                    out.write(" data-baseApiUrl");
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
        Object var_attrvalue36 = renderContext.getObjectModel().resolveProperty(_global_model, "starIconAltText");
        {
            Object var_attrcontent37 = renderContext.call("xss", var_attrvalue36, "attribute");
            {
                boolean var_shoulddisplayattr39 = (((null != var_attrcontent37) && (!"".equals(var_attrcontent37))) && ((!"".equals(var_attrvalue36)) && (!((Object)false).equals(var_attrvalue36))));
                if (var_shoulddisplayattr39) {
                    out.write(" data-starIconImageAltText");
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
        Object var_attrvalue40 = renderContext.getObjectModel().resolveProperty(_global_model, "thumbnailImageAltText");
        {
            Object var_attrcontent41 = renderContext.call("xss", var_attrvalue40, "attribute");
            {
                boolean var_shoulddisplayattr43 = (((null != var_attrcontent41) && (!"".equals(var_attrcontent41))) && ((!"".equals(var_attrvalue40)) && (!((Object)false).equals(var_attrvalue40))));
                if (var_shoulddisplayattr43) {
                    out.write(" data-thumbnailImage");
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
        Object var_attrvalue44 = renderContext.getObjectModel().resolveProperty(_global_model, "operatorDetailPagePath");
        {
            Object var_attrcontent45 = renderContext.call("xss", var_attrvalue44, "attribute");
            {
                boolean var_shoulddisplayattr47 = (((null != var_attrcontent45) && (!"".equals(var_attrcontent45))) && ((!"".equals(var_attrvalue44)) && (!((Object)false).equals(var_attrvalue44))));
                if (var_shoulddisplayattr47) {
                    out.write(" data-operatorDetailPagePath");
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
        Object var_attrvalue48 = renderContext.call("xss", renderContext.call("uriManipulation", renderContext.getObjectModel().resolveProperty(_global_model, "operatorListingPagePath"), obj().with("extension", "html")), "uri");
        {
            boolean var_shoulddisplayattr51 = ((!"".equals(var_attrvalue48)) && (!((Object)false).equals(var_attrvalue48)));
            if (var_shoulddisplayattr51) {
                out.write(" data-operatorListingPagePath");
                {
                    boolean var_istrueattr50 = (var_attrvalue48.equals(true));
                    if (!var_istrueattr50) {
                        out.write("=\"");
                        out.write(renderContext.getObjectModel().toString(var_attrvalue48));
                        out.write("\"");
                    }
                }
            }
        }
    }
    {
        Object var_attrvalue52 = renderContext.getObjectModel().resolveProperty(renderContext.getObjectModel().resolveProperty(_dynamic_caconfig, "com.re.wanderlust.core.caconfig.APIUrlsConfig"), "operatorListAPIUrl");
        {
            Object var_attrcontent53 = renderContext.call("xss", var_attrvalue52, "attribute");
            {
                boolean var_shoulddisplayattr55 = (((null != var_attrcontent53) && (!"".equals(var_attrcontent53))) && ((!"".equals(var_attrvalue52)) && (!((Object)false).equals(var_attrvalue52))));
                if (var_shoulddisplayattr55) {
                    out.write(" data-operatorsApiUrl");
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
        Object var_attrvalue56 = renderContext.getObjectModel().resolveProperty(renderContext.getObjectModel().resolveProperty(_dynamic_caconfig, "com.re.wanderlust.core.caconfig.LocalStorageKeysConfig"), "currentLatKey");
        {
            Object var_attrcontent57 = renderContext.call("xss", var_attrvalue56, "attribute");
            {
                boolean var_shoulddisplayattr59 = (((null != var_attrcontent57) && (!"".equals(var_attrcontent57))) && ((!"".equals(var_attrvalue56)) && (!((Object)false).equals(var_attrvalue56))));
                if (var_shoulddisplayattr59) {
                    out.write(" data-currentLatKey");
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
        Object var_attrvalue60 = renderContext.getObjectModel().resolveProperty(renderContext.getObjectModel().resolveProperty(_dynamic_caconfig, "com.re.wanderlust.core.caconfig.LocalStorageKeysConfig"), "currentLongKey");
        {
            Object var_attrcontent61 = renderContext.call("xss", var_attrvalue60, "attribute");
            {
                boolean var_shoulddisplayattr63 = (((null != var_attrcontent61) && (!"".equals(var_attrcontent61))) && ((!"".equals(var_attrvalue60)) && (!((Object)false).equals(var_attrvalue60))));
                if (var_shoulddisplayattr63) {
                    out.write(" data-currentLongKey");
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
    {
        Object var_attrvalue64 = renderContext.getObjectModel().resolveProperty(renderContext.getObjectModel().resolveProperty(_dynamic_caconfig, "com.re.wanderlust.core.caconfig.LocalStorageKeysConfig"), "updatedLatKey");
        {
            Object var_attrcontent65 = renderContext.call("xss", var_attrvalue64, "attribute");
            {
                boolean var_shoulddisplayattr67 = (((null != var_attrcontent65) && (!"".equals(var_attrcontent65))) && ((!"".equals(var_attrvalue64)) && (!((Object)false).equals(var_attrvalue64))));
                if (var_shoulddisplayattr67) {
                    out.write(" data-updatedLatKey");
                    {
                        boolean var_istrueattr66 = (var_attrvalue64.equals(true));
                        if (!var_istrueattr66) {
                            out.write("=\"");
                            out.write(renderContext.getObjectModel().toString(var_attrcontent65));
                            out.write("\"");
                        }
                    }
                }
            }
        }
    }
    {
        Object var_attrvalue68 = renderContext.getObjectModel().resolveProperty(renderContext.getObjectModel().resolveProperty(_dynamic_caconfig, "com.re.wanderlust.core.caconfig.LocalStorageKeysConfig"), "updatedLongKey");
        {
            Object var_attrcontent69 = renderContext.call("xss", var_attrvalue68, "attribute");
            {
                boolean var_shoulddisplayattr71 = (((null != var_attrcontent69) && (!"".equals(var_attrcontent69))) && ((!"".equals(var_attrvalue68)) && (!((Object)false).equals(var_attrvalue68))));
                if (var_shoulddisplayattr71) {
                    out.write(" data-updatedLongKey");
                    {
                        boolean var_istrueattr70 = (var_attrvalue68.equals(true));
                        if (!var_istrueattr70) {
                            out.write("=\"");
                            out.write(renderContext.getObjectModel().toString(var_attrcontent69));
                            out.write("\"");
                        }
                    }
                }
            }
        }
    }
    {
        Object var_attrvalue72 = renderContext.getObjectModel().resolveProperty(_global_model, "defaultLat");
        {
            Object var_attrcontent73 = renderContext.call("xss", var_attrvalue72, "attribute");
            {
                boolean var_shoulddisplayattr75 = (((null != var_attrcontent73) && (!"".equals(var_attrcontent73))) && ((!"".equals(var_attrvalue72)) && (!((Object)false).equals(var_attrvalue72))));
                if (var_shoulddisplayattr75) {
                    out.write(" data-defaultLat");
                    {
                        boolean var_istrueattr74 = (var_attrvalue72.equals(true));
                        if (!var_istrueattr74) {
                            out.write("=\"");
                            out.write(renderContext.getObjectModel().toString(var_attrcontent73));
                            out.write("\"");
                        }
                    }
                }
            }
        }
    }
    {
        Object var_attrvalue76 = renderContext.getObjectModel().resolveProperty(_global_model, "defaultLong");
        {
            Object var_attrcontent77 = renderContext.call("xss", var_attrvalue76, "attribute");
            {
                boolean var_shoulddisplayattr79 = (((null != var_attrcontent77) && (!"".equals(var_attrcontent77))) && ((!"".equals(var_attrvalue76)) && (!((Object)false).equals(var_attrvalue76))));
                if (var_shoulddisplayattr79) {
                    out.write(" data-defaultLong");
                    {
                        boolean var_istrueattr78 = (var_attrvalue76.equals(true));
                        if (!var_istrueattr78) {
                            out.write("=\"");
                            out.write(renderContext.getObjectModel().toString(var_attrcontent77));
                            out.write("\"");
                        }
                    }
                }
            }
        }
    }
    {
        Object var_attrvalue80 = renderContext.getObjectModel().resolveProperty(_global_model, "fromDefaultLatLong");
        {
            Object var_attrcontent81 = renderContext.call("xss", var_attrvalue80, "attribute");
            {
                boolean var_shoulddisplayattr83 = (((null != var_attrcontent81) && (!"".equals(var_attrcontent81))) && ((!"".equals(var_attrvalue80)) && (!((Object)false).equals(var_attrvalue80))));
                if (var_shoulddisplayattr83) {
                    out.write(" data-fetchFromDefaultLatLong");
                    {
                        boolean var_istrueattr82 = (var_attrvalue80.equals(true));
                        if (!var_istrueattr82) {
                            out.write("=\"");
                            out.write(renderContext.getObjectModel().toString(var_attrcontent81));
                            out.write("\"");
                        }
                    }
                }
            }
        }
    }
    {
        Object var_attrvalue84 = renderContext.getObjectModel().resolveProperty(_global_model, "categoryType");
        {
            Object var_attrcontent85 = renderContext.call("xss", var_attrvalue84, "attribute");
            {
                boolean var_shoulddisplayattr87 = (((null != var_attrcontent85) && (!"".equals(var_attrcontent85))) && ((!"".equals(var_attrvalue84)) && (!((Object)false).equals(var_attrvalue84))));
                if (var_shoulddisplayattr87) {
                    out.write(" data-categoryType");
                    {
                        boolean var_istrueattr86 = (var_attrvalue84.equals(true));
                        if (!var_istrueattr86) {
                            out.write("=\"");
                            out.write(renderContext.getObjectModel().toString(var_attrcontent85));
                            out.write("\"");
                        }
                    }
                }
            }
        }
    }
    out.write(">\r\n    </span>\r\n\r\n    ");
    {
        boolean var_testvariable88 = (!renderContext.getObjectModel().toBoolean(renderContext.getObjectModel().resolveProperty(_global_model, "hideComponent")));
        if (var_testvariable88) {
            out.write("<div class=\"rew-recommendedOperators rew-recommendedOperators-ga position-relative\">\r\n\r\n        \r\n        <!-- Recommended Operators Carousel -->\r\n\r\n        <div class=\"recommended-operators-carousel-comp\">\r\n            <div class=\"container\">\r\n                <div class=\"row\">\r\n                    ");
            {
                Object var_resourcecontent89 = renderContext.call("includeResource", "topRentalPartnersCompTitle", obj().with("resourceType", "algolia/components/instantsearch/languageNavigation"));
                out.write(renderContext.getObjectModel().toString(var_resourcecontent89));
            }
            out.write("\r\n                    <div class=\"col-12 position-relative\">\r\n                        <a class=\"operatorAncorTag see-all position-absolute d-none \"");
            {
                String var_attrcontent90 = ((("background-color: " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "btnColor"), "styleToken"))) + ";color: ") + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "textColor"), "styleToken")));
                out.write(" style=\"");
                out.write(renderContext.getObjectModel().toString(var_attrcontent90));
                out.write("\"");
            }
            out.write(" href=\"#\">");
            {
                Object var_91 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "viewAllBtnLabel"), "text");
                out.write(renderContext.getObjectModel().toString(var_91));
            }
            out.write("</a>\r\n                        <div class=\"col-12 hero-section\">\r\n                        </div>\r\n                    </div>\r\n                    <div class=\"col-12 text-center\" id=\"noResultWrapper-recommended-operators\">\r\n                        <h6 class=\"mb-2 text-white\" id=\"noREsultFound-recommended-operators\"></h6>\r\n                    </div>\r\n                </div>\r\n            </div>\r\n        </div>\r\n\r\n        ");
            {
                boolean var_testvariable92 = (org.apache.sling.scripting.sightly.compiler.expression.nodes.BinaryOperator.strictEq(renderContext.getObjectModel().resolveProperty(_global_model, "categoryType"), "Rental"));
                if (var_testvariable92) {
                    out.write("<div class=\"container recommended-operator-loader\">\r\n            <div class=\"loading\">\r\n                <div class=\"loading-bar\"></div>\r\n                <div class=\"loading-bar\"></div>\r\n                <div class=\"loading-bar\"></div>\r\n                <div class=\"loading-bar\"></div>\r\n            </div>\r\n        </div>");
                }
            }
            out.write("\r\n\r\n        ");
            {
                boolean var_testvariable93 = (org.apache.sling.scripting.sightly.compiler.expression.nodes.BinaryOperator.strictEq(renderContext.getObjectModel().resolveProperty(_global_model, "categoryType"), "tour"));
                if (var_testvariable93) {
                    out.write("<div class=\"container row gy-4 recommended-operator-loader\">\r\n            <div class=\"py-5 col-md-6 col-xl-4\">\r\n                <div class=\"card is-loading border-0\">\r\n                    <div class=\"image\"></div>\r\n                    <div class=\"content\">\r\n                        <h2></h2>\r\n                        <p></p>\r\n                    </div>\r\n                </div>\r\n            </div>\r\n            <div class=\"py-5 col-md-6 col-xl-4\">\r\n                <div class=\"card is-loading border-0\">\r\n                    <div class=\"image\"></div>\r\n                    <div class=\"content\">\r\n                        <h2></h2>\r\n                        <p></p>\r\n                    </div>\r\n                </div>\r\n            </div>\r\n            <div class=\"py-5 col-md-6 col-xl-4\">\r\n                <div class=\"card is-loading border-0\">\r\n                    <div class=\"image\"></div>\r\n                    <div class=\"content\">\r\n                        <h2></h2>\r\n                        <p></p>\r\n                    </div>\r\n                </div>\r\n            </div>\r\n        </div>");
                }
            }
            out.write("\r\n    </div>");
        }
    }
    out.write("\r\n");
}
out.write("\r\n");
{
    Object var_templatevar94 = renderContext.getObjectModel().resolveProperty(_global_templates, "placeholder");
    {
        boolean var_templateoptions95_field$_isempty = (!renderContext.getObjectModel().toBoolean(_global_operatorslimit));
        {
            java.util.Map var_templateoptions95 = obj().with("isEmpty", var_templateoptions95_field$_isempty);
            callUnit(out, renderContext, var_templatevar94, var_templateoptions95);
        }
    }
}
out.write("\r\n\r\n\r\n<script id=\"operators-template\" type=\"text/x-handlebars-template\">\r\n\r\n    <div class=\"recommended-operators-carousel-comp__carousel\">\r\n        {{#each data}}\r\n        <div class=\"position-relative card56\">\r\n            <a class=\"operatorAncorTag-image detail-path\" data-operatorName=\"{{name}}\" href=\"{{../operatorDetailPagePath}}{{../preSuffixName}}/{{customer_id}}\" data-customerid=\"{{customer_id}}\">\r\n                <img loading=\"lazy\" src=\"{{image_url}}\" alt=\"{{../thumbnailImageAltText}}\" class=\"w-100 mb-3\" />\r\n            </a>\r\n            <a href=\"{{../operatorDetailPagePath}}{{../preSuffixName}}/{{customer_id}}\" data-operatorName=\"{{name}}\" data-customerid=\"{{customer_id}}\" class=\"stretched-link operatorAncorTag-image\">\r\n                <h6 class=\"mb-1\">{{name}}</h6>\r\n            </a>\r\n            <p class=\"badge rounded-1 py-1 font-size-2 d-inline-flex align-items-center\" style=\"\">\r\n                <span class=\"rating-star d-flex fw-bold\"><img src=\"{{../starIconImage}}\" class=\"me-1\" alt=\"{{../starticonAltText}}\"></span> {{total_rating}} {{../starRatingLabel}}</p>\r\n        </div>\r\n        {{/each}}\r\n    </div>\r\n</script>\r\n<!-- End Recommended Operators Carousel -->");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

