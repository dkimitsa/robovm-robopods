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
package org.robovm.pods.revenuecat;

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
import org.robovm.apple.storekit.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 15.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/RCAdTracker/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class RCAdTrackerPtr extends Ptr<RCAdTracker, RCAdTrackerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(RCAdTracker.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected RCAdTracker() {}
    protected RCAdTracker(Handle h, long handle) { super(h, handle); }
    protected RCAdTracker(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "trackAdFailedToLoad:")
    public native void trackAdFailedToLoad(RCAdFailedToLoad data);
    @Method(selector = "trackAdLoaded:")
    public native void trackAdLoaded(RCAdLoaded data);
    @Method(selector = "trackAdDisplayed:")
    public native void trackAdDisplayed(RCAdDisplayed data);
    @Method(selector = "trackAdOpened:")
    public native void trackAdOpened(RCAdOpened data);
    @Method(selector = "trackAdRevenue:")
    public native void trackAdRevenue(RCAdRevenue data);
    /*</methods>*/
}
