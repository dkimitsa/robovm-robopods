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
package org.robovm.pods.charts;

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
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ChartComponentBase/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class ChartComponentBasePtr extends Ptr<ChartComponentBase, ChartComponentBasePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ChartComponentBase.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public ChartComponentBase() {}
    protected ChartComponentBase(Handle h, long handle) { super(h, handle); }
    protected ChartComponentBase(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "enabled")
    public native boolean enabled();
    @Property(selector = "setEnabled:")
    public native void setEnabled(boolean v);
    @Property(selector = "xOffset")
    public native @MachineSizedFloat double getXOffset();
    @Property(selector = "setXOffset:")
    public native void setXOffset(@MachineSizedFloat double v);
    @Property(selector = "yOffset")
    public native @MachineSizedFloat double getYOffset();
    @Property(selector = "setYOffset:")
    public native void setYOffset(@MachineSizedFloat double v);
    @Property(selector = "isEnabled")
    public native boolean isEnabled();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
