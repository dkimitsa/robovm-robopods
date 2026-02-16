//
//  SingularLogLevel.h
//  Singular
//
//  Copyright 2010-2025 Singular Labs. All rights reserved.
//

#import <Foundation/Foundation.h>

typedef NS_ENUM(NSInteger, SingularLogLevel) {
    SingularLogLevelNone = 0,    // No logging
    SingularLogLevelError = 1,   // Only errors
    SingularLogLevelWarning = 2, // Errors and warnings
    SingularLogLevelInfo = 3,    // Errors, warnings, and info
    SingularLogLevelDebug = 4,   // All logs including debug
    SingularLogLevelVerbose = 5  // Most verbose logging
};
