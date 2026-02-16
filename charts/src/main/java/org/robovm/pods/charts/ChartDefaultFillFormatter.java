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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ChartDefaultFillFormatter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements ChartFillFormatter/*</implements>*/ {

    /*<ptr>*/public static class ChartDefaultFillFormatterPtr extends Ptr<ChartDefaultFillFormatter, ChartDefaultFillFormatterPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ChartDefaultFillFormatter.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public ChartDefaultFillFormatter() {}
    protected ChartDefaultFillFormatter(Handle h, long handle) { super(h, handle); }
    protected ChartDefaultFillFormatter(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithBlock:")
    public ChartDefaultFillFormatter(@Block Block2<LineChartDataSetProtocol, LineChartDataProvider, Double> block) { super((SkipInit) null); initObject(init(block)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "block")
    public native @Block Block2<LineChartDataSetProtocol, LineChartDataProvider, Double> getBlock();
    @Property(selector = "setBlock:")
    public native void setBlock(@Block Block2<LineChartDataSetProtocol, LineChartDataProvider, Double> v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithBlock:")
    protected native @Pointer long init(@Block Block2<LineChartDataSetProtocol, LineChartDataProvider, Double> block);
    @Method(selector = "getFillLinePositionWithDataSet:dataProvider:")
    public native @MachineSizedFloat double getFillLinePosition(LineChartDataSetProtocol dataSet, LineChartDataProvider dataProvider);
    @Method(selector = "withBlock:")
    public static native ChartDefaultFillFormatter withBlock(@Block Block2<LineChartDataSetProtocol, LineChartDataProvider, Double> block);
    /*</methods>*/
}
