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
package org.robovm.pods.inmobi.sdk;

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
import org.robovm.apple.corelocation.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass("InMobiSDK.IMCustomAlertViewController")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/IMCustomAlertViewController/*</name>*/ 
    extends /*<extends>*/UIViewController/*</extends>*/ 
    /*<implements>*/implements UIGestureRecognizerDelegate/*</implements>*/ {

    /*<ptr>*/public static class IMCustomAlertViewControllerPtr extends Ptr<IMCustomAlertViewController, IMCustomAlertViewControllerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(IMCustomAlertViewController.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public IMCustomAlertViewController() {}
    protected IMCustomAlertViewController(Handle h, long handle) { super(h, handle); }
    protected IMCustomAlertViewController(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithNibName:bundle:")
    public IMCustomAlertViewController(String nibNameOrNil, NSBundle nibBundleOrNil) { super((SkipInit) null); initObject(init(nibNameOrNil, nibBundleOrNil)); }
    @Method(selector = "initWithCoder:")
    public IMCustomAlertViewController(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "onConfirm")
    public native @Block Runnable getOnConfirm();
    @Property(selector = "setOnConfirm:")
    public native void setOnConfirm(@Block Runnable v);
    @Property(selector = "onCancel")
    public native @Block Runnable getOnCancel();
    @Property(selector = "setOnCancel:")
    public native void setOnCancel(@Block Runnable v);
    @Property(selector = "inputText")
    public native String getInputText();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithNibName:bundle:")
    protected native @Pointer long init(String nibNameOrNil, NSBundle nibBundleOrNil);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    @Method(selector = "configureWithTitle:message:showCancelButton:showTextField:defaultInputText:dismissOnOutsideTap:")
    public native void configure(String title, String message, boolean showCancelButton, boolean showsTextField, String textFieldDefaultText, boolean dismissOnOutsideTap);
    @Method(selector = "viewDidLoad")
    public native void viewDidLoad();
    @Method(selector = "gestureRecognizer:shouldReceiveTouch:")
    public native boolean shouldReceiveTouch(UIGestureRecognizer gestureRecognizer, UITouch touch);
    @Method(selector = "gestureRecognizerShouldBegin:")
    public native boolean shouldBegin(UIGestureRecognizer gestureRecognizer);
    @Method(selector = "gestureRecognizer:shouldRecognizeSimultaneouslyWithGestureRecognizer:")
    public native boolean shouldRecognizeSimultaneously(UIGestureRecognizer gestureRecognizer, UIGestureRecognizer otherGestureRecognizer);
    @Method(selector = "gestureRecognizer:shouldRequireFailureOfGestureRecognizer:")
    public native boolean shouldRequireFailure(UIGestureRecognizer gestureRecognizer, UIGestureRecognizer otherGestureRecognizer);
    @Method(selector = "gestureRecognizer:shouldBeRequiredToFailByGestureRecognizer:")
    public native boolean shouldBeRequiredToFail(UIGestureRecognizer gestureRecognizer, UIGestureRecognizer otherGestureRecognizer);
    @Method(selector = "gestureRecognizer:shouldReceivePress:")
    public native boolean shouldReceivePress(UIGestureRecognizer gestureRecognizer, UIPress press);
    /**
     * @since Available in iOS 13.4 and later.
     */
    @Method(selector = "gestureRecognizer:shouldReceiveEvent:")
    public native boolean shouldReceiveEvent(UIGestureRecognizer gestureRecognizer, UIEvent event);
    /*</methods>*/
}
