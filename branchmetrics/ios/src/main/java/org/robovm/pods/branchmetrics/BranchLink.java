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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/BranchLink/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class BranchLinkPtr extends Ptr<BranchLink, BranchLinkPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(BranchLink.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public BranchLink() {}
    protected BranchLink(Handle h, long handle) { super(h, handle); }
    protected BranchLink(SkipInit skipInit) { super(skipInit); }
    public BranchLink(BranchUniversalObject universalObject, BranchLinkProperties linkProperties) { super((Handle) null, create(universalObject, linkProperties)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "universalObject")
    public native BranchUniversalObject getUniversalObject();
    @Property(selector = "setUniversalObject:")
    public native void setUniversalObject(BranchUniversalObject v);
    @Property(selector = "linkProperties")
    public native BranchLinkProperties getLinkProperties();
    @Property(selector = "setLinkProperties:")
    public native void setLinkProperties(BranchLinkProperties v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "linkWithUniversalObject:properties:")
    protected static native @Pointer long create(BranchUniversalObject universalObject, BranchLinkProperties linkProperties);
    /*</methods>*/
}
