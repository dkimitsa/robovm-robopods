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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/OneSignalReceiveReceiptsController/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class OneSignalReceiveReceiptsControllerPtr extends Ptr<OneSignalReceiveReceiptsController, OneSignalReceiveReceiptsControllerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(OneSignalReceiveReceiptsController.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public OneSignalReceiveReceiptsController() {}
    protected OneSignalReceiveReceiptsController(Handle h, long handle) { super(h, handle); }
    protected OneSignalReceiveReceiptsController(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "sendReceiveReceiptWithNotificationId:")
    public native void sendReceiveReceipt(String notificationId);
    @Method(selector = "sendReceiveReceiptWithPlayerId:notificationId:appId:")
    public native void sendReceiveReceipt(String playerId, String notificationId, String appId);
    @Method(selector = "sendReceiveReceiptWithPlayerId:notificationId:appId:successBlock:failureBlock:")
    public native void sendReceiveReceipt(String playerId, String notificationId, String appId, @Block VoidBlock1<NSDictionary<?, ?>> success, @Block VoidBlock1<NSError> failure);
    @Method(selector = "sendReceiveReceiptWithPlayerId:notificationId:appId:delay:successBlock:failureBlock:")
    public native void sendReceiveReceipt(String playerId, String notificationId, String appId, int delay, @Block VoidBlock1<NSDictionary<?, ?>> success, @Block VoidBlock1<NSError> failure);
    /*</methods>*/
}
