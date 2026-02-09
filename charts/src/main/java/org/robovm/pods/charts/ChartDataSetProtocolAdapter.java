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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ChartDataSetProtocolAdapter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements ChartDataSetProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*/
    @NotImplemented("yMin")
    public double getYMin() { return 0; }
    @NotImplemented("yMax")
    public double getYMax() { return 0; }
    @NotImplemented("xMin")
    public double getXMin() { return 0; }
    @NotImplemented("xMax")
    public double getXMax() { return 0; }
    @NotImplemented("entryCount")
    public @MachineSizedSInt long getEntryCount() { return 0; }
    @NotImplemented("label")
    public String getLabel() { return null; }
    @NotImplemented("axisDependency")
    public AxisDependency getAxisDependency() { return null; }
    @NotImplemented("valueColors")
    public NSArray<UIColor> getValueColors() { return null; }
    @NotImplemented("colors")
    public NSArray<UIColor> getColors() { return null; }
    @NotImplemented("highlightEnabled")
    public boolean highlightEnabled() { return false; }
    @NotImplemented("setHighlightEnabled:")
    public void setHighlightEnabled(boolean v) {}
    @NotImplemented("isHighlightEnabled")
    public boolean isHighlightEnabled() { return false; }
    @NotImplemented("valueFormatter")
    public ChartValueFormatter getValueFormatter() { return null; }
    @NotImplemented("setValueFormatter:")
    public void setValueFormatter(ChartValueFormatter v) {}
    @NotImplemented("valueTextColor")
    public UIColor getValueTextColor() { return null; }
    @NotImplemented("setValueTextColor:")
    public void setValueTextColor(UIColor v) {}
    @NotImplemented("valueFont")
    public UIFont getValueFont() { return null; }
    @NotImplemented("setValueFont:")
    public void setValueFont(UIFont v) {}
    @NotImplemented("valueLabelAngle")
    public @MachineSizedFloat double getValueLabelAngle() { return 0; }
    @NotImplemented("setValueLabelAngle:")
    public void setValueLabelAngle(@MachineSizedFloat double v) {}
    @NotImplemented("form")
    public ChartLegendForm getForm() { return null; }
    @NotImplemented("formSize")
    public @MachineSizedFloat double getFormSize() { return 0; }
    @NotImplemented("formLineWidth")
    public @MachineSizedFloat double getFormLineWidth() { return 0; }
    @NotImplemented("formLineDashPhase")
    public @MachineSizedFloat double getFormLineDashPhase() { return 0; }
    @NotImplemented("formLineDashLengths")
    public NSArray<NSNumber> getFormLineDashLengths() { return null; }
    @NotImplemented("drawValuesEnabled")
    public boolean drawValuesEnabled() { return false; }
    @NotImplemented("setDrawValuesEnabled:")
    public void setDrawValuesEnabled(boolean v) {}
    @NotImplemented("isDrawValuesEnabled")
    public boolean isDrawValuesEnabled() { return false; }
    @NotImplemented("drawIconsEnabled")
    public boolean drawIconsEnabled() { return false; }
    @NotImplemented("setDrawIconsEnabled:")
    public void setDrawIconsEnabled(boolean v) {}
    @NotImplemented("isDrawIconsEnabled")
    public boolean isDrawIconsEnabled() { return false; }
    @NotImplemented("iconsOffset")
    public @ByVal CGPoint getIconsOffset() { return null; }
    @NotImplemented("setIconsOffset:")
    public void setIconsOffset(@ByVal CGPoint v) {}
    @NotImplemented("visible")
    public boolean visible() { return false; }
    @NotImplemented("setVisible:")
    public void setVisible(boolean v) {}
    @NotImplemented("isVisible")
    public boolean isVisible() { return false; }
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @NotImplemented("notifyDataSetChanged")
    public void notifyDataSetChanged() {}
    @NotImplemented("calcMinMax")
    public void calcMinMax() {}
    @NotImplemented("calcMinMaxYFromX:toX:")
    public void calcMinMaxY(double fromX, double toX) {}
    @NotImplemented("entryForIndex:")
    public ChartDataEntry entryForIndex(@MachineSizedSInt long i) { return null; }
    @NotImplemented("entryForXValue:closestToY:rounding:")
    public ChartDataEntry getEntry(double xValue, double yValue, ChartDataSetRounding rounding) { return null; }
    @NotImplemented("entryForXValue:closestToY:")
    public ChartDataEntry getEntry(double xValue, double yValue) { return null; }
    @NotImplemented("entriesForXValue:")
    public NSArray<ChartDataEntry> getEntries(double xValue) { return null; }
    @NotImplemented("entryIndexWithX:closestToY:rounding:")
    public @MachineSizedSInt long getEntryIndex(double xValue, double yValue, ChartDataSetRounding rounding) { return 0; }
    @NotImplemented("entryIndexWithEntry:")
    public @MachineSizedSInt long getEntryIndex(ChartDataEntry e) { return 0; }
    @NotImplemented("addEntry:")
    public boolean addEntry(ChartDataEntry e) { return false; }
    @NotImplemented("addEntryOrdered:")
    public boolean addEntryOrdered(ChartDataEntry e) { return false; }
    @NotImplemented("removeEntry:")
    public boolean removeEntry(ChartDataEntry entry) { return false; }
    @NotImplemented("removeEntryWithIndex:")
    public boolean removeEntry(@MachineSizedSInt long index) { return false; }
    @NotImplemented("removeEntryWithX:")
    public boolean removeEntry(double x) { return false; }
    @NotImplemented("removeFirst")
    public boolean removeFirst() { return false; }
    @NotImplemented("removeLast")
    public boolean removeLast() { return false; }
    @NotImplemented("contains:")
    public boolean contains(ChartDataEntry e) { return false; }
    @NotImplemented("clear")
    public void clear() {}
    @NotImplemented("colorAtIndex:")
    public UIColor colorAtIndex(@MachineSizedSInt long atIndex) { return null; }
    @NotImplemented("resetColors")
    public void resetColors() {}
    @NotImplemented("addColor:")
    public void addColor(UIColor color) {}
    @NotImplemented("setColor:")
    public void setColor(UIColor color) {}
    @NotImplemented("valueTextColorAt:")
    public UIColor valueTextColorAt(@MachineSizedSInt long index) { return null; }
    /*</methods>*/
}
