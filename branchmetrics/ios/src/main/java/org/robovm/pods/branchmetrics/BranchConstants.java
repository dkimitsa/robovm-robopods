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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/BranchConstants/*</name>*/ 
    extends /*<extends>*/CocoaUtility/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/static { Bro.bind(BranchConstants.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @GlobalValue(symbol="BRANCH_FEATURE_TAG_SHARE", optional=true)
    public static native String getFeatureTagShare();
    @GlobalValue(symbol="BRANCH_FEATURE_TAG_REFERRAL", optional=true)
    public static native String getFeatureTagReferral();
    @GlobalValue(symbol="BRANCH_FEATURE_TAG_INVITE", optional=true)
    public static native String getFeatureTagInvite();
    @GlobalValue(symbol="BRANCH_FEATURE_TAG_DEAL", optional=true)
    public static native String getFeatureTagDeal();
    @GlobalValue(symbol="BRANCH_FEATURE_TAG_GIFT", optional=true)
    public static native String getFeatureTagGift();
    @GlobalValue(symbol="BRANCH_INIT_KEY_CHANNEL", optional=true)
    public static native String getInitKeyChannel();
    @GlobalValue(symbol="BRANCH_INIT_KEY_FEATURE", optional=true)
    public static native String getInitKeyFeature();
    @GlobalValue(symbol="BRANCH_INIT_KEY_TAGS", optional=true)
    public static native String getInitKeyTags();
    @GlobalValue(symbol="BRANCH_INIT_KEY_CAMPAIGN", optional=true)
    public static native String getInitKeyCampaign();
    @GlobalValue(symbol="BRANCH_INIT_KEY_STAGE", optional=true)
    public static native String getInitKeyStage();
    @GlobalValue(symbol="BRANCH_INIT_KEY_CREATION_SOURCE", optional=true)
    public static native String getInitKeyCreationSource();
    @GlobalValue(symbol="BRANCH_INIT_KEY_REFERRER", optional=true)
    public static native String getInitKeyReferrer();
    @GlobalValue(symbol="BRANCH_INIT_KEY_PHONE_NUMBER", optional=true)
    public static native String getInitKeyPhoneNumber();
    @GlobalValue(symbol="BRANCH_INIT_KEY_IS_FIRST_SESSION", optional=true)
    public static native String getInitKeyIsFirstSession();
    @GlobalValue(symbol="BRANCH_INIT_KEY_CLICKED_BRANCH_LINK", optional=true)
    public static native String getInitKeyClickedBranchLink();
    /*</methods>*/
}
