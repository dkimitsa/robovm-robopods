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
package org.robovm.pods.charts;

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
/*<annotations>*/@Marshaler(ValuedEnum.AsMachineSizedSIntMarshaler.class)/*</annotations>*/
public enum /*<name>*/ChartEasingOption/*</name>*/ implements ValuedEnum {
    /*<values>*/
    Linear(0L),
    EaseInQuad(1L),
    EaseOutQuad(2L),
    EaseInOutQuad(3L),
    EaseInCubic(4L),
    EaseOutCubic(5L),
    EaseInOutCubic(6L),
    EaseInQuart(7L),
    EaseOutQuart(8L),
    EaseInOutQuart(9L),
    EaseInQuint(10L),
    EaseOutQuint(11L),
    EaseInOutQuint(12L),
    EaseInSine(13L),
    EaseOutSine(14L),
    EaseInOutSine(15L),
    EaseInExpo(16L),
    EaseOutExpo(17L),
    EaseInOutExpo(18L),
    EaseInCirc(19L),
    EaseOutCirc(20L),
    EaseInOutCirc(21L),
    EaseInElastic(22L),
    EaseOutElastic(23L),
    EaseInOutElastic(24L),
    EaseInBack(25L),
    EaseOutBack(26L),
    EaseInOutBack(27L),
    EaseInBounce(28L),
    EaseOutBounce(29L),
    EaseInOutBounce(30L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private final long n;

    private /*<name>*/ChartEasingOption/*</name>*/(long n) { this.n = n; }
    public long value() { return n; }
    public static /*<name>*/ChartEasingOption/*</name>*/ valueOf(long n) {
        for (/*<name>*/ChartEasingOption/*</name>*/ v : values()) {
            if (v.n == n) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + n + " found in " 
            + /*<name>*/ChartEasingOption/*</name>*/.class.getName());
    }
}
