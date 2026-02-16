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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/IAUnitController/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements IAInterfaceUnitController/*</implements>*/ {

    /*<ptr>*/public static class IAUnitControllerPtr extends Ptr<IAUnitController, IAUnitControllerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(IAUnitController.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public IAUnitController() {}
    protected IAUnitController(Handle h, long handle) { super(h, handle); }
    protected IAUnitController(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "unitDelegate")
    public native IAUnitDelegate getUnitDelegate();
    @Property(selector = "setUnitDelegate:", strongRef = true)
    public native void setUnitDelegate(IAUnitDelegate v);
    @Property(selector = "activeContentController")
    public native IAContentController getActiveContentController();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "isReady")
    public native boolean isReady();
    @Method(selector = "clear")
    public native void clear();
    @Method(selector = "addSupportedContentController:")
    public native void addSupportedContentController(IAContentController supportedContentController);
    /*</methods>*/
}
