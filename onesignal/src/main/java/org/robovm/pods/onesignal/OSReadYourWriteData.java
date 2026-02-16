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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("OneSignalOSCore.OSReadYourWriteData")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/OSReadYourWriteData/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class OSReadYourWriteDataPtr extends Ptr<OSReadYourWriteData, OSReadYourWriteDataPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(OSReadYourWriteData.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected OSReadYourWriteData() {}
    protected OSReadYourWriteData(Handle h, long handle) { super(h, handle); }
    protected OSReadYourWriteData(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithRywToken:rywDelay:")
    public OSReadYourWriteData(String rywToken, NSNumber rywDelay) { super((SkipInit) null); initObject(init(rywToken, rywDelay)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "rywToken")
    public native String getRywToken();
    @Property(selector = "rywDelay")
    public native NSNumber getRywDelay();
    @Property(selector = "hash")
    public native @MachineSizedUInt long getHash();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithRywToken:rywDelay:")
    protected native @Pointer long init(String rywToken, NSNumber rywDelay);
    @Method(selector = "isEqual:")
    public native boolean isEqual(NSObject object);
    /*</methods>*/
}
