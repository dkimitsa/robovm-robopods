//endpoints
#define kTenjinEventEndpoint @"v0/event"
#define kTenjinUserEndpoint @"v0/user"
#define kTenjinPurchaseEndpoint @"v0/purchase"
#define kTenjinSubscriptionEndpoint @"v1/subscriptions"
#define kTenjinAdRevenueEndpoint @"v0/ad_impression"
#define kTenjinAdMobAdRevenueEndpoint @"v0/ad_impressions/admob"
#define kTenjinAdRevenueAppLovinEndpoint @"v0/ad_impressions/max"
#define kTenjinAdRevenueIronSourceEndpoint @"v0/ad_impressions/ironsource"
#define kTenjinHyperBidRevenueEndpoint @"v0/ad_impressions/hyperbid"
#define kTenjinTopOnRevenueEndpoint @"v0/ad_impressions/topon"
#define kTenjinCASRevenueEndpoint @"v0/ad_impressions/cas"
#define kTenjinTradPlusRevenueEndpoint @"v0/ad_impressions/tradplus"
#define kTenjinConversionEndpoint @"v0/conversion-values"

//this line replaced by build script
#define kTenjinTenjinSDKVersion @"1.16.1"



#define kTenjinPlatformIos @"ios"
#define kTenjinHTTPMethodPOST @"POST"
#define kTenjinHTTPMethodGET @"GET"
#define kTenjinPrefsFile @"TenjinPreferences"

#define kTenjinBundleId @"bundle_id"
#define kTenjinAdvertisingId @"advertising_id"
#define kTenjinVendorId @"developer_device_id"
#define kTenjinGoogleODMInfo @"omd_info"
#define kTenjinPlatform @"platform"
#define kTenjinAppVersion @"app_version"
#define kTenjinAppSubversion @"app_subversion"
#define kTenjinTrackingAuthorizationStatus @"tracking_status"
#define kTenjinOsVersion @"os_version"
#define kTenjinLimitAdTracking @"limit_ad_tracking"
#define kTenjinSdkVersion @"sdk_version"
#define kTenjinCountry @"country"
#define kTenjinDevice @"device"
#define kTenjinBuildId @"build_id"
#define kTenjinOsVersionRelease @"os_version_release"
#define kTenjinLocale @"locale"
#define kTenjinTimeZone @"timezone"
#define kTenjinDeviceInfo @"device_info"
#define kTenjinDeviceModel @"device_model"
#define kTenjinAAAttributionToken @"attribution_token"
#define kTenjinCustomerUserId @"customer_user_id"
#define kTenjinPlugin @"plugin"
#define kTenjinPluginVersion @"plugin_version"
#define kTenjinEvent @"event"
#define kTenjinAnalyticsId @"analytics_installation_id"
#define kTenjinSDKAnalyticsMetrics @"sdk_analytics_metrics"

// User Profile Analytics Parameters
#define kTenjinSessionCount @"session_count"
#define kTenjinTotalSessionTime @"total_session_time"
#define kTenjinAverageSessionLength @"average_session_length"
#define kTenjinLastSessionLength @"last_session_length"
#define kTenjinCurrentSessionLength @"current_session_length"
#define kTenjinIAPTransactionCount @"iap_transaction_count"
#define kTenjinTotalILRDRevenueUSD @"total_ilrd_revenue_usd"
#define kTenjinFirstSessionDate @"first_session_date"
#define kTenjinLastSessionDate @"last_session_date"

#define kTenjinSessionId @"session_id"
#define kTenjinSentAt @"sent_at"
#define kTenjinInitializedAt @"initialized_at"
#define kTenjinSignature @"signature"
#define kTenjinConversionValue @"conversion_value"
#define kTenjinCoarseConversionValue @"coarse_conversion_value"
#define kTenjinLockWindow @"lock_window"
#define kTenjinRetryEnabled @"retry_enabled"
#define kTenjinGoogleAdPersonalization @"ad_personalization"
#define kTenjinGoogleAdUserData @"ad_user_data"
#define kTenjinIABTCF @"iab_tcf"
#define kTenjinGoogleAdPersonalizationKey @"TENJIN_GOOGLE_AD_PERSONALIZATION"
#define kTenjinGoogleAdUserDataKey @"TENJIN_GOOGLE_AD_USER_DATA"
#define kTenjinGoogleDMADisabled @"TENJIN_GOOGLE_DMA_DISABLED"

#define kTenjinAttributionMaxBackoff 15

#define kTenjinStartupMaxRetries 5
#define kTenjinRetrySleepBaseInSeconds 2.0
#define kTenjinRetrySleepCapInSeconds 15.0
