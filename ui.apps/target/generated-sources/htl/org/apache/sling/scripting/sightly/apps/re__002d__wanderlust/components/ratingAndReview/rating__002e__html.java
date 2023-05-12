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
package org.apache.sling.scripting.sightly.apps.re__002d__wanderlust.components.ratingAndReview;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class rating__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _dynamic_ratings = getProperty("ratings");
out.write("<div class=\"rating\">\r\n    ");
out.write("\r\n</div>");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------

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
addSubTemplate("Ratings", new RenderUnit() {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Sub-Template Body -------------------------------------------------------------------------

Object _dynamic_ratings = arguments.get("ratings");
out.write("\r\n        <div class=\"card rounded-0 border-0\">\r\n            <div class=\"card-header p-3\">");
{
    Object var_0 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_ratings, "ratingTitle"), "text");
    out.write(renderContext.getObjectModel().toString(var_0));
}
out.write("</div>\r\n            <div class=\"card-body p-3\">\r\n                <div class=\"rating-row mb-3 pb-3 border-bottom\">\r\n                    <p class=\"rating-label mb-2\">");
{
    Object var_1 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_ratings, "tripRating"), "text");
    out.write(renderContext.getObjectModel().toString(var_1));
}
out.write("</p>\r\n                    <select id=\"user-combostar\">\r\n                        <option value=\"1\">1</option>\r\n                        <option value=\"2\">2</option>\r\n                        <option value=\"3\">3</option>\r\n                        <option value=\"4\">4</option>\r\n                        <option value=\"5\">5</option>\r\n                    </select>\r\n                    <p id=\"paraTrip\">\r\n                        Current rating: <span id=\"user-starcount\" style=\"display: none;\">0</span> stars\r\n                    </p>\r\n                </div>\r\n                <div class=\"rating-row\">\r\n                    <p class=\"rating-label mb-2\">");
{
    Object var_2 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_ratings, "bikeRating"), "text");
    out.write(renderContext.getObjectModel().toString(var_2));
}
out.write("</p>\r\n                    <select id=\"booking-combostar\">\r\n                        <option value=\"1\">1</option>\r\n                        <option value=\"2\">2</option>\r\n                        <option value=\"3\">3</option>\r\n                        <option value=\"4\">4</option>\r\n                        <option value=\"5\">5</option>\r\n                    </select>\r\n                    <p id=\"paraBike\"> \r\n                        Current rating: <span id=\"booking-starcount\" style=\"display: none;\">0</span> stars\r\n                    </p>\r\n                </div>\r\n                <div class=\"row flex-column mt-5\">\r\n                    <div class=\"col-12 col-md-8 col-lg-7 col-xl-5 justify-content-center mx-auto\">\r\n                        <div class=\"button button__primary-v2\">\r\n                            <button class=\"cmp-button position-relative rounded-0\" id=\"submitRating\">\r\n                                <span class=\"cmp-text\">");
{
    Object var_3 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_ratings, "submitRating"), "text");
    out.write(renderContext.getObjectModel().toString(var_3));
}
out.write("</span>\r\n                                <span class=\"cmp-icon cmp-icon-after icon-arrow-r position-absolute top-0 end-0 bottom-0 text-white bg-primary d-flex flex-wrap align-items-center justify-content-center\"></span>\r\n                            </button>\r\n                        </div>\r\n                    </div>\r\n                    <div class=\"col-12 col-md-8 col-lg-7 col-xl-5 justify-content-center mx-auto mt-3\">\r\n                        <div class=\"button button__white\">\r\n                            <button class=\"cmp-button laterButton\" data-bs-dismiss=\"modal\">\r\n                                <span class=\"cmp-text\">");
{
    Object var_4 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_ratings, "laterBtn"), "text");
    out.write(renderContext.getObjectModel().toString(var_4));
}
out.write("</span>\r\n                            </button>\r\n                        </div>\r\n                    </div>\r\n                </div>\r\n            </div>\r\n        </div>\r\n    ");


// End Of Main Sub-Template Body ------------------------------------------------------------------
    }



    {
//Sub-Sub-Templates Initialization ----------------------------------------------------------------



//End of Sub-Sub-Templates Initialization ---------------------------------------------------------
    }
    
});


//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

