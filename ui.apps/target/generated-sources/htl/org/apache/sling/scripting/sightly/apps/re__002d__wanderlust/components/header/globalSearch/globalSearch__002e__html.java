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
package org.apache.sling.scripting.sightly.apps.re__002d__wanderlust.components.header.globalSearch;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class globalSearch__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _dynamic_properties = bindings.get("properties");
out.write("<!-- Header Search Component -->\r\n<div class=\"header-search-comp d-flex align-items-center\">\r\n    <a class=\"border-0 rounded-0 bg-transparent d-flex flex-wrap align-items-center\" id=\"toggleSearchModalOverlayBtn\"");
{
    Object var_attrvalue0 = renderContext.call("xss", renderContext.call("uriManipulation", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "searchCTA"), obj().with("extension", "html")), "uri");
    {
        boolean var_shoulddisplayattr3 = ((!"".equals(var_attrvalue0)) && (!((Object)false).equals(var_attrvalue0)));
        if (var_shoulddisplayattr3) {
            out.write(" href");
            {
                boolean var_istrueattr2 = (var_attrvalue0.equals(true));
                if (!var_istrueattr2) {
                    out.write("=\"");
                    out.write(renderContext.getObjectModel().toString(var_attrvalue0));
                    out.write("\"");
                }
            }
        }
    }
}
out.write(" title=\"Global Search\">\r\n        <span class=\"cmp-icon icon-search d-block\"></span>\r\n    </a>\r\n</div>\r\n<!-- End Header Search Component -->");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

