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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FBSDKLoginButton/*</name>*/ 
    extends /*<extends>*/FBSDKButton/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class FBSDKLoginButtonPtr extends Ptr<FBSDKLoginButton, FBSDKLoginButtonPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FBSDKLoginButton.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected FBSDKLoginButton() {}
    protected FBSDKLoginButton(Handle h, long handle) { super(h, handle); }
    protected FBSDKLoginButton(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithFrame:")
    public FBSDKLoginButton(@ByVal CGRect frame) { super((SkipInit) null); initObject(init(frame)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "defaultAudience")
    public native FBSDKDefaultAudience getDefaultAudience();
    @Property(selector = "setDefaultAudience:")
    public native void setDefaultAudience(FBSDKDefaultAudience v);
    @Property(selector = "delegate")
    public native FBSDKLoginButtonDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(FBSDKLoginButtonDelegate v);
    @Property(selector = "permissions")
    public native NSArray<NSString> getPermissions();
    @Property(selector = "setPermissions:")
    public native void setPermissions(NSArray<NSString> v);
    @Property(selector = "tooltipBehavior")
    public native FBSDKLoginButtonTooltipBehavior getTooltipBehavior();
    @Property(selector = "setTooltipBehavior:")
    public native void setTooltipBehavior(FBSDKLoginButtonTooltipBehavior v);
    @Property(selector = "tooltipColorStyle")
    public native FBSDKTooltipColorStyle getTooltipColorStyle();
    @Property(selector = "setTooltipColorStyle:")
    public native void setTooltipColorStyle(FBSDKTooltipColorStyle v);
    @Property(selector = "loginTracking")
    public native FBSDKLoginTracking getLoginTracking();
    @Property(selector = "setLoginTracking:")
    public native void setLoginTracking(FBSDKLoginTracking v);
    @Property(selector = "appSwitch")
    public native FBSDKAppSwitch getAppSwitch();
    @Property(selector = "setAppSwitch:")
    public native void setAppSwitch(FBSDKAppSwitch v);
    @Property(selector = "nonce")
    public native String getNonce();
    @Property(selector = "setNonce:")
    public native void setNonce(String v);
    @Property(selector = "messengerPageId")
    public native String getMessengerPageId();
    @Property(selector = "setMessengerPageId:")
    public native void setMessengerPageId(String v);
    @Property(selector = "authType")
    public native FBSDKLoginAuthType getAuthType();
    @Property(selector = "setAuthType:")
    public native void setAuthType(FBSDKLoginAuthType v);
    @Property(selector = "codeVerifier")
    public native FBSDKCodeVerifier getCodeVerifier();
    @Property(selector = "setCodeVerifier:")
    public native void setCodeVerifier(FBSDKCodeVerifier v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithFrame:")
    protected native @Pointer long init(@ByVal CGRect frame);
    @Method(selector = "didMoveToWindow")
    public native void didMoveToWindow();
    @Method(selector = "imageRectForContentRect:")
    public native @ByVal CGRect getImageRect(@ByVal CGRect contentRect);
    @Method(selector = "titleRectForContentRect:")
    public native @ByVal CGRect getTitleRect(@ByVal CGRect contentRect);
    @Method(selector = "layoutSubviews")
    public native void layoutSubviews();
    @Method(selector = "sizeThatFits:")
    public native @ByVal CGSize getSizeThatFits(@ByVal CGSize size);
    /*</methods>*/
}
