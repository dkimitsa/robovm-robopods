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
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/PieChartDataSetProtocol/*</name>*/ 
    /*<implements>*/extends ChartDataSetProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    @Property(selector = "sliceSpace")
    @MachineSizedFloat double getSliceSpace();
    @Property(selector = "setSliceSpace:")
    void setSliceSpace(@MachineSizedFloat double v);
    @Property(selector = "automaticallyDisableSliceSpacing")
    boolean automaticallyDisableSliceSpacing();
    @Property(selector = "setAutomaticallyDisableSliceSpacing:")
    void setAutomaticallyDisableSliceSpacing(boolean v);
    @Property(selector = "selectionShift")
    @MachineSizedFloat double getSelectionShift();
    @Property(selector = "setSelectionShift:")
    void setSelectionShift(@MachineSizedFloat double v);
    @Property(selector = "xValuePosition")
    PieChartValuePosition getXValuePosition();
    @Property(selector = "setXValuePosition:")
    void setXValuePosition(PieChartValuePosition v);
    @Property(selector = "yValuePosition")
    PieChartValuePosition getYValuePosition();
    @Property(selector = "setYValuePosition:")
    void setYValuePosition(PieChartValuePosition v);
    @Property(selector = "valueLineColor")
    UIColor getValueLineColor();
    @Property(selector = "setValueLineColor:")
    void setValueLineColor(UIColor v);
    @Property(selector = "useValueColorForLine")
    boolean isUseValueColorForLine();
    @Property(selector = "setUseValueColorForLine:")
    void setUseValueColorForLine(boolean v);
    @Property(selector = "valueLineWidth")
    @MachineSizedFloat double getValueLineWidth();
    @Property(selector = "setValueLineWidth:")
    void setValueLineWidth(@MachineSizedFloat double v);
    @Property(selector = "valueLinePart1OffsetPercentage")
    @MachineSizedFloat double getValueLinePart1OffsetPercentage();
    @Property(selector = "setValueLinePart1OffsetPercentage:")
    void setValueLinePart1OffsetPercentage(@MachineSizedFloat double v);
    @Property(selector = "valueLinePart1Length")
    @MachineSizedFloat double getValueLinePart1Length();
    @Property(selector = "setValueLinePart1Length:")
    void setValueLinePart1Length(@MachineSizedFloat double v);
    @Property(selector = "valueLinePart2Length")
    @MachineSizedFloat double getValueLinePart2Length();
    @Property(selector = "setValueLinePart2Length:")
    void setValueLinePart2Length(@MachineSizedFloat double v);
    @Property(selector = "valueLineVariableLength")
    boolean isValueLineVariableLength();
    @Property(selector = "setValueLineVariableLength:")
    void setValueLineVariableLength(boolean v);
    @Property(selector = "entryLabelFont")
    UIFont getEntryLabelFont();
    @Property(selector = "setEntryLabelFont:")
    void setEntryLabelFont(UIFont v);
    @Property(selector = "entryLabelColor")
    UIColor getEntryLabelColor();
    @Property(selector = "setEntryLabelColor:")
    void setEntryLabelColor(UIColor v);
    @Property(selector = "highlightColor")
    UIColor getHighlightColor();
    @Property(selector = "setHighlightColor:")
    void setHighlightColor(UIColor v);
    /*</properties>*/
    /*<methods>*/
    
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
