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
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/OSUser/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    @Property(selector = "pushSubscription")
    OSPushSubscription getPushSubscription();
    @Property(selector = "onesignalId")
    String getOnesignalId();
    @Property(selector = "externalId")
    String getExternalId();
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "addObserver:")
    void addObserver(OSUserStateObserver observer);
    @Method(selector = "removeObserver:")
    void removeObserver(OSUserStateObserver observer);
    @Method(selector = "addAliasWithLabel:id:")
    void addAlias(String label, String id);
    @Method(selector = "addAliases:")
    void addAliases(NSDictionary<NSString, NSString> aliases);
    @Method(selector = "removeAlias:")
    void removeAlias(String label);
    @Method(selector = "removeAliases:")
    void removeAliases(NSArray<NSString> labels);
    @Method(selector = "addTagWithKey:value:")
    void addTag(String key, String value);
    @Method(selector = "addTags:")
    void addTags(NSDictionary<NSString, NSString> tags);
    @Method(selector = "removeTag:")
    void removeTag(String tag);
    @Method(selector = "removeTags:")
    void removeTags(NSArray<NSString> tags);
    @Method(selector = "getTags")
    NSDictionary<NSString, NSString> getTags();
    @Method(selector = "addEmail:")
    void addEmail(String email);
    @Method(selector = "removeEmail:")
    void removeEmail(String email);
    @Method(selector = "addSms:")
    void addSms(String number);
    @Method(selector = "removeSms:")
    void removeSms(String number);
    @Method(selector = "setLanguage:")
    void setLanguage(String language);
    @Method(selector = "onJwtExpiredWithExpiredHandler:")
    void onJwtExpired(@Block("(,@Block)") VoidBlock2<NSString, VoidBlock1<NSString>> expiredHandler);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
