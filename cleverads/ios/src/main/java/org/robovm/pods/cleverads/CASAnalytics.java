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
package org.robovm.pods.cleverads;

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
import org.robovm.apple.corelocation.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("CleverAdsSolutions.CASAnalytics")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CASAnalytics/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CASAnalyticsPtr extends Ptr<CASAnalytics, CASAnalyticsPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CASAnalytics.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public CASAnalytics() {}
    protected CASAnalytics(Handle h, long handle) { super(h, handle); }
    protected CASAnalytics(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "delegate")
    public static native CASAnalyticsDelegate delegate();
    @Method(selector = "setDelegate:")
    public static native void setDelegate(CASAnalyticsDelegate value);
    @Method(selector = "eventNameForCrossPromo")
    public static native String eventNameForCrossPromo();
    @Method(selector = "setEventNameForCrossPromo:")
    public static native void setEventNameForCrossPromo(String value);
    @Method(selector = "eventNameForImpressions")
    public static native String eventNameForImpressions();
    @Method(selector = "setEventNameForImpressions:")
    public static native void setEventNameForImpressions(String value);
    @Method(selector = "eventNameForErrors")
    public static native String eventNameForErrors();
    @Method(selector = "setEventNameForErrors:")
    public static native void setEventNameForErrors(String value);
    @Method(selector = "eventNameForMediation")
    public static native String eventNameForMediation();
    @Method(selector = "setEventNameForMediation:")
    public static native void setEventNameForMediation(String value);
    /*</methods>*/
}
