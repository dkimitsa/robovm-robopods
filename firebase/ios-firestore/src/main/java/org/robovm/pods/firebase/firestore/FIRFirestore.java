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
package org.robovm.pods.firebase.firestore;

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
import org.robovm.apple.dispatch.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FIRFirestore/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class FIRFirestorePtr extends Ptr<FIRFirestore, FIRFirestorePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FIRFirestore.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected FIRFirestore() {}
    protected FIRFirestore(Handle h, long handle) { super(h, handle); }
    protected FIRFirestore(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "settings")
    public native FIRFirestoreSettings getSettings();
    @Property(selector = "setSettings:")
    public native void setSettings(FIRFirestoreSettings v);
    @Property(selector = "app")
    public native org.robovm.pods.firebase.core.FIRApp getApp();
    @Property(selector = "persistentCacheIndexManager")
    public native FIRPersistentCacheIndexManager getPersistentCacheIndexManager();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @deprecated Instead of creating cache indexes manually, consider using `PersistentCacheIndexManager.enableIndexAutoCreation()` to let the SDK decide whether to create cache indexes for queries running locally.
     */
    @Deprecated
    @Method(selector = "setIndexConfigurationFromJSON:completion:")
    public native void setIndexConfigurationFromJSON(String json, @Block VoidBlock1<NSError> completion);
    /**
     * @deprecated Instead of creating cache indexes manually, consider using `PersistentCacheIndexManager.enableIndexAutoCreation()` to let the SDK decide whether to create cache indexes for queries running locally.
     */
    @Deprecated
    @Method(selector = "setIndexConfigurationFromStream:completion:")
    public native void setIndexConfigurationFromStream(NSInputStream stream, @Block VoidBlock1<NSError> completion);
    @Method(selector = "collectionWithPath:")
    public native FIRCollectionReference getCollection(String collectionPath);
    @Method(selector = "documentWithPath:")
    public native FIRDocumentReference getDocument(String documentPath);
    @Method(selector = "collectionGroupWithID:")
    public native FIRQuery getCollectionGroup(String collectionID);
    @Method(selector = "runTransactionWithBlock:completion:")
    public native void runTransaction(@Block Block2<FIRTransaction, NSError.NSErrorPtr, NSObject> updateBlock, @Block VoidBlock2<NSObject, NSError> completion);
    @Method(selector = "runTransactionWithOptions:block:completion:")
    public native void runTransaction(FIRTransactionOptions options, @Block Block2<FIRTransaction, NSError.NSErrorPtr, NSObject> updateBlock, @Block VoidBlock2<NSObject, NSError> completion);
    @Method(selector = "batch")
    public native FIRWriteBatch batch();
    @Method(selector = "useEmulatorWithHost:port:")
    public native void useEmulator(String host, @MachineSizedSInt long port);
    @Method(selector = "enableNetworkWithCompletion:")
    public native void enableNetwork(@Block VoidBlock1<NSError> completion);
    @Method(selector = "disableNetworkWithCompletion:")
    public native void disableNetwork(@Block VoidBlock1<NSError> completion);
    @Method(selector = "clearPersistenceWithCompletion:")
    public native void clearPersistence(@Block VoidBlock1<NSError> completion);
    @Method(selector = "waitForPendingWritesWithCompletion:")
    public native void waitForPendingWrites(@Block VoidBlock1<NSError> completion);
    @Method(selector = "addSnapshotsInSyncListener:")
    public native FIRListenerRegistration addSnapshotsInSyncListener(@Block Runnable listener);
    @Method(selector = "terminateWithCompletion:")
    public native void terminate(@Block VoidBlock1<NSError> completion);
    @Method(selector = "loadBundle:")
    public native FIRLoadBundleTask loadBundle(NSData bundleData);
    @Method(selector = "loadBundle:completion:")
    public native FIRLoadBundleTask loadBundle(NSData bundleData, @Block VoidBlock2<FIRLoadBundleTaskProgress, NSError> completion);
    @Method(selector = "loadBundleStream:")
    public native FIRLoadBundleTask loadBundleStream(NSInputStream bundleStream);
    @Method(selector = "loadBundleStream:completion:")
    public native FIRLoadBundleTask loadBundleStream(NSInputStream bundleStream, @Block VoidBlock2<FIRLoadBundleTaskProgress, NSError> completion);
    @Method(selector = "getQueryNamed:completion:")
    public native void getQuery(String name, @Block VoidBlock1<FIRQuery> completion);
    @Method(selector = "firestore")
    public static native FIRFirestore firestore();
    @Method(selector = "firestoreForApp:")
    public static native FIRFirestore firestoreForApp(org.robovm.pods.firebase.core.FIRApp app);
    @Method(selector = "firestoreForApp:database:")
    public static native FIRFirestore firestoreForApp(org.robovm.pods.firebase.core.FIRApp app, String database);
    @Method(selector = "firestoreForDatabase:")
    public static native FIRFirestore firestoreForDatabase(String database);
    @Method(selector = "enableLogging:")
    public static native void enableLogging(boolean logging);
    /*</methods>*/
}
