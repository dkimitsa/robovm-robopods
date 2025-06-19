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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/LevelPlay/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class LevelPlayPtr extends Ptr<LevelPlay, LevelPlayPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(LevelPlay.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected LevelPlay() {}
    protected LevelPlay(Handle h, long handle) { super(h, handle); }
    protected LevelPlay(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithRequest:completion:")
    public static native void init(LPMInitRequest request, @Block VoidBlock2<LPMConfiguration, NSError> completion);
    @Method(selector = "sdkVersion")
    public static native String sdkVersion();
    @Method(selector = "addImpressionDataDelegate:")
    public static native void addImpressionDataDelegate(LPMImpressionDataDelegate delegate);
    @Method(selector = "removeImpressionDataDelegate:")
    public static native void removeImpressionDataDelegate(LPMImpressionDataDelegate delegate);
    @Method(selector = "setMetaDataWithKey:value:")
    public static native void setMetaData(String key, String value);
    @Method(selector = "setMetaDataWithKey:values:")
    public static native void setMetaData(String key, NSMutableArray<?> values);
    @Method(selector = "setNetworkDataWithNetworkKey:andNetworkData:")
    public static native void setNetworkData(String networkKey, NSDictionary<?, ?> networkData);
    @Method(selector = "setDynamicUserId:")
    public static native boolean setDynamicUserId(String dynamicUserId);
    @Method(selector = "setAdaptersDebug:")
    public static native void setAdaptersDebug(boolean flag);
    @Method(selector = "setSegment:")
    public static native void setSegment(LPMSegment segment);
    @Method(selector = "launchTestSuite:")
    public static native void launchTestSuite(UIViewController viewController);
    @Method(selector = "validateIntegration")
    public static native void validateIntegration();
    @Method(selector = "setConsent:")
    public static native void setConsent(boolean consent);
    /*</methods>*/
}
