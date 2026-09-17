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
package org.robovm.pods.firebase.storage;

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
import org.robovm.apple.dispatch.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Marshaler(ValuedEnum.AsMachineSizedSIntMarshaler.class)/*</annotations>*/
public enum /*<name>*/FIRStorageErrorCode/*</name>*/ implements NSErrorCode {
    /*<values>*/
    Unknown(-13000L),
    ObjectNotFound(-13010L),
    BucketNotFound(-13011L),
    ProjectNotFound(-13012L),
    QuotaExceeded(-13013L),
    Unauthenticated(-13020L),
    Unauthorized(-13021L),
    RetryLimitExceeded(-13030L),
    NonMatchingChecksum(-13031L),
    DownloadSizeExceeded(-13032L),
    Cancelled(-13040L),
    InvalidArgument(-13050L),
    BucketMismatch(-13051L),
    InternalError(-13052L),
    PathError(-13053L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*/
    public static final String ErrorClassDomain = "FirebaseStorage.StorageErrorCode";
    /*</constants>*/
    /*<members>*//*</members>*/
    /*<methods>*//*</methods>*/

    /*<manually-added>*/
    private static String getClassDomain() {
        return ErrorClassDomain;
    }
    /*</manually-added>*/
    private final long n;

    private /*<name>*/FIRStorageErrorCode/*</name>*/(long n) { this.n = n; }
    public long value() { return n; }
    public static /*<name>*/FIRStorageErrorCode/*</name>*/ valueOf(long n) {
        for (/*<name>*/FIRStorageErrorCode/*</name>*/ v : values()) {
            if (v.n == n) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + n + " found in "
            + /*<name>*/FIRStorageErrorCode/*</name>*/.class.getName());
    }

    // bind wrap to include it in compilation as long as nserror enum is used 
    static { Bro.bind(NSErrorWrap.class); }
    @StronglyLinked
    public static class NSErrorWrap extends NSError {
        protected NSErrorWrap(SkipInit skipInit) {super(skipInit);}

        @Override public NSErrorCode getErrorCode() {
             try {
                 return  /*<name>*/FIRStorageErrorCode/*</name>*/.valueOf(getCode());
             } catch (IllegalArgumentException e) {
                 return null;
             }
         }

        public static String getClassDomain() {
            /** must be inserted in value section */
            return /*<name>*/FIRStorageErrorCode/*</name>*/.getClassDomain();
        }
    }
}
