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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ChartXAxis/*</name>*/ 
    extends /*<extends>*/ChartAxisBase/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class ChartXAxisPtr extends Ptr<ChartXAxis, ChartXAxisPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ChartXAxis.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public ChartXAxis() {}
    protected ChartXAxis(Handle h, long handle) { super(h, handle); }
    protected ChartXAxis(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "labelWidth")
    public native @MachineSizedFloat double getLabelWidth();
    @Property(selector = "setLabelWidth:")
    public native void setLabelWidth(@MachineSizedFloat double v);
    @Property(selector = "labelHeight")
    public native @MachineSizedFloat double getLabelHeight();
    @Property(selector = "setLabelHeight:")
    public native void setLabelHeight(@MachineSizedFloat double v);
    @Property(selector = "labelRotatedWidth")
    public native @MachineSizedFloat double getLabelRotatedWidth();
    @Property(selector = "setLabelRotatedWidth:")
    public native void setLabelRotatedWidth(@MachineSizedFloat double v);
    @Property(selector = "labelRotatedHeight")
    public native @MachineSizedFloat double getLabelRotatedHeight();
    @Property(selector = "setLabelRotatedHeight:")
    public native void setLabelRotatedHeight(@MachineSizedFloat double v);
    @Property(selector = "labelRotationAngle")
    public native @MachineSizedFloat double getLabelRotationAngle();
    @Property(selector = "setLabelRotationAngle:")
    public native void setLabelRotationAngle(@MachineSizedFloat double v);
    @Property(selector = "avoidFirstLastClippingEnabled")
    public native boolean avoidFirstLastClippingEnabled();
    @Property(selector = "setAvoidFirstLastClippingEnabled:")
    public native void setAvoidFirstLastClippingEnabled(boolean v);
    @Property(selector = "labelPosition")
    public native XAxisLabelPosition getLabelPosition();
    @Property(selector = "setLabelPosition:")
    public native void setLabelPosition(XAxisLabelPosition v);
    @Property(selector = "wordWrapEnabled")
    public native boolean wordWrapEnabled();
    @Property(selector = "setWordWrapEnabled:")
    public native void setWordWrapEnabled(boolean v);
    @Property(selector = "isWordWrapEnabled")
    public native boolean isWordWrapEnabled();
    @Property(selector = "wordWrapWidthPercent")
    public native @MachineSizedFloat double getWordWrapWidthPercent();
    @Property(selector = "setWordWrapWidthPercent:")
    public native void setWordWrapWidthPercent(@MachineSizedFloat double v);
    @Property(selector = "isAvoidFirstLastClippingEnabled")
    public native boolean isAvoidFirstLastClippingEnabled();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
