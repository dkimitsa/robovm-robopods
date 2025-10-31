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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("DGCharts.RadarChartDataSet")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/RadarChartDataSet/*</name>*/ 
    extends /*<extends>*/LineRadarChartDataSet/*</extends>*/ 
    /*<implements>*/implements RadarChartDataSetProtocol/*</implements>*/ {

    /*<ptr>*/public static class RadarChartDataSetPtr extends Ptr<RadarChartDataSet, RadarChartDataSetPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(RadarChartDataSet.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public RadarChartDataSet() {}
    protected RadarChartDataSet(Handle h, long handle) { super(h, handle); }
    protected RadarChartDataSet(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithEntries:label:")
    public RadarChartDataSet(NSArray<ChartDataEntry> entries, String label) { super((SkipInit) null); initObject(init(entries, label)); }
    @Method(selector = "initWithLabel:")
    public RadarChartDataSet(String label) { super(label); }
    @Method(selector = "initWithEntries:")
    public RadarChartDataSet(NSArray<ChartDataEntry> entries) { super(entries); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "drawHighlightCircleEnabled")
    public native boolean drawHighlightCircleEnabled();
    @Property(selector = "setDrawHighlightCircleEnabled:")
    public native void setDrawHighlightCircleEnabled(boolean v);
    @Property(selector = "isDrawHighlightCircleEnabled")
    public native boolean isDrawHighlightCircleEnabled();
    @Property(selector = "highlightCircleFillColor")
    public native UIColor getHighlightCircleFillColor();
    @Property(selector = "setHighlightCircleFillColor:")
    public native void setHighlightCircleFillColor(UIColor v);
    @Property(selector = "highlightCircleStrokeColor")
    public native UIColor getHighlightCircleStrokeColor();
    @Property(selector = "setHighlightCircleStrokeColor:")
    public native void setHighlightCircleStrokeColor(UIColor v);
    @Property(selector = "highlightCircleStrokeAlpha")
    public native @MachineSizedFloat double getHighlightCircleStrokeAlpha();
    @Property(selector = "setHighlightCircleStrokeAlpha:")
    public native void setHighlightCircleStrokeAlpha(@MachineSizedFloat double v);
    @Property(selector = "highlightCircleInnerRadius")
    public native @MachineSizedFloat double getHighlightCircleInnerRadius();
    @Property(selector = "setHighlightCircleInnerRadius:")
    public native void setHighlightCircleInnerRadius(@MachineSizedFloat double v);
    @Property(selector = "highlightCircleOuterRadius")
    public native @MachineSizedFloat double getHighlightCircleOuterRadius();
    @Property(selector = "setHighlightCircleOuterRadius:")
    public native void setHighlightCircleOuterRadius(@MachineSizedFloat double v);
    @Property(selector = "highlightCircleStrokeWidth")
    public native @MachineSizedFloat double getHighlightCircleStrokeWidth();
    @Property(selector = "setHighlightCircleStrokeWidth:")
    public native void setHighlightCircleStrokeWidth(@MachineSizedFloat double v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithEntries:label:")
    protected native @Pointer long init(NSArray<ChartDataEntry> entries, String label);
    /*</methods>*/
}
