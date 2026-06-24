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
package org.robovm.pods.adjustsdk;

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
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/AdjustDelegate/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "adjustAttributionChanged:")
    void adjustAttributionChanged(ADJAttribution attribution);
    @Method(selector = "adjustThirdPartySharingSettingsChanged:")
    void adjustThirdPartySharingSettingsChanged(ADJThirdPartySharingResult thirdPartySharingResult);
    @Method(selector = "adjustEventTrackingSucceeded:")
    void adjustEventTrackingSucceeded(ADJEventSuccess eventSuccessResponse);
    @Method(selector = "adjustEventTrackingFailed:")
    void adjustEventTrackingFailed(ADJEventFailure eventFailureResponse);
    @Method(selector = "adjustSessionTrackingSucceeded:")
    void adjustSessionTrackingSucceeded(ADJSessionSuccess sessionSuccessResponse);
    @Method(selector = "adjustSessionTrackingFailed:")
    void adjustSessionTrackingFailed(ADJSessionFailure sessionFailureResponse);
    @Method(selector = "adjustDeferredDeeplinkReceived:")
    boolean adjustDeferredDeeplinkReceived(NSURL deeplink);
    @Method(selector = "adjustSkanUpdatedWithConversionData:")
    void adjustSkanUpdated(NSDictionary<NSString, NSString> data);
    @Method(selector = "adjustRemoteTriggerReceived:")
    void adjustRemoteTriggerReceived(ADJRemoteTrigger remoteTrigger);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
