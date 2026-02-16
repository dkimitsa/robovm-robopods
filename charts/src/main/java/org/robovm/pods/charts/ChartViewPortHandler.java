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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ChartViewPortHandler/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class ChartViewPortHandlerPtr extends Ptr<ChartViewPortHandler, ChartViewPortHandlerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ChartViewPortHandler.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected ChartViewPortHandler() {}
    protected ChartViewPortHandler(Handle h, long handle) { super(h, handle); }
    protected ChartViewPortHandler(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithWidth:height:")
    public ChartViewPortHandler(@MachineSizedFloat double width, @MachineSizedFloat double height) { super((SkipInit) null); initObject(init(width, height)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "touchMatrix")
    public native @ByVal CGAffineTransform getTouchMatrix();
    @Property(selector = "contentRect")
    public native @ByVal CGRect getContentRect();
    @Property(selector = "chartWidth")
    public native @MachineSizedFloat double getChartWidth();
    @Property(selector = "chartHeight")
    public native @MachineSizedFloat double getChartHeight();
    @Property(selector = "minScaleY")
    public native @MachineSizedFloat double getMinScaleY();
    @Property(selector = "maxScaleY")
    public native @MachineSizedFloat double getMaxScaleY();
    @Property(selector = "minScaleX")
    public native @MachineSizedFloat double getMinScaleX();
    @Property(selector = "maxScaleX")
    public native @MachineSizedFloat double getMaxScaleX();
    @Property(selector = "scaleX")
    public native @MachineSizedFloat double getScaleX();
    @Property(selector = "scaleY")
    public native @MachineSizedFloat double getScaleY();
    @Property(selector = "transX")
    public native @MachineSizedFloat double getTransX();
    @Property(selector = "transY")
    public native @MachineSizedFloat double getTransY();
    @Property(selector = "hasChartDimens")
    public native boolean hasChartDimens();
    @Property(selector = "offsetLeft")
    public native @MachineSizedFloat double getOffsetLeft();
    @Property(selector = "offsetRight")
    public native @MachineSizedFloat double getOffsetRight();
    @Property(selector = "offsetTop")
    public native @MachineSizedFloat double getOffsetTop();
    @Property(selector = "offsetBottom")
    public native @MachineSizedFloat double getOffsetBottom();
    @Property(selector = "contentTop")
    public native @MachineSizedFloat double getContentTop();
    @Property(selector = "contentLeft")
    public native @MachineSizedFloat double getContentLeft();
    @Property(selector = "contentRight")
    public native @MachineSizedFloat double getContentRight();
    @Property(selector = "contentBottom")
    public native @MachineSizedFloat double getContentBottom();
    @Property(selector = "contentWidth")
    public native @MachineSizedFloat double getContentWidth();
    @Property(selector = "contentHeight")
    public native @MachineSizedFloat double getContentHeight();
    @Property(selector = "contentCenter")
    public native @ByVal CGPoint getContentCenter();
    @Property(selector = "isFullyZoomedOut")
    public native boolean isFullyZoomedOut();
    @Property(selector = "isFullyZoomedOutY")
    public native boolean isFullyZoomedOutY();
    @Property(selector = "isFullyZoomedOutX")
    public native boolean isFullyZoomedOutX();
    @Property(selector = "hasNoDragOffset")
    public native boolean hasNoDragOffset();
    @Property(selector = "canZoomOutMoreX")
    public native boolean canZoomOutMoreX();
    @Property(selector = "canZoomInMoreX")
    public native boolean canZoomInMoreX();
    @Property(selector = "canZoomOutMoreY")
    public native boolean canZoomOutMoreY();
    @Property(selector = "canZoomInMoreY")
    public native boolean canZoomInMoreY();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithWidth:height:")
    protected native @Pointer long init(@MachineSizedFloat double width, @MachineSizedFloat double height);
    @Method(selector = "setChartDimensWithWidth:height:")
    public native void setChartDimens(@MachineSizedFloat double width, @MachineSizedFloat double height);
    @Method(selector = "restrainViewPortWithOffsetLeft:offsetTop:offsetRight:offsetBottom:")
    public native void restrainViewPort(@MachineSizedFloat double offsetLeft, @MachineSizedFloat double offsetTop, @MachineSizedFloat double offsetRight, @MachineSizedFloat double offsetBottom);
    @Method(selector = "zoomWithScaleX:scaleY:")
    public native @ByVal CGAffineTransform zoom(@MachineSizedFloat double scaleX, @MachineSizedFloat double scaleY);
    @Method(selector = "zoomWithScaleX:scaleY:x:y:")
    public native @ByVal CGAffineTransform zoom(@MachineSizedFloat double scaleX, @MachineSizedFloat double scaleY, @MachineSizedFloat double x, @MachineSizedFloat double y);
    @Method(selector = "zoomInX:y:")
    public native @ByVal CGAffineTransform zoomIn(@MachineSizedFloat double x, @MachineSizedFloat double y);
    @Method(selector = "zoomOutWithX:y:")
    public native @ByVal CGAffineTransform zoomOut(@MachineSizedFloat double x, @MachineSizedFloat double y);
    @Method(selector = "resetZoom")
    public native @ByVal CGAffineTransform resetZoom();
    @Method(selector = "setZoomWithScaleX:scaleY:")
    public native @ByVal CGAffineTransform setZoom(@MachineSizedFloat double scaleX, @MachineSizedFloat double scaleY);
    @Method(selector = "setZoomWithScaleX:scaleY:x:y:")
    public native @ByVal CGAffineTransform setZoom(@MachineSizedFloat double scaleX, @MachineSizedFloat double scaleY, @MachineSizedFloat double x, @MachineSizedFloat double y);
    @Method(selector = "fitScreen")
    public native @ByVal CGAffineTransform fitScreen();
    @Method(selector = "translateWithPt:")
    public native @ByVal CGAffineTransform translate(@ByVal CGPoint pt);
    @Method(selector = "centerViewPortWithPt:chart:")
    public native void centerViewPort(@ByVal CGPoint pt, ChartViewBase chart);
    @Method(selector = "refreshWithNewMatrix:chart:invalidate:")
    public native @ByVal CGAffineTransform refresh(@ByVal CGAffineTransform newMatrix, ChartViewBase chart, boolean invalidate);
    @Method(selector = "setMinimumScaleX:")
    public native void setMinimumScaleX(@MachineSizedFloat double xScale);
    @Method(selector = "setMaximumScaleX:")
    public native void setMaximumScaleX(@MachineSizedFloat double xScale);
    @Method(selector = "setMinMaxScaleXWithMinScaleX:maxScaleX:")
    public native void setMinMaxScaleX(@MachineSizedFloat double minScaleX, @MachineSizedFloat double maxScaleX);
    @Method(selector = "setMinimumScaleY:")
    public native void setMinimumScaleY(@MachineSizedFloat double yScale);
    @Method(selector = "setMaximumScaleY:")
    public native void setMaximumScaleY(@MachineSizedFloat double yScale);
    @Method(selector = "setMinMaxScaleYWithMinScaleY:maxScaleY:")
    public native void setMinMaxScaleY(@MachineSizedFloat double minScaleY, @MachineSizedFloat double maxScaleY);
    @Method(selector = "isInBoundsX:")
    public native boolean isInBoundsX(@MachineSizedFloat double x);
    @Method(selector = "isInBoundsY:")
    public native boolean isInBoundsY(@MachineSizedFloat double y);
    @Method(selector = "isInBoundsWithPoint:")
    public native boolean isInBounds(@ByVal CGPoint point);
    @Method(selector = "isInBoundsWithX:y:")
    public native boolean isInBounds(@MachineSizedFloat double x, @MachineSizedFloat double y);
    @Method(selector = "isInBoundsLeft:")
    public native boolean isInBoundsLeft(@MachineSizedFloat double x);
    @Method(selector = "isInBoundsRight:")
    public native boolean isInBoundsRight(@MachineSizedFloat double x);
    @Method(selector = "isInBoundsTop:")
    public native boolean isInBoundsTop(@MachineSizedFloat double y);
    @Method(selector = "isInBoundsBottom:")
    public native boolean isInBoundsBottom(@MachineSizedFloat double y);
    @Method(selector = "isIntersectingLineFrom:to:")
    public native boolean isIntersectingLine(@ByVal CGPoint startPoint, @ByVal CGPoint endPoint);
    @Method(selector = "setDragOffsetX:")
    public native void setDragOffsetX(@MachineSizedFloat double offset);
    @Method(selector = "setDragOffsetY:")
    public native void setDragOffsetY(@MachineSizedFloat double offset);
    /*</methods>*/
}
