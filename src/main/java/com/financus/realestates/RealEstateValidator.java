//package com.financus.realestates;
//
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
//public class RealEstateValidator {
//
//    public static boolean validator(int id, String name, String address, int capacity){
//        boolean isEverythingCorrect;
//        boolean isIdCorrect;
//        boolean isCapacityCorrect;
//        boolean isNameCorrect;
//        if (id >= 0 && id <= 200){
//            isIdCorrect = true;
//        } else {
//            isIdCorrect = false;
//        }
//
//        if (name.length() >= 2 && name.length() <= 10){
//            isNameCorrect = true;
//        } else {
//            isNameCorrect = false;
//        }
//
//        Pattern patternAddress = Pattern.compile("([a-zA-Z0-9]+),([a-zA-Z]+),([0-9]{2})-([0-9]{3})");
//        Matcher matcherAddress = patternAddress.matcher(address);
//        matcherAddress.matches();
//
//        if (capacity >= 0 && capacity <= 100){
//            isCapacityCorrect = true;
//        } else {
//            isCapacityCorrect = false;
//        }
//
//        if (isIdCorrect && isNameCorrect && matcherAddress.matches() && isCapacityCorrect){
//            isEverythingCorrect = true;
//        } else {
//            isEverythingCorrect = false;
//        } return isEverythingCorrect;
//    }
//}
