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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ChartAnimator/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class ChartAnimatorPtr extends Ptr<ChartAnimator, ChartAnimatorPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ChartAnimator.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public ChartAnimator() {}
    protected ChartAnimator(Handle h, long handle) { super(h, handle); }
    protected ChartAnimator(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "delegate")
    public native ChartAnimatorDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(ChartAnimatorDelegate v);
    @Property(selector = "updateBlock")
    public native @Block Runnable getUpdateBlock();
    @Property(selector = "setUpdateBlock:")
    public native void setUpdateBlock(@Block Runnable v);
    @Property(selector = "stopBlock")
    public native @Block Runnable getStopBlock();
    @Property(selector = "setStopBlock:")
    public native void setStopBlock(@Block Runnable v);
    @Property(selector = "phaseX")
    public native double getPhaseX();
    @Property(selector = "setPhaseX:")
    public native void setPhaseX(double v);
    @Property(selector = "phaseY")
    public native double getPhaseY();
    @Property(selector = "setPhaseY:")
    public native void setPhaseY(double v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "stop")
    public native void stop();
    @Method(selector = "animateWithXAxisDuration:yAxisDuration:easingX:easingY:")
    public native void animate(double xAxisDuration, double yAxisDuration, @Block Block2<Double, Double, Double> easingX, @Block Block2<Double, Double, Double> easingY);
    @Method(selector = "animateWithXAxisDuration:yAxisDuration:easingOptionX:easingOptionY:")
    public native void animate(double xAxisDuration, double yAxisDuration, ChartEasingOption easingOptionX, ChartEasingOption easingOptionY);
    @Method(selector = "animateWithXAxisDuration:yAxisDuration:easing:")
    public native void animate(double xAxisDuration, double yAxisDuration, @Block Block2<Double, Double, Double> easing);
    @Method(selector = "animateWithXAxisDuration:yAxisDuration:easingOption:")
    public native void animate(double xAxisDuration, double yAxisDuration, ChartEasingOption easingOption);
    @Method(selector = "animateWithXAxisDuration:easing:")
    public native void animateX(double xAxisDuration, @Block Block2<Double, Double, Double> easing);
    @Method(selector = "animateWithXAxisDuration:easingOption:")
    public native void animateX(double xAxisDuration, ChartEasingOption easingOption);
    @Method(selector = "animateWithYAxisDuration:easing:")
    public native void animateY(double yAxisDuration, @Block Block2<Double, Double, Double> easing);
    @Method(selector = "animateWithYAxisDuration:easingOption:")
    public native void animateY(double yAxisDuration, ChartEasingOption easingOption);
    /*</methods>*/
}
