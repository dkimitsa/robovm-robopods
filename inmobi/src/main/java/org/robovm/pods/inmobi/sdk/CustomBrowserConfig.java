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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("InMobiSDK.CustomBrowserConfig")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CustomBrowserConfig/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CustomBrowserConfigPtr extends Ptr<CustomBrowserConfig, CustomBrowserConfigPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CustomBrowserConfig.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public CustomBrowserConfig() {}
    protected CustomBrowserConfig(Handle h, long handle) { super(h, handle); }
    protected CustomBrowserConfig(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "userClickGraceTime")
    public native double getUserClickGraceTime();
    @Property(selector = "setUserClickGraceTime:")
    public native void setUserClickGraceTime(double v);
    @Property(selector = "shouldHandleUniversalURL")
    public native boolean shouldHandleUniversalURL();
    @Property(selector = "setShouldHandleUniversalURL:")
    public native void setShouldHandleUniversalURL(boolean v);
    @Property(selector = "appleScheme")
    public native NSArray<NSString> getAppleScheme();
    @Property(selector = "setAppleScheme:")
    public native void setAppleScheme(NSArray<NSString> v);
    @Property(selector = "interstitial")
    public native CustomBrowserInternalConfig getInterstitial();
    @Property(selector = "setInterstitial:")
    public native void setInterstitial(CustomBrowserInternalConfig v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
