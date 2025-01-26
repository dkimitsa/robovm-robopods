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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("InMobiSDK.SignalConfig")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/SignalConfig/*</name>*/ 
    extends /*<extends>*/IMConfigBase/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class SignalConfigPtr extends Ptr<SignalConfig, SignalConfigPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(SignalConfig.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public SignalConfig() {}
    protected SignalConfig(Handle h, long handle) { super(h, handle); }
    protected SignalConfig(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "kA")
    public native String getKA();
    @Property(selector = "setKA:")
    public native void setKA(String v);
    @Property(selector = "bloomFilterServiceConfig")
    public native BloomFilterServiceConfig getBloomFilterServiceConfig();
    @Property(selector = "setBloomFilterServiceConfig:")
    public native void setBloomFilterServiceConfig(BloomFilterServiceConfig v);
    @Property(selector = "ext")
    public native AnyDictionary getExt();
    @Property(selector = "setExt:")
    public native void setExt(AnyDictionary v);
    @Property(selector = "session")
    public native SessionConfig getSession();
    @Property(selector = "setSession:")
    public native void setSession(SessionConfig v);
    @Property(selector = "unifiedIdServiceConfig")
    public native UnifiedIdServiceConfig getUnifiedIdServiceConfig();
    @Property(selector = "setUnifiedIdServiceConfig:")
    public native void setUnifiedIdServiceConfig(UnifiedIdServiceConfig v);
    @Property(selector = "includeIds")
    public native IMIncludeIds getIncludeIds();
    @Property(selector = "setIncludeIds:")
    public native void setIncludeIds(IMIncludeIds v);
    @Property(selector = "novatiqConfig")
    public native NovatiqConfig getNovatiqConfig();
    @Property(selector = "setNovatiqConfig:")
    public native void setNovatiqConfig(NovatiqConfig v);
    @Property(selector = "vAK")
    public native @MachineSizedSInt long getVAK();
    @Property(selector = "setVAK:")
    public native void setVAK(@MachineSizedSInt long v);
    @Property(selector = "ice")
    public native IceConfig getIce();
    @Property(selector = "setIce:")
    public native void setIce(IceConfig v);
    @Property(selector = "purchases")
    public native PurchasesConfig getPurchases();
    @Property(selector = "setPurchases:")
    public native void setPurchases(PurchasesConfig v);
    @Property(selector = "publisher")
    public native PublisherConfig getPublisher();
    @Property(selector = "setPublisher:")
    public native void setPublisher(PublisherConfig v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "getType")
    public native String getType();
    @Method(selector = "toDictionary")
    public native NSDictionary<NSString, ?> toDictionary();
    /*</methods>*/
}
