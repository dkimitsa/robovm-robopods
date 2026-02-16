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
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MANativeAdAdapterDelegateAdapter/*</name>*/ 
    extends /*<extends>*/MAAdapterDelegateAdapter/*</extends>*/ 
    /*<implements>*/implements MANativeAdAdapterDelegate/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @NotImplemented("didLoadAdForNativeAd:withExtraInfo:")
    public void didLoadAdForNativeAd(MANativeAd nativeAd, NSDictionary<NSString, ?> extraInfo) {}
    @NotImplemented("didFailToLoadNativeAdWithError:")
    public void didFailToLoadNativeAd(MAAdapterError adapterError) {}
    @NotImplemented("didDisplayNativeAdWithExtraInfo:")
    public void didDisplayNativeAd(NSDictionary<NSString, ?> extraInfo) {}
    @NotImplemented("didClickNativeAd")
    public void didClickNativeAd() {}
    @NotImplemented("didClickNativeAdWithExtraInfo:")
    public void didClickNativeAd(NSDictionary<NSString, ?> extraInfo) {}
    /*</methods>*/
}
