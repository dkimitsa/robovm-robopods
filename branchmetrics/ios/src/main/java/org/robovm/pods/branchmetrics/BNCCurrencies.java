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
package org.robovm.pods.branchmetrics;

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
import org.robovm.apple.corespotlight.*;
import org.robovm.apple.uniformtypeid.*;
import org.robovm.apple.linkpresentation.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.storekit.*;
import org.robovm.apple.intents.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL)/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/BNCCurrencies/*</name>*/ 
    extends /*<extends>*/CocoaUtility/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/static { Bro.bind(BNCCurrencies.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @GlobalValue(symbol="BNCCurrencyAED", optional=true)
    public static native String AED();
    @GlobalValue(symbol="BNCCurrencyAFN", optional=true)
    public static native String AFN();
    @GlobalValue(symbol="BNCCurrencyALL", optional=true)
    public static native String ALL();
    @GlobalValue(symbol="BNCCurrencyAMD", optional=true)
    public static native String AMD();
    @GlobalValue(symbol="BNCCurrencyANG", optional=true)
    public static native String ANG();
    @GlobalValue(symbol="BNCCurrencyAOA", optional=true)
    public static native String AOA();
    @GlobalValue(symbol="BNCCurrencyARS", optional=true)
    public static native String ARS();
    @GlobalValue(symbol="BNCCurrencyAUD", optional=true)
    public static native String AUD();
    @GlobalValue(symbol="BNCCurrencyAWG", optional=true)
    public static native String AWG();
    @GlobalValue(symbol="BNCCurrencyAZN", optional=true)
    public static native String AZN();
    @GlobalValue(symbol="BNCCurrencyBAM", optional=true)
    public static native String BAM();
    @GlobalValue(symbol="BNCCurrencyBBD", optional=true)
    public static native String BBD();
    @GlobalValue(symbol="BNCCurrencyBDT", optional=true)
    public static native String BDT();
    @GlobalValue(symbol="BNCCurrencyBGN", optional=true)
    public static native String BGN();
    @GlobalValue(symbol="BNCCurrencyBHD", optional=true)
    public static native String BHD();
    @GlobalValue(symbol="BNCCurrencyBIF", optional=true)
    public static native String BIF();
    @GlobalValue(symbol="BNCCurrencyBMD", optional=true)
    public static native String BMD();
    @GlobalValue(symbol="BNCCurrencyBND", optional=true)
    public static native String BND();
    @GlobalValue(symbol="BNCCurrencyBOB", optional=true)
    public static native String BOB();
    @GlobalValue(symbol="BNCCurrencyBOV", optional=true)
    public static native String BOV();
    @GlobalValue(symbol="BNCCurrencyBRL", optional=true)
    public static native String BRL();
    @GlobalValue(symbol="BNCCurrencyBSD", optional=true)
    public static native String BSD();
    @GlobalValue(symbol="BNCCurrencyBTN", optional=true)
    public static native String BTN();
    @GlobalValue(symbol="BNCCurrencyBWP", optional=true)
    public static native String BWP();
    @GlobalValue(symbol="BNCCurrencyBYN", optional=true)
    public static native String BYN();
    @GlobalValue(symbol="BNCCurrencyBYR", optional=true)
    public static native String BYR();
    @GlobalValue(symbol="BNCCurrencyBZD", optional=true)
    public static native String BZD();
    @GlobalValue(symbol="BNCCurrencyCAD", optional=true)
    public static native String CAD();
    @GlobalValue(symbol="BNCCurrencyCDF", optional=true)
    public static native String CDF();
    @GlobalValue(symbol="BNCCurrencyCHE", optional=true)
    public static native String CHE();
    @GlobalValue(symbol="BNCCurrencyCHF", optional=true)
    public static native String CHF();
    @GlobalValue(symbol="BNCCurrencyCHW", optional=true)
    public static native String CHW();
    @GlobalValue(symbol="BNCCurrencyCLF", optional=true)
    public static native String CLF();
    @GlobalValue(symbol="BNCCurrencyCLP", optional=true)
    public static native String CLP();
    @GlobalValue(symbol="BNCCurrencyCNY", optional=true)
    public static native String CNY();
    @GlobalValue(symbol="BNCCurrencyCOP", optional=true)
    public static native String COP();
    @GlobalValue(symbol="BNCCurrencyCOU", optional=true)
    public static native String COU();
    @GlobalValue(symbol="BNCCurrencyCRC", optional=true)
    public static native String CRC();
    @GlobalValue(symbol="BNCCurrencyCUC", optional=true)
    public static native String CUC();
    @GlobalValue(symbol="BNCCurrencyCUP", optional=true)
    public static native String CUP();
    @GlobalValue(symbol="BNCCurrencyCVE", optional=true)
    public static native String CVE();
    @GlobalValue(symbol="BNCCurrencyCZK", optional=true)
    public static native String CZK();
    @GlobalValue(symbol="BNCCurrencyDJF", optional=true)
    public static native String DJF();
    @GlobalValue(symbol="BNCCurrencyDKK", optional=true)
    public static native String DKK();
    @GlobalValue(symbol="BNCCurrencyDOP", optional=true)
    public static native String DOP();
    @GlobalValue(symbol="BNCCurrencyDZD", optional=true)
    public static native String DZD();
    @GlobalValue(symbol="BNCCurrencyEGP", optional=true)
    public static native String EGP();
    @GlobalValue(symbol="BNCCurrencyERN", optional=true)
    public static native String ERN();
    @GlobalValue(symbol="BNCCurrencyETB", optional=true)
    public static native String ETB();
    @GlobalValue(symbol="BNCCurrencyEUR", optional=true)
    public static native String EUR();
    @GlobalValue(symbol="BNCCurrencyFJD", optional=true)
    public static native String FJD();
    @GlobalValue(symbol="BNCCurrencyFKP", optional=true)
    public static native String FKP();
    @GlobalValue(symbol="BNCCurrencyGBP", optional=true)
    public static native String GBP();
    @GlobalValue(symbol="BNCCurrencyGEL", optional=true)
    public static native String GEL();
    @GlobalValue(symbol="BNCCurrencyGHS", optional=true)
    public static native String GHS();
    @GlobalValue(symbol="BNCCurrencyGIP", optional=true)
    public static native String GIP();
    @GlobalValue(symbol="BNCCurrencyGMD", optional=true)
    public static native String GMD();
    @GlobalValue(symbol="BNCCurrencyGNF", optional=true)
    public static native String GNF();
    @GlobalValue(symbol="BNCCurrencyGTQ", optional=true)
    public static native String GTQ();
    @GlobalValue(symbol="BNCCurrencyGYD", optional=true)
    public static native String GYD();
    @GlobalValue(symbol="BNCCurrencyHKD", optional=true)
    public static native String HKD();
    @GlobalValue(symbol="BNCCurrencyHNL", optional=true)
    public static native String HNL();
    @GlobalValue(symbol="BNCCurrencyHRK", optional=true)
    public static native String HRK();
    @GlobalValue(symbol="BNCCurrencyHTG", optional=true)
    public static native String HTG();
    @GlobalValue(symbol="BNCCurrencyHUF", optional=true)
    public static native String HUF();
    @GlobalValue(symbol="BNCCurrencyIDR", optional=true)
    public static native String IDR();
    @GlobalValue(symbol="BNCCurrencyILS", optional=true)
    public static native String ILS();
    @GlobalValue(symbol="BNCCurrencyINR", optional=true)
    public static native String INR();
    @GlobalValue(symbol="BNCCurrencyIQD", optional=true)
    public static native String IQD();
    @GlobalValue(symbol="BNCCurrencyIRR", optional=true)
    public static native String IRR();
    @GlobalValue(symbol="BNCCurrencyISK", optional=true)
    public static native String ISK();
    @GlobalValue(symbol="BNCCurrencyJMD", optional=true)
    public static native String JMD();
    @GlobalValue(symbol="BNCCurrencyJOD", optional=true)
    public static native String JOD();
    @GlobalValue(symbol="BNCCurrencyJPY", optional=true)
    public static native String JPY();
    @GlobalValue(symbol="BNCCurrencyKES", optional=true)
    public static native String KES();
    @GlobalValue(symbol="BNCCurrencyKGS", optional=true)
    public static native String KGS();
    @GlobalValue(symbol="BNCCurrencyKHR", optional=true)
    public static native String KHR();
    @GlobalValue(symbol="BNCCurrencyKMF", optional=true)
    public static native String KMF();
    @GlobalValue(symbol="BNCCurrencyKPW", optional=true)
    public static native String KPW();
    @GlobalValue(symbol="BNCCurrencyKRW", optional=true)
    public static native String KRW();
    @GlobalValue(symbol="BNCCurrencyKWD", optional=true)
    public static native String KWD();
    @GlobalValue(symbol="BNCCurrencyKYD", optional=true)
    public static native String KYD();
    @GlobalValue(symbol="BNCCurrencyKZT", optional=true)
    public static native String KZT();
    @GlobalValue(symbol="BNCCurrencyLAK", optional=true)
    public static native String LAK();
    @GlobalValue(symbol="BNCCurrencyLBP", optional=true)
    public static native String LBP();
    @GlobalValue(symbol="BNCCurrencyLKR", optional=true)
    public static native String LKR();
    @GlobalValue(symbol="BNCCurrencyLRD", optional=true)
    public static native String LRD();
    @GlobalValue(symbol="BNCCurrencyLSL", optional=true)
    public static native String LSL();
    @GlobalValue(symbol="BNCCurrencyLYD", optional=true)
    public static native String LYD();
    @GlobalValue(symbol="BNCCurrencyMAD", optional=true)
    public static native String MAD();
    @GlobalValue(symbol="BNCCurrencyMDL", optional=true)
    public static native String MDL();
    @GlobalValue(symbol="BNCCurrencyMGA", optional=true)
    public static native String MGA();
    @GlobalValue(symbol="BNCCurrencyMKD", optional=true)
    public static native String MKD();
    @GlobalValue(symbol="BNCCurrencyMMK", optional=true)
    public static native String MMK();
    @GlobalValue(symbol="BNCCurrencyMNT", optional=true)
    public static native String MNT();
    @GlobalValue(symbol="BNCCurrencyMOP", optional=true)
    public static native String MOP();
    @GlobalValue(symbol="BNCCurrencyMRO", optional=true)
    public static native String MRO();
    @GlobalValue(symbol="BNCCurrencyMUR", optional=true)
    public static native String MUR();
    @GlobalValue(symbol="BNCCurrencyMVR", optional=true)
    public static native String MVR();
    @GlobalValue(symbol="BNCCurrencyMWK", optional=true)
    public static native String MWK();
    @GlobalValue(symbol="BNCCurrencyMXN", optional=true)
    public static native String MXN();
    @GlobalValue(symbol="BNCCurrencyMXV", optional=true)
    public static native String MXV();
    @GlobalValue(symbol="BNCCurrencyMYR", optional=true)
    public static native String MYR();
    @GlobalValue(symbol="BNCCurrencyMZN", optional=true)
    public static native String MZN();
    @GlobalValue(symbol="BNCCurrencyNAD", optional=true)
    public static native String NAD();
    @GlobalValue(symbol="BNCCurrencyNGN", optional=true)
    public static native String NGN();
    @GlobalValue(symbol="BNCCurrencyNIO", optional=true)
    public static native String NIO();
    @GlobalValue(symbol="BNCCurrencyNOK", optional=true)
    public static native String NOK();
    @GlobalValue(symbol="BNCCurrencyNPR", optional=true)
    public static native String NPR();
    @GlobalValue(symbol="BNCCurrencyNZD", optional=true)
    public static native String NZD();
    @GlobalValue(symbol="BNCCurrencyOMR", optional=true)
    public static native String OMR();
    @GlobalValue(symbol="BNCCurrencyPAB", optional=true)
    public static native String PAB();
    @GlobalValue(symbol="BNCCurrencyPEN", optional=true)
    public static native String PEN();
    @GlobalValue(symbol="BNCCurrencyPGK", optional=true)
    public static native String PGK();
    @GlobalValue(symbol="BNCCurrencyPHP", optional=true)
    public static native String PHP();
    @GlobalValue(symbol="BNCCurrencyPKR", optional=true)
    public static native String PKR();
    @GlobalValue(symbol="BNCCurrencyPLN", optional=true)
    public static native String PLN();
    @GlobalValue(symbol="BNCCurrencyPYG", optional=true)
    public static native String PYG();
    @GlobalValue(symbol="BNCCurrencyQAR", optional=true)
    public static native String QAR();
    @GlobalValue(symbol="BNCCurrencyRON", optional=true)
    public static native String RON();
    @GlobalValue(symbol="BNCCurrencyRSD", optional=true)
    public static native String RSD();
    @GlobalValue(symbol="BNCCurrencyRUB", optional=true)
    public static native String RUB();
    @GlobalValue(symbol="BNCCurrencyRWF", optional=true)
    public static native String RWF();
    @GlobalValue(symbol="BNCCurrencySAR", optional=true)
    public static native String SAR();
    @GlobalValue(symbol="BNCCurrencySBD", optional=true)
    public static native String SBD();
    @GlobalValue(symbol="BNCCurrencySCR", optional=true)
    public static native String SCR();
    @GlobalValue(symbol="BNCCurrencySDG", optional=true)
    public static native String SDG();
    @GlobalValue(symbol="BNCCurrencySEK", optional=true)
    public static native String SEK();
    @GlobalValue(symbol="BNCCurrencySGD", optional=true)
    public static native String SGD();
    @GlobalValue(symbol="BNCCurrencySHP", optional=true)
    public static native String SHP();
    @GlobalValue(symbol="BNCCurrencySLL", optional=true)
    public static native String SLL();
    @GlobalValue(symbol="BNCCurrencySOS", optional=true)
    public static native String SOS();
    @GlobalValue(symbol="BNCCurrencySRD", optional=true)
    public static native String SRD();
    @GlobalValue(symbol="BNCCurrencySSP", optional=true)
    public static native String SSP();
    @GlobalValue(symbol="BNCCurrencySTD", optional=true)
    public static native String STD();
    @GlobalValue(symbol="BNCCurrencySYP", optional=true)
    public static native String SYP();
    @GlobalValue(symbol="BNCCurrencySZL", optional=true)
    public static native String SZL();
    @GlobalValue(symbol="BNCCurrencyTHB", optional=true)
    public static native String THB();
    @GlobalValue(symbol="BNCCurrencyTJS", optional=true)
    public static native String TJS();
    @GlobalValue(symbol="BNCCurrencyTMT", optional=true)
    public static native String TMT();
    @GlobalValue(symbol="BNCCurrencyTND", optional=true)
    public static native String TND();
    @GlobalValue(symbol="BNCCurrencyTOP", optional=true)
    public static native String TOP();
    @GlobalValue(symbol="BNCCurrencyTRY", optional=true)
    public static native String TRY();
    @GlobalValue(symbol="BNCCurrencyTTD", optional=true)
    public static native String TTD();
    @GlobalValue(symbol="BNCCurrencyTWD", optional=true)
    public static native String TWD();
    @GlobalValue(symbol="BNCCurrencyTZS", optional=true)
    public static native String TZS();
    @GlobalValue(symbol="BNCCurrencyUAH", optional=true)
    public static native String UAH();
    @GlobalValue(symbol="BNCCurrencyUGX", optional=true)
    public static native String UGX();
    @GlobalValue(symbol="BNCCurrencyUSD", optional=true)
    public static native String USD();
    @GlobalValue(symbol="BNCCurrencyUSN", optional=true)
    public static native String USN();
    @GlobalValue(symbol="BNCCurrencyUYI", optional=true)
    public static native String UYI();
    @GlobalValue(symbol="BNCCurrencyUYU", optional=true)
    public static native String UYU();
    @GlobalValue(symbol="BNCCurrencyUZS", optional=true)
    public static native String UZS();
    @GlobalValue(symbol="BNCCurrencyVEF", optional=true)
    public static native String VEF();
    @GlobalValue(symbol="BNCCurrencyVND", optional=true)
    public static native String VND();
    @GlobalValue(symbol="BNCCurrencyVUV", optional=true)
    public static native String VUV();
    @GlobalValue(symbol="BNCCurrencyWST", optional=true)
    public static native String WST();
    @GlobalValue(symbol="BNCCurrencyXAF", optional=true)
    public static native String XAF();
    @GlobalValue(symbol="BNCCurrencyXAG", optional=true)
    public static native String XAG();
    @GlobalValue(symbol="BNCCurrencyXAU", optional=true)
    public static native String XAU();
    @GlobalValue(symbol="BNCCurrencyXBA", optional=true)
    public static native String XBA();
    @GlobalValue(symbol="BNCCurrencyXBB", optional=true)
    public static native String XBB();
    @GlobalValue(symbol="BNCCurrencyXBC", optional=true)
    public static native String XBC();
    @GlobalValue(symbol="BNCCurrencyXBD", optional=true)
    public static native String XBD();
    @GlobalValue(symbol="BNCCurrencyXCD", optional=true)
    public static native String XCD();
    @GlobalValue(symbol="BNCCurrencyXDR", optional=true)
    public static native String XDR();
    @GlobalValue(symbol="BNCCurrencyXFU", optional=true)
    public static native String XFU();
    @GlobalValue(symbol="BNCCurrencyXOF", optional=true)
    public static native String XOF();
    @GlobalValue(symbol="BNCCurrencyXPD", optional=true)
    public static native String XPD();
    @GlobalValue(symbol="BNCCurrencyXPF", optional=true)
    public static native String XPF();
    @GlobalValue(symbol="BNCCurrencyXPT", optional=true)
    public static native String XPT();
    @GlobalValue(symbol="BNCCurrencyXSU", optional=true)
    public static native String XSU();
    @GlobalValue(symbol="BNCCurrencyXTS", optional=true)
    public static native String XTS();
    @GlobalValue(symbol="BNCCurrencyXUA", optional=true)
    public static native String XUA();
    @GlobalValue(symbol="BNCCurrencyXXX", optional=true)
    public static native String XXX();
    @GlobalValue(symbol="BNCCurrencyYER", optional=true)
    public static native String YER();
    @GlobalValue(symbol="BNCCurrencyZAR", optional=true)
    public static native String ZAR();
    @GlobalValue(symbol="BNCCurrencyZMW", optional=true)
    public static native String ZMW();
    /*</methods>*/
}
