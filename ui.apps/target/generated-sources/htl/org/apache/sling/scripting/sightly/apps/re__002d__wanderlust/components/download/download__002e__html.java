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
package org.apache.sling.scripting.sightly.apps.re__002d__wanderlust.components.download;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class download__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _global_download = null;
Object _global_component = null;
Object _global_templates = null;
Object _global_hascontent = null;
Object _dynamic_wcmmode = bindings.get("wcmmode");
Object _global_title = null;
Object _global_description = null;
out.write("\r\n");
_global_download = renderContext.call("use", com.adobe.cq.wcm.core.components.models.Download.class.getName(), obj());
_global_component = renderContext.call("use", com.adobe.cq.wcm.core.components.models.Component.class.getName(), obj());
_global_templates = renderContext.call("use", "core/wcm/components/commons/v1/templates.html", obj());
_global_hascontent = renderContext.getObjectModel().resolveProperty(_global_download, "filename");
if (renderContext.getObjectModel().toBoolean(_global_hascontent)) {
    out.write("<div");
    {
        Object var_attrvalue0 = renderContext.getObjectModel().resolveProperty(_global_component, "id");
        {
            Object var_attrcontent1 = renderContext.call("xss", var_attrvalue0, "attribute");
            {
                boolean var_shoulddisplayattr3 = (((null != var_attrcontent1) && (!"".equals(var_attrcontent1))) && ((!"".equals(var_attrvalue0)) && (!((Object)false).equals(var_attrvalue0))));
                if (var_shoulddisplayattr3) {
                    out.write(" id");
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
        String var_attrcontent4 = (("cmp-download" + renderContext.getObjectModel().toString(renderContext.call("xss", ((!renderContext.getObjectModel().toBoolean(renderContext.getObjectModel().resolveProperty(_dynamic_wcmmode, "disabled"))) ? " cq-dd-file" : ""), "attribute"))) + " rew-download");
        out.write(" class=\"");
        out.write(renderContext.getObjectModel().toString(var_attrcontent4));
        out.write("\"");
    }
    out.write(">\r\n    ");
_global_title = renderContext.getObjectModel().resolveProperty(_global_download, "title");
    if (renderContext.getObjectModel().toBoolean(_global_title)) {
        {
            Object var_tagvar5 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_download, "titleType"), "elementName");
            if (renderContext.getObjectModel().toBoolean(var_tagvar5)) {
                out.write("<");
                out.write(renderContext.getObjectModel().toString(var_tagvar5));
            }
            if (!renderContext.getObjectModel().toBoolean(var_tagvar5)) {
                out.write("<h3");
            }
            out.write(" class=\"cmp-download__title\">\r\n        ");
            {
                Object var_unwrapcondition6 = (((!renderContext.getObjectModel().toBoolean(renderContext.getObjectModel().resolveProperty(_global_download, "url"))) ? (!renderContext.getObjectModel().toBoolean(renderContext.getObjectModel().resolveProperty(_global_download, "url"))) : renderContext.getObjectModel().resolveProperty(_global_download, "hideTitleLink")));
                if (!renderContext.getObjectModel().toBoolean(var_unwrapcondition6)) {
                    out.write("<a class=\"cmp-download__title-link\"");
                    {
                        Object var_attrvalue7 = renderContext.getObjectModel().resolveProperty(_global_download, "url");
                        {
                            Object var_attrcontent8 = renderContext.call("xss", var_attrvalue7, "uri");
                            {
                                boolean var_shoulddisplayattr10 = (((null != var_attrcontent8) && (!"".equals(var_attrcontent8))) && ((!"".equals(var_attrvalue7)) && (!((Object)false).equals(var_attrvalue7))));
                                if (var_shoulddisplayattr10) {
                                    out.write(" href");
                                    {
                                        boolean var_istrueattr9 = (var_attrvalue7.equals(true));
                                        if (!var_istrueattr9) {
                                            out.write("=\"");
                                            out.write(renderContext.getObjectModel().toString(var_attrcontent8));
                                            out.write("\"");
                                        }
                                    }
                                }
                            }
                        }
                    }
                    out.write(" aria-hidden=\"true\" role=\"presentation\">");
                }
                {
                    Object var_11 = renderContext.call("xss", _global_title, "text");
                    out.write(renderContext.getObjectModel().toString(var_11));
                }
                if (!renderContext.getObjectModel().toBoolean(var_unwrapcondition6)) {
                    out.write("</a>");
                }
            }
            out.write("\r\n    ");
            if (renderContext.getObjectModel().toBoolean(var_tagvar5)) {
                out.write("</");
                out.write(renderContext.getObjectModel().toString(var_tagvar5));
                out.write(">");
            }
            if (!renderContext.getObjectModel().toBoolean(var_tagvar5)) {
                out.write("</h3>");
            }
        }
    }
    out.write("\r\n    ");
_global_description = renderContext.getObjectModel().resolveProperty(_global_download, "description");
    if (renderContext.getObjectModel().toBoolean(_global_description)) {
        out.write("<div class=\"cmp-download__description\">");
        {
            Object var_12 = renderContext.call("xss", _global_description, "html");
            out.write(renderContext.getObjectModel().toString(var_12));
        }
        out.write("</div>");
    }
    out.write("\r\n    ");
    {
        Object var_testvariable13 = ((renderContext.getObjectModel().toBoolean(((renderContext.getObjectModel().toBoolean(((renderContext.getObjectModel().toBoolean(renderContext.getObjectModel().resolveProperty(_global_download, "displayFilename")) ? renderContext.getObjectModel().resolveProperty(_global_download, "filename") : renderContext.getObjectModel().resolveProperty(_global_download, "displayFilename")))) ? ((renderContext.getObjectModel().toBoolean(renderContext.getObjectModel().resolveProperty(_global_download, "displayFilename")) ? renderContext.getObjectModel().resolveProperty(_global_download, "filename") : renderContext.getObjectModel().resolveProperty(_global_download, "displayFilename"))) : ((renderContext.getObjectModel().toBoolean(renderContext.getObjectModel().resolveProperty(_global_download, "displaySize")) ? renderContext.getObjectModel().resolveProperty(_global_download, "size") : renderContext.getObjectModel().resolveProperty(_global_download, "displaySize")))))) ? ((renderContext.getObjectModel().toBoolean(((renderContext.getObjectModel().toBoolean(renderContext.getObjectModel().resolveProperty(_global_download, "displayFilename")) ? renderContext.getObjectModel().resolveProperty(_global_download, "filename") : renderContext.getObjectModel().resolveProperty(_global_download, "displayFilename")))) ? ((renderContext.getObjectModel().toBoolean(renderContext.getObjectModel().resolveProperty(_global_download, "displayFilename")) ? renderContext.getObjectModel().resolveProperty(_global_download, "filename") : renderContext.getObjectModel().resolveProperty(_global_download, "displayFilename"))) : ((renderContext.getObjectModel().toBoolean(renderContext.getObjectModel().resolveProperty(_global_download, "displaySize")) ? renderContext.getObjectModel().resolveProperty(_global_download, "size") : renderContext.getObjectModel().resolveProperty(_global_download, "displaySize"))))) : ((renderContext.getObjectModel().toBoolean(renderContext.getObjectModel().resolveProperty(_global_download, "displayFormat")) ? renderContext.getObjectModel().resolveProperty(_global_download, "format") : renderContext.getObjectModel().resolveProperty(_global_download, "displayFormat")))));
        if (renderContext.getObjectModel().toBoolean(var_testvariable13)) {
            out.write("<dl class=\"cmp-download__properties\">\r\n        ");
            {
                Object var_testvariable14 = ((renderContext.getObjectModel().toBoolean(renderContext.getObjectModel().resolveProperty(_global_download, "displayFilename")) ? renderContext.getObjectModel().resolveProperty(_global_download, "filename") : renderContext.getObjectModel().resolveProperty(_global_download, "displayFilename")));
                if (renderContext.getObjectModel().toBoolean(var_testvariable14)) {
                    out.write("<div class=\"cmp-download__property cmp-download__property--filename\">\r\n            <dt class=\"cmp-download__property-label\">");
                    {
                        Object var_15 = renderContext.call("xss", renderContext.call("i18n", "Filename", obj().with("i18n", null)), "text");
                        out.write(renderContext.getObjectModel().toString(var_15));
                    }
                    out.write("</dt>\r\n            <dd class=\"cmp-download__property-content\">");
                    {
                        Object var_16 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_download, "filename"), "text");
                        out.write(renderContext.getObjectModel().toString(var_16));
                    }
                    out.write("</dd>\r\n        </div>");
                }
            }
            out.write("\r\n        ");
            {
                Object var_testvariable17 = ((renderContext.getObjectModel().toBoolean(renderContext.getObjectModel().resolveProperty(_global_download, "displaySize")) ? renderContext.getObjectModel().resolveProperty(_global_download, "size") : renderContext.getObjectModel().resolveProperty(_global_download, "displaySize")));
                if (renderContext.getObjectModel().toBoolean(var_testvariable17)) {
                    out.write("<div class=\"cmp-download__property cmp-download__property--size\">\r\n            <dt class=\"cmp-download__property-label\">");
                    {
                        Object var_18 = renderContext.call("xss", renderContext.call("i18n", "Size", obj().with("i18n", null)), "text");
                        out.write(renderContext.getObjectModel().toString(var_18));
                    }
                    out.write("</dt>\r\n            <dd class=\"cmp-download__property-content\">");
                    {
                        Object var_19 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_download, "size"), "text");
                        out.write(renderContext.getObjectModel().toString(var_19));
                    }
                    out.write("</dd>\r\n        </div>");
                }
            }
            out.write("\r\n        ");
            {
                Object var_testvariable20 = ((renderContext.getObjectModel().toBoolean(renderContext.getObjectModel().resolveProperty(_global_download, "displayFormat")) ? renderContext.getObjectModel().resolveProperty(_global_download, "format") : renderContext.getObjectModel().resolveProperty(_global_download, "displayFormat")));
                if (renderContext.getObjectModel().toBoolean(var_testvariable20)) {
                    out.write("<div class=\"cmp-download__property cmp-download__property--format\">\r\n            <dt class=\"cmp-download__property-label\">");
                    {
                        Object var_21 = renderContext.call("xss", renderContext.call("i18n", "Format", obj().with("i18n", null)), "text");
                        out.write(renderContext.getObjectModel().toString(var_21));
                    }
                    out.write("</dt>\r\n            <dd class=\"cmp-download__property-content\">");
                    {
                        Object var_22 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_download, "format"), "text");
                        out.write(renderContext.getObjectModel().toString(var_22));
                    }
                    out.write("</dd>\r\n        </div>");
                }
            }
            out.write("\r\n    </dl>");
        }
    }
    out.write("\r\n    ");
    {
        Object var_testvariable23 = ((renderContext.getObjectModel().toBoolean(renderContext.getObjectModel().resolveProperty(_global_download, "url")) ? renderContext.getObjectModel().resolveProperty(_global_download, "actionText") : renderContext.getObjectModel().resolveProperty(_global_download, "url")));
        if (renderContext.getObjectModel().toBoolean(var_testvariable23)) {
            out.write("<a class=\"cmp-download__action\"");
            {
                Object var_attrvalue24 = renderContext.getObjectModel().resolveProperty(_global_download, "url");
                {
                    Object var_attrcontent25 = renderContext.call("xss", var_attrvalue24, "uri");
                    {
                        boolean var_shoulddisplayattr27 = (((null != var_attrcontent25) && (!"".equals(var_attrcontent25))) && ((!"".equals(var_attrvalue24)) && (!((Object)false).equals(var_attrvalue24))));
                        if (var_shoulddisplayattr27) {
                            out.write(" href");
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
                String var_attrcontent28 = ((renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.call("i18n", "Download", obj().with("i18n", null)), "attribute")) + " ") + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_download, "filename"), "attribute")));
                out.write(" aria-label=\"");
                out.write(renderContext.getObjectModel().toString(var_attrcontent28));
                out.write("\"");
            }
            out.write(">\r\n        <span class=\"cmp-download__action-text\">");
            {
                Object var_29 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_download, "actionText"), "text");
                out.write(renderContext.getObjectModel().toString(var_29));
            }
            out.write("</span>\r\n    </a>");
        }
    }
    out.write("\r\n</div>");
}
out.write("\r\n");
{
    Object var_templatevar30 = renderContext.getObjectModel().resolveProperty(_global_templates, "placeholder");
    {
        boolean var_templateoptions31_field$_isempty = (!renderContext.getObjectModel().toBoolean(_global_hascontent));
        {
            String var_templateoptions31_field$_classappend = "cmp-download cq-dd-file";
            {
                java.util.Map var_templateoptions31 = obj().with("isEmpty", var_templateoptions31_field$_isempty).with("classAppend", var_templateoptions31_field$_classappend);
                callUnit(out, renderContext, var_templatevar30, var_templateoptions31);
            }
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

