package com.financus.finance.realestates;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RealEstateValidator {

    public static boolean isIdValid(int id){
        return id > 0 && id < 999;
    }


    public static boolean isCityValid(String city){
        Pattern patternCity = Pattern.compile("[A-ZŻŹĆĄŚĘŁÓŃ]{1}[a-zzżźćńółęąś]+");
        Matcher matcherCityFirst = patternCity.matcher(city);
        patternCity = Pattern.compile("[A-ZŻŹĆĄŚĘŁÓŃ]{1}[a-zzżźćńółęąś]+\\s[A-ZŻŹĆĄŚĘŁÓŃ]{1}[a-zzżźćńółęąś]+");
        Matcher matcherStreetSecond = patternCity.matcher(city);
        return matcherCityFirst.matches() || matcherStreetSecond.matches();
    }

    public static boolean isStreetValid(String street){
        boolean isStreetValid;
        Pattern patternStreet = Pattern.compile("[A-ZŻŹĆĄŚĘŁÓŃ]{1}[a-zzżźćńółęąś]+");
        Matcher matcherStreetFirst = patternStreet.matcher(street);
        patternStreet = Pattern.compile("[A-ZŻŹĆĄŚĘŁÓŃ]{1}[a-zzżźćńółęąś]+ [a-zzżźćńółęąśA-Z]+");
        Matcher matcherStreetSecond = patternStreet.matcher(street);
        patternStreet = Pattern.compile("[1-9]+ [a-zzżźćńółęąśA-ZŻŹĆĄŚĘŁÓŃ]+");
        Matcher matcherStreetSThird = patternStreet.matcher(street);
        patternStreet = Pattern.compile("[A-ZŻŹĆĄŚĘŁÓŃ]{1}[a-zzżźćńółęąś]+ [1-9]+ [a-zzżźćńółęąśA-ZŻŹĆĄŚĘŁÓŃ]+");
        Matcher matcherStreetFourth = patternStreet.matcher(street);
        isStreetValid = matcherStreetFirst.matches() || matcherStreetSecond.matches()
                || matcherStreetSThird.matches() || matcherStreetFourth.matches();
        return isStreetValid;
    }

    public static boolean isAreaValid(double area){
        return area > 0 && area < 9999;
    }

    public static boolean isFloorValid(int floor){
        return floor > 0 && floor < 100;
    }

    public static boolean isParkingValid(String ifParking){
        Pattern patternParking = Pattern.compile("[ynYN]");
        Matcher matcherParking = patternParking.matcher(ifParking);
        return matcherParking.matches();
    }

}
