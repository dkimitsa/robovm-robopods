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
package org.robovm.pods.onesignal;

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
import org.robovm.apple.usernotifications.*;
import org.robovm.apple.uikit.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/OSChannelTracker/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class OSChannelTrackerPtr extends Ptr<OSChannelTracker, OSChannelTrackerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(OSChannelTracker.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public OSChannelTracker() {}
    protected OSChannelTracker(Handle h, long handle) { super(h, handle); }
    protected OSChannelTracker(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithRepository:")
    public OSChannelTracker(OSInfluenceDataRepository dataRepository) { super((SkipInit) null); initObject(init(dataRepository)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "influenceType")
    public native OSInfluenceType getInfluenceType();
    @Property(selector = "setInfluenceType:")
    public native void setInfluenceType(OSInfluenceType v);
    @Property(selector = "directId")
    public native String getDirectId();
    @Property(selector = "setDirectId:")
    public native void setDirectId(String v);
    @Property(selector = "indirectIds")
    public native NSArray<?> getIndirectIds();
    @Property(selector = "setIndirectIds:")
    public native void setIndirectIds(NSArray<?> v);
    @Property(selector = "dataRepository")
    public native OSInfluenceDataRepository getDataRepository();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithRepository:")
    protected native @Pointer long init(OSInfluenceDataRepository dataRepository);
    @Method(selector = "idTag")
    public native String idTag();
    @Method(selector = "initInfluencedTypeFromCache")
    public native void initInfluencedTypeFromCache();
    @Method(selector = "cacheState")
    public native void cacheState();
    @Method(selector = "resetAndInitInfluence")
    public native void resetAndInitInfluence();
    @Method(selector = "lastReceivedIds")
    public native NSArray<?> lastReceivedIds();
    @Method(selector = "saveLastId:")
    public native void saveLastId(String lastId);
    @Method(selector = "currentSessionInfluence")
    public native OSInfluence currentSessionInfluence();
    /*</methods>*/
}
