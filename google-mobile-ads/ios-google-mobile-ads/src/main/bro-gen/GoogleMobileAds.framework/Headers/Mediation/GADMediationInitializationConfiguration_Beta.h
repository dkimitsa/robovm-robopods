//
//  GADMediationInitializationConfiguration.h
//  Google Mobile Ads SDK
//
//  Copyright 2026 Google LLC. All rights reserved.
//

#import <Foundation/Foundation.h>

/// Configuration for mediation adapter initialization during GMA SDK initialization.
NS_SWIFT_NAME(MediationInitializationConfiguration)
@interface GADMediationInitializationConfiguration : NSObject

#pragma mark Filter Rules
/// The following properties are used to filter the set of adapters to initialize during GMA SDK
/// initialization.

/// The ad formats for which the SDK will initialize adapters. If |includedAdUnitIDs| is also
/// specified, an adapter will have to be associated with both one of the included ad formats AND
/// one of the included ad units IDs.
@property(nonatomic, copy, nonnull) NSSet<NSNumber *> *includedAdFormats;

/// The ad unit IDs for which the SDK will initialize adapters. If |includedAdFormats| is also
/// specified, an adapter will have to be associated with both one of the included ad unit IDs AND
/// one of the included ad formats.
@property(nonatomic, copy, nonnull) NSSet<NSString *> *includedAdUnitIDs;

/// The adapter classes to initialize. An adapter in this set will always be initialized, regardless
/// of ad unit and format settings, unless it is present in |excludedAdapterClasses|.
@property(nonatomic, copy, nonnull) NSSet<NSString *> *includedAdapterClasses;

/// The adapter classes to exclude from initialization. An adapter in this set will never be
/// initialized, regardless of values set on |includedAdFormats|, |includedAdUnitIDs|, or
/// |includedAdapterClasses|.
@property(nonatomic, copy, nonnull) NSSet<NSString *> *excludedAdapterClasses;

#pragma mark Timeout

/// The maximum amount of time in seconds the SDK waits for initialization to complete before
/// invoking |GADInitializationCompletionHandler|.
@property(nonatomic) NSTimeInterval initializationTimeout;

@end
