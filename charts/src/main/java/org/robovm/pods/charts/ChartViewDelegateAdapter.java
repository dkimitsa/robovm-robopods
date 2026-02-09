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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ChartViewDelegateAdapter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements ChartViewDelegate/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @NotImplemented("chartValueSelected:entry:highlight:")
    public void chartValueSelected(ChartViewBase chartView, ChartDataEntry entry, ChartHighlight highlight) {}
    @NotImplemented("chartViewDidEndPanning:")
    public void chartViewDidEndPanning(ChartViewBase chartView) {}
    @NotImplemented("chartValueNothingSelected:")
    public void chartValueNothingSelected(ChartViewBase chartView) {}
    @NotImplemented("chartScaled:scaleX:scaleY:")
    public void chartScaled(ChartViewBase chartView, @MachineSizedFloat double scaleX, @MachineSizedFloat double scaleY) {}
    @NotImplemented("chartTranslated:dX:dY:")
    public void chartTranslated(ChartViewBase chartView, @MachineSizedFloat double dX, @MachineSizedFloat double dY) {}
    @NotImplemented("chartView:animatorDidStop:")
    public void animatorDidStop(ChartViewBase chartView, ChartAnimator animator) {}
    /*</methods>*/
}
