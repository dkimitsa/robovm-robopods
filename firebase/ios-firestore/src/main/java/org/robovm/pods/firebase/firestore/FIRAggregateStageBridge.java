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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FIRAggregateStageBridge/*</name>*/ 
    extends /*<extends>*/FIRStageBridge/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class FIRAggregateStageBridgePtr extends Ptr<FIRAggregateStageBridge, FIRAggregateStageBridgePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FIRAggregateStageBridge.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public FIRAggregateStageBridge() {}
    protected FIRAggregateStageBridge(Handle h, long handle) { super(h, handle); }
    protected FIRAggregateStageBridge(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithAccumulators:groups:")
    public FIRAggregateStageBridge(NSDictionary<NSString, FIRAggregateFunctionBridge> accumulators, NSDictionary<NSString, FIRExprBridge> groups) { super((SkipInit) null); initObject(init(accumulators, groups)); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithAccumulators:groups:")
    protected native @Pointer long init(NSDictionary<NSString, FIRAggregateFunctionBridge> accumulators, NSDictionary<NSString, FIRExprBridge> groups);
    /*</methods>*/
}
