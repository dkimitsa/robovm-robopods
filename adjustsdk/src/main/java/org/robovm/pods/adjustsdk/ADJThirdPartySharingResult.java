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
package org.robovm.pods.adjustsdk;

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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ADJThirdPartySharingResult/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class ADJThirdPartySharingResultPtr extends Ptr<ADJThirdPartySharingResult, ADJThirdPartySharingResultPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ADJThirdPartySharingResult.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public ADJThirdPartySharingResult() {}
    protected ADJThirdPartySharingResult(Handle h, long handle) { super(h, handle); }
    protected ADJThirdPartySharingResult(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithThirdPartySharingSettings:")
    public ADJThirdPartySharingResult(String thirdPartySharingSettingsJson) { super((SkipInit) null); initObject(init(thirdPartySharingSettingsJson)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "thirdPartySharingSettingsJson")
    public native String getThirdPartySharingSettingsJson();
    @Property(selector = "setThirdPartySharingSettingsJson:")
    public native void setThirdPartySharingSettingsJson(String v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithThirdPartySharingSettings:")
    protected native @Pointer long init(String thirdPartySharingSettingsJson);
    @Method(selector = "isEqualToThirdPartySharingResult:")
    public native boolean isEqualToThirdPartySharingResult(ADJThirdPartySharingResult thirdPartySharingResult);
    @Method(selector = "dictionary")
    public native NSDictionary<?, ?> dictionary();
    /*</methods>*/
}
