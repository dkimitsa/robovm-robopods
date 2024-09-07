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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("TenjinSDK.QueueEvent")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/QueueEvent/*</name>*/ 
    extends /*<extends>*/NSManagedObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class QueueEventPtr extends Ptr<QueueEvent, QueueEventPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(QueueEvent.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public QueueEvent() {}
    protected QueueEvent(Handle h, long handle) { super(h, handle); }
    protected QueueEvent(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithEntity:insertIntoManagedObjectContext:")
    public QueueEvent(NSEntityDescription entity, NSManagedObjectContext context) { super((SkipInit) null); initObject(init(entity, context)); }
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "initWithContext:")
    public QueueEvent(NSManagedObjectContext moc) { super(moc); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "params")
    public native String getParams();
    @Property(selector = "setParams:")
    public native void setParams(String v);
    @Property(selector = "date")
    public native NSDate getDate();
    @Property(selector = "setDate:")
    public native void setDate(NSDate v);
    @Property(selector = "endpoint")
    public native String getEndpoint();
    @Property(selector = "setEndpoint:")
    public native void setEndpoint(String v);
    @Property(selector = "contextShouldIgnoreUnmodeledPropertyChanges")
    public static native boolean isContextShouldIgnoreUnmodeledPropertyChanges();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithEntity:insertIntoManagedObjectContext:")
    protected native @Pointer long init(NSEntityDescription entity, NSManagedObjectContext context);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "entity")
    public static native NSEntityDescription entity();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "fetchRequest")
    public static native NSFetchRequest fetchRequest();
    /*</methods>*/
}
