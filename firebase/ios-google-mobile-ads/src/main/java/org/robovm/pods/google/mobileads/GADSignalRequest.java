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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GADSignalRequest/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class GADSignalRequestPtr extends Ptr<GADSignalRequest, GADSignalRequestPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GADSignalRequest.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected GADSignalRequest() {}
    protected GADSignalRequest(Handle h, long handle) { super(h, handle); }
    protected GADSignalRequest(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "scene")
    public native UIWindowScene getScene();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "setScene:", strongRef = true)
    public native void setScene(UIWindowScene v);
    @Property(selector = "keywords")
    public native NSArray<NSString> getKeywords();
    @Property(selector = "setKeywords:")
    public native void setKeywords(NSArray<NSString> v);
    @Property(selector = "contentURL")
    public native String getContentURL();
    @Property(selector = "setContentURL:")
    public native void setContentURL(String v);
    @Property(selector = "neighboringContentURLStrings")
    public native NSArray<NSString> getNeighboringContentURLStrings();
    @Property(selector = "setNeighboringContentURLStrings:")
    public native void setNeighboringContentURLStrings(NSArray<NSString> v);
    @Property(selector = "requestAgent")
    public native String getRequestAgent();
    @Property(selector = "setRequestAgent:")
    public native void setRequestAgent(String v);
    @Property(selector = "publisherProvidedID")
    public native String getPublisherProvidedID();
    @Property(selector = "setPublisherProvidedID:")
    public native void setPublisherProvidedID(String v);
    @Property(selector = "categoryExclusions")
    public native NSArray<NSString> getCategoryExclusions();
    @Property(selector = "setCategoryExclusions:")
    public native void setCategoryExclusions(NSArray<NSString> v);
    @Property(selector = "customTargeting")
    public native NSDictionary<NSString, NSString> getCustomTargeting();
    @Property(selector = "setCustomTargeting:")
    public native void setCustomTargeting(NSDictionary<NSString, NSString> v);
    @Property(selector = "adUnitID")
    public native String getAdUnitID();
    @Property(selector = "setAdUnitID:")
    public native void setAdUnitID(String v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "registerAdNetworkExtras:")
    public native void registerAdNetworkExtras(GADAdNetworkExtras extras);
    @Method(selector = "adNetworkExtrasFor:")
    public native GADAdNetworkExtras adNetworkExtrasFor(Class<?> aClass);
    @Method(selector = "removeAdNetworkExtrasFor:")
    public native void removeAdNetworkExtrasFor(Class<?> aClass);
    /*</methods>*/
}
