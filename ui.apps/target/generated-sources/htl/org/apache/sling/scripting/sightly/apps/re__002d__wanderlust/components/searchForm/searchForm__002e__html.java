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
package org.apache.sling.scripting.sightly.apps.re__002d__wanderlust.components.searchForm;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class searchForm__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _global_model = null;
Object _dynamic_caconfig = bindings.get("caconfig");
Collection var_collectionvar28_list_coerced$ = null;
_global_model = renderContext.call("use", com.re.wanderlust.core.models.SearchFormContainer.class.getName(), obj());
out.write("\r\n    <script");
{
    String var_attrcontent0 = (((renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(renderContext.getObjectModel().resolveProperty(_dynamic_caconfig, "com.re.wanderlust.core.caconfig.APIUrlsConfig"), "googleMapsAPIUrl"), "uri")) + "?key=") + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(renderContext.getObjectModel().resolveProperty(_dynamic_caconfig, "com.re.wanderlust.core.caconfig.APIKeysConfig"), "googleMapAPIKey"), "uri"))) + "&libraries=places");
    out.write(" src=\"");
    out.write(renderContext.getObjectModel().toString(var_attrcontent0));
    out.write("\"");
}
out.write("></script>\r\n    ");
{
    boolean var_testvariable1 = (!renderContext.getObjectModel().toBoolean(renderContext.getObjectModel().resolveProperty(_global_model, "hideComponent")));
    if (var_testvariable1) {
        out.write("<div class=\"search-form-wrap\">\r\n        <div class=\"container ride-search-comp__teaser ride-search-comp__teaser-ga g-0 \">\r\n            <div class=\"image aem-GridColumn aem-GridColumn--default--12 position-relative\">\r\n                <div class=\"col-md-8 col-xl-6 position-absolute ride-search-comp__heading\">\r\n                    <h2 class=\"\">");
        {
            Object var_2 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "title"), "text");
            out.write(renderContext.getObjectModel().toString(var_2));
        }
        out.write("</h2>\r\n                    <p>");
        {
            Object var_3 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "description"), "text");
            out.write(renderContext.getObjectModel().toString(var_3));
        }
        out.write("</p>\r\n                </div>\r\n                <picture>\r\n                    <source class=\"mobile w-100\" id=\"bannerMobileImg\"");
        {
            Object var_attrvalue4 = renderContext.getObjectModel().resolveProperty(_global_model, "mobileImage");
            {
                Object var_attrcontent5 = renderContext.call("xss", var_attrvalue4, "attribute");
                {
                    boolean var_shoulddisplayattr7 = (((null != var_attrcontent5) && (!"".equals(var_attrcontent5))) && ((!"".equals(var_attrvalue4)) && (!((Object)false).equals(var_attrvalue4))));
                    if (var_shoulddisplayattr7) {
                        out.write(" srcset");
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
        out.write(" media=\"(max-width: 767px)\"/>\r\n                    <img class=\"bg w-100\" id=\"bannerDesktopImg\"");
        {
            Object var_attrvalue8 = renderContext.getObjectModel().resolveProperty(_global_model, "desktopImage");
            {
                Object var_attrcontent9 = renderContext.call("xss", var_attrvalue8, "attribute");
                {
                    boolean var_shoulddisplayattr11 = (((null != var_attrcontent9) && (!"".equals(var_attrcontent9))) && ((!"".equals(var_attrvalue8)) && (!((Object)false).equals(var_attrvalue8))));
                    if (var_shoulddisplayattr11) {
                        out.write(" srcset");
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
            Object var_attrvalue12 = renderContext.getObjectModel().resolveProperty(_global_model, "title");
            {
                Object var_attrcontent13 = renderContext.call("xss", var_attrvalue12, "attribute");
                {
                    boolean var_shoulddisplayattr15 = (((null != var_attrcontent13) && (!"".equals(var_attrcontent13))) && ((!"".equals(var_attrvalue12)) && (!((Object)false).equals(var_attrvalue12))));
                    if (var_shoulddisplayattr15) {
                        out.write(" alt");
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
            Object var_attrvalue16 = renderContext.getObjectModel().resolveProperty(_global_model, "title");
            {
                Object var_attrcontent17 = renderContext.call("xss", var_attrvalue16, "attribute");
                {
                    boolean var_shoulddisplayattr19 = (((null != var_attrcontent17) && (!"".equals(var_attrcontent17))) && ((!"".equals(var_attrvalue16)) && (!((Object)false).equals(var_attrvalue16))));
                    if (var_shoulddisplayattr19) {
                        out.write(" title");
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
        out.write("/>\r\n                </picture>\r\n            </div>\r\n            <div class=\"col-md-12 ride-search-comp__login-form\">\r\n               \r\n                <div");
        {
            String var_attrcontent20 = ("search-result-top-bar d-flex flex-wrap flex-xl-nowrap flex-column flex-md-row " + renderContext.getObjectModel().toString(renderContext.call("xss", (renderContext.getObjectModel().toBoolean(renderContext.getObjectModel().resolveProperty(_global_model, "hideRidersCount")) ? "search-result-top-bar__without-riderCount" : ""), "attribute")));
            out.write(" class=\"");
            out.write(renderContext.getObjectModel().toString(var_attrcontent20));
            out.write("\"");
        }
        out.write(">\r\n                    <div class=\"search-drop-box\">\r\n                        \r\n                            ");
        {
            boolean var_testvariable21 = (org.apache.sling.scripting.sightly.compiler.expression.nodes.BinaryOperator.strictEq(renderContext.getObjectModel().resolveProperty(_global_model, "locationApi"), "googleApi"));
            if (var_testvariable21) {
                out.write("\r\n                                <input");
                {
                    Object var_attrvalue22 = renderContext.getObjectModel().resolveProperty(_global_model, "startLabel");
                    {
                        Object var_attrcontent23 = renderContext.call("xss", var_attrvalue22, "attribute");
                        {
                            boolean var_shoulddisplayattr25 = (((null != var_attrcontent23) && (!"".equals(var_attrcontent23))) && ((!"".equals(var_attrvalue22)) && (!((Object)false).equals(var_attrvalue22))));
                            if (var_shoulddisplayattr25) {
                                out.write(" placeholder");
                                {
                                    boolean var_istrueattr24 = (var_attrvalue22.equals(true));
                                    if (!var_istrueattr24) {
                                        out.write("=\"");
                                        out.write(renderContext.getObjectModel().toString(var_attrcontent23));
                                        out.write("\"");
                                    }
                                }
                            }
                        }
                    }
                }
                out.write(" type=\"start point\" class=\"form-control\" id=\"enterStartPoint-searchForm\" aria-describedby=\"startPoint\" autocomplete=\"on\" runat=\"server\"/>\r\n                            ");
            }
        }
        out.write("\r\n                            ");
        {
            boolean var_testvariable26 = (org.apache.sling.scripting.sightly.compiler.expression.nodes.BinaryOperator.strictEq(renderContext.getObjectModel().resolveProperty(_global_model, "locationApi"), "authorable"));
            if (var_testvariable26) {
                out.write("\r\n                                <div class=\"dropdown location-selector-dropdown\">\r\n                                    <button class=\"bg-transparent text-white text-start dropdown-toggle location-btn-val w-100 rounded-0 border\" type=\"button\" id=\"dropdownMenuButton1\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">");
                {
                    String var_27 = (("\r\n                                        " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "startLabel"), "text"))) + "\r\n                                    ");
                    out.write(renderContext.getObjectModel().toString(var_27));
                }
                out.write("</button>\r\n                                    ");
                {
                    Object var_testvariable35 = renderContext.getObjectModel().resolveProperty(_global_model, "locations");
                    if (renderContext.getObjectModel().toBoolean(var_testvariable35)) {
                        {
                            Object var_collectionvar28 = renderContext.getObjectModel().resolveProperty(_global_model, "locations");
                            {
                                long var_size29 = ((var_collectionvar28_list_coerced$ == null ? (var_collectionvar28_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar28)) : var_collectionvar28_list_coerced$).size());
                                {
                                    boolean var_notempty30 = (var_size29 > 0);
                                    if (var_notempty30) {
                                        {
                                            long var_end33 = var_size29;
                                            {
                                                boolean var_validstartstepend34 = (((0 < var_size29) && true) && (var_end33 > 0));
                                                if (var_validstartstepend34) {
                                                    out.write("<ul class=\"dropdown-menu border-0 rounded-0 shadow-lg\" aria-labelledby=\"dropdownMenuButton1\" id=\"entryPointDropdown\">");
                                                    if (var_collectionvar28_list_coerced$ == null) {
                                                        var_collectionvar28_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar28);
                                                    }
                                                    long var_index36 = 0;
                                                    for (Object item : var_collectionvar28_list_coerced$) {
                                                        {
                                                            boolean var_traversal38 = (((var_index36 >= 0) && (var_index36 <= var_end33)) && true);
                                                            if (var_traversal38) {
                                                                out.write("\r\n                                        <li><button type=\"button\" class=\"dropdown-item location-opt-btn entryPointOptions\"");
                                                                {
                                                                    Object var_attrvalue39 = renderContext.getObjectModel().resolveProperty(item, "locationLatitude");
                                                                    {
                                                                        Object var_attrcontent40 = renderContext.call("xss", var_attrvalue39, "attribute");
                                                                        {
                                                                            boolean var_shoulddisplayattr42 = (((null != var_attrcontent40) && (!"".equals(var_attrcontent40))) && ((!"".equals(var_attrvalue39)) && (!((Object)false).equals(var_attrvalue39))));
                                                                            if (var_shoulddisplayattr42) {
                                                                                out.write(" data-lat");
                                                                                {
                                                                                    boolean var_istrueattr41 = (var_attrvalue39.equals(true));
                                                                                    if (!var_istrueattr41) {
                                                                                        out.write("=\"");
                                                                                        out.write(renderContext.getObjectModel().toString(var_attrcontent40));
                                                                                        out.write("\"");
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                {
                                                                    Object var_attrvalue43 = renderContext.getObjectModel().resolveProperty(item, "locationLongitude");
                                                                    {
                                                                        Object var_attrcontent44 = renderContext.call("xss", var_attrvalue43, "attribute");
                                                                        {
                                                                            boolean var_shoulddisplayattr46 = (((null != var_attrcontent44) && (!"".equals(var_attrcontent44))) && ((!"".equals(var_attrvalue43)) && (!((Object)false).equals(var_attrvalue43))));
                                                                            if (var_shoulddisplayattr46) {
                                                                                out.write(" data-long");
                                                                                {
                                                                                    boolean var_istrueattr45 = (var_attrvalue43.equals(true));
                                                                                    if (!var_istrueattr45) {
                                                                                        out.write("=\"");
                                                                                        out.write(renderContext.getObjectModel().toString(var_attrcontent44));
                                                                                        out.write("\"");
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                {
                                                                    Object var_attrvalue47 = renderContext.getObjectModel().resolveProperty(item, "locationName");
                                                                    {
                                                                        Object var_attrcontent48 = renderContext.call("xss", var_attrvalue47, "attribute");
                                                                        {
                                                                            boolean var_shoulddisplayattr50 = (((null != var_attrcontent48) && (!"".equals(var_attrcontent48))) && ((!"".equals(var_attrvalue47)) && (!((Object)false).equals(var_attrvalue47))));
                                                                            if (var_shoulddisplayattr50) {
                                                                                out.write(" data-name");
                                                                                {
                                                                                    boolean var_istrueattr49 = (var_attrvalue47.equals(true));
                                                                                    if (!var_istrueattr49) {
                                                                                        out.write("=\"");
                                                                                        out.write(renderContext.getObjectModel().toString(var_attrcontent48));
                                                                                        out.write("\"");
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                out.write(">");
                                                                {
                                                                    Object var_51 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(item, "locationName"), "text");
                                                                    out.write(renderContext.getObjectModel().toString(var_51));
                                                                }
                                                                out.write("</button></li>\r\n                                    ");
                                                            }
                                                        }
                                                        var_index36++;
                                                    }
                                                    out.write("</ul>");
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            var_collectionvar28_list_coerced$ = null;
                        }
                    }
                }
                out.write("\r\n                                </div>\r\n                            ");
            }
        }
        out.write("\r\n                            ");
        {
            boolean var_testvariable52 = (org.apache.sling.scripting.sightly.compiler.expression.nodes.BinaryOperator.strictEq(renderContext.getObjectModel().resolveProperty(_global_model, "locationApi"), "rentalsApi"));
            if (var_testvariable52) {
                out.write("\r\n                                <div class=\"dropdown location-selector-dropdown\">\r\n                                    <button class=\"bg-transparent text-white text-start dropdown-toggle location-btn-val w-100 rounded-0 border\" type=\"button\" id=\"dropdownMenuButton1\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">");
                {
                    String var_53 = (("\r\n                                        " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "startLabel"), "text"))) + "\r\n                                    ");
                    out.write(renderContext.getObjectModel().toString(var_53));
                }
                out.write("</button>\r\n                                    <ul class=\"dropdown-menu border-0 rounded-0 shadow-lg\" aria-labelledby=\"dropdownMenuButton1\" id=\"entryPointDropdown\">\r\n                                       \r\n                                    </ul>\r\n                                </div>\r\n                            ");
            }
        }
        out.write("\r\n                            <input type=\"hidden\" id=\"citySearchForm\" name=\"city2\"/>\r\n                            <input type=\"hidden\" id=\"cityLat2\" name=\"cityLat\"/>\r\n                            <input type=\"hidden\" id=\"cityLng2\" name=\"cityLng\"/>\r\n                            <span class=\"inputField-search-form-msg error-msg\"></span>\r\n                        \r\n                    </div>\r\n                    <div class=\"search-drop-box\">\r\n                        <div class=\"input-group selectRange\">\r\n                            <div data-bs-toggle=\"modal\" data-bs-target=\"#myModalDatePicker\" id=\"displaySelectedDate\" class=\"open-modal\">");
        {
            String var_54 = ("\r\n                                " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "calenderPlaceholder"), "text")));
            out.write(renderContext.getObjectModel().toString(var_54));
        }
        out.write("</div>\r\n                            <span class=\"calender-search-form-msg error-msg\" style=\"margin-top: 6px\"></span>\r\n                        </div>\r\n                    </div>\r\n                    <div class=\"search-drop-box riders-count-wrap\">\r\n                        <div class=\"input-group d-flex ridesToRent\">\r\n                            <div class=\"\"><span>");
        {
            Object var_55 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "noRidesLabel"), "text");
            out.write(renderContext.getObjectModel().toString(var_55));
        }
        out.write("</span></div>\r\n                            <div class=\"d-flex\">\r\n                                <button type=\"button\" id=\"sub\" class=\"sub\" aria-label=\"Minus button\">\r\n                                    <span class=\"cmp-icon icon-minus\"></span>\r\n                                </button>\r\n                                <input type=\"number\" id=\"riderRange\" value=\"1\" min=\"1\" max=\"3\"/>\r\n                                <button type=\"button\" id=\"add\" class=\"add\" aria-label=\"Plus button\"><span class=\"cmp-icon icon-plus\"></span></button>\r\n                            </div>\r\n                        </div>\r\n                    </div>\r\n                    <div class=\"searchFormSubmitBtn\">\r\n                        <div class=\"button button__primary-v2 w-100 \">\r\n                            <button class=\"cmp-button position-relative rounded-0 \" type=\"submit\" id=\"searchRedirectPath\"");
        {
            Object var_attrvalue56 = renderContext.getObjectModel().resolveProperty(renderContext.getObjectModel().resolveProperty(_dynamic_caconfig, "com.re.wanderlust.core.caconfig.APIKeysConfig"), "googleAutoCompleteSearchReason");
            {
                Object var_attrcontent57 = renderContext.call("xss", var_attrvalue56, "attribute");
                {
                    boolean var_shoulddisplayattr59 = (((null != var_attrcontent57) && (!"".equals(var_attrcontent57))) && ((!"".equals(var_attrvalue56)) && (!((Object)false).equals(var_attrvalue56))));
                    if (var_shoulddisplayattr59) {
                        out.write(" data-googleAutoCompleteSearchReason");
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
            Object var_attrvalue60 = renderContext.getObjectModel().resolveProperty(renderContext.getObjectModel().resolveProperty(_dynamic_caconfig, "com.re.wanderlust.core.caconfig.APIUrlsConfig"), "apiBaseUrl");
            {
                Object var_attrcontent61 = renderContext.call("xss", var_attrvalue60, "attribute");
                {
                    boolean var_shoulddisplayattr63 = (((null != var_attrcontent61) && (!"".equals(var_attrcontent61))) && ((!"".equals(var_attrvalue60)) && (!((Object)false).equals(var_attrvalue60))));
                    if (var_shoulddisplayattr63) {
                        out.write(" data-baseApiUrl");
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
            Object var_attrvalue64 = renderContext.getObjectModel().resolveProperty(renderContext.getObjectModel().resolveProperty(_dynamic_caconfig, "com.re.wanderlust.core.caconfig.APIUrlsConfig"), "rentalCityAPIUrl");
            {
                Object var_attrcontent65 = renderContext.call("xss", var_attrvalue64, "attribute");
                {
                    boolean var_shoulddisplayattr67 = (((null != var_attrcontent65) && (!"".equals(var_attrcontent65))) && ((!"".equals(var_attrvalue64)) && (!((Object)false).equals(var_attrvalue64))));
                    if (var_shoulddisplayattr67) {
                        out.write(" data-rentalCity");
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
            Object var_attrvalue68 = renderContext.call("xss", renderContext.call("uriManipulation", renderContext.getObjectModel().resolveProperty(_global_model, "redirectionPath"), obj().with("extension", "html")), "uri");
            {
                boolean var_shoulddisplayattr71 = ((!"".equals(var_attrvalue68)) && (!((Object)false).equals(var_attrvalue68)));
                if (var_shoulddisplayattr71) {
                    out.write(" data-redirectionPath");
                    {
                        boolean var_istrueattr70 = (var_attrvalue68.equals(true));
                        if (!var_istrueattr70) {
                            out.write("=\"");
                            out.write(renderContext.getObjectModel().toString(var_attrvalue68));
                            out.write("\"");
                        }
                    }
                }
            }
        }
        {
            Object var_attrvalue72 = renderContext.getObjectModel().resolveProperty(_global_model, "startPointvalidationMsg");
            {
                Object var_attrcontent73 = renderContext.call("xss", var_attrvalue72, "attribute");
                {
                    boolean var_shoulddisplayattr75 = (((null != var_attrcontent73) && (!"".equals(var_attrcontent73))) && ((!"".equals(var_attrvalue72)) && (!((Object)false).equals(var_attrvalue72))));
                    if (var_shoulddisplayattr75) {
                        out.write(" data-startPointvalidationMsg");
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
            Object var_attrvalue76 = renderContext.getObjectModel().resolveProperty(_global_model, "calenderValidationMsg");
            {
                Object var_attrcontent77 = renderContext.call("xss", var_attrvalue76, "attribute");
                {
                    boolean var_shoulddisplayattr79 = (((null != var_attrcontent77) && (!"".equals(var_attrcontent77))) && ((!"".equals(var_attrvalue76)) && (!((Object)false).equals(var_attrvalue76))));
                    if (var_shoulddisplayattr79) {
                        out.write(" data-calenderValidationMsg");
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
            Object var_attrvalue80 = renderContext.getObjectModel().resolveProperty(_global_model, "timeValidationFirstMessage");
            {
                Object var_attrcontent81 = renderContext.call("xss", var_attrvalue80, "attribute");
                {
                    boolean var_shoulddisplayattr83 = (((null != var_attrcontent81) && (!"".equals(var_attrcontent81))) && ((!"".equals(var_attrvalue80)) && (!((Object)false).equals(var_attrvalue80))));
                    if (var_shoulddisplayattr83) {
                        out.write(" data-firstValidationMessage");
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
            Object var_attrvalue84 = renderContext.getObjectModel().resolveProperty(_global_model, "timeValidationSecondMessage");
            {
                Object var_attrcontent85 = renderContext.call("xss", var_attrvalue84, "attribute");
                {
                    boolean var_shoulddisplayattr87 = (((null != var_attrcontent85) && (!"".equals(var_attrcontent85))) && ((!"".equals(var_attrvalue84)) && (!((Object)false).equals(var_attrvalue84))));
                    if (var_shoulddisplayattr87) {
                        out.write(" data-secondValidationMessage");
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
        {
            Object var_attrvalue88 = renderContext.getObjectModel().resolveProperty(_global_model, "timeValidationThirdMessage");
            {
                Object var_attrcontent89 = renderContext.call("xss", var_attrvalue88, "attribute");
                {
                    boolean var_shoulddisplayattr91 = (((null != var_attrcontent89) && (!"".equals(var_attrcontent89))) && ((!"".equals(var_attrvalue88)) && (!((Object)false).equals(var_attrvalue88))));
                    if (var_shoulddisplayattr91) {
                        out.write(" data-thirdValidationMessage");
                        {
                            boolean var_istrueattr90 = (var_attrvalue88.equals(true));
                            if (!var_istrueattr90) {
                                out.write("=\"");
                                out.write(renderContext.getObjectModel().toString(var_attrcontent89));
                                out.write("\"");
                            }
                        }
                    }
                }
            }
        }
        {
            Object var_attrvalue92 = renderContext.getObjectModel().resolveProperty(_global_model, "timeValidationForthMessage");
            {
                Object var_attrcontent93 = renderContext.call("xss", var_attrvalue92, "attribute");
                {
                    boolean var_shoulddisplayattr95 = (((null != var_attrcontent93) && (!"".equals(var_attrcontent93))) && ((!"".equals(var_attrvalue92)) && (!((Object)false).equals(var_attrvalue92))));
                    if (var_shoulddisplayattr95) {
                        out.write(" data-forthValidationMessage");
                        {
                            boolean var_istrueattr94 = (var_attrvalue92.equals(true));
                            if (!var_istrueattr94) {
                                out.write("=\"");
                                out.write(renderContext.getObjectModel().toString(var_attrcontent93));
                                out.write("\"");
                            }
                        }
                    }
                }
            }
        }
        {
            Object var_attrvalue96 = renderContext.getObjectModel().resolveProperty(_global_model, "timeValidationFifthMessage");
            {
                Object var_attrcontent97 = renderContext.call("xss", var_attrvalue96, "attribute");
                {
                    boolean var_shoulddisplayattr99 = (((null != var_attrcontent97) && (!"".equals(var_attrcontent97))) && ((!"".equals(var_attrvalue96)) && (!((Object)false).equals(var_attrvalue96))));
                    if (var_shoulddisplayattr99) {
                        out.write(" data-fifthValidationMessage");
                        {
                            boolean var_istrueattr98 = (var_attrvalue96.equals(true));
                            if (!var_istrueattr98) {
                                out.write("=\"");
                                out.write(renderContext.getObjectModel().toString(var_attrcontent97));
                                out.write("\"");
                            }
                        }
                    }
                }
            }
        }
        {
            Object var_attrvalue100 = renderContext.getObjectModel().resolveProperty(_global_model, "locationApi");
            {
                Object var_attrcontent101 = renderContext.call("xss", var_attrvalue100, "attribute");
                {
                    boolean var_shoulddisplayattr103 = (((null != var_attrcontent101) && (!"".equals(var_attrcontent101))) && ((!"".equals(var_attrvalue100)) && (!((Object)false).equals(var_attrvalue100))));
                    if (var_shoulddisplayattr103) {
                        out.write(" data-selectLocationType");
                        {
                            boolean var_istrueattr102 = (var_attrvalue100.equals(true));
                            if (!var_istrueattr102) {
                                out.write("=\"");
                                out.write(renderContext.getObjectModel().toString(var_attrcontent101));
                                out.write("\"");
                            }
                        }
                    }
                }
            }
        }
        out.write(">\r\n                                <span class=\"cmp-icon cmp-icon-before\"></span>\r\n                                <span class=\"cmp-text\">");
        {
            Object var_104 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "exploreButtonLabel"), "text");
            out.write(renderContext.getObjectModel().toString(var_104));
        }
        out.write("</span>\r\n                                <span class=\"cmp-icon cmp-icon-after icon-arrow-r position-absolute top-0 end-0 bottom-0 text-white bg-primary d-flex flex-wrap align-items-center justify-content-center  \"></span>\r\n                            </button>\r\n                        </div>\r\n                    </div>\r\n                </div>\r\n             \r\n            </div>\r\n        </div>\r\n        <!-- date picker modal -->\r\n        <div class=\"modal datePickerRangeModal\" id=\"myModalDatePicker\">\r\n            <div class=\"modal-dialog modal-dialog-centered\">\r\n                <div class=\"modal-content rounded-0\">\r\n\r\n                    <!-- Modal Header -->\r\n                    <div class=\"modal-header border-0\">\r\n                        <div class=\"d-flex flex-wrap justify-content-start justify-content-md-center w-100\">\r\n                            <h4 class=\"modal-title\">");
        {
            Object var_105 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "calenderTitle"), "text");
            out.write(renderContext.getObjectModel().toString(var_105));
        }
        out.write("</h4>\r\n                            <button type=\"button\" class=\"btn-close position-absolute top-0 end-0 mt-3 me-3\" data-bs-dismiss=\"modal\"><span class=\"icon-close\"></span></button>\r\n                        </div>\r\n                        <div class=\"month-item-weekdays-row-mob d-block d-md-none d-flex pt-3 justify-content-between\">\r\n                            <div title=\"Monday\">Mon</div>\r\n                            <div title=\"Tuesday\">Tue</div>\r\n                            <div title=\"Wednesday\">Wed</div>\r\n                            <div title=\"Thursday\">Thu</div>\r\n                            <div title=\"Friday\">Fri</div>\r\n                            <div title=\"Saturday\">Sat</div>\r\n                            <div title=\"Sunday\">Sun</div>\r\n                        </div>\r\n                    </div>\r\n\r\n\r\n                    <!-- Modal body -->\r\n                    <div class=\"modal-body\">\r\n                        <div class=\"calender-box\">\r\n                            <input type=\"text\" id=\"selectRange\"/>\r\n                        </div>\r\n                        <div class=\"col-12 calender-time d-flex\">\r\n                            <div class=\"col-6 col-md-6\">\r\n                                <label>");
        {
            Object var_106 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "pickUpTime"), "text");
            out.write(renderContext.getObjectModel().toString(var_106));
        }
        out.write("</label>\r\n                                <select name=\"time\" id=\"startTime\">\r\n                                    <option value=\"09:00\" selected=\"\">09:00 AM</option>\r\n                                    <option value=\"09:30\">09:30 AM</option>\r\n                                    <option value=\"10:00\">10:00 AM</option>\r\n                                    <option value=\"10:30\">10:30 AM</option>\r\n                                    <option value=\"11:00\">11:00 AM</option>\r\n                                    <option value=\"11:30\">11:30 AM</option>\r\n                                    <option value=\"12:00\">12:00 PM</option>\r\n                                    <option value=\"12:30\">12:30 PM</option>\r\n                                    <option value=\"13:00\">01:00 PM</option>\r\n                                    <option value=\"13:30\">01:30 PM</option>\r\n                                    <option value=\"14:00\">02:00 PM</option>\r\n                                    <option value=\"14:30\">02:30 PM</option>\r\n                                    <option value=\"15:00\">03:00 PM</option>\r\n                                    <option value=\"15:30\">03:30 PM</option>\r\n                                    <option value=\"16:00\">04:00 PM</option>\r\n                                    <option value=\"16:30\">04:30 PM</option>\r\n                                    <option value=\"17:00\">05:00 PM</option>\r\n                                    <option value=\"17:30\">05:30 PM</option>\r\n                                    <option value=\"18:00\">06:00 PM</option>\r\n                                    <option value=\"18:30\">06:30 PM</option>\r\n                                    <option value=\"19:00\">07:00 PM</option>\r\n                                </select>\r\n                                <span class=\"selected-startTime-form-msg error-msg\"></span>\r\n                            </div>\r\n                            <div class=\"col-6 col-md-6\">\r\n                                <label>");
        {
            Object var_107 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "dropOffTime"), "text");
            out.write(renderContext.getObjectModel().toString(var_107));
        }
        out.write("</label>\r\n                                <select name=\"time\" id=\"endTime\">\r\n                                    <option value=\"09:00\">09:00 AM</option>\r\n                                    <option value=\"09:30\">09:30 AM</option>\r\n                                    <option value=\"10:00\">10:00 AM</option>\r\n                                    <option value=\"10:30\">10:30 AM</option>\r\n                                    <option value=\"11:00\">11:00 AM</option>\r\n                                    <option value=\"11:30\">11:30 AM</option>\r\n                                    <option value=\"12:00\">12:00 PM</option>\r\n                                    <option value=\"12:30\">12:30 PM</option>\r\n                                    <option value=\"13:00\">01:00 PM</option>\r\n                                    <option value=\"13:30\">01:30 PM</option>\r\n                                    <option value=\"14:00\">02:00 PM</option>\r\n                                    <option value=\"14:30\">02:30 PM</option>\r\n                                    <option value=\"15:00\">03:00 PM</option>\r\n                                    <option value=\"15:30\">03:30 PM</option>\r\n                                    <option value=\"16:00\">04:00 PM</option>\r\n                                    <option value=\"16:30\">04:30 PM</option>\r\n                                    <option value=\"17:00\">05:00 PM</option>\r\n                                    <option value=\"17:30\">05:30 PM</option>\r\n                                    <option value=\"18:00\">06:00 PM</option>\r\n                                    <option value=\"18:30\">06:30 PM</option>\r\n                                    <option value=\"19:00\" selected=\"\">07:00 PM</option>\r\n                                </select>\r\n                                <span class=\"selected-endTime-form-msg error-msg\"></span>\r\n                            </div>\r\n                        </div>\r\n                    </div>\r\n\r\n                    <!-- Modal footer -->\r\n                    <div class=\"modal-footer border-0 justify-content-center px-3\">\r\n                        <div class=\"input-group button button__primary-v3\">\r\n                            <button type=\"button\" class=\"cmp-button rounded-0 border-0 \" data-bs-dismiss=\"modal\" id=\"continueBtn\">\r\n                                <span class=\"cmp-icon cmp-icon-before\">");
        {
            Object var_108 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "continueBtn"), "text");
            out.write(renderContext.getObjectModel().toString(var_108));
        }
        out.write("</span><span class=\"cmp-icon cmp-icon-after icon-arrow-down position-absolute top-0 end-0 bottom-0 text-white bg-primary d-flex flex-wrap align-items-center justify-content-center\"></span></button>\r\n                        </div>\r\n                    </div>\r\n\r\n                </div>\r\n            </div>\r\n        </div>\r\n    </div>");
    }
}
out.write("\r\n");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

