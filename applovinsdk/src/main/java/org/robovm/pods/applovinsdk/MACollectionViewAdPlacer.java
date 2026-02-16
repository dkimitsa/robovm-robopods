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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MACollectionViewAdPlacer/*</name>*/ 
    extends /*<extends>*/MACustomAdPlacer/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MACollectionViewAdPlacerPtr extends Ptr<MACollectionViewAdPlacer, MACollectionViewAdPlacerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MACollectionViewAdPlacer.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MACollectionViewAdPlacer() {}
    protected MACollectionViewAdPlacer(Handle h, long handle) { super(h, handle); }
    protected MACollectionViewAdPlacer(SkipInit skipInit) { super(skipInit); }
    public MACollectionViewAdPlacer(UICollectionView collectionView, MAAdPlacerSettings settings) { super((Handle) null, create(collectionView, settings)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "shouldCollapseEmptyAds")
    public native boolean isCollapseEmptyAds();
    @Property(selector = "setCollapseEmptyAds:")
    public native void setCollapseEmptyAds(boolean v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "placerWithCollectionView:settings:")
    protected static native @Pointer long create(UICollectionView collectionView, MAAdPlacerSettings settings);
    /*</methods>*/
}
