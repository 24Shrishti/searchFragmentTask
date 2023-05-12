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
package org.apache.sling.scripting.sightly.apps.re__002d__wanderlust.components.rentalPartnerGuide;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class rentalPartnerGuide__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _dynamic_model = bindings.get("model");
{
    boolean var_testvariable0 = (!renderContext.getObjectModel().toBoolean(renderContext.getObjectModel().resolveProperty(_dynamic_model, "hideComponent")));
    if (var_testvariable0) {
        out.write("<div class=\"rental-partner-guide-comp\">\r\n    <div class=\"container\">\r\n        <div class=\"d-flex flex-wrap justify-content-start\">\r\n            <div class=\"button button__white-link\">\r\n                ");
        {
            Object var_resourcecontent1 = renderContext.call("includeResource", "rentalPartnerGuideBackCta", obj().with("resourceType", "/apps/re-wanderlust/components/button"));
            out.write(renderContext.getObjectModel().toString(var_resourcecontent1));
        }
        out.write("\r\n            </div>\r\n        </div>\r\n        <div class=\"teaser teaser__rental-partner-guideV1\">\r\n            ");
        {
            Object var_resourcecontent2 = renderContext.call("includeResource", "rentalPartnerTeaser", obj().with("resourceType", "/apps/re-wanderlust/components/teaser"));
            out.write(renderContext.getObjectModel().toString(var_resourcecontent2));
        }
        out.write("\r\n        </div>\r\n    </div>\r\n    <div class=\"container bg-white p-4\">\r\n        <div class=\"row rental-partner-guide-comp__container-teasers-grid\">\r\n            ");
        {
            Object var_resourcecontent3 = renderContext.call("includeResource", "content", obj().with("resourceType", "wcm/foundation/components/parsys"));
            out.write(renderContext.getObjectModel().toString(var_resourcecontent3));
        }
        out.write("\r\n        </div>\r\n    </div>\r\n\r\n    <div class=\"container\">\r\n        <div class=\"row\">\r\n            <div class=\"col-12 col-md-4\">\r\n                \r\n            </div>\r\n            <div class=\"col-12 col-md-8\">\r\n\r\n            </div>\r\n        </div>\r\n    </div>\r\n</div>");
    }
}


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

