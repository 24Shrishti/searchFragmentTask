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
package org.apache.sling.scripting.sightly.apps.re__002d__wanderlust.components.cancelBookingComponent;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class reason__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _dynamic_reasons = getProperty("reasons");
out.write("\r\n");


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
addSubTemplate("Reasons", new RenderUnit() {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Sub-Template Body -------------------------------------------------------------------------

Object _dynamic_reasons = arguments.get("reasons");
Collection var_collectionvar2_list_coerced$ = null;
Object _dynamic_model = bindings.get("model");
out.write("\r\n    <div class=\"d-flex flex-wrap justify-content-center\">\r\n        <!-- Confirmation Reason Modal -->\r\n        <div class=\"col-md-6 col-lg-5\">\r\n            <div class=\"card card__confirmation-reason-modal rounded-0\">\r\n                <div class=\"card-body\">\r\n                    <h5 class=\"text-white\">");
{
    Object var_0 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_reasons, "apologyMsg"), "text");
    out.write(renderContext.getObjectModel().toString(var_0));
}
out.write("</h5>\r\n                    <h6 class=\"text-white\">");
{
    Object var_1 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_reasons, "reasonsTitle"), "text");
    out.write(renderContext.getObjectModel().toString(var_1));
}
out.write("</h6>\r\n                    ");
{
    Object var_collectionvar2 = renderContext.getObjectModel().resolveProperty(_dynamic_reasons, "reasonList");
    {
        long var_size3 = ((var_collectionvar2_list_coerced$ == null ? (var_collectionvar2_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar2)) : var_collectionvar2_list_coerced$).size());
        {
            boolean var_notempty4 = (var_size3 > 0);
            if (var_notempty4) {
                {
                    long var_end7 = var_size3;
                    {
                        boolean var_validstartstepend8 = (((0 < var_size3) && true) && (var_end7 > 0));
                        if (var_validstartstepend8) {
                            if (var_collectionvar2_list_coerced$ == null) {
                                var_collectionvar2_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar2);
                            }
                            long var_index9 = 0;
                            for (Object item : var_collectionvar2_list_coerced$) {
                                {
                                    boolean var_traversal11 = (((var_index9 >= 0) && (var_index9 <= var_end7)) && true);
                                    if (var_traversal11) {
                                        out.write("<label class=\"reason-radio-label\">\r\n                        <input type=\"radio\" class=\"form-check-input radioType\" name=\"defaultRadio\"");
                                        {
                                            Object var_attrvalue12 = item;
                                            {
                                                Object var_attrcontent13 = renderContext.call("xss", var_attrvalue12, "attribute");
                                                {
                                                    boolean var_shoulddisplayattr15 = (((null != var_attrcontent13) && (!"".equals(var_attrcontent13))) && ((!"".equals(var_attrvalue12)) && (!((Object)false).equals(var_attrvalue12))));
                                                    if (var_shoulddisplayattr15) {
                                                        out.write(" data-cancelReason");
                                                        {
                                                            boolean var_istrueattr14 = (var_attrvalue12.equals(true));
                                                            if (!var_istrueattr14) {
                                                                out.write("=\"");
                                                                out.write(renderContext.getObjectModel().toString(var_attrcontent13));
                                                                out.write("\"");
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        out.write("/>\r\n                        <span>");
                                        {
                                            Object var_16 = renderContext.call("xss", item, "text");
                                            out.write(renderContext.getObjectModel().toString(var_16));
                                        }
                                        out.write("</span>\r\n                    </label>\n");
                                    }
                                }
                                var_index9++;
                            }
                        }
                    }
                }
            }
        }
    }
    var_collectionvar2_list_coerced$ = null;
}
out.write("\r\n                    <div class=\"my-4\" id=\"other-reason\">\r\n                        <textarea rows=\"4\" class=\"form-control rounded-0\" id=\"message\"");
{
    Object var_attrvalue17 = renderContext.getObjectModel().resolveProperty(_dynamic_reasons, "placeholderText");
    {
        Object var_attrcontent18 = renderContext.call("xss", var_attrvalue17, "attribute");
        {
            boolean var_shoulddisplayattr20 = (((null != var_attrcontent18) && (!"".equals(var_attrcontent18))) && ((!"".equals(var_attrvalue17)) && (!((Object)false).equals(var_attrvalue17))));
            if (var_shoulddisplayattr20) {
                out.write(" placeholder");
                {
                    boolean var_istrueattr19 = (var_attrvalue17.equals(true));
                    if (!var_istrueattr19) {
                        out.write("=\"");
                        out.write(renderContext.getObjectModel().toString(var_attrcontent18));
                        out.write("\"");
                    }
                }
            }
        }
    }
}
{
    Object var_attrvalue21 = renderContext.getObjectModel().resolveProperty(_dynamic_reasons, "limit");
    {
        Object var_attrcontent22 = renderContext.call("xss", var_attrvalue21, "attribute");
        {
            boolean var_shoulddisplayattr24 = (((null != var_attrcontent22) && (!"".equals(var_attrcontent22))) && ((!"".equals(var_attrvalue21)) && (!((Object)false).equals(var_attrvalue21))));
            if (var_shoulddisplayattr24) {
                out.write(" maxlength");
                {
                    boolean var_istrueattr23 = (var_attrvalue21.equals(true));
                    if (!var_istrueattr23) {
                        out.write("=\"");
                        out.write(renderContext.getObjectModel().toString(var_attrcontent22));
                        out.write("\"");
                    }
                }
            }
        }
    }
}
out.write("></textarea>\r\n                        <span class=\"error-msg pt-2 invalid-reason-msg\" hidden>");
{
    Object var_25 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_reasons, "otherValidationMessage"), "text");
    out.write(renderContext.getObjectModel().toString(var_25));
}
out.write("</span>\r\n                    </div>\r\n                    <div class=\"row\">\r\n                        <div class=\"col-12 d-flex flex-wrap justify-content-end\">\r\n                            <div class=\"button button__white\">\r\n                                <button class=\"cmp-button w-auto submit\">\r\n                                    <span class=\"cmp-text submitButton\">");
{
    Object var_26 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_reasons, "submitButtonLabel"), "text");
    out.write(renderContext.getObjectModel().toString(var_26));
}
out.write("</span>\r\n                                    <span class=\"cmp-icon\"><img");
{
    Object var_attrvalue27 = renderContext.getObjectModel().resolveProperty(_dynamic_model, "forwardArrowIcon");
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
out.write("/></span>\r\n                                </button>\r\n                            </div>\r\n                        </div>\r\n                    </div>\r\n                </div>\r\n            </div>\r\n        </div>\r\n        <!-- End Confirmation Reason Modal -->\r\n    </div>\r\n");


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

