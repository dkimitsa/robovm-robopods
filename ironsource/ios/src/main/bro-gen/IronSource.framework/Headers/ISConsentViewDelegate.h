//
//  ISConsentViewDelegate.h
//  IronSource
//
//  Copyright © 2020 ironSource. All rights reserved.
//

#ifndef ISConsentViewDelegate_h
#define ISConsentViewDelegate_h

DEPRECATED_MSG_ATTRIBUTE("This protocol is deprecated and will be removed in version 9.0.0.")
@protocol ISConsentViewDelegate <NSObject>

@required

- (void)consentViewDidLoadSuccess:(NSString *)consentViewType
    DEPRECATED_MSG_ATTRIBUTE("This method is deprecated and will be removed in version 9.0.0.");

- (void)consentViewDidFailToLoadWithError:(NSError *)error
                          consentViewType:(NSString *)consentViewType
    DEPRECATED_MSG_ATTRIBUTE("This method is deprecated and will be removed in version 9.0.0.");

- (void)consentViewDidShowSuccess:(NSString *)consentViewType
    DEPRECATED_MSG_ATTRIBUTE("This method is deprecated and will be removed in version 9.0.0.");

- (void)consentViewDidFailToShowWithError:(NSError *)error
                          consentViewType:(NSString *)consentViewType
    DEPRECATED_MSG_ATTRIBUTE("This method is deprecated and will be removed in version 9.0.0.");

- (void)consentViewDidAccept:(NSString *)consentViewType
    DEPRECATED_MSG_ATTRIBUTE("This method is deprecated and will be removed in version 9.0.0.");

- (void)consentViewDidDismiss:(NSString *)consentViewType
    DEPRECATED_MSG_ATTRIBUTE("This method is deprecated and will be removed in version 9.0.0.");

@end

#endif /* ISConsentViewDelegate_h */
