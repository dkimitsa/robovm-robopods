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
package org.robovm.pods.unityads;

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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UADSBannerLoadOptions/*</name>*/ 
    extends /*<extends>*/UADSLoadOptions/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class UADSBannerLoadOptionsPtr extends Ptr<UADSBannerLoadOptions, UADSBannerLoadOptionsPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UADSBannerLoadOptions.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public UADSBannerLoadOptions() {}
    protected UADSBannerLoadOptions(Handle h, long handle) { super(h, handle); }
    protected UADSBannerLoadOptions(SkipInit skipInit) { super(skipInit); }
    public UADSBannerLoadOptions(UADSLoadOptions loadOptions, @ByVal CGSize size) { super((Handle) null, create(loadOptions, size)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "size")
    public native @ByVal CGSize getSize();
    @Property(selector = "setSize:")
    public native void setSize(@ByVal CGSize v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "newBannerLoadOptionsWith:size:")
    protected static native @Pointer long create(UADSLoadOptions loadOptions, @ByVal CGSize size);
    /*</methods>*/
}
