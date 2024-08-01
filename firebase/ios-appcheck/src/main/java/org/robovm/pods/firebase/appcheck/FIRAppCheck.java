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
package org.robovm.pods.firebase.appcheck;

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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FIRAppCheck/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class FIRAppCheckPtr extends Ptr<FIRAppCheck, FIRAppCheckPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FIRAppCheck.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected FIRAppCheck() {}
    protected FIRAppCheck(Handle h, long handle) { super(h, handle); }
    protected FIRAppCheck(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "isTokenAutoRefreshEnabled")
    public native boolean isTokenAutoRefreshEnabled();
    @Property(selector = "setIsTokenAutoRefreshEnabled:")
    public native void setIsTokenAutoRefreshEnabled(boolean v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @GlobalValue(symbol="FIRAppCheckAppCheckTokenDidChangeNotification", optional=true)
    public static native String DidChangeNotification();
    @Library(Library.INTERNAL)
    public static class NotificationKeys {
        static { Bro.bind(NotificationKeys.class); }

        @GlobalValue(symbol="kFIRAppCheckTokenNotificationKey", optional=true)
        public static native String Token();
        @GlobalValue(symbol="kFIRAppCheckAppNameNotificationKey", optional=true)
        public static native String AppName();
    }
    
    @Method(selector = "tokenForcingRefresh:completion:")
    public native void tokenForcingRefresh(boolean forcingRefresh, @Block VoidBlock2<FIRAppCheckToken, NSError> handler);
    @Method(selector = "limitedUseTokenWithCompletion:")
    public native void limitedUseToken(@Block VoidBlock2<FIRAppCheckToken, NSError> handler);
    @Method(selector = "appCheck")
    public static native FIRAppCheck appCheck();
    @Method(selector = "appCheckWithApp:")
    public static native FIRAppCheck appCheck(org.robovm.pods.firebase.core.FIRApp firebaseApp);
    @Method(selector = "setAppCheckProviderFactory:")
    public static native void setAppCheckProviderFactory(FIRAppCheckProviderFactory factory);
    /*</methods>*/
}
