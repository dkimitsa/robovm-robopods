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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("InMobiSDK.WebImpressionConfig")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/WebImpressionConfig/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class WebImpressionConfigPtr extends Ptr<WebImpressionConfig, WebImpressionConfigPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(WebImpressionConfig.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public WebImpressionConfig() {}
    protected WebImpressionConfig(Handle h, long handle) { super(h, handle); }
    protected WebImpressionConfig(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "impressionMinPercentageViewed")
    public native @MachineSizedSInt long getImpressionMinPercentageViewed();
    @Property(selector = "setImpressionMinPercentageViewed:")
    public native void setImpressionMinPercentageViewed(@MachineSizedSInt long v);
    @Property(selector = "impressionPollIntervalMillis")
    public native @MachineSizedSInt long getImpressionPollIntervalMillis();
    @Property(selector = "setImpressionPollIntervalMillis:")
    public native void setImpressionPollIntervalMillis(@MachineSizedSInt long v);
    @Property(selector = "impressionMinTimeViewed")
    public native @MachineSizedSInt long getImpressionMinTimeViewed();
    @Property(selector = "setImpressionMinTimeViewed:")
    public native void setImpressionMinTimeViewed(@MachineSizedSInt long v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
