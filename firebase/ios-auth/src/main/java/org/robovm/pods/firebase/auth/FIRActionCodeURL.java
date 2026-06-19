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
package org.robovm.pods.firebase.auth;

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
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FIRActionCodeURL/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class FIRActionCodeURLPtr extends Ptr<FIRActionCodeURL, FIRActionCodeURLPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FIRActionCodeURL.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected FIRActionCodeURL() {}
    protected FIRActionCodeURL(Handle h, long handle) { super(h, handle); }
    protected FIRActionCodeURL(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/

    /*<manually-added>*/
    // dkimitsa: manually added code due actionCodeURLWithLink is not -init
    public FIRActionCodeURL(String link) { super((SkipInit) null); initObject(init(link)); }
    /*</manually-added>*/

    /*<properties>*/
    @Property(selector = "APIKey")
    public native String getAPIKey();
    @Property(selector = "operation")
    public native FIRActionCodeOperation getOperation();
    @Property(selector = "code")
    public native String getCode();
    @Property(selector = "continueURL")
    public native NSURL getContinueURL();
    @Property(selector = "languageCode")
    public native String getLanguageCode();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "actionCodeURLWithLink:")
    protected native @Pointer long init(String link);
    /*</methods>*/
}
