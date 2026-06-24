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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GADPreloadConfigurationV2/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class GADPreloadConfigurationV2Ptr extends Ptr<GADPreloadConfigurationV2, GADPreloadConfigurationV2Ptr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GADPreloadConfigurationV2.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public GADPreloadConfigurationV2() {}
    protected GADPreloadConfigurationV2(Handle h, long handle) { super(h, handle); }
    protected GADPreloadConfigurationV2(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithAdUnitID:request:")
    public GADPreloadConfigurationV2(String adUnitID, GADRequest request) { super((SkipInit) null); initObject(init(adUnitID, request)); }
    @Method(selector = "initWithAdUnitID:")
    public GADPreloadConfigurationV2(String adUnitID) { super((SkipInit) null); initObject(init(adUnitID)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "adUnitID")
    public native String getAdUnitID();
    @Property(selector = "request")
    public native GADRequest getRequest();
    @Property(selector = "bufferSize")
    public native @MachineSizedUInt long getBufferSize();
    @Property(selector = "setBufferSize:")
    public native void setBufferSize(@MachineSizedUInt long v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithAdUnitID:request:")
    protected native @Pointer long init(String adUnitID, GADRequest request);
    @Method(selector = "initWithAdUnitID:")
    protected native @Pointer long init(String adUnitID);
    /*</methods>*/
}
