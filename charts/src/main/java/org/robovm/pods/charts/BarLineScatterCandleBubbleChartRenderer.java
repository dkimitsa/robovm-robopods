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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/BarLineScatterCandleBubbleChartRenderer/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements ChartDataRenderer/*</implements>*/ {

    /*<ptr>*/public static class BarLineScatterCandleBubbleChartRendererPtr extends Ptr<BarLineScatterCandleBubbleChartRenderer, BarLineScatterCandleBubbleChartRendererPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(BarLineScatterCandleBubbleChartRenderer.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected BarLineScatterCandleBubbleChartRenderer() {}
    protected BarLineScatterCandleBubbleChartRenderer(Handle h, long handle) { super(h, handle); }
    protected BarLineScatterCandleBubbleChartRenderer(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "viewPortHandler")
    public native ChartViewPortHandler getViewPortHandler();
    @Property(selector = "accessibleChartElements")
    public native NSArray<NSUIAccessibilityElement> getAccessibleChartElements();
    @Property(selector = "setAccessibleChartElements:")
    public native void setAccessibleChartElements(NSArray<NSUIAccessibilityElement> v);
    @Property(selector = "animator")
    public native ChartAnimator getAnimator();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "drawDataWithContext:")
    public native void drawData(CGContext context);
    @Method(selector = "drawValuesWithContext:")
    public native void drawValues(CGContext context);
    @Method(selector = "drawExtrasWithContext:")
    public native void drawExtras(CGContext context);
    @Method(selector = "drawHighlightedWithContext:indices:")
    public native void drawHighlighted(CGContext context, NSArray<ChartHighlight> indices);
    @Method(selector = "initBuffers")
    public native void initBuffers();
    @Method(selector = "isDrawingValuesAllowedWithDataProvider:")
    public native boolean isDrawingValuesAllowed(ChartDataProvider dataProvider);
    @Method(selector = "createAccessibleHeaderUsingChart:andData:withDefaultDescription:")
    public native NSUIAccessibilityElement createAccessibleHeader(ChartViewBase chart, ChartData data, String defaultDescription);
    /*</methods>*/
}
