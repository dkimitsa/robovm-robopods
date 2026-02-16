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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UnityServices/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class UnityServicesPtr extends Ptr<UnityServices, UnityServicesPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UnityServices.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected UnityServices() {}
    protected UnityServices(Handle h, long handle) { super(h, handle); }
    protected UnityServices(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initialize:testMode:initializationDelegate:")
    public static native void initialize(String gameId, boolean testMode, UnityAdsInitializationDelegate initializationDelegate);
    @Method(selector = "getDebugMode")
    public static native boolean getDebugMode();
    @Method(selector = "setDebugMode:")
    public static native void setDebugMode(boolean enableDebugMode);
    @Method(selector = "isSupported")
    public static native boolean isSupported();
    @Method(selector = "getVersion")
    public static native String getVersion();
    @Method(selector = "isInitialized")
    public static native boolean isInitialized();
    @Method(selector = "adsGatewayEnabled")
    public static native boolean adsGatewayEnabled();
    @Method(selector = "load:options:loadDelegate:")
    public static native void load(String placementId, UADSLoadOptions options, UnityAdsLoadDelegate loadDelegate);
    @Method(selector = "show:placementId:options:showDelegate:")
    public static native void show(UIViewController viewController, String placementId, UADSShowOptions options, UnityAdsShowDelegate showDelegate);
    @Method(selector = "getToken")
    public static native String getToken();
    @Method(selector = "getToken:")
    public static native void getToken(@Block VoidBlock1<NSString> completion);
    /*</methods>*/
}
