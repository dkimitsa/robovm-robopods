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
package org.robovm.pods.inmobi.sdk;

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
import org.robovm.apple.corelocation.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("InMobiSDK.WebViewModeDictionaryConfig")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/WebViewModeDictionaryConfig/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class WebViewModeDictionaryConfigPtr extends Ptr<WebViewModeDictionaryConfig, WebViewModeDictionaryConfigPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(WebViewModeDictionaryConfig.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public WebViewModeDictionaryConfig() {}
    protected WebViewModeDictionaryConfig(Handle h, long handle) { super(h, handle); }
    protected WebViewModeDictionaryConfig(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "pingStore")
    public native WebViewModeConfig getPingStore();
    @Property(selector = "setPingStore:")
    public native void setPingStore(WebViewModeConfig v);
    @Property(selector = "native")
    public native WebViewModeConfig getNative();
    @Property(selector = "setNative:")
    public native void setNative(WebViewModeConfig v);
    @Property(selector = "interstitial")
    public native WebViewModeConfig getInterstitial();
    @Property(selector = "setInterstitial:")
    public native void setInterstitial(WebViewModeConfig v);
    @Property(selector = "audio")
    public native WebViewModeConfig getAudio();
    @Property(selector = "setAudio:")
    public native void setAudio(WebViewModeConfig v);
    @Property(selector = "base")
    public native WebViewModeConfig getBase();
    @Property(selector = "setBase:")
    public native void setBase(WebViewModeConfig v);
    @Property(selector = "banner")
    public native WebViewModeConfig getBanner();
    @Property(selector = "setBanner:")
    public native void setBanner(WebViewModeConfig v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
