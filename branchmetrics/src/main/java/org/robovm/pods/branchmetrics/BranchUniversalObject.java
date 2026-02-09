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
package org.robovm.pods.branchmetrics;

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
import org.robovm.apple.corespotlight.*;
import org.robovm.apple.uniformtypeid.*;
import org.robovm.apple.linkpresentation.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.storekit.*;
import org.robovm.apple.intents.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/BranchUniversalObject/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class BranchUniversalObjectPtr extends Ptr<BranchUniversalObject, BranchUniversalObjectPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(BranchUniversalObject.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public BranchUniversalObject() {}
    protected BranchUniversalObject(Handle h, long handle) { super(h, handle); }
    protected BranchUniversalObject(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCanonicalIdentifier:")
    public static BranchUniversalObject CreateWithCanonicalIdentifier(String canonicalIdentifier) {
       BranchUniversalObject res = new BranchUniversalObject((SkipInit) null);
       res.initObject(res.initWithCanonicalIdentifier(canonicalIdentifier));
       return res;
    }
    @Method(selector = "initWithTitle:")
    public BranchUniversalObject(String title) { super((SkipInit) null); initObject(init(title)); }
    public BranchUniversalObject(NSDictionary<?, ?> dictionary) { super((Handle) null, create(dictionary)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "canonicalIdentifier")
    public native String getCanonicalIdentifier();
    @Property(selector = "setCanonicalIdentifier:")
    public native void setCanonicalIdentifier(String v);
    @Property(selector = "canonicalUrl")
    public native String getCanonicalUrl();
    @Property(selector = "setCanonicalUrl:")
    public native void setCanonicalUrl(String v);
    @Property(selector = "title")
    public native String getTitle();
    @Property(selector = "setTitle:")
    public native void setTitle(String v);
    @Property(selector = "contentDescription")
    public native String getContentDescription();
    @Property(selector = "setContentDescription:")
    public native void setContentDescription(String v);
    @Property(selector = "imageUrl")
    public native String getImageUrl();
    @Property(selector = "setImageUrl:")
    public native void setImageUrl(String v);
    @Property(selector = "keywords")
    public native NSArray<NSString> getKeywords();
    @Property(selector = "setKeywords:")
    public native void setKeywords(NSArray<NSString> v);
    @Property(selector = "creationDate")
    public native NSDate getCreationDate();
    @Property(selector = "setCreationDate:")
    public native void setCreationDate(NSDate v);
    @Property(selector = "expirationDate")
    public native NSDate getExpirationDate();
    @Property(selector = "setExpirationDate:")
    public native void setExpirationDate(NSDate v);
    @Property(selector = "locallyIndex")
    public native boolean isLocallyIndex();
    @Property(selector = "setLocallyIndex:")
    public native void setLocallyIndex(boolean v);
    @Property(selector = "publiclyIndex")
    public native boolean isPubliclyIndex();
    @Property(selector = "setPubliclyIndex:")
    public native void setPubliclyIndex(boolean v);
    @Property(selector = "contentMetadata")
    public native BranchContentMetadata getContentMetadata();
    @Property(selector = "setContentMetadata:")
    public native void setContentMetadata(BranchContentMetadata v);
    /**
     * @deprecated Use `BranchUniversalObject.contentMetadata.customMetadata` instead.
     */
    @Deprecated
    @Property(selector = "metadata")
    public native NSDictionary<?, ?> getMetadata();
    /**
     * @deprecated Use `BranchUniversalObject.contentMetadata.customMetadata` instead.
     */
    @Deprecated
    @Property(selector = "setMetadata:")
    public native void setMetadata(NSDictionary<?, ?> v);
    /**
     * @deprecated Use `BranchUniversalObject.contentMetadata.contentSchema` instead.
     */
    @Deprecated
    @Property(selector = "type")
    public native String getType();
    /**
     * @deprecated Use `BranchUniversalObject.contentMetadata.contentSchema` instead.
     */
    @Deprecated
    @Property(selector = "setType:")
    public native void setType(String v);
    /**
     * @deprecated Use `BranchUniversalObject.locallyIndex and BranchUniversalObject.publiclyIndex` instead.
     */
    @Deprecated
    @Property(selector = "contentIndexMode")
    public native BranchContentIndexMode getContentIndexMode();
    /**
     * @deprecated Use `BranchUniversalObject.locallyIndex and BranchUniversalObject.publiclyIndex` instead.
     */
    @Deprecated
    @Property(selector = "setContentIndexMode:")
    public native void setContentIndexMode(BranchContentIndexMode v);
    /**
     * @deprecated Not used due to iOS 10.0 Spotlight changes.
     */
    @Deprecated
    @Property(selector = "spotlightIdentifier")
    public native String getSpotlightIdentifier();
    /**
     * @deprecated Not used due to iOS 10.0 Spotlight changes.
     */
    @Deprecated
    @Property(selector = "setSpotlightIdentifier:")
    public native void setSpotlightIdentifier(String v);
    /**
     * @deprecated Use `BranchUniversalObject.contentMetadata.price` instead.
     */
    @Deprecated
    @Property(selector = "price")
    public native @MachineSizedFloat double getPrice();
    /**
     * @deprecated Use `BranchUniversalObject.contentMetadata.price` instead.
     */
    @Deprecated
    @Property(selector = "setPrice:")
    public native void setPrice(@MachineSizedFloat double v);
    /**
     * @deprecated Use `BranchUniversalObject.contentMetadata.currency` instead.
     */
    @Deprecated
    @Property(selector = "currency")
    public native String getCurrency();
    /**
     * @deprecated Use `BranchUniversalObject.contentMetadata.currency` instead.
     */
    @Deprecated
    @Property(selector = "setCurrency:")
    public native void setCurrency(String v);
    /**
     * @deprecated Use `BranchUniversalObject.locallyIndex` instead.
     */
    @Deprecated
    @Property(selector = "automaticallyListOnSpotlight")
    public native boolean automaticallyListOnSpotlight();
    /**
     * @deprecated Use `BranchUniversalObject.locallyIndex` instead.
     */
    @Deprecated
    @Property(selector = "setAutomaticallyListOnSpotlight:")
    public native void setAutomaticallyListOnSpotlight(boolean v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithCanonicalIdentifier:")
    protected native @Pointer long initWithCanonicalIdentifier(String canonicalIdentifier);
    @Method(selector = "initWithTitle:")
    protected native @Pointer long init(String title);
    /**
     * @deprecated Use `BranchUniversalObject.contentMetadata.customMetadata` instead.
     */
    @Deprecated
    @Method(selector = "addMetadataKey:value:")
    public native void addMetadata(String key, String value);
    @Method(selector = "registerView")
    public native void registerView();
    @Method(selector = "registerViewWithCallback:")
    public native void registerView(@Block VoidBlock2<NSDictionary<?, ?>, NSError> callback);
    @Method(selector = "getShortUrlWithLinkProperties:")
    public native String getShortUrl(BranchLinkProperties linkProperties);
    @Method(selector = "getShortUrlWithLinkPropertiesAndIgnoreFirstClick:")
    public native String getShortUrlAndIgnoreFirstClick(BranchLinkProperties linkProperties);
    @Method(selector = "getShortUrlWithLinkProperties:andCallback:")
    public native void getShortUrl(BranchLinkProperties linkProperties, @Block VoidBlock2<NSString, NSError> callback);
    @Method(selector = "getLongUrlWithChannel:andTags:andFeature:andStage:andAlias:")
    public native String getLongUrl(String channel, NSArray<?> tags, String feature, String stage, String alias);
    @Method(selector = "showShareSheetWithShareText:completion:")
    public native void showShareSheet(String shareText, @Block VoidBlock3<NSString, Boolean, NSError> completion);
    @Method(selector = "showShareSheetWithLinkProperties:andShareText:fromViewController:completionWithError:")
    public native void showShareSheet(BranchLinkProperties linkProperties, String shareText, UIViewController viewController, @Block VoidBlock3<NSString, Boolean, NSError> completion);
    @Method(selector = "showShareSheetWithLinkProperties:andShareText:fromViewController:anchor:completionWithError:")
    public native void showShareSheet(BranchLinkProperties linkProperties, String shareText, UIViewController viewController, UIBarButtonItem anchor, @Block VoidBlock3<NSString, Boolean, NSError> completion);
    @Method(selector = "listOnSpotlight")
    public native void listOnSpotlight();
    @Method(selector = "listOnSpotlightWithCallback:")
    public native void listOnSpotlight(@Block VoidBlock2<NSString, NSError> callback);
    /**
     * @deprecated iOS 10 has changed how Spotlight indexing works and we’ve updated the SDK to reflect this. Please see https://dev.branch.io/features/spotlight-indexing/overview/ for instructions on migration.
     */
    @Deprecated
    @Method(selector = "listOnSpotlightWithIdentifierCallback:")
    public native void listOnSpotlight(@Block VoidBlock3<NSString, NSString, NSError> spotlightCallback);
    @Method(selector = "listOnSpotlightWithLinkProperties:callback:")
    public native void listOnSpotlight(BranchLinkProperties linkproperties, @Block VoidBlock2<NSString, NSError> completion);
    @Method(selector = "removeFromSpotlightWithCallback:")
    public native void removeFromSpotlight(@Block VoidBlock1<NSError> completion);
    @Method(selector = "getDictionaryWithCompleteLinkProperties:")
    public native NSDictionary<?, ?> getDictionary(BranchLinkProperties linkProperties);
    @Method(selector = "getParamsForServerRequestWithAddedLinkProperties:")
    public native NSDictionary<?, ?> getParamsForServerRequest(BranchLinkProperties linkProperties);
    @Method(selector = "dictionary")
    public native NSMutableDictionary<?, ?> dictionary();
    @Method(selector = "description")
    public native String description();
    @Method(selector = "objectWithDictionary:")
    protected static native @Pointer long create(NSDictionary<?, ?> dictionary);
    /*</methods>*/
}
