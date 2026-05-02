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
package org.robovm.pods.appsflyer;

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
import org.robovm.apple.uikit.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AppsFlyerConsts/*</name>*/ 
    extends /*<extends>*/CocoaUtility/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*/
    public static final String ADRWrapperTypeGeneric = "adrevenue_sdk";
    public static class EventParams {
        public static final String Content = "af_content";
        public static final String AchievementId = "af_achievement_id";
        public static final String Level = "af_level";
        public static final String Score = "af_score";
        public static final String Success = "af_success";
        public static final String Price = "af_price";
        public static final String ContentType = "af_content_type";
        public static final String ContentId = "af_content_id";
        public static final String ContentList = "af_content_list";
        public static final String Currency = "af_currency";
        public static final String Quantity = "af_quantity";
        public static final String RegistrationMethod = "af_registration_method";
        public static final String PaymentInfoAvailable = "af_payment_info_available";
        public static final String MaxRatingValue = "af_max_rating_value";
        public static final String RatingValue = "af_rating_value";
        public static final String SearchString = "af_search_string";
        public static final String DateA = "af_date_a";
        public static final String DateB = "af_date_b";
        public static final String DestinationA = "af_destination_a";
        public static final String DestinationB = "af_destination_b";
        public static final String Description = "af_description";
        public static final String Class = "af_class";
        public static final String EventStart = "af_event_start";
        public static final String EventEnd = "af_event_end";
        public static final String Lat = "af_lat";
        public static final String Long = "af_long";
        public static final String CustomerUserId = "af_customer_user_id";
        public static final String Validated = "af_validated";
        public static final String Revenue = "af_revenue";
        public static final String ReceiptId = "af_receipt_id";
        public static final String TutorialId = "af_tutorial_id";
        public static final String VirtualCurrencyName = "af_virtual_currency_name";
        public static final String DeepLink = "af_deep_link";
        public static final String OldVersion = "af_old_version";
        public static final String NewVersion = "af_new_version";
        public static final String ReviewText = "af_review_text";
        public static final String CouponCode = "af_coupon_code";
        public static final String OrderId = "af_order_id";
        public static final String Param1 = "af_param_1";
        public static final String Param2 = "af_param_2";
        public static final String Param3 = "af_param_3";
        public static final String Param4 = "af_param_4";
        public static final String Param5 = "af_param_5";
        public static final String Param6 = "af_param_6";
        public static final String Param7 = "af_param_7";
        public static final String Param8 = "af_param_8";
        public static final String Param9 = "af_param_9";
        public static final String Param10 = "af_param_10";
        public static final String Touch = "af_touch_obj";
        public static final String NetworkToken = "net_token";
        public static final String DepartingDepartureDate = "af_departing_departure_date";
        public static final String ReturningDepartureDate = "af_returning_departure_date";
        public static final String DestinationList = "af_destination_list";
        public static final String City = "af_city";
        public static final String Region = "af_region";
        public static final String Country = "af_country";
        public static final String DepartingArrivalDate = "af_departing_arrival_date";
        public static final String ReturningArrivalDate = "af_returning_arrival_date";
        public static final String SuggestedDestinations = "af_suggested_destinations";
        public static final String TravelStart = "af_travel_start";
        public static final String TravelEnd = "af_travel_end";
        public static final String NumAdults = "af_num_adults";
        public static final String NumChildren = "af_num_children";
        public static final String NumInfants = "af_num_infants";
        public static final String SuggestedHotels = "af_suggested_hotels";
        public static final String UserScore = "af_user_score";
        public static final String HotelScore = "af_hotel_score";
        public static final String PurchaseCurrency = "af_purchase_currency";
        public static final String PreferredStarRatings = "af_preferred_star_ratings";
        public static final String PreferredPriceRange = "af_preferred_price_range";
        public static final String PreferredNeighborhoods = "af_preferred_neighborhoods";
        public static final String PreferredNumStops = "af_preferred_num_stops";
    }

    public static class Events {
        public static final String LevelAchieved = "af_level_achieved";
        public static final String AddPaymentInfo = "af_add_payment_info";
        public static final String AddToCart = "af_add_to_cart";
        public static final String AddToWishlist = "af_add_to_wishlist";
        public static final String CompleteRegistration = "af_complete_registration";
        public static final String Tutorial_completion = "af_tutorial_completion";
        public static final String InitiatedCheckout = "af_initiated_checkout";
        public static final String Purchase = "af_purchase";
        public static final String Rate = "af_rate";
        public static final String Search = "af_search";
        public static final String SpentCredits = "af_spent_credits";
        public static final String AchievementUnlocked = "af_achievement_unlocked";
        public static final String ContentView = "af_content_view";
        public static final String ListView = "af_list_view";
        public static final String TravelBooking = "af_travel_booking";
        public static final String Share = "af_share";
        public static final String Invite = "af_invite";
        public static final String Login = "af_login";
        public static final String ReEngage = "af_re_engage";
        public static final String Update = "af_update";
        public static final String OpenedFromPushNotification = "af_opened_from_push_notification";
        public static final String Location = "af_location_coordinates";
        public static final String CustomerSegment = "af_customer_segment";
        public static final String Subscribe = "af_subscribe";
        public static final String StartTrial = "af_start_trial";
        public static final String AdClick = "af_ad_click";
        public static final String AdView = "af_ad_view";
        public static final String ProjectedParamRevenue = "af_projected_revenue";
    }

    public static class Revenue {
        public static final String MonetizationNetwork = "monetization_network";
        public static final String MediationNetwork = "mediation_network";
        public static final String EventRevenue = "event_revenue";
        public static final String EventRevenueCurrency = "event_revenue_currency";
        public static final String CustomParameters = "custom_parameters";
        public static final String Country = "country";
        public static final String AdUnit = "ad_unit";
        public static final String AdType = "ad_type";
        public static final String Placement = "placement";
    }
    /*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*//*</methods>*/
}
