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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MAAdPlacer/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MAAdPlacerPtr extends Ptr<MAAdPlacer, MAAdPlacerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MAAdPlacer.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MAAdPlacer() {}
    protected MAAdPlacer(Handle h, long handle) { super(h, handle); }
    protected MAAdPlacer(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithSettings:")
    public MAAdPlacer(MAAdPlacerSettings settings) { super((SkipInit) null); initObject(init(settings)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "delegate")
    public native MAAdPlacerDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(MAAdPlacerDelegate v);
    @Property(selector = "adSize")
    public native @ByVal CGSize getAdSize();
    @Property(selector = "setAdSize:")
    public native void setAdSize(@ByVal CGSize v);
    @Property(selector = "nativeAdViewNib")
    public native UINib getNativeAdViewNib();
    @Property(selector = "setNativeAdViewNib:")
    public native void setNativeAdViewNib(UINib v);
    @Property(selector = "nativeAdViewBinder")
    public native MANativeAdViewBinder getNativeAdViewBinder();
    @Property(selector = "setNativeAdViewBinder:")
    public native void setNativeAdViewBinder(MANativeAdViewBinder v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "loadAds")
    public native void loadAds();
    @Method(selector = "clearAds")
    public native void clearAds();
    @Method(selector = "clearAdsInSections:")
    public native void clearAdsInSections(NSIndexSet sections);
    @Method(selector = "clearAdsInSectionAfterIndexPath:")
    public native NSArray<NSIndexPath> clearAdsInSectionAfterIndexPath(NSIndexPath indexPath);
    @Method(selector = "isAdIndexPath:")
    public native boolean isAdIndexPath(NSIndexPath indexPath);
    @Method(selector = "isFilledIndexPath:")
    public native boolean isFilledIndexPath(NSIndexPath indexPath);
    @Method(selector = "sizeForAdAtIndexPath:")
    public native @ByVal CGSize sizeForAdAtIndexPath(NSIndexPath indexPath);
    @Method(selector = "renderAdAtIndexPath:inView:")
    public native void renderAd(NSIndexPath indexPath, UIView view);
    @Method(selector = "updateFillableIndexPaths:")
    public native void updateFillableIndexPaths(NSArray<NSIndexPath> indexPaths);
    @Method(selector = "adjustedNumberOfItems:inSection:")
    public native @MachineSizedSInt long adjustedNumberOfItems(@MachineSizedSInt long originalNumberOfItems, @MachineSizedSInt long section);
    @Method(selector = "adjustedIndexPathForOriginalIndexPath:")
    public native NSIndexPath adjustedIndexPathForOriginalIndexPath(NSIndexPath indexPath);
    @Method(selector = "originalIndexPathForAdjustedIndexPath:")
    public native NSIndexPath originalIndexPathForAdjustedIndexPath(NSIndexPath indexPath);
    @Method(selector = "adjustedIndexPathsForOriginalIndexPaths:")
    public native NSArray<NSIndexPath> adjustedIndexPathsForOriginalIndexPaths(NSArray<NSIndexPath> indexPaths);
    @Method(selector = "originalIndexPathsForAdjustedIndexPaths:")
    public native NSArray<NSIndexPath> originalIndexPathsForAdjustedIndexPaths(NSArray<NSIndexPath> indexPaths);
    @Method(selector = "insertItemsAtIndexPaths:")
    public native void insertItemsAtIndexPaths(NSArray<NSIndexPath> indexPaths);
    @Method(selector = "deleteItemsAtIndexPaths:")
    public native void deleteItemsAtIndexPaths(NSArray<NSIndexPath> indexPaths);
    @Method(selector = "moveItemAtIndexPath:toIndexPath:")
    public native void moveItem(NSIndexPath sourceIndexPath, NSIndexPath destinationIndexPath);
    @Method(selector = "insertSections:")
    public native void insertSections(NSIndexSet sections);
    @Method(selector = "deleteSections:")
    public native void deleteSections(NSIndexSet sections);
    @Method(selector = "moveSection:toSection:")
    public native void moveSection(@MachineSizedSInt long section, @MachineSizedSInt long newSection);
    @Method(selector = "initWithSettings:")
    protected native @Pointer long init(MAAdPlacerSettings settings);
    /*</methods>*/
}
