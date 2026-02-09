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
package org.robovm.pods.unityads;

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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UnityAdsBanner/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class UnityAdsBannerPtr extends Ptr<UnityAdsBanner, UnityAdsBannerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UnityAdsBanner.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public UnityAdsBanner() {}
    protected UnityAdsBanner(Handle h, long handle) { super(h, handle); }
    protected UnityAdsBanner(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Deprecated
    @Method(selector = "loadBanner:")
    public static native void loadBanner(String placementId);
    @Deprecated
    @Method(selector = "destroy")
    public static native void destroy();
    @Deprecated
    @Method(selector = "setBannerPosition:")
    public static native void setBannerPosition(UnityAdsBannerPosition bannerPosition);
    @Deprecated
    @Method(selector = "getDelegate")
    public static native UnityAdsBannerDelegate getDelegate();
    @Deprecated
    @Method(selector = "setDelegate:")
    public static native void setDelegate(UnityAdsBannerDelegate delegate);
    /*</methods>*/
}
