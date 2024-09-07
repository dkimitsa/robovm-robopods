#!/bin/bash
set -e 
VERSION=5.2.4
BASE_URL=https://github.com/OneSignal/OneSignal-iOS-SDK/releases/download/$VERSION/

curl --output-dir ~/Downloads -L -O $BASE_URL/OneSignalFramework.xcframework.zip
unzip ~/Downloads/OneSignalFramework.xcframework.zip -d ~/Downloads 

curl --output-dir ~/Downloads -L -O $BASE_URL/OneSignalCore.xcframework.zip
unzip ~/Downloads/OneSignalCore.xcframework.zip -d ~/Downloads

curl --output-dir ~/Downloads -L -O $BASE_URL/OneSignalOSCore.xcframework.zip
unzip ~/Downloads/OneSignalOSCore.xcframework.zip -d ~/Downloads

curl --output-dir ~/Downloads -L -O $BASE_URL/OneSignalExtension.xcframework.zip
unzip ~/Downloads/OneSignalExtension.xcframework.zip -d ~/Downloads

curl --output-dir ~/Downloads -L -O $BASE_URL/OneSignalLocation.xcframework.zip
unzip ~/Downloads/OneSignalLocation.xcframework.zip -d ~/Downloads

curl --output-dir ~/Downloads -L -O $BASE_URL/OneSignalNotifications.xcframework.zip
unzip ~/Downloads/OneSignalNotifications.xcframework.zip -d ~/Downloads

curl --output-dir ~/Downloads -L -O $BASE_URL/OneSignalInAppMessages.xcframework.zip
unzip ~/Downloads/OneSignalInAppMessages.xcframework.zip -d ~/Downloads

curl --output-dir ~/Downloads -L -O $BASE_URL/OneSignalOutcomes.xcframework.zip
unzip ~/Downloads/OneSignalOutcomes.xcframework.zip -d ~/Downloads

curl --output-dir ~/Downloads -L -O $BASE_URL/OneSignalUser.xcframework.zip
unzip ~/Downloads/OneSignalUser.xcframework.zip -d ~/Downloads

echo -n "$VERSION" > ~/Downloads/OneSignalFramework.xcframework/version