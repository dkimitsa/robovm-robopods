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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ChartDefaultAxisValueFormatter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements ChartAxisValueFormatter/*</implements>*/ {

    /*<ptr>*/public static class ChartDefaultAxisValueFormatterPtr extends Ptr<ChartDefaultAxisValueFormatter, ChartDefaultAxisValueFormatterPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ChartDefaultAxisValueFormatter.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public ChartDefaultAxisValueFormatter() {}
    protected ChartDefaultAxisValueFormatter(Handle h, long handle) { super(h, handle); }
    protected ChartDefaultAxisValueFormatter(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithFormatter:")
    public ChartDefaultAxisValueFormatter(NSNumberFormatter formatter) { super((SkipInit) null); initObject(init(formatter)); }
    @Method(selector = "initWithDecimals:")
    public ChartDefaultAxisValueFormatter(@MachineSizedSInt long decimals) { super((SkipInit) null); initObject(init(decimals)); }
    @Method(selector = "initWithBlock:")
    public ChartDefaultAxisValueFormatter(@Block Block2<Double, ChartAxisBase, String> block) { super((SkipInit) null); initObject(init(block)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "block")
    public native @Block Block2<Double, ChartAxisBase, String> getBlock();
    @Property(selector = "setBlock:")
    public native void setBlock(@Block Block2<Double, ChartAxisBase, String> v);
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
    protected native @Pointer long init(@Block Block2<Double, ChartAxisBase, String> block);
    @Method(selector = "stringForValue:axis:")
    public native String getStringForValue(double value, ChartAxisBase axis);
    @Method(selector = "withBlock:")
    public static native ChartDefaultAxisValueFormatter withBlock(@Block Block2<Double, ChartAxisBase, String> block);
    /*</methods>*/
}
