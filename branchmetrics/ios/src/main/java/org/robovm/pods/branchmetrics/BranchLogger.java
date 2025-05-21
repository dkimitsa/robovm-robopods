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
package org.robovm.pods.branchmetrics;

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
import org.robovm.apple.corespotlight.*;
import org.robovm.apple.uniformtypeid.*;
import org.robovm.apple.linkpresentation.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.storekit.*;
import org.robovm.apple.intents.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/BranchLogger/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class BranchLoggerPtr extends Ptr<BranchLogger, BranchLoggerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(BranchLogger.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public BranchLogger() {}
    protected BranchLogger(Handle h, long handle) { super(h, handle); }
    protected BranchLogger(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "loggingEnabled")
    public native boolean isLoggingEnabled();
    @Property(selector = "setLoggingEnabled:")
    public native void setLoggingEnabled(boolean v);
    @Property(selector = "includeCallerDetails")
    public native boolean isIncludeCallerDetails();
    @Property(selector = "setIncludeCallerDetails:")
    public native void setIncludeCallerDetails(boolean v);
    @Property(selector = "logCallback")
    public native @Block VoidBlock3<NSString, BranchLogLevel, NSError> getLogCallback();
    @Property(selector = "setLogCallback:")
    public native void setLogCallback(@Block VoidBlock3<NSString, BranchLogLevel, NSError> v);
    @Property(selector = "advancedLogCallback")
    public native @Block VoidBlock5<NSString, BranchLogLevel, NSError, NSMutableURLRequest, BNCServerResponse> getAdvancedLogCallback();
    @Property(selector = "setAdvancedLogCallback:")
    public native void setAdvancedLogCallback(@Block VoidBlock5<NSString, BranchLogLevel, NSError, NSMutableURLRequest, BNCServerResponse> v);
    @Property(selector = "logLevelThreshold")
    public native BranchLogLevel getLogLevelThreshold();
    @Property(selector = "setLogLevelThreshold:")
    public native void setLogLevelThreshold(BranchLogLevel v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "shouldLog:")
    public native boolean shouldLog(BranchLogLevel level);
    @Method(selector = "disableCallerDetails")
    public native void disableCallerDetails();
    @Method(selector = "logError:error:")
    public native void logError(String message, NSError error);
    @Method(selector = "logWarning:error:")
    public native void logWarning(String message, NSError error);
    @Method(selector = "logDebug:error:")
    public native void logDebug(String message, NSError error);
    @Method(selector = "logDebug:error:request:response:")
    public native void logDebug(String message, NSError error, NSMutableURLRequest request, BNCServerResponse response);
    @Method(selector = "logVerbose:error:")
    public native void logVerbose(String message, NSError error);
    @Method(selector = "shared")
    public static native BranchLogger shared();
    @Method(selector = "formatMessage:logLevel:error:")
    public static native String formatMessage(String message, BranchLogLevel logLevel, NSError error);
    /*</methods>*/
}
