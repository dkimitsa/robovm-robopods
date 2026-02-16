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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ChartDefaultValueFormatter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements ChartValueFormatter/*</implements>*/ {

    /*<ptr>*/public static class ChartDefaultValueFormatterPtr extends Ptr<ChartDefaultValueFormatter, ChartDefaultValueFormatterPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ChartDefaultValueFormatter.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public ChartDefaultValueFormatter() {}
    protected ChartDefaultValueFormatter(Handle h, long handle) { super(h, handle); }
    protected ChartDefaultValueFormatter(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithFormatter:")
    public ChartDefaultValueFormatter(NSNumberFormatter formatter) { super((SkipInit) null); initObject(init(formatter)); }
    @Method(selector = "initWithDecimals:")
    public ChartDefaultValueFormatter(@MachineSizedSInt long decimals) { super((SkipInit) null); initObject(init(decimals)); }
    @Method(selector = "initWithBlock:")
    public ChartDefaultValueFormatter(@Block("(,,@MachineSizedSInt,)") Block4<Double, ChartDataEntry, Long, ChartViewPortHandler, String> block) { super((SkipInit) null); initObject(init(block)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "block")
    public native @Block("(,,@MachineSizedSInt,)") Block4<Double, ChartDataEntry, Long, ChartViewPortHandler, String> getBlock();
    @Property(selector = "setBlock:")
    public native void setBlock(@Block("(,,@MachineSizedSInt,)") Block4<Double, ChartDataEntry, Long, ChartViewPortHandler, String> v);
    @Property(selector = "hasAutoDecimals")
    public native boolean hasAutoDecimals();
    @Property(selector = "setHasAutoDecimals:")
    public native void setHasAutoDecimals(boolean v);
    @Property(selector = "formatter")
    public native NSNumberFormatter getFormatter();
    @Property(selector = "setFormatter:")
    public native void setFormatter(NSNumberFormatter v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithFormatter:")
    protected native @Pointer long init(NSNumberFormatter formatter);
    @Method(selector = "initWithDecimals:")
    protected native @Pointer long init(@MachineSizedSInt long decimals);
    @Method(selector = "initWithBlock:")
    protected native @Pointer long init(@Block("(,,@MachineSizedSInt,)") Block4<Double, ChartDataEntry, Long, ChartViewPortHandler, String> block);
    @Method(selector = "stringForValue:entry:dataSetIndex:viewPortHandler:")
    public native String getStringForValue(double value, ChartDataEntry entry, @MachineSizedSInt long dataSetIndex, ChartViewPortHandler viewPortHandler);
    /**
     * @deprecated Use `init(block:)` instead.
     */
    @Deprecated
    @Method(selector = "withBlock:")
    public static native ChartDefaultValueFormatter withBlock(@Block("(,,@MachineSizedSInt,)") Block4<Double, ChartDataEntry, Long, ChartViewPortHandler, String> block);
    /*</methods>*/
}
