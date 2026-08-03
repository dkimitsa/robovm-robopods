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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/RCTargetingContext/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class RCTargetingContextPtr extends Ptr<RCTargetingContext, RCTargetingContextPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(RCTargetingContext.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected RCTargetingContext() {}
    protected RCTargetingContext(Handle h, long handle) { super(h, handle); }
    protected RCTargetingContext(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithRevision:ruleId:")
    public RCTargetingContext(@MachineSizedSInt long revision, String ruleId) { super((SkipInit) null); initObject(init(revision, ruleId)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "revision")
    public native @MachineSizedSInt long getRevision();
    @Property(selector = "ruleId")
    public native String getRuleId();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithRevision:ruleId:")
    protected native @Pointer long init(@MachineSizedSInt long revision, String ruleId);
    /*</methods>*/
}
