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
/*<annotations>*/@Marshaler(ValuedEnum.AsMachineSizedSIntMarshaler.class)/*</annotations>*/
public enum /*<name>*/SpokenLanguage/*</name>*/ implements ValuedEnum {
    /*<values>*/
    English(0L),
    Arabic(1L),
    Bulgarian(2L),
    Chinese(3L),
    Czech(4L),
    Danish(5L),
    Dutch(6L),
    Filipino(7L),
    Thai(8L),
    Finnish(9L),
    French(10L),
    German(11L),
    Greek(12L),
    Hindi(13L),
    Indonesian(14L),
    Italian(15L),
    Japanese(16L),
    Polish(17L),
    Portuguese(18L),
    Romanian(19L),
    Russian(21L),
    Serbian(22L),
    Spanish(23L),
    Swedish(24L),
    Turkish(25L),
    Vietnamese(26L),
    Korean(27L),
    Hungarian(28L),
    ChineseTraditional(29L),
    Norwegian(30L),
    Egyptian(31L),
    Ukrainian(32L),
    Hebrew(33L),
    Bengali(34L),
    Slovak(35L),
    Persian(36L),
    Azerbaijani(37L),
    Georgian(38L),
    Lithuanian(39L),
    Punjabi(40L),
    Pashto(41L),
    Estonian(42L),
    Uzbek(43L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private final long n;

    private /*<name>*/SpokenLanguage/*</name>*/(long n) { this.n = n; }
    public long value() { return n; }
    public static /*<name>*/SpokenLanguage/*</name>*/ valueOf(long n) {
        for (/*<name>*/SpokenLanguage/*</name>*/ v : values()) {
            if (v.n == n) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + n + " found in " 
            + /*<name>*/SpokenLanguage/*</name>*/.class.getName());
    }
}
