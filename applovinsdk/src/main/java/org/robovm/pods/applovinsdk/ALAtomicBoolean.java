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
package org.robovm.pods.applovinsdk;

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
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.safariservices.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ALAtomicBoolean/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class ALAtomicBooleanPtr extends Ptr<ALAtomicBoolean, ALAtomicBooleanPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ALAtomicBoolean.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public ALAtomicBoolean() {}
    protected ALAtomicBoolean(Handle h, long handle) { super(h, handle); }
    protected ALAtomicBoolean(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithValue:")
    public ALAtomicBoolean(boolean initialValue) { super((SkipInit) null); initObject(init(initialValue)); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "get")
    public native boolean get();
    @Method(selector = "set:")
    public native void set(boolean newValue);
    @Method(selector = "getAndSet:")
    public native boolean getAndSet(boolean newValue);
    @Method(selector = "compareAndSet:update:")
    public native boolean compareAndSet(boolean expect, boolean update);
    @Method(selector = "initWithValue:")
    protected native @Pointer long init(boolean initialValue);
    /*</methods>*/
}
