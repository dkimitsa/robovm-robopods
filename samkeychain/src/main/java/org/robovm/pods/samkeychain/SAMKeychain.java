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
package org.robovm.pods.samkeychain;

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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/SAMKeychain/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class SAMKeychainPtr extends Ptr<SAMKeychain, SAMKeychainPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(SAMKeychain.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public SAMKeychain() {}
    protected SAMKeychain(Handle h, long handle) { super(h, handle); }
    protected SAMKeychain(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "passwordForService:account:")
    public static native String passwordForService(String serviceName, String account);
    public static String passwordForServiceWithError(String serviceName, String account) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       String result = passwordForServiceWithError(serviceName, account, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "passwordForService:account:error:")
    private static native String passwordForServiceWithError(String serviceName, String account, NSError.NSErrorPtr error);
    @Method(selector = "passwordDataForService:account:")
    public static native NSData passwordDataForService(String serviceName, String account);
    @Method(selector = "passwordDataForService:account:error:")
    public static native NSData passwordDataForService(String serviceName, String account, NSError.NSErrorPtr error);
    @Method(selector = "deletePasswordForService:account:")
    public static native boolean deletePasswordForService(String serviceName, String account);
    public static boolean deletePasswordForServiceWithError(String serviceName, String account) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = deletePasswordForServiceWithError(serviceName, account, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "deletePasswordForService:account:error:")
    private static native boolean deletePasswordForServiceWithError(String serviceName, String account, NSError.NSErrorPtr error);
    @Method(selector = "setPassword:forService:account:")
    public static native boolean setPassword(String password, String serviceName, String account);
    public static boolean setPasswordWithError(String password, String serviceName, String account) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = setPasswordWithError(password, serviceName, account, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "setPassword:forService:account:error:")
    private static native boolean setPasswordWithError(String password, String serviceName, String account, NSError.NSErrorPtr error);
    @Method(selector = "setPasswordData:forService:account:")
    public static native boolean setPasswordData(NSData password, String serviceName, String account);
    public static boolean setPasswordDataWithError(NSData password, String serviceName, String account) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = setPasswordDataWithError(password, serviceName, account, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "setPasswordData:forService:account:error:")
    private static native boolean setPasswordDataWithError(NSData password, String serviceName, String account, NSError.NSErrorPtr error);
    @Method(selector = "allAccounts")
    public static native NSArray<?> allAccounts();
    @Method(selector = "allAccounts:")
    public static native NSArray<?> allAccounts(NSError.NSErrorPtr error);
    @Method(selector = "accountsForService:")
    public static native NSArray<?> accountsForService(String serviceName);
    public static NSArray<?> accountsForServiceWithError(String serviceName) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       NSArray<?> result = accountsForServiceWithError(serviceName, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "accountsForService:error:")
    private static native NSArray<?> accountsForServiceWithError(String serviceName, NSError.NSErrorPtr error);
    @Method(selector = "accessibilityType")
    public static native VoidPtr accessibilityType();
    @Method(selector = "setAccessibilityType:")
    public static native void setAccessibilityType(VoidPtr accessibilityType);
    /*</methods>*/
}
