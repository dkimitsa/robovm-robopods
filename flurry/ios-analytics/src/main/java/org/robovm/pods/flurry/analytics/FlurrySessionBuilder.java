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
package org.robovm.pods.flurry.analytics;

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
import org.robovm.apple.dispatch.*;
import org.robovm.apple.storekit.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FlurrySessionBuilder/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class FlurrySessionBuilderPtr extends Ptr<FlurrySessionBuilder, FlurrySessionBuilderPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FlurrySessionBuilder.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public FlurrySessionBuilder() {}
    protected FlurrySessionBuilder(Handle h, long handle) { super(h, handle); }
    protected FlurrySessionBuilder(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "withDataSaleOptOut:")
    public native FlurrySessionBuilder withDataSaleOptOut(boolean value);
    @Method(selector = "withAppVersion:")
    public native FlurrySessionBuilder withAppVersion(String value);
    @Method(selector = "withSessionContinueSeconds:")
    public native FlurrySessionBuilder withSessionContinueSeconds(@MachineSizedSInt long value);
    @Method(selector = "withCrashReporting:")
    public native FlurrySessionBuilder withCrashReporting(boolean value);
    @Method(selector = "withLogLevel:")
    public native FlurrySessionBuilder withLogLevel(FlurryLogLevel value);
    @Method(selector = "withShowErrorInLog:")
    public native FlurrySessionBuilder withShowErrorInLog(boolean value);
    @Method(selector = "withConsent:")
    public native FlurrySessionBuilder withConsent(FlurryConsent consent);
    @Method(selector = "withIAPReportingEnabled:")
    public native FlurrySessionBuilder withIAPReportingEnabled(boolean value);
    @Method(selector = "withIncludeBackgroundSessionsInMetrics:")
    public native FlurrySessionBuilder withIncludeBackgroundSessionsInMetrics(boolean value);
    @Method(selector = "withSessionOrigin:")
    public native FlurrySessionBuilder withSessionOrigin(String origin);
    @Method(selector = "withSessionOriginVerion:")
    public native FlurrySessionBuilder withSessionOriginVerion(String version);
    @Method(selector = "withSessionOriginParameters:")
    public native FlurrySessionBuilder withSessionOriginParameters(NSDictionary<?, ?> parameters);
    @Method(selector = "withSessionDeeplink:")
    public native FlurrySessionBuilder withSessionDeeplink(String deeplink);
    @Method(selector = "withSessionProperties:")
    public native FlurrySessionBuilder withSessionProperties(NSDictionary<?, ?> properties);
    /*</methods>*/
}
