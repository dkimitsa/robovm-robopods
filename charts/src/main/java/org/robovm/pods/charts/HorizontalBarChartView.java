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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("DGCharts.HorizontalBarChartView")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/HorizontalBarChartView/*</name>*/ 
    extends /*<extends>*/BarChartView/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class HorizontalBarChartViewPtr extends Ptr<HorizontalBarChartView, HorizontalBarChartViewPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(HorizontalBarChartView.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public HorizontalBarChartView() {}
    protected HorizontalBarChartView(Handle h, long handle) { super(h, handle); }
    protected HorizontalBarChartView(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithFrame:")
    public HorizontalBarChartView(@ByVal CGRect frame) { super((SkipInit) null); initObject(init(frame)); }
    @Method(selector = "initWithCoder:")
    public HorizontalBarChartView(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "lowestVisibleX")
    public native double getLowestVisibleX();
    @Property(selector = "highestVisibleX")
    public native double getHighestVisibleX();
    @WeaklyLinked
    @Property(selector = "layerClass")
    public static native Class<? extends CALayer> getLayerClass();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "getMarkerPositionWithHighlight:")
    public native @ByVal CGPoint getMarkerPosition(ChartHighlight highlight);
    @Method(selector = "getBarBoundsWithEntry:")
    public native @ByVal CGRect getBarBounds(BarChartDataEntry e);
    @Method(selector = "getPositionWithEntry:axis:")
    public native @ByVal CGPoint getPosition(ChartDataEntry e, AxisDependency axis);
    @Method(selector = "getHighlightByTouchPoint:")
    public native ChartHighlight getHighlightByTouchPoint(@ByVal CGPoint pt);
    @Method(selector = "setVisibleXRangeMaximum:")
    public native void setVisibleXRangeMaximum(double maxXRange);
    @Method(selector = "setVisibleXRangeMinimum:")
    public native void setVisibleXRangeMinimum(double minXRange);
    @Method(selector = "setVisibleXRangeWithMinXRange:maxXRange:")
    public native void setVisibleXRange(double minXRange, double maxXRange);
    @Method(selector = "setVisibleYRangeMaximum:axis:")
    public native void setVisibleYRangeMaximum(double maxYRange, AxisDependency axis);
    @Method(selector = "setVisibleYRangeMinimum:axis:")
    public native void setVisibleYRangeMinimum(double minYRange, AxisDependency axis);
    @Method(selector = "setVisibleYRangeWithMinYRange:maxYRange:axis:")
    public native void setVisibleYRange(double minYRange, double maxYRange, AxisDependency axis);
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
