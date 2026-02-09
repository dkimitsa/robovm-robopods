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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MANativeAdViewBinderBuilder/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MANativeAdViewBinderBuilderPtr extends Ptr<MANativeAdViewBinderBuilder, MANativeAdViewBinderBuilderPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MANativeAdViewBinderBuilder.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MANativeAdViewBinderBuilder() {}
    protected MANativeAdViewBinderBuilder(Handle h, long handle) { super(h, handle); }
    protected MANativeAdViewBinderBuilder(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "titleLabelTag")
    public native @MachineSizedSInt long getTitleLabelTag();
    @Property(selector = "setTitleLabelTag:")
    public native void setTitleLabelTag(@MachineSizedSInt long v);
    @Property(selector = "advertiserLabelTag")
    public native @MachineSizedSInt long getAdvertiserLabelTag();
    @Property(selector = "setAdvertiserLabelTag:")
    public native void setAdvertiserLabelTag(@MachineSizedSInt long v);
    @Property(selector = "bodyLabelTag")
    public native @MachineSizedSInt long getBodyLabelTag();
    @Property(selector = "setBodyLabelTag:")
    public native void setBodyLabelTag(@MachineSizedSInt long v);
    @Property(selector = "iconImageViewTag")
    public native @MachineSizedSInt long getIconImageViewTag();
    @Property(selector = "setIconImageViewTag:")
    public native void setIconImageViewTag(@MachineSizedSInt long v);
    @Property(selector = "optionsContentViewTag")
    public native @MachineSizedSInt long getOptionsContentViewTag();
    @Property(selector = "setOptionsContentViewTag:")
    public native void setOptionsContentViewTag(@MachineSizedSInt long v);
    @Property(selector = "starRatingContentViewTag")
    public native @MachineSizedSInt long getStarRatingContentViewTag();
    @Property(selector = "setStarRatingContentViewTag:")
    public native void setStarRatingContentViewTag(@MachineSizedSInt long v);
    @Property(selector = "mediaContentViewTag")
    public native @MachineSizedSInt long getMediaContentViewTag();
    @Property(selector = "setMediaContentViewTag:")
    public native void setMediaContentViewTag(@MachineSizedSInt long v);
    @Property(selector = "callToActionButtonTag")
    public native @MachineSizedSInt long getCallToActionButtonTag();
    @Property(selector = "setCallToActionButtonTag:")
    public native void setCallToActionButtonTag(@MachineSizedSInt long v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
