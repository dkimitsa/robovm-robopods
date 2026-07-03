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
package org.robovm.pods.tenjin;

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
import org.robovm.apple.storekit.*;
import org.robovm.apple.coredata.*;
import org.robovm.apple.dispatch.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("TenjinSDK.TenjinDatasource")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/TenjinDatasource/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class TenjinDatasourcePtr extends Ptr<TenjinDatasource, TenjinDatasourcePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(TenjinDatasource.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public TenjinDatasource() {}
    protected TenjinDatasource(Handle h, long handle) { super(h, handle); }
    protected TenjinDatasource(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "setBooleanValue:key:")
    public static native void setBoolean(boolean value, String key);
    @Method(selector = "setCacheEventsSetting:")
    public static native void setCacheEventsSetting(boolean isCacheEventsEnabled);
    @Method(selector = "getCacheEventsSetting")
    public static native boolean getCacheEventsSetting();
    @Method(selector = "setEncryptRequestsSetting:")
    public static native void setEncryptRequestsSetting(boolean isEncryptRequestsEnabled);
    @Method(selector = "getEncryptRequestsSetting")
    public static native boolean getEncryptRequestsSetting();
    @Method(selector = "setODMInfo:")
    public static native void setODMInfo(String odmInfo);
    @Method(selector = "getODMInfo")
    public static native String getODMInfo();
    @Method(selector = "getAnalyticsInstallationId")
    public static native String getAnalyticsInstallationId();
    @Method(selector = "setInitializedAt:")
    public static native void setInitializedAt(String timestamp);
    @Method(selector = "getInitializedAt")
    public static native String getInitializedAt();
    @Method(selector = "setLastConnectTimestamp:")
    public static native void setLastConnectTimestamp(double timestamp);
    @Method(selector = "getLastConnectTimestamp")
    public static native double getLastConnectTimestamp();
    /*</methods>*/
}
