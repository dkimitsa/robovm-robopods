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
package org.robovm.pods.firebase.core;

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
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FIRTimestamp/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class FIRTimestampPtr extends Ptr<FIRTimestamp, FIRTimestampPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FIRTimestamp.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected FIRTimestamp(Handle h, long handle) { super(h, handle); }
    protected FIRTimestamp(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithSeconds:nanoseconds:")
    public FIRTimestamp(long seconds, int nanoseconds) { super((SkipInit) null); initObject(init(seconds, nanoseconds)); }
    public FIRTimestamp(NSDate date) { super((Handle) null, create(date)); retain(getHandle()); }
    public FIRTimestamp() { super((Handle) null, create()); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "seconds")
    public native long getSeconds();
    @Property(selector = "nanoseconds")
    public native int getNanoseconds();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithSeconds:nanoseconds:")
    protected native @Pointer long init(long seconds, int nanoseconds);
    @Method(selector = "dateValue")
    public native NSDate dateValue();
    @Method(selector = "compare:")
    public native NSComparisonResult compare(FIRTimestamp other);
    @Method(selector = "timestampWithDate:")
    protected static native @Pointer long create(NSDate date);
    @Method(selector = "timestamp")
    protected static native @Pointer long create();
    /*</methods>*/
}
