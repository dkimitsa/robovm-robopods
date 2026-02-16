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
package org.robovm.pods.onesignal;

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
import org.robovm.apple.usernotifications.*;
import org.robovm.apple.uikit.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/OSLastLocation/*</name>*/ 
    extends /*<extends>*/Struct<OSLastLocation>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class OSLastLocationPtr extends Ptr<OSLastLocation, OSLastLocationPtr> {}/*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public OSLastLocation() {}
    public OSLastLocation(OSLocationCoordinate cords, double verticalAccuracy, double horizontalAccuracy) {
        this.setCords(cords);
        this.setVerticalAccuracy(verticalAccuracy);
        this.setHorizontalAccuracy(horizontalAccuracy);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native @ByVal OSLocationCoordinate getCords();
    @StructMember(0) public native OSLastLocation setCords(@ByVal OSLocationCoordinate cords);
    @StructMember(1) public native double getVerticalAccuracy();
    @StructMember(1) public native OSLastLocation setVerticalAccuracy(double verticalAccuracy);
    @StructMember(2) public native double getHorizontalAccuracy();
    @StructMember(2) public native OSLastLocation setHorizontalAccuracy(double horizontalAccuracy);
    /*</members>*/
    /*<methods>*//*</methods>*/
}
