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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("DGCharts.PieChartDataEntry")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/PieChartDataEntry/*</name>*/ 
    extends /*<extends>*/ChartDataEntry/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class PieChartDataEntryPtr extends Ptr<PieChartDataEntry, PieChartDataEntryPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(PieChartDataEntry.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public PieChartDataEntry() {}
    protected PieChartDataEntry(Handle h, long handle) { super(h, handle); }
    protected PieChartDataEntry(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithValue:")
    public PieChartDataEntry(double value) { super((SkipInit) null); initObject(init(value)); }
    @Method(selector = "initWithValue:label:")
    public PieChartDataEntry(double value, String label) { super((SkipInit) null); initObject(init(value, label)); }
    @Method(selector = "initWithValue:label:data:")
    public PieChartDataEntry(double value, String label, NSObject data) { super((SkipInit) null); initObject(init(value, label, data)); }
    @Method(selector = "initWithValue:label:icon:")
    public PieChartDataEntry(double value, String label, UIImage icon) { super((SkipInit) null); initObject(init(value, label, icon)); }
    @Method(selector = "initWithValue:label:icon:data:")
    public PieChartDataEntry(double value, String label, UIImage icon, NSObject data) { super((SkipInit) null); initObject(init(value, label, icon, data)); }
    @Method(selector = "initWithValue:data:")
    public PieChartDataEntry(double value, NSObject data) { super((SkipInit) null); initObject(init(value, data)); }
    @Method(selector = "initWithValue:icon:")
    public PieChartDataEntry(double value, UIImage icon) { super((SkipInit) null); initObject(init(value, icon)); }
    @Method(selector = "initWithValue:icon:data:")
    public PieChartDataEntry(double value, UIImage icon, NSObject data) { super((SkipInit) null); initObject(init(value, icon, data)); }
    @Method(selector = "initWithX:y:data:")
    public PieChartDataEntry(double x, double y, NSObject data) { super(x, y, data); }
    @Method(selector = "initWithX:y:icon:")
    public PieChartDataEntry(double x, double y, UIImage icon) { super(x, y, icon); }
    @Method(selector = "initWithX:y:icon:data:")
    public PieChartDataEntry(double x, double y, UIImage icon, NSObject data) { super(x, y, icon, data); }
    @Method(selector = "initWithY:data:")
    public PieChartDataEntry(ArgsYData tuple) { super(tuple); }
    @Method(selector = "initWithY:icon:")
    public PieChartDataEntry(ArgsYIcon tuple) { super(tuple); }
    @Method(selector = "initWithY:icon:data:")
    public PieChartDataEntry(ArgsYIconData tuple) { super(tuple); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "label")
    public native String getLabel();
    @Property(selector = "setLabel:")
    public native void setLabel(String v);
    @Property(selector = "value")
    public native double getValue();
    @Property(selector = "setValue:")
    public native void setValue(double v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithValue:")
    protected native @Pointer long init(double value);
    @Method(selector = "initWithValue:label:")
    protected native @Pointer long init(double value, String label);
    @Method(selector = "initWithValue:label:data:")
    protected native @Pointer long init(double value, String label, NSObject data);
    @Method(selector = "initWithValue:label:icon:")
    protected native @Pointer long init(double value, String label, UIImage icon);
    @Method(selector = "initWithValue:label:icon:data:")
    protected native @Pointer long init(double value, String label, UIImage icon, NSObject data);
    @Method(selector = "initWithValue:data:")
    protected native @Pointer long init(double value, NSObject data);
    @Method(selector = "initWithValue:icon:")
    protected native @Pointer long init(double value, UIImage icon);
    @Method(selector = "initWithValue:icon:data:")
    protected native @Pointer long init(double value, UIImage icon, NSObject data);
    @Method(selector = "copyWithZone:")
    public native NSObject copy(NSZone zone);
    /*</methods>*/
}
