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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("DGCharts.RadarChartData")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/RadarChartData/*</name>*/ 
    extends /*<extends>*/ChartData/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class RadarChartDataPtr extends Ptr<RadarChartData, RadarChartDataPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(RadarChartData.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public RadarChartData() {}
    protected RadarChartData(Handle h, long handle) { super(h, handle); }
    protected RadarChartData(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithDataSets:")
    public RadarChartData(NSArray<?> dataSets) { super((SkipInit) null); initObject(init(dataSets)); }
    @Method(selector = "initWithDataSet:")
    public RadarChartData(ChartDataSetProtocol dataSet) { super(dataSet); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "highlightColor")
    public native UIColor getHighlightColor();
    @Property(selector = "setHighlightColor:")
    public native void setHighlightColor(UIColor v);
    @Property(selector = "highlightLineWidth")
    public native @MachineSizedFloat double getHighlightLineWidth();
    @Property(selector = "setHighlightLineWidth:")
    public native void setHighlightLineWidth(@MachineSizedFloat double v);
    @Property(selector = "highlightLineDashPhase")
    public native @MachineSizedFloat double getHighlightLineDashPhase();
    @Property(selector = "setHighlightLineDashPhase:")
    public native void setHighlightLineDashPhase(@MachineSizedFloat double v);
    @Property(selector = "highlightLineDashLengths")
    public native NSArray<NSNumber> getHighlightLineDashLengths();
    @Property(selector = "setHighlightLineDashLengths:")
    public native void setHighlightLineDashLengths(NSArray<NSNumber> v);
    @Property(selector = "labels")
    public native NSArray<NSString> getLabels();
    @Property(selector = "setLabels:")
    public native void setLabels(NSArray<NSString> v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithDataSets:")
    protected native @Pointer long init(NSArray<?> dataSets);
    @Method(selector = "entryFor:")
    public native ChartDataEntry entryFor(ChartHighlight highlight);
    /*</methods>*/
}
