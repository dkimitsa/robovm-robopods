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
package org.robovm.pods.applovinsdk;

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
import org.robovm.apple.safariservices.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MASegmentCollection/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MASegmentCollectionPtr extends Ptr<MASegmentCollection, MASegmentCollectionPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MASegmentCollection.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MASegmentCollection() {}
    protected MASegmentCollection(Handle h, long handle) { super(h, handle); }
    protected MASegmentCollection(SkipInit skipInit) { super(skipInit); }
    public MASegmentCollection(@Block VoidBlock1<MASegmentCollectionBuilder> builderBlock) { super((Handle) null, create(builderBlock)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "segments")
    public native NSArray<MASegment> getSegments();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "segmentCollectionWithBuilderBlock:")
    protected static native @Pointer long create(@Block VoidBlock1<MASegmentCollectionBuilder> builderBlock);
    @Method(selector = "builder")
    public static native MASegmentCollectionBuilder builder();
    /*</methods>*/
}
