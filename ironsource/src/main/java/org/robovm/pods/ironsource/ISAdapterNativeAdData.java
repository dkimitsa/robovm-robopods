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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ISAdapterNativeAdData/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements ISNativeAdDataProtocol/*</implements>*/ {

    /*<ptr>*/public static class ISAdapterNativeAdDataPtr extends Ptr<ISAdapterNativeAdData, ISAdapterNativeAdDataPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ISAdapterNativeAdData.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public ISAdapterNativeAdData() {}
    protected ISAdapterNativeAdData(Handle h, long handle) { super(h, handle); }
    protected ISAdapterNativeAdData(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "title")
    public native String getTitle();
    @Property(selector = "setTitle:")
    public native void setTitle(String v);
    @Property(selector = "advertiser")
    public native String getAdvertiser();
    @Property(selector = "setAdvertiser:")
    public native void setAdvertiser(String v);
    @Property(selector = "body")
    public native String getBody();
    @Property(selector = "setBody:")
    public native void setBody(String v);
    @Property(selector = "callToAction")
    public native String getCallToAction();
    @Property(selector = "setCallToAction:")
    public native void setCallToAction(String v);
    @Property(selector = "icon")
    public native ISNativeAdDataImage getIcon();
    @Property(selector = "setIcon:")
    public native void setIcon(ISNativeAdDataImage v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
