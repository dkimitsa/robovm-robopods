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
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/RadarChartDataSetProtocol/*</name>*/ 
    /*<implements>*/extends LineRadarChartDataSetProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    @Property(selector = "drawHighlightCircleEnabled")
    boolean drawHighlightCircleEnabled();
    @Property(selector = "setDrawHighlightCircleEnabled:")
    void setDrawHighlightCircleEnabled(boolean v);
    @Property(selector = "isDrawHighlightCircleEnabled")
    boolean isDrawHighlightCircleEnabled();
    @Property(selector = "highlightCircleFillColor")
    UIColor getHighlightCircleFillColor();
    @Property(selector = "setHighlightCircleFillColor:")
    void setHighlightCircleFillColor(UIColor v);
    @Property(selector = "highlightCircleStrokeColor")
    UIColor getHighlightCircleStrokeColor();
    @Property(selector = "setHighlightCircleStrokeColor:")
    void setHighlightCircleStrokeColor(UIColor v);
    @Property(selector = "highlightCircleStrokeAlpha")
    @MachineSizedFloat double getHighlightCircleStrokeAlpha();
    @Property(selector = "setHighlightCircleStrokeAlpha:")
    void setHighlightCircleStrokeAlpha(@MachineSizedFloat double v);
    @Property(selector = "highlightCircleInnerRadius")
    @MachineSizedFloat double getHighlightCircleInnerRadius();
    @Property(selector = "setHighlightCircleInnerRadius:")
    void setHighlightCircleInnerRadius(@MachineSizedFloat double v);
    @Property(selector = "highlightCircleOuterRadius")
    @MachineSizedFloat double getHighlightCircleOuterRadius();
    @Property(selector = "setHighlightCircleOuterRadius:")
    void setHighlightCircleOuterRadius(@MachineSizedFloat double v);
    @Property(selector = "highlightCircleStrokeWidth")
    @MachineSizedFloat double getHighlightCircleStrokeWidth();
    @Property(selector = "setHighlightCircleStrokeWidth:")
    void setHighlightCircleStrokeWidth(@MachineSizedFloat double v);
    /*</properties>*/
    /*<methods>*/
    
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
