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
package org.robovm.pods.fyber.core;

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
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.dispatch.*;
import org.robovm.apple.coregraphics.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/IAAdRequest/*</name>*/ 
    extends /*<extends>*/IARequest/*</extends>*/ 
    /*<implements>*/implements IAInterfaceBuilder, IAAdRequestBuilder/*</implements>*/ {

    /*<ptr>*/public static class IAAdRequestPtr extends Ptr<IAAdRequest, IAAdRequestPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(IAAdRequest.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public IAAdRequest() {}
    protected IAAdRequest(Handle h, long handle) { super(h, handle); }
    protected IAAdRequest(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "unitID")
    public native String getUnitID();
    /**
     * @deprecated This API is deprecated as of version 8.3.5 and will be removed in a future release.
     */
    @Deprecated
    @Property(selector = "useSecureConnections")
    public native boolean isUseSecureConnections();
    /**
     * @deprecated This API is deprecated as of version 8.3.5 and will be removed in a future release.
     */
    @Deprecated
    @Property(selector = "setUseSecureConnections:")
    public native void setUseSecureConnections(boolean v);
    @Property(selector = "spotID")
    public native String getSpotID();
    @Property(selector = "setSpotID:")
    public native void setSpotID(String v);
    @Property(selector = "timeout")
    public native double getTimeout();
    @Property(selector = "setTimeout:")
    public native void setTimeout(double v);
    @Property(selector = "debugger")
    public native IADebugger getDebugger();
    @Property(selector = "setDebugger:")
    public native void setDebugger(IADebugger v);
    @Property(selector = "subtypeDescription")
    public native IAInterfaceAdDescription getSubtypeDescription();
    @Property(selector = "setSubtypeDescription:")
    public native void setSubtypeDescription(IAInterfaceAdDescription v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "build:")
    public static native IAAdRequest build(@Block VoidBlock1<IAAdRequestBuilder> buildBlock);
    /*</methods>*/
}
