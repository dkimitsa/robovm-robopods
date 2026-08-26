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
package org.robovm.pods.singular;

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
import org.robovm.apple.webkit.*;
import org.robovm.apple.uikit.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/SingularUserDetails/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class SingularUserDetailsPtr extends Ptr<SingularUserDetails, SingularUserDetailsPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(SingularUserDetails.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public SingularUserDetails() {}
    protected SingularUserDetails(Handle h, long handle) { super(h, handle); }
    protected SingularUserDetails(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "setEmail:")
    public native void setEmail(String email);
    @Method(selector = "setPhoneNumber:")
    public native void setPhoneNumber(String phoneNumber);
    @Method(selector = "getEmail")
    public native String getEmail();
    @Method(selector = "getPhoneNumber")
    public native String getPhoneNumber();
    @Method(selector = "setEmailSTD:")
    public native void setEmailSTD(String hashedEmail);
    @Method(selector = "setEmailNoDots:")
    public native void setEmailNoDots(String hashedEmail);
    @Method(selector = "setPhoneE164:")
    public native void setPhoneE164(String hashedPhone);
    @Method(selector = "setPhoneDigits:")
    public native void setPhoneDigits(String hashedPhone);
    @Method(selector = "getEmailSTD")
    public native String getEmailSTD();
    @Method(selector = "getEmailNoDots")
    public native String getEmailNoDots();
    @Method(selector = "getPhoneE164")
    public native String getPhoneE164();
    @Method(selector = "getPhoneDigits")
    public native String getPhoneDigits();
    /*</methods>*/
}
