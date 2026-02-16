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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ChartLegendRenderer/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements ChartRenderer/*</implements>*/ {

    /*<ptr>*/public static class ChartLegendRendererPtr extends Ptr<ChartLegendRenderer, ChartLegendRendererPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ChartLegendRenderer.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected ChartLegendRenderer() {}
    protected ChartLegendRenderer(Handle h, long handle) { super(h, handle); }
    protected ChartLegendRenderer(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithViewPortHandler:legend:")
    public ChartLegendRenderer(ChartViewPortHandler viewPortHandler, ChartLegend legend) { super((SkipInit) null); initObject(init(viewPortHandler, legend)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "viewPortHandler")
    public native ChartViewPortHandler getViewPortHandler();
    @Property(selector = "legend")
    public native ChartLegend getLegend();
    @Property(selector = "setLegend:")
    public native void setLegend(ChartLegend v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithViewPortHandler:legend:")
    protected native @Pointer long init(ChartViewPortHandler viewPortHandler, ChartLegend legend);
    @Method(selector = "computeLegendWithData:")
    public native void computeLegend(ChartData data);
    @Method(selector = "renderLegendWithContext:")
    public native void renderLegend(CGContext context);
    @Method(selector = "drawFormWithContext:x:y:entry:legend:")
    public native void drawForm(CGContext context, @MachineSizedFloat double x, @MachineSizedFloat double y, ChartLegendEntry entry, ChartLegend legend);
    @Method(selector = "drawLabelWithContext:x:y:label:font:textColor:")
    public native void drawLabel(CGContext context, @MachineSizedFloat double x, @MachineSizedFloat double y, String label, UIFont font, UIColor textColor);
    /*</methods>*/
}
