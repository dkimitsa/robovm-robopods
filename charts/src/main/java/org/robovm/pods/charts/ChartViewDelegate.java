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
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/ChartViewDelegate/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "chartValueSelected:entry:highlight:")
    void chartValueSelected(ChartViewBase chartView, ChartDataEntry entry, ChartHighlight highlight);
    @Method(selector = "chartViewDidEndPanning:")
    void chartViewDidEndPanning(ChartViewBase chartView);
    @Method(selector = "chartValueNothingSelected:")
    void chartValueNothingSelected(ChartViewBase chartView);
    @Method(selector = "chartScaled:scaleX:scaleY:")
    void chartScaled(ChartViewBase chartView, @MachineSizedFloat double scaleX, @MachineSizedFloat double scaleY);
    @Method(selector = "chartTranslated:dX:dY:")
    void chartTranslated(ChartViewBase chartView, @MachineSizedFloat double dX, @MachineSizedFloat double dY);
    @Method(selector = "chartView:animatorDidStop:")
    void animatorDidStop(ChartViewBase chartView, ChartAnimator animator);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
