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
package org.robovm.pods.clearads;

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
import org.robovm.apple.corelocation.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CASTargetingOptions/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CASTargetingOptionsPtr extends Ptr<CASTargetingOptions, CASTargetingOptionsPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CASTargetingOptions.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected CASTargetingOptions() {}
    protected CASTargetingOptions(Handle h, long handle) { super(h, handle); }
    protected CASTargetingOptions(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "userID")
    public native String getUserID();
    @Property(selector = "setUserID:")
    public native void setUserID(String v);
    @Property(selector = "gender")
    public native CASGender getGender();
    @Property(selector = "setGender:")
    public native void setGender(CASGender v);
    @Property(selector = "age")
    public native @MachineSizedSInt long getAge();
    @Property(selector = "setAge:")
    public native void setAge(@MachineSizedSInt long v);
    @Property(selector = "locationCollectionEnabled")
    public native boolean isLocationCollectionEnabled();
    @Property(selector = "setLocationCollectionEnabled:")
    public native void setLocationCollectionEnabled(boolean v);
    @Property(selector = "keywords")
    public native NSArray<NSString> getKeywords();
    @Property(selector = "setKeywords:")
    public native void setKeywords(NSArray<NSString> v);
    @Property(selector = "contentUrl")
    public native String getContentUrl();
    @Property(selector = "setContentUrl:")
    public native void setContentUrl(String v);
    @Property(selector = "location")
    public native CLLocation getLocation();
    @Property(selector = "setLocation:")
    public native void setLocation(CLLocation v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "setLocationWithLatitude:longitude:")
    public native void setLocation(double latitude, double longitude);
    @Method(selector = "clearLocation")
    public native void clearLocation();
    /*</methods>*/
}
