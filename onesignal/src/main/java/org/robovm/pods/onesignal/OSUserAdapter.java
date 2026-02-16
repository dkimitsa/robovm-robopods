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
package org.robovm.pods.onesignal;

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
import org.robovm.apple.usernotifications.*;
import org.robovm.apple.uikit.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/OSUserAdapter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements OSUser/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*/
    @NotImplemented("pushSubscription")
    public OSPushSubscription getPushSubscription() { return null; }
    @NotImplemented("onesignalId")
    public String getOnesignalId() { return null; }
    @NotImplemented("externalId")
    public String getExternalId() { return null; }
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @NotImplemented("addObserver:")
    public void addObserver(OSUserStateObserver observer) {}
    @NotImplemented("removeObserver:")
    public void removeObserver(OSUserStateObserver observer) {}
    @NotImplemented("addAliasWithLabel:id:")
    public void addAlias(String label, String id) {}
    @NotImplemented("addAliases:")
    public void addAliases(NSDictionary<NSString, NSString> aliases) {}
    @NotImplemented("removeAlias:")
    public void removeAlias(String label) {}
    @NotImplemented("removeAliases:")
    public void removeAliases(NSArray<NSString> labels) {}
    @NotImplemented("addTagWithKey:value:")
    public void addTag(String key, String value) {}
    @NotImplemented("addTags:")
    public void addTags(NSDictionary<NSString, NSString> tags) {}
    @NotImplemented("removeTag:")
    public void removeTag(String tag) {}
    @NotImplemented("removeTags:")
    public void removeTags(NSArray<NSString> tags) {}
    @NotImplemented("getTags")
    public NSDictionary<NSString, NSString> getTags() { return null; }
    @NotImplemented("addEmail:")
    public void addEmail(String email) {}
    @NotImplemented("removeEmail:")
    public void removeEmail(String email) {}
    @NotImplemented("addSms:")
    public void addSms(String number) {}
    @NotImplemented("removeSms:")
    public void removeSms(String number) {}
    @NotImplemented("setLanguage:")
    public void setLanguage(String language) {}
    @NotImplemented("onJwtExpiredWithExpiredHandler:")
    public void onJwtExpired(@Block("(,@Block)") VoidBlock2<NSString, VoidBlock1<NSString>> expiredHandler) {}
    /*</methods>*/
}
