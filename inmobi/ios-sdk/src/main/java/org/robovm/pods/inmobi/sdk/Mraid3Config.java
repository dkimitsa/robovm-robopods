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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("InMobiSDK.Mraid3Config")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/Mraid3Config/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class Mraid3ConfigPtr extends Ptr<Mraid3Config, Mraid3ConfigPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(Mraid3Config.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public Mraid3Config() {}
    protected Mraid3Config(Handle h, long handle) { super(h, handle); }
    protected Mraid3Config(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "bannerEnabled")
    public native boolean isBannerEnabled();
    @Property(selector = "setBannerEnabled:")
    public native void setBannerEnabled(boolean v);
    @Property(selector = "interstitialEnabled")
    public native boolean isInterstitialEnabled();
    @Property(selector = "setInterstitialEnabled:")
    public native void setInterstitialEnabled(boolean v);
    @Property(selector = "exposureChangeInterval")
    public native double getExposureChangeInterval();
    @Property(selector = "setExposureChangeInterval:")
    public native void setExposureChangeInterval(double v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
