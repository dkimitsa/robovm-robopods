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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/BranchCSSearchableItemAttributeSet/*</name>*/ 
    extends /*<extends>*/CSSearchableItemAttributeSet/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class BranchCSSearchableItemAttributeSetPtr extends Ptr<BranchCSSearchableItemAttributeSet, BranchCSSearchableItemAttributeSetPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(BranchCSSearchableItemAttributeSet.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public BranchCSSearchableItemAttributeSet() {}
    protected BranchCSSearchableItemAttributeSet(Handle h, long handle) { super(h, handle); }
    protected BranchCSSearchableItemAttributeSet(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "initWithContentType:")
    public static  BranchCSSearchableItemAttributeSet createWithContentType(UTType contentType) {
       BranchCSSearchableItemAttributeSet res = new BranchCSSearchableItemAttributeSet((SkipInit) null);
       res.initObject(res.initWithContentType(contentType));
       return res;
    }
    @Method(selector = "initWithItemContentType:")
    public BranchCSSearchableItemAttributeSet(String type) { super((SkipInit) null); initObject(init(type)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "params")
    public native NSDictionary<?, ?> getParams();
    @Property(selector = "setParams:")
    public native void setParams(NSDictionary<?, ?> v);
    @Property(selector = "keywords")
    public native NSSet<?> getKeywordsBNC();
    @Property(selector = "setKeywords:")
    public native void setKeywordsBNC(NSSet<?> v);
    @Property(selector = "publiclyIndexable")
    public native boolean isPubliclyIndexable();
    @Property(selector = "setPubliclyIndexable:")
    public native void setPubliclyIndexable(boolean v);
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "initWithContentType:")
    protected native @Pointer long initWithContentType(UTType contentType);
    @Method(selector = "initWithItemContentType:")
    protected native @Pointer long init(String type);
    @Method(selector = "indexWithCallback:")
    public native void index(@Block VoidBlock3<NSString, NSString, NSError> callback);
    /*</methods>*/
}
