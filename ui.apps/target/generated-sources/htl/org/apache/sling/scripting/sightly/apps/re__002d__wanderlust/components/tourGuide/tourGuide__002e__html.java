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
package org.apache.sling.scripting.sightly.apps.re__002d__wanderlust.components.tourGuide;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class tourGuide__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

out.write("<div class=\"tour-guide-comp p-3 p-md-4\">\r\n    <h5 class=\"text-white mb-4\">Highlights</h5>\r\n    <div class=\"d-flex flex-wrap mb-4\">\r\n        <div class=\"guide-avatar rounded-circle overflow-hidden\">\r\n            <img src=\"/content/dam/re-wanderlust/photo-1535713875002-d1d0cf377fde.jpeg\" alt=\"\"/>\r\n        </div>\r\n        <div class=\"d-flex flex-wrap flex-column flex-grow-1 ps-4\">\r\n            <span class=\"guide-name\">Arun Kumar</span>\r\n            <span class=\"guide-tour-label\">Tour Guide</span>\r\n        </div>\r\n    </div>\r\n    <div class=\"row\">\r\n        <div class=\"col-md-auto\">\r\n            <span class=\"guide-label\">Language Spoken</span>\r\n            <p class=\"guide-label-val text-white\">Hindi, English, German</p>\r\n        </div>\r\n        <div class=\"col-md-auto\">\r\n            <span class=\"guide-label\">Experience</span>\r\n            <p class=\"guide-label-val text-white\">5.5 Years</p>\r\n        </div>\r\n    </div>\r\n</div>");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

