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
package org.robovm.pods.firebase.appcheck;

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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FIRAppCheckToken/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class FIRAppCheckTokenPtr extends Ptr<FIRAppCheckToken, FIRAppCheckTokenPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FIRAppCheckToken.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected FIRAppCheckToken() {}
    protected FIRAppCheckToken(Handle h, long handle) { super(h, handle); }
    protected FIRAppCheckToken(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithToken:expirationDate:")
    public FIRAppCheckToken(String token, NSDate expirationDate) { super((SkipInit) null); initObject(init(token, expirationDate)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "token")
    public native String getToken();
    @Property(selector = "expirationDate")
    public native NSDate getExpirationDate();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithToken:expirationDate:")
    protected native @Pointer long init(String token, NSDate expirationDate);
    /*</methods>*/
}
