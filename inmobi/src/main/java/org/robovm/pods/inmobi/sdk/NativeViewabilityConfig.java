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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("InMobiSDK.NativeViewabilityConfig")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NativeViewabilityConfig/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class NativeViewabilityConfigPtr extends Ptr<NativeViewabilityConfig, NativeViewabilityConfigPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NativeViewabilityConfig.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public NativeViewabilityConfig() {}
    protected NativeViewabilityConfig(Handle h, long handle) { super(h, handle); }
    protected NativeViewabilityConfig(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "impressionConfig")
    public native ImpressionConfig getImpressionConfig();
    @Property(selector = "setImpressionConfig:")
    public native void setImpressionConfig(ImpressionConfig v);
    @Property(selector = "mrc50Config")
    public native MRC50Config getMrc50Config();
    @Property(selector = "setMrc50Config:")
    public native void setMrc50Config(MRC50Config v);
    @Property(selector = "parentMinDimension")
    public native DimensionConfig getParentMinDimension();
    @Property(selector = "setParentMinDimension:")
    public native void setParentMinDimension(DimensionConfig v);
    @Property(selector = "iconMinDimension")
    public native DimensionConfig getIconMinDimension();
    @Property(selector = "setIconMinDimension:")
    public native void setIconMinDimension(DimensionConfig v);
    @Property(selector = "mediaMinDimension")
    public native DimensionConfig getMediaMinDimension();
    @Property(selector = "setMediaMinDimension:")
    public native void setMediaMinDimension(DimensionConfig v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
