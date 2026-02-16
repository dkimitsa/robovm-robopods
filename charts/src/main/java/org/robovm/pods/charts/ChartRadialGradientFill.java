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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ChartRadialGradientFill/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements ChartFill/*</implements>*/ {

    /*<ptr>*/public static class ChartRadialGradientFillPtr extends Ptr<ChartRadialGradientFill, ChartRadialGradientFillPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ChartRadialGradientFill.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected ChartRadialGradientFill() {}
    protected ChartRadialGradientFill(Handle h, long handle) { super(h, handle); }
    protected ChartRadialGradientFill(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithGradient:startOffsetPercent:endOffsetPercent:startRadiusPercent:endRadiusPercent:")
    public ChartRadialGradientFill(CGGradient gradient, @ByVal CGPoint startOffsetPercent, @ByVal CGPoint endOffsetPercent, @MachineSizedFloat double startRadiusPercent, @MachineSizedFloat double endRadiusPercent) { super((SkipInit) null); initObject(init(gradient, startOffsetPercent, endOffsetPercent, startRadiusPercent, endRadiusPercent)); }
    @Method(selector = "initWithGradient:")
    public ChartRadialGradientFill(CGGradient gradient) { super((SkipInit) null); initObject(init(gradient)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "gradient")
    public native CGGradient getGradient();
    @Property(selector = "startOffsetPercent")
    public native @ByVal CGPoint getStartOffsetPercent();
    @Property(selector = "endOffsetPercent")
    public native @ByVal CGPoint getEndOffsetPercent();
    @Property(selector = "startRadiusPercent")
    public native @MachineSizedFloat double getStartRadiusPercent();
    @Property(selector = "endRadiusPercent")
    public native @MachineSizedFloat double getEndRadiusPercent();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithGradient:startOffsetPercent:endOffsetPercent:startRadiusPercent:endRadiusPercent:")
    protected native @Pointer long init(CGGradient gradient, @ByVal CGPoint startOffsetPercent, @ByVal CGPoint endOffsetPercent, @MachineSizedFloat double startRadiusPercent, @MachineSizedFloat double endRadiusPercent);
    @Method(selector = "initWithGradient:")
    protected native @Pointer long init(CGGradient gradient);
    @Method(selector = "fillPathWithContext:rect:")
    public native void fillPath(CGContext context, @ByVal CGRect rect);
    /*</methods>*/
}
