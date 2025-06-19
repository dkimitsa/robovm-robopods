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
package org.robovm.pods.facebook.audience;

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
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.dispatch.*;
import org.robovm.apple.coremedia.*;
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.storekit.*;
import org.robovm.apple.avfoundation.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FBAudienceNetworkAds/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class FBAudienceNetworkAdsPtr extends Ptr<FBAudienceNetworkAds, FBAudienceNetworkAdsPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FBAudienceNetworkAds.class); }/*</bind>*/
    /*<constants>*/
    public static final String getVersion = "6.20.0";
    /*</constants>*/
    /*<constructors>*/
    public FBAudienceNetworkAds() {}
    protected FBAudienceNetworkAds(Handle h, long handle) { super(h, handle); }
    protected FBAudienceNetworkAds(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @GlobalValue(symbol="FBAudienceNetworkErrorDomain", optional=true)
    public static native String getErrorDomain();
    
    @Method(selector = "initializeWithSettings:completionHandler:")
    public static native void initialize(FBAdInitSettings settings, @Block VoidBlock1<FBAdInitResults> completionHandler);
    @Method(selector = "handleDeeplink:")
    public static native void handleDeeplink(NSURL deeplink);
    /*</methods>*/
}
