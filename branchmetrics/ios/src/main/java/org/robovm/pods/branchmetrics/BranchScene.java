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
package org.robovm.pods.branchmetrics;

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
import org.robovm.apple.corespotlight.*;
import org.robovm.apple.uniformtypeid.*;
import org.robovm.apple.linkpresentation.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.storekit.*;
import org.robovm.apple.intents.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 13.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/BranchScene/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class BranchScenePtr extends Ptr<BranchScene, BranchScenePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(BranchScene.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public BranchScene() {}
    protected BranchScene(Handle h, long handle) { super(h, handle); }
    protected BranchScene(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initSessionWithLaunchOptions:registerDeepLinkHandler:")
    public native void init(NSDictionary<?, ?> options, @Block VoidBlock3<NSDictionary<?, ?>, NSError, UIScene> callback);
    @Method(selector = "scene:continueUserActivity:")
    public native void continueUserActivity(UIScene scene, NSUserActivity userActivity);
    @Method(selector = "scene:openURLContexts:")
    public native void openURLContexts(UIScene scene, NSSet<UIOpenURLContext> URLContexts);
    @Method(selector = "shared")
    public static native BranchScene shared();
    /*</methods>*/
}
