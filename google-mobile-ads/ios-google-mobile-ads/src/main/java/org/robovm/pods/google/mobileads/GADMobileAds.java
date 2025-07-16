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
package org.robovm.pods.google.mobileads;

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
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.storekit.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.webkit.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GADMobileAds/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class GADMobileAdsPtr extends Ptr<GADMobileAds, GADMobileAdsPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GADMobileAds.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public GADMobileAds() {}
    protected GADMobileAds(Handle h, long handle) { super(h, handle); }
    protected GADMobileAds(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "sharedInstance")
    public static native GADMobileAds sharedInstance();
    @Property(selector = "versionNumber")
    public native @ByVal GADVersionNumber getVersionNumber();
    @Property(selector = "applicationVolume")
    public native float getApplicationVolume();
    @Property(selector = "setApplicationVolume:")
    public native void setApplicationVolume(float v);
    @Property(selector = "isApplicationMuted")
    public native boolean isApplicationMuted();
    @Property(selector = "setApplicationMuted:")
    public native void setApplicationMuted(boolean v);
    @Property(selector = "audioVideoManager")
    public native GADAudioVideoManager getAudioVideoManager();
    @Property(selector = "requestConfiguration")
    public native GADRequestConfiguration getRequestConfiguration();
    @Property(selector = "initializationStatus")
    public native GADInitializationStatus getInitializationStatus();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @GlobalValue(symbol="GoogleMobileAdsVersionString", optional=true)
    public static native @org.robovm.rt.bro.annotation.Marshaler(StringMarshalers.AsAsciiZMarshaler.class) String getVersion();
    @GlobalValue(symbol="GADCustomEventParametersServer", optional=true)
    public static native String CustomEventParametersServer();
    
    @Bridge(symbol="GADGetStringFromVersionNumber", optional=true)
    public static native String getStringFromVersionNumber(@ByVal GADVersionNumber version);
    
    @Method(selector = "isSDKVersionAtLeastMajor:minor:patch:")
    public native boolean isSDKVersionAtLeast(@MachineSizedSInt long major, @MachineSizedSInt long minor, @MachineSizedSInt long patch);
    @Method(selector = "startWithCompletionHandler:")
    public native void start(@Block VoidBlock1<GADInitializationStatus> completionHandler);
    @Method(selector = "disableSDKCrashReporting")
    public native void disableSDKCrashReporting();
    @Method(selector = "disableMediationInitialization")
    public native void disableMediationInitialization();
    @Method(selector = "presentAdInspectorFromViewController:completionHandler:")
    public native void presentAdInspector(UIViewController viewController, @Block VoidBlock1<NSError> completionHandler);
    @Method(selector = "registerWebView:")
    public native void registerWebView(WKWebView webView);
    @Method(selector = "generateSignal:completionHandler:")
    public static native void generateSignal(GADSignalRequest request, @Block VoidBlock2<GADSignal, NSError> completionHandler);
    /*</methods>*/
}
