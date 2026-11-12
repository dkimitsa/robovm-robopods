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
rm -rf Pods Podfile.lock build-iphoneos build-iphonesimulator *.xcframework

# Install pods
VERSION="$VERSION" pod install

# Build frameworks for device and simulator with static linkage
xcodebuild -project Pods/Pods.xcodeproj -scheme GoogleSignIn -configuration Release -sdk iphoneos ONLY_ACTIVE_ARCH=NO BUILD_LIBRARY_FOR_DISTRIBUTION=YES build CODE_SIGNING_REQUIRED=NO CODE_SIGNING_ALLOWED=NO CONFIGURATION_BUILD_DIR="$DIR/build-iphoneos"
xcodebuild -project Pods/Pods.xcodeproj -scheme GoogleSignIn -configuration Release -sdk iphonesimulator ONLY_ACTIVE_ARCH=NO BUILD_LIBRARY_FOR_DISTRIBUTION=YES build CODE_SIGNING_REQUIRED=NO CODE_SIGNING_ALLOWED=NO CONFIGURATION_BUILD_DIR="$DIR/build-iphonesimulator"

# Frameworks unique to GoogleSignIn to package as xcframeworks (others are available in Firebase package)
FRAMEWORKS=(
    "GoogleSignIn"
    "AppAuth"
    "GTMAppAuth"
    "Promises"
)

# Create xcframeworks
for FW in "${FRAMEWORKS[@]}"; do
    rm -rf "$DIR/${FW}.xcframework"
    xcodebuild -create-xcframework \
        -framework "$DIR/build-iphoneos/${FW}.framework" \
        -framework "$DIR/build-iphonesimulator/${FW}.framework" \
        -output "$DIR/${FW}.xcframework"
done

# Resolve built version
BUILT_VERSION=$(defaults read "$DIR/build-iphoneos/GoogleSignIn.framework/Info.plist" CFBundleShortVersionString)

# Stage to .robopods-wip/GoogleSignIn
DEST="$DIR/../../../.robopods-wip/GoogleSignIn"
mkdir -p "$DEST"
for FW in "${FRAMEWORKS[@]}"; do
    rm -rf "$DEST/${FW}.xcframework"
    cp -R "$DIR/${FW}.xcframework" "$DEST/"
done
echo -n "$BUILT_VERSION" > "$DEST/.version-metadata"

echo "Successfully built and staged GoogleSignIn $BUILT_VERSION and dependencies into $DEST"
