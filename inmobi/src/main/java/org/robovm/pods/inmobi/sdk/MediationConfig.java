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
package org.robovm.pods.inmobi.sdk;

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
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("InMobiSDK.MediationConfig")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MediationConfig/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MediationConfigPtr extends Ptr<MediationConfig, MediationConfigPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MediationConfig.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MediationConfig() {}
    protected MediationConfig(Handle h, long handle) { super(h, handle); }
    protected MediationConfig(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "ab")
    public native MediationFlowTypeConfig getAb();
    @Property(selector = "setAb:")
    public native void setAb(MediationFlowTypeConfig v);
    @Property(selector = "nonAb")
    public native MediationFlowTypeConfig getNonAb();
    @Property(selector = "setNonAb:")
    public native void setNonAb(MediationFlowTypeConfig v);
    @Property(selector = "preload")
    public native MediationFlowTypeConfig getPreload();
    @Property(selector = "setPreload:")
    public native void setPreload(MediationFlowTypeConfig v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
