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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/LineRadarChartRenderer/*</name>*/ 
    extends /*<extends>*/LineScatterCandleRadarChartRenderer/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class LineRadarChartRendererPtr extends Ptr<LineRadarChartRenderer, LineRadarChartRendererPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(LineRadarChartRenderer.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected LineRadarChartRenderer() {}
    protected LineRadarChartRenderer(Handle h, long handle) { super(h, handle); }
    protected LineRadarChartRenderer(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "drawFilledPathWithContext:path:fill:fillAlpha:")
    public native void drawFilledPath(CGContext context, CGPath path, ChartFill fill, @MachineSizedFloat double fillAlpha);
    @Method(selector = "drawFilledPathWithContext:path:fillColor:fillAlpha:")
    public native void drawFilledPath(CGContext context, CGPath path, UIColor fillColor, @MachineSizedFloat double fillAlpha);
    /*</methods>*/
}
