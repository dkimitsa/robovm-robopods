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
package org.robovm.pods.firebase.auth;

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
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FIRActionCodeSettings/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class FIRActionCodeSettingsPtr extends Ptr<FIRActionCodeSettings, FIRActionCodeSettingsPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FIRActionCodeSettings.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public FIRActionCodeSettings() {}
    protected FIRActionCodeSettings(Handle h, long handle) { super(h, handle); }
    protected FIRActionCodeSettings(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "URL")
    public native NSURL getURL();
    @Property(selector = "setURL:")
    public native void setURL(NSURL v);
    @Property(selector = "handleCodeInApp")
    public native boolean isHandleCodeInApp();
    @Property(selector = "setHandleCodeInApp:")
    public native void setHandleCodeInApp(boolean v);
    @Property(selector = "iOSBundleID")
    public native String getIOSBundleID();
    @Property(selector = "setIOSBundleID:")
    public native void setIOSBundleID(String v);
    @Property(selector = "androidPackageName")
    public native String getAndroidPackageName();
    @Property(selector = "setAndroidPackageName:")
    public native void setAndroidPackageName(String v);
    @Property(selector = "androidMinimumVersion")
    public native String getAndroidMinimumVersion();
    @Property(selector = "setAndroidMinimumVersion:")
    public native void setAndroidMinimumVersion(String v);
    @Property(selector = "androidInstallIfNotAvailable")
    public native boolean isAndroidInstallIfNotAvailable();
    @Property(selector = "setAndroidInstallIfNotAvailable:")
    public native void setAndroidInstallIfNotAvailable(boolean v);
    /**
     * @deprecated Firebase Dynamic Links is deprecated. Migrate to use Firebase Hosting link and use `linkDomain` to set a custom domain instead.
     */
    @Deprecated
    @Property(selector = "dynamicLinkDomain")
    public native String getDynamicLinkDomain();
    /**
     * @deprecated Firebase Dynamic Links is deprecated. Migrate to use Firebase Hosting link and use `linkDomain` to set a custom domain instead.
     */
    @Deprecated
    @Property(selector = "setDynamicLinkDomain:")
    public native void setDynamicLinkDomain(String v);
    @Property(selector = "linkDomain")
    public native String getLinkDomain();
    @Property(selector = "setLinkDomain:")
    public native void setLinkDomain(String v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "setAndroidPackageName:installIfNotAvailable:minimumVersion:")
    public native void setAndroidPackageName(String androidPackageName, boolean installIfNotAvailable, String minimumVersion);
    /*</methods>*/
}
