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
package org.robovm.pods.adjustsdk;

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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ADJAttribution/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class ADJAttributionPtr extends Ptr<ADJAttribution, ADJAttributionPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ADJAttribution.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public ADJAttribution() {}
    protected ADJAttribution(Handle h, long handle) { super(h, handle); }
    protected ADJAttribution(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithJsonDict:")
    public ADJAttribution(NSDictionary<?, ?> jsonDict) { super((SkipInit) null); initObject(init(jsonDict)); }
    @Method(selector = "initWithCoder:")
    public ADJAttribution(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "trackerToken")
    public native String getTrackerToken();
    @Property(selector = "setTrackerToken:")
    public native void setTrackerToken(String v);
    @Property(selector = "trackerName")
    public native String getTrackerName();
    @Property(selector = "setTrackerName:")
    public native void setTrackerName(String v);
    @Property(selector = "network")
    public native String getNetwork();
    @Property(selector = "setNetwork:")
    public native void setNetwork(String v);
    @Property(selector = "campaign")
    public native String getCampaign();
    @Property(selector = "setCampaign:")
    public native void setCampaign(String v);
    @Property(selector = "adgroup")
    public native String getAdgroup();
    @Property(selector = "setAdgroup:")
    public native void setAdgroup(String v);
    @Property(selector = "creative")
    public native String getCreative();
    @Property(selector = "setCreative:")
    public native void setCreative(String v);
    @Property(selector = "clickLabel")
    public native String getClickLabel();
    @Property(selector = "setClickLabel:")
    public native void setClickLabel(String v);
    @Property(selector = "costType")
    public native String getCostType();
    @Property(selector = "setCostType:")
    public native void setCostType(String v);
    @Property(selector = "costAmount")
    public native NSNumber getCostAmount();
    @Property(selector = "setCostAmount:")
    public native void setCostAmount(NSNumber v);
    @Property(selector = "costCurrency")
    public native String getCostCurrency();
    @Property(selector = "setCostCurrency:")
    public native void setCostCurrency(String v);
    @Property(selector = "jsonResponse")
    public native NSDictionary<?, ?> getJsonResponse();
    @Property(selector = "setJsonResponse:")
    public native void setJsonResponse(NSDictionary<?, ?> v);
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithJsonDict:")
    protected native @Pointer long init(NSDictionary<?, ?> jsonDict);
    @Method(selector = "isEqualToAttribution:")
    public native boolean isEqualToAttribution(ADJAttribution attribution);
    @Method(selector = "dictionary")
    public native NSDictionary<?, ?> dictionary();
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /*</methods>*/
}
