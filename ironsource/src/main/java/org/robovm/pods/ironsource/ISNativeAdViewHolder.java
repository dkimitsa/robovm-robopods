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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ISNativeAdViewHolder/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class ISNativeAdViewHolderPtr extends Ptr<ISNativeAdViewHolder, ISNativeAdViewHolderPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ISNativeAdViewHolder.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public ISNativeAdViewHolder() {}
    protected ISNativeAdViewHolder(Handle h, long handle) { super(h, handle); }
    protected ISNativeAdViewHolder(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "iconView")
    public native UIImageView getIconView();
    @Property(selector = "setIconView:", strongRef = true)
    public native void setIconView(UIImageView v);
    @Property(selector = "titleView")
    public native UILabel getTitleView();
    @Property(selector = "setTitleView:", strongRef = true)
    public native void setTitleView(UILabel v);
    @Property(selector = "advertiserView")
    public native UILabel getAdvertiserView();
    @Property(selector = "setAdvertiserView:", strongRef = true)
    public native void setAdvertiserView(UILabel v);
    @Property(selector = "bodyView")
    public native UILabel getBodyView();
    @Property(selector = "setBodyView:", strongRef = true)
    public native void setBodyView(UILabel v);
    @Property(selector = "mediaView")
    public native LevelPlayMediaView getMediaView();
    @Property(selector = "setMediaView:", strongRef = true)
    public native void setMediaView(LevelPlayMediaView v);
    @Property(selector = "callToActionView")
    public native UIButton getCallToActionView();
    @Property(selector = "setCallToActionView:", strongRef = true)
    public native void setCallToActionView(UIButton v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
