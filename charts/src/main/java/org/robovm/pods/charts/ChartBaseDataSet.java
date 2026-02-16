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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("DGCharts.ChartBaseDataSet")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ChartBaseDataSet/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements ChartDataSetProtocol/*</implements>*/ {

    /*<ptr>*/public static class ChartBaseDataSetPtr extends Ptr<ChartBaseDataSet, ChartBaseDataSetPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ChartBaseDataSet.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public ChartBaseDataSet() {}
    protected ChartBaseDataSet(Handle h, long handle) { super(h, handle); }
    protected ChartBaseDataSet(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithLabel:")
    public ChartBaseDataSet(String label) { super((SkipInit) null); initObject(init(label)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "yMin")
    public native double getYMin();
    @Property(selector = "yMax")
    public native double getYMax();
    @Property(selector = "xMin")
    public native double getXMin();
    @Property(selector = "xMax")
    public native double getXMax();
    @Property(selector = "entryCount")
    public native @MachineSizedSInt long getEntryCount();
    @Property(selector = "colors")
    public native NSArray<UIColor> getColors();
    @Property(selector = "setColors:")
    public native void setColors(NSArray<UIColor> v);
    @Property(selector = "valueColors")
    public native NSArray<UIColor> getValueColors();
    @Property(selector = "setValueColors:")
    public native void setValueColors(NSArray<UIColor> v);
    @Property(selector = "label")
    public native String getLabel();
    @Property(selector = "setLabel:")
    public native void setLabel(String v);
    @Property(selector = "axisDependency")
    public native AxisDependency getAxisDependency();
    @Property(selector = "setAxisDependency:")
    public native void setAxisDependency(AxisDependency v);
    @Property(selector = "highlightEnabled")
    public native boolean highlightEnabled();
    @Property(selector = "setHighlightEnabled:")
    public native void setHighlightEnabled(boolean v);
    @Property(selector = "isHighlightEnabled")
    public native boolean isHighlightEnabled();
    @Property(selector = "valueFormatter")
    public native ChartValueFormatter getValueFormatter();
    @Property(selector = "setValueFormatter:")
    public native void setValueFormatter(ChartValueFormatter v);
    @Property(selector = "valueTextColor")
    public native UIColor getValueTextColor();
    @Property(selector = "setValueTextColor:")
    public native void setValueTextColor(UIColor v);
    @Property(selector = "valueFont")
    public native UIFont getValueFont();
    @Property(selector = "setValueFont:")
    public native void setValueFont(UIFont v);
    @Property(selector = "valueLabelAngle")
    public native @MachineSizedFloat double getValueLabelAngle();
    @Property(selector = "setValueLabelAngle:")
    public native void setValueLabelAngle(@MachineSizedFloat double v);
    @Property(selector = "form")
    public native ChartLegendForm getForm();
    @Property(selector = "setForm:")
    public native void setForm(ChartLegendForm v);
    @Property(selector = "formSize")
    public native @MachineSizedFloat double getFormSize();
    @Property(selector = "setFormSize:")
    public native void setFormSize(@MachineSizedFloat double v);
    @Property(selector = "formLineWidth")
    public native @MachineSizedFloat double getFormLineWidth();
    @Property(selector = "setFormLineWidth:")
    public native void setFormLineWidth(@MachineSizedFloat double v);
    @Property(selector = "formLineDashPhase")
    public native @MachineSizedFloat double getFormLineDashPhase();
    @Property(selector = "setFormLineDashPhase:")
    public native void setFormLineDashPhase(@MachineSizedFloat double v);
    @Property(selector = "formLineDashLengths")
    public native NSArray<NSNumber> getFormLineDashLengths();
    @Property(selector = "setFormLineDashLengths:")
    public native void setFormLineDashLengths(NSArray<NSNumber> v);
    @Property(selector = "drawValuesEnabled")
    public native boolean drawValuesEnabled();
    @Property(selector = "setDrawValuesEnabled:")
    public native void setDrawValuesEnabled(boolean v);
    @Property(selector = "isDrawValuesEnabled")
    public native boolean isDrawValuesEnabled();
    @Property(selector = "drawIconsEnabled")
    public native boolean drawIconsEnabled();
    @Property(selector = "setDrawIconsEnabled:")
    public native void setDrawIconsEnabled(boolean v);
    @Property(selector = "isDrawIconsEnabled")
    public native boolean isDrawIconsEnabled();
    @Property(selector = "iconsOffset")
    public native @ByVal CGPoint getIconsOffset();
    @Property(selector = "setIconsOffset:")
    public native void setIconsOffset(@ByVal CGPoint v);
    @Property(selector = "visible")
    public native boolean visible();
    @Property(selector = "setVisible:")
    public native void setVisible(boolean v);
    @Property(selector = "isVisible")
    public native boolean isVisible();
    @Property(selector = "description")
    public native String getDescription();
    @Property(selector = "debugDescription")
    public native String getDebugDescription();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithLabel:")
    protected native @Pointer long init(String label);
    @Method(selector = "notifyDataSetChanged")
    public native void notifyDataSetChanged();
    @Method(selector = "calcMinMax")
    public native void calcMinMax();
    @Method(selector = "calcMinMaxYFromX:toX:")
    public native void calcMinMaxY(double fromX, double toX);
    @Method(selector = "entryForIndex:")
    public native ChartDataEntry entryForIndex(@MachineSizedSInt long i);
    @Method(selector = "entryForXValue:closestToY:rounding:")
    public native ChartDataEntry getEntry(double x, double y, ChartDataSetRounding rounding);
    @Method(selector = "entryForXValue:closestToY:")
    public native ChartDataEntry getEntry(double x, double y);
    @Method(selector = "entriesForXValue:")
    public native NSArray<ChartDataEntry> getEntries(double x);
    @Method(selector = "entryIndexWithX:closestToY:rounding:")
    public native @MachineSizedSInt long getEntryIndex(double xValue, double y, ChartDataSetRounding rounding);
    @Method(selector = "entryIndexWithEntry:")
    public native @MachineSizedSInt long getEntryIndex(ChartDataEntry e);
    @Method(selector = "addEntry:")
    public native boolean addEntry(ChartDataEntry e);
    @Method(selector = "addEntryOrdered:")
    public native boolean addEntryOrdered(ChartDataEntry e);
    @Method(selector = "removeEntry:")
    public native boolean removeEntry(ChartDataEntry entry);
    @Method(selector = "removeEntryWithIndex:")
    public native boolean removeEntry(@MachineSizedSInt long index);
    @Method(selector = "removeEntryWithX:")
    public native boolean removeEntry(double x);
    @Method(selector = "removeFirst")
    public native boolean removeFirst();
    @Method(selector = "removeLast")
    public native boolean removeLast();
    @Method(selector = "contains:")
    public native boolean contains(ChartDataEntry e);
    @Method(selector = "clear")
    public native void clear();
    @Method(selector = "colorAtIndex:")
    public native UIColor colorAtIndex(@MachineSizedSInt long index);
    @Method(selector = "resetColors")
    public native void resetColors();
    @Method(selector = "addColor:")
    public native void addColor(UIColor color);
    @Method(selector = "setColor:")
    public native void setColor(UIColor color);
    @Method(selector = "setColor:alpha:")
    public native void setColor(UIColor color, @MachineSizedFloat double alpha);
    @Method(selector = "setColors:alpha:")
    public native void setColors(NSArray<UIColor> colors, @MachineSizedFloat double alpha);
    @Method(selector = "valueTextColorAt:")
    public native UIColor valueTextColorAt(@MachineSizedSInt long index);
    @Method(selector = "copyWithZone:")
    public native NSObject copy(NSZone zone);
    /*</methods>*/
}
