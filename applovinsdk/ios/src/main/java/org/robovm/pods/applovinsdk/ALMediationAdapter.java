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
package org.robovm.pods.applovinsdk;

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
import org.robovm.apple.safariservices.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ALMediationAdapter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements MAAdapter/*</implements>*/ {

    /*<ptr>*/public static class ALMediationAdapterPtr extends Ptr<ALMediationAdapter, ALMediationAdapterPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ALMediationAdapter.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected ALMediationAdapter() {}
    protected ALMediationAdapter(Handle h, long handle) { super(h, handle); }
    protected ALMediationAdapter(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithSdk:")
    public ALMediationAdapter(ALSdk sdk) { super((SkipInit) null); initObject(init(sdk)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "mediationTag")
    public static native String getMediationTag();
    @Property(selector = "sdk")
    public native ALSdk getSdk();
    @Property(selector = "tag")
    public native String getTag();
    @Property(selector = "reward")
    public native MAReward getReward();
    @Property(selector = "shouldAlwaysRewardUser")
    public native boolean alwaysRewardUser();
    @Property(selector = "SDKVersion")
    public native String getSDKVersion();
    @Property(selector = "adapterVersion")
    public native String getAdapterVersion();
    @Property(selector = "isBeta")
    public native boolean isBeta();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithSdk:")
    protected native @Pointer long init(ALSdk sdk);
    @Method(selector = "configureRewardForParameters:")
    public native void configureRewardForParameters(MAAdapterResponseParameters parameters);
    @Method(selector = "e:becauseOf:")
    public native void e(String message, NSException ex);
    @Method(selector = "userError:becauseOf:")
    public native void userError(String message, NSException ex);
    @Method(selector = "logDebug:")
    public native void logDebug(String message);
    @Method(selector = "logInfo:")
    public native void logInfo(String message);
    @Method(selector = "logWarn:")
    public native void logWarn(String message);
    @Method(selector = "logError:")
    public native void logError(String message);
    @Method(selector = "logUserError:")
    public native void logUserError(String message);
    @Method(selector = "initializeWithParameters:withCompletionHandler:")
    public native void initialize(MAAdapterInitializationParameters parameters, @Block Runnable completionHandler);
    @Method(selector = "shouldInitializeOnMainThread")
    public native NSNumber shouldInitializeOnMainThread();
    @Method(selector = "shouldCollectSignalsOnMainThread")
    public native NSNumber shouldCollectSignalsOnMainThread();
    @Method(selector = "shouldLoadAdsOnMainThreadForAdFormat:")
    public native NSNumber shouldLoadAdsOnMainThreadForAdFormat(MAAdFormat adFormat);
    @Method(selector = "shouldShowAdsOnMainThreadForAdFormat:")
    public native NSNumber shouldShowAdsOnMainThreadForAdFormat(MAAdFormat adFormat);
    @Method(selector = "shouldDestroyOnMainThread")
    public native NSNumber shouldDestroyOnMainThread();
    @Method(selector = "destroy")
    public native void destroy();
    @Method(selector = "initializeWithParameters:completionHandler:")
    public native void initialize(MAAdapterInitializationParameters parameters, @Block VoidBlock2<MAAdapterInitializationStatus, NSString> completionHandler);
    /*</methods>*/
}
