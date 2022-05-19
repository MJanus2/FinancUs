package com.financus.finance.realestates;

public class PersonValidator {

    public static boolean isIdValid(int id){
        return id > 0 && id < 100;
    }

    public static boolean isMonthlySalaryAndLivingCostsValid(int montlySalary, int livingCosts){
        return montlySalary > 1000 && montlySalary < 100000
                && livingCosts > 100 && livingCosts < 10000;
    }
}
