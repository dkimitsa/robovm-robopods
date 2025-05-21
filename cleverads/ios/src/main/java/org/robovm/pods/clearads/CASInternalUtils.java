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
import org.robovm.apple.corelocation.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CASInternalUtils/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CASInternalUtilsPtr extends Ptr<CASInternalUtils, CASInternalUtilsPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CASInternalUtils.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public CASInternalUtils() {}
    protected CASInternalUtils(Handle h, long handle) { super(h, handle); }
    protected CASInternalUtils(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "adId")
    public static native String getAdId();
    @Property(selector = "isAdTrackingEnabled")
    public static native boolean isAdTrackingEnabled();
    @Property(selector = "isAdTrackingNotDetermined")
    public static native boolean isAdTrackingNotDetermined();
    @Property(selector = "adTrackingStatus")
    public static native @MachineSizedUInt long getAdTrackingStatus();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "trackingAuthorizationRequest:")
    public static native void trackingAuthorizationRequest(@Block("(@MachineSizedUInt)") VoidBlock1<Long> completion);
    /*</methods>*/
}
