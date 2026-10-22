#!/bin/sh

#
# Small tools that build dependency tree between frameworks of Firebase
# for each framework it does:
# - list all exported symbols to out/symbols
# - list all imported symbols to out/${framework}.deps
# Then for each imported symbol it finds a framework where it is exported from 
#

function dump_exports {
  nm -g -U -j $1 2>/dev/null | grep -v ":" | sort | uniq | xargs -n 1 -I '{}' echo '{}' $2 >> out/symbols
}

function dump_deps {
  nm -g -u -j $1 2>/dev/null | grep -v ":" | sort | uniq | xargs -n 1 echo > out/$2.deps
}

print_tree() {
  local nm=$1
  local tabs="$2"
  if [ -f out/$nm.deps ]; then
    echo "$tabs$nm"
    deps=$(join -o2.2 out/$nm.deps out/symbols | sort | uniq | grep -v $nm)
    for d in ${deps[@]}; do
      print_tree $d "  $tabs"
    done
  fi
}

rm -rf out
mkdir out

echo "Analyzing dependencies..."
for frm in $(find ~/Downloads/Firebase -name "*.framework"); do
  if [[ $frm == *"xcframework"* && $frm != *"arm64"* ]]; then
    continue
  fi
  nm=$(basename $frm .framework)
  echo "  ...$nm"
  dump_exports "$frm/$nm" $nm
  dump_deps "$frm/$nm" $nm
done

sort -o out/symbols out/symbols

# frameworks to list dependencies
frameworks=(
  FirebaseCore
  FirebaseAnalytics
  FirebaseCoreDiagnostics
  FirebaseAuth
  FirebaseCrashlytics
  FirebaseDatabase
  FirebaseDynamicLinks
  GoogleMobileAds
  GoogleAppMeasurement
  UserMessagingPlatform
  FirebaseMessaging
  FirebaseRemoteConfig
  FirebaseFirestore
  FirebaseStorage
)

echo "Results:"
for frm in ${frameworks[@]}; do
  nm=$(basename $frm)
  print_tree $nm ""
  echo "" # new line
done
