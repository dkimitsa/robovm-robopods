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
package org.robovm.pods.tenjin;

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
import org.robovm.apple.storekit.*;
import org.robovm.apple.coredata.*;
import org.robovm.apple.dispatch.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/TenjinIAPHelper/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements SKProductsRequestDelegate/*</implements>*/ {

    /*<ptr>*/public static class TenjinIAPHelperPtr extends Ptr<TenjinIAPHelper, TenjinIAPHelperPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(TenjinIAPHelper.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public TenjinIAPHelper() {}
    protected TenjinIAPHelper(Handle h, long handle) { super(h, handle); }
    protected TenjinIAPHelper(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "getProductFor:withCompletion:")
    public native void getProduct(String productIdentifier, @Block VoidBlock1<SKProduct> completion);
    @Method(selector = "extractPropertiesFromProduct:to:")
    public static native void extractProperties(SKProduct product, NSMutableDictionary<?, ?> props);
    @Method(selector = "productsRequest:didReceiveResponse:")
    public native void didReceiveResponse(SKProductsRequest request, SKProductsResponse response);
    @Method(selector = "requestDidFinish:")
    public native void didFinish(SKRequest request);
    @Method(selector = "request:didFailWithError:")
    public native void didFail(SKRequest request, NSError error);
    /*</methods>*/
}
