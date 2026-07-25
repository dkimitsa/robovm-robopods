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
package org.robovm.pods.firebase.googlesignin;

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
import org.robovm.apple.dispatch.*;
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GIDClaim/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class GIDClaimPtr extends Ptr<GIDClaim, GIDClaimPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GIDClaim.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected GIDClaim() {}
    protected GIDClaim(Handle h, long handle) { super(h, handle); }
    protected GIDClaim(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "name")
    public native String getName();
    @Property(selector = "isEssential")
    public native boolean isEssential();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @GlobalValue(symbol="kAuthTimeClaimName", optional=true)
    public static native String AuthTimeClaimName();
    @GlobalValue(symbol="kAMRClaimName", optional=true)
    public static native String AMRClaimName();
    
    @Method(selector = "authTimeClaim")
    public static native GIDClaim authTimeClaim();
    @Method(selector = "essentialAuthTimeClaim")
    public static native GIDClaim essentialAuthTimeClaim();
    @Method(selector = "AMRClaim")
    public static native GIDClaim AMRClaim();
    @Method(selector = "essentialAMRClaim")
    public static native GIDClaim essentialAMRClaim();
    /*</methods>*/
}
