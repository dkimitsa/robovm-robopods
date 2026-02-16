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
package org.robovm.pods.unityads;

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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/USRVInitializeStateFactory/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class USRVInitializeStateFactoryPtr extends Ptr<USRVInitializeStateFactory, USRVInitializeStateFactoryPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(USRVInitializeStateFactory.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public USRVInitializeStateFactory() {}
    protected USRVInitializeStateFactory(Handle h, long handle) { super(h, handle); }
    protected USRVInitializeStateFactory(SkipInit skipInit) { super(skipInit); }
    public USRVInitializeStateFactory(NSObject configurationLoader, NSObject configReader) { super((Handle) null, create(configurationLoader, configReader)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "stateFor:")
    public native USRVInitializeTask stateFor(USRVInitializeStateType type);
    @Method(selector = "newWithBuilder:andConfigReader:")
    protected static native @Pointer long create(NSObject configurationLoader, NSObject configReader);
    /*</methods>*/
}
