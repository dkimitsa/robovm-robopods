#import <UnityAds/USRVJsonStorage.h>

__attribute__((deprecated(
                          "Use the appropriate replacement depending on your use case:"
                          " For configuration data: use extras in InitializationConfiguration (UADSInitializationConfiguration),"
                          " LoadConfiguration (UADSLoadConfiguration), or ShowConfiguration (UADSShowConfiguration)."
                          " For privacy data: use UnityAds.setUserConsent(_:), UnityAds.setUserOptOut(_:), or UnityAds.setNonBehavioral(_:)"
                          " (Objective-C: [UnityAds setUserConsent:], [UnityAds setUserOptOut:], or [UnityAds setNonBehavioral:])."
                          )))
@interface UADSMetaData : USRVJsonStorage

@property (nonatomic, strong) NSString *category;

- (instancetype)initWithCategory: (NSString *)category;
- (BOOL)setRaw: (NSString *)key value: (id)value;
- (void)        commit;

@end
