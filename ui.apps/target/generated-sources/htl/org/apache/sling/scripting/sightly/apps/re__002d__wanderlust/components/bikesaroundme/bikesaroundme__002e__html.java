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
package org.apache.sling.scripting.sightly.apps.re__002d__wanderlust.components.bikesaroundme;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class bikesaroundme__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _global_model = null;
Object _global_templates = null;
Object _global_startingpricelabel = null;
Object _dynamic_caconfig = bindings.get("caconfig");
_global_model = renderContext.call("use", com.re.wanderlust.core.models.BikesAroundMeModel.class.getName(), obj());
_global_templates = renderContext.call("use", "core/wcm/components/commons/v1/templates.html", obj());
_global_startingpricelabel = renderContext.getObjectModel().resolveProperty(_global_model, "startingPriceLabel");
if (renderContext.getObjectModel().toBoolean(_global_startingpricelabel)) {
    out.write("\r\n\r\n\r\n    ");
    {
        boolean var_testvariable0 = (!renderContext.getObjectModel().toBoolean(renderContext.getObjectModel().resolveProperty(_global_model, "hideComponent")));
        if (var_testvariable0) {
            out.write("<div class=\"rew-BikesAroundMe rew-BikesAroundMe-ga\">\r\n        <div class=\"bikesAroundMeDataAttribute\"");
            {
                Object var_attrvalue1 = renderContext.getObjectModel().resolveProperty(_global_model, "newTab");
                {
                    Object var_attrcontent2 = renderContext.call("xss", var_attrvalue1, "attribute");
                    {
                        boolean var_shoulddisplayattr4 = (((null != var_attrcontent2) && (!"".equals(var_attrcontent2))) && ((!"".equals(var_attrvalue1)) && (!((Object)false).equals(var_attrvalue1))));
                        if (var_shoulddisplayattr4) {
                            out.write(" data-newTab");
                            {
                                boolean var_istrueattr3 = (var_attrvalue1.equals(true));
                                if (!var_istrueattr3) {
                                    out.write("=\"");
                                    out.write(renderContext.getObjectModel().toString(var_attrcontent2));
                                    out.write("\"");
                                }
                            }
                        }
                    }
                }
            }
            {
                Object var_attrvalue5 = renderContext.getObjectModel().resolveProperty(renderContext.getObjectModel().resolveProperty(_dynamic_caconfig, "com.re.wanderlust.core.caconfig.APIUrlsConfig"), "apiBaseUrl");
                {
                    Object var_attrcontent6 = renderContext.call("xss", var_attrvalue5, "attribute");
                    {
                        boolean var_shoulddisplayattr8 = (((null != var_attrcontent6) && (!"".equals(var_attrcontent6))) && ((!"".equals(var_attrvalue5)) && (!((Object)false).equals(var_attrvalue5))));
                        if (var_shoulddisplayattr8) {
                            out.write(" data-baseApiUrl");
                            {
                                boolean var_istrueattr7 = (var_attrvalue5.equals(true));
                                if (!var_istrueattr7) {
                                    out.write("=\"");
                                    out.write(renderContext.getObjectModel().toString(var_attrcontent6));
                                    out.write("\"");
                                }
                            }
                        }
                    }
                }
            }
            {
                Object var_attrvalue9 = renderContext.getObjectModel().resolveProperty(renderContext.getObjectModel().resolveProperty(_dynamic_caconfig, "com.re.wanderlust.core.caconfig.APIUrlsConfig"), "bikesAroundMeAPIUrl");
                {
                    Object var_attrcontent10 = renderContext.call("xss", var_attrvalue9, "attribute");
                    {
                        boolean var_shoulddisplayattr12 = (((null != var_attrcontent10) && (!"".equals(var_attrcontent10))) && ((!"".equals(var_attrvalue9)) && (!((Object)false).equals(var_attrvalue9))));
                        if (var_shoulddisplayattr12) {
                            out.write(" data-bikesAroundMeApiUrl");
                            {
                                boolean var_istrueattr11 = (var_attrvalue9.equals(true));
                                if (!var_istrueattr11) {
                                    out.write("=\"");
                                    out.write(renderContext.getObjectModel().toString(var_attrcontent10));
                                    out.write("\"");
                                }
                            }
                        }
                    }
                }
            }
            {
                Object var_attrvalue13 = renderContext.getObjectModel().resolveProperty(renderContext.getObjectModel().resolveProperty(_dynamic_caconfig, "com.re.wanderlust.core.caconfig.LocalStorageKeysConfig"), "currentLatKey");
                {
                    Object var_attrcontent14 = renderContext.call("xss", var_attrvalue13, "attribute");
                    {
                        boolean var_shoulddisplayattr16 = (((null != var_attrcontent14) && (!"".equals(var_attrcontent14))) && ((!"".equals(var_attrvalue13)) && (!((Object)false).equals(var_attrvalue13))));
                        if (var_shoulddisplayattr16) {
                            out.write(" data-currentLatKey");
                            {
                                boolean var_istrueattr15 = (var_attrvalue13.equals(true));
                                if (!var_istrueattr15) {
                                    out.write("=\"");
                                    out.write(renderContext.getObjectModel().toString(var_attrcontent14));
                                    out.write("\"");
                                }
                            }
                        }
                    }
                }
            }
            {
                Object var_attrvalue17 = renderContext.getObjectModel().resolveProperty(renderContext.getObjectModel().resolveProperty(_dynamic_caconfig, "com.re.wanderlust.core.caconfig.LocalStorageKeysConfig"), "currentLongKey");
                {
                    Object var_attrcontent18 = renderContext.call("xss", var_attrvalue17, "attribute");
                    {
                        boolean var_shoulddisplayattr20 = (((null != var_attrcontent18) && (!"".equals(var_attrcontent18))) && ((!"".equals(var_attrvalue17)) && (!((Object)false).equals(var_attrvalue17))));
                        if (var_shoulddisplayattr20) {
                            out.write(" data-currentLongKey");
                            {
                                boolean var_istrueattr19 = (var_attrvalue17.equals(true));
                                if (!var_istrueattr19) {
                                    out.write("=\"");
                                    out.write(renderContext.getObjectModel().toString(var_attrcontent18));
                                    out.write("\"");
                                }
                            }
                        }
                    }
                }
            }
            {
                Object var_attrvalue21 = renderContext.getObjectModel().resolveProperty(renderContext.getObjectModel().resolveProperty(_dynamic_caconfig, "com.re.wanderlust.core.caconfig.LocalStorageKeysConfig"), "updatedLatKey");
                {
                    Object var_attrcontent22 = renderContext.call("xss", var_attrvalue21, "attribute");
                    {
                        boolean var_shoulddisplayattr24 = (((null != var_attrcontent22) && (!"".equals(var_attrcontent22))) && ((!"".equals(var_attrvalue21)) && (!((Object)false).equals(var_attrvalue21))));
                        if (var_shoulddisplayattr24) {
                            out.write(" data-updatedLatKey");
                            {
                                boolean var_istrueattr23 = (var_attrvalue21.equals(true));
                                if (!var_istrueattr23) {
                                    out.write("=\"");
                                    out.write(renderContext.getObjectModel().toString(var_attrcontent22));
                                    out.write("\"");
                                }
                            }
                        }
                    }
                }
            }
            {
                Object var_attrvalue25 = renderContext.getObjectModel().resolveProperty(renderContext.getObjectModel().resolveProperty(_dynamic_caconfig, "com.re.wanderlust.core.caconfig.LocalStorageKeysConfig"), "updatedLongKey");
                {
                    Object var_attrcontent26 = renderContext.call("xss", var_attrvalue25, "attribute");
                    {
                        boolean var_shoulddisplayattr28 = (((null != var_attrcontent26) && (!"".equals(var_attrcontent26))) && ((!"".equals(var_attrvalue25)) && (!((Object)false).equals(var_attrvalue25))));
                        if (var_shoulddisplayattr28) {
                            out.write(" data-updatedLongKey");
                            {
                                boolean var_istrueattr27 = (var_attrvalue25.equals(true));
                                if (!var_istrueattr27) {
                                    out.write("=\"");
                                    out.write(renderContext.getObjectModel().toString(var_attrcontent26));
                                    out.write("\"");
                                }
                            }
                        }
                    }
                }
            }
            {
                Object var_attrvalue29 = renderContext.getObjectModel().resolveProperty(_global_model, "startingPriceLabel");
                {
                    Object var_attrcontent30 = renderContext.call("xss", var_attrvalue29, "attribute");
                    {
                        boolean var_shoulddisplayattr32 = (((null != var_attrcontent30) && (!"".equals(var_attrcontent30))) && ((!"".equals(var_attrvalue29)) && (!((Object)false).equals(var_attrvalue29))));
                        if (var_shoulddisplayattr32) {
                            out.write(" data-startingPriceLabel");
                            {
                                boolean var_istrueattr31 = (var_attrvalue29.equals(true));
                                if (!var_istrueattr31) {
                                    out.write("=\"");
                                    out.write(renderContext.getObjectModel().toString(var_attrcontent30));
                                    out.write("\"");
                                }
                            }
                        }
                    }
                }
            }
            {
                Object var_attrvalue33 = renderContext.getObjectModel().resolveProperty(_global_model, "timePeriodLabel");
                {
                    Object var_attrcontent34 = renderContext.call("xss", var_attrvalue33, "attribute");
                    {
                        boolean var_shoulddisplayattr36 = (((null != var_attrcontent34) && (!"".equals(var_attrcontent34))) && ((!"".equals(var_attrvalue33)) && (!((Object)false).equals(var_attrvalue33))));
                        if (var_shoulddisplayattr36) {
                            out.write(" data-timePeriodLabel");
                            {
                                boolean var_istrueattr35 = (var_attrvalue33.equals(true));
                                if (!var_istrueattr35) {
                                    out.write("=\"");
                                    out.write(renderContext.getObjectModel().toString(var_attrcontent34));
                                    out.write("\"");
                                }
                            }
                        }
                    }
                }
            }
            {
                Object var_attrvalue37 = renderContext.getObjectModel().resolveProperty(_global_model, "recommendedBikeLimit");
                {
                    Object var_attrcontent38 = renderContext.call("xss", var_attrvalue37, "attribute");
                    {
                        boolean var_shoulddisplayattr40 = (((null != var_attrcontent38) && (!"".equals(var_attrcontent38))) && ((!"".equals(var_attrvalue37)) && (!((Object)false).equals(var_attrvalue37))));
                        if (var_shoulddisplayattr40) {
                            out.write(" data-recommendedBikeLimit");
                            {
                                boolean var_istrueattr39 = (var_attrvalue37.equals(true));
                                if (!var_istrueattr39) {
                                    out.write("=\"");
                                    out.write(renderContext.getObjectModel().toString(var_attrcontent38));
                                    out.write("\"");
                                }
                            }
                        }
                    }
                }
            }
            {
                Object var_attrvalue41 = renderContext.getObjectModel().resolveProperty(renderContext.getObjectModel().resolveProperty(_dynamic_caconfig, "com.re.wanderlust.core.caconfig.APIKeysConfig"), "currency");
                {
                    Object var_attrcontent42 = renderContext.call("xss", var_attrvalue41, "attribute");
                    {
                        boolean var_shoulddisplayattr44 = (((null != var_attrcontent42) && (!"".equals(var_attrcontent42))) && ((!"".equals(var_attrvalue41)) && (!((Object)false).equals(var_attrvalue41))));
                        if (var_shoulddisplayattr44) {
                            out.write(" data-currency");
                            {
                                boolean var_istrueattr43 = (var_attrvalue41.equals(true));
                                if (!var_istrueattr43) {
                                    out.write("=\"");
                                    out.write(renderContext.getObjectModel().toString(var_attrcontent42));
                                    out.write("\"");
                                }
                            }
                        }
                    }
                }
            }
            {
                Object var_attrvalue45 = renderContext.getObjectModel().resolveProperty(_global_model, "notFound");
                {
                    Object var_attrcontent46 = renderContext.call("xss", var_attrvalue45, "attribute");
                    {
                        boolean var_shoulddisplayattr48 = (((null != var_attrcontent46) && (!"".equals(var_attrcontent46))) && ((!"".equals(var_attrvalue45)) && (!((Object)false).equals(var_attrvalue45))));
                        if (var_shoulddisplayattr48) {
                            out.write(" data-notFoundMessage");
                            {
                                boolean var_istrueattr47 = (var_attrvalue45.equals(true));
                                if (!var_istrueattr47) {
                                    out.write("=\"");
                                    out.write(renderContext.getObjectModel().toString(var_attrcontent46));
                                    out.write("\"");
                                }
                            }
                        }
                    }
                }
            }
            {
                Object var_attrvalue49 = renderContext.getObjectModel().resolveProperty(_global_model, "serverError");
                {
                    Object var_attrcontent50 = renderContext.call("xss", var_attrvalue49, "attribute");
                    {
                        boolean var_shoulddisplayattr52 = (((null != var_attrcontent50) && (!"".equals(var_attrcontent50))) && ((!"".equals(var_attrvalue49)) && (!((Object)false).equals(var_attrvalue49))));
                        if (var_shoulddisplayattr52) {
                            out.write(" data-serverErrorMsg");
                            {
                                boolean var_istrueattr51 = (var_attrvalue49.equals(true));
                                if (!var_istrueattr51) {
                                    out.write("=\"");
                                    out.write(renderContext.getObjectModel().toString(var_attrcontent50));
                                    out.write("\"");
                                }
                            }
                        }
                    }
                }
            }
            {
                Object var_attrvalue53 = renderContext.getObjectModel().resolveProperty(_global_model, "badRequest");
                {
                    Object var_attrcontent54 = renderContext.call("xss", var_attrvalue53, "attribute");
                    {
                        boolean var_shoulddisplayattr56 = (((null != var_attrcontent54) && (!"".equals(var_attrcontent54))) && ((!"".equals(var_attrvalue53)) && (!((Object)false).equals(var_attrvalue53))));
                        if (var_shoulddisplayattr56) {
                            out.write(" data-badRequest");
                            {
                                boolean var_istrueattr55 = (var_attrvalue53.equals(true));
                                if (!var_istrueattr55) {
                                    out.write("=\"");
                                    out.write(renderContext.getObjectModel().toString(var_attrcontent54));
                                    out.write("\"");
                                }
                            }
                        }
                    }
                }
            }
            {
                Object var_attrvalue57 = renderContext.call("xss", renderContext.call("uriManipulation", renderContext.getObjectModel().resolveProperty(_global_model, "nextPagePath"), obj().with("extension", "html")), "uri");
                {
                    boolean var_shoulddisplayattr60 = ((!"".equals(var_attrvalue57)) && (!((Object)false).equals(var_attrvalue57)));
                    if (var_shoulddisplayattr60) {
                        out.write(" data-nextPagePath");
                        {
                            boolean var_istrueattr59 = (var_attrvalue57.equals(true));
                            if (!var_istrueattr59) {
                                out.write("=\"");
                                out.write(renderContext.getObjectModel().toString(var_attrvalue57));
                                out.write("\"");
                            }
                        }
                    }
                }
            }
            {
                Object var_attrvalue61 = renderContext.getObjectModel().resolveProperty(_global_model, "defaultImagePath");
                {
                    Object var_attrcontent62 = renderContext.call("xss", var_attrvalue61, "attribute");
                    {
                        boolean var_shoulddisplayattr64 = (((null != var_attrcontent62) && (!"".equals(var_attrcontent62))) && ((!"".equals(var_attrvalue61)) && (!((Object)false).equals(var_attrvalue61))));
                        if (var_shoulddisplayattr64) {
                            out.write(" data-defaultImagePath");
                            {
                                boolean var_istrueattr63 = (var_attrvalue61.equals(true));
                                if (!var_istrueattr63) {
                                    out.write("=\"");
                                    out.write(renderContext.getObjectModel().toString(var_attrcontent62));
                                    out.write("\"");
                                }
                            }
                        }
                    }
                }
            }
            {
                Object var_attrvalue65 = renderContext.getObjectModel().resolveProperty(_global_model, "bikeImgAltText");
                {
                    Object var_attrcontent66 = renderContext.call("xss", var_attrvalue65, "attribute");
                    {
                        boolean var_shoulddisplayattr68 = (((null != var_attrcontent66) && (!"".equals(var_attrcontent66))) && ((!"".equals(var_attrvalue65)) && (!((Object)false).equals(var_attrvalue65))));
                        if (var_shoulddisplayattr68) {
                            out.write(" data-bikeImgAltText");
                            {
                                boolean var_istrueattr67 = (var_attrvalue65.equals(true));
                                if (!var_istrueattr67) {
                                    out.write("=\"");
                                    out.write(renderContext.getObjectModel().toString(var_attrcontent66));
                                    out.write("\"");
                                }
                            }
                        }
                    }
                }
            }
            {
                Object var_attrvalue69 = renderContext.getObjectModel().resolveProperty(_global_model, "defaultLat");
                {
                    Object var_attrcontent70 = renderContext.call("xss", var_attrvalue69, "attribute");
                    {
                        boolean var_shoulddisplayattr72 = (((null != var_attrcontent70) && (!"".equals(var_attrcontent70))) && ((!"".equals(var_attrvalue69)) && (!((Object)false).equals(var_attrvalue69))));
                        if (var_shoulddisplayattr72) {
                            out.write(" data-defaultLat");
                            {
                                boolean var_istrueattr71 = (var_attrvalue69.equals(true));
                                if (!var_istrueattr71) {
                                    out.write("=\"");
                                    out.write(renderContext.getObjectModel().toString(var_attrcontent70));
                                    out.write("\"");
                                }
                            }
                        }
                    }
                }
            }
            {
                Object var_attrvalue73 = renderContext.getObjectModel().resolveProperty(_global_model, "defaultLong");
                {
                    Object var_attrcontent74 = renderContext.call("xss", var_attrvalue73, "attribute");
                    {
                        boolean var_shoulddisplayattr76 = (((null != var_attrcontent74) && (!"".equals(var_attrcontent74))) && ((!"".equals(var_attrvalue73)) && (!((Object)false).equals(var_attrvalue73))));
                        if (var_shoulddisplayattr76) {
                            out.write(" data-defaultLong");
                            {
                                boolean var_istrueattr75 = (var_attrvalue73.equals(true));
                                if (!var_istrueattr75) {
                                    out.write("=\"");
                                    out.write(renderContext.getObjectModel().toString(var_attrcontent74));
                                    out.write("\"");
                                }
                            }
                        }
                    }
                }
            }
            {
                Object var_attrvalue77 = renderContext.getObjectModel().resolveProperty(_global_model, "fetchFromDefaultLatLong");
                {
                    Object var_attrcontent78 = renderContext.call("xss", var_attrvalue77, "attribute");
                    {
                        boolean var_shoulddisplayattr80 = (((null != var_attrcontent78) && (!"".equals(var_attrcontent78))) && ((!"".equals(var_attrvalue77)) && (!((Object)false).equals(var_attrvalue77))));
                        if (var_shoulddisplayattr80) {
                            out.write(" data-fetchFromDefaultLatLong");
                            {
                                boolean var_istrueattr79 = (var_attrvalue77.equals(true));
                                if (!var_istrueattr79) {
                                    out.write("=\"");
                                    out.write(renderContext.getObjectModel().toString(var_attrcontent78));
                                    out.write("\"");
                                }
                            }
                        }
                    }
                }
            }
            {
                Object var_attrvalue81 = renderContext.getObjectModel().resolveProperty(_global_model, "bikeImageMap");
                {
                    Object var_attrcontent82 = renderContext.call("xss", var_attrvalue81, "attribute");
                    {
                        boolean var_shoulddisplayattr84 = (((null != var_attrcontent82) && (!"".equals(var_attrcontent82))) && ((!"".equals(var_attrvalue81)) && (!((Object)false).equals(var_attrvalue81))));
                        if (var_shoulddisplayattr84) {
                            out.write(" data-bikeImageMap");
                            {
                                boolean var_istrueattr83 = (var_attrvalue81.equals(true));
                                if (!var_istrueattr83) {
                                    out.write("=\"");
                                    out.write(renderContext.getObjectModel().toString(var_attrcontent82));
                                    out.write("\"");
                                }
                            }
                        }
                    }
                }
            }
            {
                Object var_attrvalue85 = renderContext.getObjectModel().resolveProperty(_global_model, "options");
                {
                    Object var_attrcontent86 = renderContext.call("xss", var_attrvalue85, "attribute");
                    {
                        boolean var_shoulddisplayattr88 = (((null != var_attrcontent86) && (!"".equals(var_attrcontent86))) && ((!"".equals(var_attrvalue85)) && (!((Object)false).equals(var_attrvalue85))));
                        if (var_shoulddisplayattr88) {
                            out.write(" data-authorValue");
                            {
                                boolean var_istrueattr87 = (var_attrvalue85.equals(true));
                                if (!var_istrueattr87) {
                                    out.write("=\"");
                                    out.write(renderContext.getObjectModel().toString(var_attrcontent86));
                                    out.write("\"");
                                }
                            }
                        }
                    }
                }
            }
            {
                Object var_attrvalue89 = renderContext.getObjectModel().resolveProperty(_global_model, "fetchBikesFromApi");
                {
                    Object var_attrcontent90 = renderContext.call("xss", var_attrvalue89, "attribute");
                    {
                        boolean var_shoulddisplayattr92 = (((null != var_attrcontent90) && (!"".equals(var_attrcontent90))) && ((!"".equals(var_attrvalue89)) && (!((Object)false).equals(var_attrvalue89))));
                        if (var_shoulddisplayattr92) {
                            out.write(" data-fetchBikesFromApi");
                            {
                                boolean var_istrueattr91 = (var_attrvalue89.equals(true));
                                if (!var_istrueattr91) {
                                    out.write("=\"");
                                    out.write(renderContext.getObjectModel().toString(var_attrcontent90));
                                    out.write("\"");
                                }
                            }
                        }
                    }
                }
            }
            out.write(">\r\n        </div>\r\n\r\n        <!-- Rides Around Me Carousel -->\r\n        <div class=\"rides-around-me-carousel-comp\">\r\n            <div class=\"container\">\r\n                <div class=\"row\">\r\n                    ");
            {
                Object var_resourcecontent93 = renderContext.call("includeResource", "recommendedRidesCompTitle", obj().with("resourceType", "algolia/components/instantsearch/languageNavigation"));
                out.write(renderContext.getObjectModel().toString(var_resourcecontent93));
            }
            out.write("\r\n                    <div class=\"col-12 search-list-container\">\r\n                    </div>\r\n                    <div class=\"col-12 text-center\" id=\"noResultWrapper-bikesAroundMe\">\r\n                        <h6 class=\"mb-2 text-white\" id=\"noREsultFound-bikesAroundMe\"></h6>\r\n                    </div>\r\n                </div>\r\n            </div>\r\n            <div class=\"container-bikes loader-bikes-around\">\r\n                <div class=\"loading\">\r\n                    <div class=\"loading-bar\"></div>\r\n                    <div class=\"loading-bar\"></div>\r\n                    <div class=\"loading-bar\"></div>\r\n                    <div class=\"loading-bar\"></div>\r\n                </div>\r\n            </div>\r\n\r\n        </div>\r\n        <script class=\"search-template\" type=\"text/x-handlebars-template\">\r\n            <div class=\"rides-around-me-carousel-comp__carousel\">\r\n                {{#each (bikesAroundMelimit response.data response.recommendedBikeLimit)}}\r\n                {{#if display_name}}\r\n                <div>\r\n                    <div class=\"position-relative image-container\">\r\n                        <a href=\"{{../response.nextPagePath}}?model={{display_name}}&lat={{../response.lat}}&long={{../response.long}}\" data-bikeName=\"{{display_name}}\" class=\"bikesAroundMeAnchor\" title=\"Bikes Around Me Image\">\r\n                           {{#if newDisplay_name}}\r\n\t\t\t\t\t\t\t       {{{splitImg ../response.defaultImage newDisplay_name.desktopImage ../response.bikeImgAltText}}} \r\n                               {{else}}\r\n                               {{{splitImg ../response.defaultImage model_images ../response.bikeImgAltText}}}\r\n                            {{/if}}\r\n                          </a>\r\n                        <a class=\"bikesAroundMeAnchor\" title=\"Bikes Around Me Link\" data-bikeName=\"{{display_name}}\" href=\"{{../response.nextPagePath}}?model={{display_name}}&lat={{../response.lat}}&long={{../response.long}}\" class=\"mb-1 stretched-link\">\r\n                            <h6 class=\"mb-1 bikeName\">{{display_name}}</h6>\r\n                        </a>\r\n                        <div class=\"d-md-flex\">\r\n                            <p class=\"mb-0\">{{../response.startingPriceLabel}}\r\n                                <p><span>{{../response.currency}} {{{toFixed price}}}* </span> {{../response.timePeriodLabel}}</p>\r\n                            </p>\r\n\r\n                        </div>\r\n                    </div>      \r\n                </div>\r\n                {{/if}}\r\n                {{/each}}\r\n            </div>\r\n        </script>\r\n        <!-- End Rides Around Me Carousel -->\r\n    </div>");
        }
    }
    out.write("\r\n");
}
out.write("\r\n");
{
    Object var_templatevar94 = renderContext.getObjectModel().resolveProperty(_global_templates, "placeholder");
    {
        boolean var_templateoptions95_field$_isempty = (!renderContext.getObjectModel().toBoolean(_global_startingpricelabel));
        {
            java.util.Map var_templateoptions95 = obj().with("isEmpty", var_templateoptions95_field$_isempty);
            callUnit(out, renderContext, var_templatevar94, var_templateoptions95);
        }
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

