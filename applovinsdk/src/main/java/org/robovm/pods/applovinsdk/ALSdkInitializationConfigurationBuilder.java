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
package org.robovm.pods.applovinsdk;

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
import org.robovm.apple.safariservices.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ALSdkInitializationConfigurationBuilder/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class ALSdkInitializationConfigurationBuilderPtr extends Ptr<ALSdkInitializationConfigurationBuilder, ALSdkInitializationConfigurationBuilderPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ALSdkInitializationConfigurationBuilder.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected ALSdkInitializationConfigurationBuilder() {}
    protected ALSdkInitializationConfigurationBuilder(Handle h, long handle) { super(h, handle); }
    protected ALSdkInitializationConfigurationBuilder(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "sdkKey")
    public native String getSdkKey();
    @Property(selector = "axonEventKey")
    public native String getAxonEventKey();
    @Property(selector = "mediationProvider")
    public native String getMediationProvider();
    @Property(selector = "setMediationProvider:")
    public native void setMediationProvider(String v);
    @Property(selector = "pluginVersion")
    public native String getPluginVersion();
    @Property(selector = "setPluginVersion:")
    public native void setPluginVersion(String v);
    @Property(selector = "segmentCollection")
    public native MASegmentCollection getSegmentCollection();
    @Property(selector = "setSegmentCollection:")
    public native void setSegmentCollection(MASegmentCollection v);
    @Property(selector = "testDeviceAdvertisingIdentifiers")
    public native NSArray<NSString> getTestDeviceAdvertisingIdentifiers();
    @Property(selector = "setTestDeviceAdvertisingIdentifiers:")
    public native void setTestDeviceAdvertisingIdentifiers(NSArray<NSString> v);
    @Property(selector = "adUnitIdentifiers")
    public native NSArray<NSString> getAdUnitIdentifiers();
    @Property(selector = "setAdUnitIdentifiers:")
    public native void setAdUnitIdentifiers(NSArray<NSString> v);
    @Property(selector = "exceptionHandlerEnabled")
    public native boolean isExceptionHandlerEnabled();
    @Property(selector = "setExceptionHandlerEnabled:")
    public native void setExceptionHandlerEnabled(boolean v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "build")
    public native ALSdkInitializationConfiguration build();
    /*</methods>*/
}
