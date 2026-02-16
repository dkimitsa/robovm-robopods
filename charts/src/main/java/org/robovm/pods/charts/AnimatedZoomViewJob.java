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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("DGCharts.AnimatedZoomViewJob")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AnimatedZoomViewJob/*</name>*/ 
    extends /*<extends>*/AnimatedViewPortJob/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class AnimatedZoomViewJobPtr extends Ptr<AnimatedZoomViewJob, AnimatedZoomViewJobPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(AnimatedZoomViewJob.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected AnimatedZoomViewJob() {}
    protected AnimatedZoomViewJob(Handle h, long handle) { super(h, handle); }
    protected AnimatedZoomViewJob(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithViewPortHandler:transformer:view:yAxis:xAxisRange:scaleX:scaleY:xOrigin:yOrigin:zoomCenterX:zoomCenterY:zoomOriginX:zoomOriginY:duration:easing:")
    public AnimatedZoomViewJob(ChartViewPortHandler viewPortHandler, ChartTransformer transformer, ChartViewBase view, ChartYAxis yAxis, double xAxisRange, @MachineSizedFloat double scaleX, @MachineSizedFloat double scaleY, @MachineSizedFloat double xOrigin, @MachineSizedFloat double yOrigin, @MachineSizedFloat double zoomCenterX, @MachineSizedFloat double zoomCenterY, @MachineSizedFloat double zoomOriginX, @MachineSizedFloat double zoomOriginY, double duration, @Block Block2<Double, Double, Double> easing) { super((SkipInit) null); initObject(init(viewPortHandler, transformer, view, yAxis, xAxisRange, scaleX, scaleY, xOrigin, yOrigin, zoomCenterX, zoomCenterY, zoomOriginX, zoomOriginY, duration, easing)); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithViewPortHandler:transformer:view:yAxis:xAxisRange:scaleX:scaleY:xOrigin:yOrigin:zoomCenterX:zoomCenterY:zoomOriginX:zoomOriginY:duration:easing:")
    protected native @Pointer long init(ChartViewPortHandler viewPortHandler, ChartTransformer transformer, ChartViewBase view, ChartYAxis yAxis, double xAxisRange, @MachineSizedFloat double scaleX, @MachineSizedFloat double scaleY, @MachineSizedFloat double xOrigin, @MachineSizedFloat double yOrigin, @MachineSizedFloat double zoomCenterX, @MachineSizedFloat double zoomCenterY, @MachineSizedFloat double zoomOriginX, @MachineSizedFloat double zoomOriginY, double duration, @Block Block2<Double, Double, Double> easing);
    /*</methods>*/
}
