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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("DGCharts.XShapeRenderer")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/XShapeRenderer/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements ShapeRenderer/*</implements>*/ {

    /*<ptr>*/public static class XShapeRendererPtr extends Ptr<XShapeRenderer, XShapeRendererPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(XShapeRenderer.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public XShapeRenderer() {}
    protected XShapeRenderer(Handle h, long handle) { super(h, handle); }
    protected XShapeRenderer(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "renderShapeWithContext:dataSet:viewPortHandler:point:color:")
    public native void renderShape(CGContext context, ScatterChartDataSetProtocol dataSet, ChartViewPortHandler viewPortHandler, @ByVal CGPoint point, UIColor color);
    /*</methods>*/
}
