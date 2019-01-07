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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ChartViewPortJob/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class ChartViewPortJobPtr extends Ptr<ChartViewPortJob, ChartViewPortJobPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ChartViewPortJob.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected ChartViewPortJob() {}
    protected ChartViewPortJob(Handle h, long handle) { super(h, handle); }
    protected ChartViewPortJob(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithViewPortHandler:xValue:yValue:transformer:view:")
    public ChartViewPortJob(ChartViewPortHandler viewPortHandler, double xValue, double yValue, ChartTransformer transformer, ChartViewBase view) { super((SkipInit) null); initObject(init(viewPortHandler, xValue, yValue, transformer, view)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "point")
    public native @ByVal CGPoint getPoint();
    @Property(selector = "setPoint:")
    public native void setPoint(@ByVal CGPoint v);
    @Property(selector = "viewPortHandler")
    public native ChartViewPortHandler getViewPortHandler();
    @Property(selector = "setViewPortHandler:", strongRef = true)
    public native void setViewPortHandler(ChartViewPortHandler v);
    @Property(selector = "xValue")
    public native double getXValue();
    @Property(selector = "setXValue:")
    public native void setXValue(double v);
    @Property(selector = "yValue")
    public native double getYValue();
    @Property(selector = "setYValue:")
    public native void setYValue(double v);
    @Property(selector = "transformer")
    public native ChartTransformer getTransformer();
    @Property(selector = "setTransformer:", strongRef = true)
    public native void setTransformer(ChartTransformer v);
    @Property(selector = "view")
    public native ChartViewBase getView();
    @Property(selector = "setView:", strongRef = true)
    public native void setView(ChartViewBase v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithViewPortHandler:xValue:yValue:transformer:view:")
    protected native @Pointer long init(ChartViewPortHandler viewPortHandler, double xValue, double yValue, ChartTransformer transformer, ChartViewBase view);
    @Method(selector = "doJob")
    public native void doJob();
    /*</methods>*/
}