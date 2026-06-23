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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CASNativeLoader/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CASNativeLoaderPtr extends Ptr<CASNativeLoader, CASNativeLoaderPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CASNativeLoader.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected CASNativeLoader() {}
    protected CASNativeLoader(Handle h, long handle) { super(h, handle); }
    protected CASNativeLoader(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCasID:")
    public CASNativeLoader(String casID) { super((SkipInit) null); initObject(initWithCasID$(casID)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "delegate")
    public native CASNativeLoaderDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(CASNativeLoaderDelegate v);
    @Property(selector = "adChoicesPlacement")
    public native CASChoicesPlacement getAdChoicesPlacement();
    @Property(selector = "setAdChoicesPlacement:")
    public native void setAdChoicesPlacement(CASChoicesPlacement v);
    @Property(selector = "isStartVideoMuted")
    public native boolean isStartVideoMuted();
    @Property(selector = "setIsStartVideoMuted:")
    public native void setIsStartVideoMuted(boolean v);
    @Property(selector = "placement")
    public native String getPlacement();
    @Property(selector = "setPlacement:")
    public native void setPlacement(String v);
    @Property(selector = "isAdLoading")
    public native boolean isAdLoading();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithCasID:")
    protected native @Pointer long initWithCasID$(String casID);
    @Method(selector = "loadAd")
    public native void loadAd();
    @Method(selector = "loadWithMaxNumberOfAds:")
    public native void loadWithMaxNumberOfAds$(@MachineSizedSInt long maxNumberOfAds);
    /*</methods>*/
}
