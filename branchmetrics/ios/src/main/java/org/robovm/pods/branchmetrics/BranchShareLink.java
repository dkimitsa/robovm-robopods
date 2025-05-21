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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/BranchShareLink/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements UIActivityItemSource/*</implements>*/ {

    /*<ptr>*/public static class BranchShareLinkPtr extends Ptr<BranchShareLink, BranchShareLinkPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(BranchShareLink.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected BranchShareLink() {}
    protected BranchShareLink(Handle h, long handle) { super(h, handle); }
    protected BranchShareLink(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithUniversalObject:linkProperties:")
    public BranchShareLink(BranchUniversalObject universalObject, BranchLinkProperties linkProperties) { super((SkipInit) null); initObject(init(universalObject, linkProperties)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "title")
    public native String getTitle();
    @Property(selector = "setTitle:")
    public native void setTitle(String v);
    @Property(selector = "placeholderURL")
    public native NSURL getPlaceholderURL();
    @Property(selector = "setPlaceholderURL:")
    public native void setPlaceholderURL(NSURL v);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "lpMetaData")
    public native LPLinkMetadata getLpMetaData();
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Property(selector = "setLpMetaData:")
    public native void setLpMetaData(LPLinkMetadata v);
    @Property(selector = "shareText")
    public native String getShareText();
    @Property(selector = "setShareText:")
    public native void setShareText(String v);
    @Property(selector = "shareObject")
    public native NSObject getShareObject();
    @Property(selector = "setShareObject:")
    public native void setShareObject(NSObject v);
    @Property(selector = "emailSubject")
    public native String getEmailSubject();
    @Property(selector = "setEmailSubject:")
    public native void setEmailSubject(String v);
    @Property(selector = "shareURL")
    public native NSURL getShareURL();
    @Property(selector = "activityType")
    public native String getActivityType();
    @Property(selector = "serverParameters")
    public native NSMutableDictionary<?, ?> getServerParameters();
    @Property(selector = "setServerParameters:")
    public native void setServerParameters(NSMutableDictionary<?, ?> v);
    @Property(selector = "universalObject")
    public native BranchUniversalObject getUniversalObject();
    @Property(selector = "linkProperties")
    public native BranchLinkProperties getLinkProperties();
    @Property(selector = "delegate")
    public native BranchShareLinkDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(BranchShareLinkDelegate v);
    @Property(selector = "completionError")
    public native @Block VoidBlock3<NSString, Boolean, NSError> getCompletionError();
    @Property(selector = "setCompletionError:")
    public native void setCompletionError(@Block VoidBlock3<NSString, Boolean, NSError> v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithUniversalObject:linkProperties:")
    protected native @Pointer long init(BranchUniversalObject universalObject, BranchLinkProperties linkProperties);
    @Method(selector = "activityItems")
    public native NSArray<UIActivityItemProvider> activityItems();
    @Method(selector = "presentActivityViewControllerFromViewController:anchor:")
    public native void presentActivityViewController(UIViewController viewController, NSObject anchorViewOrButtonItem);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "addLPLinkMetadata:icon:")
    public native void addLPLinkMetadata(String title, UIImage icon);
    @Method(selector = "activityViewControllerPlaceholderItem:")
    public native NSObject getPlaceholderItem(UIActivityViewController activityViewController);
    @Method(selector = "activityViewController:itemForActivityType:")
    public native NSObject getItem(UIActivityViewController activityViewController, String activityType);
    @Method(selector = "activityViewController:subjectForActivityType:")
    public native String getSubject(UIActivityViewController activityViewController, String activityType);
    @Method(selector = "activityViewController:dataTypeIdentifierForActivityType:")
    public native String getDataTypeIdentifier(UIActivityViewController activityViewController, String activityType);
    @Method(selector = "activityViewController:thumbnailImageForActivityType:suggestedSize:")
    public native UIImage getThumbnailImage(UIActivityViewController activityViewController, String activityType, @ByVal CGSize size);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "activityViewControllerLinkMetadata:")
    public native LPLinkMetadata activityViewControllerLinkMetadata(UIActivityViewController activityViewController);
    /**
     * @since Available in iOS 18.0 and later.
     */
    @Method(selector = "activityViewControllerShareRecipients:")
    public native NSArray<INPerson> activityViewControllerShareRecipients(UIActivityViewController activityViewController);
    /*</methods>*/
}
