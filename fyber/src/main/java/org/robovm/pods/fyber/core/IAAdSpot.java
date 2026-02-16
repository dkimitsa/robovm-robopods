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
package org.robovm.pods.fyber.core;

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
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.dispatch.*;
import org.robovm.apple.coregraphics.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/IAAdSpot/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements IAInterfaceBuilder, IAAdSpotBuilder/*</implements>*/ {

    /*<ptr>*/public static class IAAdSpotPtr extends Ptr<IAAdSpot, IAAdSpotPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(IAAdSpot.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public IAAdSpot() {}
    protected IAAdSpot(Handle h, long handle) { super(h, handle); }
    protected IAAdSpot(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "activeUnitController")
    public native IAUnitController getActiveUnitController();
    @Property(selector = "model")
    public native IAAdModel getModel();
    @Property(selector = "adRequest")
    public native IAAdRequest getAdRequest();
    @Property(selector = "setAdRequest:")
    public native void setAdRequest(IAAdRequest v);
    /**
     * @deprecated In current version setting this property set corresponding value also for IASDKCore.sharedInstance. In the next SDK version this property will be removed. Please use 'mediationType' property of IASDKCore instance instead.
     */
    @Deprecated
    @Property(selector = "mediationType")
    public native IAMediation getMediationType();
    /**
     * @deprecated In current version setting this property set corresponding value also for IASDKCore.sharedInstance. In the next SDK version this property will be removed. Please use 'mediationType' property of IASDKCore instance instead.
     */
    @Deprecated
    @Property(selector = "setMediationType:")
    public native void setMediationType(IAMediation v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "fetchAdWithCompletion:")
    public native void fetchAd(@Block VoidBlock3<IAAdSpot, IAAdModel, NSError> completionHandler);
    @Method(selector = "loadAdWithMarkup:withCompletion:")
    public native void loadAd(String admString, @Block VoidBlock3<IAAdSpot, IAAdModel, NSError> completionHandler);
    @Method(selector = "setAdRefreshCompletion:")
    public native void setAdRefreshCompletion(@Block VoidBlock3<IAAdSpot, IAAdModel, NSError> completionHandler);
    @Method(selector = "refreshAd")
    public native void refreshAd();
    @Method(selector = "build:")
    public static native IAAdSpot build(@Block VoidBlock1<IAAdSpotBuilder> buildBlock);
    @Method(selector = "addSupportedUnitController:")
    public native void addSupportedUnitController(IAUnitController supportedUnitController);
    /*</methods>*/
}
