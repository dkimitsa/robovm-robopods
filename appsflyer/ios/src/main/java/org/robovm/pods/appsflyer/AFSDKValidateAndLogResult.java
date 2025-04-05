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
package org.robovm.pods.appsflyer;

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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AFSDKValidateAndLogResult/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class AFSDKValidateAndLogResultPtr extends Ptr<AFSDKValidateAndLogResult, AFSDKValidateAndLogResultPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(AFSDKValidateAndLogResult.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected AFSDKValidateAndLogResult() {}
    protected AFSDKValidateAndLogResult(Handle h, long handle) { super(h, handle); }
    protected AFSDKValidateAndLogResult(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithStatus:result:errorData:error:")
    public AFSDKValidateAndLogResult(AFSDKValidateAndLogStatus status, NSDictionary<?, ?> result, NSDictionary<?, ?> errorData, NSError error) { super((SkipInit) null); initObject(init(status, result, errorData, error)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "status")
    public native AFSDKValidateAndLogStatus getStatus();
    @Property(selector = "result")
    public native NSDictionary<?, ?> getResult();
    @Property(selector = "errorData")
    public native NSDictionary<?, ?> getErrorData();
    @Property(selector = "error")
    public native NSError getError();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithStatus:result:errorData:error:")
    protected native @Pointer long init(AFSDKValidateAndLogStatus status, NSDictionary<?, ?> result, NSDictionary<?, ?> errorData, NSError error);
    /*</methods>*/
}
