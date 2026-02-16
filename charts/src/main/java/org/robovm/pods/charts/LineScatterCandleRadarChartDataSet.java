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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("DGCharts.LineScatterCandleRadarChartDataSet")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/LineScatterCandleRadarChartDataSet/*</name>*/ 
    extends /*<extends>*/BarLineScatterCandleBubbleChartDataSet/*</extends>*/ 
    /*<implements>*/implements LineScatterCandleRadarChartDataSetProtocol/*</implements>*/ {

    /*<ptr>*/public static class LineScatterCandleRadarChartDataSetPtr extends Ptr<LineScatterCandleRadarChartDataSet, LineScatterCandleRadarChartDataSetPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(LineScatterCandleRadarChartDataSet.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public LineScatterCandleRadarChartDataSet() {}
    protected LineScatterCandleRadarChartDataSet(Handle h, long handle) { super(h, handle); }
    protected LineScatterCandleRadarChartDataSet(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithEntries:label:")
    public LineScatterCandleRadarChartDataSet(NSArray<ChartDataEntry> entries, String label) { super((SkipInit) null); initObject(init(entries, label)); }
    @Method(selector = "initWithLabel:")
    public LineScatterCandleRadarChartDataSet(String label) { super(label); }
    @Method(selector = "initWithEntries:")
    public LineScatterCandleRadarChartDataSet(NSArray<ChartDataEntry> entries) { super(entries); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "drawHorizontalHighlightIndicatorEnabled")
    public native boolean isDrawHorizontalHighlightIndicatorEnabled();
    @Property(selector = "setDrawHorizontalHighlightIndicatorEnabled:")
    public native void setDrawHorizontalHighlightIndicatorEnabled(boolean v);
    @Property(selector = "drawVerticalHighlightIndicatorEnabled")
    public native boolean isDrawVerticalHighlightIndicatorEnabled();
    @Property(selector = "setDrawVerticalHighlightIndicatorEnabled:")
    public native void setDrawVerticalHighlightIndicatorEnabled(boolean v);
    @Property(selector = "isHorizontalHighlightIndicatorEnabled")
    public native boolean isHorizontalHighlightIndicatorEnabled();
    @Property(selector = "isVerticalHighlightIndicatorEnabled")
    public native boolean isVerticalHighlightIndicatorEnabled();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "setDrawHighlightIndicators:")
    public native void setDrawHighlightIndicators(boolean enabled);
    @Method(selector = "copyWithZone:")
    public native NSObject copy(NSZone zone);
    @Method(selector = "initWithEntries:label:")
    protected native @Pointer long init(NSArray<ChartDataEntry> entries, String label);
    /*</methods>*/
}
