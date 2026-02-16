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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("DGCharts.BubbleChartRenderer")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/BubbleChartRenderer/*</name>*/ 
    extends /*<extends>*/BarLineScatterCandleBubbleChartRenderer/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class BubbleChartRendererPtr extends Ptr<BubbleChartRenderer, BubbleChartRendererPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(BubbleChartRenderer.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected BubbleChartRenderer() {}
    protected BubbleChartRenderer(Handle h, long handle) { super(h, handle); }
    protected BubbleChartRenderer(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithDataProvider:animator:viewPortHandler:")
    public BubbleChartRenderer(BubbleChartDataProvider dataProvider, ChartAnimator animator, ChartViewPortHandler viewPortHandler) { super((SkipInit) null); initObject(init(dataProvider, animator, viewPortHandler)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "dataProvider")
    public native BubbleChartDataProvider getDataProvider();
    @Property(selector = "setDataProvider:", strongRef = true)
    public native void setDataProvider(BubbleChartDataProvider v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithDataProvider:animator:viewPortHandler:")
    protected native @Pointer long init(BubbleChartDataProvider dataProvider, ChartAnimator animator, ChartViewPortHandler viewPortHandler);
    @Method(selector = "drawDataWithContext:")
    public native void drawData(CGContext context);
    @Method(selector = "drawDataSetWithContext:dataSet:dataSetIndex:")
    public native void drawDataSet(CGContext context, BubbleChartDataSetProtocol dataSet, @MachineSizedSInt long dataSetIndex);
    @Method(selector = "drawValuesWithContext:")
    public native void drawValues(CGContext context);
    @Method(selector = "drawExtrasWithContext:")
    public native void drawExtras(CGContext context);
    @Method(selector = "drawHighlightedWithContext:indices:")
    public native void drawHighlighted(CGContext context, NSArray<ChartHighlight> indices);
    /*</methods>*/
}
