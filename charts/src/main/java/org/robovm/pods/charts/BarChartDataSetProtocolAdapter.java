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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/BarChartDataSetProtocolAdapter/*</name>*/ 
    extends /*<extends>*/BarLineScatterCandleBubbleChartDataSetProtocolAdapter/*</extends>*/ 
    /*<implements>*/implements BarChartDataSetProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*/
    @NotImplemented("isStacked")
    public boolean isStacked() { return false; }
    @NotImplemented("stackSize")
    public @MachineSizedSInt long getStackSize() { return 0; }
    @NotImplemented("barShadowColor")
    public UIColor getBarShadowColor() { return null; }
    @NotImplemented("setBarShadowColor:")
    public void setBarShadowColor(UIColor v) {}
    @NotImplemented("barBorderWidth")
    public @MachineSizedFloat double getBarBorderWidth() { return 0; }
    @NotImplemented("setBarBorderWidth:")
    public void setBarBorderWidth(@MachineSizedFloat double v) {}
    @NotImplemented("barBorderColor")
    public UIColor getBarBorderColor() { return null; }
    @NotImplemented("setBarBorderColor:")
    public void setBarBorderColor(UIColor v) {}
    @NotImplemented("highlightAlpha")
    public @MachineSizedFloat double getHighlightAlpha() { return 0; }
    @NotImplemented("setHighlightAlpha:")
    public void setHighlightAlpha(@MachineSizedFloat double v) {}
    @NotImplemented("stackLabels")
    public NSArray<NSString> getStackLabels() { return null; }
    @NotImplemented("setStackLabels:")
    public void setStackLabels(NSArray<NSString> v) {}
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
