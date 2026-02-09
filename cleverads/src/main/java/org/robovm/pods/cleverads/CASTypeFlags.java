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
/*<annotations>*/@Marshaler(Bits.AsMachineSizedIntMarshaler.class)/*</annotations>*/
public final class /*<name>*/CASTypeFlags/*</name>*/ extends Bits</*<name>*/CASTypeFlags/*</name>*/> {
    /*<values>*/
    public static final CASTypeFlags None = new CASTypeFlags(0L);
    public static final CASTypeFlags Banner = new CASTypeFlags(1L);
    public static final CASTypeFlags Interstitial = new CASTypeFlags(2L);
    public static final CASTypeFlags Rewarded = new CASTypeFlags(4L);
    public static final CASTypeFlags Native = new CASTypeFlags(8L);
    public static final CASTypeFlags MRec = new CASTypeFlags(32L);
    /**
     * @deprecated Renamed to AppOpen
     */
    @Deprecated
    public static final CASTypeFlags OpenApp = new CASTypeFlags(64L);
    public static final CASTypeFlags AppOpen = new CASTypeFlags(64L);
    /**
     * @deprecated Deprecated value
     */
    @Deprecated
    public static final CASTypeFlags Everything = new CASTypeFlags(7L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private static final /*<name>*/CASTypeFlags/*</name>*/[] values = _values(/*<name>*/CASTypeFlags/*</name>*/.class);

    public /*<name>*/CASTypeFlags/*</name>*/(long value) { super(value); }
    private /*<name>*/CASTypeFlags/*</name>*/(long value, long mask) { super(value, mask); }
    protected /*<name>*/CASTypeFlags/*</name>*/ wrap(long value, long mask) {
        return new /*<name>*/CASTypeFlags/*</name>*/(value, mask);
    }
    protected /*<name>*/CASTypeFlags/*</name>*/[] _values() {
        return values;
    }
    public static /*<name>*/CASTypeFlags/*</name>*/[] values() {
        return values.clone();
    }
}
