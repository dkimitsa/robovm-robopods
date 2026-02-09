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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ISConcurrentMutableSet/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class ISConcurrentMutableSetPtr extends Ptr<ISConcurrentMutableSet, ISConcurrentMutableSetPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ISConcurrentMutableSet.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public ISConcurrentMutableSet() {}
    protected ISConcurrentMutableSet(Handle h, long handle) { super(h, handle); }
    protected ISConcurrentMutableSet(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initCommon")
    public static ISConcurrentMutableSet createCommon() {
       ISConcurrentMutableSet res = new ISConcurrentMutableSet((SkipInit) null);
       res.initObject(res.initCommon());
       return res;
    }
    @Method(selector = "initWithCapacity:")
    public ISConcurrentMutableSet(@MachineSizedUInt long numItems) { super((SkipInit) null); initObject(init(numItems)); }
    @Method(selector = "initWithCoder:")
    public ISConcurrentMutableSet(NSCoder aDecoder) { super((SkipInit) null); initObject(init(aDecoder)); }
    @Method(selector = "initWithSet:")
    public ISConcurrentMutableSet(NSMutableSet<?> set) { super((SkipInit) null); initObject(init(set)); }
    @Method(selector = "initWithArray:")
    public ISConcurrentMutableSet(NSArray<?> array) { super((SkipInit) null); initObject(init(array)); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initCommon")
    protected native @Pointer long initCommon();
    @Method(selector = "initWithCapacity:")
    protected native @Pointer long init(@MachineSizedUInt long numItems);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder aDecoder);
    @Method(selector = "initWithSet:")
    protected native @Pointer long init(NSMutableSet<?> set);
    @Method(selector = "initWithArray:")
    protected native @Pointer long init(NSArray<?> array);
    @Method(selector = "count")
    public native @MachineSizedUInt long count();
    @Method(selector = "addObject:")
    public native void addObject(NSObject object);
    @Method(selector = "removeObject:")
    public native void removeObject(NSObject object);
    @Method(selector = "addObjectsFromArray:")
    public native void addObjectsFromArray(NSArray<?> array);
    @Method(selector = "intersectSet:")
    public native void intersectSet(NSSet<?> otherSet);
    @Method(selector = "minusSet:")
    public native void minusSet(NSSet<?> otherSet);
    @Method(selector = "removeAllObjects")
    public native void removeAllObjects();
    @Method(selector = "unionSet:")
    public native void unionSet(NSSet<?> otherSet);
    @Method(selector = "allObjects")
    public native NSArray<?> allObjects();
    @Method(selector = "hasObject:")
    public native boolean hasObject(NSObject object);
    @Method(selector = "objectEnumerator")
    public native NSEnumerator<?> objectEnumerator();
    @Method(selector = "set")
    public static native ISConcurrentMutableSet set();
    /*</methods>*/
}
