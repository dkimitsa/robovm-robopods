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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ZoomChartViewJob/*</name>*/ 
    extends /*<extends>*/ChartViewPortJob/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class ZoomChartViewJobPtr extends Ptr<ZoomChartViewJob, ZoomChartViewJobPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ZoomChartViewJob.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected ZoomChartViewJob() {}
    protected ZoomChartViewJob(Handle h, long handle) { super(h, handle); }
    protected ZoomChartViewJob(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithViewPortHandler:scaleX:scaleY:xValue:yValue:transformer:axis:view:")
    public ZoomChartViewJob(ChartViewPortHandler viewPortHandler, @MachineSizedFloat double scaleX, @MachineSizedFloat double scaleY, double xValue, double yValue, ChartTransformer transformer, AxisDependency axis, ChartViewBase view) { super((SkipInit) null); initObject(init(viewPortHandler, scaleX, scaleY, xValue, yValue, transformer, axis, view)); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithViewPortHandler:scaleX:scaleY:xValue:yValue:transformer:axis:view:")
    protected native @Pointer long init(ChartViewPortHandler viewPortHandler, @MachineSizedFloat double scaleX, @MachineSizedFloat double scaleY, double xValue, double yValue, ChartTransformer transformer, AxisDependency axis, ChartViewBase view);
    @Method(selector = "doJob")
    public native void doJob();
    /*</methods>*/
}
