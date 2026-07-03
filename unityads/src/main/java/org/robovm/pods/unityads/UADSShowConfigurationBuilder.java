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
package org.robovm.pods.unityads;

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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("UnityAds.UADSShowConfigurationBuilder")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UADSShowConfigurationBuilder/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class UADSShowConfigurationBuilderPtr extends Ptr<UADSShowConfigurationBuilder, UADSShowConfigurationBuilderPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UADSShowConfigurationBuilder.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public UADSShowConfigurationBuilder() {}
    protected UADSShowConfigurationBuilder(Handle h, long handle) { super(h, handle); }
    protected UADSShowConfigurationBuilder(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "withViewController:")
    public native UADSShowConfigurationBuilder withViewController(UIViewController viewController);
    @Method(selector = "withCustomRewardString:")
    public native UADSShowConfigurationBuilder withCustomRewardString(String customRewardString);
    @Method(selector = "withExtras:")
    public native UADSShowConfigurationBuilder withExtras(NSDictionary<NSString, NSString> extras);
    @Method(selector = "build")
    public native UADSShowConfiguration build();
    /*</methods>*/
}
