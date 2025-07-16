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
package org.robovm.pods.google.mobileads;

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
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.storekit.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.webkit.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GADResponseInfo/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class GADResponseInfoPtr extends Ptr<GADResponseInfo, GADResponseInfoPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GADResponseInfo.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public GADResponseInfo() {}
    protected GADResponseInfo(Handle h, long handle) { super(h, handle); }
    protected GADResponseInfo(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "responseIdentifier")
    public native String getResponseIdentifier();
    @Property(selector = "extrasDictionary")
    public native NSDictionary<NSString, ?> getExtrasDictionary();
    @Property(selector = "loadedAdNetworkResponseInfo")
    public native GADAdNetworkResponseInfo getLoadedAdNetworkResponseInfo();
    @Property(selector = "adNetworkInfoArray")
    public native NSArray<GADAdNetworkResponseInfo> getAdNetworkInfoArray();
    @Property(selector = "dictionaryRepresentation")
    public native NSDictionary<NSString, ?> getDictionaryRepresentation();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @GlobalValue(symbol="GADGoogleAdNetworkClassName", optional=true)
    public static native String GoogleAdNetworkClassName();
    @GlobalValue(symbol="GADCustomEventAdNetworkClassName", optional=true)
    public static native String CustomEventAdNetworkClassName();
    @GlobalValue(symbol="GADErrorUserInfoKeyResponseInfo", optional=true)
    public static native String getErrorUserInfoKey();
    
    
    /*</methods>*/
}
