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
package org.robovm.pods.cleverads;

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
import org.robovm.apple.corelocation.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Marshaler(ValuedEnum.AsMachineSizedSIntMarshaler.class)/*</annotations>*/
public enum /*<name>*/CASSourceId/*</name>*/ implements ValuedEnum {
    /*<values>*/
    GoogleAds(0L),
    LiftoffMonetize(1L),
    Kidoz(2L),
    Chartboost(3L),
    UnityAds(4L),
    AppLovin(5L),
    SuperAwesome(6L),
    StartIO(7L),
    CasExchange(8L),
    AudienceNetwork(9L),
    InMobi(10L),
    DtExchange(11L),
    MyTarget(12L),
    Crosspromo(13L),
    IronSource(14L),
    YangoAds(15L),
    HyprMX(16L),
    Smaato(18L),
    Bigo(19L),
    Ogury(20L),
    Madex(21L),
    Monetrix(22L),
    Mintegral(23L),
    Pangle(24L),
    YsoNetwork(25L),
    Prado(26L),
    Maticoo(27L),
    Pubmatic(28L),
    Verve(29L),
    DspExchange(30L),
    LastPageAd(31L),
    Custom(32L),
    Unknown(33L),
    DisplayIO(73L),
    Bidease(74L),
    Moloco(76L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private final long n;

    private /*<name>*/CASSourceId/*</name>*/(long n) { this.n = n; }
    public long value() { return n; }
    public static /*<name>*/CASSourceId/*</name>*/ valueOf(long n) {
        for (/*<name>*/CASSourceId/*</name>*/ v : values()) {
            if (v.n == n) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + n + " found in " 
            + /*<name>*/CASSourceId/*</name>*/.class.getName());
    }
}
