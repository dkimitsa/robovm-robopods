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
package org.robovm.pods.google.mobileads.adapters;

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
import org.robovm.apple.corelocation.*;
import org.robovm.pods.google.mobileads.*;
import org.robovm.pods.inmobi.sdk.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GADInMobiExtras/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements GADAdNetworkExtras/*</implements>*/ {

    /*<ptr>*/public static class GADInMobiExtrasPtr extends Ptr<GADInMobiExtras, GADInMobiExtrasPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GADInMobiExtras.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public GADInMobiExtras() {}
    protected GADInMobiExtras(Handle h, long handle) { super(h, handle); }
    protected GADInMobiExtras(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "age")
    public native @MachineSizedUInt long getAge();
    @Property(selector = "setAge:")
    public native void setAge(@MachineSizedUInt long v);
    @Property(selector = "ageGroup")
    public native IMSDKAgeGroup getAgeGroup();
    @Property(selector = "setAgeGroup:")
    public native void setAgeGroup(IMSDKAgeGroup v);
    @Property(selector = "postalCode")
    public native String getPostalCode();
    @Property(selector = "setPostalCode:")
    public native void setPostalCode(String v);
    @Property(selector = "areaCode")
    public native String getAreaCode();
    @Property(selector = "setAreaCode:")
    public native void setAreaCode(String v);
    @Property(selector = "educationType")
    public native IMSDKEducation getEducationType();
    @Property(selector = "setEducationType:")
    public native void setEducationType(IMSDKEducation v);
    @Property(selector = "logLevel")
    public native IMSDKLogLevel getLogLevel();
    @Property(selector = "setLogLevel:")
    public native void setLogLevel(IMSDKLogLevel v);
    @Property(selector = "yearOfBirth")
    public native @MachineSizedSInt long getYearOfBirth();
    @Property(selector = "setYearOfBirth:")
    public native void setYearOfBirth(@MachineSizedSInt long v);
    @Property(selector = "language")
    public native String getLanguage();
    @Property(selector = "setLanguage:")
    public native void setLanguage(String v);
    @Property(selector = "keywords")
    public native String getKeywords();
    @Property(selector = "setKeywords:")
    public native void setKeywords(String v);
    @Property(selector = "interests")
    public native String getInterests();
    @Property(selector = "setInterests:")
    public native void setInterests(String v);
    @Property(selector = "additionalParameters")
    public native NSDictionary<NSString, ?> getAdditionalParameters();
    @Property(selector = "setAdditionalParameters:")
    public native void setAdditionalParameters(NSDictionary<NSString, ?> v);
    @Property(selector = "city")
    public native String getCity();
    @Property(selector = "state")
    public native String getState();
    @Property(selector = "country")
    public native String getCountry();
    @Property(selector = "location")
    public native CLLocation getLocation();
    @Property(selector = "setLocation:")
    public native void setLocation(CLLocation v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "setLocationWithCity:state:country:")
    public native void setLocation(String city, String state, String country);
    /*</methods>*/
}
