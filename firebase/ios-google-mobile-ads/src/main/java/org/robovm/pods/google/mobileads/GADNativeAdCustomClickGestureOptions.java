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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GADNativeAdCustomClickGestureOptions/*</name>*/ 
    extends /*<extends>*/GADAdLoaderOptions/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class GADNativeAdCustomClickGestureOptionsPtr extends Ptr<GADNativeAdCustomClickGestureOptions, GADNativeAdCustomClickGestureOptionsPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GADNativeAdCustomClickGestureOptions.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected GADNativeAdCustomClickGestureOptions() {}
    protected GADNativeAdCustomClickGestureOptions(Handle h, long handle) { super(h, handle); }
    protected GADNativeAdCustomClickGestureOptions(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithSwipeGestureDirection:tapsAllowed:")
    public GADNativeAdCustomClickGestureOptions(UISwipeGestureRecognizerDirection direction, boolean tapsAllowed) { super((SkipInit) null); initObject(init(direction, tapsAllowed)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "swipeGestureDirection")
    public native UISwipeGestureRecognizerDirection getSwipeGestureDirection();
    @Property(selector = "setSwipeGestureDirection:")
    public native void setSwipeGestureDirection(UISwipeGestureRecognizerDirection v);
    @Property(selector = "areTapsAllowed")
    public native boolean areTapsAllowed();
    @Property(selector = "setTapsAllowed:")
    public native void setTapsAllowed(boolean v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithSwipeGestureDirection:tapsAllowed:")
    protected native @Pointer long init(UISwipeGestureRecognizerDirection direction, boolean tapsAllowed);
    /*</methods>*/
}
