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
package org.robovm.pods.firebase.crashlytics;

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
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FIRCrashlytics/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class FIRCrashlyticsPtr extends Ptr<FIRCrashlytics, FIRCrashlyticsPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FIRCrashlytics.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected FIRCrashlytics() {}
    protected FIRCrashlytics(Handle h, long handle) { super(h, handle); }
    protected FIRCrashlytics(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "log:")
    public native void log(String msg);
    @Method(selector = "setCustomValue:forKey:")
    public native void setCustomValue(NSObject value, String key);
    @Method(selector = "setCustomKeysAndValues:")
    public native void setCustomKeysAndValues(NSDictionary<?, ?> keysAndValues);
    @Method(selector = "setUserID:")
    public native void setUserID(String userID);
    @Method(selector = "recordError:")
    public native void recordError(NSError error);
    @Method(selector = "recordError:userInfo:")
    public native void recordError(NSError error, NSDictionary<NSString, ?> userInfo);
    @Method(selector = "recordExceptionModel:")
    public native void recordExceptionModel(FIRExceptionModel exceptionModel);
    @Method(selector = "didCrashDuringPreviousExecution")
    public native boolean didCrashDuringPreviousExecution();
    @Method(selector = "setCrashlyticsCollectionEnabled:")
    public native void setCrashlyticsCollectionEnabled(boolean enabled);
    @Method(selector = "isCrashlyticsCollectionEnabled")
    public native boolean isCrashlyticsCollectionEnabled();
    @Method(selector = "checkForUnsentReportsWithCompletion:")
    public native void checkForUnsentReports(@Block VoidBooleanBlock completion);
    @Method(selector = "checkAndUpdateUnsentReportsWithCompletion:")
    public native void checkAndUpdateUnsentReports(@Block VoidBlock1<FIRCrashlyticsReport> completion);
    @Method(selector = "sendUnsentReports")
    public native void sendUnsentReports();
    @Method(selector = "deleteUnsentReports")
    public native void deleteUnsentReports();
    @Method(selector = "crashlytics")
    public static native FIRCrashlytics crashlytics();
    /*</methods>*/

    /*<manually-added>*/
    /**
     * Registers a default java uncaught exception handler that forwards exceptions Firebase using FIRExceptionModel
     * and pre-save java stack traces
     */
    public static void registerDefaultJavaUncaughtExceptionHandler() {
        Thread.setDefaultUncaughtExceptionHandler((thread, ex) -> {
            FIRExceptionModel model = new FIRExceptionModel(ex.getClass().getName(), ex.getMessage() != null ? ex.getMessage() : "");
            NSMutableArray<FIRStackFrame> modelFrames = new NSMutableArray<>();
            StackTraceElement[] stackTraces = ex.getStackTrace();
            if (stackTraces != null) {
                for (StackTraceElement st : stackTraces) {
                    String symbol = st.getClassName() + '.' + st.getMethodName();
                    String fileName;
                    int lineNo = st.getLineNumber();
                    if (lineNo < 0)
                        lineNo = 0;
                    if (st.isNativeMethod()) {
                        fileName = "Native Method";
                    } else {
                        fileName = st.getFileName();
                        if (fileName == null)
                            fileName = "Unknown Source";
                    }

                    FIRStackFrame frame = new FIRStackFrame(symbol, fileName, lineNo);
                    modelFrames.add(frame);
                }
            }
            model.setStackTrace(modelFrames);
            FIRCrashlytics.crashlytics().recordExceptionModel(model);

            // kill app
            throw new ThreadDeath();
        });
    }
    /*</manually-added>*/
}
