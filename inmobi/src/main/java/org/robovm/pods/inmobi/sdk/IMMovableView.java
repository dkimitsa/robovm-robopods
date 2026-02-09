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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("InMobiSDK.IMMovableView")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/IMMovableView/*</name>*/ 
    extends /*<extends>*/UIView/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class IMMovableViewPtr extends Ptr<IMMovableView, IMMovableViewPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(IMMovableView.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public IMMovableView() {}
    protected IMMovableView(Handle h, long handle) { super(h, handle); }
    protected IMMovableView(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithFrame:")
    public IMMovableView(@ByVal CGRect frame) { super((SkipInit) null); initObject(init(frame)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "isMovable")
    public native boolean isMovable();
    @Property(selector = "setIsMovable:")
    public native void setIsMovable(boolean v);
    @WeaklyLinked
    @Property(selector = "layerClass")
    public static native Class<? extends CALayer> getLayerClass();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithFrame:")
    protected native @Pointer long init(@ByVal CGRect frame);
    @Method(selector = "didMoveToSuperview")
    public native void didMoveToSuperview();
    @Method(selector = "traitCollectionDidChange:")
    public native void traitCollectionDidChange(UITraitCollection previousTraitCollection);
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
