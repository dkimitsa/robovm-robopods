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
package org.robovm.pods.adjustsdk;

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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ADJThirdPartySharing/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class ADJThirdPartySharingPtr extends Ptr<ADJThirdPartySharing, ADJThirdPartySharingPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ADJThirdPartySharing.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public ADJThirdPartySharing() {}
    protected ADJThirdPartySharing(Handle h, long handle) { super(h, handle); }
    protected ADJThirdPartySharing(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithIsEnabled:")
    public ADJThirdPartySharing(NSNumber isEnabled) { super((SkipInit) null); initObject(init(isEnabled)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "enabled")
    public native NSNumber getEnabled();
    @Property(selector = "granularOptions")
    public native NSMutableDictionary<?, ?> getGranularOptions();
    @Property(selector = "partnerSharingSettings")
    public native NSMutableDictionary<?, ?> getPartnerSharingSettings();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithIsEnabled:")
    protected native @Pointer long init(NSNumber isEnabled);
    @Method(selector = "addGranularOption:key:value:")
    public native void addGranularOption(String partnerName, String key, String value);
    @Method(selector = "addPartnerSharingSetting:key:value:")
    public native void addPartnerSharingSetting(String partnerName, String key, boolean value);
    /*</methods>*/
}
