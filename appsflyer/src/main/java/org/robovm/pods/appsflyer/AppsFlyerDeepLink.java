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
package org.robovm.pods.appsflyer;

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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AppsFlyerDeepLink/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class AppsFlyerDeepLinkPtr extends Ptr<AppsFlyerDeepLink, AppsFlyerDeepLinkPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(AppsFlyerDeepLink.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected AppsFlyerDeepLink() {}
    protected AppsFlyerDeepLink(Handle h, long handle) { super(h, handle); }
    protected AppsFlyerDeepLink(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "clickEvent")
    public native NSDictionary<NSString, ?> getClickEvent();
    @Property(selector = "deeplinkValue")
    public native String getDeeplinkValue();
    @Property(selector = "matchType")
    public native String getMatchType();
    @Property(selector = "clickHTTPReferrer")
    public native String getClickHTTPReferrer();
    @Property(selector = "mediaSource")
    public native String getMediaSource();
    @Property(selector = "campaign")
    public native String getCampaign();
    @Property(selector = "campaignId")
    public native String getCampaignId();
    @Property(selector = "afSub1")
    public native String getAfSub1();
    @Property(selector = "afSub2")
    public native String getAfSub2();
    @Property(selector = "afSub3")
    public native String getAfSub3();
    @Property(selector = "afSub4")
    public native String getAfSub4();
    @Property(selector = "afSub5")
    public native String getAfSub5();
    @Property(selector = "isDeferred")
    public native boolean isDeferred();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "toString")
    public native String toString();
    /*</methods>*/
}
