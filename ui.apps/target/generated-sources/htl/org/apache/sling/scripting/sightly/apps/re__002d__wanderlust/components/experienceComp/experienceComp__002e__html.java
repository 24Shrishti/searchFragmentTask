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
package org.apache.sling.scripting.sightly.apps.re__002d__wanderlust.components.experienceComp;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class experienceComp__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _global_model = null;
_global_model = renderContext.call("use", com.re.wanderlust.core.models.ExperiencesModel.class.getName(), obj());
out.write("\r\n    ");
{
    boolean var_testvariable0 = (!renderContext.getObjectModel().toBoolean(renderContext.getObjectModel().resolveProperty(_global_model, "hideComponent")));
    if (var_testvariable0) {
        out.write("<div class=\"experience-comp-wrapper container-fluid px-0 bg-dark dataAttribute-RideCarousel\">\r\n\r\n        <div class=\"exp-banner-wrap position-relative attributes\"");
        {
            Object var_attrvalue1 = renderContext.getObjectModel().resolveProperty(_global_model, "selectMedia");
            {
                Object var_attrcontent2 = renderContext.call("xss", var_attrvalue1, "attribute");
                {
                    boolean var_shoulddisplayattr4 = (((null != var_attrcontent2) && (!"".equals(var_attrcontent2))) && ((!"".equals(var_attrvalue1)) && (!((Object)false).equals(var_attrvalue1))));
                    if (var_shoulddisplayattr4) {
                        out.write(" data-selectMedia");
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
        out.write(">\r\n\r\n            ");
        {
            boolean var_testvariable5 = (org.apache.sling.scripting.sightly.compiler.expression.nodes.BinaryOperator.strictEq(renderContext.getObjectModel().resolveProperty(_global_model, "selectMedia"), "image"));
            if (var_testvariable5) {
                out.write("<picture>\r\n                <!-- Mobile Image -->\r\n                <source media=\"(max-width:767px)\"");
                {
                    Object var_attrvalue6 = renderContext.getObjectModel().resolveProperty(_global_model, "mobileImage");
                    {
                        Object var_attrcontent7 = renderContext.call("xss", var_attrvalue6, "attribute");
                        {
                            boolean var_shoulddisplayattr9 = (((null != var_attrcontent7) && (!"".equals(var_attrcontent7))) && ((!"".equals(var_attrvalue6)) && (!((Object)false).equals(var_attrvalue6))));
                            if (var_shoulddisplayattr9) {
                                out.write(" srcset");
                                {
                                    boolean var_istrueattr8 = (var_attrvalue6.equals(true));
                                    if (!var_istrueattr8) {
                                        out.write("=\"");
                                        out.write(renderContext.getObjectModel().toString(var_attrcontent7));
                                        out.write("\"");
                                    }
                                }
                            }
                        }
                    }
                }
                out.write("/>\r\n                <!-- Desktop Image -->\r\n                <img");
                {
                    Object var_attrvalue10 = renderContext.getObjectModel().resolveProperty(_global_model, "desktopImage");
                    {
                        Object var_attrcontent11 = renderContext.call("xss", var_attrvalue10, "uri");
                        {
                            boolean var_shoulddisplayattr13 = (((null != var_attrcontent11) && (!"".equals(var_attrcontent11))) && ((!"".equals(var_attrvalue10)) && (!((Object)false).equals(var_attrvalue10))));
                            if (var_shoulddisplayattr13) {
                                out.write(" src");
                                {
                                    boolean var_istrueattr12 = (var_attrvalue10.equals(true));
                                    if (!var_istrueattr12) {
                                        out.write("=\"");
                                        out.write(renderContext.getObjectModel().toString(var_attrcontent11));
                                        out.write("\"");
                                    }
                                }
                            }
                        }
                    }
                }
                out.write(" class=\"d-block\"");
                {
                    Object var_attrvalue14 = renderContext.getObjectModel().resolveProperty(_global_model, "altText");
                    {
                        Object var_attrcontent15 = renderContext.call("xss", var_attrvalue14, "attribute");
                        {
                            boolean var_shoulddisplayattr17 = (((null != var_attrcontent15) && (!"".equals(var_attrcontent15))) && ((!"".equals(var_attrvalue14)) && (!((Object)false).equals(var_attrvalue14))));
                            if (var_shoulddisplayattr17) {
                                out.write(" alt");
                                {
                                    boolean var_istrueattr16 = (var_attrvalue14.equals(true));
                                    if (!var_istrueattr16) {
                                        out.write("=\"");
                                        out.write(renderContext.getObjectModel().toString(var_attrcontent15));
                                        out.write("\"");
                                    }
                                }
                            }
                        }
                    }
                }
                out.write("/>\r\n            </picture>");
            }
        }
        out.write("\r\n\r\n            ");
        {
            boolean var_testvariable18 = (org.apache.sling.scripting.sightly.compiler.expression.nodes.BinaryOperator.strictEq(renderContext.getObjectModel().resolveProperty(_global_model, "selectMedia"), "damVideo"));
            if (var_testvariable18) {
                out.write("<div class=\"video-source\">\r\n                <div class=\"video-box position-relative\">\r\n                    <!-- Desktop Video -->\r\n                    <video class=\"vid video-desktop\"");
                {
                    Object var_attrvalue19 = renderContext.getObjectModel().resolveProperty(_global_model, "enableAutoplay");
                    {
                        Object var_attrcontent20 = renderContext.call("xss", var_attrvalue19, "attribute");
                        {
                            boolean var_shoulddisplayattr22 = (((null != var_attrcontent20) && (!"".equals(var_attrcontent20))) && ((!"".equals(var_attrvalue19)) && (!((Object)false).equals(var_attrvalue19))));
                            if (var_shoulddisplayattr22) {
                                out.write(" data-autoplay");
                                {
                                    boolean var_istrueattr21 = (var_attrvalue19.equals(true));
                                    if (!var_istrueattr21) {
                                        out.write("=\"");
                                        out.write(renderContext.getObjectModel().toString(var_attrcontent20));
                                        out.write("\"");
                                    }
                                }
                            }
                        }
                    }
                }
                out.write(" loop=\"true\"");
                {
                    Object var_attrvalue23 = renderContext.getObjectModel().resolveProperty(_global_model, "enableMute");
                    {
                        Object var_attrcontent24 = renderContext.call("xss", var_attrvalue23, "attribute");
                        {
                            boolean var_shoulddisplayattr26 = (((null != var_attrcontent24) && (!"".equals(var_attrcontent24))) && ((!"".equals(var_attrvalue23)) && (!((Object)false).equals(var_attrvalue23))));
                            if (var_shoulddisplayattr26) {
                                out.write(" muted");
                                {
                                    boolean var_istrueattr25 = (var_attrvalue23.equals(true));
                                    if (!var_istrueattr25) {
                                        out.write("=\"");
                                        out.write(renderContext.getObjectModel().toString(var_attrcontent24));
                                        out.write("\"");
                                    }
                                }
                            }
                        }
                    }
                }
                out.write(" playsinline=\"\"");
                {
                    Object var_attrvalue27 = renderContext.getObjectModel().resolveProperty(_global_model, "damDesktopVideoPath");
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
                {
                    Object var_attrvalue31 = renderContext.getObjectModel().resolveProperty(_global_model, "damDesktopVideoThumbnail");
                    {
                        Object var_attrcontent32 = renderContext.call("xss", var_attrvalue31, "uri");
                        {
                            boolean var_shoulddisplayattr34 = (((null != var_attrcontent32) && (!"".equals(var_attrcontent32))) && ((!"".equals(var_attrvalue31)) && (!((Object)false).equals(var_attrvalue31))));
                            if (var_shoulddisplayattr34) {
                                out.write(" poster");
                                {
                                    boolean var_istrueattr33 = (var_attrvalue31.equals(true));
                                    if (!var_istrueattr33) {
                                        out.write("=\"");
                                        out.write(renderContext.getObjectModel().toString(var_attrcontent32));
                                        out.write("\"");
                                    }
                                }
                            }
                        }
                    }
                }
                out.write(">\r\n\r\n                    </video>\r\n                    ");
                {
                    String var_35 = (((((((("<!-- Mobile Video\r\n                    <video class=\"vid video-mobile d-md-none\" data-autoplay=\"" + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "enableAutoplay"), "comment"))) + "\" loop=\"true\"\r\n                        muted=\"") + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "enableMute"), "comment"))) + "\" playsinline=\"\" src=\"") + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "damMobileVideoPath"), "comment"))) + "\"\r\n                        poster=\"") + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "damMobileVideoThumbnail"), "comment"))) + "\">\r\n\r\n                    </video> -->");
                    out.write(renderContext.getObjectModel().toString(var_35));
                }
                out.write("\r\n\r\n                    <div class=\"video-play-overlay\">\r\n                        <a class=\"video-play-btn\"><span class=\"icon-play\"></span><span class=\"icon-pause\"></span></a>\r\n                    </div>\r\n                    <a class=\"video-mute\"><span class=\"icon-muted\"></span><span class=\"icon-unmute\"></span></a>\r\n                </div>\r\n            </div>");
            }
        }
        out.write("\r\n\r\n            ");
        {
            boolean var_testvariable36 = (org.apache.sling.scripting.sightly.compiler.expression.nodes.BinaryOperator.strictEq(renderContext.getObjectModel().resolveProperty(_global_model, "selectMedia"), "youTubeVideo"));
            if (var_testvariable36) {
                out.write("<div class=\"youtube-video\">\r\n                <iframe title=\"You-Tube Video\" height=\"480\" width=\"100%\"");
                {
                    Object var_attrvalue37 = renderContext.getObjectModel().resolveProperty(_global_model, "youtubeVideoLink");
                    {
                        Object var_attrcontent38 = renderContext.call("xss", var_attrvalue37, "uri");
                        {
                            boolean var_shoulddisplayattr40 = (((null != var_attrcontent38) && (!"".equals(var_attrcontent38))) && ((!"".equals(var_attrvalue37)) && (!((Object)false).equals(var_attrvalue37))));
                            if (var_shoulddisplayattr40) {
                                out.write(" src");
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
                out.write(" allow=\"accelerometer; clipboard-write; encrypted-media; gyroscope; picture-in-picture\">\r\n                </iframe>\r\n            </div>");
            }
        }
        out.write("\r\n\r\n            <div");
        {
            String var_attrcontent41 = ("exp-banner-cont position-absolute p-3 p-md-4 p-lg-5 " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "buttonLocation"), "attribute")));
            out.write(" class=\"");
            out.write(renderContext.getObjectModel().toString(var_attrcontent41));
            out.write("\"");
        }
        out.write(">\r\n                <h2 class=\"banner-head\">");
        {
            String var_42 = (("\r\n                    " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "title"), "text"))) + "\r\n                ");
            out.write(renderContext.getObjectModel().toString(var_42));
        }
        out.write("</h2>\r\n                <div class=\"exp-banner-txt my-3\">\r\n                    <p>");
        {
            String var_43 = (("\r\n                        " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "description"), "text"))) + "\r\n                    ");
            out.write(renderContext.getObjectModel().toString(var_43));
        }
        out.write("</p>\r\n                </div>\r\n                ");
        {
            boolean var_testvariable44 = (org.apache.sling.scripting.sightly.compiler.expression.nodes.BinaryOperator.strictEq(renderContext.getObjectModel().resolveProperty(_global_model, "checkBox"), "false"));
            if (var_testvariable44) {
                out.write("<div");
                {
                    String var_attrcontent45 = ("banner-btns " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "experienceFloatingButton"), "attribute")));
                    out.write(" class=\"");
                    out.write(renderContext.getObjectModel().toString(var_attrcontent45));
                    out.write("\"");
                }
                out.write(">\r\n                    <a");
                {
                    Object var_attrvalue46 = renderContext.call("xss", renderContext.call("uriManipulation", renderContext.getObjectModel().resolveProperty(_global_model, "exploreButtonLink"), obj().with("extension", "html")), "uri");
                    {
                        boolean var_shoulddisplayattr49 = ((!"".equals(var_attrvalue46)) && (!((Object)false).equals(var_attrvalue46)));
                        if (var_shoulddisplayattr49) {
                            out.write(" href");
                            {
                                boolean var_istrueattr48 = (var_attrvalue46.equals(true));
                                if (!var_istrueattr48) {
                                    out.write("=\"");
                                    out.write(renderContext.getObjectModel().toString(var_attrvalue46));
                                    out.write("\"");
                                }
                            }
                        }
                    }
                }
                out.write(" class=\"cmp-button experienceExplore_btn-ga\">");
                {
                    Object var_50 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "exploreButtonLabel"), "text");
                    out.write(renderContext.getObjectModel().toString(var_50));
                }
                out.write("</a>\r\n                    ");
                {
                    String var_51 = (((((("<!-- <button class=\"cmp-button videoPopupBtn\"\r\n                        data-sly-test=\"" + renderContext.getObjectModel().toString(renderContext.call("xss", ((org.apache.sling.scripting.sightly.compiler.expression.nodes.BinaryOperator.strictEq(renderContext.getObjectModel().resolveProperty(_global_model, "selectMedia"), "damVideo")) || (org.apache.sling.scripting.sightly.compiler.expression.nodes.BinaryOperator.strictEq(renderContext.getObjectModel().resolveProperty(_global_model, "selectMedia"), "youTubeVideo"))), "comment"))) + "\"\r\n                        data-bs-toggle=\"modal\" data-bs-target=\"#bannerYoutubeModal\"\r\n                        data-src=\"") + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "youtubeVideoLink"), "comment"))) + "\">") + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "youtubeButtonLabel"), "comment"))) + "</button> -->");
                    out.write(renderContext.getObjectModel().toString(var_51));
                }
                out.write("\r\n                </div>");
            }
        }
        out.write("\r\n            </div>\r\n        </div>\r\n    </div>");
    }
}
out.write("\r\n\r\n    <!-- Modal -->\r\n    <div class=\"modal fade popup-video-wrapper popup-youtube-play\" id=\"bannerYoutubeModal\" tabindex=\"-1\" aria-labelledby=\"bannerYoutubeModalLabel\" aria-hidden=\"true\">\r\n        <div class=\"modal-dialog modal-dialog-centered\">\r\n            <div class=\"modal-content\">\r\n                <div class=\"modal-body\">\r\n                    <button type=\"button\" class=\"close\" data-bs-dismiss=\"modal\">\r\n                        <span class=\"icon-close\"></span>\r\n                    </button>\r\n                    <div class=\"video-place-holder\">\r\n                        <iframe id=\"youtubeBnIframe\" src=\"\" frameborder=\"0\" allow=\"autoplay; encrypted-media\" allowfullscreen></iframe>\r\n                    </div>\r\n                </div>\r\n            </div>\r\n        </div>\r\n    </div>\r\n\r\n    <!-- Modal -->\r\n    <div class=\"modal fade popup-video-wrapper \" id=\"bannerDamModal\" tabindex=\"-1\" aria-labelledby=\"bannerDamModalLabel\" aria-hidden=\"true\">\r\n        <div class=\"modal-dialog modal-dialog-centered\">\r\n            <div class=\"modal-content\">\r\n                <div class=\"modal-body\">\r\n                    <button type=\"button\" class=\"close\" data-bs-dismiss=\"modal\">\r\n                        <span class=\"icon-close\"></span>\r\n                    </button>\r\n                    <div class=\"video-place-holder\">\r\n                        <video id=\"damBnIframe\" src=\"\" autoplay loop muted playsinline></video>\r\n                    </div>\r\n                </div>\r\n            </div>\r\n        </div>\r\n    </div>\r\n");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

