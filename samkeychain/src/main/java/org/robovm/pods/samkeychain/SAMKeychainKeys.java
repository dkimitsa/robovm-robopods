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
package org.robovm.pods.samkeychain;

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
/*<annotations>*/@Library(Library.INTERNAL)/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/SAMKeychainKeys/*</name>*/ 
    extends /*<extends>*/CocoaUtility/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/static { Bro.bind(SAMKeychainKeys.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @GlobalValue(symbol="kSAMKeychainAccountKey", optional=true)
    public static native String Account();
    @GlobalValue(symbol="kSAMKeychainCreatedAtKey", optional=true)
    public static native String CreatedAt();
    @GlobalValue(symbol="kSAMKeychainClassKey", optional=true)
    public static native String Class();
    @GlobalValue(symbol="kSAMKeychainDescriptionKey", optional=true)
    public static native String Description();
    @GlobalValue(symbol="kSAMKeychainLabelKey", optional=true)
    public static native String Label();
    @GlobalValue(symbol="kSAMKeychainLastModifiedKey", optional=true)
    public static native String LastModified();
    @GlobalValue(symbol="kSAMKeychainWhereKey", optional=true)
    public static native String Where();
    /*</methods>*/
}
