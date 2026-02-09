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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/OSOutcomeEventParams/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class OSOutcomeEventParamsPtr extends Ptr<OSOutcomeEventParams, OSOutcomeEventParamsPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(OSOutcomeEventParams.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public OSOutcomeEventParams() {}
    protected OSOutcomeEventParams(Handle h, long handle) { super(h, handle); }
    protected OSOutcomeEventParams(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithOutcomeId:outcomeSource:weight:timestamp:")
    public OSOutcomeEventParams(String outcomeId, OSOutcomeSource outcomeSource, NSNumber weight, NSNumber timestamp) { super((SkipInit) null); initObject(init(outcomeId, outcomeSource, weight, timestamp)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "outcomeId")
    public native String getOutcomeId();
    @Property(selector = "setOutcomeId:")
    public native void setOutcomeId(String v);
    @Property(selector = "outcomeSource")
    public native OSOutcomeSource getOutcomeSource();
    @Property(selector = "setOutcomeSource:")
    public native void setOutcomeSource(OSOutcomeSource v);
    @Property(selector = "weight")
    public native NSNumber getWeight();
    @Property(selector = "setWeight:")
    public native void setWeight(NSNumber v);
    @Property(selector = "timestamp")
    public native NSNumber getTimestamp();
    @Property(selector = "setTimestamp:")
    public native void setTimestamp(NSNumber v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithOutcomeId:outcomeSource:weight:timestamp:")
    protected native @Pointer long init(String outcomeId, OSOutcomeSource outcomeSource, NSNumber weight, NSNumber timestamp);
    @Method(selector = "toDictionaryObject")
    public native NSDictionary<?, ?> toDictionaryObject();
    /*</methods>*/
}
