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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("DGCharts.CandleChartDataEntry")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CandleChartDataEntry/*</name>*/ 
    extends /*<extends>*/ChartDataEntry/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CandleChartDataEntryPtr extends Ptr<CandleChartDataEntry, CandleChartDataEntryPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CandleChartDataEntry.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public CandleChartDataEntry() {}
    protected CandleChartDataEntry(Handle h, long handle) { super(h, handle); }
    protected CandleChartDataEntry(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithX:shadowH:shadowL:open:close:")
    public CandleChartDataEntry(double x, double shadowH, double shadowL, double open, double close) { super((SkipInit) null); initObject(init(x, shadowH, shadowL, open, close)); }
    @Method(selector = "initWithX:shadowH:shadowL:open:close:icon:")
    public CandleChartDataEntry(double x, double shadowH, double shadowL, double open, double close, UIImage icon) { super((SkipInit) null); initObject(init(x, shadowH, shadowL, open, close, icon)); }
    @Method(selector = "initWithX:shadowH:shadowL:open:close:data:")
    public CandleChartDataEntry(double x, double shadowH, double shadowL, double open, double close, NSObject data) { super((SkipInit) null); initObject(init(x, shadowH, shadowL, open, close, data)); }
    @Method(selector = "initWithX:shadowH:shadowL:open:close:icon:data:")
    public CandleChartDataEntry(double x, double shadowH, double shadowL, double open, double close, UIImage icon, NSObject data) { super((SkipInit) null); initObject(init(x, shadowH, shadowL, open, close, icon, data)); }
    @Method(selector = "initWithX:y:data:")
    public CandleChartDataEntry(double x, double y, NSObject data) { super(x, y, data); }
    @Method(selector = "initWithX:y:icon:")
    public CandleChartDataEntry(double x, double y, UIImage icon) { super(x, y, icon); }
    @Method(selector = "initWithX:y:icon:data:")
    public CandleChartDataEntry(double x, double y, UIImage icon, NSObject data) { super(x, y, icon, data); }
    @Method(selector = "initWithY:data:")
    public CandleChartDataEntry(ArgsYData tuple) { super(tuple); }
    @Method(selector = "initWithY:icon:")
    public CandleChartDataEntry(ArgsYIcon tuple) { super(tuple); }
    @Method(selector = "initWithY:icon:data:")
    public CandleChartDataEntry(ArgsYIconData tuple) { super(tuple); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "high")
    public native double getHigh();
    @Property(selector = "setHigh:")
    public native void setHigh(double v);
    @Property(selector = "low")
    public native double getLow();
    @Property(selector = "setLow:")
    public native void setLow(double v);
    @Property(selector = "close")
    public native double getClose();
    @Property(selector = "setClose:")
    public native void setClose(double v);
    @Property(selector = "open")
    public native double getOpen();
    @Property(selector = "setOpen:")
    public native void setOpen(double v);
    @Property(selector = "shadowRange")
    public native double getShadowRange();
    @Property(selector = "bodyRange")
    public native double getBodyRange();
    @Property(selector = "y")
    public native double getY();
    @Property(selector = "setY:")
    public native void setY(double v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithX:shadowH:shadowL:open:close:")
    protected native @Pointer long init(double x, double shadowH, double shadowL, double open, double close);
    @Method(selector = "initWithX:shadowH:shadowL:open:close:icon:")
    protected native @Pointer long init(double x, double shadowH, double shadowL, double open, double close, UIImage icon);
    @Method(selector = "initWithX:shadowH:shadowL:open:close:data:")
    protected native @Pointer long init(double x, double shadowH, double shadowL, double open, double close, NSObject data);
    @Method(selector = "initWithX:shadowH:shadowL:open:close:icon:data:")
    protected native @Pointer long init(double x, double shadowH, double shadowL, double open, double close, UIImage icon, NSObject data);
    @Method(selector = "copyWithZone:")
    public native NSObject copy(NSZone zone);
    /*</methods>*/
}
