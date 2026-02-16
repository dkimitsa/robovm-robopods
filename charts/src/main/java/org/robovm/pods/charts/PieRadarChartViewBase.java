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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("DGCharts.PieRadarChartViewBase")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/PieRadarChartViewBase/*</name>*/ 
    extends /*<extends>*/ChartViewBase/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class PieRadarChartViewBasePtr extends Ptr<PieRadarChartViewBase, PieRadarChartViewBasePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(PieRadarChartViewBase.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public PieRadarChartViewBase() {}
    protected PieRadarChartViewBase(Handle h, long handle) { super(h, handle); }
    protected PieRadarChartViewBase(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithFrame:")
    public PieRadarChartViewBase(@ByVal CGRect frame) { super((SkipInit) null); initObject(init(frame)); }
    @Method(selector = "initWithCoder:")
    public PieRadarChartViewBase(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "rotationEnabled")
    public native boolean rotationEnabled();
    @Property(selector = "setRotationEnabled:")
    public native void setRotationEnabled(boolean v);
    @Property(selector = "minOffset")
    public native @MachineSizedFloat double getMinOffset();
    @Property(selector = "setMinOffset:")
    public native void setMinOffset(@MachineSizedFloat double v);
    @Property(selector = "maxVisibleCount")
    public native @MachineSizedSInt long getMaxVisibleCount();
    @Property(selector = "rotationAngle")
    public native @MachineSizedFloat double getRotationAngle();
    @Property(selector = "setRotationAngle:")
    public native void setRotationAngle(@MachineSizedFloat double v);
    @Property(selector = "rawRotationAngle")
    public native @MachineSizedFloat double getRawRotationAngle();
    @Property(selector = "diameter")
    public native @MachineSizedFloat double getDiameter();
    @Property(selector = "radius")
    public native @MachineSizedFloat double getRadius();
    @Property(selector = "chartYMax")
    public native double getChartYMax();
    @Property(selector = "chartYMin")
    public native double getChartYMin();
    @Property(selector = "isRotationEnabled")
    public native boolean isRotationEnabled();
    @Property(selector = "rotationWithTwoFingers")
    public native boolean rotationWithTwoFingers();
    @Property(selector = "setRotationWithTwoFingers:")
    public native void setRotationWithTwoFingers(boolean v);
    @Property(selector = "isRotationWithTwoFingers")
    public native boolean isRotationWithTwoFingers();
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
    @Method(selector = "angleForPointWithX:y:")
    public native @MachineSizedFloat double getAngleForPoint(@MachineSizedFloat double x, @MachineSizedFloat double y);
    @Method(selector = "getPositionWithCenter:dist:angle:")
    public native @ByVal CGPoint getPosition(@ByVal CGPoint center, @MachineSizedFloat double dist, @MachineSizedFloat double angle);
    @Method(selector = "distanceToCenterWithX:y:")
    public native @MachineSizedFloat double getDistanceToCenter(@MachineSizedFloat double x, @MachineSizedFloat double y);
    @Method(selector = "indexForAngle:")
    public native @MachineSizedSInt long indexForAngle(@MachineSizedFloat double angle);
    @Method(selector = "spinWithDuration:fromAngle:toAngle:easing:")
    public native void spin(double duration, @MachineSizedFloat double fromAngle, @MachineSizedFloat double toAngle, @Block Block2<Double, Double, Double> easing);
    @Method(selector = "spinWithDuration:fromAngle:toAngle:easingOption:")
    public native void spin(double duration, @MachineSizedFloat double fromAngle, @MachineSizedFloat double toAngle, ChartEasingOption easingOption);
    @Method(selector = "spinWithDuration:fromAngle:toAngle:")
    public native void spin(double duration, @MachineSizedFloat double fromAngle, @MachineSizedFloat double toAngle);
    @Method(selector = "stopSpinAnimation")
    public native void stopSpinAnimation();
    @Method(selector = "nsuiTouchesBegan:withEvent:")
    public native void nsuiTouchesBegan(NSSet<UITouch> touches, UIEvent event);
    @Method(selector = "nsuiTouchesMoved:withEvent:")
    public native void nsuiTouchesMoved(NSSet<UITouch> touches, UIEvent event);
    @Method(selector = "nsuiTouchesEnded:withEvent:")
    public native void nsuiTouchesEnded(NSSet<UITouch> touches, UIEvent event);
    @Method(selector = "nsuiTouchesCancelled:withEvent:")
    public native void nsuiTouchesCancelled(NSSet<UITouch> touches, UIEvent event);
    @Method(selector = "stopDeceleration")
    public native void stopDeceleration();
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
