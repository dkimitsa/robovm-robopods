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
package org.robovm.pods.revenuecat;

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
import org.robovm.apple.storekit.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/RCRevocationReason/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class RCRevocationReasonPtr extends Ptr<RCRevocationReason, RCRevocationReasonPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(RCRevocationReason.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected RCRevocationReason() {}
    protected RCRevocationReason(Handle h, long handle) { super(h, handle); }
    protected RCRevocationReason(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithRawValue:")
    public RCRevocationReason(String rawValue) { super((SkipInit) null); initObject(init(rawValue)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "rawValue")
    public native String getRawValue();
    @Property(selector = "hash")
    public native @MachineSizedUInt long getHash();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithRawValue:")
    protected native @Pointer long init(String rawValue);
    @Method(selector = "isEqual:")
    public native boolean isEqual(NSObject object);
    @Method(selector = "RCDeveloperIssue")
    public static native RCRevocationReason RCDeveloperIssue();
    @Method(selector = "RCOther")
    public static native RCRevocationReason RCOther();
    /*</methods>*/
}
