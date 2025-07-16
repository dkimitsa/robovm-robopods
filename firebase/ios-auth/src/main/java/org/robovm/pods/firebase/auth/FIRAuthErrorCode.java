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
/*<annotations>*/@Marshaler(ValuedEnum.AsMachineSizedSIntMarshaler.class) @Library(Library.INTERNAL)/*</annotations>*/
public enum /*<name>*/FIRAuthErrorCode/*</name>*/ implements NSErrorCode {
    /*<values>*/
    InvalidCustomToken(17000L),
    CustomTokenMismatch(17002L),
    InvalidCredential(17004L),
    UserDisabled(17005L),
    OperationNotAllowed(17006L),
    EmailAlreadyInUse(17007L),
    InvalidEmail(17008L),
    WrongPassword(17009L),
    TooManyRequests(17010L),
    UserNotFound(17011L),
    AccountExistsWithDifferentCredential(17012L),
    RequiresRecentLogin(17014L),
    ProviderAlreadyLinked(17015L),
    NoSuchProvider(17016L),
    InvalidUserToken(17017L),
    NetworkError(17020L),
    UserTokenExpired(17021L),
    InvalidAPIKey(17023L),
    UserMismatch(17024L),
    CredentialAlreadyInUse(17025L),
    WeakPassword(17026L),
    AppNotAuthorized(17028L),
    ExpiredActionCode(17029L),
    InvalidActionCode(17030L),
    InvalidMessagePayload(17031L),
    InvalidSender(17032L),
    InvalidRecipientEmail(17033L),
    MissingEmail(17034L),
    MissingIosBundleID(17036L),
    MissingAndroidPackageName(17037L),
    UnauthorizedDomain(17038L),
    InvalidContinueURI(17039L),
    MissingContinueURI(17040L),
    MissingPhoneNumber(17041L),
    InvalidPhoneNumber(17042L),
    MissingVerificationCode(17043L),
    InvalidVerificationCode(17044L),
    MissingVerificationID(17045L),
    InvalidVerificationID(17046L),
    MissingAppCredential(17047L),
    InvalidAppCredential(17048L),
    SessionExpired(17051L),
    QuotaExceeded(17052L),
    MissingAppToken(17053L),
    NotificationNotForwarded(17054L),
    AppNotVerified(17055L),
    CaptchaCheckFailed(17056L),
    WebContextAlreadyPresented(17057L),
    WebContextCancelled(17058L),
    AppVerificationUserInteractionFailure(17059L),
    InvalidClientID(17060L),
    WebNetworkRequestFailed(17061L),
    WebInternalError(17062L),
    WebSignInUserInteractionFailure(17063L),
    LocalPlayerNotAuthenticated(17066L),
    NullUser(17067L),
    InvalidProviderID(17071L),
    TenantIDMismatch(17072L),
    UnsupportedTenantOperation(17073L),
    InvalidHostingLinkDomain(17214L),
    RejectedCredential(17075L),
    GameKitNotLinked(17076L),
    SecondFactorRequired(17078L),
    MissingMultiFactorSession(17081L),
    MissingMultiFactorInfo(17082L),
    InvalidMultiFactorSession(17083L),
    MultiFactorInfoNotFound(17084L),
    AdminRestrictedOperation(17085L),
    UnverifiedEmail(17086L),
    SecondFactorAlreadyEnrolled(17087L),
    MaximumSecondFactorCountExceeded(17088L),
    UnsupportedFirstFactor(17089L),
    EmailChangeNeedsVerification(17090L),
    MissingClientIdentifier(17093L),
    MissingOrInvalidNonce(17094L),
    BlockingCloudFunctionError(17105L),
    RecaptchaNotEnabled(17200L),
    MissingRecaptchaToken(17201L),
    InvalidRecaptchaToken(17202L),
    InvalidRecaptchaAction(17203L),
    MissingClientType(17204L),
    MissingRecaptchaVersion(17205L),
    InvalidRecaptchaVersion(17206L),
    InvalidReqType(17207L),
    RecaptchaSDKNotLinked(17208L),
    RecaptchaSiteKeyMissing(17209L),
    RecaptchaActionCreationFailed(17210L),
    KeychainError(17995L),
    InternalError(17999L),
    MalformedJWT(18000L);
    /*</values>*/

    /*<bind>*/static { Bro.bind(FIRAuthErrorCode.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @GlobalValue(symbol="FIRAuthErrorDomain", optional=true)
    public static native String getClassDomain();
    /*</methods>*/

    private final long n;

    private /*<name>*/FIRAuthErrorCode/*</name>*/(long n) { this.n = n; }
    public long value() { return n; }
    public static /*<name>*/FIRAuthErrorCode/*</name>*/ valueOf(long n) {
        for (/*<name>*/FIRAuthErrorCode/*</name>*/ v : values()) {
            if (v.n == n) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + n + " found in "
            + /*<name>*/FIRAuthErrorCode/*</name>*/.class.getName());
    }

    // bind wrap to include it in compilation as long as nserror enum is used 
    static { Bro.bind(NSErrorWrap.class); }
    @StronglyLinked
    public static class NSErrorWrap extends NSError {
        protected NSErrorWrap(SkipInit skipInit) {super(skipInit);}

        @Override public NSErrorCode getErrorCode() {
             try {
                 return  /*<name>*/FIRAuthErrorCode/*</name>*/.valueOf(getCode());
             } catch (IllegalArgumentException e) {
                 return null;
             }
         }

        public static String getClassDomain() {
            /** must be inserted in value section */
            return /*<name>*/FIRAuthErrorCode/*</name>*/.getClassDomain();
        }
    }
}
