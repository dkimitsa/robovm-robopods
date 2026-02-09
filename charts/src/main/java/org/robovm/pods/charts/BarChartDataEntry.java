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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("DGCharts.BarChartDataEntry")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/BarChartDataEntry/*</name>*/ 
    extends /*<extends>*/ChartDataEntry/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class BarChartDataEntryPtr extends Ptr<BarChartDataEntry, BarChartDataEntryPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(BarChartDataEntry.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public BarChartDataEntry() {}
    protected BarChartDataEntry(Handle h, long handle) { super(h, handle); }
    protected BarChartDataEntry(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithX:y:")
    public BarChartDataEntry(double x, double y) { super((SkipInit) null); initObject(init(x, y)); }
    @Method(selector = "initWithX:y:data:")
    public BarChartDataEntry(double x, double y, NSObject data) { super((SkipInit) null); initObject(init(x, y, data)); }
    @Method(selector = "initWithX:y:icon:")
    public BarChartDataEntry(double x, double y, UIImage icon) { super((SkipInit) null); initObject(init(x, y, icon)); }
    @Method(selector = "initWithX:y:icon:data:")
    public BarChartDataEntry(double x, double y, UIImage icon, NSObject data) { super((SkipInit) null); initObject(init(x, y, icon, data)); }
    @Method(selector = "initWithX:yValues:")
    public BarChartDataEntry(double x, NSArray<NSNumber> yValues) { super((SkipInit) null); initObject(init(x, yValues)); }
    @Method(selector = "initWithX:yValues:icon:")
    public BarChartDataEntry(double x, NSArray<NSNumber> yValues, UIImage icon) { super((SkipInit) null); initObject(init(x, yValues, icon)); }
    @Method(selector = "initWithX:yValues:data:")
    public BarChartDataEntry(double x, NSArray<NSNumber> yValues, NSObject data) { super((SkipInit) null); initObject(init(x, yValues, data)); }
    @Method(selector = "initWithX:yValues:icon:data:")
    public BarChartDataEntry(double x, NSArray<NSNumber> yValues, UIImage icon, NSObject data) { super((SkipInit) null); initObject(init(x, yValues, icon, data)); }
    @Method(selector = "initWithY:data:")
    public BarChartDataEntry(ArgsYData tuple) { super(tuple); }
    @Method(selector = "initWithY:icon:")
    public BarChartDataEntry(ArgsYIcon tuple) { super(tuple); }
    @Method(selector = "initWithY:icon:data:")
    public BarChartDataEntry(ArgsYIconData tuple) { super(tuple); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "negativeSum")
    public native double getNegativeSum();
    @Property(selector = "positiveSum")
    public native double getPositiveSum();
    @Property(selector = "isStacked")
    public native boolean isStacked();
    @Property(selector = "yValues")
    public native NSArray<NSNumber> getYValues();
    @Property(selector = "setYValues:")
    public native void setYValues(NSArray<NSNumber> v);
    @Property(selector = "ranges")
    public native NSArray<ChartRange> getRanges();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithX:y:")
    protected native @Pointer long init(double x, double y);
    @Method(selector = "initWithX:y:data:")
    protected native @Pointer long init(double x, double y, NSObject data);
    @Method(selector = "initWithX:y:icon:")
    protected native @Pointer long init(double x, double y, UIImage icon);
    @Method(selector = "initWithX:y:icon:data:")
    protected native @Pointer long init(double x, double y, UIImage icon, NSObject data);
    @Method(selector = "initWithX:yValues:")
    protected native @Pointer long init(double x, NSArray<NSNumber> yValues);
    @Method(selector = "initWithX:yValues:icon:")
    protected native @Pointer long init(double x, NSArray<NSNumber> yValues, UIImage icon);
    @Method(selector = "initWithX:yValues:data:")
    protected native @Pointer long init(double x, NSArray<NSNumber> yValues, NSObject data);
    @Method(selector = "initWithX:yValues:icon:data:")
    protected native @Pointer long init(double x, NSArray<NSNumber> yValues, UIImage icon, NSObject data);
    @Method(selector = "sumBelowStackIndex:")
    public native double sumBelowStackIndex(@MachineSizedSInt long stackIndex);
    @Method(selector = "calcPosNegSum")
    public native void calcPosNegSum();
    @Method(selector = "calcRanges")
    public native void calcRanges();
    @Method(selector = "copyWithZone:")
    public native NSObject copy(NSZone zone);
    /*</methods>*/
}
