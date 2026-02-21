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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FIRAddFieldsStageBridge/*</name>*/ 
    extends /*<extends>*/FIRStageBridge/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class FIRAddFieldsStageBridgePtr extends Ptr<FIRAddFieldsStageBridge, FIRAddFieldsStageBridgePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FIRAddFieldsStageBridge.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public FIRAddFieldsStageBridge() {}
    protected FIRAddFieldsStageBridge(Handle h, long handle) { super(h, handle); }
    protected FIRAddFieldsStageBridge(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithFields:")
    public FIRAddFieldsStageBridge(NSDictionary<NSString, FIRExprBridge> fields) { super((SkipInit) null); initObject(init(fields)); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithFields:")
    protected native @Pointer long init(NSDictionary<NSString, FIRExprBridge> fields);
    /*</methods>*/
}
