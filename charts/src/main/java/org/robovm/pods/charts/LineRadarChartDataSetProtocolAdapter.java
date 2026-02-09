/*
 * Copyright (C) 2013-2015 RoboVM AB
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.pods.charts;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import org.robovm.objc.*;
import org.robovm.objc.annotation.*;
import org.robovm.objc.block.*;
import org.robovm.rt.*;
import org.robovm.rt.annotation.*;
import org.robovm.rt.bro.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
import org.robovm.apple.foundation.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/LineRadarChartDataSetProtocolAdapter/*</name>*/ 
    extends /*<extends>*/LineScatterCandleRadarChartDataSetProtocolAdapter/*</extends>*/ 
    /*<implements>*/implements LineRadarChartDataSetProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*/
    @NotImplemented("fillColor")
    public UIColor getFillColor() { return null; }
    @NotImplemented("setFillColor:")
    public void setFillColor(UIColor v) {}
    @NotImplemented("fill")
    public ChartFill getFill() { return null; }
    @NotImplemented("setFill:")
    public void setFill(ChartFill v) {}
    @NotImplemented("fillAlpha")
    public @MachineSizedFloat double getFillAlpha() { return 0; }
    @NotImplemented("setFillAlpha:")
    public void setFillAlpha(@MachineSizedFloat double v) {}
    @NotImplemented("lineWidth")
    public @MachineSizedFloat double getLineWidth() { return 0; }
    @NotImplemented("setLineWidth:")
    public void setLineWidth(@MachineSizedFloat double v) {}
    @NotImplemented("drawFilledEnabled")
    public boolean drawFilledEnabled() { return false; }
    @NotImplemented("setDrawFilledEnabled:")
    public void setDrawFilledEnabled(boolean v) {}
    @NotImplemented("isDrawFilledEnabled")
    public boolean isDrawFilledEnabled() { return false; }
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
