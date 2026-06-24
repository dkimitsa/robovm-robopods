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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CASContentInfo/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CASContentInfoPtr extends Ptr<CASContentInfo, CASContentInfoPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CASContentInfo.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected CASContentInfo() {}
    protected CASContentInfo(Handle h, long handle) { super(h, handle); }
    protected CASContentInfo(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "format")
    public native CASFormat getFormat();
    @Property(selector = "sourceName")
    public native String getSourceName();
    @Property(selector = "sourceID")
    public native CASSourceId getSourceID();
    @Property(selector = "sourceUnitID")
    public native String getSourceUnitID();
    @Property(selector = "creativeID")
    public native String getCreativeID();
    @Property(selector = "revenue")
    public native double getRevenue();
    @Property(selector = "revenuePrecision")
    public native CASRevenuePrecision getRevenuePrecision();
    @Property(selector = "placement")
    public native String getPlacement();
    @Property(selector = "impressionDepth")
    public native @MachineSizedSInt long getImpressionDepth();
    @Property(selector = "revenueTotal")
    public native double getRevenueTotal();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
