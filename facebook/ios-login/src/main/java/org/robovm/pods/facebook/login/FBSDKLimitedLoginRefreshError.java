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
package org.robovm.pods.facebook.login;

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
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.coreanimation.*;
import org.robovm.pods.facebook.core.*;
import org.robovm.pods.facebook.corebasics.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Marshaler(ValuedEnum.AsMachineSizedSIntMarshaler.class)/*</annotations>*/
public enum /*<name>*/FBSDKLimitedLoginRefreshError/*</name>*/ implements NSErrorCode {
    /*<values>*/
    NoCurrentToken(0L),
    NotLimitedLogin(1L),
    LoginRequired(2L),
    ConsentRequired(3L),
    UserMismatch(4L),
    NetworkError(5L),
    Timeout(6L),
    RateLimited(7L),
    InvalidResponse(8L),
    Cancelled(9L),
    FeatureDisabled(10L),
    UnsupportedPlatform(11L),
    NotDPoPBound(12L),
    DpopKeyGenerationFailed(13L),
    Unknown(14L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*/
    public static final String ErrorDomain = "FBSDKLoginKit.LimitedLoginRefreshError";
    /*</constants>*/
    /*<members>*//*</members>*/
    /*<methods>*//*</methods>*/

    /*<manually-added>*/
    public static String getClassDomain() {
        return ErrorDomain;
    }
    /*</manually-added>*/

    private final long n;

    private /*<name>*/FBSDKLimitedLoginRefreshError/*</name>*/(long n) { this.n = n; }
    public long value() { return n; }
    public static /*<name>*/FBSDKLimitedLoginRefreshError/*</name>*/ valueOf(long n) {
        for (/*<name>*/FBSDKLimitedLoginRefreshError/*</name>*/ v : values()) {
            if (v.n == n) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + n + " found in "
            + /*<name>*/FBSDKLimitedLoginRefreshError/*</name>*/.class.getName());
    }

    // bind wrap to include it in compilation as long as nserror enum is used 
    static { Bro.bind(NSErrorWrap.class); }
    @StronglyLinked
    public static class NSErrorWrap extends NSError {
        protected NSErrorWrap(SkipInit skipInit) {super(skipInit);}

        @Override public NSErrorCode getErrorCode() {
             try {
                 return  /*<name>*/FBSDKLimitedLoginRefreshError/*</name>*/.valueOf(getCode());
             } catch (IllegalArgumentException e) {
                 return null;
             }
         }

        public static String getClassDomain() {
            /** must be inserted in value section */
            return /*<name>*/FBSDKLimitedLoginRefreshError/*</name>*/.getClassDomain();
        }
    }
}
