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
package org.apache.sling.scripting.sightly.apps.re__002d__wanderlust.components.secondaryHeader;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class secondaryHeader__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _global_model = null;
_global_model = renderContext.call("use", com.re.wanderlust.core.models.SecondaryHeaderModel.class.getName(), obj());
out.write("\r\n    <div class=\"secondary-header-comp\">\r\n        <div class=\"secondary-header-comp__wrap\">\r\n            <div class=\"position-relative bg-dark\">\r\n                <div class=\"secondary-header-bar position-relative\">\r\n                    ");
{
    boolean var_testvariable0 = (org.apache.sling.scripting.sightly.compiler.expression.nodes.BinaryOperator.strictEq(renderContext.getObjectModel().resolveProperty(_global_model, "wanderlustCategories"), "tour"));
    if (var_testvariable0) {
        out.write("<img");
        {
            Object var_attrvalue1 = renderContext.getObjectModel().resolveProperty(_global_model, "imgLogo");
            {
                Object var_attrcontent2 = renderContext.call("xss", var_attrvalue1, "uri");
                {
                    boolean var_shoulddisplayattr4 = (((null != var_attrcontent2) && (!"".equals(var_attrcontent2))) && ((!"".equals(var_attrvalue1)) && (!((Object)false).equals(var_attrvalue1))));
                    if (var_shoulddisplayattr4) {
                        out.write(" src");
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
        out.write("/>");
    }
}
out.write("\r\n                    <div class=\"secondary-header-comp__title text-white py-3\">");
{
    Object var_resourcecontent5 = renderContext.call("includeResource", "./secondaryHeaderTitle", obj().with("resourceType", "re-wanderlust/components/title"));
    out.write(renderContext.getObjectModel().toString(var_resourcecontent5));
}
out.write("</div>\r\n                    ");
{
    Object var_resourcecontent6 = renderContext.call("includeResource", "./secondaryHeaderCartModal", obj().with("resourceType", "re-wanderlust/components/cartModal"));
    out.write(renderContext.getObjectModel().toString(var_resourcecontent6));
}
out.write("\r\n                    ");
{
    boolean var_testvariable7 = (org.apache.sling.scripting.sightly.compiler.expression.nodes.BinaryOperator.strictEq(renderContext.getObjectModel().resolveProperty(_global_model, "wanderlustCategories"), "tour"));
    if (var_testvariable7) {
        {
            Object var_resourcecontent8 = renderContext.call("includeResource", "./secondaryHeaderCompareButton", obj().with("resourceType", "re-wanderlust/components/compareButton"));
            out.write(renderContext.getObjectModel().toString(var_resourcecontent8));
        }
    }
}
out.write("\r\n                </div>\r\n                <div class=\"secondary-header-comp__breadcrumb bg-dark\" aria-label=\"breadcrumb\">");
{
    Object var_resourcecontent9 = renderContext.call("includeResource", "./secondaryHeaderBreadcrum", obj().with("resourceType", "re-wanderlust/components/breadcrumb"));
    out.write(renderContext.getObjectModel().toString(var_resourcecontent9));
}
out.write("</div>\r\n            </div>\r\n        </div>\r\n    </div>\r\n");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

