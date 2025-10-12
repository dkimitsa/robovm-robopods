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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("DGCharts.PieChartData")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/PieChartData/*</name>*/ 
    extends /*<extends>*/ChartData/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class PieChartDataPtr extends Ptr<PieChartData, PieChartDataPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(PieChartData.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public PieChartData() {}
    protected PieChartData(Handle h, long handle) { super(h, handle); }
    protected PieChartData(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithDataSets:")
    public PieChartData(NSArray<?> dataSets) { super((SkipInit) null); initObject(init(dataSets)); }
    @Method(selector = "initWithDataSet:")
    public PieChartData(ChartDataSetProtocol dataSet) { super(dataSet); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "dataSet")
    public native PieChartDataSetProtocol getDataSet();
    @Property(selector = "setDataSet:")
    public native void setDataSet(PieChartDataSetProtocol v);
    @Property(selector = "dataSets")
    public native NSArray<?> getDataSets();
    @Property(selector = "setDataSets:")
    public native void setDataSets(NSArray<?> v);
    @Property(selector = "yValueSum")
    public native double getYValueSum();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithDataSets:")
    protected native @Pointer long init(NSArray<?> dataSets);
    @Method(selector = "dataSetAtIndex:")
    public native ChartDataSetProtocol dataSetAtIndex(@MachineSizedSInt long index);
    @Method(selector = "dataSetForLabel:ignorecase:")
    public native ChartDataSetProtocol dataSetForLabel(String label, boolean ignorecase);
    @Method(selector = "entryFor:")
    public native ChartDataEntry entryFor(ChartHighlight highlight);
    /*</methods>*/
}
