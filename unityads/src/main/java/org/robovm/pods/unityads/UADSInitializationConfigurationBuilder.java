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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UADSInitializationConfigurationBuilder/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class UADSInitializationConfigurationBuilderPtr extends Ptr<UADSInitializationConfigurationBuilder, UADSInitializationConfigurationBuilderPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UADSInitializationConfigurationBuilder.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected UADSInitializationConfigurationBuilder() {}
    protected UADSInitializationConfigurationBuilder(Handle h, long handle) { super(h, handle); }
    protected UADSInitializationConfigurationBuilder(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithGameId:")
    public UADSInitializationConfigurationBuilder(String gameId) { super((SkipInit) null); initObject(init(gameId)); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithGameId:")
    protected native @Pointer long init(String gameId);
    @Method(selector = "withTestMode:")
    public native UADSInitializationConfigurationBuilder withTestMode(boolean testMode);
    @Method(selector = "withLogLevel:")
    public native UADSInitializationConfigurationBuilder withLogLevel(UADSLogLevel logLevel);
    @Method(selector = "withMediationInfo:")
    public native UADSInitializationConfigurationBuilder withMediationInfo(UADSMediationInfo mediationInfo);
    @Method(selector = "withExtras:")
    public native UADSInitializationConfigurationBuilder withExtras(NSDictionary<NSString, NSString> extras);
    @Method(selector = "build")
    public native UADSInitializationConfiguration build();
    /*</methods>*/
}
