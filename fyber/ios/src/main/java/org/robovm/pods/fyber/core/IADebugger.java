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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/IADebugger/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements IAInterfaceBuilder, IADebuggerBuilder/*</implements>*/ {

    /*<ptr>*/public static class IADebuggerPtr extends Ptr<IADebugger, IADebuggerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(IADebugger.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public IADebugger() {}
    protected IADebugger(Handle h, long handle) { super(h, handle); }
    protected IADebugger(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "server")
    public native String getServer();
    @Property(selector = "setServer:")
    public native void setServer(String v);
    @Property(selector = "database")
    public native String getDatabase();
    @Property(selector = "setDatabase:")
    public native void setDatabase(String v);
    @Property(selector = "mockResponsePath")
    public native String getMockResponsePath();
    @Property(selector = "setMockResponsePath:")
    public native void setMockResponsePath(String v);
    /**
     * @deprecated Deprecated, starting from 8.3.2
     */
    @Deprecated
    @Property(selector = "adReportingEnabled")
    public static native boolean isAdReportingEnabled();
    /**
     * @deprecated Deprecated, starting from 8.3.2
     */
    @Deprecated
    @Property(selector = "setAdReportingEnabled:")
    public static native void setAdReportingEnabled(boolean v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "build:")
    public static native IADebugger build(@Block VoidBlock1<IADebuggerBuilder> buildBlock);
    /*</methods>*/
}
