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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("InMobiSDK.TelemetryConfig")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/TelemetryConfig/*</name>*/ 
    extends /*<extends>*/IMConfigBase/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class TelemetryConfigPtr extends Ptr<TelemetryConfig, TelemetryConfigPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(TelemetryConfig.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public TelemetryConfig() {}
    protected TelemetryConfig(Handle h, long handle) { super(h, handle); }
    protected TelemetryConfig(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "txLatency")
    public native @MachineSizedSInt long getTxLatency();
    @Property(selector = "setTxLatency:")
    public native void setTxLatency(@MachineSizedSInt long v);
    @Property(selector = "maxRetryCount")
    public native @MachineSizedSInt long getMaxRetryCount();
    @Property(selector = "setMaxRetryCount:")
    public native void setMaxRetryCount(@MachineSizedSInt long v);
    @Property(selector = "networkType")
    public native NetworkTypeConfig getNetworkType();
    @Property(selector = "setNetworkType:")
    public native void setNetworkType(NetworkTypeConfig v);
    @Property(selector = "base")
    public native BaseConfig getBase();
    @Property(selector = "setBase:")
    public native void setBase(BaseConfig v);
    @Property(selector = "telemetryUrl")
    public native String getTelemetryUrl();
    @Property(selector = "setTelemetryUrl:")
    public native void setTelemetryUrl(String v);
    @Property(selector = "loggingConfig")
    public native LoggingConfig getLoggingConfig();
    @Property(selector = "setLoggingConfig:")
    public native void setLoggingConfig(LoggingConfig v);
    @Property(selector = "assetReporting")
    public native AssetReportingConfig getAssetReporting();
    @Property(selector = "setAssetReporting:")
    public native void setAssetReporting(AssetReportingConfig v);
    @Property(selector = "processingInterval")
    public native @MachineSizedSInt long getProcessingInterval();
    @Property(selector = "setProcessingInterval:")
    public native void setProcessingInterval(@MachineSizedSInt long v);
    @Property(selector = "eventTTL")
    public native @MachineSizedSInt long getEventTTL();
    @Property(selector = "setEventTTL:")
    public native void setEventTTL(@MachineSizedSInt long v);
    @Property(selector = "maxTemplateEvents")
    public native @MachineSizedSInt long getMaxTemplateEvents();
    @Property(selector = "setMaxTemplateEvents:")
    public native void setMaxTemplateEvents(@MachineSizedSInt long v);
    @Property(selector = "priorityEvents")
    public native NSArray<NSString> getPriorityEvents();
    @Property(selector = "setPriorityEvents:")
    public native void setPriorityEvents(NSArray<NSString> v);
    @Property(selector = "maxEventsToPersist")
    public native @MachineSizedSInt long getMaxEventsToPersist();
    @Property(selector = "setMaxEventsToPersist:")
    public native void setMaxEventsToPersist(@MachineSizedSInt long v);
    @Property(selector = "lpConfig")
    public native LPConfig getLpConfig();
    @Property(selector = "setLpConfig:")
    public native void setLpConfig(LPConfig v);
    @Property(selector = "samplingFactor")
    public native double getSamplingFactor();
    @Property(selector = "setSamplingFactor:")
    public native void setSamplingFactor(double v);
    @Property(selector = "disableAllGeneralEvents")
    public native boolean isDisableAllGeneralEvents();
    @Property(selector = "setDisableAllGeneralEvents:")
    public native void setDisableAllGeneralEvents(boolean v);
    @Property(selector = "includeIds")
    public native IMIncludeIds getIncludeIds();
    @Property(selector = "setIncludeIds:")
    public native void setIncludeIds(IMIncludeIds v);
    @Property(selector = "databaseConfig")
    public native DatabaseConfig getDatabaseConfig();
    @Property(selector = "setDatabaseConfig:")
    public native void setDatabaseConfig(DatabaseConfig v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "getType")
    public native String getType();
    @Method(selector = "toDictionary")
    public native NSDictionary<NSString, ?> toDictionary();
    /*</methods>*/
}
