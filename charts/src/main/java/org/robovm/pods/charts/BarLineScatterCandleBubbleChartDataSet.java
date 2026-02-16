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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("DGCharts.BarLineScatterCandleBubbleChartDataSet")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/BarLineScatterCandleBubbleChartDataSet/*</name>*/ 
    extends /*<extends>*/ChartDataSet/*</extends>*/ 
    /*<implements>*/implements BarLineScatterCandleBubbleChartDataSetProtocol/*</implements>*/ {

    /*<ptr>*/public static class BarLineScatterCandleBubbleChartDataSetPtr extends Ptr<BarLineScatterCandleBubbleChartDataSet, BarLineScatterCandleBubbleChartDataSetPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(BarLineScatterCandleBubbleChartDataSet.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public BarLineScatterCandleBubbleChartDataSet() {}
    protected BarLineScatterCandleBubbleChartDataSet(Handle h, long handle) { super(h, handle); }
    protected BarLineScatterCandleBubbleChartDataSet(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithEntries:label:")
    public BarLineScatterCandleBubbleChartDataSet(NSArray<ChartDataEntry> entries, String label) { super((SkipInit) null); initObject(init(entries, label)); }
    @Method(selector = "initWithLabel:")
    public BarLineScatterCandleBubbleChartDataSet(String label) { super(label); }
    @Method(selector = "initWithEntries:")
    public BarLineScatterCandleBubbleChartDataSet(NSArray<ChartDataEntry> entries) { super(entries); }
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
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "copyWithZone:")
    public native NSObject copy(NSZone zone);
    @Method(selector = "initWithEntries:label:")
    protected native @Pointer long init(NSArray<ChartDataEntry> entries, String label);
    /*</methods>*/
}
