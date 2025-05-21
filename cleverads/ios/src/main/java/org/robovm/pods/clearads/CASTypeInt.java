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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("CleverAdsSolutions.CASTypeInt")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CASTypeInt/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CASTypeIntPtr extends Ptr<CASTypeInt, CASTypeIntPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CASTypeInt.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public CASTypeInt() {}
    protected CASTypeInt(Handle h, long handle) { super(h, handle); }
    protected CASTypeInt(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "none")
    public static native @MachineSizedUInt long none();
    @Method(selector = "banner")
    public static native @MachineSizedUInt long banner();
    @Method(selector = "interstitial")
    public static native @MachineSizedUInt long interstitial();
    @Method(selector = "rewarded")
    public static native @MachineSizedUInt long rewarded();
    @Method(selector = "native")
    public static native @MachineSizedUInt long typeNative();
    @Method(selector = "appOpen")
    public static native @MachineSizedUInt long appOpen();
    @Method(selector = "everything")
    public static native @MachineSizedUInt long everything();
    /*</methods>*/
}
