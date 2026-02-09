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
package org.robovm.pods.applovinsdk;

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
import org.robovm.apple.safariservices.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MACustomAdPlacer/*</name>*/ 
    extends /*<extends>*/MAAdPlacer/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MACustomAdPlacerPtr extends Ptr<MACustomAdPlacer, MACustomAdPlacerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MACustomAdPlacer.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MACustomAdPlacer() {}
    protected MACustomAdPlacer(Handle h, long handle) { super(h, handle); }
    protected MACustomAdPlacer(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithSettings:")
    public MACustomAdPlacer(MAAdPlacerSettings settings) { super(settings); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "lookAhead")
    public native @MachineSizedUInt long getLookAhead();
    @Property(selector = "setLookAhead:")
    public native void setLookAhead(@MachineSizedUInt long v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "pauseForUpdates:")
    public native void pauseForUpdates(@Block Runnable updates);
    /*</methods>*/
}
