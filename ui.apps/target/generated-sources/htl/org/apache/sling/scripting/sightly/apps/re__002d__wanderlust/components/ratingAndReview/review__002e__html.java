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

public final class review__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _dynamic_reviews = getProperty("reviews");
out.write("<div class=\"review\">\r\n\t");
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
addSubTemplate("Reviews", new RenderUnit() {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Sub-Template Body -------------------------------------------------------------------------

Object _dynamic_reviews = arguments.get("reviews");
out.write("\r\n        <div class=\"card rounded-0 border-0\">\r\n            <div class=\"card-header p-3\">");
{
    Object var_0 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_reviews, "reviewTitle"), "text");
    out.write(renderContext.getObjectModel().toString(var_0));
}
out.write("</div>\r\n            <div class=\"card-body p-3\">\r\n                <textarea name=\"review\" id=\"review\" class=\"form-control text-white border bg-transparent w-100 rounded-0 review-input reviewBox\"");
{
    Object var_attrvalue1 = renderContext.getObjectModel().resolveProperty(_dynamic_reviews, "preText");
    {
        Object var_attrcontent2 = renderContext.call("xss", var_attrvalue1, "attribute");
        {
            boolean var_shoulddisplayattr4 = (((null != var_attrcontent2) && (!"".equals(var_attrcontent2))) && ((!"".equals(var_attrvalue1)) && (!((Object)false).equals(var_attrvalue1))));
            if (var_shoulddisplayattr4) {
                out.write(" placeholder");
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
out.write(" rows=\"5\"></textarea>\r\n                <small class=\"error error-text-reviewLimit\">\r\n                    <p class=\"mt-1\">");
{
    Object var_5 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_reviews, "errForLimit"), "text");
    out.write(renderContext.getObjectModel().toString(var_5));
}
out.write("</p>\r\n                </small>\r\n                <small class=\"error error-text-notFill\">\r\n                    <p class=\"mt-1\">");
{
    Object var_6 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_reviews, "errForUnfillBox"), "text");
    out.write(renderContext.getObjectModel().toString(var_6));
}
out.write("</p>\r\n                </small>\r\n                <div class=\"row flex-column mt-5\">\r\n                    <div class=\"col-12 col-md-8 col-lg-7 col-xl-5 justify-content-center mx-auto\">\r\n                        <div class=\"button button__primary-v2\">\r\n                            <button class=\"cmp-button position-relative rounded-0\" id=\"submitReviewBtn\">\r\n                                <span class=\"cmp-text\">");
{
    Object var_7 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_reviews, "submitReviewText"), "text");
    out.write(renderContext.getObjectModel().toString(var_7));
}
out.write("</span>\r\n                                <span class=\"cmp-icon cmp-icon-after icon-arrow-r position-absolute top-0 end-0 bottom-0 text-white bg-primary d-flex flex-wrap align-items-center justify-content-center\"></span>\r\n                            </button>\r\n                        </div>\r\n                    </div>\r\n                    <div class=\"col-12 col-md-8 col-lg-7 col-xl-5 justify-content-center mx-auto mt-3\">\r\n                        <div class=\"button button__white\">\r\n                            <button class=\"cmp-button laterButton\" data-bs-dismiss=\"modal\">\r\n                                <span class=\"cmp-text\">");
{
    Object var_8 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_reviews, "laterBtn"), "text");
    out.write(renderContext.getObjectModel().toString(var_8));
}
out.write("</span>\r\n                            </button>\r\n                        </div>\r\n                    </div>\r\n                </div>\r\n                \r\n                <!-- Modal-->\r\n                \r\n                <div id=\"data_attribute\"");
{
    Object var_attrvalue9 = renderContext.getObjectModel().resolveProperty(_dynamic_reviews, "limit");
    {
        Object var_attrcontent10 = renderContext.call("xss", var_attrvalue9, "attribute");
        {
            boolean var_shoulddisplayattr12 = (((null != var_attrcontent10) && (!"".equals(var_attrcontent10))) && ((!"".equals(var_attrvalue9)) && (!((Object)false).equals(var_attrvalue9))));
            if (var_shoulddisplayattr12) {
                out.write(" data-limit");
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
    String var_attrcontent13 = (renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_reviews, "submitBtnUrl"), "attribute")) + ".html");
    out.write(" data-submit_Btn_Url=\"");
    out.write(renderContext.getObjectModel().toString(var_attrcontent13));
    out.write("\"");
}
out.write("></div>\r\n            </div>\r\n        </div>\r\n\t\t<div class=\"modal modal__modalWrapperBody review-comp-feedbackThanksModal p4 dataResponse\" id=\"Modal-1\">\r\n\t\t\t<div class=\"modal-dialog modal-dialog-centered\">\r\n\t\t\t\t<div class=\"modal-content bg-dark rounded-0\">\r\n\t\t\t\t\t<!-- Modal body -->\r\n\t\t\t\t\t<div class=\"modal-body\">\r\n\t\t\t\t\t\t<h2 class=\"pb-3\">");
{
    Object var_14 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_reviews, "thankyouPopMsg"), "text");
    out.write(renderContext.getObjectModel().toString(var_14));
}
out.write("</h2>\r\n\t\t\t\t\t\t<div class=\"col-12 d-flex justify-content-center close-cancellation-modal mx-auto\">\r\n\t\t\t\t\t\t\t<div class=\"input-group button button__primary-v2 closeBtn\">\r\n\t\t\t\t\t\t\t\t<button class=\"cmp-button rounded-0 border-0\">\r\n\t\t\t\t\t\t\t\t<span class=\"cmp-icon cmp-icon-before button_close\" data-bs-dismiss=\"modal\">");
{
    Object var_15 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_reviews, "closeBtn"), "text");
    out.write(renderContext.getObjectModel().toString(var_15));
}
out.write("</span>\r\n\t\t\t\t\t\t\t\t<span class=\"cmp-icon cmp-icon-after icon-arrow-r position-absolute top-0 end-0 bottom-0 text-white bg-primary d-flex flex-wrap align-items-center justify-content-center\"></span>\r\n\t\t\t\t\t\t\t\t</button>\r\n\t\t\t\t\t\t\t</div>\r\n\t\t\t\t\t\t</div>\r\n\t\t\t\t\t</div>\r\n\t\t\t\t</div>\r\n\t\t\t</div>\r\n\t\t\t<!-- <div class=\"modal-backdrop fade show\"></div> -->\r\n\t\t</div>\r\n\t");


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

