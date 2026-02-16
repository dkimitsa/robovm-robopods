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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("DGCharts.ChartDataSet")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ChartDataSet/*</name>*/ 
    extends /*<extends>*/ChartBaseDataSet/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class ChartDataSetPtr extends Ptr<ChartDataSet, ChartDataSetPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ChartDataSet.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public ChartDataSet() {}
    protected ChartDataSet(Handle h, long handle) { super(h, handle); }
    protected ChartDataSet(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithLabel:")
    public ChartDataSet(String label) { super((SkipInit) null); initObject(init(label)); }
    @Method(selector = "initWithEntries:label:")
    public ChartDataSet(NSArray<ChartDataEntry> entries, String label) { super((SkipInit) null); initObject(init(entries, label)); }
    @Method(selector = "initWithEntries:")
    public ChartDataSet(NSArray<ChartDataEntry> entries) { super((SkipInit) null); initObject(init(entries)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "entries")
    public native NSArray<ChartDataEntry> getEntries();
    @Property(selector = "yMin")
    public native double getYMin();
    @Property(selector = "yMax")
    public native double getYMax();
    @Property(selector = "xMin")
    public native double getXMin();
    @Property(selector = "xMax")
    public native double getXMax();
    /**
     * @deprecated Use `count` instead
     */
    @Deprecated
    @Property(selector = "entryCount")
    public native @MachineSizedSInt long getEntryCount();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithLabel:")
    protected native @Pointer long init(String label);
    @Method(selector = "initWithEntries:label:")
    protected native @Pointer long init(NSArray<ChartDataEntry> entries, String label);
    @Method(selector = "initWithEntries:")
    protected native @Pointer long init(NSArray<ChartDataEntry> entries);
    @Method(selector = "replaceEntries:")
    public native void replaceEntries(NSArray<ChartDataEntry> entries);
    @Method(selector = "calcMinMax")
    public native void calcMinMax();
    @Method(selector = "calcMinMaxYFromX:toX:")
    public native void calcMinMaxY(double fromX, double toX);
    @Method(selector = "calcMinMaxXWithEntry:")
    public native void calcMinMaxX(ChartDataEntry e);
    @Method(selector = "calcMinMaxYWithEntry:")
    public native void calcMinMaxY(ChartDataEntry e);
    /**
     * @deprecated Use `subscript(index:)` instead.
     */
    @Deprecated
    @Method(selector = "entryForIndex:")
    public native ChartDataEntry entryForIndex(@MachineSizedSInt long i);
    @Method(selector = "entryForXValue:closestToY:rounding:")
    public native ChartDataEntry getEntry(double xValue, double yValue, ChartDataSetRounding rounding);
    @Method(selector = "entryForXValue:closestToY:")
    public native ChartDataEntry getEntry(double xValue, double yValue);
    @Method(selector = "entriesForXValue:")
    public native NSArray<ChartDataEntry> getEntries(double xValue);
    @Method(selector = "entryIndexWithX:closestToY:rounding:")
    public native @MachineSizedSInt long getEntryIndex(double xValue, double yValue, ChartDataSetRounding rounding);
    /**
     * @deprecated Use `firstIndex(of:)` or `lastIndex(of:)`
     */
    @Deprecated
    @Method(selector = "entryIndexWithEntry:")
    public native @MachineSizedSInt long getEntryIndex(ChartDataEntry e);
    /**
     * @deprecated Use `append(_:)` instead. Use append(_:)
     */
    @Deprecated
    @Method(selector = "addEntry:")
    public native boolean addEntry(ChartDataEntry e);
    @Method(selector = "addEntryOrdered:")
    public native boolean addEntryOrdered(ChartDataEntry e);
    @Method(selector = "removeEntry:")
    public native boolean removeEntry(ChartDataEntry entry);
    /**
     * @deprecated Use `func removeFirst() -> ChartDataEntry` instead.
     */
    @Deprecated
    @Method(selector = "removeFirst")
    public native boolean removeFirst();
    /**
     * @deprecated Use `func removeLast() -> ChartDataEntry` instead.
     */
    @Deprecated
    @Method(selector = "removeLast")
    public native boolean removeLast();
    /**
     * @deprecated Use `removeAll(keepingCapacity:)` instead.
     */
    @Deprecated
    @Method(selector = "clear")
    public native void clear();
    @Method(selector = "copyWithZone:")
    public native NSObject copy(NSZone zone);
    @Method(selector = "removeAllWithKeepingCapacity:")
    public native void removeAll(boolean keepCapacity);
    @Method(selector = "objectAtIndexedSubscript:")
    public native ChartDataEntry objectAtIndexedSubscript(@MachineSizedSInt long position);
    @Method(selector = "setObject:atIndexedSubscript:")
    public native void setObject(ChartDataEntry newValue, @MachineSizedSInt long position);
    /*</methods>*/
}
