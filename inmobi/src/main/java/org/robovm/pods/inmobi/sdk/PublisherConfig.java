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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("InMobiSDK.PublisherConfig")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/PublisherConfig/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class PublisherConfigPtr extends Ptr<PublisherConfig, PublisherConfigPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(PublisherConfig.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public PublisherConfig() {}
    protected PublisherConfig(Handle h, long handle) { super(h, handle); }
    protected PublisherConfig(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "generalKeys")
    public native AnyDictionary getGeneralKeys();
    @Property(selector = "setGeneralKeys:")
    public native void setGeneralKeys(AnyDictionary v);
    @Property(selector = "adSpecificKeys")
    public native AnyDictionary getAdSpecificKeys();
    @Property(selector = "setAdSpecificKeys:")
    public native void setAdSpecificKeys(AnyDictionary v);
    @Property(selector = "enableMCO")
    public native boolean isEnableMCO();
    @Property(selector = "setEnableMCO:")
    public native void setEnableMCO(boolean v);
    @Property(selector = "enableHB")
    public native boolean isEnableHB();
    @Property(selector = "setEnableHB:")
    public native void setEnableHB(boolean v);
    @Property(selector = "payloadSize")
    public native @MachineSizedSInt long getPayloadSize();
    @Property(selector = "setPayloadSize:")
    public native void setPayloadSize(@MachineSizedSInt long v);
    @Property(selector = "obj")
    public native IMPPSSignalConfig getObj();
    @Property(selector = "setObj:")
    public native void setObj(IMPPSSignalConfig v);
    @Property(selector = "auto")
    public native IMPPSSignalConfig getAuto_();
    @Property(selector = "setAuto:")
    public native void setAuto_(IMPPSSignalConfig v);
    @Property(selector = "direct")
    public native IMPPSSignalConfig getDirect();
    @Property(selector = "setDirect:")
    public native void setDirect(IMPPSSignalConfig v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
