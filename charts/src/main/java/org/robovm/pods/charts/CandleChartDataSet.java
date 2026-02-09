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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("DGCharts.CandleChartDataSet")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CandleChartDataSet/*</name>*/ 
    extends /*<extends>*/LineScatterCandleRadarChartDataSet/*</extends>*/ 
    /*<implements>*/implements CandleChartDataSetProtocol/*</implements>*/ {

    /*<ptr>*/public static class CandleChartDataSetPtr extends Ptr<CandleChartDataSet, CandleChartDataSetPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CandleChartDataSet.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public CandleChartDataSet() {}
    protected CandleChartDataSet(Handle h, long handle) { super(h, handle); }
    protected CandleChartDataSet(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithEntries:label:")
    public CandleChartDataSet(NSArray<ChartDataEntry> entries, String label) { super((SkipInit) null); initObject(init(entries, label)); }
    @Method(selector = "initWithLabel:")
    public CandleChartDataSet(String label) { super(label); }
    @Method(selector = "initWithEntries:")
    public CandleChartDataSet(NSArray<ChartDataEntry> entries) { super(entries); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "barSpace")
    public native @MachineSizedFloat double getBarSpace();
    @Property(selector = "setBarSpace:")
    public native void setBarSpace(@MachineSizedFloat double v);
    @Property(selector = "showCandleBar")
    public native boolean isShowCandleBar();
    @Property(selector = "setShowCandleBar:")
    public native void setShowCandleBar(boolean v);
    @Property(selector = "shadowWidth")
    public native @MachineSizedFloat double getShadowWidth();
    @Property(selector = "setShadowWidth:")
    public native void setShadowWidth(@MachineSizedFloat double v);
    @Property(selector = "shadowColor")
    public native UIColor getShadowColor();
    @Property(selector = "setShadowColor:")
    public native void setShadowColor(UIColor v);
    @Property(selector = "shadowColorSameAsCandle")
    public native boolean shadowColorSameAsCandle();
    @Property(selector = "setShadowColorSameAsCandle:")
    public native void setShadowColorSameAsCandle(boolean v);
    @Property(selector = "isShadowColorSameAsCandle")
    public native boolean isShadowColorSameAsCandle();
    @Property(selector = "neutralColor")
    public native UIColor getNeutralColor();
    @Property(selector = "setNeutralColor:")
    public native void setNeutralColor(UIColor v);
    @Property(selector = "increasingColor")
    public native UIColor getIncreasingColor();
    @Property(selector = "setIncreasingColor:")
    public native void setIncreasingColor(UIColor v);
    @Property(selector = "decreasingColor")
    public native UIColor getDecreasingColor();
    @Property(selector = "setDecreasingColor:")
    public native void setDecreasingColor(UIColor v);
    @Property(selector = "increasingFilled")
    public native boolean increasingFilled();
    @Property(selector = "setIncreasingFilled:")
    public native void setIncreasingFilled(boolean v);
    @Property(selector = "isIncreasingFilled")
    public native boolean isIncreasingFilled();
    @Property(selector = "decreasingFilled")
    public native boolean decreasingFilled();
    @Property(selector = "setDecreasingFilled:")
    public native void setDecreasingFilled(boolean v);
    @Property(selector = "isDecreasingFilled")
    public native boolean isDecreasingFilled();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithEntries:label:")
    protected native @Pointer long init(NSArray<ChartDataEntry> entries, String label);
    @Method(selector = "calcMinMaxYWithEntry:")
    public native void calcMinMaxY(ChartDataEntry e);
    /*</methods>*/
}
