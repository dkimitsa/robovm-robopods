#ifdef UNITYADS_INTERNAL_SWIFT
#import <UnityAds/USRVStorage.h>

@interface USRVStorageManager : NSObject

+ (instancetype) sharedInstance;
+ (USRVStorage *)getStorage: (UnityServicesStorageType)storageType;
- (USRVStorage *)getStorage: (UnityServicesStorageType)storageType;
- (void)commit: (NSDictionary *)storageContents storageType: (UnityServicesStorageType)storageType;

@end
#endif
