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
package org.apache.sling.scripting.sightly.apps.re__002d__wanderlust.components.bookingFormTours;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class bookingFormTours__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _global_model = null;
Object _dynamic_caconfig = bindings.get("caconfig");
Object _global_bookingcontainertemplate = null;
Collection var_collectionvar200_list_coerced$ = null;
Object _global_value = null;
out.write("<script src=\"https://checkout.razorpay.com/v1/checkout.js\"></script>\r\n");
_global_model = renderContext.call("use", com.re.wanderlust.core.models.BookingFormToursModel.class.getName(), obj());
out.write("\r\n    <div class=\"rew_bookingFormTours tour-bookingForm-comp\" id=\"author-data\">\r\n        <div class=\"container BookingFormDataAttribute\"");
{
    Object var_attrvalue0 = renderContext.getObjectModel().resolveProperty(_global_model, "riderLabel");
    {
        Object var_attrcontent1 = renderContext.call("xss", var_attrvalue0, "attribute");
        {
            boolean var_shoulddisplayattr3 = (((null != var_attrcontent1) && (!"".equals(var_attrcontent1))) && ((!"".equals(var_attrvalue0)) && (!((Object)false).equals(var_attrvalue0))));
            if (var_shoulddisplayattr3) {
                out.write(" data-riderLabel");
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
    Object var_attrvalue4 = renderContext.getObjectModel().resolveProperty(_global_model, "singleOccupancyLabel");
    {
        Object var_attrcontent5 = renderContext.call("xss", var_attrvalue4, "attribute");
        {
            boolean var_shoulddisplayattr7 = (((null != var_attrcontent5) && (!"".equals(var_attrcontent5))) && ((!"".equals(var_attrvalue4)) && (!((Object)false).equals(var_attrvalue4))));
            if (var_shoulddisplayattr7) {
                out.write(" data-singleOccupancyLabel");
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
    Object var_attrvalue8 = renderContext.getObjectModel().resolveProperty(_global_model, "doubleOccupancyLabel");
    {
        Object var_attrcontent9 = renderContext.call("xss", var_attrvalue8, "attribute");
        {
            boolean var_shoulddisplayattr11 = (((null != var_attrcontent9) && (!"".equals(var_attrcontent9))) && ((!"".equals(var_attrvalue8)) && (!((Object)false).equals(var_attrvalue8))));
            if (var_shoulddisplayattr11) {
                out.write(" data-doubleOccupancyLabel");
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
    Object var_attrvalue12 = renderContext.getObjectModel().resolveProperty(_global_model, "tripleOccupancyLabel");
    {
        Object var_attrcontent13 = renderContext.call("xss", var_attrvalue12, "attribute");
        {
            boolean var_shoulddisplayattr15 = (((null != var_attrcontent13) && (!"".equals(var_attrcontent13))) && ((!"".equals(var_attrvalue12)) && (!((Object)false).equals(var_attrvalue12))));
            if (var_shoulddisplayattr15) {
                out.write(" data-tripleOccupancyLabel");
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
    Object var_attrvalue16 = renderContext.getObjectModel().resolveProperty(_global_model, "addAddressFirstValidation");
    {
        Object var_attrcontent17 = renderContext.call("xss", var_attrvalue16, "attribute");
        {
            boolean var_shoulddisplayattr19 = (((null != var_attrcontent17) && (!"".equals(var_attrcontent17))) && ((!"".equals(var_attrvalue16)) && (!((Object)false).equals(var_attrvalue16))));
            if (var_shoulddisplayattr19) {
                out.write(" data-addaddressfirstvalidation");
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
    Object var_attrvalue20 = renderContext.getObjectModel().resolveProperty(_global_model, "addressSavedValidation");
    {
        Object var_attrcontent21 = renderContext.call("xss", var_attrvalue20, "attribute");
        {
            boolean var_shoulddisplayattr23 = (((null != var_attrcontent21) && (!"".equals(var_attrcontent21))) && ((!"".equals(var_attrvalue20)) && (!((Object)false).equals(var_attrvalue20))));
            if (var_shoulddisplayattr23) {
                out.write(" data-addresssavedvalidation");
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
    Object var_attrvalue24 = renderContext.getObjectModel().resolveProperty(renderContext.getObjectModel().resolveProperty(_dynamic_caconfig, "com.re.wanderlust.core.caconfig.APIUrlsConfig"), "apiBaseUrl");
    {
        Object var_attrcontent25 = renderContext.call("xss", var_attrvalue24, "attribute");
        {
            boolean var_shoulddisplayattr27 = (((null != var_attrcontent25) && (!"".equals(var_attrcontent25))) && ((!"".equals(var_attrvalue24)) && (!((Object)false).equals(var_attrvalue24))));
            if (var_shoulddisplayattr27) {
                out.write(" data-apihost");
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
    Object var_attrvalue28 = renderContext.getObjectModel().resolveProperty(_global_model, "bookingAttribute");
    {
        Object var_attrcontent29 = renderContext.call("xss", var_attrvalue28, "attribute");
        {
            boolean var_shoulddisplayattr31 = (((null != var_attrcontent29) && (!"".equals(var_attrcontent29))) && ((!"".equals(var_attrvalue28)) && (!((Object)false).equals(var_attrvalue28))));
            if (var_shoulddisplayattr31) {
                out.write(" data-bookingattribute");
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
    Object var_attrvalue32 = renderContext.getObjectModel().resolveProperty(renderContext.getObjectModel().resolveProperty(_dynamic_caconfig, "com.re.wanderlust.core.caconfig.APIUrlsConfig"), "tourBookingSummaryApiUrl");
    {
        Object var_attrcontent33 = renderContext.call("xss", var_attrvalue32, "attribute");
        {
            boolean var_shoulddisplayattr35 = (((null != var_attrcontent33) && (!"".equals(var_attrcontent33))) && ((!"".equals(var_attrvalue32)) && (!((Object)false).equals(var_attrvalue32))));
            if (var_shoulddisplayattr35) {
                out.write(" data-bookingsummaryapi");
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
    Object var_attrvalue36 = renderContext.getObjectModel().resolveProperty(renderContext.getObjectModel().resolveProperty(_dynamic_caconfig, "com.re.wanderlust.core.caconfig.APIUrlsConfig"), "cancellationPolicyAPIUrl");
    {
        Object var_attrcontent37 = renderContext.call("xss", var_attrvalue36, "attribute");
        {
            boolean var_shoulddisplayattr39 = (((null != var_attrcontent37) && (!"".equals(var_attrcontent37))) && ((!"".equals(var_attrvalue36)) && (!((Object)false).equals(var_attrvalue36))));
            if (var_shoulddisplayattr39) {
                out.write(" data-cancellationpolicyapiurl");
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
    Object var_attrvalue40 = renderContext.getObjectModel().resolveProperty(renderContext.getObjectModel().resolveProperty(_dynamic_caconfig, "com.re.wanderlust.core.caconfig.APIUrlsConfig"), "cartInfoAPIUrl");
    {
        Object var_attrcontent41 = renderContext.call("xss", var_attrvalue40, "attribute");
        {
            boolean var_shoulddisplayattr43 = (((null != var_attrcontent41) && (!"".equals(var_attrcontent41))) && ((!"".equals(var_attrvalue40)) && (!((Object)false).equals(var_attrvalue40))));
            if (var_shoulddisplayattr43) {
                out.write(" data-cartinfoapiurl");
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
    Object var_attrvalue44 = renderContext.getObjectModel().resolveProperty(renderContext.getObjectModel().resolveProperty(_dynamic_caconfig, "com.re.wanderlust.core.caconfig.APIKeysConfig"), "currency");
    {
        Object var_attrcontent45 = renderContext.call("xss", var_attrvalue44, "attribute");
        {
            boolean var_shoulddisplayattr47 = (((null != var_attrcontent45) && (!"".equals(var_attrcontent45))) && ((!"".equals(var_attrvalue44)) && (!((Object)false).equals(var_attrvalue44))));
            if (var_shoulddisplayattr47) {
                out.write(" data-currency");
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
    Object var_attrvalue48 = renderContext.getObjectModel().resolveProperty(renderContext.getObjectModel().resolveProperty(_dynamic_caconfig, "com.re.wanderlust.core.caconfig.APIUrlsConfig"), "emergencyCountryList");
    {
        Object var_attrcontent49 = renderContext.call("xss", var_attrvalue48, "attribute");
        {
            boolean var_shoulddisplayattr51 = (((null != var_attrcontent49) && (!"".equals(var_attrcontent49))) && ((!"".equals(var_attrvalue48)) && (!((Object)false).equals(var_attrvalue48))));
            if (var_shoulddisplayattr51) {
                out.write(" data-emergencycountrylist");
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
    Object var_attrvalue52 = renderContext.getObjectModel().resolveProperty(renderContext.getObjectModel().resolveProperty(_dynamic_caconfig, "com.re.wanderlust.core.caconfig.APIUrlsConfig"), "generateTokenAPIUrl");
    {
        Object var_attrcontent53 = renderContext.call("xss", var_attrvalue52, "attribute");
        {
            boolean var_shoulddisplayattr55 = (((null != var_attrcontent53) && (!"".equals(var_attrcontent53))) && ((!"".equals(var_attrvalue52)) && (!((Object)false).equals(var_attrvalue52))));
            if (var_shoulddisplayattr55) {
                out.write(" data-generatetokenapiurl");
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
    Object var_attrvalue56 = renderContext.getObjectModel().resolveProperty(renderContext.getObjectModel().resolveProperty(_dynamic_caconfig, "com.re.wanderlust.core.caconfig.APIUrlsConfig"), "getBillingAddressDetail");
    {
        Object var_attrcontent57 = renderContext.call("xss", var_attrvalue56, "attribute");
        {
            boolean var_shoulddisplayattr59 = (((null != var_attrcontent57) && (!"".equals(var_attrcontent57))) && ((!"".equals(var_attrvalue56)) && (!((Object)false).equals(var_attrvalue56))));
            if (var_shoulddisplayattr59) {
                out.write(" data-getbillingaddressdetail");
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
    Object var_attrvalue60 = renderContext.getObjectModel().resolveProperty(renderContext.getObjectModel().resolveProperty(_dynamic_caconfig, "com.re.wanderlust.core.caconfig.APIUrlsConfig"), "gstDetailsAPIUrl");
    {
        Object var_attrcontent61 = renderContext.call("xss", var_attrvalue60, "attribute");
        {
            boolean var_shoulddisplayattr63 = (((null != var_attrcontent61) && (!"".equals(var_attrcontent61))) && ((!"".equals(var_attrvalue60)) && (!((Object)false).equals(var_attrvalue60))));
            if (var_shoulddisplayattr63) {
                out.write(" data-gstdetailsapiurl");
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
    Object var_attrvalue64 = renderContext.getObjectModel().resolveProperty(_global_model, "gstDetailSavedValidation");
    {
        Object var_attrcontent65 = renderContext.call("xss", var_attrvalue64, "attribute");
        {
            boolean var_shoulddisplayattr67 = (((null != var_attrcontent65) && (!"".equals(var_attrcontent65))) && ((!"".equals(var_attrvalue64)) && (!((Object)false).equals(var_attrvalue64))));
            if (var_shoulddisplayattr67) {
                out.write(" data-gstdetailsavedvalidation");
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
    Object var_attrvalue68 = renderContext.getObjectModel().resolveProperty(renderContext.getObjectModel().resolveProperty(_dynamic_caconfig, "com.re.wanderlust.core.caconfig.APIUrlsConfig"), "itemsAddToCartAPIUrl");
    {
        Object var_attrcontent69 = renderContext.call("xss", var_attrvalue68, "attribute");
        {
            boolean var_shoulddisplayattr71 = (((null != var_attrcontent69) && (!"".equals(var_attrcontent69))) && ((!"".equals(var_attrvalue68)) && (!((Object)false).equals(var_attrvalue68))));
            if (var_shoulddisplayattr71) {
                out.write(" data-itemsaddtocart");
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
    Object var_attrvalue72 = renderContext.getObjectModel().resolveProperty(renderContext.getObjectModel().resolveProperty(_dynamic_caconfig, "com.re.wanderlust.core.caconfig.APIKeysConfig"), "locality");
    {
        Object var_attrcontent73 = renderContext.call("xss", var_attrvalue72, "attribute");
        {
            boolean var_shoulddisplayattr75 = (((null != var_attrcontent73) && (!"".equals(var_attrcontent73))) && ((!"".equals(var_attrvalue72)) && (!((Object)false).equals(var_attrvalue72))));
            if (var_shoulddisplayattr75) {
                out.write(" data-locality");
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
    Object var_attrvalue76 = renderContext.getObjectModel().resolveProperty(renderContext.getObjectModel().resolveProperty(_dynamic_caconfig, "com.re.wanderlust.core.caconfig.APIUrlsConfig"), "loginRedirectPath");
    {
        Object var_attrcontent77 = renderContext.call("xss", var_attrvalue76, "attribute");
        {
            boolean var_shoulddisplayattr79 = (((null != var_attrcontent77) && (!"".equals(var_attrcontent77))) && ((!"".equals(var_attrvalue76)) && (!((Object)false).equals(var_attrvalue76))));
            if (var_shoulddisplayattr79) {
                out.write(" data-loginredirectpath");
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
    Object var_attrvalue80 = renderContext.getObjectModel().resolveProperty(renderContext.getObjectModel().resolveProperty(_dynamic_caconfig, "com.re.wanderlust.core.caconfig.APIUrlsConfig"), "orderIdAPIUrl");
    {
        Object var_attrcontent81 = renderContext.call("xss", var_attrvalue80, "attribute");
        {
            boolean var_shoulddisplayattr83 = (((null != var_attrcontent81) && (!"".equals(var_attrcontent81))) && ((!"".equals(var_attrvalue80)) && (!((Object)false).equals(var_attrvalue80))));
            if (var_shoulddisplayattr83) {
                out.write(" data-orderIdAPI");
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
    Object var_attrvalue84 = renderContext.getObjectModel().resolveProperty(_global_model, "paymentDescription");
    {
        Object var_attrcontent85 = renderContext.call("xss", var_attrvalue84, "attribute");
        {
            boolean var_shoulddisplayattr87 = (((null != var_attrcontent85) && (!"".equals(var_attrcontent85))) && ((!"".equals(var_attrvalue84)) && (!((Object)false).equals(var_attrvalue84))));
            if (var_shoulddisplayattr87) {
                out.write(" data-paymentdescription");
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
    Object var_attrvalue88 = renderContext.getObjectModel().resolveProperty(renderContext.getObjectModel().resolveProperty(_dynamic_caconfig, "com.re.wanderlust.core.caconfig.APIUrlsConfig"), "pinCodeApi");
    {
        Object var_attrcontent89 = renderContext.call("xss", var_attrvalue88, "attribute");
        {
            boolean var_shoulddisplayattr91 = (((null != var_attrcontent89) && (!"".equals(var_attrcontent89))) && ((!"".equals(var_attrvalue88)) && (!((Object)false).equals(var_attrvalue88))));
            if (var_shoulddisplayattr91) {
                out.write(" data-pincodeapi");
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
    Object var_attrvalue92 = renderContext.getObjectModel().resolveProperty(renderContext.getObjectModel().resolveProperty(_dynamic_caconfig, "com.re.wanderlust.core.caconfig.APIUrlsConfig"), "promoCodeApiUrl");
    {
        Object var_attrcontent93 = renderContext.call("xss", var_attrvalue92, "attribute");
        {
            boolean var_shoulddisplayattr95 = (((null != var_attrcontent93) && (!"".equals(var_attrcontent93))) && ((!"".equals(var_attrvalue92)) && (!((Object)false).equals(var_attrvalue92))));
            if (var_shoulddisplayattr95) {
                out.write(" data-promocodeapiurl");
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
{
    Object var_attrvalue96 = renderContext.getObjectModel().resolveProperty(renderContext.getObjectModel().resolveProperty(_dynamic_caconfig, "com.re.wanderlust.core.caconfig.APIUrlsConfig"), "razorPayOrderId");
    {
        Object var_attrcontent97 = renderContext.call("xss", var_attrvalue96, "attribute");
        {
            boolean var_shoulddisplayattr99 = (((null != var_attrcontent97) && (!"".equals(var_attrcontent97))) && ((!"".equals(var_attrvalue96)) && (!((Object)false).equals(var_attrvalue96))));
            if (var_shoulddisplayattr99) {
                out.write(" data-razorpayorderidapi");
                {
                    boolean var_istrueattr98 = (var_attrvalue96.equals(true));
                    if (!var_istrueattr98) {
                        out.write("=\"");
                        out.write(renderContext.getObjectModel().toString(var_attrcontent97));
                        out.write("\"");
                    }
                }
            }
        }
    }
}
{
    Object var_attrvalue100 = renderContext.getObjectModel().resolveProperty(_global_model, "relationItem");
    {
        Object var_attrcontent101 = renderContext.call("xss", var_attrvalue100, "attribute");
        {
            boolean var_shoulddisplayattr103 = (((null != var_attrcontent101) && (!"".equals(var_attrcontent101))) && ((!"".equals(var_attrvalue100)) && (!((Object)false).equals(var_attrvalue100))));
            if (var_shoulddisplayattr103) {
                out.write(" data-relationitem");
                {
                    boolean var_istrueattr102 = (var_attrvalue100.equals(true));
                    if (!var_istrueattr102) {
                        out.write("=\"");
                        out.write(renderContext.getObjectModel().toString(var_attrcontent101));
                        out.write("\"");
                    }
                }
            }
        }
    }
}
{
    Object var_attrvalue104 = renderContext.getObjectModel().resolveProperty(renderContext.getObjectModel().resolveProperty(_dynamic_caconfig, "com.re.wanderlust.core.caconfig.APIUrlsConfig"), "getRemoveTourItem");
    {
        Object var_attrcontent105 = renderContext.call("xss", var_attrvalue104, "attribute");
        {
            boolean var_shoulddisplayattr107 = (((null != var_attrcontent105) && (!"".equals(var_attrcontent105))) && ((!"".equals(var_attrvalue104)) && (!((Object)false).equals(var_attrvalue104))));
            if (var_shoulddisplayattr107) {
                out.write(" data-removetouritemapiurl");
                {
                    boolean var_istrueattr106 = (var_attrvalue104.equals(true));
                    if (!var_istrueattr106) {
                        out.write("=\"");
                        out.write(renderContext.getObjectModel().toString(var_attrcontent105));
                        out.write("\"");
                    }
                }
            }
        }
    }
}
{
    Object var_attrvalue108 = renderContext.getObjectModel().resolveProperty(_global_model, "rideDeleteSuccessfullyValidation");
    {
        Object var_attrcontent109 = renderContext.call("xss", var_attrvalue108, "attribute");
        {
            boolean var_shoulddisplayattr111 = (((null != var_attrcontent109) && (!"".equals(var_attrcontent109))) && ((!"".equals(var_attrvalue108)) && (!((Object)false).equals(var_attrvalue108))));
            if (var_shoulddisplayattr111) {
                out.write(" data-ridedeletesuccessfullyvalidation");
                {
                    boolean var_istrueattr110 = (var_attrvalue108.equals(true));
                    if (!var_istrueattr110) {
                        out.write("=\"");
                        out.write(renderContext.getObjectModel().toString(var_attrcontent109));
                        out.write("\"");
                    }
                }
            }
        }
    }
}
{
    Object var_attrvalue112 = renderContext.getObjectModel().resolveProperty(_global_model, "riderDetailSavedValidation");
    {
        Object var_attrcontent113 = renderContext.call("xss", var_attrvalue112, "attribute");
        {
            boolean var_shoulddisplayattr115 = (((null != var_attrcontent113) && (!"".equals(var_attrcontent113))) && ((!"".equals(var_attrvalue112)) && (!((Object)false).equals(var_attrvalue112))));
            if (var_shoulddisplayattr115) {
                out.write(" data-riderdetailsavedvalidation");
                {
                    boolean var_istrueattr114 = (var_attrvalue112.equals(true));
                    if (!var_istrueattr114) {
                        out.write("=\"");
                        out.write(renderContext.getObjectModel().toString(var_attrcontent113));
                        out.write("\"");
                    }
                }
            }
        }
    }
}
{
    Object var_attrvalue116 = renderContext.getObjectModel().resolveProperty(renderContext.getObjectModel().resolveProperty(_dynamic_caconfig, "com.re.wanderlust.core.caconfig.APIUrlsConfig"), "addBillingAddress");
    {
        Object var_attrcontent117 = renderContext.call("xss", var_attrvalue116, "attribute");
        {
            boolean var_shoulddisplayattr119 = (((null != var_attrcontent117) && (!"".equals(var_attrcontent117))) && ((!"".equals(var_attrvalue116)) && (!((Object)false).equals(var_attrvalue116))));
            if (var_shoulddisplayattr119) {
                out.write(" data-savebillingaddressurl");
                {
                    boolean var_istrueattr118 = (var_attrvalue116.equals(true));
                    if (!var_istrueattr118) {
                        out.write("=\"");
                        out.write(renderContext.getObjectModel().toString(var_attrcontent117));
                        out.write("\"");
                    }
                }
            }
        }
    }
}
{
    Object var_attrvalue120 = renderContext.getObjectModel().resolveProperty(renderContext.getObjectModel().resolveProperty(_dynamic_caconfig, "com.re.wanderlust.core.caconfig.APIUrlsConfig"), "saveTourRiderApiUrl");
    {
        Object var_attrcontent121 = renderContext.call("xss", var_attrvalue120, "attribute");
        {
            boolean var_shoulddisplayattr123 = (((null != var_attrcontent121) && (!"".equals(var_attrcontent121))) && ((!"".equals(var_attrvalue120)) && (!((Object)false).equals(var_attrvalue120))));
            if (var_shoulddisplayattr123) {
                out.write(" data-saveriderinfourl");
                {
                    boolean var_istrueattr122 = (var_attrvalue120.equals(true));
                    if (!var_istrueattr122) {
                        out.write("=\"");
                        out.write(renderContext.getObjectModel().toString(var_attrcontent121));
                        out.write("\"");
                    }
                }
            }
        }
    }
}
{
    Object var_attrvalue124 = renderContext.getObjectModel().resolveProperty(_global_model, "termsAndConditionValidation");
    {
        Object var_attrcontent125 = renderContext.call("xss", var_attrvalue124, "attribute");
        {
            boolean var_shoulddisplayattr127 = (((null != var_attrcontent125) && (!"".equals(var_attrcontent125))) && ((!"".equals(var_attrvalue124)) && (!((Object)false).equals(var_attrvalue124))));
            if (var_shoulddisplayattr127) {
                out.write(" data-termsandconditionvalidation");
                {
                    boolean var_istrueattr126 = (var_attrvalue124.equals(true));
                    if (!var_istrueattr126) {
                        out.write("=\"");
                        out.write(renderContext.getObjectModel().toString(var_attrcontent125));
                        out.write("\"");
                    }
                }
            }
        }
    }
}
{
    Object var_attrvalue128 = renderContext.getObjectModel().resolveProperty(renderContext.getObjectModel().resolveProperty(_dynamic_caconfig, "com.re.wanderlust.core.caconfig.APIUrlsConfig"), "tripDropDown");
    {
        Object var_attrcontent129 = renderContext.call("xss", var_attrvalue128, "attribute");
        {
            boolean var_shoulddisplayattr131 = (((null != var_attrcontent129) && (!"".equals(var_attrcontent129))) && ((!"".equals(var_attrvalue128)) && (!((Object)false).equals(var_attrvalue128))));
            if (var_shoulddisplayattr131) {
                out.write(" data-tripdropdownurl");
                {
                    boolean var_istrueattr130 = (var_attrvalue128.equals(true));
                    if (!var_istrueattr130) {
                        out.write("=\"");
                        out.write(renderContext.getObjectModel().toString(var_attrcontent129));
                        out.write("\"");
                    }
                }
            }
        }
    }
}
{
    Object var_attrvalue132 = renderContext.getObjectModel().resolveProperty(renderContext.getObjectModel().resolveProperty(_dynamic_caconfig, "com.re.wanderlust.core.caconfig.CookieConfig"), "userCookieName");
    {
        Object var_attrcontent133 = renderContext.call("xss", var_attrvalue132, "attribute");
        {
            boolean var_shoulddisplayattr135 = (((null != var_attrcontent133) && (!"".equals(var_attrcontent133))) && ((!"".equals(var_attrvalue132)) && (!((Object)false).equals(var_attrvalue132))));
            if (var_shoulddisplayattr135) {
                out.write(" data-usercookiename");
                {
                    boolean var_istrueattr134 = (var_attrvalue132.equals(true));
                    if (!var_istrueattr134) {
                        out.write("=\"");
                        out.write(renderContext.getObjectModel().toString(var_attrcontent133));
                        out.write("\"");
                    }
                }
            }
        }
    }
}
{
    Object var_attrvalue136 = renderContext.getObjectModel().resolveProperty(renderContext.getObjectModel().resolveProperty(_dynamic_caconfig, "com.re.wanderlust.core.caconfig.CookieConfig"), "userLoginCookieName");
    {
        Object var_attrcontent137 = renderContext.call("xss", var_attrvalue136, "attribute");
        {
            boolean var_shoulddisplayattr139 = (((null != var_attrcontent137) && (!"".equals(var_attrcontent137))) && ((!"".equals(var_attrvalue136)) && (!((Object)false).equals(var_attrvalue136))));
            if (var_shoulddisplayattr139) {
                out.write(" data-userlogincookiename");
                {
                    boolean var_istrueattr138 = (var_attrvalue136.equals(true));
                    if (!var_istrueattr138) {
                        out.write("=\"");
                        out.write(renderContext.getObjectModel().toString(var_attrcontent137));
                        out.write("\"");
                    }
                }
            }
        }
    }
}
{
    Object var_attrvalue140 = renderContext.getObjectModel().resolveProperty(renderContext.getObjectModel().resolveProperty(_dynamic_caconfig, "com.re.wanderlust.core.caconfig.APIUrlsConfig"), "vasBookingApi");
    {
        Object var_attrcontent141 = renderContext.call("xss", var_attrvalue140, "attribute");
        {
            boolean var_shoulddisplayattr143 = (((null != var_attrcontent141) && (!"".equals(var_attrcontent141))) && ((!"".equals(var_attrvalue140)) && (!((Object)false).equals(var_attrvalue140))));
            if (var_shoulddisplayattr143) {
                out.write(" data-vasbookingapi");
                {
                    boolean var_istrueattr142 = (var_attrvalue140.equals(true));
                    if (!var_istrueattr142) {
                        out.write("=\"");
                        out.write(renderContext.getObjectModel().toString(var_attrcontent141));
                        out.write("\"");
                    }
                }
            }
        }
    }
}
{
    Object var_attrvalue144 = renderContext.getObjectModel().resolveProperty(renderContext.getObjectModel().resolveProperty(_dynamic_caconfig, "com.re.wanderlust.core.caconfig.APIKeysConfig"), "razorpayKeyId");
    {
        Object var_attrcontent145 = renderContext.call("xss", var_attrvalue144, "attribute");
        {
            boolean var_shoulddisplayattr147 = (((null != var_attrcontent145) && (!"".equals(var_attrcontent145))) && ((!"".equals(var_attrvalue144)) && (!((Object)false).equals(var_attrvalue144))));
            if (var_shoulddisplayattr147) {
                out.write(" data-razorpaykeyid");
                {
                    boolean var_istrueattr146 = (var_attrvalue144.equals(true));
                    if (!var_istrueattr146) {
                        out.write("=\"");
                        out.write(renderContext.getObjectModel().toString(var_attrcontent145));
                        out.write("\"");
                    }
                }
            }
        }
    }
}
{
    Object var_attrvalue148 = renderContext.getObjectModel().resolveProperty(renderContext.getObjectModel().resolveProperty(_dynamic_caconfig, "com.re.wanderlust.core.caconfig.APIUrlsConfig"), "paymentDetailsAPIUrl");
    {
        Object var_attrcontent149 = renderContext.call("xss", var_attrvalue148, "attribute");
        {
            boolean var_shoulddisplayattr151 = (((null != var_attrcontent149) && (!"".equals(var_attrcontent149))) && ((!"".equals(var_attrvalue148)) && (!((Object)false).equals(var_attrvalue148))));
            if (var_shoulddisplayattr151) {
                out.write(" data-paymentDetailsAPIUrl");
                {
                    boolean var_istrueattr150 = (var_attrvalue148.equals(true));
                    if (!var_istrueattr150) {
                        out.write("=\"");
                        out.write(renderContext.getObjectModel().toString(var_attrcontent149));
                        out.write("\"");
                    }
                }
            }
        }
    }
}
out.write(">\r\n            <div class=\"row\">\r\n                <!-- form container -->\r\n                ");
_global_bookingcontainertemplate = renderContext.call("use", "bookingContainer.html", obj());
out.write("\r\n                    ");
{
    Object var_templatevar152 = renderContext.getObjectModel().resolveProperty(_global_bookingcontainertemplate, "BookingContainer");
    {
        Object var_templateoptions153_field$_bookingcontainer = _global_model;
        {
            java.util.Map var_templateoptions153 = obj().with("bookingContainer", var_templateoptions153_field$_bookingcontainer);
            callUnit(out, renderContext, var_templatevar152, var_templateoptions153);
        }
    }
}
out.write("\r\n                \r\n                <!-- form container end -->\r\n                <!-- billing address -->\r\n                <div class=\"col-lg-8 p-mb-0\">\r\n                    <div class=\"accordion add-details accordion add-details py-3\" id=\"add-billing-details\">\r\n                        <div class=\"accordion-item rounded-0 border-0\">\r\n                            <h2 class=\"accordion-header heading\" id=\"billingDetail\">\r\n                                <button class=\"accordion-button rounded-0 collapsed\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#collapseBilling\" aria-expanded=\"false\" aria-controls=\"#collapseBilling\">");
{
    String var_154 = (("\r\n                                    " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "billingAddressLabel"), "text"))) + "\r\n                                    ");
    out.write(renderContext.getObjectModel().toString(var_154));
}
out.write("<div class=\"d-flex position-absolute ride-count\">\r\n                                        <span class=\"icon-arrow-down\"></span>\r\n                                    </div>\r\n                                </button>\r\n                            </h2>\r\n                            <div id=\"collapseBilling\" class=\"accordion-collapse collapse\" aria-labelledby=\"billingDetail\" data-bs-parent=\"#add-billing-details\">\r\n                                <div class=\"accordion-body bg-black\" id=\"billingAddress\">\r\n                                    <form>\r\n                                        <div class=\"row\">\r\n                                            <div class=\"col-md-12 pb-4\">\r\n                                                <input type=\"text\" class=\"form-control bg-transparent text-white rounded-0 billingAddress\" id=\"addressLine\"");
{
    Object var_attrvalue155 = renderContext.getObjectModel().resolveProperty(_global_model, "addressPlaceholder");
    {
        Object var_attrcontent156 = renderContext.call("xss", var_attrvalue155, "attribute");
        {
            boolean var_shoulddisplayattr158 = (((null != var_attrcontent156) && (!"".equals(var_attrcontent156))) && ((!"".equals(var_attrvalue155)) && (!((Object)false).equals(var_attrvalue155))));
            if (var_shoulddisplayattr158) {
                out.write(" placeholder");
                {
                    boolean var_istrueattr157 = (var_attrvalue155.equals(true));
                    if (!var_istrueattr157) {
                        out.write("=\"");
                        out.write(renderContext.getObjectModel().toString(var_attrcontent156));
                        out.write("\"");
                    }
                }
            }
        }
    }
}
out.write(" name=\"billingAddress\"/>\r\n                                                <div class=\"error-msg pt-2 billingAddressValidation\" hidden>");
{
    String var_159 = ("\r\n                                                    " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "addressValidation"), "text")));
    out.write(renderContext.getObjectModel().toString(var_159));
}
out.write("</div>\r\n                                            </div>\r\n                                        </div>\r\n                                        <div class=\"row\">\r\n                                            <div class=\"col-md-6 col-12 pb-4\">\r\n                                                <input type=\"text\" class=\"form-control bg-transparent text-white rounded-0 billingPincode\" id=\"pinCode\"");
{
    Object var_attrvalue160 = renderContext.getObjectModel().resolveProperty(_global_model, "pincodePlaceholder");
    {
        Object var_attrcontent161 = renderContext.call("xss", var_attrvalue160, "attribute");
        {
            boolean var_shoulddisplayattr163 = (((null != var_attrcontent161) && (!"".equals(var_attrcontent161))) && ((!"".equals(var_attrvalue160)) && (!((Object)false).equals(var_attrvalue160))));
            if (var_shoulddisplayattr163) {
                out.write(" placeholder");
                {
                    boolean var_istrueattr162 = (var_attrvalue160.equals(true));
                    if (!var_istrueattr162) {
                        out.write("=\"");
                        out.write(renderContext.getObjectModel().toString(var_attrcontent161));
                        out.write("\"");
                    }
                }
            }
        }
    }
}
out.write(" name=\"billingPincode\"/>\r\n                                                <div class=\"error-msg pt-2 billingPinCodeValidation\" hidden>");
{
    String var_164 = ("\r\n                                                    " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "pincodeValidation"), "text")));
    out.write(renderContext.getObjectModel().toString(var_164));
}
out.write("</div>\r\n                                            </div>\r\n                                        </div>\r\n                                        <div class=\"row\">\r\n                                            <div class=\"col-md-6 col-12 pb-4\">\r\n                                                <select name=\"stateSelect\" type=\"select\" class=\"form-select bg-transparent text-white rounded-0 state\">\r\n                                                    <option value=\"State\">");
{
    Object var_165 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "statePlaceholder"), "text");
    out.write(renderContext.getObjectModel().toString(var_165));
}
out.write("</option>\r\n                                                </select>\r\n                                            </div>\r\n                                            <div class=\"col-md-6 col-12 pb-4\">\r\n                                                <select name=\"citySelect\" type=\"select\" class=\"form-select bg-transparent text-white rounded-0 city\">\r\n                                                    <option value=\"City\">");
{
    Object var_166 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "cityPlaceholder"), "text");
    out.write(renderContext.getObjectModel().toString(var_166));
}
out.write("</option>\r\n                                                </select>\r\n                                            </div>\r\n                                        </div>\r\n                                    </form>\r\n                                    <div class=\"row\">\r\n                                        <div class=\"col-12 col-md-auto\" style=\"min-width: 200px;\">\r\n                                            <div class=\"button button__primary-v2\">\r\n                                                <button class=\"cmp-button rounded-0 billingAddressButton\">\r\n                                                    <span class=\"cmp-text\">");
{
    Object var_167 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "submitCtaLabel"), "text");
    out.write(renderContext.getObjectModel().toString(var_167));
}
out.write("</span>\r\n                                                    <span class=\"cmp-icon-after icon-arrow-r position-absolute top-0 end-0 bottom-0 text-white bg-primary d-flex flex-wrap align-items-center justify-content-center\">\r\n                                                    </span>\r\n                                                </button>\r\n                                            </div>\r\n                                        </div>\r\n                                    </div>\r\n                                </div>\r\n                            </div>\r\n                        </div>\r\n                    </div>\r\n                </div>\r\n                <!-- billing address end -->\r\n                <!-- gst invoice -->\r\n                ");
{
    boolean var_testvariable168 = (org.apache.sling.scripting.sightly.compiler.expression.nodes.BinaryOperator.strictEq(renderContext.getObjectModel().resolveProperty(_global_model, "showGst"), "true"));
    if (var_testvariable168) {
        out.write("<div class=\"col-lg-8 p-mb-0\">\r\n                    <div class=\"accordion add-details\" id=\"add-gst-details\">\r\n                        <div class=\"accordion-item rounded-0 border-0\" id=\"gstForm\">\r\n                            <h2 class=\"accordion-header heading\" id=\"gstDetail\">\r\n                                <button class=\"accordion-button rounded-0 collapsed\" type=\"button\" data-bs-toggle=\"collapse\" aria-expanded=\"false\" aria-controls=\"#collapseGst\">\r\n                                    <label class=\"custom-check pe-5\">\r\n                                        <label>");
        {
            Object var_169 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "useGstDetail"), "text");
            out.write(renderContext.getObjectModel().toString(var_169));
        }
        out.write("</label>\r\n                                        <input type=\"checkbox\" class=\"form-check-input gstFormCheckBox\" name=\"gstFormCheckBox\" id=\"checkReading\" data-check=\"disabled\"/>\r\n                                        <span class=\"checkmark\"></span>\r\n                                    </label>\r\n                                </button>\r\n                            </h2>\r\n                            <div id=\"collapseGst\" class=\"accordion-collapse collapse\" aria-labelledby=\"gstDetail\" data-bs-parent=\"#add-gst-details\">\r\n                                <div class=\"accordion-body bg-black\">\r\n                                    <div class=\"row\">\r\n                                        <div class=\"col-md-6 pb-4\">\r\n                                            <label>");
        {
            Object var_170 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "gstNumberLabel"), "text");
            out.write(renderContext.getObjectModel().toString(var_170));
        }
        out.write("</label>\r\n                                            <input type=\"text\" class=\"form-control rounded-0 bg-transparent text-white gstNumber gst\" id=\"gstNumber\" name=\"gstNumber\"");
        {
            Object var_attrvalue171 = renderContext.getObjectModel().resolveProperty(_global_model, "gstNumberPlaceholder");
            {
                Object var_attrcontent172 = renderContext.call("xss", var_attrvalue171, "attribute");
                {
                    boolean var_shoulddisplayattr174 = (((null != var_attrcontent172) && (!"".equals(var_attrcontent172))) && ((!"".equals(var_attrvalue171)) && (!((Object)false).equals(var_attrvalue171))));
                    if (var_shoulddisplayattr174) {
                        out.write(" placeholder");
                        {
                            boolean var_istrueattr173 = (var_attrvalue171.equals(true));
                            if (!var_istrueattr173) {
                                out.write("=\"");
                                out.write(renderContext.getObjectModel().toString(var_attrcontent172));
                                out.write("\"");
                            }
                        }
                    }
                }
            }
        }
        out.write("/>\r\n                                            <div class=\"error-msg pt-2 gstNumberValidation\" hidden>");
        {
            String var_175 = ("\r\n                                                " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "gstNumberValidation"), "text")));
            out.write(renderContext.getObjectModel().toString(var_175));
        }
        out.write("</div>\r\n                                        </div>\r\n                                        <div class=\"col-md-6 pb-4\">\r\n                                            <label>");
        {
            Object var_176 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "companyNameLabel"), "text");
            out.write(renderContext.getObjectModel().toString(var_176));
        }
        out.write("</label>\r\n                                            <input type=\"text\" class=\"form-control bg-transparent text-white rounded-0 companyName gst\" id=\"companyName\" name=\"companyName\"");
        {
            Object var_attrvalue177 = renderContext.getObjectModel().resolveProperty(_global_model, "companyNamePlaceholder");
            {
                Object var_attrcontent178 = renderContext.call("xss", var_attrvalue177, "attribute");
                {
                    boolean var_shoulddisplayattr180 = (((null != var_attrcontent178) && (!"".equals(var_attrcontent178))) && ((!"".equals(var_attrvalue177)) && (!((Object)false).equals(var_attrvalue177))));
                    if (var_shoulddisplayattr180) {
                        out.write(" placeholder");
                        {
                            boolean var_istrueattr179 = (var_attrvalue177.equals(true));
                            if (!var_istrueattr179) {
                                out.write("=\"");
                                out.write(renderContext.getObjectModel().toString(var_attrcontent178));
                                out.write("\"");
                            }
                        }
                    }
                }
            }
        }
        out.write("/>\r\n                                            <div class=\"error-msg pt-2 companyNameValidation\" hidden>");
        {
            String var_181 = ("\r\n                                                " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "companyNameValidation"), "text")));
            out.write(renderContext.getObjectModel().toString(var_181));
        }
        out.write("</div>\r\n                                        </div>\r\n                                    </div>\r\n                                    <div class=\"row\">\r\n                                        <div class=\"col-md-6 pb-4\">\r\n                                            <label>");
        {
            Object var_182 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "addressLabel"), "text");
            out.write(renderContext.getObjectModel().toString(var_182));
        }
        out.write("</label>\r\n                                            <input type=\"address\" class=\"form-control bg-transparent text-white rounded-0 gstAddress gst\" id=\"address\" name=\"address\"");
        {
            Object var_attrvalue183 = renderContext.getObjectModel().resolveProperty(_global_model, "addressPlaceholder");
            {
                Object var_attrcontent184 = renderContext.call("xss", var_attrvalue183, "attribute");
                {
                    boolean var_shoulddisplayattr186 = (((null != var_attrcontent184) && (!"".equals(var_attrcontent184))) && ((!"".equals(var_attrvalue183)) && (!((Object)false).equals(var_attrvalue183))));
                    if (var_shoulddisplayattr186) {
                        out.write(" placeholder");
                        {
                            boolean var_istrueattr185 = (var_attrvalue183.equals(true));
                            if (!var_istrueattr185) {
                                out.write("=\"");
                                out.write(renderContext.getObjectModel().toString(var_attrcontent184));
                                out.write("\"");
                            }
                        }
                    }
                }
            }
        }
        out.write("/>\r\n                                            <div class=\"error-msg pt-2 gstAddressValidation\" hidden>");
        {
            String var_187 = ("\r\n                                                " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "addressValidation"), "text")));
            out.write(renderContext.getObjectModel().toString(var_187));
        }
        out.write("</div>\r\n                                        </div>\r\n                                        <div class=\"col-md-6 pb-4\">\r\n                                            <label>");
        {
            Object var_188 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "pincodeLabel"), "text");
            out.write(renderContext.getObjectModel().toString(var_188));
        }
        out.write("</label>\r\n                                            <div class=\"d-flex\">\r\n                                                <input type=\"text\" class=\"form-control bg-transparent text-white rounded-0 gstPincode gst\" id=\"pincode\"");
        {
            Object var_attrvalue189 = renderContext.getObjectModel().resolveProperty(_global_model, "pincodePlaceholder");
            {
                Object var_attrcontent190 = renderContext.call("xss", var_attrvalue189, "attribute");
                {
                    boolean var_shoulddisplayattr192 = (((null != var_attrcontent190) && (!"".equals(var_attrcontent190))) && ((!"".equals(var_attrvalue189)) && (!((Object)false).equals(var_attrvalue189))));
                    if (var_shoulddisplayattr192) {
                        out.write(" placeholder");
                        {
                            boolean var_istrueattr191 = (var_attrvalue189.equals(true));
                            if (!var_istrueattr191) {
                                out.write("=\"");
                                out.write(renderContext.getObjectModel().toString(var_attrcontent190));
                                out.write("\"");
                            }
                        }
                    }
                }
            }
        }
        out.write(" name=\"gstPincode\"/>\r\n                                                <div class=\"d-flex\">\r\n                                                    <button id=\"pincodeLocate\" class=\"btn btn-primary w-100 rounded-0 locate bg-dark border-color\">");
        {
            Object var_193 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "pincodeCtaLabel"), "text");
            out.write(renderContext.getObjectModel().toString(var_193));
        }
        out.write("<span class=\"icon-arrow-r\"></span></button>\r\n                                                </div>\r\n                                            </div>\r\n                                            <div class=\"error-msg pt-2 gstPincodeValidation\" hidden>");
        {
            String var_194 = ("\r\n                                                " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "pincodeValidation"), "text")));
            out.write(renderContext.getObjectModel().toString(var_194));
        }
        out.write("</div>\r\n                                        </div>\r\n                                    </div>\r\n                                    <div class=\"row stateCity\" hidden>\r\n                                        <div class=\"col-md-3 font-white\">");
        {
            Object var_195 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "stateLabel"), "text");
            out.write(renderContext.getObjectModel().toString(var_195));
        }
        out.write("<span class=\"d-block py-2 stateForGst\"></span></div>\r\n                                        <div class=\"col-md-3 font-white\">");
        {
            Object var_196 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "cityLabel"), "text");
            out.write(renderContext.getObjectModel().toString(var_196));
        }
        out.write("<span class=\"d-block py-2 cityForGst\"></span></div>\r\n                                    </div>\r\n                                    <p class=\"py-4\">");
        {
            Object var_197 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "extraInfoForGst"), "text");
            out.write(renderContext.getObjectModel().toString(var_197));
        }
        out.write("</p>\r\n                                </div>\r\n                            </div>\r\n                        </div>\r\n                    </div>\r\n                    <div class=\"error-msg pt-2 addressSavedValidation\" hidden>");
        {
            Object var_198 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "addressSavedValidation"), "text");
            out.write(renderContext.getObjectModel().toString(var_198));
        }
        out.write("</div>\r\n                </div>");
    }
}
out.write("\r\n                <!-- gst invoice end -->\r\n                <!-- inclusion and t_and_c -->\r\n                <div class=\"col-lg-8 p-mb-0\">\r\n                    <div class=\"d-flex\">\r\n                        <ul class=\"accessories \">\r\n                            <span class=\"text-decoration-underline pt-5 pb-3 d-block\">");
{
    Object var_199 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "inclusionsLabel"), "text");
    out.write(renderContext.getObjectModel().toString(var_199));
}
out.write("</span>\r\n                            ");
{
    Object var_collectionvar200 = renderContext.getObjectModel().resolveProperty(_global_model, "inclusionListItem");
    {
        long var_size201 = ((var_collectionvar200_list_coerced$ == null ? (var_collectionvar200_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar200)) : var_collectionvar200_list_coerced$).size());
        {
            boolean var_notempty202 = (var_size201 > 0);
            if (var_notempty202) {
                {
                    long var_end205 = var_size201;
                    {
                        boolean var_validstartstepend206 = (((0 < var_size201) && true) && (var_end205 > 0));
                        if (var_validstartstepend206) {
                            if (var_collectionvar200_list_coerced$ == null) {
                                var_collectionvar200_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar200);
                            }
                            long var_index207 = 0;
                            for (Object item : var_collectionvar200_list_coerced$) {
                                {
                                    boolean var_traversal209 = (((var_index207 >= 0) && (var_index207 <= var_end205)) && true);
                                    if (var_traversal209) {
                                        out.write("<li>");
                                        {
                                            Object var_210 = renderContext.call("xss", item, "text");
                                            out.write(renderContext.getObjectModel().toString(var_210));
                                        }
                                        out.write("</li>\n");
                                    }
                                }
                                var_index207++;
                            }
                        }
                    }
                }
            }
        }
    }
    var_collectionvar200_list_coerced$ = null;
}
out.write("\r\n                        </ul>\r\n                    </div>\r\n                    <div class=\"px-3 px-md-0\">\r\n                        <div class=\"col-12 pb-4\">\r\n                            <label class=\"custom-check\">\r\n                                <label for=\"termsAndCondition\">");
{
    Object var_211 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "termsAndCondition"), "text");
    out.write(renderContext.getObjectModel().toString(var_211));
}
out.write("</label>\r\n                                <input type=\"checkbox\" class=\"form-check-input termsAndCondition\" name=\"termsAndCondition\" id=\"termsAndCondition\"/>\r\n                                <span class=\"checkmark\"></span>\r\n                            </label>\r\n                        </div>\r\n                    </div>\r\n                </div>\r\n                <!-- cart -->\r\n                <div class=\"col-lg-4 p-mb-0\">\r\n                    <div class=\"booking-summary position-relative\">\r\n                        <div class=\"p-3 p-md-4\">\r\n                            <div class=\"title\">\r\n                                <div data-cmp-data-layer=\"{&quot;title-c6fe1860ab&quot;:{&quot;@type&quot;:&quot;core-components-examples/components/title&quot;,&quot;dc:title&quot;:&quot;Title&quot;}}\" id=\"title-c6fe1860ab\" class=\"cmp-title\">\r\n                                    <h4 class=\"cmp-title__text\">");
{
    Object var_212 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "paymentTitle"), "text");
    out.write(renderContext.getObjectModel().toString(var_212));
}
out.write("</h4>\r\n                                </div>\r\n                            </div>\r\n                            <div class=\"py-3\">\r\n                                <div class=\"input-group mb-3\">\r\n                                    <input class=\"rounded-0 form-control promocodeInput\" id=\"promoCode\"");
{
    Object var_attrvalue213 = renderContext.getObjectModel().resolveProperty(_global_model, "promocodePlaceholder");
    {
        Object var_attrcontent214 = renderContext.call("xss", var_attrvalue213, "attribute");
        {
            boolean var_shoulddisplayattr216 = (((null != var_attrcontent214) && (!"".equals(var_attrcontent214))) && ((!"".equals(var_attrvalue213)) && (!((Object)false).equals(var_attrvalue213))));
            if (var_shoulddisplayattr216) {
                out.write(" placeholder");
                {
                    boolean var_istrueattr215 = (var_attrvalue213.equals(true));
                    if (!var_istrueattr215) {
                        out.write("=\"");
                        out.write(renderContext.getObjectModel().toString(var_attrcontent214));
                        out.write("\"");
                    }
                }
            }
        }
    }
}
out.write(" type=\"promoCode\"/>\r\n                                    <div class=\"button__white-outline\">\r\n                                        <button class=\"rounded-0 cmp-button promocode px-4\" type=\"submit\">\r\n                                            <span class=\"cmp-text\">");
{
    Object var_217 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "applyCtaLabel"), "text");
    out.write(renderContext.getObjectModel().toString(var_217));
}
out.write("</span>\r\n                                        </button>\r\n                                    </div>\r\n                                </div>\r\n                                <div class=\"pt-2 error-msg successPromoValidation text-success\" hidden>");
{
    String var_218 = ("\r\n                                    " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "successPromoValidation"), "text")));
    out.write(renderContext.getObjectModel().toString(var_218));
}
out.write("</div>\r\n                                <div class=\"pt-2 error-msg failurePromoValidation\" hidden>");
{
    String var_219 = ("\r\n                                    " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "failurePromoValidation"), "text")));
    out.write(renderContext.getObjectModel().toString(var_219));
}
out.write("</div>\r\n                            </div>\r\n                            <div class=\"d-flex pt-2\">\r\n                                <div class=\"col-md-6\">");
{
    Object var_220 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "subtotalLabel"), "text");
    out.write(renderContext.getObjectModel().toString(var_220));
}
out.write("</div>\r\n                                <div class=\"col-md-6 text-end subtotal\"></div>\r\n                            </div>\r\n                            <div class=\"pt-2 d-md-flex d-none\">\r\n                                <p class=\"mb-0\">");
{
    Object var_221 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "includeAllTaxLabel"), "text");
    out.write(renderContext.getObjectModel().toString(var_221));
}
out.write("</p>\r\n                            </div>\r\n                            <div class=\"d-flex pt-2\">\r\n                                <div class=\"col-md-6 promocodeVal\" hidden>");
{
    Object var_222 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "discountLabel"), "text");
    out.write(renderContext.getObjectModel().toString(var_222));
}
out.write("</div>\r\n                                <div class=\"col-md-6 text-end promocodeAmount\" hidden></div>\r\n                            </div>\r\n                        </div>\r\n                        <div class=\"d-md-flex d-none flex-wrap border-top pt-4 px-4\">\r\n                            <div class=\"col-md-6\">");
{
    Object var_223 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "grandtotalLabel"), "text");
    out.write(renderContext.getObjectModel().toString(var_223));
}
out.write("</div>\r\n                            <div class=\"col-md-6 text-end grandTotal\"></div>\r\n                        </div>\r\n                        <div class=\"d-md-flex d-none flex-wrap bg-neutrak-dark-grey p-3 p-md-4\">\r\n                            <script");
{
    Object var_attrvalue224 = renderContext.getObjectModel().resolveProperty(renderContext.getObjectModel().resolveProperty(_dynamic_caconfig, "com.re.wanderlust.core.caconfig.APIUrlsConfig"), "razorPayUrl");
    {
        Object var_attrcontent225 = renderContext.call("xss", var_attrvalue224, "uri");
        {
            boolean var_shoulddisplayattr227 = (((null != var_attrcontent225) && (!"".equals(var_attrcontent225))) && ((!"".equals(var_attrvalue224)) && (!((Object)false).equals(var_attrvalue224))));
            if (var_shoulddisplayattr227) {
                out.write(" src");
                {
                    boolean var_istrueattr226 = (var_attrvalue224.equals(true));
                    if (!var_istrueattr226) {
                        out.write("=\"");
                        out.write(renderContext.getObjectModel().toString(var_attrcontent225));
                        out.write("\"");
                    }
                }
            }
        }
    }
}
out.write("></script>\r\n                            <div class=\"col-12 button button__primary-v2\"><button class=\"rounded-0 cmp-button position-relative proceedToPay\">\r\n                                    <span class=\"cmp-icon-before cmp-icon\"></span>\r\n                                    <span class=\"cmp-text\">");
{
    Object var_228 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "proceedToPayCtaLabel"), "text");
    out.write(renderContext.getObjectModel().toString(var_228));
}
out.write("</span>\r\n                                    <span class=\"d-flex justify-content-center align-items-center bg-primary bottom-0 cmp-icon cmp-icon-after end-0 flex-wrap icon-arrow-r position-absolute text-white top-0\"></span></button>\r\n                            </div>\r\n                        </div>\r\n                    </div>\r\n                </div>\r\n            </div>\r\n\r\n        </div>\r\n        <div class=\"modal modal__checkPolicy text\" id=\"checkPolicyPopup\">\r\n            <div class=\"modal-dialog modal-dialog-centered\">\r\n                <div class=\"rounded-0 bg-dark modal-content\">\r\n                    <div class=\"modal-header\">\r\n                        <h4 class=\"modal-title\" id=\"business_name\"></h4>\r\n                        <button class=\"border-0 btn-close\" type=\"button\" data-bs-dismiss=\"modal\" title=\"close\"><span class=\"icon-close\"></span></button>\r\n                    </div>\r\n                    ");
_global_value = renderContext.getObjectModel().resolveProperty(_global_model, "authoringFieldTours");
out.write("<div class=\"modal-body\">\r\n                        <h5 class=\"pb-3\">");
{
    Object var_229 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_value, "cancellationPolicy"), "text");
    out.write(renderContext.getObjectModel().toString(var_229));
}
out.write("</h5>\r\n                        <p class=\"color-light-color-font font-size-2 pb-4\">");
{
    Object var_230 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_value, "description"), "html");
    out.write(renderContext.getObjectModel().toString(var_230));
}
out.write("</p>\r\n                        <div class=\"col-12 policy-data\">\r\n                            <div class=\"d-flex py-2 px-3 bg-neutral-black-grey-base\">\r\n                                <div class=\"color-light-color-font col-5 col-md-4\">");
{
    Object var_231 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_value, "timeFrameLabel"), "text");
    out.write(renderContext.getObjectModel().toString(var_231));
}
out.write("</div>\r\n                                <div class=\"color-light-color-font col-7 col-md-8\">");
{
    String var_232 = ("\r\n                                    " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_value, "cancellationAmountLabel"), "text")));
    out.write(renderContext.getObjectModel().toString(var_232));
}
out.write("</div>\r\n                            </div>\r\n                            <div class=\"d-flex py-2 px-3\">\r\n                                <div class=\"col-5 col-md-4\"><span class=\"d-block\">");
{
    Object var_233 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_value, "betweenLabel"), "text");
    out.write(renderContext.getObjectModel().toString(var_233));
}
out.write("</span>");
{
    String var_234 = ("\r\n                                    " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_value, "daysLessThanFirstWarningLabel"), "text")));
    out.write(renderContext.getObjectModel().toString(var_234));
}
out.write("</div>\r\n                                <div class=\"col-7 col-md-8\"><span class=\"text-white fs-6\" id=\"daysLessThanFirstWarningLabel\"></span>");
{
    String var_235 = ("\r\n                                    " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_value, "bookingAmountLabel"), "text")));
    out.write(renderContext.getObjectModel().toString(var_235));
}
out.write("</div>\r\n                            </div>\r\n                            <div class=\"d-flex py-2 px-3\">\r\n                                <div class=\"col-5 col-md-4\"><span class=\"d-block\">");
{
    Object var_236 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_value, "betweenLabel"), "text");
    out.write(renderContext.getObjectModel().toString(var_236));
}
out.write("</span>");
{
    String var_237 = ("\r\n                                    " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_value, "daysLessThanSecondWarningLabel"), "text")));
    out.write(renderContext.getObjectModel().toString(var_237));
}
out.write("</div>\r\n                                <div class=\"col-7 col-md-8\"><span class=\"text-white fs-6\" id=\"daysLessThanSecondWarningLabel\"></span>");
{
    String var_238 = ("\r\n                                    " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_value, "bookingAmountLabel"), "text")));
    out.write(renderContext.getObjectModel().toString(var_238));
}
out.write("</div>\r\n                            </div>\r\n                            <div class=\"d-flex py-2 px-3\">\r\n                                <div class=\"col-5 col-md-4\"><span class=\"d-block\">");
{
    Object var_239 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_value, "betweenLabel"), "text");
    out.write(renderContext.getObjectModel().toString(var_239));
}
out.write("</span>");
{
    String var_240 = ("\r\n                                    " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_value, "daysLessThanThirdWarningLabel"), "text")));
    out.write(renderContext.getObjectModel().toString(var_240));
}
out.write("</div>\r\n                                <div class=\"col-7 col-md-8\"><span class=\"text-white fs-6 col-7 col-md-8\" id=\"daysLessThanThirdWarningLabel\"></span>");
{
    String var_241 = ("\r\n                                    " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_value, "bookingAmountLabel"), "text")));
    out.write(renderContext.getObjectModel().toString(var_241));
}
out.write("</div>\r\n                            </div>\r\n                        </div>\r\n                        ");
{
    String var_242 = (((((((((((((((((("<!-- <div class=\"late-returns py-4\">\r\n                            <h5 class=py-3>" + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "lateReturnsLabel"), "comment"))) + "</h5>\r\n                            <p class=\"color-light-color-font font-size-2 pb-4\"\r\n                                data-sly-test=\"") + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_value, "lateReturnsLabel"), "comment"))) + "\">\r\n                                ") + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "lateReturnsLabel"), "comment"))) + "</p>\r\n                            <div class=\"col-12\">\r\n                                <div class=\"d-flex\">\r\n                                    <div class=\"col-3\">\r\n                                        <span\r\n                                            class=\"color-light-color-font font-size-2 d-block\">") + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "lateReturnFirstWarningLabel"), "comment"))) + "\r\n                                            <span\r\n                                                class=\"color-light-color-font font-size-2 d-block\">") + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "currencyType"), "comment"))) + "<span\r\n                                                    id=\"lateReturnFirstWarningLabel\"></span></span></span>\r\n                                    </div>\r\n                                    <div class=\"col-3\">") + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "lateReturnSecondWarningLabel"), "comment"))) + " <span\r\n                                            class=\"color-light-color-font font-size-2 d-block\">") + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "currencyType"), "comment"))) + "\r\n                                            <span id=\"lateReturnSecondWarningLabel\"></span></span></div>\r\n                                    <div class=\"col-6\">") + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "lateReturnThirdWarningLabel"), "comment"))) + " <span\r\n                                            class=\"color-light-color-font font-size-2 d-block\">") + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "currencyType"), "comment"))) + "\r\n                                            <span id=\"lateReturnThirdWarningLabel\"></span></span></div>\r\n                                </div>\r\n                            </div>\r\n                        </div> -->");
    out.write(renderContext.getObjectModel().toString(var_242));
}
out.write("\r\n                        <div class=\"d-flex justify-content-center close-cancellation-modal col-12\">\r\n                            <button class=\"rounded-0 bg-light btn submit\" type=\"button\" data-bs-dismiss=\"modal\" id=\"closeCancellationPopup\">");
{
    Object var_243 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_value, "closeBtnLabel"), "text");
    out.write(renderContext.getObjectModel().toString(var_243));
}
out.write("</button>\r\n                        </div>\r\n                    </div>\r\n                </div>\r\n            </div>\r\n        </div>\r\n        <div class=\"modal fade modal__termsCondition\" id=\"termsConditionModal\" aria-hidden=\"true\" aria-labelledby=\"termsConditionModalLabel\" tabindex=\"-1\">\r\n            <div class=\"modal-dialog modal-dialog-centered modal-dialog-scrollable modal-lg\">\r\n                <div class=\"rounded-0 bg-dark modal-content border-0\">\r\n                    <div class=\"modal-header\">\r\n                        <h5 class=\"modal-title\" id=\"termsConditionModalLabel\">");
{
    Object var_244 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "tncModelTitle"), "text");
    out.write(renderContext.getObjectModel().toString(var_244));
}
out.write("</h5>\r\n                        <button class=\"text-white bg-transparent btn-close\" type=\"button\" data-bs-dismiss=\"modal\" aria-label=\"Close\"><span class=\"icon-close\"></span></button>\r\n                    </div>\r\n                    <div class=\"modal-body\">");
{
    Object var_245 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "tncLongMessage"), "html");
    out.write(renderContext.getObjectModel().toString(var_245));
}
out.write("</div>\r\n                    <div class=\"modal-footer justify-content-center\">\r\n                        <div class=\"button button__primary-v2 m-0\" style=\"width:200px\"><button class=\"cmp-button\" type=\"button\" data-bs-dismiss=\"modal\"><span class=\"cmp-text\">");
{
    Object var_246 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "tncModelBtnTitle"), "text");
    out.write(renderContext.getObjectModel().toString(var_246));
}
out.write("</span>\r\n                                <span class=\"d-flex justify-content-center align-items-center bg-primary bottom-0 cmp-icon cmp-icon-after end-0 flex-wrap icon-arrow-r position-absolute text-white top-0\"></span></button>\r\n                        </div>\r\n                    </div>\r\n                </div>\r\n            </div>\r\n        </div>\r\n    </div><a class=\"sucessPagePath\" hidden");
{
    Object var_attrvalue247 = renderContext.call("xss", renderContext.call("uriManipulation", renderContext.getObjectModel().resolveProperty(_global_model, "successPagePath"), obj().with("extension", "html")), "uri");
    {
        boolean var_shoulddisplayattr250 = ((!"".equals(var_attrvalue247)) && (!((Object)false).equals(var_attrvalue247)));
        if (var_shoulddisplayattr250) {
            out.write(" href");
            {
                boolean var_istrueattr249 = (var_attrvalue247.equals(true));
                if (!var_istrueattr249) {
                    out.write("=\"");
                    out.write(renderContext.getObjectModel().toString(var_attrvalue247));
                    out.write("\"");
                }
            }
        }
    }
}
out.write("></a>\r\n    <a class=\"failedPagePath\" hidden");
{
    Object var_attrvalue251 = renderContext.call("xss", renderContext.call("uriManipulation", renderContext.getObjectModel().resolveProperty(_global_model, "failedPagePath"), obj().with("extension", "html")), "uri");
    {
        boolean var_shoulddisplayattr254 = ((!"".equals(var_attrvalue251)) && (!((Object)false).equals(var_attrvalue251)));
        if (var_shoulddisplayattr254) {
            out.write(" href");
            {
                boolean var_istrueattr253 = (var_attrvalue251.equals(true));
                if (!var_istrueattr253) {
                    out.write("=\"");
                    out.write(renderContext.getObjectModel().toString(var_attrvalue251));
                    out.write("\"");
                }
            }
        }
    }
}
out.write("></a>\r\n    <div class=\"d-flex justify-content-center container\">\r\n        <div class=\"d-flex py-2 bg-white col-md-3 justify-content-between px-1 ridersDetailPopup rounded-1\">\r\n            <p class=\"font-black ps-3 text-center\"><img alt=\"\" class=\"pe-2\" src=\"\"/><span class=\"message\"></span></p><a><span class=\"icon-close font-black font-size-2 pe-2\"></span></a>\r\n        </div>\r\n    </div>\r\n\r\n    <div class=\"re-page-loaders\" id=\"pageLoaders\">\r\n        <div class=\"re-page-loader-inners\">\r\n            <div class=\"fadein-elements\">\r\n                <img alt=\"Royal Enfield\" src=\"/etc.clientlibs/re-wanderlust/clientlibs/clientlib-site/resources/images/pre-loader-01.svg\"/>\r\n                <img alt=\"Royal Enfield\" src=\"/etc.clientlibs/re-wanderlust/clientlibs/clientlib-site/resources/images/pre-loader-02.svg\"/>\r\n                <img alt=\"Royal Enfield\" src=\"/etc.clientlibs/re-wanderlust/clientlibs/clientlib-site/resources/images/pre-loader-03.svg\"/>\r\n                <img alt=\"Royal Enfield\" src=\"/etc.clientlibs/re-wanderlust/clientlibs/clientlib-site/resources/images/pre-loader-04.svg\"/>\r\n                <img alt=\"Royal Enfield\" src=\"/etc.clientlibs/re-wanderlust/clientlibs/clientlib-site/resources/images/pre-loader-05.svg\"/>\r\n            </div>\r\n            <div class=\"loading-ellipsiss\">\r\n                <div></div>\r\n                <div></div>\r\n                <div></div>\r\n                <div></div>\r\n            </div>\r\n        </div>\r\n    </div>\r\n\r\n    <!-- Something went wrong Modal-->\r\n    <div class=\"modal modal__checkPolicy\" id=\"errorPopupTour\">\r\n        <div class=\"modal-dialog\">\r\n            <div class=\"modal-content bg-dark rounded-0\">\r\n                <!-- Modal Header -->\r\n\r\n                <!-- Modal body -->\r\n                <div class=\"modal-body\">\r\n                    <h3 class=\"pb-3\">");
{
    Object var_255 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "apiErrorMessage"), "text");
    out.write(renderContext.getObjectModel().toString(var_255));
}
out.write("</h3>\r\n                    <p>");
{
    Object var_256 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "apiErrorMessageDescription"), "text");
    out.write(renderContext.getObjectModel().toString(var_256));
}
out.write("</p>\r\n                </div>\r\n                <div class=\"px-3\">\r\n                    <div class=\"row\">\r\n                        <div class=\"col-12 col-md-auto py-4\">\r\n                            <div class=\"button\">\r\n                                <a");
{
    Object var_attrvalue257 = renderContext.call("xss", renderContext.call("uriManipulation", renderContext.getObjectModel().resolveProperty(_global_model, "goBackRedirectionPath"), obj().with("extension", "html")), "uri");
    {
        boolean var_shoulddisplayattr260 = ((!"".equals(var_attrvalue257)) && (!((Object)false).equals(var_attrvalue257)));
        if (var_shoulddisplayattr260) {
            out.write(" href");
            {
                boolean var_istrueattr259 = (var_attrvalue257.equals(true));
                if (!var_istrueattr259) {
                    out.write("=\"");
                    out.write(renderContext.getObjectModel().toString(var_attrvalue257));
                    out.write("\"");
                }
            }
        }
    }
}
{
    Object var_attrvalue261 = renderContext.getObjectModel().resolveProperty(_global_model, "goBackCtaLabel");
    {
        Object var_attrcontent262 = renderContext.call("xss", var_attrvalue261, "attribute");
        {
            boolean var_shoulddisplayattr264 = (((null != var_attrcontent262) && (!"".equals(var_attrcontent262))) && ((!"".equals(var_attrvalue261)) && (!((Object)false).equals(var_attrvalue261))));
            if (var_shoulddisplayattr264) {
                out.write(" title");
                {
                    boolean var_istrueattr263 = (var_attrvalue261.equals(true));
                    if (!var_istrueattr263) {
                        out.write("=\"");
                        out.write(renderContext.getObjectModel().toString(var_attrcontent262));
                        out.write("\"");
                    }
                }
            }
        }
    }
}
out.write(" class=\"cmp-button text-decoration-none rounded-0 bg-transparent text-white border-primary\">\r\n                                    <span class=\"cmp-text\">");
{
    Object var_265 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "goBackCtaLabel"), "text");
    out.write(renderContext.getObjectModel().toString(var_265));
}
out.write("</span>\r\n                                </a>\r\n                            </div>\r\n                        </div>\r\n                    </div>\r\n                </div>\r\n            </div>\r\n        </div>\r\n    </div>\r\n    <!-- End Modal-->\r\n\r\n        <!---no booking found -->\r\n        <div class=\"col-12 text-center noBookingFound bg-dark py-5 px-3 noBookingTour\">\r\n            <div class=\"d-flex flex-wrap justify-content-center mb-4\">\r\n                <img");
{
    Object var_attrvalue266 = renderContext.getObjectModel().resolveProperty(_global_model, "bookTripImg");
    {
        Object var_attrcontent267 = renderContext.call("xss", var_attrvalue266, "uri");
        {
            boolean var_shoulddisplayattr269 = (((null != var_attrcontent267) && (!"".equals(var_attrcontent267))) && ((!"".equals(var_attrvalue266)) && (!((Object)false).equals(var_attrvalue266))));
            if (var_shoulddisplayattr269) {
                out.write(" src");
                {
                    boolean var_istrueattr268 = (var_attrvalue266.equals(true));
                    if (!var_istrueattr268) {
                        out.write("=\"");
                        out.write(renderContext.getObjectModel().toString(var_attrcontent267));
                        out.write("\"");
                    }
                }
            }
        }
    }
}
{
    Object var_attrvalue270 = renderContext.getObjectModel().resolveProperty(_global_model, "bookTripLabel");
    {
        Object var_attrcontent271 = renderContext.call("xss", var_attrvalue270, "attribute");
        {
            boolean var_shoulddisplayattr273 = (((null != var_attrcontent271) && (!"".equals(var_attrcontent271))) && ((!"".equals(var_attrvalue270)) && (!((Object)false).equals(var_attrvalue270))));
            if (var_shoulddisplayattr273) {
                out.write(" alt");
                {
                    boolean var_istrueattr272 = (var_attrvalue270.equals(true));
                    if (!var_istrueattr272) {
                        out.write("=\"");
                        out.write(renderContext.getObjectModel().toString(var_attrcontent271));
                        out.write("\"");
                    }
                }
            }
        }
    }
}
out.write(" width=\"50px\"/>\r\n            </div>\r\n            <h4 class=\"mb-3\">");
{
    Object var_274 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "bookTripLabel"), "text");
    out.write(renderContext.getObjectModel().toString(var_274));
}
out.write("</h4>\r\n            <p class=\"mb-4\">");
{
    Object var_275 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "bookTripParagraph"), "text");
    out.write(renderContext.getObjectModel().toString(var_275));
}
out.write("</p>\r\n            <div class=\"row justify-content-center\">\r\n                <div class=\"col-8 col-md-5 col-lg-4 col-xl-2\">\r\n                    <div class=\"button button__primary-v2\">\r\n                        <a");
{
    Object var_attrvalue276 = renderContext.call("xss", renderContext.call("uriManipulation", renderContext.getObjectModel().resolveProperty(_global_model, "bookTripCtaLink"), obj().with("extension", "html")), "uri");
    {
        boolean var_shoulddisplayattr279 = ((!"".equals(var_attrvalue276)) && (!((Object)false).equals(var_attrvalue276)));
        if (var_shoulddisplayattr279) {
            out.write(" href");
            {
                boolean var_istrueattr278 = (var_attrvalue276.equals(true));
                if (!var_istrueattr278) {
                    out.write("=\"");
                    out.write(renderContext.getObjectModel().toString(var_attrvalue276));
                    out.write("\"");
                }
            }
        }
    }
}
out.write(" class=\"cmp-button d-inline-block position-relative rounded-0 ride\">\r\n                            <span class=\"cmp-text\">");
{
    Object var_280 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "bookTripCtaLabel"), "text");
    out.write(renderContext.getObjectModel().toString(var_280));
}
out.write("</span>\r\n                            <span class=\"cmp-icon cmp-icon-after icon-arrow-r position-absolute top-0 end-0 bottom-0 text-white bg-primary d-flex flex-wrap align-items-center justify-content-center\"></span>\r\n                        </a>\r\n                    </div>\r\n                </div>\r\n            </div>\r\n        </div>\r\n        <!---no booking found end-->\r\n");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

