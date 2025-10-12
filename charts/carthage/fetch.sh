#!/bin/sh
set -e

# clean up
rm -rf Carthage
rm Cartfile.resolved

carthage update --platform ios  --use-xcframeworks

cp -R Carthage/Build/DGCharts.xcframework ./
