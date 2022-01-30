package parcel;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ParcelLockerValidator {
    //sprawdzi czy id jest równe wartości od 0-200
    //nazwa zawiera min=2, max-10 znaków
    //address na format: "ulica,miasto,kod pocztowy", np. "Wiśniowa,Szczecin,70-000"
    //capacity: wartość od 0 do 100
    public static boolean validator(int id, String name, String address, int capacity){
        boolean isEverythingCorrect;
        boolean isIdCorrect;
        boolean isCapacityCorrect;
        boolean isNameCorrect;
        if (id >= 0 && id <= 200){
            isIdCorrect = true;
        } else {
            isIdCorrect = false;
        }

        if (name.length() >= 2 && name.length() <= 10){
            isNameCorrect = true;
        } else {
            isNameCorrect = false;
        }

        Pattern patternAddress = Pattern.compile("([a-zA-Z0-9]+),([a-zA-Z]+),([0-9]{2})-([0-9]{3})");
        Matcher matcherAddress = patternAddress.matcher(address);
        matcherAddress.matches();

        if (capacity >= 0 && capacity <= 100){
            isCapacityCorrect = true;
        } else {
            isCapacityCorrect = false;
        }

        if (isIdCorrect && isNameCorrect && matcherAddress.matches() && isCapacityCorrect){
            isEverythingCorrect = true;
        } else {
            isEverythingCorrect = false;
        } return isEverythingCorrect;
    }
}
