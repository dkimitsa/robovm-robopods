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
package org.robovm.pods.google.mobileads;

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
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.storekit.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.webkit.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GADQueryInfo/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class GADQueryInfoPtr extends Ptr<GADQueryInfo, GADQueryInfoPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GADQueryInfo.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public GADQueryInfo() {}
    protected GADQueryInfo(Handle h, long handle) { super(h, handle); }
    protected GADQueryInfo(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "query")
    public native String getQuery();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @deprecated Use +[GADMobileAds generateSignal:completionHandler:] instead.
     */
    @Deprecated
    @Method(selector = "createQueryInfoWithRequest:adFormat:completionHandler:")
    public static native void createQueryInfo(GADRequest request, GADAdFormat adFormat, @Block VoidBlock2<GADQueryInfo, NSError> completionHandler);
    /**
     * @deprecated Use +[GADMobileAds generateSignal:completionHandler:] instead. Set adUnitID in the GADSignalRequest subclass.
     */
    @Deprecated
    @Method(selector = "createQueryInfoWithRequest:adFormat:adUnitID:completionHandler:")
    public static native void createQueryInfo(GADRequest request, GADAdFormat adFormat, String adUnitID, @Block VoidBlock2<GADQueryInfo, NSError> completionHandler);
    /*</methods>*/
}
