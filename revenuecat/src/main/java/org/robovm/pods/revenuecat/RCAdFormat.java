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
package org.robovm.pods.revenuecat;

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
import org.robovm.apple.storekit.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/RCAdFormat/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class RCAdFormatPtr extends Ptr<RCAdFormat, RCAdFormatPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(RCAdFormat.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected RCAdFormat() {}
    protected RCAdFormat(Handle h, long handle) { super(h, handle); }
    protected RCAdFormat(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithRawValue:")
    public RCAdFormat(String rawValue) { super((SkipInit) null); initObject(init(rawValue)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "rawValue")
    public native String getRawValue();
    @Property(selector = "hash")
    public native @MachineSizedUInt long getHash();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithRawValue:")
    protected native @Pointer long init(String rawValue);
    @Method(selector = "isEqual:")
    public native boolean isEqual(NSObject object);
    @Method(selector = "other")
    public static native RCAdFormat other();
    @Method(selector = "banner")
    public static native RCAdFormat banner();
    @Method(selector = "interstitial")
    public static native RCAdFormat interstitial();
    @Method(selector = "rewarded")
    public static native RCAdFormat rewarded();
    @Method(selector = "rewardedInterstitial")
    public static native RCAdFormat rewardedInterstitial();
    @Method(selector = "native")
    public static native RCAdFormat getNative();
    @Method(selector = "appOpen")
    public static native RCAdFormat appOpen();
    /*</methods>*/
}
