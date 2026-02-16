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
package org.robovm.pods.onesignal;

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
import org.robovm.apple.usernotifications.*;
import org.robovm.apple.uikit.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/OSObservable<ObserverType extends NSObject, T extends NSObject>/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class OSObservablePtr<ObserverType extends NSObject, T extends NSObject> extends Ptr<OSObservable<ObserverType, T>, OSObservablePtr<ObserverType, T>> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(OSObservable.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public OSObservable() {}
    protected OSObservable(Handle h, long handle) { super(h, handle); }
    protected OSObservable(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithChangeSelector:")
    public OSObservable(Selector selector) { super((SkipInit) null); initObject(init(selector)); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithChangeSelector:")
    protected native @Pointer long init(Selector selector);
    @Method(selector = "addObserver:")
    public native void addObserver(ObserverType observer);
    @Method(selector = "removeObserver:")
    public native void removeObserver(ObserverType observer);
    @Method(selector = "notifyChange:")
    public native boolean notifyChange(T state);
    /*</methods>*/
}
