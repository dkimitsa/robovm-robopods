#!/bin/bash
set -e

DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"
cd "$DIR"

VERSION=""
if [ -n "$1" ]; then
    VERSION="${1#v}"
    echo "Fetching GoogleSignIn version $VERSION..."
else
    echo "Fetching latest GoogleSignIn..."
fi

# Clean previous build artifacts
rm -rf Pods Podfile.lock build
rm -rf GoogleSignIn.xcframework GTMSessionFetcher.xcframework

# Install pods
VERSION="$VERSION" pod install

# Build frameworks
xcodebuild -project Pods/Pods.xcodeproj -scheme GoogleSignIn -configuration Release -sdk iphoneos build CODE_SIGNING_REQUIRED=NO CODE_SIGNING_ALLOWED=NO CONFIGURATION_BUILD_DIR="$DIR/build"

# Create xcframeworks
rm -rf "$DIR/GoogleSignIn.xcframework" "$DIR/GTMSessionFetcher.xcframework"
xcodebuild -create-xcframework -framework "$DIR/build/GoogleSignIn.framework" -output "$DIR/GoogleSignIn.xcframework"
xcodebuild -create-xcframework -framework "$DIR/build/GTMSessionFetcher.framework" -output "$DIR/GTMSessionFetcher.xcframework"

# Resolve built version
BUILT_VERSION=$(defaults read "$DIR/build/GoogleSignIn.framework/Info.plist" CFBundleShortVersionString)

# Stage to .robopods-wip/GoogleSignIn
DEST="$DIR/../../../.robopods-wip/GoogleSignIn"
mkdir -p "$DEST"
rm -rf "$DEST/GoogleSignIn.xcframework" "$DEST/GTMSessionFetcher.xcframework"
cp -R "$DIR/GoogleSignIn.xcframework" "$DEST/"
cp -R "$DIR/GTMSessionFetcher.xcframework" "$DEST/"
echo -n "$BUILT_VERSION" > "$DEST/.version-metadata"

echo "Successfully built and staged GoogleSignIn $BUILT_VERSION into $DEST"
