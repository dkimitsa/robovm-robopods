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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/IMNativeViewDataBuilder/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class IMNativeViewDataBuilderPtr extends Ptr<IMNativeViewDataBuilder, IMNativeViewDataBuilderPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(IMNativeViewDataBuilder.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected IMNativeViewDataBuilder() {}
    protected IMNativeViewDataBuilder(Handle h, long handle) { super(h, handle); }
    protected IMNativeViewDataBuilder(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithAdParentView:")
    public IMNativeViewDataBuilder(UIView adParentView) { super((SkipInit) null); initObject(init(adParentView)); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithAdParentView:")
    protected native @Pointer long init(UIView adParentView);
    @Method(selector = "setTitleView:")
    public native IMNativeViewDataBuilder setTitleView(UIView titleView);
    @Method(selector = "setDescriptionView:")
    public native IMNativeViewDataBuilder setDescriptionView(UIView descriptionView);
    @Method(selector = "setCTAView:")
    public native IMNativeViewDataBuilder setCTAView(UIView ctaView);
    @Method(selector = "setIconView:")
    public native IMNativeViewDataBuilder setIconView(UIImageView iconView);
    @Method(selector = "setRatingView:")
    public native IMNativeViewDataBuilder setRatingView(UIView ratingView);
    @Method(selector = "setAdvertiserView:")
    public native IMNativeViewDataBuilder setAdvertiserView(UIView advertiserView);
    @Method(selector = "setExtraViews:")
    public native IMNativeViewDataBuilder setExtraViews(NSArray<UIView> extraViews);
    @Method(selector = "build")
    public native IMNativeViewData build();
    /*</methods>*/
}
