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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("DGCharts.RadarChartDataEntry")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/RadarChartDataEntry/*</name>*/ 
    extends /*<extends>*/ChartDataEntry/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class RadarChartDataEntryPtr extends Ptr<RadarChartDataEntry, RadarChartDataEntryPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(RadarChartDataEntry.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public RadarChartDataEntry() {}
    protected RadarChartDataEntry(Handle h, long handle) { super(h, handle); }
    protected RadarChartDataEntry(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithValue:")
    public RadarChartDataEntry(double value) { super((SkipInit) null); initObject(init(value)); }
    @Method(selector = "initWithValue:data:")
    public RadarChartDataEntry(double value, NSObject data) { super((SkipInit) null); initObject(init(value, data)); }
    @Method(selector = "initWithX:y:data:")
    public RadarChartDataEntry(double x, double y, NSObject data) { super(x, y, data); }
    @Method(selector = "initWithX:y:icon:")
    public RadarChartDataEntry(double x, double y, UIImage icon) { super(x, y, icon); }
    @Method(selector = "initWithX:y:icon:data:")
    public RadarChartDataEntry(double x, double y, UIImage icon, NSObject data) { super(x, y, icon, data); }
    @Method(selector = "initWithY:data:")
    public RadarChartDataEntry(ArgsYData tuple) { super(tuple); }
    @Method(selector = "initWithY:icon:")
    public RadarChartDataEntry(ArgsYIcon tuple) { super(tuple); }
    @Method(selector = "initWithY:icon:data:")
    public RadarChartDataEntry(ArgsYIconData tuple) { super(tuple); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "value")
    public native double getValue();
    @Property(selector = "setValue:")
    public native void setValue(double v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithValue:")
    protected native @Pointer long init(double value);
    @Method(selector = "initWithValue:data:")
    protected native @Pointer long init(double value, NSObject data);
    @Method(selector = "copyWithZone:")
    public native NSObject copy(NSZone zone);
    /*</methods>*/
}
