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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("InMobiSDK.IMIncludeIds")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/IMIncludeIds/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class IMIncludeIdsPtr extends Ptr<IMIncludeIds, IMIncludeIdsPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(IMIncludeIds.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public IMIncludeIds() {}
    protected IMIncludeIds(Handle h, long handle) { super(h, handle); }
    protected IMIncludeIds(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "O1")
    public native boolean isO1();
    @Property(selector = "setO1:")
    public native void setO1(boolean v);
    @Property(selector = "SO1")
    public native boolean isSO1();
    @Property(selector = "setSO1:")
    public native void setSO1(boolean v);
    @Property(selector = "IDA")
    public native boolean isIDA();
    @Property(selector = "setIDA:")
    public native void setIDA(boolean v);
    @Property(selector = "IDV")
    public native boolean isIDV();
    @Property(selector = "setIDV:")
    public native void setIDV(boolean v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "toDictionary")
    public native NSDictionary<NSString, ?> toDictionary();
    /*</methods>*/
}
