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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("DGCharts.PieChartDataSet")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/PieChartDataSet/*</name>*/ 
    extends /*<extends>*/ChartDataSet/*</extends>*/ 
    /*<implements>*/implements PieChartDataSetProtocol/*</implements>*/ {

    /*<ptr>*/public static class PieChartDataSetPtr extends Ptr<PieChartDataSet, PieChartDataSetPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(PieChartDataSet.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public PieChartDataSet() {}
    protected PieChartDataSet(Handle h, long handle) { super(h, handle); }
    protected PieChartDataSet(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithEntries:label:")
    public PieChartDataSet(NSArray<ChartDataEntry> entries, String label) { super((SkipInit) null); initObject(init(entries, label)); }
    @Method(selector = "initWithLabel:")
    public PieChartDataSet(String label) { super(label); }
    @Method(selector = "initWithEntries:")
    public PieChartDataSet(NSArray<ChartDataEntry> entries) { super(entries); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "sliceSpace")
    public native @MachineSizedFloat double getSliceSpace();
    @Property(selector = "setSliceSpace:")
    public native void setSliceSpace(@MachineSizedFloat double v);
    @Property(selector = "automaticallyDisableSliceSpacing")
    public native boolean automaticallyDisableSliceSpacing();
    @Property(selector = "setAutomaticallyDisableSliceSpacing:")
    public native void setAutomaticallyDisableSliceSpacing(boolean v);
    @Property(selector = "selectionShift")
    public native @MachineSizedFloat double getSelectionShift();
    @Property(selector = "setSelectionShift:")
    public native void setSelectionShift(@MachineSizedFloat double v);
    @Property(selector = "xValuePosition")
    public native PieChartValuePosition getXValuePosition();
    @Property(selector = "setXValuePosition:")
    public native void setXValuePosition(PieChartValuePosition v);
    @Property(selector = "yValuePosition")
    public native PieChartValuePosition getYValuePosition();
    @Property(selector = "setYValuePosition:")
    public native void setYValuePosition(PieChartValuePosition v);
    @Property(selector = "valueLineColor")
    public native UIColor getValueLineColor();
    @Property(selector = "setValueLineColor:")
    public native void setValueLineColor(UIColor v);
    @Property(selector = "useValueColorForLine")
    public native boolean isUseValueColorForLine();
    @Property(selector = "setUseValueColorForLine:")
    public native void setUseValueColorForLine(boolean v);
    @Property(selector = "valueLineWidth")
    public native @MachineSizedFloat double getValueLineWidth();
    @Property(selector = "setValueLineWidth:")
    public native void setValueLineWidth(@MachineSizedFloat double v);
    @Property(selector = "valueLinePart1OffsetPercentage")
    public native @MachineSizedFloat double getValueLinePart1OffsetPercentage();
    @Property(selector = "setValueLinePart1OffsetPercentage:")
    public native void setValueLinePart1OffsetPercentage(@MachineSizedFloat double v);
    @Property(selector = "valueLinePart1Length")
    public native @MachineSizedFloat double getValueLinePart1Length();
    @Property(selector = "setValueLinePart1Length:")
    public native void setValueLinePart1Length(@MachineSizedFloat double v);
    @Property(selector = "valueLinePart2Length")
    public native @MachineSizedFloat double getValueLinePart2Length();
    @Property(selector = "setValueLinePart2Length:")
    public native void setValueLinePart2Length(@MachineSizedFloat double v);
    @Property(selector = "valueLineVariableLength")
    public native boolean isValueLineVariableLength();
    @Property(selector = "setValueLineVariableLength:")
    public native void setValueLineVariableLength(boolean v);
    @Property(selector = "entryLabelFont")
    public native UIFont getEntryLabelFont();
    @Property(selector = "setEntryLabelFont:")
    public native void setEntryLabelFont(UIFont v);
    @Property(selector = "entryLabelColor")
    public native UIColor getEntryLabelColor();
    @Property(selector = "setEntryLabelColor:")
    public native void setEntryLabelColor(UIColor v);
    @Property(selector = "highlightColor")
    public native UIColor getHighlightColor();
    @Property(selector = "setHighlightColor:")
    public native void setHighlightColor(UIColor v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithEntries:label:")
    protected native @Pointer long init(NSArray<ChartDataEntry> entries, String label);
    @Method(selector = "copyWithZone:")
    public native NSObject copy(NSZone zone);
    /*</methods>*/
}
