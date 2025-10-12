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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("DGCharts.CombinedChartData")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CombinedChartData/*</name>*/ 
    extends /*<extends>*/BarLineScatterCandleBubbleChartData/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CombinedChartDataPtr extends Ptr<CombinedChartData, CombinedChartDataPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CombinedChartData.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public CombinedChartData() {}
    protected CombinedChartData(Handle h, long handle) { super(h, handle); }
    protected CombinedChartData(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithDataSets:")
    public CombinedChartData(NSArray<?> dataSets) { super((SkipInit) null); initObject(init(dataSets)); }
    @Method(selector = "initWithDataSet:")
    public CombinedChartData(ChartDataSetProtocol dataSet) { super(dataSet); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "lineData")
    public native LineChartData getLineData();
    @Property(selector = "setLineData:")
    public native void setLineData(LineChartData v);
    @Property(selector = "barData")
    public native BarChartData getBarData();
    @Property(selector = "setBarData:")
    public native void setBarData(BarChartData v);
    @Property(selector = "scatterData")
    public native ScatterChartData getScatterData();
    @Property(selector = "setScatterData:")
    public native void setScatterData(ScatterChartData v);
    @Property(selector = "candleData")
    public native CandleChartData getCandleData();
    @Property(selector = "setCandleData:")
    public native void setCandleData(CandleChartData v);
    @Property(selector = "bubbleData")
    public native BubbleChartData getBubbleData();
    @Property(selector = "setBubbleData:")
    public native void setBubbleData(BubbleChartData v);
    @Property(selector = "allData")
    public native NSArray<ChartData> getAllData();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithDataSets:")
    protected native @Pointer long init(NSArray<?> dataSets);
    @Method(selector = "calcMinMax")
    public native void calcMinMax();
    @Method(selector = "dataByIndex:")
    public native ChartData dataByIndex(@MachineSizedSInt long index);
    @Method(selector = "removeDataSet:")
    public native ChartDataSetProtocol removeDataSet(ChartDataSetProtocol dataSet);
    @Method(selector = "removeEntry:dataSetIndex:")
    public native boolean removeEntry(ChartDataEntry entry, @MachineSizedSInt long dataSetIndex);
    @Method(selector = "removeEntryWithXValue:dataSetIndex:")
    public native boolean removeEntry(double xValue, @MachineSizedSInt long dataSetIndex);
    @Method(selector = "notifyDataChanged")
    public native void notifyDataChanged();
    @Method(selector = "entryFor:")
    public native ChartDataEntry entryFor(ChartHighlight highlight);
    @Method(selector = "getDataSetByHighlight:")
    public native ChartDataSetProtocol getDataSetByHighlight(ChartHighlight highlight);
    @Method(selector = "addDataSet:")
    public native void addDataSet(ChartDataSetProtocol newElement);
    @Method(selector = "removeDataSetByIndex:")
    public native ChartDataSetProtocol removeDataSetByIndex(@MachineSizedSInt long i);
    /*</methods>*/
}
