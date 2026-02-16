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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("InMobiSDK.ImpressionConfig")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ImpressionConfig/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class ImpressionConfigPtr extends Ptr<ImpressionConfig, ImpressionConfigPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ImpressionConfig.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public ImpressionConfig() {}
    protected ImpressionConfig(Handle h, long handle) { super(h, handle); }
    protected ImpressionConfig(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "impressionType")
    public native @MachineSizedSInt long getImpressionType();
    @Property(selector = "setImpressionType:")
    public native void setImpressionType(@MachineSizedSInt long v);
    @Property(selector = "minPercentageViewed")
    public native @MachineSizedSInt long getMinPercentageViewed();
    @Property(selector = "setMinPercentageViewed:")
    public native void setMinPercentageViewed(@MachineSizedSInt long v);
    @Property(selector = "minTimeViewed")
    public native @MachineSizedSInt long getMinTimeViewed();
    @Property(selector = "setMinTimeViewed:")
    public native void setMinTimeViewed(@MachineSizedSInt long v);
    @Property(selector = "videoMinTimeViewed")
    public native @MachineSizedSInt long getVideoMinTimeViewed();
    @Property(selector = "setVideoMinTimeViewed:")
    public native void setVideoMinTimeViewed(@MachineSizedSInt long v);
    @Property(selector = "pollInterval")
    public native @MachineSizedSInt long getPollInterval();
    @Property(selector = "setPollInterval:")
    public native void setPollInterval(@MachineSizedSInt long v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
