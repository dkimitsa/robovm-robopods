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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/PieChartDataSetProtocolAdapter/*</name>*/ 
    extends /*<extends>*/ChartDataSetProtocolAdapter/*</extends>*/ 
    /*<implements>*/implements PieChartDataSetProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*/
    @NotImplemented("sliceSpace")
    public @MachineSizedFloat double getSliceSpace() { return 0; }
    @NotImplemented("setSliceSpace:")
    public void setSliceSpace(@MachineSizedFloat double v) {}
    @NotImplemented("automaticallyDisableSliceSpacing")
    public boolean automaticallyDisableSliceSpacing() { return false; }
    @NotImplemented("setAutomaticallyDisableSliceSpacing:")
    public void setAutomaticallyDisableSliceSpacing(boolean v) {}
    @NotImplemented("selectionShift")
    public @MachineSizedFloat double getSelectionShift() { return 0; }
    @NotImplemented("setSelectionShift:")
    public void setSelectionShift(@MachineSizedFloat double v) {}
    @NotImplemented("xValuePosition")
    public PieChartValuePosition getXValuePosition() { return null; }
    @NotImplemented("setXValuePosition:")
    public void setXValuePosition(PieChartValuePosition v) {}
    @NotImplemented("yValuePosition")
    public PieChartValuePosition getYValuePosition() { return null; }
    @NotImplemented("setYValuePosition:")
    public void setYValuePosition(PieChartValuePosition v) {}
    @NotImplemented("valueLineColor")
    public UIColor getValueLineColor() { return null; }
    @NotImplemented("setValueLineColor:")
    public void setValueLineColor(UIColor v) {}
    @NotImplemented("useValueColorForLine")
    public boolean isUseValueColorForLine() { return false; }
    @NotImplemented("setUseValueColorForLine:")
    public void setUseValueColorForLine(boolean v) {}
    @NotImplemented("valueLineWidth")
    public @MachineSizedFloat double getValueLineWidth() { return 0; }
    @NotImplemented("setValueLineWidth:")
    public void setValueLineWidth(@MachineSizedFloat double v) {}
    @NotImplemented("valueLinePart1OffsetPercentage")
    public @MachineSizedFloat double getValueLinePart1OffsetPercentage() { return 0; }
    @NotImplemented("setValueLinePart1OffsetPercentage:")
    public void setValueLinePart1OffsetPercentage(@MachineSizedFloat double v) {}
    @NotImplemented("valueLinePart1Length")
    public @MachineSizedFloat double getValueLinePart1Length() { return 0; }
    @NotImplemented("setValueLinePart1Length:")
    public void setValueLinePart1Length(@MachineSizedFloat double v) {}
    @NotImplemented("valueLinePart2Length")
    public @MachineSizedFloat double getValueLinePart2Length() { return 0; }
    @NotImplemented("setValueLinePart2Length:")
    public void setValueLinePart2Length(@MachineSizedFloat double v) {}
    @NotImplemented("valueLineVariableLength")
    public boolean isValueLineVariableLength() { return false; }
    @NotImplemented("setValueLineVariableLength:")
    public void setValueLineVariableLength(boolean v) {}
    @NotImplemented("entryLabelFont")
    public UIFont getEntryLabelFont() { return null; }
    @NotImplemented("setEntryLabelFont:")
    public void setEntryLabelFont(UIFont v) {}
    @NotImplemented("entryLabelColor")
    public UIColor getEntryLabelColor() { return null; }
    @NotImplemented("setEntryLabelColor:")
    public void setEntryLabelColor(UIColor v) {}
    @NotImplemented("highlightColor")
    public UIColor getHighlightColor() { return null; }
    @NotImplemented("setHighlightColor:")
    public void setHighlightColor(UIColor v) {}
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
