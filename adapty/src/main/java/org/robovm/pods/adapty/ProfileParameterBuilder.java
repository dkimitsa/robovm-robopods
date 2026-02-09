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
package org.robovm.pods.adapty;

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
import org.robovm.apple.iad.*;
import org.robovm.apple.apptrackingtransparency.*;
import org.robovm.apple.adsupport.*;
import org.robovm.apple.webkit.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("_TtC6Adapty23ProfileParameterBuilder")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ProfileParameterBuilder/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class ProfileParameterBuilderPtr extends Ptr<ProfileParameterBuilder, ProfileParameterBuilderPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ProfileParameterBuilder.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public ProfileParameterBuilder() {}
    protected ProfileParameterBuilder(Handle h, long handle) { super(h, handle); }
    protected ProfileParameterBuilder(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "withEmail:")
    public native ProfileParameterBuilder withEmail(String email);
    @Method(selector = "withPhoneNumber:")
    public native ProfileParameterBuilder withPhoneNumber(String phoneNumber);
    @Method(selector = "withFacebookUserId:")
    public native ProfileParameterBuilder withFacebookUserId(String facebookUserId);
    @Method(selector = "withFacebookAnonymousId:")
    public native ProfileParameterBuilder withFacebookAnonymousId(String facebookAnonymousId);
    @Method(selector = "withAmplitudeUserId:")
    public native ProfileParameterBuilder withAmplitudeUserId(String amplitudeUserId);
    @Method(selector = "withAmplitudeDeviceId:")
    public native ProfileParameterBuilder withAmplitudeDeviceId(String amplitudeDeviceId);
    @Method(selector = "withMixpanelUserId:")
    public native ProfileParameterBuilder withMixpanelUserId(String mixpanelUserId);
    @Method(selector = "withAppmetricaProfileId:")
    public native ProfileParameterBuilder withAppmetricaProfileId(String appmetricaProfileId);
    @Method(selector = "withAppmetricaDeviceId:")
    public native ProfileParameterBuilder withAppmetricaDeviceId(String appmetricaDeviceId);
    @Method(selector = "withFirstName:")
    public native ProfileParameterBuilder withFirstName(String firstName);
    @Method(selector = "withLastName:")
    public native ProfileParameterBuilder withLastName(String lastName);
    @Method(selector = "withGender:")
    public native ProfileParameterBuilder withGender(Gender gender);
    @Method(selector = "withBirthday:")
    public native ProfileParameterBuilder withBirthday(NSDate birthday);
    @Method(selector = "withCustomAttributes:")
    public native ProfileParameterBuilder withCustomAttributes(NSDictionary<NSString, ?> customAttributes);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "withAppTrackingTransparencyStatus:")
    public native ProfileParameterBuilder withAppTrackingTransparencyStatus(ATTrackingManagerAuthorizationStatus appTrackingTransparencyStatus);
    /*</methods>*/
}
