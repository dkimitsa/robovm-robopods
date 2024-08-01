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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GADBannerSignalRequest/*</name>*/ 
    extends /*<extends>*/GADSignalRequest/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class GADBannerSignalRequestPtr extends Ptr<GADBannerSignalRequest, GADBannerSignalRequestPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GADBannerSignalRequest.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected GADBannerSignalRequest() {}
    protected GADBannerSignalRequest(Handle h, long handle) { super(h, handle); }
    protected GADBannerSignalRequest(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithSignalType:")
    public GADBannerSignalRequest(String signalType) { super((SkipInit) null); initObject(init(signalType)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "enableManualImpressions")
    public native boolean isEnableManualImpressions();
    @Property(selector = "setEnableManualImpressions:")
    public native void setEnableManualImpressions(boolean v);
    @Property(selector = "adSize")
    public native @ByVal GADAdSize getAdSize();
    @Property(selector = "setAdSize:")
    public native void setAdSize(@ByVal GADAdSize v);
    @Property(selector = "adSizes")
    public native NSArray<NSValue> getAdSizes();
    @Property(selector = "setAdSizes:")
    public native void setAdSizes(NSArray<NSValue> v);
    @Property(selector = "videoOptions")
    public native GADVideoOptions getVideoOptions();
    @Property(selector = "setVideoOptions:")
    public native void setVideoOptions(GADVideoOptions v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithSignalType:")
    protected native @Pointer long init(String signalType);
    /*</methods>*/
}
