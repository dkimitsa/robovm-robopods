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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ChartImageFill/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements ChartFill/*</implements>*/ {

    /*<ptr>*/public static class ChartImageFillPtr extends Ptr<ChartImageFill, ChartImageFillPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ChartImageFill.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected ChartImageFill() {}
    protected ChartImageFill(Handle h, long handle) { super(h, handle); }
    protected ChartImageFill(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCgImage:isTiled:")
    public ChartImageFill(CGImage cgImage, boolean isTiled) { super((SkipInit) null); initObject(init(cgImage, isTiled)); }
    @Method(selector = "initWithImage:isTiled:")
    public ChartImageFill(UIImage image, boolean isTiled) { super((SkipInit) null); initObject(init(image, isTiled)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "image")
    public native CGImage getImage();
    @Property(selector = "isTiled")
    public native boolean isTiled();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithCgImage:isTiled:")
    protected native @Pointer long init(CGImage cgImage, boolean isTiled);
    @Method(selector = "initWithImage:isTiled:")
    protected native @Pointer long init(UIImage image, boolean isTiled);
    @Method(selector = "fillPathWithContext:rect:")
    public native void fillPath(CGContext context, @ByVal CGRect rect);
    /*</methods>*/
}
