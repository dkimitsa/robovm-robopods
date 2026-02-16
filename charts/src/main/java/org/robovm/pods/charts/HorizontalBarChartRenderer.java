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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("DGCharts.HorizontalBarChartRenderer")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/HorizontalBarChartRenderer/*</name>*/ 
    extends /*<extends>*/BarChartRenderer/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class HorizontalBarChartRendererPtr extends Ptr<HorizontalBarChartRenderer, HorizontalBarChartRendererPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(HorizontalBarChartRenderer.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected HorizontalBarChartRenderer() {}
    protected HorizontalBarChartRenderer(Handle h, long handle) { super(h, handle); }
    protected HorizontalBarChartRenderer(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithDataProvider:animator:viewPortHandler:")
    public HorizontalBarChartRenderer(BarChartDataProvider dataProvider, ChartAnimator animator, ChartViewPortHandler viewPortHandler) { super((SkipInit) null); initObject(init(dataProvider, animator, viewPortHandler)); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithDataProvider:animator:viewPortHandler:")
    protected native @Pointer long init(BarChartDataProvider dataProvider, ChartAnimator animator, ChartViewPortHandler viewPortHandler);
    @Method(selector = "initBuffers")
    public native void initBuffers();
    @Method(selector = "drawDataSetWithContext:dataSet:index:")
    public native void drawDataSet(CGContext context, BarChartDataSetProtocol dataSet, @MachineSizedSInt long index);
    @Method(selector = "drawValuesWithContext:")
    public native void drawValues(CGContext context);
    @Method(selector = "isDrawingValuesAllowedWithDataProvider:")
    public native boolean isDrawingValuesAllowed(ChartDataProvider dataProvider);
    /*</methods>*/
}
