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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("DGCharts.PieChartView")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/PieChartView/*</name>*/ 
    extends /*<extends>*/PieRadarChartViewBase/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class PieChartViewPtr extends Ptr<PieChartView, PieChartViewPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(PieChartView.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public PieChartView() {}
    protected PieChartView(Handle h, long handle) { super(h, handle); }
    protected PieChartView(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithFrame:")
    public PieChartView(@ByVal CGRect frame) { super((SkipInit) null); initObject(init(frame)); }
    @Method(selector = "initWithCoder:")
    public PieChartView(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "xAxis")
    public native ChartXAxis getXAxis();
    @Property(selector = "setXAxis:")
    public native void setXAxis(ChartXAxis v);
    @Property(selector = "drawAngles")
    public native NSArray<NSNumber> getDrawAngles();
    @Property(selector = "absoluteAngles")
    public native NSArray<NSNumber> getAbsoluteAngles();
    @Property(selector = "holeColor")
    public native UIColor getHoleColor();
    @Property(selector = "setHoleColor:")
    public native void setHoleColor(UIColor v);
    @Property(selector = "drawSlicesUnderHoleEnabled")
    public native boolean drawSlicesUnderHoleEnabled();
    @Property(selector = "setDrawSlicesUnderHoleEnabled:")
    public native void setDrawSlicesUnderHoleEnabled(boolean v);
    @Property(selector = "isDrawSlicesUnderHoleEnabled")
    public native boolean isDrawSlicesUnderHoleEnabled();
    @Property(selector = "drawHoleEnabled")
    public native boolean drawHoleEnabled();
    @Property(selector = "setDrawHoleEnabled:")
    public native void setDrawHoleEnabled(boolean v);
    @Property(selector = "isDrawHoleEnabled")
    public native boolean isDrawHoleEnabled();
    @Property(selector = "centerText")
    public native String getCenterText();
    @Property(selector = "setCenterText:")
    public native void setCenterText(String v);
    @Property(selector = "centerAttributedText")
    public native NSAttributedString getCenterAttributedText();
    @Property(selector = "setCenterAttributedText:")
    public native void setCenterAttributedText(NSAttributedString v);
    @Property(selector = "centerTextOffset")
    public native @ByVal CGPoint getCenterTextOffset();
    @Property(selector = "setCenterTextOffset:")
    public native void setCenterTextOffset(@ByVal CGPoint v);
    @Property(selector = "drawCenterTextEnabled")
    public native boolean drawCenterTextEnabled();
    @Property(selector = "setDrawCenterTextEnabled:")
    public native void setDrawCenterTextEnabled(boolean v);
    @Property(selector = "isDrawCenterTextEnabled")
    public native boolean isDrawCenterTextEnabled();
    @Property(selector = "radius")
    public native @MachineSizedFloat double getRadius();
    @Property(selector = "circleBox")
    public native @ByVal CGRect getCircleBox();
    @Property(selector = "centerCircleBox")
    public native @ByVal CGPoint getCenterCircleBox();
    @Property(selector = "holeRadiusPercent")
    public native @MachineSizedFloat double getHoleRadiusPercent();
    @Property(selector = "setHoleRadiusPercent:")
    public native void setHoleRadiusPercent(@MachineSizedFloat double v);
    @Property(selector = "transparentCircleColor")
    public native UIColor getTransparentCircleColor();
    @Property(selector = "setTransparentCircleColor:")
    public native void setTransparentCircleColor(UIColor v);
    @Property(selector = "transparentCircleRadiusPercent")
    public native @MachineSizedFloat double getTransparentCircleRadiusPercent();
    @Property(selector = "setTransparentCircleRadiusPercent:")
    public native void setTransparentCircleRadiusPercent(@MachineSizedFloat double v);
    @Property(selector = "entryLabelColor")
    public native UIColor getEntryLabelColor();
    @Property(selector = "setEntryLabelColor:")
    public native void setEntryLabelColor(UIColor v);
    @Property(selector = "entryLabelFont")
    public native UIFont getEntryLabelFont();
    @Property(selector = "setEntryLabelFont:")
    public native void setEntryLabelFont(UIFont v);
    @Property(selector = "drawEntryLabelsEnabled")
    public native boolean drawEntryLabelsEnabled();
    @Property(selector = "setDrawEntryLabelsEnabled:")
    public native void setDrawEntryLabelsEnabled(boolean v);
    @Property(selector = "isDrawEntryLabelsEnabled")
    public native boolean isDrawEntryLabelsEnabled();
    @Property(selector = "usePercentValuesEnabled")
    public native boolean usePercentValuesEnabled();
    @Property(selector = "setUsePercentValuesEnabled:")
    public native void setUsePercentValuesEnabled(boolean v);
    @Property(selector = "isUsePercentValuesEnabled")
    public native boolean isUsePercentValuesEnabled();
    @Property(selector = "centerTextRadiusPercent")
    public native @MachineSizedFloat double getCenterTextRadiusPercent();
    @Property(selector = "setCenterTextRadiusPercent:")
    public native void setCenterTextRadiusPercent(@MachineSizedFloat double v);
    @Property(selector = "maxAngle")
    public native @MachineSizedFloat double getMaxAngle();
    @Property(selector = "setMaxAngle:")
    public native void setMaxAngle(@MachineSizedFloat double v);
    @Property(selector = "sliceTextDrawingThreshold")
    public native @MachineSizedFloat double getSliceTextDrawingThreshold();
    @Property(selector = "setSliceTextDrawingThreshold:")
    public native void setSliceTextDrawingThreshold(@MachineSizedFloat double v);
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
    @Method(selector = "drawRect:")
    public native void draw(@ByVal CGRect rect);
    @Method(selector = "angleForPointWithX:y:")
    public native @MachineSizedFloat double getAngleForPoint(@MachineSizedFloat double x, @MachineSizedFloat double y);
    @Method(selector = "distanceToCenterWithX:y:")
    public native @MachineSizedFloat double getDistanceToCenter(@MachineSizedFloat double x, @MachineSizedFloat double y);
    @Method(selector = "getMarkerPositionWithHighlight:")
    public native @ByVal CGPoint getMarkerPosition(ChartHighlight highlight);
    @Method(selector = "needsHighlightWithIndex:")
    public native boolean needsHighlight(@MachineSizedSInt long index);
    @Method(selector = "indexForAngle:")
    public native @MachineSizedSInt long indexForAngle(@MachineSizedFloat double angle);
    @Method(selector = "dataSetIndexForIndex:")
    public native @MachineSizedSInt long dataSetIndexForIndex(double xValue);
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
