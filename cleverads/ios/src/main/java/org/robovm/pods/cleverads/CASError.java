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
package org.robovm.pods.cleverads;

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
import org.robovm.apple.corelocation.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CASError/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CASErrorPtr extends Ptr<CASError, CASErrorPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CASError.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected CASError() {}
    protected CASError(Handle h, long handle) { super(h, handle); }
    protected CASError(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "code")
    public native CASErrorCode getCode();
    @Property(selector = "description")
    public native String getDescription();
    @Property(selector = "toError")
    public native NSError getToError();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "isEqual:")
    public native boolean isEqual(NSObject object);
    @Method(selector = "noConnection")
    public static native CASError noConnection();
    @Method(selector = "noFill")
    public static native CASError noFill();
    @Method(selector = "timeout")
    public static native CASError timeout();
    @Method(selector = "notReady")
    public static native CASError notReady();
    @Method(selector = "notInitialized")
    public static native CASError notInitialized();
    @Method(selector = "expired")
    public static native CASError expired();
    @Method(selector = "reachedCap")
    public static native CASError reachedCap();
    @Method(selector = "fromCode:")
    public static native CASError fromCode(@MachineSizedSInt long code);
    /**
     * @deprecated Not recomended to use
     */
    @Deprecated
    @Method(selector = "fromMessage:")
    public static native CASError fromMessage(String message);
    /*</methods>*/
}
