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
package org.robovm.pods.inmobi.sdk;

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
import org.robovm.apple.corelocation.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("InMobiSDK.IMSKANEventModel")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/IMSKANEventModel/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class IMSKANEventModelPtr extends Ptr<IMSKANEventModel, IMSKANEventModelPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(IMSKANEventModel.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected IMSKANEventModel() {}
    protected IMSKANEventModel(Handle h, long handle) { super(h, handle); }
    protected IMSKANEventModel(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithSource:")
    public IMSKANEventModel(IMSKANSourceName source) { super((SkipInit) null); initObject(initWithSource$(source)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "source")
    public native IMSKANSourceName getSource();
    @Property(selector = "setSource:")
    public native void setSource(IMSKANSourceName v);
    @Property(selector = "url")
    public native String getUrl();
    @Property(selector = "setUrl:")
    public native void setUrl(String v);
    @Property(selector = "status")
    public native String getStatus();
    @Property(selector = "setStatus:")
    public native void setStatus(String v);
    @Property(selector = "skstoreid")
    public native String getSkstoreid();
    @Property(selector = "setSkstoreid:")
    public native void setSkstoreid(String v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithSource:")
    protected native @Pointer long initWithSource$(IMSKANSourceName source);
    @Method(selector = "setCallbackStatus:")
    public native void setCallbackStatus(String status);
    @Method(selector = "setCallbackSkstoreid:")
    public native void setCallbackSkstoreid(String id);
    @Method(selector = "setCallbackurl:")
    public native void setCallbackurl(String url);
    @Method(selector = "toCallbackDictionary")
    public native NSDictionary<NSString, ?> toCallbackDictionary();
    /*</methods>*/
}
