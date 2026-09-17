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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FIRFieldValue/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class FIRFieldValuePtr extends Ptr<FIRFieldValue, FIRFieldValuePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FIRFieldValue.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected FIRFieldValue() {}
    protected FIRFieldValue(Handle h, long handle) { super(h, handle); }
    protected FIRFieldValue(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "fieldValueForDelete")
    public static native FIRFieldValue fieldValueForDelete();
    @Method(selector = "fieldValueForServerTimestamp")
    public static native FIRFieldValue fieldValueForServerTimestamp();
    @Method(selector = "fieldValueForArrayUnion:")
    public static native FIRFieldValue fieldValueForArrayUnion(NSArray<?> elements);
    @Method(selector = "fieldValueForArrayRemove:")
    public static native FIRFieldValue fieldValueForArrayRemove(NSArray<?> elements);
    @Method(selector = "fieldValueForDoubleIncrement:")
    public static native FIRFieldValue fieldValueForDoubleIncrement(double d);
    @Method(selector = "fieldValueForIntegerIncrement:")
    public static native FIRFieldValue fieldValueForIntegerIncrement(long l);
    @Method(selector = "fieldValueForDoubleMinimum:")
    public static native FIRFieldValue fieldValueForDoubleMinimum(double d);
    @Method(selector = "fieldValueForIntegerMinimum:")
    public static native FIRFieldValue fieldValueForIntegerMinimum(long l);
    @Method(selector = "fieldValueForDoubleMaximum:")
    public static native FIRFieldValue fieldValueForDoubleMaximum(double d);
    @Method(selector = "fieldValueForIntegerMaximum:")
    public static native FIRFieldValue fieldValueForIntegerMaximum(long l);
    @Method(selector = "vectorWithArray:")
    public static native FIRVectorValue vectorFromArray(NSArray<NSNumber> array);
    /*</methods>*/
}
