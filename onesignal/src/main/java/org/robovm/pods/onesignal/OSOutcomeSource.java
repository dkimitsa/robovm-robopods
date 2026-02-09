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
package org.robovm.pods.onesignal;

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
import org.robovm.apple.usernotifications.*;
import org.robovm.apple.uikit.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/OSOutcomeSource/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class OSOutcomeSourcePtr extends Ptr<OSOutcomeSource, OSOutcomeSourcePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(OSOutcomeSource.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public OSOutcomeSource() {}
    protected OSOutcomeSource(Handle h, long handle) { super(h, handle); }
    protected OSOutcomeSource(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithDirectBody:indirectBody:")
    public OSOutcomeSource(OSOutcomeSourceBody directBody, OSOutcomeSourceBody indirectBody) { super((SkipInit) null); initObject(init(directBody, indirectBody)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "directBody")
    public native OSOutcomeSourceBody getDirectBody();
    @Property(selector = "setDirectBody:")
    public native void setDirectBody(OSOutcomeSourceBody v);
    @Property(selector = "indirectBody")
    public native OSOutcomeSourceBody getIndirectBody();
    @Property(selector = "setIndirectBody:")
    public native void setIndirectBody(OSOutcomeSourceBody v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithDirectBody:indirectBody:")
    protected native @Pointer long init(OSOutcomeSourceBody directBody, OSOutcomeSourceBody indirectBody);
    @Method(selector = "toDictionaryObject")
    public native NSDictionary<?, ?> toDictionaryObject();
    /*</methods>*/
}
