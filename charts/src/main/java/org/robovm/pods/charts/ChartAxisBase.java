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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ChartAxisBase/*</name>*/ 
    extends /*<extends>*/ChartComponentBase/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class ChartAxisBasePtr extends Ptr<ChartAxisBase, ChartAxisBasePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ChartAxisBase.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public ChartAxisBase() {}
    protected ChartAxisBase(Handle h, long handle) { super(h, handle); }
    protected ChartAxisBase(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "labelFont")
    public native UIFont getLabelFont();
    @Property(selector = "setLabelFont:")
    public native void setLabelFont(UIFont v);
    @Property(selector = "labelTextColor")
    public native UIColor getLabelTextColor();
    @Property(selector = "setLabelTextColor:")
    public native void setLabelTextColor(UIColor v);
    @Property(selector = "axisLineColor")
    public native UIColor getAxisLineColor();
    @Property(selector = "setAxisLineColor:")
    public native void setAxisLineColor(UIColor v);
    @Property(selector = "axisLineWidth")
    public native @MachineSizedFloat double getAxisLineWidth();
    @Property(selector = "setAxisLineWidth:")
    public native void setAxisLineWidth(@MachineSizedFloat double v);
    @Property(selector = "axisLineDashPhase")
    public native @MachineSizedFloat double getAxisLineDashPhase();
    @Property(selector = "setAxisLineDashPhase:")
    public native void setAxisLineDashPhase(@MachineSizedFloat double v);
    @Property(selector = "axisLineDashLengths")
    public native NSArray<NSNumber> getAxisLineDashLengths();
    @Property(selector = "setAxisLineDashLengths:")
    public native void setAxisLineDashLengths(NSArray<NSNumber> v);
    @Property(selector = "gridColor")
    public native UIColor getGridColor();
    @Property(selector = "setGridColor:")
    public native void setGridColor(UIColor v);
    @Property(selector = "gridLineWidth")
    public native @MachineSizedFloat double getGridLineWidth();
    @Property(selector = "setGridLineWidth:")
    public native void setGridLineWidth(@MachineSizedFloat double v);
    @Property(selector = "gridLineDashPhase")
    public native @MachineSizedFloat double getGridLineDashPhase();
    @Property(selector = "setGridLineDashPhase:")
    public native void setGridLineDashPhase(@MachineSizedFloat double v);
    @Property(selector = "gridLineDashLengths")
    public native NSArray<NSNumber> getGridLineDashLengths();
    @Property(selector = "setGridLineDashLengths:")
    public native void setGridLineDashLengths(NSArray<NSNumber> v);
    @Property(selector = "gridLineCap")
    public native CGLineCap getGridLineCap();
    @Property(selector = "setGridLineCap:")
    public native void setGridLineCap(CGLineCap v);
    @Property(selector = "drawGridLinesEnabled")
    public native boolean drawGridLinesEnabled();
    @Property(selector = "setDrawGridLinesEnabled:")
    public native void setDrawGridLinesEnabled(boolean v);
    @Property(selector = "drawAxisLineEnabled")
    public native boolean drawAxisLineEnabled();
    @Property(selector = "setDrawAxisLineEnabled:")
    public native void setDrawAxisLineEnabled(boolean v);
    @Property(selector = "drawLabelsEnabled")
    public native boolean drawLabelsEnabled();
    @Property(selector = "setDrawLabelsEnabled:")
    public native void setDrawLabelsEnabled(boolean v);
    @Property(selector = "centerAxisLabelsEnabled")
    public native boolean centerAxisLabelsEnabled();
    @Property(selector = "setCenterAxisLabelsEnabled:")
    public native void setCenterAxisLabelsEnabled(boolean v);
    @Property(selector = "isCenterAxisLabelsEnabled")
    public native boolean isCenterAxisLabelsEnabled();
    @Property(selector = "drawLimitLinesBehindDataEnabled")
    public native boolean drawLimitLinesBehindDataEnabled();
    @Property(selector = "setDrawLimitLinesBehindDataEnabled:")
    public native void setDrawLimitLinesBehindDataEnabled(boolean v);
    @Property(selector = "drawGridLinesBehindDataEnabled")
    public native boolean drawGridLinesBehindDataEnabled();
    @Property(selector = "setDrawGridLinesBehindDataEnabled:")
    public native void setDrawGridLinesBehindDataEnabled(boolean v);
    @Property(selector = "gridAntialiasEnabled")
    public native boolean isGridAntialiasEnabled();
    @Property(selector = "setGridAntialiasEnabled:")
    public native void setGridAntialiasEnabled(boolean v);
    @Property(selector = "entries")
    public native NSArray<NSNumber> getEntries();
    @Property(selector = "setEntries:")
    public native void setEntries(NSArray<NSNumber> v);
    @Property(selector = "centeredEntries")
    public native NSArray<NSNumber> getCenteredEntries();
    @Property(selector = "setCenteredEntries:")
    public native void setCenteredEntries(NSArray<NSNumber> v);
    @Property(selector = "entryCount")
    public native @MachineSizedSInt long getEntryCount();
    @Property(selector = "decimals")
    public native @MachineSizedSInt long getDecimals();
    @Property(selector = "setDecimals:")
    public native void setDecimals(@MachineSizedSInt long v);
    @Property(selector = "granularityEnabled")
    public native boolean granularityEnabled();
    @Property(selector = "setGranularityEnabled:")
    public native void setGranularityEnabled(boolean v);
    @Property(selector = "granularity")
    public native double getGranularity();
    @Property(selector = "setGranularity:")
    public native void setGranularity(double v);
    @Property(selector = "isGranularityEnabled")
    public native boolean isGranularityEnabled();
    @Property(selector = "forceLabelsEnabled")
    public native boolean forceLabelsEnabled();
    @Property(selector = "setForceLabelsEnabled:")
    public native void setForceLabelsEnabled(boolean v);
    @Property(selector = "valueFormatter")
    public native ChartAxisValueFormatter getValueFormatter();
    @Property(selector = "setValueFormatter:")
    public native void setValueFormatter(ChartAxisValueFormatter v);
    @Property(selector = "isDrawGridLinesEnabled")
    public native boolean isDrawGridLinesEnabled();
    @Property(selector = "isDrawAxisLineEnabled")
    public native boolean isDrawAxisLineEnabled();
    @Property(selector = "isDrawLabelsEnabled")
    public native boolean isDrawLabelsEnabled();
    @Property(selector = "isDrawLimitLinesBehindDataEnabled")
    public native boolean isDrawLimitLinesBehindDataEnabled();
    @Property(selector = "isDrawGridLinesBehindDataEnabled")
    public native boolean isDrawGridLinesBehindDataEnabled();
    @Property(selector = "spaceMin")
    public native double getSpaceMin();
    @Property(selector = "setSpaceMin:")
    public native void setSpaceMin(double v);
    @Property(selector = "spaceMax")
    public native double getSpaceMax();
    @Property(selector = "setSpaceMax:")
    public native void setSpaceMax(double v);
    @Property(selector = "axisRange")
    public native double getAxisRange();
    @Property(selector = "setAxisRange:")
    public native void setAxisRange(double v);
    @Property(selector = "axisMinLabels")
    public native @MachineSizedSInt long getAxisMinLabels();
    @Property(selector = "setAxisMinLabels:")
    public native void setAxisMinLabels(@MachineSizedSInt long v);
    @Property(selector = "axisMaxLabels")
    public native @MachineSizedSInt long getAxisMaxLabels();
    @Property(selector = "setAxisMaxLabels:")
    public native void setAxisMaxLabels(@MachineSizedSInt long v);
    @Property(selector = "labelCount")
    public native @MachineSizedSInt long getLabelCount();
    @Property(selector = "setLabelCount:")
    public native void setLabelCount(@MachineSizedSInt long v);
    @Property(selector = "isForceLabelsEnabled")
    public native boolean isForceLabelsEnabled();
    @Property(selector = "limitLines")
    public native NSArray<ChartLimitLine> getLimitLines();
    @Property(selector = "isAxisMinCustom")
    public native boolean isAxisMinCustom();
    @Property(selector = "isAxisMaxCustom")
    public native boolean isAxisMaxCustom();
    @Property(selector = "axisMinimum")
    public native double getAxisMinimum();
    @Property(selector = "setAxisMinimum:")
    public native void setAxisMinimum(double v);
    @Property(selector = "axisMaximum")
    public native double getAxisMaximum();
    @Property(selector = "setAxisMaximum:")
    public native void setAxisMaximum(double v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "getLongestLabel")
    public native String getLongestLabel();
    @Method(selector = "getFormattedLabel:")
    public native String getFormattedLabel(@MachineSizedSInt long index);
    @Method(selector = "setLabelCount:force:")
    public native void setLabelCount(@MachineSizedSInt long count, boolean force);
    @Method(selector = "addLimitLine:")
    public native void addLimitLine(ChartLimitLine line);
    @Method(selector = "removeLimitLine:")
    public native void removeLimitLine(ChartLimitLine line);
    @Method(selector = "removeAllLimitLines")
    public native void removeAllLimitLines();
    @Method(selector = "resetCustomAxisMin")
    public native void resetCustomAxisMin();
    @Method(selector = "resetCustomAxisMax")
    public native void resetCustomAxisMax();
    @Method(selector = "calculateWithMin:max:")
    public native void calculate(double dataMin, double dataMax);
    /*</methods>*/
}
