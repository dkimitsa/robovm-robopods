//
//  ALCMPError.h
//  AppLovinSDK
//
//  Created by Thomas So on 7/26/23.
//

NS_ASSUME_NONNULL_BEGIN

typedef NS_ENUM(NSInteger, ALCMPErrorCode)
{
    /**
     * Indicates that an unspecified error has occurred.
     */
    ALCMPErrorCodeUnspecified = -1,
    
    /**
     * Indicates that the CMP has not been integrated correctly.
     */
    ALCMPErrorCodeIntegrationError = 1,
    
    /**
     * Indicates that the CMP form is unavailable.
     */
    ALCMPErrorCodeFormUnavailable = 2,
    
    /**
     * Indicates that the CMP form is not required.
     */
    ALCMPErrorCodeFormNotRequired = 3,
};

@interface ALCMPError : NSObject

/**
 * The error code for this error.
 */
@property (nonatomic, assign, readonly) ALCMPErrorCode code;

/**
 * The error message for this error.
 */
@property (nonatomic, copy, readonly) NSString *message;

/**
 * The error code returned by the CMP.
 */
@property (nonatomic, assign, readonly) NSInteger cmpCode;

/**
 * The error message returned by the CMP.
 */
@property (nonatomic, copy, readonly) NSString *cmpMessage;

- (instancetype)init NS_UNAVAILABLE;
- (instancetype)new NS_UNAVAILABLE;

@end

NS_ASSUME_NONNULL_END
