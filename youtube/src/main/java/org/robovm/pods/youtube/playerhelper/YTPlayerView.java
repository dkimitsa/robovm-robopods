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
package org.robovm.pods.youtube.playerhelper;

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
import org.robovm.apple.webkit.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/YTPlayerView/*</name>*/ 
    extends /*<extends>*/UIView/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class YTPlayerViewPtr extends Ptr<YTPlayerView, YTPlayerViewPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(YTPlayerView.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public YTPlayerView() {}
    protected YTPlayerView(Handle h, long handle) { super(h, handle); }
    protected YTPlayerView(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithFrame:")
    public YTPlayerView(@ByVal CGRect frame) { super(frame); }
    @Method(selector = "initWithCoder:")
    public YTPlayerView(NSCoder coder) { super(coder); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "webView")
    public native WKWebView getWebView();
    @Property(selector = "delegate")
    public native YTPlayerViewDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(YTPlayerViewDelegate v);
    @WeaklyLinked
    @Property(selector = "layerClass")
    public static native Class<? extends CALayer> getLayerClass();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @GlobalValue(symbol="youtube_ios_player_helperVersionNumber", optional=true)
    public static native double helperVersionNumber();
    @GlobalValue(symbol="youtube_ios_player_helperVersionString", optional=true)
    public static native BytePtr helperVersionString();
    
    @Method(selector = "loadWithVideoId:")
    public native boolean loadVideoById(String videoId);
    @Method(selector = "loadWithPlaylistId:")
    public native boolean loadPlaylistByPlaylist(String playlistId);
    @Method(selector = "loadWithVideoId:playerVars:")
    public native boolean loadVideoById(String videoId, NSDictionary<?, ?> playerVars);
    @Method(selector = "loadWithPlaylistId:playerVars:")
    public native boolean loadPlaylistByPlaylist(String playlistId, NSDictionary<?, ?> playerVars);
    @Method(selector = "loadWithPlayerParams:")
    public native boolean load(NSDictionary<?, ?> additionalPlayerParams);
    @Method(selector = "playVideo")
    public native void playVideo();
    @Method(selector = "pauseVideo")
    public native void pauseVideo();
    @Method(selector = "stopVideo")
    public native void stopVideo();
    @Method(selector = "seekToSeconds:allowSeekAhead:")
    public native void seek(float seekToSeconds, boolean allowSeekAhead);
    @Method(selector = "cueVideoById:startSeconds:")
    public native void cueVideoById(String videoId, float startSeconds);
    @Method(selector = "cueVideoById:startSeconds:endSeconds:")
    public native void cueVideoById(String videoId, float startSeconds, float endSeconds);
    @Method(selector = "loadVideoById:startSeconds:")
    public native void loadVideoById(String videoId, float startSeconds);
    @Method(selector = "loadVideoById:startSeconds:endSeconds:")
    public native void loadVideoById(String videoId, float startSeconds, float endSeconds);
    @Method(selector = "cueVideoByURL:startSeconds:")
    public native void cueVideoByURL(String videoURL, float startSeconds);
    @Method(selector = "cueVideoByURL:startSeconds:endSeconds:")
    public native void cueVideoByURL(String videoURL, float startSeconds, float endSeconds);
    @Method(selector = "loadVideoByURL:startSeconds:")
    public native void loadVideoByURL(String videoURL, float startSeconds);
    @Method(selector = "loadVideoByURL:startSeconds:endSeconds:")
    public native void loadVideoByURL(String videoURL, float startSeconds, float endSeconds);
    @Method(selector = "cuePlaylistByPlaylistId:index:startSeconds:")
    public native void cuePlaylistByPlaylistId(String playlistId, int index, float startSeconds);
    @Method(selector = "cuePlaylistByVideos:index:startSeconds:")
    public native void cuePlaylistByVideos(NSArray<?> videoIds, int index, float startSeconds);
    @Method(selector = "loadPlaylistByPlaylistId:index:startSeconds:")
    public native void loadPlaylistByPlaylistId(String playlistId, int index, float startSeconds);
    @Method(selector = "loadPlaylistByVideos:index:startSeconds:")
    public native void loadPlaylistByVideos(NSArray<?> videoIds, int index, float startSeconds);
    @Method(selector = "nextVideo")
    public native void nextVideo();
    @Method(selector = "previousVideo")
    public native void previousVideo();
    @Method(selector = "playVideoAt:")
    public native void playVideoAt(int index);
    @Method(selector = "playbackRate:")
    public native void playbackRate(@Block VoidBlock2<Float, NSError> completionHandler);
    @Method(selector = "setPlaybackRate:")
    public native void setPlaybackRate(float suggestedRate);
    @Method(selector = "availablePlaybackRates:")
    public native void availablePlaybackRates(@Block VoidBlock2<NSArray<?>, NSError> completionHandler);
    @Method(selector = "setLoop:")
    public native void setLoop(boolean loop);
    @Method(selector = "setShuffle:")
    public native void setShuffle(boolean shuffle);
    @Method(selector = "videoLoadedFraction:")
    public native void videoLoadedFraction(@Block VoidBlock2<Float, NSError> completionHandler);
    @Method(selector = "playerState:")
    public native void playerState(@Block VoidBlock2<YTPlayerState, NSError> completionHandler);
    @Method(selector = "currentTime:")
    public native void currentTime(@Block VoidBlock2<Float, NSError> completionHandler);
    @Method(selector = "duration:")
    public native void duration(@Block VoidBlock2<Double, NSError> completionHandler);
    @Method(selector = "videoUrl:")
    public native void videoUrl(@Block VoidBlock2<NSURL, NSError> completionHandler);
    @Method(selector = "videoEmbedCode:")
    public native void videoEmbedCode(@Block VoidBlock2<NSString, NSError> completionHandler);
    @Method(selector = "playlist:")
    public native void playlist(@Block VoidBlock2<NSArray<?>, NSError> completionHandler);
    @Method(selector = "playlistIndex:")
    public native void playlistIndex(@Block VoidBlock2<Integer, NSError> completionHandler);
    @Method(selector = "removeWebView")
    public native void removeWebView();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "userInterfaceLayoutDirectionForSemanticContentAttribute:")
    public static native UIUserInterfaceLayoutDirection getUserInterfaceLayoutDirection(UISemanticContentAttribute attribute);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "userInterfaceLayoutDirectionForSemanticContentAttribute:relativeToLayoutDirection:")
    public static native UIUserInterfaceLayoutDirection getUserInterfaceLayoutDirection(UISemanticContentAttribute semanticContentAttribute, UIUserInterfaceLayoutDirection layoutDirection);
    /*</methods>*/
}
