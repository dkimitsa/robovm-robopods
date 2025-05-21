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
package org.robovm.pods.clearads;

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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CASInterstitial/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements CASScreenContent/*</implements>*/ {

    /*<ptr>*/public static class CASInterstitialPtr extends Ptr<CASInterstitial, CASInterstitialPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CASInterstitial.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected CASInterstitial() {}
    protected CASInterstitial(Handle h, long handle) { super(h, handle); }
    protected CASInterstitial(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCasID:")
    public CASInterstitial(String casID) { super((SkipInit) null); initObject(initWithCasID$(casID)); }
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
    @Property(selector = "minInterval")
    public native @MachineSizedSInt long getMinInterval();
    @Property(selector = "setMinInterval:")
    public native void setMinInterval(@MachineSizedSInt long v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithCasID:")
    protected native @Pointer long initWithCasID$(String casID);
    @Method(selector = "loadAd")
    public native void loadAd();
    @Method(selector = "presentFromViewController:")
    public native void presentFromViewController(UIViewController viewController);
    @Method(selector = "destroy")
    public native void destroy();
    @Method(selector = "restartInterval")
    public native void restartInterval();
    /*</methods>*/
}
