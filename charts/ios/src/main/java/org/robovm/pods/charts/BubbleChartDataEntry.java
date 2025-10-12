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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("DGCharts.BubbleChartDataEntry")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/BubbleChartDataEntry/*</name>*/ 
    extends /*<extends>*/ChartDataEntry/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class BubbleChartDataEntryPtr extends Ptr<BubbleChartDataEntry, BubbleChartDataEntryPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(BubbleChartDataEntry.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public BubbleChartDataEntry() {}
    protected BubbleChartDataEntry(Handle h, long handle) { super(h, handle); }
    protected BubbleChartDataEntry(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithX:y:size:")
    public BubbleChartDataEntry(double x, double y, @MachineSizedFloat double size) { super((SkipInit) null); initObject(init(x, y, size)); }
    @Method(selector = "initWithX:y:size:data:")
    public BubbleChartDataEntry(double x, double y, @MachineSizedFloat double size, NSObject data) { super((SkipInit) null); initObject(init(x, y, size, data)); }
    @Method(selector = "initWithX:y:size:icon:")
    public BubbleChartDataEntry(double x, double y, @MachineSizedFloat double size, UIImage icon) { super((SkipInit) null); initObject(init(x, y, size, icon)); }
    @Method(selector = "initWithX:y:size:icon:data:")
    public BubbleChartDataEntry(double x, double y, @MachineSizedFloat double size, UIImage icon, NSObject data) { super((SkipInit) null); initObject(init(x, y, size, icon, data)); }
    @Method(selector = "initWithX:y:data:")
    public BubbleChartDataEntry(double x, double y, NSObject data) { super(x, y, data); }
    @Method(selector = "initWithX:y:icon:")
    public BubbleChartDataEntry(double x, double y, UIImage icon) { super(x, y, icon); }
    @Method(selector = "initWithX:y:icon:data:")
    public BubbleChartDataEntry(double x, double y, UIImage icon, NSObject data) { super(x, y, icon, data); }
    @Method(selector = "initWithY:data:")
    public BubbleChartDataEntry(ArgsYData tuple) { super(tuple); }
    @Method(selector = "initWithY:icon:")
    public BubbleChartDataEntry(ArgsYIcon tuple) { super(tuple); }
    @Method(selector = "initWithY:icon:data:")
    public BubbleChartDataEntry(ArgsYIconData tuple) { super(tuple); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "size")
    public native @MachineSizedFloat double getSize();
    @Property(selector = "setSize:")
    public native void setSize(@MachineSizedFloat double v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithX:y:size:")
    protected native @Pointer long init(double x, double y, @MachineSizedFloat double size);
    @Method(selector = "initWithX:y:size:data:")
    protected native @Pointer long init(double x, double y, @MachineSizedFloat double size, NSObject data);
    @Method(selector = "initWithX:y:size:icon:")
    protected native @Pointer long init(double x, double y, @MachineSizedFloat double size, UIImage icon);
    @Method(selector = "initWithX:y:size:icon:data:")
    protected native @Pointer long init(double x, double y, @MachineSizedFloat double size, UIImage icon, NSObject data);
    @Method(selector = "copyWithZone:")
    public native NSObject copy(NSZone zone);
    /*</methods>*/
}
