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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/OSTrackerFactory/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class OSTrackerFactoryPtr extends Ptr<OSTrackerFactory, OSTrackerFactoryPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(OSTrackerFactory.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public OSTrackerFactory() {}
    protected OSTrackerFactory(Handle h, long handle) { super(h, handle); }
    protected OSTrackerFactory(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithRepository:")
    public OSTrackerFactory(OSInfluenceDataRepository dataRepository) { super((SkipInit) null); initObject(init(dataRepository)); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithRepository:")
    protected native @Pointer long init(OSInfluenceDataRepository dataRepository);
    @Method(selector = "saveInfluenceParams:")
    public native void saveInfluenceParams(NSDictionary<?, ?> params);
    @Method(selector = "initFromCache")
    public native void initFromCache();
    @Method(selector = "influences")
    public native NSArray<OSInfluence> influences();
    @Method(selector = "sessionInfluences")
    public native NSArray<OSInfluence> sessionInfluences();
    @Method(selector = "iamChannelTracker")
    public native OSChannelTracker iamChannelTracker();
    @Method(selector = "notificationChannelTracker")
    public native OSChannelTracker notificationChannelTracker();
    @Method(selector = "channelByEntryAction:")
    public native OSChannelTracker channelByEntryAction(AppEntryAction entryAction);
    @Method(selector = "channels")
    public native NSArray<OSChannelTracker> channels();
    @Method(selector = "channelsToResetByEntryAction:")
    public native NSArray<OSChannelTracker> channelsToResetByEntryAction(AppEntryAction entryAction);
    @Method(selector = "sharedTrackerFactory")
    public static native OSTrackerFactory sharedTrackerFactory();
    /*</methods>*/
}
