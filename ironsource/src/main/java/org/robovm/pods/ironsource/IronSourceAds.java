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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/IronSourceAds/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class IronSourceAdsPtr extends Ptr<IronSourceAds, IronSourceAdsPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(IronSourceAds.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected IronSourceAds() {}
    protected IronSourceAds(Handle h, long handle) { super(h, handle); }
    protected IronSourceAds(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithRequest:completion:")
    public static native void init(ISAInitRequest request, @Block VoidBlock2<Boolean, NSError> completion);
    @Method(selector = "sdkVersion")
    public static native String sdkVersion();
    @Method(selector = "enableDebugMode:")
    public static native void enableDebugMode(boolean enable);
    @Method(selector = "setMetaDataWithKey:value:")
    public static native void setMetaData(String key, String value);
    @Method(selector = "setMetaDataWithKey:values:")
    public static native void setMetaData(String key, NSMutableArray<?> values);
    @Method(selector = "setConsent:")
    public static native void setConsent(boolean consent);
    /*</methods>*/
}
