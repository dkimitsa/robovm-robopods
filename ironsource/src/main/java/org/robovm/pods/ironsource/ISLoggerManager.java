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
package org.robovm.pods.ironsource;

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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ISLoggerManager/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class ISLoggerManagerPtr extends Ptr<ISLoggerManager, ISLoggerManagerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ISLoggerManager.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public ISLoggerManager() {}
    protected ISLoggerManager(Handle h, long handle) { super(h, handle); }
    protected ISLoggerManager(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "setLoggingLevels:publisher:console:")
    public native void setLoggingLevels(@MachineSizedSInt long server, @MachineSizedSInt long publisher, @MachineSizedSInt long console);
    @Method(selector = "log:level:tag:")
    public native void log(String message, LogLevelValues logLevel, LogTagValue logTag);
    @Method(selector = "logFromError:level:tag:")
    public native void log(NSError error, LogLevelValues logLevel, LogTagValue logTag);
    @Method(selector = "logFromException:level:tag:")
    public native void log(NSException exception, LogLevelValues logLevel, LogTagValue logTag);
    @Method(selector = "logFromException:message:level:tag:")
    public native void log(NSException exception, String message, LogLevelValues logLevel, LogTagValue logTag);
    @Method(selector = "dynamicLog:message:level:withTag:")
    public native void dynamicLog(BytePtr calledFrom, String message, LogLevelValues logLevel, LogTagValue logTag);
    @Method(selector = "automationLog:level:withTag:")
    public native void automationLog(String message, LogLevelValues logLevel, LogTagValue logTag);
    @Method(selector = "sharedInstance")
    public static native ISLoggerManager sharedInstance();
    /*</methods>*/
}
