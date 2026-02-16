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
package org.robovm.pods.fyber.core;

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
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.dispatch.*;
import org.robovm.apple.coregraphics.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/IAMRAIDAdView/*</name>*/ 
    extends /*<extends>*/IAAdView/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class IAMRAIDAdViewPtr extends Ptr<IAMRAIDAdView, IAMRAIDAdViewPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(IAMRAIDAdView.class); }/*</bind>*/
    /*<constants>*/
    public static class Defaults {
        public static final int IPhoneBannerWidth = 320;
        public static final int IPhoneBannerHeight = 50;
        public static final int IPadBannerWidth = 728;
        public static final int IPadBannerHeight = 90;
        public static final int RectWidth = 300;
        public static final int RectHeight = 250;
    }
    /*</constants>*/
    /*<constructors>*/
    public IAMRAIDAdView() {}
    protected IAMRAIDAdView(Handle h, long handle) { super(h, handle); }
    protected IAMRAIDAdView(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithFrame:")
    public IAMRAIDAdView(@ByVal CGRect frame) { super(frame); }
    @Method(selector = "initWithCoder:")
    public IAMRAIDAdView(NSCoder coder) { super(coder); }
    /*</constructors>*/
    /*<properties>*/
    @WeaklyLinked
    @Property(selector = "layerClass")
    public static native Class<? extends CALayer> getLayerClass();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "userInterfaceLayoutDirectionForSemanticContentAttribute:")
    public static native UIUserInterfaceLayoutDirection getUserInterfaceLayoutDirection(UISemanticContentAttribute attribute);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "userInterfaceLayoutDirectionForSemanticContentAttribute:relativeToLayoutDirection:")
    public static native UIUserInterfaceLayoutDirection getUserInterfaceLayoutDirection(UISemanticContentAttribute semanticContentAttribute, UIUserInterfaceLayoutDirection layoutDirection);
    /*</methods>*/
}
