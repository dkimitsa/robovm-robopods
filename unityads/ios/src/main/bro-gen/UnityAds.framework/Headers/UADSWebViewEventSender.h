#ifdef UNITYADS_INTERNAL_SWIFT
#ifndef UADSWebViewEventSender_h
#define UADSWebViewEventSender_h

@protocol UADSWebViewEvent <NSObject>
- (NSString *_Nonnull)          categoryName;
- (NSString *_Nonnull)          eventName;
- (NSArray *_Nullable)  params;
@end


@protocol UADSWebViewEventSender<NSObject>
- (void)sendEvent: (id<UADSWebViewEvent>_Nonnull)event;
@end

#endif /* UADSWebViewEventSender_h */
#endif
