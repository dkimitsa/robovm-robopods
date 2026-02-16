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
package org.robovm.pods.ironsource;

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
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ISMetaData/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class ISMetaDataPtr extends Ptr<ISMetaData, ISMetaDataPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ISMetaData.class); }/*</bind>*/
    /*<constants>*/
    public static class Consts {
        public static final String CCPAKey = "do_not_sell";
        public static final String ISCOPPAKey = "is_child_directed";
        public static final String TestSuiteKey = "is_test_suite";
        public static final String IIQFKey = "iiqf";
        public static final String TrueValue = "true";
        public static final String FalseValue = "false";
        public static final String TestSuiteEnableValue = "enable";
        public static final String GoogleWaterMark = "google_water_mark";
    }
    /*</constants>*/
    /*<constructors>*/
    public ISMetaData() {}
    protected ISMetaData(Handle h, long handle) { super(h, handle); }
    protected ISMetaData(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithKey:andValues:")
    public ISMetaData(String key, NSMutableArray<?> values) { super((SkipInit) null); initObject(init(key, values)); }
    @Method(selector = "initWithKey:values:andValuesType:")
    public ISMetaData(String key, NSMutableArray<?> values, NSMutableArray<?> valuesType) { super((SkipInit) null); initObject(init(key, values, valuesType)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "key")
    public native String getKey();
    @Property(selector = "setKey:")
    public native void setKey(String v);
    @Property(selector = "values")
    public native NSMutableArray<?> getValues();
    @Property(selector = "setValues:")
    public native void setValues(NSMutableArray<?> v);
    @Property(selector = "valuesType")
    public native NSMutableArray<?> getValuesType();
    @Property(selector = "setValuesType:")
    public native void setValuesType(NSMutableArray<?> v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithKey:andValues:")
    protected native @Pointer long init(String key, NSMutableArray<?> values);
    @Method(selector = "initWithKey:values:andValuesType:")
    protected native @Pointer long init(String key, NSMutableArray<?> values, NSMutableArray<?> valuesType);
    /*</methods>*/
}
