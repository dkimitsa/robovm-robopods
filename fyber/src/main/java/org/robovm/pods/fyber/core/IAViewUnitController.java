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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/IAViewUnitController/*</name>*/ 
    extends /*<extends>*/IAUnitController/*</extends>*/ 
    /*<implements>*/implements IAInterfaceBuilder, IAViewUnitControllerBuilder/*</implements>*/ {

    /*<ptr>*/public static class IAViewUnitControllerPtr extends Ptr<IAViewUnitController, IAViewUnitControllerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(IAViewUnitController.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public IAViewUnitController() {}
    protected IAViewUnitController(Handle h, long handle) { super(h, handle); }
    protected IAViewUnitController(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "adView")
    public native IAAdView getAdView();
    @Property(selector = "unitDelegate")
    public native IAUnitDelegate getUnitDelegate();
    @Property(selector = "setUnitDelegate:", strongRef = true)
    public native void setUnitDelegate(IAUnitDelegate v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "showAdInParentView:")
    public native void showAdInParentView(UIView parentView);
    @Method(selector = "build:")
    public static native IAViewUnitController build(@Block VoidBlock1<IAViewUnitControllerBuilder> buildBlock);
    /*</methods>*/
}
