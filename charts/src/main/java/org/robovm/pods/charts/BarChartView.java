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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("DGCharts.BarChartView")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/BarChartView/*</name>*/ 
    extends /*<extends>*/BarLineChartViewBase/*</extends>*/ 
    /*<implements>*/implements BarChartDataProvider/*</implements>*/ {

    /*<ptr>*/public static class BarChartViewPtr extends Ptr<BarChartView, BarChartViewPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(BarChartView.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public BarChartView() {}
    protected BarChartView(Handle h, long handle) { super(h, handle); }
    protected BarChartView(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithFrame:")
    public BarChartView(@ByVal CGRect frame) { super((SkipInit) null); initObject(init(frame)); }
    @Method(selector = "initWithCoder:")
    public BarChartView(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "drawValueAboveBarEnabled")
    public native boolean drawValueAboveBarEnabled();
    @Property(selector = "setDrawValueAboveBarEnabled:")
    public native void setDrawValueAboveBarEnabled(boolean v);
    @Property(selector = "drawBarShadowEnabled")
    public native boolean drawBarShadowEnabled();
    @Property(selector = "setDrawBarShadowEnabled:")
    public native void setDrawBarShadowEnabled(boolean v);
    @Property(selector = "fitBars")
    public native boolean isFitBars();
    @Property(selector = "setFitBars:")
    public native void setFitBars(boolean v);
    @Property(selector = "highlightFullBarEnabled")
    public native boolean highlightFullBarEnabled();
    @Property(selector = "setHighlightFullBarEnabled:")
    public native void setHighlightFullBarEnabled(boolean v);
    @Property(selector = "isHighlightFullBarEnabled")
    public native boolean isHighlightFullBarEnabled();
    @Property(selector = "barData")
    public native BarChartData getBarData();
    @Property(selector = "isDrawValueAboveBarEnabled")
    public native boolean isDrawValueAboveBarEnabled();
    @Property(selector = "isDrawBarShadowEnabled")
    public native boolean isDrawBarShadowEnabled();
    @WeaklyLinked
    @Property(selector = "layerClass")
    public static native Class<? extends CALayer> getLayerClass();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "getHighlightByTouchPoint:")
    public native ChartHighlight getHighlightByTouchPoint(@ByVal CGPoint pt);
    @Method(selector = "getBarBoundsWithEntry:")
    public native @ByVal CGRect getBarBounds(BarChartDataEntry e);
    @Method(selector = "groupBarsFromX:groupSpace:barSpace:")
    public native void groupBars(double fromX, double groupSpace, double barSpace);
    @Method(selector = "highlightValueWithX:dataSetIndex:stackIndex:")
    public native void highlightValue(double x, @MachineSizedSInt long dataSetIndex, @MachineSizedSInt long stackIndex);
    @Method(selector = "initWithFrame:")
    protected native @Pointer long init(@ByVal CGRect frame);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
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
