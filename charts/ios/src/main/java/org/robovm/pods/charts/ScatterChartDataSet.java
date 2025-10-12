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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("DGCharts.ScatterChartDataSet")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ScatterChartDataSet/*</name>*/ 
    extends /*<extends>*/LineScatterCandleRadarChartDataSet/*</extends>*/ 
    /*<implements>*/implements ScatterChartDataSetProtocol/*</implements>*/ {

    /*<ptr>*/public static class ScatterChartDataSetPtr extends Ptr<ScatterChartDataSet, ScatterChartDataSetPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ScatterChartDataSet.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public ScatterChartDataSet() {}
    protected ScatterChartDataSet(Handle h, long handle) { super(h, handle); }
    protected ScatterChartDataSet(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithEntries:label:")
    public ScatterChartDataSet(NSArray<ChartDataEntry> entries, String label) { super((SkipInit) null); initObject(init(entries, label)); }
    @Method(selector = "initWithLabel:")
    public ScatterChartDataSet(String label) { super(label); }
    @Method(selector = "initWithEntries:")
    public ScatterChartDataSet(NSArray<ChartDataEntry> entries) { super(entries); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "scatterShapeSize")
    public native @MachineSizedFloat double getScatterShapeSize();
    @Property(selector = "setScatterShapeSize:")
    public native void setScatterShapeSize(@MachineSizedFloat double v);
    @Property(selector = "scatterShapeHoleRadius")
    public native @MachineSizedFloat double getScatterShapeHoleRadius();
    @Property(selector = "setScatterShapeHoleRadius:")
    public native void setScatterShapeHoleRadius(@MachineSizedFloat double v);
    @Property(selector = "scatterShapeHoleColor")
    public native UIColor getScatterShapeHoleColor();
    @Property(selector = "setScatterShapeHoleColor:")
    public native void setScatterShapeHoleColor(UIColor v);
    @Property(selector = "shapeRenderer")
    public native ShapeRenderer getShapeRenderer();
    @Property(selector = "setShapeRenderer:")
    public native void setShapeRenderer(ShapeRenderer v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "setScatterShape:")
    public native void setScatterShape(ScatterShape shape);
    @Method(selector = "copyWithZone:")
    public native NSObject copy(NSZone zone);
    @Method(selector = "initWithEntries:label:")
    protected native @Pointer long init(NSArray<ChartDataEntry> entries, String label);
    @Method(selector = "rendererForShape:")
    public static native ShapeRenderer rendererForShape(ScatterShape shape);
    /*</methods>*/
}
