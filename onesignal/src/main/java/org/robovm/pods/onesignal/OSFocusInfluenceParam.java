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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/OSFocusInfluenceParam/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class OSFocusInfluenceParamPtr extends Ptr<OSFocusInfluenceParam, OSFocusInfluenceParamPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(OSFocusInfluenceParam.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public OSFocusInfluenceParam() {}
    protected OSFocusInfluenceParam(Handle h, long handle) { super(h, handle); }
    protected OSFocusInfluenceParam(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithParamsInfluenceIds:influenceKey:directInfluence:influenceDirectKey:")
    public OSFocusInfluenceParam(NSArray<NSString> influenceIds, String influenceKey, boolean directInfluence, String influenceDirectKey) { super((SkipInit) null); initObject(init(influenceIds, influenceKey, directInfluence, influenceDirectKey)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "influenceKey")
    public native String getInfluenceKey();
    @Property(selector = "influenceIds")
    public native NSArray<NSString> getInfluenceIds();
    @Property(selector = "influenceDirectKey")
    public native String getInfluenceDirectKey();
    @Property(selector = "directInfluence")
    public native boolean isDirectInfluence();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithParamsInfluenceIds:influenceKey:directInfluence:influenceDirectKey:")
    protected native @Pointer long init(NSArray<NSString> influenceIds, String influenceKey, boolean directInfluence, String influenceDirectKey);
    /*</methods>*/
}
