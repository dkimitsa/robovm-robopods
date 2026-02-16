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
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/CandleChartDataSetProtocol/*</name>*/ 
    /*<implements>*/extends LineScatterCandleRadarChartDataSetProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    @Property(selector = "barSpace")
    @MachineSizedFloat double getBarSpace();
    @Property(selector = "setBarSpace:")
    void setBarSpace(@MachineSizedFloat double v);
    @Property(selector = "showCandleBar")
    boolean isShowCandleBar();
    @Property(selector = "setShowCandleBar:")
    void setShowCandleBar(boolean v);
    @Property(selector = "shadowWidth")
    @MachineSizedFloat double getShadowWidth();
    @Property(selector = "setShadowWidth:")
    void setShadowWidth(@MachineSizedFloat double v);
    @Property(selector = "shadowColor")
    UIColor getShadowColor();
    @Property(selector = "setShadowColor:")
    void setShadowColor(UIColor v);
    @Property(selector = "shadowColorSameAsCandle")
    boolean shadowColorSameAsCandle();
    @Property(selector = "setShadowColorSameAsCandle:")
    void setShadowColorSameAsCandle(boolean v);
    @Property(selector = "isShadowColorSameAsCandle")
    boolean isShadowColorSameAsCandle();
    @Property(selector = "neutralColor")
    UIColor getNeutralColor();
    @Property(selector = "setNeutralColor:")
    void setNeutralColor(UIColor v);
    @Property(selector = "increasingColor")
    UIColor getIncreasingColor();
    @Property(selector = "setIncreasingColor:")
    void setIncreasingColor(UIColor v);
    @Property(selector = "decreasingColor")
    UIColor getDecreasingColor();
    @Property(selector = "setDecreasingColor:")
    void setDecreasingColor(UIColor v);
    @Property(selector = "increasingFilled")
    boolean increasingFilled();
    @Property(selector = "setIncreasingFilled:")
    void setIncreasingFilled(boolean v);
    @Property(selector = "isIncreasingFilled")
    boolean isIncreasingFilled();
    @Property(selector = "decreasingFilled")
    boolean decreasingFilled();
    @Property(selector = "setDecreasingFilled:")
    void setDecreasingFilled(boolean v);
    @Property(selector = "isDecreasingFilled")
    boolean isDecreasingFilled();
    /*</properties>*/
    /*<methods>*/
    
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
