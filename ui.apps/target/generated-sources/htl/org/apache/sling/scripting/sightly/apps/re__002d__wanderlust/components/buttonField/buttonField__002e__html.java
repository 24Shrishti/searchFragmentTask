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
package org.apache.sling.scripting.sightly.apps.re__002d__wanderlust.components.buttonField;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class buttonField__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _global_templates = null;
Object _dynamic_properties = bindings.get("properties");
Object _global_buttonfield = null;
Object _global_model = null;
out.write("\r\n");
_global_templates = renderContext.call("use", "core/wcm/components/commons/v1/templates.html", obj());
_global_buttonfield = renderContext.getObjectModel().resolveProperty(_dynamic_properties, "buttonField");
if (renderContext.getObjectModel().toBoolean(_global_buttonfield)) {
    out.write("\r\n");
_global_model = renderContext.call("use", com.re.wanderlust.core.models.ButtonField.class.getName(), obj());
    out.write("\r\n<h1>");
    {
        Object var_0 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "buttonField"), "text");
        out.write(renderContext.getObjectModel().toString(var_0));
    }
    out.write("</h1>\r\n\r\n");
    {
        Object var_templatevar1 = renderContext.getObjectModel().resolveProperty(_global_templates, "placeholder");
        {
            boolean var_templateoptions2_field$_isempty = (!renderContext.getObjectModel().toBoolean(_global_buttonfield));
            {
                java.util.Map var_templateoptions2 = obj().with("isEmpty", var_templateoptions2_field$_isempty);
                callUnit(out, renderContext, var_templatevar1, var_templateoptions2);
            }
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

