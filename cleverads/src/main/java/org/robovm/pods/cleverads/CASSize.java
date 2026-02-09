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
package org.robovm.pods.cleverads;

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
import org.robovm.apple.corelocation.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CASSize/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CASSizePtr extends Ptr<CASSize, CASSizePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CASSize.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected CASSize() {}
    protected CASSize(Handle h, long handle) { super(h, handle); }
    protected CASSize(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "width")
    public native @MachineSizedFloat double getWidth();
    @Property(selector = "height")
    public native @MachineSizedFloat double getHeight();
    @Property(selector = "isAdaptive")
    public native boolean isAdaptive();
    @Property(selector = "isInline")
    public native boolean isInline();
    @Property(selector = "description")
    public native String getDescription();
    @Property(selector = "hash")
    public native @MachineSizedUInt long getHash();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "toCGSize")
    public native @ByVal CGSize toCGSize();
    @Method(selector = "findClosestSize")
    public native CASSize findClosestSize();
    @Method(selector = "isEqual:")
    public native boolean isEqual(NSObject object);
    @Method(selector = "banner")
    public static native CASSize banner();
    @Method(selector = "leaderboard")
    public static native CASSize leaderboard();
    @Method(selector = "mediumRectangle")
    public static native CASSize mediumRectangle();
    @Method(selector = "getSmartBanner")
    public static native CASSize getSmartBanner();
    @Method(selector = "getInlineBannerWithWidth:maxHeight:")
    public static native CASSize getInlineBanner(@MachineSizedFloat double width, @MachineSizedFloat double maxHeight);
    @Method(selector = "getAdaptiveBannerInContainer:")
    public static native CASSize getAdaptiveBannerInContainer(UIView view);
    @Method(selector = "getAdaptiveBannerInWindow:")
    public static native CASSize getAdaptiveBannerInWindow(UIWindow inWindow);
    @Method(selector = "getAdaptiveBannerForMaxWidth:")
    public static native CASSize getAdaptiveBannerForMaxWidth(@MachineSizedFloat double maxWidth);
    /*</methods>*/
}
