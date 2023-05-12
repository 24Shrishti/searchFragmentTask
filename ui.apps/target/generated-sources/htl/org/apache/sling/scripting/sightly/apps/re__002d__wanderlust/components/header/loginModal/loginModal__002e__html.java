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
package org.apache.sling.scripting.sightly.apps.re__002d__wanderlust.components.header.loginModal;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class loginModal__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _global_model = null;
_global_model = renderContext.call("use", com.re.wanderlust.core.models.HeaderModel.class.getName(), obj());
out.write("\r\n    <span id=\"configAttr\"");
{
    Object var_attrvalue0 = renderContext.getObjectModel().resolveProperty(_global_model, "verifyTokenApiUrl");
    {
        Object var_attrcontent1 = renderContext.call("xss", var_attrvalue0, "attribute");
        {
            boolean var_shoulddisplayattr3 = (((null != var_attrcontent1) && (!"".equals(var_attrcontent1))) && ((!"".equals(var_attrvalue0)) && (!((Object)false).equals(var_attrvalue0))));
            if (var_shoulddisplayattr3) {
                out.write(" data-verifyTokenApiUrl");
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
    Object var_attrvalue4 = renderContext.getObjectModel().resolveProperty(_global_model, "userCookieName");
    {
        Object var_attrcontent5 = renderContext.call("xss", var_attrvalue4, "attribute");
        {
            boolean var_shoulddisplayattr7 = (((null != var_attrcontent5) && (!"".equals(var_attrcontent5))) && ((!"".equals(var_attrvalue4)) && (!((Object)false).equals(var_attrvalue4))));
            if (var_shoulddisplayattr7) {
                out.write(" data-userCookieName");
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
    Object var_attrvalue8 = renderContext.getObjectModel().resolveProperty(_global_model, "userLoginCookieName");
    {
        Object var_attrcontent9 = renderContext.call("xss", var_attrvalue8, "attribute");
        {
            boolean var_shoulddisplayattr11 = (((null != var_attrcontent9) && (!"".equals(var_attrcontent9))) && ((!"".equals(var_attrvalue8)) && (!((Object)false).equals(var_attrvalue8))));
            if (var_shoulddisplayattr11) {
                out.write(" data-userLoginCookieName");
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
    Object var_attrvalue12 = renderContext.getObjectModel().resolveProperty(_global_model, "loginRedirectPath");
    {
        Object var_attrcontent13 = renderContext.call("xss", var_attrvalue12, "attribute");
        {
            boolean var_shoulddisplayattr15 = (((null != var_attrcontent13) && (!"".equals(var_attrcontent13))) && ((!"".equals(var_attrvalue12)) && (!((Object)false).equals(var_attrvalue12))));
            if (var_shoulddisplayattr15) {
                out.write(" data-loginRedirectPath");
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
    Object var_attrvalue16 = renderContext.getObjectModel().resolveProperty(_global_model, "apiHost");
    {
        Object var_attrcontent17 = renderContext.call("xss", var_attrvalue16, "attribute");
        {
            boolean var_shoulddisplayattr19 = (((null != var_attrcontent17) && (!"".equals(var_attrcontent17))) && ((!"".equals(var_attrvalue16)) && (!((Object)false).equals(var_attrvalue16))));
            if (var_shoulddisplayattr19) {
                out.write(" data-apiHost");
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
    Object var_attrvalue20 = renderContext.getObjectModel().resolveProperty(_global_model, "generateTokenAPIUrl");
    {
        Object var_attrcontent21 = renderContext.call("xss", var_attrvalue20, "attribute");
        {
            boolean var_shoulddisplayattr23 = (((null != var_attrcontent21) && (!"".equals(var_attrcontent21))) && ((!"".equals(var_attrvalue20)) && (!((Object)false).equals(var_attrvalue20))));
            if (var_shoulddisplayattr23) {
                out.write(" data-generateTokenAPIUrl");
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
out.write("></span>\r\n\r\n");
_global_model = renderContext.call("use", com.re.wanderlust.core.models.LoginModel.class.getName(), obj());
out.write("\r\n    <div class=\"login-modal-comp position-relative rew-login d-flex align-items-center\">\r\n        <span class=\"loginBtn\">\r\n            <button class=\"border-0 rounded-0 bg-transparent d-flex flex-wrap align-items-center\" id=\"toggleLoginModalOverlayBtn\">\r\n                <span class=\"cmp-text d-none d-md-block me-1\">");
{
    Object var_24 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "loginLinkText"), "text");
    out.write(renderContext.getObjectModel().toString(var_24));
}
out.write("</span>\r\n        <span class=\"cmp-icon icon-arrow-down d-none d-md-block\"></span>\r\n        <span class=\"cmp-icon icon-user d-block d-md-none\"></span>\r\n        </button>\r\n        </span>\r\n\r\n        <div class=\"login-modal-comp position-relative loggedIn\" id=\"afterLogin\" style=\"display:none;\">\r\n            <div class=\"dropdown afterLoginDropdown\">\r\n                <button class=\"border-0 rounded-0 bg-transparent d-flex flex-wrap align-items-center\" type=\"button\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">\r\n                    <img id=\"profileImage\" src=\"\"");
{
    Object var_attrvalue25 = renderContext.getObjectModel().resolveProperty(_global_model, "altText");
    {
        Object var_attrcontent26 = renderContext.call("xss", var_attrvalue25, "attribute");
        {
            boolean var_shoulddisplayattr28 = (((null != var_attrcontent26) && (!"".equals(var_attrcontent26))) && ((!"".equals(var_attrvalue25)) && (!((Object)false).equals(var_attrvalue25))));
            if (var_shoulddisplayattr28) {
                out.write(" alt");
                {
                    boolean var_istrueattr27 = (var_attrvalue25.equals(true));
                    if (!var_istrueattr27) {
                        out.write("=\"");
                        out.write(renderContext.getObjectModel().toString(var_attrcontent26));
                        out.write("\"");
                    }
                }
            }
        }
    }
}
out.write(" width=\"25\" height=\"25\" class=\"rounded-circle\"/>\r\n                    <span class=\"cmp-icon icon-arrow-down d-none d-md-block\"></span>\r\n                </button>\r\n                <ul class=\"dropdown-menu rounded-0\">\r\n                    <li>\r\n                        <a id=\"myProfile\"");
{
    Object var_attrvalue29 = renderContext.getObjectModel().resolveProperty(_global_model, "myProfileAnchorTitle");
    {
        Object var_attrcontent30 = renderContext.call("xss", var_attrvalue29, "attribute");
        {
            boolean var_shoulddisplayattr32 = (((null != var_attrcontent30) && (!"".equals(var_attrcontent30))) && ((!"".equals(var_attrvalue29)) && (!((Object)false).equals(var_attrvalue29))));
            if (var_shoulddisplayattr32) {
                out.write(" title");
                {
                    boolean var_istrueattr31 = (var_attrvalue29.equals(true));
                    if (!var_istrueattr31) {
                        out.write("=\"");
                        out.write(renderContext.getObjectModel().toString(var_attrcontent30));
                        out.write("\"");
                    }
                }
            }
        }
    }
}
{
    Object var_attrvalue33 = renderContext.call("xss", renderContext.call("uriManipulation", renderContext.getObjectModel().resolveProperty(_global_model, "myProfileUrl"), obj().with("extension", "html")), "uri");
    {
        boolean var_shoulddisplayattr36 = ((!"".equals(var_attrvalue33)) && (!((Object)false).equals(var_attrvalue33)));
        if (var_shoulddisplayattr36) {
            out.write(" href");
            {
                boolean var_istrueattr35 = (var_attrvalue33.equals(true));
                if (!var_istrueattr35) {
                    out.write("=\"");
                    out.write(renderContext.getObjectModel().toString(var_attrvalue33));
                    out.write("\"");
                }
            }
        }
    }
}
out.write(">");
{
    Object var_37 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "myProfileText"), "text");
    out.write(renderContext.getObjectModel().toString(var_37));
}
out.write("</a>\r\n                    </li>\r\n                    <li>\r\n                        <a id=\"editProfile\"");
{
    Object var_attrvalue38 = renderContext.getObjectModel().resolveProperty(_global_model, "editProfileAnchorTitle");
    {
        Object var_attrcontent39 = renderContext.call("xss", var_attrvalue38, "attribute");
        {
            boolean var_shoulddisplayattr41 = (((null != var_attrcontent39) && (!"".equals(var_attrcontent39))) && ((!"".equals(var_attrvalue38)) && (!((Object)false).equals(var_attrvalue38))));
            if (var_shoulddisplayattr41) {
                out.write(" title");
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
{
    Object var_attrvalue42 = renderContext.call("xss", renderContext.call("uriManipulation", renderContext.getObjectModel().resolveProperty(_global_model, "editProfileUrl"), obj().with("extension", "html")), "uri");
    {
        boolean var_shoulddisplayattr45 = ((!"".equals(var_attrvalue42)) && (!((Object)false).equals(var_attrvalue42)));
        if (var_shoulddisplayattr45) {
            out.write(" href");
            {
                boolean var_istrueattr44 = (var_attrvalue42.equals(true));
                if (!var_istrueattr44) {
                    out.write("=\"");
                    out.write(renderContext.getObjectModel().toString(var_attrvalue42));
                    out.write("\"");
                }
            }
        }
    }
}
out.write(">");
{
    Object var_46 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "editProfileText"), "text");
    out.write(renderContext.getObjectModel().toString(var_46));
}
out.write("</a>\r\n                    </li>\r\n                    <li>\r\n                        <a id=\"logout\"");
{
    Object var_attrvalue47 = renderContext.getObjectModel().resolveProperty(_global_model, "logoutProfileAnchorTitle");
    {
        Object var_attrcontent48 = renderContext.call("xss", var_attrvalue47, "attribute");
        {
            boolean var_shoulddisplayattr50 = (((null != var_attrcontent48) && (!"".equals(var_attrcontent48))) && ((!"".equals(var_attrvalue47)) && (!((Object)false).equals(var_attrvalue47))));
            if (var_shoulddisplayattr50) {
                out.write(" title");
                {
                    boolean var_istrueattr49 = (var_attrvalue47.equals(true));
                    if (!var_istrueattr49) {
                        out.write("=\"");
                        out.write(renderContext.getObjectModel().toString(var_attrcontent48));
                        out.write("\"");
                    }
                }
            }
        }
    }
}
{
    Object var_attrvalue51 = renderContext.call("xss", renderContext.call("uriManipulation", renderContext.getObjectModel().resolveProperty(_global_model, "logoutProfileUrl"), obj().with("extension", "html")), "uri");
    {
        boolean var_shoulddisplayattr54 = ((!"".equals(var_attrvalue51)) && (!((Object)false).equals(var_attrvalue51)));
        if (var_shoulddisplayattr54) {
            out.write(" href");
            {
                boolean var_istrueattr53 = (var_attrvalue51.equals(true));
                if (!var_istrueattr53) {
                    out.write("=\"");
                    out.write(renderContext.getObjectModel().toString(var_attrvalue51));
                    out.write("\"");
                }
            }
        }
    }
}
out.write(">");
{
    Object var_55 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "logoutProfileText"), "text");
    out.write(renderContext.getObjectModel().toString(var_55));
}
out.write("</a>\r\n                    </li>\r\n                </ul>\r\n            </div>\r\n        </div>\r\n    </div>\r\n");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

