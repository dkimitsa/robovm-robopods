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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("InMobiSDK.VastVideoConfig")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/VastVideoConfig/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class VastVideoConfigPtr extends Ptr<VastVideoConfig, VastVideoConfigPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(VastVideoConfig.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public VastVideoConfig() {}
    protected VastVideoConfig(Handle h, long handle) { super(h, handle); }
    protected VastVideoConfig(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "optimalVastVideoSize")
    public native @MachineSizedSInt long getOptimalVastVideoSize();
    @Property(selector = "setOptimalVastVideoSize:")
    public native void setOptimalVastVideoSize(@MachineSizedSInt long v);
    @Property(selector = "maxWrapperLimit")
    public native @MachineSizedSInt long getMaxWrapperLimit();
    @Property(selector = "setMaxWrapperLimit:")
    public native void setMaxWrapperLimit(@MachineSizedSInt long v);
    @Property(selector = "vastMaxAssetSize")
    public native @MachineSizedSInt long getVastMaxAssetSize();
    @Property(selector = "setVastMaxAssetSize:")
    public native void setVastMaxAssetSize(@MachineSizedSInt long v);
    @Property(selector = "bitRate")
    public native BitRateConfig getBitRate();
    @Property(selector = "setBitRate:")
    public native void setBitRate(BitRateConfig v);
    @Property(selector = "allowedContentType")
    public native NSArray<NSString> getAllowedContentType();
    @Property(selector = "setAllowedContentType:")
    public native void setAllowedContentType(NSArray<NSString> v);
    @Property(selector = "allowedCompanionType")
    public native NSArray<NSString> getAllowedCompanionType();
    @Property(selector = "setAllowedCompanionType:")
    public native void setAllowedCompanionType(NSArray<NSString> v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
