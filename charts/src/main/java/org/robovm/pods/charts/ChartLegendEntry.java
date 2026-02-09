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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ChartLegendEntry/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class ChartLegendEntryPtr extends Ptr<ChartLegendEntry, ChartLegendEntryPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ChartLegendEntry.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public ChartLegendEntry() {}
    protected ChartLegendEntry(Handle h, long handle) { super(h, handle); }
    protected ChartLegendEntry(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithLabel:")
    public ChartLegendEntry(String label) { super((SkipInit) null); initObject(init(label)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "label")
    public native String getLabel();
    @Property(selector = "setLabel:")
    public native void setLabel(String v);
    @Property(selector = "labelColor")
    public native UIColor getLabelColor();
    @Property(selector = "setLabelColor:")
    public native void setLabelColor(UIColor v);
    @Property(selector = "form")
    public native ChartLegendForm getForm();
    @Property(selector = "setForm:")
    public native void setForm(ChartLegendForm v);
    @Property(selector = "formSize")
    public native @MachineSizedFloat double getFormSize();
    @Property(selector = "setFormSize:")
    public native void setFormSize(@MachineSizedFloat double v);
    @Property(selector = "formLineWidth")
    public native @MachineSizedFloat double getFormLineWidth();
    @Property(selector = "setFormLineWidth:")
    public native void setFormLineWidth(@MachineSizedFloat double v);
    @Property(selector = "formLineDashPhase")
    public native @MachineSizedFloat double getFormLineDashPhase();
    @Property(selector = "setFormLineDashPhase:")
    public native void setFormLineDashPhase(@MachineSizedFloat double v);
    @Property(selector = "formLineDashLengths")
    public native NSArray<NSNumber> getFormLineDashLengths();
    @Property(selector = "setFormLineDashLengths:")
    public native void setFormLineDashLengths(NSArray<NSNumber> v);
    @Property(selector = "formColor")
    public native UIColor getFormColor();
    @Property(selector = "setFormColor:")
    public native void setFormColor(UIColor v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithLabel:")
    protected native @Pointer long init(String label);
    /*</methods>*/
}
