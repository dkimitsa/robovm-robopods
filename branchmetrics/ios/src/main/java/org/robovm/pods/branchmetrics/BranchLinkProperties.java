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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/BranchLinkProperties/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class BranchLinkPropertiesPtr extends Ptr<BranchLinkProperties, BranchLinkPropertiesPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(BranchLinkProperties.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public BranchLinkProperties() {}
    protected BranchLinkProperties(Handle h, long handle) { super(h, handle); }
    protected BranchLinkProperties(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "tags")
    public native NSArray<?> getTags();
    @Property(selector = "setTags:")
    public native void setTags(NSArray<?> v);
    @Property(selector = "feature")
    public native String getFeature();
    @Property(selector = "setFeature:")
    public native void setFeature(String v);
    @Property(selector = "alias")
    public native String getAlias();
    @Property(selector = "setAlias:")
    public native void setAlias(String v);
    @Property(selector = "channel")
    public native String getChannel();
    @Property(selector = "setChannel:")
    public native void setChannel(String v);
    @Property(selector = "stage")
    public native String getStage();
    @Property(selector = "setStage:")
    public native void setStage(String v);
    @Property(selector = "campaign")
    public native String getCampaign();
    @Property(selector = "setCampaign:")
    public native void setCampaign(String v);
    @Property(selector = "matchDuration")
    public native @MachineSizedUInt long getMatchDuration();
    @Property(selector = "setMatchDuration:")
    public native void setMatchDuration(@MachineSizedUInt long v);
    @Property(selector = "controlParams")
    public native NSDictionary<?, ?> getControlParams();
    @Property(selector = "setControlParams:")
    public native void setControlParams(NSDictionary<?, ?> v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "addControlParam:withValue:")
    public native void addControlParam(String controlParam, String value);
    @Method(selector = "description")
    public native String description();
    @Method(selector = "getBranchLinkPropertiesFromDictionary:")
    public static native BranchLinkProperties getBranchLinkPropertiesFromDictionary(NSDictionary<?, ?> dictionary);
    /*</methods>*/
}
