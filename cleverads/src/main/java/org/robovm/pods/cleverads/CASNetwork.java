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
package org.robovm.pods.cleverads;

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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CASNetwork/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CASNetworkPtr extends Ptr<CASNetwork, CASNetworkPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CASNetwork.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public CASNetwork() {}
    protected CASNetwork(Handle h, long handle) { super(h, handle); }
    protected CASNetwork(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "casExchange")
    public static native String casExchange();
    @Method(selector = "dspExchange")
    public static native String dspExchange();
    @Method(selector = "crossPromo")
    public static native String crossPromo();
    @Method(selector = "googleAds")
    public static native String googleAds();
    @Method(selector = "vungle")
    public static native String vungle();
    @Method(selector = "kidoz")
    public static native String kidoz();
    @Method(selector = "chartboost")
    public static native String chartboost();
    @Method(selector = "unityAds")
    public static native String unityAds();
    @Method(selector = "appLovin")
    public static native String appLovin();
    @Method(selector = "meta")
    public static native String meta();
    @Method(selector = "inMobi")
    public static native String inMobi();
    @Method(selector = "ironSource")
    public static native String ironSource();
    @Method(selector = "yangoAds")
    public static native String yangoAds();
    @Method(selector = "mintegral")
    public static native String mintegral();
    @Method(selector = "pangle")
    public static native String pangle();
    @Method(selector = "prado")
    public static native String prado();
    @Method(selector = "dtExchange")
    public static native String dtExchange();
    @Method(selector = "bigo")
    public static native String bigo();
    @Method(selector = "maticoo")
    public static native String maticoo();
    @Method(selector = "verve")
    public static native String verve();
    @Method(selector = "hyprMX")
    public static native String hyprMX();
    @Method(selector = "smaato")
    public static native String smaato();
    @Method(selector = "startio")
    public static native String startio();
    @Method(selector = "madex")
    public static native String madex();
    @Method(selector = "ogury")
    public static native String ogury();
    @Method(selector = "ysoNetwork")
    public static native String ysoNetwork();
    @Method(selector = "superAwesome")
    public static native String superAwesome();
    @Method(selector = "lastPageAd")
    public static native String lastPageAd();
    @Method(selector = "pubmatic")
    public static native String pubmatic();
    @Method(selector = "displayIO")
    public static native String displayIO();
    @Method(selector = "bidease")
    public static native String bidease();
    @Method(selector = "moloco")
    public static native String moloco();
    @Method(selector = "facebookAdvertiserTracking")
    public static native String facebookAdvertiserTracking();
    @Method(selector = "facebookDataProcessing")
    public static native String facebookDataProcessing();
    @Method(selector = "getDisplayNameWithId:")
    public static native String getDisplayName(CASSourceId id);
    @Method(selector = "getDisplayName:")
    public static native String getDisplayName(String net);
    @Method(selector = "getAdapterId:")
    public static native CASSourceId getAdapterId(String net);
    @Method(selector = "getActiveNetworkPattern")
    public static native String getActiveNetworkPattern();
    @Method(selector = "getActiveNetworks")
    public static native NSArray<NSString> getActiveNetworks();
    @Method(selector = "isActiveNetwork:")
    public static native boolean isActiveNetwork(String network);
    @Method(selector = "values")
    public static native NSArray<NSString> values();
    /*</methods>*/
}
