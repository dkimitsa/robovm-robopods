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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GADSwipeableInterstitialAdOptions/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class GADSwipeableInterstitialAdOptionsPtr extends Ptr<GADSwipeableInterstitialAdOptions, GADSwipeableInterstitialAdOptionsPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GADSwipeableInterstitialAdOptions.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public GADSwipeableInterstitialAdOptions() {}
    protected GADSwipeableInterstitialAdOptions(Handle h, long handle) { super(h, handle); }
    protected GADSwipeableInterstitialAdOptions(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "maxScreenHoldDuration")
    public native double getMaxScreenHoldDuration();
    @Property(selector = "setMaxScreenHoldDuration:")
    public native void setMaxScreenHoldDuration(double v);
    @Property(selector = "adSize")
    public native @ByVal CGSize getAdSize();
    @Property(selector = "setAdSize:")
    public native void setAdSize(@ByVal CGSize v);
    @Property(selector = "customClickSwipeGestureDirection")
    public native UISwipeGestureRecognizerDirection getCustomClickSwipeGestureDirection();
    @Property(selector = "areCustomClickSwipeGestureTapsAllowed")
    public native boolean isCustomClickSwipeGestureTapsAllowed();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "enableCustomClickSwipeGestureWithDirection:tapsAllowed:")
    public native void enableCustomClickSwipeGesture(UISwipeGestureRecognizerDirection direction, boolean tapsAllowed);
    /*</methods>*/
}
