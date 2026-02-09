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
package org.robovm.pods.charts;

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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("DGCharts.NSUIView")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NSUIView/*</name>*/ 
    extends /*<extends>*/UIView/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class NSUIViewPtr extends Ptr<NSUIView, NSUIViewPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NSUIView.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public NSUIView() {}
    protected NSUIView(Handle h, long handle) { super(h, handle); }
    protected NSUIView(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithFrame:")
    public NSUIView(@ByVal CGRect frame) { super((SkipInit) null); initObject(init(frame)); }
    @Method(selector = "initWithCoder:")
    public NSUIView(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "nsuiLayer")
    public native CALayer getNsuiLayer();
    @WeaklyLinked
    @Property(selector = "layerClass")
    public static native Class<? extends CALayer> getLayerClass();
    @Property(selector = "isAccessibilityElement")
    public native boolean isAccessibilityElement();
    @Property(selector = "setIsAccessibilityElement:")
    public native void setIsAccessibilityElement(boolean v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithFrame:")
    protected native @Pointer long init(@ByVal CGRect frame);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
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
    @Method(selector = "accessibilityChildren")
    public native NSArray<?> accessibilityChildren();
    @Method(selector = "accessibilityElementCount")
    public native @MachineSizedSInt long accessibilityElementCount();
    @Method(selector = "accessibilityElementAtIndex:")
    public native NSObject accessibilityElementAtIndex(@MachineSizedSInt long index);
    @Method(selector = "indexOfAccessibilityElement:")
    public native @MachineSizedSInt long indexOfAccessibilityElement(NSObject element);
    @Method(selector = "touchesBegan:withEvent:")
    public native void touchesBegan(NSSet<UITouch> touches, UIEvent event);
    @Method(selector = "touchesMoved:withEvent:")
    public native void touchesMoved(NSSet<UITouch> touches, UIEvent event);
    @Method(selector = "touchesEnded:withEvent:")
    public native void touchesEnded(NSSet<UITouch> touches, UIEvent event);
    @Method(selector = "touchesCancelled:withEvent:")
    public native void touchesCancelled(NSSet<UITouch> touches, UIEvent event);
    @Method(selector = "nsuiTouchesBegan:withEvent:")
    public native void nsuiTouchesBegan(NSSet<UITouch> touches, UIEvent event);
    @Method(selector = "nsuiTouchesMoved:withEvent:")
    public native void nsuiTouchesMoved(NSSet<UITouch> touches, UIEvent event);
    @Method(selector = "nsuiTouchesEnded:withEvent:")
    public native void nsuiTouchesEnded(NSSet<UITouch> touches, UIEvent event);
    @Method(selector = "nsuiTouchesCancelled:withEvent:")
    public native void nsuiTouchesCancelled(NSSet<UITouch> touches, UIEvent event);
    /*</methods>*/
}
