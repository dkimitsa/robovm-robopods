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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("DGCharts.ChartViewBase")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ChartViewBase/*</name>*/ 
    extends /*<extends>*/NSUIView/*</extends>*/ 
    /*<implements>*/implements ChartAnimatorDelegate, ChartDataProvider/*</implements>*/ {

    /*<ptr>*/public static class ChartViewBasePtr extends Ptr<ChartViewBase, ChartViewBasePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ChartViewBase.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public ChartViewBase() {}
    protected ChartViewBase(Handle h, long handle) { super(h, handle); }
    protected ChartViewBase(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithFrame:")
    public ChartViewBase(@ByVal CGRect frame) { super((SkipInit) null); initObject(init(frame)); }
    @Method(selector = "initWithCoder:")
    public ChartViewBase(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "data")
    public native ChartData getData();
    @Property(selector = "setData:")
    public native void setData(ChartData v);
    @Property(selector = "dragDecelerationEnabled")
    public native boolean dragDecelerationEnabled();
    @Property(selector = "setDragDecelerationEnabled:")
    public native void setDragDecelerationEnabled(boolean v);
    @Property(selector = "xAxis")
    public native ChartXAxis getXAxis();
    @Property(selector = "setXAxis:")
    public native void setXAxis(ChartXAxis v);
    @Property(selector = "chartDescription")
    public native ChartDescription getChartDescription();
    @Property(selector = "setChartDescription:")
    public native void setChartDescription(ChartDescription v);
    @Property(selector = "legend")
    public native ChartLegend getLegend();
    @Property(selector = "setLegend:")
    public native void setLegend(ChartLegend v);
    @Property(selector = "delegate")
    public native ChartViewDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(ChartViewDelegate v);
    @Property(selector = "noDataText")
    public native String getNoDataText();
    @Property(selector = "setNoDataText:")
    public native void setNoDataText(String v);
    @Property(selector = "noDataFont")
    public native UIFont getNoDataFont();
    @Property(selector = "setNoDataFont:")
    public native void setNoDataFont(UIFont v);
    @Property(selector = "noDataTextColor")
    public native UIColor getNoDataTextColor();
    @Property(selector = "setNoDataTextColor:")
    public native void setNoDataTextColor(UIColor v);
    @Property(selector = "noDataTextAlignment")
    public native NSTextAlignment getNoDataTextAlignment();
    @Property(selector = "setNoDataTextAlignment:")
    public native void setNoDataTextAlignment(NSTextAlignment v);
    @Property(selector = "legendRenderer")
    public native ChartLegendRenderer getLegendRenderer();
    @Property(selector = "setLegendRenderer:")
    public native void setLegendRenderer(ChartLegendRenderer v);
    @Property(selector = "renderer")
    public native ChartDataRenderer getRenderer();
    @Property(selector = "setRenderer:")
    public native void setRenderer(ChartDataRenderer v);
    @Property(selector = "highlighter")
    public native ChartHighlighterProtocol getHighlighter();
    @Property(selector = "setHighlighter:")
    public native void setHighlighter(ChartHighlighterProtocol v);
    @Property(selector = "viewPortHandler")
    public native ChartViewPortHandler getViewPortHandler();
    @Property(selector = "setViewPortHandler:")
    public native void setViewPortHandler(ChartViewPortHandler v);
    @Property(selector = "chartAnimator")
    public native ChartAnimator getChartAnimator();
    @Property(selector = "setChartAnimator:")
    public native void setChartAnimator(ChartAnimator v);
    @Property(selector = "highlighted")
    public native NSArray<ChartHighlight> getHighlighted();
    @Property(selector = "setHighlighted:")
    public native void setHighlighted(NSArray<ChartHighlight> v);
    @Property(selector = "drawMarkers")
    public native boolean isDrawMarkers();
    @Property(selector = "setDrawMarkers:")
    public native void setDrawMarkers(boolean v);
    @Property(selector = "isDrawMarkersEnabled")
    public native boolean isDrawMarkersEnabled();
    @Property(selector = "marker")
    public native ChartMarker getMarker();
    @Property(selector = "setMarker:")
    public native void setMarker(ChartMarker v);
    @Property(selector = "extraTopOffset")
    public native @MachineSizedFloat double getExtraTopOffset();
    @Property(selector = "setExtraTopOffset:")
    public native void setExtraTopOffset(@MachineSizedFloat double v);
    @Property(selector = "extraRightOffset")
    public native @MachineSizedFloat double getExtraRightOffset();
    @Property(selector = "setExtraRightOffset:")
    public native void setExtraRightOffset(@MachineSizedFloat double v);
    @Property(selector = "extraBottomOffset")
    public native @MachineSizedFloat double getExtraBottomOffset();
    @Property(selector = "setExtraBottomOffset:")
    public native void setExtraBottomOffset(@MachineSizedFloat double v);
    @Property(selector = "extraLeftOffset")
    public native @MachineSizedFloat double getExtraLeftOffset();
    @Property(selector = "setExtraLeftOffset:")
    public native void setExtraLeftOffset(@MachineSizedFloat double v);
    @Property(selector = "highlightPerTapEnabled")
    public native boolean isHighlightPerTapEnabled();
    @Property(selector = "setHighlightPerTapEnabled:")
    public native void setHighlightPerTapEnabled(boolean v);
    @Property(selector = "isHighLightPerTapEnabled")
    public native boolean isHighLightPerTapEnabled();
    @Property(selector = "lastHighlighted")
    public native ChartHighlight getLastHighlighted();
    @Property(selector = "setLastHighlighted:")
    public native void setLastHighlighted(ChartHighlight v);
    @Property(selector = "chartYMax")
    public native double getChartYMax();
    @Property(selector = "chartYMin")
    public native double getChartYMin();
    @Property(selector = "chartXMax")
    public native double getChartXMax();
    @Property(selector = "chartXMin")
    public native double getChartXMin();
    @Property(selector = "xRange")
    public native double getXRange();
    @Property(selector = "midPoint")
    public native @ByVal CGPoint getMidPoint();
    @Property(selector = "centerOffsets")
    public native @ByVal CGPoint getCenterOffsets();
    @Property(selector = "contentRect")
    public native @ByVal CGRect getContentRect();
    @Property(selector = "isDragDecelerationEnabled")
    public native boolean isDragDecelerationEnabled();
    @Property(selector = "dragDecelerationFrictionCoef")
    public native @MachineSizedFloat double getDragDecelerationFrictionCoef();
    @Property(selector = "setDragDecelerationFrictionCoef:")
    public native void setDragDecelerationFrictionCoef(@MachineSizedFloat double v);
    @Property(selector = "maxHighlightDistance")
    public native @MachineSizedFloat double getMaxHighlightDistance();
    @Property(selector = "setMaxHighlightDistance:")
    public native void setMaxHighlightDistance(@MachineSizedFloat double v);
    @Property(selector = "maxVisibleCount")
    public native @MachineSizedSInt long getMaxVisibleCount();
    @WeaklyLinked
    @Property(selector = "layerClass")
    public static native Class<? extends CALayer> getLayerClass();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "setExtraOffsetsWithLeft:top:right:bottom:")
    public native void setExtraOffsets(@MachineSizedFloat double left, @MachineSizedFloat double top, @MachineSizedFloat double right, @MachineSizedFloat double bottom);
    @Method(selector = "initWithFrame:")
    protected native @Pointer long init(@ByVal CGRect frame);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    @Method(selector = "clear")
    public native void clear();
    @Method(selector = "clearValues")
    public native void clearValues();
    @Method(selector = "isEmpty")
    public native boolean isEmpty();
    @Method(selector = "notifyDataSetChanged")
    public native void notifyDataSetChanged();
    @Method(selector = "drawRect:")
    public native void draw(@ByVal CGRect rect);
    @Method(selector = "accessibilityChildren")
    public native NSArray<?> accessibilityChildren();
    @Method(selector = "valuesToHighlight")
    public native boolean valuesToHighlight();
    @Method(selector = "highlightValues:")
    public native void highlightValues(NSArray<ChartHighlight> highs);
    @Method(selector = "highlightValueWithX:dataSetIndex:dataIndex:")
    public native void highlightValue(double x, @MachineSizedSInt long dataSetIndex, @MachineSizedSInt long dataIndex);
    @Method(selector = "highlightValueWithX:y:dataSetIndex:dataIndex:")
    public native void highlightValue(double x, double y, @MachineSizedSInt long dataSetIndex, @MachineSizedSInt long dataIndex);
    @Method(selector = "highlightValueWithX:dataSetIndex:dataIndex:callDelegate:")
    public native void highlightValue(double x, @MachineSizedSInt long dataSetIndex, @MachineSizedSInt long dataIndex, boolean callDelegate);
    @Method(selector = "highlightValueWithX:y:dataSetIndex:dataIndex:callDelegate:")
    public native void highlightValue(double x, double y, @MachineSizedSInt long dataSetIndex, @MachineSizedSInt long dataIndex, boolean callDelegate);
    @Method(selector = "highlightValue:")
    public native void highlightValue(ChartHighlight highlight);
    @Method(selector = "highlightValue:callDelegate:")
    public native void highlightValue(ChartHighlight highlight, boolean callDelegate);
    @Method(selector = "getHighlightByTouchPoint:")
    public native ChartHighlight getHighlightByTouchPoint(@ByVal CGPoint pt);
    @Method(selector = "getMarkerPositionWithHighlight:")
    public native @ByVal CGPoint getMarkerPosition(ChartHighlight highlight);
    @Method(selector = "animateWithXAxisDuration:yAxisDuration:easingX:easingY:")
    public native void animate(double xAxisDuration, double yAxisDuration, @Block Block2<Double, Double, Double> easingX, @Block Block2<Double, Double, Double> easingY);
    @Method(selector = "animateWithXAxisDuration:yAxisDuration:easingOptionX:easingOptionY:")
    public native void animate(double xAxisDuration, double yAxisDuration, ChartEasingOption easingOptionX, ChartEasingOption easingOptionY);
    @Method(selector = "animateWithXAxisDuration:yAxisDuration:easing:")
    public native void animate(double xAxisDuration, double yAxisDuration, @Block Block2<Double, Double, Double> easing);
    @Method(selector = "animateWithXAxisDuration:yAxisDuration:easingOption:")
    public native void animate(double xAxisDuration, double yAxisDuration, ChartEasingOption easingOption);
    @Method(selector = "animateWithXAxisDuration:yAxisDuration:")
    public native void animate(double xAxisDuration, double yAxisDuration);
    @Method(selector = "animateWithXAxisDuration:easing:")
    public native void animateXAxis(double xAxisDuration, @Block Block2<Double, Double, Double> easing);
    @Method(selector = "animateWithXAxisDuration:easingOption:")
    public native void animateXAxis(double xAxisDuration, ChartEasingOption easingOption);
    @Method(selector = "animateWithXAxisDuration:")
    public native void animateXAxis(double xAxisDuration);
    @Method(selector = "animateWithYAxisDuration:easing:")
    public native void animateYAxis(double yAxisDuration, @Block Block2<Double, Double, Double> easing);
    @Method(selector = "animateWithYAxisDuration:easingOption:")
    public native void animateYAxis(double yAxisDuration, ChartEasingOption easingOption);
    @Method(selector = "animateWithYAxisDuration:")
    public native void animateYAxis(double yAxisDuration);
    @Method(selector = "getChartImageWithTransparent:")
    public native UIImage getChartImage(boolean transparent);
    @Method(selector = "observeValueForKeyPath:ofObject:change:context:")
    public native void observeValue(String keyPath, NSObject object, NSDictionary<NSString, ?> change, VoidPtr context);
    @Method(selector = "removeViewportJob:")
    public native void removeViewportJob(ChartViewPortJob job);
    @Method(selector = "clearAllViewportJobs")
    public native void clearAllViewportJobs();
    @Method(selector = "addViewportJob:")
    public native void addViewportJob(ChartViewPortJob job);
    @Method(selector = "animatorUpdated:")
    public native void animatorUpdated(ChartAnimator chartAnimator);
    @Method(selector = "animatorStopped:")
    public native void animatorStopped(ChartAnimator chartAnimator);
    @Method(selector = "nsuiTouchesBegan:withEvent:")
    public native void nsuiTouchesBegan(NSSet<UITouch> touches, UIEvent event);
    @Method(selector = "nsuiTouchesMoved:withEvent:")
    public native void nsuiTouchesMoved(NSSet<UITouch> touches, UIEvent event);
    @Method(selector = "nsuiTouchesEnded:withEvent:")
    public native void nsuiTouchesEnded(NSSet<UITouch> touches, UIEvent event);
    @Method(selector = "nsuiTouchesCancelled:withEvent:")
    public native void nsuiTouchesCancelled(NSSet<UITouch> touches, UIEvent event);
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
