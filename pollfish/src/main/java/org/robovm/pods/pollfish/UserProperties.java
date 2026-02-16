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
package org.robovm.pods.pollfish;

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
import org.robovm.apple.corelocation.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("_TtC8Pollfish14UserProperties")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UserProperties/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class UserPropertiesPtr extends Ptr<UserProperties, UserPropertiesPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UserProperties.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public UserProperties() {}
    protected UserProperties(Handle h, long handle) { super(h, handle); }
    protected UserProperties(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "gender:")
    public native UserProperties gender(Gender gender);
    @Method(selector = "yearOfBirth:")
    public native UserProperties yearOfBirth(@MachineSizedSInt long yearOfBirth);
    @Method(selector = "maritalStatus:")
    public native UserProperties maritalStatus(MaritalStatus maritalStatus);
    @Method(selector = "parental:")
    public native UserProperties parental(Parental parental);
    @Method(selector = "education:")
    public native UserProperties education(Education education);
    @Method(selector = "employment:")
    public native UserProperties employment(Employment employment);
    @Method(selector = "career:")
    public native UserProperties career(Career career);
    @Method(selector = "race:")
    public native UserProperties race(Race race);
    @Method(selector = "income:")
    public native UserProperties income(Income income);
    @Method(selector = "spokenLanguages:")
    public native UserProperties spokenLanguages(NSArray<?> spokenLanguages);
    @Method(selector = "organizationRole:")
    public native UserProperties organizationRole(OrganizationRole organizationRole);
    @Method(selector = "numberOfEmployees:")
    public native UserProperties numberOfEmployees(NumberOfEmployees numberOfEmployees);
    @Method(selector = "postalData:")
    public native UserProperties postalData(String postalData);
    @Method(selector = "customAttribute:forKey:")
    public native UserProperties getCustomAttribute(String value, String forKey);
    /*</methods>*/
}
