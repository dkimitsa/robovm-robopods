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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ChartMarkerImage/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements ChartMarker/*</implements>*/ {

    /*<ptr>*/public static class ChartMarkerImagePtr extends Ptr<ChartMarkerImage, ChartMarkerImagePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ChartMarkerImage.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public ChartMarkerImage() {}
    protected ChartMarkerImage(Handle h, long handle) { super(h, handle); }
    protected ChartMarkerImage(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "image")
    public native UIImage getImage();
    @Property(selector = "setImage:")
    public native void setImage(UIImage v);
    @Property(selector = "offset")
    public native @ByVal CGPoint getOffset();
    @Property(selector = "setOffset:")
    public native void setOffset(@ByVal CGPoint v);
    @Property(selector = "chartView")
    public native ChartViewBase getChartView();
    @Property(selector = "setChartView:", strongRef = true)
    public native void setChartView(ChartViewBase v);
    @Property(selector = "size")
    public native @ByVal CGSize getSize();
    @Property(selector = "setSize:")
    public native void setSize(@ByVal CGSize v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "offsetForDrawingAtPoint:")
    public native @ByVal CGPoint getOffsetForDrawing(@ByVal CGPoint point);
    @Method(selector = "refreshContentWithEntry:highlight:")
    public native void refreshContent(ChartDataEntry entry, ChartHighlight highlight);
    @Method(selector = "drawWithContext:point:")
    public native void draw(CGContext context, @ByVal CGPoint point);
    /*</methods>*/
}
