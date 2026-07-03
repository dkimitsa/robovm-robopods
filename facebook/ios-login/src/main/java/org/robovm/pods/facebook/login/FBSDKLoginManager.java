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
package org.robovm.pods.facebook.login;

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
import org.robovm.apple.dispatch.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.coreanimation.*;
import org.robovm.pods.facebook.core.*;
import org.robovm.pods.facebook.corebasics.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FBSDKLoginManager/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class FBSDKLoginManagerPtr extends Ptr<FBSDKLoginManager, FBSDKLoginManagerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FBSDKLoginManager.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public FBSDKLoginManager() {}
    protected FBSDKLoginManager(Handle h, long handle) { super(h, handle); }
    protected FBSDKLoginManager(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithDefaultAudience:")
    public FBSDKLoginManager(FBSDKDefaultAudience defaultAudience) { super((SkipInit) null); initObject(init(defaultAudience)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "defaultAudience")
    public native FBSDKDefaultAudience getDefaultAudience();
    @Property(selector = "setDefaultAudience:")
    public native void setDefaultAudience(FBSDKDefaultAudience v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithDefaultAudience:")
    protected native @Pointer long init(FBSDKDefaultAudience defaultAudience);
    @Method(selector = "logInFromViewController:configuration:completion:")
    public native void logIn(UIViewController viewController, FBSDKLoginConfiguration configuration, @Block VoidBlock2<FBSDKLoginManagerLoginResult, NSError> completion);
    @Method(selector = "logInWithPermissions:fromViewController:handler:")
    public native void logIn(NSArray<NSString> permissions, UIViewController viewController, @Block VoidBlock2<FBSDKLoginManagerLoginResult, NSError> handler);
    @Method(selector = "reauthorizeDataAccess:handler:")
    public native void reauthorizeDataAccess(UIViewController viewController, @Block VoidBlock2<FBSDKLoginManagerLoginResult, NSError> handler);
    @Method(selector = "logOut")
    public native void logOut();
    @Method(selector = "refreshLimitedLoginFromViewController:fallbackPolicy:completion:")
    public native void refreshLimitedLoginFromViewController(UIViewController viewController, FBSDKRefreshFallbackPolicy fallbackPolicy, @Block VoidBlock2<FBSDKProfile, NSError> completion);
    @Method(selector = "application:openURL:sourceApplication:annotation:")
    public native boolean openURL(UIApplication application, NSURL url, String sourceApplication, NSObject annotation);
    @Method(selector = "canOpenURL:forApplication:sourceApplication:annotation:")
    public native boolean canOpenURL(NSURL url, UIApplication application, String sourceApplication, NSObject annotation);
    /*</methods>*/
}
