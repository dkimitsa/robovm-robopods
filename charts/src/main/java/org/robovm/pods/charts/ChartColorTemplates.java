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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("DGCharts.ChartColorTemplates")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ChartColorTemplates/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class ChartColorTemplatesPtr extends Ptr<ChartColorTemplates, ChartColorTemplatesPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ChartColorTemplates.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public ChartColorTemplates() {}
    protected ChartColorTemplates(Handle h, long handle) { super(h, handle); }
    protected ChartColorTemplates(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "liberty")
    public static native NSArray<UIColor> liberty();
    @Method(selector = "joyful")
    public static native NSArray<UIColor> joyful();
    @Method(selector = "pastel")
    public static native NSArray<UIColor> pastel();
    @Method(selector = "colorful")
    public static native NSArray<UIColor> colorful();
    @Method(selector = "vordiplom")
    public static native NSArray<UIColor> vordiplom();
    @Method(selector = "material")
    public static native NSArray<UIColor> material();
    @Method(selector = "colorFromString:")
    public static native UIColor colorFromString(String colorString);
    /*</methods>*/
}
