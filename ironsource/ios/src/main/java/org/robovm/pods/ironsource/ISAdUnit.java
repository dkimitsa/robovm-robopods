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
package org.robovm.pods.ironsource;

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
/**
 * @deprecated This class is deprecated and will be removed in version 9.0.0.
 */
/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass @Deprecated/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ISAdUnit/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class ISAdUnitPtr extends Ptr<ISAdUnit, ISAdUnitPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ISAdUnit.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public ISAdUnit() {}
    protected ISAdUnit(Handle h, long handle) { super(h, handle); }
    protected ISAdUnit(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithValue:")
    public ISAdUnit(String value) { super((SkipInit) null); initObject(init(value)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "value")
    public native String getValue();
    @Property(selector = "setValue:")
    public native void setValue(String v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithValue:")
    protected native @Pointer long init(String value);
    @Method(selector = "IS_AD_UNIT_REWARDED_VIDEO")
    public static native ISAdUnit IS_AD_UNIT_REWARDED_VIDEO();
    @Method(selector = "IS_AD_UNIT_INTERSTITIAL")
    public static native ISAdUnit IS_AD_UNIT_INTERSTITIAL();
    @Method(selector = "IS_AD_UNIT_BANNER")
    public static native ISAdUnit IS_AD_UNIT_BANNER();
    @Method(selector = "IS_AD_UNIT_NATIVE_AD")
    public static native ISAdUnit IS_AD_UNIT_NATIVE_AD();
    /*</methods>*/
}
