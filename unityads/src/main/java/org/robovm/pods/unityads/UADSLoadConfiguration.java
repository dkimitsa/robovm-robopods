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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("UnityAds.UADSLoadConfiguration")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UADSLoadConfiguration/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class UADSLoadConfigurationPtr extends Ptr<UADSLoadConfiguration, UADSLoadConfigurationPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UADSLoadConfiguration.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected UADSLoadConfiguration() {}
    protected UADSLoadConfiguration(Handle h, long handle) { super(h, handle); }
    protected UADSLoadConfiguration(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "placementId")
    public native String getPlacementId();
    @Property(selector = "adMarkup")
    public native String getAdMarkup();
    @Property(selector = "mediationAdUnitId")
    public native String getMediationAdUnitId();
    @Property(selector = "mediationInfo")
    public native UADSMediationInfo getMediationInfo();
    @Property(selector = "extras")
    public native NSDictionary<NSString, NSString> getExtras();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
