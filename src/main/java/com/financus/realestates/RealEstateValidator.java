package com.financus.realestates;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RealEstateValidator {

    public static boolean isIdValid(int id){
        return id > 0 && id < 999;
    }


    public static boolean isCityValid(String city){
        Pattern patternCity = Pattern.compile("[A-Z]{1}[a-z]");
        Matcher matcherCity = patternCity.matcher(city);
        return matcherCity.matches();
    }

    public static boolean isStreetValid(String street){
        boolean isStreetValid;
        Pattern patternStreet = Pattern.compile("[A-Z]{1}[a-z]+");
        Matcher matcherStreetFirst = patternStreet.matcher(street);
        patternStreet = Pattern.compile("[A-Z]{1}[a-z]+ [a-zA-Z]+");
        Matcher matcherStreetSecond = patternStreet.matcher(street);
        patternStreet = Pattern.compile("[1-9]+ [a-zA-Z]+");
        Matcher matcherStreetSThird = patternStreet.matcher(street);
        patternStreet = Pattern.compile("[A-Z]{1}[a-z]+ [1-9]+ [a-zA-Z]+");
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
