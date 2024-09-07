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
package org.robovm.pods.clearads;

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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CAS/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CASPtr extends Ptr<CAS, CASPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CAS.class); }/*</bind>*/
    /*<constants>*/
    public static final String FRAMEWORK_VERSION = "3.9.3";
    public static final int FRAMEWORK_CODE = 3903;
    /*</constants>*/
    /*<constructors>*/
    public CAS() {}
    protected CAS(Handle h, long handle) { super(h, handle); }
    protected CAS(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "settings")
    public static native CASSettings settings();
    @Method(selector = "targetingOptions")
    public static native CASTargetingOptions targetingOptions();
    @Method(selector = "manager")
    public static native CASMediationManager manager();
    @Method(selector = "setManager:")
    public static native void setManager(CASMediationManager value);
    @Method(selector = "buildManager")
    public static native CASManagerBuilder buildManager();
    @Method(selector = "getSDKVersion")
    public static native String getSDKVersion();
    @Method(selector = "validateIntegration")
    public static native void validateIntegration();
    @Method(selector = "getMessageOf:")
    public static native String getMessageOf(CASError error);
    @Method(selector = "getErrorFor:")
    public static native CASError getErrorFor(String message);
    /*</methods>*/
}
