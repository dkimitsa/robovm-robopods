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
package org.robovm.pods.branchmetrics;

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
import org.robovm.apple.corespotlight.*;
import org.robovm.apple.uniformtypeid.*;
import org.robovm.apple.linkpresentation.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.storekit.*;
import org.robovm.apple.intents.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL)/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/BranchContentSchemas/*</name>*/ 
    extends /*<extends>*/CocoaUtility/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/static { Bro.bind(BranchContentSchemas.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @GlobalValue(symbol="BranchContentSchemaCommerceAuction", optional=true)
    public static native String CommerceAuction();
    @GlobalValue(symbol="BranchContentSchemaCommerceBusiness", optional=true)
    public static native String CommerceBusiness();
    @GlobalValue(symbol="BranchContentSchemaCommerceOther", optional=true)
    public static native String CommerceOther();
    @GlobalValue(symbol="BranchContentSchemaCommerceProduct", optional=true)
    public static native String CommerceProduct();
    @GlobalValue(symbol="BranchContentSchemaCommerceRestaurant", optional=true)
    public static native String CommerceRestaurant();
    @GlobalValue(symbol="BranchContentSchemaCommerceService", optional=true)
    public static native String CommerceService();
    @GlobalValue(symbol="BranchContentSchemaCommerceTravelFlight", optional=true)
    public static native String CommerceTravelFlight();
    @GlobalValue(symbol="BranchContentSchemaCommerceTravelHotel", optional=true)
    public static native String CommerceTravelHotel();
    @GlobalValue(symbol="BranchContentSchemaCommerceTravelOther", optional=true)
    public static native String CommerceTravelOther();
    @GlobalValue(symbol="BranchContentSchemaGameState", optional=true)
    public static native String GameState();
    @GlobalValue(symbol="BranchContentSchemaMediaImage", optional=true)
    public static native String MediaImage();
    @GlobalValue(symbol="BranchContentSchemaMediaMixed", optional=true)
    public static native String MediaMixed();
    @GlobalValue(symbol="BranchContentSchemaMediaMusic", optional=true)
    public static native String MediaMusic();
    @GlobalValue(symbol="BranchContentSchemaMediaOther", optional=true)
    public static native String MediaOther();
    @GlobalValue(symbol="BranchContentSchemaMediaVideo", optional=true)
    public static native String MediaVideo();
    @GlobalValue(symbol="BranchContentSchemaOther", optional=true)
    public static native String Other();
    @GlobalValue(symbol="BranchContentSchemaTextArticle", optional=true)
    public static native String TextArticle();
    @GlobalValue(symbol="BranchContentSchemaTextBlog", optional=true)
    public static native String TextBlog();
    @GlobalValue(symbol="BranchContentSchemaTextOther", optional=true)
    public static native String TextOther();
    @GlobalValue(symbol="BranchContentSchemaTextRecipe", optional=true)
    public static native String TextRecipe();
    @GlobalValue(symbol="BranchContentSchemaTextReview", optional=true)
    public static native String TextReview();
    @GlobalValue(symbol="BranchContentSchemaTextSearchResults", optional=true)
    public static native String TextSearchResults();
    @GlobalValue(symbol="BranchContentSchemaTextStory", optional=true)
    public static native String TextStory();
    @GlobalValue(symbol="BranchContentSchemaTextTechnicalDoc", optional=true)
    public static native String TextTechnicalDoc();
    /*</methods>*/
}
