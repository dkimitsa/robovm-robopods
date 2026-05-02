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
package org.robovm.pods.firebase.firestore;

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
import org.robovm.apple.dispatch.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FIRSearchStageBridge/*</name>*/ 
    extends /*<extends>*/FIRStageBridge/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class FIRSearchStageBridgePtr extends Ptr<FIRSearchStageBridge, FIRSearchStageBridgePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FIRSearchStageBridge.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public FIRSearchStageBridge() {}
    protected FIRSearchStageBridge(Handle h, long handle) { super(h, handle); }
    protected FIRSearchStageBridge(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithOptions:addFields:select:sort:")
    public FIRSearchStageBridge(NSDictionary<NSString, FIRExprBridge> options, NSDictionary<NSString, FIRExprBridge> add_fields, NSDictionary<NSString, FIRExprBridge> select, NSArray<FIROrderingBridge> sort) { super((SkipInit) null); initObject(init(options, add_fields, select, sort)); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithOptions:addFields:select:sort:")
    protected native @Pointer long init(NSDictionary<NSString, FIRExprBridge> options, NSDictionary<NSString, FIRExprBridge> add_fields, NSDictionary<NSString, FIRExprBridge> select, NSArray<FIROrderingBridge> sort);
    /*</methods>*/
}
