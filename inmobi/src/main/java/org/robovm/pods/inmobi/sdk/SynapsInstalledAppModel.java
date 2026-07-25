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
package org.robovm.pods.inmobi.sdk;

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
import org.robovm.apple.corelocation.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("InMobiSDK.SynapsInstalledAppModel")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/SynapsInstalledAppModel/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class SynapsInstalledAppModelPtr extends Ptr<SynapsInstalledAppModel, SynapsInstalledAppModelPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(SynapsInstalledAppModel.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected SynapsInstalledAppModel() {}
    protected SynapsInstalledAppModel(Handle h, long handle) { super(h, handle); }
    protected SynapsInstalledAppModel(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithId:domain:")
    public SynapsInstalledAppModel(String id, String domain) { super((SkipInit) null); initObject(init(id, domain)); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithId:domain:")
    protected native @Pointer long init(String id, String domain);
    /*</methods>*/
}
