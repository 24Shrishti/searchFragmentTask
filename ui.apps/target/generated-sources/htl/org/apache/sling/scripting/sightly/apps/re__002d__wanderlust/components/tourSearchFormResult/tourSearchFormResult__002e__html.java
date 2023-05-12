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
package org.apache.sling.scripting.sightly.apps.re__002d__wanderlust.components.tourSearchFormResult;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class tourSearchFormResult__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _global_model = null;
Collection var_collectionvar4_list_coerced$ = null;
out.write("<link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/vanillajs-datepicker@1.2.0/dist/css/datepicker.min.css\"/>\r\n\r\n");
_global_model = renderContext.call("use", com.re.wanderlust.core.models.TourSearchFormResultModel.class.getName(), obj());
out.write("\r\n    <div class=\"accessMapValue\"");
{
    Object var_attrvalue0 = renderContext.getObjectModel().resolveProperty(_global_model, "mapAttribute");
    {
        Object var_attrcontent1 = renderContext.call("xss", var_attrvalue0, "attribute");
        {
            boolean var_shoulddisplayattr3 = (((null != var_attrcontent1) && (!"".equals(var_attrcontent1))) && ((!"".equals(var_attrvalue0)) && (!((Object)false).equals(var_attrvalue0))));
            if (var_shoulddisplayattr3) {
                out.write(" data-label");
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
out.write("></div>\r\n    ");
{
    Object var_collectionvar4 = renderContext.getObjectModel().resolveProperty(_global_model, "list");
    {
        long var_size5 = ((var_collectionvar4_list_coerced$ == null ? (var_collectionvar4_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar4)) : var_collectionvar4_list_coerced$).size());
        {
            boolean var_notempty6 = (var_size5 > 0);
            if (var_notempty6) {
                {
                    long var_end9 = var_size5;
                    {
                        boolean var_validstartstepend10 = (((0 < var_size5) && true) && (var_end9 > 0));
                        if (var_validstartstepend10) {
                            out.write("<div>");
                            if (var_collectionvar4_list_coerced$ == null) {
                                var_collectionvar4_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar4);
                            }
                            long var_index11 = 0;
                            for (Object item : var_collectionvar4_list_coerced$) {
                                {
                                    boolean var_traversal13 = (((var_index11 >= 0) && (var_index11 <= var_end9)) && true);
                                    if (var_traversal13) {
                                        {
                                            String var_14 = (((("\r\n        " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(item, "sortFiltersKey"), "text"))) + "\r\n        ") + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(item, "sortFiltersValue"), "text"))) + "\r\n    ");
                                            out.write(renderContext.getObjectModel().toString(var_14));
                                        }
                                    }
                                }
                                var_index11++;
                            }
                            out.write("</div>");
                        }
                    }
                }
            }
        }
    }
    var_collectionvar4_list_coerced$ = null;
}
out.write("\r\n<div class=\"tour-searchFormResult-comp position-relative\">\r\n    <div class=\"tour-searchFormResult-comp__body-container\">\r\n        <div class=\"container-fluid\">\r\n            <div class=\"row\">\r\n                <div class=\"col-md-4 col-xxl-3 search-filter-comp\">\r\n                    <div class=\"search-filter-comp__filter-panel\">\r\n                        <div class=\"filter-panel-header position-relative d-flex flex-wrap justify-content-between align-items-center p-3 pt-5 pt-md-4\">\r\n                            <button class=\"d-block d-md-none position-absolute mt-2 mx-2 hideFilterPanelMobBtn bg-transparent text-white\" id=\"hideFilterPanelMobBtn\" type=\"button\">\r\n                                <span class=\"icon-close\"></span>\r\n                            </button>\r\n                            <h5 class=\"text-white\">");
{
    Object var_15 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "filterLabel"), "text");
    out.write(renderContext.getObjectModel().toString(var_15));
}
out.write("</h5>\r\n                            <div class=\"button\">\r\n                                <button class=\"cmp-button bg-transparent rounded-0 p-0 reset-all\" disabled=\"disabled\">");
{
    Object var_16 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "resetAllLabel"), "text");
    out.write(renderContext.getObjectModel().toString(var_16));
}
out.write("</button>\r\n                            </div>\r\n                        </div>\r\n                        <div class=\"filter-panel-body py-3\">\r\n                            <div class=\"accordion\" id=\"tourSearchResultFilterAccordion\">\r\n                                <div class=\"accordion-item bg-transparent border-0 rounded-0\">\r\n                                    <button class=\"accordion-button py-2 bg-transparent text-white\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#panelsStayOpen-collapseOne\" aria-expanded=\"true\" aria-controls=\"panelsStayOpen-collapseOne\">");
{
    String var_17 = (("\r\n                                        " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "tourDurationLabel"), "text"))) + "\r\n                                        ");
    out.write(renderContext.getObjectModel().toString(var_17));
}
out.write("<span class=\"icon-arrow-down d-block position-absolute\"></span>\r\n                                    </button>\r\n                                    <div id=\"panelsStayOpen-collapseOne\" class=\"accordion-collapse collapse show\" aria-labelledby=\"panelsStayOpen-headingOne\">\r\n                                        <div class=\"accordion-body\" id=\"tour_filter-duration-template\">\r\n         \r\n                                            <div class=\"form-check d-flex flex-wrap position-relative\">\r\n                                                <input class=\"form-check-input model_checkbox\" name=\"bike_model\" type=\"checkbox\" value=\"CLASSIC 350\" id=\"CLASSIC 350\"/>\r\n                                                <label class=\"form-check-label text-white\" for=\"CLASSIC 350\">CLASSIC\r\n                                                    350</label>\r\n                                            </div>\r\n\r\n                                        </div>\r\n                                    </div>\r\n                                </div>\r\n                                <div class=\"accordion-item bg-transparent border-0 rounded-0\">\r\n                                    <button class=\"accordion-button py-2 bg-transparent text-white collapsed\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#panelsStayOpen-collapseTwo\" aria-expanded=\"false\" aria-controls=\"panelsStayOpen-collapseTwo\">\r\n                                        Start Point\r\n                                        <span class=\"icon-arrow-down d-block position-absolute\"></span>\r\n                                    </button>\r\n                                    <div id=\"panelsStayOpen-collapseTwo\" class=\"accordion-collapse collapse\" aria-labelledby=\"panelsStayOpen-headingTwo\">\r\n                                        <div class=\"accordion-body\" id=\"tour_filter-startPoint-template\">\r\n\r\n                                            <div class=\"form-check d-flex flex-wrap position-relative\">\r\n                                                <input class=\"form-check-input model_checkbox\" name=\"bike_model\" type=\"checkbox\" value=\"CLASSIC 350\" id=\"CLASSIC 350\"/>\r\n                                                <label class=\"form-check-label text-white\" for=\"CLASSIC 350\">CLASSIC\r\n                                                    350</label>\r\n                                            </div>\r\n\r\n                                        </div>\r\n                                    </div>\r\n                                </div>\r\n                                <div class=\"accordion-item bg-transparent border-0 rounded-0\">\r\n                                    <button class=\"accordion-button py-2 bg-transparent text-white collapsed\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#panelsStayOpen-collapseThree\" aria-expanded=\"false\" aria-controls=\"panelsStayOpen-collapseThree\">");
{
    String var_18 = (("\r\n                                        " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "destinationLabel"), "text"))) + "\r\n                                        ");
    out.write(renderContext.getObjectModel().toString(var_18));
}
out.write("<span class=\"icon-arrow-down d-block position-absolute\"></span>\r\n                                    </button>\r\n                                    <div id=\"panelsStayOpen-collapseThree\" class=\"accordion-collapse collapse\" aria-labelledby=\"panelsStayOpen-headingThree\">\r\n                                        <div class=\"accordion-body\" id=\"tour_filter-destination-template\">\r\n\r\n                                            <div class=\"form-check d-flex flex-wrap position-relative\">\r\n                                                <input class=\"form-check-input model_checkbox\" name=\"bike_model\" type=\"checkbox\" value=\"CLASSIC 350\" id=\"CLASSIC 350\"/>\r\n                                                <label class=\"form-check-label text-white\" for=\"CLASSIC 350\">CLASSIC\r\n                                                    350</label>\r\n                                            </div>\r\n\r\n                                        </div>\r\n                                    </div>\r\n                                </div>\r\n                                <div class=\"accordion-item bg-transparent border-0 rounded-0\">\r\n                                    <button class=\"accordion-button py-2 bg-transparent text-white collapsed\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#panelsStayOpen-collapseFour\" aria-expanded=\"false\" aria-controls=\"panelsStayOpen-collapseFour\">");
{
    String var_19 = (("\r\n                                        " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "languageSpokenLabel"), "text"))) + "\r\n                                        ");
    out.write(renderContext.getObjectModel().toString(var_19));
}
out.write("<span class=\"icon-arrow-down d-block position-absolute\"></span>\r\n                                    </button>\r\n                                    <div id=\"panelsStayOpen-collapseFour\" class=\"accordion-collapse collapse\" aria-labelledby=\"panelsStayOpen-headingFour\">\r\n                                        <div class=\"accordion-body\" id=\"tour_filter-language-template\">\r\n\r\n                                            <div class=\"form-check d-flex flex-wrap position-relative\">\r\n                                                <input class=\"form-check-input model_checkbox\" name=\"bike_model\" type=\"checkbox\" value=\"CLASSIC 350\" id=\"CLASSIC 350\"/>\r\n                                                <label class=\"form-check-label text-white\" for=\"CLASSIC 350\">CLASSIC\r\n                                                    350</label>\r\n                                            </div>\r\n\r\n                                        </div>\r\n                                    </div>\r\n                                </div>\r\n                                <div class=\"accordion-item bg-transparent border-0 rounded-0\">\r\n                                    <button class=\"accordion-button py-2 bg-transparent text-white collapsed\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#panelsStayOpen-collapseFive\" aria-expanded=\"false\" aria-controls=\"panelsStayOpen-collapseFive\">");
{
    String var_20 = (("\r\n                                        " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "tourRatingsLabel"), "text"))) + "\r\n                                        ");
    out.write(renderContext.getObjectModel().toString(var_20));
}
out.write("<span class=\"icon-arrow-down d-block position-absolute\"></span>\r\n                                    </button>\r\n                                    <div id=\"panelsStayOpen-collapseFive\" class=\"accordion-collapse collapse\" aria-labelledby=\"panelsStayOpen-headingFive\">\r\n                                        <div class=\"accordion-body\" id=\"tour_filter-rating-template\">\r\n\r\n                                            <div class=\"form-check d-flex flex-wrap position-relative\">\r\n                                                <input class=\"form-check-input model_checkbox\" name=\"bike_model\" type=\"checkbox\" value=\"CLASSIC 350\" id=\"CLASSIC 350\"/>\r\n                                                <label class=\"form-check-label text-white\" for=\"CLASSIC 350\">CLASSIC\r\n                                                    350</label>\r\n                                            </div>\r\n\r\n                                        </div>\r\n                                    </div>\r\n                                </div>\r\n                                <div class=\"accordion-item bg-transparent border-0 rounded-0\">\r\n                                    <button class=\"accordion-button py-2 bg-transparent text-white collapsed\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#panelsStayOpen-collapseSix\" aria-expanded=\"false\" aria-controls=\"panelsStayOpen-collapseSix\">");
{
    String var_21 = (("\r\n                                        " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "partnersLabel"), "text"))) + "\r\n                                        ");
    out.write(renderContext.getObjectModel().toString(var_21));
}
out.write("<span class=\"icon-arrow-down d-block position-absolute\"></span>\r\n                                    </button>\r\n                                    <div id=\"panelsStayOpen-collapseSix\" class=\"accordion-collapse collapse\" aria-labelledby=\"panelsStayOpen-headingSix\">\r\n                                        <div class=\"accordion-body\" id=\"tour_filter-partners-template\">\r\n\r\n                                            <div class=\"form-check d-flex flex-wrap position-relative\">\r\n                                                <input class=\"form-check-input model_checkbox\" name=\"bike_model\" type=\"checkbox\" value=\"CLASSIC 350\" id=\"CLASSIC 350\"/>\r\n                                                <label class=\"form-check-label text-white\" for=\"CLASSIC 350\">CLASSIC\r\n                                                    350</label>\r\n                                            </div>\r\n\r\n                                        </div>\r\n                                    </div>\r\n                                </div>\r\n                                <div class=\"accordion-item bg-transparent border-0 rounded-0\">\r\n                                    <button class=\"accordion-button py-2 bg-transparent text-white collapsed\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#panelsStayOpen-collapseSeven\" aria-expanded=\"false\" aria-controls=\"panelsStayOpen-collapseSeven\">\r\n                                        Currency\r\n                                        <span class=\"icon-arrow-down d-block position-absolute\"></span>\r\n                                    </button>\r\n                                    <div id=\"panelsStayOpen-collapseSeven\" class=\"accordion-collapse collapse\" aria-labelledby=\"panelsStayOpen-headingSeven\">\r\n                                        <div class=\"accordion-body\" id=\"tour_filter-currency-template\">\r\n\r\n                                            <div class=\"form-check d-flex flex-wrap position-relative\">\r\n                                                <input class=\"form-check-input model_checkbox\" name=\"bike_model\" type=\"checkbox\" value=\"CLASSIC 350\" id=\"CLASSIC 350\"/>\r\n                                                <label class=\"form-check-label text-white\" for=\"CLASSIC 350\">CLASSIC\r\n                                                    350</label>\r\n                                            </div>\r\n\r\n                                        </div>\r\n                                    </div>\r\n                                </div>\r\n                            </div>\r\n                        </div>\r\n                        <div class=\"filter-panel-footer p-3\">\r\n                            <div class=\"button button__primary-v2\">\r\n                                <button class=\"cmp-button position-relative rounded-0\">\r\n                                    <span class=\"cmp-text\">");
{
    Object var_22 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "applyLabel"), "text");
    out.write(renderContext.getObjectModel().toString(var_22));
}
out.write("</span>\r\n                                    <span class=\"cmp-icon cmp-icon-after icon-arrow-r position-absolute top-0 end-0 bottom-0 text-white bg-primary d-flex flex-wrap align-items-center justify-content-center\"></span>\r\n                                </button>\r\n                            </div>\r\n                        </div>\r\n                    </div>\r\n                </div>\r\n                <div class=\"col-md-8 col-xxl-9 tours-search-listing-wrap\">\r\n                    <!-- Form -->\r\n                    <div class=\"tour-searchForm-comp__form bg-transparent position-relative mb-4 px-md-0\">\r\n                        <div class=\"row g-0\">\r\n                            \r\n                       \r\n                            <div>");
{
    Object var_resourcecontent23 = renderContext.call("includeResource", "./tourSearchForm", obj().with("resourceType", "re-wanderlust/components/tourSearchForm"));
    out.write(renderContext.getObjectModel().toString(var_resourcecontent23));
}
out.write("</div>\r\n                        </div>\r\n                    </div>\r\n                    <!-- End Form -->\r\n                    <div id=\"searchResult-tours_container\"></div>\r\n                    <!-- Load More Button -->\r\n                    <div class=\"row my-5 justify-content-center loadMore-tourSearchResult\">\r\n                        <div class=\"col-8 col-md-4 col-lg-3 col-xl-2\">\r\n                            <div class=\"button button__primary-v2\">\r\n                                <button class=\"cmp-button position-relative rounded-0\">\r\n                                    <span class=\"cmp-text\">Load More</span>\r\n                                    <span class=\"cmp-icon cmp-icon-after icon-arrow-r position-absolute top-0 end-0 bottom-0 text-white bg-primary d-flex flex-wrap align-items-center justify-content-center\"></span>\r\n                                </button>\r\n                            </div>\r\n                        </div>\r\n                    </div>\r\n                    <!-- End Load More Button -->\r\n\r\n                    <!-- Check Out Rentals Carousel -->\r\n                    <div class=\"related-rentals-wrap position-relative\">\r\n                        <div class=\"row align-items-start\">\r\n                            <div class=\"col\">\r\n                                <h5 class=\"text-white text-start mb-4\">Check out Rentals around you</h5>\r\n                            </div>\r\n                            <div class=\"col-auto\">\r\n                                <div class=\"button button__white-link\">\r\n                                    <button type=\"button\" class=\"cmp-button p-0\">\r\n                                        <span class=\"cmp-text\">See All</span>\r\n                                    </button>\r\n                                </div>\r\n                            </div>\r\n                        </div>\r\n                        <div class=\"related-rentals__carousel\" id=\"realtedRentalsCarousel\">\r\n                            <a href=\"#\" class=\"d-block text-decoration-none\">\r\n                                <img src=\"https://rewanderlustuat.blob.core.windows.net/tour/operator/045608b4-7609-41cd-95c1-b790b8b9e137/tour/images/image-20220421112724.jpg\" class=\"w-100\" alt=\"\"/>\r\n                                <h6 class=\"mt-3 mb-2\">Classic 350</h6>\r\n                                <p>");
{
    Object var_24 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "startingFormLabel"), "text");
    out.write(renderContext.getObjectModel().toString(var_24));
}
out.write("<span>\u20B9 999*</span> Per day</p>\r\n                            </a>\r\n                            <a href=\"#\" class=\"d-block text-decoration-none\">\r\n                                <img src=\"https://rewanderlustuat.blob.core.windows.net/tour/operator/045608b4-7609-41cd-95c1-b790b8b9e137/tour/images/image-20220421112724.jpg\" class=\"w-100\" alt=\"\"/>\r\n                                <h6 class=\"mt-3 mb-2\">Classic 350</h6>\r\n                                <p>");
{
    Object var_25 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "startingFormLabel"), "text");
    out.write(renderContext.getObjectModel().toString(var_25));
}
out.write("<span>\u20B9 999*</span> Per day</p>\r\n                            </a>\r\n                            <a href=\"#\" class=\"d-block text-decoration-none\">\r\n                                <img src=\"https://rewanderlustuat.blob.core.windows.net/tour/operator/045608b4-7609-41cd-95c1-b790b8b9e137/tour/images/image-20220421112724.jpg\" class=\"w-100\" alt=\"\"/>\r\n                                <h6 class=\"mt-3 mb-2\">Classic 350</h6>\r\n                                <p>");
{
    Object var_26 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "startingFormLabel"), "text");
    out.write(renderContext.getObjectModel().toString(var_26));
}
out.write("<span>\u20B9 999*</span> Per day</p>\r\n                            </a>\r\n                            <a href=\"#\" class=\"d-block text-decoration-none\">\r\n                                <img src=\"/content/dam/re-wanderlust/gallery-7@2x.png\" class=\"w-100\" alt=\"\"/>\r\n                                <h6 class=\"mt-3 mb-2\">Classic 350</h6>\r\n                                <p>");
{
    Object var_27 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "startingFormLabel"), "text");
    out.write(renderContext.getObjectModel().toString(var_27));
}
out.write("<span>\u20B9 999*</span> Per day</p>\r\n                            </a>\r\n                            <a href=\"#\" class=\"d-block text-decoration-none\">\r\n                                <img src=\"https://rewanderlustuat.blob.core.windows.net/tour/operator/045608b4-7609-41cd-95c1-b790b8b9e137/tour/images/image-20220421112724.jpg\" class=\"w-100\" alt=\"\"/>\r\n                                <h6 class=\"mt-3 mb-2\">Classic 350</h6>\r\n                                <p>");
{
    Object var_28 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "startingFormLabel"), "text");
    out.write(renderContext.getObjectModel().toString(var_28));
}
out.write("<span>\u20B9 999*</span> Per day</p>\r\n                            </a>\r\n                        </div>\r\n                    </div>\r\n                    <!-- End Check Out Rentals Carousel -->\r\n                </div>\r\n            </div>\r\n        </div>\r\n    </div>\r\n<!-- Handlebars template starts -->\r\n    <script id=\"searchResults_tours-template\" type=\"text/x-handlebars-template\">\r\n        {{#each data}}\r\n       {{#ifAvaliable false}}\r\n        <div class=\"d-flex flex-wrap justify-content-between align-items-baseline align-items-md-center showResultsBar\">\r\n           <span class=\"text-white showResults showResultsMain\">{{count}} {{../value.toursForYouLabel}}</span>\r\n           <div class=\"d-flex flex-wrap align-items-center\">\r\n               <span class=\"text-white showResults\">sortByLabel</span>\r\n               <div class=\"dropdown sortByDropdown ps-2\">\r\n                   <button class=\"btn btn-secondary dropdown-toggle rounded-pill border-0 selectedSort\"\r\n                       type=\"button\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">Dropdown\r\n                       button</button>\r\n                   <ul class=\"dropdown-menu border-0 rounded-0\">\r\n                       <li>\r\n                           <button type=\"button\" class=\"dropdown-item sortDropDownOptions\">tourRatingsLabel</button>\r\n                       </li>\r\n                       <li>\r\n                           <button type=\"button\" class=\"dropdown-item sortDropDownOptions\">Another action</button>\r\n                       </li>\r\n                       <li>\r\n                           <button type=\"button\" class=\"dropdown-item sortDropDownOptions\">Something else here</button>\r\n                       </li>\r\n                   </ul>\r\n               </div>\r\n           </div>\r\n       </div>\r\n       {{/ifAvaliable}}\r\n       <!-- Result Cards -->\r\n       <div class=\"row tours-searchResultCards g-4 mb-4\">\r\n        {{#each this.item}}\r\n           <div class=\"col-md-6 col-lg-4\">\r\n               <div class=\"card border-0 overflow-hidden\">\r\n                   <div class=\"card-figure overflow-hidden position-relative\">\r\n                       <span\r\n                           class=\"filling-fast text-white py-1 px-2 position-absolute top-0 end-0 mt-3 me-3\">Filling\r\n                           Fast</span>\r\n                       <div\r\n                           class=\"card-figure__overlay text-white position-absolute bottom-0 start-0 end-0\">\r\n                           <h5>{{tour_name}}</h5>\r\n                           <span class=\"location\">Mumbai - Pushkar</span>\r\n                       </div>\r\n                       <img src=\"{{banner_image.[0]}}\"\r\n                           class=\"card-img-top rounded-0\" alt=\"\" />\r\n                   </div>\r\n                   <div class=\"card-body p-0 bg-transparent\">\r\n                       <div class=\"p-3\">\r\n                           <ul class=\"d-flex flex-wrap justify-content-between p-0 mb-3\">\r\n                               <li class=\"d-flex flex-wrap text-left flex-row align-items-center\">\r\n                                   <img src=\"/content/dam/re-wanderlust/calendar_today-3.svg\" alt=\"\" />\r\n                                   <span class=\"label ms-2\">02</span>\r\n                               </li>\r\n                               <li class=\"d-flex flex-wrap text-left flex-row align-items-center\">\r\n                                   <img src=\"/content/dam/re-wanderlust/terrain-3.svg\" alt=\"\" />\r\n                                   <span class=\"label ms-2\">Off-road</span>\r\n                               </li>\r\n                               <li class=\"d-flex flex-wrap text-left flex-row align-items-center\">\r\n                                   <img src=\"/content/dam/re-wanderlust/Union 1.svg\" alt=\"\" />\r\n                                   <span class=\"label ms-2\">Intermediate</span>\r\n                               </li>\r\n                           </ul>\r\n                           <div class=\"row\">\r\n                               <div class=\"col-7 d-flex flex-wrap flex-column\">\r\n                                   <span class=\"text-neutrak-light-grey operatedByLabel\">Operated by</span>\r\n                                   <p>Rentrip tours pvt ltd</p>\r\n                               </div>\r\n                               <div class=\"col-5 d-flex flex-wrap flex-column\">\r\n                                   <span class=\"text-neutrak-light-grey startedFromLabel\">Starting\r\n                                       from</span>\r\n                                   <span class=\"priceLabel\">\u20B92500</span>\r\n                               </div>\r\n                           </div>\r\n                       </div>\r\n                       <div class=\"p-3 card-body__foot\">\r\n                           <div class=\"row\">\r\n                               <div class=\"col-6 pe-1\">\r\n                                   <div class=\"button button__white-outline\">\r\n                                       <button class=\"cmp-button\">\r\n                                           <span class=\"cmp-text\">Add to compare</span>\r\n                                       </button>\r\n                                   </div>\r\n                               </div>\r\n                               <div class=\"col-6 ps-1\">\r\n                                   <div class=\"button button__primary-v2\">\r\n                                       <button class=\"cmp-button position-relative rounded-0\">\r\n                                           <span class=\"cmp-text\">Book Now</span>\r\n                                           <span\r\n                                               class=\"cmp-icon cmp-icon-after icon-arrow-r position-absolute top-0 end-0 bottom-0 text-white bg-primary d-flex flex-wrap align-items-center justify-content-center\"></span>\r\n                                       </button>\r\n                                   </div>\r\n                               </div>\r\n                           </div>\r\n                       </div>\r\n                   </div>\r\n               </div>\r\n           </div>\r\n           {{/each}}\r\n       </div>\r\n       <!-- End Result Cards -->\r\n       {{/each}}\r\n    </script>\r\n    <!-- Handlebars template ends -->\r\n\r\n    <script id=\"tour_filter-duration\" type=\"text/x-handlebars-template\">\r\n        {{#each this.filter_data.duration}}\r\n        <div class=\"form-check d-flex flex-wrap position-relative\">\r\n            <input class=\"form-check-input model_checkbox\" name=\"tourDuration\"\r\n                type=\"checkbox\" value=\"{{this}}\" id=\"CLASSIC 350\">\r\n            <label class=\"form-check-label text-white\" for=\"CLASSIC 350\">{{this}}</label>\r\n        </div>\r\n        {{/each}}\r\n    </script>\r\n    \r\n    <script id=\"tour_filter-startPoint\" type=\"text/x-handlebars-template\">\r\n        {{#each this.filter_data.start_point}}\r\n        <div class=\"form-check d-flex flex-wrap position-relative\">\r\n            <input class=\"form-check-input model_checkbox\" name=\"startPoint\"\r\n                type=\"checkbox\" value=\"{{this}}\" id=\"CLASSIC 350\">\r\n            <label class=\"form-check-label text-white\" for=\"CLASSIC 350\">{{this.title}}</label>\r\n        </div>\r\n        {{/each}}\r\n    </script>\r\n\r\n    <script id=\"tour_filter-destination\" type=\"text/x-handlebars-template\">\r\n        {{#each this.filter_data.end_point}}\r\n        <div class=\"form-check d-flex flex-wrap position-relative\">\r\n            <input class=\"form-check-input model_checkbox\" name=\"endPoint\"\r\n                type=\"checkbox\" value=\"{{this}}\" id=\"CLASSIC 350\">\r\n            <label class=\"form-check-label text-white\" for=\"CLASSIC 350\">{{this.title}}</label>\r\n        </div>\r\n        {{/each}}\r\n    </script>\r\n\r\n    <script id=\"tour_filter-language\" type=\"text/x-handlebars-template\">\r\n        {{#each this.filter_data.languages}}\r\n        <div class=\"form-check d-flex flex-wrap position-relative\">\r\n            <input class=\"form-check-input model_checkbox\" name=\"languages\"\r\n                type=\"checkbox\" value=\"{{this}}\" id=\"CLASSIC 350\">\r\n            <label class=\"form-check-label text-white\" for=\"CLASSIC 350\">{{this}}</label>\r\n        </div>\r\n        {{/each}}\r\n    </script>\r\n\r\n    <script id=\"tour_filter-rating\" type=\"text/x-handlebars-template\">\r\n        {{#each this.filter_data.tour_rating}}\r\n        <div class=\"form-check d-flex flex-wrap position-relative\">\r\n            <input class=\"form-check-input model_checkbox\" name=\"tourRating\"\r\n                type=\"checkbox\" value=\"{{this}}\" id=\"CLASSIC 350\">\r\n            <label class=\"form-check-label text-white\" for=\"CLASSIC 350\">{{this}}</label>\r\n        </div>\r\n        {{/each}}\r\n    </script>\r\n\r\n    <script id=\"tour_filter-partners\" type=\"text/x-handlebars-template\">\r\n        {{#each this.filter_data.operator_id}}\r\n        <div class=\"form-check d-flex flex-wrap position-relative\">\r\n            <input class=\"form-check-input model_checkbox\" name=\"operatorId\"\r\n                type=\"checkbox\" value=\"{{value}}\" id=\"CLASSIC 350\">\r\n            <label class=\"form-check-label text-white\" for=\"CLASSIC 350\">{{this.name}}</label>\r\n        </div>\r\n        {{/each}}\r\n    </script>\r\n\r\n    <script id=\"tour_filter-currency\" type=\"text/x-handlebars-template\">\r\n        {{#each this.filter_data.currency}}\r\n        <div class=\"form-check d-flex flex-wrap position-relative\">\r\n            <input class=\"form-check-input model_checkbox\" name=\"currency\"\r\n                type=\"checkbox\" value=\"{{this}}\" id=\"CLASSIC 350\">\r\n            <label class=\"form-check-label text-white\" for=\"CLASSIC 350\">{{this.[0]}}</label>\r\n        </div>\r\n        {{/each}}\r\n    </script>\r\n\r\n    <!-- Month and Year Datepicker Modal -->\r\n    <div class=\"modal monthYearPickerModal fade\" id=\"monthYearPickerModal\" tabindex=\"-1\" aria-labelledby=\"monthYearPickerModalLabel\" aria-hidden=\"true\">\r\n        <div class=\"modal-dialog modal-dialog-centered\">\r\n            <div class=\"modal-content rounded-0 border-0\">\r\n                <div class=\"modal-header\">\r\n                    <h5 class=\"modal-title\" id=\"monthYearPickerModalLabel\">");
{
    Object var_29 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "monthandYearLabel"), "text");
    out.write(renderContext.getObjectModel().toString(var_29));
}
out.write("</h5>\r\n                    <button type=\"button\" class=\"btn-close calender-closeBtn bg-transparent text-white\" data-bs-dismiss=\"modal\" aria-label=\"Close\">\r\n                        <span class=\"icon-close\"></span>\r\n                    </button>\r\n                </div>\r\n                <div class=\"modal-body\">\r\n                    <div id=\"tourSearchResultFormDate\" data-date=\"01/25/2020\"></div>\r\n                </div>\r\n                <div class=\"modal-footer border-0 d-flex flex-wrap justify-content-center\">\r\n                    <div class=\"button button__primary-v2\" style=\"min-width: 200px;\">\r\n                        <button class=\"cmp-button position-relative rounded-0 calender-continue\">\r\n                            <span class=\"cmp-text\">Continue</span>\r\n                            <span class=\"cmp-icon cmp-icon-after icon-arrow-r position-absolute top-0 end-0 bottom-0 text-white bg-primary d-flex flex-wrap align-items-center justify-content-center\"></span>\r\n                        </button>\r\n                    </div>\r\n                </div>\r\n            </div>\r\n        </div>\r\n    </div>\r\n    <!-- End Month and Year Datepicker Modal -->\r\n</div>\r\n\r\n\r\n");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}
