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
package org.robovm.pods.onesignal;

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
import org.robovm.apple.usernotifications.*;
import org.robovm.apple.uikit.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/OSInfluence/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class OSInfluencePtr extends Ptr<OSInfluence, OSInfluencePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(OSInfluence.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public OSInfluence() {}
    protected OSInfluence(Handle h, long handle) { super(h, handle); }
    protected OSInfluence(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithBuilder:")
    public OSInfluence(OSInfluenceBuilder builder) { super((SkipInit) null); initObject(init(builder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "influenceChannel")
    public native OSInfluenceChannel getInfluenceChannel();
    @Property(selector = "influenceType")
    public native OSInfluenceType getInfluenceType();
    @Property(selector = "ids")
    public native NSArray<?> getIds();
    @Property(selector = "setIds:")
    public native void setIds(NSArray<?> v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithBuilder:")
    protected native @Pointer long init(OSInfluenceBuilder builder);
    @Method(selector = "copy")
    public native OSInfluence copy();
    @Method(selector = "isAttributedInfluence")
    public native boolean isAttributedInfluence();
    @Method(selector = "isDirectInfluence")
    public native boolean isDirectInfluence();
    @Method(selector = "isIndirectInfluence")
    public native boolean isIndirectInfluence();
    @Method(selector = "isUnattributedInfluence")
    public native boolean isUnattributedInfluence();
    /*</methods>*/
}
