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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("UnityAds.UnityAdsTokenConfiguration")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UnityAdsTokenConfiguration/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class UnityAdsTokenConfigurationPtr extends Ptr<UnityAdsTokenConfiguration, UnityAdsTokenConfigurationPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UnityAdsTokenConfiguration.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected UnityAdsTokenConfiguration() {}
    protected UnityAdsTokenConfiguration(Handle h, long handle) { super(h, handle); }
    protected UnityAdsTokenConfiguration(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithAdFormat:extras:")
    public UnityAdsTokenConfiguration(UnityAdsAdFormat adFormat, NSDictionary<NSString, NSString> extras) { super((SkipInit) null); initObject(init(adFormat, extras)); }
    public UnityAdsTokenConfiguration(UnityAdsAdFormat adFormat) { super((Handle) null, create(adFormat)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithAdFormat:extras:")
    protected native @Pointer long init(UnityAdsAdFormat adFormat, NSDictionary<NSString, NSString> extras);
    @Method(selector = "newWithAdFormat:")
    protected static native @Pointer long create(UnityAdsAdFormat adFormat);
    /*</methods>*/
}
