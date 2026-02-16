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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ISAdapterAdViewDelegateAdapter/*</name>*/ 
    extends /*<extends>*/ISAdapterAdDelegateAdapter/*</extends>*/ 
    /*<implements>*/implements ISAdapterAdViewDelegate/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @NotImplemented("adDidLoadWithView:")
    public void adDidLoad(UIView view) {}
    @NotImplemented("adDidLoadWithView:extraData:")
    public void adDidLoad(UIView view, NSDictionary<NSString, ?> extraData) {}
    @NotImplemented("adWillLeaveApplication")
    public void adWillLeaveApplication() {}
    @NotImplemented("adWillLeaveApplicationWithExtraData:")
    public void adWillLeaveApplication(NSDictionary<NSString, ?> extraData) {}
    @NotImplemented("adWillPresentScreen")
    public void adWillPresentScreen() {}
    @NotImplemented("adWillPresentScreenWithExtraData:")
    public void adWillPresentScreen(NSDictionary<NSString, ?> extraData) {}
    @NotImplemented("adDidDismissScreen")
    public void adDidDismissScreen() {}
    @NotImplemented("adDidDismissScreenWithExtraData:")
    public void adDidDismissScreen(NSDictionary<NSString, ?> extraData) {}
    /*</methods>*/
}
