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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("DGCharts.XAxisRendererRadarChart")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/XAxisRendererRadarChart/*</name>*/ 
    extends /*<extends>*/ChartXAxisRenderer/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class XAxisRendererRadarChartPtr extends Ptr<XAxisRendererRadarChart, XAxisRendererRadarChartPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(XAxisRendererRadarChart.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected XAxisRendererRadarChart() {}
    protected XAxisRendererRadarChart(Handle h, long handle) { super(h, handle); }
    protected XAxisRendererRadarChart(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithViewPortHandler:axis:chart:")
    public XAxisRendererRadarChart(ChartViewPortHandler viewPortHandler, ChartXAxis axis, RadarChartView chart) { super((SkipInit) null); initObject(init(viewPortHandler, axis, chart)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "chart")
    public native RadarChartView getChart();
    @Property(selector = "setChart:", strongRef = true)
    public native void setChart(RadarChartView v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithViewPortHandler:axis:chart:")
    protected native @Pointer long init(ChartViewPortHandler viewPortHandler, ChartXAxis axis, RadarChartView chart);
    @Method(selector = "drawLabelWithContext:formattedLabel:x:y:attributes:anchor:angleRadians:")
    public native void drawLabel(CGContext context, String formattedLabel, @MachineSizedFloat double x, @MachineSizedFloat double y, NSDictionary<NSString, ?> attributes, @ByVal CGPoint anchor, @MachineSizedFloat double angleRadians);
    /*</methods>*/
}
