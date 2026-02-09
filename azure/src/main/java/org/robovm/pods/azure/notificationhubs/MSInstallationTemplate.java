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
package org.robovm.pods.azure.notificationhubs;

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
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MSInstallationTemplate/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements MSTaggable, MSChangeTracking/*</implements>*/ {

    /*<ptr>*/public static class MSInstallationTemplatePtr extends Ptr<MSInstallationTemplate, MSInstallationTemplatePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MSInstallationTemplate.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MSInstallationTemplate() {}
    protected MSInstallationTemplate(Handle h, long handle) { super(h, handle); }
    protected MSInstallationTemplate(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "body")
    public native String getBody();
    @Property(selector = "setBody:")
    public native void setBody(String v);
    @Property(selector = "headers")
    public native NSDictionary<NSString, NSString> getHeaders();
    @Property(selector = "tags")
    public native NSSet<NSString> getTags();
    @Property(selector = "isDirty")
    public native boolean isDirty();
    @Property(selector = "setIsDirty:")
    public native void setIsDirty(boolean v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "setHeaderValue:forKey:")
    public native void setHeaderValue(String value, String key);
    @Method(selector = "removeHeaderValueForKey:")
    public native void removeHeaderValueForKey(String key);
    @Method(selector = "getHeaderValueForKey:")
    public native String getHeaderValueForKey(String key);
    @Method(selector = "toDictionary")
    public native NSDictionary<?, ?> toDictionary();
    @Method(selector = "addTag:")
    public native boolean addTag(String tag);
    @Method(selector = "addTags:")
    public native boolean addTags(NSArray<NSString> tagsToAdd);
    @Method(selector = "removeTag:")
    public native boolean removeTag(String tag);
    @Method(selector = "removeTags:")
    public native boolean removeTags(NSArray<NSString> tagsToRemove);
    @Method(selector = "clearTags")
    public native void clearTags();
    /*</methods>*/
}
