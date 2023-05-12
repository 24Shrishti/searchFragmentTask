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
package org.apache.sling.scripting.sightly.apps.re__002d__wanderlust.components.reviewsListing;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class reviewsListing__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _global_model = null;
Object _global_templates = null;
Object _global_reviewedratinglabel = null;
Object _global___0076__ar = null;
Object _dynamic___006e__ull = bindings.get("null");
Object _global_chk = null;
Collection var_collectionvar63_list_coerced$ = null;
Object _dynamic_chklist = bindings.get("chklist");
Collection var_collectionvar103_list_coerced$ = null;
_global_model = renderContext.call("use", com.re.wanderlust.core.models.ReviewListingModel.class.getName(), obj());
out.write("\r\n\r\n    ");
_global_templates = renderContext.call("use", "core/wcm/components/commons/v1/templates.html", obj());
_global_reviewedratinglabel = renderContext.getObjectModel().resolveProperty(_global_model, "reviewedRatingLabel");
if (renderContext.getObjectModel().toBoolean(_global_reviewedratinglabel)) {
    out.write("\r\n    ");
}
out.write("\r\n    ");
{
    boolean var_testvariable0 = (!renderContext.getObjectModel().toBoolean(renderContext.getObjectModel().resolveProperty(_global_model, "hideComponent")));
    if (var_testvariable0) {
        out.write("<div class=\"review-listing-comp text-center rew-reviewListing rew-reviewListing-ga\"");
        {
            Object var_attrvalue1 = renderContext.getObjectModel().resolveProperty(_global_model, "reviewTextLimit");
            {
                Object var_attrcontent2 = renderContext.call("xss", var_attrvalue1, "attribute");
                {
                    boolean var_shoulddisplayattr4 = (((null != var_attrcontent2) && (!"".equals(var_attrcontent2))) && ((!"".equals(var_attrvalue1)) && (!((Object)false).equals(var_attrvalue1))));
                    if (var_shoulddisplayattr4) {
                        out.write(" data-reviewTextLimit");
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
            Object var_attrvalue5 = renderContext.getObjectModel().resolveProperty(_global_model, "seeAllUrl");
            {
                Object var_attrcontent6 = renderContext.call("xss", var_attrvalue5, "attribute");
                {
                    boolean var_shoulddisplayattr8 = (((null != var_attrcontent6) && (!"".equals(var_attrcontent6))) && ((!"".equals(var_attrvalue5)) && (!((Object)false).equals(var_attrvalue5))));
                    if (var_shoulddisplayattr8) {
                        out.write(" data-seeAllUrl");
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
            Object var_attrvalue9 = renderContext.getObjectModel().resolveProperty(_global_model, "readLessLabel");
            {
                Object var_attrcontent10 = renderContext.call("xss", var_attrvalue9, "attribute");
                {
                    boolean var_shoulddisplayattr12 = (((null != var_attrcontent10) && (!"".equals(var_attrcontent10))) && ((!"".equals(var_attrvalue9)) && (!((Object)false).equals(var_attrvalue9))));
                    if (var_shoulddisplayattr12) {
                        out.write(" data-readLessLabel");
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
            Object var_attrvalue13 = renderContext.getObjectModel().resolveProperty(_global_model, "preSuffixName");
            {
                Object var_attrcontent14 = renderContext.call("xss", var_attrvalue13, "attribute");
                {
                    boolean var_shoulddisplayattr16 = (((null != var_attrcontent14) && (!"".equals(var_attrcontent14))) && ((!"".equals(var_attrvalue13)) && (!((Object)false).equals(var_attrvalue13))));
                    if (var_shoulddisplayattr16) {
                        out.write(" data-preSuffixName");
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
            Object var_attrvalue17 = renderContext.getObjectModel().resolveProperty(_global_model, "readMoreLabel");
            {
                Object var_attrcontent18 = renderContext.call("xss", var_attrvalue17, "attribute");
                {
                    boolean var_shoulddisplayattr20 = (((null != var_attrcontent18) && (!"".equals(var_attrcontent18))) && ((!"".equals(var_attrvalue17)) && (!((Object)false).equals(var_attrvalue17))));
                    if (var_shoulddisplayattr20) {
                        out.write(" data-readMoreLabel");
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
            Object var_attrvalue21 = renderContext.getObjectModel().resolveProperty(_global_model, "suffix");
            {
                Object var_attrcontent22 = renderContext.call("xss", var_attrvalue21, "attribute");
                {
                    boolean var_shoulddisplayattr24 = (((null != var_attrcontent22) && (!"".equals(var_attrcontent22))) && ((!"".equals(var_attrvalue21)) && (!((Object)false).equals(var_attrvalue21))));
                    if (var_shoulddisplayattr24) {
                        out.write(" data-suffix");
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
            Object var_attrvalue25 = renderContext.getObjectModel().resolveProperty(_global_model, "newTab");
            {
                Object var_attrcontent26 = renderContext.call("xss", var_attrvalue25, "attribute");
                {
                    boolean var_shoulddisplayattr28 = (((null != var_attrcontent26) && (!"".equals(var_attrcontent26))) && ((!"".equals(var_attrvalue25)) && (!((Object)false).equals(var_attrvalue25))));
                    if (var_shoulddisplayattr28) {
                        out.write(" data-newTab");
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
            Object var_attrvalue29 = renderContext.getObjectModel().resolveProperty(_global_model, "btnColor");
            {
                Object var_attrcontent30 = renderContext.call("xss", var_attrvalue29, "attribute");
                {
                    boolean var_shoulddisplayattr32 = (((null != var_attrcontent30) && (!"".equals(var_attrcontent30))) && ((!"".equals(var_attrvalue29)) && (!((Object)false).equals(var_attrvalue29))));
                    if (var_shoulddisplayattr32) {
                        out.write(" data-btnColor");
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
            Object var_attrvalue33 = renderContext.getObjectModel().resolveProperty(_global_model, "textColor");
            {
                Object var_attrcontent34 = renderContext.call("xss", var_attrvalue33, "attribute");
                {
                    boolean var_shoulddisplayattr36 = (((null != var_attrcontent34) && (!"".equals(var_attrcontent34))) && ((!"".equals(var_attrvalue33)) && (!((Object)false).equals(var_attrvalue33))));
                    if (var_shoulddisplayattr36) {
                        out.write(" data-textColor");
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
            Object var_attrvalue37 = renderContext.getObjectModel().resolveProperty(_global_model, "checkBoxForOperatorDetailPage");
            {
                Object var_attrcontent38 = renderContext.call("xss", var_attrvalue37, "attribute");
                {
                    boolean var_shoulddisplayattr40 = (((null != var_attrcontent38) && (!"".equals(var_attrcontent38))) && ((!"".equals(var_attrvalue37)) && (!((Object)false).equals(var_attrvalue37))));
                    if (var_shoulddisplayattr40) {
                        out.write(" data-checkBoxForOperatorDetailPage");
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
            Object var_attrvalue41 = renderContext.getObjectModel().resolveProperty(_global_model, "toursCategories");
            {
                Object var_attrcontent42 = renderContext.call("xss", var_attrvalue41, "attribute");
                {
                    boolean var_shoulddisplayattr44 = (((null != var_attrcontent42) && (!"".equals(var_attrcontent42))) && ((!"".equals(var_attrvalue41)) && (!((Object)false).equals(var_attrvalue41))));
                    if (var_shoulddisplayattr44) {
                        out.write(" data-toursCategories");
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
            Object var_attrvalue45 = renderContext.getObjectModel().resolveProperty(_global_model, "wanderlustCategories");
            {
                Object var_attrcontent46 = renderContext.call("xss", var_attrvalue45, "attribute");
                {
                    boolean var_shoulddisplayattr48 = (((null != var_attrcontent46) && (!"".equals(var_attrcontent46))) && ((!"".equals(var_attrvalue45)) && (!((Object)false).equals(var_attrvalue45))));
                    if (var_shoulddisplayattr48) {
                        out.write(" data-wanderlustCategories");
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
            Object var_attrvalue49 = renderContext.getObjectModel().resolveProperty(renderContext.getObjectModel().resolveProperty(_global_model, "listOfReviews"), "totalReviews");
            {
                Object var_attrcontent50 = renderContext.call("xss", var_attrvalue49, "attribute");
                {
                    boolean var_shoulddisplayattr52 = (((null != var_attrcontent50) && (!"".equals(var_attrcontent50))) && ((!"".equals(var_attrvalue49)) && (!((Object)false).equals(var_attrvalue49))));
                    if (var_shoulddisplayattr52) {
                        out.write(" data-totalReviews");
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
            Object var_attrvalue53 = renderContext.getObjectModel().resolveProperty(renderContext.getObjectModel().resolveProperty(_global_model, "listOfReviewsListing"), "size");
            {
                Object var_attrcontent54 = renderContext.call("xss", var_attrvalue53, "attribute");
                {
                    boolean var_shoulddisplayattr56 = (((null != var_attrcontent54) && (!"".equals(var_attrcontent54))) && ((!"".equals(var_attrvalue53)) && (!((Object)false).equals(var_attrvalue53))));
                    if (var_shoulddisplayattr56) {
                        out.write(" data-landingReviews");
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
        out.write(">\r\n\r\n        <div class=\"container\">\r\n            <div class=\"container\" id=\"loaderReviewListing\">\r\n                <div class=\"loading\">\r\n                    <div class=\"loading-bar\"></div>\r\n                    <div class=\"loading-bar\"></div>\r\n                    <div class=\"loading-bar\"></div>\r\n                    <div class=\"loading-bar\"></div>\r\n                </div>\r\n            </div>\r\n            <div class=\"row\">\r\n                <div class=\"col-12\">\r\n                    <!--check box tick for detail pages-->\r\n                    ");
_global___0076__ar = ((((org.apache.sling.scripting.sightly.compiler.expression.nodes.BinaryOperator.strictEq(renderContext.getObjectModel().resolveProperty(_global_model, "wanderlustCategories"), "Rental")) && (org.apache.sling.scripting.sightly.compiler.expression.nodes.BinaryOperator.strictEq(renderContext.getObjectModel().resolveProperty(_global_model, "checkBoxForOperatorDetailPage"), "true"))) || ((org.apache.sling.scripting.sightly.compiler.expression.nodes.BinaryOperator.strictEq(renderContext.getObjectModel().resolveProperty(_global_model, "wanderlustCategories"), "Tour")) && (org.apache.sling.scripting.sightly.compiler.expression.nodes.BinaryOperator.strictEq(renderContext.getObjectModel().resolveProperty(_global_model, "toursCategories"), "Operator Detail Page")))) || ((org.apache.sling.scripting.sightly.compiler.expression.nodes.BinaryOperator.strictEq(renderContext.getObjectModel().resolveProperty(_global_model, "wanderlustCategories"), "Tour")) && (org.apache.sling.scripting.sightly.compiler.expression.nodes.BinaryOperator.strictEq(renderContext.getObjectModel().resolveProperty(_global_model, "toursCategories"), "Tour Detail Page"))));
        if (renderContext.getObjectModel().toBoolean(_global___0076__ar)) {
            out.write("<div>\r\n                        ");
_global_chk = ((org.apache.sling.scripting.sightly.compiler.expression.nodes.BinaryOperator.strictEq(renderContext.getObjectModel().resolveProperty(renderContext.getObjectModel().resolveProperty(_global_model, "listOfReviews"), "totalReviews"), "0")) || (org.apache.sling.scripting.sightly.compiler.expression.nodes.BinaryOperator.strictEq(renderContext.getObjectModel().resolveProperty(renderContext.getObjectModel().resolveProperty(_global_model, "listOfReviews"), "totalReviews"), _dynamic___006e__ull)));
            if (renderContext.getObjectModel().toBoolean(_global_chk)) {
                out.write("<div>\r\n                            <div class=\"noResult\"");
                {
                    Object var_attrvalue57 = renderContext.call("xss", _global_chk, "html");
                    {
                        boolean var_shoulddisplayattr60 = ((!"".equals(var_attrvalue57)) && (!((Object)false).equals(var_attrvalue57)));
                        if (var_shoulddisplayattr60) {
                            out.write(" data-chk");
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
                out.write(">");
                {
                    Object var_61 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "errorMsg"), "text");
                    out.write(renderContext.getObjectModel().toString(var_61));
                }
                out.write("</div>\r\n                        </div>");
            }
            out.write("\r\n                        ");
            {
                boolean var_testvariable62 = (!renderContext.getObjectModel().toBoolean(_global_chk));
                if (var_testvariable62) {
                    out.write("<div>\r\n                            <div class=\"review-listing-comp__carousel\" id=\"reviewListingOperatorPage\">\r\n\r\n                                ");
                    {
                        Object var_collectionvar63 = renderContext.getObjectModel().resolveProperty(renderContext.getObjectModel().resolveProperty(_global_model, "listOfReviews"), "item");
                        {
                            long var_size64 = ((var_collectionvar63_list_coerced$ == null ? (var_collectionvar63_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar63)) : var_collectionvar63_list_coerced$).size());
                            {
                                boolean var_notempty65 = (var_size64 > 0);
                                if (var_notempty65) {
                                    {
                                        long var_end68 = var_size64;
                                        {
                                            boolean var_validstartstepend69 = (((0 < var_size64) && true) && (var_end68 > 0));
                                            if (var_validstartstepend69) {
                                                if (var_collectionvar63_list_coerced$ == null) {
                                                    var_collectionvar63_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar63);
                                                }
                                                long var_index70 = 0;
                                                for (Object reviews : var_collectionvar63_list_coerced$) {
                                                    {
                                                        boolean var_traversal72 = (((var_index70 >= 0) && (var_index70 <= var_end68)) && true);
                                                        if (var_traversal72) {
                                                            out.write("<div class=\"card\">\r\n                                    <div class=\"card-body\">\r\n                                        <div class=\"d-flex\">\r\n                                            ");
                                                            {
                                                                boolean var_testvariable73 = (!renderContext.getObjectModel().toBoolean(renderContext.getObjectModel().resolveProperty(reviews, "image")));
                                                                if (var_testvariable73) {
                                                                    out.write("<div class=\"user-image\"><span><img loading=\"lazy\"");
                                                                    {
                                                                        Object var_attrvalue74 = renderContext.getObjectModel().resolveProperty(_global_model, "userImage");
                                                                        {
                                                                            Object var_attrcontent75 = renderContext.call("xss", var_attrvalue74, "uri");
                                                                            {
                                                                                boolean var_shoulddisplayattr77 = (((null != var_attrcontent75) && (!"".equals(var_attrcontent75))) && ((!"".equals(var_attrvalue74)) && (!((Object)false).equals(var_attrvalue74))));
                                                                                if (var_shoulddisplayattr77) {
                                                                                    out.write(" src");
                                                                                    {
                                                                                        boolean var_istrueattr76 = (var_attrvalue74.equals(true));
                                                                                        if (!var_istrueattr76) {
                                                                                            out.write("=\"");
                                                                                            out.write(renderContext.getObjectModel().toString(var_attrcontent75));
                                                                                            out.write("\"");
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    out.write(" alt=\"\" class=\"me-3\"/></span></div>");
                                                                }
                                                            }
                                                            out.write("\r\n                                            ");
                                                            {
                                                                Object var_testvariable78 = renderContext.getObjectModel().resolveProperty(reviews, "image");
                                                                if (renderContext.getObjectModel().toBoolean(var_testvariable78)) {
                                                                    out.write("<div class=\"user-image\"><span><img loading=\"lazy\"");
                                                                    {
                                                                        Object var_attrvalue79 = renderContext.getObjectModel().resolveProperty(reviews, "image");
                                                                        {
                                                                            Object var_attrcontent80 = renderContext.call("xss", var_attrvalue79, "uri");
                                                                            {
                                                                                boolean var_shoulddisplayattr82 = (((null != var_attrcontent80) && (!"".equals(var_attrcontent80))) && ((!"".equals(var_attrvalue79)) && (!((Object)false).equals(var_attrvalue79))));
                                                                                if (var_shoulddisplayattr82) {
                                                                                    out.write(" src");
                                                                                    {
                                                                                        boolean var_istrueattr81 = (var_attrvalue79.equals(true));
                                                                                        if (!var_istrueattr81) {
                                                                                            out.write("=\"");
                                                                                            out.write(renderContext.getObjectModel().toString(var_attrcontent80));
                                                                                            out.write("\"");
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    out.write(" alt=\"\" class=\"me-3\"/></span></div>");
                                                                }
                                                            }
                                                            out.write("\r\n                                            <div class=\"user-content\">\r\n                                                <h5 class=\"card-title text-start mb-1\">");
                                                            {
                                                                Object var_83 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(reviews, "name"), "text");
                                                                out.write(renderContext.getObjectModel().toString(var_83));
                                                            }
                                                            out.write("</h5>\r\n                                                <p class=\"sub-title mb-1\">");
                                                            {
                                                                String var_84 = (renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "reviewedLabel"), "text")) + " ");
                                                                out.write(renderContext.getObjectModel().toString(var_84));
                                                            }
                                                            out.write("<span class=\"\">");
                                                            {
                                                                String var_85 = ("\r\n                                                        " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(reviews, "displayName"), "text")));
                                                                out.write(renderContext.getObjectModel().toString(var_85));
                                                            }
                                                            out.write("</span></p>\r\n                                                <span class=\"rating-star d-flex \"><img loading=\"lazy\"");
                                                            {
                                                                Object var_attrvalue86 = renderContext.getObjectModel().resolveProperty(_global_model, "starIconImage");
                                                                {
                                                                    Object var_attrcontent87 = renderContext.call("xss", var_attrvalue86, "uri");
                                                                    {
                                                                        boolean var_shoulddisplayattr89 = (((null != var_attrcontent87) && (!"".equals(var_attrcontent87))) && ((!"".equals(var_attrvalue86)) && (!((Object)false).equals(var_attrvalue86))));
                                                                        if (var_shoulddisplayattr89) {
                                                                            out.write(" src");
                                                                            {
                                                                                boolean var_istrueattr88 = (var_attrvalue86.equals(true));
                                                                                if (!var_istrueattr88) {
                                                                                    out.write("=\"");
                                                                                    out.write(renderContext.getObjectModel().toString(var_attrcontent87));
                                                                                    out.write("\"");
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            out.write(" class=\"me-1\" alt=\"Rating star\"/>");
                                                            {
                                                                String var_90 = (((" " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(reviews, "rating"), "text"))) + "\r\n                                                    ") + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "reviewedRatingLabel"), "text")));
                                                                out.write(renderContext.getObjectModel().toString(var_90));
                                                            }
                                                            out.write("</span>\r\n                                            </div>\r\n                                        </div>\r\n                                        <div class=\"user-reviews mt-3\">\r\n                                            <p class=\"reviewDescription text-start\">");
                                                            {
                                                                Object var_91 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(reviews, "detail"), "text");
                                                                out.write(renderContext.getObjectModel().toString(var_91));
                                                            }
                                                            out.write("</p>\r\n                                        </div>\r\n                                    </div>\r\n                                </div>\n");
                                                        }
                                                    }
                                                    var_index70++;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        var_collectionvar63_list_coerced$ = null;
                    }
                    out.write("\r\n\r\n\r\n                            </div>\r\n\r\n                            ");
                    {
                        boolean var_testvariable92 = (!org.apache.sling.scripting.sightly.compiler.expression.nodes.BinaryOperator.strictEq(renderContext.getObjectModel().resolveProperty(renderContext.getObjectModel().resolveProperty(_global_model, "listOfReviews"), "flag"), "0"));
                        if (var_testvariable92) {
                            out.write("<div>\r\n                                <div class=\"button button__white-link\">\r\n                                    <a class=\"cmp-button see-all-cta seeAllBtn\" href=\"#\"");
                            {
                                String var_attrcontent93 = (((("background-color: '" + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "btnColor"), "styleToken"))) + "';color: '") + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "textColor"), "styleToken"))) + "'");
                                out.write(" style=\"");
                                out.write(renderContext.getObjectModel().toString(var_attrcontent93));
                                out.write("\"");
                            }
                            out.write(">");
                            {
                                Object var_94 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "seeAllLabel"), "text");
                                out.write(renderContext.getObjectModel().toString(var_94));
                            }
                            out.write("</a>\r\n                                </div>\r\n                            </div>");
                        }
                    }
                    out.write("\r\n                        </div>");
                }
            }
            out.write("\r\n                    </div>");
        }
        out.write("\r\n                    <!--check box un tick for landing page-->\r\n                    ");
        {
            boolean var_testvariable95 = (((org.apache.sling.scripting.sightly.compiler.expression.nodes.BinaryOperator.strictEq(renderContext.getObjectModel().resolveProperty(_global_model, "wanderlustCategories"), "Rental")) && (org.apache.sling.scripting.sightly.compiler.expression.nodes.BinaryOperator.strictEq(renderContext.getObjectModel().resolveProperty(_global_model, "checkBoxForOperatorDetailPage"), "false"))) || ((org.apache.sling.scripting.sightly.compiler.expression.nodes.BinaryOperator.strictEq(renderContext.getObjectModel().resolveProperty(_global_model, "wanderlustCategories"), "Tour")) && (org.apache.sling.scripting.sightly.compiler.expression.nodes.BinaryOperator.strictEq(renderContext.getObjectModel().resolveProperty(_global_model, "toursCategories"), "Tour Landing Page"))));
            if (var_testvariable95) {
                out.write("<div>\r\n                        <div class=\"review-listing-comp__carousel\" id=\"reviewListing\">\r\n\r\n                            ");
_global_chk = (" " + renderContext.getObjectModel().toString((org.apache.sling.scripting.sightly.compiler.expression.nodes.BinaryOperator.strictEq(renderContext.getObjectModel().resolveProperty(renderContext.getObjectModel().resolveProperty(_global_model, "listOfReviewsListing"), "size"), 0))));
                {
                    Object var_testvariable96 = _global_chk;
                    if (renderContext.getObjectModel().toBoolean(var_testvariable96)) {
                        out.write("<div id=\"chkList\"");
                        {
                            String var_attrcontent97 = (((("background-color: '" + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "btnColor"), "styleToken"))) + "';color: '") + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "textColor"), "styleToken"))) + "'");
                            out.write(" style=\"");
                            out.write(renderContext.getObjectModel().toString(var_attrcontent97));
                            out.write("\"");
                        }
                        {
                            Object var_attrvalue98 = renderContext.call("xss", _dynamic_chklist, "html");
                            {
                                boolean var_shoulddisplayattr101 = ((!"".equals(var_attrvalue98)) && (!((Object)false).equals(var_attrvalue98)));
                                if (var_shoulddisplayattr101) {
                                    out.write(" data-chkList");
                                    {
                                        boolean var_istrueattr100 = (var_attrvalue98.equals(true));
                                        if (!var_istrueattr100) {
                                            out.write("=\"");
                                            out.write(renderContext.getObjectModel().toString(var_attrvalue98));
                                            out.write("\"");
                                        }
                                    }
                                }
                            }
                        }
                        out.write(">");
                        {
                            String var_102 = ("\r\n                                " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "errorMsg"), "text")));
                            out.write(renderContext.getObjectModel().toString(var_102));
                        }
                        out.write("</div>");
                    }
                }
                out.write("\r\n\r\n                            ");
                {
                    Object var_collectionvar103 = renderContext.getObjectModel().resolveProperty(_global_model, "listOfReviewsListing");
                    {
                        long var_size104 = ((var_collectionvar103_list_coerced$ == null ? (var_collectionvar103_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar103)) : var_collectionvar103_list_coerced$).size());
                        {
                            boolean var_notempty105 = (var_size104 > 0);
                            if (var_notempty105) {
                                {
                                    long var_end108 = var_size104;
                                    {
                                        boolean var_validstartstepend109 = (((0 < var_size104) && true) && (var_end108 > 0));
                                        if (var_validstartstepend109) {
                                            if (var_collectionvar103_list_coerced$ == null) {
                                                var_collectionvar103_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar103);
                                            }
                                            long var_index110 = 0;
                                            for (Object key : var_collectionvar103_list_coerced$) {
                                                {
                                                    boolean var_traversal112 = (((var_index110 >= 0) && (var_index110 <= var_end108)) && true);
                                                    if (var_traversal112) {
                                                        out.write("<div class=\"card\">\r\n\r\n                                <div class=\"card-body\">\r\n                                    <div class=\"d-flex\">\r\n                                        ");
                                                        {
                                                            boolean var_testvariable113 = (!renderContext.getObjectModel().toBoolean(renderContext.getObjectModel().resolveProperty(key, "userImage")));
                                                            if (var_testvariable113) {
                                                                out.write("<div class=\"user-image\"><span><img loading=\"lazy\"");
                                                                {
                                                                    Object var_attrvalue114 = renderContext.getObjectModel().resolveProperty(_global_model, "userImage");
                                                                    {
                                                                        Object var_attrcontent115 = renderContext.call("xss", var_attrvalue114, "uri");
                                                                        {
                                                                            boolean var_shoulddisplayattr117 = (((null != var_attrcontent115) && (!"".equals(var_attrcontent115))) && ((!"".equals(var_attrvalue114)) && (!((Object)false).equals(var_attrvalue114))));
                                                                            if (var_shoulddisplayattr117) {
                                                                                out.write(" src");
                                                                                {
                                                                                    boolean var_istrueattr116 = (var_attrvalue114.equals(true));
                                                                                    if (!var_istrueattr116) {
                                                                                        out.write("=\"");
                                                                                        out.write(renderContext.getObjectModel().toString(var_attrcontent115));
                                                                                        out.write("\"");
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                out.write(" alt=\"\" class=\"me-3\"/></span>\r\n                                        </div>");
                                                            }
                                                        }
                                                        out.write("\r\n\r\n                                        ");
                                                        {
                                                            Object var_testvariable118 = renderContext.getObjectModel().resolveProperty(key, "userImage");
                                                            if (renderContext.getObjectModel().toBoolean(var_testvariable118)) {
                                                                out.write("<div class=\"user-image\"><span><img loading=\"lazy\"");
                                                                {
                                                                    Object var_attrvalue119 = renderContext.getObjectModel().resolveProperty(key, "userImage");
                                                                    {
                                                                        Object var_attrcontent120 = renderContext.call("xss", var_attrvalue119, "uri");
                                                                        {
                                                                            boolean var_shoulddisplayattr122 = (((null != var_attrcontent120) && (!"".equals(var_attrcontent120))) && ((!"".equals(var_attrvalue119)) && (!((Object)false).equals(var_attrvalue119))));
                                                                            if (var_shoulddisplayattr122) {
                                                                                out.write(" src");
                                                                                {
                                                                                    boolean var_istrueattr121 = (var_attrvalue119.equals(true));
                                                                                    if (!var_istrueattr121) {
                                                                                        out.write("=\"");
                                                                                        out.write(renderContext.getObjectModel().toString(var_attrcontent120));
                                                                                        out.write("\"");
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                out.write(" alt=\"\" class=\"me-3\"/></span>\r\n                                        </div>");
                                                            }
                                                        }
                                                        out.write("\r\n\r\n                                        <div class=\"user-content\">\r\n                                            <h5 class=\"card-title text-start mb-1\">");
                                                        {
                                                            Object var_123 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(key, "userName"), "text");
                                                            out.write(renderContext.getObjectModel().toString(var_123));
                                                        }
                                                        out.write("</h5>\r\n                                            ");
                                                        {
                                                            boolean var_testvariable124 = (org.apache.sling.scripting.sightly.compiler.expression.nodes.BinaryOperator.strictEq(renderContext.getObjectModel().resolveProperty(_global_model, "wanderlustCategories"), "Rental"));
                                                            if (var_testvariable124) {
                                                                out.write("<p class=\"sub-title mb-1\">");
                                                                {
                                                                    String var_125 = (renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "reviewedLabel"), "text")) + " ");
                                                                    out.write(renderContext.getObjectModel().toString(var_125));
                                                                }
                                                                out.write("<span class=\"\">");
                                                                {
                                                                    String var_126 = ("\r\n                                                    " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(key, "bikeDisplayName"), "text")));
                                                                    out.write(renderContext.getObjectModel().toString(var_126));
                                                                }
                                                                out.write("</span></p>");
                                                            }
                                                        }
                                                        out.write("\r\n                                            ");
                                                        {
                                                            boolean var_testvariable127 = (org.apache.sling.scripting.sightly.compiler.expression.nodes.BinaryOperator.strictEq(renderContext.getObjectModel().resolveProperty(_global_model, "wanderlustCategories"), "Tour"));
                                                            if (var_testvariable127) {
                                                                out.write("<p class=\"sub-title mb-1\">");
                                                                {
                                                                    String var_128 = (renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "reviewedLabel"), "text")) + " ");
                                                                    out.write(renderContext.getObjectModel().toString(var_128));
                                                                }
                                                                out.write("<span class=\"\">");
                                                                {
                                                                    String var_129 = ("\r\n                                                    " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(key, "tourName"), "text")));
                                                                    out.write(renderContext.getObjectModel().toString(var_129));
                                                                }
                                                                out.write("</span></p>");
                                                            }
                                                        }
                                                        out.write("        \r\n                                            <span class=\"rating-star d-flex\"><img loading=\"lazy\"");
                                                        {
                                                            Object var_attrvalue130 = renderContext.getObjectModel().resolveProperty(_global_model, "starIconImage");
                                                            {
                                                                Object var_attrcontent131 = renderContext.call("xss", var_attrvalue130, "uri");
                                                                {
                                                                    boolean var_shoulddisplayattr133 = (((null != var_attrcontent131) && (!"".equals(var_attrcontent131))) && ((!"".equals(var_attrvalue130)) && (!((Object)false).equals(var_attrvalue130))));
                                                                    if (var_shoulddisplayattr133) {
                                                                        out.write(" src");
                                                                        {
                                                                            boolean var_istrueattr132 = (var_attrvalue130.equals(true));
                                                                            if (!var_istrueattr132) {
                                                                                out.write("=\"");
                                                                                out.write(renderContext.getObjectModel().toString(var_attrcontent131));
                                                                                out.write("\"");
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        out.write(" class=\"me-1\" alt=\"Rating star\"/>");
                                                        {
                                                            String var_134 = (((" " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(key, "rating"), "text"))) + "\r\n                                                ") + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "reviewedRatingLabel"), "text")));
                                                            out.write(renderContext.getObjectModel().toString(var_134));
                                                        }
                                                        out.write("</span>\r\n                                        </div>\r\n                                    </div>\r\n                                    <div class=\"user-reviews mt-4\">\r\n                                        <p class=\"reviewDescription text-start\">");
                                                        {
                                                            Object var_135 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(key, "description"), "text");
                                                            out.write(renderContext.getObjectModel().toString(var_135));
                                                        }
                                                        out.write("</p>\r\n                                    </div>\r\n                                </div>\r\n                            </div>\n");
                                                    }
                                                }
                                                var_index110++;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    var_collectionvar103_list_coerced$ = null;
                }
                out.write("\r\n                        </div>\r\n                    </div>");
            }
        }
        out.write("\r\n                </div>\r\n            </div>\r\n        </div>\r\n    </div>");
    }
}
out.write("\r\n    </div>\r\n\r\n");
{
    Object var_templatevar136 = renderContext.getObjectModel().resolveProperty(_global_templates, "placeholder");
    {
        boolean var_templateoptions137_field$_isempty = (!renderContext.getObjectModel().toBoolean(_global_reviewedratinglabel));
        {
            java.util.Map var_templateoptions137 = obj().with("isEmpty", var_templateoptions137_field$_isempty);
            callUnit(out, renderContext, var_templatevar136, var_templateoptions137);
        }
    }
}
out.write("\r\n\r\n");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

