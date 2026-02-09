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
package org.robovm.pods.ironsource;

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
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/ISAdapterAdDelegate/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "adDidLoad")
    void adDidLoad();
    @Method(selector = "adDidLoadWithExtraData:")
    void adDidLoad(NSDictionary<NSString, ?> extraData);
    @Method(selector = "adDidFailToLoadWithErrorType:errorCode:errorMessage:")
    void adDidFailToLoad(ISAdapterErrorType errorType, @MachineSizedSInt long errorCode, String errorMessage);
    @Method(selector = "adDidFailToLoadWithErrorType:errorCode:errorMessage:extraData:")
    void adDidFailToLoad(ISAdapterErrorType errorType, @MachineSizedSInt long errorCode, String errorMessage, NSDictionary<NSString, ?> extraData);
    @Method(selector = "adDidOpen")
    void adDidOpen();
    @Method(selector = "adDidOpenWithExtraData:")
    void adDidOpen(NSDictionary<NSString, ?> extraData);
    @Method(selector = "adDidFailToShowWithErrorCode:errorMessage:")
    void adDidFailToShow(@MachineSizedSInt long errorCode, String errorMessage);
    @Method(selector = "adDidFailToShowWithErrorCode:errorMessage:extraData:")
    void adDidFailToShow(@MachineSizedSInt long errorCode, String errorMessage, NSDictionary<NSString, ?> extraData);
    @Method(selector = "adDidClick")
    void adDidClick();
    @Method(selector = "adDidClickWithExtraData:")
    void adDidClick(NSDictionary<NSString, ?> extraData);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
