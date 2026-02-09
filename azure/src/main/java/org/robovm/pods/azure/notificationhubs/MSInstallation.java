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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MSInstallation/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSCoding, MSTaggable, MSChangeTracking/*</implements>*/ {

    /*<ptr>*/public static class MSInstallationPtr extends Ptr<MSInstallation, MSInstallationPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MSInstallation.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MSInstallation() {}
    protected MSInstallation(Handle h, long handle) { super(h, handle); }
    protected MSInstallation(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCoder:")
    public MSInstallation(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "installationId")
    public native String getInstallationId();
    @Property(selector = "setInstallationId:")
    public native void setInstallationId(String v);
    @Property(selector = "pushChannel")
    public native String getPushChannel();
    @Property(selector = "setPushChannel:")
    public native void setPushChannel(String v);
    @Property(selector = "userId")
    public native String getUserId();
    @Property(selector = "setUserId:")
    public native void setUserId(String v);
    @Property(selector = "expirationTime")
    public native NSDate getExpirationTime();
    @Property(selector = "setExpirationTime:")
    public native void setExpirationTime(NSDate v);
    @Property(selector = "templates")
    public native NSDictionary<NSString, MSInstallationTemplate> getTemplates();
    @Property(selector = "tags")
    public native NSSet<NSString> getTags();
    @Property(selector = "isDirty")
    public native boolean isDirty();
    @Property(selector = "setIsDirty:")
    public native void setIsDirty(boolean v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "setTemplate:forKey:")
    public native boolean setTemplate(MSInstallationTemplate template, String key);
    @Method(selector = "removeTemplateForKey:")
    public native boolean removeTemplateForKey(String key);
    @Method(selector = "getTemplateForKey:")
    public native MSInstallationTemplate getTemplateForKey(String key);
    @Method(selector = "toJsonData")
    public native NSData toJsonData();
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
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
