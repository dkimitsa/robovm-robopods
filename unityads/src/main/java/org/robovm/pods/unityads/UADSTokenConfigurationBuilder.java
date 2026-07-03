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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("UnityAds.UADSTokenConfigurationBuilder")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UADSTokenConfigurationBuilder/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class UADSTokenConfigurationBuilderPtr extends Ptr<UADSTokenConfigurationBuilder, UADSTokenConfigurationBuilderPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UADSTokenConfigurationBuilder.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected UADSTokenConfigurationBuilder() {}
    protected UADSTokenConfigurationBuilder(Handle h, long handle) { super(h, handle); }
    protected UADSTokenConfigurationBuilder(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithAdFormat:")
    public UADSTokenConfigurationBuilder(UADSAdFormat adFormat) { super((SkipInit) null); initObject(init(adFormat)); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithAdFormat:")
    protected native @Pointer long init(UADSAdFormat adFormat);
    @Method(selector = "withMediationInfo:")
    public native UADSTokenConfigurationBuilder withMediationInfo(UADSMediationInfo mediationInfo);
    @Method(selector = "withExtras:")
    public native UADSTokenConfigurationBuilder withExtras(NSDictionary<NSString, NSString> extras);
    @Method(selector = "withMediationAdUnitId:")
    public native UADSTokenConfigurationBuilder withMediationAdUnitId(String mediationAdUnitId);
    @Method(selector = "withPlacementId:")
    public native UADSTokenConfigurationBuilder withPlacementId(String placementId);
    @Method(selector = "withBannerSize:")
    public native UADSTokenConfigurationBuilder withBannerSize(@ByVal CGSize bannerSize);
    @Method(selector = "build")
    public native UADSTokenConfiguration build();
    /*</methods>*/
}
