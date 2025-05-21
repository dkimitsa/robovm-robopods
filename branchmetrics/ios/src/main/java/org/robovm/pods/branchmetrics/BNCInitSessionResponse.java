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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/BNCInitSessionResponse/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class BNCInitSessionResponsePtr extends Ptr<BNCInitSessionResponse, BNCInitSessionResponsePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(BNCInitSessionResponse.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public BNCInitSessionResponse() {}
    protected BNCInitSessionResponse(Handle h, long handle) { super(h, handle); }
    protected BNCInitSessionResponse(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "params")
    public native NSDictionary<?, ?> getParams();
    @Property(selector = "setParams:")
    public native void setParams(NSDictionary<?, ?> v);
    @Property(selector = "universalObject")
    public native BranchUniversalObject getUniversalObject();
    @Property(selector = "setUniversalObject:")
    public native void setUniversalObject(BranchUniversalObject v);
    @Property(selector = "linkProperties")
    public native BranchLinkProperties getLinkProperties();
    @Property(selector = "setLinkProperties:")
    public native void setLinkProperties(BranchLinkProperties v);
    @Property(selector = "sceneIdentifier")
    public native String getSceneIdentifier();
    @Property(selector = "setSceneIdentifier:")
    public native void setSceneIdentifier(String v);
    @Property(selector = "error")
    public native NSError getError();
    @Property(selector = "setError:")
    public native void setError(NSError v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
