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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GADAppOpenAdPreloader/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class GADAppOpenAdPreloaderPtr extends Ptr<GADAppOpenAdPreloader, GADAppOpenAdPreloaderPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GADAppOpenAdPreloader.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public GADAppOpenAdPreloader() {}
    protected GADAppOpenAdPreloader(Handle h, long handle) { super(h, handle); }
    protected GADAppOpenAdPreloader(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "sharedInstance")
    public static native GADAppOpenAdPreloader getSharedInstance();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "preloadForPreloadID:configuration:delegate:")
    public native boolean preloadForPreloadID(String preloadID, GADPreloadConfigurationV2 configuration, GADPreloadDelegate delegate);
    @Method(selector = "isAdAvailableWithPreloadID:")
    public native boolean isAdAvailable(String preloadID);
    @Method(selector = "adWithPreloadID:")
    public native GADAppOpenAd ad(String preloadID);
    @Method(selector = "adResponseInfoWithPreloadID:")
    public native GADResponseInfo adResponseInfo(String preloadID);
    @Method(selector = "numberOfAdsAvailableWithPreloadID:")
    public native @MachineSizedUInt long numberOfAdsAvailable(String preloadID);
    @Method(selector = "stopPreloadingAndRemoveAdsForPreloadID:")
    public native void stopPreloadingAndRemoveAdsForPreloadID(String preloadID);
    @Method(selector = "stopPreloadingAndRemoveAllAds")
    public native void stopPreloadingAndRemoveAllAds();
    @Method(selector = "configurationWithPreloadID:")
    public native GADPreloadConfigurationV2 configuration(String preloadID);
    @Method(selector = "configurations")
    public native NSDictionary<NSString, GADPreloadConfigurationV2> configurations();
    /*</methods>*/
}
