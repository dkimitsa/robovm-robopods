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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/RCMediatorName/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class RCMediatorNamePtr extends Ptr<RCMediatorName, RCMediatorNamePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(RCMediatorName.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected RCMediatorName() {}
    protected RCMediatorName(Handle h, long handle) { super(h, handle); }
    protected RCMediatorName(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithRawValue:")
    public RCMediatorName(String rawValue) { super((SkipInit) null); initObject(init(rawValue)); }
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
    @Method(selector = "adMob")
    public static native RCMediatorName adMob();
    @Method(selector = "appLovin")
    public static native RCMediatorName appLovin();
    /*</methods>*/
}
