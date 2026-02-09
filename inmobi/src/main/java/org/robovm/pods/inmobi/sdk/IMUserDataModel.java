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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("InMobiSDK.IMUserDataModel")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/IMUserDataModel/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class IMUserDataModelPtr extends Ptr<IMUserDataModel, IMUserDataModelPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(IMUserDataModel.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected IMUserDataModel() {}
    protected IMUserDataModel(Handle h, long handle) { super(h, handle); }
    protected IMUserDataModel(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithPhoneNumber:emailId:extras:")
    public IMUserDataModel(IMUserDataTypes phoneNumber, IMUserDataTypes emailId, NSDictionary<NSString, ?> extras) { super((SkipInit) null); initObject(init(phoneNumber, emailId, extras)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "phoneNumber")
    public native IMUserDataTypes getPhoneNumber();
    @Property(selector = "setPhoneNumber:")
    public native void setPhoneNumber(IMUserDataTypes v);
    @Property(selector = "emailId")
    public native IMUserDataTypes getEmailId();
    @Property(selector = "setEmailId:")
    public native void setEmailId(IMUserDataTypes v);
    @Property(selector = "extras")
    public native NSDictionary<NSString, ?> getExtras();
    @Property(selector = "setExtras:")
    public native void setExtras(NSDictionary<NSString, ?> v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithPhoneNumber:emailId:extras:")
    protected native @Pointer long init(IMUserDataTypes phoneNumber, IMUserDataTypes emailId, NSDictionary<NSString, ?> extras);
    @Method(selector = "isEqual:")
    public native boolean isEqual(NSObject other);
    /*</methods>*/
}
