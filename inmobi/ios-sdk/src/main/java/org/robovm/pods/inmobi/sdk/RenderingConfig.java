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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("InMobiSDK.RenderingConfig")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/RenderingConfig/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class RenderingConfigPtr extends Ptr<RenderingConfig, RenderingConfigPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(RenderingConfig.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public RenderingConfig() {}
    protected RenderingConfig(Handle h, long handle) { super(h, handle); }
    protected RenderingConfig(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "picHeight")
    public native @MachineSizedSInt long getPicHeight();
    @Property(selector = "setPicHeight:")
    public native void setPicHeight(@MachineSizedSInt long v);
    @Property(selector = "gestures")
    public native NSArray<NSNumber> getGestures();
    @Property(selector = "setGestures:")
    public native void setGestures(NSArray<NSNumber> v);
    @Property(selector = "autoRedirectionEnforcement")
    public native boolean isAutoRedirectionEnforcement();
    @Property(selector = "setAutoRedirectionEnforcement:")
    public native void setAutoRedirectionEnforcement(boolean v);
    @Property(selector = "enableImmersive")
    public native boolean isEnableImmersive();
    @Property(selector = "setEnableImmersive:")
    public native void setEnableImmersive(boolean v);
    @Property(selector = "picQuality")
    public native @MachineSizedSInt long getPicQuality();
    @Property(selector = "setPicQuality:")
    public native void setPicQuality(@MachineSizedSInt long v);
    @Property(selector = "savecontent")
    public native SaveContentConfig getSavecontent();
    @Property(selector = "setSavecontent:")
    public native void setSavecontent(SaveContentConfig v);
    @Property(selector = "delayedRedirection")
    public native @MachineSizedSInt long getDelayedRedirection();
    @Property(selector = "setDelayedRedirection:")
    public native void setDelayedRedirection(@MachineSizedSInt long v);
    @Property(selector = "userTouchResetTime")
    public native @MachineSizedSInt long getUserTouchResetTime();
    @Property(selector = "setUserTouchResetTime:")
    public native void setUserTouchResetTime(@MachineSizedSInt long v);
    @Property(selector = "shouldRenderPopup")
    public native boolean shouldRenderPopup();
    @Property(selector = "setShouldRenderPopup:")
    public native void setShouldRenderPopup(boolean v);
    @Property(selector = "picWidth")
    public native @MachineSizedSInt long getPicWidth();
    @Property(selector = "setPicWidth:")
    public native void setPicWidth(@MachineSizedSInt long v);
    @Property(selector = "enableSDKAVAudioSession")
    public native boolean isEnableSDKAVAudioSession();
    @Property(selector = "setEnableSDKAVAudioSession:")
    public native void setEnableSDKAVAudioSession(boolean v);
    @Property(selector = "webviewModeDictionary")
    public native WebViewModeDictionaryConfig getWebviewModeDictionary();
    @Property(selector = "setWebviewModeDictionary:")
    public native void setWebviewModeDictionary(WebViewModeDictionaryConfig v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "enablePubMuteControl_")
    public native boolean enablePubMuteControl_();
    /*</methods>*/
}
