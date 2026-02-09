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
package org.robovm.pods.ironsource;

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
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/LevelPlayNativeAdBuilder/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class LevelPlayNativeAdBuilderPtr extends Ptr<LevelPlayNativeAdBuilder, LevelPlayNativeAdBuilderPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(LevelPlayNativeAdBuilder.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public LevelPlayNativeAdBuilder() {}
    protected LevelPlayNativeAdBuilder(Handle h, long handle) { super(h, handle); }
    protected LevelPlayNativeAdBuilder(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "placementName")
    public native String getPlacementName();
    @Property(selector = "setPlacementName:")
    public native void setPlacementName(String v);
    @Property(selector = "delegate")
    public native LevelPlayNativeAdDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(LevelPlayNativeAdDelegate v);
    @Property(selector = "viewController")
    public native UIViewController getViewController();
    @Property(selector = "setViewController:", strongRef = true)
    public native void setViewController(UIViewController v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "withViewController:")
    public native LevelPlayNativeAdBuilder withViewController(UIViewController viewController);
    @Method(selector = "withPlacementName:")
    public native LevelPlayNativeAdBuilder withPlacementName(String placementName);
    @Method(selector = "withDelegate:")
    public native LevelPlayNativeAdBuilder withDelegate(LevelPlayNativeAdDelegate delegate);
    @Method(selector = "build")
    public native LevelPlayNativeAd build();
    /*</methods>*/
}
