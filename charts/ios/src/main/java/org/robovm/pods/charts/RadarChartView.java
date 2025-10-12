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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("DGCharts.RadarChartView")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/RadarChartView/*</name>*/ 
    extends /*<extends>*/PieRadarChartViewBase/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class RadarChartViewPtr extends Ptr<RadarChartView, RadarChartViewPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(RadarChartView.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public RadarChartView() {}
    protected RadarChartView(Handle h, long handle) { super(h, handle); }
    protected RadarChartView(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithFrame:")
    public RadarChartView(@ByVal CGRect frame) { super((SkipInit) null); initObject(init(frame)); }
    @Method(selector = "initWithCoder:")
    public RadarChartView(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "webLineWidth")
    public native @MachineSizedFloat double getWebLineWidth();
    @Property(selector = "setWebLineWidth:")
    public native void setWebLineWidth(@MachineSizedFloat double v);
    @Property(selector = "innerWebLineWidth")
    public native @MachineSizedFloat double getInnerWebLineWidth();
    @Property(selector = "setInnerWebLineWidth:")
    public native void setInnerWebLineWidth(@MachineSizedFloat double v);
    @Property(selector = "webColor")
    public native UIColor getWebColor();
    @Property(selector = "setWebColor:")
    public native void setWebColor(UIColor v);
    @Property(selector = "innerWebColor")
    public native UIColor getInnerWebColor();
    @Property(selector = "setInnerWebColor:")
    public native void setInnerWebColor(UIColor v);
    @Property(selector = "webAlpha")
    public native @MachineSizedFloat double getWebAlpha();
    @Property(selector = "setWebAlpha:")
    public native void setWebAlpha(@MachineSizedFloat double v);
    @Property(selector = "drawWeb")
    public native boolean isDrawWeb();
    @Property(selector = "setDrawWeb:")
    public native void setDrawWeb(boolean v);
    @Property(selector = "factor")
    public native @MachineSizedFloat double getFactor();
    @Property(selector = "sliceAngle")
    public native @MachineSizedFloat double getSliceAngle();
    @Property(selector = "yAxis")
    public native ChartYAxis getYAxis();
    @Property(selector = "skipWebLineCount")
    public native @MachineSizedSInt long getSkipWebLineCount();
    @Property(selector = "setSkipWebLineCount:")
    public native void setSkipWebLineCount(@MachineSizedSInt long v);
    @Property(selector = "radius")
    public native @MachineSizedFloat double getRadius();
    @Property(selector = "chartYMax")
    public native double getChartYMax();
    @Property(selector = "chartYMin")
    public native double getChartYMin();
    @Property(selector = "yRange")
    public native double getYRange();
    @WeaklyLinked
    @Property(selector = "layerClass")
    public static native Class<? extends CALayer> getLayerClass();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithFrame:")
    protected native @Pointer long init(@ByVal CGRect frame);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    @Method(selector = "notifyDataSetChanged")
    public native void notifyDataSetChanged();
    @Method(selector = "drawRect:")
    public native void draw(@ByVal CGRect rect);
    @Method(selector = "indexForAngle:")
    public native @MachineSizedSInt long indexForAngle(@MachineSizedFloat double angle);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "userInterfaceLayoutDirectionForSemanticContentAttribute:")
    public static native UIUserInterfaceLayoutDirection getUserInterfaceLayoutDirection(UISemanticContentAttribute attribute);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "userInterfaceLayoutDirectionForSemanticContentAttribute:relativeToLayoutDirection:")
    public static native UIUserInterfaceLayoutDirection getUserInterfaceLayoutDirection(UISemanticContentAttribute semanticContentAttribute, UIUserInterfaceLayoutDirection layoutDirection);
    /*</methods>*/
}
