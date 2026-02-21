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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FIRPipelineBridge/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class FIRPipelineBridgePtr extends Ptr<FIRPipelineBridge, FIRPipelineBridgePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FIRPipelineBridge.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public FIRPipelineBridge() {}
    protected FIRPipelineBridge(Handle h, long handle) { super(h, handle); }
    protected FIRPipelineBridge(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithStages:db:")
    public FIRPipelineBridge(NSArray<FIRStageBridge> stages, FIRFirestore db) { super((SkipInit) null); initObject(init(stages, db)); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithStages:db:")
    protected native @Pointer long init(NSArray<FIRStageBridge> stages, FIRFirestore db);
    @Method(selector = "executeWithCompletion:")
    public native void execute(@Block VoidBlock2<__FIRPipelineSnapshotBridge, NSError> completion);
    @Method(selector = "createStageBridgesFromQuery:")
    public static native NSArray<FIRStageBridge> createStageBridgesFromQuery(FIRQuery query);
    /*</methods>*/
}
