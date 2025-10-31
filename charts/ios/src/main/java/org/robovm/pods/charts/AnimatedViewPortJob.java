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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("DGCharts.AnimatedViewPortJob")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AnimatedViewPortJob/*</name>*/ 
    extends /*<extends>*/ChartViewPortJob/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class AnimatedViewPortJobPtr extends Ptr<AnimatedViewPortJob, AnimatedViewPortJobPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(AnimatedViewPortJob.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected AnimatedViewPortJob() {}
    protected AnimatedViewPortJob(Handle h, long handle) { super(h, handle); }
    protected AnimatedViewPortJob(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithViewPortHandler:xValue:yValue:transformer:view:xOrigin:yOrigin:duration:easing:")
    public AnimatedViewPortJob(ChartViewPortHandler viewPortHandler, double xValue, double yValue, ChartTransformer transformer, ChartViewBase view, @MachineSizedFloat double xOrigin, @MachineSizedFloat double yOrigin, double duration, @Block Block2<Double, Double, Double> easing) { super((SkipInit) null); initObject(init(viewPortHandler, xValue, yValue, transformer, view, xOrigin, yOrigin, duration, easing)); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithViewPortHandler:xValue:yValue:transformer:view:xOrigin:yOrigin:duration:easing:")
    protected native @Pointer long init(ChartViewPortHandler viewPortHandler, double xValue, double yValue, ChartTransformer transformer, ChartViewBase view, @MachineSizedFloat double xOrigin, @MachineSizedFloat double yOrigin, double duration, @Block Block2<Double, Double, Double> easing);
    @Method(selector = "doJob")
    public native void doJob();
    @Method(selector = "start")
    public native void start();
    @Method(selector = "stopWithFinish:")
    public native void stop(boolean finish);
    /*</methods>*/
}
