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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/LineChartDataSetProtocolAdapter/*</name>*/ 
    extends /*<extends>*/LineRadarChartDataSetProtocolAdapter/*</extends>*/ 
    /*<implements>*/implements LineChartDataSetProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*/
    @NotImplemented("mode")
    public LineChartMode getMode() { return null; }
    @NotImplemented("setMode:")
    public void setMode(LineChartMode v) {}
    @NotImplemented("cubicIntensity")
    public @MachineSizedFloat double getCubicIntensity() { return 0; }
    @NotImplemented("setCubicIntensity:")
    public void setCubicIntensity(@MachineSizedFloat double v) {}
    @NotImplemented("isDrawLineWithGradientEnabled")
    public boolean isDrawLineWithGradientEnabled() { return false; }
    @NotImplemented("setIsDrawLineWithGradientEnabled:")
    public void setIsDrawLineWithGradientEnabled(boolean v) {}
    @NotImplemented("gradientPositions")
    public NSArray<NSNumber> getGradientPositions() { return null; }
    @NotImplemented("setGradientPositions:")
    public void setGradientPositions(NSArray<NSNumber> v) {}
    @NotImplemented("circleRadius")
    public @MachineSizedFloat double getCircleRadius() { return 0; }
    @NotImplemented("setCircleRadius:")
    public void setCircleRadius(@MachineSizedFloat double v) {}
    @NotImplemented("circleHoleRadius")
    public @MachineSizedFloat double getCircleHoleRadius() { return 0; }
    @NotImplemented("setCircleHoleRadius:")
    public void setCircleHoleRadius(@MachineSizedFloat double v) {}
    @NotImplemented("circleColors")
    public NSArray<UIColor> getCircleColors() { return null; }
    @NotImplemented("setCircleColors:")
    public void setCircleColors(NSArray<UIColor> v) {}
    @NotImplemented("drawCirclesEnabled")
    public boolean drawCirclesEnabled() { return false; }
    @NotImplemented("setDrawCirclesEnabled:")
    public void setDrawCirclesEnabled(boolean v) {}
    @NotImplemented("isDrawCirclesEnabled")
    public boolean isDrawCirclesEnabled() { return false; }
    @NotImplemented("circleHoleColor")
    public UIColor getCircleHoleColor() { return null; }
    @NotImplemented("setCircleHoleColor:")
    public void setCircleHoleColor(UIColor v) {}
    @NotImplemented("drawCircleHoleEnabled")
    public boolean drawCircleHoleEnabled() { return false; }
    @NotImplemented("setDrawCircleHoleEnabled:")
    public void setDrawCircleHoleEnabled(boolean v) {}
    @NotImplemented("isDrawCircleHoleEnabled")
    public boolean isDrawCircleHoleEnabled() { return false; }
    @NotImplemented("lineDashPhase")
    public @MachineSizedFloat double getLineDashPhase() { return 0; }
    @NotImplemented("lineDashLengths")
    public NSArray<NSNumber> getLineDashLengths() { return null; }
    @NotImplemented("setLineDashLengths:")
    public void setLineDashLengths(NSArray<NSNumber> v) {}
    @NotImplemented("lineCapType")
    public CGLineCap getLineCapType() { return null; }
    @NotImplemented("setLineCapType:")
    public void setLineCapType(CGLineCap v) {}
    @NotImplemented("fillFormatter")
    public ChartFillFormatter getFillFormatter() { return null; }
    @NotImplemented("setFillFormatter:")
    public void setFillFormatter(ChartFillFormatter v) {}
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @NotImplemented("getCircleColorAtIndex:")
    public UIColor getCircleColorAtIndex(@MachineSizedSInt long atIndex) { return null; }
    @NotImplemented("setCircleColor:")
    public void setCircleColor(UIColor color) {}
    @NotImplemented("resetCircleColors:")
    public void resetCircleColors(@MachineSizedSInt long index) {}
    /*</methods>*/
}
