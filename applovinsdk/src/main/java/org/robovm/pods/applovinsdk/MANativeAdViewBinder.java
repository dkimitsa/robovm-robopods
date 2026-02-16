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
package org.robovm.pods.applovinsdk;

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
import org.robovm.apple.safariservices.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MANativeAdViewBinder/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MANativeAdViewBinderPtr extends Ptr<MANativeAdViewBinder, MANativeAdViewBinderPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MANativeAdViewBinder.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MANativeAdViewBinder() {}
    protected MANativeAdViewBinder(Handle h, long handle) { super(h, handle); }
    protected MANativeAdViewBinder(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithBuilderBlock:")
    public MANativeAdViewBinder(@Block VoidBlock1<MANativeAdViewBinderBuilder> builder) { super((SkipInit) null); initObject(init(builder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "titleLabelTag")
    public native @MachineSizedSInt long getTitleLabelTag();
    @Property(selector = "advertiserLabelTag")
    public native @MachineSizedSInt long getAdvertiserLabelTag();
    @Property(selector = "bodyLabelTag")
    public native @MachineSizedSInt long getBodyLabelTag();
    @Property(selector = "iconImageViewTag")
    public native @MachineSizedSInt long getIconImageViewTag();
    @Property(selector = "optionsContentViewTag")
    public native @MachineSizedSInt long getOptionsContentViewTag();
    @Property(selector = "starRatingContentViewTag")
    public native @MachineSizedSInt long getStarRatingContentViewTag();
    @Property(selector = "mediaContentViewTag")
    public native @MachineSizedSInt long getMediaContentViewTag();
    @Property(selector = "callToActionButtonTag")
    public native @MachineSizedSInt long getCallToActionButtonTag();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithBuilderBlock:")
    protected native @Pointer long init(@Block VoidBlock1<MANativeAdViewBinderBuilder> builder);
    /*</methods>*/
}
