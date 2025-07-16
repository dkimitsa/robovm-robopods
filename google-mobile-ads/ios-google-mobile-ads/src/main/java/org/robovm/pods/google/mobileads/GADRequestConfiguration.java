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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GADRequestConfiguration/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class GADRequestConfigurationPtr extends Ptr<GADRequestConfiguration, GADRequestConfigurationPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GADRequestConfiguration.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public GADRequestConfiguration() {}
    protected GADRequestConfiguration(Handle h, long handle) { super(h, handle); }
    protected GADRequestConfiguration(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "maxAdContentRating")
    public native GADMaxAdContentRating getMaxAdContentRating();
    @Property(selector = "setMaxAdContentRating:")
    public native void setMaxAdContentRating(GADMaxAdContentRating v);
    @Property(selector = "testDeviceIdentifiers")
    public native NSArray<NSString> getTestDeviceIdentifiers();
    @Property(selector = "setTestDeviceIdentifiers:")
    public native void setTestDeviceIdentifiers(NSArray<NSString> v);
    @Property(selector = "tagForUnderAgeOfConsent")
    public native NSNumber getTagForUnderAgeOfConsent();
    @Property(selector = "setTagForUnderAgeOfConsent:")
    public native void setTagForUnderAgeOfConsent(NSNumber v);
    @Property(selector = "tagForChildDirectedTreatment")
    public native NSNumber getTagForChildDirectedTreatment();
    @Property(selector = "setTagForChildDirectedTreatment:")
    public native void setTagForChildDirectedTreatment(NSNumber v);
    @Property(selector = "publisherPrivacyPersonalizationState")
    public native GADPublisherPrivacyPersonalizationState getPublisherPrivacyPersonalizationState();
    @Property(selector = "setPublisherPrivacyPersonalizationState:")
    public native void setPublisherPrivacyPersonalizationState(GADPublisherPrivacyPersonalizationState v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "setPublisherFirstPartyIDEnabled:")
    public native void setPublisherFirstPartyIDEnabled(boolean enabled);
    /*</methods>*/
}
