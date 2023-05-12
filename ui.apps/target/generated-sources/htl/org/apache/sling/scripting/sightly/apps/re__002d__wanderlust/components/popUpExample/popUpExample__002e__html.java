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
package org.apache.sling.scripting.sightly.apps.re__002d__wanderlust.components.popUpExample;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class popUpExample__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

out.write("<div class=\"font-size-2 modalWrapper\">\r\n    <a href=\"#\" data-bs-toggle=\"modal\" data-bs-target=\"#Modal-1\">\r\n        <span class=\"pe-1\"><img src=\"/etc.clientlibs/re-wanderlust/clientlibs/clientlib-site/resources/images/icn_phone_call.svg\"/></span> View Invoices</a>\r\n</div>\r\n\r\n<!-- Modal-->\r\n<div class=\"modal modal__modalWrapperBody p4\" id=\"Modal-1\">\r\n    <div class=\"modal-dialog\">\r\n        <div class=\"modal-content bg-dark rounded-0\">\r\n            <!-- Modal body -->\r\n            <div class=\"modal-body\">\r\n                <h2 class=\"pb-3\">Invoices</h2>\r\n\r\n                <div class=\"d-flex py-2 justify-content-between\">\r\n                    <div class=\"col-6 d-flex font-size-2\">Ride 1- ride</div>\r\n                    <div class=\"col-6 d-flex justify-content-end\"><img src=\"/etc.clientlibs/re-wanderlust/clientlibs/clientlib-site/resources/images/icn_phone_call.svg\"/></div>\r\n                </div>\r\n                <p class=\"font-size-2\">CLASSIC 500 TAN with Neel Rentals</p>\r\n                <div class=\"py-4\">\r\n                    <p class=\"py-3 text-decoration-underline\"><span class=\"pe-1\"><img src=\"/etc.clientlibs/re-wanderlust/clientlibs/clientlib-site/resources/images/icn_phone_call.svg\"/></span>Download all</p>\r\n                </div>\r\n                <div class=\"col-12 d-flex justify-content-center close-cancellation-modal mx-auto\">\r\n                    <div class=\"input-group button button__primary-v2\">\r\n                        <button class=\"cmp-button rounded-0 border-0\">\r\n                            <span class=\"cmp-icon cmp-icon-before\" data-bs-dismiss=\"modal\">Close</span>\r\n                        <span class=\"cmp-icon cmp-icon-after icon-arrow-r position-absolute top-0 end-0 bottom-0 text-white bg-primary d-flex flex-wrap align-items-center justify-content-center\"></span>\r\n                        </button>\r\n                    </div>\r\n                </div>\r\n            </div>\r\n        </div>\r\n    </div>\r\n    <!-- <div class=\"modal-backdrop fade show\"></div> -->\r\n</div>\r\n<!-- End Modal-->");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

