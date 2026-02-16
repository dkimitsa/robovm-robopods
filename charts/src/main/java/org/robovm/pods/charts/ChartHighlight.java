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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ChartHighlight/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class ChartHighlightPtr extends Ptr<ChartHighlight, ChartHighlightPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ChartHighlight.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public ChartHighlight() {}
    protected ChartHighlight(Handle h, long handle) { super(h, handle); }
    protected ChartHighlight(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithX:y:xPx:yPx:dataIndex:dataSetIndex:stackIndex:axis:")
    public ChartHighlight(double x, double y, @MachineSizedFloat double xPx, @MachineSizedFloat double yPx, @MachineSizedSInt long dataIndex, @MachineSizedSInt long dataSetIndex, @MachineSizedSInt long stackIndex, AxisDependency axis) { super((SkipInit) null); initObject(init(x, y, xPx, yPx, dataIndex, dataSetIndex, stackIndex, axis)); }
    @Method(selector = "initWithX:y:xPx:yPx:dataSetIndex:stackIndex:axis:")
    public ChartHighlight(double x, double y, @MachineSizedFloat double xPx, @MachineSizedFloat double yPx, @MachineSizedSInt long dataSetIndex, @MachineSizedSInt long stackIndex, AxisDependency axis) { super((SkipInit) null); initObject(init(x, y, xPx, yPx, dataSetIndex, stackIndex, axis)); }
    @Method(selector = "initWithX:y:xPx:yPx:dataSetIndex:axis:")
    public ChartHighlight(double x, double y, @MachineSizedFloat double xPx, @MachineSizedFloat double yPx, @MachineSizedSInt long dataSetIndex, AxisDependency axis) { super((SkipInit) null); initObject(init(x, y, xPx, yPx, dataSetIndex, axis)); }
    @Method(selector = "initWithX:y:dataSetIndex:dataIndex:")
    public ChartHighlight(double x, double y, @MachineSizedSInt long dataSetIndex, @MachineSizedSInt long dataIndex) { super((SkipInit) null); initObject(init(x, y, dataSetIndex, dataIndex)); }
    @Method(selector = "initWithX:dataSetIndex:stackIndex:")
    public ChartHighlight(double x, @MachineSizedSInt long dataSetIndex, @MachineSizedSInt long stackIndex) { super((SkipInit) null); initObject(init(x, dataSetIndex, stackIndex)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "dataIndex")
    public native @MachineSizedSInt long getDataIndex();
    @Property(selector = "setDataIndex:")
    public native void setDataIndex(@MachineSizedSInt long v);
    @Property(selector = "drawX")
    public native @MachineSizedFloat double getDrawX();
    @Property(selector = "setDrawX:")
    public native void setDrawX(@MachineSizedFloat double v);
    @Property(selector = "drawY")
    public native @MachineSizedFloat double getDrawY();
    @Property(selector = "setDrawY:")
    public native void setDrawY(@MachineSizedFloat double v);
    @Property(selector = "x")
    public native double getX();
    @Property(selector = "y")
    public native double getY();
    @Property(selector = "xPx")
    public native @MachineSizedFloat double getXPx();
    @Property(selector = "yPx")
    public native @MachineSizedFloat double getYPx();
    @Property(selector = "dataSetIndex")
    public native @MachineSizedSInt long getDataSetIndex();
    @Property(selector = "stackIndex")
    public native @MachineSizedSInt long getStackIndex();
    @Property(selector = "axis")
    public native AxisDependency getAxis();
    @Property(selector = "isStacked")
    public native boolean isStacked();
    @Property(selector = "description")
    public native String getDescription();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithX:y:xPx:yPx:dataIndex:dataSetIndex:stackIndex:axis:")
    protected native @Pointer long init(double x, double y, @MachineSizedFloat double xPx, @MachineSizedFloat double yPx, @MachineSizedSInt long dataIndex, @MachineSizedSInt long dataSetIndex, @MachineSizedSInt long stackIndex, AxisDependency axis);
    @Method(selector = "initWithX:y:xPx:yPx:dataSetIndex:stackIndex:axis:")
    protected native @Pointer long init(double x, double y, @MachineSizedFloat double xPx, @MachineSizedFloat double yPx, @MachineSizedSInt long dataSetIndex, @MachineSizedSInt long stackIndex, AxisDependency axis);
    @Method(selector = "initWithX:y:xPx:yPx:dataSetIndex:axis:")
    protected native @Pointer long init(double x, double y, @MachineSizedFloat double xPx, @MachineSizedFloat double yPx, @MachineSizedSInt long dataSetIndex, AxisDependency axis);
    @Method(selector = "initWithX:y:dataSetIndex:dataIndex:")
    protected native @Pointer long init(double x, double y, @MachineSizedSInt long dataSetIndex, @MachineSizedSInt long dataIndex);
    @Method(selector = "initWithX:dataSetIndex:stackIndex:")
    protected native @Pointer long init(double x, @MachineSizedSInt long dataSetIndex, @MachineSizedSInt long stackIndex);
    @Method(selector = "setDrawWithX:y:")
    public native void setDraw(@MachineSizedFloat double x, @MachineSizedFloat double y);
    @Method(selector = "setDrawWithPt:")
    public native void setDraw(@ByVal CGPoint pt);
    @Method(selector = "isEqual:")
    public native boolean isEqual(NSObject object);
    /*</methods>*/
}
