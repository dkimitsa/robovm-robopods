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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("InMobiSDK.IMAudio")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/IMAudio/*</name>*/ 
    extends /*<extends>*/UIView/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class IMAudioPtr extends Ptr<IMAudio, IMAudioPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(IMAudio.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public IMAudio() {}
    protected IMAudio(Handle h, long handle) { super(h, handle); }
    protected IMAudio(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithFrame:")
    public IMAudio(@ByVal CGRect frame) { super((SkipInit) null); initObject(init(frame)); }
    @Method(selector = "initWithFrame:placementId:")
    public IMAudio(@ByVal CGRect frame, long placementId) { super((SkipInit) null); initObject(init(frame, placementId)); }
    @Method(selector = "initWithFrame:placementId:delegate:")
    public IMAudio(@ByVal CGRect frame, long placementId, IMAudioDelegate delegate) { super((SkipInit) null); initObject(init(frame, placementId, delegate)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "delegate")
    public native IMAudioDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(IMAudioDelegate v);
    @Property(selector = "placementId")
    public native long getPlacementId();
    @Property(selector = "setPlacementId:")
    public native void setPlacementId(long v);
    @Property(selector = "keywords")
    public native String getKeywords();
    @Property(selector = "setKeywords:")
    public native void setKeywords(String v);
    @Property(selector = "extras")
    public native NSDictionary<NSString, ?> getExtras();
    @Property(selector = "setExtras:")
    public native void setExtras(NSDictionary<NSString, ?> v);
    @Property(selector = "transitionAnimation")
    public native UIViewAnimationTransition getTransitionAnimation();
    @Property(selector = "setTransitionAnimation:")
    public native void setTransitionAnimation(UIViewAnimationTransition v);
    @Property(selector = "contentUrl")
    public native String getContentUrl();
    @Property(selector = "setContentUrl:")
    public native void setContentUrl(String v);
    @Property(selector = "creativeId")
    public native String getCreativeId();
    @WeaklyLinked
    @Property(selector = "layerClass")
    public static native Class<? extends CALayer> getLayerClass();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithFrame:")
    protected native @Pointer long init(@ByVal CGRect frame);
    @Method(selector = "initWithFrame:placementId:")
    protected native @Pointer long init(@ByVal CGRect frame, long placementId);
    @Method(selector = "initWithFrame:placementId:delegate:")
    protected native @Pointer long init(@ByVal CGRect frame, long placementId, IMAudioDelegate delegate);
    @Method(selector = "getAdMetaInfo")
    public native NSDictionary<NSString, ?> getAdMetaInfo();
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
    @Method(selector = "load")
    public native void load();
    @Method(selector = "show")
    public native void show();
    @Method(selector = "cancel")
    public native void cancel();
    @Method(selector = "willMoveToWindow:")
    public native void willMoveToWindow(UIWindow newWindow);
    /*</methods>*/
}
