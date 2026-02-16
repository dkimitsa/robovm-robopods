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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("DGCharts.ChartLimitLine")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ChartLimitLine/*</name>*/ 
    extends /*<extends>*/ChartComponentBase/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class ChartLimitLinePtr extends Ptr<ChartLimitLine, ChartLimitLinePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ChartLimitLine.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public ChartLimitLine() {}
    protected ChartLimitLine(Handle h, long handle) { super(h, handle); }
    protected ChartLimitLine(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithLimit:")
    public ChartLimitLine(double limit) { super((SkipInit) null); initObject(init(limit)); }
    @Method(selector = "initWithLimit:label:")
    public ChartLimitLine(double limit, String label) { super((SkipInit) null); initObject(init(limit, label)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "limit")
    public native double getLimit();
    @Property(selector = "setLimit:")
    public native void setLimit(double v);
    @Property(selector = "lineColor")
    public native UIColor getLineColor();
    @Property(selector = "setLineColor:")
    public native void setLineColor(UIColor v);
    @Property(selector = "lineDashPhase")
    public native @MachineSizedFloat double getLineDashPhase();
    @Property(selector = "setLineDashPhase:")
    public native void setLineDashPhase(@MachineSizedFloat double v);
    @Property(selector = "lineDashLengths")
    public native NSArray<NSNumber> getLineDashLengths();
    @Property(selector = "setLineDashLengths:")
    public native void setLineDashLengths(NSArray<NSNumber> v);
    @Property(selector = "valueTextColor")
    public native UIColor getValueTextColor();
    @Property(selector = "setValueTextColor:")
    public native void setValueTextColor(UIColor v);
    @Property(selector = "valueFont")
    public native UIFont getValueFont();
    @Property(selector = "setValueFont:")
    public native void setValueFont(UIFont v);
    @Property(selector = "drawLabelEnabled")
    public native boolean isDrawLabelEnabled();
    @Property(selector = "setDrawLabelEnabled:")
    public native void setDrawLabelEnabled(boolean v);
    @Property(selector = "label")
    public native String getLabel();
    @Property(selector = "setLabel:")
    public native void setLabel(String v);
    @Property(selector = "labelPosition")
    public native ChartLimitLabelPosition getLabelPosition();
    @Property(selector = "setLabelPosition:")
    public native void setLabelPosition(ChartLimitLabelPosition v);
    @Property(selector = "labelRotationAngle")
    public native @MachineSizedFloat double getLabelRotationAngle();
    @Property(selector = "setLabelRotationAngle:")
    public native void setLabelRotationAngle(@MachineSizedFloat double v);
    @Property(selector = "lineWidth")
    public native @MachineSizedFloat double getLineWidth();
    @Property(selector = "setLineWidth:")
    public native void setLineWidth(@MachineSizedFloat double v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithLimit:")
    protected native @Pointer long init(double limit);
    @Method(selector = "initWithLimit:label:")
    protected native @Pointer long init(double limit, String label);
    /*</methods>*/
}
