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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ISMetaDataUtils/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class ISMetaDataUtilsPtr extends Ptr<ISMetaDataUtils, ISMetaDataUtilsPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ISMetaDataUtils.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public ISMetaDataUtils() {}
    protected ISMetaDataUtils(Handle h, long handle) { super(h, handle); }
    protected ISMetaDataUtils(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "getValueTypeForKey:")
    public static native ISMetaDataValueTypes getValueTypeForKey(String key);
    @Method(selector = "isKnownKey:")
    public static native boolean isKnownKey(String key);
    @Method(selector = "isMediationOnlyKey:")
    public static native boolean isMediationOnlyKey(String key);
    @Method(selector = "formatValue:forType:")
    public static native String formatValue(String value, ISMetaDataValueTypes valueType);
    @Method(selector = "formatMetaDataKey:andValues:")
    public static native ISMetaData formatMetaDataKey(String key, NSMutableArray<?> values);
    @Method(selector = "isMetaDataKeyValid:error:")
    public static native boolean isMetaDataKeyValid(String key, NSString.NSStringPtr error);
    @Method(selector = "isMetaDataValuesValid:error:")
    public static native boolean isMetaDataValuesValid(NSMutableArray<?> values, NSString.NSStringPtr error);
    @Method(selector = "isValidCCPAMetaDataWithKey:andValue:")
    public static native boolean isValidCCPAMetaData(String key, String value);
    @Method(selector = "isValidMetaDataWithKey:flag:andValue:")
    public static native boolean isValidMetaData(String key, String flag, String value);
    @Method(selector = "getMetaDataBooleanValue:")
    public static native boolean getMetaDataBooleanValue(String value);
    /*</methods>*/
}
