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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("DGCharts.BarLineChartViewBase")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/BarLineChartViewBase/*</name>*/ 
    extends /*<extends>*/ChartViewBase/*</extends>*/ 
    /*<implements>*/implements BarLineScatterCandleBubbleChartDataProvider, UIGestureRecognizerDelegate/*</implements>*/ {

    /*<ptr>*/public static class BarLineChartViewBasePtr extends Ptr<BarLineChartViewBase, BarLineChartViewBasePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(BarLineChartViewBase.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public BarLineChartViewBase() {}
    protected BarLineChartViewBase(Handle h, long handle) { super(h, handle); }
    protected BarLineChartViewBase(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithFrame:")
    public BarLineChartViewBase(@ByVal CGRect frame) { super((SkipInit) null); initObject(init(frame)); }
    @Method(selector = "initWithCoder:")
    public BarLineChartViewBase(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "gridBackgroundColor")
    public native UIColor getGridBackgroundColor();
    @Property(selector = "setGridBackgroundColor:")
    public native void setGridBackgroundColor(UIColor v);
    @Property(selector = "borderColor")
    public native UIColor getBorderColor();
    @Property(selector = "setBorderColor:")
    public native void setBorderColor(UIColor v);
    @Property(selector = "borderLineWidth")
    public native @MachineSizedFloat double getBorderLineWidth();
    @Property(selector = "setBorderLineWidth:")
    public native void setBorderLineWidth(@MachineSizedFloat double v);
    @Property(selector = "drawGridBackgroundEnabled")
    public native boolean drawGridBackgroundEnabled();
    @Property(selector = "setDrawGridBackgroundEnabled:")
    public native void setDrawGridBackgroundEnabled(boolean v);
    @Property(selector = "drawBordersEnabled")
    public native boolean drawBordersEnabled();
    @Property(selector = "setDrawBordersEnabled:")
    public native void setDrawBordersEnabled(boolean v);
    @Property(selector = "clipValuesToContentEnabled")
    public native boolean isClipValuesToContentEnabled();
    @Property(selector = "setClipValuesToContentEnabled:")
    public native void setClipValuesToContentEnabled(boolean v);
    @Property(selector = "clipDataToContentEnabled")
    public native boolean isClipDataToContentEnabled();
    @Property(selector = "setClipDataToContentEnabled:")
    public native void setClipDataToContentEnabled(boolean v);
    @Property(selector = "minOffset")
    public native @MachineSizedFloat double getMinOffset();
    @Property(selector = "setMinOffset:")
    public native void setMinOffset(@MachineSizedFloat double v);
    @Property(selector = "keepPositionOnRotation")
    public native boolean isKeepPositionOnRotation();
    @Property(selector = "setKeepPositionOnRotation:")
    public native void setKeepPositionOnRotation(boolean v);
    @Property(selector = "leftAxis")
    public native ChartYAxis getLeftAxis();
    @Property(selector = "setLeftAxis:")
    public native void setLeftAxis(ChartYAxis v);
    @Property(selector = "rightAxis")
    public native ChartYAxis getRightAxis();
    @Property(selector = "setRightAxis:")
    public native void setRightAxis(ChartYAxis v);
    @Property(selector = "leftYAxisRenderer")
    public native ChartYAxisRenderer getLeftYAxisRenderer();
    @Property(selector = "setLeftYAxisRenderer:")
    public native void setLeftYAxisRenderer(ChartYAxisRenderer v);
    @Property(selector = "rightYAxisRenderer")
    public native ChartYAxisRenderer getRightYAxisRenderer();
    @Property(selector = "setRightYAxisRenderer:")
    public native void setRightYAxisRenderer(ChartYAxisRenderer v);
    @Property(selector = "xAxisRenderer")
    public native ChartXAxisRenderer getXAxisRenderer();
    @Property(selector = "setXAxisRenderer:")
    public native void setXAxisRenderer(ChartXAxisRenderer v);
    @Property(selector = "visibleXRange")
    public native double getVisibleXRange();
    @Property(selector = "dragEnabled")
    public native boolean dragEnabled();
    @Property(selector = "setDragEnabled:")
    public native void setDragEnabled(boolean v);
    @Property(selector = "isDragEnabled")
    public native boolean isDragEnabled();
    @Property(selector = "dragXEnabled")
    public native boolean isDragXEnabled();
    @Property(selector = "setDragXEnabled:")
    public native void setDragXEnabled(boolean v);
    @Property(selector = "dragYEnabled")
    public native boolean isDragYEnabled();
    @Property(selector = "setDragYEnabled:")
    public native void setDragYEnabled(boolean v);
    @Property(selector = "scaleXEnabled")
    public native boolean scaleXEnabled();
    @Property(selector = "setScaleXEnabled:")
    public native void setScaleXEnabled(boolean v);
    @Property(selector = "scaleYEnabled")
    public native boolean scaleYEnabled();
    @Property(selector = "setScaleYEnabled:")
    public native void setScaleYEnabled(boolean v);
    @Property(selector = "isScaleXEnabled")
    public native boolean isScaleXEnabled();
    @Property(selector = "isScaleYEnabled")
    public native boolean isScaleYEnabled();
    @Property(selector = "doubleTapToZoomEnabled")
    public native boolean doubleTapToZoomEnabled();
    @Property(selector = "setDoubleTapToZoomEnabled:")
    public native void setDoubleTapToZoomEnabled(boolean v);
    @Property(selector = "isDoubleTapToZoomEnabled")
    public native boolean isDoubleTapToZoomEnabled();
    @Property(selector = "highlightPerDragEnabled")
    public native boolean highlightPerDragEnabled();
    @Property(selector = "setHighlightPerDragEnabled:")
    public native void setHighlightPerDragEnabled(boolean v);
    @Property(selector = "isHighlightPerDragEnabled")
    public native boolean isHighlightPerDragEnabled();
    @Property(selector = "isDrawGridBackgroundEnabled")
    public native boolean isDrawGridBackgroundEnabled();
    @Property(selector = "isDrawBordersEnabled")
    public native boolean isDrawBordersEnabled();
    @Property(selector = "scaleX")
    public native @MachineSizedFloat double getScaleX();
    @Property(selector = "scaleY")
    public native @MachineSizedFloat double getScaleY();
    @Property(selector = "isFullyZoomedOut")
    public native boolean isFullyZoomedOut();
    @Property(selector = "pinchZoomEnabled")
    public native boolean pinchZoomEnabled();
    @Property(selector = "setPinchZoomEnabled:")
    public native void setPinchZoomEnabled(boolean v);
    @Property(selector = "isPinchZoomEnabled")
    public native boolean isPinchZoomEnabled();
    @Property(selector = "hasNoDragOffset")
    public native boolean hasNoDragOffset();
    @Property(selector = "chartYMax")
    public native double getChartYMax();
    @Property(selector = "chartYMin")
    public native double getChartYMin();
    @Property(selector = "isAnyAxisInverted")
    public native boolean isAnyAxisInverted();
    @Property(selector = "autoScaleMinMaxEnabled")
    public native boolean autoScaleMinMaxEnabled();
    @Property(selector = "setAutoScaleMinMaxEnabled:")
    public native void setAutoScaleMinMaxEnabled(boolean v);
    @Property(selector = "isAutoScaleMinMaxEnabled")
    public native boolean isAutoScaleMinMaxEnabled();
    @Property(selector = "maxVisibleCount")
    public native @MachineSizedSInt long getMaxVisibleCount();
    @Property(selector = "setMaxVisibleCount:")
    public native void setMaxVisibleCount(@MachineSizedSInt long v);
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
    @Method(selector = "initWithFrame:")
    protected native @Pointer long init(@ByVal CGRect frame);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    @Method(selector = "observeValueForKeyPath:ofObject:change:context:")
    public native void observeValue(String keyPath, NSObject object, NSDictionary<NSString, ?> change, VoidPtr context);
    @Method(selector = "drawRect:")
    public native void draw(@ByVal CGRect rect);
    @Method(selector = "notifyDataSetChanged")
    public native void notifyDataSetChanged();
    @Method(selector = "stopDeceleration")
    public native void stopDeceleration();
    @Method(selector = "gestureRecognizerShouldBegin:")
    public native boolean shouldBegin(UIGestureRecognizer gestureRecognizer);
    @Method(selector = "gestureRecognizer:shouldRecognizeSimultaneouslyWithGestureRecognizer:")
    public native boolean shouldRecognizeSimultaneously(UIGestureRecognizer gestureRecognizer, UIGestureRecognizer otherGestureRecognizer);
    @Method(selector = "zoomIn")
    public native void zoomIn();
    @Method(selector = "zoomOut")
    public native void zoomOut();
    @Method(selector = "resetZoom")
    public native void resetZoom();
    @Method(selector = "zoomWithScaleX:scaleY:x:y:")
    public native void zoom(@MachineSizedFloat double scaleX, @MachineSizedFloat double scaleY, @MachineSizedFloat double x, @MachineSizedFloat double y);
    @Method(selector = "zoomWithScaleX:scaleY:xValue:yValue:axis:")
    public native void zoom(@MachineSizedFloat double scaleX, @MachineSizedFloat double scaleY, double xValue, double yValue, AxisDependency axis);
    @Method(selector = "zoomToCenterWithScaleX:scaleY:")
    public native void zoomToCenter(@MachineSizedFloat double scaleX, @MachineSizedFloat double scaleY);
    @Method(selector = "zoomAndCenterViewAnimatedWithScaleX:scaleY:xValue:yValue:axis:duration:easing:")
    public native void zoomAndCenterViewAnimated(@MachineSizedFloat double scaleX, @MachineSizedFloat double scaleY, double xValue, double yValue, AxisDependency axis, double duration, @Block Block2<Double, Double, Double> easing);
    @Method(selector = "zoomAndCenterViewAnimatedWithScaleX:scaleY:xValue:yValue:axis:duration:easingOption:")
    public native void zoomAndCenterViewAnimated(@MachineSizedFloat double scaleX, @MachineSizedFloat double scaleY, double xValue, double yValue, AxisDependency axis, double duration, ChartEasingOption easingOption);
    @Method(selector = "zoomAndCenterViewAnimatedWithScaleX:scaleY:xValue:yValue:axis:duration:")
    public native void zoomAndCenterViewAnimated(@MachineSizedFloat double scaleX, @MachineSizedFloat double scaleY, double xValue, double yValue, AxisDependency axis, double duration);
    @Method(selector = "fitScreen")
    public native void fitScreen();
    @Method(selector = "setScaleMinima:scaleY:")
    public native void setScaleMinima(@MachineSizedFloat double scaleX, @MachineSizedFloat double scaleY);
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
    @Method(selector = "moveViewToX:")
    public native void moveViewToX(double xValue);
    @Method(selector = "moveViewToY:axis:")
    public native void moveView(double yValue, AxisDependency axis);
    @Method(selector = "moveViewToXValue:yValue:axis:")
    public native void moveView(double xValue, double yValue, AxisDependency axis);
    @Method(selector = "moveViewToAnimatedWithXValue:yValue:axis:duration:easing:")
    public native void moveView(double xValue, double yValue, AxisDependency axis, double duration, @Block Block2<Double, Double, Double> easing);
    @Method(selector = "moveViewToAnimatedWithXValue:yValue:axis:duration:easingOption:")
    public native void moveView(double xValue, double yValue, AxisDependency axis, double duration, ChartEasingOption easingOption);
    @Method(selector = "moveViewToAnimatedWithXValue:yValue:axis:duration:")
    public native void moveView(double xValue, double yValue, AxisDependency axis, double duration);
    @Method(selector = "centerViewToXValue:yValue:axis:")
    public native void centerView(double xValue, double yValue, AxisDependency axis);
    @Method(selector = "centerViewToAnimatedWithXValue:yValue:axis:duration:easing:")
    public native void centerView(double xValue, double yValue, AxisDependency axis, double duration, @Block Block2<Double, Double, Double> easing);
    @Method(selector = "centerViewToAnimatedWithXValue:yValue:axis:duration:easingOption:")
    public native void centerView(double xValue, double yValue, AxisDependency axis, double duration, ChartEasingOption easingOption);
    @Method(selector = "centerViewToAnimatedWithXValue:yValue:axis:duration:")
    public native void centerView(double xValue, double yValue, AxisDependency axis, double duration);
    @Method(selector = "setViewPortOffsetsWithLeft:top:right:bottom:")
    public native void setViewPortOffsets(@MachineSizedFloat double left, @MachineSizedFloat double top, @MachineSizedFloat double right, @MachineSizedFloat double bottom);
    @Method(selector = "resetViewPortOffsets")
    public native void resetViewPortOffsets();
    @Method(selector = "getAxisRangeWithAxis:")
    public native double getAxisRange(AxisDependency axis);
    @Method(selector = "getPositionWithEntry:axis:")
    public native @ByVal CGPoint getPosition(ChartDataEntry e, AxisDependency axis);
    @Method(selector = "setScaleEnabled:")
    public native void setScaleEnabled(boolean enabled);
    @Method(selector = "valueForTouchPointWithPoint:axis:")
    public native @ByVal CGPoint getValueForTouchPoint(@ByVal CGPoint pt, AxisDependency axis);
    @Method(selector = "pixelForValuesWithX:y:axis:")
    public native @ByVal CGPoint getPixelForValues(double x, double y, AxisDependency axis);
    @Method(selector = "getEntryByTouchPointWithPoint:")
    public native ChartDataEntry getEntryByTouchPoint(@ByVal CGPoint pt);
    @Method(selector = "getDataSetByTouchPointWithPoint:")
    public native BarLineScatterCandleBubbleChartDataSetProtocol getDataSetByTouchPoint(@ByVal CGPoint pt);
    @Method(selector = "getAxis:")
    public native ChartYAxis getAxis(AxisDependency axis);
    @Method(selector = "setDragOffsetX:")
    public native void setDragOffsetX(@MachineSizedFloat double offset);
    @Method(selector = "setDragOffsetY:")
    public native void setDragOffsetY(@MachineSizedFloat double offset);
    @Method(selector = "setYAxisMinWidth:width:")
    public native void setYAxisMinWidth(AxisDependency axis, @MachineSizedFloat double width);
    @Method(selector = "getYAxisMinWidth:")
    public native @MachineSizedFloat double getYAxisMinWidth(AxisDependency axis);
    @Method(selector = "setYAxisMaxWidth:width:")
    public native void setYAxisMaxWidth(AxisDependency axis, @MachineSizedFloat double width);
    @Method(selector = "getYAxisMaxWidth:")
    public native @MachineSizedFloat double getYAxisMaxWidth(AxisDependency axis);
    @Method(selector = "getYAxisWidth:")
    public native @MachineSizedFloat double getYAxisWidth(AxisDependency axis);
    @Method(selector = "getTransformerForAxis:")
    public native ChartTransformer getTransformerForAxis(AxisDependency axis);
    @Method(selector = "isInvertedWithAxis:")
    public native boolean isInverted(AxisDependency axis);
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
    @Method(selector = "gestureRecognizer:shouldRequireFailureOfGestureRecognizer:")
    public native boolean shouldRequireFailure(UIGestureRecognizer gestureRecognizer, UIGestureRecognizer otherGestureRecognizer);
    @Method(selector = "gestureRecognizer:shouldBeRequiredToFailByGestureRecognizer:")
    public native boolean shouldBeRequiredToFail(UIGestureRecognizer gestureRecognizer, UIGestureRecognizer otherGestureRecognizer);
    @Method(selector = "gestureRecognizer:shouldReceiveTouch:")
    public native boolean shouldReceiveTouch(UIGestureRecognizer gestureRecognizer, UITouch touch);
    @Method(selector = "gestureRecognizer:shouldReceivePress:")
    public native boolean shouldReceivePress(UIGestureRecognizer gestureRecognizer, UIPress press);
    /**
     * @since Available in iOS 13.4 and later.
     */
    @Method(selector = "gestureRecognizer:shouldReceiveEvent:")
    public native boolean shouldReceiveEvent(UIGestureRecognizer gestureRecognizer, UIEvent event);
    /*</methods>*/
}
