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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("InMobiSDK.TimeoutsConfig")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/TimeoutsConfig/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class TimeoutsConfigPtr extends Ptr<TimeoutsConfig, TimeoutsConfigPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(TimeoutsConfig.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public TimeoutsConfig() {}
    protected TimeoutsConfig(Handle h, long handle) { super(h, handle); }
    protected TimeoutsConfig(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "step2u")
    public native @MachineSizedSInt long getStep2u();
    @Property(selector = "setStep2u:")
    public native void setStep2u(@MachineSizedSInt long v);
    @Property(selector = "bitmap")
    public native @MachineSizedSInt long getBitmap();
    @Property(selector = "setBitmap:")
    public native void setBitmap(@MachineSizedSInt long v);
    @Property(selector = "step1b")
    public native @MachineSizedSInt long getStep1b();
    @Property(selector = "setStep1b:")
    public native void setStep1b(@MachineSizedSInt long v);
    @Property(selector = "step4s")
    public native @MachineSizedSInt long getStep4s();
    @Property(selector = "setStep4s:")
    public native void setStep4s(@MachineSizedSInt long v);
    @Property(selector = "request")
    public native @MachineSizedSInt long getRequest();
    @Property(selector = "setRequest:")
    public native void setRequest(@MachineSizedSInt long v);
    @Property(selector = "mediationConfig")
    public native MediationConfig getMediationConfig();
    @Property(selector = "setMediationConfig:")
    public native void setMediationConfig(MediationConfig v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
