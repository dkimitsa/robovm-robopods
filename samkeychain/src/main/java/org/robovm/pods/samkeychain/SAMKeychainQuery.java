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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/SAMKeychainQuery/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class SAMKeychainQueryPtr extends Ptr<SAMKeychainQuery, SAMKeychainQueryPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(SAMKeychainQuery.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public SAMKeychainQuery() {}
    protected SAMKeychainQuery(Handle h, long handle) { super(h, handle); }
    protected SAMKeychainQuery(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "account")
    public native String getAccount();
    @Property(selector = "setAccount:")
    public native void setAccount(String v);
    @Property(selector = "service")
    public native String getService();
    @Property(selector = "setService:")
    public native void setService(String v);
    @Property(selector = "label")
    public native String getLabel();
    @Property(selector = "setLabel:")
    public native void setLabel(String v);
    @Property(selector = "accessGroup")
    public native String getAccessGroup();
    @Property(selector = "setAccessGroup:")
    public native void setAccessGroup(String v);
    @Property(selector = "synchronizationMode")
    public native SAMKeychainQuerySynchronizationMode getSynchronizationMode();
    @Property(selector = "setSynchronizationMode:")
    public native void setSynchronizationMode(SAMKeychainQuerySynchronizationMode v);
    @Property(selector = "passwordData")
    public native NSData getPasswordData();
    @Property(selector = "setPasswordData:")
    public native void setPasswordData(NSData v);
    @Property(selector = "passwordObject")
    public native NSCoding getPasswordObject();
    @Property(selector = "setPasswordObject:")
    public native void setPasswordObject(NSCoding v);
    @Property(selector = "password")
    public native String getPassword();
    @Property(selector = "setPassword:")
    public native void setPassword(String v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    public boolean save() throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = save(ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "save:")
    private native boolean save(NSError.NSErrorPtr error);
    public boolean deleteItem() throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = deleteItem(ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "deleteItem:")
    private native boolean deleteItem(NSError.NSErrorPtr error);
    public NSArray<?> fetchAll() throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       NSArray<?> result = fetchAll(ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "fetchAll:")
    private native NSArray<?> fetchAll(NSError.NSErrorPtr error);
    public boolean fetch() throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = fetch(ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "fetch:")
    private native boolean fetch(NSError.NSErrorPtr error);
    @Method(selector = "isSynchronizationAvailable")
    public static native boolean isSynchronizationAvailable();
    /*</methods>*/
}
