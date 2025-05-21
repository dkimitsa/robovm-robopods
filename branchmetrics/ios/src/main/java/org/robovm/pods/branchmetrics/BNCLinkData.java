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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/BNCLinkData/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class BNCLinkDataPtr extends Ptr<BNCLinkData, BNCLinkDataPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(BNCLinkData.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public BNCLinkData() {}
    protected BNCLinkData(Handle h, long handle) { super(h, handle); }
    protected BNCLinkData(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCoder:")
    public BNCLinkData(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "data")
    public native NSMutableDictionary<?, ?> getData();
    @Property(selector = "setData:")
    public native void setData(NSMutableDictionary<?, ?> v);
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "setupTags:")
    public native void setupTags(NSArray<?> tags);
    @Method(selector = "setupAlias:")
    public native void setupAlias(String alias);
    @Method(selector = "setupType:")
    public native void setupType(BranchLinkType type);
    @Method(selector = "setupChannel:")
    public native void setupChannel(String channel);
    @Method(selector = "setupFeature:")
    public native void setupFeature(String feature);
    @Method(selector = "setupStage:")
    public native void setupStage(String stage);
    @Method(selector = "setupCampaign:")
    public native void setupCampaign(String campaign);
    @Method(selector = "setupParams:")
    public native void setupParams(NSDictionary<?, ?> params);
    @Method(selector = "setupMatchDuration:")
    public native void setupMatchDuration(@MachineSizedUInt long duration);
    @Method(selector = "setupIgnoreUAString:")
    public native void setupIgnoreUAString(String ignoreUAString);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /*</methods>*/
}
