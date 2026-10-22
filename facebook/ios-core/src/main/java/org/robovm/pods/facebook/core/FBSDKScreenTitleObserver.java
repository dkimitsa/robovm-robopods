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
package org.robovm.pods.facebook.core;

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
import org.robovm.apple.dispatch.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.webkit.*;
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.storekit.*;
import org.robovm.pods.facebook.corebasics.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FBSDKScreenTitleObserver/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class FBSDKScreenTitleObserverPtr extends Ptr<FBSDKScreenTitleObserver, FBSDKScreenTitleObserverPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FBSDKScreenTitleObserver.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected FBSDKScreenTitleObserver() {}
    protected FBSDKScreenTitleObserver(Handle h, long handle) { super(h, handle); }
    protected FBSDKScreenTitleObserver(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "shared")
    public static native FBSDKScreenTitleObserver getShared();
    @Property(selector = "originalViewDidAppearImplementation")
    public native FunctionPtr getOriginalViewDidAppearImplementation();
    @Property(selector = "isCollectionPermitted")
    public native boolean isCollectionPermitted();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "startObserving")
    public native void startObserving();
    @Method(selector = "currentScreenTitle")
    public native String currentScreenTitle();
    @Method(selector = "setScreenTitle:")
    public native void setScreenTitle(String screenTitle);
    @Method(selector = "findLargeContentTitleInView:")
    public static native String findLargeContentTitleInView(UIView rootView);
    /*</methods>*/
}
