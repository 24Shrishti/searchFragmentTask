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
package org.apache.sling.scripting.sightly.apps.re__002d__wanderlust.components.cartModal;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class cartModal__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _global_model = null;
Object _global_templates = null;
Object _global_rentaltemplate = null;
Object _global_tourtemplate = null;
Object _dynamic_rideandrentaltitle = bindings.get("rideandrentaltitle");
_global_model = renderContext.call("use", com.re.wanderlust.core.models.CartModal.class.getName(), obj());
_global_templates = renderContext.call("use", "core/wcm/components/commons/v1/templates.html", obj());
out.write("\r\n\r\n    <div class=\"cartType\"");
{
    Object var_attrvalue0 = renderContext.getObjectModel().resolveProperty(_global_model, "cartType");
    {
        Object var_attrcontent1 = renderContext.call("xss", var_attrvalue0, "attribute");
        {
            boolean var_shoulddisplayattr3 = (((null != var_attrcontent1) && (!"".equals(var_attrcontent1))) && ((!"".equals(var_attrvalue0)) && (!((Object)false).equals(var_attrvalue0))));
            if (var_shoulddisplayattr3) {
                out.write(" data-carttype");
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
out.write(">\r\n        \r\n\r\n        ");
{
    boolean var_testvariable4 = (org.apache.sling.scripting.sightly.compiler.expression.nodes.BinaryOperator.strictEq(renderContext.getObjectModel().resolveProperty(_global_model, "cartType"), "Rental"));
    if (var_testvariable4) {
        out.write("<div>\r\n            ");
_global_rentaltemplate = renderContext.call("use", "rentalCartModel.html", obj());
        out.write("\r\n                ");
        {
            Object var_templatevar5 = renderContext.getObjectModel().resolveProperty(_global_rentaltemplate, "Rental");
            {
                Object var_templateoptions6_field$_rental = _global_model;
                {
                    java.util.Map var_templateoptions6 = obj().with("rental", var_templateoptions6_field$_rental);
                    callUnit(out, renderContext, var_templatevar5, var_templateoptions6);
                }
            }
        }
        out.write("\r\n            \r\n        </div>");
    }
}
out.write("\r\n\r\n        ");
{
    boolean var_testvariable7 = (org.apache.sling.scripting.sightly.compiler.expression.nodes.BinaryOperator.strictEq(renderContext.getObjectModel().resolveProperty(_global_model, "cartType"), "Tour"));
    if (var_testvariable7) {
        out.write("<div>\r\n            ");
_global_tourtemplate = renderContext.call("use", "tourCartModel.html", obj());
        out.write("\r\n                ");
        {
            Object var_templatevar8 = renderContext.getObjectModel().resolveProperty(_global_tourtemplate, "Tour");
            {
                Object var_templateoptions9_field$_tour = _global_model;
                {
                    java.util.Map var_templateoptions9 = obj().with("tour", var_templateoptions9_field$_tour);
                    callUnit(out, renderContext, var_templatevar8, var_templateoptions9);
                }
            }
        }
        out.write("\r\n            \r\n        </div>");
    }
}
out.write("\r\n\r\n    </div>\r\n\r\n\r\n");
{
    Object var_templatevar10 = renderContext.getObjectModel().resolveProperty(_global_templates, "placeholder");
    {
        boolean var_templateoptions11_field$_isempty = (!renderContext.getObjectModel().toBoolean(_dynamic_rideandrentaltitle));
        {
            java.util.Map var_templateoptions11 = obj().with("isEmpty", var_templateoptions11_field$_isempty);
            callUnit(out, renderContext, var_templatevar10, var_templateoptions11);
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

