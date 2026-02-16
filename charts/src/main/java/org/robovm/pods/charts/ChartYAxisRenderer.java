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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ChartYAxisRenderer/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class ChartYAxisRendererPtr extends Ptr<ChartYAxisRenderer, ChartYAxisRendererPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ChartYAxisRenderer.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected ChartYAxisRenderer() {}
    protected ChartYAxisRenderer(Handle h, long handle) { super(h, handle); }
    protected ChartYAxisRenderer(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithViewPortHandler:axis:transformer:")
    public ChartYAxisRenderer(ChartViewPortHandler viewPortHandler, ChartYAxis axis, ChartTransformer transformer) { super((SkipInit) null); initObject(init(viewPortHandler, axis, transformer)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "viewPortHandler")
    public native ChartViewPortHandler getViewPortHandler();
    @Property(selector = "axis")
    public native ChartYAxis getAxis();
    @Property(selector = "transformer")
    public native ChartTransformer getTransformer();
    @Property(selector = "gridClippingRect")
    public native @ByVal CGRect getGridClippingRect();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithViewPortHandler:axis:transformer:")
    protected native @Pointer long init(ChartViewPortHandler viewPortHandler, ChartYAxis axis, ChartTransformer transformer);
    @Method(selector = "drawGridLineWithContext:position:")
    public native void drawGridLine(CGContext context, @ByVal CGPoint position);
    @Method(selector = "transformedPositions")
    public native NSArray<NSValue> transformedPositions();
    @Method(selector = "drawZeroLineWithContext:")
    public native void drawZeroLine(CGContext context);
    @Method(selector = "computeAxisWithMin:max:inverted:")
    public native void computeAxis(double min, double max, boolean inverted);
    @Method(selector = "computeAxisValuesWithMin:max:")
    public native void computeAxisValues(double min, double max);
    /*</methods>*/
}
