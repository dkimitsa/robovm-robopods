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
package org.robovm.pods.onesignal;

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
import org.robovm.apple.usernotifications.*;
import org.robovm.apple.uikit.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("OneSignalOSCore.OSIamFetchReadyCondition")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/OSIamFetchReadyCondition/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements OSCondition/*</implements>*/ {

    /*<ptr>*/public static class OSIamFetchReadyConditionPtr extends Ptr<OSIamFetchReadyCondition, OSIamFetchReadyConditionPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(OSIamFetchReadyCondition.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected OSIamFetchReadyCondition() {}
    protected OSIamFetchReadyCondition(Handle h, long handle) { super(h, handle); }
    protected OSIamFetchReadyCondition(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "conditionId")
    public native String getConditionId();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "isMetWithIndexedTokens:")
    public native boolean isMet(NSDictionary<?, ?> indexedTokens);
    @Method(selector = "getNewestTokenWithIndexedTokens:")
    public native OSReadYourWriteData getNewestToken(NSDictionary<?, ?> indexedTokens);
    @Method(selector = "sharedInstanceWithId:")
    public static native OSIamFetchReadyCondition sharedInstance(String id);
    @Method(selector = "CONDITIONID")
    public static native String CONDITIONID();
    /*</methods>*/
}
