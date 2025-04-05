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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GADNativeSignalRequest/*</name>*/ 
    extends /*<extends>*/GADSignalRequest/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class GADNativeSignalRequestPtr extends Ptr<GADNativeSignalRequest, GADNativeSignalRequestPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GADNativeSignalRequest.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected GADNativeSignalRequest() {}
    protected GADNativeSignalRequest(Handle h, long handle) { super(h, handle); }
    protected GADNativeSignalRequest(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithSignalType:")
    public GADNativeSignalRequest(String signalType) { super((SkipInit) null); initObject(init(signalType)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "numberOfAds")
    public native @MachineSizedSInt long getNumberOfAds();
    @Property(selector = "setNumberOfAds:")
    public native void setNumberOfAds(@MachineSizedSInt long v);
    @Property(selector = "isImageLoadingDisabled")
    public native boolean isDisableImageLoading();
    @Property(selector = "setDisableImageLoading:")
    public native void setDisableImageLoading(boolean v);
    @Property(selector = "shouldRequestMultipleImages")
    public native boolean shouldRequestMultipleImages();
    @Property(selector = "setShouldRequestMultipleImages:")
    public native void setShouldRequestMultipleImages(boolean v);
    @Property(selector = "mediaAspectRatio")
    public native GADMediaAspectRatio getMediaAspectRatio();
    @Property(selector = "setMediaAspectRatio:")
    public native void setMediaAspectRatio(GADMediaAspectRatio v);
    @Property(selector = "preferredAdChoicesPosition")
    public native GADAdChoicesPosition getPreferredAdChoicesPosition();
    @Property(selector = "setPreferredAdChoicesPosition:")
    public native void setPreferredAdChoicesPosition(GADAdChoicesPosition v);
    @Property(selector = "isCustomMuteThisAdRequested")
    public native boolean isCustomMuteThisAdRequested();
    @Property(selector = "setCustomMuteThisAdRequested:")
    public native void setCustomMuteThisAdRequested(boolean v);
    @Property(selector = "enableManualImpressions")
    public native boolean isEnableManualImpressions();
    @Property(selector = "setEnableManualImpressions:")
    public native void setEnableManualImpressions(boolean v);
    @Property(selector = "videoOptions")
    public native GADVideoOptions getVideoOptions();
    @Property(selector = "setVideoOptions:")
    public native void setVideoOptions(GADVideoOptions v);
    @Property(selector = "adSizes")
    public native NSArray<NSValue> getAdSizes();
    @Property(selector = "setAdSizes:")
    public native void setAdSizes(NSArray<NSValue> v);
    @Property(selector = "adLoaderAdTypes")
    public native NSSet<NSString> getAdLoaderAdTypes();
    @Property(selector = "setAdLoaderAdTypes:")
    public native void setAdLoaderAdTypes(NSSet<NSString> v);
    @Property(selector = "customNativeAdFormatIDs")
    public native NSArray<NSString> getCustomNativeAdFormatIDs();
    @Property(selector = "setCustomNativeAdFormatIDs:")
    public native void setCustomNativeAdFormatIDs(NSArray<NSString> v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "enableSwipeGestureDirection:tapsAllowed:")
    public native void enableSwipeGestureDirection(UISwipeGestureRecognizerDirection direction, boolean tapsAllowed);
    @Method(selector = "initWithSignalType:")
    protected native @Pointer long init(String signalType);
    /*</methods>*/
}
