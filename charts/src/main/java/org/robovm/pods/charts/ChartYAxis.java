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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ChartYAxis/*</name>*/ 
    extends /*<extends>*/ChartAxisBase/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class ChartYAxisPtr extends Ptr<ChartYAxis, ChartYAxisPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ChartYAxis.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public ChartYAxis() {}
    protected ChartYAxis(Handle h, long handle) { super(h, handle); }
    protected ChartYAxis(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithPosition:")
    public ChartYAxis(AxisDependency position) { super((SkipInit) null); initObject(init(position)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "drawBottomYLabelEntryEnabled")
    public native boolean drawBottomYLabelEntryEnabled();
    @Property(selector = "setDrawBottomYLabelEntryEnabled:")
    public native void setDrawBottomYLabelEntryEnabled(boolean v);
    @Property(selector = "drawTopYLabelEntryEnabled")
    public native boolean drawTopYLabelEntryEnabled();
    @Property(selector = "setDrawTopYLabelEntryEnabled:")
    public native void setDrawTopYLabelEntryEnabled(boolean v);
    @Property(selector = "inverted")
    public native boolean inverted();
    @Property(selector = "setInverted:")
    public native void setInverted(boolean v);
    @Property(selector = "drawZeroLineEnabled")
    public native boolean isDrawZeroLineEnabled();
    @Property(selector = "setDrawZeroLineEnabled:")
    public native void setDrawZeroLineEnabled(boolean v);
    @Property(selector = "zeroLineColor")
    public native UIColor getZeroLineColor();
    @Property(selector = "setZeroLineColor:")
    public native void setZeroLineColor(UIColor v);
    @Property(selector = "zeroLineWidth")
    public native @MachineSizedFloat double getZeroLineWidth();
    @Property(selector = "setZeroLineWidth:")
    public native void setZeroLineWidth(@MachineSizedFloat double v);
    @Property(selector = "zeroLineDashPhase")
    public native @MachineSizedFloat double getZeroLineDashPhase();
    @Property(selector = "setZeroLineDashPhase:")
    public native void setZeroLineDashPhase(@MachineSizedFloat double v);
    @Property(selector = "zeroLineDashLengths")
    public native NSArray<NSNumber> getZeroLineDashLengths();
    @Property(selector = "setZeroLineDashLengths:")
    public native void setZeroLineDashLengths(NSArray<NSNumber> v);
    @Property(selector = "spaceTop")
    public native @MachineSizedFloat double getSpaceTop();
    @Property(selector = "setSpaceTop:")
    public native void setSpaceTop(@MachineSizedFloat double v);
    @Property(selector = "spaceBottom")
    public native @MachineSizedFloat double getSpaceBottom();
    @Property(selector = "setSpaceBottom:")
    public native void setSpaceBottom(@MachineSizedFloat double v);
    @Property(selector = "labelPosition")
    public native YAxisLabelPosition getLabelPosition();
    @Property(selector = "setLabelPosition:")
    public native void setLabelPosition(YAxisLabelPosition v);
    @Property(selector = "labelAlignment")
    public native NSTextAlignment getLabelAlignment();
    @Property(selector = "setLabelAlignment:")
    public native void setLabelAlignment(NSTextAlignment v);
    @Property(selector = "labelXOffset")
    public native @MachineSizedFloat double getLabelXOffset();
    @Property(selector = "setLabelXOffset:")
    public native void setLabelXOffset(@MachineSizedFloat double v);
    @Property(selector = "minWidth")
    public native @MachineSizedFloat double getMinWidth();
    @Property(selector = "setMinWidth:")
    public native void setMinWidth(@MachineSizedFloat double v);
    @Property(selector = "maxWidth")
    public native @MachineSizedFloat double getMaxWidth();
    @Property(selector = "setMaxWidth:")
    public native void setMaxWidth(@MachineSizedFloat double v);
    @Property(selector = "axisDependency")
    public native AxisDependency getAxisDependency();
    @Property(selector = "needsOffset")
    public native boolean needsOffset();
    @Property(selector = "isInverted")
    public native boolean isInverted();
    @Property(selector = "isDrawBottomYLabelEntryEnabled")
    public native boolean isDrawBottomYLabelEntryEnabled();
    @Property(selector = "isDrawTopYLabelEntryEnabled")
    public native boolean isDrawTopYLabelEntryEnabled();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithPosition:")
    protected native @Pointer long init(AxisDependency position);
    @Method(selector = "requiredSize")
    public native @ByVal CGSize requiredSize();
    @Method(selector = "getRequiredHeightSpace")
    public native @MachineSizedFloat double getRequiredHeightSpace();
    @Method(selector = "calculateWithMin:max:")
    public native void calculate(double dataMin, double dataMax);
    /*</methods>*/
}
