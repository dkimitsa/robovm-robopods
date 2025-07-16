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
package org.robovm.pods.google.mobileads.mediation.testsuite;

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
import org.robovm.pods.google.mobileads.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GoogleMobileAdsMediationTestSuite/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class GoogleMobileAdsMediationTestSuitePtr extends Ptr<GoogleMobileAdsMediationTestSuite, GoogleMobileAdsMediationTestSuitePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GoogleMobileAdsMediationTestSuite.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public GoogleMobileAdsMediationTestSuite() {}
    protected GoogleMobileAdsMediationTestSuite(Handle h, long handle) { super(h, handle); }
    protected GoogleMobileAdsMediationTestSuite(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "presentOnViewController:delegate:")
    public static native void present(UIViewController controller, GMTSMediationTestSuiteDelegate delegate);
    @Method(selector = "presentForAdManagerOnViewController:delegate:")
    public static native void presentForAdManager(UIViewController controller, GMTSMediationTestSuiteDelegate delegate);
    /**
     * @deprecated Use presentOnViewController:delegate: instead.
     */
    @Deprecated
    @Method(selector = "presentWithAppID:onViewController:delegate:")
    public static native void present(String appID, UIViewController controller, GMTSMediationTestSuiteDelegate delegate);
    @Method(selector = "setAdRequest:")
    public static native void setAdRequest(GADRequest adRequest);
    /*</methods>*/
}
