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

public final class cancelBookingComponent__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _global_model = null;
Object _global_template = null;
Object _global_cancellationtitle = null;
Object _dynamic_caconfig = bindings.get("caconfig");
Object _global_alerttemplate = null;
Object _global_reasontemplate = null;
Object _global_confirmationtemplate = null;
_global_model = renderContext.call("use", com.re.wanderlust.core.models.CancelBookingModel.class.getName(), obj());
_global_template = renderContext.call("use", "core/wcm/components/commons/v1/templates.html", obj());
_global_cancellationtitle = renderContext.getObjectModel().resolveProperty(_global_model, "cancellationTitle");
if (renderContext.getObjectModel().toBoolean(_global_cancellationtitle)) {
    out.write("\r\n\r\n    <div class=\"booking-cancellation-comp rew-cancelBooking cancelBookingDataAttribute rew-cancelBookingGa\"");
    {
        Object var_attrvalue0 = renderContext.getObjectModel().resolveProperty(_global_model, "cancellationTitle");
        {
            Object var_attrcontent1 = renderContext.call("xss", var_attrvalue0, "attribute");
            {
                boolean var_shoulddisplayattr3 = (((null != var_attrcontent1) && (!"".equals(var_attrcontent1))) && ((!"".equals(var_attrvalue0)) && (!((Object)false).equals(var_attrvalue0))));
                if (var_shoulddisplayattr3) {
                    out.write(" data-cancellationTitle");
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
        Object var_attrvalue4 = renderContext.getObjectModel().resolveProperty(_global_model, "locationIcon");
        {
            Object var_attrcontent5 = renderContext.call("xss", var_attrvalue4, "attribute");
            {
                boolean var_shoulddisplayattr7 = (((null != var_attrcontent5) && (!"".equals(var_attrcontent5))) && ((!"".equals(var_attrvalue4)) && (!((Object)false).equals(var_attrvalue4))));
                if (var_shoulddisplayattr7) {
                    out.write(" data-locationIcon");
                    {
                        boolean var_istrueattr6 = (var_attrvalue4.equals(true));
                        if (!var_istrueattr6) {
                            out.write("=\"");
                            out.write(renderContext.getObjectModel().toString(var_attrcontent5));
                            out.write("\"");
                        }
                    }
                }
            }
        }
    }
    {
        Object var_attrvalue8 = renderContext.getObjectModel().resolveProperty(renderContext.getObjectModel().resolveProperty(_dynamic_caconfig, "com.re.wanderlust.core.caconfig.APIUrlsConfig"), "generateTokenAPIUrl");
        {
            Object var_attrcontent9 = renderContext.call("xss", var_attrvalue8, "attribute");
            {
                boolean var_shoulddisplayattr11 = (((null != var_attrcontent9) && (!"".equals(var_attrcontent9))) && ((!"".equals(var_attrvalue8)) && (!((Object)false).equals(var_attrvalue8))));
                if (var_shoulddisplayattr11) {
                    out.write(" data-tokenApi");
                    {
                        boolean var_istrueattr10 = (var_attrvalue8.equals(true));
                        if (!var_istrueattr10) {
                            out.write("=\"");
                            out.write(renderContext.getObjectModel().toString(var_attrcontent9));
                            out.write("\"");
                        }
                    }
                }
            }
        }
    }
    {
        Object var_attrvalue12 = renderContext.getObjectModel().resolveProperty(renderContext.getObjectModel().resolveProperty(_dynamic_caconfig, "com.re.wanderlust.core.caconfig.CookieConfig"), "userLoginCookieName");
        {
            Object var_attrcontent13 = renderContext.call("xss", var_attrvalue12, "attribute");
            {
                boolean var_shoulddisplayattr15 = (((null != var_attrcontent13) && (!"".equals(var_attrcontent13))) && ((!"".equals(var_attrvalue12)) && (!((Object)false).equals(var_attrvalue12))));
                if (var_shoulddisplayattr15) {
                    out.write(" data-userLoginCookieName");
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
    {
        Object var_attrvalue16 = renderContext.getObjectModel().resolveProperty(_global_model, "bookingIdLabel");
        {
            Object var_attrcontent17 = renderContext.call("xss", var_attrvalue16, "attribute");
            {
                boolean var_shoulddisplayattr19 = (((null != var_attrcontent17) && (!"".equals(var_attrcontent17))) && ((!"".equals(var_attrvalue16)) && (!((Object)false).equals(var_attrvalue16))));
                if (var_shoulddisplayattr19) {
                    out.write(" data-bookingIdLabel");
                    {
                        boolean var_istrueattr18 = (var_attrvalue16.equals(true));
                        if (!var_istrueattr18) {
                            out.write("=\"");
                            out.write(renderContext.getObjectModel().toString(var_attrcontent17));
                            out.write("\"");
                        }
                    }
                }
            }
        }
    }
    {
        Object var_attrvalue20 = renderContext.getObjectModel().resolveProperty(_global_model, "selectAllLabel");
        {
            Object var_attrcontent21 = renderContext.call("xss", var_attrvalue20, "attribute");
            {
                boolean var_shoulddisplayattr23 = (((null != var_attrcontent21) && (!"".equals(var_attrcontent21))) && ((!"".equals(var_attrvalue20)) && (!((Object)false).equals(var_attrvalue20))));
                if (var_shoulddisplayattr23) {
                    out.write(" data-selectAllLabel");
                    {
                        boolean var_istrueattr22 = (var_attrvalue20.equals(true));
                        if (!var_istrueattr22) {
                            out.write("=\"");
                            out.write(renderContext.getObjectModel().toString(var_attrcontent21));
                            out.write("\"");
                        }
                    }
                }
            }
        }
    }
    {
        Object var_attrvalue24 = renderContext.getObjectModel().resolveProperty(_global_model, "preSuffixName");
        {
            Object var_attrcontent25 = renderContext.call("xss", var_attrvalue24, "attribute");
            {
                boolean var_shoulddisplayattr27 = (((null != var_attrcontent25) && (!"".equals(var_attrcontent25))) && ((!"".equals(var_attrvalue24)) && (!((Object)false).equals(var_attrvalue24))));
                if (var_shoulddisplayattr27) {
                    out.write(" data-preSuffixName");
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
        Object var_attrvalue28 = renderContext.getObjectModel().resolveProperty(_global_model, "bookingWithLabel");
        {
            Object var_attrcontent29 = renderContext.call("xss", var_attrvalue28, "attribute");
            {
                boolean var_shoulddisplayattr31 = (((null != var_attrcontent29) && (!"".equals(var_attrcontent29))) && ((!"".equals(var_attrvalue28)) && (!((Object)false).equals(var_attrvalue28))));
                if (var_shoulddisplayattr31) {
                    out.write(" data-bookingWithLabel");
                    {
                        boolean var_istrueattr30 = (var_attrvalue28.equals(true));
                        if (!var_istrueattr30) {
                            out.write("=\"");
                            out.write(renderContext.getObjectModel().toString(var_attrcontent29));
                            out.write("\"");
                        }
                    }
                }
            }
        }
    }
    {
        Object var_attrvalue32 = renderContext.getObjectModel().resolveProperty(_global_model, "returnPolicyLabel");
        {
            Object var_attrcontent33 = renderContext.call("xss", var_attrvalue32, "attribute");
            {
                boolean var_shoulddisplayattr35 = (((null != var_attrcontent33) && (!"".equals(var_attrcontent33))) && ((!"".equals(var_attrvalue32)) && (!((Object)false).equals(var_attrvalue32))));
                if (var_shoulddisplayattr35) {
                    out.write(" data-returnPolicyLabel");
                    {
                        boolean var_istrueattr34 = (var_attrvalue32.equals(true));
                        if (!var_istrueattr34) {
                            out.write("=\"");
                            out.write(renderContext.getObjectModel().toString(var_attrcontent33));
                            out.write("\"");
                        }
                    }
                }
            }
        }
    }
    {
        Object var_attrvalue36 = renderContext.getObjectModel().resolveProperty(_global_model, "nextButtonLabel");
        {
            Object var_attrcontent37 = renderContext.call("xss", var_attrvalue36, "attribute");
            {
                boolean var_shoulddisplayattr39 = (((null != var_attrcontent37) && (!"".equals(var_attrcontent37))) && ((!"".equals(var_attrvalue36)) && (!((Object)false).equals(var_attrvalue36))));
                if (var_shoulddisplayattr39) {
                    out.write(" data-nextButtonLabel");
                    {
                        boolean var_istrueattr38 = (var_attrvalue36.equals(true));
                        if (!var_istrueattr38) {
                            out.write("=\"");
                            out.write(renderContext.getObjectModel().toString(var_attrcontent37));
                            out.write("\"");
                        }
                    }
                }
            }
        }
    }
    {
        Object var_attrvalue40 = renderContext.getObjectModel().resolveProperty(_global_model, "forwardArrowIcon");
        {
            Object var_attrcontent41 = renderContext.call("xss", var_attrvalue40, "attribute");
            {
                boolean var_shoulddisplayattr43 = (((null != var_attrcontent41) && (!"".equals(var_attrcontent41))) && ((!"".equals(var_attrvalue40)) && (!((Object)false).equals(var_attrvalue40))));
                if (var_shoulddisplayattr43) {
                    out.write(" data-forwardArrowIcon");
                    {
                        boolean var_istrueattr42 = (var_attrvalue40.equals(true));
                        if (!var_istrueattr42) {
                            out.write("=\"");
                            out.write(renderContext.getObjectModel().toString(var_attrcontent41));
                            out.write("\"");
                        }
                    }
                }
            }
        }
    }
    {
        Object var_attrvalue44 = renderContext.getObjectModel().resolveProperty(renderContext.getObjectModel().resolveProperty(_dynamic_caconfig, "com.re.wanderlust.core.caconfig.APIUrlsConfig"), "apiBaseUrl");
        {
            Object var_attrcontent45 = renderContext.call("xss", var_attrvalue44, "attribute");
            {
                boolean var_shoulddisplayattr47 = (((null != var_attrcontent45) && (!"".equals(var_attrcontent45))) && ((!"".equals(var_attrvalue44)) && (!((Object)false).equals(var_attrvalue44))));
                if (var_shoulddisplayattr47) {
                    out.write(" data-baseApiUrl");
                    {
                        boolean var_istrueattr46 = (var_attrvalue44.equals(true));
                        if (!var_istrueattr46) {
                            out.write("=\"");
                            out.write(renderContext.getObjectModel().toString(var_attrcontent45));
                            out.write("\"");
                        }
                    }
                }
            }
        }
    }
    {
        Object var_attrvalue48 = renderContext.getObjectModel().resolveProperty(renderContext.getObjectModel().resolveProperty(_dynamic_caconfig, "com.re.wanderlust.core.caconfig.APIUrlsConfig"), "cancelledBookingEmailAPIUrl");
        {
            Object var_attrcontent49 = renderContext.call("xss", var_attrvalue48, "attribute");
            {
                boolean var_shoulddisplayattr51 = (((null != var_attrcontent49) && (!"".equals(var_attrcontent49))) && ((!"".equals(var_attrvalue48)) && (!((Object)false).equals(var_attrvalue48))));
                if (var_shoulddisplayattr51) {
                    out.write(" data-cancelledBookingEmailAPIUrl");
                    {
                        boolean var_istrueattr50 = (var_attrvalue48.equals(true));
                        if (!var_istrueattr50) {
                            out.write("=\"");
                            out.write(renderContext.getObjectModel().toString(var_attrcontent49));
                            out.write("\"");
                        }
                    }
                }
            }
        }
    }
    {
        Object var_attrvalue52 = renderContext.getObjectModel().resolveProperty(renderContext.getObjectModel().resolveProperty(_dynamic_caconfig, "com.re.wanderlust.core.caconfig.APIUrlsConfig"), "cancelledBookingEmailTourAPIUrl");
        {
            Object var_attrcontent53 = renderContext.call("xss", var_attrvalue52, "attribute");
            {
                boolean var_shoulddisplayattr55 = (((null != var_attrcontent53) && (!"".equals(var_attrcontent53))) && ((!"".equals(var_attrvalue52)) && (!((Object)false).equals(var_attrvalue52))));
                if (var_shoulddisplayattr55) {
                    out.write(" data-cancelledBookingEmailTourAPIUrl");
                    {
                        boolean var_istrueattr54 = (var_attrvalue52.equals(true));
                        if (!var_istrueattr54) {
                            out.write("=\"");
                            out.write(renderContext.getObjectModel().toString(var_attrcontent53));
                            out.write("\"");
                        }
                    }
                }
            }
        }
    }
    {
        Object var_attrvalue56 = renderContext.getObjectModel().resolveProperty(renderContext.getObjectModel().resolveProperty(_dynamic_caconfig, "com.re.wanderlust.core.caconfig.APIUrlsConfig"), "cancelBookingAPIUrl");
        {
            Object var_attrcontent57 = renderContext.call("xss", var_attrvalue56, "attribute");
            {
                boolean var_shoulddisplayattr59 = (((null != var_attrcontent57) && (!"".equals(var_attrcontent57))) && ((!"".equals(var_attrvalue56)) && (!((Object)false).equals(var_attrvalue56))));
                if (var_shoulddisplayattr59) {
                    out.write(" data-cancelBookingUrl");
                    {
                        boolean var_istrueattr58 = (var_attrvalue56.equals(true));
                        if (!var_istrueattr58) {
                            out.write("=\"");
                            out.write(renderContext.getObjectModel().toString(var_attrcontent57));
                            out.write("\"");
                        }
                    }
                }
            }
        }
    }
    {
        Object var_attrvalue60 = renderContext.getObjectModel().resolveProperty(renderContext.getObjectModel().resolveProperty(_dynamic_caconfig, "com.re.wanderlust.core.caconfig.APIUrlsConfig"), "cancelBookingTourAPIUrl");
        {
            Object var_attrcontent61 = renderContext.call("xss", var_attrvalue60, "attribute");
            {
                boolean var_shoulddisplayattr63 = (((null != var_attrcontent61) && (!"".equals(var_attrcontent61))) && ((!"".equals(var_attrvalue60)) && (!((Object)false).equals(var_attrvalue60))));
                if (var_shoulddisplayattr63) {
                    out.write(" data-cancelBookingTourAPIUrl");
                    {
                        boolean var_istrueattr62 = (var_attrvalue60.equals(true));
                        if (!var_istrueattr62) {
                            out.write("=\"");
                            out.write(renderContext.getObjectModel().toString(var_attrcontent61));
                            out.write("\"");
                        }
                    }
                }
            }
        }
    }
    {
        Object var_attrvalue64 = renderContext.getObjectModel().resolveProperty(renderContext.getObjectModel().resolveProperty(_dynamic_caconfig, "com.re.wanderlust.core.caconfig.APIUrlsConfig"), "bookingDetailAPIUrl");
        {
            Object var_attrcontent65 = renderContext.call("xss", var_attrvalue64, "attribute");
            {
                boolean var_shoulddisplayattr67 = (((null != var_attrcontent65) && (!"".equals(var_attrcontent65))) && ((!"".equals(var_attrvalue64)) && (!((Object)false).equals(var_attrvalue64))));
                if (var_shoulddisplayattr67) {
                    out.write(" data-bookingDetailAPIUrl");
                    {
                        boolean var_istrueattr66 = (var_attrvalue64.equals(true));
                        if (!var_istrueattr66) {
                            out.write("=\"");
                            out.write(renderContext.getObjectModel().toString(var_attrcontent65));
                            out.write("\"");
                        }
                    }
                }
            }
        }
    }
    {
        Object var_attrvalue68 = renderContext.getObjectModel().resolveProperty(renderContext.getObjectModel().resolveProperty(_dynamic_caconfig, "com.re.wanderlust.core.caconfig.APIUrlsConfig"), "tourBookingDetailAPIUrl");
        {
            Object var_attrcontent69 = renderContext.call("xss", var_attrvalue68, "attribute");
            {
                boolean var_shoulddisplayattr71 = (((null != var_attrcontent69) && (!"".equals(var_attrcontent69))) && ((!"".equals(var_attrvalue68)) && (!((Object)false).equals(var_attrvalue68))));
                if (var_shoulddisplayattr71) {
                    out.write(" data-tourBookingDetailAPIUrl");
                    {
                        boolean var_istrueattr70 = (var_attrvalue68.equals(true));
                        if (!var_istrueattr70) {
                            out.write("=\"");
                            out.write(renderContext.getObjectModel().toString(var_attrcontent69));
                            out.write("\"");
                        }
                    }
                }
            }
        }
    }
    {
        Object var_attrvalue72 = renderContext.getObjectModel().resolveProperty(renderContext.getObjectModel().resolveProperty(_dynamic_caconfig, "com.re.wanderlust.core.caconfig.CookieConfig"), "userCookieName");
        {
            Object var_attrcontent73 = renderContext.call("xss", var_attrvalue72, "attribute");
            {
                boolean var_shoulddisplayattr75 = (((null != var_attrcontent73) && (!"".equals(var_attrcontent73))) && ((!"".equals(var_attrvalue72)) && (!((Object)false).equals(var_attrvalue72))));
                if (var_shoulddisplayattr75) {
                    out.write(" data-userCookieName");
                    {
                        boolean var_istrueattr74 = (var_attrvalue72.equals(true));
                        if (!var_istrueattr74) {
                            out.write("=\"");
                            out.write(renderContext.getObjectModel().toString(var_attrcontent73));
                            out.write("\"");
                        }
                    }
                }
            }
        }
    }
    {
        Object var_attrvalue76 = renderContext.getObjectModel().resolveProperty(renderContext.getObjectModel().resolveProperty(_dynamic_caconfig, "com.re.wanderlust.core.caconfig.APIUrlsConfig"), "cancellationPolicyAPIUrl");
        {
            Object var_attrcontent77 = renderContext.call("xss", var_attrvalue76, "attribute");
            {
                boolean var_shoulddisplayattr79 = (((null != var_attrcontent77) && (!"".equals(var_attrcontent77))) && ((!"".equals(var_attrvalue76)) && (!((Object)false).equals(var_attrvalue76))));
                if (var_shoulddisplayattr79) {
                    out.write(" data-cancellationPolicyAPIUrl");
                    {
                        boolean var_istrueattr78 = (var_attrvalue76.equals(true));
                        if (!var_istrueattr78) {
                            out.write("=\"");
                            out.write(renderContext.getObjectModel().toString(var_attrcontent77));
                            out.write("\"");
                        }
                    }
                }
            }
        }
    }
    {
        Object var_attrvalue80 = renderContext.getObjectModel().resolveProperty(_global_model, "badRequest");
        {
            Object var_attrcontent81 = renderContext.call("xss", var_attrvalue80, "attribute");
            {
                boolean var_shoulddisplayattr83 = (((null != var_attrcontent81) && (!"".equals(var_attrcontent81))) && ((!"".equals(var_attrvalue80)) && (!((Object)false).equals(var_attrvalue80))));
                if (var_shoulddisplayattr83) {
                    out.write(" data-badRequest");
                    {
                        boolean var_istrueattr82 = (var_attrvalue80.equals(true));
                        if (!var_istrueattr82) {
                            out.write("=\"");
                            out.write(renderContext.getObjectModel().toString(var_attrcontent81));
                            out.write("\"");
                        }
                    }
                }
            }
        }
    }
    {
        Object var_attrvalue84 = renderContext.getObjectModel().resolveProperty(_global_model, "serverError");
        {
            Object var_attrcontent85 = renderContext.call("xss", var_attrvalue84, "attribute");
            {
                boolean var_shoulddisplayattr87 = (((null != var_attrcontent85) && (!"".equals(var_attrcontent85))) && ((!"".equals(var_attrvalue84)) && (!((Object)false).equals(var_attrvalue84))));
                if (var_shoulddisplayattr87) {
                    out.write(" data-serverError");
                    {
                        boolean var_istrueattr86 = (var_attrvalue84.equals(true));
                        if (!var_istrueattr86) {
                            out.write("=\"");
                            out.write(renderContext.getObjectModel().toString(var_attrcontent85));
                            out.write("\"");
                        }
                    }
                }
            }
        }
    }
    {
        Object var_attrvalue88 = renderContext.getObjectModel().resolveProperty(_global_model, "notFound");
        {
            Object var_attrcontent89 = renderContext.call("xss", var_attrvalue88, "attribute");
            {
                boolean var_shoulddisplayattr91 = (((null != var_attrcontent89) && (!"".equals(var_attrcontent89))) && ((!"".equals(var_attrvalue88)) && (!((Object)false).equals(var_attrvalue88))));
                if (var_shoulddisplayattr91) {
                    out.write(" data-notFound");
                    {
                        boolean var_istrueattr90 = (var_attrvalue88.equals(true));
                        if (!var_istrueattr90) {
                            out.write("=\"");
                            out.write(renderContext.getObjectModel().toString(var_attrcontent89));
                            out.write("\"");
                        }
                    }
                }
            }
        }
    }
    {
        Object var_attrvalue92 = renderContext.getObjectModel().resolveProperty(_global_model, "categoryType");
        {
            Object var_attrcontent93 = renderContext.call("xss", var_attrvalue92, "attribute");
            {
                boolean var_shoulddisplayattr95 = (((null != var_attrcontent93) && (!"".equals(var_attrcontent93))) && ((!"".equals(var_attrvalue92)) && (!((Object)false).equals(var_attrvalue92))));
                if (var_shoulddisplayattr95) {
                    out.write(" data-selectCategory");
                    {
                        boolean var_istrueattr94 = (var_attrvalue92.equals(true));
                        if (!var_istrueattr94) {
                            out.write("=\"");
                            out.write(renderContext.getObjectModel().toString(var_attrcontent93));
                            out.write("\"");
                        }
                    }
                }
            }
        }
    }
    out.write(">\r\n        ");
    {
        boolean var_testvariable96 = (!renderContext.getObjectModel().toBoolean(renderContext.getObjectModel().resolveProperty(_global_model, "hideComponent")));
        if (var_testvariable96) {
            out.write("<div class=\"container\">\r\n\r\n            <div id=\"step-1\" class=\"cancelBooking-list-container\">\r\n            </div>\r\n\r\n            <div id=\"step-2\" style=\"display: none\">\r\n                ");
_global_alerttemplate = renderContext.call("use", "alert.html", obj());
            out.write("\r\n                    ");
            {
                Object var_templatevar97 = renderContext.getObjectModel().resolveProperty(_global_alerttemplate, "Alert");
                {
                    Object var_templateoptions98_field$_alert = _global_model;
                    {
                        java.util.Map var_templateoptions98 = obj().with("alert", var_templateoptions98_field$_alert);
                        callUnit(out, renderContext, var_templatevar97, var_templateoptions98);
                    }
                }
            }
            out.write("\r\n                \r\n            </div>\r\n            <div id=\"step-3\" style=\"display: none\">\r\n                ");
_global_reasontemplate = renderContext.call("use", "reason.html", obj());
            out.write("\r\n                    ");
            {
                Object var_templatevar99 = renderContext.getObjectModel().resolveProperty(_global_reasontemplate, "Reasons");
                {
                    Object var_templateoptions100_field$_reasons = _global_model;
                    {
                        java.util.Map var_templateoptions100 = obj().with("reasons", var_templateoptions100_field$_reasons);
                        callUnit(out, renderContext, var_templatevar99, var_templateoptions100);
                    }
                }
            }
            out.write("\r\n                \r\n            </div>\r\n            <div id=\"step-4\" style=\"display: none\">\r\n                ");
_global_confirmationtemplate = renderContext.call("use", "cancelConfirm.html", obj());
            out.write("\r\n                    ");
            {
                Object var_templatevar101 = renderContext.getObjectModel().resolveProperty(_global_confirmationtemplate, "CancelConfirm");
                {
                    Object var_templateoptions102_field$_cancelconfirm = _global_model;
                    {
                        java.util.Map var_templateoptions102 = obj().with("cancelConfirm", var_templateoptions102_field$_cancelconfirm);
                        callUnit(out, renderContext, var_templatevar101, var_templateoptions102);
                    }
                }
            }
            out.write("\r\n                \r\n            </div>\r\n        </div>");
        }
    }
    out.write("\r\n\r\n        <div class=\"re-page-loaders\" id=\"pageLoaders\">\r\n            <div class=\"re-page-loader-inners\">\r\n                <div class=\"fadein-elements\">\r\n                    <img alt=\"Royal Enfield\" src=\"/etc.clientlibs/re-wanderlust/clientlibs/clientlib-site/resources/images/pre-loader-01.svg\"/>\r\n                    <img alt=\"Royal Enfield\" src=\"/etc.clientlibs/re-wanderlust/clientlibs/clientlib-site/resources/images/pre-loader-02.svg\"/>\r\n                    <img alt=\"Royal Enfield\" src=\"/etc.clientlibs/re-wanderlust/clientlibs/clientlib-site/resources/images/pre-loader-03.svg\"/>\r\n                    <img alt=\"Royal Enfield\" src=\"/etc.clientlibs/re-wanderlust/clientlibs/clientlib-site/resources/images/pre-loader-04.svg\"/>\r\n                    <img alt=\"Royal Enfield\" src=\"/etc.clientlibs/re-wanderlust/clientlibs/clientlib-site/resources/images/pre-loader-05.svg\"/>\r\n                </div>\r\n                <div class=\"loading-ellipsiss\">\r\n                    <div></div>\r\n                    <div></div>\r\n                    <div></div>\r\n                    <div></div>\r\n                </div>\r\n            </div>\r\n        </div>\r\n    </div>\r\n\r\n    <!-- The check policy modala -->\r\n    <div class=\"modal modal__checkPolicy\" id=\"checkPolicyPopup\">\r\n        <div class=\"modal-dialog modal-dialog-centered\">\r\n            <div class=\"modal-content bg-dark rounded-0\">\r\n                <!-- Modal Header -->\r\n                <div class=\"modal-header\">\r\n                    <h4 class=\"modal-title\" id=\"business_name\"></h4>\r\n                    <button type=\"button\" class=\"btn-close border-0\" data-bs-dismiss=\"modal\">\r\n                        <span class=\"icon-close\"></span>\r\n                    </button>\r\n                </div>\r\n\r\n                <!-- Modal body -->\r\n                <div class=\"modal-body\">\r\n                    <h5 class=\"pb-3\">");
    {
        Object var_103 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "cancellationPolicyTitleLabel"), "text");
        out.write(renderContext.getObjectModel().toString(var_103));
    }
    out.write("</h5>\r\n                    <p class=\"pb-4 font-size-2 color-light-color-font\">");
    {
        Object var_104 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "cancellationPolicyDescription"), "text");
        out.write(renderContext.getObjectModel().toString(var_104));
    }
    out.write("</p>\r\n                    <div class=\"col-12 policy-data\">\r\n                        <div class=\"d-flex  py-2 px-3 bg-neutral-black-grey-base\">\r\n                            <div class=\"col-5 col-md-4 color-light-color-font\">");
    {
        String var_105 = (renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "timeFrameHeaderLabel"), "text")) + "\r\n                            ");
        out.write(renderContext.getObjectModel().toString(var_105));
    }
    out.write("</div>\r\n                            <div class=\"col-7 col-md-8 color-light-color-font\">");
    {
        String var_106 = ("\r\n                                " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "cancellationAmountHeaderLabel"), "text")));
        out.write(renderContext.getObjectModel().toString(var_106));
    }
    out.write("</div>\r\n                        </div>\r\n                        <div class=\"d-flex py-2 px-3\">\r\n                            <div class=\"col-5 col-md-4\"><span class=\"d-block\">");
    {
        Object var_107 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "timeBetweenLabel"), "text");
        out.write(renderContext.getObjectModel().toString(var_107));
    }
    out.write("</span>");
    {
        String var_108 = (("\r\n                                " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "daysLessThanFirstWarningLabel"), "text"))) + "\r\n                            ");
        out.write(renderContext.getObjectModel().toString(var_108));
    }
    out.write("</div>\r\n                            <div class=\"col-7 col-md-8\"><span class=\"text-white fs-6\" id=\"daysLessThanFirstWarningLabel\"></span>");
    {
        String var_109 = (((("\r\n                                " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "amountPercentageSymbol"), "text"))) + " ") + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "cancellationAmountLabel"), "text"))) + "\r\n                            ");
        out.write(renderContext.getObjectModel().toString(var_109));
    }
    out.write("</div>\r\n                        </div>\r\n                        <div class=\"d-flex py-2 px-3\">\r\n                            <div class=\"col-5 col-md-4\"><span class=\"d-block\">");
    {
        Object var_110 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "timeBetweenLabel"), "text");
        out.write(renderContext.getObjectModel().toString(var_110));
    }
    out.write("</span>");
    {
        String var_111 = (("\r\n                                " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "daysLessThanSecondWarningLabel"), "text"))) + "\r\n                            ");
        out.write(renderContext.getObjectModel().toString(var_111));
    }
    out.write("</div>\r\n                            <div class=\"col-7 col-md-8\"><span class=\"text-white fs-6\" id=\"daysLessThanSecondWarningLabel\"></span>");
    {
        String var_112 = (((("\r\n                                " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "amountPercentageSymbol"), "text"))) + " ") + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "cancellationAmountLabel"), "text"))) + "\r\n                            ");
        out.write(renderContext.getObjectModel().toString(var_112));
    }
    out.write("</div>\r\n                        </div>\r\n                        <div class=\"d-flex py-2 px-3\">\r\n                            <div class=\"col-5 col-md-4\"><span class=\"d-block\">");
    {
        Object var_113 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "timeBetweenLabel"), "text");
        out.write(renderContext.getObjectModel().toString(var_113));
    }
    out.write("</span>");
    {
        String var_114 = (("\r\n                                " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "daysLessThanThirdWarningLabel"), "text"))) + "\r\n                            ");
        out.write(renderContext.getObjectModel().toString(var_114));
    }
    out.write("</div>\r\n                            <div class=\"col-7 col-md-8\"><span class=\"col-7 col-md-8 text-white fs-6\" id=\"daysLessThanThirdWarningLabel\"></span>");
    {
        String var_115 = ((((" " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "amountPercentageSymbol"), "text"))) + "\r\n                                ") + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "cancellationAmountLabel"), "text"))) + "\r\n                            ");
        out.write(renderContext.getObjectModel().toString(var_115));
    }
    out.write("</div>\r\n                        </div>\r\n                    </div>\r\n                    <div class=\"late-returns py-4\">\r\n                        <h5 class=\"py-3\">");
    {
        Object var_116 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "lateReturnLabel"), "text");
        out.write(renderContext.getObjectModel().toString(var_116));
    }
    out.write("</h5>\r\n                        ");
    {
        Object var_testvariable117 = renderContext.getObjectModel().resolveProperty(_global_model, "lateReturnNote");
        if (renderContext.getObjectModel().toBoolean(var_testvariable117)) {
            out.write("<p class=\"pb-4 font-size-2 color-light-color-font\">");
            {
                Object var_118 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "lateReturnNote"), "text");
                out.write(renderContext.getObjectModel().toString(var_118));
            }
            out.write("</p>");
        }
    }
    out.write("\r\n                        <div class=\"col-12\">\r\n                            <div class=\"d-flex\">\r\n                                <div class=\"col-3\"><span class=\"d-block font-size-2 color-light-color-font\">");
    {
        String var_119 = (renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "lateReturnFirstWarningLabel"), "text")) + "\r\n                                        ");
        out.write(renderContext.getObjectModel().toString(var_119));
    }
    out.write("<span class=\"d-block font-size-2 color-light-color-font\">");
    {
        String var_120 = (renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "currencyType"), "text")) + " ");
        out.write(renderContext.getObjectModel().toString(var_120));
    }
    out.write("<span id=\"lateReturnFirstWarningLabel\">\r\n                                            </span></span>\r\n\r\n                                </div>\r\n                                <div class=\"col-3\">");
    {
        String var_121 = (renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "lateReturnSecondWarningLabel"), "text")) + "\r\n                                    ");
        out.write(renderContext.getObjectModel().toString(var_121));
    }
    out.write("<span class=\"d-block font-size-2 color-light-color-font\">");
    {
        String var_122 = (renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "currencyType"), "text")) + " ");
        out.write(renderContext.getObjectModel().toString(var_122));
    }
    out.write("<span id=\"lateReturnSecondWarningLabel\">\r\n                                        </span></span>\r\n\r\n                                </div>\r\n                                <div class=\"col-6\">");
    {
        String var_123 = (renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "lateReturnThirdWarningLabel"), "text")) + " ");
        out.write(renderContext.getObjectModel().toString(var_123));
    }
    out.write("<span class=\"d-block font-size-2 color-light-color-font\">");
    {
        String var_124 = (renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "currencyType"), "text")) + " ");
        out.write(renderContext.getObjectModel().toString(var_124));
    }
    out.write("<span id=\"lateReturnThirdWarningLabel\">\r\n                                        </span></span>\r\n\r\n                                </div>\r\n                            </div>\r\n\r\n                        </div>\r\n                    </div>\r\n                    <div class=\"col-12 d-flex justify-content-center close-cancellation-modal\">\r\n                        <button type=\"button\" class=\"btn bg-light ride rounded-0 cancellation-policy-link\" id=\"closeCancellationPopup\">");
    {
        String var_125 = (" " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "cancelButtonLabel"), "text")));
        out.write(renderContext.getObjectModel().toString(var_125));
    }
    out.write("</button>\r\n                    </div>\r\n                </div>\r\n            </div>\r\n        </div>\r\n    </div>\r\n");
}
out.write("\r\n");
{
    Object var_templatevar126 = renderContext.getObjectModel().resolveProperty(_global_template, "placeholder");
    {
        boolean var_templateoptions127_field$_isempty = (!renderContext.getObjectModel().toBoolean(_global_cancellationtitle));
        {
            java.util.Map var_templateoptions127 = obj().with("isEmpty", var_templateoptions127_field$_isempty);
            callUnit(out, renderContext, var_templatevar126, var_templateoptions127);
        }
    }
}
out.write("\r\n\r\n<script class=\"cancelBooking-template\" type=\"text/x-handlebars-template\">\r\n            {{#each booking}}\r\n                <h4 class=\"booking-cancellation-comp__title text-white orderId\" \r\n                data-orderId=\"{{../order_id}}\" \r\n                data-riderNo=\"{{../rider_no}}\">{{../cancellationTitle}}</h4>\r\n                <p class=\"text-white location-days mb-3\"><img src=\"{{../locationIcon}}\" title=\"arrow icon\" alt=\"arrow icon\"><span class=\"border-right pe-2 me-2\"> {{other.booking_location}}</span></p>\r\n                <p class=\"date-time mb-3\">{{other.booking_start_date}} - {{other.booking_end_date}}</p>\r\n                <div class=\"bookingId-section\">\r\n                    <div class=\"row\">\r\n                        <div class=\"col-6 pe-1 bookingId text-white\" data-bookingId=\"{{other.booking_series_id}}\">{{../bookingIdLabel}} : {{other.booking_series_id}}</div>\r\n                        <div class=\"col-6 ps-1 d-flex flex-wrap justify-content-end\">\r\n                            <label class=\"select-all-checkbox\">\r\n                                <input type=\"checkbox\" class=\"form-check-input selectAll\" name=\"hobbies\"/>\r\n                                <span>{{../selectAllLabel}}</span>\r\n                            </label>\r\n                        </div>\r\n                    </div>\r\n                </div>\r\n                <div class=\"row g-4\">\r\n                {{#each items}}\r\n                    <div class=\"col-md-6 col-xl-4\" id=\"bikes-div\">\r\n                        <div class=\"riderId\" data-riderId=\"{{rider_id}}\"></div>\r\n                        <div class=\"card card__cancelBookingSelection border-0 rounded-0 bg-transparent\">\r\n                            <div class=\"card__cancelBookingSelection-body position-relative\">\r\n                                <input class=\"position-absolute bikes_checkbox\" data-riderId=\"{{rider_id}}\" type=\"checkbox\" name=\"cancelBookingSelection\" id=\"bike1\" />\r\n                                <label class=\"d-flex flex-wrap mb-3\" for=\"bike1\">   \r\n                                    <span class=\"bike-name text-white me-2\" data-bikeName=\"{{item_data.name}}\">{{item_data.name}}</span>\r\n                                    <span class=\"bike-no\">{{registered_number}}</span>\r\n                                </label>\r\n                                <p class=\"mb-3\">{{../../bookingWithLabel}} <span class=\"rentalName\" data-rentalName=\"{{item_data.operator_name}}\">{{item_data.operator_name}}</span></p>\r\n                                <a  title=\"cancellation policy link\" class=\"cancellationPopup\" data-operatorId=\"{{../operator_id}}\">{{../../returnPolicyLabel}}</a>\r\n                            </div>\r\n                        </div>\r\n                    </div>\r\n                {{/each}}    \r\n                </div>\r\n                <div class=\"row justify-content-center\">\r\n                    <div class=\"col-8 col-md-5 col-xl-3 text-center mt-5\">\r\n                        <div class=\"button button__primary-v2\">\r\n                            <button class=\"cmp-button d-inline-block position-relative rounded-0 nextButton\" type=\"button\" disabled>\r\n                                <span class=\"cpm-text nextButtonLabel\">{{../nextButtonLabel}}</span>\r\n                                <span class=\"cmp-icon cmp-icon-after icon-arrow-r position-absolute top-0 end-0 bottom-0 text-white bg-primary d-flex flex-wrap align-items-center justify-content-center\"></span>\r\n                            </button>\r\n                        </div>\r\n                    </div>\r\n                </div>\r\n            {{/each}}\r\n</script>\r\n\r\n<script class=\"tourcancelBooking-template\" type=\"text/x-handlebars-template\">\r\n            {{#each booking}}\r\n                <h4 class=\"booking-cancellation-comp__title text-white orderId\" \r\n                data-orderId=\"{{../order_id}}\" \r\n                data-riderNo=\"{{../rider_no}}\">{{../cancellationTitle}}</h4>\r\n                <p class=\"text-white location-days mb-3\"><img src=\"{{../locationIcon}}\" title=\"arrow icon\" alt=\"arrow icon\"><span class=\"border-right pe-2 me-2\"> {{other.booking_location}}</span></p>\r\n                <p class=\"date-time mb-3\">{{other.booking_start_date}} - {{other.booking_end_date}}</p>\r\n                <div class=\"bookingId-section\">\r\n                    <div class=\"row\">\r\n                        <div class=\"col-6 pe-1 bookingId text-white\" data-bookingId=\"{{other.booking_series_id}}\">{{../bookingIdLabel}} : {{other.booking_series_id}}</div>\r\n                        <div class=\"col-6 ps-1 d-flex flex-wrap justify-content-end\">\r\n                            <label class=\"select-all-checkbox\">\r\n                                <input type=\"checkbox\" class=\"form-check-input selectAll\" name=\"hobbies\"/>\r\n                                <span>{{../selectAllLabel}}</span>\r\n                            </label>\r\n                        </div>\r\n                    </div>\r\n                </div>\r\n                <div class=\"row g-4\">\r\n                {{#each items}}\r\n                    <div class=\"col-md-6 col-xl-4\" id=\"bikes-div\">\r\n                        <div class=\"riderId\" data-riderId=\"{{rider_id}}\"></div>\r\n                        <div class=\"card card__cancelBookingSelection border-0 rounded-0 bg-transparent\">\r\n                            <div class=\"card__cancelBookingSelection-body position-relative\">\r\n                                <input class=\"position-absolute bikes_checkbox\" data-riderId=\"{{rider_id}}\" type=\"checkbox\" name=\"cancelBookingSelection\" id=\"bike1\" />\r\n                                <label class=\"d-flex flex-wrap mb-3\" for=\"bike1\">   \r\n                                    <span class=\"bike-name text-white me-2\" data-bikeName=\"{{item_data.name}}\">{{item_data.trip_name}}</span>\r\n                                    <!--/* <span class=\"bike-no\">{{registered_number}}</span> */-->\r\n                                </label>\r\n                                <p class=\"mb-3\">{{../../bookingWithLabel}} <span class=\"rentalName\" data-rentalName=\"{{item_data.operator_name}}\">{{../../operator_name}}</span></p>\r\n                                <a  title=\"cancellation policy link\" class=\"cancellationPopup\" data-operatorId=\"{{../operator_id}}\">{{../../returnPolicyLabel}}</a>\r\n                            </div>\r\n                        </div>\r\n                    </div>\r\n                {{/each}}    \r\n                </div>\r\n                <div class=\"row justify-content-center\">\r\n                    <div class=\"col-8 col-md-5 col-xl-3 text-center mt-5\">\r\n                        <div class=\"button button__primary-v2\">\r\n                            <button class=\"cmp-button d-inline-block position-relative rounded-0 nextButton\" type=\"button\" disabled>\r\n                                <span class=\"cpm-text\">{{../nextButtonLabel}}</span>\r\n                                <span class=\"cmp-icon cmp-icon-after icon-arrow-r position-absolute top-0 end-0 bottom-0 text-white bg-primary d-flex flex-wrap align-items-center justify-content-center\"></span>\r\n                            </button>\r\n                        </div>\r\n                    </div>\r\n                </div>\r\n            {{/each}}\r\n</script>");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

