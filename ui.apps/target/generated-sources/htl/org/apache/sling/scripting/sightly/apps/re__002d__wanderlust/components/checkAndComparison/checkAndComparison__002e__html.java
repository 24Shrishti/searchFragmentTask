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
package org.apache.sling.scripting.sightly.apps.re__002d__wanderlust.components.checkAndComparison;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class checkAndComparison__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _global_model = null;
_global_model = renderContext.call("use", com.re.wanderlust.core.models.CheckAndComparisonModel.class.getName(), obj());
out.write("\r\n  <div class=\"rew_checkAndComparson\" id=\"author-data\">\r\n<div class=\"container\">\r\n       \r\n  <div class=\"row align-items-start \">\r\n\r\n    <div class=\"col\">      \r\n    <div class=\"col-3 border border-secondary\"><p>");
{
    Object var_0 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "startingFromLabel"), "text");
    out.write(renderContext.getObjectModel().toString(var_0));
}
out.write("</p></div>\r\n    <div class=\"col-3 border border-secondary\"><p>");
{
    Object var_1 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "bringYourOwnRideLabel"), "text");
    out.write(renderContext.getObjectModel().toString(var_1));
}
out.write("</p></div>\r\n    <div class=\"col-3 border border-secondary\"><p>");
{
    Object var_2 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "tourLeadExperienceAndRatingLabel"), "text");
    out.write(renderContext.getObjectModel().toString(var_2));
}
out.write("</p></div>\r\n    <div class=\"col-3 border border-secondary\"><p>");
{
    Object var_3 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "accommodationType"), "text");
    out.write(renderContext.getObjectModel().toString(var_3));
}
out.write("</p></div>\r\n    <div class=\"col-3 border border-secondary\"><p>");
{
    Object var_4 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "backupVehicleLabel"), "text");
    out.write(renderContext.getObjectModel().toString(var_4));
}
out.write("</p></div>\r\n    <div class=\"col-3 border border-secondary\"><p>");
{
    Object var_5 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "defaultRideLabel"), "text");
    out.write(renderContext.getObjectModel().toString(var_5));
}
out.write("</p></div>\r\n    <div class=\"col-3 border border-secondary\"><p>");
{
    Object var_6 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "rideLevelLabel"), "text");
    out.write(renderContext.getObjectModel().toString(var_6));
}
out.write("</p></div>\r\n    <div class=\"col-3 border border-secondary\"><p>");
{
    Object var_7 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "distancePerDayLabel"), "text");
    out.write(renderContext.getObjectModel().toString(var_7));
}
out.write("</p></div>\r\n    \r\n  </div>\r\n  <div class=\"col valuefromJson\"></div>\r\n  \r\n\r\n</div>\r\n        \r\n          \r\n\r\n          </div>\r\n\r\n             <div class=\"d-flex justify-content-around\">\r\n                <div><button type=\"button\" class=\"btn btn-primary\" data-toggle=\"button\" aria-pressed=\"false\" autocomplete=\"off\">\r\n                     VIEW DETAIL\r\n                   </button>\r\n                </div>\r\n                <div><button type=\"button\" class=\"btn btn-primary\" data-toggle=\"button\" aria-pressed=\"false\" autocomplete=\"off\">\r\n                      VIEW DETAIL\r\n                  </button>\r\n                </div>\r\n                <div><button type=\"button\" class=\"btn btn-primary\" data-toggle=\"button\" aria-pressed=\"false\" autocomplete=\"off\">\r\n                      VIEW DETAIL\r\n                  </button>\r\n                </div>\r\n            </div>\r\n    </div>\r\n  </div>\r\n    \r\n\r\n\r\n\r\n  <script id=\"comparision-template\" type=\"text/x-handlebars-template\">\r\n{{#each data}}\r\n    <div class=\"col\">\r\n          \r\n      <div class=\"col-3 border border-secondary\"><p>{{trip_start_date}} </p></div>\r\n      <div class=\"col-3 border border-secondary\"><p>bringYourOwnRideLabel</p></div>\r\n      <div class=\"col-3 border border-secondary\"><p>{{lead_exp}} and {{lead_rating}}</p></div>\r\n      <div class=\"col-3 border border-secondary\"><p> {{accommodation_type}}</p></div>\r\n      <div class=\"col-3 border border-secondary\"><p>{{trip_include_backup_vehical}}</p></div>\r\n      <div class=\"col-3 border border-secondary\"><p>{{default_motorcycle_model}}</p></div>\r\n      <div class=\"col-3 border border-secondary\"><p>{{ride_level}}</p></div>\r\n      <div class=\"col-3 border border-secondary\"><p>{{distance_per_day}}</p></div>\r\n  \r\n  </div>\r\n  {{/each}}\r\n  </script>");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

