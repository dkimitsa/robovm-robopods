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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("DGCharts.BarChartDataSet")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/BarChartDataSet/*</name>*/ 
    extends /*<extends>*/BarLineScatterCandleBubbleChartDataSet/*</extends>*/ 
    /*<implements>*/implements BarChartDataSetProtocol/*</implements>*/ {

    /*<ptr>*/public static class BarChartDataSetPtr extends Ptr<BarChartDataSet, BarChartDataSetPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(BarChartDataSet.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public BarChartDataSet() {}
    protected BarChartDataSet(Handle h, long handle) { super(h, handle); }
    protected BarChartDataSet(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithEntries:label:")
    public BarChartDataSet(NSArray<ChartDataEntry> entries, String label) { super((SkipInit) null); initObject(init(entries, label)); }
    @Method(selector = "initWithLabel:")
    public BarChartDataSet(String label) { super(label); }
    @Method(selector = "initWithEntries:")
    public BarChartDataSet(NSArray<ChartDataEntry> entries) { super(entries); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "stackSize")
    public native @MachineSizedSInt long getStackSize();
    @Property(selector = "isStacked")
    public native boolean isStacked();
    @Property(selector = "entryCountStacks")
    public native @MachineSizedSInt long getEntryCountStacks();
    @Property(selector = "stackLabels")
    public native NSArray<NSString> getStackLabels();
    @Property(selector = "setStackLabels:")
    public native void setStackLabels(NSArray<NSString> v);
    @Property(selector = "barShadowColor")
    public native UIColor getBarShadowColor();
    @Property(selector = "setBarShadowColor:")
    public native void setBarShadowColor(UIColor v);
    @Property(selector = "barBorderWidth")
    public native @MachineSizedFloat double getBarBorderWidth();
    @Property(selector = "setBarBorderWidth:")
    public native void setBarBorderWidth(@MachineSizedFloat double v);
    @Property(selector = "barBorderColor")
    public native UIColor getBarBorderColor();
    @Property(selector = "setBarBorderColor:")
    public native void setBarBorderColor(UIColor v);
    @Property(selector = "highlightAlpha")
    public native @MachineSizedFloat double getHighlightAlpha();
    @Property(selector = "setHighlightAlpha:")
    public native void setHighlightAlpha(@MachineSizedFloat double v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithEntries:label:")
    protected native @Pointer long init(NSArray<ChartDataEntry> entries, String label);
    @Method(selector = "copyWithZone:")
    public native NSObject copy(NSZone zone);
    /*</methods>*/
}
