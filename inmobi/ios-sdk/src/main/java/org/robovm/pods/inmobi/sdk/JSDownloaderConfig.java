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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("InMobiSDK.JSDownloaderConfig")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/JSDownloaderConfig/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class JSDownloaderConfigPtr extends Ptr<JSDownloaderConfig, JSDownloaderConfigPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(JSDownloaderConfig.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public JSDownloaderConfig() {}
    protected JSDownloaderConfig(Handle h, long handle) { super(h, handle); }
    protected JSDownloaderConfig(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "cdnBaseUrl")
    public native String getCdnBaseUrl();
    @Property(selector = "setCdnBaseUrl:")
    public native void setCdnBaseUrl(String v);
    @Property(selector = "isEnabled")
    public native boolean isEnabled();
    @Property(selector = "setIsEnabled:")
    public native void setIsEnabled(boolean v);
    @Property(selector = "fetchExpiresSeconds")
    public native double getFetchExpiresSeconds();
    @Property(selector = "setFetchExpiresSeconds:")
    public native void setFetchExpiresSeconds(double v);
    @Property(selector = "deleteExpiryIntervalSeconds")
    public native double getDeleteExpiryIntervalSeconds();
    @Property(selector = "setDeleteExpiryIntervalSeconds:")
    public native void setDeleteExpiryIntervalSeconds(double v);
    @Property(selector = "memoryCacheLimit")
    public native @MachineSizedSInt long getMemoryCacheLimit();
    @Property(selector = "setMemoryCacheLimit:")
    public native void setMemoryCacheLimit(@MachineSizedSInt long v);
    @Property(selector = "retryCount")
    public native @MachineSizedSInt long getRetryCount();
    @Property(selector = "setRetryCount:")
    public native void setRetryCount(@MachineSizedSInt long v);
    @Property(selector = "retryInterval")
    public native double getRetryInterval();
    @Property(selector = "setRetryInterval:")
    public native void setRetryInterval(double v);
    @Property(selector = "timeout")
    public native double getTimeout();
    @Property(selector = "setTimeout:")
    public native void setTimeout(double v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
