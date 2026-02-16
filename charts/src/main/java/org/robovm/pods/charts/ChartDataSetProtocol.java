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
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/ChartDataSetProtocol/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    @Property(selector = "yMin")
    double getYMin();
    @Property(selector = "yMax")
    double getYMax();
    @Property(selector = "xMin")
    double getXMin();
    @Property(selector = "xMax")
    double getXMax();
    @Property(selector = "entryCount")
    @MachineSizedSInt long getEntryCount();
    @Property(selector = "label")
    String getLabel();
    @Property(selector = "axisDependency")
    AxisDependency getAxisDependency();
    @Property(selector = "valueColors")
    NSArray<UIColor> getValueColors();
    @Property(selector = "colors")
    NSArray<UIColor> getColors();
    @Property(selector = "highlightEnabled")
    boolean highlightEnabled();
    @Property(selector = "setHighlightEnabled:")
    void setHighlightEnabled(boolean v);
    @Property(selector = "isHighlightEnabled")
    boolean isHighlightEnabled();
    @Property(selector = "valueFormatter")
    ChartValueFormatter getValueFormatter();
    @Property(selector = "setValueFormatter:")
    void setValueFormatter(ChartValueFormatter v);
    @Property(selector = "valueTextColor")
    UIColor getValueTextColor();
    @Property(selector = "setValueTextColor:")
    void setValueTextColor(UIColor v);
    @Property(selector = "valueFont")
    UIFont getValueFont();
    @Property(selector = "setValueFont:")
    void setValueFont(UIFont v);
    @Property(selector = "valueLabelAngle")
    @MachineSizedFloat double getValueLabelAngle();
    @Property(selector = "setValueLabelAngle:")
    void setValueLabelAngle(@MachineSizedFloat double v);
    @Property(selector = "form")
    ChartLegendForm getForm();
    @Property(selector = "formSize")
    @MachineSizedFloat double getFormSize();
    @Property(selector = "formLineWidth")
    @MachineSizedFloat double getFormLineWidth();
    @Property(selector = "formLineDashPhase")
    @MachineSizedFloat double getFormLineDashPhase();
    @Property(selector = "formLineDashLengths")
    NSArray<NSNumber> getFormLineDashLengths();
    @Property(selector = "drawValuesEnabled")
    boolean drawValuesEnabled();
    @Property(selector = "setDrawValuesEnabled:")
    void setDrawValuesEnabled(boolean v);
    @Property(selector = "isDrawValuesEnabled")
    boolean isDrawValuesEnabled();
    @Property(selector = "drawIconsEnabled")
    boolean drawIconsEnabled();
    @Property(selector = "setDrawIconsEnabled:")
    void setDrawIconsEnabled(boolean v);
    @Property(selector = "isDrawIconsEnabled")
    boolean isDrawIconsEnabled();
    @Property(selector = "iconsOffset")
    @ByVal CGPoint getIconsOffset();
    @Property(selector = "setIconsOffset:")
    void setIconsOffset(@ByVal CGPoint v);
    @Property(selector = "visible")
    boolean visible();
    @Property(selector = "setVisible:")
    void setVisible(boolean v);
    @Property(selector = "isVisible")
    boolean isVisible();
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "notifyDataSetChanged")
    void notifyDataSetChanged();
    @Method(selector = "calcMinMax")
    void calcMinMax();
    @Method(selector = "calcMinMaxYFromX:toX:")
    void calcMinMaxY(double fromX, double toX);
    @Method(selector = "entryForIndex:")
    ChartDataEntry entryForIndex(@MachineSizedSInt long i);
    @Method(selector = "entryForXValue:closestToY:rounding:")
    ChartDataEntry getEntry(double xValue, double yValue, ChartDataSetRounding rounding);
    @Method(selector = "entryForXValue:closestToY:")
    ChartDataEntry getEntry(double xValue, double yValue);
    @Method(selector = "entriesForXValue:")
    NSArray<ChartDataEntry> getEntries(double xValue);
    @Method(selector = "entryIndexWithX:closestToY:rounding:")
    @MachineSizedSInt long getEntryIndex(double xValue, double yValue, ChartDataSetRounding rounding);
    @Method(selector = "entryIndexWithEntry:")
    @MachineSizedSInt long getEntryIndex(ChartDataEntry e);
    @Method(selector = "addEntry:")
    boolean addEntry(ChartDataEntry e);
    @Method(selector = "addEntryOrdered:")
    boolean addEntryOrdered(ChartDataEntry e);
    @Method(selector = "removeEntry:")
    boolean removeEntry(ChartDataEntry entry);
    @Method(selector = "removeEntryWithIndex:")
    boolean removeEntry(@MachineSizedSInt long index);
    @Method(selector = "removeEntryWithX:")
    boolean removeEntry(double x);
    @Method(selector = "removeFirst")
    boolean removeFirst();
    @Method(selector = "removeLast")
    boolean removeLast();
    @Method(selector = "contains:")
    boolean contains(ChartDataEntry e);
    @Method(selector = "clear")
    void clear();
    @Method(selector = "colorAtIndex:")
    UIColor colorAtIndex(@MachineSizedSInt long atIndex);
    @Method(selector = "resetColors")
    void resetColors();
    @Method(selector = "addColor:")
    void addColor(UIColor color);
    @Method(selector = "setColor:")
    void setColor(UIColor color);
    @Method(selector = "valueTextColorAt:")
    UIColor valueTextColorAt(@MachineSizedSInt long index);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
