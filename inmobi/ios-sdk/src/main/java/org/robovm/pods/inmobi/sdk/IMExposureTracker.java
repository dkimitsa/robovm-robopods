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
package org.robovm.pods.inmobi.sdk;

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
import org.robovm.apple.corelocation.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("InMobiSDK.IMExposureTracker")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/IMExposureTracker/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class IMExposureTrackerPtr extends Ptr<IMExposureTracker, IMExposureTrackerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(IMExposureTracker.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected IMExposureTracker() {}
    protected IMExposureTracker(Handle h, long handle) { super(h, handle); }
    protected IMExposureTracker(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithAdView:")
    public IMExposureTracker(UIView adView) { super((SkipInit) null); initObject(init(adView)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "delegate")
    public native IMExposureTrackerDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(IMExposureTrackerDelegate v);
    @Property(selector = "exposureChangeCallback")
    public native @Block VoidBlock1<NSString> getExposureChangeCallback();
    @Property(selector = "setExposureChangeCallback:")
    public native void setExposureChangeCallback(@Block VoidBlock1<NSString> v);
    @Property(selector = "friendlyViews")
    public native NSArray<UIView> getFriendlyViews();
    @Property(selector = "setFriendlyViews:")
    public native void setFriendlyViews(NSArray<UIView> v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithAdView:")
    protected native @Pointer long init(UIView adView);
    @Method(selector = "startTracking")
    public native void startTracking();
    @Method(selector = "stopTracking")
    public native void stopTracking();
    /*</methods>*/
}
