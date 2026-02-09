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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("InMobiSDK.IMLandingPageInstrumentModel")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/IMLandingPageInstrumentModel/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class IMLandingPageInstrumentModelPtr extends Ptr<IMLandingPageInstrumentModel, IMLandingPageInstrumentModelPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(IMLandingPageInstrumentModel.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected IMLandingPageInstrumentModel() {}
    protected IMLandingPageInstrumentModel(Handle h, long handle) { super(h, handle); }
    protected IMLandingPageInstrumentModel(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithFlowType:url:error:eventType:command:extraInfo:")
    public IMLandingPageInstrumentModel(IMLandingPageFlowType flowType, String url, NSError error, IMTelemetryLandingPageEventType eventType, String command, NSDictionary<NSString, ?> extraInfo) { super((SkipInit) null); initObject(init(flowType, url, error, eventType, command, extraInfo)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "flowType")
    public native IMLandingPageFlowType getFlowType();
    @Property(selector = "setFlowType:")
    public native void setFlowType(IMLandingPageFlowType v);
    @Property(selector = "url")
    public native String getUrl();
    @Property(selector = "setUrl:")
    public native void setUrl(String v);
    @Property(selector = "command")
    public native String getCommand();
    @Property(selector = "setCommand:")
    public native void setCommand(String v);
    @Property(selector = "error")
    public native NSError getError();
    @Property(selector = "setError:")
    public native void setError(NSError v);
    @Property(selector = "eventType")
    public native IMTelemetryLandingPageEventType getEventType();
    @Property(selector = "setEventType:")
    public native void setEventType(IMTelemetryLandingPageEventType v);
    @Property(selector = "extraInfo")
    public native NSDictionary<NSString, ?> getExtraInfo();
    @Property(selector = "setExtraInfo:")
    public native void setExtraInfo(NSDictionary<NSString, ?> v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithFlowType:url:error:eventType:command:extraInfo:")
    protected native @Pointer long init(IMLandingPageFlowType flowType, String url, NSError error, IMTelemetryLandingPageEventType eventType, String command, NSDictionary<NSString, ?> extraInfo);
    /*</methods>*/
}
