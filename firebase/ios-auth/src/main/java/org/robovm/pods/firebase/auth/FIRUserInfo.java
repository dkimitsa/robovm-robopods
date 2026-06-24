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
package org.robovm.pods.firebase.auth;

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
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/FIRUserInfo/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    @Property(selector = "providerID")
    String getProviderID();
    @Property(selector = "uid")
    String getUid();
    @Property(selector = "displayName")
    String getDisplayName();
    @Property(selector = "photoURL")
    NSURL getPhotoURL();
    @Property(selector = "email")
    String getEmail();
    @Property(selector = "phoneNumber")
    String getPhoneNumber();
    /*</properties>*/
    /*<methods>*/
    
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/

    /*<manually-added>*/
    // manually added code!
    class AsListMarshaller {
        @SuppressWarnings("unchecked")
        @MarshalsPointer
        public static List<FIRUserInfo> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSObject> o = (NSArray<NSObject>) NSObject.Marshaler.toObject(cls, handle, flags);
            if (o == null) {
                return null;
            }
            List<FIRUserInfo> list = new ArrayList<>();
            for (NSObject t : o) {
                FIRUserInfo tag = (FIRUserInfo) ObjCObject.Marshaler.protocolToObject(FIRUserInfo.class, t.getHandle(), 0);
                list.add(tag);
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<FIRUserInfo> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<?> array = new NSArray(l);
            return NSObject.Marshaler.toNative(array, flags);
        }
    }
    /*</manually-added>*/
}
