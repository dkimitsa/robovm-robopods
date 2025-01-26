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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("InMobiSDK.LoggingConfig")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/LoggingConfig/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class LoggingConfigPtr extends Ptr<LoggingConfig, LoggingConfigPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(LoggingConfig.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public LoggingConfig() {}
    protected LoggingConfig(Handle h, long handle) { super(h, handle); }
    protected LoggingConfig(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "enabled")
    public native boolean isEnabled();
    @Property(selector = "setEnabled:")
    public native void setEnabled(boolean v);
    @Property(selector = "expiry")
    public native @MachineSizedSInt long getExpiry();
    @Property(selector = "setExpiry:")
    public native void setExpiry(@MachineSizedSInt long v);
    @Property(selector = "maxRetries")
    public native @MachineSizedSInt long getMaxRetries();
    @Property(selector = "setMaxRetries:")
    public native void setMaxRetries(@MachineSizedSInt long v);
    @Property(selector = "retryInterval")
    public native @MachineSizedSInt long getRetryInterval();
    @Property(selector = "setRetryInterval:")
    public native void setRetryInterval(@MachineSizedSInt long v);
    @Property(selector = "maxNoOfEntries")
    public native @MachineSizedSInt long getMaxNoOfEntries();
    @Property(selector = "setMaxNoOfEntries:")
    public native void setMaxNoOfEntries(@MachineSizedSInt long v);
    @Property(selector = "loggingUrl")
    public native String getLoggingUrl();
    @Property(selector = "setLoggingUrl:")
    public native void setLoggingUrl(String v);
    @Property(selector = "errorLog")
    public native ErrorLogConfig getErrorLog();
    @Property(selector = "setErrorLog:")
    public native void setErrorLog(ErrorLogConfig v);
    @Property(selector = "banner")
    public native SdkLogAdTypeConfig getBanner();
    @Property(selector = "setBanner:")
    public native void setBanner(SdkLogAdTypeConfig v);
    @Property(selector = "audio")
    public native SdkLogAdTypeConfig getAudio();
    @Property(selector = "setAudio:")
    public native void setAudio(SdkLogAdTypeConfig v);
    @Property(selector = "int_html")
    public native SdkLogAdTypeConfig getInt_html();
    @Property(selector = "setInt_html:")
    public native void setInt_html(SdkLogAdTypeConfig v);
    @Property(selector = "int_native")
    public native SdkLogAdTypeConfig getInt_native();
    @Property(selector = "setInt_native:")
    public native void setInt_native(SdkLogAdTypeConfig v);
    @Property(selector = "native")
    public native SdkLogAdTypeConfig getNative();
    @Property(selector = "setNative:")
    public native void setNative(SdkLogAdTypeConfig v);
    @Property(selector = "getToken")
    public native SdkLogInfo getGetToken();
    @Property(selector = "setGetToken:")
    public native void setGetToken(SdkLogInfo v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
