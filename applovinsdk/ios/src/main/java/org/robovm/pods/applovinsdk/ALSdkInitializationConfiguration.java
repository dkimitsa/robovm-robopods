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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ALSdkInitializationConfiguration/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class ALSdkInitializationConfigurationPtr extends Ptr<ALSdkInitializationConfiguration, ALSdkInitializationConfigurationPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ALSdkInitializationConfiguration.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected ALSdkInitializationConfiguration() {}
    protected ALSdkInitializationConfiguration(Handle h, long handle) { super(h, handle); }
    protected ALSdkInitializationConfiguration(SkipInit skipInit) { super(skipInit); }
    public ALSdkInitializationConfiguration(String sdkKey) { super((Handle) null, create(sdkKey)); retain(getHandle()); }
    public ALSdkInitializationConfiguration(String sdkKey, @Block VoidBlock1<ALSdkInitializationConfigurationBuilder> builderBlock) { super((Handle) null, create(sdkKey, builderBlock)); retain(getHandle()); }
    public ALSdkInitializationConfiguration(String sdkKey, String axonEventKey, @Block VoidBlock1<ALSdkInitializationConfigurationBuilder> builderBlock) { super((Handle) null, create(sdkKey, axonEventKey, builderBlock)); retain(getHandle()); }
    public ALSdkInitializationConfiguration(String sdkKey, String axonEventKey) { super((Handle) null, create(sdkKey, axonEventKey)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "sdkKey")
    public native String getSdkKey();
    @Property(selector = "axonEventKey")
    public native String getAxonEventKey();
    @Property(selector = "mediationProvider")
    public native String getMediationProvider();
    @Property(selector = "pluginVersion")
    public native String getPluginVersion();
    @Property(selector = "segmentCollection")
    public native MASegmentCollection getSegmentCollection();
    @Property(selector = "testDeviceAdvertisingIdentifiers")
    public native NSArray<NSString> getTestDeviceAdvertisingIdentifiers();
    @Property(selector = "adUnitIdentifiers")
    public native NSArray<NSString> getAdUnitIdentifiers();
    @Property(selector = "isExceptionHandlerEnabled")
    public native boolean isExceptionHandlerEnabled();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "configurationWithSdkKey:")
    protected static native @Pointer long create(String sdkKey);
    @Method(selector = "configurationWithSdkKey:builderBlock:")
    protected static native @Pointer long create(String sdkKey, @Block VoidBlock1<ALSdkInitializationConfigurationBuilder> builderBlock);
    @Method(selector = "configurationWithSdkKey:axonEventKey:builderBlock:")
    protected static native @Pointer long create(String sdkKey, String axonEventKey, @Block VoidBlock1<ALSdkInitializationConfigurationBuilder> builderBlock);
    @Method(selector = "builderWithSdkKey:")
    public static native ALSdkInitializationConfigurationBuilder builder(String sdkKey);
    @Method(selector = "builderWithSdkKey:axonEventKey:")
    protected static native @Pointer long create(String sdkKey, String axonEventKey);
    /*</methods>*/
}
