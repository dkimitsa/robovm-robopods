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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/BranchActivityItemProvider/*</name>*/ 
    extends /*<extends>*/UIActivityItemProvider/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class BranchActivityItemProviderPtr extends Ptr<BranchActivityItemProvider, BranchActivityItemProviderPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(BranchActivityItemProvider.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected BranchActivityItemProvider() {}
    protected BranchActivityItemProvider(Handle h, long handle) { super(h, handle); }
    protected BranchActivityItemProvider(SkipInit skipInit) { super(skipInit); }
    /**
     * @deprecated Use the delegate method instead
     */
    @Deprecated
    @Method(selector = "initWithParams:andTags:andFeature:andStage:andAlias:")
    public BranchActivityItemProvider(NSDictionary<?, ?> params, NSArray<?> tags, String feature, String stage, String alias) { super((SkipInit) null); initObject(init(params, tags, feature, stage, alias)); }
    @Method(selector = "initWithParams:tags:feature:stage:campaign:alias:delegate:")
    public BranchActivityItemProvider(NSDictionary<?, ?> params, NSArray<?> tags, String feature, String stage, String campaign, String alias, BranchActivityItemProviderDelegate delegate) { super((SkipInit) null); initObject(init(params, tags, feature, stage, campaign, alias, delegate)); }
    @Method(selector = "initWithPlaceholderItem:")
    public BranchActivityItemProvider(NSObject placeholderItem) { super(placeholderItem); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @deprecated Use the delegate method instead
     */
    @Deprecated
    @Method(selector = "initWithParams:andTags:andFeature:andStage:andAlias:")
    protected native @Pointer long init(NSDictionary<?, ?> params, NSArray<?> tags, String feature, String stage, String alias);
    @Method(selector = "initWithParams:tags:feature:stage:campaign:alias:delegate:")
    protected native @Pointer long init(NSDictionary<?, ?> params, NSArray<?> tags, String feature, String stage, String campaign, String alias, BranchActivityItemProviderDelegate delegate);
    @Method(selector = "humanReadableChannelWithActivityType:")
    public static native String getHumanReadableChannel(String activityString);
    /*</methods>*/
}
