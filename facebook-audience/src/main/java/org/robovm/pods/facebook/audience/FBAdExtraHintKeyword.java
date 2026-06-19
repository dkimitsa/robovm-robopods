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
package org.robovm.pods.facebook.audience;

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
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.dispatch.*;
import org.robovm.apple.coremedia.*;
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.storekit.*;
import org.robovm.apple.avfoundation.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @StronglyLinked/*</annotations>*/
@Marshaler(/*<name>*/FBAdExtraHintKeyword/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FBAdExtraHintKeyword/*</name>*/ 
    extends /*<extends>*/GlobalValueEnumeration<NSString>/*</extends>*/
    /*<implements>*//*</implements>*/ {

    static { Bro.bind(/*<name>*/FBAdExtraHintKeyword/*</name>*/.class); }

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static FBAdExtraHintKeyword toObject(Class<FBAdExtraHintKeyword> cls, long handle, long flags) {
            NSString o = (NSString) NSObject.Marshaler.toObject(NSString.class, handle, flags);
            if (o == null) {
                return null;
            }
            return FBAdExtraHintKeyword.valueOf(o);
        }
        @MarshalsPointer
        public static long toNative(FBAdExtraHintKeyword o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.value(), flags);
        }
    }
    public static class AsListMarshaler {
        @SuppressWarnings("unchecked")
        @MarshalsPointer
        public static List<FBAdExtraHintKeyword> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSString> o = (NSArray<NSString>) NSObject.Marshaler.toObject(NSArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<FBAdExtraHintKeyword> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(FBAdExtraHintKeyword.valueOf(o.get(i)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<FBAdExtraHintKeyword> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSString> array = new NSMutableArray<>();
            for (FBAdExtraHintKeyword o : l) {
                array.add(o.value());
            }
            return NSObject.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constants>*/
    public static final FBAdExtraHintKeyword Accessories = new FBAdExtraHintKeyword("Accessories");
    public static final FBAdExtraHintKeyword ArtHistory = new FBAdExtraHintKeyword("ArtHistory");
    public static final FBAdExtraHintKeyword Automotive = new FBAdExtraHintKeyword("Automotive");
    public static final FBAdExtraHintKeyword Beauty = new FBAdExtraHintKeyword("Beauty");
    public static final FBAdExtraHintKeyword Biology = new FBAdExtraHintKeyword("Biology");
    public static final FBAdExtraHintKeyword BoardGames = new FBAdExtraHintKeyword("BoardGames");
    public static final FBAdExtraHintKeyword BusinessSoftware = new FBAdExtraHintKeyword("BusinessSoftware");
    public static final FBAdExtraHintKeyword BuyingSellingHomes = new FBAdExtraHintKeyword("BuyingSellingHomes");
    public static final FBAdExtraHintKeyword Cats = new FBAdExtraHintKeyword("Cats");
    public static final FBAdExtraHintKeyword Celebrities = new FBAdExtraHintKeyword("Celebrities");
    public static final FBAdExtraHintKeyword Clothing = new FBAdExtraHintKeyword("Clothing");
    public static final FBAdExtraHintKeyword ComicBooks = new FBAdExtraHintKeyword("ComicBooks");
    public static final FBAdExtraHintKeyword DesktopVideo = new FBAdExtraHintKeyword("DesktopVideo");
    public static final FBAdExtraHintKeyword Dogs = new FBAdExtraHintKeyword("Dogs");
    public static final FBAdExtraHintKeyword Education = new FBAdExtraHintKeyword("Education");
    public static final FBAdExtraHintKeyword Email = new FBAdExtraHintKeyword("Email");
    public static final FBAdExtraHintKeyword Entertainment = new FBAdExtraHintKeyword("Entertainment");
    public static final FBAdExtraHintKeyword FamilyParenting = new FBAdExtraHintKeyword("FamilyParenting");
    public static final FBAdExtraHintKeyword Fashion = new FBAdExtraHintKeyword("Fashion");
    public static final FBAdExtraHintKeyword FineArt = new FBAdExtraHintKeyword("FineArt");
    public static final FBAdExtraHintKeyword FoodDrink = new FBAdExtraHintKeyword("FoodDrink");
    public static final FBAdExtraHintKeyword FrenchCuisine = new FBAdExtraHintKeyword("FrenchCuisine");
    public static final FBAdExtraHintKeyword Government = new FBAdExtraHintKeyword("Government");
    public static final FBAdExtraHintKeyword HealthFitness = new FBAdExtraHintKeyword("HealthFitness");
    public static final FBAdExtraHintKeyword Hobbies = new FBAdExtraHintKeyword("Hobbies");
    public static final FBAdExtraHintKeyword HomeGarden = new FBAdExtraHintKeyword("HomeGarden");
    public static final FBAdExtraHintKeyword Humor = new FBAdExtraHintKeyword("Humor");
    public static final FBAdExtraHintKeyword InternetTechnology = new FBAdExtraHintKeyword("InternetTechnology");
    public static final FBAdExtraHintKeyword LargeAnimals = new FBAdExtraHintKeyword("LargeAnimals");
    public static final FBAdExtraHintKeyword Law = new FBAdExtraHintKeyword("Law");
    public static final FBAdExtraHintKeyword LegalIssues = new FBAdExtraHintKeyword("LegalIssues");
    public static final FBAdExtraHintKeyword Literature = new FBAdExtraHintKeyword("Literature");
    public static final FBAdExtraHintKeyword Marketing = new FBAdExtraHintKeyword("Marketing");
    public static final FBAdExtraHintKeyword Movies = new FBAdExtraHintKeyword("Movies");
    public static final FBAdExtraHintKeyword Music = new FBAdExtraHintKeyword("Music");
    public static final FBAdExtraHintKeyword News = new FBAdExtraHintKeyword("News");
    public static final FBAdExtraHintKeyword PersonalFinance = new FBAdExtraHintKeyword("PersonalFinance");
    public static final FBAdExtraHintKeyword Pets = new FBAdExtraHintKeyword("Pets");
    public static final FBAdExtraHintKeyword Photography = new FBAdExtraHintKeyword("Photography");
    public static final FBAdExtraHintKeyword Politics = new FBAdExtraHintKeyword("Politics");
    public static final FBAdExtraHintKeyword RealEstate = new FBAdExtraHintKeyword("RealEstate");
    public static final FBAdExtraHintKeyword RoleplayingGames = new FBAdExtraHintKeyword("RoleplayingGames");
    public static final FBAdExtraHintKeyword Science = new FBAdExtraHintKeyword("Science");
    public static final FBAdExtraHintKeyword Shopping = new FBAdExtraHintKeyword("Shopping");
    public static final FBAdExtraHintKeyword Society = new FBAdExtraHintKeyword("Society");
    public static final FBAdExtraHintKeyword Sports = new FBAdExtraHintKeyword("Sports");
    public static final FBAdExtraHintKeyword Technology = new FBAdExtraHintKeyword("Technology");
    public static final FBAdExtraHintKeyword Television = new FBAdExtraHintKeyword("Television");
    public static final FBAdExtraHintKeyword Travel = new FBAdExtraHintKeyword("Travel");
    public static final FBAdExtraHintKeyword VideoComputerGames = new FBAdExtraHintKeyword("VideoComputerGames");
    /*</constants>*/
    
    private static /*<name>*/FBAdExtraHintKeyword/*</name>*/[] values = new /*<name>*/FBAdExtraHintKeyword/*</name>*/[] {/*<value_list>*/Accessories, ArtHistory, Automotive, Beauty, Biology, BoardGames, BusinessSoftware, BuyingSellingHomes, Cats, Celebrities, Clothing, ComicBooks, DesktopVideo, Dogs, Education, Email, Entertainment, FamilyParenting, Fashion, FineArt, FoodDrink, FrenchCuisine, Government, HealthFitness, Hobbies, HomeGarden, Humor, InternetTechnology, LargeAnimals, Law, LegalIssues, Literature, Marketing, Movies, Music, News, PersonalFinance, Pets, Photography, Politics, RealEstate, RoleplayingGames, Science, Shopping, Society, Sports, Technology, Television, Travel, VideoComputerGames/*</value_list>*/};
    
    /*<name>*/FBAdExtraHintKeyword/*</name>*/ (String getterName) {
        super(Values.class, getterName);
    }
    
    public static /*<name>*/FBAdExtraHintKeyword/*</name>*/ valueOf(/*<type>*/NSString/*</type>*/ value) {
        for (/*<name>*/FBAdExtraHintKeyword/*</name>*/ v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/FBAdExtraHintKeyword/*</name>*/.class.getName());
    }
    
    /*<methods>*//*</methods>*/
    
    /*<annotations>*/@Library(Library.INTERNAL) @StronglyLinked/*</annotations>*/
    public static class Values {
    	static { Bro.bind(Values.class); }

        /*<values>*/
        @GlobalValue(symbol="FBAdExtraHintKeywordAccessories", optional=true)
        public static native NSString Accessories();
        @GlobalValue(symbol="FBAdExtraHintKeywordArtHistory", optional=true)
        public static native NSString ArtHistory();
        @GlobalValue(symbol="FBAdExtraHintKeywordAutomotive", optional=true)
        public static native NSString Automotive();
        @GlobalValue(symbol="FBAdExtraHintKeywordBeauty", optional=true)
        public static native NSString Beauty();
        @GlobalValue(symbol="FBAdExtraHintKeywordBiology", optional=true)
        public static native NSString Biology();
        @GlobalValue(symbol="FBAdExtraHintKeywordBoardGames", optional=true)
        public static native NSString BoardGames();
        @GlobalValue(symbol="FBAdExtraHintKeywordBusinessSoftware", optional=true)
        public static native NSString BusinessSoftware();
        @GlobalValue(symbol="FBAdExtraHintKeywordBuyingSellingHomes", optional=true)
        public static native NSString BuyingSellingHomes();
        @GlobalValue(symbol="FBAdExtraHintKeywordCats", optional=true)
        public static native NSString Cats();
        @GlobalValue(symbol="FBAdExtraHintKeywordCelebrities", optional=true)
        public static native NSString Celebrities();
        @GlobalValue(symbol="FBAdExtraHintKeywordClothing", optional=true)
        public static native NSString Clothing();
        @GlobalValue(symbol="FBAdExtraHintKeywordComicBooks", optional=true)
        public static native NSString ComicBooks();
        @GlobalValue(symbol="FBAdExtraHintKeywordDesktopVideo", optional=true)
        public static native NSString DesktopVideo();
        @GlobalValue(symbol="FBAdExtraHintKeywordDogs", optional=true)
        public static native NSString Dogs();
        @GlobalValue(symbol="FBAdExtraHintKeywordEducation", optional=true)
        public static native NSString Education();
        @GlobalValue(symbol="FBAdExtraHintKeywordEmail", optional=true)
        public static native NSString Email();
        @GlobalValue(symbol="FBAdExtraHintKeywordEntertainment", optional=true)
        public static native NSString Entertainment();
        @GlobalValue(symbol="FBAdExtraHintKeywordFamilyParenting", optional=true)
        public static native NSString FamilyParenting();
        @GlobalValue(symbol="FBAdExtraHintKeywordFashion", optional=true)
        public static native NSString Fashion();
        @GlobalValue(symbol="FBAdExtraHintKeywordFineArt", optional=true)
        public static native NSString FineArt();
        @GlobalValue(symbol="FBAdExtraHintKeywordFoodDrink", optional=true)
        public static native NSString FoodDrink();
        @GlobalValue(symbol="FBAdExtraHintKeywordFrenchCuisine", optional=true)
        public static native NSString FrenchCuisine();
        @GlobalValue(symbol="FBAdExtraHintKeywordGovernment", optional=true)
        public static native NSString Government();
        @GlobalValue(symbol="FBAdExtraHintKeywordHealthFitness", optional=true)
        public static native NSString HealthFitness();
        @GlobalValue(symbol="FBAdExtraHintKeywordHobbies", optional=true)
        public static native NSString Hobbies();
        @GlobalValue(symbol="FBAdExtraHintKeywordHomeGarden", optional=true)
        public static native NSString HomeGarden();
        @GlobalValue(symbol="FBAdExtraHintKeywordHumor", optional=true)
        public static native NSString Humor();
        @GlobalValue(symbol="FBAdExtraHintKeywordInternetTechnology", optional=true)
        public static native NSString InternetTechnology();
        @GlobalValue(symbol="FBAdExtraHintKeywordLargeAnimals", optional=true)
        public static native NSString LargeAnimals();
        @GlobalValue(symbol="FBAdExtraHintKeywordLaw", optional=true)
        public static native NSString Law();
        @GlobalValue(symbol="FBAdExtraHintKeywordLegalIssues", optional=true)
        public static native NSString LegalIssues();
        @GlobalValue(symbol="FBAdExtraHintKeywordLiterature", optional=true)
        public static native NSString Literature();
        @GlobalValue(symbol="FBAdExtraHintKeywordMarketing", optional=true)
        public static native NSString Marketing();
        @GlobalValue(symbol="FBAdExtraHintKeywordMovies", optional=true)
        public static native NSString Movies();
        @GlobalValue(symbol="FBAdExtraHintKeywordMusic", optional=true)
        public static native NSString Music();
        @GlobalValue(symbol="FBAdExtraHintKeywordNews", optional=true)
        public static native NSString News();
        @GlobalValue(symbol="FBAdExtraHintKeywordPersonalFinance", optional=true)
        public static native NSString PersonalFinance();
        @GlobalValue(symbol="FBAdExtraHintKeywordPets", optional=true)
        public static native NSString Pets();
        @GlobalValue(symbol="FBAdExtraHintKeywordPhotography", optional=true)
        public static native NSString Photography();
        @GlobalValue(symbol="FBAdExtraHintKeywordPolitics", optional=true)
        public static native NSString Politics();
        @GlobalValue(symbol="FBAdExtraHintKeywordRealEstate", optional=true)
        public static native NSString RealEstate();
        @GlobalValue(symbol="FBAdExtraHintKeywordRoleplayingGames", optional=true)
        public static native NSString RoleplayingGames();
        @GlobalValue(symbol="FBAdExtraHintKeywordScience", optional=true)
        public static native NSString Science();
        @GlobalValue(symbol="FBAdExtraHintKeywordShopping", optional=true)
        public static native NSString Shopping();
        @GlobalValue(symbol="FBAdExtraHintKeywordSociety", optional=true)
        public static native NSString Society();
        @GlobalValue(symbol="FBAdExtraHintKeywordSports", optional=true)
        public static native NSString Sports();
        @GlobalValue(symbol="FBAdExtraHintKeywordTechnology", optional=true)
        public static native NSString Technology();
        @GlobalValue(symbol="FBAdExtraHintKeywordTelevision", optional=true)
        public static native NSString Television();
        @GlobalValue(symbol="FBAdExtraHintKeywordTravel", optional=true)
        public static native NSString Travel();
        @GlobalValue(symbol="FBAdExtraHintKeywordVideoComputerGames", optional=true)
        public static native NSString VideoComputerGames();
        /*</values>*/
    }
}
