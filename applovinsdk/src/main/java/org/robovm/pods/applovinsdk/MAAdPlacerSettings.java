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
package org.robovm.pods.applovinsdk;

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
import org.robovm.apple.safariservices.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MAAdPlacerSettings/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MAAdPlacerSettingsPtr extends Ptr<MAAdPlacerSettings, MAAdPlacerSettingsPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MAAdPlacerSettings.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MAAdPlacerSettings() {}
    protected MAAdPlacerSettings(Handle h, long handle) { super(h, handle); }
    protected MAAdPlacerSettings(SkipInit skipInit) { super(skipInit); }
    public MAAdPlacerSettings(String adUnitIdentifier) { super((Handle) null, create(adUnitIdentifier)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "adUnitIdentifier")
    public native String getAdUnitIdentifier();
    @Property(selector = "placement")
    public native String getPlacement();
    @Property(selector = "setPlacement:")
    public native void setPlacement(String v);
    @Property(selector = "fixedPositions")
    public native NSOrderedSet<NSIndexPath> getFixedPositions();
    @Property(selector = "repeatingInterval")
    public native @MachineSizedUInt long getRepeatingInterval();
    @Property(selector = "setRepeatingInterval:")
    public native void setRepeatingInterval(@MachineSizedUInt long v);
    @Property(selector = "maximumAdCount")
    public native @MachineSizedUInt long getMaximumAdCount();
    @Property(selector = "setMaximumAdCount:")
    public native void setMaximumAdCount(@MachineSizedUInt long v);
    @Property(selector = "maximumPreloadedAdCount")
    public native @MachineSizedUInt long getMaximumPreloadedAdCount();
    @Property(selector = "setMaximumPreloadedAdCount:")
    public native void setMaximumPreloadedAdCount(@MachineSizedUInt long v);
    @Property(selector = "isRepeatingEnabled")
    public native boolean isRepeatingEnabled();
    @Property(selector = "hasValidPositioning")
    public native boolean isValidPositioning();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "addFixedPosition:")
    public native void addFixedPosition(NSIndexPath indexPath);
    @Method(selector = "resetFixedPositions")
    public native void resetFixedPositions();
    @Method(selector = "settingsWithAdUnitIdentifier:")
    protected static native @Pointer long create(String adUnitIdentifier);
    /*</methods>*/
}
