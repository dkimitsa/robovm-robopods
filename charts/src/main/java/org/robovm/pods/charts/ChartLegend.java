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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ChartLegend/*</name>*/ 
    extends /*<extends>*/ChartComponentBase/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class ChartLegendPtr extends Ptr<ChartLegend, ChartLegendPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ChartLegend.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public ChartLegend() {}
    protected ChartLegend(Handle h, long handle) { super(h, handle); }
    protected ChartLegend(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithEntries:")
    public ChartLegend(NSArray<ChartLegendEntry> entries) { super((SkipInit) null); initObject(init(entries)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "entries")
    public native NSArray<ChartLegendEntry> getEntries();
    @Property(selector = "setEntries:")
    public native void setEntries(NSArray<ChartLegendEntry> v);
    @Property(selector = "extraEntries")
    public native NSArray<ChartLegendEntry> getExtraEntries();
    @Property(selector = "setExtraEntries:")
    public native void setExtraEntries(NSArray<ChartLegendEntry> v);
    @Property(selector = "horizontalAlignment")
    public native ChartLegendHorizontalAlignment getHorizontalAlignment();
    @Property(selector = "setHorizontalAlignment:")
    public native void setHorizontalAlignment(ChartLegendHorizontalAlignment v);
    @Property(selector = "verticalAlignment")
    public native ChartLegendVerticalAlignment getVerticalAlignment();
    @Property(selector = "setVerticalAlignment:")
    public native void setVerticalAlignment(ChartLegendVerticalAlignment v);
    @Property(selector = "orientation")
    public native ChartLegendOrientation getOrientation();
    @Property(selector = "setOrientation:")
    public native void setOrientation(ChartLegendOrientation v);
    @Property(selector = "drawInside")
    public native boolean isDrawInside();
    @Property(selector = "setDrawInside:")
    public native void setDrawInside(boolean v);
    @Property(selector = "isDrawInsideEnabled")
    public native boolean isDrawInsideEnabled();
    @Property(selector = "direction")
    public native ChartLegendDirection getDirection();
    @Property(selector = "setDirection:")
    public native void setDirection(ChartLegendDirection v);
    @Property(selector = "font")
    public native UIFont getFont();
    @Property(selector = "setFont:")
    public native void setFont(UIFont v);
    @Property(selector = "textColor")
    public native UIColor getTextColor();
    @Property(selector = "setTextColor:")
    public native void setTextColor(UIColor v);
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
    @Property(selector = "xEntrySpace")
    public native @MachineSizedFloat double getXEntrySpace();
    @Property(selector = "setXEntrySpace:")
    public native void setXEntrySpace(@MachineSizedFloat double v);
    @Property(selector = "yEntrySpace")
    public native @MachineSizedFloat double getYEntrySpace();
    @Property(selector = "setYEntrySpace:")
    public native void setYEntrySpace(@MachineSizedFloat double v);
    @Property(selector = "formToTextSpace")
    public native @MachineSizedFloat double getFormToTextSpace();
    @Property(selector = "setFormToTextSpace:")
    public native void setFormToTextSpace(@MachineSizedFloat double v);
    @Property(selector = "stackSpace")
    public native @MachineSizedFloat double getStackSpace();
    @Property(selector = "setStackSpace:")
    public native void setStackSpace(@MachineSizedFloat double v);
    @Property(selector = "calculatedLabelSizes")
    public native NSArray<NSValue> getCalculatedLabelSizes();
    @Property(selector = "setCalculatedLabelSizes:")
    public native void setCalculatedLabelSizes(NSArray<NSValue> v);
    @Property(selector = "calculatedLabelBreakPoints")
    public native NSArray<NSNumber> getCalculatedLabelBreakPoints();
    @Property(selector = "setCalculatedLabelBreakPoints:")
    public native void setCalculatedLabelBreakPoints(NSArray<NSNumber> v);
    @Property(selector = "calculatedLineSizes")
    public native NSArray<NSValue> getCalculatedLineSizes();
    @Property(selector = "setCalculatedLineSizes:")
    public native void setCalculatedLineSizes(NSArray<NSValue> v);
    @Property(selector = "neededWidth")
    public native @MachineSizedFloat double getNeededWidth();
    @Property(selector = "setNeededWidth:")
    public native void setNeededWidth(@MachineSizedFloat double v);
    @Property(selector = "neededHeight")
    public native @MachineSizedFloat double getNeededHeight();
    @Property(selector = "setNeededHeight:")
    public native void setNeededHeight(@MachineSizedFloat double v);
    @Property(selector = "textWidthMax")
    public native @MachineSizedFloat double getTextWidthMax();
    @Property(selector = "setTextWidthMax:")
    public native void setTextWidthMax(@MachineSizedFloat double v);
    @Property(selector = "textHeightMax")
    public native @MachineSizedFloat double getTextHeightMax();
    @Property(selector = "setTextHeightMax:")
    public native void setTextHeightMax(@MachineSizedFloat double v);
    @Property(selector = "wordWrapEnabled")
    public native boolean wordWrapEnabled();
    @Property(selector = "setWordWrapEnabled:")
    public native void setWordWrapEnabled(boolean v);
    @Property(selector = "isWordWrapEnabled")
    public native boolean isWordWrapEnabled();
    @Property(selector = "maxSizePercent")
    public native @MachineSizedFloat double getMaxSizePercent();
    @Property(selector = "setMaxSizePercent:")
    public native void setMaxSizePercent(@MachineSizedFloat double v);
    @Property(selector = "isLegendCustom")
    public native boolean isLegendCustom();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithEntries:")
    protected native @Pointer long init(NSArray<ChartLegendEntry> entries);
    @Method(selector = "getMaximumEntrySizeWithFont:")
    public native @ByVal CGSize getMaximumEntrySize(UIFont font);
    @Method(selector = "calculateDimensionsWithLabelFont:viewPortHandler:")
    public native void calculateDimensions(UIFont labelFont, ChartViewPortHandler viewPortHandler);
    @Method(selector = "setCustomWithEntries:")
    public native void setCustom(NSArray<ChartLegendEntry> entries);
    @Method(selector = "resetCustom")
    public native void resetCustom();
    /*</methods>*/
}
