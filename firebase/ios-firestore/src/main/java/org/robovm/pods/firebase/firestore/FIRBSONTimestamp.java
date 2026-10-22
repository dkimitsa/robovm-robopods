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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FIRBSONTimestamp/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class FIRBSONTimestampPtr extends Ptr<FIRBSONTimestamp, FIRBSONTimestampPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FIRBSONTimestamp.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected FIRBSONTimestamp() {}
    protected FIRBSONTimestamp(Handle h, long handle) { super(h, handle); }
    protected FIRBSONTimestamp(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithSeconds:increment:")
    public FIRBSONTimestamp(int seconds, int increment) { super((SkipInit) null); initObject(init(seconds, increment)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "seconds")
    public native int getSeconds();
    @Property(selector = "increment")
    public native int getIncrement();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithSeconds:increment:")
    protected native @Pointer long init(int seconds, int increment);
    @Method(selector = "isEqual:")
    public native boolean isEqual(NSObject object);
    /*</methods>*/
}
