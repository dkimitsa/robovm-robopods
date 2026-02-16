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
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/LineChartDataSetProtocol/*</name>*/ 
    /*<implements>*/extends LineRadarChartDataSetProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    @Property(selector = "mode")
    LineChartMode getMode();
    @Property(selector = "setMode:")
    void setMode(LineChartMode v);
    @Property(selector = "cubicIntensity")
    @MachineSizedFloat double getCubicIntensity();
    @Property(selector = "setCubicIntensity:")
    void setCubicIntensity(@MachineSizedFloat double v);
    @Property(selector = "isDrawLineWithGradientEnabled")
    boolean isDrawLineWithGradientEnabled();
    @Property(selector = "setIsDrawLineWithGradientEnabled:")
    void setIsDrawLineWithGradientEnabled(boolean v);
    @Property(selector = "gradientPositions")
    NSArray<NSNumber> getGradientPositions();
    @Property(selector = "setGradientPositions:")
    void setGradientPositions(NSArray<NSNumber> v);
    @Property(selector = "circleRadius")
    @MachineSizedFloat double getCircleRadius();
    @Property(selector = "setCircleRadius:")
    void setCircleRadius(@MachineSizedFloat double v);
    @Property(selector = "circleHoleRadius")
    @MachineSizedFloat double getCircleHoleRadius();
    @Property(selector = "setCircleHoleRadius:")
    void setCircleHoleRadius(@MachineSizedFloat double v);
    @Property(selector = "circleColors")
    NSArray<UIColor> getCircleColors();
    @Property(selector = "setCircleColors:")
    void setCircleColors(NSArray<UIColor> v);
    @Property(selector = "drawCirclesEnabled")
    boolean drawCirclesEnabled();
    @Property(selector = "setDrawCirclesEnabled:")
    void setDrawCirclesEnabled(boolean v);
    @Property(selector = "isDrawCirclesEnabled")
    boolean isDrawCirclesEnabled();
    @Property(selector = "circleHoleColor")
    UIColor getCircleHoleColor();
    @Property(selector = "setCircleHoleColor:")
    void setCircleHoleColor(UIColor v);
    @Property(selector = "drawCircleHoleEnabled")
    boolean drawCircleHoleEnabled();
    @Property(selector = "setDrawCircleHoleEnabled:")
    void setDrawCircleHoleEnabled(boolean v);
    @Property(selector = "isDrawCircleHoleEnabled")
    boolean isDrawCircleHoleEnabled();
    @Property(selector = "lineDashPhase")
    @MachineSizedFloat double getLineDashPhase();
    @Property(selector = "lineDashLengths")
    NSArray<NSNumber> getLineDashLengths();
    @Property(selector = "setLineDashLengths:")
    void setLineDashLengths(NSArray<NSNumber> v);
    @Property(selector = "lineCapType")
    CGLineCap getLineCapType();
    @Property(selector = "setLineCapType:")
    void setLineCapType(CGLineCap v);
    @Property(selector = "fillFormatter")
    ChartFillFormatter getFillFormatter();
    @Property(selector = "setFillFormatter:")
    void setFillFormatter(ChartFillFormatter v);
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "getCircleColorAtIndex:")
    UIColor getCircleColorAtIndex(@MachineSizedSInt long atIndex);
    @Method(selector = "setCircleColor:")
    void setCircleColor(UIColor color);
    @Method(selector = "resetCircleColors:")
    void resetCircleColors(@MachineSizedSInt long index);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
