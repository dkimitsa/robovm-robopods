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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("DGCharts.LineRadarChartDataSet")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/LineRadarChartDataSet/*</name>*/ 
    extends /*<extends>*/LineScatterCandleRadarChartDataSet/*</extends>*/ 
    /*<implements>*/implements LineRadarChartDataSetProtocol/*</implements>*/ {

    /*<ptr>*/public static class LineRadarChartDataSetPtr extends Ptr<LineRadarChartDataSet, LineRadarChartDataSetPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(LineRadarChartDataSet.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public LineRadarChartDataSet() {}
    protected LineRadarChartDataSet(Handle h, long handle) { super(h, handle); }
    protected LineRadarChartDataSet(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithEntries:label:")
    public LineRadarChartDataSet(NSArray<ChartDataEntry> entries, String label) { super((SkipInit) null); initObject(init(entries, label)); }
    @Method(selector = "initWithLabel:")
    public LineRadarChartDataSet(String label) { super(label); }
    @Method(selector = "initWithEntries:")
    public LineRadarChartDataSet(NSArray<ChartDataEntry> entries) { super(entries); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "fillColor")
    public native UIColor getFillColor();
    @Property(selector = "setFillColor:")
    public native void setFillColor(UIColor v);
    @Property(selector = "fill")
    public native ChartFill getFill();
    @Property(selector = "setFill:")
    public native void setFill(ChartFill v);
    @Property(selector = "fillAlpha")
    public native @MachineSizedFloat double getFillAlpha();
    @Property(selector = "setFillAlpha:")
    public native void setFillAlpha(@MachineSizedFloat double v);
    @Property(selector = "lineWidth")
    public native @MachineSizedFloat double getLineWidth();
    @Property(selector = "setLineWidth:")
    public native void setLineWidth(@MachineSizedFloat double v);
    @Property(selector = "drawFilledEnabled")
    public native boolean drawFilledEnabled();
    @Property(selector = "setDrawFilledEnabled:")
    public native void setDrawFilledEnabled(boolean v);
    @Property(selector = "isDrawFilledEnabled")
    public native boolean isDrawFilledEnabled();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "copyWithZone:")
    public native NSObject copy(NSZone zone);
    @Method(selector = "initWithEntries:label:")
    protected native @Pointer long init(NSArray<ChartDataEntry> entries, String label);
    /*</methods>*/
}
