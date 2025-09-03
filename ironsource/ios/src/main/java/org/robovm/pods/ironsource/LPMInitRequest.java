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

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/LPMInitRequest/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class LPMInitRequestPtr extends Ptr<LPMInitRequest, LPMInitRequestPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(LPMInitRequest.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected LPMInitRequest() {}
    protected LPMInitRequest(Handle h, long handle) { super(h, handle); }
    protected LPMInitRequest(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithAppKey:userId:")
    public LPMInitRequest(String appKey, String userId) { super((SkipInit) null); initObject(init(appKey, userId)); }
    /**
     * @deprecated This method is deprecated and will be removed in version 9.0.0.
     */
    @Deprecated
    @Method(selector = "initWithAppKey:legacyAdFormats:userId:")
    public LPMInitRequest(String appKey, NSArray<NSString> legacyAdFormats, String userId) { super((SkipInit) null); initObject(init(appKey, legacyAdFormats, userId)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "appKey")
    public native String getAppKey();
    /**
     * @deprecated This parameter will be removed in version 9.0.0.
     */
    @Deprecated
    @Property(selector = "legacyAdFormats")
    public native NSArray<NSString> getLegacyAdFormats();
    @Property(selector = "userId")
    public native String getUserId();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithAppKey:userId:")
    protected native @Pointer long init(String appKey, String userId);
    /**
     * @deprecated This method is deprecated and will be removed in version 9.0.0.
     */
    @Deprecated
    @Method(selector = "initWithAppKey:legacyAdFormats:userId:")
    protected native @Pointer long init(String appKey, NSArray<NSString> legacyAdFormats, String userId);
    /*</methods>*/
}
