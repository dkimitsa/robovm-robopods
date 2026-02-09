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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ISAInitRequestBuilder/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class ISAInitRequestBuilderPtr extends Ptr<ISAInitRequestBuilder, ISAInitRequestBuilderPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ISAInitRequestBuilder.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected ISAInitRequestBuilder() {}
    protected ISAInitRequestBuilder(Handle h, long handle) { super(h, handle); }
    protected ISAInitRequestBuilder(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithAppKey:")
    public ISAInitRequestBuilder(String appKey) { super((SkipInit) null); initObject(init(appKey)); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithAppKey:")
    protected native @Pointer long init(String appKey);
    @Method(selector = "build")
    public native ISAInitRequest build();
    @Method(selector = "withLegacyAdFormats:")
    public native ISAInitRequestBuilder withLegacyAdFormats(NSArray<ISAAdFormat> legacyAdFormats);
    @Method(selector = "withLogLevel:")
    public native ISAInitRequestBuilder withLogLevel(ISALogLevel logLevel);
    /*</methods>*/
}
