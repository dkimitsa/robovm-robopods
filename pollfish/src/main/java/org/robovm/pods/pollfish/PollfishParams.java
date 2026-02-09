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
package org.robovm.pods.pollfish;

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
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("_TtC8Pollfish14PollfishParams")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/PollfishParams/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class PollfishParamsPtr extends Ptr<PollfishParams, PollfishParamsPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(PollfishParams.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected PollfishParams() {}
    protected PollfishParams(Handle h, long handle) { super(h, handle); }
    protected PollfishParams(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "init:")
    public PollfishParams(String apiKey) { super((SkipInit) null); initObject(init(apiKey)); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "init:")
    protected native @Pointer long init(String apiKey);
    @Method(selector = "rewardMode:")
    public native PollfishParams rewardMode(boolean rewardMode);
    @Method(selector = "releaseMode:")
    public native PollfishParams releaseMode(boolean releaseMode);
    @Method(selector = "offerwallMode:")
    public native PollfishParams offerwallMode(boolean offerwallMode);
    @Method(selector = "requestUUID:")
    public native PollfishParams requestUUID(String requestUUID);
    @Method(selector = "surveyFormat:")
    public native PollfishParams surveyFormat(SurveyFormat surveyFormat);
    @Method(selector = "userProperties:")
    public native PollfishParams userProperties(UserProperties userProperties);
    @Method(selector = "indicatorPosition:")
    public native PollfishParams indicatorPosition(IndicatorPosition indicatorPosition);
    @Method(selector = "indicatorPadding:")
    public native PollfishParams indicatorPadding(@MachineSizedSInt long indicatorPadding);
    @Method(selector = "viewContainer:")
    public native PollfishParams viewContainer(UIView viewContainer);
    @Method(selector = "rewardInfo:")
    public native PollfishParams rewardInfo(RewardInfo rewardInfo);
    @Method(selector = "signature:")
    public native PollfishParams signature(String signature);
    @Method(selector = "clickId:")
    public native PollfishParams clickId(String clickId);
    @Method(selector = "userId:")
    public native PollfishParams userId(String userId);
    @Method(selector = "platform:")
    public native PollfishParams platform(Platform platform);
    @Method(selector = "monitorOrientationChanges:")
    public native PollfishParams monitorOrientationChanges(boolean monitorOrientationChanges);
    @Method(selector = "placementId:")
    public native PollfishParams placementId(String placementId);
    /*</methods>*/
}
