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
package org.apache.sling.scripting.sightly.apps.re__002d__wanderlust.components.TourBookingInquiryform;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class TourBookingInquiryform__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _global_model = null;
Object _dynamic_caconfig = bindings.get("caconfig");
_global_model = renderContext.call("use", com.re.wanderlust.core.models.TourBookingInquiryformModel.class.getName(), obj());
out.write("\r\n<div class=\"enquiry-form-comp tour-booking TourBookingInquiryform data-attribute\"");
{
    Object var_attrvalue0 = renderContext.getObjectModel().resolveProperty(renderContext.getObjectModel().resolveProperty(_dynamic_caconfig, "com.re.wanderlust.core.caconfig.APIUrlsConfig"), "apiBaseUrl");
    {
        Object var_attrcontent1 = renderContext.call("xss", var_attrvalue0, "attribute");
        {
            boolean var_shoulddisplayattr3 = (((null != var_attrcontent1) && (!"".equals(var_attrcontent1))) && ((!"".equals(var_attrvalue0)) && (!((Object)false).equals(var_attrvalue0))));
            if (var_shoulddisplayattr3) {
                out.write(" data-baseApiUrl");
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
    Object var_attrvalue4 = renderContext.getObjectModel().resolveProperty(_global_model, "notFound");
    {
        Object var_attrcontent5 = renderContext.call("xss", var_attrvalue4, "attribute");
        {
            boolean var_shoulddisplayattr7 = (((null != var_attrcontent5) && (!"".equals(var_attrcontent5))) && ((!"".equals(var_attrvalue4)) && (!((Object)false).equals(var_attrvalue4))));
            if (var_shoulddisplayattr7) {
                out.write(" data-notFound");
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
    Object var_attrvalue8 = renderContext.getObjectModel().resolveProperty(_global_model, "badRequest");
    {
        Object var_attrcontent9 = renderContext.call("xss", var_attrvalue8, "attribute");
        {
            boolean var_shoulddisplayattr11 = (((null != var_attrcontent9) && (!"".equals(var_attrcontent9))) && ((!"".equals(var_attrvalue8)) && (!((Object)false).equals(var_attrvalue8))));
            if (var_shoulddisplayattr11) {
                out.write(" data-badRequest");
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
    Object var_attrvalue12 = renderContext.getObjectModel().resolveProperty(_global_model, "serverError");
    {
        Object var_attrcontent13 = renderContext.call("xss", var_attrvalue12, "attribute");
        {
            boolean var_shoulddisplayattr15 = (((null != var_attrcontent13) && (!"".equals(var_attrcontent13))) && ((!"".equals(var_attrvalue12)) && (!((Object)false).equals(var_attrvalue12))));
            if (var_shoulddisplayattr15) {
                out.write(" data-serverError");
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
    Object var_attrvalue16 = renderContext.getObjectModel().resolveProperty(renderContext.getObjectModel().resolveProperty(_dynamic_caconfig, "com.re.wanderlust.core.caconfig.APIUrlsConfig"), "inquiryFormUrl");
    {
        Object var_attrcontent17 = renderContext.call("xss", var_attrvalue16, "attribute");
        {
            boolean var_shoulddisplayattr19 = (((null != var_attrcontent17) && (!"".equals(var_attrcontent17))) && ((!"".equals(var_attrvalue16)) && (!((Object)false).equals(var_attrvalue16))));
            if (var_shoulddisplayattr19) {
                out.write(" data-inquiryFormUrl");
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
    Object var_attrvalue20 = renderContext.getObjectModel().resolveProperty(renderContext.getObjectModel().resolveProperty(_dynamic_caconfig, "com.re.wanderlust.core.caconfig.APIUrlsConfig"), "emergencyCountryList");
    {
        Object var_attrcontent21 = renderContext.call("xss", var_attrvalue20, "attribute");
        {
            boolean var_shoulddisplayattr23 = (((null != var_attrcontent21) && (!"".equals(var_attrcontent21))) && ((!"".equals(var_attrvalue20)) && (!((Object)false).equals(var_attrvalue20))));
            if (var_shoulddisplayattr23) {
                out.write(" data-countryCode");
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
    Object var_attrvalue24 = renderContext.getObjectModel().resolveProperty(renderContext.getObjectModel().resolveProperty(_dynamic_caconfig, "com.re.wanderlust.core.caconfig.APIUrlsConfig"), "tripDropDownApiUrl");
    {
        Object var_attrcontent25 = renderContext.call("xss", var_attrvalue24, "attribute");
        {
            boolean var_shoulddisplayattr27 = (((null != var_attrcontent25) && (!"".equals(var_attrcontent25))) && ((!"".equals(var_attrvalue24)) && (!((Object)false).equals(var_attrvalue24))));
            if (var_shoulddisplayattr27) {
                out.write(" data-preferredDate");
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
out.write(">\r\n    <div class=\"container\">\r\n        <div class=\"row\">\r\n            <div class=\"col-12 errorField\">\r\n                <div class=\"d-flex flex-wrap flex-column flex-md-row bg-neutrak-mediumDark-grey p-3 mb-4\">\r\n                    <span class=\"text-neutrak-light-grey me-0 me-md-3\">");
{
    Object var_28 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "preferredDate"), "text");
    out.write(renderContext.getObjectModel().toString(var_28));
}
out.write("</span>\r\n                    <span class=\"text-white\" id=\"preferredDates\"></span>\r\n                </div>\r\n                <div class=\"card mb-4 rounded-0 border-0\">\r\n                    <div class=\"card-header p-3 rounded-0 bg-neutrak-mediumDark-grey\">\r\n                        <h6>");
{
    Object var_29 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "title"), "text");
    out.write(renderContext.getObjectModel().toString(var_29));
}
out.write("</h6>\r\n                    </div>\r\n                    <div class=\"card-body bg-neutral-black-grey\">\r\n                        <div class=\"row\">\r\n                            <div class=\"col-md-6\">\r\n                                <div class=\"mb-4\">\r\n                                    <label class=\"text-neutrak-light-grey mb-2\" for=\"name\">");
{
    Object var_30 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "nameLabel"), "text");
    out.write(renderContext.getObjectModel().toString(var_30));
}
out.write("</label>\r\n                                    <input type=\"text\" id=\"name\" class=\"form-control text-white py-2 bg-transparent rounded-0\"");
{
    Object var_attrvalue31 = renderContext.getObjectModel().resolveProperty(_global_model, "namePlaceholder");
    {
        Object var_attrcontent32 = renderContext.call("xss", var_attrvalue31, "attribute");
        {
            boolean var_shoulddisplayattr34 = (((null != var_attrcontent32) && (!"".equals(var_attrcontent32))) && ((!"".equals(var_attrvalue31)) && (!((Object)false).equals(var_attrvalue31))));
            if (var_shoulddisplayattr34) {
                out.write(" placeholder");
                {
                    boolean var_istrueattr33 = (var_attrvalue31.equals(true));
                    if (!var_istrueattr33) {
                        out.write("=\"");
                        out.write(renderContext.getObjectModel().toString(var_attrcontent32));
                        out.write("\"");
                    }
                }
            }
        }
    }
}
out.write("/>\r\n                                    <label class=\"nameError\">");
{
    Object var_35 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "nameErrorLabel"), "text");
    out.write(renderContext.getObjectModel().toString(var_35));
}
out.write("</label>\r\n                                    <label class=\"nameRegexError\">");
{
    Object var_36 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "nameRegexError"), "text");
    out.write(renderContext.getObjectModel().toString(var_36));
}
out.write("</label>\r\n                                </div>\r\n                            </div>\r\n                            <div class=\"col-md-6\">\r\n                                <div class=\"mb-4\">\r\n                                    <label class=\"text-neutrak-light-grey mb-2\" for=\"emailId\">");
{
    Object var_37 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "emailLabel"), "text");
    out.write(renderContext.getObjectModel().toString(var_37));
}
out.write("</label>\r\n                                    <input type=\"text\" id=\"email\" class=\"form-control text-white py-2 bg-transparent rounded-0\"");
{
    Object var_attrvalue38 = renderContext.getObjectModel().resolveProperty(_global_model, "emailIdPlaceholder");
    {
        Object var_attrcontent39 = renderContext.call("xss", var_attrvalue38, "attribute");
        {
            boolean var_shoulddisplayattr41 = (((null != var_attrcontent39) && (!"".equals(var_attrcontent39))) && ((!"".equals(var_attrvalue38)) && (!((Object)false).equals(var_attrvalue38))));
            if (var_shoulddisplayattr41) {
                out.write(" placeholder");
                {
                    boolean var_istrueattr40 = (var_attrvalue38.equals(true));
                    if (!var_istrueattr40) {
                        out.write("=\"");
                        out.write(renderContext.getObjectModel().toString(var_attrcontent39));
                        out.write("\"");
                    }
                }
            }
        }
    }
}
out.write("/>\r\n                                    <label class=\"emailError\">");
{
    Object var_42 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "emailIdErrorLabel"), "text");
    out.write(renderContext.getObjectModel().toString(var_42));
}
out.write("</label>\r\n                                    <label class=\"emailRegexError\">");
{
    Object var_43 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "emailIdErrorRegex"), "text");
    out.write(renderContext.getObjectModel().toString(var_43));
}
out.write("</label>\r\n                                </div>\r\n                            </div>\r\n                            <div class=\"col-md-6\">\r\n                                <div class=\"mb-4\">\r\n                                    <label class=\"text-neutrak-light-grey mb-2\" for=\"mobileNo\">");
{
    Object var_44 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "mobileNumberLabel"), "text");
    out.write(renderContext.getObjectModel().toString(var_44));
}
out.write("</label>\r\n                                    <div class=\"phone-country-code\">\r\n                                        <select class=\"form-select bg-transparent border-white text-white rounded-0 \" id=\"country-code\">\r\n                                            \r\n                                          </select>\r\n                                        <input type=\"number\" maxlength=\"10\" id=\"mobileNumber\" class=\"form-control text-white bg-transparent border-white rounded-0\"");
{
    Object var_attrvalue45 = renderContext.getObjectModel().resolveProperty(_global_model, "mobileNumberPlaceholder");
    {
        Object var_attrcontent46 = renderContext.call("xss", var_attrvalue45, "attribute");
        {
            boolean var_shoulddisplayattr48 = (((null != var_attrcontent46) && (!"".equals(var_attrcontent46))) && ((!"".equals(var_attrvalue45)) && (!((Object)false).equals(var_attrvalue45))));
            if (var_shoulddisplayattr48) {
                out.write(" placeholder");
                {
                    boolean var_istrueattr47 = (var_attrvalue45.equals(true));
                    if (!var_istrueattr47) {
                        out.write("=\"");
                        out.write(renderContext.getObjectModel().toString(var_attrcontent46));
                        out.write("\"");
                    }
                }
            }
        }
    }
}
out.write(" onKeyPress=\"if(this.value.length==10) return false\"/>\r\n                                        <label class=\"mobileError\">");
{
    Object var_49 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "mobileNumberErrorLabel"), "text");
    out.write(renderContext.getObjectModel().toString(var_49));
}
out.write("</label>\r\n                                        <label class=\"mobileRegexError\">");
{
    Object var_50 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "mobileRegexNumberError"), "text");
    out.write(renderContext.getObjectModel().toString(var_50));
}
out.write("</label>\r\n                                    </div>\r\n                                </div>\r\n                            </div>\r\n                            <div class=\"col-md-6\">\r\n                                <div class=\"mb-4\">\r\n                                    <label class=\"text-neutrak-light-grey mb-2\" for=\"nationality\">");
{
    Object var_51 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "nationalityLabel"), "text");
    out.write(renderContext.getObjectModel().toString(var_51));
}
out.write("</label>\r\n                                    <select class=\"form-select bg-transparent border-white text-white bg-transparent text-white border-white rounded-0\" id=\"nationality\">\r\n                                    \r\n                                    </select>\r\n                                    <label class=\"countryError\">");
{
    Object var_52 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "selectCountryErrorLabel"), "text");
    out.write(renderContext.getObjectModel().toString(var_52));
}
out.write("</label>\r\n                                </div>\r\n                            </div>\r\n                            <div class=\"col-md-6\">\r\n                                <div class=\"mb-4\">\r\n                                    <label class=\"text-neutrak-light-grey mb-2\" for=\"noOfRides\">");
{
    Object var_53 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "noOfRiderLabel"), "text");
    out.write(renderContext.getObjectModel().toString(var_53));
}
out.write("</label>\r\n                                    <input type=\"number\" min=\"1\"");
{
    Object var_attrvalue54 = renderContext.getObjectModel().resolveProperty(_global_model, "limitRiders");
    {
        Object var_attrcontent55 = renderContext.call("xss", var_attrvalue54, "attribute");
        {
            boolean var_shoulddisplayattr57 = (((null != var_attrcontent55) && (!"".equals(var_attrcontent55))) && ((!"".equals(var_attrvalue54)) && (!((Object)false).equals(var_attrvalue54))));
            if (var_shoulddisplayattr57) {
                out.write(" max");
                {
                    boolean var_istrueattr56 = (var_attrvalue54.equals(true));
                    if (!var_istrueattr56) {
                        out.write("=\"");
                        out.write(renderContext.getObjectModel().toString(var_attrcontent55));
                        out.write("\"");
                    }
                }
            }
        }
    }
}
{
    Object var_attrvalue58 = renderContext.getObjectModel().resolveProperty(_global_model, "limitRiders");
    {
        Object var_attrcontent59 = renderContext.call("xss", var_attrvalue58, "attribute");
        {
            boolean var_shoulddisplayattr61 = (((null != var_attrcontent59) && (!"".equals(var_attrcontent59))) && ((!"".equals(var_attrvalue58)) && (!((Object)false).equals(var_attrvalue58))));
            if (var_shoulddisplayattr61) {
                out.write(" data-limit");
                {
                    boolean var_istrueattr60 = (var_attrvalue58.equals(true));
                    if (!var_istrueattr60) {
                        out.write("=\"");
                        out.write(renderContext.getObjectModel().toString(var_attrcontent59));
                        out.write("\"");
                    }
                }
            }
        }
    }
}
out.write(" id=\"riderNumber\" class=\"form-control text-white py-2 bg-transparent rounded-0\"");
{
    Object var_attrvalue62 = renderContext.getObjectModel().resolveProperty(_global_model, "noOfRidersPlaceholder");
    {
        Object var_attrcontent63 = renderContext.call("xss", var_attrvalue62, "attribute");
        {
            boolean var_shoulddisplayattr65 = (((null != var_attrcontent63) && (!"".equals(var_attrcontent63))) && ((!"".equals(var_attrvalue62)) && (!((Object)false).equals(var_attrvalue62))));
            if (var_shoulddisplayattr65) {
                out.write(" placeholder");
                {
                    boolean var_istrueattr64 = (var_attrvalue62.equals(true));
                    if (!var_istrueattr64) {
                        out.write("=\"");
                        out.write(renderContext.getObjectModel().toString(var_attrcontent63));
                        out.write("\"");
                    }
                }
            }
        }
    }
}
out.write("/>\r\n                                    <label class=\"ridersError\">");
{
    Object var_66 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "noOfRidersErrorLabel"), "text");
    out.write(renderContext.getObjectModel().toString(var_66));
}
out.write("</label>\r\n                                    <div class=\"riderMessage\" hidden>");
{
    Object var_67 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "maxRidersErrorLabel"), "text");
    out.write(renderContext.getObjectModel().toString(var_67));
}
out.write("</div>\r\n                                </div>\r\n                            </div>\r\n                            <div class=\"col-md-6\">\r\n                                <div class=\"mb-4\">\r\n                                    <label class=\"text-neutrak-light-grey mb-2\" for=\"noOfRides\">");
{
    Object var_68 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "noOfRidesLabel"), "text");
    out.write(renderContext.getObjectModel().toString(var_68));
}
out.write("</label>\r\n                                    <input type=\"number\" min=\"1\"");
{
    Object var_attrvalue69 = renderContext.getObjectModel().resolveProperty(_global_model, "limitRides");
    {
        Object var_attrcontent70 = renderContext.call("xss", var_attrvalue69, "attribute");
        {
            boolean var_shoulddisplayattr72 = (((null != var_attrcontent70) && (!"".equals(var_attrcontent70))) && ((!"".equals(var_attrvalue69)) && (!((Object)false).equals(var_attrvalue69))));
            if (var_shoulddisplayattr72) {
                out.write(" max");
                {
                    boolean var_istrueattr71 = (var_attrvalue69.equals(true));
                    if (!var_istrueattr71) {
                        out.write("=\"");
                        out.write(renderContext.getObjectModel().toString(var_attrcontent70));
                        out.write("\"");
                    }
                }
            }
        }
    }
}
{
    Object var_attrvalue73 = renderContext.getObjectModel().resolveProperty(_global_model, "limitRides");
    {
        Object var_attrcontent74 = renderContext.call("xss", var_attrvalue73, "attribute");
        {
            boolean var_shoulddisplayattr76 = (((null != var_attrcontent74) && (!"".equals(var_attrcontent74))) && ((!"".equals(var_attrvalue73)) && (!((Object)false).equals(var_attrvalue73))));
            if (var_shoulddisplayattr76) {
                out.write(" data-ridesLimit");
                {
                    boolean var_istrueattr75 = (var_attrvalue73.equals(true));
                    if (!var_istrueattr75) {
                        out.write("=\"");
                        out.write(renderContext.getObjectModel().toString(var_attrcontent74));
                        out.write("\"");
                    }
                }
            }
        }
    }
}
out.write(" id=\"ridesNumber\" class=\"form-control text-white py-2 bg-transparent rounded-0\"");
{
    Object var_attrvalue77 = renderContext.getObjectModel().resolveProperty(_global_model, "noOfRidesPlaceholder");
    {
        Object var_attrcontent78 = renderContext.call("xss", var_attrvalue77, "attribute");
        {
            boolean var_shoulddisplayattr80 = (((null != var_attrcontent78) && (!"".equals(var_attrcontent78))) && ((!"".equals(var_attrvalue77)) && (!((Object)false).equals(var_attrvalue77))));
            if (var_shoulddisplayattr80) {
                out.write(" placeholder");
                {
                    boolean var_istrueattr79 = (var_attrvalue77.equals(true));
                    if (!var_istrueattr79) {
                        out.write("=\"");
                        out.write(renderContext.getObjectModel().toString(var_attrcontent78));
                        out.write("\"");
                    }
                }
            }
        }
    }
}
out.write("/>\r\n                                    <label class=\"ridesError\">");
{
    Object var_81 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "noOfRidesErrorLabel"), "text");
    out.write(renderContext.getObjectModel().toString(var_81));
}
out.write("</label>\r\n                                    <div class=\"ridesMessage\" hidden>");
{
    Object var_82 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "maxRidesErrorLabel"), "text");
    out.write(renderContext.getObjectModel().toString(var_82));
}
out.write("</div>\r\n                                </div>\r\n                            </div>\r\n                            <div class=\"col-md-12\">\r\n                                <div class=\"mb-4\">\r\n                                    <label class=\"text-neutrak-light-grey mb-2\" for=\"description\">");
{
    Object var_83 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "description"), "text");
    out.write(renderContext.getObjectModel().toString(var_83));
}
out.write("</label>\r\n                                    <textarea type=\"textarea\" rows=\"4\" id=\"descriptionId\" class=\"form-control text-white py-2 bg-transparent rounded-0\"");
{
    Object var_attrvalue84 = renderContext.getObjectModel().resolveProperty(_global_model, "descriptionPlaceholder");
    {
        Object var_attrcontent85 = renderContext.call("xss", var_attrvalue84, "attribute");
        {
            boolean var_shoulddisplayattr87 = (((null != var_attrcontent85) && (!"".equals(var_attrcontent85))) && ((!"".equals(var_attrvalue84)) && (!((Object)false).equals(var_attrvalue84))));
            if (var_shoulddisplayattr87) {
                out.write(" placeholder");
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
out.write("></textarea>\r\n                                </div>\r\n                            </div>\r\n                        </div>\r\n                    </div>\r\n                </div>\r\n                <div class=\"text-center\">\r\n                    <div class=\"button button__primary-v2 mx-auto submitbutton\" style=\"max-width: 200px;\">\r\n                        <button class=\"cmp-button rounded-0\" id=\"submitButton\"");
{
    Object var_attrvalue88 = renderContext.call("xss", renderContext.call("uriManipulation", renderContext.getObjectModel().resolveProperty(_global_model, "submitButton"), obj().with("extension", "html")), "uri");
    {
        boolean var_shoulddisplayattr91 = ((!"".equals(var_attrvalue88)) && (!((Object)false).equals(var_attrvalue88)));
        if (var_shoulddisplayattr91) {
            out.write(" data-submitRedirection");
            {
                boolean var_istrueattr90 = (var_attrvalue88.equals(true));
                if (!var_istrueattr90) {
                    out.write("=\"");
                    out.write(renderContext.getObjectModel().toString(var_attrvalue88));
                    out.write("\"");
                }
            }
        }
    }
}
out.write(">\r\n                            <span class=\"cmp-text\">");
{
    Object var_92 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "submitButtonLabel"), "text");
    out.write(renderContext.getObjectModel().toString(var_92));
}
out.write("</span>\r\n                            <span class=\"cmp-icon-after icon-arrow-r position-absolute top-0 end-0 bottom-0 text-white bg-primary d-flex flex-wrap align-items-center justify-content-center\"></span>\r\n                        </button>\r\n                    </div>\r\n                </div>\r\n            </div>\r\n        </div>\r\n    </div>\r\n</div>\r\n\r\n\r\n     \r\n\r\n\r\n\r\n");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

