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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CASAppOpen/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements CASScreenContent/*</implements>*/ {

    /*<ptr>*/public static class CASAppOpenPtr extends Ptr<CASAppOpen, CASAppOpenPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CASAppOpen.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected CASAppOpen() {}
    protected CASAppOpen(Handle h, long handle) { super(h, handle); }
    protected CASAppOpen(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCasID:")
    public CASAppOpen(String casID) { super((SkipInit) null); initObject(init(casID)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "delegate")
    public native CASScreenContentDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(CASScreenContentDelegate v);
    @Property(selector = "impressionDelegate")
    public native CASImpressionDelegate getImpressionDelegate();
    @Property(selector = "setImpressionDelegate:", strongRef = true)
    public native void setImpressionDelegate(CASImpressionDelegate v);
    @Property(selector = "isAutoloadEnabled")
    public native boolean isAutoloadEnabled();
    @Property(selector = "setIsAutoloadEnabled:")
    public native void setIsAutoloadEnabled(boolean v);
    @Property(selector = "isAutoshowEnabled")
    public native boolean isAutoshowEnabled();
    @Property(selector = "setIsAutoshowEnabled:")
    public native void setIsAutoshowEnabled(boolean v);
    @Property(selector = "isAdLoaded")
    public native boolean isAdLoaded();
    @Property(selector = "contentInfo")
    public native CASContentInfo getContentInfo();
    /**
     * @deprecated Will be removed in feature updates.
     */
    @Deprecated
    @Property(selector = "managerId")
    public native String getManagerId();
    /**
     * @deprecated Use adDelegate and implement ScreenAdContentDelegate instead.
     */
    @Deprecated
    @Property(selector = "contentCallback")
    public native CASCallback getContentCallback();
    /**
     * @deprecated Use adDelegate and implement ScreenAdContentDelegate instead.
     */
    @Deprecated
    @Property(selector = "setContentCallback:", strongRef = true)
    public native void setContentCallback(CASCallback v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithCasID:")
    protected native @Pointer long init(String casID);
    @Method(selector = "loadAd")
    public native void loadAd();
    @Method(selector = "presentFromViewController:")
    public native void presentFromViewController(UIViewController viewController);
    @Method(selector = "destroy")
    public native void destroy();
    /**
     * @deprecated Use simple load() function and adDelegate instead.
     */
    @Deprecated
    @Method(selector = "loadAdWithCompletionHandler:")
    public native void loadAd(@Block VoidBlock2<CASAppOpen, NSError> completionHandler);
    /**
     * @deprecated Loading app open ads now assumes the current orientation of the device, matching other full-screen formats.
     */
    @Deprecated
    @Method(selector = "loadAdWithOrientation:completionHandler:")
    public native void loadAd(UIInterfaceOrientation orientation, @Block VoidBlock2<CASAppOpen, NSError> completionHandler);
    /**
     * @deprecated Use isAdLoaded
     */
    @Deprecated
    @Method(selector = "isAdAvailable")
    public native boolean isAdAvailable();
    /**
     * @deprecated Use presentFromViewController:
     */
    @Deprecated
    @Method(selector = "presentFromRootViewController:")
    public native void presentFromRootViewController(UIViewController controller);
    /*</methods>*/
}
