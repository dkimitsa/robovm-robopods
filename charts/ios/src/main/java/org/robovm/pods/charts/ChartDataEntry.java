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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("DGCharts.ChartDataEntry")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ChartDataEntry/*</name>*/ 
    extends /*<extends>*/ChartDataEntryBase/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class ChartDataEntryPtr extends Ptr<ChartDataEntry, ChartDataEntryPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ChartDataEntry.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public ChartDataEntry() {}
    protected ChartDataEntry(Handle h, long handle) { super(h, handle); }
    protected ChartDataEntry(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithX:y:")
    public ChartDataEntry(double x, double y) { super((SkipInit) null); initObject(init(x, y)); }
    @Method(selector = "initWithX:y:data:")
    public ChartDataEntry(double x, double y, NSObject data) { super((SkipInit) null); initObject(init(x, y, data)); }
    @Method(selector = "initWithX:y:icon:")
    public ChartDataEntry(double x, double y, UIImage icon) { super((SkipInit) null); initObject(init(x, y, icon)); }
    @Method(selector = "initWithX:y:icon:data:")
    public ChartDataEntry(double x, double y, UIImage icon, NSObject data) { super((SkipInit) null); initObject(init(x, y, icon, data)); }
    @Method(selector = "initWithY:data:")
    public ChartDataEntry(ArgsYData tuple) { super(tuple); }
    @Method(selector = "initWithY:icon:")
    public ChartDataEntry(ArgsYIcon tuple) { super(tuple); }
    @Method(selector = "initWithY:icon:data:")
    public ChartDataEntry(ArgsYIconData tuple) { super(tuple); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "x")
    public native double getX();
    @Property(selector = "setX:")
    public native void setX(double v);
    @Property(selector = "description")
    public native String getDescription();
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
    @Method(selector = "copyWithZone:")
    public native NSObject copy(NSZone zone);
    @Method(selector = "isEqual:")
    public native boolean isEqual(NSObject object);
    /*</methods>*/
}
