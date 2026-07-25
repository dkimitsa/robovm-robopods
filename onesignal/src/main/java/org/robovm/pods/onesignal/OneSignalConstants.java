/*
 * Copyright (C) 2013-2015 RoboVM AB
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.pods.onesignal;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import org.robovm.objc.*;
import org.robovm.objc.annotation.*;
import org.robovm.objc.block.*;
import org.robovm.rt.*;
import org.robovm.rt.annotation.*;
import org.robovm.rt.bro.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
import org.robovm.apple.foundation.*;
import org.robovm.apple.usernotifications.*;
import org.robovm.apple.uikit.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/OneSignalConstants/*</name>*/ 
    extends /*<extends>*/CocoaUtility/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*/
    public static final String OS_API_VERSION = "1";
    public static final String OS_API_SERVER_URL = "https://api.onesignal.com/";
    public static final String OS_IAM_WEBVIEW_BASE_URL = "https://onesignal.com/";
    public static final String ONESIGNAL_VERSION = "050505";
    public static final String OSUD_APP_ID = "GT_APP_ID";
    public static final String OSUD_REGISTERED_WITH_APPLE = "GT_REGISTERED_WITH_APPLE";
    public static final String OSUD_APP_PROVIDES_NOTIFICATION_SETTINGS = "OS_APP_PROVIDES_NOTIFICATION_SETTINGS";
    public static final String OSUD_PROMPT_BEFORE_NOTIFICATION_LAUNCH_URL_OPENS = "PROMPT_BEFORE_OPENING_PUSH_URL";
    public static final String OSUD_PERMISSION_ACCEPTED_TO = "OSUD_PERMISSION_ACCEPTED_TO";
    public static final String OSUD_PERMISSION_ACCEPTED_FROM = "ONESIGNAL_PERMISSION_ACCEPTED_LAST";
    public static final String OSUD_WAS_PROMPTED_FOR_NOTIFICATIONS_TO = "OSUD_WAS_PROMPTED_FOR_NOTIFICATIONS_TO";
    public static final String OSUD_WAS_PROMPTED_FOR_NOTIFICATIONS_FROM = "OS_HAS_PROMPTED_FOR_NOTIFICATIONS_LAST";
    public static final String OSUD_WAS_NOTIFICATION_PROMPT_ANSWERED_TO = "OS_NOTIFICATION_PROMPT_ANSWERED";
    public static final String OSUD_WAS_NOTIFICATION_PROMPT_ANSWERED_FROM = "OS_NOTIFICATION_PROMPT_ANSWERED_LAST";
    public static final String OSUD_PROVISIONAL_PUSH_AUTHORIZATION_TO = "OSUD_PROVISIONAL_PUSH_AUTHORIZATION_TO";
    public static final String OSUD_PROVISIONAL_PUSH_AUTHORIZATION_FROM = "ONESIGNAL_PROVISIONAL_AUTHORIZATION_LAST";
    public static final String OSUD_USES_PROVISIONAL_PUSH_AUTHORIZATION = "ONESIGNAL_USES_PROVISIONAL_PUSH_AUTHORIZATION";
    public static final String OSUD_PERMISSION_EPHEMERAL_TO = "OSUD_PERMISSION_EPHEMERAL_TO";
    public static final String OSUD_PERMISSION_EPHEMERAL_FROM = "OSUD_PERMISSION_EPHEMERAL_FROM";
    public static final String OSUD_LANGUAGE = "OSUD_LANGUAGE";
    public static final String DEFAULT_LANGUAGE = "en";
    public static final String OSUD_LEGACY_PLAYER_ID = "GT_PLAYER_ID";
    public static final String OSUD_PUSH_SUBSCRIPTION_ID = "OSUD_PUSH_SUBSCRIPTION_ID";
    public static final String OSUD_PUSH_TOKEN = "GT_DEVICE_TOKEN";
    public static final String OSUD_LAST_MESSAGE_OPENED = "GT_LAST_MESSAGE_OPENED_";
    public static final String OSUD_TEMP_CACHED_NOTIFICATION_MEDIA = "OSUD_TEMP_CACHED_NOTIFICATION_MEDIA";
    public static final String OSUD_LOCATION_ENABLED = "OSUD_LOCATION_ENABLED";
    public static final String OSUD_REQUIRES_USER_PRIVACY_CONSENT = "OSUD_REQUIRES_USER_PRIVACY_CONSENT";
    public static final String OSUD_RECEIVE_RECEIPTS_ENABLED = "OS_ENABLE_RECEIVE_RECEIPTS";
    public static final String OSUD_OUTCOMES_V2 = "OSUD_OUTCOMES_V2";
    public static final String OSUD_NOTIFICATION_LIMIT = "NOTIFICATION_LIMIT";
    public static final String OSUD_IAM_LIMIT = "OSUD_IAM_LIMIT";
    public static final String OSUD_NOTIFICATION_ATTRIBUTION_WINDOW = "NOTIFICATION_ATTRIBUTION_WINDOW";
    public static final String OSUD_IAM_ATTRIBUTION_WINDOW = "OSUD_IAM_ATTRIBUTION_WINDOW";
    public static final String OSUD_DIRECT_SESSION_ENABLED = "DIRECT_SESSION_ENABLED";
    public static final String OSUD_INDIRECT_SESSION_ENABLED = "INDIRECT_SESSION_ENABLED";
    public static final String OSUD_UNATTRIBUTED_SESSION_ENABLED = "UNATTRIBUTED_SESSION_ENABLED";
    public static final String OSUD_CACHED_NOTIFICATION_INFLUENCE = "CACHED_SESSION";
    public static final String OSUD_CACHED_IAM_INFLUENCE = "OSUD_CACHED_IAM_INFLUENCE";
    public static final String OSUD_CACHED_DIRECT_NOTIFICATION_ID = "CACHED_DIRECT_NOTIFICATION_ID";
    public static final String OSUD_CACHED_INDIRECT_NOTIFICATION_IDS = "CACHED_INDIRECT_NOTIFICATION_IDS";
    public static final String OSUD_CACHED_RECEIVED_NOTIFICATION_IDS = "CACHED_RECEIVED_NOTIFICATION_IDS";
    public static final String OSUD_CACHED_RECEIVED_IAM_IDS = "OSUD_CACHED_RECEIVED_IAM_IDS";
    public static final String OSUD_CACHED_UNATTRIBUTED_UNIQUE_OUTCOME_EVENTS_SENT = "CACHED_UNATTRIBUTED_UNIQUE_OUTCOME_EVENTS_SENT";
    public static final String OSUD_CACHED_ATTRIBUTED_UNIQUE_OUTCOME_EVENT_NOTIFICATION_IDS_SENT = "CACHED_ATTRIBUTED_UNIQUE_OUTCOME_EVENT_NOTIFICATION_IDS_SENT";
    public static final String OSUD_LEGACY_CACHED_SDK_VERSION_FOR_MIGRATION = "OSUD_CACHED_SDK_VERSION";
    public static final String OSUD_CACHED_SDK_VERSION_FOR_CORE = "OSUD_CACHED_SDK_VERSION_FOR_CORE";
    public static final String OSUD_CACHED_SDK_VERSION_FOR_OUTCOMES = "OSUD_CACHED_SDK_VERSION_FOR_OUTCOMES";
    public static final String OSUD_CACHED_SDK_VERSION_FOR_IAM = "OSUD_CACHED_SDK_VERSION_FOR_IAM";
    public static final String OSUD_APP_LAST_CLOSED_TIME = "GT_LAST_CLOSED_TIME";
    public static final String OSUD_UNSENT_ACTIVE_TIME = "GT_UNSENT_ACTIVE_TIME";
    public static final String OSUD_UNSENT_ACTIVE_TIME_ATTRIBUTED = "GT_UNSENT_ACTIVE_TIME_ATTRIBUTED";
    public static final String ONE_SIGNAL_LOCATION_CLASS_NAME = "OneSignalLocationManager";
    public static final String ONE_SIGNAL_IN_APP_MESSAGES_CLASS_NAME = "OneSignalInAppMessages";
    public static final String ONE_SIGNAL_LIVE_ACTIVITIES_CLASS_NAME = "OneSignalLiveActivitiesManagerImpl";
    public static final String IOS_FBA = "fba";
    public static final String IOS_USES_PROVISIONAL_AUTHORIZATION = "uses_provisional_auth";
    public static final String IOS_REQUIRES_EMAIL_AUTHENTICATION = "require_email_auth";
    public static final String IOS_REQUIRES_SMS_AUTHENTICATION = "require_sms_auth";
    public static final String IOS_REQUIRES_USER_ID_AUTHENTICATION = "require_user_id_auth";
    public static final String IOS_RECEIVE_RECEIPTS_ENABLE = "receive_receipts_enable";
    public static final String IOS_OUTCOMES_V2_SERVICE_ENABLE = "v2_enabled";
    public static final String IOS_LOCATION_SHARED = "location_shared";
    public static final String IOS_REQUIRES_USER_PRIVACY_CONSENT = "requires_user_privacy_consent";
    public static final String SMS_NUMBER_KEY = "sms_number";
    public static final String SMS_NUMBER_AUTH_HASH_KEY = "sms_auth_hash";
    public static final String FALLBACK_TO_SETTINGS_MESSAGE = "Onesignal_settings_fallback_message";
    public static final String ONESIGNAL_SUPRESS_LAUNCH_URLS = "OneSignal_suppress_launch_urls";
    public static final String ONESIGNAL_IN_APP_HIDE_DROP_SHADOW = "OneSignal_in_app_message_hide_drop_shadow";
    public static final String ONESIGNAL_IN_APP_HIDE_GRAY_OVERLAY = "OneSignal_in_app_message_hide_gray_overlay";
    public static final String GDPR_CONSENT_GRANTED = "GDPR_CONSENT_GRANTED";
    public static final String ONESIGNAL_REQUIRE_PRIVACY_CONSENT = "OneSignal_require_privacy_consent";
    public static final String ONESIGNAL_DISABLE_SWIZZLING = "OneSignal_disable_swizzling";
    public static final String ONESIGNAL_DISABLE_BADGE_CLEARING = "OneSignal_disable_badge_clearing";
    public static final String ONESIGNAL_APP_GROUP_NAME_KEY = "OneSignal_app_groups_key";
    public static final String ONESIGNAL_BADGE_KEY = "onesignalBadgeCount";
    public static final String PREVIOUS_ONESIGNAL_BADGE_KEY = "previousOnesignalBadgeCount";
    public static final String ONESIGNAL_FB_ENABLE_FIREBASE = "OS_ENABLE_FIREBASE_ANALYTICS";
    public static final String ONESIGNAL_FB_LAST_TIME_RECEIVED = "OS_LAST_RECIEVED_TIME";
    public static final String ONESIGNAL_FB_LAST_GAF_CAMPAIGN_RECEIVED = "OS_LAST_RECIEVED_GAF_CAMPAIGN";
    public static final String ONESIGNAL_FB_LAST_NOTIFICATION_ID_RECEIVED = "OS_LAST_RECIEVED_NOTIFICATION_ID";
    public static final String ONESIGNAL_IAM_PREVIEW = "os_in_app_message_preview_id";
    public static final String ONESIGNAL_POST_PREVIEW_IAM = "ONESIGNAL_POST_PREVIEW_IAM";
    public static final String SESSION_OUTCOMES_TASK = "SESSION_OUTCOMES_TASK";
    public static final String OPERATION_REPO_BACKGROUND_TASK = "OPERATION_REPO_BACKGROUND_TASK";
    public static final String IDENTITY_EXECUTOR_BACKGROUND_TASK = "IDENTITY_EXECUTOR_BACKGROUND_TASK_";
    public static final String PROPERTIES_EXECUTOR_BACKGROUND_TASK = "PROPERTIES_EXECUTOR_BACKGROUND_TASK_";
    public static final String SUBSCRIPTION_EXECUTOR_BACKGROUND_TASK = "SUBSCRIPTION_EXECUTOR_BACKGROUND_TASK_";
    public static final String CUSTOM_EVENTS_EXECUTOR_BACKGROUND_TASK = "CUSTOM_EVENTS_EXECUTOR_BACKGROUND_TASK_";
    public static final String OS_PUSH = "push";
    public static final String OS_EMAIL = "email";
    public static final String OS_SMS = "sms";
    public static final String OS_SUCCESS = "success";
    public static final int NOTIFICATION_TYPE_NONE = 0;
    public static final int NOTIFICATION_TYPE_BADGE = 1;
    public static final int NOTIFICATION_TYPE_SOUND = 2;
    public static final int NOTIFICATION_TYPE_ALERT = 4;
    public static final int NOTIFICATION_TYPE_ALL = 7;
    public static final int ERROR_PUSH_CAPABLILITY_DISABLED = -13;
    public static final int ERROR_PUSH_DELEGATE_NEVER_FIRED = -14;
    public static final int ERROR_PUSH_SIMULATOR_NOT_SUPPORTED = -15;
    public static final int ERROR_PUSH_UNKNOWN_APNS_ERROR = -16;
    public static final int ERROR_PUSH_OTHER_3000_ERROR_UNUSED_RESERVED = -17;
    public static final int ERROR_PUSH_NEVER_PROMPTED = -18;
    public static final int ERROR_PUSH_PROMPT_NEVER_ANSWERED = -19;
    public static final int AUTH_STATUS_EPHEMERAL = 4;
    public static final double WEEK_IN_SECONDS = 604800.0;
    public static final String SHARED_CATEGORY_LIST = "com.onesignal.shared_registered_categories";
    public static final int DEVICE_TYPE_PUSH = 0;
    public static final int DEVICE_TYPE_EMAIL = 11;
    public static final int DEVICE_TYPE_SMS = 14;
    public static final int MAX_NSE_LIFETIME_SECOUNDS = 30;
    public static final double REATTEMPT_DELAY = 5.0;
    public static final double REQUEST_TIMEOUT_REQUEST = 120.0;
    public static final double REQUEST_TIMEOUT_RESOURCE = 120.0;
    public static final int MAX_ATTEMPT_COUNT = 5;
    public static final int MAX_CATEGORIES_SIZE = 128;
    public static final double CUSTOM_DISPLAY_TYPE_TIMEOUT = 25.0;
    public static final double MAX_CONF_DELIVERY_DELAY = 25.0;
    public static final int POLL_INTERVAL_MS = 5000;
    public static final int OP_REPO_POST_CREATE_DELAY_SECONDS = 3;
    public static final int MAX_NOTIFICATION_MEDIA_SIZE_BYTES = 50000000;
    public static final String OS_ONESIGNAL_ID = "onesignal_id";
    public static final String OS_EXTERNAL_ID = "external_id";
    public static final String OS_ON_USER_WILL_CHANGE = "OS_ON_USER_WILL_CHANGE";
    public static final String OS_SNAPSHOT_ONESIGNAL_ID = "OS_SNAPSHOT_ONESIGNAL_ID";
    public static final String OS_SNAPSHOT_EXTERNAL_ID = "OS_SNAPSHOT_EXTERNAL_ID";
    public static final String OS_IDENTITY_MODEL_KEY = "OS_IDENTITY_MODEL_KEY";
    public static final String OS_IDENTITY_MODEL_STORE_KEY = "OS_IDENTITY_MODEL_STORE_KEY";
    public static final String OS_PROPERTIES_MODEL_KEY = "OS_PROPERTIES_MODEL_KEY";
    public static final String OS_PROPERTIES_MODEL_STORE_KEY = "OS_PROPERTIES_MODEL_STORE_KEY";
    public static final String OS_PUSH_SUBSCRIPTION_MODEL_KEY = "OS_PUSH_SUBSCRIPTION_MODEL_KEY";
    public static final String OS_PUSH_SUBSCRIPTION_MODEL_STORE_KEY = "OS_PUSH_SUBSCRIPTION_MODEL_STORE_KEY";
    public static final String OS_SUBSCRIPTION_MODEL_STORE_KEY = "OS_SUBSCRIPTION_MODEL_STORE_KEY";
    public static final String OS_ADD_ALIAS_DELTA = "OS_ADD_ALIAS_DELTA";
    public static final String OS_REMOVE_ALIAS_DELTA = "OS_REMOVE_ALIAS_DELTA";
    public static final String OS_UPDATE_PROPERTIES_DELTA = "OS_UPDATE_PROPERTIES_DELTA";
    public static final String OS_ADD_SUBSCRIPTION_DELTA = "OS_ADD_SUBSCRIPTION_DELTA";
    public static final String OS_REMOVE_SUBSCRIPTION_DELTA = "OS_REMOVE_SUBSCRIPTION_DELTA";
    public static final String OS_UPDATE_SUBSCRIPTION_DELTA = "OS_UPDATE_SUBSCRIPTION_DELTA";
    public static final String OS_CUSTOM_EVENT_DELTA = "OS_CUSTOM_EVENT_DELTA";
    public static final String OS_OPERATION_REPO_DELTA_QUEUE_KEY = "OS_OPERATION_REPO_DELTA_QUEUE_KEY";
    public static final String OS_USER_EXECUTOR_USER_REQUEST_QUEUE_KEY = "OS_USER_EXECUTOR_USER_REQUEST_QUEUE_KEY";
    public static final String OS_USER_EXECUTOR_TRANSFER_SUBSCRIPTION_REQUEST_QUEUE_KEY = "OS_USER_EXECUTOR_TRANSFER_SUBSCRIPTION_REQUEST_QUEUE_KEY";
    public static final String OS_IDENTITY_EXECUTOR_DELTA_QUEUE_KEY = "OS_IDENTITY_EXECUTOR_DELTA_QUEUE_KEY";
    public static final String OS_IDENTITY_EXECUTOR_ADD_REQUEST_QUEUE_KEY = "OS_IDENTITY_EXECUTOR_ADD_REQUEST_QUEUE_KEY";
    public static final String OS_IDENTITY_EXECUTOR_REMOVE_REQUEST_QUEUE_KEY = "OS_IDENTITY_EXECUTOR_REMOVE_REQUEST_QUEUE_KEY";
    public static final String OS_PROPERTIES_EXECUTOR_DELTA_QUEUE_KEY = "OS_PROPERTIES_EXECUTOR_DELTA_QUEUE_KEY";
    public static final String OS_PROPERTIES_EXECUTOR_UPDATE_REQUEST_QUEUE_KEY = "OS_PROPERTIES_EXECUTOR_UPDATE_REQUEST_QUEUE_KEY";
    public static final String OS_SUBSCRIPTION_EXECUTOR_DELTA_QUEUE_KEY = "OS_SUBSCRIPTION_EXECUTOR_DELTA_QUEUE_KEY";
    public static final String OS_SUBSCRIPTION_EXECUTOR_ADD_REQUEST_QUEUE_KEY = "OS_SUBSCRIPTION_EXECUTOR_ADD_REQUEST_QUEUE_KEY";
    public static final String OS_SUBSCRIPTION_EXECUTOR_REMOVE_REQUEST_QUEUE_KEY = "OS_SUBSCRIPTION_EXECUTOR_REMOVE_REQUEST_QUEUE_KEY";
    public static final String OS_SUBSCRIPTION_EXECUTOR_UPDATE_REQUEST_QUEUE_KEY = "OS_SUBSCRIPTION_EXECUTOR_UPDATE_REQUEST_QUEUE_KEY";
    public static final String OS_CUSTOM_EVENTS_EXECUTOR_DELTA_QUEUE_KEY = "OS_CUSTOM_EVENTS_EXECUTOR_DELTA_QUEUE_KEY";
    public static final String OS_CUSTOM_EVENTS_EXECUTOR_REQUEST_QUEUE_KEY = "OS_CUSTOM_EVENTS_EXECUTOR_REQUEST_QUEUE_KEY";
    public static final String OS_LIVE_ACTIVITIES_EXECUTOR_UPDATE_TOKENS_KEY = "OS_LIVE_ACTIVITIES_EXECUTOR_UPDATE_TOKENS_KEY";
    public static final String OS_LIVE_ACTIVITIES_EXECUTOR_START_TOKENS_KEY = "OS_LIVE_ACTIVITIES_EXECUTOR_START_TOKENS_KEY";
    public static final String OS_LIVE_ACTIVITIES_EXECUTOR_RECEIVE_RECEIPTS_KEY = "OS_LIVE_ACTIVITIES_EXECUTOR_RECEIVE_RECEIPTS_KEY";
    public static final String OS_LIVE_ACTIVITIES_EXECUTOR_CLICKED_KEY = "OS_LIVE_ACTIVITIES_EXECUTOR_CLICKED_KEY";
    public static final int SWIFT_TYPEDEFS = 1;
    public static final String OUTCOMES_PARAM = "outcomes";
    public static final String DIRECT_PARAM = "direct";
    public static final String INDIRECT_PARAM = "indirect";
    public static final String UNATTRIBUTED_PARAM = "unattributed";
    public static final String ENABLED_PARAM = "enabled";
    public static final String NOTIFICATION_ATTRIBUTION_PARAM = "notification_attribution";
    public static final String IAM_ATTRIBUTION_PARAM = "in_app_message_attribution";
    public static final String MINUTES_SINCE_DISPLAYED_PARAM = "minutes_since_displayed";
    public static final String LIMIT_PARAM = "limit";
    public static final int DEFAULT_INDIRECT_NOTIFICATION_LIMIT = 10;
    public static final int DEFAULT_INDIRECT_ATTRIBUTION_WINDOW = 1440;
    /*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*//*</methods>*/
}
