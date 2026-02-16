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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ChartTransformer/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class ChartTransformerPtr extends Ptr<ChartTransformer, ChartTransformerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ChartTransformer.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected ChartTransformer() {}
    protected ChartTransformer(Handle h, long handle) { super(h, handle); }
    protected ChartTransformer(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithViewPortHandler:")
    public ChartTransformer(ChartViewPortHandler viewPortHandler) { super((SkipInit) null); initObject(init(viewPortHandler)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "valueToPixelMatrix")
    public native @ByVal CGAffineTransform getValueToPixelMatrix();
    @Property(selector = "pixelToValueMatrix")
    public native @ByVal CGAffineTransform getPixelToValueMatrix();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithViewPortHandler:")
    protected native @Pointer long init(ChartViewPortHandler viewPortHandler);
    @Method(selector = "prepareMatrixValuePxWithChartXMin:deltaX:deltaY:chartYMin:")
    public native void prepareMatrixValuePx(double chartXMin, @MachineSizedFloat double deltaX, @MachineSizedFloat double deltaY, double chartYMin);
    @Method(selector = "prepareMatrixOffsetWithInverted:")
    public native void prepareMatrixOffset(boolean inverted);
    @Method(selector = "pixelForValuesWithX:y:")
    public native @ByVal CGPoint getPixelForValues(double x, double y);
    @Method(selector = "valueForTouchPoint:")
    public native @ByVal CGPoint valueForTouchPoint(@ByVal CGPoint point);
    @Method(selector = "valueForTouchPointWithX:y:")
    public native @ByVal CGPoint getValueForTouchPoint(@MachineSizedFloat double x, @MachineSizedFloat double y);
    /*</methods>*/
}
