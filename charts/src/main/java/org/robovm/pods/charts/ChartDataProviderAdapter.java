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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ChartDataProviderAdapter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements ChartDataProvider/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*/
    @NotImplemented("chartXMin")
    public double getChartXMin() { return 0; }
    @NotImplemented("chartXMax")
    public double getChartXMax() { return 0; }
    @NotImplemented("chartYMin")
    public double getChartYMin() { return 0; }
    @NotImplemented("chartYMax")
    public double getChartYMax() { return 0; }
    @NotImplemented("maxHighlightDistance")
    public @MachineSizedFloat double getMaxHighlightDistance() { return 0; }
    @NotImplemented("xRange")
    public double getXRange() { return 0; }
    @NotImplemented("centerOffsets")
    public @ByVal CGPoint getCenterOffsets() { return null; }
    @NotImplemented("data")
    public ChartData getData() { return null; }
    @NotImplemented("maxVisibleCount")
    public @MachineSizedSInt long getMaxVisibleCount() { return 0; }
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
