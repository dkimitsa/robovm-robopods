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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/BranchQRCode/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class BranchQRCodePtr extends Ptr<BranchQRCode, BranchQRCodePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(BranchQRCode.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public BranchQRCode() {}
    protected BranchQRCode(Handle h, long handle) { super(h, handle); }
    protected BranchQRCode(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "codeColor")
    public native UIColor getCodeColor();
    @Property(selector = "setCodeColor:")
    public native void setCodeColor(UIColor v);
    @Property(selector = "backgroundColor")
    public native UIColor getBackgroundColor();
    @Property(selector = "setBackgroundColor:")
    public native void setBackgroundColor(UIColor v);
    @Property(selector = "centerLogo")
    public native String getCenterLogo();
    @Property(selector = "setCenterLogo:")
    public native void setCenterLogo(String v);
    @Property(selector = "width")
    public native NSNumber getWidth();
    @Property(selector = "setWidth:")
    public native void setWidth(NSNumber v);
    @Property(selector = "margin")
    public native NSNumber getMargin();
    @Property(selector = "setMargin:")
    public native void setMargin(NSNumber v);
    @Property(selector = "imageFormat")
    public native BranchQRCodeImageFormat getImageFormat();
    @Property(selector = "setImageFormat:")
    public native void setImageFormat(BranchQRCodeImageFormat v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "getQRCodeAsData:linkProperties:completion:")
    public native void getQRCodeAsData(BranchUniversalObject buo, BranchLinkProperties lp, @Block VoidBlock2<NSData, NSError> completion);
    @Method(selector = "getQRCodeAsImage:linkProperties:completion:")
    public native void getQRCodeAsImage(BranchUniversalObject buo, BranchLinkProperties lp, @Block VoidBlock2<UIImage, NSError> completion);
    @Method(selector = "showShareSheetWithQRCodeFromViewController:anchor:universalObject:linkProperties:completion:")
    public native void showShareSheet(UIViewController viewController, NSObject anchorViewOrButtonItem, BranchUniversalObject buo, BranchLinkProperties lp, @Block VoidBlock1<NSError> completion);
    /*</methods>*/
}
