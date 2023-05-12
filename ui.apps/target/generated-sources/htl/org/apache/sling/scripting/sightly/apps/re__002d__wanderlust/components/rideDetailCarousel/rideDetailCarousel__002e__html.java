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
package org.apache.sling.scripting.sightly.apps.re__002d__wanderlust.components.rideDetailCarousel;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class rideDetailCarousel__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _global_model = null;
Object _global_templates = null;
Object _global_title = null;
Object _dynamic_currentnode = bindings.get("currentnode");
Collection var_collectionvar32_list_coerced$ = null;
_global_model = renderContext.call("use", com.re.wanderlust.core.models.RideDetailCarouselModel.class.getName(), obj());
_global_templates = renderContext.call("use", "core/wcm/components/commons/v1/templates.html", obj());
_global_title = renderContext.getObjectModel().resolveProperty(_global_model, "title");
if (renderContext.getObjectModel().toBoolean(_global_title)) {
    out.write("\r\n\r\n    \r\n\r\n    ");
    {
        boolean var_testvariable0 = (!renderContext.getObjectModel().toBoolean(renderContext.getObjectModel().resolveProperty(_global_model, "hideComponent")));
        if (var_testvariable0) {
            out.write("<div class=\"rew-rentalSlider\">\r\n\r\n        <div class=\"container-fluid dataAttribute-RideCarousel rideCarouselTitle\"");
            {
                Object var_attrvalue1 = renderContext.getObjectModel().resolveProperty(_global_model, "image");
                {
                    Object var_attrcontent2 = renderContext.call("xss", var_attrvalue1, "attribute");
                    {
                        boolean var_shoulddisplayattr4 = (((null != var_attrcontent2) && (!"".equals(var_attrcontent2))) && ((!"".equals(var_attrvalue1)) && (!((Object)false).equals(var_attrvalue1))));
                        if (var_shoulddisplayattr4) {
                            out.write(" data-authorImage");
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
                Object var_attrvalue5 = renderContext.getObjectModel().resolveProperty(_global_model, "terrain");
                {
                    Object var_attrcontent6 = renderContext.call("xss", var_attrvalue5, "attribute");
                    {
                        boolean var_shoulddisplayattr8 = (((null != var_attrcontent6) && (!"".equals(var_attrcontent6))) && ((!"".equals(var_attrvalue5)) && (!((Object)false).equals(var_attrvalue5))));
                        if (var_shoulddisplayattr8) {
                            out.write(" data-terrain");
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
                Object var_attrvalue9 = renderContext.getObjectModel().resolveProperty(_dynamic_currentnode, "path");
                {
                    Object var_attrcontent10 = renderContext.call("xss", var_attrvalue9, "attribute");
                    {
                        boolean var_shoulddisplayattr12 = (((null != var_attrcontent10) && (!"".equals(var_attrcontent10))) && ((!"".equals(var_attrvalue9)) && (!((Object)false).equals(var_attrvalue9))));
                        if (var_shoulddisplayattr12) {
                            out.write(" data-currentNode");
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
                Object var_attrvalue13 = renderContext.getObjectModel().resolveProperty(_global_model, "daysCount");
                {
                    Object var_attrcontent14 = renderContext.call("xss", var_attrvalue13, "attribute");
                    {
                        boolean var_shoulddisplayattr16 = (((null != var_attrcontent14) && (!"".equals(var_attrcontent14))) && ((!"".equals(var_attrvalue13)) && (!((Object)false).equals(var_attrvalue13))));
                        if (var_shoulddisplayattr16) {
                            out.write(" data-daysCount");
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
                Object var_attrvalue17 = renderContext.getObjectModel().resolveProperty(_global_model, "isCallFromPublisher");
                {
                    Object var_attrcontent18 = renderContext.call("xss", var_attrvalue17, "attribute");
                    {
                        boolean var_shoulddisplayattr20 = (((null != var_attrcontent18) && (!"".equals(var_attrcontent18))) && ((!"".equals(var_attrvalue17)) && (!((Object)false).equals(var_attrvalue17))));
                        if (var_shoulddisplayattr20) {
                            out.write(" data-isPublishMode");
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
            out.write(">\r\n            <div>\r\n                ");
            {
                Object var_tagvar21 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "type"), "elementName");
                if (renderContext.getObjectModel().toBoolean(var_tagvar21)) {
                    out.write("<");
                    out.write(renderContext.getObjectModel().toString(var_tagvar21));
                }
                if (!renderContext.getObjectModel().toBoolean(var_tagvar21)) {
                    out.write("<h2");
                }
                out.write(" class=\"cmp__title pt-3 pb-2 rideTitle\"");
                {
                    Object var_attrvalue22 = renderContext.getObjectModel().resolveProperty(_global_model, "title");
                    {
                        Object var_attrcontent23 = renderContext.call("xss", var_attrvalue22, "attribute");
                        {
                            boolean var_shoulddisplayattr25 = (((null != var_attrcontent23) && (!"".equals(var_attrcontent23))) && ((!"".equals(var_attrvalue22)) && (!((Object)false).equals(var_attrvalue22))));
                            if (var_shoulddisplayattr25) {
                                out.write(" data-rideTitle");
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
                out.write(">");
                {
                    Object var_26 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "title"), "text");
                    out.write(renderContext.getObjectModel().toString(var_26));
                }
                if (renderContext.getObjectModel().toBoolean(var_tagvar21)) {
                    out.write("</");
                    out.write(renderContext.getObjectModel().toString(var_tagvar21));
                    out.write(">");
                }
                if (!renderContext.getObjectModel().toBoolean(var_tagvar21)) {
                    out.write("</h2>");
                }
            }
            out.write("\r\n                \r\n                <p class=\"cmp__title-text pb-3\"><span class=\"cmp-icon\"><img");
            {
                Object var_attrvalue27 = renderContext.getObjectModel().resolveProperty(_global_model, "locationIcon");
                {
                    Object var_attrcontent28 = renderContext.call("xss", var_attrvalue27, "uri");
                    {
                        boolean var_shoulddisplayattr30 = (((null != var_attrcontent28) && (!"".equals(var_attrcontent28))) && ((!"".equals(var_attrvalue27)) && (!((Object)false).equals(var_attrvalue27))));
                        if (var_shoulddisplayattr30) {
                            out.write(" src");
                            {
                                boolean var_istrueattr29 = (var_attrvalue27.equals(true));
                                if (!var_istrueattr29) {
                                    out.write("=\"");
                                    out.write(renderContext.getObjectModel().toString(var_attrcontent28));
                                    out.write("\"");
                                }
                            }
                        }
                    }
                }
            }
            out.write("/></span>");
            {
                String var_31 = (" " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "startLocation"), "text")));
                out.write(renderContext.getObjectModel().toString(var_31));
            }
            out.write("</p>\r\n            </div>\r\n        </div>\r\n\r\n        <div class=\"container-fluid\">\r\n            ");
            {
                Object var_collectionvar32 = renderContext.getObjectModel().resolveProperty(_global_model, "entityList");
                {
                    long var_size33 = ((var_collectionvar32_list_coerced$ == null ? (var_collectionvar32_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar32)) : var_collectionvar32_list_coerced$).size());
                    {
                        boolean var_notempty34 = (var_size33 > 0);
                        if (var_notempty34) {
                            {
                                long var_end37 = var_size33;
                                {
                                    boolean var_validstartstepend38 = (((0 < var_size33) && true) && (var_end37 > 0));
                                    if (var_validstartstepend38) {
                                        out.write("<div class=\"rental-img-slider\">");
                                        if (var_collectionvar32_list_coerced$ == null) {
                                            var_collectionvar32_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar32);
                                        }
                                        long var_index39 = 0;
                                        for (Object item : var_collectionvar32_list_coerced$) {
                                            {
                                                boolean var_traversal41 = (((var_index39 >= 0) && (var_index39 <= var_end37)) && true);
                                                if (var_traversal41) {
                                                    out.write("\r\n                ");
                                                    {
                                                        boolean var_testvariable42 = (org.apache.sling.scripting.sightly.compiler.expression.nodes.BinaryOperator.strictEq(renderContext.getObjectModel().resolveProperty(item, "variation"), "image"));
                                                        if (var_testvariable42) {
                                                            out.write("\r\n                    <picture>\r\n                        <!-- Mobile Image -->\r\n                        <source media=\"(max-width:767)\"");
                                                            {
                                                                Object var_attrvalue43 = renderContext.getObjectModel().resolveProperty(item, "mobileImage");
                                                                {
                                                                    Object var_attrcontent44 = renderContext.call("xss", var_attrvalue43, "attribute");
                                                                    {
                                                                        boolean var_shoulddisplayattr46 = (((null != var_attrcontent44) && (!"".equals(var_attrcontent44))) && ((!"".equals(var_attrvalue43)) && (!((Object)false).equals(var_attrvalue43))));
                                                                        if (var_shoulddisplayattr46) {
                                                                            out.write(" srcset");
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
                                                            out.write("/>\r\n                        <!-- Desktop Image -->\r\n                        <img");
                                                            {
                                                                Object var_attrvalue47 = renderContext.getObjectModel().resolveProperty(item, "desktopImage");
                                                                {
                                                                    Object var_attrcontent48 = renderContext.call("xss", var_attrvalue47, "uri");
                                                                    {
                                                                        boolean var_shoulddisplayattr50 = (((null != var_attrcontent48) && (!"".equals(var_attrcontent48))) && ((!"".equals(var_attrvalue47)) && (!((Object)false).equals(var_attrvalue47))));
                                                                        if (var_shoulddisplayattr50) {
                                                                            out.write(" src");
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
                                                            {
                                                                Object var_attrvalue51 = renderContext.getObjectModel().resolveProperty(item, "altText");
                                                                {
                                                                    Object var_attrcontent52 = renderContext.call("xss", var_attrvalue51, "attribute");
                                                                    {
                                                                        boolean var_shoulddisplayattr54 = (((null != var_attrcontent52) && (!"".equals(var_attrcontent52))) && ((!"".equals(var_attrvalue51)) && (!((Object)false).equals(var_attrvalue51))));
                                                                        if (var_shoulddisplayattr54) {
                                                                            out.write(" alt");
                                                                            {
                                                                                boolean var_istrueattr53 = (var_attrvalue51.equals(true));
                                                                                if (!var_istrueattr53) {
                                                                                    out.write("=\"");
                                                                                    out.write(renderContext.getObjectModel().toString(var_attrcontent52));
                                                                                    out.write("\"");
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            out.write("/>\r\n                    </picture>\r\n                ");
                                                        }
                                                    }
                                                    out.write("\r\n                ");
                                                    {
                                                        boolean var_testvariable55 = (org.apache.sling.scripting.sightly.compiler.expression.nodes.BinaryOperator.strictEq(renderContext.getObjectModel().resolveProperty(item, "variation"), "video"));
                                                        if (var_testvariable55) {
                                                            out.write("\r\n                    <div class=\"video-content\">\r\n                        ");
                                                            {
                                                                boolean var_testvariable56 = ((org.apache.sling.scripting.sightly.compiler.expression.nodes.BinaryOperator.strictEq(renderContext.getObjectModel().resolveProperty(item, "enableAutoplay"), "true")) && (org.apache.sling.scripting.sightly.compiler.expression.nodes.BinaryOperator.strictEq(renderContext.getObjectModel().resolveProperty(item, "enableMute"), "true")));
                                                                if (var_testvariable56) {
                                                                    out.write("\r\n                            <video class=\"video\"");
                                                                    {
                                                                        Object var_attrvalue57 = renderContext.getObjectModel().resolveProperty(item, "videoThumbnail");
                                                                        {
                                                                            Object var_attrcontent58 = renderContext.call("xss", var_attrvalue57, "uri");
                                                                            {
                                                                                boolean var_shoulddisplayattr60 = (((null != var_attrcontent58) && (!"".equals(var_attrcontent58))) && ((!"".equals(var_attrvalue57)) && (!((Object)false).equals(var_attrvalue57))));
                                                                                if (var_shoulddisplayattr60) {
                                                                                    out.write(" poster");
                                                                                    {
                                                                                        boolean var_istrueattr59 = (var_attrvalue57.equals(true));
                                                                                        if (!var_istrueattr59) {
                                                                                            out.write("=\"");
                                                                                            out.write(renderContext.getObjectModel().toString(var_attrcontent58));
                                                                                            out.write("\"");
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    out.write(" controls autoplay muted>\r\n                                <source");
                                                                    {
                                                                        String var_attrcontent61 = (" " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(item, "videoLink"), "uri")));
                                                                        out.write(" src=\"");
                                                                        out.write(renderContext.getObjectModel().toString(var_attrcontent61));
                                                                        out.write("\"");
                                                                    }
                                                                    out.write(" type=\"video/mp4\"/>\r\n                            </video>\r\n                        ");
                                                                }
                                                            }
                                                            out.write("\r\n                        ");
                                                            {
                                                                boolean var_testvariable62 = ((org.apache.sling.scripting.sightly.compiler.expression.nodes.BinaryOperator.strictEq(renderContext.getObjectModel().resolveProperty(item, "enableAutoplay"), "true")) && (!org.apache.sling.scripting.sightly.compiler.expression.nodes.BinaryOperator.strictEq(renderContext.getObjectModel().resolveProperty(item, "enableMute"), "true")));
                                                                if (var_testvariable62) {
                                                                    out.write("\r\n                            <video class=\"video\"");
                                                                    {
                                                                        Object var_attrvalue63 = renderContext.getObjectModel().resolveProperty(item, "videoThumbnail");
                                                                        {
                                                                            Object var_attrcontent64 = renderContext.call("xss", var_attrvalue63, "uri");
                                                                            {
                                                                                boolean var_shoulddisplayattr66 = (((null != var_attrcontent64) && (!"".equals(var_attrcontent64))) && ((!"".equals(var_attrvalue63)) && (!((Object)false).equals(var_attrvalue63))));
                                                                                if (var_shoulddisplayattr66) {
                                                                                    out.write(" poster");
                                                                                    {
                                                                                        boolean var_istrueattr65 = (var_attrvalue63.equals(true));
                                                                                        if (!var_istrueattr65) {
                                                                                            out.write("=\"");
                                                                                            out.write(renderContext.getObjectModel().toString(var_attrcontent64));
                                                                                            out.write("\"");
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    out.write(" controls autoplay>\r\n                                <source");
                                                                    {
                                                                        String var_attrcontent67 = (" " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(item, "videoLink"), "uri")));
                                                                        out.write(" src=\"");
                                                                        out.write(renderContext.getObjectModel().toString(var_attrcontent67));
                                                                        out.write("\"");
                                                                    }
                                                                    out.write(" type=\"video/mp4\"/>\r\n                            </video>\r\n                        ");
                                                                }
                                                            }
                                                            out.write("  \r\n                        ");
                                                            {
                                                                boolean var_testvariable68 = ((!org.apache.sling.scripting.sightly.compiler.expression.nodes.BinaryOperator.strictEq(renderContext.getObjectModel().resolveProperty(item, "enableAutoplay"), "true")) && (org.apache.sling.scripting.sightly.compiler.expression.nodes.BinaryOperator.strictEq(renderContext.getObjectModel().resolveProperty(item, "enableMute"), "true")));
                                                                if (var_testvariable68) {
                                                                    out.write("\r\n                            <video class=\"video\"");
                                                                    {
                                                                        Object var_attrvalue69 = renderContext.getObjectModel().resolveProperty(item, "videoThumbnail");
                                                                        {
                                                                            Object var_attrcontent70 = renderContext.call("xss", var_attrvalue69, "uri");
                                                                            {
                                                                                boolean var_shoulddisplayattr72 = (((null != var_attrcontent70) && (!"".equals(var_attrcontent70))) && ((!"".equals(var_attrvalue69)) && (!((Object)false).equals(var_attrvalue69))));
                                                                                if (var_shoulddisplayattr72) {
                                                                                    out.write(" poster");
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
                                                                    out.write(" controls muted>\r\n                                <source");
                                                                    {
                                                                        String var_attrcontent73 = (" " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(item, "videoLink"), "uri")));
                                                                        out.write(" src=\"");
                                                                        out.write(renderContext.getObjectModel().toString(var_attrcontent73));
                                                                        out.write("\"");
                                                                    }
                                                                    out.write(" type=\"video/mp4\"/>\r\n                            </video>\r\n                        ");
                                                                }
                                                            }
                                                            out.write("\r\n                        ");
                                                            {
                                                                boolean var_testvariable74 = ((!org.apache.sling.scripting.sightly.compiler.expression.nodes.BinaryOperator.strictEq(renderContext.getObjectModel().resolveProperty(item, "enableAutoplay"), "true")) && (!org.apache.sling.scripting.sightly.compiler.expression.nodes.BinaryOperator.strictEq(renderContext.getObjectModel().resolveProperty(item, "enableMute"), "true")));
                                                                if (var_testvariable74) {
                                                                    out.write("\r\n                        <video class=\"video\"");
                                                                    {
                                                                        Object var_attrvalue75 = renderContext.getObjectModel().resolveProperty(item, "videoThumbnail");
                                                                        {
                                                                            Object var_attrcontent76 = renderContext.call("xss", var_attrvalue75, "uri");
                                                                            {
                                                                                boolean var_shoulddisplayattr78 = (((null != var_attrcontent76) && (!"".equals(var_attrcontent76))) && ((!"".equals(var_attrvalue75)) && (!((Object)false).equals(var_attrvalue75))));
                                                                                if (var_shoulddisplayattr78) {
                                                                                    out.write(" poster");
                                                                                    {
                                                                                        boolean var_istrueattr77 = (var_attrvalue75.equals(true));
                                                                                        if (!var_istrueattr77) {
                                                                                            out.write("=\"");
                                                                                            out.write(renderContext.getObjectModel().toString(var_attrcontent76));
                                                                                            out.write("\"");
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    out.write(" controls>\r\n                            <source");
                                                                    {
                                                                        String var_attrcontent79 = (" " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(item, "videoLink"), "uri")));
                                                                        out.write(" src=\"");
                                                                        out.write(renderContext.getObjectModel().toString(var_attrcontent79));
                                                                        out.write("\"");
                                                                    }
                                                                    out.write(" type=\"video/mp4\"/>\r\n                        </video>\r\n                        ");
                                                                }
                                                            }
                                                            out.write("    \r\n                    </div>\r\n                ");
                                                        }
                                                    }
                                                    out.write("\r\n            ");
                                                }
                                            }
                                            var_index39++;
                                        }
                                        out.write("</div>");
                                    }
                                }
                            }
                        }
                    }
                }
                var_collectionvar32_list_coerced$ = null;
            }
            out.write("\r\n        </div>\r\n        <!--tours Variation-->\r\n        ");
            {
                boolean var_testvariable80 = (org.apache.sling.scripting.sightly.compiler.expression.nodes.BinaryOperator.strictEq(renderContext.getObjectModel().resolveProperty(_global_model, "categoryType"), "tour"));
                if (var_testvariable80) {
                    out.write("<div class=\"container\">\r\n            <!-- <div class=\"py-2 tourT1 p-3 mb-5\"> -->\r\n                <div class=\"row row-cols-2 p-2 mb-5\">\r\n                    <!-- <div class=\"d-flex col-12 col-md-12 col-lg-12 pt-4 pt-md-0 flex-wrap flex-md-nowrap\"> -->\r\n                        <div class=\"d-flex col-8 \">\r\n                            <div class=\"text-muted\"><u>");
                    {
                        Object var_81 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "operatedLabel"), "text");
                        out.write(renderContext.getObjectModel().toString(var_81));
                    }
                    out.write("</u>\r\n                            </div> \r\n                            <div class=\"ps-2 text-muted\"><u>");
                    {
                        Object var_82 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "operatorName"), "text");
                        out.write(renderContext.getObjectModel().toString(var_82));
                    }
                    out.write("</u>\r\n                            </div> \r\n                            <div class=\" ps-1 text-muted\"><u>");
                    {
                        Object var_83 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "operatorLoc"), "text");
                        out.write(renderContext.getObjectModel().toString(var_83));
                    }
                    out.write("</u>\r\n                            </div>\r\n                            <div class=\"ms-4 ps-1 text-center\"><img");
                    {
                        Object var_attrvalue84 = renderContext.getObjectModel().resolveProperty(_global_model, "starIcon");
                        {
                            Object var_attrcontent85 = renderContext.call("xss", var_attrvalue84, "uri");
                            {
                                boolean var_shoulddisplayattr87 = (((null != var_attrcontent85) && (!"".equals(var_attrcontent85))) && ((!"".equals(var_attrvalue84)) && (!((Object)false).equals(var_attrvalue84))));
                                if (var_shoulddisplayattr87) {
                                    out.write(" src");
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
                    out.write("/>\r\n                            </div>\r\n                            <div class=\" ps-2  \">");
                    {
                        String var_88 = (renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "totalRating"), "text")) + "\r\n                            ");
                        out.write(renderContext.getObjectModel().toString(var_88));
                    }
                    out.write("</div>\r\n                            <div class=\" ps-1 text-muted\">");
                    {
                        String var_89 = (renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "reviewCount"), "text")) + "\r\n                            ");
                        out.write(renderContext.getObjectModel().toString(var_89));
                    }
                    out.write("</div>\r\n                        </div>\r\n                        <div class=\"col-4 text-center\"><img");
                    {
                        Object var_attrvalue90 = renderContext.getObjectModel().resolveProperty(_global_model, "tourLocationIcon");
                        {
                            Object var_attrcontent91 = renderContext.call("xss", var_attrvalue90, "uri");
                            {
                                boolean var_shoulddisplayattr93 = (((null != var_attrcontent91) && (!"".equals(var_attrcontent91))) && ((!"".equals(var_attrvalue90)) && (!((Object)false).equals(var_attrvalue90))));
                                if (var_shoulddisplayattr93) {
                                    out.write(" src");
                                    {
                                        boolean var_istrueattr92 = (var_attrvalue90.equals(true));
                                        if (!var_istrueattr92) {
                                            out.write("=\"");
                                            out.write(renderContext.getObjectModel().toString(var_attrcontent91));
                                            out.write("\"");
                                        }
                                    }
                                }
                            }
                        }
                    }
                    out.write("/>\r\n                            <span class=\" ps-1 text-light\">");
                    {
                        String var_94 = (renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "tourLocation"), "text")) + "\r\n                            ");
                        out.write(renderContext.getObjectModel().toString(var_94));
                    }
                    out.write("</span>\r\n                        </div>\r\n                    </div>\r\n                <!-- </div>\r\n            </div> -->\r\n        </div>");
                }
            }
            out.write("\r\n       \r\n     <!--tours specifications-->\r\n    ");
            {
                boolean var_testvariable95 = (org.apache.sling.scripting.sightly.compiler.expression.nodes.BinaryOperator.strictEq(renderContext.getObjectModel().resolveProperty(_global_model, "categoryType"), "tour"));
                if (var_testvariable95) {
                    out.write("<div>\r\n        ");
                    {
                        boolean var_testvariable96 = (org.apache.sling.scripting.sightly.compiler.expression.nodes.BinaryOperator.strictEq(renderContext.getObjectModel().resolveProperty(_global_model, "detailPageSelection"), "false"));
                        if (var_testvariable96) {
                            out.write("<div class=\"container-fluid\">\r\n            <div class=\"py-4 rideSpecifications\">\r\n                <div class=\"row\">\r\n                    <div class=\"d-flex col-12 col-md-12 col-lg-12 pt-4 pt-md-0 flex-wrap flex-md-nowrap\">\r\n\r\n                        ");
                            {
                                boolean var_testvariable97 = (org.apache.sling.scripting.sightly.compiler.expression.nodes.BinaryOperator.strictEq(renderContext.getObjectModel().resolveProperty(_global_model, "hideStartLocation"), "false"));
                                if (var_testvariable97) {
                                    out.write("<div class=\"neel-rentals-desc-grid neel-tour-desc-grid d-flex  position-relative align-items-start px-2 px-md-0 mb-4\">\r\n                            \r\n                            <div class=\"d-block ps-2 ps-md-3\">\r\n                                <img class=\"mx-auto d-block\"");
                                    {
                                        Object var_attrvalue98 = renderContext.getObjectModel().resolveProperty(_global_model, "iconOne");
                                        {
                                            Object var_attrcontent99 = renderContext.call("xss", var_attrvalue98, "uri");
                                            {
                                                boolean var_shoulddisplayattr101 = (((null != var_attrcontent99) && (!"".equals(var_attrcontent99))) && ((!"".equals(var_attrvalue98)) && (!((Object)false).equals(var_attrvalue98))));
                                                if (var_shoulddisplayattr101) {
                                                    out.write(" src");
                                                    {
                                                        boolean var_istrueattr100 = (var_attrvalue98.equals(true));
                                                        if (!var_istrueattr100) {
                                                            out.write("=\"");
                                                            out.write(renderContext.getObjectModel().toString(var_attrcontent99));
                                                            out.write("\"");
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    {
                                        Object var_attrvalue102 = renderContext.getObjectModel().resolveProperty(_global_model, "altTextForIcon");
                                        {
                                            Object var_attrcontent103 = renderContext.call("xss", var_attrvalue102, "attribute");
                                            {
                                                boolean var_shoulddisplayattr105 = (((null != var_attrcontent103) && (!"".equals(var_attrcontent103))) && ((!"".equals(var_attrvalue102)) && (!((Object)false).equals(var_attrvalue102))));
                                                if (var_shoulddisplayattr105) {
                                                    out.write(" alt");
                                                    {
                                                        boolean var_istrueattr104 = (var_attrvalue102.equals(true));
                                                        if (!var_istrueattr104) {
                                                            out.write("=\"");
                                                            out.write(renderContext.getObjectModel().toString(var_attrcontent103));
                                                            out.write("\"");
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    out.write("/>\r\n                                <p class=\"font-size-3 font-light-grey text-center\">");
                                    {
                                        Object var_106 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "startPoint"), "text");
                                        out.write(renderContext.getObjectModel().toString(var_106));
                                    }
                                    out.write("</p>\r\n                                <p class=\"font-size-1  text-center\">");
                                    {
                                        Object var_107 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "startLocation"), "text");
                                        out.write(renderContext.getObjectModel().toString(var_107));
                                    }
                                    out.write("</p>\r\n                            </div>\r\n                        </div>");
                                }
                            }
                            out.write("\r\n                        ");
                            {
                                boolean var_testvariable108 = (org.apache.sling.scripting.sightly.compiler.expression.nodes.BinaryOperator.strictEq(renderContext.getObjectModel().resolveProperty(_global_model, "hideEndLocation"), "false"));
                                if (var_testvariable108) {
                                    out.write("<div class=\"neel-rentals-desc-grid neel-tour-desc-grid d-flex  position-relative align-items-start px-2 px-md-0\">\r\n                            \r\n                            <div class=\"d-block ps-2 ps-md-3\">\r\n                                <img class=\"mx-auto d-block\"");
                                    {
                                        Object var_attrvalue109 = renderContext.getObjectModel().resolveProperty(_global_model, "iconSecond");
                                        {
                                            Object var_attrcontent110 = renderContext.call("xss", var_attrvalue109, "uri");
                                            {
                                                boolean var_shoulddisplayattr112 = (((null != var_attrcontent110) && (!"".equals(var_attrcontent110))) && ((!"".equals(var_attrvalue109)) && (!((Object)false).equals(var_attrvalue109))));
                                                if (var_shoulddisplayattr112) {
                                                    out.write(" src");
                                                    {
                                                        boolean var_istrueattr111 = (var_attrvalue109.equals(true));
                                                        if (!var_istrueattr111) {
                                                            out.write("=\"");
                                                            out.write(renderContext.getObjectModel().toString(var_attrcontent110));
                                                            out.write("\"");
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    {
                                        Object var_attrvalue113 = renderContext.getObjectModel().resolveProperty(_global_model, "altTextForIcon");
                                        {
                                            Object var_attrcontent114 = renderContext.call("xss", var_attrvalue113, "attribute");
                                            {
                                                boolean var_shoulddisplayattr116 = (((null != var_attrcontent114) && (!"".equals(var_attrcontent114))) && ((!"".equals(var_attrvalue113)) && (!((Object)false).equals(var_attrvalue113))));
                                                if (var_shoulddisplayattr116) {
                                                    out.write(" alt");
                                                    {
                                                        boolean var_istrueattr115 = (var_attrvalue113.equals(true));
                                                        if (!var_istrueattr115) {
                                                            out.write("=\"");
                                                            out.write(renderContext.getObjectModel().toString(var_attrcontent114));
                                                            out.write("\"");
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    out.write("/>\r\n                                <p class=\"font-size-3 font-light-grey text-center\">");
                                    {
                                        Object var_117 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "endPoint"), "text");
                                        out.write(renderContext.getObjectModel().toString(var_117));
                                    }
                                    out.write("</p>\r\n                                <p class=\"font-size-1  text-center\">");
                                    {
                                        Object var_118 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "endLocation"), "text");
                                        out.write(renderContext.getObjectModel().toString(var_118));
                                    }
                                    out.write("</p>\r\n                            </div>\r\n                        </div>");
                                }
                            }
                            out.write("\r\n                        ");
                            {
                                boolean var_testvariable119 = (org.apache.sling.scripting.sightly.compiler.expression.nodes.BinaryOperator.strictEq(renderContext.getObjectModel().resolveProperty(_global_model, "hideTerrain"), "false"));
                                if (var_testvariable119) {
                                    out.write("<div class=\"neel-rentals-desc-grid neel-tour-desc-grid d-flex  position-relative align-items-start px-2 px-md-0\">\r\n                            \r\n                            <div class=\"d-block ps-2 ps-md-3 border-0\">\r\n                                <img class=\"mx-auto d-block\"");
                                    {
                                        Object var_attrvalue120 = renderContext.getObjectModel().resolveProperty(_global_model, "iconThird");
                                        {
                                            Object var_attrcontent121 = renderContext.call("xss", var_attrvalue120, "uri");
                                            {
                                                boolean var_shoulddisplayattr123 = (((null != var_attrcontent121) && (!"".equals(var_attrcontent121))) && ((!"".equals(var_attrvalue120)) && (!((Object)false).equals(var_attrvalue120))));
                                                if (var_shoulddisplayattr123) {
                                                    out.write(" src");
                                                    {
                                                        boolean var_istrueattr122 = (var_attrvalue120.equals(true));
                                                        if (!var_istrueattr122) {
                                                            out.write("=\"");
                                                            out.write(renderContext.getObjectModel().toString(var_attrcontent121));
                                                            out.write("\"");
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    {
                                        Object var_attrvalue124 = renderContext.getObjectModel().resolveProperty(_global_model, "altTextForIcon");
                                        {
                                            Object var_attrcontent125 = renderContext.call("xss", var_attrvalue124, "attribute");
                                            {
                                                boolean var_shoulddisplayattr127 = (((null != var_attrcontent125) && (!"".equals(var_attrcontent125))) && ((!"".equals(var_attrvalue124)) && (!((Object)false).equals(var_attrvalue124))));
                                                if (var_shoulddisplayattr127) {
                                                    out.write(" alt");
                                                    {
                                                        boolean var_istrueattr126 = (var_attrvalue124.equals(true));
                                                        if (!var_istrueattr126) {
                                                            out.write("=\"");
                                                            out.write(renderContext.getObjectModel().toString(var_attrcontent125));
                                                            out.write("\"");
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    out.write("/>\r\n                                <p class=\"font-size-3 font-light-grey text-center\">");
                                    {
                                        Object var_128 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "terrainLabel"), "text");
                                        out.write(renderContext.getObjectModel().toString(var_128));
                                    }
                                    out.write("</p>\r\n                                <p class=\"font-size-1  text-center\">");
                                    {
                                        Object var_129 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "terrain"), "text");
                                        out.write(renderContext.getObjectModel().toString(var_129));
                                    }
                                    out.write("</p>\r\n                            </div>\r\n                        </div>");
                                }
                            }
                            out.write("\r\n                        ");
                            {
                                boolean var_testvariable130 = (org.apache.sling.scripting.sightly.compiler.expression.nodes.BinaryOperator.strictEq(renderContext.getObjectModel().resolveProperty(_global_model, "hideTotalDistance"), "false"));
                                if (var_testvariable130) {
                                    out.write("<div class=\"neel-rentals-desc-grid neel-tour-desc-grid d-flex  position-relative align-items-start px-2 px-md-0\">\r\n                            \r\n                            <div class=\"d-block ps-2 ps-md-3\">\r\n                                <img class=\"mx-auto d-block\"");
                                    {
                                        Object var_attrvalue131 = renderContext.getObjectModel().resolveProperty(_global_model, "iconFourth");
                                        {
                                            Object var_attrcontent132 = renderContext.call("xss", var_attrvalue131, "uri");
                                            {
                                                boolean var_shoulddisplayattr134 = (((null != var_attrcontent132) && (!"".equals(var_attrcontent132))) && ((!"".equals(var_attrvalue131)) && (!((Object)false).equals(var_attrvalue131))));
                                                if (var_shoulddisplayattr134) {
                                                    out.write(" src");
                                                    {
                                                        boolean var_istrueattr133 = (var_attrvalue131.equals(true));
                                                        if (!var_istrueattr133) {
                                                            out.write("=\"");
                                                            out.write(renderContext.getObjectModel().toString(var_attrcontent132));
                                                            out.write("\"");
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    {
                                        Object var_attrvalue135 = renderContext.getObjectModel().resolveProperty(_global_model, "altTextForIcon");
                                        {
                                            Object var_attrcontent136 = renderContext.call("xss", var_attrvalue135, "attribute");
                                            {
                                                boolean var_shoulddisplayattr138 = (((null != var_attrcontent136) && (!"".equals(var_attrcontent136))) && ((!"".equals(var_attrvalue135)) && (!((Object)false).equals(var_attrvalue135))));
                                                if (var_shoulddisplayattr138) {
                                                    out.write(" alt");
                                                    {
                                                        boolean var_istrueattr137 = (var_attrvalue135.equals(true));
                                                        if (!var_istrueattr137) {
                                                            out.write("=\"");
                                                            out.write(renderContext.getObjectModel().toString(var_attrcontent136));
                                                            out.write("\"");
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    out.write("/>\r\n                                <p class=\"font-size-3 font-light-grey text-center\">");
                                    {
                                        Object var_139 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "totalDistance"), "text");
                                        out.write(renderContext.getObjectModel().toString(var_139));
                                    }
                                    out.write("</p>\r\n                                <p class=\"font-size-1  text-center\">");
                                    {
                                        Object var_140 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "totalDistanceValue"), "text");
                                        out.write(renderContext.getObjectModel().toString(var_140));
                                    }
                                    out.write("</p>\r\n                            </div>\r\n                        </div>");
                                }
                            }
                            out.write("\r\n                    </div>\r\n                </div>\r\n            </div>\r\n\r\n        </div>");
                        }
                    }
                    out.write("\r\n    </div>");
                }
            }
            out.write("\r\n     <!--rental specifications-->\r\n    ");
            {
                boolean var_testvariable141 = (org.apache.sling.scripting.sightly.compiler.expression.nodes.BinaryOperator.strictEq(renderContext.getObjectModel().resolveProperty(_global_model, "categoryType"), "rental"));
                if (var_testvariable141) {
                    out.write("<div>\r\n        ");
                    {
                        boolean var_testvariable142 = (org.apache.sling.scripting.sightly.compiler.expression.nodes.BinaryOperator.strictEq(renderContext.getObjectModel().resolveProperty(_global_model, "detailPageSelection"), "false"));
                        if (var_testvariable142) {
                            out.write("<div class=\"container-fluid\">\r\n            <div class=\"py-4 rideSpecifications\">\r\n                <div class=\"row\">\r\n                    <div class=\"d-flex col-12 col-md-12 col-lg-12 pt-4 pt-md-0 flex-wrap flex-md-nowrap\">\r\n\r\n                        ");
                            {
                                boolean var_testvariable143 = (org.apache.sling.scripting.sightly.compiler.expression.nodes.BinaryOperator.strictEq(renderContext.getObjectModel().resolveProperty(_global_model, "hideStartLocation"), "false"));
                                if (var_testvariable143) {
                                    out.write("<div class=\"neel-rentals-desc-grid d-flex  position-relative align-items-start px-2 px-md-0\">\r\n                            <img");
                                    {
                                        Object var_attrvalue144 = renderContext.getObjectModel().resolveProperty(_global_model, "iconOne");
                                        {
                                            Object var_attrcontent145 = renderContext.call("xss", var_attrvalue144, "uri");
                                            {
                                                boolean var_shoulddisplayattr147 = (((null != var_attrcontent145) && (!"".equals(var_attrcontent145))) && ((!"".equals(var_attrvalue144)) && (!((Object)false).equals(var_attrvalue144))));
                                                if (var_shoulddisplayattr147) {
                                                    out.write(" src");
                                                    {
                                                        boolean var_istrueattr146 = (var_attrvalue144.equals(true));
                                                        if (!var_istrueattr146) {
                                                            out.write("=\"");
                                                            out.write(renderContext.getObjectModel().toString(var_attrcontent145));
                                                            out.write("\"");
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    {
                                        Object var_attrvalue148 = renderContext.getObjectModel().resolveProperty(_global_model, "altTextForIcon");
                                        {
                                            Object var_attrcontent149 = renderContext.call("xss", var_attrvalue148, "attribute");
                                            {
                                                boolean var_shoulddisplayattr151 = (((null != var_attrcontent149) && (!"".equals(var_attrcontent149))) && ((!"".equals(var_attrvalue148)) && (!((Object)false).equals(var_attrvalue148))));
                                                if (var_shoulddisplayattr151) {
                                                    out.write(" alt");
                                                    {
                                                        boolean var_istrueattr150 = (var_attrvalue148.equals(true));
                                                        if (!var_istrueattr150) {
                                                            out.write("=\"");
                                                            out.write(renderContext.getObjectModel().toString(var_attrcontent149));
                                                            out.write("\"");
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    out.write("/>\r\n                            <div class=\"d-block ps-2 ps-md-3\">\r\n                                <p class=\"font-size-3 font-light-grey\">");
                                    {
                                        Object var_152 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "startPoint"), "text");
                                        out.write(renderContext.getObjectModel().toString(var_152));
                                    }
                                    out.write("</p>\r\n                                <span class=\"font-size-1 d-inline-block\">");
                                    {
                                        Object var_153 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "startLocation"), "text");
                                        out.write(renderContext.getObjectModel().toString(var_153));
                                    }
                                    out.write("</span>\r\n                            </div>\r\n                        </div>");
                                }
                            }
                            out.write("\r\n                        ");
                            {
                                boolean var_testvariable154 = (org.apache.sling.scripting.sightly.compiler.expression.nodes.BinaryOperator.strictEq(renderContext.getObjectModel().resolveProperty(_global_model, "hideEndLocation"), "false"));
                                if (var_testvariable154) {
                                    out.write("<div class=\"neel-rentals-desc-grid d-flex  position-relative align-items-start px-2 px-md-0\">\r\n                            <img");
                                    {
                                        Object var_attrvalue155 = renderContext.getObjectModel().resolveProperty(_global_model, "iconSecond");
                                        {
                                            Object var_attrcontent156 = renderContext.call("xss", var_attrvalue155, "uri");
                                            {
                                                boolean var_shoulddisplayattr158 = (((null != var_attrcontent156) && (!"".equals(var_attrcontent156))) && ((!"".equals(var_attrvalue155)) && (!((Object)false).equals(var_attrvalue155))));
                                                if (var_shoulddisplayattr158) {
                                                    out.write(" src");
                                                    {
                                                        boolean var_istrueattr157 = (var_attrvalue155.equals(true));
                                                        if (!var_istrueattr157) {
                                                            out.write("=\"");
                                                            out.write(renderContext.getObjectModel().toString(var_attrcontent156));
                                                            out.write("\"");
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    {
                                        Object var_attrvalue159 = renderContext.getObjectModel().resolveProperty(_global_model, "altTextForIcon");
                                        {
                                            Object var_attrcontent160 = renderContext.call("xss", var_attrvalue159, "attribute");
                                            {
                                                boolean var_shoulddisplayattr162 = (((null != var_attrcontent160) && (!"".equals(var_attrcontent160))) && ((!"".equals(var_attrvalue159)) && (!((Object)false).equals(var_attrvalue159))));
                                                if (var_shoulddisplayattr162) {
                                                    out.write(" alt");
                                                    {
                                                        boolean var_istrueattr161 = (var_attrvalue159.equals(true));
                                                        if (!var_istrueattr161) {
                                                            out.write("=\"");
                                                            out.write(renderContext.getObjectModel().toString(var_attrcontent160));
                                                            out.write("\"");
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    out.write("/>\r\n                            <div class=\"d-block ps-2 ps-md-3\">\r\n                                <p class=\"font-size-3 font-light-grey\">");
                                    {
                                        Object var_163 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "endPoint"), "text");
                                        out.write(renderContext.getObjectModel().toString(var_163));
                                    }
                                    out.write("</p>\r\n                                <span class=\"font-size-1 d-inline-block\">");
                                    {
                                        Object var_164 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "endLocation"), "text");
                                        out.write(renderContext.getObjectModel().toString(var_164));
                                    }
                                    out.write("</span>\r\n                            </div>\r\n                        </div>");
                                }
                            }
                            out.write("\r\n                        ");
                            {
                                boolean var_testvariable165 = (org.apache.sling.scripting.sightly.compiler.expression.nodes.BinaryOperator.strictEq(renderContext.getObjectModel().resolveProperty(_global_model, "hideTerrain"), "false"));
                                if (var_testvariable165) {
                                    out.write("<div class=\"neel-rentals-desc-grid d-flex  position-relative align-items-start px-2 px-md-0\">\r\n                            <img");
                                    {
                                        Object var_attrvalue166 = renderContext.getObjectModel().resolveProperty(_global_model, "iconThird");
                                        {
                                            Object var_attrcontent167 = renderContext.call("xss", var_attrvalue166, "uri");
                                            {
                                                boolean var_shoulddisplayattr169 = (((null != var_attrcontent167) && (!"".equals(var_attrcontent167))) && ((!"".equals(var_attrvalue166)) && (!((Object)false).equals(var_attrvalue166))));
                                                if (var_shoulddisplayattr169) {
                                                    out.write(" src");
                                                    {
                                                        boolean var_istrueattr168 = (var_attrvalue166.equals(true));
                                                        if (!var_istrueattr168) {
                                                            out.write("=\"");
                                                            out.write(renderContext.getObjectModel().toString(var_attrcontent167));
                                                            out.write("\"");
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    {
                                        Object var_attrvalue170 = renderContext.getObjectModel().resolveProperty(_global_model, "altTextForIcon");
                                        {
                                            Object var_attrcontent171 = renderContext.call("xss", var_attrvalue170, "attribute");
                                            {
                                                boolean var_shoulddisplayattr173 = (((null != var_attrcontent171) && (!"".equals(var_attrcontent171))) && ((!"".equals(var_attrvalue170)) && (!((Object)false).equals(var_attrvalue170))));
                                                if (var_shoulddisplayattr173) {
                                                    out.write(" alt");
                                                    {
                                                        boolean var_istrueattr172 = (var_attrvalue170.equals(true));
                                                        if (!var_istrueattr172) {
                                                            out.write("=\"");
                                                            out.write(renderContext.getObjectModel().toString(var_attrcontent171));
                                                            out.write("\"");
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    out.write("/>\r\n                            <div class=\"d-block ps-2 ps-md-3\">\r\n                                <p class=\"font-size-3 font-light-grey\">");
                                    {
                                        Object var_174 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "terrainLabel"), "text");
                                        out.write(renderContext.getObjectModel().toString(var_174));
                                    }
                                    out.write("</p>\r\n                                <span class=\"font-size-1 d-inline-block\">");
                                    {
                                        Object var_175 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "terrain"), "text");
                                        out.write(renderContext.getObjectModel().toString(var_175));
                                    }
                                    out.write("</span>\r\n                            </div>\r\n                        </div>");
                                }
                            }
                            out.write("\r\n                        ");
                            {
                                boolean var_testvariable176 = (org.apache.sling.scripting.sightly.compiler.expression.nodes.BinaryOperator.strictEq(renderContext.getObjectModel().resolveProperty(_global_model, "hideTotalDistance"), "false"));
                                if (var_testvariable176) {
                                    out.write("<div class=\"neel-rentals-desc-grid d-flex  position-relative align-items-start px-2 px-md-0\">\r\n                            <img");
                                    {
                                        Object var_attrvalue177 = renderContext.getObjectModel().resolveProperty(_global_model, "iconFourth");
                                        {
                                            Object var_attrcontent178 = renderContext.call("xss", var_attrvalue177, "uri");
                                            {
                                                boolean var_shoulddisplayattr180 = (((null != var_attrcontent178) && (!"".equals(var_attrcontent178))) && ((!"".equals(var_attrvalue177)) && (!((Object)false).equals(var_attrvalue177))));
                                                if (var_shoulddisplayattr180) {
                                                    out.write(" src");
                                                    {
                                                        boolean var_istrueattr179 = (var_attrvalue177.equals(true));
                                                        if (!var_istrueattr179) {
                                                            out.write("=\"");
                                                            out.write(renderContext.getObjectModel().toString(var_attrcontent178));
                                                            out.write("\"");
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    {
                                        Object var_attrvalue181 = renderContext.getObjectModel().resolveProperty(_global_model, "altTextForIcon");
                                        {
                                            Object var_attrcontent182 = renderContext.call("xss", var_attrvalue181, "attribute");
                                            {
                                                boolean var_shoulddisplayattr184 = (((null != var_attrcontent182) && (!"".equals(var_attrcontent182))) && ((!"".equals(var_attrvalue181)) && (!((Object)false).equals(var_attrvalue181))));
                                                if (var_shoulddisplayattr184) {
                                                    out.write(" alt");
                                                    {
                                                        boolean var_istrueattr183 = (var_attrvalue181.equals(true));
                                                        if (!var_istrueattr183) {
                                                            out.write("=\"");
                                                            out.write(renderContext.getObjectModel().toString(var_attrcontent182));
                                                            out.write("\"");
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    out.write("/>\r\n                            <div class=\"d-block ps-2 ps-md-3\">\r\n                                <p class=\"font-size-3 font-light-grey\">");
                                    {
                                        Object var_185 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "totalDistance"), "text");
                                        out.write(renderContext.getObjectModel().toString(var_185));
                                    }
                                    out.write("</p>\r\n                                <span class=\"font-size-1 d-inline-block\">");
                                    {
                                        Object var_186 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "totalDistanceValue"), "text");
                                        out.write(renderContext.getObjectModel().toString(var_186));
                                    }
                                    out.write("</span>\r\n                            </div>\r\n                        </div>");
                                }
                            }
                            out.write("\r\n                    </div>\r\n                </div>\r\n            </div>\r\n\r\n        </div>");
                        }
                    }
                    out.write("\r\n    </div>");
                }
            }
            out.write("\r\n  </div>");
        }
    }
    out.write("\r\n\r\n");
}
out.write("\r\n\r\n");
{
    Object var_templatevar187 = renderContext.getObjectModel().resolveProperty(_global_templates, "placeholder");
    {
        boolean var_templateoptions188_field$_isempty = (!renderContext.getObjectModel().toBoolean(_global_title));
        {
            java.util.Map var_templateoptions188 = obj().with("isEmpty", var_templateoptions188_field$_isempty);
            callUnit(out, renderContext, var_templatevar187, var_templateoptions188);
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

