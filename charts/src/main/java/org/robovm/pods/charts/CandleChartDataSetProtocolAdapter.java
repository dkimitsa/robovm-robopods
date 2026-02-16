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
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CandleChartDataSetProtocolAdapter/*</name>*/ 
    extends /*<extends>*/LineScatterCandleRadarChartDataSetProtocolAdapter/*</extends>*/ 
    /*<implements>*/implements CandleChartDataSetProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*/
    @NotImplemented("barSpace")
    public @MachineSizedFloat double getBarSpace() { return 0; }
    @NotImplemented("setBarSpace:")
    public void setBarSpace(@MachineSizedFloat double v) {}
    @NotImplemented("showCandleBar")
    public boolean isShowCandleBar() { return false; }
    @NotImplemented("setShowCandleBar:")
    public void setShowCandleBar(boolean v) {}
    @NotImplemented("shadowWidth")
    public @MachineSizedFloat double getShadowWidth() { return 0; }
    @NotImplemented("setShadowWidth:")
    public void setShadowWidth(@MachineSizedFloat double v) {}
    @NotImplemented("shadowColor")
    public UIColor getShadowColor() { return null; }
    @NotImplemented("setShadowColor:")
    public void setShadowColor(UIColor v) {}
    @NotImplemented("shadowColorSameAsCandle")
    public boolean shadowColorSameAsCandle() { return false; }
    @NotImplemented("setShadowColorSameAsCandle:")
    public void setShadowColorSameAsCandle(boolean v) {}
    @NotImplemented("isShadowColorSameAsCandle")
    public boolean isShadowColorSameAsCandle() { return false; }
    @NotImplemented("neutralColor")
    public UIColor getNeutralColor() { return null; }
    @NotImplemented("setNeutralColor:")
    public void setNeutralColor(UIColor v) {}
    @NotImplemented("increasingColor")
    public UIColor getIncreasingColor() { return null; }
    @NotImplemented("setIncreasingColor:")
    public void setIncreasingColor(UIColor v) {}
    @NotImplemented("decreasingColor")
    public UIColor getDecreasingColor() { return null; }
    @NotImplemented("setDecreasingColor:")
    public void setDecreasingColor(UIColor v) {}
    @NotImplemented("increasingFilled")
    public boolean increasingFilled() { return false; }
    @NotImplemented("setIncreasingFilled:")
    public void setIncreasingFilled(boolean v) {}
    @NotImplemented("isIncreasingFilled")
    public boolean isIncreasingFilled() { return false; }
    @NotImplemented("decreasingFilled")
    public boolean decreasingFilled() { return false; }
    @NotImplemented("setDecreasingFilled:")
    public void setDecreasingFilled(boolean v) {}
    @NotImplemented("isDecreasingFilled")
    public boolean isDecreasingFilled() { return false; }
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
