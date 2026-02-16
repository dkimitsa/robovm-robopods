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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("DGCharts.CombinedChartView")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CombinedChartView/*</name>*/ 
    extends /*<extends>*/BarLineChartViewBase/*</extends>*/ 
    /*<implements>*/implements CombinedChartDataProvider/*</implements>*/ {

    /*<ptr>*/public static class CombinedChartViewPtr extends Ptr<CombinedChartView, CombinedChartViewPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CombinedChartView.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public CombinedChartView() {}
    protected CombinedChartView(Handle h, long handle) { super(h, handle); }
    protected CombinedChartView(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithFrame:")
    public CombinedChartView(@ByVal CGRect frame) { super((SkipInit) null); initObject(init(frame)); }
    @Method(selector = "initWithCoder:")
    public CombinedChartView(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "data")
    public native ChartData getData();
    @Property(selector = "setData:")
    public native void setData(ChartData v);
    @Property(selector = "fillFormatter")
    public native ChartFillFormatter getFillFormatter();
    @Property(selector = "setFillFormatter:")
    public native void setFillFormatter(ChartFillFormatter v);
    @Property(selector = "combinedData")
    public native CombinedChartData getCombinedData();
    @Property(selector = "lineData")
    public native LineChartData getLineData();
    @Property(selector = "barData")
    public native BarChartData getBarData();
    @Property(selector = "scatterData")
    public native ScatterChartData getScatterData();
    @Property(selector = "candleData")
    public native CandleChartData getCandleData();
    @Property(selector = "bubbleData")
    public native BubbleChartData getBubbleData();
    @Property(selector = "drawValueAboveBarEnabled")
    public native boolean drawValueAboveBarEnabled();
    @Property(selector = "setDrawValueAboveBarEnabled:")
    public native void setDrawValueAboveBarEnabled(boolean v);
    @Property(selector = "drawBarShadowEnabled")
    public native boolean drawBarShadowEnabled();
    @Property(selector = "setDrawBarShadowEnabled:")
    public native void setDrawBarShadowEnabled(boolean v);
    @Property(selector = "isDrawValueAboveBarEnabled")
    public native boolean isDrawValueAboveBarEnabled();
    @Property(selector = "isDrawBarShadowEnabled")
    public native boolean isDrawBarShadowEnabled();
    @Property(selector = "drawOrder")
    public native NSArray<NSNumber> getDrawOrder();
    @Property(selector = "setDrawOrder:")
    public native void setDrawOrder(NSArray<NSNumber> v);
    @Property(selector = "highlightFullBarEnabled")
    public native boolean highlightFullBarEnabled();
    @Property(selector = "setHighlightFullBarEnabled:")
    public native void setHighlightFullBarEnabled(boolean v);
    @Property(selector = "isHighlightFullBarEnabled")
    public native boolean isHighlightFullBarEnabled();
    @WeaklyLinked
    @Property(selector = "layerClass")
    public static native Class<? extends CALayer> getLayerClass();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "getHighlightByTouchPoint:")
    public native ChartHighlight getHighlightByTouchPoint(@ByVal CGPoint pt);
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
    @Method(selector = "getAxis:")
    public native ChartYAxis getAxis(AxisDependency axis);
    /*</methods>*/
}
